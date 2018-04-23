package net.sf.latexdraw.testautomation;

import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.TestBuilder;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

@GraphWalker(value = "random(edge_coverage(100))", start = "e_ProgramStart")
public class AlfaModel extends ExecutionContext implements Alfa_mini {

	private final AlfaAdapter adapter = new AlfaAdapter();
	private final String MODEL_PATH = System.getProperty("user.dir") + "/src/main/resources/net/sf/latexdraw/testautomation/Alfa_mini.graphml";

	@Override
	public void SplashScreen() {
		System.out.println("SplashScreen: Insert test code here!");
	}

	@Override
	public void e_LoadingComplete() {
		System.out.println("e_LoadingComplete: Insert test code here!");
	}

	@Override
	public void Editor() {
		System.out.println("Editor: Insert test code here!");
	}

	@Override
	public void e_ProgramStart() {
		System.out.println("e_ProgramStart: Insert test code here!");
	}

	@Test
	public void testTest() {

		/*try {

		} catch (TestExecutionException e){
			e.printStackTrace();
		}*/

		new TestBuilder()
			.addModel(MODEL_PATH, new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)), "e_ProgramStart")
			.execute();


		new TestBuilder()
			.setModel(System.getProperty("user.dir") + "/src/main/resources/net/sf/latexdraw/testautomation/Alfa_mini.graphml")
			.setContext(new AlfaModel())
			.setPathGenerator(new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)))
			.setStart("e_ProgramStart")
			.execute();

	}

}