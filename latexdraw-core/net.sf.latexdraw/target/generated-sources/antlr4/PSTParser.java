// Generated from PST.g4 by ANTLR 4.7.1

package net.sf.latexdraw.parsers.pst;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, T__171=172, T__172=173, 
		T__173=174, T__174=175, T__175=176, T__176=177, T__177=178, T__178=179, 
		T__179=180, T__180=181, T__181=182, T__182=183, T__183=184, T__184=185, 
		T__185=186, T__186=187, T__187=188, T__188=189, T__189=190, T__190=191, 
		T__191=192, T__192=193, T__193=194, T__194=195, T__195=196, T__196=197, 
		T__197=198, T__198=199, T__199=200, T__200=201, T__201=202, T__202=203, 
		T__203=204, T__204=205, T__205=206, T__206=207, T__207=208, T__208=209, 
		T__209=210, T__210=211, T__211=212, T__212=213, T__213=214, T__214=215, 
		T__215=216, T__216=217, T__217=218, T__218=219, T__219=220, T__220=221, 
		T__221=222, T__222=223, T__223=224, T__224=225, T__225=226, T__226=227, 
		T__227=228, T__228=229, T__229=230, T__230=231, T__231=232, T__232=233, 
		T__233=234, T__234=235, T__235=236, T__236=237, T__237=238, T__238=239, 
		T__239=240, T__240=241, T__241=242, T__242=243, T__243=244, T__244=245, 
		T__245=246, T__246=247, T__247=248, T__248=249, T__249=250, T__250=251, 
		T__251=252, T__252=253, T__253=254, T__254=255, T__255=256, T__256=257, 
		T__257=258, T__258=259, T__259=260, T__260=261, T__261=262, T__262=263, 
		T__263=264, T__264=265, T__265=266, T__266=267, T__267=268, T__268=269, 
		T__269=270, T__270=271, T__271=272, T__272=273, T__273=274, T__274=275, 
		T__275=276, T__276=277, T__277=278, T__278=279, HEXA=280, DOUBLEMATHTEXT=281, 
		MATHTEXTPAR=282, MATHTEXTBRACK=283, MATHTEXT=284, LATEXCMD=285, WORD=286, 
		IDENT=287, NUMBER=288, COMMENT=289, PUNCTUATION=290, BRACE_OPEN=291, BRACE_CLOSE=292, 
		MATHMODE=293, WHITESPACE=294;
	public static final int
		RULE_pstCode = 0, RULE_pstcustomBlock = 1, RULE_pstBlock = 2, RULE_psellipse = 3, 
		RULE_psframe = 4, RULE_psdiamond = 5, RULE_pstriangle = 6, RULE_psline = 7, 
		RULE_psqline = 8, RULE_pscircle = 9, RULE_psqdisk = 10, RULE_pspolygon = 11, 
		RULE_psbezier = 12, RULE_psdot = 13, RULE_psdots = 14, RULE_psaxes = 15, 
		RULE_psgrid = 16, RULE_rput = 17, RULE_scalebox = 18, RULE_psscalebox = 19, 
		RULE_pswedge = 20, RULE_psellipticarc = 21, RULE_psellipticarcn = 22, 
		RULE_psarc = 23, RULE_psarcn = 24, RULE_parabola = 25, RULE_pscurve = 26, 
		RULE_psecurve = 27, RULE_psccurve = 28, RULE_rlineto = 29, RULE_movepath = 30, 
		RULE_closedshadow = 31, RULE_openshadow = 32, RULE_mrestore = 33, RULE_msave = 34, 
		RULE_swapaxes = 35, RULE_rotate = 36, RULE_scale = 37, RULE_translate = 38, 
		RULE_fill = 39, RULE_stroke = 40, RULE_grestore = 41, RULE_gsave = 42, 
		RULE_rcurveto = 43, RULE_closepath = 44, RULE_curveto = 45, RULE_lineto = 46, 
		RULE_moveto = 47, RULE_newpath = 48, RULE_psframebox = 49, RULE_psdblframebox = 50, 
		RULE_psshadowbox = 51, RULE_pscirclebox = 52, RULE_psovalbox = 53, RULE_psdiabox = 54, 
		RULE_pstribox = 55, RULE_textcolor = 56, RULE_color = 57, RULE_unknowncmds = 58, 
		RULE_readdata = 59, RULE_savedata = 60, RULE_parametricplot = 61, RULE_psplot = 62, 
		RULE_listplot = 63, RULE_dataplot = 64, RULE_fileplot = 65, RULE_newpsobject = 66, 
		RULE_newpsstyle = 67, RULE_pscustom = 68, RULE_definecolor = 69, RULE_includegraphics = 70, 
		RULE_pspicturecmd = 71, RULE_pspictureBlock = 72, RULE_centerBlock = 73, 
		RULE_psset = 74, RULE_paramBlock = 75, RULE_bracketValueDim = 76, RULE_valueDim = 77, 
		RULE_paramSetting = 78, RULE_unknownParamSetting = 79, RULE_paramArrow = 80, 
		RULE_paramArrowscale = 81, RULE_paramRbracketlength = 82, RULE_paramBracketlength = 83, 
		RULE_paramArrowinset = 84, RULE_paramArrowlength = 85, RULE_paramtbarsize = 86, 
		RULE_paramarrowsize = 87, RULE_paramunit = 88, RULE_paramxunit = 89, RULE_paramyunit = 90, 
		RULE_paramaddfillstyle = 91, RULE_paramborder = 92, RULE_paramdotsep = 93, 
		RULE_paramdash = 94, RULE_paramframearc = 95, RULE_paramorigin = 96, RULE_paramswapaxes = 97, 
		RULE_paramlinestyle = 98, RULE_parambordercolor = 99, RULE_paramdoubleline = 100, 
		RULE_paramdoublesep = 101, RULE_paramdoublecolor = 102, RULE_paramshadow = 103, 
		RULE_paramshadowsize = 104, RULE_paramshadowangle = 105, RULE_paramshadowcolor = 106, 
		RULE_paramdimen = 107, RULE_paramfillstyle = 108, RULE_paramfillcolor = 109, 
		RULE_paramhatchwidth = 110, RULE_paramhatchsep = 111, RULE_paramhatchcolor = 112, 
		RULE_paramhatchangle = 113, RULE_paramliftpen = 114, RULE_paramlabelsep = 115, 
		RULE_paramlabels = 116, RULE_paramticks = 117, RULE_paramtickstyle = 118, 
		RULE_paramshoworigin = 119, RULE_paramticksize = 120, RULE_paramaxesstyle = 121, 
		RULE_paramframesep = 122, RULE_paramboxsep = 123, RULE_paramrunit = 124, 
		RULE_paramlinewidth = 125, RULE_paramlinecolor = 126, RULE_paramshowpoints = 127, 
		RULE_paramlinearc = 128, RULE_paramcornersize = 129, RULE_paramarcsepA = 130, 
		RULE_paramarcsepB = 131, RULE_paramarcsep = 132, RULE_paramcurvature = 133, 
		RULE_paramdotstyle = 134, RULE_paramdotscale = 135, RULE_paramdotdotangle = 136, 
		RULE_paramgridwidth = 137, RULE_paramgridcolor = 138, RULE_paramgriddots = 139, 
		RULE_paramgridlabels = 140, RULE_paramgridlabelcolor = 141, RULE_paramsubgriddiv = 142, 
		RULE_paramsubgridwidth = 143, RULE_paramsubgridcolor = 144, RULE_paramsubgriddots = 145, 
		RULE_paramplotstyle = 146, RULE_paramplotpoints = 147, RULE_paramgradbegin = 148, 
		RULE_paramgradend = 149, RULE_paramgradlines = 150, RULE_paramgradmidpoint = 151, 
		RULE_paramgradangle = 152, RULE_paramdotsize = 153, RULE_paramgangle = 154, 
		RULE_paramstrokeopacity = 155, RULE_paramopacity = 156, RULE_paramdx = 157, 
		RULE_paramdy = 158, RULE_paramDx = 159, RULE_paramDy = 160, RULE_paramOx = 161, 
		RULE_paramOy = 162, RULE_parampolarplot = 163, RULE_arrowBlock = 164, 
		RULE_arrowvalue = 165, RULE_coord = 166, RULE_text = 167, RULE_show = 168, 
		RULE_fillstyle = 169, RULE_put = 170, RULE_textpos = 171, RULE_arrow = 172, 
		RULE_unit = 173, RULE_booleanvalue = 174;
	public static final String[] ruleNames = {
		"pstCode", "pstcustomBlock", "pstBlock", "psellipse", "psframe", "psdiamond", 
		"pstriangle", "psline", "psqline", "pscircle", "psqdisk", "pspolygon", 
		"psbezier", "psdot", "psdots", "psaxes", "psgrid", "rput", "scalebox", 
		"psscalebox", "pswedge", "psellipticarc", "psellipticarcn", "psarc", "psarcn", 
		"parabola", "pscurve", "psecurve", "psccurve", "rlineto", "movepath", 
		"closedshadow", "openshadow", "mrestore", "msave", "swapaxes", "rotate", 
		"scale", "translate", "fill", "stroke", "grestore", "gsave", "rcurveto", 
		"closepath", "curveto", "lineto", "moveto", "newpath", "psframebox", "psdblframebox", 
		"psshadowbox", "pscirclebox", "psovalbox", "psdiabox", "pstribox", "textcolor", 
		"color", "unknowncmds", "readdata", "savedata", "parametricplot", "psplot", 
		"listplot", "dataplot", "fileplot", "newpsobject", "newpsstyle", "pscustom", 
		"definecolor", "includegraphics", "pspicturecmd", "pspictureBlock", "centerBlock", 
		"psset", "paramBlock", "bracketValueDim", "valueDim", "paramSetting", 
		"unknownParamSetting", "paramArrow", "paramArrowscale", "paramRbracketlength", 
		"paramBracketlength", "paramArrowinset", "paramArrowlength", "paramtbarsize", 
		"paramarrowsize", "paramunit", "paramxunit", "paramyunit", "paramaddfillstyle", 
		"paramborder", "paramdotsep", "paramdash", "paramframearc", "paramorigin", 
		"paramswapaxes", "paramlinestyle", "parambordercolor", "paramdoubleline", 
		"paramdoublesep", "paramdoublecolor", "paramshadow", "paramshadowsize", 
		"paramshadowangle", "paramshadowcolor", "paramdimen", "paramfillstyle", 
		"paramfillcolor", "paramhatchwidth", "paramhatchsep", "paramhatchcolor", 
		"paramhatchangle", "paramliftpen", "paramlabelsep", "paramlabels", "paramticks", 
		"paramtickstyle", "paramshoworigin", "paramticksize", "paramaxesstyle", 
		"paramframesep", "paramboxsep", "paramrunit", "paramlinewidth", "paramlinecolor", 
		"paramshowpoints", "paramlinearc", "paramcornersize", "paramarcsepA", 
		"paramarcsepB", "paramarcsep", "paramcurvature", "paramdotstyle", "paramdotscale", 
		"paramdotdotangle", "paramgridwidth", "paramgridcolor", "paramgriddots", 
		"paramgridlabels", "paramgridlabelcolor", "paramsubgriddiv", "paramsubgridwidth", 
		"paramsubgridcolor", "paramsubgriddots", "paramplotstyle", "paramplotpoints", 
		"paramgradbegin", "paramgradend", "paramgradlines", "paramgradmidpoint", 
		"paramgradangle", "paramdotsize", "paramgangle", "paramstrokeopacity", 
		"paramopacity", "paramdx", "paramdy", "paramDx", "paramDy", "paramOx", 
		"paramOy", "parampolarplot", "arrowBlock", "arrowvalue", "coord", "text", 
		"show", "fillstyle", "put", "textpos", "arrow", "unit", "booleanvalue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\psellipse*'", "'\\psellipse'", "'\\psframe*'", "'\\psframe'", 
		"'\\psdiamond*'", "'\\psdiamond'", "'\\pstriangle*'", "'\\pstriangle'", 
		"'\\psline*'", "'\\psline'", "'\\qline'", "'\\pscircle*'", "'\\pscircle'", 
		"'\\qdisk'", "'\\pspolygon*'", "'\\pspolygon'", "'\\psbezier*'", "'\\psbezier'", 
		"'\\psdot*'", "'\\psdot'", "'\\psdots*'", "'\\psdots'", "'\\psaxes'", 
		"'\\psgrid'", "'\\rput*'", "'\\rput'", "'['", "']'", "'*'", "'\\scalebox'", 
		"'\\psscalebox'", "'\\pswedge*'", "'\\pswedge'", "'\\psellipticarc*'", 
		"'\\psellipticarc'", "'\\psellipticarcn*'", "'\\psellipticarcn'", "'\\psarc*'", 
		"'\\psarc'", "'\\psarcn*'", "'\\psarcn'", "'\\parabola*'", "'\\parabola'", 
		"'\\pscurve*'", "'\\pscurve'", "'\\psecurve*'", "'\\psecurve'", "'\\psccurve*'", 
		"'\\psccurve'", "'\\rlineto'", "'\\movepath'", "'\\closedshadow'", "'\\openshadow'", 
		"'\\mrestore'", "'\\msave'", "'\\swapaxes'", "'\\rotate'", "'\\scale'", 
		"'\\translate'", "'\\fill'", "'\\stroke'", "'\\grestore'", "'\\gsave'", 
		"'\\rcurveto'", "'\\closepath'", "'\\curveto'", "'\\lineto'", "'\\moveto'", 
		"'\\newpath'", "'\\psframebox'", "'\\psframebox*'", "'\\psdblframebox'", 
		"'\\psdblframebox*'", "'\\psshadowbox'", "'\\psshadowbox*'", "'\\pscirclebox'", 
		"'\\pscirclebox*'", "'\\psovalbox'", "'\\psovalbox*'", "'\\psdiabox'", 
		"'\\psdiabox*'", "'\\pstribox'", "'\\pstribox*'", "'\\textcolor'", "'\\color'", 
		"'('", "')'", "'\\readdata'", "'/'", "':'", "'\\savedata'", "'\\parametricplot*'", 
		"'\\parametricplot'", "'\\psplot*'", "'\\psplot'", "'\\listplot*'", "'\\listplot'", 
		"'\\newpsobject'", "'\\newpsstyle'", "'\\pscustom*'", "'\\pscustom'", 
		"'\\definecolor'", "','", "'\\includegraphics'", "'\\pspicture'", "'\\endpspicture'", 
		"'\\begin'", "'pspicture*'", "'pspicture'", "'\\end'", "'center'", "'\\psset'", 
		"'='", "'arrows'", "'arrowscale'", "'rbracketlength'", "'bracketlength'", 
		"'arrowinset'", "'arrowlength'", "'tbarsize'", "'arrowsize'", "'unit'", 
		"'xunit'", "'yunit'", "'addfillstyle'", "'border'", "'dotsep'", "'dash'", 
		"'framearc'", "'origin'", "'swapaxes'", "'linestyle'", "'none'", "'solid'", 
		"'dashed'", "'dotted'", "'bordercolor'", "'doubleline'", "'doublesep'", 
		"'doublecolor'", "'shadow'", "'shadowsize'", "'shadowangle'", "'shadowcolor'", 
		"'dimen'", "'outer'", "'inner'", "'middle'", "'fillstyle'", "'fillcolor'", 
		"'hatchwidth'", "'hatchsep'", "'hatchcolor'", "'hatchangle'", "'liftpen'", 
		"'labelsep'", "'labels'", "'ticks'", "'tickstyle'", "'full'", "'top'", 
		"'bottom'", "'showorigin'", "'ticksize'", "'axesstyle'", "'axes'", "'frame'", 
		"'framesep'", "'boxsep'", "'runit'", "'linewidth'", "'linecolor'", "'showpoints'", 
		"'linearc'", "'cornersize'", "'relative'", "'absolute'", "'arcsepA'", 
		"'arcsepB'", "'arcsep'", "'curvature'", "'dotstyle'", "'o'", "'+'", "'triangle'", 
		"'triangle*'", "'square'", "'square*'", "'pentagon'", "'pentagon*'", "'|'", 
		"'otimes'", "'oplus'", "'x'", "'asterisk'", "'diamond*'", "'diamond'", 
		"'dotscale'", "'dotangle'", "'gridwidth'", "'gridcolor'", "'griddots'", 
		"'gridlabels'", "'gridlabelcolor'", "'subgriddiv'", "'subgridwidth'", 
		"'subgridcolor'", "'subgriddots'", "'plotstyle'", "'dots'", "'line'", 
		"'polygon'", "'curve'", "'ecurve'", "'ccurve'", "'plotpoints'", "'gradbegin'", 
		"'gradend'", "'gradlines'", "'gradmidpoint'", "'gradangle'", "'dotsize'", 
		"'gangle'", "'strokeopacity'", "'opacity'", "'dx'", "'dy'", "'Dx'", "'Dy'", 
		"'Ox'", "'Oy'", "'polarplot'", "'-'", "'all'", "'y'", "'gradient'", "'vlines*'", 
		"'vlines'", "'hlines*'", "'hlines'", "'crosshatch*'", "'crosshatch'", 
		"'clines*'", "'clines'", "'U'", "'L'", "'D'", "'R'", "'N'", "'W'", "'S'", 
		"'E'", "'bl'", "'br'", "'b'", "'tl'", "'tr'", "'t'", "'Bl'", "'Br'", "'B'", 
		"'l'", "'r'", "'>'", "'<'", "'**'", "'<<'", "'>>'", "'c'", "'C'", "'cc'", 
		"'|*'", "'oo'", "'cm'", "'mm'", "'pt'", "'in'", "'true'", "'false'", null, 
		null, null, null, null, null, null, null, null, null, null, "'{'", "'}'", 
		"'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "HEXA", "DOUBLEMATHTEXT", "MATHTEXTPAR", "MATHTEXTBRACK", 
		"MATHTEXT", "LATEXCMD", "WORD", "IDENT", "NUMBER", "COMMENT", "PUNCTUATION", 
		"BRACE_OPEN", "BRACE_CLOSE", "MATHMODE", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PST.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PstCodeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public List<PstBlockContext> pstBlock() {
			return getRuleContexts(PstBlockContext.class);
		}
		public PstBlockContext pstBlock(int i) {
			return getRuleContext(PstBlockContext.class,i);
		}
		public List<PssetContext> psset() {
			return getRuleContexts(PssetContext.class);
		}
		public PssetContext psset(int i) {
			return getRuleContext(PssetContext.class,i);
		}
		public List<PspictureBlockContext> pspictureBlock() {
			return getRuleContexts(PspictureBlockContext.class);
		}
		public PspictureBlockContext pspictureBlock(int i) {
			return getRuleContext(PspictureBlockContext.class,i);
		}
		public List<CenterBlockContext> centerBlock() {
			return getRuleContexts(CenterBlockContext.class);
		}
		public CenterBlockContext centerBlock(int i) {
			return getRuleContext(CenterBlockContext.class,i);
		}
		public List<PspicturecmdContext> pspicturecmd() {
			return getRuleContexts(PspicturecmdContext.class);
		}
		public PspicturecmdContext pspicturecmd(int i) {
			return getRuleContext(PspicturecmdContext.class,i);
		}
		public List<PsellipseContext> psellipse() {
			return getRuleContexts(PsellipseContext.class);
		}
		public PsellipseContext psellipse(int i) {
			return getRuleContext(PsellipseContext.class,i);
		}
		public List<PsframeContext> psframe() {
			return getRuleContexts(PsframeContext.class);
		}
		public PsframeContext psframe(int i) {
			return getRuleContext(PsframeContext.class,i);
		}
		public List<PsdiamondContext> psdiamond() {
			return getRuleContexts(PsdiamondContext.class);
		}
		public PsdiamondContext psdiamond(int i) {
			return getRuleContext(PsdiamondContext.class,i);
		}
		public List<PstriangleContext> pstriangle() {
			return getRuleContexts(PstriangleContext.class);
		}
		public PstriangleContext pstriangle(int i) {
			return getRuleContext(PstriangleContext.class,i);
		}
		public List<PslineContext> psline() {
			return getRuleContexts(PslineContext.class);
		}
		public PslineContext psline(int i) {
			return getRuleContext(PslineContext.class,i);
		}
		public List<PsqlineContext> psqline() {
			return getRuleContexts(PsqlineContext.class);
		}
		public PsqlineContext psqline(int i) {
			return getRuleContext(PsqlineContext.class,i);
		}
		public List<PscircleContext> pscircle() {
			return getRuleContexts(PscircleContext.class);
		}
		public PscircleContext pscircle(int i) {
			return getRuleContext(PscircleContext.class,i);
		}
		public List<PsqdiskContext> psqdisk() {
			return getRuleContexts(PsqdiskContext.class);
		}
		public PsqdiskContext psqdisk(int i) {
			return getRuleContext(PsqdiskContext.class,i);
		}
		public List<PspolygonContext> pspolygon() {
			return getRuleContexts(PspolygonContext.class);
		}
		public PspolygonContext pspolygon(int i) {
			return getRuleContext(PspolygonContext.class,i);
		}
		public List<PsbezierContext> psbezier() {
			return getRuleContexts(PsbezierContext.class);
		}
		public PsbezierContext psbezier(int i) {
			return getRuleContext(PsbezierContext.class,i);
		}
		public List<PsdotContext> psdot() {
			return getRuleContexts(PsdotContext.class);
		}
		public PsdotContext psdot(int i) {
			return getRuleContext(PsdotContext.class,i);
		}
		public List<PsdotsContext> psdots() {
			return getRuleContexts(PsdotsContext.class);
		}
		public PsdotsContext psdots(int i) {
			return getRuleContext(PsdotsContext.class,i);
		}
		public List<PsaxesContext> psaxes() {
			return getRuleContexts(PsaxesContext.class);
		}
		public PsaxesContext psaxes(int i) {
			return getRuleContext(PsaxesContext.class,i);
		}
		public List<PsgridContext> psgrid() {
			return getRuleContexts(PsgridContext.class);
		}
		public PsgridContext psgrid(int i) {
			return getRuleContext(PsgridContext.class,i);
		}
		public List<PswedgeContext> pswedge() {
			return getRuleContexts(PswedgeContext.class);
		}
		public PswedgeContext pswedge(int i) {
			return getRuleContext(PswedgeContext.class,i);
		}
		public List<PsellipticarcContext> psellipticarc() {
			return getRuleContexts(PsellipticarcContext.class);
		}
		public PsellipticarcContext psellipticarc(int i) {
			return getRuleContext(PsellipticarcContext.class,i);
		}
		public List<PsellipticarcnContext> psellipticarcn() {
			return getRuleContexts(PsellipticarcnContext.class);
		}
		public PsellipticarcnContext psellipticarcn(int i) {
			return getRuleContext(PsellipticarcnContext.class,i);
		}
		public List<PsarcnContext> psarcn() {
			return getRuleContexts(PsarcnContext.class);
		}
		public PsarcnContext psarcn(int i) {
			return getRuleContext(PsarcnContext.class,i);
		}
		public List<PsarcContext> psarc() {
			return getRuleContexts(PsarcContext.class);
		}
		public PsarcContext psarc(int i) {
			return getRuleContext(PsarcContext.class,i);
		}
		public List<ParabolaContext> parabola() {
			return getRuleContexts(ParabolaContext.class);
		}
		public ParabolaContext parabola(int i) {
			return getRuleContext(ParabolaContext.class,i);
		}
		public List<PscurveContext> pscurve() {
			return getRuleContexts(PscurveContext.class);
		}
		public PscurveContext pscurve(int i) {
			return getRuleContext(PscurveContext.class,i);
		}
		public List<PsecurveContext> psecurve() {
			return getRuleContexts(PsecurveContext.class);
		}
		public PsecurveContext psecurve(int i) {
			return getRuleContext(PsecurveContext.class,i);
		}
		public List<PsccurveContext> psccurve() {
			return getRuleContexts(PsccurveContext.class);
		}
		public PsccurveContext psccurve(int i) {
			return getRuleContext(PsccurveContext.class,i);
		}
		public List<ReaddataContext> readdata() {
			return getRuleContexts(ReaddataContext.class);
		}
		public ReaddataContext readdata(int i) {
			return getRuleContext(ReaddataContext.class,i);
		}
		public List<ParametricplotContext> parametricplot() {
			return getRuleContexts(ParametricplotContext.class);
		}
		public ParametricplotContext parametricplot(int i) {
			return getRuleContext(ParametricplotContext.class,i);
		}
		public List<PsplotContext> psplot() {
			return getRuleContexts(PsplotContext.class);
		}
		public PsplotContext psplot(int i) {
			return getRuleContext(PsplotContext.class,i);
		}
		public List<ListplotContext> listplot() {
			return getRuleContexts(ListplotContext.class);
		}
		public ListplotContext listplot(int i) {
			return getRuleContext(ListplotContext.class,i);
		}
		public List<DataplotContext> dataplot() {
			return getRuleContexts(DataplotContext.class);
		}
		public DataplotContext dataplot(int i) {
			return getRuleContext(DataplotContext.class,i);
		}
		public List<FileplotContext> fileplot() {
			return getRuleContexts(FileplotContext.class);
		}
		public FileplotContext fileplot(int i) {
			return getRuleContext(FileplotContext.class,i);
		}
		public List<PscustomContext> pscustom() {
			return getRuleContexts(PscustomContext.class);
		}
		public PscustomContext pscustom(int i) {
			return getRuleContext(PscustomContext.class,i);
		}
		public List<IncludegraphicsContext> includegraphics() {
			return getRuleContexts(IncludegraphicsContext.class);
		}
		public IncludegraphicsContext includegraphics(int i) {
			return getRuleContext(IncludegraphicsContext.class,i);
		}
		public List<PsframeboxContext> psframebox() {
			return getRuleContexts(PsframeboxContext.class);
		}
		public PsframeboxContext psframebox(int i) {
			return getRuleContext(PsframeboxContext.class,i);
		}
		public List<PsdblframeboxContext> psdblframebox() {
			return getRuleContexts(PsdblframeboxContext.class);
		}
		public PsdblframeboxContext psdblframebox(int i) {
			return getRuleContext(PsdblframeboxContext.class,i);
		}
		public List<PsshadowboxContext> psshadowbox() {
			return getRuleContexts(PsshadowboxContext.class);
		}
		public PsshadowboxContext psshadowbox(int i) {
			return getRuleContext(PsshadowboxContext.class,i);
		}
		public List<PscircleboxContext> pscirclebox() {
			return getRuleContexts(PscircleboxContext.class);
		}
		public PscircleboxContext pscirclebox(int i) {
			return getRuleContext(PscircleboxContext.class,i);
		}
		public List<PsovalboxContext> psovalbox() {
			return getRuleContexts(PsovalboxContext.class);
		}
		public PsovalboxContext psovalbox(int i) {
			return getRuleContext(PsovalboxContext.class,i);
		}
		public List<PsdiaboxContext> psdiabox() {
			return getRuleContexts(PsdiaboxContext.class);
		}
		public PsdiaboxContext psdiabox(int i) {
			return getRuleContext(PsdiaboxContext.class,i);
		}
		public List<PstriboxContext> pstribox() {
			return getRuleContexts(PstriboxContext.class);
		}
		public PstriboxContext pstribox(int i) {
			return getRuleContext(PstriboxContext.class,i);
		}
		public List<RputContext> rput() {
			return getRuleContexts(RputContext.class);
		}
		public RputContext rput(int i) {
			return getRuleContext(RputContext.class,i);
		}
		public List<ScaleboxContext> scalebox() {
			return getRuleContexts(ScaleboxContext.class);
		}
		public ScaleboxContext scalebox(int i) {
			return getRuleContext(ScaleboxContext.class,i);
		}
		public List<PsscaleboxContext> psscalebox() {
			return getRuleContexts(PsscaleboxContext.class);
		}
		public PsscaleboxContext psscalebox(int i) {
			return getRuleContext(PsscaleboxContext.class,i);
		}
		public List<DefinecolorContext> definecolor() {
			return getRuleContexts(DefinecolorContext.class);
		}
		public DefinecolorContext definecolor(int i) {
			return getRuleContext(DefinecolorContext.class,i);
		}
		public List<NewpsobjectContext> newpsobject() {
			return getRuleContexts(NewpsobjectContext.class);
		}
		public NewpsobjectContext newpsobject(int i) {
			return getRuleContext(NewpsobjectContext.class,i);
		}
		public List<NewpsstyleContext> newpsstyle() {
			return getRuleContexts(NewpsstyleContext.class);
		}
		public NewpsstyleContext newpsstyle(int i) {
			return getRuleContext(NewpsstyleContext.class,i);
		}
		public List<TextcolorContext> textcolor() {
			return getRuleContexts(TextcolorContext.class);
		}
		public TextcolorContext textcolor(int i) {
			return getRuleContext(TextcolorContext.class,i);
		}
		public List<SavedataContext> savedata() {
			return getRuleContexts(SavedataContext.class);
		}
		public SavedataContext savedata(int i) {
			return getRuleContext(SavedataContext.class,i);
		}
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<UnknowncmdsContext> unknowncmds() {
			return getRuleContexts(UnknowncmdsContext.class);
		}
		public UnknowncmdsContext unknowncmds(int i) {
			return getRuleContext(UnknowncmdsContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public PstCodeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PstCodeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pstCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPstCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPstCode(this);
		}
	}

	public final PstCodeContext pstCode(PSTContext pstctx) throws RecognitionException {
		PstCodeContext _localctx = new PstCodeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 0, RULE_pstCode);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(404);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(350);
						pstBlock(pstctx);
						}
						break;
					case 2:
						{
						setState(351);
						psset(pstctx);
						}
						break;
					case 3:
						{
						setState(352);
						pspictureBlock(pstctx);
						}
						break;
					case 4:
						{
						setState(353);
						centerBlock(pstctx);
						}
						break;
					case 5:
						{
						setState(354);
						pspicturecmd(pstctx);
						}
						break;
					case 6:
						{
						setState(355);
						psellipse(new PSTContext(pstctx, true));
						}
						break;
					case 7:
						{
						setState(356);
						psframe(new PSTContext(pstctx, true));
						}
						break;
					case 8:
						{
						setState(357);
						psdiamond(new PSTContext(pstctx, true));
						}
						break;
					case 9:
						{
						setState(358);
						pstriangle(new PSTContext(pstctx, true));
						}
						break;
					case 10:
						{
						setState(359);
						psline(new PSTContext(pstctx, true));
						}
						break;
					case 11:
						{
						setState(360);
						psqline(new PSTContext(pstctx, true));
						}
						break;
					case 12:
						{
						setState(361);
						pscircle(new PSTContext(pstctx, true));
						}
						break;
					case 13:
						{
						setState(362);
						psqdisk(new PSTContext(pstctx, true));
						}
						break;
					case 14:
						{
						setState(363);
						pspolygon(new PSTContext(pstctx, true));
						}
						break;
					case 15:
						{
						setState(364);
						psbezier(new PSTContext(pstctx, true));
						}
						break;
					case 16:
						{
						setState(365);
						psdot(new PSTContext(pstctx, true));
						}
						break;
					case 17:
						{
						setState(366);
						psdots(new PSTContext(pstctx, true));
						}
						break;
					case 18:
						{
						setState(367);
						psaxes(new PSTContext(pstctx, true));
						}
						break;
					case 19:
						{
						setState(368);
						psgrid(new PSTContext(pstctx, true));
						}
						break;
					case 20:
						{
						setState(369);
						pswedge(new PSTContext(pstctx, true));
						}
						break;
					case 21:
						{
						setState(370);
						psellipticarc(new PSTContext(pstctx, true));
						}
						break;
					case 22:
						{
						setState(371);
						psellipticarcn(new PSTContext(pstctx, true));
						}
						break;
					case 23:
						{
						setState(372);
						psarcn(new PSTContext(pstctx, true));
						}
						break;
					case 24:
						{
						setState(373);
						psarc(new PSTContext(pstctx, true));
						}
						break;
					case 25:
						{
						setState(374);
						parabola(new PSTContext(pstctx, true));
						}
						break;
					case 26:
						{
						setState(375);
						pscurve(new PSTContext(pstctx, true));
						}
						break;
					case 27:
						{
						setState(376);
						psecurve(new PSTContext(pstctx, true));
						}
						break;
					case 28:
						{
						setState(377);
						psccurve(new PSTContext(pstctx, true));
						}
						break;
					case 29:
						{
						setState(378);
						readdata(new PSTContext(pstctx, true));
						}
						break;
					case 30:
						{
						setState(379);
						parametricplot(new PSTContext(pstctx, true));
						}
						break;
					case 31:
						{
						setState(380);
						psplot(new PSTContext(pstctx, true));
						}
						break;
					case 32:
						{
						setState(381);
						listplot(new PSTContext(pstctx, true));
						}
						break;
					case 33:
						{
						setState(382);
						dataplot(new PSTContext(pstctx, true));
						}
						break;
					case 34:
						{
						setState(383);
						fileplot(new PSTContext(pstctx, true));
						}
						break;
					case 35:
						{
						setState(384);
						pscustom(new PSTContext(pstctx, true));
						}
						break;
					case 36:
						{
						setState(385);
						includegraphics(new PSTContext(pstctx, true));
						}
						break;
					case 37:
						{
						setState(386);
						psframebox(new PSTContext(pstctx, true));
						}
						break;
					case 38:
						{
						setState(387);
						psdblframebox(new PSTContext(pstctx, true));
						}
						break;
					case 39:
						{
						setState(388);
						psshadowbox(new PSTContext(pstctx, true));
						}
						break;
					case 40:
						{
						setState(389);
						pscirclebox(new PSTContext(pstctx, true));
						}
						break;
					case 41:
						{
						setState(390);
						psovalbox(new PSTContext(pstctx, true));
						}
						break;
					case 42:
						{
						setState(391);
						psdiabox(new PSTContext(pstctx, true));
						}
						break;
					case 43:
						{
						setState(392);
						pstribox(new PSTContext(pstctx, true));
						}
						break;
					case 44:
						{
						setState(393);
						rput(pstctx);
						}
						break;
					case 45:
						{
						setState(394);
						scalebox(pstctx);
						}
						break;
					case 46:
						{
						setState(395);
						psscalebox(pstctx);
						}
						break;
					case 47:
						{
						setState(396);
						definecolor(pstctx);
						}
						break;
					case 48:
						{
						setState(397);
						newpsobject(pstctx);
						}
						break;
					case 49:
						{
						setState(398);
						newpsstyle(pstctx);
						}
						break;
					case 50:
						{
						setState(399);
						textcolor(pstctx);
						}
						break;
					case 51:
						{
						setState(400);
						savedata(pstctx);
						}
						break;
					case 52:
						{
						setState(401);
						color(pstctx);
						}
						break;
					case 53:
						{
						setState(402);
						unknowncmds(pstctx);
						}
						break;
					case 54:
						{
						setState(403);
						text(pstctx);
						}
						break;
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PstcustomBlockContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public List<RlinetoContext> rlineto() {
			return getRuleContexts(RlinetoContext.class);
		}
		public RlinetoContext rlineto(int i) {
			return getRuleContext(RlinetoContext.class,i);
		}
		public List<MovepathContext> movepath() {
			return getRuleContexts(MovepathContext.class);
		}
		public MovepathContext movepath(int i) {
			return getRuleContext(MovepathContext.class,i);
		}
		public List<ClosedshadowContext> closedshadow() {
			return getRuleContexts(ClosedshadowContext.class);
		}
		public ClosedshadowContext closedshadow(int i) {
			return getRuleContext(ClosedshadowContext.class,i);
		}
		public List<OpenshadowContext> openshadow() {
			return getRuleContexts(OpenshadowContext.class);
		}
		public OpenshadowContext openshadow(int i) {
			return getRuleContext(OpenshadowContext.class,i);
		}
		public List<MrestoreContext> mrestore() {
			return getRuleContexts(MrestoreContext.class);
		}
		public MrestoreContext mrestore(int i) {
			return getRuleContext(MrestoreContext.class,i);
		}
		public List<MsaveContext> msave() {
			return getRuleContexts(MsaveContext.class);
		}
		public MsaveContext msave(int i) {
			return getRuleContext(MsaveContext.class,i);
		}
		public List<SwapaxesContext> swapaxes() {
			return getRuleContexts(SwapaxesContext.class);
		}
		public SwapaxesContext swapaxes(int i) {
			return getRuleContext(SwapaxesContext.class,i);
		}
		public List<RotateContext> rotate() {
			return getRuleContexts(RotateContext.class);
		}
		public RotateContext rotate(int i) {
			return getRuleContext(RotateContext.class,i);
		}
		public List<ScaleContext> scale() {
			return getRuleContexts(ScaleContext.class);
		}
		public ScaleContext scale(int i) {
			return getRuleContext(ScaleContext.class,i);
		}
		public List<TranslateContext> translate() {
			return getRuleContexts(TranslateContext.class);
		}
		public TranslateContext translate(int i) {
			return getRuleContext(TranslateContext.class,i);
		}
		public List<FillContext> fill() {
			return getRuleContexts(FillContext.class);
		}
		public FillContext fill(int i) {
			return getRuleContext(FillContext.class,i);
		}
		public List<StrokeContext> stroke() {
			return getRuleContexts(StrokeContext.class);
		}
		public StrokeContext stroke(int i) {
			return getRuleContext(StrokeContext.class,i);
		}
		public List<GrestoreContext> grestore() {
			return getRuleContexts(GrestoreContext.class);
		}
		public GrestoreContext grestore(int i) {
			return getRuleContext(GrestoreContext.class,i);
		}
		public List<GsaveContext> gsave() {
			return getRuleContexts(GsaveContext.class);
		}
		public GsaveContext gsave(int i) {
			return getRuleContext(GsaveContext.class,i);
		}
		public List<RcurvetoContext> rcurveto() {
			return getRuleContexts(RcurvetoContext.class);
		}
		public RcurvetoContext rcurveto(int i) {
			return getRuleContext(RcurvetoContext.class,i);
		}
		public List<ClosepathContext> closepath() {
			return getRuleContexts(ClosepathContext.class);
		}
		public ClosepathContext closepath(int i) {
			return getRuleContext(ClosepathContext.class,i);
		}
		public List<CurvetoContext> curveto() {
			return getRuleContexts(CurvetoContext.class);
		}
		public CurvetoContext curveto(int i) {
			return getRuleContext(CurvetoContext.class,i);
		}
		public List<LinetoContext> lineto() {
			return getRuleContexts(LinetoContext.class);
		}
		public LinetoContext lineto(int i) {
			return getRuleContext(LinetoContext.class,i);
		}
		public List<MovetoContext> moveto() {
			return getRuleContexts(MovetoContext.class);
		}
		public MovetoContext moveto(int i) {
			return getRuleContext(MovetoContext.class,i);
		}
		public List<NewpathContext> newpath() {
			return getRuleContexts(NewpathContext.class);
		}
		public NewpathContext newpath(int i) {
			return getRuleContext(NewpathContext.class,i);
		}
		public PstcustomBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PstcustomBlockContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pstcustomBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPstcustomBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPstcustomBlock(this);
		}
	}

	public final PstcustomBlockContext pstcustomBlock(PSTContext pstctx) throws RecognitionException {
		PstcustomBlockContext _localctx = new PstcustomBlockContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 2, RULE_pstcustomBlock);

			PSTContext newpstctx = new PSTContext(pstctx, false);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(BRACE_OPEN);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (T__49 - 50)) | (1L << (T__50 - 50)) | (1L << (T__51 - 50)) | (1L << (T__52 - 50)) | (1L << (T__53 - 50)) | (1L << (T__54 - 50)) | (1L << (T__55 - 50)) | (1L << (T__56 - 50)) | (1L << (T__57 - 50)) | (1L << (T__58 - 50)) | (1L << (T__59 - 50)) | (1L << (T__60 - 50)) | (1L << (T__61 - 50)) | (1L << (T__62 - 50)) | (1L << (T__63 - 50)) | (1L << (T__64 - 50)) | (1L << (T__65 - 50)) | (1L << (T__66 - 50)) | (1L << (T__67 - 50)) | (1L << (T__68 - 50)))) != 0)) {
				{
				setState(430);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__49:
					{
					setState(410);
					rlineto(newpstctx);
					}
					break;
				case T__50:
					{
					setState(411);
					movepath(newpstctx);
					}
					break;
				case T__51:
					{
					setState(412);
					closedshadow(newpstctx);
					}
					break;
				case T__52:
					{
					setState(413);
					openshadow(newpstctx);
					}
					break;
				case T__53:
					{
					setState(414);
					mrestore(newpstctx);
					}
					break;
				case T__54:
					{
					setState(415);
					msave(newpstctx);
					}
					break;
				case T__55:
					{
					setState(416);
					swapaxes(newpstctx);
					}
					break;
				case T__56:
					{
					setState(417);
					rotate(newpstctx);
					}
					break;
				case T__57:
					{
					setState(418);
					scale(newpstctx);
					}
					break;
				case T__58:
					{
					setState(419);
					translate(newpstctx);
					}
					break;
				case T__59:
					{
					setState(420);
					fill(newpstctx);
					}
					break;
				case T__60:
					{
					setState(421);
					stroke(newpstctx);
					}
					break;
				case T__61:
					{
					setState(422);
					grestore(newpstctx);
					}
					break;
				case T__62:
					{
					setState(423);
					gsave(newpstctx);
					}
					break;
				case T__63:
					{
					setState(424);
					rcurveto(newpstctx);
					}
					break;
				case T__64:
					{
					setState(425);
					closepath(newpstctx);
					}
					break;
				case T__65:
					{
					setState(426);
					curveto(newpstctx);
					}
					break;
				case T__66:
					{
					setState(427);
					lineto(newpstctx);
					}
					break;
				case T__67:
					{
					setState(428);
					moveto(pstctx);
					}
					break;
				case T__68:
					{
					setState(429);
					newpath(newpstctx);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PstBlockContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public PstCodeContext pstCode() {
			return getRuleContext(PstCodeContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public PstBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PstBlockContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pstBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPstBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPstBlock(this);
		}
	}

	public final PstBlockContext pstBlock(PSTContext pstctx) throws RecognitionException {
		PstBlockContext _localctx = new PstBlockContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 4, RULE_pstBlock);

			PSTContext newpstctx = new PSTContext(pstctx, false);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(BRACE_OPEN);
			setState(438);
			pstCode(newpstctx);
			setState(439);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsellipseContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext p1;
		public CoordContext p2;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PsellipseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsellipseContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psellipse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsellipse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsellipse(this);
		}
	}

	public final PsellipseContext psellipse(PSTContext pstctx) throws RecognitionException {
		PsellipseContext _localctx = new PsellipseContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 6, RULE_psellipse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			((PsellipseContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
				((PsellipseContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(442);
				paramBlock(pstctx);
				}
			}

			setState(445);
			((PsellipseContext)_localctx).p1 = coord();
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(446);
				((PsellipseContext)_localctx).p2 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsframeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext p1;
		public CoordContext p2;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PsframeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsframeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psframe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsframe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsframe(this);
		}
	}

	public final PsframeContext psframe(PSTContext pstctx) throws RecognitionException {
		PsframeContext _localctx = new PsframeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 8, RULE_psframe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			((PsframeContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
				((PsframeContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(450);
				paramBlock(pstctx);
				}
			}

			setState(453);
			((PsframeContext)_localctx).p1 = coord();
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(454);
				((PsframeContext)_localctx).p2 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsdiamondContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext p1;
		public CoordContext p2;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PsdiamondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsdiamondContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psdiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsdiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsdiamond(this);
		}
	}

	public final PsdiamondContext psdiamond(PSTContext pstctx) throws RecognitionException {
		PsdiamondContext _localctx = new PsdiamondContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 10, RULE_psdiamond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			((PsdiamondContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
				((PsdiamondContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(458);
				paramBlock(pstctx);
				}
			}

			setState(461);
			((PsdiamondContext)_localctx).p1 = coord();
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(462);
				((PsdiamondContext)_localctx).p2 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PstriangleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext p1;
		public CoordContext p2;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PstriangleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PstriangleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pstriangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPstriangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPstriangle(this);
		}
	}

	public final PstriangleContext pstriangle(PSTContext pstctx) throws RecognitionException {
		PstriangleContext _localctx = new PstriangleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 12, RULE_pstriangle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			((PstriangleContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
				((PstriangleContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(466);
				paramBlock(pstctx);
				}
			}

			setState(469);
			((PstriangleContext)_localctx).p1 = coord();
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(470);
				((PstriangleContext)_localctx).p2 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PslineContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext coord;
		public List<CoordContext> pts = new ArrayList<CoordContext>();
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PslineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PslineContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsline(this);
		}
	}

	public final PslineContext psline(PSTContext pstctx) throws RecognitionException {
		PslineContext _localctx = new PslineContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 14, RULE_psline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			((PslineContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
				((PslineContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(474);
				paramBlock(pstctx);
				}
			}

			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(477);
				arrowBlock(pstctx);
				}
			}

			setState(481); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(480);
					((PslineContext)_localctx).coord = coord();
					((PslineContext)_localctx).pts.add(((PslineContext)_localctx).coord);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(483); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsqlineContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext p1;
		public CoordContext p2;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PsqlineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsqlineContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psqline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsqline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsqline(this);
		}
	}

	public final PsqlineContext psqline(PSTContext pstctx) throws RecognitionException {
		PsqlineContext _localctx = new PsqlineContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 16, RULE_psqline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__10);
			setState(486);
			((PsqlineContext)_localctx).p1 = coord();
			setState(487);
			((PsqlineContext)_localctx).p2 = coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PscircleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext centre;
		public BracketValueDimContext bracketValueDim() {
			return getRuleContext(BracketValueDimContext.class,0);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public PscircleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PscircleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pscircle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPscircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPscircle(this);
		}
	}

	public final PscircleContext pscircle(PSTContext pstctx) throws RecognitionException {
		PscircleContext _localctx = new PscircleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 18, RULE_pscircle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			((PscircleContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
				((PscircleContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(490);
				paramBlock(pstctx);
				}
			}

			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__85) {
				{
				setState(493);
				((PscircleContext)_localctx).centre = coord();
				}
			}

			setState(496);
			bracketValueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsqdiskContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public BracketValueDimContext bracketValueDim() {
			return getRuleContext(BracketValueDimContext.class,0);
		}
		public PsqdiskContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsqdiskContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psqdisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsqdisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsqdisk(this);
		}
	}

	public final PsqdiskContext psqdisk(PSTContext pstctx) throws RecognitionException {
		PsqdiskContext _localctx = new PsqdiskContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 20, RULE_psqdisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(T__13);
			setState(499);
			coord();
			setState(500);
			bracketValueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PspolygonContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext p1;
		public CoordContext coord;
		public List<CoordContext> ps = new ArrayList<CoordContext>();
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PspolygonContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PspolygonContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pspolygon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPspolygon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPspolygon(this);
		}
	}

	public final PspolygonContext pspolygon(PSTContext pstctx) throws RecognitionException {
		PspolygonContext _localctx = new PspolygonContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 22, RULE_pspolygon);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			((PspolygonContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
				((PspolygonContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(503);
				paramBlock(pstctx);
				}
			}

			setState(506);
			((PspolygonContext)_localctx).p1 = coord();
			setState(508); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(507);
					((PspolygonContext)_localctx).coord = coord();
					((PspolygonContext)_localctx).ps.add(((PspolygonContext)_localctx).coord);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(510); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsbezierContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext coord;
		public List<CoordContext> p1 = new ArrayList<CoordContext>();
		public List<CoordContext> p2 = new ArrayList<CoordContext>();
		public List<CoordContext> p3 = new ArrayList<CoordContext>();
		public CoordContext p4;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PsbezierContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsbezierContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psbezier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsbezier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsbezier(this);
		}
	}

	public final PsbezierContext psbezier(PSTContext pstctx) throws RecognitionException {
		PsbezierContext _localctx = new PsbezierContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 24, RULE_psbezier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			((PsbezierContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
				((PsbezierContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(513);
				paramBlock(pstctx);
				}
				break;
			}
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(516);
				arrowBlock(pstctx);
				}
				break;
			}
			setState(525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					((PsbezierContext)_localctx).coord = coord();
					((PsbezierContext)_localctx).p1.add(((PsbezierContext)_localctx).coord);
					setState(520);
					((PsbezierContext)_localctx).coord = coord();
					((PsbezierContext)_localctx).p2.add(((PsbezierContext)_localctx).coord);
					setState(521);
					((PsbezierContext)_localctx).coord = coord();
					((PsbezierContext)_localctx).p3.add(((PsbezierContext)_localctx).coord);
					}
					} 
				}
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(528);
				((PsbezierContext)_localctx).p4 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsdotContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext pt;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public PsdotContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsdotContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psdot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsdot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsdot(this);
		}
	}

	public final PsdotContext psdot(PSTContext pstctx) throws RecognitionException {
		PsdotContext _localctx = new PsdotContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 26, RULE_psdot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			((PsdotContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
				((PsdotContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(532);
				paramBlock(pstctx);
				}
				break;
			}
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(535);
				((PsdotContext)_localctx).pt = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsdotsContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext coord;
		public List<CoordContext> pts = new ArrayList<CoordContext>();
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PsdotsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsdotsContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psdots; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsdots(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsdots(this);
		}
	}

	public final PsdotsContext psdots(PSTContext pstctx) throws RecognitionException {
		PsdotsContext _localctx = new PsdotsContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 28, RULE_psdots);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			((PsdotsContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
				((PsdotsContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(539);
				paramBlock(pstctx);
				}
			}

			setState(543); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(542);
					((PsdotsContext)_localctx).coord = coord();
					((PsdotsContext)_localctx).pts.add(((PsdotsContext)_localctx).coord);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(545); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsaxesContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext p1;
		public CoordContext p2;
		public CoordContext p3;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public PsaxesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsaxesContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psaxes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsaxes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsaxes(this);
		}
	}

	public final PsaxesContext psaxes(PSTContext pstctx) throws RecognitionException {
		PsaxesContext _localctx = new PsaxesContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 30, RULE_psaxes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(T__22);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(548);
				paramBlock(pstctx);
				}
			}

			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(551);
				arrowBlock(pstctx);
				}
			}

			setState(554);
			((PsaxesContext)_localctx).p1 = coord();
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(555);
				((PsaxesContext)_localctx).p2 = coord();
				}
				break;
			}
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(558);
				((PsaxesContext)_localctx).p3 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsgridContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext p1;
		public CoordContext p2;
		public CoordContext p3;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PsgridContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsgridContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psgrid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsgrid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsgrid(this);
		}
	}

	public final PsgridContext psgrid(PSTContext pstctx) throws RecognitionException {
		PsgridContext _localctx = new PsgridContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 32, RULE_psgrid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(T__23);
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(562);
				paramBlock(pstctx);
				}
				break;
			}
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(565);
				((PsgridContext)_localctx).p1 = coord();
				}
				break;
			}
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(568);
				((PsgridContext)_localctx).p2 = coord();
				}
				break;
			}
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(571);
				((PsgridContext)_localctx).p3 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RputContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public TextposContext textpos;
		public Token star;
		public ValueDimContext rot;
		public PutContext angleChar;
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public PstBlockContext pstBlock() {
			return getRuleContext(PstBlockContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public TextposContext textpos() {
			return getRuleContext(TextposContext.class,0);
		}
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public PutContext put() {
			return getRuleContext(PutContext.class,0);
		}
		public RputContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RputContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_rput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterRput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitRput(this);
		}
	}

	public final RputContext rput(PSTContext pstctx) throws RecognitionException {
		RputContext _localctx = new RputContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 34, RULE_rput);

			PSTContext newpstctx = new PSTContext(pstctx, false);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			((RputContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
				((RputContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(575);
				match(T__26);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 253)) & ~0x3f) == 0 && ((1L << (_la - 253)) & ((1L << (T__252 - 253)) | (1L << (T__253 - 253)) | (1L << (T__254 - 253)) | (1L << (T__255 - 253)) | (1L << (T__256 - 253)) | (1L << (T__257 - 253)) | (1L << (T__258 - 253)) | (1L << (T__259 - 253)) | (1L << (T__260 - 253)) | (1L << (T__261 - 253)) | (1L << (T__262 - 253)))) != 0)) {
					{
					setState(576);
					((RputContext)_localctx).textpos = textpos();
					}
				}

				 newpstctx.textPosition = (((RputContext)_localctx).textpos!=null?_input.getText(((RputContext)_localctx).textpos.start,((RputContext)_localctx).textpos.stop):null); 
				setState(580);
				match(T__27);
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(583);
				match(BRACE_OPEN);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(584);
					((RputContext)_localctx).star = match(T__28);
					}
				}

				setState(589);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(587);
					((RputContext)_localctx).rot = valueDim();
					}
					break;
				case T__244:
				case T__245:
				case T__246:
				case T__247:
				case T__248:
				case T__249:
				case T__250:
				case T__251:
					{
					setState(588);
					((RputContext)_localctx).angleChar = put();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				newpstctx.setRputAngle(((RputContext)_localctx).star, ((RputContext)_localctx).rot, ((RputContext)_localctx).angleChar);
				setState(592);
				match(BRACE_CLOSE);
				}
			}

			setState(596);
			coord();
			setState(597);
			pstBlock(newpstctx);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleboxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token hscale;
		public Token vscale;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public PstBlockContext pstBlock() {
			return getRuleContext(PstBlockContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PSTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PSTParser.NUMBER, i);
		}
		public ScaleboxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScaleboxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_scalebox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterScalebox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitScalebox(this);
		}
	}

	public final ScaleboxContext scalebox(PSTContext pstctx) throws RecognitionException {
		ScaleboxContext _localctx = new ScaleboxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 36, RULE_scalebox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(T__29);
			setState(600);
			match(BRACE_OPEN);
			setState(601);
			((ScaleboxContext)_localctx).hscale = match(NUMBER);
			setState(602);
			match(BRACE_CLOSE);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(603);
				match(T__26);
				setState(604);
				((ScaleboxContext)_localctx).vscale = match(NUMBER);
				setState(605);
				match(T__27);
				}
			}

			setState(608);
			pstBlock(pstctx);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsscaleboxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token hscale;
		public Token vscale;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public PstBlockContext pstBlock() {
			return getRuleContext(PstBlockContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PSTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PSTParser.NUMBER, i);
		}
		public PsscaleboxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsscaleboxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psscalebox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsscalebox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsscalebox(this);
		}
	}

	public final PsscaleboxContext psscalebox(PSTContext pstctx) throws RecognitionException {
		PsscaleboxContext _localctx = new PsscaleboxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 38, RULE_psscalebox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(T__30);
			setState(611);
			match(BRACE_OPEN);
			setState(612);
			((PsscaleboxContext)_localctx).hscale = match(NUMBER);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(613);
				((PsscaleboxContext)_localctx).vscale = match(NUMBER);
				}
			}

			setState(616);
			match(BRACE_CLOSE);
			setState(617);
			pstBlock(pstctx);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PswedgeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext pos;
		public BracketValueDimContext radius;
		public BracketValueDimContext angle1;
		public BracketValueDimContext angle2;
		public List<BracketValueDimContext> bracketValueDim() {
			return getRuleContexts(BracketValueDimContext.class);
		}
		public BracketValueDimContext bracketValueDim(int i) {
			return getRuleContext(BracketValueDimContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public PswedgeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PswedgeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pswedge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPswedge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPswedge(this);
		}
	}

	public final PswedgeContext pswedge(PSTContext pstctx) throws RecognitionException {
		PswedgeContext _localctx = new PswedgeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 40, RULE_pswedge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			((PswedgeContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
				((PswedgeContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(620);
				paramBlock(pstctx);
				}
			}

			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__85) {
				{
				setState(623);
				((PswedgeContext)_localctx).pos = coord();
				}
			}

			setState(626);
			((PswedgeContext)_localctx).radius = bracketValueDim();
			setState(627);
			((PswedgeContext)_localctx).angle1 = bracketValueDim();
			setState(628);
			((PswedgeContext)_localctx).angle2 = bracketValueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsellipticarcContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext pos0;
		public CoordContext pos1;
		public BracketValueDimContext angle1;
		public BracketValueDimContext angle2;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public List<BracketValueDimContext> bracketValueDim() {
			return getRuleContexts(BracketValueDimContext.class);
		}
		public BracketValueDimContext bracketValueDim(int i) {
			return getRuleContext(BracketValueDimContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public PsellipticarcContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsellipticarcContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psellipticarc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsellipticarc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsellipticarc(this);
		}
	}

	public final PsellipticarcContext psellipticarc(PSTContext pstctx) throws RecognitionException {
		PsellipticarcContext _localctx = new PsellipticarcContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 42, RULE_psellipticarc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			((PsellipticarcContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
				((PsellipticarcContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(631);
				paramBlock(pstctx);
				}
			}

			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(634);
				arrowBlock(pstctx);
				}
			}

			setState(637);
			((PsellipticarcContext)_localctx).pos0 = coord();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__85) {
				{
				setState(638);
				((PsellipticarcContext)_localctx).pos1 = coord();
				}
			}

			setState(641);
			((PsellipticarcContext)_localctx).angle1 = bracketValueDim();
			setState(642);
			((PsellipticarcContext)_localctx).angle2 = bracketValueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsellipticarcnContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext pos0;
		public CoordContext pos1;
		public BracketValueDimContext angle1;
		public BracketValueDimContext angle2;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public List<BracketValueDimContext> bracketValueDim() {
			return getRuleContexts(BracketValueDimContext.class);
		}
		public BracketValueDimContext bracketValueDim(int i) {
			return getRuleContext(BracketValueDimContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public PsellipticarcnContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsellipticarcnContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psellipticarcn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsellipticarcn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsellipticarcn(this);
		}
	}

	public final PsellipticarcnContext psellipticarcn(PSTContext pstctx) throws RecognitionException {
		PsellipticarcnContext _localctx = new PsellipticarcnContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 44, RULE_psellipticarcn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			((PsellipticarcnContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
				((PsellipticarcnContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(645);
				paramBlock(pstctx);
				}
			}

			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(648);
				arrowBlock(pstctx);
				}
			}

			setState(651);
			((PsellipticarcnContext)_localctx).pos0 = coord();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__85) {
				{
				setState(652);
				((PsellipticarcnContext)_localctx).pos1 = coord();
				}
			}

			setState(655);
			((PsellipticarcnContext)_localctx).angle1 = bracketValueDim();
			setState(656);
			((PsellipticarcnContext)_localctx).angle2 = bracketValueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsarcContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext pos;
		public BracketValueDimContext radius;
		public BracketValueDimContext angle1;
		public BracketValueDimContext angle2;
		public List<BracketValueDimContext> bracketValueDim() {
			return getRuleContexts(BracketValueDimContext.class);
		}
		public BracketValueDimContext bracketValueDim(int i) {
			return getRuleContext(BracketValueDimContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public PsarcContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsarcContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psarc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsarc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsarc(this);
		}
	}

	public final PsarcContext psarc(PSTContext pstctx) throws RecognitionException {
		PsarcContext _localctx = new PsarcContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 46, RULE_psarc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			((PsarcContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__38) ) {
				((PsarcContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(659);
				paramBlock(pstctx);
				}
			}

			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(662);
				arrowBlock(pstctx);
				}
				break;
			}
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__85) {
				{
				setState(665);
				((PsarcContext)_localctx).pos = coord();
				}
			}

			setState(668);
			((PsarcContext)_localctx).radius = bracketValueDim();
			setState(669);
			((PsarcContext)_localctx).angle1 = bracketValueDim();
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(670);
				((PsarcContext)_localctx).angle2 = bracketValueDim();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsarcnContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext pos;
		public BracketValueDimContext radius;
		public BracketValueDimContext angle1;
		public BracketValueDimContext angle2;
		public List<BracketValueDimContext> bracketValueDim() {
			return getRuleContexts(BracketValueDimContext.class);
		}
		public BracketValueDimContext bracketValueDim(int i) {
			return getRuleContext(BracketValueDimContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public PsarcnContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsarcnContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psarcn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsarcn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsarcn(this);
		}
	}

	public final PsarcnContext psarcn(PSTContext pstctx) throws RecognitionException {
		PsarcnContext _localctx = new PsarcnContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 48, RULE_psarcn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			((PsarcnContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
				((PsarcnContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(674);
				paramBlock(pstctx);
				}
			}

			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(677);
				arrowBlock(pstctx);
				}
				break;
			}
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__85) {
				{
				setState(680);
				((PsarcnContext)_localctx).pos = coord();
				}
			}

			setState(683);
			((PsarcnContext)_localctx).radius = bracketValueDim();
			setState(684);
			((PsarcnContext)_localctx).angle1 = bracketValueDim();
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(685);
				((PsarcnContext)_localctx).angle2 = bracketValueDim();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParabolaContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext pt1;
		public CoordContext pt2;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public ParabolaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParabolaContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_parabola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParabola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParabola(this);
		}
	}

	public final ParabolaContext parabola(PSTContext pstctx) throws RecognitionException {
		ParabolaContext _localctx = new ParabolaContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 50, RULE_parabola);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			((ParabolaContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
				((ParabolaContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(689);
				paramBlock(pstctx);
				}
			}

			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(692);
				arrowBlock(pstctx);
				}
			}

			setState(695);
			((ParabolaContext)_localctx).pt1 = coord();
			setState(696);
			((ParabolaContext)_localctx).pt2 = coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PscurveContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext coord;
		public List<CoordContext> p1 = new ArrayList<CoordContext>();
		public List<CoordContext> p2 = new ArrayList<CoordContext>();
		public List<CoordContext> p3 = new ArrayList<CoordContext>();
		public CoordContext p4;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PscurveContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PscurveContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pscurve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPscurve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPscurve(this);
		}
	}

	public final PscurveContext pscurve(PSTContext pstctx) throws RecognitionException {
		PscurveContext _localctx = new PscurveContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 52, RULE_pscurve);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			((PscurveContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
				((PscurveContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(699);
				paramBlock(pstctx);
				}
				break;
			}
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(702);
				arrowBlock(pstctx);
				}
				break;
			}
			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(705);
					((PscurveContext)_localctx).coord = coord();
					((PscurveContext)_localctx).p1.add(((PscurveContext)_localctx).coord);
					setState(706);
					((PscurveContext)_localctx).coord = coord();
					((PscurveContext)_localctx).p2.add(((PscurveContext)_localctx).coord);
					setState(707);
					((PscurveContext)_localctx).coord = coord();
					((PscurveContext)_localctx).p3.add(((PscurveContext)_localctx).coord);
					}
					} 
				}
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(714);
				((PscurveContext)_localctx).p4 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsecurveContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext coord;
		public List<CoordContext> p1 = new ArrayList<CoordContext>();
		public List<CoordContext> p2 = new ArrayList<CoordContext>();
		public List<CoordContext> p3 = new ArrayList<CoordContext>();
		public CoordContext p4;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PsecurveContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsecurveContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psecurve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsecurve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsecurve(this);
		}
	}

	public final PsecurveContext psecurve(PSTContext pstctx) throws RecognitionException {
		PsecurveContext _localctx = new PsecurveContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 54, RULE_psecurve);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			((PsecurveContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__46) ) {
				((PsecurveContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(718);
				paramBlock(pstctx);
				}
				break;
			}
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(721);
				arrowBlock(pstctx);
				}
				break;
			}
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(724);
					((PsecurveContext)_localctx).coord = coord();
					((PsecurveContext)_localctx).p1.add(((PsecurveContext)_localctx).coord);
					setState(725);
					((PsecurveContext)_localctx).coord = coord();
					((PsecurveContext)_localctx).p2.add(((PsecurveContext)_localctx).coord);
					setState(726);
					((PsecurveContext)_localctx).coord = coord();
					((PsecurveContext)_localctx).p3.add(((PsecurveContext)_localctx).coord);
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(733);
				((PsecurveContext)_localctx).p4 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsccurveContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public CoordContext coord;
		public List<CoordContext> p1 = new ArrayList<CoordContext>();
		public List<CoordContext> p2 = new ArrayList<CoordContext>();
		public List<CoordContext> p3 = new ArrayList<CoordContext>();
		public CoordContext p4;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ArrowBlockContext arrowBlock() {
			return getRuleContext(ArrowBlockContext.class,0);
		}
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PsccurveContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsccurveContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psccurve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsccurve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsccurve(this);
		}
	}

	public final PsccurveContext psccurve(PSTContext pstctx) throws RecognitionException {
		PsccurveContext _localctx = new PsccurveContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 56, RULE_psccurve);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			((PsccurveContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
				((PsccurveContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(737);
				paramBlock(pstctx);
				}
				break;
			}
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(740);
				arrowBlock(pstctx);
				}
				break;
			}
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					((PsccurveContext)_localctx).coord = coord();
					((PsccurveContext)_localctx).p1.add(((PsccurveContext)_localctx).coord);
					setState(744);
					((PsccurveContext)_localctx).coord = coord();
					((PsccurveContext)_localctx).p2.add(((PsccurveContext)_localctx).coord);
					setState(745);
					((PsccurveContext)_localctx).coord = coord();
					((PsccurveContext)_localctx).p3.add(((PsccurveContext)_localctx).coord);
					}
					} 
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(752);
				((PsccurveContext)_localctx).p4 = coord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RlinetoContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public RlinetoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RlinetoContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_rlineto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterRlineto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitRlineto(this);
		}
	}

	public final RlinetoContext rlineto(PSTContext pstctx) throws RecognitionException {
		RlinetoContext _localctx = new RlinetoContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 58, RULE_rlineto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(T__49);
			setState(756);
			coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovepathContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public MovepathContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MovepathContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_movepath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterMovepath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitMovepath(this);
		}
	}

	public final MovepathContext movepath(PSTContext pstctx) throws RecognitionException {
		MovepathContext _localctx = new MovepathContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 60, RULE_movepath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(T__50);
			setState(759);
			coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosedshadowContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ClosedshadowContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClosedshadowContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_closedshadow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterClosedshadow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitClosedshadow(this);
		}
	}

	public final ClosedshadowContext closedshadow(PSTContext pstctx) throws RecognitionException {
		ClosedshadowContext _localctx = new ClosedshadowContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 62, RULE_closedshadow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(T__51);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(762);
				paramBlock(pstctx);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenshadowContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public OpenshadowContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OpenshadowContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_openshadow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterOpenshadow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitOpenshadow(this);
		}
	}

	public final OpenshadowContext openshadow(PSTContext pstctx) throws RecognitionException {
		OpenshadowContext _localctx = new OpenshadowContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 64, RULE_openshadow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(T__52);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(766);
				paramBlock(pstctx);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MrestoreContext extends ParserRuleContext {
		public PSTContext pstctx;
		public MrestoreContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MrestoreContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_mrestore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterMrestore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitMrestore(this);
		}
	}

	public final MrestoreContext mrestore(PSTContext pstctx) throws RecognitionException {
		MrestoreContext _localctx = new MrestoreContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 66, RULE_mrestore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(T__53);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MsaveContext extends ParserRuleContext {
		public PSTContext pstctx;
		public MsaveContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MsaveContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_msave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterMsave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitMsave(this);
		}
	}

	public final MsaveContext msave(PSTContext pstctx) throws RecognitionException {
		MsaveContext _localctx = new MsaveContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 68, RULE_msave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(T__54);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwapaxesContext extends ParserRuleContext {
		public PSTContext pstctx;
		public SwapaxesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SwapaxesContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_swapaxes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterSwapaxes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitSwapaxes(this);
		}
	}

	public final SwapaxesContext swapaxes(PSTContext pstctx) throws RecognitionException {
		SwapaxesContext _localctx = new SwapaxesContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 70, RULE_swapaxes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(T__55);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RotateContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public RotateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RotateContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_rotate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterRotate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitRotate(this);
		}
	}

	public final RotateContext rotate(PSTContext pstctx) throws RecognitionException {
		RotateContext _localctx = new RotateContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 72, RULE_rotate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(T__56);
			setState(776);
			match(BRACE_OPEN);
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(777);
					matchWildcard();
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(783);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(784);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public ScaleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ScaleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitScale(this);
		}
	}

	public final ScaleContext scale(PSTContext pstctx) throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 74, RULE_scale);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(T__57);
			setState(787);
			match(BRACE_OPEN);
			setState(791);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(788);
					matchWildcard();
					}
					} 
				}
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(794);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(795);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslateContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public TranslateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TranslateContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_translate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterTranslate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitTranslate(this);
		}
	}

	public final TranslateContext translate(PSTContext pstctx) throws RecognitionException {
		TranslateContext _localctx = new TranslateContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 76, RULE_translate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(T__58);
			setState(798);
			coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FillContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public FillContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FillContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_fill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterFill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitFill(this);
		}
	}

	public final FillContext fill(PSTContext pstctx) throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 78, RULE_fill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(T__59);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(801);
				paramBlock(pstctx);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrokeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public StrokeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StrokeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_stroke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterStroke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitStroke(this);
		}
	}

	public final StrokeContext stroke(PSTContext pstctx) throws RecognitionException {
		StrokeContext _localctx = new StrokeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 80, RULE_stroke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(T__60);
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(805);
				paramBlock(pstctx);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrestoreContext extends ParserRuleContext {
		public PSTContext pstctx;
		public GrestoreContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrestoreContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_grestore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterGrestore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitGrestore(this);
		}
	}

	public final GrestoreContext grestore(PSTContext pstctx) throws RecognitionException {
		GrestoreContext _localctx = new GrestoreContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 82, RULE_grestore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(T__61);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GsaveContext extends ParserRuleContext {
		public PSTContext pstctx;
		public GsaveContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GsaveContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_gsave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterGsave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitGsave(this);
		}
	}

	public final GsaveContext gsave(PSTContext pstctx) throws RecognitionException {
		GsaveContext _localctx = new GsaveContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 84, RULE_gsave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(T__62);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RcurvetoContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext p1;
		public CoordContext p2;
		public CoordContext p3;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public RcurvetoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RcurvetoContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_rcurveto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterRcurveto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitRcurveto(this);
		}
	}

	public final RcurvetoContext rcurveto(PSTContext pstctx) throws RecognitionException {
		RcurvetoContext _localctx = new RcurvetoContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 86, RULE_rcurveto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(T__63);
			setState(813);
			((RcurvetoContext)_localctx).p1 = coord();
			setState(814);
			((RcurvetoContext)_localctx).p2 = coord();
			setState(815);
			((RcurvetoContext)_localctx).p3 = coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosepathContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ClosepathContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClosepathContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_closepath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterClosepath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitClosepath(this);
		}
	}

	public final ClosepathContext closepath(PSTContext pstctx) throws RecognitionException {
		ClosepathContext _localctx = new ClosepathContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 88, RULE_closepath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(T__64);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurvetoContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext p1;
		public CoordContext p2;
		public CoordContext p3;
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public CurvetoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CurvetoContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_curveto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterCurveto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitCurveto(this);
		}
	}

	public final CurvetoContext curveto(PSTContext pstctx) throws RecognitionException {
		CurvetoContext _localctx = new CurvetoContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 90, RULE_curveto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(T__65);
			setState(820);
			((CurvetoContext)_localctx).p1 = coord();
			setState(821);
			((CurvetoContext)_localctx).p2 = coord();
			setState(822);
			((CurvetoContext)_localctx).p3 = coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinetoContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public LinetoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LinetoContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_lineto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterLineto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitLineto(this);
		}
	}

	public final LinetoContext lineto(PSTContext pstctx) throws RecognitionException {
		LinetoContext _localctx = new LinetoContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 92, RULE_lineto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(T__66);
			setState(825);
			coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovetoContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public MovetoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MovetoContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_moveto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterMoveto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitMoveto(this);
		}
	}

	public final MovetoContext moveto(PSTContext pstctx) throws RecognitionException {
		MovetoContext _localctx = new MovetoContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 94, RULE_moveto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(T__67);
			setState(828);
			coord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewpathContext extends ParserRuleContext {
		public PSTContext pstctx;
		public NewpathContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NewpathContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_newpath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterNewpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitNewpath(this);
		}
	}

	public final NewpathContext newpath(PSTContext pstctx) throws RecognitionException {
		NewpathContext _localctx = new NewpathContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 96, RULE_newpath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(T__68);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsframeboxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public Token content;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PsframeboxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsframeboxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psframebox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsframebox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsframebox(this);
		}
	}

	public final PsframeboxContext psframebox(PSTContext pstctx) throws RecognitionException {
		PsframeboxContext _localctx = new PsframeboxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 98, RULE_psframebox);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			((PsframeboxContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__70) ) {
				((PsframeboxContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(833);
				paramBlock(pstctx);
				}
			}

			setState(836);
			match(BRACE_OPEN);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(837);
					((PsframeboxContext)_localctx).content = matchWildcard();
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(843);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(844);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsdblframeboxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public Token content;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PsdblframeboxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsdblframeboxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psdblframebox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsdblframebox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsdblframebox(this);
		}
	}

	public final PsdblframeboxContext psdblframebox(PSTContext pstctx) throws RecognitionException {
		PsdblframeboxContext _localctx = new PsdblframeboxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 100, RULE_psdblframebox);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			((PsdblframeboxContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__71 || _la==T__72) ) {
				((PsdblframeboxContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(847);
				paramBlock(pstctx);
				}
			}

			setState(850);
			match(BRACE_OPEN);
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(851);
					((PsdblframeboxContext)_localctx).content = matchWildcard();
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(857);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(858);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsshadowboxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public Token content;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PsshadowboxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsshadowboxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psshadowbox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsshadowbox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsshadowbox(this);
		}
	}

	public final PsshadowboxContext psshadowbox(PSTContext pstctx) throws RecognitionException {
		PsshadowboxContext _localctx = new PsshadowboxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 102, RULE_psshadowbox);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			((PsshadowboxContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__73 || _la==T__74) ) {
				((PsshadowboxContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(861);
				paramBlock(pstctx);
				}
			}

			setState(864);
			match(BRACE_OPEN);
			setState(868);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(865);
					((PsshadowboxContext)_localctx).content = matchWildcard();
					}
					} 
				}
				setState(870);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(871);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(872);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PscircleboxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public Token content;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PscircleboxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PscircleboxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pscirclebox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPscirclebox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPscirclebox(this);
		}
	}

	public final PscircleboxContext pscirclebox(PSTContext pstctx) throws RecognitionException {
		PscircleboxContext _localctx = new PscircleboxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 104, RULE_pscirclebox);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			((PscircleboxContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__76) ) {
				((PscircleboxContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(875);
				paramBlock(pstctx);
				}
			}

			setState(878);
			match(BRACE_OPEN);
			setState(882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(879);
					((PscircleboxContext)_localctx).content = matchWildcard();
					}
					} 
				}
				setState(884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(885);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(886);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsovalboxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public Token content;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PsovalboxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsovalboxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psovalbox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsovalbox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsovalbox(this);
		}
	}

	public final PsovalboxContext psovalbox(PSTContext pstctx) throws RecognitionException {
		PsovalboxContext _localctx = new PsovalboxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 106, RULE_psovalbox);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			((PsovalboxContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__77 || _la==T__78) ) {
				((PsovalboxContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(889);
				paramBlock(pstctx);
				}
			}

			setState(892);
			match(BRACE_OPEN);
			setState(896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(893);
					((PsovalboxContext)_localctx).content = matchWildcard();
					}
					} 
				}
				setState(898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(899);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(900);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsdiaboxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public Token content;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PsdiaboxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsdiaboxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psdiabox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsdiabox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsdiabox(this);
		}
	}

	public final PsdiaboxContext psdiabox(PSTContext pstctx) throws RecognitionException {
		PsdiaboxContext _localctx = new PsdiaboxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 108, RULE_psdiabox);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			((PsdiaboxContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__79 || _la==T__80) ) {
				((PsdiaboxContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(903);
				paramBlock(pstctx);
				}
			}

			setState(906);
			match(BRACE_OPEN);
			setState(910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(907);
					((PsdiaboxContext)_localctx).content = matchWildcard();
					}
					} 
				}
				setState(912);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(913);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(914);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PstriboxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public Token content;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PstriboxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PstriboxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pstribox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPstribox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPstribox(this);
		}
	}

	public final PstriboxContext pstribox(PSTContext pstctx) throws RecognitionException {
		PstriboxContext _localctx = new PstriboxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 110, RULE_pstribox);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			((PstriboxContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__81 || _la==T__82) ) {
				((PstriboxContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(917);
				paramBlock(pstctx);
				}
			}

			setState(920);
			match(BRACE_OPEN);
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(921);
					((PstriboxContext)_localctx).content = matchWildcard();
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(927);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(928);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextcolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token name;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public PstBlockContext pstBlock() {
			return getRuleContext(PstBlockContext.class,0);
		}
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public TextcolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TextcolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_textcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterTextcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitTextcolor(this);
		}
	}

	public final TextcolorContext textcolor(PSTContext pstctx) throws RecognitionException {
		TextcolorContext _localctx = new TextcolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 112, RULE_textcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(T__83);
			setState(931);
			match(BRACE_OPEN);
			setState(932);
			((TextcolorContext)_localctx).name = match(WORD);
			setState(933);
			match(BRACE_CLOSE);
			setState(934);
			pstBlock(pstctx);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token name;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ColorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitColor(this);
		}
	}

	public final ColorContext color(PSTContext pstctx) throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 114, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(T__84);
			setState(937);
			match(BRACE_OPEN);
			setState(938);
			((ColorContext)_localctx).name = match(WORD);
			setState(939);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknowncmdsContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode LATEXCMD() { return getToken(PSTParser.LATEXCMD, 0); }
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public UnknowncmdsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public UnknowncmdsContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_unknowncmds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterUnknowncmds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitUnknowncmds(this);
		}
	}

	public final UnknowncmdsContext unknowncmds(PSTContext pstctx) throws RecognitionException {
		UnknowncmdsContext _localctx = new UnknowncmdsContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 116, RULE_unknowncmds);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(LATEXCMD);
			setState(953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(951);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__26:
						{
						{
						setState(942);
						match(T__26);
						setState(943);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(944);
						match(T__27);
						}
						}
						break;
					case BRACE_OPEN:
						{
						{
						setState(945);
						match(BRACE_OPEN);
						setState(946);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(947);
						match(BRACE_CLOSE);
						}
						}
						break;
					case T__85:
						{
						{
						setState(948);
						match(T__85);
						setState(949);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==T__86) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(950);
						match(T__86);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReaddataContext extends ParserRuleContext {
		public PSTContext pstctx;
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public TerminalNode LATEXCMD() { return getToken(PSTParser.LATEXCMD, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public ReaddataContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReaddataContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_readdata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterReaddata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitReaddata(this);
		}
	}

	public final ReaddataContext readdata(PSTContext pstctx) throws RecognitionException {
		ReaddataContext _localctx = new ReaddataContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 118, RULE_readdata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(T__87);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(957);
				paramBlock(pstctx);
				}
			}

			setState(960);
			match(BRACE_OPEN);
			setState(961);
			match(LATEXCMD);
			setState(962);
			match(BRACE_CLOSE);
			setState(963);
			match(BRACE_OPEN);
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(967);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						setState(964);
						matchWildcard();
						}
						break;
					case 2:
						{
						setState(965);
						match(T__88);
						}
						break;
					case 3:
						{
						setState(966);
						match(T__89);
						}
						break;
					}
					} 
				}
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(972);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(973);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SavedataContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode LATEXCMD() { return getToken(PSTParser.LATEXCMD, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public SavedataContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SavedataContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_savedata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterSavedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitSavedata(this);
		}
	}

	public final SavedataContext savedata(PSTContext pstctx) throws RecognitionException {
		SavedataContext _localctx = new SavedataContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 120, RULE_savedata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(T__90);
			setState(976);
			match(BRACE_OPEN);
			setState(977);
			match(LATEXCMD);
			setState(978);
			match(BRACE_CLOSE);
			setState(979);
			match(T__26);
			setState(983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(980);
					matchWildcard();
					}
					} 
				}
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(986);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(987);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametricplotContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public Token xmin;
		public Token xmax;
		public TextContext text;
		public List<TextContext> fct = new ArrayList<TextContext>();
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PSTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PSTParser.NUMBER, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public ParametricplotContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParametricplotContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_parametricplot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParametricplot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParametricplot(this);
		}
	}

	public final ParametricplotContext parametricplot(PSTContext pstctx) throws RecognitionException {
		ParametricplotContext _localctx = new ParametricplotContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 122, RULE_parametricplot);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			((ParametricplotContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__91 || _la==T__92) ) {
				((ParametricplotContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(990);
				paramBlock(pstctx);
				}
			}

			setState(993);
			match(BRACE_OPEN);
			setState(994);
			((ParametricplotContext)_localctx).xmin = match(NUMBER);
			setState(995);
			match(BRACE_CLOSE);
			setState(996);
			match(BRACE_OPEN);
			setState(997);
			((ParametricplotContext)_localctx).xmax = match(NUMBER);
			setState(998);
			match(BRACE_CLOSE);
			setState(999);
			match(BRACE_OPEN);
			setState(1001); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1000);
					((ParametricplotContext)_localctx).text = text(pstctx);
					((ParametricplotContext)_localctx).fct.add(((ParametricplotContext)_localctx).text);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1003); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1005);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1006);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsplotContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public Token x0;
		public Token x1;
		public TextContext text;
		public List<TextContext> fct = new ArrayList<TextContext>();
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PSTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PSTParser.NUMBER, i);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public PsplotContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PsplotContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psplot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsplot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsplot(this);
		}
	}

	public final PsplotContext psplot(PSTContext pstctx) throws RecognitionException {
		PsplotContext _localctx = new PsplotContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 124, RULE_psplot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			((PsplotContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__93 || _la==T__94) ) {
				((PsplotContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(1009);
				paramBlock(pstctx);
				}
			}

			setState(1012);
			match(BRACE_OPEN);
			setState(1013);
			((PsplotContext)_localctx).x0 = match(NUMBER);
			setState(1014);
			match(BRACE_CLOSE);
			setState(1015);
			match(BRACE_OPEN);
			setState(1016);
			((PsplotContext)_localctx).x1 = match(NUMBER);
			setState(1017);
			match(BRACE_CLOSE);
			setState(1018);
			match(BRACE_OPEN);
			setState(1020); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1019);
				((PsplotContext)_localctx).text = text(pstctx);
				((PsplotContext)_localctx).fct.add(((PsplotContext)_localctx).text);
				}
				}
				setState(1022); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (T__275 - 256)) | (1L << (T__276 - 256)) | (1L << (T__277 - 256)) | (1L << (T__278 - 256)) | (1L << (HEXA - 256)) | (1L << (DOUBLEMATHTEXT - 256)) | (1L << (MATHTEXTPAR - 256)) | (1L << (MATHTEXTBRACK - 256)) | (1L << (MATHTEXT - 256)) | (1L << (LATEXCMD - 256)) | (1L << (WORD - 256)) | (1L << (IDENT - 256)) | (1L << (NUMBER - 256)) | (1L << (COMMENT - 256)) | (1L << (PUNCTUATION - 256)) | (1L << (MATHMODE - 256)) | (1L << (WHITESPACE - 256)))) != 0) );
			setState(1024);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListplotContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public List<TerminalNode> LATEXCMD() { return getTokens(PSTParser.LATEXCMD); }
		public TerminalNode LATEXCMD(int i) {
			return getToken(PSTParser.LATEXCMD, i);
		}
		public ListplotContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListplotContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_listplot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterListplot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitListplot(this);
		}
	}

	public final ListplotContext listplot(PSTContext pstctx) throws RecognitionException {
		ListplotContext _localctx = new ListplotContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 126, RULE_listplot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			((ListplotContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__95 || _la==T__96) ) {
				((ListplotContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(1027);
				paramBlock(pstctx);
				}
			}

			setState(1030);
			match(BRACE_OPEN);
			setState(1032); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1031);
				match(LATEXCMD);
				}
				}
				setState(1034); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LATEXCMD );
			setState(1036);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataplotContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public List<TerminalNode> LATEXCMD() { return getTokens(PSTParser.LATEXCMD); }
		public TerminalNode LATEXCMD(int i) {
			return getToken(PSTParser.LATEXCMD, i);
		}
		public DataplotContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DataplotContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_dataplot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterDataplot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitDataplot(this);
		}
	}

	public final DataplotContext dataplot(PSTContext pstctx) throws RecognitionException {
		DataplotContext _localctx = new DataplotContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 128, RULE_dataplot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			((DataplotContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__95 || _la==T__96) ) {
				((DataplotContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(1039);
				paramBlock(pstctx);
				}
			}

			setState(1042);
			match(BRACE_OPEN);
			setState(1044); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1043);
				match(LATEXCMD);
				}
				}
				setState(1046); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LATEXCMD );
			setState(1048);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileplotContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public List<TerminalNode> LATEXCMD() { return getTokens(PSTParser.LATEXCMD); }
		public TerminalNode LATEXCMD(int i) {
			return getToken(PSTParser.LATEXCMD, i);
		}
		public FileplotContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FileplotContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_fileplot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterFileplot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitFileplot(this);
		}
	}

	public final FileplotContext fileplot(PSTContext pstctx) throws RecognitionException {
		FileplotContext _localctx = new FileplotContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 130, RULE_fileplot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			((FileplotContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__95 || _la==T__96) ) {
				((FileplotContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(1051);
				paramBlock(pstctx);
				}
			}

			setState(1054);
			match(BRACE_OPEN);
			setState(1056); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1055);
				match(LATEXCMD);
				}
				}
				setState(1058); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LATEXCMD );
			setState(1060);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewpsobjectContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token name;
		public Token obj;
		public Token attrs;
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(PSTParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PSTParser.IDENT, i);
		}
		public NewpsobjectContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NewpsobjectContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_newpsobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterNewpsobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitNewpsobject(this);
		}
	}

	public final NewpsobjectContext newpsobject(PSTContext pstctx) throws RecognitionException {
		NewpsobjectContext _localctx = new NewpsobjectContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 132, RULE_newpsobject);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(T__97);
			setState(1063);
			match(BRACE_OPEN);
			setState(1064);
			((NewpsobjectContext)_localctx).name = match(IDENT);
			setState(1065);
			match(BRACE_CLOSE);
			setState(1066);
			match(BRACE_OPEN);
			setState(1067);
			((NewpsobjectContext)_localctx).obj = match(IDENT);
			setState(1068);
			match(BRACE_CLOSE);
			setState(1069);
			match(BRACE_OPEN);
			setState(1073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1070);
					((NewpsobjectContext)_localctx).attrs = matchWildcard();
					}
					} 
				}
				setState(1075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(1076);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1077);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewpsstyleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token pkgname;
		public Token name;
		public Token def;
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public TerminalNode IDENT() { return getToken(PSTParser.IDENT, 0); }
		public NewpsstyleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NewpsstyleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_newpsstyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterNewpsstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitNewpsstyle(this);
		}
	}

	public final NewpsstyleContext newpsstyle(PSTContext pstctx) throws RecognitionException {
		NewpsstyleContext _localctx = new NewpsstyleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 134, RULE_newpsstyle);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(T__98);
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(1080);
				match(T__26);
				setState(1084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1081);
						((NewpsstyleContext)_localctx).pkgname = matchWildcard();
						}
						} 
					}
					setState(1086);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				setState(1087);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1088);
				match(T__27);
				}
			}

			setState(1091);
			match(BRACE_OPEN);
			setState(1092);
			((NewpsstyleContext)_localctx).name = match(IDENT);
			setState(1093);
			match(BRACE_CLOSE);
			setState(1094);
			match(BRACE_OPEN);
			setState(1098);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1095);
					((NewpsstyleContext)_localctx).def = matchWildcard();
					}
					} 
				}
				setState(1100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(1101);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1102);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PscustomContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token cmd;
		public PstcustomBlockContext pstcustomBlock() {
			return getRuleContext(PstcustomBlockContext.class,0);
		}
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public PscustomContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PscustomContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pscustom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPscustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPscustom(this);
		}
	}

	public final PscustomContext pscustom(PSTContext pstctx) throws RecognitionException {
		PscustomContext _localctx = new PscustomContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 136, RULE_pscustom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			((PscustomContext)_localctx).cmd = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__99 || _la==T__100) ) {
				((PscustomContext)_localctx).cmd = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(1105);
				paramBlock(pstctx);
				}
			}

			setState(1108);
			pstcustomBlock(pstctx);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinecolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token name;
		public Token colortype;
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(PSTParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PSTParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PSTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PSTParser.NUMBER, i);
		}
		public TerminalNode HEXA() { return getToken(PSTParser.HEXA, 0); }
		public DefinecolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefinecolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_definecolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterDefinecolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitDefinecolor(this);
		}
	}

	public final DefinecolorContext definecolor(PSTContext pstctx) throws RecognitionException {
		DefinecolorContext _localctx = new DefinecolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 138, RULE_definecolor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			match(T__101);
			setState(1111);
			match(BRACE_OPEN);
			setState(1112);
			((DefinecolorContext)_localctx).name = match(WORD);
			setState(1113);
			match(BRACE_CLOSE);
			setState(1114);
			match(BRACE_OPEN);
			setState(1115);
			((DefinecolorContext)_localctx).colortype = match(WORD);
			setState(1116);
			match(BRACE_CLOSE);
			setState(1117);
			match(BRACE_OPEN);
			setState(1127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(1118);
				match(NUMBER);
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__102) {
					{
					{
					setState(1119);
					match(T__102);
					setState(1120);
					match(NUMBER);
					}
					}
					setState(1125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case HEXA:
				{
				setState(1126);
				match(HEXA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1129);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludegraphicsContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token path;
		public ParamBlockContext paramBlock() {
			return getRuleContext(ParamBlockContext.class,0);
		}
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public IncludegraphicsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IncludegraphicsContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_includegraphics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterIncludegraphics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitIncludegraphics(this);
		}
	}

	public final IncludegraphicsContext includegraphics(PSTContext pstctx) throws RecognitionException {
		IncludegraphicsContext _localctx = new IncludegraphicsContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 140, RULE_includegraphics);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(T__103);
			setState(1132);
			paramBlock(pstctx);
			setState(1133);
			match(BRACE_OPEN);
			setState(1137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1134);
					((IncludegraphicsContext)_localctx).path = matchWildcard();
					}
					} 
				}
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(1140);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BRACE_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1141);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PspicturecmdContext extends ParserRuleContext {
		public PSTContext pstctx;
		public CoordContext p1;
		public CoordContext p2;
		public PstCodeContext pstCode() {
			return getRuleContext(PstCodeContext.class,0);
		}
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PspicturecmdContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PspicturecmdContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pspicturecmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPspicturecmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPspicturecmd(this);
		}
	}

	public final PspicturecmdContext pspicturecmd(PSTContext pstctx) throws RecognitionException {
		PspicturecmdContext _localctx = new PspicturecmdContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 142, RULE_pspicturecmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			match(T__104);
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1144);
				((PspicturecmdContext)_localctx).p1 = coord();
				}
				break;
			}
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1147);
				((PspicturecmdContext)_localctx).p2 = coord();
				}
				break;
			}
			_localctx.pstctx.setPspicturePoints(((PspicturecmdContext)_localctx).p1, ((PspicturecmdContext)_localctx).p2);
			setState(1151);
			pstCode(pstctx);
			setState(1152);
			match(T__105);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PspictureBlockContext extends ParserRuleContext {
		public PSTContext pstctx;
		public boolean hasStar = false;;
		public CoordContext p1;
		public CoordContext p2;
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public PstCodeContext pstCode() {
			return getRuleContext(PstCodeContext.class,0);
		}
		public List<CoordContext> coord() {
			return getRuleContexts(CoordContext.class);
		}
		public CoordContext coord(int i) {
			return getRuleContext(CoordContext.class,i);
		}
		public PspictureBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PspictureBlockContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_pspictureBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPspictureBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPspictureBlock(this);
		}
	}

	public final PspictureBlockContext pspictureBlock(PSTContext pstctx) throws RecognitionException {
		PspictureBlockContext _localctx = new PspictureBlockContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 144, RULE_pspictureBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(T__106);
			setState(1155);
			match(BRACE_OPEN);
			setState(1160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__107:
				{
				{
				setState(1156);
				match(T__107);
				((PspictureBlockContext)_localctx).hasStar = true;
				}
				}
				break;
			case T__108:
				{
				{
				setState(1158);
				match(T__108);
				((PspictureBlockContext)_localctx).hasStar = false;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1162);
			match(BRACE_CLOSE);
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1163);
				((PspictureBlockContext)_localctx).p1 = coord();
				}
				break;
			}
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1166);
				((PspictureBlockContext)_localctx).p2 = coord();
				}
				break;
			}
			_localctx.pstctx.setPspicturePoints(((PspictureBlockContext)_localctx).p1, ((PspictureBlockContext)_localctx).p2);
			setState(1170);
			pstCode(pstctx);
			setState(1171);
			match(T__109);
			setState(1172);
			match(BRACE_OPEN);
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1173);
				if (!(_localctx.hasStar)) throw new FailedPredicateException(this, "$hasStar");
				setState(1174);
				match(T__107);
				}
				break;
			case 2:
				{
				setState(1175);
				match(T__108);
				}
				break;
			}
			setState(1178);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CenterBlockContext extends ParserRuleContext {
		public PSTContext pstctx;
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public PstCodeContext pstCode() {
			return getRuleContext(PstCodeContext.class,0);
		}
		public CenterBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CenterBlockContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_centerBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterCenterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitCenterBlock(this);
		}
	}

	public final CenterBlockContext centerBlock(PSTContext pstctx) throws RecognitionException {
		CenterBlockContext _localctx = new CenterBlockContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 146, RULE_centerBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(T__106);
			setState(1181);
			match(BRACE_OPEN);
			setState(1182);
			match(T__110);
			setState(1183);
			match(BRACE_CLOSE);
			setState(1184);
			pstCode(pstctx);
			setState(1185);
			match(T__109);
			setState(1186);
			match(BRACE_OPEN);
			setState(1187);
			match(T__110);
			setState(1188);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PssetContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public List<ParamSettingContext> paramSetting() {
			return getRuleContexts(ParamSettingContext.class);
		}
		public ParamSettingContext paramSetting(int i) {
			return getRuleContext(ParamSettingContext.class,i);
		}
		public PssetContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PssetContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_psset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPsset(this);
		}
	}

	public final PssetContext psset(PSTContext pstctx) throws RecognitionException {
		PssetContext _localctx = new PssetContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 148, RULE_psset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(T__111);
			setState(1191);
			match(BRACE_OPEN);
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (T__113 - 114)) | (1L << (T__114 - 114)) | (1L << (T__115 - 114)) | (1L << (T__116 - 114)) | (1L << (T__117 - 114)) | (1L << (T__118 - 114)) | (1L << (T__119 - 114)) | (1L << (T__120 - 114)) | (1L << (T__121 - 114)) | (1L << (T__122 - 114)) | (1L << (T__123 - 114)) | (1L << (T__124 - 114)) | (1L << (T__125 - 114)) | (1L << (T__126 - 114)) | (1L << (T__127 - 114)) | (1L << (T__128 - 114)) | (1L << (T__129 - 114)) | (1L << (T__130 - 114)) | (1L << (T__131 - 114)) | (1L << (T__136 - 114)) | (1L << (T__137 - 114)) | (1L << (T__138 - 114)) | (1L << (T__139 - 114)) | (1L << (T__140 - 114)) | (1L << (T__141 - 114)) | (1L << (T__142 - 114)) | (1L << (T__143 - 114)) | (1L << (T__144 - 114)) | (1L << (T__148 - 114)) | (1L << (T__149 - 114)) | (1L << (T__150 - 114)) | (1L << (T__151 - 114)) | (1L << (T__152 - 114)) | (1L << (T__153 - 114)) | (1L << (T__154 - 114)) | (1L << (T__155 - 114)) | (1L << (T__156 - 114)) | (1L << (T__157 - 114)) | (1L << (T__158 - 114)) | (1L << (T__162 - 114)) | (1L << (T__163 - 114)) | (1L << (T__164 - 114)) | (1L << (T__167 - 114)) | (1L << (T__168 - 114)) | (1L << (T__169 - 114)) | (1L << (T__170 - 114)) | (1L << (T__171 - 114)) | (1L << (T__172 - 114)) | (1L << (T__173 - 114)) | (1L << (T__174 - 114)))) != 0) || ((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & ((1L << (T__177 - 178)) | (1L << (T__178 - 178)) | (1L << (T__179 - 178)) | (1L << (T__180 - 178)) | (1L << (T__181 - 178)) | (1L << (T__197 - 178)) | (1L << (T__198 - 178)) | (1L << (T__199 - 178)) | (1L << (T__200 - 178)) | (1L << (T__201 - 178)) | (1L << (T__202 - 178)) | (1L << (T__203 - 178)) | (1L << (T__204 - 178)) | (1L << (T__205 - 178)) | (1L << (T__206 - 178)) | (1L << (T__207 - 178)) | (1L << (T__208 - 178)) | (1L << (T__215 - 178)) | (1L << (T__216 - 178)) | (1L << (T__217 - 178)) | (1L << (T__218 - 178)) | (1L << (T__219 - 178)) | (1L << (T__220 - 178)) | (1L << (T__221 - 178)) | (1L << (T__222 - 178)) | (1L << (T__223 - 178)) | (1L << (T__224 - 178)) | (1L << (T__225 - 178)) | (1L << (T__226 - 178)) | (1L << (T__227 - 178)) | (1L << (T__228 - 178)) | (1L << (T__229 - 178)) | (1L << (T__230 - 178)) | (1L << (T__231 - 178)))) != 0) || _la==WORD) {
				{
				setState(1192);
				paramSetting(pstctx);
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__102) {
					{
					{
					setState(1193);
					match(T__102);
					setState(1194);
					paramSetting(pstctx);
					}
					}
					setState(1199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1202);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamBlockContext extends ParserRuleContext {
		public PSTContext pstctx;
		public List<ParamSettingContext> paramSetting() {
			return getRuleContexts(ParamSettingContext.class);
		}
		public ParamSettingContext paramSetting(int i) {
			return getRuleContext(ParamSettingContext.class,i);
		}
		public ParamBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamBlockContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamBlock(this);
		}
	}

	public final ParamBlockContext paramBlock(PSTContext pstctx) throws RecognitionException {
		ParamBlockContext _localctx = new ParamBlockContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 150, RULE_paramBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(T__26);
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (T__113 - 114)) | (1L << (T__114 - 114)) | (1L << (T__115 - 114)) | (1L << (T__116 - 114)) | (1L << (T__117 - 114)) | (1L << (T__118 - 114)) | (1L << (T__119 - 114)) | (1L << (T__120 - 114)) | (1L << (T__121 - 114)) | (1L << (T__122 - 114)) | (1L << (T__123 - 114)) | (1L << (T__124 - 114)) | (1L << (T__125 - 114)) | (1L << (T__126 - 114)) | (1L << (T__127 - 114)) | (1L << (T__128 - 114)) | (1L << (T__129 - 114)) | (1L << (T__130 - 114)) | (1L << (T__131 - 114)) | (1L << (T__136 - 114)) | (1L << (T__137 - 114)) | (1L << (T__138 - 114)) | (1L << (T__139 - 114)) | (1L << (T__140 - 114)) | (1L << (T__141 - 114)) | (1L << (T__142 - 114)) | (1L << (T__143 - 114)) | (1L << (T__144 - 114)) | (1L << (T__148 - 114)) | (1L << (T__149 - 114)) | (1L << (T__150 - 114)) | (1L << (T__151 - 114)) | (1L << (T__152 - 114)) | (1L << (T__153 - 114)) | (1L << (T__154 - 114)) | (1L << (T__155 - 114)) | (1L << (T__156 - 114)) | (1L << (T__157 - 114)) | (1L << (T__158 - 114)) | (1L << (T__162 - 114)) | (1L << (T__163 - 114)) | (1L << (T__164 - 114)) | (1L << (T__167 - 114)) | (1L << (T__168 - 114)) | (1L << (T__169 - 114)) | (1L << (T__170 - 114)) | (1L << (T__171 - 114)) | (1L << (T__172 - 114)) | (1L << (T__173 - 114)) | (1L << (T__174 - 114)))) != 0) || ((((_la - 178)) & ~0x3f) == 0 && ((1L << (_la - 178)) & ((1L << (T__177 - 178)) | (1L << (T__178 - 178)) | (1L << (T__179 - 178)) | (1L << (T__180 - 178)) | (1L << (T__181 - 178)) | (1L << (T__197 - 178)) | (1L << (T__198 - 178)) | (1L << (T__199 - 178)) | (1L << (T__200 - 178)) | (1L << (T__201 - 178)) | (1L << (T__202 - 178)) | (1L << (T__203 - 178)) | (1L << (T__204 - 178)) | (1L << (T__205 - 178)) | (1L << (T__206 - 178)) | (1L << (T__207 - 178)) | (1L << (T__208 - 178)) | (1L << (T__215 - 178)) | (1L << (T__216 - 178)) | (1L << (T__217 - 178)) | (1L << (T__218 - 178)) | (1L << (T__219 - 178)) | (1L << (T__220 - 178)) | (1L << (T__221 - 178)) | (1L << (T__222 - 178)) | (1L << (T__223 - 178)) | (1L << (T__224 - 178)) | (1L << (T__225 - 178)) | (1L << (T__226 - 178)) | (1L << (T__227 - 178)) | (1L << (T__228 - 178)) | (1L << (T__229 - 178)) | (1L << (T__230 - 178)) | (1L << (T__231 - 178)))) != 0) || _la==WORD) {
				{
				setState(1205);
				paramSetting(pstctx);
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__102) {
					{
					{
					setState(1206);
					match(T__102);
					setState(1207);
					paramSetting(pstctx);
					}
					}
					setState(1212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1215);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketValueDimContext extends ParserRuleContext {
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public BracketValueDimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketValueDim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterBracketValueDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitBracketValueDim(this);
		}
	}

	public final BracketValueDimContext bracketValueDim() throws RecognitionException {
		BracketValueDimContext _localctx = new BracketValueDimContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_bracketValueDim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(BRACE_OPEN);
			setState(1218);
			valueDim();
			setState(1219);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueDimContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public ValueDimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterValueDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitValueDim(this);
		}
	}

	public final ValueDimContext valueDim() throws RecognitionException {
		ValueDimContext _localctx = new ValueDimContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_valueDim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(NUMBER);
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (T__273 - 274)) | (1L << (T__274 - 274)) | (1L << (T__275 - 274)) | (1L << (T__276 - 274)))) != 0)) {
				{
				setState(1222);
				unit();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamSettingContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ParamArrowContext paramArrow() {
			return getRuleContext(ParamArrowContext.class,0);
		}
		public ParamArrowscaleContext paramArrowscale() {
			return getRuleContext(ParamArrowscaleContext.class,0);
		}
		public ParamRbracketlengthContext paramRbracketlength() {
			return getRuleContext(ParamRbracketlengthContext.class,0);
		}
		public ParamBracketlengthContext paramBracketlength() {
			return getRuleContext(ParamBracketlengthContext.class,0);
		}
		public ParamArrowinsetContext paramArrowinset() {
			return getRuleContext(ParamArrowinsetContext.class,0);
		}
		public ParamArrowlengthContext paramArrowlength() {
			return getRuleContext(ParamArrowlengthContext.class,0);
		}
		public ParamtbarsizeContext paramtbarsize() {
			return getRuleContext(ParamtbarsizeContext.class,0);
		}
		public ParamarrowsizeContext paramarrowsize() {
			return getRuleContext(ParamarrowsizeContext.class,0);
		}
		public ParamunitContext paramunit() {
			return getRuleContext(ParamunitContext.class,0);
		}
		public ParamaddfillstyleContext paramaddfillstyle() {
			return getRuleContext(ParamaddfillstyleContext.class,0);
		}
		public ParamborderContext paramborder() {
			return getRuleContext(ParamborderContext.class,0);
		}
		public ParamdotsepContext paramdotsep() {
			return getRuleContext(ParamdotsepContext.class,0);
		}
		public ParamdashContext paramdash() {
			return getRuleContext(ParamdashContext.class,0);
		}
		public ParamframearcContext paramframearc() {
			return getRuleContext(ParamframearcContext.class,0);
		}
		public ParamxunitContext paramxunit() {
			return getRuleContext(ParamxunitContext.class,0);
		}
		public ParamyunitContext paramyunit() {
			return getRuleContext(ParamyunitContext.class,0);
		}
		public ParamoriginContext paramorigin() {
			return getRuleContext(ParamoriginContext.class,0);
		}
		public ParamswapaxesContext paramswapaxes() {
			return getRuleContext(ParamswapaxesContext.class,0);
		}
		public ParamlinestyleContext paramlinestyle() {
			return getRuleContext(ParamlinestyleContext.class,0);
		}
		public ParambordercolorContext parambordercolor() {
			return getRuleContext(ParambordercolorContext.class,0);
		}
		public ParamdoublelineContext paramdoubleline() {
			return getRuleContext(ParamdoublelineContext.class,0);
		}
		public ParamdoublesepContext paramdoublesep() {
			return getRuleContext(ParamdoublesepContext.class,0);
		}
		public ParamdoublecolorContext paramdoublecolor() {
			return getRuleContext(ParamdoublecolorContext.class,0);
		}
		public ParamshadowContext paramshadow() {
			return getRuleContext(ParamshadowContext.class,0);
		}
		public ParamshadowsizeContext paramshadowsize() {
			return getRuleContext(ParamshadowsizeContext.class,0);
		}
		public ParamshadowangleContext paramshadowangle() {
			return getRuleContext(ParamshadowangleContext.class,0);
		}
		public ParamshadowcolorContext paramshadowcolor() {
			return getRuleContext(ParamshadowcolorContext.class,0);
		}
		public ParamdimenContext paramdimen() {
			return getRuleContext(ParamdimenContext.class,0);
		}
		public ParamfillstyleContext paramfillstyle() {
			return getRuleContext(ParamfillstyleContext.class,0);
		}
		public ParamfillcolorContext paramfillcolor() {
			return getRuleContext(ParamfillcolorContext.class,0);
		}
		public ParamhatchwidthContext paramhatchwidth() {
			return getRuleContext(ParamhatchwidthContext.class,0);
		}
		public ParamhatchsepContext paramhatchsep() {
			return getRuleContext(ParamhatchsepContext.class,0);
		}
		public ParamhatchcolorContext paramhatchcolor() {
			return getRuleContext(ParamhatchcolorContext.class,0);
		}
		public ParamhatchangleContext paramhatchangle() {
			return getRuleContext(ParamhatchangleContext.class,0);
		}
		public ParamliftpenContext paramliftpen() {
			return getRuleContext(ParamliftpenContext.class,0);
		}
		public ParamlabelsepContext paramlabelsep() {
			return getRuleContext(ParamlabelsepContext.class,0);
		}
		public ParamlabelsContext paramlabels() {
			return getRuleContext(ParamlabelsContext.class,0);
		}
		public ParamticksContext paramticks() {
			return getRuleContext(ParamticksContext.class,0);
		}
		public ParamtickstyleContext paramtickstyle() {
			return getRuleContext(ParamtickstyleContext.class,0);
		}
		public ParamshoworiginContext paramshoworigin() {
			return getRuleContext(ParamshoworiginContext.class,0);
		}
		public ParamticksizeContext paramticksize() {
			return getRuleContext(ParamticksizeContext.class,0);
		}
		public ParamaxesstyleContext paramaxesstyle() {
			return getRuleContext(ParamaxesstyleContext.class,0);
		}
		public ParamframesepContext paramframesep() {
			return getRuleContext(ParamframesepContext.class,0);
		}
		public ParamboxsepContext paramboxsep() {
			return getRuleContext(ParamboxsepContext.class,0);
		}
		public ParamrunitContext paramrunit() {
			return getRuleContext(ParamrunitContext.class,0);
		}
		public ParamlinewidthContext paramlinewidth() {
			return getRuleContext(ParamlinewidthContext.class,0);
		}
		public ParamlinecolorContext paramlinecolor() {
			return getRuleContext(ParamlinecolorContext.class,0);
		}
		public ParamshowpointsContext paramshowpoints() {
			return getRuleContext(ParamshowpointsContext.class,0);
		}
		public ParamlinearcContext paramlinearc() {
			return getRuleContext(ParamlinearcContext.class,0);
		}
		public ParamcornersizeContext paramcornersize() {
			return getRuleContext(ParamcornersizeContext.class,0);
		}
		public ParamarcsepAContext paramarcsepA() {
			return getRuleContext(ParamarcsepAContext.class,0);
		}
		public ParamarcsepBContext paramarcsepB() {
			return getRuleContext(ParamarcsepBContext.class,0);
		}
		public ParamarcsepContext paramarcsep() {
			return getRuleContext(ParamarcsepContext.class,0);
		}
		public ParamcurvatureContext paramcurvature() {
			return getRuleContext(ParamcurvatureContext.class,0);
		}
		public ParamdotstyleContext paramdotstyle() {
			return getRuleContext(ParamdotstyleContext.class,0);
		}
		public ParamdotscaleContext paramdotscale() {
			return getRuleContext(ParamdotscaleContext.class,0);
		}
		public ParamdotdotangleContext paramdotdotangle() {
			return getRuleContext(ParamdotdotangleContext.class,0);
		}
		public ParamgridwidthContext paramgridwidth() {
			return getRuleContext(ParamgridwidthContext.class,0);
		}
		public ParamgridcolorContext paramgridcolor() {
			return getRuleContext(ParamgridcolorContext.class,0);
		}
		public ParamgriddotsContext paramgriddots() {
			return getRuleContext(ParamgriddotsContext.class,0);
		}
		public ParamgridlabelsContext paramgridlabels() {
			return getRuleContext(ParamgridlabelsContext.class,0);
		}
		public ParamgridlabelcolorContext paramgridlabelcolor() {
			return getRuleContext(ParamgridlabelcolorContext.class,0);
		}
		public ParamsubgriddivContext paramsubgriddiv() {
			return getRuleContext(ParamsubgriddivContext.class,0);
		}
		public ParamsubgridwidthContext paramsubgridwidth() {
			return getRuleContext(ParamsubgridwidthContext.class,0);
		}
		public ParamsubgridcolorContext paramsubgridcolor() {
			return getRuleContext(ParamsubgridcolorContext.class,0);
		}
		public ParamsubgriddotsContext paramsubgriddots() {
			return getRuleContext(ParamsubgriddotsContext.class,0);
		}
		public ParamplotstyleContext paramplotstyle() {
			return getRuleContext(ParamplotstyleContext.class,0);
		}
		public ParamplotpointsContext paramplotpoints() {
			return getRuleContext(ParamplotpointsContext.class,0);
		}
		public ParamgradbeginContext paramgradbegin() {
			return getRuleContext(ParamgradbeginContext.class,0);
		}
		public ParamgradendContext paramgradend() {
			return getRuleContext(ParamgradendContext.class,0);
		}
		public ParamgradlinesContext paramgradlines() {
			return getRuleContext(ParamgradlinesContext.class,0);
		}
		public ParamgradmidpointContext paramgradmidpoint() {
			return getRuleContext(ParamgradmidpointContext.class,0);
		}
		public ParamgradangleContext paramgradangle() {
			return getRuleContext(ParamgradangleContext.class,0);
		}
		public ParamdotsizeContext paramdotsize() {
			return getRuleContext(ParamdotsizeContext.class,0);
		}
		public ParamgangleContext paramgangle() {
			return getRuleContext(ParamgangleContext.class,0);
		}
		public ParamstrokeopacityContext paramstrokeopacity() {
			return getRuleContext(ParamstrokeopacityContext.class,0);
		}
		public ParamopacityContext paramopacity() {
			return getRuleContext(ParamopacityContext.class,0);
		}
		public ParamdxContext paramdx() {
			return getRuleContext(ParamdxContext.class,0);
		}
		public ParamdyContext paramdy() {
			return getRuleContext(ParamdyContext.class,0);
		}
		public ParamDxContext paramDx() {
			return getRuleContext(ParamDxContext.class,0);
		}
		public ParamDyContext paramDy() {
			return getRuleContext(ParamDyContext.class,0);
		}
		public ParamOxContext paramOx() {
			return getRuleContext(ParamOxContext.class,0);
		}
		public ParamOyContext paramOy() {
			return getRuleContext(ParamOyContext.class,0);
		}
		public ParampolarplotContext parampolarplot() {
			return getRuleContext(ParampolarplotContext.class,0);
		}
		public UnknownParamSettingContext unknownParamSetting() {
			return getRuleContext(UnknownParamSettingContext.class,0);
		}
		public ParamSettingContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamSettingContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramSetting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamSetting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamSetting(this);
		}
	}

	public final ParamSettingContext paramSetting(PSTContext pstctx) throws RecognitionException {
		ParamSettingContext _localctx = new ParamSettingContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 156, RULE_paramSetting);
		try {
			setState(1310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__113:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				paramArrow(pstctx);
				}
				break;
			case T__114:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				paramArrowscale(pstctx);
				}
				break;
			case T__115:
				enterOuterAlt(_localctx, 3);
				{
				setState(1227);
				paramRbracketlength(pstctx);
				}
				break;
			case T__116:
				enterOuterAlt(_localctx, 4);
				{
				setState(1228);
				paramBracketlength(pstctx);
				}
				break;
			case T__117:
				enterOuterAlt(_localctx, 5);
				{
				setState(1229);
				paramArrowinset(pstctx);
				}
				break;
			case T__118:
				enterOuterAlt(_localctx, 6);
				{
				setState(1230);
				paramArrowlength(pstctx);
				}
				break;
			case T__119:
				enterOuterAlt(_localctx, 7);
				{
				setState(1231);
				paramtbarsize(pstctx);
				}
				break;
			case T__120:
				enterOuterAlt(_localctx, 8);
				{
				setState(1232);
				paramarrowsize(pstctx);
				}
				break;
			case T__121:
				enterOuterAlt(_localctx, 9);
				{
				setState(1233);
				paramunit(pstctx);
				}
				break;
			case T__124:
				enterOuterAlt(_localctx, 10);
				{
				setState(1234);
				paramaddfillstyle(pstctx);
				}
				break;
			case T__125:
				enterOuterAlt(_localctx, 11);
				{
				setState(1235);
				paramborder(pstctx);
				}
				break;
			case T__126:
				enterOuterAlt(_localctx, 12);
				{
				setState(1236);
				paramdotsep(pstctx);
				}
				break;
			case T__127:
				enterOuterAlt(_localctx, 13);
				{
				setState(1237);
				paramdash(pstctx);
				}
				break;
			case T__128:
				enterOuterAlt(_localctx, 14);
				{
				setState(1238);
				paramframearc(pstctx);
				}
				break;
			case T__122:
				enterOuterAlt(_localctx, 15);
				{
				setState(1239);
				paramxunit(pstctx);
				}
				break;
			case T__123:
				enterOuterAlt(_localctx, 16);
				{
				setState(1240);
				paramyunit(pstctx);
				}
				break;
			case T__129:
				enterOuterAlt(_localctx, 17);
				{
				setState(1241);
				paramorigin(pstctx);
				}
				break;
			case T__130:
				enterOuterAlt(_localctx, 18);
				{
				setState(1242);
				paramswapaxes(pstctx);
				}
				break;
			case T__131:
				enterOuterAlt(_localctx, 19);
				{
				setState(1243);
				paramlinestyle(pstctx);
				}
				break;
			case T__136:
				enterOuterAlt(_localctx, 20);
				{
				setState(1244);
				parambordercolor(pstctx);
				}
				break;
			case T__137:
				enterOuterAlt(_localctx, 21);
				{
				setState(1245);
				paramdoubleline(pstctx);
				}
				break;
			case T__138:
				enterOuterAlt(_localctx, 22);
				{
				setState(1246);
				paramdoublesep(pstctx);
				}
				break;
			case T__139:
				enterOuterAlt(_localctx, 23);
				{
				setState(1247);
				paramdoublecolor(pstctx);
				}
				break;
			case T__140:
				enterOuterAlt(_localctx, 24);
				{
				setState(1248);
				paramshadow(pstctx);
				}
				break;
			case T__141:
				enterOuterAlt(_localctx, 25);
				{
				setState(1249);
				paramshadowsize(pstctx);
				}
				break;
			case T__142:
				enterOuterAlt(_localctx, 26);
				{
				setState(1250);
				paramshadowangle(pstctx);
				}
				break;
			case T__143:
				enterOuterAlt(_localctx, 27);
				{
				setState(1251);
				paramshadowcolor(pstctx);
				}
				break;
			case T__144:
				enterOuterAlt(_localctx, 28);
				{
				setState(1252);
				paramdimen(pstctx);
				}
				break;
			case T__148:
				enterOuterAlt(_localctx, 29);
				{
				setState(1253);
				paramfillstyle(pstctx);
				}
				break;
			case T__149:
				enterOuterAlt(_localctx, 30);
				{
				setState(1254);
				paramfillcolor(pstctx);
				}
				break;
			case T__150:
				enterOuterAlt(_localctx, 31);
				{
				setState(1255);
				paramhatchwidth(pstctx);
				}
				break;
			case T__151:
				enterOuterAlt(_localctx, 32);
				{
				setState(1256);
				paramhatchsep(pstctx);
				}
				break;
			case T__152:
				enterOuterAlt(_localctx, 33);
				{
				setState(1257);
				paramhatchcolor(pstctx);
				}
				break;
			case T__153:
				enterOuterAlt(_localctx, 34);
				{
				setState(1258);
				paramhatchangle(pstctx);
				}
				break;
			case T__154:
				enterOuterAlt(_localctx, 35);
				{
				setState(1259);
				paramliftpen(pstctx);
				}
				break;
			case T__155:
				enterOuterAlt(_localctx, 36);
				{
				setState(1260);
				paramlabelsep(pstctx);
				}
				break;
			case T__156:
				enterOuterAlt(_localctx, 37);
				{
				setState(1261);
				paramlabels(pstctx);
				}
				break;
			case T__157:
				enterOuterAlt(_localctx, 38);
				{
				setState(1262);
				paramticks(pstctx);
				}
				break;
			case T__158:
				enterOuterAlt(_localctx, 39);
				{
				setState(1263);
				paramtickstyle(pstctx);
				}
				break;
			case T__162:
				enterOuterAlt(_localctx, 40);
				{
				setState(1264);
				paramshoworigin(pstctx);
				}
				break;
			case T__163:
				enterOuterAlt(_localctx, 41);
				{
				setState(1265);
				paramticksize(pstctx);
				}
				break;
			case T__164:
				enterOuterAlt(_localctx, 42);
				{
				setState(1266);
				paramaxesstyle(pstctx);
				}
				break;
			case T__167:
				enterOuterAlt(_localctx, 43);
				{
				setState(1267);
				paramframesep(pstctx);
				}
				break;
			case T__168:
				enterOuterAlt(_localctx, 44);
				{
				setState(1268);
				paramboxsep(pstctx);
				}
				break;
			case T__169:
				enterOuterAlt(_localctx, 45);
				{
				setState(1269);
				paramrunit(pstctx);
				}
				break;
			case T__170:
				enterOuterAlt(_localctx, 46);
				{
				setState(1270);
				paramlinewidth(pstctx);
				}
				break;
			case T__171:
				enterOuterAlt(_localctx, 47);
				{
				setState(1271);
				paramlinecolor(pstctx);
				}
				break;
			case T__172:
				enterOuterAlt(_localctx, 48);
				{
				setState(1272);
				paramshowpoints(pstctx);
				}
				break;
			case T__173:
				enterOuterAlt(_localctx, 49);
				{
				setState(1273);
				paramlinearc(pstctx);
				}
				break;
			case T__174:
				enterOuterAlt(_localctx, 50);
				{
				setState(1274);
				paramcornersize(pstctx);
				}
				break;
			case T__177:
				enterOuterAlt(_localctx, 51);
				{
				setState(1275);
				paramarcsepA(pstctx);
				}
				break;
			case T__178:
				enterOuterAlt(_localctx, 52);
				{
				setState(1276);
				paramarcsepB(pstctx);
				}
				break;
			case T__179:
				enterOuterAlt(_localctx, 53);
				{
				setState(1277);
				paramarcsep(pstctx);
				}
				break;
			case T__180:
				enterOuterAlt(_localctx, 54);
				{
				setState(1278);
				paramcurvature(pstctx);
				}
				break;
			case T__181:
				enterOuterAlt(_localctx, 55);
				{
				setState(1279);
				paramdotstyle(pstctx);
				}
				break;
			case T__197:
				enterOuterAlt(_localctx, 56);
				{
				setState(1280);
				paramdotscale(pstctx);
				}
				break;
			case T__198:
				enterOuterAlt(_localctx, 57);
				{
				setState(1281);
				paramdotdotangle(pstctx);
				}
				break;
			case T__199:
				enterOuterAlt(_localctx, 58);
				{
				setState(1282);
				paramgridwidth(pstctx);
				}
				break;
			case T__200:
				enterOuterAlt(_localctx, 59);
				{
				setState(1283);
				paramgridcolor(pstctx);
				}
				break;
			case T__201:
				enterOuterAlt(_localctx, 60);
				{
				setState(1284);
				paramgriddots(pstctx);
				}
				break;
			case T__202:
				enterOuterAlt(_localctx, 61);
				{
				setState(1285);
				paramgridlabels(pstctx);
				}
				break;
			case T__203:
				enterOuterAlt(_localctx, 62);
				{
				setState(1286);
				paramgridlabelcolor(pstctx);
				}
				break;
			case T__204:
				enterOuterAlt(_localctx, 63);
				{
				setState(1287);
				paramsubgriddiv(pstctx);
				}
				break;
			case T__205:
				enterOuterAlt(_localctx, 64);
				{
				setState(1288);
				paramsubgridwidth(pstctx);
				}
				break;
			case T__206:
				enterOuterAlt(_localctx, 65);
				{
				setState(1289);
				paramsubgridcolor(pstctx);
				}
				break;
			case T__207:
				enterOuterAlt(_localctx, 66);
				{
				setState(1290);
				paramsubgriddots(pstctx);
				}
				break;
			case T__208:
				enterOuterAlt(_localctx, 67);
				{
				setState(1291);
				paramplotstyle(pstctx);
				}
				break;
			case T__215:
				enterOuterAlt(_localctx, 68);
				{
				setState(1292);
				paramplotpoints(pstctx);
				}
				break;
			case T__216:
				enterOuterAlt(_localctx, 69);
				{
				setState(1293);
				paramgradbegin(pstctx);
				}
				break;
			case T__217:
				enterOuterAlt(_localctx, 70);
				{
				setState(1294);
				paramgradend(pstctx);
				}
				break;
			case T__218:
				enterOuterAlt(_localctx, 71);
				{
				setState(1295);
				paramgradlines(pstctx);
				}
				break;
			case T__219:
				enterOuterAlt(_localctx, 72);
				{
				setState(1296);
				paramgradmidpoint(pstctx);
				}
				break;
			case T__220:
				enterOuterAlt(_localctx, 73);
				{
				setState(1297);
				paramgradangle(pstctx);
				}
				break;
			case T__221:
				enterOuterAlt(_localctx, 74);
				{
				setState(1298);
				paramdotsize(pstctx);
				}
				break;
			case T__222:
				enterOuterAlt(_localctx, 75);
				{
				setState(1299);
				paramgangle(pstctx);
				}
				break;
			case T__223:
				enterOuterAlt(_localctx, 76);
				{
				setState(1300);
				paramstrokeopacity(pstctx);
				}
				break;
			case T__224:
				enterOuterAlt(_localctx, 77);
				{
				setState(1301);
				paramopacity(pstctx);
				}
				break;
			case T__225:
				enterOuterAlt(_localctx, 78);
				{
				setState(1302);
				paramdx(pstctx);
				}
				break;
			case T__226:
				enterOuterAlt(_localctx, 79);
				{
				setState(1303);
				paramdy(pstctx);
				}
				break;
			case T__227:
				enterOuterAlt(_localctx, 80);
				{
				setState(1304);
				paramDx(pstctx);
				}
				break;
			case T__228:
				enterOuterAlt(_localctx, 81);
				{
				setState(1305);
				paramDy(pstctx);
				}
				break;
			case T__229:
				enterOuterAlt(_localctx, 82);
				{
				setState(1306);
				paramOx(pstctx);
				}
				break;
			case T__230:
				enterOuterAlt(_localctx, 83);
				{
				setState(1307);
				paramOy(pstctx);
				}
				break;
			case T__231:
				enterOuterAlt(_localctx, 84);
				{
				setState(1308);
				parampolarplot(pstctx);
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 85);
				{
				setState(1309);
				unknownParamSetting(pstctx);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknownParamSettingContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token name;
		public List<TerminalNode> WORD() { return getTokens(PSTParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PSTParser.WORD, i);
		}
		public List<ValueDimContext> valueDim() {
			return getRuleContexts(ValueDimContext.class);
		}
		public ValueDimContext valueDim(int i) {
			return getRuleContext(ValueDimContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PSTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PSTParser.NUMBER, i);
		}
		public List<BooleanvalueContext> booleanvalue() {
			return getRuleContexts(BooleanvalueContext.class);
		}
		public BooleanvalueContext booleanvalue(int i) {
			return getRuleContext(BooleanvalueContext.class,i);
		}
		public UnknownParamSettingContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public UnknownParamSettingContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_unknownParamSetting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterUnknownParamSetting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitUnknownParamSetting(this);
		}
	}

	public final UnknownParamSettingContext unknownParamSetting(PSTContext pstctx) throws RecognitionException {
		UnknownParamSettingContext _localctx = new UnknownParamSettingContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 158, RULE_unknownParamSetting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			((UnknownParamSettingContext)_localctx).name = match(WORD);
			setState(1313);
			match(T__112);
			setState(1318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1314);
					valueDim();
					}
					break;
				case 2:
					{
					setState(1315);
					match(NUMBER);
					}
					break;
				case 3:
					{
					setState(1316);
					booleanvalue();
					}
					break;
				case 4:
					{
					setState(1317);
					match(WORD);
					}
					break;
				}
				}
				setState(1320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (T__277 - 278)) | (1L << (T__278 - 278)) | (1L << (WORD - 278)) | (1L << (NUMBER - 278)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamArrowContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ArrowvalueContext arrowvalue() {
			return getRuleContext(ArrowvalueContext.class,0);
		}
		public ParamArrowContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamArrowContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamArrow(this);
		}
	}

	public final ParamArrowContext paramArrow(PSTContext pstctx) throws RecognitionException {
		ParamArrowContext _localctx = new ParamArrowContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 160, RULE_paramArrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			match(T__113);
			setState(1323);
			match(T__112);
			setState(1324);
			arrowvalue(pstctx);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamArrowscaleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext sx;
		public ValueDimContext sy;
		public List<ValueDimContext> valueDim() {
			return getRuleContexts(ValueDimContext.class);
		}
		public ValueDimContext valueDim(int i) {
			return getRuleContext(ValueDimContext.class,i);
		}
		public ParamArrowscaleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamArrowscaleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramArrowscale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamArrowscale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamArrowscale(this);
		}
	}

	public final ParamArrowscaleContext paramArrowscale(PSTContext pstctx) throws RecognitionException {
		ParamArrowscaleContext _localctx = new ParamArrowscaleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 162, RULE_paramArrowscale);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(T__114);
			setState(1327);
			match(T__112);
			setState(1328);
			((ParamArrowscaleContext)_localctx).sx = valueDim();
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1329);
				((ParamArrowscaleContext)_localctx).sy = valueDim();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamRbracketlengthContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamRbracketlengthContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamRbracketlengthContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramRbracketlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamRbracketlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamRbracketlength(this);
		}
	}

	public final ParamRbracketlengthContext paramRbracketlength(PSTContext pstctx) throws RecognitionException {
		ParamRbracketlengthContext _localctx = new ParamRbracketlengthContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 164, RULE_paramRbracketlength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			match(T__115);
			setState(1333);
			match(T__112);
			setState(1334);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamBracketlengthContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamBracketlengthContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamBracketlengthContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramBracketlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamBracketlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamBracketlength(this);
		}
	}

	public final ParamBracketlengthContext paramBracketlength(PSTContext pstctx) throws RecognitionException {
		ParamBracketlengthContext _localctx = new ParamBracketlengthContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 166, RULE_paramBracketlength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(T__116);
			setState(1337);
			match(T__112);
			setState(1338);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamArrowinsetContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamArrowinsetContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamArrowinsetContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramArrowinset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamArrowinset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamArrowinset(this);
		}
	}

	public final ParamArrowinsetContext paramArrowinset(PSTContext pstctx) throws RecognitionException {
		ParamArrowinsetContext _localctx = new ParamArrowinsetContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 168, RULE_paramArrowinset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			match(T__117);
			setState(1341);
			match(T__112);
			setState(1342);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamArrowlengthContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamArrowlengthContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamArrowlengthContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramArrowlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamArrowlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamArrowlength(this);
		}
	}

	public final ParamArrowlengthContext paramArrowlength(PSTContext pstctx) throws RecognitionException {
		ParamArrowlengthContext _localctx = new ParamArrowlengthContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 170, RULE_paramArrowlength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			match(T__118);
			setState(1345);
			match(T__112);
			setState(1346);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamtbarsizeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamtbarsizeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamtbarsizeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramtbarsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamtbarsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamtbarsize(this);
		}
	}

	public final ParamtbarsizeContext paramtbarsize(PSTContext pstctx) throws RecognitionException {
		ParamtbarsizeContext _localctx = new ParamtbarsizeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 172, RULE_paramtbarsize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(T__119);
			setState(1349);
			match(T__112);
			setState(1350);
			valueDim();
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1351);
				match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamarrowsizeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamarrowsizeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamarrowsizeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramarrowsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamarrowsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamarrowsize(this);
		}
	}

	public final ParamarrowsizeContext paramarrowsize(PSTContext pstctx) throws RecognitionException {
		ParamarrowsizeContext _localctx = new ParamarrowsizeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 174, RULE_paramarrowsize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(T__120);
			setState(1355);
			match(T__112);
			setState(1356);
			valueDim();
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1357);
				match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamunitContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamunitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamunitContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamunit(this);
		}
	}

	public final ParamunitContext paramunit(PSTContext pstctx) throws RecognitionException {
		ParamunitContext _localctx = new ParamunitContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 176, RULE_paramunit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(T__121);
			setState(1361);
			match(T__112);
			setState(1362);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamxunitContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamxunitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamxunitContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramxunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamxunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamxunit(this);
		}
	}

	public final ParamxunitContext paramxunit(PSTContext pstctx) throws RecognitionException {
		ParamxunitContext _localctx = new ParamxunitContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 178, RULE_paramxunit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			match(T__122);
			setState(1365);
			match(T__112);
			setState(1366);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamyunitContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamyunitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamyunitContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramyunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamyunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamyunit(this);
		}
	}

	public final ParamyunitContext paramyunit(PSTContext pstctx) throws RecognitionException {
		ParamyunitContext _localctx = new ParamyunitContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 180, RULE_paramyunit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(T__123);
			setState(1369);
			match(T__112);
			setState(1370);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamaddfillstyleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public FillstyleContext fillstyle() {
			return getRuleContext(FillstyleContext.class,0);
		}
		public ParamaddfillstyleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamaddfillstyleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramaddfillstyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamaddfillstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamaddfillstyle(this);
		}
	}

	public final ParamaddfillstyleContext paramaddfillstyle(PSTContext pstctx) throws RecognitionException {
		ParamaddfillstyleContext _localctx = new ParamaddfillstyleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 182, RULE_paramaddfillstyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(T__124);
			setState(1373);
			match(T__112);
			setState(1374);
			fillstyle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamborderContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamborderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamborderContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramborder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamborder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamborder(this);
		}
	}

	public final ParamborderContext paramborder(PSTContext pstctx) throws RecognitionException {
		ParamborderContext _localctx = new ParamborderContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 184, RULE_paramborder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			match(T__125);
			setState(1377);
			match(T__112);
			setState(1378);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdotsepContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamdotsepContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdotsepContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdotsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdotsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdotsep(this);
		}
	}

	public final ParamdotsepContext paramdotsep(PSTContext pstctx) throws RecognitionException {
		ParamdotsepContext _localctx = new ParamdotsepContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 186, RULE_paramdotsep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(T__126);
			setState(1381);
			match(T__112);
			setState(1382);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdashContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext dash1;
		public ValueDimContext dash2;
		public List<ValueDimContext> valueDim() {
			return getRuleContexts(ValueDimContext.class);
		}
		public ValueDimContext valueDim(int i) {
			return getRuleContext(ValueDimContext.class,i);
		}
		public ParamdashContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdashContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdash(this);
		}
	}

	public final ParamdashContext paramdash(PSTContext pstctx) throws RecognitionException {
		ParamdashContext _localctx = new ParamdashContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 188, RULE_paramdash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			match(T__127);
			setState(1385);
			match(T__112);
			setState(1386);
			((ParamdashContext)_localctx).dash1 = valueDim();
			setState(1387);
			((ParamdashContext)_localctx).dash2 = valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamframearcContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamframearcContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamframearcContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramframearc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamframearc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamframearc(this);
		}
	}

	public final ParamframearcContext paramframearc(PSTContext pstctx) throws RecognitionException {
		ParamframearcContext _localctx = new ParamframearcContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 190, RULE_paramframearc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			match(T__128);
			setState(1390);
			match(T__112);
			setState(1391);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamoriginContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext x;
		public ValueDimContext y;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public List<ValueDimContext> valueDim() {
			return getRuleContexts(ValueDimContext.class);
		}
		public ValueDimContext valueDim(int i) {
			return getRuleContext(ValueDimContext.class,i);
		}
		public ParamoriginContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamoriginContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramorigin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamorigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamorigin(this);
		}
	}

	public final ParamoriginContext paramorigin(PSTContext pstctx) throws RecognitionException {
		ParamoriginContext _localctx = new ParamoriginContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 192, RULE_paramorigin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(T__129);
			setState(1394);
			match(T__112);
			setState(1395);
			match(BRACE_OPEN);
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1396);
				((ParamoriginContext)_localctx).x = valueDim();
				}
			}

			setState(1399);
			match(T__102);
			setState(1401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1400);
				((ParamoriginContext)_localctx).y = valueDim();
				}
			}

			setState(1403);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamswapaxesContext extends ParserRuleContext {
		public PSTContext pstctx;
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public ParamswapaxesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamswapaxesContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramswapaxes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamswapaxes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamswapaxes(this);
		}
	}

	public final ParamswapaxesContext paramswapaxes(PSTContext pstctx) throws RecognitionException {
		ParamswapaxesContext _localctx = new ParamswapaxesContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 194, RULE_paramswapaxes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(T__130);
			setState(1406);
			match(T__112);
			setState(1407);
			booleanvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlinestyleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token style;
		public ParamlinestyleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamlinestyleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramlinestyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamlinestyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamlinestyle(this);
		}
	}

	public final ParamlinestyleContext paramlinestyle(PSTContext pstctx) throws RecognitionException {
		ParamlinestyleContext _localctx = new ParamlinestyleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 196, RULE_paramlinestyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(T__131);
			setState(1410);
			match(T__112);
			setState(1411);
			((ParamlinestyleContext)_localctx).style = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (T__132 - 133)) | (1L << (T__133 - 133)) | (1L << (T__134 - 133)) | (1L << (T__135 - 133)))) != 0)) ) {
				((ParamlinestyleContext)_localctx).style = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParambordercolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParambordercolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParambordercolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_parambordercolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParambordercolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParambordercolor(this);
		}
	}

	public final ParambordercolorContext parambordercolor(PSTContext pstctx) throws RecognitionException {
		ParambordercolorContext _localctx = new ParambordercolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 198, RULE_parambordercolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(T__136);
			setState(1414);
			match(T__112);
			setState(1415);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdoublelineContext extends ParserRuleContext {
		public PSTContext pstctx;
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public ParamdoublelineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdoublelineContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdoubleline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdoubleline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdoubleline(this);
		}
	}

	public final ParamdoublelineContext paramdoubleline(PSTContext pstctx) throws RecognitionException {
		ParamdoublelineContext _localctx = new ParamdoublelineContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 200, RULE_paramdoubleline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(T__137);
			setState(1418);
			match(T__112);
			setState(1419);
			booleanvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdoublesepContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamdoublesepContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdoublesepContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdoublesep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdoublesep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdoublesep(this);
		}
	}

	public final ParamdoublesepContext paramdoublesep(PSTContext pstctx) throws RecognitionException {
		ParamdoublesepContext _localctx = new ParamdoublesepContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 202, RULE_paramdoublesep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(T__138);
			setState(1422);
			match(T__112);
			setState(1423);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdoublecolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamdoublecolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdoublecolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdoublecolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdoublecolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdoublecolor(this);
		}
	}

	public final ParamdoublecolorContext paramdoublecolor(PSTContext pstctx) throws RecognitionException {
		ParamdoublecolorContext _localctx = new ParamdoublecolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 204, RULE_paramdoublecolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(T__139);
			setState(1426);
			match(T__112);
			setState(1427);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamshadowContext extends ParserRuleContext {
		public PSTContext pstctx;
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public ParamshadowContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamshadowContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramshadow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamshadow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamshadow(this);
		}
	}

	public final ParamshadowContext paramshadow(PSTContext pstctx) throws RecognitionException {
		ParamshadowContext _localctx = new ParamshadowContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 206, RULE_paramshadow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(T__140);
			setState(1430);
			match(T__112);
			setState(1431);
			booleanvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamshadowsizeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamshadowsizeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamshadowsizeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramshadowsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamshadowsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamshadowsize(this);
		}
	}

	public final ParamshadowsizeContext paramshadowsize(PSTContext pstctx) throws RecognitionException {
		ParamshadowsizeContext _localctx = new ParamshadowsizeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 208, RULE_paramshadowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(T__141);
			setState(1434);
			match(T__112);
			setState(1435);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamshadowangleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamshadowangleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamshadowangleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramshadowangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamshadowangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamshadowangle(this);
		}
	}

	public final ParamshadowangleContext paramshadowangle(PSTContext pstctx) throws RecognitionException {
		ParamshadowangleContext _localctx = new ParamshadowangleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 210, RULE_paramshadowangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(T__142);
			setState(1438);
			match(T__112);
			setState(1439);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamshadowcolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamshadowcolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamshadowcolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramshadowcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamshadowcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamshadowcolor(this);
		}
	}

	public final ParamshadowcolorContext paramshadowcolor(PSTContext pstctx) throws RecognitionException {
		ParamshadowcolorContext _localctx = new ParamshadowcolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 212, RULE_paramshadowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(T__143);
			setState(1442);
			match(T__112);
			setState(1443);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdimenContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token type;
		public ParamdimenContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdimenContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdimen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdimen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdimen(this);
		}
	}

	public final ParamdimenContext paramdimen(PSTContext pstctx) throws RecognitionException {
		ParamdimenContext _localctx = new ParamdimenContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 214, RULE_paramdimen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(T__144);
			setState(1446);
			match(T__112);
			setState(1447);
			((ParamdimenContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (T__145 - 146)) | (1L << (T__146 - 146)) | (1L << (T__147 - 146)))) != 0)) ) {
				((ParamdimenContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamfillstyleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public FillstyleContext fillstyle() {
			return getRuleContext(FillstyleContext.class,0);
		}
		public ParamfillstyleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamfillstyleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramfillstyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamfillstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamfillstyle(this);
		}
	}

	public final ParamfillstyleContext paramfillstyle(PSTContext pstctx) throws RecognitionException {
		ParamfillstyleContext _localctx = new ParamfillstyleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 216, RULE_paramfillstyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			match(T__148);
			setState(1450);
			match(T__112);
			setState(1451);
			fillstyle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamfillcolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamfillcolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamfillcolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramfillcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamfillcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamfillcolor(this);
		}
	}

	public final ParamfillcolorContext paramfillcolor(PSTContext pstctx) throws RecognitionException {
		ParamfillcolorContext _localctx = new ParamfillcolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 218, RULE_paramfillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			match(T__149);
			setState(1454);
			match(T__112);
			setState(1455);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamhatchwidthContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamhatchwidthContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamhatchwidthContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramhatchwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamhatchwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamhatchwidth(this);
		}
	}

	public final ParamhatchwidthContext paramhatchwidth(PSTContext pstctx) throws RecognitionException {
		ParamhatchwidthContext _localctx = new ParamhatchwidthContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 220, RULE_paramhatchwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			match(T__150);
			setState(1458);
			match(T__112);
			setState(1459);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamhatchsepContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamhatchsepContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamhatchsepContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramhatchsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamhatchsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamhatchsep(this);
		}
	}

	public final ParamhatchsepContext paramhatchsep(PSTContext pstctx) throws RecognitionException {
		ParamhatchsepContext _localctx = new ParamhatchsepContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 222, RULE_paramhatchsep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			match(T__151);
			setState(1462);
			match(T__112);
			setState(1463);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamhatchcolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamhatchcolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamhatchcolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramhatchcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamhatchcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamhatchcolor(this);
		}
	}

	public final ParamhatchcolorContext paramhatchcolor(PSTContext pstctx) throws RecognitionException {
		ParamhatchcolorContext _localctx = new ParamhatchcolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 224, RULE_paramhatchcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			match(T__152);
			setState(1466);
			match(T__112);
			setState(1467);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamhatchangleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamhatchangleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamhatchangleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramhatchangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamhatchangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamhatchangle(this);
		}
	}

	public final ParamhatchangleContext paramhatchangle(PSTContext pstctx) throws RecognitionException {
		ParamhatchangleContext _localctx = new ParamhatchangleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 226, RULE_paramhatchangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(T__153);
			setState(1470);
			match(T__112);
			setState(1471);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamliftpenContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamliftpenContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamliftpenContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramliftpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamliftpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamliftpen(this);
		}
	}

	public final ParamliftpenContext paramliftpen(PSTContext pstctx) throws RecognitionException {
		ParamliftpenContext _localctx = new ParamliftpenContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 228, RULE_paramliftpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			match(T__154);
			setState(1474);
			match(T__112);
			setState(1475);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlabelsepContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamlabelsepContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamlabelsepContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramlabelsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamlabelsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamlabelsep(this);
		}
	}

	public final ParamlabelsepContext paramlabelsep(PSTContext pstctx) throws RecognitionException {
		ParamlabelsepContext _localctx = new ParamlabelsepContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 230, RULE_paramlabelsep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(T__155);
			setState(1478);
			match(T__112);
			setState(1479);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlabelsContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public ParamlabelsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamlabelsContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramlabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamlabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamlabels(this);
		}
	}

	public final ParamlabelsContext paramlabels(PSTContext pstctx) throws RecognitionException {
		ParamlabelsContext _localctx = new ParamlabelsContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 232, RULE_paramlabels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			match(T__156);
			setState(1482);
			match(T__112);
			setState(1483);
			show();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamticksContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public ParamticksContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamticksContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramticks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamticks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamticks(this);
		}
	}

	public final ParamticksContext paramticks(PSTContext pstctx) throws RecognitionException {
		ParamticksContext _localctx = new ParamticksContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 234, RULE_paramticks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			match(T__157);
			setState(1486);
			match(T__112);
			setState(1487);
			show();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamtickstyleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token style;
		public ParamtickstyleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamtickstyleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramtickstyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamtickstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamtickstyle(this);
		}
	}

	public final ParamtickstyleContext paramtickstyle(PSTContext pstctx) throws RecognitionException {
		ParamtickstyleContext _localctx = new ParamtickstyleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 236, RULE_paramtickstyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			match(T__158);
			setState(1490);
			match(T__112);
			setState(1491);
			((ParamtickstyleContext)_localctx).style = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (T__159 - 160)) | (1L << (T__160 - 160)) | (1L << (T__161 - 160)))) != 0)) ) {
				((ParamtickstyleContext)_localctx).style = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamshoworiginContext extends ParserRuleContext {
		public PSTContext pstctx;
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public ParamshoworiginContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamshoworiginContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramshoworigin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamshoworigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamshoworigin(this);
		}
	}

	public final ParamshoworiginContext paramshoworigin(PSTContext pstctx) throws RecognitionException {
		ParamshoworiginContext _localctx = new ParamshoworiginContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 238, RULE_paramshoworigin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(T__162);
			setState(1494);
			match(T__112);
			setState(1495);
			booleanvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamticksizeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamticksizeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamticksizeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramticksize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamticksize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamticksize(this);
		}
	}

	public final ParamticksizeContext paramticksize(PSTContext pstctx) throws RecognitionException {
		ParamticksizeContext _localctx = new ParamticksizeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 240, RULE_paramticksize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(T__163);
			setState(1498);
			match(T__112);
			setState(1499);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamaxesstyleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token style;
		public ParamaxesstyleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamaxesstyleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramaxesstyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamaxesstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamaxesstyle(this);
		}
	}

	public final ParamaxesstyleContext paramaxesstyle(PSTContext pstctx) throws RecognitionException {
		ParamaxesstyleContext _localctx = new ParamaxesstyleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 242, RULE_paramaxesstyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			match(T__164);
			setState(1502);
			match(T__112);
			setState(1503);
			((ParamaxesstyleContext)_localctx).style = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (T__132 - 133)) | (1L << (T__165 - 133)) | (1L << (T__166 - 133)))) != 0)) ) {
				((ParamaxesstyleContext)_localctx).style = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamframesepContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamframesepContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamframesepContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramframesep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamframesep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamframesep(this);
		}
	}

	public final ParamframesepContext paramframesep(PSTContext pstctx) throws RecognitionException {
		ParamframesepContext _localctx = new ParamframesepContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 244, RULE_paramframesep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			match(T__167);
			setState(1506);
			match(T__112);
			setState(1507);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamboxsepContext extends ParserRuleContext {
		public PSTContext pstctx;
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public ParamboxsepContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamboxsepContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramboxsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamboxsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamboxsep(this);
		}
	}

	public final ParamboxsepContext paramboxsep(PSTContext pstctx) throws RecognitionException {
		ParamboxsepContext _localctx = new ParamboxsepContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 246, RULE_paramboxsep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(T__168);
			setState(1510);
			match(T__112);
			setState(1511);
			booleanvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamrunitContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamrunitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamrunitContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramrunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamrunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamrunit(this);
		}
	}

	public final ParamrunitContext paramrunit(PSTContext pstctx) throws RecognitionException {
		ParamrunitContext _localctx = new ParamrunitContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 248, RULE_paramrunit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			match(T__169);
			setState(1514);
			match(T__112);
			setState(1515);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlinewidthContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamlinewidthContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamlinewidthContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramlinewidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamlinewidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamlinewidth(this);
		}
	}

	public final ParamlinewidthContext paramlinewidth(PSTContext pstctx) throws RecognitionException {
		ParamlinewidthContext _localctx = new ParamlinewidthContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 250, RULE_paramlinewidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			match(T__170);
			setState(1518);
			match(T__112);
			setState(1519);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlinecolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamlinecolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamlinecolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramlinecolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamlinecolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamlinecolor(this);
		}
	}

	public final ParamlinecolorContext paramlinecolor(PSTContext pstctx) throws RecognitionException {
		ParamlinecolorContext _localctx = new ParamlinecolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 252, RULE_paramlinecolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(T__171);
			setState(1522);
			match(T__112);
			setState(1523);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamshowpointsContext extends ParserRuleContext {
		public PSTContext pstctx;
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public ParamshowpointsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamshowpointsContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramshowpoints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamshowpoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamshowpoints(this);
		}
	}

	public final ParamshowpointsContext paramshowpoints(PSTContext pstctx) throws RecognitionException {
		ParamshowpointsContext _localctx = new ParamshowpointsContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 254, RULE_paramshowpoints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(T__172);
			setState(1526);
			match(T__112);
			setState(1527);
			booleanvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamlinearcContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamlinearcContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamlinearcContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramlinearc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamlinearc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamlinearc(this);
		}
	}

	public final ParamlinearcContext paramlinearc(PSTContext pstctx) throws RecognitionException {
		ParamlinearcContext _localctx = new ParamlinearcContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 256, RULE_paramlinearc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			match(T__173);
			setState(1530);
			match(T__112);
			setState(1531);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamcornersizeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token type;
		public ParamcornersizeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamcornersizeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramcornersize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamcornersize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamcornersize(this);
		}
	}

	public final ParamcornersizeContext paramcornersize(PSTContext pstctx) throws RecognitionException {
		ParamcornersizeContext _localctx = new ParamcornersizeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 258, RULE_paramcornersize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(T__174);
			setState(1534);
			match(T__112);
			setState(1535);
			((ParamcornersizeContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__175 || _la==T__176) ) {
				((ParamcornersizeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamarcsepAContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamarcsepAContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamarcsepAContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramarcsepA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamarcsepA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamarcsepA(this);
		}
	}

	public final ParamarcsepAContext paramarcsepA(PSTContext pstctx) throws RecognitionException {
		ParamarcsepAContext _localctx = new ParamarcsepAContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 260, RULE_paramarcsepA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(T__177);
			setState(1538);
			match(T__112);
			setState(1539);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamarcsepBContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamarcsepBContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamarcsepBContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramarcsepB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamarcsepB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamarcsepB(this);
		}
	}

	public final ParamarcsepBContext paramarcsepB(PSTContext pstctx) throws RecognitionException {
		ParamarcsepBContext _localctx = new ParamarcsepBContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 262, RULE_paramarcsepB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			match(T__178);
			setState(1542);
			match(T__112);
			setState(1543);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamarcsepContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamarcsepContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamarcsepContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramarcsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamarcsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamarcsep(this);
		}
	}

	public final ParamarcsepContext paramarcsep(PSTContext pstctx) throws RecognitionException {
		ParamarcsepContext _localctx = new ParamarcsepContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 264, RULE_paramarcsep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			match(T__179);
			setState(1546);
			match(T__112);
			setState(1547);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamcurvatureContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token num1;
		public Token num2;
		public Token num3;
		public List<TerminalNode> NUMBER() { return getTokens(PSTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PSTParser.NUMBER, i);
		}
		public ParamcurvatureContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamcurvatureContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramcurvature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamcurvature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamcurvature(this);
		}
	}

	public final ParamcurvatureContext paramcurvature(PSTContext pstctx) throws RecognitionException {
		ParamcurvatureContext _localctx = new ParamcurvatureContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 266, RULE_paramcurvature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(T__180);
			setState(1550);
			match(T__112);
			setState(1551);
			((ParamcurvatureContext)_localctx).num1 = match(NUMBER);
			setState(1552);
			((ParamcurvatureContext)_localctx).num2 = match(NUMBER);
			setState(1553);
			((ParamcurvatureContext)_localctx).num3 = match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdotstyleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token style;
		public ParamdotstyleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdotstyleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdotstyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdotstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdotstyle(this);
		}
	}

	public final ParamdotstyleContext paramdotstyle(PSTContext pstctx) throws RecognitionException {
		ParamdotstyleContext _localctx = new ParamdotstyleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 268, RULE_paramdotstyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(T__181);
			setState(1556);
			match(T__112);
			setState(1557);
			((ParamdotstyleContext)_localctx).style = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__28 || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (T__182 - 183)) | (1L << (T__183 - 183)) | (1L << (T__184 - 183)) | (1L << (T__185 - 183)) | (1L << (T__186 - 183)) | (1L << (T__187 - 183)) | (1L << (T__188 - 183)) | (1L << (T__189 - 183)) | (1L << (T__190 - 183)) | (1L << (T__191 - 183)) | (1L << (T__192 - 183)) | (1L << (T__193 - 183)) | (1L << (T__194 - 183)) | (1L << (T__195 - 183)) | (1L << (T__196 - 183)))) != 0)) ) {
				((ParamdotstyleContext)_localctx).style = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdotscaleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token num1;
		public Token num2;
		public List<TerminalNode> NUMBER() { return getTokens(PSTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PSTParser.NUMBER, i);
		}
		public ParamdotscaleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdotscaleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdotscale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdotscale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdotscale(this);
		}
	}

	public final ParamdotscaleContext paramdotscale(PSTContext pstctx) throws RecognitionException {
		ParamdotscaleContext _localctx = new ParamdotscaleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 270, RULE_paramdotscale);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			match(T__197);
			setState(1560);
			match(T__112);
			setState(1561);
			((ParamdotscaleContext)_localctx).num1 = match(NUMBER);
			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1562);
				((ParamdotscaleContext)_localctx).num2 = match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdotdotangleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamdotdotangleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdotdotangleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdotdotangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdotdotangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdotdotangle(this);
		}
	}

	public final ParamdotdotangleContext paramdotdotangle(PSTContext pstctx) throws RecognitionException {
		ParamdotdotangleContext _localctx = new ParamdotdotangleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 272, RULE_paramdotdotangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(T__198);
			setState(1566);
			match(T__112);
			setState(1567);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgridwidthContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamgridwidthContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgridwidthContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgridwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgridwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgridwidth(this);
		}
	}

	public final ParamgridwidthContext paramgridwidth(PSTContext pstctx) throws RecognitionException {
		ParamgridwidthContext _localctx = new ParamgridwidthContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 274, RULE_paramgridwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			match(T__199);
			setState(1570);
			match(T__112);
			setState(1571);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgridcolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamgridcolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgridcolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgridcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgridcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgridcolor(this);
		}
	}

	public final ParamgridcolorContext paramgridcolor(PSTContext pstctx) throws RecognitionException {
		ParamgridcolorContext _localctx = new ParamgridcolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 276, RULE_paramgridcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(T__200);
			setState(1574);
			match(T__112);
			setState(1575);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgriddotsContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamgriddotsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgriddotsContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgriddots; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgriddots(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgriddots(this);
		}
	}

	public final ParamgriddotsContext paramgriddots(PSTContext pstctx) throws RecognitionException {
		ParamgriddotsContext _localctx = new ParamgriddotsContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 278, RULE_paramgriddots);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(T__201);
			setState(1578);
			match(T__112);
			setState(1579);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgridlabelsContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamgridlabelsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgridlabelsContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgridlabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgridlabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgridlabels(this);
		}
	}

	public final ParamgridlabelsContext paramgridlabels(PSTContext pstctx) throws RecognitionException {
		ParamgridlabelsContext _localctx = new ParamgridlabelsContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 280, RULE_paramgridlabels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			match(T__202);
			setState(1582);
			match(T__112);
			setState(1583);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgridlabelcolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamgridlabelcolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgridlabelcolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgridlabelcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgridlabelcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgridlabelcolor(this);
		}
	}

	public final ParamgridlabelcolorContext paramgridlabelcolor(PSTContext pstctx) throws RecognitionException {
		ParamgridlabelcolorContext _localctx = new ParamgridlabelcolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 282, RULE_paramgridlabelcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(T__203);
			setState(1586);
			match(T__112);
			setState(1587);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsubgriddivContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamsubgriddivContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamsubgriddivContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramsubgriddiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamsubgriddiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamsubgriddiv(this);
		}
	}

	public final ParamsubgriddivContext paramsubgriddiv(PSTContext pstctx) throws RecognitionException {
		ParamsubgriddivContext _localctx = new ParamsubgriddivContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 284, RULE_paramsubgriddiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(T__204);
			setState(1590);
			match(T__112);
			setState(1591);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsubgridwidthContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamsubgridwidthContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamsubgridwidthContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramsubgridwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamsubgridwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamsubgridwidth(this);
		}
	}

	public final ParamsubgridwidthContext paramsubgridwidth(PSTContext pstctx) throws RecognitionException {
		ParamsubgridwidthContext _localctx = new ParamsubgridwidthContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 286, RULE_paramsubgridwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			match(T__205);
			setState(1594);
			match(T__112);
			setState(1595);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsubgridcolorContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamsubgridcolorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamsubgridcolorContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramsubgridcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamsubgridcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamsubgridcolor(this);
		}
	}

	public final ParamsubgridcolorContext paramsubgridcolor(PSTContext pstctx) throws RecognitionException {
		ParamsubgridcolorContext _localctx = new ParamsubgridcolorContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 288, RULE_paramsubgridcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			match(T__206);
			setState(1598);
			match(T__112);
			setState(1599);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsubgriddotsContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamsubgriddotsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamsubgriddotsContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramsubgriddots; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamsubgriddots(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamsubgriddots(this);
		}
	}

	public final ParamsubgriddotsContext paramsubgriddots(PSTContext pstctx) throws RecognitionException {
		ParamsubgriddotsContext _localctx = new ParamsubgriddotsContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 290, RULE_paramsubgriddots);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			match(T__207);
			setState(1602);
			match(T__112);
			setState(1603);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamplotstyleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public Token style;
		public ParamplotstyleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamplotstyleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramplotstyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamplotstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamplotstyle(this);
		}
	}

	public final ParamplotstyleContext paramplotstyle(PSTContext pstctx) throws RecognitionException {
		ParamplotstyleContext _localctx = new ParamplotstyleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 292, RULE_paramplotstyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			match(T__208);
			setState(1606);
			match(T__112);
			setState(1607);
			((ParamplotstyleContext)_localctx).style = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (T__209 - 210)) | (1L << (T__210 - 210)) | (1L << (T__211 - 210)) | (1L << (T__212 - 210)) | (1L << (T__213 - 210)) | (1L << (T__214 - 210)))) != 0)) ) {
				((ParamplotstyleContext)_localctx).style = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamplotpointsContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamplotpointsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamplotpointsContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramplotpoints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamplotpoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamplotpoints(this);
		}
	}

	public final ParamplotpointsContext paramplotpoints(PSTContext pstctx) throws RecognitionException {
		ParamplotpointsContext _localctx = new ParamplotpointsContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 294, RULE_paramplotpoints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(T__215);
			setState(1610);
			match(T__112);
			setState(1611);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgradbeginContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamgradbeginContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgradbeginContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgradbegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgradbegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgradbegin(this);
		}
	}

	public final ParamgradbeginContext paramgradbegin(PSTContext pstctx) throws RecognitionException {
		ParamgradbeginContext _localctx = new ParamgradbeginContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 296, RULE_paramgradbegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			match(T__216);
			setState(1614);
			match(T__112);
			setState(1615);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgradendContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode WORD() { return getToken(PSTParser.WORD, 0); }
		public ParamgradendContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgradendContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgradend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgradend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgradend(this);
		}
	}

	public final ParamgradendContext paramgradend(PSTContext pstctx) throws RecognitionException {
		ParamgradendContext _localctx = new ParamgradendContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 298, RULE_paramgradend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			match(T__217);
			setState(1618);
			match(T__112);
			setState(1619);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgradlinesContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamgradlinesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgradlinesContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgradlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgradlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgradlines(this);
		}
	}

	public final ParamgradlinesContext paramgradlines(PSTContext pstctx) throws RecognitionException {
		ParamgradlinesContext _localctx = new ParamgradlinesContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 300, RULE_paramgradlines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			match(T__218);
			setState(1622);
			match(T__112);
			setState(1623);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgradmidpointContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamgradmidpointContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgradmidpointContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgradmidpoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgradmidpoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgradmidpoint(this);
		}
	}

	public final ParamgradmidpointContext paramgradmidpoint(PSTContext pstctx) throws RecognitionException {
		ParamgradmidpointContext _localctx = new ParamgradmidpointContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 302, RULE_paramgradmidpoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			match(T__219);
			setState(1626);
			match(T__112);
			setState(1627);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgradangleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamgradangleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgradangleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgradangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgradangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgradangle(this);
		}
	}

	public final ParamgradangleContext paramgradangle(PSTContext pstctx) throws RecognitionException {
		ParamgradangleContext _localctx = new ParamgradangleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 304, RULE_paramgradangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			match(T__220);
			setState(1630);
			match(T__112);
			setState(1631);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdotsizeContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext dim;
		public Token num;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamdotsizeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdotsizeContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdotsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdotsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdotsize(this);
		}
	}

	public final ParamdotsizeContext paramdotsize(PSTContext pstctx) throws RecognitionException {
		ParamdotsizeContext _localctx = new ParamdotsizeContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 306, RULE_paramdotsize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(T__221);
			setState(1634);
			match(T__112);
			setState(1635);
			((ParamdotsizeContext)_localctx).dim = valueDim();
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1636);
				((ParamdotsizeContext)_localctx).num = match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamgangleContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamgangleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamgangleContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramgangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamgangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamgangle(this);
		}
	}

	public final ParamgangleContext paramgangle(PSTContext pstctx) throws RecognitionException {
		ParamgangleContext _localctx = new ParamgangleContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 308, RULE_paramgangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			match(T__222);
			setState(1640);
			match(T__112);
			setState(1641);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamstrokeopacityContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamstrokeopacityContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamstrokeopacityContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramstrokeopacity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamstrokeopacity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamstrokeopacity(this);
		}
	}

	public final ParamstrokeopacityContext paramstrokeopacity(PSTContext pstctx) throws RecognitionException {
		ParamstrokeopacityContext _localctx = new ParamstrokeopacityContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 310, RULE_paramstrokeopacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			match(T__223);
			setState(1644);
			match(T__112);
			setState(1645);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamopacityContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamopacityContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamopacityContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramopacity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamopacity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamopacity(this);
		}
	}

	public final ParamopacityContext paramopacity(PSTContext pstctx) throws RecognitionException {
		ParamopacityContext _localctx = new ParamopacityContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 312, RULE_paramopacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			match(T__224);
			setState(1648);
			match(T__112);
			setState(1649);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamdxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdx(this);
		}
	}

	public final ParamdxContext paramdx(PSTContext pstctx) throws RecognitionException {
		ParamdxContext _localctx = new ParamdxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 314, RULE_paramdx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			match(T__225);
			setState(1652);
			match(T__112);
			setState(1653);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamdyContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ValueDimContext valueDim() {
			return getRuleContext(ValueDimContext.class,0);
		}
		public ParamdyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamdyContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramdy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamdy(this);
		}
	}

	public final ParamdyContext paramdy(PSTContext pstctx) throws RecognitionException {
		ParamdyContext _localctx = new ParamdyContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 316, RULE_paramdy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(T__226);
			setState(1656);
			match(T__112);
			setState(1657);
			valueDim();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamDxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamDxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramDx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamDx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamDx(this);
		}
	}

	public final ParamDxContext paramDx(PSTContext pstctx) throws RecognitionException {
		ParamDxContext _localctx = new ParamDxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 318, RULE_paramDx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			match(T__227);
			setState(1660);
			match(T__112);
			setState(1661);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDyContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamDyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamDyContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramDy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamDy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamDy(this);
		}
	}

	public final ParamDyContext paramDy(PSTContext pstctx) throws RecognitionException {
		ParamDyContext _localctx = new ParamDyContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 320, RULE_paramDy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			match(T__228);
			setState(1664);
			match(T__112);
			setState(1665);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamOxContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamOxContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamOxContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramOx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamOx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamOx(this);
		}
	}

	public final ParamOxContext paramOx(PSTContext pstctx) throws RecognitionException {
		ParamOxContext _localctx = new ParamOxContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 322, RULE_paramOx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			match(T__229);
			setState(1668);
			match(T__112);
			setState(1669);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamOyContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode NUMBER() { return getToken(PSTParser.NUMBER, 0); }
		public ParamOyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamOyContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_paramOy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParamOy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParamOy(this);
		}
	}

	public final ParamOyContext paramOy(PSTContext pstctx) throws RecognitionException {
		ParamOyContext _localctx = new ParamOyContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 324, RULE_paramOy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			match(T__230);
			setState(1672);
			match(T__112);
			setState(1673);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParampolarplotContext extends ParserRuleContext {
		public PSTContext pstctx;
		public BooleanvalueContext booleanvalue() {
			return getRuleContext(BooleanvalueContext.class,0);
		}
		public ParampolarplotContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParampolarplotContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_parampolarplot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterParampolarplot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitParampolarplot(this);
		}
	}

	public final ParampolarplotContext parampolarplot(PSTContext pstctx) throws RecognitionException {
		ParampolarplotContext _localctx = new ParampolarplotContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 326, RULE_parampolarplot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			match(T__231);
			setState(1676);
			match(T__112);
			setState(1677);
			booleanvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowBlockContext extends ParserRuleContext {
		public PSTContext pstctx;
		public TerminalNode BRACE_OPEN() { return getToken(PSTParser.BRACE_OPEN, 0); }
		public ArrowvalueContext arrowvalue() {
			return getRuleContext(ArrowvalueContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(PSTParser.BRACE_CLOSE, 0); }
		public ArrowBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArrowBlockContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_arrowBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterArrowBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitArrowBlock(this);
		}
	}

	public final ArrowBlockContext arrowBlock(PSTContext pstctx) throws RecognitionException {
		ArrowBlockContext _localctx = new ArrowBlockContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 328, RULE_arrowBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(BRACE_OPEN);
			setState(1680);
			arrowvalue(pstctx);
			setState(1681);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowvalueContext extends ParserRuleContext {
		public PSTContext pstctx;
		public ArrowContext arrLeft;
		public ArrowContext arrRight;
		public List<ArrowContext> arrow() {
			return getRuleContexts(ArrowContext.class);
		}
		public ArrowContext arrow(int i) {
			return getRuleContext(ArrowContext.class,i);
		}
		public ArrowvalueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArrowvalueContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_arrowvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterArrowvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitArrowvalue(this);
		}
	}

	public final ArrowvalueContext arrowvalue(PSTContext pstctx) throws RecognitionException {
		ArrowvalueContext _localctx = new ArrowvalueContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 330, RULE_arrowvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__27 - 27)) | (1L << (T__28 - 27)) | (1L << (T__85 - 27)) | (1L << (T__86 - 27)))) != 0) || _la==T__182 || _la==T__190 || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (T__263 - 264)) | (1L << (T__264 - 264)) | (1L << (T__265 - 264)) | (1L << (T__266 - 264)) | (1L << (T__267 - 264)) | (1L << (T__268 - 264)) | (1L << (T__269 - 264)) | (1L << (T__270 - 264)) | (1L << (T__271 - 264)) | (1L << (T__272 - 264)))) != 0)) {
				{
				setState(1683);
				((ArrowvalueContext)_localctx).arrLeft = arrow();
				}
			}

			setState(1686);
			match(T__232);
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1687);
				((ArrowvalueContext)_localctx).arrRight = arrow();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoordContext extends ParserRuleContext {
		public ValueDimContext x;
		public ValueDimContext y;
		public List<ValueDimContext> valueDim() {
			return getRuleContexts(ValueDimContext.class);
		}
		public ValueDimContext valueDim(int i) {
			return getRuleContext(ValueDimContext.class,i);
		}
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitCoord(this);
		}
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_coord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			match(T__85);
			setState(1692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1691);
				((CoordContext)_localctx).x = valueDim();
				}
			}

			setState(1694);
			match(T__102);
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(1695);
				((CoordContext)_localctx).y = valueDim();
				}
			}

			setState(1698);
			match(T__86);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public PSTContext pstctx;
		public List<TerminalNode> BRACE_OPEN() { return getTokens(PSTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(PSTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(PSTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(PSTParser.BRACE_CLOSE, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TextContext(ParserRuleContext parent, int invokingState, PSTContext pstctx) {
			super(parent, invokingState);
			this.pstctx = pstctx;
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitText(this);
		}
	}

	public final TextContext text(PSTContext pstctx) throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState(), pstctx);
		enterRule(_localctx, 334, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1701); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(1700);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==BRACE_OPEN || _la==BRACE_CLOSE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1703); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowContext extends ParserRuleContext {
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitShow(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			_la = _input.LA(1);
			if ( !(_la==T__132 || _la==T__193 || _la==T__233 || _la==T__234) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FillstyleContext extends ParserRuleContext {
		public FillstyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillstyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterFillstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitFillstyle(this);
		}
	}

	public final FillstyleContext fillstyle() throws RecognitionException {
		FillstyleContext _localctx = new FillstyleContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_fillstyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			_la = _input.LA(1);
			if ( !(_la==T__132 || _la==T__133 || ((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (T__235 - 236)) | (1L << (T__236 - 236)) | (1L << (T__237 - 236)) | (1L << (T__238 - 236)) | (1L << (T__239 - 236)) | (1L << (T__240 - 236)) | (1L << (T__241 - 236)) | (1L << (T__242 - 236)) | (1L << (T__243 - 236)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PutContext extends ParserRuleContext {
		public PutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitPut(this);
		}
	}

	public final PutContext put() throws RecognitionException {
		PutContext _localctx = new PutContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_put);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			_la = _input.LA(1);
			if ( !(((((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & ((1L << (T__244 - 245)) | (1L << (T__245 - 245)) | (1L << (T__246 - 245)) | (1L << (T__247 - 245)) | (1L << (T__248 - 245)) | (1L << (T__249 - 245)) | (1L << (T__250 - 245)) | (1L << (T__251 - 245)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextposContext extends ParserRuleContext {
		public TextposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterTextpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitTextpos(this);
		}
	}

	public final TextposContext textpos() throws RecognitionException {
		TextposContext _localctx = new TextposContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_textpos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			_la = _input.LA(1);
			if ( !(((((_la - 253)) & ~0x3f) == 0 && ((1L << (_la - 253)) & ((1L << (T__252 - 253)) | (1L << (T__253 - 253)) | (1L << (T__254 - 253)) | (1L << (T__255 - 253)) | (1L << (T__256 - 253)) | (1L << (T__257 - 253)) | (1L << (T__258 - 253)) | (1L << (T__259 - 253)) | (1L << (T__260 - 253)) | (1L << (T__261 - 253)) | (1L << (T__262 - 253)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowContext extends ParserRuleContext {
		public ArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitArrow(this);
		}
	}

	public final ArrowContext arrow() throws RecognitionException {
		ArrowContext _localctx = new ArrowContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_arrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__27 - 27)) | (1L << (T__28 - 27)) | (1L << (T__85 - 27)) | (1L << (T__86 - 27)))) != 0) || _la==T__182 || _la==T__190 || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (T__263 - 264)) | (1L << (T__264 - 264)) | (1L << (T__265 - 264)) | (1L << (T__266 - 264)) | (1L << (T__267 - 264)) | (1L << (T__268 - 264)) | (1L << (T__269 - 264)) | (1L << (T__270 - 264)) | (1L << (T__271 - 264)) | (1L << (T__272 - 264)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitContext extends ParserRuleContext {
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			_la = _input.LA(1);
			if ( !(((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (T__273 - 274)) | (1L << (T__274 - 274)) | (1L << (T__275 - 274)) | (1L << (T__276 - 274)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanvalueContext extends ParserRuleContext {
		public BooleanvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).enterBooleanvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSTListener ) ((PSTListener)listener).exitBooleanvalue(this);
		}
	}

	public final BooleanvalueContext booleanvalue() throws RecognitionException {
		BooleanvalueContext _localctx = new BooleanvalueContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_booleanvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			_la = _input.LA(1);
			if ( !(_la==T__277 || _la==T__278) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 72:
			return pspictureBlock_sempred((PspictureBlockContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pspictureBlock_sempred(PspictureBlockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _localctx.hasStar;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0128\u06ba\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u0197\n\2\f"+
		"\2\16\2\u019a\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u01b1\n\3\f\3\16\3\u01b4\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5\u01be\n\5\3\5\3\5\5\5\u01c2\n\5\3\6\3"+
		"\6\5\6\u01c6\n\6\3\6\3\6\5\6\u01ca\n\6\3\7\3\7\5\7\u01ce\n\7\3\7\3\7\5"+
		"\7\u01d2\n\7\3\b\3\b\5\b\u01d6\n\b\3\b\3\b\5\b\u01da\n\b\3\t\3\t\5\t\u01de"+
		"\n\t\3\t\5\t\u01e1\n\t\3\t\6\t\u01e4\n\t\r\t\16\t\u01e5\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\5\13\u01ee\n\13\3\13\5\13\u01f1\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\5\r\u01fb\n\r\3\r\3\r\6\r\u01ff\n\r\r\r\16\r\u0200\3\16"+
		"\3\16\5\16\u0205\n\16\3\16\5\16\u0208\n\16\3\16\3\16\3\16\3\16\7\16\u020e"+
		"\n\16\f\16\16\16\u0211\13\16\3\16\5\16\u0214\n\16\3\17\3\17\5\17\u0218"+
		"\n\17\3\17\5\17\u021b\n\17\3\20\3\20\5\20\u021f\n\20\3\20\6\20\u0222\n"+
		"\20\r\20\16\20\u0223\3\21\3\21\5\21\u0228\n\21\3\21\5\21\u022b\n\21\3"+
		"\21\3\21\5\21\u022f\n\21\3\21\5\21\u0232\n\21\3\22\3\22\5\22\u0236\n\22"+
		"\3\22\5\22\u0239\n\22\3\22\5\22\u023c\n\22\3\22\5\22\u023f\n\22\3\23\3"+
		"\23\3\23\5\23\u0244\n\23\3\23\3\23\5\23\u0248\n\23\3\23\3\23\5\23\u024c"+
		"\n\23\3\23\3\23\5\23\u0250\n\23\3\23\3\23\3\23\5\23\u0255\n\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0261\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\5\25\u0269\n\25\3\25\3\25\3\25\3\26\3\26\5\26\u0270"+
		"\n\26\3\26\5\26\u0273\n\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u027b\n"+
		"\27\3\27\5\27\u027e\n\27\3\27\3\27\5\27\u0282\n\27\3\27\3\27\3\27\3\30"+
		"\3\30\5\30\u0289\n\30\3\30\5\30\u028c\n\30\3\30\3\30\5\30\u0290\n\30\3"+
		"\30\3\30\3\30\3\31\3\31\5\31\u0297\n\31\3\31\5\31\u029a\n\31\3\31\5\31"+
		"\u029d\n\31\3\31\3\31\3\31\5\31\u02a2\n\31\3\32\3\32\5\32\u02a6\n\32\3"+
		"\32\5\32\u02a9\n\32\3\32\5\32\u02ac\n\32\3\32\3\32\3\32\5\32\u02b1\n\32"+
		"\3\33\3\33\5\33\u02b5\n\33\3\33\5\33\u02b8\n\33\3\33\3\33\3\33\3\34\3"+
		"\34\5\34\u02bf\n\34\3\34\5\34\u02c2\n\34\3\34\3\34\3\34\3\34\7\34\u02c8"+
		"\n\34\f\34\16\34\u02cb\13\34\3\34\5\34\u02ce\n\34\3\35\3\35\5\35\u02d2"+
		"\n\35\3\35\5\35\u02d5\n\35\3\35\3\35\3\35\3\35\7\35\u02db\n\35\f\35\16"+
		"\35\u02de\13\35\3\35\5\35\u02e1\n\35\3\36\3\36\5\36\u02e5\n\36\3\36\5"+
		"\36\u02e8\n\36\3\36\3\36\3\36\3\36\7\36\u02ee\n\36\f\36\16\36\u02f1\13"+
		"\36\3\36\5\36\u02f4\n\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\5!\u02fe\n!\3\""+
		"\3\"\5\"\u0302\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\7&\u030d\n&\f&\16&\u0310"+
		"\13&\3&\3&\3&\3\'\3\'\3\'\7\'\u0318\n\'\f\'\16\'\u031b\13\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3)\3)\5)\u0325\n)\3*\3*\5*\u0329\n*\3+\3+\3,\3,\3-\3-\3-\3"+
		"-\3-\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\5\63\u0345\n\63\3\63\3\63\7\63\u0349\n\63\f\63\16\63\u034c\13\63"+
		"\3\63\3\63\3\63\3\64\3\64\5\64\u0353\n\64\3\64\3\64\7\64\u0357\n\64\f"+
		"\64\16\64\u035a\13\64\3\64\3\64\3\64\3\65\3\65\5\65\u0361\n\65\3\65\3"+
		"\65\7\65\u0365\n\65\f\65\16\65\u0368\13\65\3\65\3\65\3\65\3\66\3\66\5"+
		"\66\u036f\n\66\3\66\3\66\7\66\u0373\n\66\f\66\16\66\u0376\13\66\3\66\3"+
		"\66\3\66\3\67\3\67\5\67\u037d\n\67\3\67\3\67\7\67\u0381\n\67\f\67\16\67"+
		"\u0384\13\67\3\67\3\67\3\67\38\38\58\u038b\n8\38\38\78\u038f\n8\f8\16"+
		"8\u0392\138\38\38\38\39\39\59\u0399\n9\39\39\79\u039d\n9\f9\169\u03a0"+
		"\139\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\7<\u03ba\n<\f<\16<\u03bd\13<\3=\3=\5=\u03c1\n=\3=\3=\3=\3=\3="+
		"\3=\3=\7=\u03ca\n=\f=\16=\u03cd\13=\3=\3=\3=\3>\3>\3>\3>\3>\3>\7>\u03d8"+
		"\n>\f>\16>\u03db\13>\3>\3>\3>\3?\3?\5?\u03e2\n?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\6?\u03ec\n?\r?\16?\u03ed\3?\3?\3?\3@\3@\5@\u03f5\n@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\6@\u03ff\n@\r@\16@\u0400\3@\3@\3A\3A\5A\u0407\nA\3A\3A\6A\u040b"+
		"\nA\rA\16A\u040c\3A\3A\3B\3B\5B\u0413\nB\3B\3B\6B\u0417\nB\rB\16B\u0418"+
		"\3B\3B\3C\3C\5C\u041f\nC\3C\3C\6C\u0423\nC\rC\16C\u0424\3C\3C\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\7D\u0432\nD\fD\16D\u0435\13D\3D\3D\3D\3E\3E\3E\7E"+
		"\u043d\nE\fE\16E\u0440\13E\3E\3E\5E\u0444\nE\3E\3E\3E\3E\3E\7E\u044b\n"+
		"E\fE\16E\u044e\13E\3E\3E\3E\3F\3F\5F\u0455\nF\3F\3F\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\7G\u0464\nG\fG\16G\u0467\13G\3G\5G\u046a\nG\3G\3G\3H\3"+
		"H\3H\3H\7H\u0472\nH\fH\16H\u0475\13H\3H\3H\3H\3I\3I\5I\u047c\nI\3I\5I"+
		"\u047f\nI\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\5J\u048b\nJ\3J\3J\5J\u048f\nJ"+
		"\3J\5J\u0492\nJ\3J\3J\3J\3J\3J\3J\3J\5J\u049b\nJ\3J\3J\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\7L\u04ae\nL\fL\16L\u04b1\13L\5L\u04b3\n"+
		"L\3L\3L\3M\3M\3M\3M\7M\u04bb\nM\fM\16M\u04be\13M\5M\u04c0\nM\3M\3M\3N"+
		"\3N\3N\3N\3O\3O\5O\u04ca\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\5P\u0521\nP\3Q\3Q\3Q\3Q\3Q\3Q\6Q\u0529\nQ\rQ\16Q\u052a\3R\3R\3"+
		"R\3R\3S\3S\3S\3S\5S\u0535\nS\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\3V\3W\3"+
		"W\3W\3W\3X\3X\3X\3X\5X\u054b\nX\3Y\3Y\3Y\3Y\5Y\u0551\nY\3Z\3Z\3Z\3Z\3"+
		"[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\3^\3_\3_\3_\3_\3`\3`\3"+
		"`\3`\3`\3a\3a\3a\3a\3b\3b\3b\3b\5b\u0578\nb\3b\3b\5b\u057c\nb\3b\3b\3"+
		"c\3c\3c\3c\3d\3d\3d\3d\3e\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\3h\3h\3h\3"+
		"h\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l\3m\3m\3m\3m\3n\3n\3"+
		"n\3n\3o\3o\3o\3o\3p\3p\3p\3p\3q\3q\3q\3q\3r\3r\3r\3r\3s\3s\3s\3s\3t\3"+
		"t\3t\3t\3u\3u\3u\3u\3v\3v\3v\3v\3w\3w\3w\3w\3x\3x\3x\3x\3y\3y\3y\3y\3"+
		"z\3z\3z\3z\3{\3{\3{\3{\3|\3|\3|\3|\3}\3}\3}\3}\3~\3~\3~\3~\3\177\3\177"+
		"\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u061e\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u0668\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\5\u00a7\u0697\n\u00a7\3\u00a7"+
		"\3\u00a7\5\u00a7\u069b\n\u00a7\3\u00a8\3\u00a8\5\u00a8\u069f\n\u00a8\3"+
		"\u00a8\3\u00a8\5\u00a8\u06a3\n\u00a8\3\u00a8\3\u00a8\3\u00a9\6\u00a9\u06a8"+
		"\n\u00a9\r\u00a9\16\u00a9\u06a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0"+
		"\3\u00b0\22\u030e\u0319\u034a\u0358\u0366\u0374\u0382\u0390\u039e\u03cb"+
		"\u03d9\u0433\u043e\u044c\u0473\u06a9\2\u00b1\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\2\63\3\2\3\4\3\2\5\6\3\2\7\b\3\2\t\n\3\2\13\f"+
		"\3\2\16\17\3\2\21\22\3\2\23\24\3\2\25\26\3\2\27\30\3\2\33\34\3\2\"#\3"+
		"\2$%\3\2&\'\3\2()\3\2*+\3\2,-\3\2./\3\2\60\61\3\2\62\63\3\2\u0126\u0126"+
		"\3\2HI\3\2JK\3\2LM\3\2NO\3\2PQ\3\2RS\3\2TU\3\2\36\36\3\2YY\3\2^_\3\2`"+
		"a\3\2bc\3\2fg\3\2\u0087\u008a\3\2\u0094\u0096\3\2\u00a2\u00a4\4\2\u0087"+
		"\u0087\u00a8\u00a9\3\2\u00b2\u00b3\4\2\37\37\u00b9\u00c7\3\2\u00d4\u00d9"+
		"\3\2\u0125\u0126\5\2\u0087\u0087\u00c4\u00c4\u00ec\u00ed\4\2\u0087\u0088"+
		"\u00ee\u00f6\3\2\u00f7\u00fe\3\2\u00ff\u0109\7\2\35\37XY\u00b9\u00b9\u00c1"+
		"\u00c1\u010a\u0113\3\2\u0114\u0117\3\2\u0118\u0119\2\u0735\2\u0198\3\2"+
		"\2\2\4\u019b\3\2\2\2\6\u01b7\3\2\2\2\b\u01bb\3\2\2\2\n\u01c3\3\2\2\2\f"+
		"\u01cb\3\2\2\2\16\u01d3\3\2\2\2\20\u01db\3\2\2\2\22\u01e7\3\2\2\2\24\u01eb"+
		"\3\2\2\2\26\u01f4\3\2\2\2\30\u01f8\3\2\2\2\32\u0202\3\2\2\2\34\u0215\3"+
		"\2\2\2\36\u021c\3\2\2\2 \u0225\3\2\2\2\"\u0233\3\2\2\2$\u0240\3\2\2\2"+
		"&\u0259\3\2\2\2(\u0264\3\2\2\2*\u026d\3\2\2\2,\u0278\3\2\2\2.\u0286\3"+
		"\2\2\2\60\u0294\3\2\2\2\62\u02a3\3\2\2\2\64\u02b2\3\2\2\2\66\u02bc\3\2"+
		"\2\28\u02cf\3\2\2\2:\u02e2\3\2\2\2<\u02f5\3\2\2\2>\u02f8\3\2\2\2@\u02fb"+
		"\3\2\2\2B\u02ff\3\2\2\2D\u0303\3\2\2\2F\u0305\3\2\2\2H\u0307\3\2\2\2J"+
		"\u0309\3\2\2\2L\u0314\3\2\2\2N\u031f\3\2\2\2P\u0322\3\2\2\2R\u0326\3\2"+
		"\2\2T\u032a\3\2\2\2V\u032c\3\2\2\2X\u032e\3\2\2\2Z\u0333\3\2\2\2\\\u0335"+
		"\3\2\2\2^\u033a\3\2\2\2`\u033d\3\2\2\2b\u0340\3\2\2\2d\u0342\3\2\2\2f"+
		"\u0350\3\2\2\2h\u035e\3\2\2\2j\u036c\3\2\2\2l\u037a\3\2\2\2n\u0388\3\2"+
		"\2\2p\u0396\3\2\2\2r\u03a4\3\2\2\2t\u03aa\3\2\2\2v\u03af\3\2\2\2x\u03be"+
		"\3\2\2\2z\u03d1\3\2\2\2|\u03df\3\2\2\2~\u03f2\3\2\2\2\u0080\u0404\3\2"+
		"\2\2\u0082\u0410\3\2\2\2\u0084\u041c\3\2\2\2\u0086\u0428\3\2\2\2\u0088"+
		"\u0439\3\2\2\2\u008a\u0452\3\2\2\2\u008c\u0458\3\2\2\2\u008e\u046d\3\2"+
		"\2\2\u0090\u0479\3\2\2\2\u0092\u0484\3\2\2\2\u0094\u049e\3\2\2\2\u0096"+
		"\u04a8\3\2\2\2\u0098\u04b6\3\2\2\2\u009a\u04c3\3\2\2\2\u009c\u04c7\3\2"+
		"\2\2\u009e\u0520\3\2\2\2\u00a0\u0522\3\2\2\2\u00a2\u052c\3\2\2\2\u00a4"+
		"\u0530\3\2\2\2\u00a6\u0536\3\2\2\2\u00a8\u053a\3\2\2\2\u00aa\u053e\3\2"+
		"\2\2\u00ac\u0542\3\2\2\2\u00ae\u0546\3\2\2\2\u00b0\u054c\3\2\2\2\u00b2"+
		"\u0552\3\2\2\2\u00b4\u0556\3\2\2\2\u00b6\u055a\3\2\2\2\u00b8\u055e\3\2"+
		"\2\2\u00ba\u0562\3\2\2\2\u00bc\u0566\3\2\2\2\u00be\u056a\3\2\2\2\u00c0"+
		"\u056f\3\2\2\2\u00c2\u0573\3\2\2\2\u00c4\u057f\3\2\2\2\u00c6\u0583\3\2"+
		"\2\2\u00c8\u0587\3\2\2\2\u00ca\u058b\3\2\2\2\u00cc\u058f\3\2\2\2\u00ce"+
		"\u0593\3\2\2\2\u00d0\u0597\3\2\2\2\u00d2\u059b\3\2\2\2\u00d4\u059f\3\2"+
		"\2\2\u00d6\u05a3\3\2\2\2\u00d8\u05a7\3\2\2\2\u00da\u05ab\3\2\2\2\u00dc"+
		"\u05af\3\2\2\2\u00de\u05b3\3\2\2\2\u00e0\u05b7\3\2\2\2\u00e2\u05bb\3\2"+
		"\2\2\u00e4\u05bf\3\2\2\2\u00e6\u05c3\3\2\2\2\u00e8\u05c7\3\2\2\2\u00ea"+
		"\u05cb\3\2\2\2\u00ec\u05cf\3\2\2\2\u00ee\u05d3\3\2\2\2\u00f0\u05d7\3\2"+
		"\2\2\u00f2\u05db\3\2\2\2\u00f4\u05df\3\2\2\2\u00f6\u05e3\3\2\2\2\u00f8"+
		"\u05e7\3\2\2\2\u00fa\u05eb\3\2\2\2\u00fc\u05ef\3\2\2\2\u00fe\u05f3\3\2"+
		"\2\2\u0100\u05f7\3\2\2\2\u0102\u05fb\3\2\2\2\u0104\u05ff\3\2\2\2\u0106"+
		"\u0603\3\2\2\2\u0108\u0607\3\2\2\2\u010a\u060b\3\2\2\2\u010c\u060f\3\2"+
		"\2\2\u010e\u0615\3\2\2\2\u0110\u0619\3\2\2\2\u0112\u061f\3\2\2\2\u0114"+
		"\u0623\3\2\2\2\u0116\u0627\3\2\2\2\u0118\u062b\3\2\2\2\u011a\u062f\3\2"+
		"\2\2\u011c\u0633\3\2\2\2\u011e\u0637\3\2\2\2\u0120\u063b\3\2\2\2\u0122"+
		"\u063f\3\2\2\2\u0124\u0643\3\2\2\2\u0126\u0647\3\2\2\2\u0128\u064b\3\2"+
		"\2\2\u012a\u064f\3\2\2\2\u012c\u0653\3\2\2\2\u012e\u0657\3\2\2\2\u0130"+
		"\u065b\3\2\2\2\u0132\u065f\3\2\2\2\u0134\u0663\3\2\2\2\u0136\u0669\3\2"+
		"\2\2\u0138\u066d\3\2\2\2\u013a\u0671\3\2\2\2\u013c\u0675\3\2\2\2\u013e"+
		"\u0679\3\2\2\2\u0140\u067d\3\2\2\2\u0142\u0681\3\2\2\2\u0144\u0685\3\2"+
		"\2\2\u0146\u0689\3\2\2\2\u0148\u068d\3\2\2\2\u014a\u0691\3\2\2\2\u014c"+
		"\u0696\3\2\2\2\u014e\u069c\3\2\2\2\u0150\u06a7\3\2\2\2\u0152\u06ab\3\2"+
		"\2\2\u0154\u06ad\3\2\2\2\u0156\u06af\3\2\2\2\u0158\u06b1\3\2\2\2\u015a"+
		"\u06b3\3\2\2\2\u015c\u06b5\3\2\2\2\u015e\u06b7\3\2\2\2\u0160\u0197\5\6"+
		"\4\2\u0161\u0197\5\u0096L\2\u0162\u0197\5\u0092J\2\u0163\u0197\5\u0094"+
		"K\2\u0164\u0197\5\u0090I\2\u0165\u0197\5\b\5\2\u0166\u0197\5\n\6\2\u0167"+
		"\u0197\5\f\7\2\u0168\u0197\5\16\b\2\u0169\u0197\5\20\t\2\u016a\u0197\5"+
		"\22\n\2\u016b\u0197\5\24\13\2\u016c\u0197\5\26\f\2\u016d\u0197\5\30\r"+
		"\2\u016e\u0197\5\32\16\2\u016f\u0197\5\34\17\2\u0170\u0197\5\36\20\2\u0171"+
		"\u0197\5 \21\2\u0172\u0197\5\"\22\2\u0173\u0197\5*\26\2\u0174\u0197\5"+
		",\27\2\u0175\u0197\5.\30\2\u0176\u0197\5\62\32\2\u0177\u0197\5\60\31\2"+
		"\u0178\u0197\5\64\33\2\u0179\u0197\5\66\34\2\u017a\u0197\58\35\2\u017b"+
		"\u0197\5:\36\2\u017c\u0197\5x=\2\u017d\u0197\5|?\2\u017e\u0197\5~@\2\u017f"+
		"\u0197\5\u0080A\2\u0180\u0197\5\u0082B\2\u0181\u0197\5\u0084C\2\u0182"+
		"\u0197\5\u008aF\2\u0183\u0197\5\u008eH\2\u0184\u0197\5d\63\2\u0185\u0197"+
		"\5f\64\2\u0186\u0197\5h\65\2\u0187\u0197\5j\66\2\u0188\u0197\5l\67\2\u0189"+
		"\u0197\5n8\2\u018a\u0197\5p9\2\u018b\u0197\5$\23\2\u018c\u0197\5&\24\2"+
		"\u018d\u0197\5(\25\2\u018e\u0197\5\u008cG\2\u018f\u0197\5\u0086D\2\u0190"+
		"\u0197\5\u0088E\2\u0191\u0197\5r:\2\u0192\u0197\5z>\2\u0193\u0197\5t;"+
		"\2\u0194\u0197\5v<\2\u0195\u0197\5\u0150\u00a9\2\u0196\u0160\3\2\2\2\u0196"+
		"\u0161\3\2\2\2\u0196\u0162\3\2\2\2\u0196\u0163\3\2\2\2\u0196\u0164\3\2"+
		"\2\2\u0196\u0165\3\2\2\2\u0196\u0166\3\2\2\2\u0196\u0167\3\2\2\2\u0196"+
		"\u0168\3\2\2\2\u0196\u0169\3\2\2\2\u0196\u016a\3\2\2\2\u0196\u016b\3\2"+
		"\2\2\u0196\u016c\3\2\2\2\u0196\u016d\3\2\2\2\u0196\u016e\3\2\2\2\u0196"+
		"\u016f\3\2\2\2\u0196\u0170\3\2\2\2\u0196\u0171\3\2\2\2\u0196\u0172\3\2"+
		"\2\2\u0196\u0173\3\2\2\2\u0196\u0174\3\2\2\2\u0196\u0175\3\2\2\2\u0196"+
		"\u0176\3\2\2\2\u0196\u0177\3\2\2\2\u0196\u0178\3\2\2\2\u0196\u0179\3\2"+
		"\2\2\u0196\u017a\3\2\2\2\u0196\u017b\3\2\2\2\u0196\u017c\3\2\2\2\u0196"+
		"\u017d\3\2\2\2\u0196\u017e\3\2\2\2\u0196\u017f\3\2\2\2\u0196\u0180\3\2"+
		"\2\2\u0196\u0181\3\2\2\2\u0196\u0182\3\2\2\2\u0196\u0183\3\2\2\2\u0196"+
		"\u0184\3\2\2\2\u0196\u0185\3\2\2\2\u0196\u0186\3\2\2\2\u0196\u0187\3\2"+
		"\2\2\u0196\u0188\3\2\2\2\u0196\u0189\3\2\2\2\u0196\u018a\3\2\2\2\u0196"+
		"\u018b\3\2\2\2\u0196\u018c\3\2\2\2\u0196\u018d\3\2\2\2\u0196\u018e\3\2"+
		"\2\2\u0196\u018f\3\2\2\2\u0196\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0196"+
		"\u0192\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2"+
		"\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\3\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u01b2\7\u0125\2\2\u019c\u01b1\5<"+
		"\37\2\u019d\u01b1\5> \2\u019e\u01b1\5@!\2\u019f\u01b1\5B\"\2\u01a0\u01b1"+
		"\5D#\2\u01a1\u01b1\5F$\2\u01a2\u01b1\5H%\2\u01a3\u01b1\5J&\2\u01a4\u01b1"+
		"\5L\'\2\u01a5\u01b1\5N(\2\u01a6\u01b1\5P)\2\u01a7\u01b1\5R*\2\u01a8\u01b1"+
		"\5T+\2\u01a9\u01b1\5V,\2\u01aa\u01b1\5X-\2\u01ab\u01b1\5Z.\2\u01ac\u01b1"+
		"\5\\/\2\u01ad\u01b1\5^\60\2\u01ae\u01b1\5`\61\2\u01af\u01b1\5b\62\2\u01b0"+
		"\u019c\3\2\2\2\u01b0\u019d\3\2\2\2\u01b0\u019e\3\2\2\2\u01b0\u019f\3\2"+
		"\2\2\u01b0\u01a0\3\2\2\2\u01b0\u01a1\3\2\2\2\u01b0\u01a2\3\2\2\2\u01b0"+
		"\u01a3\3\2\2\2\u01b0\u01a4\3\2\2\2\u01b0\u01a5\3\2\2\2\u01b0\u01a6\3\2"+
		"\2\2\u01b0\u01a7\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b0\u01a9\3\2\2\2\u01b0"+
		"\u01aa\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b0\u01ad\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\u01b6\7\u0126\2\2\u01b6\5\3\2\2\2\u01b7\u01b8\7\u0125\2\2\u01b8"+
		"\u01b9\5\2\2\2\u01b9\u01ba\7\u0126\2\2\u01ba\7\3\2\2\2\u01bb\u01bd\t\2"+
		"\2\2\u01bc\u01be\5\u0098M\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c1\5\u014e\u00a8\2\u01c0\u01c2\5\u014e\u00a8\2"+
		"\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\t\3\2\2\2\u01c3\u01c5\t"+
		"\3\2\2\u01c4\u01c6\5\u0098M\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2"+
		"\u01c6\u01c7\3\2\2\2\u01c7\u01c9\5\u014e\u00a8\2\u01c8\u01ca\5\u014e\u00a8"+
		"\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\13\3\2\2\2\u01cb\u01cd"+
		"\t\4\2\2\u01cc\u01ce\5\u0098M\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2"+
		"\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\5\u014e\u00a8\2\u01d0\u01d2\5\u014e"+
		"\u00a8\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\r\3\2\2\2\u01d3"+
		"\u01d5\t\5\2\2\u01d4\u01d6\5\u0098M\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\5\u014e\u00a8\2\u01d8\u01da\5"+
		"\u014e\u00a8\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\17\3\2\2"+
		"\2\u01db\u01dd\t\6\2\2\u01dc\u01de\5\u0098M\2\u01dd\u01dc\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\5\u014a\u00a6\2\u01e0\u01df"+
		"\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e4\5\u014e\u00a8"+
		"\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6"+
		"\3\2\2\2\u01e6\21\3\2\2\2\u01e7\u01e8\7\r\2\2\u01e8\u01e9\5\u014e\u00a8"+
		"\2\u01e9\u01ea\5\u014e\u00a8\2\u01ea\23\3\2\2\2\u01eb\u01ed\t\7\2\2\u01ec"+
		"\u01ee\5\u0098M\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0"+
		"\3\2\2\2\u01ef\u01f1\5\u014e\u00a8\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\5\u009aN\2\u01f3\25\3\2\2\2\u01f4"+
		"\u01f5\7\20\2\2\u01f5\u01f6\5\u014e\u00a8\2\u01f6\u01f7\5\u009aN\2\u01f7"+
		"\27\3\2\2\2\u01f8\u01fa\t\b\2\2\u01f9\u01fb\5\u0098M\2\u01fa\u01f9\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\5\u014e\u00a8"+
		"\2\u01fd\u01ff\5\u014e\u00a8\2\u01fe\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2"+
		"\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\31\3\2\2\2\u0202\u0204"+
		"\t\t\2\2\u0203\u0205\5\u0098M\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2"+
		"\2\u0205\u0207\3\2\2\2\u0206\u0208\5\u014a\u00a6\2\u0207\u0206\3\2\2\2"+
		"\u0207\u0208\3\2\2\2\u0208\u020f\3\2\2\2\u0209\u020a\5\u014e\u00a8\2\u020a"+
		"\u020b\5\u014e\u00a8\2\u020b\u020c\5\u014e\u00a8\2\u020c\u020e\3\2\2\2"+
		"\u020d\u0209\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\5\u014e\u00a8"+
		"\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\33\3\2\2\2\u0215\u0217"+
		"\t\n\2\2\u0216\u0218\5\u0098M\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218\u021a\3\2\2\2\u0219\u021b\5\u014e\u00a8\2\u021a\u0219\3\2\2\2"+
		"\u021a\u021b\3\2\2\2\u021b\35\3\2\2\2\u021c\u021e\t\13\2\2\u021d\u021f"+
		"\5\u0098M\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2"+
		"\2\u0220\u0222\5\u014e\u00a8\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2"+
		"\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\37\3\2\2\2\u0225\u0227"+
		"\7\31\2\2\u0226\u0228\5\u0098M\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2"+
		"\2\u0228\u022a\3\2\2\2\u0229\u022b\5\u014a\u00a6\2\u022a\u0229\3\2\2\2"+
		"\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\5\u014e\u00a8\2\u022d"+
		"\u022f\5\u014e\u00a8\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231"+
		"\3\2\2\2\u0230\u0232\5\u014e\u00a8\2\u0231\u0230\3\2\2\2\u0231\u0232\3"+
		"\2\2\2\u0232!\3\2\2\2\u0233\u0235\7\32\2\2\u0234\u0236\5\u0098M\2\u0235"+
		"\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0239\5\u014e"+
		"\u00a8\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u023c\5\u014e\u00a8\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e"+
		"\3\2\2\2\u023d\u023f\5\u014e\u00a8\2\u023e\u023d\3\2\2\2\u023e\u023f\3"+
		"\2\2\2\u023f#\3\2\2\2\u0240\u0247\t\f\2\2\u0241\u0243\7\35\2\2\u0242\u0244"+
		"\5\u0158\u00ad\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3"+
		"\2\2\2\u0245\u0246\b\23\1\2\u0246\u0248\7\36\2\2\u0247\u0241\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0254\3\2\2\2\u0249\u024b\7\u0125\2\2\u024a\u024c"+
		"\7\37\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024f\3\2\2\2"+
		"\u024d\u0250\5\u009cO\2\u024e\u0250\5\u0156\u00ac\2\u024f\u024d\3\2\2"+
		"\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\b\23\1\2\u0252"+
		"\u0253\7\u0126\2\2\u0253\u0255\3\2\2\2\u0254\u0249\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\5\u014e\u00a8\2\u0257\u0258\5"+
		"\6\4\2\u0258%\3\2\2\2\u0259\u025a\7 \2\2\u025a\u025b\7\u0125\2\2\u025b"+
		"\u025c\7\u0122\2\2\u025c\u0260\7\u0126\2\2\u025d\u025e\7\35\2\2\u025e"+
		"\u025f\7\u0122\2\2\u025f\u0261\7\36\2\2\u0260\u025d\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\5\6\4\2\u0263\'\3\2\2\2\u0264"+
		"\u0265\7!\2\2\u0265\u0266\7\u0125\2\2\u0266\u0268\7\u0122\2\2\u0267\u0269"+
		"\7\u0122\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2"+
		"\2\u026a\u026b\7\u0126\2\2\u026b\u026c\5\6\4\2\u026c)\3\2\2\2\u026d\u026f"+
		"\t\r\2\2\u026e\u0270\5\u0098M\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2"+
		"\2\u0270\u0272\3\2\2\2\u0271\u0273\5\u014e\u00a8\2\u0272\u0271\3\2\2\2"+
		"\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\5\u009aN\2\u0275"+
		"\u0276\5\u009aN\2\u0276\u0277\5\u009aN\2\u0277+\3\2\2\2\u0278\u027a\t"+
		"\16\2\2\u0279\u027b\5\u0098M\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2"+
		"\u027b\u027d\3\2\2\2\u027c\u027e\5\u014a\u00a6\2\u027d\u027c\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\5\u014e\u00a8\2\u0280\u0282"+
		"\5\u014e\u00a8\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3"+
		"\2\2\2\u0283\u0284\5\u009aN\2\u0284\u0285\5\u009aN\2\u0285-\3\2\2\2\u0286"+
		"\u0288\t\17\2\2\u0287\u0289\5\u0098M\2\u0288\u0287\3\2\2\2\u0288\u0289"+
		"\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u028c\5\u014a\u00a6\2\u028b\u028a\3"+
		"\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\5\u014e\u00a8"+
		"\2\u028e\u0290\5\u014e\u00a8\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2"+
		"\u0290\u0291\3\2\2\2\u0291\u0292\5\u009aN\2\u0292\u0293\5\u009aN\2\u0293"+
		"/\3\2\2\2\u0294\u0296\t\20\2\2\u0295\u0297\5\u0098M\2\u0296\u0295\3\2"+
		"\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u029a\5\u014a\u00a6"+
		"\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u029d"+
		"\5\u014e\u00a8\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3"+
		"\2\2\2\u029e\u029f\5\u009aN\2\u029f\u02a1\5\u009aN\2\u02a0\u02a2\5\u009a"+
		"N\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\61\3\2\2\2\u02a3\u02a5"+
		"\t\21\2\2\u02a4\u02a6\5\u0098M\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2"+
		"\2\u02a6\u02a8\3\2\2\2\u02a7\u02a9\5\u014a\u00a6\2\u02a8\u02a7\3\2\2\2"+
		"\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02ac\5\u014e\u00a8\2\u02ab"+
		"\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\5\u009a"+
		"N\2\u02ae\u02b0\5\u009aN\2\u02af\u02b1\5\u009aN\2\u02b0\u02af\3\2\2\2"+
		"\u02b0\u02b1\3\2\2\2\u02b1\63\3\2\2\2\u02b2\u02b4\t\22\2\2\u02b3\u02b5"+
		"\5\u0098M\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2"+
		"\2\u02b6\u02b8\5\u014a\u00a6\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2"+
		"\u02b8\u02b9\3\2\2\2\u02b9\u02ba\5\u014e\u00a8\2\u02ba\u02bb\5\u014e\u00a8"+
		"\2\u02bb\65\3\2\2\2\u02bc\u02be\t\23\2\2\u02bd\u02bf\5\u0098M\2\u02be"+
		"\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02c2\5\u014a"+
		"\u00a6\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c9\3\2\2\2\u02c3"+
		"\u02c4\5\u014e\u00a8\2\u02c4\u02c5\5\u014e\u00a8\2\u02c5\u02c6\5\u014e"+
		"\u00a8\2\u02c6\u02c8\3\2\2\2\u02c7\u02c3\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2"+
		"\2\2\u02cc\u02ce\5\u014e\u00a8\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2"+
		"\2\u02ce\67\3\2\2\2\u02cf\u02d1\t\24\2\2\u02d0\u02d2\5\u0098M\2\u02d1"+
		"\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d5\5\u014a"+
		"\u00a6\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02dc\3\2\2\2\u02d6"+
		"\u02d7\5\u014e\u00a8\2\u02d7\u02d8\5\u014e\u00a8\2\u02d8\u02d9\5\u014e"+
		"\u00a8\2\u02d9\u02db\3\2\2\2\u02da\u02d6\3\2\2\2\u02db\u02de\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2"+
		"\2\2\u02df\u02e1\5\u014e\u00a8\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2"+
		"\2\u02e19\3\2\2\2\u02e2\u02e4\t\25\2\2\u02e3\u02e5\5\u0098M\2\u02e4\u02e3"+
		"\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e8\5\u014a\u00a6"+
		"\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ef\3\2\2\2\u02e9\u02ea"+
		"\5\u014e\u00a8\2\u02ea\u02eb\5\u014e\u00a8\2\u02eb\u02ec\5\u014e\u00a8"+
		"\2\u02ec\u02ee\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed"+
		"\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2"+
		"\u02f4\5\u014e\u00a8\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4;"+
		"\3\2\2\2\u02f5\u02f6\7\64\2\2\u02f6\u02f7\5\u014e\u00a8\2\u02f7=\3\2\2"+
		"\2\u02f8\u02f9\7\65\2\2\u02f9\u02fa\5\u014e\u00a8\2\u02fa?\3\2\2\2\u02fb"+
		"\u02fd\7\66\2\2\u02fc\u02fe\5\u0098M\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe"+
		"\3\2\2\2\u02feA\3\2\2\2\u02ff\u0301\7\67\2\2\u0300\u0302\5\u0098M\2\u0301"+
		"\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302C\3\2\2\2\u0303\u0304\78\2\2\u0304"+
		"E\3\2\2\2\u0305\u0306\79\2\2\u0306G\3\2\2\2\u0307\u0308\7:\2\2\u0308I"+
		"\3\2\2\2\u0309\u030a\7;\2\2\u030a\u030e\7\u0125\2\2\u030b\u030d\13\2\2"+
		"\2\u030c\u030b\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030f\3\2\2\2\u030e\u030c"+
		"\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0312\n\26\2\2"+
		"\u0312\u0313\7\u0126\2\2\u0313K\3\2\2\2\u0314\u0315\7<\2\2\u0315\u0319"+
		"\7\u0125\2\2\u0316\u0318\13\2\2\2\u0317\u0316\3\2\2\2\u0318\u031b\3\2"+
		"\2\2\u0319\u031a\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031c\3\2\2\2\u031b"+
		"\u0319\3\2\2\2\u031c\u031d\n\26\2\2\u031d\u031e\7\u0126\2\2\u031eM\3\2"+
		"\2\2\u031f\u0320\7=\2\2\u0320\u0321\5\u014e\u00a8\2\u0321O\3\2\2\2\u0322"+
		"\u0324\7>\2\2\u0323\u0325\5\u0098M\2\u0324\u0323\3\2\2\2\u0324\u0325\3"+
		"\2\2\2\u0325Q\3\2\2\2\u0326\u0328\7?\2\2\u0327\u0329\5\u0098M\2\u0328"+
		"\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329S\3\2\2\2\u032a\u032b\7@\2\2\u032b"+
		"U\3\2\2\2\u032c\u032d\7A\2\2\u032dW\3\2\2\2\u032e\u032f\7B\2\2\u032f\u0330"+
		"\5\u014e\u00a8\2\u0330\u0331\5\u014e\u00a8\2\u0331\u0332\5\u014e\u00a8"+
		"\2\u0332Y\3\2\2\2\u0333\u0334\7C\2\2\u0334[\3\2\2\2\u0335\u0336\7D\2\2"+
		"\u0336\u0337\5\u014e\u00a8\2\u0337\u0338\5\u014e\u00a8\2\u0338\u0339\5"+
		"\u014e\u00a8\2\u0339]\3\2\2\2\u033a\u033b\7E\2\2\u033b\u033c\5\u014e\u00a8"+
		"\2\u033c_\3\2\2\2\u033d\u033e\7F\2\2\u033e\u033f\5\u014e\u00a8\2\u033f"+
		"a\3\2\2\2\u0340\u0341\7G\2\2\u0341c\3\2\2\2\u0342\u0344\t\27\2\2\u0343"+
		"\u0345\5\u0098M\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346"+
		"\3\2\2\2\u0346\u034a\7\u0125\2\2\u0347\u0349\13\2\2\2\u0348\u0347\3\2"+
		"\2\2\u0349\u034c\3\2\2\2\u034a\u034b\3\2\2\2\u034a\u0348\3\2\2\2\u034b"+
		"\u034d\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\n\26\2\2\u034e\u034f\7"+
		"\u0126\2\2\u034fe\3\2\2\2\u0350\u0352\t\30\2\2\u0351\u0353\5\u0098M\2"+
		"\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0358"+
		"\7\u0125\2\2\u0355\u0357\13\2\2\2\u0356\u0355\3\2\2\2\u0357\u035a\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0358\u0356\3\2\2\2\u0359\u035b\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035b\u035c\n\26\2\2\u035c\u035d\7\u0126\2\2\u035dg\3\2"+
		"\2\2\u035e\u0360\t\31\2\2\u035f\u0361\5\u0098M\2\u0360\u035f\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0366\7\u0125\2\2\u0363\u0365"+
		"\13\2\2\2\u0364\u0363\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0367\3\2\2\2"+
		"\u0366\u0364\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a"+
		"\n\26\2\2\u036a\u036b\7\u0126\2\2\u036bi\3\2\2\2\u036c\u036e\t\32\2\2"+
		"\u036d\u036f\5\u0098M\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0374\7\u0125\2\2\u0371\u0373\13\2\2\2\u0372\u0371"+
		"\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0375\3\2\2\2\u0374\u0372\3\2\2\2\u0375"+
		"\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0378\n\26\2\2\u0378\u0379\7"+
		"\u0126\2\2\u0379k\3\2\2\2\u037a\u037c\t\33\2\2\u037b\u037d\5\u0098M\2"+
		"\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0382"+
		"\7\u0125\2\2\u037f\u0381\13\2\2\2\u0380\u037f\3\2\2\2\u0381\u0384\3\2"+
		"\2\2\u0382\u0383\3\2\2\2\u0382\u0380\3\2\2\2\u0383\u0385\3\2\2\2\u0384"+
		"\u0382\3\2\2\2\u0385\u0386\n\26\2\2\u0386\u0387\7\u0126\2\2\u0387m\3\2"+
		"\2\2\u0388\u038a\t\34\2\2\u0389\u038b\5\u0098M\2\u038a\u0389\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u0390\7\u0125\2\2\u038d\u038f"+
		"\13\2\2\2\u038e\u038d\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u0391\3\2\2\2"+
		"\u0390\u038e\3\2\2\2\u0391\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394"+
		"\n\26\2\2\u0394\u0395\7\u0126\2\2\u0395o\3\2\2\2\u0396\u0398\t\35\2\2"+
		"\u0397\u0399\5\u0098M\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u039e\7\u0125\2\2\u039b\u039d\13\2\2\2\u039c\u039b"+
		"\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039f\3\2\2\2\u039e\u039c\3\2\2\2\u039f"+
		"\u03a1\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a2\n\26\2\2\u03a2\u03a3\7"+
		"\u0126\2\2\u03a3q\3\2\2\2\u03a4\u03a5\7V\2\2\u03a5\u03a6\7\u0125\2\2\u03a6"+
		"\u03a7\7\u0120\2\2\u03a7\u03a8\7\u0126\2\2\u03a8\u03a9\5\6\4\2\u03a9s"+
		"\3\2\2\2\u03aa\u03ab\7W\2\2\u03ab\u03ac\7\u0125\2\2\u03ac\u03ad\7\u0120"+
		"\2\2\u03ad\u03ae\7\u0126\2\2\u03aeu\3\2\2\2\u03af\u03bb\7\u011f\2\2\u03b0"+
		"\u03b1\7\35\2\2\u03b1\u03b2\n\36\2\2\u03b2\u03ba\7\36\2\2\u03b3\u03b4"+
		"\7\u0125\2\2\u03b4\u03b5\n\26\2\2\u03b5\u03ba\7\u0126\2\2\u03b6\u03b7"+
		"\7X\2\2\u03b7\u03b8\n\37\2\2\u03b8\u03ba\7Y\2\2\u03b9\u03b0\3\2\2\2\u03b9"+
		"\u03b3\3\2\2\2\u03b9\u03b6\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2"+
		"\2\2\u03bb\u03bc\3\2\2\2\u03bcw\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03c0"+
		"\7Z\2\2\u03bf\u03c1\5\u0098M\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2"+
		"\u03c1\u03c2\3\2\2\2\u03c2\u03c3\7\u0125\2\2\u03c3\u03c4\7\u011f\2\2\u03c4"+
		"\u03c5\7\u0126\2\2\u03c5\u03cb\7\u0125\2\2\u03c6\u03ca\13\2\2\2\u03c7"+
		"\u03ca\7[\2\2\u03c8\u03ca\7\\\2\2\u03c9\u03c6\3\2\2\2\u03c9\u03c7\3\2"+
		"\2\2\u03c9\u03c8\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cb"+
		"\u03c9\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03cf\n\26"+
		"\2\2\u03cf\u03d0\7\u0126\2\2\u03d0y\3\2\2\2\u03d1\u03d2\7]\2\2\u03d2\u03d3"+
		"\7\u0125\2\2\u03d3\u03d4\7\u011f\2\2\u03d4\u03d5\7\u0126\2\2\u03d5\u03d9"+
		"\7\35\2\2\u03d6\u03d8\13\2\2\2\u03d7\u03d6\3\2\2\2\u03d8\u03db\3\2\2\2"+
		"\u03d9\u03da\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03dc\3\2\2\2\u03db\u03d9"+
		"\3\2\2\2\u03dc\u03dd\n\36\2\2\u03dd\u03de\7\36\2\2\u03de{\3\2\2\2\u03df"+
		"\u03e1\t \2\2\u03e0\u03e2\5\u0098M\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3"+
		"\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\7\u0125\2\2\u03e4\u03e5\7\u0122"+
		"\2\2\u03e5\u03e6\7\u0126\2\2\u03e6\u03e7\7\u0125\2\2\u03e7\u03e8\7\u0122"+
		"\2\2\u03e8\u03e9\7\u0126\2\2\u03e9\u03eb\7\u0125\2\2\u03ea\u03ec\5\u0150"+
		"\u00a9\2\u03eb\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\n\26\2\2\u03f0\u03f1\7"+
		"\u0126\2\2\u03f1}\3\2\2\2\u03f2\u03f4\t!\2\2\u03f3\u03f5\5\u0098M\2\u03f4"+
		"\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\7\u0125"+
		"\2\2\u03f7\u03f8\7\u0122\2\2\u03f8\u03f9\7\u0126\2\2\u03f9\u03fa\7\u0125"+
		"\2\2\u03fa\u03fb\7\u0122\2\2\u03fb\u03fc\7\u0126\2\2\u03fc\u03fe\7\u0125"+
		"\2\2\u03fd\u03ff\5\u0150\u00a9\2\u03fe\u03fd\3\2\2\2\u03ff\u0400\3\2\2"+
		"\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403"+
		"\7\u0126\2\2\u0403\177\3\2\2\2\u0404\u0406\t\"\2\2\u0405\u0407\5\u0098"+
		"M\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u040a\7\u0125\2\2\u0409\u040b\7\u011f\2\2\u040a\u0409\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u040f\7\u0126\2\2\u040f\u0081\3\2\2\2\u0410\u0412\t\"\2\2\u0411\u0413"+
		"\5\u0098M\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0414\3\2\2"+
		"\2\u0414\u0416\7\u0125\2\2\u0415\u0417\7\u011f\2\2\u0416\u0415\3\2\2\2"+
		"\u0417\u0418\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a"+
		"\3\2\2\2\u041a\u041b\7\u0126\2\2\u041b\u0083\3\2\2\2\u041c\u041e\t\"\2"+
		"\2\u041d\u041f\5\u0098M\2\u041e\u041d\3\2\2\2\u041e\u041f\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0422\7\u0125\2\2\u0421\u0423\7\u011f\2\2\u0422\u0421"+
		"\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426\u0427\7\u0126\2\2\u0427\u0085\3\2\2\2\u0428\u0429"+
		"\7d\2\2\u0429\u042a\7\u0125\2\2\u042a\u042b\7\u0121\2\2\u042b\u042c\7"+
		"\u0126\2\2\u042c\u042d\7\u0125\2\2\u042d\u042e\7\u0121\2\2\u042e\u042f"+
		"\7\u0126\2\2\u042f\u0433\7\u0125\2\2\u0430\u0432\13\2\2\2\u0431\u0430"+
		"\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0434\3\2\2\2\u0433\u0431\3\2\2\2\u0434"+
		"\u0436\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u0437\n\26\2\2\u0437\u0438\7"+
		"\u0126\2\2\u0438\u0087\3\2\2\2\u0439\u0443\7e\2\2\u043a\u043e\7\35\2\2"+
		"\u043b\u043d\13\2\2\2\u043c\u043b\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043f"+
		"\3\2\2\2\u043e\u043c\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u043e\3\2\2\2\u0441"+
		"\u0442\n\36\2\2\u0442\u0444\7\36\2\2\u0443\u043a\3\2\2\2\u0443\u0444\3"+
		"\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\7\u0125\2\2\u0446\u0447\7\u0121"+
		"\2\2\u0447\u0448\7\u0126\2\2\u0448\u044c\7\u0125\2\2\u0449\u044b\13\2"+
		"\2\2\u044a\u0449\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044d\3\2\2\2\u044c"+
		"\u044a\3\2\2\2\u044d\u044f\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0450\n\26"+
		"\2\2\u0450\u0451\7\u0126\2\2\u0451\u0089\3\2\2\2\u0452\u0454\t#\2\2\u0453"+
		"\u0455\5\u0098M\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456"+
		"\3\2\2\2\u0456\u0457\5\4\3\2\u0457\u008b\3\2\2\2\u0458\u0459\7h\2\2\u0459"+
		"\u045a\7\u0125\2\2\u045a\u045b\7\u0120\2\2\u045b\u045c\7\u0126\2\2\u045c"+
		"\u045d\7\u0125\2\2\u045d\u045e\7\u0120\2\2\u045e\u045f\7\u0126\2\2\u045f"+
		"\u0469\7\u0125\2\2\u0460\u0465\7\u0122\2\2\u0461\u0462\7i\2\2\u0462\u0464"+
		"\7\u0122\2\2\u0463\u0461\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2\2"+
		"\2\u0465\u0466\3\2\2\2\u0466\u046a\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u046a"+
		"\7\u011a\2\2\u0469\u0460\3\2\2\2\u0469\u0468\3\2\2\2\u046a\u046b\3\2\2"+
		"\2\u046b\u046c\7\u0126\2\2\u046c\u008d\3\2\2\2\u046d\u046e\7j\2\2\u046e"+
		"\u046f\5\u0098M\2\u046f\u0473\7\u0125\2\2\u0470\u0472\13\2\2\2\u0471\u0470"+
		"\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0474\3\2\2\2\u0473\u0471\3\2\2\2\u0474"+
		"\u0476\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0477\n\26\2\2\u0477\u0478\7"+
		"\u0126\2\2\u0478\u008f\3\2\2\2\u0479\u047b\7k\2\2\u047a\u047c\5\u014e"+
		"\u00a8\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e\3\2\2\2\u047d"+
		"\u047f\5\u014e\u00a8\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480"+
		"\3\2\2\2\u0480\u0481\bI\1\2\u0481\u0482\5\2\2\2\u0482\u0483\7l\2\2\u0483"+
		"\u0091\3\2\2\2\u0484\u0485\7m\2\2\u0485\u048a\7\u0125\2\2\u0486\u0487"+
		"\7n\2\2\u0487\u048b\bJ\1\2\u0488\u0489\7o\2\2\u0489\u048b\bJ\1\2\u048a"+
		"\u0486\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\7\u0126"+
		"\2\2\u048d\u048f\5\u014e\u00a8\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2"+
		"\2\u048f\u0491\3\2\2\2\u0490\u0492\5\u014e\u00a8\2\u0491\u0490\3\2\2\2"+
		"\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\bJ\1\2\u0494\u0495"+
		"\5\2\2\2\u0495\u0496\7p\2\2\u0496\u049a\7\u0125\2\2\u0497\u0498\6J\2\3"+
		"\u0498\u049b\7n\2\2\u0499\u049b\7o\2\2\u049a\u0497\3\2\2\2\u049a\u0499"+
		"\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\7\u0126\2\2\u049d\u0093\3\2\2"+
		"\2\u049e\u049f\7m\2\2\u049f\u04a0\7\u0125\2\2\u04a0\u04a1\7q\2\2\u04a1"+
		"\u04a2\7\u0126\2\2\u04a2\u04a3\5\2\2\2\u04a3\u04a4\7p\2\2\u04a4\u04a5"+
		"\7\u0125\2\2\u04a5\u04a6\7q\2\2\u04a6\u04a7\7\u0126\2\2\u04a7\u0095\3"+
		"\2\2\2\u04a8\u04a9\7r\2\2\u04a9\u04b2\7\u0125\2\2\u04aa\u04af\5\u009e"+
		"P\2\u04ab\u04ac\7i\2\2\u04ac\u04ae\5\u009eP\2\u04ad\u04ab\3\2\2\2\u04ae"+
		"\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b3\3\2"+
		"\2\2\u04b1\u04af\3\2\2\2\u04b2\u04aa\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b4\3\2\2\2\u04b4\u04b5\7\u0126\2\2\u04b5\u0097\3\2\2\2\u04b6\u04bf"+
		"\7\35\2\2\u04b7\u04bc\5\u009eP\2\u04b8\u04b9\7i\2\2\u04b9\u04bb\5\u009e"+
		"P\2\u04ba\u04b8\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc"+
		"\u04bd\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04bf\u04b7\3\2"+
		"\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\7\36\2\2\u04c2"+
		"\u0099\3\2\2\2\u04c3\u04c4\7\u0125\2\2\u04c4\u04c5\5\u009cO\2\u04c5\u04c6"+
		"\7\u0126\2\2\u04c6\u009b\3\2\2\2\u04c7\u04c9\7\u0122\2\2\u04c8\u04ca\5"+
		"\u015c\u00af\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u009d\3\2"+
		"\2\2\u04cb\u0521\5\u00a2R\2\u04cc\u0521\5\u00a4S\2\u04cd\u0521\5\u00a6"+
		"T\2\u04ce\u0521\5\u00a8U\2\u04cf\u0521\5\u00aaV\2\u04d0\u0521\5\u00ac"+
		"W\2\u04d1\u0521\5\u00aeX\2\u04d2\u0521\5\u00b0Y\2\u04d3\u0521\5\u00b2"+
		"Z\2\u04d4\u0521\5\u00b8]\2\u04d5\u0521\5\u00ba^\2\u04d6\u0521\5\u00bc"+
		"_\2\u04d7\u0521\5\u00be`\2\u04d8\u0521\5\u00c0a\2\u04d9\u0521\5\u00b4"+
		"[\2\u04da\u0521\5\u00b6\\\2\u04db\u0521\5\u00c2b\2\u04dc\u0521\5\u00c4"+
		"c\2\u04dd\u0521\5\u00c6d\2\u04de\u0521\5\u00c8e\2\u04df\u0521\5\u00ca"+
		"f\2\u04e0\u0521\5\u00ccg\2\u04e1\u0521\5\u00ceh\2\u04e2\u0521\5\u00d0"+
		"i\2\u04e3\u0521\5\u00d2j\2\u04e4\u0521\5\u00d4k\2\u04e5\u0521\5\u00d6"+
		"l\2\u04e6\u0521\5\u00d8m\2\u04e7\u0521\5\u00dan\2\u04e8\u0521\5\u00dc"+
		"o\2\u04e9\u0521\5\u00dep\2\u04ea\u0521\5\u00e0q\2\u04eb\u0521\5\u00e2"+
		"r\2\u04ec\u0521\5\u00e4s\2\u04ed\u0521\5\u00e6t\2\u04ee\u0521\5\u00e8"+
		"u\2\u04ef\u0521\5\u00eav\2\u04f0\u0521\5\u00ecw\2\u04f1\u0521\5\u00ee"+
		"x\2\u04f2\u0521\5\u00f0y\2\u04f3\u0521\5\u00f2z\2\u04f4\u0521\5\u00f4"+
		"{\2\u04f5\u0521\5\u00f6|\2\u04f6\u0521\5\u00f8}\2\u04f7\u0521\5\u00fa"+
		"~\2\u04f8\u0521\5\u00fc\177\2\u04f9\u0521\5\u00fe\u0080\2\u04fa\u0521"+
		"\5\u0100\u0081\2\u04fb\u0521\5\u0102\u0082\2\u04fc\u0521\5\u0104\u0083"+
		"\2\u04fd\u0521\5\u0106\u0084\2\u04fe\u0521\5\u0108\u0085\2\u04ff\u0521"+
		"\5\u010a\u0086\2\u0500\u0521\5\u010c\u0087\2\u0501\u0521\5\u010e\u0088"+
		"\2\u0502\u0521\5\u0110\u0089\2\u0503\u0521\5\u0112\u008a\2\u0504\u0521"+
		"\5\u0114\u008b\2\u0505\u0521\5\u0116\u008c\2\u0506\u0521\5\u0118\u008d"+
		"\2\u0507\u0521\5\u011a\u008e\2\u0508\u0521\5\u011c\u008f\2\u0509\u0521"+
		"\5\u011e\u0090\2\u050a\u0521\5\u0120\u0091\2\u050b\u0521\5\u0122\u0092"+
		"\2\u050c\u0521\5\u0124\u0093\2\u050d\u0521\5\u0126\u0094\2\u050e\u0521"+
		"\5\u0128\u0095\2\u050f\u0521\5\u012a\u0096\2\u0510\u0521\5\u012c\u0097"+
		"\2\u0511\u0521\5\u012e\u0098\2\u0512\u0521\5\u0130\u0099\2\u0513\u0521"+
		"\5\u0132\u009a\2\u0514\u0521\5\u0134\u009b\2\u0515\u0521\5\u0136\u009c"+
		"\2\u0516\u0521\5\u0138\u009d\2\u0517\u0521\5\u013a\u009e\2\u0518\u0521"+
		"\5\u013c\u009f\2\u0519\u0521\5\u013e\u00a0\2\u051a\u0521\5\u0140\u00a1"+
		"\2\u051b\u0521\5\u0142\u00a2\2\u051c\u0521\5\u0144\u00a3\2\u051d\u0521"+
		"\5\u0146\u00a4\2\u051e\u0521\5\u0148\u00a5\2\u051f\u0521\5\u00a0Q\2\u0520"+
		"\u04cb\3\2\2\2\u0520\u04cc\3\2\2\2\u0520\u04cd\3\2\2\2\u0520\u04ce\3\2"+
		"\2\2\u0520\u04cf\3\2\2\2\u0520\u04d0\3\2\2\2\u0520\u04d1\3\2\2\2\u0520"+
		"\u04d2\3\2\2\2\u0520\u04d3\3\2\2\2\u0520\u04d4\3\2\2\2\u0520\u04d5\3\2"+
		"\2\2\u0520\u04d6\3\2\2\2\u0520\u04d7\3\2\2\2\u0520\u04d8\3\2\2\2\u0520"+
		"\u04d9\3\2\2\2\u0520\u04da\3\2\2\2\u0520\u04db\3\2\2\2\u0520\u04dc\3\2"+
		"\2\2\u0520\u04dd\3\2\2\2\u0520\u04de\3\2\2\2\u0520\u04df\3\2\2\2\u0520"+
		"\u04e0\3\2\2\2\u0520\u04e1\3\2\2\2\u0520\u04e2\3\2\2\2\u0520\u04e3\3\2"+
		"\2\2\u0520\u04e4\3\2\2\2\u0520\u04e5\3\2\2\2\u0520\u04e6\3\2\2\2\u0520"+
		"\u04e7\3\2\2\2\u0520\u04e8\3\2\2\2\u0520\u04e9\3\2\2\2\u0520\u04ea\3\2"+
		"\2\2\u0520\u04eb\3\2\2\2\u0520\u04ec\3\2\2\2\u0520\u04ed\3\2\2\2\u0520"+
		"\u04ee\3\2\2\2\u0520\u04ef\3\2\2\2\u0520\u04f0\3\2\2\2\u0520\u04f1\3\2"+
		"\2\2\u0520\u04f2\3\2\2\2\u0520\u04f3\3\2\2\2\u0520\u04f4\3\2\2\2\u0520"+
		"\u04f5\3\2\2\2\u0520\u04f6\3\2\2\2\u0520\u04f7\3\2\2\2\u0520\u04f8\3\2"+
		"\2\2\u0520\u04f9\3\2\2\2\u0520\u04fa\3\2\2\2\u0520\u04fb\3\2\2\2\u0520"+
		"\u04fc\3\2\2\2\u0520\u04fd\3\2\2\2\u0520\u04fe\3\2\2\2\u0520\u04ff\3\2"+
		"\2\2\u0520\u0500\3\2\2\2\u0520\u0501\3\2\2\2\u0520\u0502\3\2\2\2\u0520"+
		"\u0503\3\2\2\2\u0520\u0504\3\2\2\2\u0520\u0505\3\2\2\2\u0520\u0506\3\2"+
		"\2\2\u0520\u0507\3\2\2\2\u0520\u0508\3\2\2\2\u0520\u0509\3\2\2\2\u0520"+
		"\u050a\3\2\2\2\u0520\u050b\3\2\2\2\u0520\u050c\3\2\2\2\u0520\u050d\3\2"+
		"\2\2\u0520\u050e\3\2\2\2\u0520\u050f\3\2\2\2\u0520\u0510\3\2\2\2\u0520"+
		"\u0511\3\2\2\2\u0520\u0512\3\2\2\2\u0520\u0513\3\2\2\2\u0520\u0514\3\2"+
		"\2\2\u0520\u0515\3\2\2\2\u0520\u0516\3\2\2\2\u0520\u0517\3\2\2\2\u0520"+
		"\u0518\3\2\2\2\u0520\u0519\3\2\2\2\u0520\u051a\3\2\2\2\u0520\u051b\3\2"+
		"\2\2\u0520\u051c\3\2\2\2\u0520\u051d\3\2\2\2\u0520\u051e\3\2\2\2\u0520"+
		"\u051f\3\2\2\2\u0521\u009f\3\2\2\2\u0522\u0523\7\u0120\2\2\u0523\u0528"+
		"\7s\2\2\u0524\u0529\5\u009cO\2\u0525\u0529\7\u0122\2\2\u0526\u0529\5\u015e"+
		"\u00b0\2\u0527\u0529\7\u0120\2\2\u0528\u0524\3\2\2\2\u0528\u0525\3\2\2"+
		"\2\u0528\u0526\3\2\2\2\u0528\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u0528"+
		"\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u00a1\3\2\2\2\u052c\u052d\7t\2\2\u052d"+
		"\u052e\7s\2\2\u052e\u052f\5\u014c\u00a7\2\u052f\u00a3\3\2\2\2\u0530\u0531"+
		"\7u\2\2\u0531\u0532\7s\2\2\u0532\u0534\5\u009cO\2\u0533\u0535\5\u009c"+
		"O\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u00a5\3\2\2\2\u0536"+
		"\u0537\7v\2\2\u0537\u0538\7s\2\2\u0538\u0539\7\u0122\2\2\u0539\u00a7\3"+
		"\2\2\2\u053a\u053b\7w\2\2\u053b\u053c\7s\2\2\u053c\u053d\7\u0122\2\2\u053d"+
		"\u00a9\3\2\2\2\u053e\u053f\7x\2\2\u053f\u0540\7s\2\2\u0540\u0541\7\u0122"+
		"\2\2\u0541\u00ab\3\2\2\2\u0542\u0543\7y\2\2\u0543\u0544\7s\2\2\u0544\u0545"+
		"\7\u0122\2\2\u0545\u00ad\3\2\2\2\u0546\u0547\7z\2\2\u0547\u0548\7s\2\2"+
		"\u0548\u054a\5\u009cO\2\u0549\u054b\7\u0122\2\2\u054a\u0549\3\2\2\2\u054a"+
		"\u054b\3\2\2\2\u054b\u00af\3\2\2\2\u054c\u054d\7{\2\2\u054d\u054e\7s\2"+
		"\2\u054e\u0550\5\u009cO\2\u054f\u0551\7\u0122\2\2\u0550\u054f\3\2\2\2"+
		"\u0550\u0551\3\2\2\2\u0551\u00b1\3\2\2\2\u0552\u0553\7|\2\2\u0553\u0554"+
		"\7s\2\2\u0554\u0555\5\u009cO\2\u0555\u00b3\3\2\2\2\u0556\u0557\7}\2\2"+
		"\u0557\u0558\7s\2\2\u0558\u0559\5\u009cO\2\u0559\u00b5\3\2\2\2\u055a\u055b"+
		"\7~\2\2\u055b\u055c\7s\2\2\u055c\u055d\5\u009cO\2\u055d\u00b7\3\2\2\2"+
		"\u055e\u055f\7\177\2\2\u055f\u0560\7s\2\2\u0560\u0561\5\u0154\u00ab\2"+
		"\u0561\u00b9\3\2\2\2\u0562\u0563\7\u0080\2\2\u0563\u0564\7s\2\2\u0564"+
		"\u0565\5\u009cO\2\u0565\u00bb\3\2\2\2\u0566\u0567\7\u0081\2\2\u0567\u0568"+
		"\7s\2\2\u0568\u0569\5\u009cO\2\u0569\u00bd\3\2\2\2\u056a\u056b\7\u0082"+
		"\2\2\u056b\u056c\7s\2\2\u056c\u056d\5\u009cO\2\u056d\u056e\5\u009cO\2"+
		"\u056e\u00bf\3\2\2\2\u056f\u0570\7\u0083\2\2\u0570\u0571\7s\2\2\u0571"+
		"\u0572\7\u0122\2\2\u0572\u00c1\3\2\2\2\u0573\u0574\7\u0084\2\2\u0574\u0575"+
		"\7s\2\2\u0575\u0577\7\u0125\2\2\u0576\u0578\5\u009cO\2\u0577\u0576\3\2"+
		"\2\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057b\7i\2\2\u057a"+
		"\u057c\5\u009cO\2\u057b\u057a\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d"+
		"\3\2\2\2\u057d\u057e\7\u0126\2\2\u057e\u00c3\3\2\2\2\u057f\u0580\7\u0085"+
		"\2\2\u0580\u0581\7s\2\2\u0581\u0582\5\u015e\u00b0\2\u0582\u00c5\3\2\2"+
		"\2\u0583\u0584\7\u0086\2\2\u0584\u0585\7s\2\2\u0585\u0586\t$\2\2\u0586"+
		"\u00c7\3\2\2\2\u0587\u0588\7\u008b\2\2\u0588\u0589\7s\2\2\u0589\u058a"+
		"\7\u0120\2\2\u058a\u00c9\3\2\2\2\u058b\u058c\7\u008c\2\2\u058c\u058d\7"+
		"s\2\2\u058d\u058e\5\u015e\u00b0\2\u058e\u00cb\3\2\2\2\u058f\u0590\7\u008d"+
		"\2\2\u0590\u0591\7s\2\2\u0591\u0592\5\u009cO\2\u0592\u00cd\3\2\2\2\u0593"+
		"\u0594\7\u008e\2\2\u0594\u0595\7s\2\2\u0595\u0596\7\u0120\2\2\u0596\u00cf"+
		"\3\2\2\2\u0597\u0598\7\u008f\2\2\u0598\u0599\7s\2\2\u0599\u059a\5\u015e"+
		"\u00b0\2\u059a\u00d1\3\2\2\2\u059b\u059c\7\u0090\2\2\u059c\u059d\7s\2"+
		"\2\u059d\u059e\5\u009cO\2\u059e\u00d3\3\2\2\2\u059f\u05a0\7\u0091\2\2"+
		"\u05a0\u05a1\7s\2\2\u05a1\u05a2\7\u0122\2\2\u05a2\u00d5\3\2\2\2\u05a3"+
		"\u05a4\7\u0092\2\2\u05a4\u05a5\7s\2\2\u05a5\u05a6\7\u0120\2\2\u05a6\u00d7"+
		"\3\2\2\2\u05a7\u05a8\7\u0093\2\2\u05a8\u05a9\7s\2\2\u05a9\u05aa\t%\2\2"+
		"\u05aa\u00d9\3\2\2\2\u05ab\u05ac\7\u0097\2\2\u05ac\u05ad\7s\2\2\u05ad"+
		"\u05ae\5\u0154\u00ab\2\u05ae\u00db\3\2\2\2\u05af\u05b0\7\u0098\2\2\u05b0"+
		"\u05b1\7s\2\2\u05b1\u05b2\7\u0120\2\2\u05b2\u00dd\3\2\2\2\u05b3\u05b4"+
		"\7\u0099\2\2\u05b4\u05b5\7s\2\2\u05b5\u05b6\5\u009cO\2\u05b6\u00df\3\2"+
		"\2\2\u05b7\u05b8\7\u009a\2\2\u05b8\u05b9\7s\2\2\u05b9\u05ba\5\u009cO\2"+
		"\u05ba\u00e1\3\2\2\2\u05bb\u05bc\7\u009b\2\2\u05bc\u05bd\7s\2\2\u05bd"+
		"\u05be\7\u0120\2\2\u05be\u00e3\3\2\2\2\u05bf\u05c0\7\u009c\2\2\u05c0\u05c1"+
		"\7s\2\2\u05c1\u05c2\7\u0122\2\2\u05c2\u00e5\3\2\2\2\u05c3\u05c4\7\u009d"+
		"\2\2\u05c4\u05c5\7s\2\2\u05c5\u05c6\7\u0122\2\2\u05c6\u00e7\3\2\2\2\u05c7"+
		"\u05c8\7\u009e\2\2\u05c8\u05c9\7s\2\2\u05c9\u05ca\5\u009cO\2\u05ca\u00e9"+
		"\3\2\2\2\u05cb\u05cc\7\u009f\2\2\u05cc\u05cd\7s\2\2\u05cd\u05ce\5\u0152"+
		"\u00aa\2\u05ce\u00eb\3\2\2\2\u05cf\u05d0\7\u00a0\2\2\u05d0\u05d1\7s\2"+
		"\2\u05d1\u05d2\5\u0152\u00aa\2\u05d2\u00ed\3\2\2\2\u05d3\u05d4\7\u00a1"+
		"\2\2\u05d4\u05d5\7s\2\2\u05d5\u05d6\t&\2\2\u05d6\u00ef\3\2\2\2\u05d7\u05d8"+
		"\7\u00a5\2\2\u05d8\u05d9\7s\2\2\u05d9\u05da\5\u015e\u00b0\2\u05da\u00f1"+
		"\3\2\2\2\u05db\u05dc\7\u00a6\2\2\u05dc\u05dd\7s\2\2\u05dd\u05de\5\u009c"+
		"O\2\u05de\u00f3\3\2\2\2\u05df\u05e0\7\u00a7\2\2\u05e0\u05e1\7s\2\2\u05e1"+
		"\u05e2\t\'\2\2\u05e2\u00f5\3\2\2\2\u05e3\u05e4\7\u00aa\2\2\u05e4\u05e5"+
		"\7s\2\2\u05e5\u05e6\5\u009cO\2\u05e6\u00f7\3\2\2\2\u05e7\u05e8\7\u00ab"+
		"\2\2\u05e8\u05e9\7s\2\2\u05e9\u05ea\5\u015e\u00b0\2\u05ea\u00f9\3\2\2"+
		"\2\u05eb\u05ec\7\u00ac\2\2\u05ec\u05ed\7s\2\2\u05ed\u05ee\5\u009cO\2\u05ee"+
		"\u00fb\3\2\2\2\u05ef\u05f0\7\u00ad\2\2\u05f0\u05f1\7s\2\2\u05f1\u05f2"+
		"\5\u009cO\2\u05f2\u00fd\3\2\2\2\u05f3\u05f4\7\u00ae\2\2\u05f4\u05f5\7"+
		"s\2\2\u05f5\u05f6\7\u0120\2\2\u05f6\u00ff\3\2\2\2\u05f7\u05f8\7\u00af"+
		"\2\2\u05f8\u05f9\7s\2\2\u05f9\u05fa\5\u015e\u00b0\2\u05fa\u0101\3\2\2"+
		"\2\u05fb\u05fc\7\u00b0\2\2\u05fc\u05fd\7s\2\2\u05fd\u05fe\5\u009cO\2\u05fe"+
		"\u0103\3\2\2\2\u05ff\u0600\7\u00b1\2\2\u0600\u0601\7s\2\2\u0601\u0602"+
		"\t(\2\2\u0602\u0105\3\2\2\2\u0603\u0604\7\u00b4\2\2\u0604\u0605\7s\2\2"+
		"\u0605\u0606\5\u009cO\2\u0606\u0107\3\2\2\2\u0607\u0608\7\u00b5\2\2\u0608"+
		"\u0609\7s\2\2\u0609\u060a\5\u009cO\2\u060a\u0109\3\2\2\2\u060b\u060c\7"+
		"\u00b6\2\2\u060c\u060d\7s\2\2\u060d\u060e\5\u009cO\2\u060e\u010b\3\2\2"+
		"\2\u060f\u0610\7\u00b7\2\2\u0610\u0611\7s\2\2\u0611\u0612\7\u0122\2\2"+
		"\u0612\u0613\7\u0122\2\2\u0613\u0614\7\u0122\2\2\u0614\u010d\3\2\2\2\u0615"+
		"\u0616\7\u00b8\2\2\u0616\u0617\7s\2\2\u0617\u0618\t)\2\2\u0618\u010f\3"+
		"\2\2\2\u0619\u061a\7\u00c8\2\2\u061a\u061b\7s\2\2\u061b\u061d\7\u0122"+
		"\2\2\u061c\u061e\7\u0122\2\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e"+
		"\u0111\3\2\2\2\u061f\u0620\7\u00c9\2\2\u0620\u0621\7s\2\2\u0621\u0622"+
		"\7\u0122\2\2\u0622\u0113\3\2\2\2\u0623\u0624\7\u00ca\2\2\u0624\u0625\7"+
		"s\2\2\u0625\u0626\5\u009cO\2\u0626\u0115\3\2\2\2\u0627\u0628\7\u00cb\2"+
		"\2\u0628\u0629\7s\2\2\u0629\u062a\7\u0120\2\2\u062a\u0117\3\2\2\2\u062b"+
		"\u062c\7\u00cc\2\2\u062c\u062d\7s\2\2\u062d\u062e\7\u0122\2\2\u062e\u0119"+
		"\3\2\2\2\u062f\u0630\7\u00cd\2\2\u0630\u0631\7s\2\2\u0631\u0632\5\u009c"+
		"O\2\u0632\u011b\3\2\2\2\u0633\u0634\7\u00ce\2\2\u0634\u0635\7s\2\2\u0635"+
		"\u0636\7\u0120\2\2\u0636\u011d\3\2\2\2\u0637\u0638\7\u00cf\2\2\u0638\u0639"+
		"\7s\2\2\u0639\u063a\7\u0122\2\2\u063a\u011f\3\2\2\2\u063b\u063c\7\u00d0"+
		"\2\2\u063c\u063d\7s\2\2\u063d\u063e\5\u009cO\2\u063e\u0121\3\2\2\2\u063f"+
		"\u0640\7\u00d1\2\2\u0640\u0641\7s\2\2\u0641\u0642\7\u0120\2\2\u0642\u0123"+
		"\3\2\2\2\u0643\u0644\7\u00d2\2\2\u0644\u0645\7s\2\2\u0645\u0646\7\u0122"+
		"\2\2\u0646\u0125\3\2\2\2\u0647\u0648\7\u00d3\2\2\u0648\u0649\7s\2\2\u0649"+
		"\u064a\t*\2\2\u064a\u0127\3\2\2\2\u064b\u064c\7\u00da\2\2\u064c\u064d"+
		"\7s\2\2\u064d\u064e\7\u0122\2\2\u064e\u0129\3\2\2\2\u064f\u0650\7\u00db"+
		"\2\2\u0650\u0651\7s\2\2\u0651\u0652\7\u0120\2\2\u0652\u012b\3\2\2\2\u0653"+
		"\u0654\7\u00dc\2\2\u0654\u0655\7s\2\2\u0655\u0656\7\u0120\2\2\u0656\u012d"+
		"\3\2\2\2\u0657\u0658\7\u00dd\2\2\u0658\u0659\7s\2\2\u0659\u065a\7\u0122"+
		"\2\2\u065a\u012f\3\2\2\2\u065b\u065c\7\u00de\2\2\u065c\u065d\7s\2\2\u065d"+
		"\u065e\7\u0122\2\2\u065e\u0131\3\2\2\2\u065f\u0660\7\u00df\2\2\u0660\u0661"+
		"\7s\2\2\u0661\u0662\7\u0122\2\2\u0662\u0133\3\2\2\2\u0663\u0664\7\u00e0"+
		"\2\2\u0664\u0665\7s\2\2\u0665\u0667\5\u009cO\2\u0666\u0668\7\u0122\2\2"+
		"\u0667\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0135\3\2\2\2\u0669\u066a"+
		"\7\u00e1\2\2\u066a\u066b\7s\2\2\u066b\u066c\7\u0122\2\2\u066c\u0137\3"+
		"\2\2\2\u066d\u066e\7\u00e2\2\2\u066e\u066f\7s\2\2\u066f\u0670\7\u0122"+
		"\2\2\u0670\u0139\3\2\2\2\u0671\u0672\7\u00e3\2\2\u0672\u0673\7s\2\2\u0673"+
		"\u0674\7\u0122\2\2\u0674\u013b\3\2\2\2\u0675\u0676\7\u00e4\2\2\u0676\u0677"+
		"\7s\2\2\u0677\u0678\5\u009cO\2\u0678\u013d\3\2\2\2\u0679\u067a\7\u00e5"+
		"\2\2\u067a\u067b\7s\2\2\u067b\u067c\5\u009cO\2\u067c\u013f\3\2\2\2\u067d"+
		"\u067e\7\u00e6\2\2\u067e\u067f\7s\2\2\u067f\u0680\7\u0122\2\2\u0680\u0141"+
		"\3\2\2\2\u0681\u0682\7\u00e7\2\2\u0682\u0683\7s\2\2\u0683\u0684\7\u0122"+
		"\2\2\u0684\u0143\3\2\2\2\u0685\u0686\7\u00e8\2\2\u0686\u0687\7s\2\2\u0687"+
		"\u0688\7\u0122\2\2\u0688\u0145\3\2\2\2\u0689\u068a\7\u00e9\2\2\u068a\u068b"+
		"\7s\2\2\u068b\u068c\7\u0122\2\2\u068c\u0147\3\2\2\2\u068d\u068e\7\u00ea"+
		"\2\2\u068e\u068f\7s\2\2\u068f\u0690\5\u015e\u00b0\2\u0690\u0149\3\2\2"+
		"\2\u0691\u0692\7\u0125\2\2\u0692\u0693\5\u014c\u00a7\2\u0693\u0694\7\u0126"+
		"\2\2\u0694\u014b\3\2\2\2\u0695\u0697\5\u015a\u00ae\2\u0696\u0695\3\2\2"+
		"\2\u0696\u0697\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u069a\7\u00eb\2\2\u0699"+
		"\u069b\5\u015a\u00ae\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u014d"+
		"\3\2\2\2\u069c\u069e\7X\2\2\u069d\u069f\5\u009cO\2\u069e\u069d\3\2\2\2"+
		"\u069e\u069f\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a2\7i\2\2\u06a1\u06a3"+
		"\5\u009cO\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4\3\2\2"+
		"\2\u06a4\u06a5\7Y\2\2\u06a5\u014f\3\2\2\2\u06a6\u06a8\n+\2\2\u06a7\u06a6"+
		"\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06a9\u06a7\3\2\2\2\u06aa"+
		"\u0151\3\2\2\2\u06ab\u06ac\t,\2\2\u06ac\u0153\3\2\2\2\u06ad\u06ae\t-\2"+
		"\2\u06ae\u0155\3\2\2\2\u06af\u06b0\t.\2\2\u06b0\u0157\3\2\2\2\u06b1\u06b2"+
		"\t/\2\2\u06b2\u0159\3\2\2\2\u06b3\u06b4\t\60\2\2\u06b4\u015b\3\2\2\2\u06b5"+
		"\u06b6\t\61\2\2\u06b6\u015d\3\2\2\2\u06b7\u06b8\t\62\2\2\u06b8\u015f\3"+
		"\2\2\2\u0090\u0196\u0198\u01b0\u01b2\u01bd\u01c1\u01c5\u01c9\u01cd\u01d1"+
		"\u01d5\u01d9\u01dd\u01e0\u01e5\u01ed\u01f0\u01fa\u0200\u0204\u0207\u020f"+
		"\u0213\u0217\u021a\u021e\u0223\u0227\u022a\u022e\u0231\u0235\u0238\u023b"+
		"\u023e\u0243\u0247\u024b\u024f\u0254\u0260\u0268\u026f\u0272\u027a\u027d"+
		"\u0281\u0288\u028b\u028f\u0296\u0299\u029c\u02a1\u02a5\u02a8\u02ab\u02b0"+
		"\u02b4\u02b7\u02be\u02c1\u02c9\u02cd\u02d1\u02d4\u02dc\u02e0\u02e4\u02e7"+
		"\u02ef\u02f3\u02fd\u0301\u030e\u0319\u0324\u0328\u0344\u034a\u0352\u0358"+
		"\u0360\u0366\u036e\u0374\u037c\u0382\u038a\u0390\u0398\u039e\u03b9\u03bb"+
		"\u03c0\u03c9\u03cb\u03d9\u03e1\u03ed\u03f4\u0400\u0406\u040c\u0412\u0418"+
		"\u041e\u0424\u0433\u043e\u0443\u044c\u0454\u0465\u0469\u0473\u047b\u047e"+
		"\u048a\u048e\u0491\u049a\u04af\u04b2\u04bc\u04bf\u04c9\u0520\u0528\u052a"+
		"\u0534\u054a\u0550\u0577\u057b\u061d\u0667\u0696\u069a\u069e\u06a2\u06a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}