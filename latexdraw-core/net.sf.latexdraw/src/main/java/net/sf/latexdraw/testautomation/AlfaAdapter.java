package net.sf.latexdraw.testautomation;

import net.sf.latexdraw.LaTeXDraw;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

import java.io.File;
import java.nio.file.Files;

public class AlfaAdapter {

	private final String sikuliImageDirr = System.getProperty("user.dir") + "/src/main/resources/res/sikuli/";
	private Screen screen;

	public AlfaAdapter() {
		/*try{
			screen.click(System.getProperty("user.dir") + "/src/main/resources/res/sikuli/ubuntulogo.png");
			screen.type("HELLO");
		}catch (FindFailed e){
			e.printStackTrace();
		}*/
	}

	public void init() {
		Thread appThread = new Thread() {
			@Override
			public void run() {
				LaTeXDraw.main(new String[]{});
			}
		};
		appThread.start();
		screen = new Screen();
	}

	public void reset() {
		File saveFile = new File(System.getProperty("user.dir") + " /test.svg");
		saveFile.delete();
	}

	public boolean foundCircleTool() {
		return checkMatch("LaTeXDraw_CircleTool.png", 20);
	}

	public void selectCircleTool() {
		try {
			screen.click(sikuliImageDirr + "LaTeXDraw_CircleTool.png");
		} catch (FindFailed findFailed) {
			System.out.println("Something went terribly wrong!");
		}
	}

	public boolean foundCircle() {
		return checkMatch("LaTeXDraw_Circle.png", 20);
	}

	public void drawSelectedShape() {
		Match target = null;
		try {
			target = screen.find(sikuliImageDirr + "LaTeXDraw_UpperLeftDrawingArea.png");
		} catch (FindFailed findFailed) {
			System.out.println("Find upper left corner failed.");
		}

		if (target != null) {
			try {
				screen.dragDrop(target, target.offset(50, 50));
			} catch (FindFailed findFailed) {
				System.out.println("Dragging and dropping failed.");
			}
		} else {
			System.out.println("drawSelectedShape: target is null.");
		}
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

	public boolean foundSelectionTool() {
		return checkMatch("LaTeXDraw_SelectTool.png", 20);
	}

	public void selectSelectionTool() {
		try {
			screen.click(sikuliImageDirr + "LaTeXDraw_SelectTool.png");
		} catch (FindFailed findFailed) {
			System.out.println("Could not find selection tool.");
		}
	}

	public void selectCircle() {
		Match target = null;
		try {
			target = screen.find(sikuliImageDirr + "LaTeXDraw_Circle.png");
		} catch (FindFailed findFailed) {
			System.out.println("Find circle failed.");
		}

		if (target != null) {
			try {
				screen.dragDrop(target, target.offset(200, 200));
			} catch (FindFailed findFailed) {
				System.out.println("Selecting circle failed.");
			}
		} else {
			System.out.println("selectCircle: target is null.");
		}
	}

	public boolean circleSelected() {
		return checkMatch("LaTeXDraw_SelectedCircle.png", 20);
	}

	public void save(){
		screen.type("s", Key.CTRL);
		if(checkMatch("LaTeXDraw_CancelSave.png", 5)){
			screen.type("test");
			screen.type(Key.ENTER);
		}
	}

	public void moveCircle() {
		Match target = null;
		try {
			target = screen.find(sikuliImageDirr + "LaTeXDraw_SelectedCircle.png");
		} catch (FindFailed findFailed) {
			System.out.println("Find circle failed.");
		}

		if (target != null) {
			try {
				screen.dragDrop(target.offset(49, 25), target.offset(200, 200) );
			} catch (FindFailed findFailed) {
				System.out.println("Selecting circle failed.");
			}
		} else {
			System.out.println("selectCircle: target is null.");
		}

	}

	public void viewPST() {
		Match target = null;
		try {
			target = screen.find(sikuliImageDirr + "LaTeXDraw_PSTTab.png");
		} catch (FindFailed findFailed) {
			System.out.println("Find pst failed.");
		}

		if (target != null) {
			try {
				screen.click(sikuliImageDirr +"LaTeXDraw_PSTTab.png" );
			} catch (FindFailed findFailed) {
				System.out.println("Selecting pst failed.");
			}
		} else {
			System.out.println("viewpst: target is null.");
		}
	}

	public void viewDrawing() {
		Match target = null;
		try {
			target = screen.find(sikuliImageDirr + "LaTeXDraw_ViewDrawing.png");
		} catch (FindFailed findFailed) {
			System.out.println("Find pst failed.");
		}

		if (target != null) {
			try {
				screen.click(sikuliImageDirr +"LaTeXDraw_ViewDrawing.png" );
			} catch (FindFailed findFailed) {
				System.out.println("Selecting pst failed.");
			}
		} else {
			System.out.println("viewpst: target is null.");
		}
	}

	public void delete() {
		screen.type(Key.DELETE);
	}
}