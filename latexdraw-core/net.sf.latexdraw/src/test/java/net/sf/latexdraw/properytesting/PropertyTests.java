package net.sf.latexdraw.properytesting;

import net.sf.latexdraw.models.MathUtils;
import net.sf.latexdraw.models.impl.LShapeFactory;
import net.sf.latexdraw.models.interfaces.shape.ICircle;
import net.sf.latexdraw.models.interfaces.shape.IShapeFactory;
import net.sf.latexdraw.models.interfaces.shape.Position;
import org.junit.Test;

import java.awt.*;

import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.doubles;

public class PropertyTests {

	private final double DEFAULT_MAX_DOUBLE_DIFFERANCE = 0.000001d;
	private final double SMALLEST_POSITIVE_NONZERO_DOUBLE = 0.00001d;
	private final double LARGEST_NONMAX_DOUBLE = 1000000000;

	@Test
	public void latexDrawParseDoubleWorksLikeJavaParseDouble() {
		MathUtils mathUtils = MathUtils.INST;
		qt().forAll(doubles().any()).check((i) -> mathUtils.parserDouble("" + i + "").get() == Double.parseDouble("" + i + ""));
	}

	@Test
	public void circleCenterIsActualCenter() {
		IShapeFactory factory = new LShapeFactory();
		System.out.println();
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE)).check(
				(x, y, w) ->
						doubleEquals(factory.createCircle(factory.createPoint(x, y), w).getCenter().getX(), x + w / 2d) &&
								doubleEquals(factory.createCircle(factory.createPoint(x, y), w).getCenter().getY(), y - w / 2d)
		);
	}

	@Test
	public void circleRadiusIsSameAsSetRadius() {
		IShapeFactory factory = new LShapeFactory();
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE)).check(
				(x, y, w) ->
						doubleEquals(factory.createCircle(factory.createPoint(x, y), w).getRadius(), w / 2d)
		);
	}

	@Test
	public void mirroredCircleHasPointsAtMirroredPositions() {
		IShapeFactory factory = new LShapeFactory();
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE)).check(
				(x, y, w) ->
						mirroredCircleHasMirroredPoints(factory.createCircle(factory.createPoint(x, y), w))
		);
	}

	private boolean mirroredCircleHasMirroredPoints(ICircle circle) {
		ICircle clone = (ICircle) circle.duplicate();
		clone.mirrorHorizontal(0);
		boolean mirroredPoints = doubleEquals(circle.getTopLeftPoint().getX(), -1 * clone.getTopRightPoint().getX());
		mirroredPoints &= doubleEquals(circle.getTopLeftPoint().getY(), clone.getTopRightPoint().getY());
		mirroredPoints &= doubleEquals(circle.getTopRightPoint().getX(), -1 * clone.getTopLeftPoint().getX());
		mirroredPoints &= doubleEquals(circle.getTopRightPoint().getY(), clone.getTopLeftPoint().getY());
		mirroredPoints &= doubleEquals(circle.getBottomLeftPoint().getX(), -1 * clone.getBottomRightPoint().getX());
		mirroredPoints &= doubleEquals(circle.getBottomLeftPoint().getY(), clone.getBottomRightPoint().getY());
		mirroredPoints &= doubleEquals(circle.getBottomRightPoint().getX(), -1 * clone.getBottomLeftPoint().getX());
		mirroredPoints &= doubleEquals(circle.getBottomRightPoint().getY(), clone.getBottomLeftPoint().getY());
		return mirroredPoints;
	}

	@Test
	public void mirrorofMirrorOfCircleIsSame() {
		IShapeFactory factory = new LShapeFactory();
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE)).check(
				(x, y, w) ->
						mirrorCircleTwiceIsSame(factory.createCircle(factory.createPoint(x, y), w))
		);
	}

	private boolean mirrorCircleTwiceIsSame(ICircle circle) {
		ICircle clone = (ICircle) circle.duplicate();
		clone.mirrorHorizontal(0);
		boolean sameAfterMirrorOnce = circleEquals(circle, clone);
		clone.mirrorHorizontal(0);
		boolean sameAfterMirrorTwice = circleEquals(circle, clone);
		return !sameAfterMirrorOnce && sameAfterMirrorTwice;
	}

	@Test
	public void rotatedAndReverseRotatedCircleIsSame() {
		IShapeFactory factory = new LShapeFactory();
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(Double.MIN_VALUE, Double.MAX_VALUE)).check(
				(x, y, w, a) ->
						rotatedAndReverseRotatedCircleIsSame(factory.createCircle(factory.createPoint(x, y), w), a)
		);
	}

	private boolean rotatedAndReverseRotatedCircleIsSame(ICircle circle, double angle) {
		ICircle clone = (ICircle) circle.duplicate();
		IShapeFactory factory = new LShapeFactory();
		clone.rotate(factory.createPoint(0, 0), angle);
		clone.rotate(factory.createPoint(0, 0), -angle);
		return circleEquals(circle, clone);
	}

	@Test
	public void circleRotatedTwoTimesOneEightyIsSame() {
		IShapeFactory factory = new LShapeFactory();
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE)).check(
				(x, y, w) ->
						rotateTwoTimesOneEightyCircleIsSame(factory.createCircle(factory.createPoint(x, y), w))
		);
	}

	private boolean rotateTwoTimesOneEightyCircleIsSame(ICircle circle) {
		ICircle clone = (ICircle) circle.duplicate();
		IShapeFactory factory = new LShapeFactory();
		clone.rotate(factory.createPoint(0, 0), Math.PI);
		clone.rotate(factory.createPoint(0, 0), Math.PI);
		return circleEquals(circle, clone);
	}

	@Test
	public void scaleAndRescaleResultsInOriginalShape() {
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE)).check(
				(x, y, w) ->
						scaleAndRescaleIsSame(x, y, w)
		);
	}

	private boolean scaleAndRescaleIsSame(double x, double y, double w) {
		IShapeFactory factory = new LShapeFactory();
		x *= 2;
		y *= 2;
		w *= 2;
		ICircle circle = factory.createCircle(factory.createPoint(x, y), w);
		ICircle clone = (ICircle) circle.duplicate();
		clone.scaleWithRatio(clone.getWidth(), clone.getHeight(), Position.NORTH, new Rectangle.Double(0, 0, clone.getWidth() / 2, clone.getHeight() / 2));
		clone.scaleWithRatio(clone.getWidth(), clone.getHeight(), Position.NORTH, new Rectangle.Double(0, 0, clone.getWidth() * 2, clone.getHeight() * 2));
		return doubleEquals(circle.getRadius(), clone.getRadius());
	}

	private boolean doubleEquals(double d1, double d2) {
		return doubleEquals(d1, d2, DEFAULT_MAX_DOUBLE_DIFFERANCE);
	}

	private boolean doubleEquals(double d1, double d2, double maxDifferance) {
		return Math.abs(d1 - d2) < maxDifferance;
	}

	private boolean circleEquals(ICircle circle1, ICircle circle2) {
		boolean same = true;
		same &= circle1.getPosition().equals(circle2.getPosition(), DEFAULT_MAX_DOUBLE_DIFFERANCE);
		same &= circle1.getCenter().equals(circle2.getCenter(), DEFAULT_MAX_DOUBLE_DIFFERANCE);
		same &= doubleEquals(circle1.getRadius(), circle2.getRadius());
		if (circle1.getPoints() == null || circle2.getPoints() == null || circle1.getPoints().size() != circle2.getPoints().size()) {
			return false;
		}
		for (int i = 0; i < circle1.getPoints().size(); i++) {
			same &= circle1.getPoints().get(i).equals(circle2.getPoints().get(i), DEFAULT_MAX_DOUBLE_DIFFERANCE);
		}
		return same;
	}

}