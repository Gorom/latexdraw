package net.sf.latexdraw.testautomation;

import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.TestBuilder;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

@GraphWalker(value = "random(edge_coverage(100))", start = "e_ProgramStart")
public class AlfaModel extends ExecutionContext implements Beta {

	private final AlfaAdapter adapter = new AlfaAdapter();
	private final String MODEL_PATH = System.getProperty("user.dir") + "/src/main/resources/net/sf/latexdraw/testautomation/Alfa_mini.graphml";

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

	}

	@Override
	public void e_DeleteSelectedShapes() {

	}

	@Override
	public void e_Scale() {

	}

	@Override
	public void e_ViewDrawing() {

	}

	@Override
	public void e_CloseAppDoNotSave() {

	}

	@Override
	public void e_ViewPST() {

	}

	@Override
	public void e_DrawCircle() {

	}

	@Override
	public void e_SetCurrentTool() {

	}

	@Override
	public void e_CloseApp() {

	}

	@Override
	public void SplashScreen() {
		System.out.println("SplashScreen: Insert test code here!");
	}

	@Override
	public void e_CancelPrompt() {

	}

	@Override
	public void e_SelectShape() {

	}

	@Override
	public void e_Save() {

	}

	@Override
	public void ExitPrompt() {

	}

	@Override
	public void PST() {

	}

	@Override
	public void e_SelectAdditionalShape() {

	}

	@Override
	public void e_Rotate() {

	}

	@Override
	public void e_Move() {

	}

	@Override
	public void ShapesSelected() {

	}

	@Override
	public void e_ProgramStart() {
		System.out.println("e_ProgramStart: Insert test code here!");

		assertTrue(adapter.foundSplash());
		adapter.foundSplash();
	}

	@Override
	public void Exit() {

	}

	@Override
	public void e_Success() {
		assertTrue(adapter.foundToolbar());
	}

	@Override
	public void e_Failure() {

	}

	@Override
	public void e_Restart() {

	}

	@Test
	public void testTest() {

		/*try {

		} catch (TestExecutionException e){
			e.printStackTrace();
		}*/

		/*new TestBuilder()
			.addModel(MODEL_PATH, new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)), "e_ProgramStart")
			.execute();*/


		new TestBuilder()
			.setModel(System.getProperty("user.dir") + "/src/main/resources/net/sf/latexdraw/testautomation/Beta.graphml")
			.setContext(new AlfaModel())
			.setPathGenerator(new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)))
			.setStart("e_ProgramStart")
			.execute();

	}

}