package net.sf.latexdraw.testautomation;

import org.graphwalker.core.condition.VertexCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.TestBuilder;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@GraphWalker(value = "random(vertex_coverage(100))", start = "e_ProgramStart")
public class AlfaModel extends ExecutionContext implements Beta {

	private final AlfaAdapter adapter = new AlfaAdapter();
	private final String MODEL_PATH = System.getProperty("user.dir") + "/src/main/resources/net/sf/latexdraw/testautomation/Beta.graphml";

	@BeforeExecution
	public void setup() {
		System.out.println("Model: setup"); // http://graphwalker.github.io/fixtures/
		adapter.init();
	}

	@AfterExecution
	public void teardown() {
		System.out.println("Model: teardown"); // http://graphwalker.github.io/fixtures/
		adapter.reset();
	}

	@Override
	public void Drawing() {

	}

	@Override
	public void e_DeselectShapes() {
		System.out.println("e_DeselectShapes");
		adapter.deselect();
		assertFalse(adapter.foundScaleSymbol());
		assertFalse(adapter.foundRotateSymbol());
	}

	@Override
	public void e_DeleteSelectedShapes() {
		System.out.println("e_DeleteSelectedShapes");
		adapter.delete();
		assertFalse(adapter.foundSquare());
	}

	@Override
	public void e_Scale() {
		System.out.println("e_Scale");
		adapter.scaleSquare();
		assertTrue(adapter.foundScaledSquare());
		adapter.rescaleSquare();
	}

	@Override
	public void e_ViewDrawing() {
		System.out.println("e_ViewDrawing");
		adapter.viewDrawing();
		assertTrue(adapter.foundDrawingToolbar());
	}

	@Override
	public void e_ViewPST() {
		System.out.println("e_ViewPST");
		adapter.viewPST();
		assertTrue(adapter.foundPSTToolbar());
	}

	@Override
	public void e_DrawSquare() {
		System.out.println("e_DrawSquare");
		assertTrue(adapter.foundSquareTool());
		adapter.selectSquareTool();
		if (adapter.foundSquare()) {
			setAttribute("saved", true);
		}
		adapter.drawSquare();
		assertTrue(adapter.foundSquare());
	}

	@Override
	public void e_CloseApp() {
		System.out.println("e_CloseApp");
		adapter.exit();
		assertTrue(adapter.foundExitPrompt());
	}

	@Override
	public void SplashScreen() {

	}

	@Override
	public void e_CancelPrompt() {
		System.out.println("e_CancelPrompt");
		adapter.pressEscape();
		assertFalse(adapter.foundExitPrompt());
	}

	@Override
	public void e_SelectShape() {
		System.out.println("e_SelectShape");
		adapter.selectSelectionTool();
		if (adapter.selectSquare()) {
			assertTrue(adapter.foundSelectedSquare());
		}
	}

	@Override
	public void e_Save() {
		System.out.println("e_Save");
		adapter.save();
	}

	@Override
	public void ExitPrompt() {

	}

	@Override
	public void PST() {

	}

	@Override
	public void e_Rotate() {
		System.out.println("e_Rotate");
		adapter.rotateSquare();
		assertTrue(adapter.foundRotatedSquare());
		adapter.undo();
		adapter.selectSelectionTool();
		adapter.selectSquare();
	}

	@Override
	public void e_Move() {
		System.out.println("e_Move");
		adapter.moveSquare();
		adapter.undo();
	}

	@Override
	public void ShapesSelected() {

	}

	@Override
	public void e_ProgramStart() {
		System.out.println("e_ProgramStart");

		assertTrue(adapter.foundSplash());
		adapter.foundSplash();
	}

	@Override
	public void e_Success() {
		System.out.println("e_Success");
		assertTrue(adapter.foundToolbar());
		adapter.runWindowed();
	}

	@Test
	public void graphwalkerTest() {
		new TestBuilder()
				.setModel(MODEL_PATH)
				.setContext(new AlfaModel())
				.setPathGenerator(new RandomPath(new VertexCoverage(100)))
				.setStart("e_ProgramStart")
				.execute();
	}
}