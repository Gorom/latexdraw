package net.sf.latexdraw.testautomation;

import net.sf.latexdraw.LaTeXDraw;
import org.sikuli.script.*;

public class AlfaAdapter {

	public AlfaAdapter(){


		Thread appThread = new Thread(){
			@Override
			public void run(){
				LaTeXDraw.main(new String[]{});
			}
		};
		appThread.start();


		Screen screen = new Screen();
		try{
			screen.click(System.getProperty("user.dir") + "/src/main/resources/res/sikuli/ubuntulogo.png");
			screen.type("HELLO");
		}catch (FindFailed e){
			e.printStackTrace();
		}
	}
}