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

	public boolean foundSquareTool() {
		return checkMatch("SquareTool.png", 5);
	}

	public void selectSquareTool() {
		try {
			screen.click(sikuliImageDirr + "SquareTool.png");
		} catch (FindFailed findFailed) {
			System.out.println("Something went terribly wrong!");
		}
	}

	public boolean foundSquare() {
		return checkMatch("Square.png", 5);
	}

	public void drawSquare() {
		if (!foundSquare()) {
			clickImageAndDrag("LaTeXDraw_UpperLeftDrawingArea.png", 0, 0, 50, 50);
		}
	}

	public boolean foundSplash() {
		return checkMatch("LatexDraw_Splash.png", 5);
	}

	public boolean foundToolbar() {

		return checkMatch("LatexDraw_Toolbar.png", 5);
	}

	private boolean checkMatch(String path, double timeout) {
		boolean result = (screen.exists(sikuliImageDirr + path, timeout) != null);
		System.out.println("Match for " + path + " returned " + result);
		return result;
	}

	public void selectSelectionTool() {
		clickImage("LaTeXDraw_SelectTool.png", 0, 0);
	}

	public boolean selectSquare() {
		return clickImageAndDrag("Square.png", 0, 0, 100, 100);
	}

	public boolean foundSelectedSquare() {
		return checkMatch("SelectedSquare.png", 5);
	}

	public void save() {
		screen.type("s", Key.CTRL);
		if (checkMatch("LaTeXDraw_CancelSave.png", 5)) {
			screen.type("test");
			screen.type(Key.ENTER);
		}
	}

	public void moveSquare() {
		clickImageAndDrag("SelectedSquare.png", 49, 25, 200, 200);
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
		screen.wait(4d);
	}

	public void deselect() {
		clickImage("LatexDraw_DrawingEdge.png", 0, 0);
		screen.wait(2d);
	}

	public void rotateSquare() {
		clickImageAndDrag("LatexDraw_Rotate.png", 0, 0, 0, 50);
		screen.mouseMove(100, 100);
	}

	public void undo() {
		clickImage("LatexDraw_undo.png", 0, 0);
		screen.wait(2d);
	}

	public boolean foundRotatedSquare() {
		return checkMatch("LatexDraw_RotatedSquare.png", 5);
	}

	public void scaleSquare() {
		clickImageAndDrag("ScalingArrow.png", 0, 0, 50, 50);
	}

	public void rescaleSquare() {
		clickImageAndDrag("ScalingArrow.png", 0, 0, -50, -50);
	}

	public boolean foundScaledSquare() {
		return checkMatch("ScaledSquare.png", 5);
	}

	public boolean foundDrawingToolbar() {
		return checkMatch("LaTeXDraw_Drawing_Toolbar.png", 5);
	}

	public boolean foundPSTToolbar() {
		return checkMatch("LaTeXDraw_PST_Toolbar.png", 5);
	}

	public void runWindowed() {
		screen.type(Key.ESC);
		screen.wait(1d);
		clickImage("FullScreen.png", 0, 0);
		screen.wait(2d);
	}

	public boolean foundRotateSymbol() {
		return checkMatch("LaTeXDraw_Rotate.png", 3);
	}

	public boolean foundScaleSymbol() {
		return checkMatch("ScaledSquare.png", 3);
	}

	public void exit() {
		screen.keyDown(Key.ALT);
		screen.keyDown(Key.F4);
		screen.keyUp();
		screen.wait(3d);
	}

	public void pressEscape() {
		screen.keyDown(Key.ESC);
		screen.keyUp();
		screen.wait(3d);
	}

	public boolean foundExitPrompt() {
		return checkMatch("SavePrompt.png", 5);
	}
}