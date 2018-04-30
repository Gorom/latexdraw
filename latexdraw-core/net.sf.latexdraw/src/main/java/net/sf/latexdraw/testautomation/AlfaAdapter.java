package net.sf.latexdraw.testautomation;

import net.sf.latexdraw.LaTeXDraw;
import org.sikuli.script.*;

import java.io.File;

public class AlfaAdapter {

	private final String sikuliImageDirr = System.getProperty("user.dir") + "/src/main/resources/res/sikuli/";
	private Screen screen;

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
		clickImageAndDrag("LaTeXDraw_UpperLeftDrawingArea.png", 0, 0, 50, 50);
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

	public boolean selectCircle() {
		return clickImageAndDrag("LaTeXDraw_Circle.png", 0, 0, 50, 50);
	}

	public boolean circleSelected() {
		return checkMatch("LaTeXDraw_SelectedCircle.png", 20);
	}

	public void save() {
		screen.type("s", Key.CTRL);
		if (checkMatch("LaTeXDraw_CancelSave.png", 5)) {
			screen.type("test");
			screen.type(Key.ENTER);
		}
	}

	public void moveCircle() {
		clickImageAndDrag("LaTeXDraw_SelectedCircle.png", 49, 25, 200, 200);
	}

	public void viewPST() {
		clickImage("LaTeXDraw_PSTTab.png", 0, 0);
	}

	public void viewDrawing() {
		clickImage("LaTeXDraw_ViewDrawing.png", 0, 0);
	}

	public boolean clickImage(String imageName, int offsetX, int offsetY) {
		boolean success = true;
		Match target = null;
		try {
			target = screen.find(sikuliImageDirr + imageName);
		} catch (FindFailed findFailed) {
			System.out.println("Find " + imageName + " failed.");
			success = false;
		}
		if (target != null) {
			try {
				screen.click(target.offset(offsetX, offsetY));
			} catch (FindFailed findFailed) {
				System.out.println("Clicking " + imageName + " failed.");
				success = false;
			}
		} else {
			System.out.println("clickImage: target is null.");
			success = false;
		}
		return success;
	}

	public boolean clickImageAndDrag(String imageName, int startOffsetX, int startOffsetY, int endOffsetX, int endOffsetY) {
		boolean success = true;
		Match target = null;
		try {
			target = screen.find(sikuliImageDirr + imageName);
		} catch (FindFailed findFailed) {
			System.out.println("Find " + imageName + " failed.");
			success = false;
		}
		if (target != null) {
			try {
				Region start = target.offset(startOffsetX, startOffsetY);
				Region end = target.offset(endOffsetX, endOffsetY);
				screen.dragDrop(start, end);
			} catch (FindFailed findFailed) {
				System.out.println("Clicking and dragging " + imageName + " failed.");
				success = false;
			}
		} else {
			System.out.println("clickImageAndDrag: target is null.");
			success = false;
		}
		return success;
	}

	public void delete() {
		screen.type(Key.DELETE);
	}

	public void deselect() {
		clickImage("LatexDraw_DrawingEdge.png", 0, 0);
	}
}