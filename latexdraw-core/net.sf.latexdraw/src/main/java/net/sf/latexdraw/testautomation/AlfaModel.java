package net.sf.latexdraw.testautomation;

import net.sf.latexdraw.LaTeXDraw;
import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.test.TestBuilder;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class AlfaModel extends ExecutionContext implements Alfa {

	AlfaAdapter adapter;

	@Override
	public void Drawing() {

	}

	@Override
	public void e_DrawCircle() {

	}

	@Override
	public void SplashScreen() {

	}

	@Override
	public void e_Save() {

	}

	@Override
	public void e_ProgramStart() {
		System.out.println("e_ProgramStart");
		Thread appThread = new Thread(){
			@Override
			public void run(){
				LaTeXDraw.main(new String[]{});
			}
		};
		appThread.start();
		adapter = new AlfaAdapter();
	}

	@Override
	public void Exit() {

	}

	@Test
	public void testTest() {
		new TestBuilder()
				.setModel(System.getProperty("user.dir") + "/src/main/resources/net/sf/latexdraw/testautomation/Alfa.graphml")
				.setContext(new AlfaModel())
				.setPathGenerator(new RandomPath(new TimeDuration(30, TimeUnit.SECONDS)))
				.setStart("e_ProgramStart")
				.execute();
	}

}