// Generated from PST.g4 by ANTLR 4.7.1

package net.sf.latexdraw.parsers.pst;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSTParser}.
 */
public interface PSTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSTParser#pstCode}.
	 * @param ctx the parse tree
	 */
	void enterPstCode(PSTParser.PstCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pstCode}.
	 * @param ctx the parse tree
	 */
	void exitPstCode(PSTParser.PstCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pstcustomBlock}.
	 * @param ctx the parse tree
	 */
	void enterPstcustomBlock(PSTParser.PstcustomBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pstcustomBlock}.
	 * @param ctx the parse tree
	 */
	void exitPstcustomBlock(PSTParser.PstcustomBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pstBlock}.
	 * @param ctx the parse tree
	 */
	void enterPstBlock(PSTParser.PstBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pstBlock}.
	 * @param ctx the parse tree
	 */
	void exitPstBlock(PSTParser.PstBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psellipse}.
	 * @param ctx the parse tree
	 */
	void enterPsellipse(PSTParser.PsellipseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psellipse}.
	 * @param ctx the parse tree
	 */
	void exitPsellipse(PSTParser.PsellipseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psframe}.
	 * @param ctx the parse tree
	 */
	void enterPsframe(PSTParser.PsframeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psframe}.
	 * @param ctx the parse tree
	 */
	void exitPsframe(PSTParser.PsframeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psdiamond}.
	 * @param ctx the parse tree
	 */
	void enterPsdiamond(PSTParser.PsdiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psdiamond}.
	 * @param ctx the parse tree
	 */
	void exitPsdiamond(PSTParser.PsdiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pstriangle}.
	 * @param ctx the parse tree
	 */
	void enterPstriangle(PSTParser.PstriangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pstriangle}.
	 * @param ctx the parse tree
	 */
	void exitPstriangle(PSTParser.PstriangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psline}.
	 * @param ctx the parse tree
	 */
	void enterPsline(PSTParser.PslineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psline}.
	 * @param ctx the parse tree
	 */
	void exitPsline(PSTParser.PslineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psqline}.
	 * @param ctx the parse tree
	 */
	void enterPsqline(PSTParser.PsqlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psqline}.
	 * @param ctx the parse tree
	 */
	void exitPsqline(PSTParser.PsqlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pscircle}.
	 * @param ctx the parse tree
	 */
	void enterPscircle(PSTParser.PscircleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pscircle}.
	 * @param ctx the parse tree
	 */
	void exitPscircle(PSTParser.PscircleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psqdisk}.
	 * @param ctx the parse tree
	 */
	void enterPsqdisk(PSTParser.PsqdiskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psqdisk}.
	 * @param ctx the parse tree
	 */
	void exitPsqdisk(PSTParser.PsqdiskContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pspolygon}.
	 * @param ctx the parse tree
	 */
	void enterPspolygon(PSTParser.PspolygonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pspolygon}.
	 * @param ctx the parse tree
	 */
	void exitPspolygon(PSTParser.PspolygonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psbezier}.
	 * @param ctx the parse tree
	 */
	void enterPsbezier(PSTParser.PsbezierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psbezier}.
	 * @param ctx the parse tree
	 */
	void exitPsbezier(PSTParser.PsbezierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psdot}.
	 * @param ctx the parse tree
	 */
	void enterPsdot(PSTParser.PsdotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psdot}.
	 * @param ctx the parse tree
	 */
	void exitPsdot(PSTParser.PsdotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psdots}.
	 * @param ctx the parse tree
	 */
	void enterPsdots(PSTParser.PsdotsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psdots}.
	 * @param ctx the parse tree
	 */
	void exitPsdots(PSTParser.PsdotsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psaxes}.
	 * @param ctx the parse tree
	 */
	void enterPsaxes(PSTParser.PsaxesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psaxes}.
	 * @param ctx the parse tree
	 */
	void exitPsaxes(PSTParser.PsaxesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psgrid}.
	 * @param ctx the parse tree
	 */
	void enterPsgrid(PSTParser.PsgridContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psgrid}.
	 * @param ctx the parse tree
	 */
	void exitPsgrid(PSTParser.PsgridContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#rput}.
	 * @param ctx the parse tree
	 */
	void enterRput(PSTParser.RputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#rput}.
	 * @param ctx the parse tree
	 */
	void exitRput(PSTParser.RputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#scalebox}.
	 * @param ctx the parse tree
	 */
	void enterScalebox(PSTParser.ScaleboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#scalebox}.
	 * @param ctx the parse tree
	 */
	void exitScalebox(PSTParser.ScaleboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psscalebox}.
	 * @param ctx the parse tree
	 */
	void enterPsscalebox(PSTParser.PsscaleboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psscalebox}.
	 * @param ctx the parse tree
	 */
	void exitPsscalebox(PSTParser.PsscaleboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pswedge}.
	 * @param ctx the parse tree
	 */
	void enterPswedge(PSTParser.PswedgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pswedge}.
	 * @param ctx the parse tree
	 */
	void exitPswedge(PSTParser.PswedgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psellipticarc}.
	 * @param ctx the parse tree
	 */
	void enterPsellipticarc(PSTParser.PsellipticarcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psellipticarc}.
	 * @param ctx the parse tree
	 */
	void exitPsellipticarc(PSTParser.PsellipticarcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psellipticarcn}.
	 * @param ctx the parse tree
	 */
	void enterPsellipticarcn(PSTParser.PsellipticarcnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psellipticarcn}.
	 * @param ctx the parse tree
	 */
	void exitPsellipticarcn(PSTParser.PsellipticarcnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psarc}.
	 * @param ctx the parse tree
	 */
	void enterPsarc(PSTParser.PsarcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psarc}.
	 * @param ctx the parse tree
	 */
	void exitPsarc(PSTParser.PsarcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psarcn}.
	 * @param ctx the parse tree
	 */
	void enterPsarcn(PSTParser.PsarcnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psarcn}.
	 * @param ctx the parse tree
	 */
	void exitPsarcn(PSTParser.PsarcnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#parabola}.
	 * @param ctx the parse tree
	 */
	void enterParabola(PSTParser.ParabolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#parabola}.
	 * @param ctx the parse tree
	 */
	void exitParabola(PSTParser.ParabolaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pscurve}.
	 * @param ctx the parse tree
	 */
	void enterPscurve(PSTParser.PscurveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pscurve}.
	 * @param ctx the parse tree
	 */
	void exitPscurve(PSTParser.PscurveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psecurve}.
	 * @param ctx the parse tree
	 */
	void enterPsecurve(PSTParser.PsecurveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psecurve}.
	 * @param ctx the parse tree
	 */
	void exitPsecurve(PSTParser.PsecurveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psccurve}.
	 * @param ctx the parse tree
	 */
	void enterPsccurve(PSTParser.PsccurveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psccurve}.
	 * @param ctx the parse tree
	 */
	void exitPsccurve(PSTParser.PsccurveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#rlineto}.
	 * @param ctx the parse tree
	 */
	void enterRlineto(PSTParser.RlinetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#rlineto}.
	 * @param ctx the parse tree
	 */
	void exitRlineto(PSTParser.RlinetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#movepath}.
	 * @param ctx the parse tree
	 */
	void enterMovepath(PSTParser.MovepathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#movepath}.
	 * @param ctx the parse tree
	 */
	void exitMovepath(PSTParser.MovepathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#closedshadow}.
	 * @param ctx the parse tree
	 */
	void enterClosedshadow(PSTParser.ClosedshadowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#closedshadow}.
	 * @param ctx the parse tree
	 */
	void exitClosedshadow(PSTParser.ClosedshadowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#openshadow}.
	 * @param ctx the parse tree
	 */
	void enterOpenshadow(PSTParser.OpenshadowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#openshadow}.
	 * @param ctx the parse tree
	 */
	void exitOpenshadow(PSTParser.OpenshadowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#mrestore}.
	 * @param ctx the parse tree
	 */
	void enterMrestore(PSTParser.MrestoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#mrestore}.
	 * @param ctx the parse tree
	 */
	void exitMrestore(PSTParser.MrestoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#msave}.
	 * @param ctx the parse tree
	 */
	void enterMsave(PSTParser.MsaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#msave}.
	 * @param ctx the parse tree
	 */
	void exitMsave(PSTParser.MsaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#swapaxes}.
	 * @param ctx the parse tree
	 */
	void enterSwapaxes(PSTParser.SwapaxesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#swapaxes}.
	 * @param ctx the parse tree
	 */
	void exitSwapaxes(PSTParser.SwapaxesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#rotate}.
	 * @param ctx the parse tree
	 */
	void enterRotate(PSTParser.RotateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#rotate}.
	 * @param ctx the parse tree
	 */
	void exitRotate(PSTParser.RotateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(PSTParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(PSTParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#translate}.
	 * @param ctx the parse tree
	 */
	void enterTranslate(PSTParser.TranslateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#translate}.
	 * @param ctx the parse tree
	 */
	void exitTranslate(PSTParser.TranslateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#fill}.
	 * @param ctx the parse tree
	 */
	void enterFill(PSTParser.FillContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#fill}.
	 * @param ctx the parse tree
	 */
	void exitFill(PSTParser.FillContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#stroke}.
	 * @param ctx the parse tree
	 */
	void enterStroke(PSTParser.StrokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#stroke}.
	 * @param ctx the parse tree
	 */
	void exitStroke(PSTParser.StrokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#grestore}.
	 * @param ctx the parse tree
	 */
	void enterGrestore(PSTParser.GrestoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#grestore}.
	 * @param ctx the parse tree
	 */
	void exitGrestore(PSTParser.GrestoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#gsave}.
	 * @param ctx the parse tree
	 */
	void enterGsave(PSTParser.GsaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#gsave}.
	 * @param ctx the parse tree
	 */
	void exitGsave(PSTParser.GsaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#rcurveto}.
	 * @param ctx the parse tree
	 */
	void enterRcurveto(PSTParser.RcurvetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#rcurveto}.
	 * @param ctx the parse tree
	 */
	void exitRcurveto(PSTParser.RcurvetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#closepath}.
	 * @param ctx the parse tree
	 */
	void enterClosepath(PSTParser.ClosepathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#closepath}.
	 * @param ctx the parse tree
	 */
	void exitClosepath(PSTParser.ClosepathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#curveto}.
	 * @param ctx the parse tree
	 */
	void enterCurveto(PSTParser.CurvetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#curveto}.
	 * @param ctx the parse tree
	 */
	void exitCurveto(PSTParser.CurvetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#lineto}.
	 * @param ctx the parse tree
	 */
	void enterLineto(PSTParser.LinetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#lineto}.
	 * @param ctx the parse tree
	 */
	void exitLineto(PSTParser.LinetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#moveto}.
	 * @param ctx the parse tree
	 */
	void enterMoveto(PSTParser.MovetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#moveto}.
	 * @param ctx the parse tree
	 */
	void exitMoveto(PSTParser.MovetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#newpath}.
	 * @param ctx the parse tree
	 */
	void enterNewpath(PSTParser.NewpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#newpath}.
	 * @param ctx the parse tree
	 */
	void exitNewpath(PSTParser.NewpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psframebox}.
	 * @param ctx the parse tree
	 */
	void enterPsframebox(PSTParser.PsframeboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psframebox}.
	 * @param ctx the parse tree
	 */
	void exitPsframebox(PSTParser.PsframeboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psdblframebox}.
	 * @param ctx the parse tree
	 */
	void enterPsdblframebox(PSTParser.PsdblframeboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psdblframebox}.
	 * @param ctx the parse tree
	 */
	void exitPsdblframebox(PSTParser.PsdblframeboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psshadowbox}.
	 * @param ctx the parse tree
	 */
	void enterPsshadowbox(PSTParser.PsshadowboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psshadowbox}.
	 * @param ctx the parse tree
	 */
	void exitPsshadowbox(PSTParser.PsshadowboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pscirclebox}.
	 * @param ctx the parse tree
	 */
	void enterPscirclebox(PSTParser.PscircleboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pscirclebox}.
	 * @param ctx the parse tree
	 */
	void exitPscirclebox(PSTParser.PscircleboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psovalbox}.
	 * @param ctx the parse tree
	 */
	void enterPsovalbox(PSTParser.PsovalboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psovalbox}.
	 * @param ctx the parse tree
	 */
	void exitPsovalbox(PSTParser.PsovalboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psdiabox}.
	 * @param ctx the parse tree
	 */
	void enterPsdiabox(PSTParser.PsdiaboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psdiabox}.
	 * @param ctx the parse tree
	 */
	void exitPsdiabox(PSTParser.PsdiaboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pstribox}.
	 * @param ctx the parse tree
	 */
	void enterPstribox(PSTParser.PstriboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pstribox}.
	 * @param ctx the parse tree
	 */
	void exitPstribox(PSTParser.PstriboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#textcolor}.
	 * @param ctx the parse tree
	 */
	void enterTextcolor(PSTParser.TextcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#textcolor}.
	 * @param ctx the parse tree
	 */
	void exitTextcolor(PSTParser.TextcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(PSTParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(PSTParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#unknowncmds}.
	 * @param ctx the parse tree
	 */
	void enterUnknowncmds(PSTParser.UnknowncmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#unknowncmds}.
	 * @param ctx the parse tree
	 */
	void exitUnknowncmds(PSTParser.UnknowncmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#readdata}.
	 * @param ctx the parse tree
	 */
	void enterReaddata(PSTParser.ReaddataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#readdata}.
	 * @param ctx the parse tree
	 */
	void exitReaddata(PSTParser.ReaddataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#savedata}.
	 * @param ctx the parse tree
	 */
	void enterSavedata(PSTParser.SavedataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#savedata}.
	 * @param ctx the parse tree
	 */
	void exitSavedata(PSTParser.SavedataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#parametricplot}.
	 * @param ctx the parse tree
	 */
	void enterParametricplot(PSTParser.ParametricplotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#parametricplot}.
	 * @param ctx the parse tree
	 */
	void exitParametricplot(PSTParser.ParametricplotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psplot}.
	 * @param ctx the parse tree
	 */
	void enterPsplot(PSTParser.PsplotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psplot}.
	 * @param ctx the parse tree
	 */
	void exitPsplot(PSTParser.PsplotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#listplot}.
	 * @param ctx the parse tree
	 */
	void enterListplot(PSTParser.ListplotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#listplot}.
	 * @param ctx the parse tree
	 */
	void exitListplot(PSTParser.ListplotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#dataplot}.
	 * @param ctx the parse tree
	 */
	void enterDataplot(PSTParser.DataplotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#dataplot}.
	 * @param ctx the parse tree
	 */
	void exitDataplot(PSTParser.DataplotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#fileplot}.
	 * @param ctx the parse tree
	 */
	void enterFileplot(PSTParser.FileplotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#fileplot}.
	 * @param ctx the parse tree
	 */
	void exitFileplot(PSTParser.FileplotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#newpsobject}.
	 * @param ctx the parse tree
	 */
	void enterNewpsobject(PSTParser.NewpsobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#newpsobject}.
	 * @param ctx the parse tree
	 */
	void exitNewpsobject(PSTParser.NewpsobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#newpsstyle}.
	 * @param ctx the parse tree
	 */
	void enterNewpsstyle(PSTParser.NewpsstyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#newpsstyle}.
	 * @param ctx the parse tree
	 */
	void exitNewpsstyle(PSTParser.NewpsstyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pscustom}.
	 * @param ctx the parse tree
	 */
	void enterPscustom(PSTParser.PscustomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pscustom}.
	 * @param ctx the parse tree
	 */
	void exitPscustom(PSTParser.PscustomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#definecolor}.
	 * @param ctx the parse tree
	 */
	void enterDefinecolor(PSTParser.DefinecolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#definecolor}.
	 * @param ctx the parse tree
	 */
	void exitDefinecolor(PSTParser.DefinecolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#includegraphics}.
	 * @param ctx the parse tree
	 */
	void enterIncludegraphics(PSTParser.IncludegraphicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#includegraphics}.
	 * @param ctx the parse tree
	 */
	void exitIncludegraphics(PSTParser.IncludegraphicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pspicturecmd}.
	 * @param ctx the parse tree
	 */
	void enterPspicturecmd(PSTParser.PspicturecmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pspicturecmd}.
	 * @param ctx the parse tree
	 */
	void exitPspicturecmd(PSTParser.PspicturecmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#pspictureBlock}.
	 * @param ctx the parse tree
	 */
	void enterPspictureBlock(PSTParser.PspictureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#pspictureBlock}.
	 * @param ctx the parse tree
	 */
	void exitPspictureBlock(PSTParser.PspictureBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#centerBlock}.
	 * @param ctx the parse tree
	 */
	void enterCenterBlock(PSTParser.CenterBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#centerBlock}.
	 * @param ctx the parse tree
	 */
	void exitCenterBlock(PSTParser.CenterBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#psset}.
	 * @param ctx the parse tree
	 */
	void enterPsset(PSTParser.PssetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#psset}.
	 * @param ctx the parse tree
	 */
	void exitPsset(PSTParser.PssetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramBlock}.
	 * @param ctx the parse tree
	 */
	void enterParamBlock(PSTParser.ParamBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramBlock}.
	 * @param ctx the parse tree
	 */
	void exitParamBlock(PSTParser.ParamBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#bracketValueDim}.
	 * @param ctx the parse tree
	 */
	void enterBracketValueDim(PSTParser.BracketValueDimContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#bracketValueDim}.
	 * @param ctx the parse tree
	 */
	void exitBracketValueDim(PSTParser.BracketValueDimContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#valueDim}.
	 * @param ctx the parse tree
	 */
	void enterValueDim(PSTParser.ValueDimContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#valueDim}.
	 * @param ctx the parse tree
	 */
	void exitValueDim(PSTParser.ValueDimContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramSetting}.
	 * @param ctx the parse tree
	 */
	void enterParamSetting(PSTParser.ParamSettingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramSetting}.
	 * @param ctx the parse tree
	 */
	void exitParamSetting(PSTParser.ParamSettingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#unknownParamSetting}.
	 * @param ctx the parse tree
	 */
	void enterUnknownParamSetting(PSTParser.UnknownParamSettingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#unknownParamSetting}.
	 * @param ctx the parse tree
	 */
	void exitUnknownParamSetting(PSTParser.UnknownParamSettingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramArrow}.
	 * @param ctx the parse tree
	 */
	void enterParamArrow(PSTParser.ParamArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramArrow}.
	 * @param ctx the parse tree
	 */
	void exitParamArrow(PSTParser.ParamArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramArrowscale}.
	 * @param ctx the parse tree
	 */
	void enterParamArrowscale(PSTParser.ParamArrowscaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramArrowscale}.
	 * @param ctx the parse tree
	 */
	void exitParamArrowscale(PSTParser.ParamArrowscaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramRbracketlength}.
	 * @param ctx the parse tree
	 */
	void enterParamRbracketlength(PSTParser.ParamRbracketlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramRbracketlength}.
	 * @param ctx the parse tree
	 */
	void exitParamRbracketlength(PSTParser.ParamRbracketlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramBracketlength}.
	 * @param ctx the parse tree
	 */
	void enterParamBracketlength(PSTParser.ParamBracketlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramBracketlength}.
	 * @param ctx the parse tree
	 */
	void exitParamBracketlength(PSTParser.ParamBracketlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramArrowinset}.
	 * @param ctx the parse tree
	 */
	void enterParamArrowinset(PSTParser.ParamArrowinsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramArrowinset}.
	 * @param ctx the parse tree
	 */
	void exitParamArrowinset(PSTParser.ParamArrowinsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramArrowlength}.
	 * @param ctx the parse tree
	 */
	void enterParamArrowlength(PSTParser.ParamArrowlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramArrowlength}.
	 * @param ctx the parse tree
	 */
	void exitParamArrowlength(PSTParser.ParamArrowlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramtbarsize}.
	 * @param ctx the parse tree
	 */
	void enterParamtbarsize(PSTParser.ParamtbarsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramtbarsize}.
	 * @param ctx the parse tree
	 */
	void exitParamtbarsize(PSTParser.ParamtbarsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramarrowsize}.
	 * @param ctx the parse tree
	 */
	void enterParamarrowsize(PSTParser.ParamarrowsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramarrowsize}.
	 * @param ctx the parse tree
	 */
	void exitParamarrowsize(PSTParser.ParamarrowsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramunit}.
	 * @param ctx the parse tree
	 */
	void enterParamunit(PSTParser.ParamunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramunit}.
	 * @param ctx the parse tree
	 */
	void exitParamunit(PSTParser.ParamunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramxunit}.
	 * @param ctx the parse tree
	 */
	void enterParamxunit(PSTParser.ParamxunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramxunit}.
	 * @param ctx the parse tree
	 */
	void exitParamxunit(PSTParser.ParamxunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramyunit}.
	 * @param ctx the parse tree
	 */
	void enterParamyunit(PSTParser.ParamyunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramyunit}.
	 * @param ctx the parse tree
	 */
	void exitParamyunit(PSTParser.ParamyunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramaddfillstyle}.
	 * @param ctx the parse tree
	 */
	void enterParamaddfillstyle(PSTParser.ParamaddfillstyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramaddfillstyle}.
	 * @param ctx the parse tree
	 */
	void exitParamaddfillstyle(PSTParser.ParamaddfillstyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramborder}.
	 * @param ctx the parse tree
	 */
	void enterParamborder(PSTParser.ParamborderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramborder}.
	 * @param ctx the parse tree
	 */
	void exitParamborder(PSTParser.ParamborderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdotsep}.
	 * @param ctx the parse tree
	 */
	void enterParamdotsep(PSTParser.ParamdotsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdotsep}.
	 * @param ctx the parse tree
	 */
	void exitParamdotsep(PSTParser.ParamdotsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdash}.
	 * @param ctx the parse tree
	 */
	void enterParamdash(PSTParser.ParamdashContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdash}.
	 * @param ctx the parse tree
	 */
	void exitParamdash(PSTParser.ParamdashContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramframearc}.
	 * @param ctx the parse tree
	 */
	void enterParamframearc(PSTParser.ParamframearcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramframearc}.
	 * @param ctx the parse tree
	 */
	void exitParamframearc(PSTParser.ParamframearcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramorigin}.
	 * @param ctx the parse tree
	 */
	void enterParamorigin(PSTParser.ParamoriginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramorigin}.
	 * @param ctx the parse tree
	 */
	void exitParamorigin(PSTParser.ParamoriginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramswapaxes}.
	 * @param ctx the parse tree
	 */
	void enterParamswapaxes(PSTParser.ParamswapaxesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramswapaxes}.
	 * @param ctx the parse tree
	 */
	void exitParamswapaxes(PSTParser.ParamswapaxesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramlinestyle}.
	 * @param ctx the parse tree
	 */
	void enterParamlinestyle(PSTParser.ParamlinestyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramlinestyle}.
	 * @param ctx the parse tree
	 */
	void exitParamlinestyle(PSTParser.ParamlinestyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#parambordercolor}.
	 * @param ctx the parse tree
	 */
	void enterParambordercolor(PSTParser.ParambordercolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#parambordercolor}.
	 * @param ctx the parse tree
	 */
	void exitParambordercolor(PSTParser.ParambordercolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdoubleline}.
	 * @param ctx the parse tree
	 */
	void enterParamdoubleline(PSTParser.ParamdoublelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdoubleline}.
	 * @param ctx the parse tree
	 */
	void exitParamdoubleline(PSTParser.ParamdoublelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdoublesep}.
	 * @param ctx the parse tree
	 */
	void enterParamdoublesep(PSTParser.ParamdoublesepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdoublesep}.
	 * @param ctx the parse tree
	 */
	void exitParamdoublesep(PSTParser.ParamdoublesepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdoublecolor}.
	 * @param ctx the parse tree
	 */
	void enterParamdoublecolor(PSTParser.ParamdoublecolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdoublecolor}.
	 * @param ctx the parse tree
	 */
	void exitParamdoublecolor(PSTParser.ParamdoublecolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramshadow}.
	 * @param ctx the parse tree
	 */
	void enterParamshadow(PSTParser.ParamshadowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramshadow}.
	 * @param ctx the parse tree
	 */
	void exitParamshadow(PSTParser.ParamshadowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramshadowsize}.
	 * @param ctx the parse tree
	 */
	void enterParamshadowsize(PSTParser.ParamshadowsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramshadowsize}.
	 * @param ctx the parse tree
	 */
	void exitParamshadowsize(PSTParser.ParamshadowsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramshadowangle}.
	 * @param ctx the parse tree
	 */
	void enterParamshadowangle(PSTParser.ParamshadowangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramshadowangle}.
	 * @param ctx the parse tree
	 */
	void exitParamshadowangle(PSTParser.ParamshadowangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramshadowcolor}.
	 * @param ctx the parse tree
	 */
	void enterParamshadowcolor(PSTParser.ParamshadowcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramshadowcolor}.
	 * @param ctx the parse tree
	 */
	void exitParamshadowcolor(PSTParser.ParamshadowcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdimen}.
	 * @param ctx the parse tree
	 */
	void enterParamdimen(PSTParser.ParamdimenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdimen}.
	 * @param ctx the parse tree
	 */
	void exitParamdimen(PSTParser.ParamdimenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramfillstyle}.
	 * @param ctx the parse tree
	 */
	void enterParamfillstyle(PSTParser.ParamfillstyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramfillstyle}.
	 * @param ctx the parse tree
	 */
	void exitParamfillstyle(PSTParser.ParamfillstyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramfillcolor}.
	 * @param ctx the parse tree
	 */
	void enterParamfillcolor(PSTParser.ParamfillcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramfillcolor}.
	 * @param ctx the parse tree
	 */
	void exitParamfillcolor(PSTParser.ParamfillcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramhatchwidth}.
	 * @param ctx the parse tree
	 */
	void enterParamhatchwidth(PSTParser.ParamhatchwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramhatchwidth}.
	 * @param ctx the parse tree
	 */
	void exitParamhatchwidth(PSTParser.ParamhatchwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramhatchsep}.
	 * @param ctx the parse tree
	 */
	void enterParamhatchsep(PSTParser.ParamhatchsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramhatchsep}.
	 * @param ctx the parse tree
	 */
	void exitParamhatchsep(PSTParser.ParamhatchsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramhatchcolor}.
	 * @param ctx the parse tree
	 */
	void enterParamhatchcolor(PSTParser.ParamhatchcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramhatchcolor}.
	 * @param ctx the parse tree
	 */
	void exitParamhatchcolor(PSTParser.ParamhatchcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramhatchangle}.
	 * @param ctx the parse tree
	 */
	void enterParamhatchangle(PSTParser.ParamhatchangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramhatchangle}.
	 * @param ctx the parse tree
	 */
	void exitParamhatchangle(PSTParser.ParamhatchangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramliftpen}.
	 * @param ctx the parse tree
	 */
	void enterParamliftpen(PSTParser.ParamliftpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramliftpen}.
	 * @param ctx the parse tree
	 */
	void exitParamliftpen(PSTParser.ParamliftpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramlabelsep}.
	 * @param ctx the parse tree
	 */
	void enterParamlabelsep(PSTParser.ParamlabelsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramlabelsep}.
	 * @param ctx the parse tree
	 */
	void exitParamlabelsep(PSTParser.ParamlabelsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramlabels}.
	 * @param ctx the parse tree
	 */
	void enterParamlabels(PSTParser.ParamlabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramlabels}.
	 * @param ctx the parse tree
	 */
	void exitParamlabels(PSTParser.ParamlabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramticks}.
	 * @param ctx the parse tree
	 */
	void enterParamticks(PSTParser.ParamticksContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramticks}.
	 * @param ctx the parse tree
	 */
	void exitParamticks(PSTParser.ParamticksContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramtickstyle}.
	 * @param ctx the parse tree
	 */
	void enterParamtickstyle(PSTParser.ParamtickstyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramtickstyle}.
	 * @param ctx the parse tree
	 */
	void exitParamtickstyle(PSTParser.ParamtickstyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramshoworigin}.
	 * @param ctx the parse tree
	 */
	void enterParamshoworigin(PSTParser.ParamshoworiginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramshoworigin}.
	 * @param ctx the parse tree
	 */
	void exitParamshoworigin(PSTParser.ParamshoworiginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramticksize}.
	 * @param ctx the parse tree
	 */
	void enterParamticksize(PSTParser.ParamticksizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramticksize}.
	 * @param ctx the parse tree
	 */
	void exitParamticksize(PSTParser.ParamticksizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramaxesstyle}.
	 * @param ctx the parse tree
	 */
	void enterParamaxesstyle(PSTParser.ParamaxesstyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramaxesstyle}.
	 * @param ctx the parse tree
	 */
	void exitParamaxesstyle(PSTParser.ParamaxesstyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramframesep}.
	 * @param ctx the parse tree
	 */
	void enterParamframesep(PSTParser.ParamframesepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramframesep}.
	 * @param ctx the parse tree
	 */
	void exitParamframesep(PSTParser.ParamframesepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramboxsep}.
	 * @param ctx the parse tree
	 */
	void enterParamboxsep(PSTParser.ParamboxsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramboxsep}.
	 * @param ctx the parse tree
	 */
	void exitParamboxsep(PSTParser.ParamboxsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramrunit}.
	 * @param ctx the parse tree
	 */
	void enterParamrunit(PSTParser.ParamrunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramrunit}.
	 * @param ctx the parse tree
	 */
	void exitParamrunit(PSTParser.ParamrunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramlinewidth}.
	 * @param ctx the parse tree
	 */
	void enterParamlinewidth(PSTParser.ParamlinewidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramlinewidth}.
	 * @param ctx the parse tree
	 */
	void exitParamlinewidth(PSTParser.ParamlinewidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramlinecolor}.
	 * @param ctx the parse tree
	 */
	void enterParamlinecolor(PSTParser.ParamlinecolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramlinecolor}.
	 * @param ctx the parse tree
	 */
	void exitParamlinecolor(PSTParser.ParamlinecolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramshowpoints}.
	 * @param ctx the parse tree
	 */
	void enterParamshowpoints(PSTParser.ParamshowpointsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramshowpoints}.
	 * @param ctx the parse tree
	 */
	void exitParamshowpoints(PSTParser.ParamshowpointsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramlinearc}.
	 * @param ctx the parse tree
	 */
	void enterParamlinearc(PSTParser.ParamlinearcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramlinearc}.
	 * @param ctx the parse tree
	 */
	void exitParamlinearc(PSTParser.ParamlinearcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramcornersize}.
	 * @param ctx the parse tree
	 */
	void enterParamcornersize(PSTParser.ParamcornersizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramcornersize}.
	 * @param ctx the parse tree
	 */
	void exitParamcornersize(PSTParser.ParamcornersizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramarcsepA}.
	 * @param ctx the parse tree
	 */
	void enterParamarcsepA(PSTParser.ParamarcsepAContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramarcsepA}.
	 * @param ctx the parse tree
	 */
	void exitParamarcsepA(PSTParser.ParamarcsepAContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramarcsepB}.
	 * @param ctx the parse tree
	 */
	void enterParamarcsepB(PSTParser.ParamarcsepBContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramarcsepB}.
	 * @param ctx the parse tree
	 */
	void exitParamarcsepB(PSTParser.ParamarcsepBContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramarcsep}.
	 * @param ctx the parse tree
	 */
	void enterParamarcsep(PSTParser.ParamarcsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramarcsep}.
	 * @param ctx the parse tree
	 */
	void exitParamarcsep(PSTParser.ParamarcsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramcurvature}.
	 * @param ctx the parse tree
	 */
	void enterParamcurvature(PSTParser.ParamcurvatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramcurvature}.
	 * @param ctx the parse tree
	 */
	void exitParamcurvature(PSTParser.ParamcurvatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdotstyle}.
	 * @param ctx the parse tree
	 */
	void enterParamdotstyle(PSTParser.ParamdotstyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdotstyle}.
	 * @param ctx the parse tree
	 */
	void exitParamdotstyle(PSTParser.ParamdotstyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdotscale}.
	 * @param ctx the parse tree
	 */
	void enterParamdotscale(PSTParser.ParamdotscaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdotscale}.
	 * @param ctx the parse tree
	 */
	void exitParamdotscale(PSTParser.ParamdotscaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdotdotangle}.
	 * @param ctx the parse tree
	 */
	void enterParamdotdotangle(PSTParser.ParamdotdotangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdotdotangle}.
	 * @param ctx the parse tree
	 */
	void exitParamdotdotangle(PSTParser.ParamdotdotangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgridwidth}.
	 * @param ctx the parse tree
	 */
	void enterParamgridwidth(PSTParser.ParamgridwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgridwidth}.
	 * @param ctx the parse tree
	 */
	void exitParamgridwidth(PSTParser.ParamgridwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgridcolor}.
	 * @param ctx the parse tree
	 */
	void enterParamgridcolor(PSTParser.ParamgridcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgridcolor}.
	 * @param ctx the parse tree
	 */
	void exitParamgridcolor(PSTParser.ParamgridcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgriddots}.
	 * @param ctx the parse tree
	 */
	void enterParamgriddots(PSTParser.ParamgriddotsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgriddots}.
	 * @param ctx the parse tree
	 */
	void exitParamgriddots(PSTParser.ParamgriddotsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgridlabels}.
	 * @param ctx the parse tree
	 */
	void enterParamgridlabels(PSTParser.ParamgridlabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgridlabels}.
	 * @param ctx the parse tree
	 */
	void exitParamgridlabels(PSTParser.ParamgridlabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgridlabelcolor}.
	 * @param ctx the parse tree
	 */
	void enterParamgridlabelcolor(PSTParser.ParamgridlabelcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgridlabelcolor}.
	 * @param ctx the parse tree
	 */
	void exitParamgridlabelcolor(PSTParser.ParamgridlabelcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramsubgriddiv}.
	 * @param ctx the parse tree
	 */
	void enterParamsubgriddiv(PSTParser.ParamsubgriddivContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramsubgriddiv}.
	 * @param ctx the parse tree
	 */
	void exitParamsubgriddiv(PSTParser.ParamsubgriddivContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramsubgridwidth}.
	 * @param ctx the parse tree
	 */
	void enterParamsubgridwidth(PSTParser.ParamsubgridwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramsubgridwidth}.
	 * @param ctx the parse tree
	 */
	void exitParamsubgridwidth(PSTParser.ParamsubgridwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramsubgridcolor}.
	 * @param ctx the parse tree
	 */
	void enterParamsubgridcolor(PSTParser.ParamsubgridcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramsubgridcolor}.
	 * @param ctx the parse tree
	 */
	void exitParamsubgridcolor(PSTParser.ParamsubgridcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramsubgriddots}.
	 * @param ctx the parse tree
	 */
	void enterParamsubgriddots(PSTParser.ParamsubgriddotsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramsubgriddots}.
	 * @param ctx the parse tree
	 */
	void exitParamsubgriddots(PSTParser.ParamsubgriddotsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramplotstyle}.
	 * @param ctx the parse tree
	 */
	void enterParamplotstyle(PSTParser.ParamplotstyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramplotstyle}.
	 * @param ctx the parse tree
	 */
	void exitParamplotstyle(PSTParser.ParamplotstyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramplotpoints}.
	 * @param ctx the parse tree
	 */
	void enterParamplotpoints(PSTParser.ParamplotpointsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramplotpoints}.
	 * @param ctx the parse tree
	 */
	void exitParamplotpoints(PSTParser.ParamplotpointsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgradbegin}.
	 * @param ctx the parse tree
	 */
	void enterParamgradbegin(PSTParser.ParamgradbeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgradbegin}.
	 * @param ctx the parse tree
	 */
	void exitParamgradbegin(PSTParser.ParamgradbeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgradend}.
	 * @param ctx the parse tree
	 */
	void enterParamgradend(PSTParser.ParamgradendContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgradend}.
	 * @param ctx the parse tree
	 */
	void exitParamgradend(PSTParser.ParamgradendContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgradlines}.
	 * @param ctx the parse tree
	 */
	void enterParamgradlines(PSTParser.ParamgradlinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgradlines}.
	 * @param ctx the parse tree
	 */
	void exitParamgradlines(PSTParser.ParamgradlinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgradmidpoint}.
	 * @param ctx the parse tree
	 */
	void enterParamgradmidpoint(PSTParser.ParamgradmidpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgradmidpoint}.
	 * @param ctx the parse tree
	 */
	void exitParamgradmidpoint(PSTParser.ParamgradmidpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgradangle}.
	 * @param ctx the parse tree
	 */
	void enterParamgradangle(PSTParser.ParamgradangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgradangle}.
	 * @param ctx the parse tree
	 */
	void exitParamgradangle(PSTParser.ParamgradangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdotsize}.
	 * @param ctx the parse tree
	 */
	void enterParamdotsize(PSTParser.ParamdotsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdotsize}.
	 * @param ctx the parse tree
	 */
	void exitParamdotsize(PSTParser.ParamdotsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramgangle}.
	 * @param ctx the parse tree
	 */
	void enterParamgangle(PSTParser.ParamgangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramgangle}.
	 * @param ctx the parse tree
	 */
	void exitParamgangle(PSTParser.ParamgangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramstrokeopacity}.
	 * @param ctx the parse tree
	 */
	void enterParamstrokeopacity(PSTParser.ParamstrokeopacityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramstrokeopacity}.
	 * @param ctx the parse tree
	 */
	void exitParamstrokeopacity(PSTParser.ParamstrokeopacityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramopacity}.
	 * @param ctx the parse tree
	 */
	void enterParamopacity(PSTParser.ParamopacityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramopacity}.
	 * @param ctx the parse tree
	 */
	void exitParamopacity(PSTParser.ParamopacityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdx}.
	 * @param ctx the parse tree
	 */
	void enterParamdx(PSTParser.ParamdxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdx}.
	 * @param ctx the parse tree
	 */
	void exitParamdx(PSTParser.ParamdxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramdy}.
	 * @param ctx the parse tree
	 */
	void enterParamdy(PSTParser.ParamdyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramdy}.
	 * @param ctx the parse tree
	 */
	void exitParamdy(PSTParser.ParamdyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramDx}.
	 * @param ctx the parse tree
	 */
	void enterParamDx(PSTParser.ParamDxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramDx}.
	 * @param ctx the parse tree
	 */
	void exitParamDx(PSTParser.ParamDxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramDy}.
	 * @param ctx the parse tree
	 */
	void enterParamDy(PSTParser.ParamDyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramDy}.
	 * @param ctx the parse tree
	 */
	void exitParamDy(PSTParser.ParamDyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramOx}.
	 * @param ctx the parse tree
	 */
	void enterParamOx(PSTParser.ParamOxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramOx}.
	 * @param ctx the parse tree
	 */
	void exitParamOx(PSTParser.ParamOxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#paramOy}.
	 * @param ctx the parse tree
	 */
	void enterParamOy(PSTParser.ParamOyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#paramOy}.
	 * @param ctx the parse tree
	 */
	void exitParamOy(PSTParser.ParamOyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#parampolarplot}.
	 * @param ctx the parse tree
	 */
	void enterParampolarplot(PSTParser.ParampolarplotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#parampolarplot}.
	 * @param ctx the parse tree
	 */
	void exitParampolarplot(PSTParser.ParampolarplotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#arrowBlock}.
	 * @param ctx the parse tree
	 */
	void enterArrowBlock(PSTParser.ArrowBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#arrowBlock}.
	 * @param ctx the parse tree
	 */
	void exitArrowBlock(PSTParser.ArrowBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#arrowvalue}.
	 * @param ctx the parse tree
	 */
	void enterArrowvalue(PSTParser.ArrowvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#arrowvalue}.
	 * @param ctx the parse tree
	 */
	void exitArrowvalue(PSTParser.ArrowvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#coord}.
	 * @param ctx the parse tree
	 */
	void enterCoord(PSTParser.CoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#coord}.
	 * @param ctx the parse tree
	 */
	void exitCoord(PSTParser.CoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(PSTParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(PSTParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(PSTParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(PSTParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#fillstyle}.
	 * @param ctx the parse tree
	 */
	void enterFillstyle(PSTParser.FillstyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#fillstyle}.
	 * @param ctx the parse tree
	 */
	void exitFillstyle(PSTParser.FillstyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#put}.
	 * @param ctx the parse tree
	 */
	void enterPut(PSTParser.PutContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#put}.
	 * @param ctx the parse tree
	 */
	void exitPut(PSTParser.PutContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#textpos}.
	 * @param ctx the parse tree
	 */
	void enterTextpos(PSTParser.TextposContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#textpos}.
	 * @param ctx the parse tree
	 */
	void exitTextpos(PSTParser.TextposContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#arrow}.
	 * @param ctx the parse tree
	 */
	void enterArrow(PSTParser.ArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#arrow}.
	 * @param ctx the parse tree
	 */
	void exitArrow(PSTParser.ArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(PSTParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(PSTParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSTParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(PSTParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSTParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(PSTParser.BooleanvalueContext ctx);
}