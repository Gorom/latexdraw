package net.sf.latexdraw.testautomation;

import net.sf.latexdraw.LaTeXDraw;
import org.sikuli.script.*;

public class AlfaAdapter {

	private final String sikuliImageDirr = System.getProperty("user.dir") + "/src/main/resources/res/sikuli/";
	private Screen screen;

	public AlfaAdapter(){
		/*try{
			screen.click(System.getProperty("user.dir") + "/src/main/resources/res/sikuli/ubuntulogo.png");
			screen.type("HELLO");
		}catch (FindFailed e){
			e.printStackTrace();
		}*/
	}

	public void init() {
		Thread appThread = new Thread(){
			@Override
			public void run(){
				LaTeXDraw.main(new String[]{});
			}
		};
		appThread.start();
		screen = new Screen();
	}

	public void reset() {

	}

	public boolean foundSplash() {
		return checkMatch("LatexDraw_Splash.png", 20);

	}

	public boolean foundToolbar() {

		return checkMatch("LatexDraw_Toolbar.png", 20);
	}

	private boolean checkMatch(String path, double timeout) {
		boolean result = (screen.exists(sikuliImageDirr + path, timeout) != null);
		System.out.println("Match for " + path + " returned " + result);
		return result;
	}
}