package net.sf.latexdraw.testautomation;

import org.graphwalker.core.condition.Length;
import org.graphwalker.core.generator.QuickRandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.TestBuilder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

@GraphWalker(value = "random(edge_coverage(100))", start = "e_ProgramStart")
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
	}

	@Override
	public void e_DeleteSelectedShapes() {
		System.out.println("e_DeleteSelectedShapes");
		adapter.delete();
	}

	@Override
	public void e_Scale() {
		System.out.println("e_Scale");

	}

	@Override
	public void e_ViewDrawing() {
		System.out.println("e_ViewDrawing");
		adapter.viewDrawing();
	}

	@Override
	public void e_CloseAppDoNotSave() {
		System.out.println("e_CloseAppDoNotSave");
	}

	@Override
	public void e_ViewPST() {
		System.out.println("e_ViewPST");
		adapter.viewPST();

	}

	@Override
	public void e_DrawCircle() {
		assertTrue(adapter.foundCircleTool());
		adapter.selectCircleTool();
		adapter.drawSelectedShape();
		assertTrue(adapter.foundCircle());
	}

	@Override
	public void e_CloseApp() {
		System.out.println("e_CloseApp");
	}

	@Override
	public void SplashScreen() {

	}

	@Override
	public void e_CancelPrompt() {
		System.out.println("e_CancelPrompt");
	}

	@Override
	public void e_SelectShape() {
		System.out.println("e_SelectShape");
		if (adapter.foundSelectionTool()) {
			System.out.println("Found selection tool!");
		} else {
			System.out.println("Could not find selection tool.");
		}
		adapter.selectSelectionTool();
		if (adapter.selectCircle()) {
			assertTrue(adapter.circleSelected());
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
	public void e_SelectAdditionalShape() {
		System.out.println("e_SelectAdditionalShape");
	}

	@Override
	public void e_Rotate() {
		System.out.println("e_Rotate");
	}

	@Override
	public void e_Move() {
		System.out.println("e_Move");
		adapter.moveCircle();

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
	public void Exit() {

	}

	@Override
	public void e_Success() {
		System.out.println("e_Success");
		assertTrue(adapter.foundToolbar());
	}

	@Override
	public void e_Failure() {
		System.out.println("e_Failure");

	}

	@Override
	public void e_Restart() {
		System.out.println("e_Restart");

	}

	@Test
	public void testTest() {
		new TestBuilder()
				.setModel(MODEL_PATH)
				.setContext(new AlfaModel())
				.setPathGenerator(new QuickRandomPath(new Length(20)))
				.setStart("e_ProgramStart")
				.execute();
	}

}