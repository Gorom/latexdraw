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
	public void mirrorCircleHorizontallyAroundCenter() {
		IShapeFactory factory = new LShapeFactory();
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE)).check(
				(x, y, w) ->
						doubleEquals(
								factory.createCircle(factory.createPoint(x, y), w).getTopLeftPoint().getX(),
								-1 * mirrorCircleAroundOrigin(factory.createCircle(factory.createPoint(x, y), w)).getTopRightPoint().getX()
						) &&
								doubleEquals(
										factory.createCircle(factory.createPoint(x, y), w).getTopRightPoint().getX(),
										-1 * mirrorCircleAroundOrigin(factory.createCircle(factory.createPoint(x, y), w)).getTopLeftPoint().getX()
								) &&
								doubleEquals(
										factory.createCircle(factory.createPoint(x, y), w).getBottomLeftPoint().getX(),
										-1 * mirrorCircleAroundOrigin(factory.createCircle(factory.createPoint(x, y), w)).getBottomRightPoint().getX()
								) &&
								doubleEquals(
										factory.createCircle(factory.createPoint(x, y), w).getBottomRightPoint().getX(),
										-1 * mirrorCircleAroundOrigin(factory.createCircle(factory.createPoint(x, y), w)).getBottomLeftPoint().getX()
								)
		);
	}

	@Test
	public void mirrorofMirrorOfCircleHorizontallyAroundCenter() {
		IShapeFactory factory = new LShapeFactory();
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE)).check(
				(x, y, w) ->
						mirrorCircleTwiceIsSame(factory.createCircle(factory.createPoint(x, y), w))
		);
	}

	@Test
	public void rotateAndReverseRotateCircle() {
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

	@Test
	public void rotateTwoTimesOneEightyCircle() {
		IShapeFactory factory = new LShapeFactory();
		qt().forAll(
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE),
				doubles().between(SMALLEST_POSITIVE_NONZERO_DOUBLE, LARGEST_NONMAX_DOUBLE)).check(
				(x, y, w) ->
						rotateTwoTimesOneEightyCircleIsSame(factory.createCircle(factory.createPoint(x, y), w))
		);
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
		ICircle clone = cloneCircle(circle);
		clone.scaleWithRatio(clone.getWidth(), clone.getHeight(), Position.NORTH, new Rectangle.Double(0, 0, clone.getWidth() / 2, clone.getHeight() / 2));
		clone.scaleWithRatio(clone.getWidth(), clone.getHeight(), Position.NORTH, new Rectangle.Double(0, 0, clone.getWidth() * 2, clone.getHeight() * 2));
		//clone.scale();
		//clone.rotate(factory.createPoint(0, 0), angle);
		//clone.rotate(factory.createPoint(0, 0), -angle);
		return doubleEquals(circle.getRadius(), clone.getRadius(), 0.001);
	}

	private boolean rotateTwoTimesOneEightyCircleIsSame(ICircle circle) {
		ICircle clone = cloneCircle(circle);
		IShapeFactory factory = new LShapeFactory();
		clone.rotate(factory.createPoint(0, 0), Math.PI);
		clone.rotate(factory.createPoint(0, 0), Math.PI);
		return compareCircles(circle, clone);
	}

	private boolean rotatedAndReverseRotatedCircleIsSame(ICircle circle, double angle) {
		ICircle clone = cloneCircle(circle);
		IShapeFactory factory = new LShapeFactory();
		clone.rotate(factory.createPoint(0, 0), angle);
		clone.rotate(factory.createPoint(0, 0), -angle);
		return compareCircles(circle, clone);
	}

	private boolean doubleEquals(double d1, double d2) {
		return doubleEquals(d1, d2, DEFAULT_MAX_DOUBLE_DIFFERANCE);
	}

	private boolean doubleEquals(double d1, double d2, double maxDifferance) {
		return Math.abs(d1 - d2) < maxDifferance;
	}

	private ICircle mirrorCircleAroundOrigin(ICircle circle) {
		circle.mirrorHorizontal(0);
		return circle;
	}

	private boolean mirrorCircleTwiceIsSame(ICircle circle) {
		ICircle clone = cloneCircle(circle);
		return compareCircles(circle, mirrorCircleAroundOrigin(mirrorCircleAroundOrigin(clone)));
	}

	private boolean compareCircles(ICircle circle1, ICircle circle2) {
		boolean same = true;
		same &= doubleEquals(circle1.getX(), circle2.getX());
		same &= doubleEquals(circle1.getY(), circle2.getY());
		same &= circle1.getCenter().equals(circle2.getCenter(), 0.0001d);
		same &= doubleEquals(circle1.getRadius(), circle2.getRadius());
		if (circle1.getPoints() == null || circle2.getPoints() == null || circle1.getPoints().size() != circle2.getPoints().size()) {
			return false;
		}
		for (int i = 0; i < circle1.getPoints().size(); i++) {
			same &= circle1.getPoints().get(i).equals(circle2.getPoints().get(i), 0.0001d);
		}
		same &= circle1.getTopLeftPoint().equals(circle2.getTopLeftPoint(), 0.0001d);
		return same;
	}

	private ICircle cloneCircle(ICircle circle) {
		IShapeFactory factory = new LShapeFactory();
		ICircle clone = factory.createCircle(circle.getPosition(), circle.getRadius() * 2);
		return clone;
	}

}