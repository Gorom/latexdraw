// Generated by GraphWalker (http://www.graphwalker.org)
package net.sf.latexdraw.testautomation;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "net/sf/latexdraw/testautomation/Beta.graphml")
public interface Beta {

    @Vertex()
    void Drawing();

    @Edge()
    void e_DeselectShapes();

    @Edge()
    void e_DeleteSelectedShapes();

    @Edge()
    void e_Scale();

    @Edge()
    void e_ViewDrawing();

    @Edge()
    void e_CloseAppDoNotSave();

    @Edge()
    void e_ViewPST();

    @Edge()
    void e_Save();

    @Vertex()
    void ExitPrompt();

    @Vertex()
    void PST();

    @Edge()
    void e_SelectAdditionalShape();

    @Edge()
    void e_Rotate();

    @Edge()
    void e_Move();

    @Vertex()
    void ShapesSelected();

    @Edge()
    void e_DrawCircle();

    @Edge()
    void e_SetCurrentTool();

    @Edge()
    void e_CloseApp();

    @Vertex()
    void SplashScreen();

    @Edge()
    void e_CancelPrompt();

    @Edge()
    void e_SelectShape();

    @Edge()
    void e_ProgramStart();

    @Vertex()
    void Exit();

    @Edge()
    void e_Success();

    @Edge()
    void e_Failure();
}