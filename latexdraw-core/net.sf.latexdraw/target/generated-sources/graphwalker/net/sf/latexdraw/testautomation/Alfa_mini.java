// Generated by GraphWalker (http://www.graphwalker.org)
package net.sf.latexdraw.testautomation;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "net/sf/latexdraw/testautomation/Alfa_mini.graphml")
public interface Alfa_mini {

    @Vertex()
    void SplashScreen();

    @Edge()
    void e_LoadingComplete();

    @Vertex()
    void Editor();

    @Edge()
    void e_ProgramStart();
}
