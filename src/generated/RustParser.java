// Generated from /home/socub/U/tesis/antlr-rust-project/grammars/RustParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RustParser extends RustParserBase {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_AS=1, KW_BREAK=2, KW_CONST=3, KW_CONTINUE=4, KW_CRATE=5, KW_ELSE=6, 
		KW_ENUM=7, KW_EXTERN=8, KW_FALSE=9, KW_FN=10, KW_FOR=11, KW_IF=12, KW_IMPL=13, 
		KW_IN=14, KW_LET=15, KW_LOOP=16, KW_MATCH=17, KW_MOD=18, KW_MOVE=19, KW_MUT=20, 
		KW_PUB=21, KW_REF=22, KW_RETURN=23, KW_SELFVALUE=24, KW_PIN=25, KW_SELFTYPE=26, 
		KW_STATIC=27, KW_STRUCT=28, KW_SUPER=29, KW_TRAIT=30, KW_TRUE=31, KW_TYPE=32, 
		KW_UNSAFE=33, KW_SAFE=34, KW_USE=35, KW_WHERE=36, KW_WHILE=37, KW_ASYNC=38, 
		KW_AWAIT=39, KW_DYN=40, KW_AUTO=41, KW_ABSTRACT=42, KW_BECOME=43, KW_BOX=44, 
		KW_DO=45, KW_YEET=46, KW_FINAL=47, KW_MACRO=48, KW_OVERRIDE=49, KW_PRIV=50, 
		KW_TYPEOF=51, KW_UNSIZED=52, KW_VIRTUAL=53, KW_YIELD=54, KW_TRY=55, KW_UNION=56, 
		KW_STATICLIFETIME=57, KW_RAW=58, KW_DEFAULT=59, KW_MACRORULES=60, KW_DOLLARCRATE=61, 
		KW_GEN=62, CLOSURE_FN=63, CLOSURE_FNMUT=64, CLOSURE_FNONCE=65, NON_KEYWORD_IDENTIFIER=66, 
		RAW_IDENTIFIER=67, LINE_COMMENT=68, BLOCK_COMMENT=69, SHEBANG=70, WHITESPACE=71, 
		NEWLINE=72, CHAR_LITERAL=73, STRING_LITERAL=74, RAW_STRING_LITERAL=75, 
		BYTE_LITERAL=76, BYTE_STRING_LITERAL=77, RAW_BYTE_STRING_LITERAL=78, C_STRING_LITERAL=79, 
		RAW_C_STRING_LITERAL=80, INTEGER_LITERAL=81, DEC_LITERAL=82, HEX_LITERAL=83, 
		OCT_LITERAL=84, BIN_LITERAL=85, FLOAT_LITERAL=86, LIFETIME_OR_LABEL=87, 
		PLUS=88, MINUS=89, STAR=90, SLASH=91, PERCENT=92, CARET=93, NOT=94, TILDE=95, 
		AND=96, OR=97, ANDAND=98, OROR=99, PLUSEQ=100, MINUSEQ=101, STAREQ=102, 
		SLASHEQ=103, PERCENTEQ=104, CARETEQ=105, ANDEQ=106, OREQ=107, SHLEQ=108, 
		SHREQ=109, EQ=110, EQEQ=111, NE=112, GT=113, LT=114, GE=115, LE=116, AT=117, 
		UNDERSCORE=118, DOT=119, DOTDOT=120, DOTDOTDOT=121, DOTDOTEQ=122, COMMA=123, 
		SEMI=124, COLON=125, PATHSEP=126, RARROW=127, FATARROW=128, POUND=129, 
		DOLLAR=130, QUESTION=131, LCURLYBRACE=132, RCURLYBRACE=133, LSQUAREBRACKET=134, 
		RSQUAREBRACKET=135, LPAREN=136, RPAREN=137, KW_UNDERLINELIFETIME=138;
	public static final int
		RULE_crate = 0, RULE_macroInvocation = 1, RULE_delimTokenTree = 2, RULE_tokenTree = 3, 
		RULE_tokenTreeToken = 4, RULE_macroInvocationSemi = 5, RULE_macroRulesDefinition = 6, 
		RULE_declMacro = 7, RULE_macroRulesDef = 8, RULE_macroRules = 9, RULE_macroRule = 10, 
		RULE_macroMatcher = 11, RULE_macroMatch = 12, RULE_macroMatchToken = 13, 
		RULE_macroFragSpec = 14, RULE_macroRepSep = 15, RULE_macroRepOp = 16, 
		RULE_macroTranscriber = 17, RULE_item = 18, RULE_visItem = 19, RULE_macroItem = 20, 
		RULE_module = 21, RULE_externCrate = 22, RULE_crateRef = 23, RULE_asClause = 24, 
		RULE_useDeclaration = 25, RULE_useTree = 26, RULE_function_ = 27, RULE_functionQualifiers = 28, 
		RULE_abi = 29, RULE_functionParameters = 30, RULE_selfParam = 31, RULE_shorthandSelf = 32, 
		RULE_typedSelf = 33, RULE_functionParam = 34, RULE_functionParamPattern = 35, 
		RULE_functionReturnType = 36, RULE_typeAlias = 37, RULE_struct_ = 38, 
		RULE_structStruct = 39, RULE_tupleStruct = 40, RULE_structFields = 41, 
		RULE_structField = 42, RULE_tupleFields = 43, RULE_tupleField = 44, RULE_enumeration = 45, 
		RULE_enumItems = 46, RULE_enumItem = 47, RULE_enumItemTuple = 48, RULE_enumItemStruct = 49, 
		RULE_enumItemDiscriminant = 50, RULE_union_ = 51, RULE_constantItem = 52, 
		RULE_staticItem = 53, RULE_trait_ = 54, RULE_implementation = 55, RULE_inherentImpl = 56, 
		RULE_traitImpl = 57, RULE_externBlock = 58, RULE_externalItem = 59, RULE_externType = 60, 
		RULE_genericParams = 61, RULE_genericParam = 62, RULE_lifetimeParam = 63, 
		RULE_typeParam = 64, RULE_constParam = 65, RULE_constParamDefault = 66, 
		RULE_whereClause = 67, RULE_whereClauseItem = 68, RULE_lifetimeWhereClauseItem = 69, 
		RULE_typeBoundWhereClauseItem = 70, RULE_forLifetimes = 71, RULE_associatedItem = 72, 
		RULE_innerAttribute = 73, RULE_outerAttribute = 74, RULE_attr = 75, RULE_attrInput = 76, 
		RULE_statement = 77, RULE_letStatement = 78, RULE_expressionStatement = 79, 
		RULE_expression = 80, RULE_comparisonOperator = 81, RULE_compoundAssignOperator = 82, 
		RULE_expressionWithBlock = 83, RULE_generatorBlockExpression = 84, RULE_asyncGeneratorBlockExpression = 85, 
		RULE_literalExpression = 86, RULE_pathExpression = 87, RULE_blockExpression = 88, 
		RULE_statements = 89, RULE_asyncBlockExpression = 90, RULE_unsafeBlockExpression = 91, 
		RULE_constBlockExpression = 92, RULE_tryBlockExpression = 93, RULE_arrayElements = 94, 
		RULE_tupleElements = 95, RULE_tupleIndex = 96, RULE_structExpression = 97, 
		RULE_structExprStruct = 98, RULE_structExprFields = 99, RULE_structExprField = 100, 
		RULE_structBase = 101, RULE_structExprTuple = 102, RULE_structExprUnit = 103, 
		RULE_enumerationVariantExpression = 104, RULE_enumExprStruct = 105, RULE_enumExprFields = 106, 
		RULE_enumExprField = 107, RULE_enumExprTuple = 108, RULE_enumExprFieldless = 109, 
		RULE_callParams = 110, RULE_closureExpression = 111, RULE_closureParameters = 112, 
		RULE_closureParam = 113, RULE_loopExpression = 114, RULE_infiniteLoopExpression = 115, 
		RULE_predicateLoopExpression = 116, RULE_predicatePatternLoopExpression = 117, 
		RULE_iteratorLoopExpression = 118, RULE_labelBlockExpression = 119, RULE_loopLabel = 120, 
		RULE_ifExpression = 121, RULE_ifLetExpression = 122, RULE_letExpression = 123, 
		RULE_matchExpression = 124, RULE_matchArms = 125, RULE_matchArmExpression = 126, 
		RULE_matchArm = 127, RULE_matchArmGuard = 128, RULE_pattern = 129, RULE_patternNoTopAlt = 130, 
		RULE_patternWithoutRange = 131, RULE_boxPattern = 132, RULE_literalPattern = 133, 
		RULE_identifierPattern = 134, RULE_wildcardPattern = 135, RULE_restPattern = 136, 
		RULE_rangePattern = 137, RULE_rangePatternBound = 138, RULE_referencePattern = 139, 
		RULE_structPattern = 140, RULE_structPatternElements = 141, RULE_structPatternFields = 142, 
		RULE_structPatternField = 143, RULE_structPatternEtCetera = 144, RULE_tupleStructPattern = 145, 
		RULE_tupleStructItems = 146, RULE_tuplePattern = 147, RULE_tuplePatternItems = 148, 
		RULE_groupedPattern = 149, RULE_slicePattern = 150, RULE_slicePatternItems = 151, 
		RULE_pathPattern = 152, RULE_type_ = 153, RULE_typeNoBounds = 154, RULE_parenthesizedType = 155, 
		RULE_neverType = 156, RULE_tupleType = 157, RULE_arrayType = 158, RULE_sliceType = 159, 
		RULE_referenceType = 160, RULE_rawPointerType = 161, RULE_bareFunctionType = 162, 
		RULE_functionTypeQualifiers = 163, RULE_bareFunctionReturnType = 164, 
		RULE_functionParametersMaybeNamedVariadic = 165, RULE_maybeNamedFunctionParameters = 166, 
		RULE_maybeNamedParam = 167, RULE_maybeNamedFunctionParametersVariadic = 168, 
		RULE_traitObjectType = 169, RULE_traitObjectTypeOneBound = 170, RULE_implTraitType = 171, 
		RULE_implTraitTypeOneBound = 172, RULE_closureTraitType = 173, RULE_inferredType = 174, 
		RULE_typeParamBounds = 175, RULE_boundElement = 176, RULE_typeParamBound = 177, 
		RULE_traitBound = 178, RULE_useBound = 179, RULE_useBoundGenericArgs = 180, 
		RULE_useBoundGenericArg = 181, RULE_lifetimeBounds = 182, RULE_lifetime = 183, 
		RULE_simplePath = 184, RULE_simplePathSegment = 185, RULE_pathInExpression = 186, 
		RULE_pathExprSegment = 187, RULE_pathIdentSegment = 188, RULE_genericArgs = 189, 
		RULE_genericArg = 190, RULE_genericArgsConst = 191, RULE_genericArgsLifetimes = 192, 
		RULE_genericArgsTypes = 193, RULE_genericArgsBindings = 194, RULE_genericArgsBinding = 195, 
		RULE_genericArgsBound = 196, RULE_qualifiedPathInExpression = 197, RULE_qualifiedPathType = 198, 
		RULE_qualifiedPathInType = 199, RULE_typePath = 200, RULE_typePathSegment = 201, 
		RULE_typePathFn = 202, RULE_typePathInputs = 203, RULE_visibility = 204, 
		RULE_identifier = 205, RULE_keyword = 206, RULE_non_crate_keyword = 207, 
		RULE_macroIdentifierLikeToken = 208, RULE_macroLiteralToken = 209, RULE_macroPunctuationToken = 210, 
		RULE_shl = 211, RULE_shr = 212;
	private static String[] makeRuleNames() {
		return new String[] {
			"crate", "macroInvocation", "delimTokenTree", "tokenTree", "tokenTreeToken", 
			"macroInvocationSemi", "macroRulesDefinition", "declMacro", "macroRulesDef", 
			"macroRules", "macroRule", "macroMatcher", "macroMatch", "macroMatchToken", 
			"macroFragSpec", "macroRepSep", "macroRepOp", "macroTranscriber", "item", 
			"visItem", "macroItem", "module", "externCrate", "crateRef", "asClause", 
			"useDeclaration", "useTree", "function_", "functionQualifiers", "abi", 
			"functionParameters", "selfParam", "shorthandSelf", "typedSelf", "functionParam", 
			"functionParamPattern", "functionReturnType", "typeAlias", "struct_", 
			"structStruct", "tupleStruct", "structFields", "structField", "tupleFields", 
			"tupleField", "enumeration", "enumItems", "enumItem", "enumItemTuple", 
			"enumItemStruct", "enumItemDiscriminant", "union_", "constantItem", "staticItem", 
			"trait_", "implementation", "inherentImpl", "traitImpl", "externBlock", 
			"externalItem", "externType", "genericParams", "genericParam", "lifetimeParam", 
			"typeParam", "constParam", "constParamDefault", "whereClause", "whereClauseItem", 
			"lifetimeWhereClauseItem", "typeBoundWhereClauseItem", "forLifetimes", 
			"associatedItem", "innerAttribute", "outerAttribute", "attr", "attrInput", 
			"statement", "letStatement", "expressionStatement", "expression", "comparisonOperator", 
			"compoundAssignOperator", "expressionWithBlock", "generatorBlockExpression", 
			"asyncGeneratorBlockExpression", "literalExpression", "pathExpression", 
			"blockExpression", "statements", "asyncBlockExpression", "unsafeBlockExpression", 
			"constBlockExpression", "tryBlockExpression", "arrayElements", "tupleElements", 
			"tupleIndex", "structExpression", "structExprStruct", "structExprFields", 
			"structExprField", "structBase", "structExprTuple", "structExprUnit", 
			"enumerationVariantExpression", "enumExprStruct", "enumExprFields", "enumExprField", 
			"enumExprTuple", "enumExprFieldless", "callParams", "closureExpression", 
			"closureParameters", "closureParam", "loopExpression", "infiniteLoopExpression", 
			"predicateLoopExpression", "predicatePatternLoopExpression", "iteratorLoopExpression", 
			"labelBlockExpression", "loopLabel", "ifExpression", "ifLetExpression", 
			"letExpression", "matchExpression", "matchArms", "matchArmExpression", 
			"matchArm", "matchArmGuard", "pattern", "patternNoTopAlt", "patternWithoutRange", 
			"boxPattern", "literalPattern", "identifierPattern", "wildcardPattern", 
			"restPattern", "rangePattern", "rangePatternBound", "referencePattern", 
			"structPattern", "structPatternElements", "structPatternFields", "structPatternField", 
			"structPatternEtCetera", "tupleStructPattern", "tupleStructItems", "tuplePattern", 
			"tuplePatternItems", "groupedPattern", "slicePattern", "slicePatternItems", 
			"pathPattern", "type_", "typeNoBounds", "parenthesizedType", "neverType", 
			"tupleType", "arrayType", "sliceType", "referenceType", "rawPointerType", 
			"bareFunctionType", "functionTypeQualifiers", "bareFunctionReturnType", 
			"functionParametersMaybeNamedVariadic", "maybeNamedFunctionParameters", 
			"maybeNamedParam", "maybeNamedFunctionParametersVariadic", "traitObjectType", 
			"traitObjectTypeOneBound", "implTraitType", "implTraitTypeOneBound", 
			"closureTraitType", "inferredType", "typeParamBounds", "boundElement", 
			"typeParamBound", "traitBound", "useBound", "useBoundGenericArgs", "useBoundGenericArg", 
			"lifetimeBounds", "lifetime", "simplePath", "simplePathSegment", "pathInExpression", 
			"pathExprSegment", "pathIdentSegment", "genericArgs", "genericArg", "genericArgsConst", 
			"genericArgsLifetimes", "genericArgsTypes", "genericArgsBindings", "genericArgsBinding", 
			"genericArgsBound", "qualifiedPathInExpression", "qualifiedPathType", 
			"qualifiedPathInType", "typePath", "typePathSegment", "typePathFn", "typePathInputs", 
			"visibility", "identifier", "keyword", "non_crate_keyword", "macroIdentifierLikeToken", 
			"macroLiteralToken", "macroPunctuationToken", "shl", "shr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'break'", "'const'", "'continue'", "'crate'", "'else'", 
			"'enum'", "'extern'", "'false'", "'fn'", "'for'", "'if'", "'impl'", "'in'", 
			"'let'", "'loop'", "'match'", "'mod'", "'move'", "'mut'", "'pub'", "'ref'", 
			"'return'", "'self'", "'pin'", "'Self'", "'static'", "'struct'", "'super'", 
			"'trait'", "'true'", "'type'", "'unsafe'", "'safe'", "'use'", "'where'", 
			"'while'", "'async'", "'await'", "'dyn'", "'auto'", "'abstract'", "'become'", 
			"'box'", "'do'", "'yeet'", "'final'", "'macro'", "'override'", "'priv'", 
			"'typeof'", "'unsized'", "'virtual'", "'yield'", "'try'", "'union'", 
			"''static'", "'raw'", "'default'", "'macro_rules'", "'$crate'", "'gen'", 
			"'Fn'", "'FnMut'", "'FnOnce'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'~'", 
			"'&'", "'|'", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'^='", "'&='", "'|='", "'<<='", "'>>='", "'='", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'@'", "'_'", "'.'", "'..'", "'...'", "'..='", 
			"','", "';'", "':'", "'::'", "'->'", "'=>'", "'#'", "'$'", "'?'", "'{'", 
			"'}'", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_AS", "KW_BREAK", "KW_CONST", "KW_CONTINUE", "KW_CRATE", "KW_ELSE", 
			"KW_ENUM", "KW_EXTERN", "KW_FALSE", "KW_FN", "KW_FOR", "KW_IF", "KW_IMPL", 
			"KW_IN", "KW_LET", "KW_LOOP", "KW_MATCH", "KW_MOD", "KW_MOVE", "KW_MUT", 
			"KW_PUB", "KW_REF", "KW_RETURN", "KW_SELFVALUE", "KW_PIN", "KW_SELFTYPE", 
			"KW_STATIC", "KW_STRUCT", "KW_SUPER", "KW_TRAIT", "KW_TRUE", "KW_TYPE", 
			"KW_UNSAFE", "KW_SAFE", "KW_USE", "KW_WHERE", "KW_WHILE", "KW_ASYNC", 
			"KW_AWAIT", "KW_DYN", "KW_AUTO", "KW_ABSTRACT", "KW_BECOME", "KW_BOX", 
			"KW_DO", "KW_YEET", "KW_FINAL", "KW_MACRO", "KW_OVERRIDE", "KW_PRIV", 
			"KW_TYPEOF", "KW_UNSIZED", "KW_VIRTUAL", "KW_YIELD", "KW_TRY", "KW_UNION", 
			"KW_STATICLIFETIME", "KW_RAW", "KW_DEFAULT", "KW_MACRORULES", "KW_DOLLARCRATE", 
			"KW_GEN", "CLOSURE_FN", "CLOSURE_FNMUT", "CLOSURE_FNONCE", "NON_KEYWORD_IDENTIFIER", 
			"RAW_IDENTIFIER", "LINE_COMMENT", "BLOCK_COMMENT", "SHEBANG", "WHITESPACE", 
			"NEWLINE", "CHAR_LITERAL", "STRING_LITERAL", "RAW_STRING_LITERAL", "BYTE_LITERAL", 
			"BYTE_STRING_LITERAL", "RAW_BYTE_STRING_LITERAL", "C_STRING_LITERAL", 
			"RAW_C_STRING_LITERAL", "INTEGER_LITERAL", "DEC_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BIN_LITERAL", "FLOAT_LITERAL", "LIFETIME_OR_LABEL", "PLUS", 
			"MINUS", "STAR", "SLASH", "PERCENT", "CARET", "NOT", "TILDE", "AND", 
			"OR", "ANDAND", "OROR", "PLUSEQ", "MINUSEQ", "STAREQ", "SLASHEQ", "PERCENTEQ", 
			"CARETEQ", "ANDEQ", "OREQ", "SHLEQ", "SHREQ", "EQ", "EQEQ", "NE", "GT", 
			"LT", "GE", "LE", "AT", "UNDERSCORE", "DOT", "DOTDOT", "DOTDOTDOT", "DOTDOTEQ", 
			"COMMA", "SEMI", "COLON", "PATHSEP", "RARROW", "FATARROW", "POUND", "DOLLAR", 
			"QUESTION", "LCURLYBRACE", "RCURLYBRACE", "LSQUAREBRACKET", "RSQUAREBRACKET", 
			"LPAREN", "RPAREN", "KW_UNDERLINELIFETIME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "RustParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RustParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RustParser.EOF, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public CrateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCrate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCrate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCrate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrateContext crate() throws RecognitionException {
		CrateContext _localctx = new CrateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(426);
					innerAttribute();
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22473700122786635L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
				{
				{
				setState(432);
				item();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroInvocationContext extends ParserRuleContext {
		public List<SimplePathContext> simplePath() {
			return getRuleContexts(SimplePathContext.class);
		}
		public SimplePathContext simplePath(int i) {
			return getRuleContext(SimplePathContext.class,i);
		}
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public MacroInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroInvocationContext macroInvocation() throws RecognitionException {
		MacroInvocationContext _localctx = new MacroInvocationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_macroInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			simplePath();
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==POUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073615763439584L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
				{
				setState(442);
				simplePath();
				}
			}

			setState(445);
			delimTokenTree();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DelimTokenTreeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<TokenTreeContext> tokenTree() {
			return getRuleContexts(TokenTreeContext.class);
		}
		public TokenTreeContext tokenTree(int i) {
			return getRuleContext(TokenTreeContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public DelimTokenTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimTokenTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterDelimTokenTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitDelimTokenTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitDelimTokenTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimTokenTreeContext delimTokenTree() throws RecognitionException {
		DelimTokenTreeContext _localctx = new DelimTokenTreeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_delimTokenTree);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(LPAREN);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(448);
					tokenTree();
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(454);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(LSQUAREBRACKET);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(456);
					tokenTree();
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				match(LCURLYBRACE);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(464);
					tokenTree();
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
				match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TokenTreeContext extends ParserRuleContext {
		public List<TokenTreeTokenContext> tokenTreeToken() {
			return getRuleContexts(TokenTreeTokenContext.class);
		}
		public TokenTreeTokenContext tokenTreeToken(int i) {
			return getRuleContext(TokenTreeTokenContext.class,i);
		}
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public TokenTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTokenTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTokenTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTokenTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenTreeContext tokenTree() throws RecognitionException {
		TokenTreeContext _localctx = new TokenTreeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tokenTree);
		try {
			int _alt;
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_AS:
			case KW_BREAK:
			case KW_CONST:
			case KW_CONTINUE:
			case KW_CRATE:
			case KW_ELSE:
			case KW_ENUM:
			case KW_EXTERN:
			case KW_FALSE:
			case KW_FN:
			case KW_FOR:
			case KW_IF:
			case KW_IMPL:
			case KW_IN:
			case KW_LET:
			case KW_LOOP:
			case KW_MATCH:
			case KW_MOD:
			case KW_MOVE:
			case KW_MUT:
			case KW_PUB:
			case KW_REF:
			case KW_RETURN:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_STATIC:
			case KW_STRUCT:
			case KW_SUPER:
			case KW_TRAIT:
			case KW_TRUE:
			case KW_TYPE:
			case KW_UNSAFE:
			case KW_SAFE:
			case KW_USE:
			case KW_WHERE:
			case KW_WHILE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
			case KW_ABSTRACT:
			case KW_BECOME:
			case KW_BOX:
			case KW_DO:
			case KW_YEET:
			case KW_FINAL:
			case KW_MACRO:
			case KW_OVERRIDE:
			case KW_PRIV:
			case KW_TYPEOF:
			case KW_UNSIZED:
			case KW_VIRTUAL:
			case KW_YIELD:
			case KW_TRY:
			case KW_UNION:
			case KW_STATICLIFETIME:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case RAW_STRING_LITERAL:
			case BYTE_LITERAL:
			case BYTE_STRING_LITERAL:
			case RAW_BYTE_STRING_LITERAL:
			case C_STRING_LITERAL:
			case RAW_C_STRING_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case LIFETIME_OR_LABEL:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
			case PERCENT:
			case CARET:
			case NOT:
			case TILDE:
			case AND:
			case OR:
			case ANDAND:
			case OROR:
			case PLUSEQ:
			case MINUSEQ:
			case STAREQ:
			case SLASHEQ:
			case PERCENTEQ:
			case CARETEQ:
			case ANDEQ:
			case OREQ:
			case SHLEQ:
			case SHREQ:
			case EQ:
			case EQEQ:
			case NE:
			case GT:
			case LT:
			case GE:
			case LE:
			case AT:
			case UNDERSCORE:
			case DOT:
			case DOTDOT:
			case DOTDOTDOT:
			case DOTDOTEQ:
			case COMMA:
			case SEMI:
			case COLON:
			case PATHSEP:
			case RARROW:
			case FATARROW:
			case POUND:
			case DOLLAR:
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(474); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(473);
						tokenTreeToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(476); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				delimTokenTree();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TokenTreeTokenContext extends ParserRuleContext {
		public MacroIdentifierLikeTokenContext macroIdentifierLikeToken() {
			return getRuleContext(MacroIdentifierLikeTokenContext.class,0);
		}
		public MacroLiteralTokenContext macroLiteralToken() {
			return getRuleContext(MacroLiteralTokenContext.class,0);
		}
		public MacroPunctuationTokenContext macroPunctuationToken() {
			return getRuleContext(MacroPunctuationTokenContext.class,0);
		}
		public MacroRepOpContext macroRepOp() {
			return getRuleContext(MacroRepOpContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(RustParser.DOLLAR, 0); }
		public TokenTreeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenTreeToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTokenTreeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTokenTreeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTokenTreeToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenTreeTokenContext tokenTreeToken() throws RecognitionException {
		TokenTreeTokenContext _localctx = new TokenTreeTokenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tokenTreeToken);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				macroRepOp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				match(DOLLAR);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroInvocationSemiContext extends ParserRuleContext {
		public List<SimplePathContext> simplePath() {
			return getRuleContexts(SimplePathContext.class);
		}
		public SimplePathContext simplePath(int i) {
			return getRuleContext(SimplePathContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public List<TokenTreeContext> tokenTree() {
			return getRuleContexts(TokenTreeContext.class);
		}
		public TokenTreeContext tokenTree(int i) {
			return getRuleContext(TokenTreeContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public MacroInvocationSemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroInvocationSemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroInvocationSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroInvocationSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroInvocationSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroInvocationSemiContext macroInvocationSemi() throws RecognitionException {
		MacroInvocationSemiContext _localctx = new MacroInvocationSemiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_macroInvocationSemi);
		int _la;
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				simplePath();
				setState(489);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==POUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073615763439584L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
					{
					setState(490);
					simplePath();
					}
				}

				setState(493);
				match(LPAREN);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(494);
					tokenTree();
					}
					}
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(500);
				match(RPAREN);
				setState(501);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				simplePath();
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==POUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073615763439584L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
					{
					setState(505);
					simplePath();
					}
				}

				setState(508);
				match(LSQUAREBRACKET);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(509);
					tokenTree();
					}
					}
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(515);
				match(RSQUAREBRACKET);
				setState(516);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				simplePath();
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==POUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073615763439584L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
					{
					setState(520);
					simplePath();
					}
				}

				setState(523);
				match(LCURLYBRACE);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(524);
					tokenTree();
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(530);
				match(RCURLYBRACE);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroRulesDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_MACRORULES() { return getToken(RustParser.KW_MACRORULES, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MacroRulesDefContext macroRulesDef() {
			return getRuleContext(MacroRulesDefContext.class,0);
		}
		public MacroRulesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRulesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRulesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRulesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRulesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRulesDefinitionContext macroRulesDefinition() throws RecognitionException {
		MacroRulesDefinitionContext _localctx = new MacroRulesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_macroRulesDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(KW_MACRORULES);
			setState(535);
			match(NOT);
			setState(536);
			identifier();
			setState(537);
			macroRulesDef();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclMacroContext extends ParserRuleContext {
		public TerminalNode KW_MACRO() { return getToken(RustParser.KW_MACRO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<TokenTreeContext> tokenTree() {
			return getRuleContexts(TokenTreeContext.class);
		}
		public TokenTreeContext tokenTree(int i) {
			return getRuleContext(TokenTreeContext.class,i);
		}
		public DeclMacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declMacro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterDeclMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitDeclMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitDeclMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclMacroContext declMacro() throws RecognitionException {
		DeclMacroContext _localctx = new DeclMacroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declMacro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(539);
				visibility();
				}
			}

			setState(542);
			match(KW_MACRO);
			setState(543);
			identifier();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(544);
				match(LPAREN);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(545);
					tokenTree();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551);
				match(RPAREN);
				}
			}

			setState(554);
			match(LCURLYBRACE);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
				{
				{
				setState(555);
				tokenTree();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroRulesDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public MacroRulesContext macroRules() {
			return getRuleContext(MacroRulesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public MacroRulesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRulesDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRulesDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRulesDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRulesDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRulesDefContext macroRulesDef() throws RecognitionException {
		MacroRulesDefContext _localctx = new MacroRulesDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_macroRulesDef);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(LPAREN);
				setState(564);
				macroRules();
				setState(565);
				match(RPAREN);
				setState(566);
				match(SEMI);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(LSQUAREBRACKET);
				setState(569);
				macroRules();
				setState(570);
				match(RSQUAREBRACKET);
				setState(571);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(LCURLYBRACE);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 21L) != 0)) {
					{
					setState(574);
					macroRules();
					}
				}

				setState(577);
				match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroRulesContext extends ParserRuleContext {
		public List<MacroRuleContext> macroRule() {
			return getRuleContexts(MacroRuleContext.class);
		}
		public MacroRuleContext macroRule(int i) {
			return getRuleContext(MacroRuleContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(RustParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RustParser.SEMI, i);
		}
		public MacroRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRulesContext macroRules() throws RecognitionException {
		MacroRulesContext _localctx = new MacroRulesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_macroRules);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			macroRule();
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(581);
					match(SEMI);
					setState(582);
					macroRule();
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(588);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroRuleContext extends ParserRuleContext {
		public MacroMatcherContext macroMatcher() {
			return getRuleContext(MacroMatcherContext.class,0);
		}
		public TerminalNode FATARROW() { return getToken(RustParser.FATARROW, 0); }
		public MacroTranscriberContext macroTranscriber() {
			return getRuleContext(MacroTranscriberContext.class,0);
		}
		public MacroRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRuleContext macroRule() throws RecognitionException {
		MacroRuleContext _localctx = new MacroRuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_macroRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			macroMatcher();
			setState(592);
			match(FATARROW);
			setState(593);
			macroTranscriber();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroMatcherContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<MacroMatchContext> macroMatch() {
			return getRuleContexts(MacroMatchContext.class);
		}
		public MacroMatchContext macroMatch(int i) {
			return getRuleContext(MacroMatchContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public MacroMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroMatcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroMatcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroMatcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroMatcherContext macroMatcher() throws RecognitionException {
		MacroMatcherContext _localctx = new MacroMatcherContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_macroMatcher);
		int _la;
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				match(LPAREN);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(596);
					macroMatch();
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(602);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(LSQUAREBRACKET);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(604);
					macroMatch();
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(610);
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				match(LCURLYBRACE);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(612);
					macroMatch();
					}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(618);
				match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroMatchContext extends ParserRuleContext {
		public List<MacroMatchTokenContext> macroMatchToken() {
			return getRuleContexts(MacroMatchTokenContext.class);
		}
		public MacroMatchTokenContext macroMatchToken(int i) {
			return getRuleContext(MacroMatchTokenContext.class,i);
		}
		public MacroMatcherContext macroMatcher() {
			return getRuleContext(MacroMatcherContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(RustParser.DOLLAR, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public MacroFragSpecContext macroFragSpec() {
			return getRuleContext(MacroFragSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Non_crate_keywordContext non_crate_keyword() {
			return getRuleContext(Non_crate_keywordContext.class,0);
		}
		public TerminalNode KW_UNDERLINELIFETIME() { return getToken(RustParser.KW_UNDERLINELIFETIME, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public MacroRepOpContext macroRepOp() {
			return getRuleContext(MacroRepOpContext.class,0);
		}
		public List<MacroMatchContext> macroMatch() {
			return getRuleContexts(MacroMatchContext.class);
		}
		public MacroMatchContext macroMatch(int i) {
			return getRuleContext(MacroMatchContext.class,i);
		}
		public MacroRepSepContext macroRepSep() {
			return getRuleContext(MacroRepSepContext.class,0);
		}
		public MacroMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroMatchContext macroMatch() throws RecognitionException {
		MacroMatchContext _localctx = new MacroMatchContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_macroMatch);
		int _la;
		try {
			int _alt;
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(621);
						macroMatchToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(624); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				macroMatcher();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				match(DOLLAR);
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(628);
					identifier();
					}
					break;
				case 2:
					{
					setState(629);
					non_crate_keyword();
					}
					break;
				case 3:
					{
					setState(630);
					match(KW_UNDERLINELIFETIME);
					}
					break;
				}
				setState(633);
				match(COLON);
				setState(634);
				macroFragSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(635);
				match(DOLLAR);
				setState(636);
				match(LPAREN);
				setState(638); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(637);
					macroMatch();
					}
					}
					setState(640); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0) );
				setState(642);
				match(RPAREN);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -87818737L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 7L) != 0)) {
					{
					setState(643);
					macroRepSep();
					}
				}

				setState(646);
				macroRepOp();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroMatchTokenContext extends ParserRuleContext {
		public MacroIdentifierLikeTokenContext macroIdentifierLikeToken() {
			return getRuleContext(MacroIdentifierLikeTokenContext.class,0);
		}
		public MacroLiteralTokenContext macroLiteralToken() {
			return getRuleContext(MacroLiteralTokenContext.class,0);
		}
		public MacroPunctuationTokenContext macroPunctuationToken() {
			return getRuleContext(MacroPunctuationTokenContext.class,0);
		}
		public MacroRepOpContext macroRepOp() {
			return getRuleContext(MacroRepOpContext.class,0);
		}
		public MacroMatchTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroMatchToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroMatchToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroMatchToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroMatchToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroMatchTokenContext macroMatchToken() throws RecognitionException {
		MacroMatchTokenContext _localctx = new MacroMatchTokenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_macroMatchToken);
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
				macroRepOp();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroFragSpecContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MacroFragSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroFragSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroFragSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroFragSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroFragSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroFragSpecContext macroFragSpec() throws RecognitionException {
		MacroFragSpecContext _localctx = new MacroFragSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_macroFragSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroRepSepContext extends ParserRuleContext {
		public MacroIdentifierLikeTokenContext macroIdentifierLikeToken() {
			return getRuleContext(MacroIdentifierLikeTokenContext.class,0);
		}
		public MacroLiteralTokenContext macroLiteralToken() {
			return getRuleContext(MacroLiteralTokenContext.class,0);
		}
		public MacroPunctuationTokenContext macroPunctuationToken() {
			return getRuleContext(MacroPunctuationTokenContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(RustParser.DOLLAR, 0); }
		public MacroRepSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRepSep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRepSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRepSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRepSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRepSepContext macroRepSep() throws RecognitionException {
		MacroRepSepContext _localctx = new MacroRepSepContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_macroRepSep);
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(661);
				match(DOLLAR);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroRepOpContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(RustParser.PLUS, 0); }
		public TerminalNode QUESTION() { return getToken(RustParser.QUESTION, 0); }
		public MacroRepOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRepOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroRepOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroRepOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroRepOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRepOpContext macroRepOp() throws RecognitionException {
		MacroRepOpContext _localctx = new MacroRepOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_macroRepOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 8796093022213L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroTranscriberContext extends ParserRuleContext {
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public MacroTranscriberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroTranscriber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroTranscriber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroTranscriber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroTranscriber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroTranscriberContext macroTranscriber() throws RecognitionException {
		MacroTranscriberContext _localctx = new MacroTranscriberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_macroTranscriber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			delimTokenTree();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemContext extends ParserRuleContext {
		public VisItemContext visItem() {
			return getRuleContext(VisItemContext.class,0);
		}
		public MacroItemContext macroItem() {
			return getRuleContext(MacroItemContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(668);
				outerAttribute();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(674);
				visItem();
				}
				break;
			case 2:
				{
				setState(675);
				macroItem();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VisItemContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public ExternCrateContext externCrate() {
			return getRuleContext(ExternCrateContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public Struct_Context struct_() {
			return getRuleContext(Struct_Context.class,0);
		}
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public Union_Context union_() {
			return getRuleContext(Union_Context.class,0);
		}
		public ConstantItemContext constantItem() {
			return getRuleContext(ConstantItemContext.class,0);
		}
		public StaticItemContext staticItem() {
			return getRuleContext(StaticItemContext.class,0);
		}
		public Trait_Context trait_() {
			return getRuleContext(Trait_Context.class,0);
		}
		public ImplementationContext implementation() {
			return getRuleContext(ImplementationContext.class,0);
		}
		public ExternBlockContext externBlock() {
			return getRuleContext(ExternBlockContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public VisItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterVisItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitVisItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitVisItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisItemContext visItem() throws RecognitionException {
		VisItemContext _localctx = new VisItemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_visItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(678);
				visibility();
				}
			}

			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(681);
				module();
				}
				break;
			case 2:
				{
				setState(682);
				externCrate();
				}
				break;
			case 3:
				{
				setState(683);
				useDeclaration();
				}
				break;
			case 4:
				{
				setState(684);
				function_();
				}
				break;
			case 5:
				{
				setState(685);
				typeAlias();
				}
				break;
			case 6:
				{
				setState(686);
				struct_();
				}
				break;
			case 7:
				{
				setState(687);
				enumeration();
				}
				break;
			case 8:
				{
				setState(688);
				union_();
				}
				break;
			case 9:
				{
				setState(689);
				constantItem();
				}
				break;
			case 10:
				{
				setState(690);
				staticItem();
				}
				break;
			case 11:
				{
				setState(691);
				trait_();
				}
				break;
			case 12:
				{
				setState(692);
				implementation();
				}
				break;
			case 13:
				{
				setState(693);
				externBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public MacroRulesDefinitionContext macroRulesDefinition() {
			return getRuleContext(MacroRulesDefinitionContext.class,0);
		}
		public DeclMacroContext declMacro() {
			return getRuleContext(DeclMacroContext.class,0);
		}
		public MacroItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroItemContext macroItem() throws RecognitionException {
		MacroItemContext _localctx = new MacroItemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_macroItem);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				macroInvocationSemi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				macroRulesDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				declMacro();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode KW_MOD() { return getToken(RustParser.KW_MOD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(701);
				match(KW_UNSAFE);
				}
			}

			setState(704);
			match(KW_MOD);
			setState(705);
			identifier();
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(706);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				{
				setState(707);
				match(LCURLYBRACE);
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(708);
						innerAttribute();
						}
						} 
					}
					setState(713);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22473700122786635L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
					{
					{
					setState(714);
					item();
					}
					}
					setState(719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(720);
				match(RCURLYBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExternCrateContext extends ParserRuleContext {
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public CrateRefContext crateRef() {
			return getRuleContext(CrateRefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public AsClauseContext asClause() {
			return getRuleContext(AsClauseContext.class,0);
		}
		public ExternCrateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externCrate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternCrate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternCrate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternCrate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternCrateContext externCrate() throws RecognitionException {
		ExternCrateContext _localctx = new ExternCrateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_externCrate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(KW_EXTERN);
			setState(724);
			match(KW_CRATE);
			setState(725);
			crateRef();
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(726);
				asClause();
				}
			}

			setState(729);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CrateRefContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public CrateRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crateRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCrateRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCrateRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCrateRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrateRefContext crateRef() throws RecognitionException {
		CrateRefContext _localctx = new CrateRefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_crateRef);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				identifier();
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(KW_SELFVALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsClauseContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public AsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsClauseContext asClause() throws RecognitionException {
		AsClauseContext _localctx = new AsClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_asClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(KW_AS);
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				{
				setState(736);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(737);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode KW_USE() { return getToken(RustParser.KW_USE, 0); }
		public UseTreeContext useTree() {
			return getRuleContext(UseTreeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_useDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(KW_USE);
			setState(741);
			useTree();
			setState(742);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseTreeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public List<UseTreeContext> useTree() {
			return getRuleContexts(UseTreeContext.class);
		}
		public UseTreeContext useTree(int i) {
			return getRuleContext(UseTreeContext.class,i);
		}
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public UseTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUseTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUseTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUseTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTreeContext useTree() throws RecognitionException {
		UseTreeContext _localctx = new UseTreeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_useTree);
		int _la;
		try {
			int _alt;
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073615763439584L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
					{
					setState(745);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(744);
						simplePath();
						}
						break;
					}
					setState(747);
					match(PATHSEP);
					}
				}

				setState(766);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(750);
					match(STAR);
					}
					break;
				case LCURLYBRACE:
					{
					setState(751);
					match(LCURLYBRACE);
					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9217744736362168321L) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 4466765987841L) != 0)) {
						{
						setState(752);
						useTree();
						setState(757);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(753);
								match(COMMA);
								setState(754);
								useTree();
								}
								} 
							}
							setState(759);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						}
						setState(761);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(760);
							match(COMMA);
							}
						}

						}
					}

					setState(765);
					match(RCURLYBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				simplePath();
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(769);
					match(KW_AS);
					setState(772);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_PIN:
					case KW_YEET:
					case KW_UNION:
					case KW_RAW:
					case KW_DEFAULT:
					case KW_MACRORULES:
					case KW_GEN:
					case CLOSURE_FN:
					case CLOSURE_FNMUT:
					case CLOSURE_FNONCE:
					case NON_KEYWORD_IDENTIFIER:
					case RAW_IDENTIFIER:
						{
						setState(770);
						identifier();
						}
						break;
					case UNDERSCORE:
						{
						setState(771);
						match(UNDERSCORE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_Context extends ParserRuleContext {
		public FunctionQualifiersContext functionQualifiers() {
			return getRuleContext(FunctionQualifiersContext.class,0);
		}
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunction_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			functionQualifiers();
			setState(779);
			match(KW_FN);
			setState(780);
			identifier();
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(781);
				genericParams();
				}
			}

			setState(784);
			match(LPAREN);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -35939415942484184L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5135229508508614159L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 677L) != 0)) {
				{
				setState(785);
				functionParameters();
				}
			}

			setState(788);
			match(RPAREN);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(789);
				functionReturnType();
				}
			}

			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(792);
				whereClause();
				}
			}

			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				{
				setState(795);
				blockExpression();
				}
				break;
			case SEMI:
				{
				setState(796);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionQualifiersContext extends ParserRuleContext {
		public TerminalNode KW_DEFAULT() { return getToken(RustParser.KW_DEFAULT, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_GEN() { return getToken(RustParser.KW_GEN, 0); }
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode KW_SAFE() { return getToken(RustParser.KW_SAFE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public AbiContext abi() {
			return getRuleContext(AbiContext.class,0);
		}
		public FunctionQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionQualifiersContext functionQualifiers() throws RecognitionException {
		FunctionQualifiersContext _localctx = new FunctionQualifiersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(799);
				match(KW_DEFAULT);
				}
			}

			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(802);
				match(KW_CONST);
				}
			}

			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(805);
				match(KW_ASYNC);
				}
			}

			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_GEN) {
				{
				setState(808);
				match(KW_GEN);
				}
			}

			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE || _la==KW_SAFE) {
				{
				setState(811);
				_la = _input.LA(1);
				if ( !(_la==KW_UNSAFE || _la==KW_SAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERN) {
				{
				setState(814);
				match(KW_EXTERN);
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
					{
					setState(815);
					abi();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class AbiContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(RustParser.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(RustParser.RAW_STRING_LITERAL, 0); }
		public AbiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAbi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAbi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAbi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbiContext abi() throws RecognitionException {
		AbiContext _localctx = new AbiContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_abi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParametersContext extends ParserRuleContext {
		public SelfParamContext selfParam() {
			return getRuleContext(SelfParamContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionParameters);
		int _la;
		try {
			int _alt;
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				selfParam();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(823);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(826);
					selfParam();
					setState(827);
					match(COMMA);
					}
					break;
				}
				setState(831);
				functionParam();
				setState(836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(832);
						match(COMMA);
						setState(833);
						functionParam();
						}
						} 
					}
					setState(838);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(839);
					match(COMMA);
					}
				}

				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfParamContext extends ParserRuleContext {
		public ShorthandSelfContext shorthandSelf() {
			return getRuleContext(ShorthandSelfContext.class,0);
		}
		public TypedSelfContext typedSelf() {
			return getRuleContext(TypedSelfContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public SelfParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSelfParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSelfParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSelfParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfParamContext selfParam() throws RecognitionException {
		SelfParamContext _localctx = new SelfParamContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selfParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(844);
				outerAttribute();
				}
				}
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(850);
				shorthandSelf();
				}
				break;
			case 2:
				{
				setState(851);
				typedSelf();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShorthandSelfContext extends ParserRuleContext {
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public ShorthandSelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shorthandSelf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterShorthandSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitShorthandSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitShorthandSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShorthandSelfContext shorthandSelf() throws RecognitionException {
		ShorthandSelfContext _localctx = new ShorthandSelfContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_shorthandSelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(854);
				match(AND);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL || _la==KW_UNDERLINELIFETIME) {
					{
					setState(855);
					lifetime();
					}
				}

				}
			}

			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(860);
				match(KW_MUT);
				}
			}

			setState(863);
			match(KW_SELFVALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypedSelfContext extends ParserRuleContext {
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TypedSelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedSelf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypedSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypedSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypedSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedSelfContext typedSelf() throws RecognitionException {
		TypedSelfContext _localctx = new TypedSelfContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typedSelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(865);
				match(KW_MUT);
				}
			}

			setState(868);
			match(KW_SELFVALUE);
			setState(869);
			match(COLON);
			setState(870);
			type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParamContext extends ParserRuleContext {
		public FunctionParamPatternContext functionParamPattern() {
			return getRuleContext(FunctionParamPatternContext.class,0);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(872);
				outerAttribute();
				}
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(878);
				functionParamPattern();
				}
				break;
			case 2:
				{
				setState(879);
				match(DOTDOTDOT);
				}
				break;
			case 3:
				{
				setState(880);
				type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParamPatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public FunctionParamPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionParamPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionParamPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParamPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamPatternContext functionParamPattern() throws RecognitionException {
		FunctionParamPatternContext _localctx = new FunctionParamPatternContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionParamPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			pattern();
			setState(884);
			match(COLON);
			setState(887);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_EXTERN:
			case KW_FN:
			case KW_FOR:
			case KW_IMPL:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_UNSAFE:
			case KW_USE:
			case KW_ASYNC:
			case KW_DYN:
			case KW_YEET:
			case KW_TRY:
			case KW_UNION:
			case KW_STATICLIFETIME:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case LIFETIME_OR_LABEL:
			case STAR:
			case NOT:
			case TILDE:
			case AND:
			case ANDAND:
			case LT:
			case UNDERSCORE:
			case PATHSEP:
			case QUESTION:
			case LSQUAREBRACKET:
			case LPAREN:
			case KW_UNDERLINELIFETIME:
				{
				setState(885);
				type_();
				}
				break;
			case DOTDOTDOT:
				{
				setState(886);
				match(DOTDOTDOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(RARROW);
			setState(890);
			type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(RustParser.KW_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(RustParser.KW_DEFAULT, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public List<WhereClauseContext> whereClause() {
			return getRuleContexts(WhereClauseContext.class);
		}
		public WhereClauseContext whereClause(int i) {
			return getRuleContext(WhereClauseContext.class,i);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(892);
				match(KW_DEFAULT);
				}
			}

			setState(895);
			match(KW_TYPE);
			setState(896);
			identifier();
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(897);
				genericParams();
				}
			}

			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(900);
				match(COLON);
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2832891708965249L) != 0)) {
					{
					setState(901);
					typeParamBounds();
					}
				}

				}
			}

			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(906);
				whereClause();
				}
			}

			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(909);
				match(EQ);
				setState(910);
				type_();
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(911);
					whereClause();
					}
				}

				}
			}

			setState(916);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_Context extends ParserRuleContext {
		public StructStructContext structStruct() {
			return getRuleContext(StructStructContext.class,0);
		}
		public TupleStructContext tupleStruct() {
			return getRuleContext(TupleStructContext.class,0);
		}
		public Struct_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStruct_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStruct_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStruct_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_Context struct_() throws RecognitionException {
		Struct_Context _localctx = new Struct_Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_struct_);
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				structStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				tupleStruct();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructStructContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public StructStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructStructContext structStruct() throws RecognitionException {
		StructStructContext _localctx = new StructStructContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(KW_STRUCT);
			setState(923);
			identifier();
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(924);
				genericParams();
				}
			}

			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(927);
				whereClause();
				}
			}

			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				{
				setState(930);
				match(LCURLYBRACE);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 139534931070993L) != 0) || _la==POUND) {
					{
					setState(931);
					structFields();
					}
				}

				setState(934);
				match(RCURLYBRACE);
				}
				break;
			case SEMI:
				{
				setState(935);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleStructContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TupleFieldsContext tupleFields() {
			return getRuleContext(TupleFieldsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TupleStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleStructContext tupleStruct() throws RecognitionException {
		TupleStructContext _localctx = new TupleStructContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tupleStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			match(KW_STRUCT);
			setState(939);
			identifier();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(940);
				genericParams();
				}
			}

			setState(943);
			match(LPAREN);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283552105L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2978029525535625L) != 0)) {
				{
				setState(944);
				tupleFields();
				}
			}

			setState(947);
			match(RPAREN);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(948);
				whereClause();
				}
			}

			setState(951);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldsContext extends ParserRuleContext {
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldsContext structFields() throws RecognitionException {
		StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_structFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			structField();
			setState(958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(954);
					match(COMMA);
					setState(955);
					structField();
					}
					} 
				}
				setState(960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(961);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_structField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(964);
				outerAttribute();
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(970);
				match(KW_UNSAFE);
				}
			}

			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(973);
				visibility();
				}
			}

			setState(976);
			identifier();
			setState(977);
			match(COLON);
			setState(978);
			type_();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(979);
				match(EQ);
				setState(980);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleFieldsContext extends ParserRuleContext {
		public List<TupleFieldContext> tupleField() {
			return getRuleContexts(TupleFieldContext.class);
		}
		public TupleFieldContext tupleField(int i) {
			return getRuleContext(TupleFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleFieldsContext tupleFields() throws RecognitionException {
		TupleFieldsContext _localctx = new TupleFieldsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tupleFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			tupleField();
			setState(988);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(984);
					match(COMMA);
					setState(985);
					tupleField();
					}
					} 
				}
				setState(990);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(991);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleFieldContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TupleFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleFieldContext tupleField() throws RecognitionException {
		TupleFieldContext _localctx = new TupleFieldContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tupleField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(994);
				outerAttribute();
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1000);
				visibility();
				}
			}

			setState(1003);
			type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumerationContext extends ParserRuleContext {
		public TerminalNode KW_ENUM() { return getToken(RustParser.KW_ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public EnumItemsContext enumItems() {
			return getRuleContext(EnumItemsContext.class,0);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(KW_ENUM);
			setState(1006);
			identifier();
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1007);
				genericParams();
				}
			}

			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1010);
				whereClause();
				}
			}

			setState(1013);
			match(LCURLYBRACE);
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 139534931066897L) != 0) || _la==POUND) {
				{
				setState(1014);
				enumItems();
				}
			}

			setState(1017);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumItemsContext extends ParserRuleContext {
		public List<EnumItemContext> enumItem() {
			return getRuleContexts(EnumItemContext.class);
		}
		public EnumItemContext enumItem(int i) {
			return getRuleContext(EnumItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public EnumItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemsContext enumItems() throws RecognitionException {
		EnumItemsContext _localctx = new EnumItemsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			enumItem();
			setState(1024);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1020);
					match(COMMA);
					setState(1021);
					enumItem();
					}
					} 
				}
				setState(1026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1027);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public EnumItemTupleContext enumItemTuple() {
			return getRuleContext(EnumItemTupleContext.class,0);
		}
		public EnumItemStructContext enumItemStruct() {
			return getRuleContext(EnumItemStructContext.class,0);
		}
		public EnumItemDiscriminantContext enumItemDiscriminant() {
			return getRuleContext(EnumItemDiscriminantContext.class,0);
		}
		public EnumItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemContext enumItem() throws RecognitionException {
		EnumItemContext _localctx = new EnumItemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enumItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1030);
				outerAttribute();
				}
				}
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1036);
				visibility();
				}
			}

			setState(1039);
			identifier();
			setState(1042);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1040);
				enumItemTuple();
				}
				break;
			case LCURLYBRACE:
				{
				setState(1041);
				enumItemStruct();
				}
				break;
			case EQ:
			case COMMA:
			case RCURLYBRACE:
				break;
			default:
				break;
			}
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1044);
				enumItemDiscriminant();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumItemTupleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TupleFieldsContext tupleFields() {
			return getRuleContext(TupleFieldsContext.class,0);
		}
		public EnumItemTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItemTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItemTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItemTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItemTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemTupleContext enumItemTuple() throws RecognitionException {
		EnumItemTupleContext _localctx = new EnumItemTupleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumItemTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(LPAREN);
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283552105L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2978029525535625L) != 0)) {
				{
				setState(1048);
				tupleFields();
				}
			}

			setState(1051);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumItemStructContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public EnumItemStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItemStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItemStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItemStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItemStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemStructContext enumItemStruct() throws RecognitionException {
		EnumItemStructContext _localctx = new EnumItemStructContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumItemStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(LCURLYBRACE);
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 139534931070993L) != 0) || _la==POUND) {
				{
				setState(1054);
				structFields();
				}
			}

			setState(1057);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumItemDiscriminantContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumItemDiscriminantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItemDiscriminant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItemDiscriminant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItemDiscriminant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItemDiscriminant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemDiscriminantContext enumItemDiscriminant() throws RecognitionException {
		EnumItemDiscriminantContext _localctx = new EnumItemDiscriminantContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enumItemDiscriminant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(EQ);
			setState(1060);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Union_Context extends ParserRuleContext {
		public TerminalNode KW_UNION() { return getToken(RustParser.KW_UNION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public Union_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUnion_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUnion_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUnion_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_Context union_() throws RecognitionException {
		Union_Context _localctx = new Union_Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_union_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(KW_UNION);
			setState(1063);
			if (!(this.nextIsIdentifier())) throw new FailedPredicateException(this, "this.nextIsIdentifier()");
			setState(1064);
			identifier();
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1065);
				genericParams();
				}
			}

			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1068);
				whereClause();
				}
			}

			setState(1071);
			match(LCURLYBRACE);
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 139534931070993L) != 0) || _la==POUND) {
				{
				setState(1072);
				structFields();
				}
			}

			setState(1075);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantItemContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(RustParser.KW_DEFAULT, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ConstantItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterConstantItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitConstantItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitConstantItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantItemContext constantItem() throws RecognitionException {
		ConstantItemContext _localctx = new ConstantItemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_constantItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(1077);
				match(KW_DEFAULT);
				}
			}

			setState(1080);
			match(KW_CONST);
			setState(1083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				{
				setState(1081);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(1082);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1085);
				genericParams();
				}
			}

			setState(1088);
			match(COLON);
			setState(1089);
			type_();
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1090);
				match(EQ);
				setState(1091);
				expression(0);
				}
			}

			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1094);
				whereClause();
				}
			}

			setState(1097);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StaticItemContext extends ParserRuleContext {
		public TerminalNode KW_STATIC() { return getToken(RustParser.KW_STATIC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_SAFE() { return getToken(RustParser.KW_SAFE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public StaticItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStaticItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStaticItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStaticItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticItemContext staticItem() throws RecognitionException {
		StaticItemContext _localctx = new StaticItemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_staticItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE || _la==KW_SAFE) {
				{
				setState(1099);
				_la = _input.LA(1);
				if ( !(_la==KW_UNSAFE || _la==KW_SAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1102);
			match(KW_STATIC);
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(1103);
				match(KW_MUT);
				}
			}

			setState(1106);
			identifier();
			setState(1107);
			match(COLON);
			setState(1108);
			type_();
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1109);
				match(EQ);
				setState(1110);
				expression(0);
				}
			}

			setState(1113);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Trait_Context extends ParserRuleContext {
		public TerminalNode KW_TRAIT() { return getToken(RustParser.KW_TRAIT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_AUTO() { return getToken(RustParser.KW_AUTO, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<AssociatedItemContext> associatedItem() {
			return getRuleContexts(AssociatedItemContext.class);
		}
		public AssociatedItemContext associatedItem(int i) {
			return getRuleContext(AssociatedItemContext.class,i);
		}
		public List<TypeParamBoundsContext> typeParamBounds() {
			return getRuleContexts(TypeParamBoundsContext.class);
		}
		public TypeParamBoundsContext typeParamBounds(int i) {
			return getRuleContext(TypeParamBoundsContext.class,i);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public Trait_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTrait_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTrait_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTrait_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_Context trait_() throws RecognitionException {
		Trait_Context _localctx = new Trait_Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_trait_);
		int _la;
		try {
			int _alt;
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_UNSAFE) {
					{
					setState(1115);
					match(KW_UNSAFE);
					}
				}

				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AUTO) {
					{
					setState(1118);
					match(KW_AUTO);
					}
				}

				setState(1121);
				match(KW_TRAIT);
				setState(1122);
				identifier();
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1123);
					genericParams();
					}
				}

				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1126);
					match(COLON);
					setState(1128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2832891708965249L) != 0)) {
						{
						setState(1127);
						typeParamBounds();
						}
					}

					}
				}

				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(1132);
					whereClause();
					}
				}

				setState(1135);
				match(LCURLYBRACE);
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1136);
						innerAttribute();
						}
						} 
					}
					setState(1141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22509163852332891L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
					{
					{
					setState(1142);
					associatedItem();
					}
					}
					setState(1147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1148);
				match(RCURLYBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_UNSAFE) {
					{
					setState(1150);
					match(KW_UNSAFE);
					}
				}

				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AUTO) {
					{
					setState(1153);
					match(KW_AUTO);
					}
				}

				setState(1156);
				match(KW_TRAIT);
				setState(1157);
				identifier();
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1158);
					genericParams();
					}
				}

				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1161);
					match(COLON);
					setState(1163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2832891708965249L) != 0)) {
						{
						setState(1162);
						typeParamBounds();
						}
					}

					}
				}

				setState(1167);
				match(EQ);
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2832891708965249L) != 0)) {
					{
					setState(1168);
					typeParamBounds();
					}
				}

				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(1171);
					whereClause();
					}
				}

				setState(1174);
				match(SEMI);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImplementationContext extends ParserRuleContext {
		public InherentImplContext inherentImpl() {
			return getRuleContext(InherentImplContext.class,0);
		}
		public TraitImplContext traitImpl() {
			return getRuleContext(TraitImplContext.class,0);
		}
		public ImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementationContext implementation() throws RecognitionException {
		ImplementationContext _localctx = new ImplementationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_implementation);
		try {
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				inherentImpl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				traitImpl();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class InherentImplContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(RustParser.KW_DEFAULT, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<AssociatedItemContext> associatedItem() {
			return getRuleContexts(AssociatedItemContext.class);
		}
		public AssociatedItemContext associatedItem(int i) {
			return getRuleContext(AssociatedItemContext.class,i);
		}
		public InherentImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherentImpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInherentImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInherentImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInherentImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InherentImplContext inherentImpl() throws RecognitionException {
		InherentImplContext _localctx = new InherentImplContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_inherentImpl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1182);
				match(KW_DEFAULT);
				setState(1183);
				match(KW_UNSAFE);
				}
				break;
			case 2:
				{
				setState(1184);
				match(KW_UNSAFE);
				setState(1185);
				match(KW_DEFAULT);
				}
				break;
			case 3:
				{
				setState(1186);
				match(KW_DEFAULT);
				}
				break;
			case 4:
				{
				setState(1187);
				match(KW_UNSAFE);
				}
				break;
			}
			setState(1190);
			match(KW_IMPL);
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1191);
				genericParams();
				}
				break;
			}
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1194);
				match(NOT);
				}
				break;
			}
			setState(1197);
			type_();
			setState(1199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1198);
				whereClause();
				}
			}

			setState(1201);
			match(LCURLYBRACE);
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1202);
					innerAttribute();
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22509163852332891L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
				{
				{
				setState(1208);
				associatedItem();
				}
				}
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1214);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TraitImplContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(RustParser.KW_DEFAULT, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<AssociatedItemContext> associatedItem() {
			return getRuleContexts(AssociatedItemContext.class);
		}
		public AssociatedItemContext associatedItem(int i) {
			return getRuleContext(AssociatedItemContext.class,i);
		}
		public TraitImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitImpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitImplContext traitImpl() throws RecognitionException {
		TraitImplContext _localctx = new TraitImplContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_traitImpl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1216);
				match(KW_DEFAULT);
				setState(1217);
				match(KW_UNSAFE);
				}
				break;
			case 2:
				{
				setState(1218);
				match(KW_UNSAFE);
				setState(1219);
				match(KW_DEFAULT);
				}
				break;
			case 3:
				{
				setState(1220);
				match(KW_DEFAULT);
				}
				break;
			case 4:
				{
				setState(1221);
				match(KW_UNSAFE);
				}
				break;
			}
			setState(1224);
			match(KW_IMPL);
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1225);
				genericParams();
				}
			}

			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(1228);
				match(KW_CONST);
				}
			}

			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1231);
				match(NOT);
				}
			}

			setState(1234);
			typePath();
			setState(1235);
			match(KW_FOR);
			setState(1236);
			type_();
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1237);
				whereClause();
				}
			}

			setState(1240);
			match(LCURLYBRACE);
			setState(1244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1241);
					innerAttribute();
					}
					} 
				}
				setState(1246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22509163852332891L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
				{
				{
				setState(1247);
				associatedItem();
				}
				}
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1253);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExternBlockContext extends ParserRuleContext {
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public AbiContext abi() {
			return getRuleContext(AbiContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ExternalItemContext> externalItem() {
			return getRuleContexts(ExternalItemContext.class);
		}
		public ExternalItemContext externalItem(int i) {
			return getRuleContext(ExternalItemContext.class,i);
		}
		public ExternBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternBlockContext externBlock() throws RecognitionException {
		ExternBlockContext _localctx = new ExternBlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_externBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(1255);
				match(KW_UNSAFE);
				}
			}

			setState(1258);
			match(KW_EXTERN);
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
				{
				setState(1259);
				abi();
				}
			}

			setState(1262);
			match(LCURLYBRACE);
			setState(1266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1263);
					innerAttribute();
					}
					} 
				}
				setState(1268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22509163835555675L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
				{
				{
				setState(1269);
				externalItem();
				}
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1275);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public StaticItemContext staticItem() {
			return getRuleContext(StaticItemContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public ExternTypeContext externType() {
			return getRuleContext(ExternTypeContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public ExternalItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternalItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternalItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternalItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalItemContext externalItem() throws RecognitionException {
		ExternalItemContext _localctx = new ExternalItemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_externalItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1277);
				outerAttribute();
				}
				}
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1283);
				macroInvocationSemi();
				}
				break;
			case 2:
				{
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1284);
					visibility();
					}
				}

				setState(1290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1287);
					staticItem();
					}
					break;
				case 2:
					{
					setState(1288);
					function_();
					}
					break;
				case 3:
					{
					setState(1289);
					externType();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExternTypeContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(RustParser.KW_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ExternTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternTypeContext externType() throws RecognitionException {
		ExternTypeContext _localctx = new ExternTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_externType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(KW_TYPE);
			setState(1295);
			identifier();
			setState(1296);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericParamsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public List<GenericParamContext> genericParam() {
			return getRuleContexts(GenericParamContext.class);
		}
		public GenericParamContext genericParam(int i) {
			return getRuleContext(GenericParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericParamsContext genericParams() throws RecognitionException {
		GenericParamsContext _localctx = new GenericParamsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_genericParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(LT);
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -315243177818718207L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4611686018428436481L) != 0)) {
				{
				setState(1304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1299);
						genericParam();
						setState(1300);
						match(COMMA);
						}
						} 
					}
					setState(1306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				setState(1307);
				genericParam();
				setState(1309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1308);
					match(COMMA);
					}
				}

				}
			}

			setState(1313);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericParamContext extends ParserRuleContext {
		public LifetimeParamContext lifetimeParam() {
			return getRuleContext(LifetimeParamContext.class,0);
		}
		public TypeParamContext typeParam() {
			return getRuleContext(TypeParamContext.class,0);
		}
		public ConstParamContext constParam() {
			return getRuleContext(ConstParamContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public GenericParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericParamContext genericParam() throws RecognitionException {
		GenericParamContext _localctx = new GenericParamContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_genericParam);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1315);
					outerAttribute();
					}
					} 
				}
				setState(1320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1321);
				lifetimeParam();
				}
				break;
			case 2:
				{
				setState(1322);
				typeParam();
				}
				break;
			case 3:
				{
				setState(1323);
				constParam();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LifetimeParamContext extends ParserRuleContext {
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public OuterAttributeContext outerAttribute() {
			return getRuleContext(OuterAttributeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public LifetimeBoundsContext lifetimeBounds() {
			return getRuleContext(LifetimeBoundsContext.class,0);
		}
		public LifetimeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeParamContext lifetimeParam() throws RecognitionException {
		LifetimeParamContext _localctx = new LifetimeParamContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_lifetimeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1326);
				outerAttribute();
				}
			}

			setState(1329);
			match(LIFETIME_OR_LABEL);
			setState(1332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1330);
				match(COLON);
				setState(1331);
				lifetimeBounds();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OuterAttributeContext outerAttribute() {
			return getRuleContext(OuterAttributeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1334);
				outerAttribute();
				}
			}

			setState(1337);
			identifier();
			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1338);
				match(COLON);
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2832891708965249L) != 0)) {
					{
					setState(1339);
					typeParamBounds();
					}
				}

				}
			}

			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1344);
				match(EQ);
				setState(1345);
				type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstParamContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ConstParamDefaultContext constParamDefault() {
			return getRuleContext(ConstParamDefaultContext.class,0);
		}
		public ConstParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterConstParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitConstParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitConstParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstParamContext constParam() throws RecognitionException {
		ConstParamContext _localctx = new ConstParamContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(KW_CONST);
			setState(1349);
			identifier();
			setState(1350);
			match(COLON);
			setState(1351);
			type_();
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1352);
				match(EQ);
				setState(1353);
				constParamDefault();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstParamDefaultContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstParamDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constParamDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterConstParamDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitConstParamDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitConstParamDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstParamDefaultContext constParamDefault() throws RecognitionException {
		ConstParamDefaultContext _localctx = new ConstParamDefaultContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_constParamDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode KW_WHERE() { return getToken(RustParser.KW_WHERE, 0); }
		public List<WhereClauseItemContext> whereClauseItem() {
			return getRuleContexts(WhereClauseItemContext.class);
		}
		public WhereClauseItemContext whereClauseItem(int i) {
			return getRuleContext(WhereClauseItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_whereClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(KW_WHERE);
			setState(1364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1359);
					whereClauseItem();
					setState(1360);
					match(COMMA);
					}
					} 
				}
				setState(1366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			setState(1367);
			whereClauseItem();
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1368);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseItemContext extends ParserRuleContext {
		public LifetimeWhereClauseItemContext lifetimeWhereClauseItem() {
			return getRuleContext(LifetimeWhereClauseItemContext.class,0);
		}
		public TypeBoundWhereClauseItemContext typeBoundWhereClauseItem() {
			return getRuleContext(TypeBoundWhereClauseItemContext.class,0);
		}
		public WhereClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterWhereClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitWhereClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitWhereClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseItemContext whereClauseItem() throws RecognitionException {
		WhereClauseItemContext _localctx = new WhereClauseItemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_whereClauseItem);
		try {
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1371);
				lifetimeWhereClauseItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				typeBoundWhereClauseItem();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LifetimeWhereClauseItemContext extends ParserRuleContext {
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public LifetimeBoundsContext lifetimeBounds() {
			return getRuleContext(LifetimeBoundsContext.class,0);
		}
		public LifetimeWhereClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeWhereClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeWhereClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeWhereClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeWhereClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeWhereClauseItemContext lifetimeWhereClauseItem() throws RecognitionException {
		LifetimeWhereClauseItemContext _localctx = new LifetimeWhereClauseItemContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_lifetimeWhereClauseItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			lifetime();
			setState(1376);
			match(COLON);
			setState(1377);
			lifetimeBounds();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoundWhereClauseItemContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TypeBoundWhereClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoundWhereClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeBoundWhereClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeBoundWhereClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeBoundWhereClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundWhereClauseItemContext typeBoundWhereClauseItem() throws RecognitionException {
		TypeBoundWhereClauseItemContext _localctx = new TypeBoundWhereClauseItemContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_typeBoundWhereClauseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1379);
				forLifetimes();
				}
				break;
			}
			setState(1382);
			type_();
			setState(1383);
			match(COLON);
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2832891708965249L) != 0)) {
				{
				setState(1384);
				typeParamBounds();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLifetimesContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public ForLifetimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLifetimes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterForLifetimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitForLifetimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitForLifetimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLifetimesContext forLifetimes() throws RecognitionException {
		ForLifetimesContext _localctx = new ForLifetimesContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_forLifetimes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			match(KW_FOR);
			setState(1388);
			genericParams();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssociatedItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public ConstantItemContext constantItem() {
			return getRuleContext(ConstantItemContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public AssociatedItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associatedItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAssociatedItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAssociatedItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAssociatedItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociatedItemContext associatedItem() throws RecognitionException {
		AssociatedItemContext _localctx = new AssociatedItemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_associatedItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1390);
				outerAttribute();
				}
				}
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1396);
				macroInvocationSemi();
				}
				break;
			case 2:
				{
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1397);
					visibility();
					}
				}

				setState(1403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1400);
					typeAlias();
					}
					break;
				case 2:
					{
					setState(1401);
					constantItem();
					}
					break;
				case 3:
					{
					setState(1402);
					function_();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerAttributeContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public InnerAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInnerAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInnerAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInnerAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerAttributeContext innerAttribute() throws RecognitionException {
		InnerAttributeContext _localctx = new InnerAttributeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_innerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(POUND);
			setState(1408);
			match(NOT);
			setState(1409);
			match(LSQUAREBRACKET);
			setState(1410);
			attr();
			setState(1411);
			match(RSQUAREBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OuterAttributeContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public OuterAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterOuterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitOuterAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitOuterAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OuterAttributeContext outerAttribute() throws RecognitionException {
		OuterAttributeContext _localctx = new OuterAttributeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_outerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(POUND);
			setState(1414);
			match(LSQUAREBRACKET);
			setState(1415);
			attr();
			setState(1416);
			match(RSQUAREBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttrContext extends ParserRuleContext {
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public AttrInputContext attrInput() {
			return getRuleContext(AttrInputContext.class,0);
		}
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_attr);
		int _la;
		try {
			setState(1430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SUPER:
			case KW_YEET:
			case KW_TRY:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1418);
				simplePath();
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 88080385L) != 0)) {
					{
					setState(1419);
					attrInput();
					}
				}

				}
				break;
			case KW_UNSAFE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1422);
				match(KW_UNSAFE);
				setState(1423);
				match(LPAREN);
				setState(1424);
				simplePath();
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 88080385L) != 0)) {
					{
					setState(1425);
					attrInput();
					}
				}

				setState(1428);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttrInputContext extends ParserRuleContext {
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttrInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAttrInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAttrInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAttrInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrInputContext attrInput() throws RecognitionException {
		AttrInputContext _localctx = new AttrInputContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_attrInput);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432);
				delimTokenTree();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433);
				match(EQ);
				setState(1434);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_statement);
		try {
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				letStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1439);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				macroInvocationSemi();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1441);
				item();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetStatementContext extends ParserRuleContext {
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public PatternNoTopAltContext patternNoTopAlt() {
			return getRuleContext(PatternNoTopAltContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1444);
				outerAttribute();
				}
				}
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1450);
			match(KW_LET);
			setState(1451);
			patternNoTopAlt();
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1452);
				match(COLON);
				setState(1453);
				type_();
				}
			}

			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1456);
				match(EQ);
				setState(1457);
				expression(0);
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(1458);
					match(KW_ELSE);
					setState(1459);
					blockExpression();
					}
				}

				}
			}

			setState(1464);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_expressionStatement);
		try {
			setState(1473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				expression(0);
				setState(1467);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1469);
				expressionWithBlock();
				setState(1471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1470);
					match(SEMI);
					}
					break;
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YeetExpressionContext extends ExpressionContext {
		public TerminalNode KW_DO() { return getToken(RustParser.KW_DO, 0); }
		public TerminalNode KW_YEET() { return getToken(RustParser.KW_YEET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YeetExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterYeetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitYeetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitYeetExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public TypeCastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PathExpression_Context extends ExpressionContext {
		public PathExpressionContext pathExpression() {
			return getRuleContext(PathExpressionContext.class,0);
		}
		public PathExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public TupleElementsContext tupleElements() {
			return getRuleContext(TupleElementsContext.class,0);
		}
		public TupleExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeExpressionContext extends ExpressionContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObsoleteRangeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public ObsoleteRangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterObsoleteRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitObsoleteRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitObsoleteRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MacroInvocationAsExpressionContext extends ExpressionContext {
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public MacroInvocationAsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroInvocationAsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroInvocationAsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroInvocationAsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExpressionContext extends ExpressionContext {
		public TerminalNode KW_RETURN() { return getToken(RustParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AwaitExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TerminalNode KW_AWAIT() { return getToken(RustParser.KW_AWAIT, 0); }
		public AwaitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAwaitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAwaitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAwaitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ErrorPropagationExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RustParser.QUESTION, 0); }
		public ErrorPropagationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterErrorPropagationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitErrorPropagationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitErrorPropagationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueExpressionContext extends ExpressionContext {
		public TerminalNode KW_CONTINUE() { return getToken(RustParser.KW_CONTINUE, 0); }
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterContinueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitContinueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitContinueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public PathExprSegmentContext pathExprSegment() {
			return getRuleContext(PathExprSegmentContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpression_Context extends ExpressionContext {
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public LiteralExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLiteralExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLiteralExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLiteralExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructExpression_Context extends ExpressionContext {
		public StructExpressionContext structExpression() {
			return getRuleContext(StructExpressionContext.class,0);
		}
		public StructExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleIndexingExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public TupleIndexingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleIndexingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleIndexingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleIndexingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegationExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public NegationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNegationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNegationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNegationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LazyBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(RustParser.OROR, 0); }
		public LazyBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLazyBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLazyBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLazyBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RawPointerExpressionContext extends ExpressionContext {
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode KW_RAW() { return getToken(RustParser.KW_RAW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public RawPointerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRawPointerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRawPointerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRawPointerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DereferenceExpressionContext extends ExpressionContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DereferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterDereferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitDereferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitDereferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldExpressionContext extends ExpressionContext {
		public TerminalNode KW_YIELD() { return getToken(RustParser.KW_YIELD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterYieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitYieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitYieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetExpression_Context extends ExpressionContext {
		public LetExpressionContext letExpression() {
			return getRuleContext(LetExpressionContext.class,0);
		}
		public LetExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLetExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLetExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLetExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixMatchExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TerminalNode KW_MATCH() { return getToken(RustParser.KW_MATCH, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public MatchArmsContext matchArms() {
			return getRuleContext(MatchArmsContext.class,0);
		}
		public PostfixMatchExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPostfixMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPostfixMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPostfixMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionWithBlock_Context extends ExpressionContext {
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public ExpressionWithBlock_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExpressionWithBlock_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExpressionWithBlock_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExpressionWithBlock_(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpression2Context extends ExpressionContext {
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpression2Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAssignmentExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAssignmentExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAssignmentExpression2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public GroupedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGroupedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGroupedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGroupedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakExpressionContext extends ExpressionContext {
		public TerminalNode KW_BREAK() { return getToken(RustParser.KW_BREAK, 0); }
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBreakExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBreakExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBreakExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOrLogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(RustParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(RustParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(RustParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public ShlContext shl() {
			return getRuleContext(ShlContext.class,0);
		}
		public ShrContext shr() {
			return getRuleContext(ShrContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode CARET() { return getToken(RustParser.CARET, 0); }
		public TerminalNode OR() { return getToken(RustParser.OR, 0); }
		public ArithmeticOrLogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArithmeticOrLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArithmeticOrLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArithmeticOrLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SELFTYPE() { return getToken(RustParser.KW_SELFTYPE, 0); }
		public FieldExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumerationVariantExpression_Context extends ExpressionContext {
		public EnumerationVariantExpressionContext enumerationVariantExpression() {
			return getRuleContext(EnumerationVariantExpressionContext.class,0);
		}
		public EnumerationVariantExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumerationVariantExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumerationVariantExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumerationVariantExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributedExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public AttributedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAttributedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAttributedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAttributedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorrowExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public BorrowExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBorrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBorrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBorrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DestructuringAssignmentContext extends ExpressionContext {
		public PatternNoTopAltContext patternNoTopAlt() {
			return getRuleContext(PatternNoTopAltContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DestructuringAssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterDestructuringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitDestructuringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitDestructuringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BecomeExpressionContext extends ExpressionContext {
		public TerminalNode KW_BECOME() { return getToken(RustParser.KW_BECOME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BecomeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBecomeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBecomeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBecomeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundAssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompoundAssignOperatorContext compoundAssignOperator() {
			return getRuleContext(CompoundAssignOperatorContext.class,0);
		}
		public CompoundAssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCompoundAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCompoundAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCompoundAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClosureExpression_Context extends ExpressionContext {
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public ClosureExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpressionContext extends ExpressionContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public ArrayElementsContext arrayElements() {
			return getRuleContext(ArrayElementsContext.class,0);
		}
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				_localctx = new AttributedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1477); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1476);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1479); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1481);
				expression(49);
				}
				break;
			case 2:
				{
				_localctx = new LiteralExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1483);
				literalExpression();
				}
				break;
			case 3:
				{
				_localctx = new PathExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1484);
				pathExpression();
				}
				break;
			case 4:
				{
				_localctx = new BorrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1485);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==ANDAND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1486);
					match(KW_MUT);
					}
					break;
				}
				setState(1489);
				expression(38);
				}
				break;
			case 5:
				{
				_localctx = new RawPointerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1490);
				match(AND);
				setState(1491);
				match(KW_RAW);
				setState(1492);
				_la = _input.LA(1);
				if ( !(_la==KW_CONST || _la==KW_MUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1493);
				expression(37);
				}
				break;
			case 6:
				{
				_localctx = new DereferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1494);
				match(STAR);
				setState(1495);
				expression(36);
				}
				break;
			case 7:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1496);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1497);
				expression(35);
				}
				break;
			case 8:
				{
				_localctx = new RangeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1498);
				match(DOTDOT);
				setState(1500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1499);
					expression(0);
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new RangeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1502);
				match(DOTDOTEQ);
				setState(1503);
				expression(21);
				}
				break;
			case 10:
				{
				_localctx = new DestructuringAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1504);
				patternNoTopAlt();
				setState(1505);
				match(EQ);
				setState(1506);
				expression(18);
				}
				break;
			case 11:
				{
				_localctx = new AssignmentExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1508);
				match(UNDERSCORE);
				setState(1509);
				match(EQ);
				setState(1510);
				expression(17);
				}
				break;
			case 12:
				{
				_localctx = new ContinueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1511);
				match(KW_CONTINUE);
				setState(1513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1512);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1515);
					expression(0);
					}
					break;
				}
				}
				break;
			case 13:
				{
				_localctx = new BreakExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1518);
				match(KW_BREAK);
				setState(1520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1519);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1522);
					expression(0);
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new ReturnExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1525);
				match(KW_RETURN);
				setState(1527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1526);
					expression(0);
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new BecomeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1529);
				match(KW_BECOME);
				setState(1530);
				expression(12);
				}
				break;
			case 16:
				{
				_localctx = new YeetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1531);
				match(KW_DO);
				setState(1532);
				match(KW_YEET);
				setState(1534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1533);
					expression(0);
					}
					break;
				}
				}
				break;
			case 17:
				{
				_localctx = new YieldExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1536);
				match(KW_YIELD);
				setState(1538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1537);
					expression(0);
					}
					break;
				}
				}
				break;
			case 18:
				{
				_localctx = new GroupedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1540);
				match(LPAREN);
				setState(1544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1541);
						innerAttribute();
						}
						} 
					}
					setState(1546);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				}
				setState(1547);
				expression(0);
				setState(1548);
				match(RPAREN);
				}
				break;
			case 19:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1550);
				match(LSQUAREBRACKET);
				setState(1554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1551);
						innerAttribute();
						}
						} 
					}
					setState(1556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				}
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
					{
					setState(1557);
					arrayElements();
					}
				}

				setState(1560);
				match(RSQUAREBRACKET);
				}
				break;
			case 20:
				{
				_localctx = new TupleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1561);
				match(LPAREN);
				setState(1565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1562);
						innerAttribute();
						}
						} 
					}
					setState(1567);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				}
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
					{
					setState(1568);
					tupleElements();
					}
				}

				setState(1571);
				match(RPAREN);
				}
				break;
			case 21:
				{
				_localctx = new StructExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1572);
				structExpression();
				}
				break;
			case 22:
				{
				_localctx = new EnumerationVariantExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1573);
				enumerationVariantExpression();
				}
				break;
			case 23:
				{
				_localctx = new ClosureExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1574);
				closureExpression();
				}
				break;
			case 24:
				{
				_localctx = new ExpressionWithBlock_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1575);
				expressionWithBlock();
				}
				break;
			case 25:
				{
				_localctx = new LetExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1576);
				letExpression();
				}
				break;
			case 26:
				{
				_localctx = new MacroInvocationAsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1577);
				macroInvocation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1580);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1581);
						_la = _input.LA(1);
						if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1582);
						expression(34);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1583);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1584);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1585);
						expression(33);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1586);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1589);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1587);
							shl();
							}
							break;
						case GT:
							{
							setState(1588);
							shr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1591);
						expression(32);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1593);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1594);
						match(AND);
						setState(1595);
						expression(31);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1596);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1597);
						match(CARET);
						setState(1598);
						expression(30);
						}
						break;
					case 6:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1599);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1600);
						match(OR);
						setState(1601);
						expression(29);
						}
						break;
					case 7:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1602);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1603);
						comparisonOperator();
						setState(1604);
						expression(28);
						}
						break;
					case 8:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1606);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1607);
						match(ANDAND);
						setState(1608);
						expression(27);
						}
						break;
					case 9:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1609);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1610);
						match(OROR);
						setState(1611);
						expression(26);
						}
						break;
					case 10:
						{
						_localctx = new ObsoleteRangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1612);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1613);
						match(DOTDOTDOT);
						setState(1614);
						expression(25);
						}
						break;
					case 11:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1615);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1616);
						match(DOTDOTEQ);
						setState(1617);
						expression(21);
						}
						break;
					case 12:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1618);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1619);
						match(EQ);
						setState(1620);
						expression(20);
						}
						break;
					case 13:
						{
						_localctx = new CompoundAssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1621);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1622);
						compoundAssignOperator();
						setState(1623);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new PostfixMatchExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1625);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(1626);
						match(DOT);
						setState(1627);
						match(KW_MATCH);
						setState(1628);
						match(LCURLYBRACE);
						setState(1632);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1629);
								innerAttribute();
								}
								} 
							}
							setState(1634);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
						}
						setState(1636);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054921845931480L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 161L) != 0)) {
							{
							setState(1635);
							matchArms();
							}
						}

						setState(1638);
						match(RCURLYBRACE);
						}
						break;
					case 15:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1639);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(1640);
						match(DOT);
						setState(1641);
						pathExprSegment();
						setState(1642);
						match(LPAREN);
						setState(1644);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
							{
							setState(1643);
							callParams();
							}
						}

						setState(1646);
						match(RPAREN);
						}
						break;
					case 16:
						{
						_localctx = new FieldExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1648);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(1649);
						match(DOT);
						setState(1653);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case KW_PIN:
						case KW_YEET:
						case KW_UNION:
						case KW_RAW:
						case KW_DEFAULT:
						case KW_MACRORULES:
						case KW_GEN:
						case CLOSURE_FN:
						case CLOSURE_FNMUT:
						case CLOSURE_FNONCE:
						case NON_KEYWORD_IDENTIFIER:
						case RAW_IDENTIFIER:
							{
							setState(1650);
							identifier();
							}
							break;
						case KW_SELFVALUE:
							{
							setState(1651);
							match(KW_SELFVALUE);
							}
							break;
						case KW_SELFTYPE:
							{
							setState(1652);
							match(KW_SELFTYPE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 17:
						{
						_localctx = new TupleIndexingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1655);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(1656);
						match(DOT);
						setState(1657);
						tupleIndex();
						}
						break;
					case 18:
						{
						_localctx = new AwaitExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1658);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(1659);
						match(DOT);
						setState(1660);
						match(KW_AWAIT);
						}
						break;
					case 19:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1661);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(1662);
						match(LPAREN);
						setState(1664);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
							{
							setState(1663);
							callParams();
							}
						}

						setState(1666);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new IndexExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1667);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1668);
						match(LSQUAREBRACKET);
						setState(1669);
						expression(0);
						setState(1670);
						match(RSQUAREBRACKET);
						}
						break;
					case 21:
						{
						_localctx = new ErrorPropagationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1672);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1673);
						match(QUESTION);
						}
						break;
					case 22:
						{
						_localctx = new TypeCastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1674);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1675);
						match(KW_AS);
						setState(1676);
						typeNoBounds();
						}
						break;
					case 23:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1677);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1678);
						match(DOTDOT);
						setState(1680);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
						case 1:
							{
							setState(1679);
							expression(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(RustParser.EQEQ, 0); }
		public TerminalNode NE() { return getToken(RustParser.NE, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GE() { return getToken(RustParser.GE, 0); }
		public TerminalNode LE() { return getToken(RustParser.LE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 63L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundAssignOperatorContext extends ParserRuleContext {
		public TerminalNode PLUSEQ() { return getToken(RustParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(RustParser.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(RustParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(RustParser.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(RustParser.PERCENTEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(RustParser.ANDEQ, 0); }
		public TerminalNode OREQ() { return getToken(RustParser.OREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(RustParser.CARETEQ, 0); }
		public TerminalNode SHLEQ() { return getToken(RustParser.SHLEQ, 0); }
		public TerminalNode SHREQ() { return getToken(RustParser.SHREQ, 0); }
		public CompoundAssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundAssignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCompoundAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCompoundAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCompoundAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundAssignOperatorContext compoundAssignOperator() throws RecognitionException {
		CompoundAssignOperatorContext _localctx = new CompoundAssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_compoundAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 1023L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionWithBlockContext extends ParserRuleContext {
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public AsyncBlockExpressionContext asyncBlockExpression() {
			return getRuleContext(AsyncBlockExpressionContext.class,0);
		}
		public GeneratorBlockExpressionContext generatorBlockExpression() {
			return getRuleContext(GeneratorBlockExpressionContext.class,0);
		}
		public AsyncGeneratorBlockExpressionContext asyncGeneratorBlockExpression() {
			return getRuleContext(AsyncGeneratorBlockExpressionContext.class,0);
		}
		public UnsafeBlockExpressionContext unsafeBlockExpression() {
			return getRuleContext(UnsafeBlockExpressionContext.class,0);
		}
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfLetExpressionContext ifLetExpression() {
			return getRuleContext(IfLetExpressionContext.class,0);
		}
		public MatchExpressionContext matchExpression() {
			return getRuleContext(MatchExpressionContext.class,0);
		}
		public ConstBlockExpressionContext constBlockExpression() {
			return getRuleContext(ConstBlockExpressionContext.class,0);
		}
		public TryBlockExpressionContext tryBlockExpression() {
			return getRuleContext(TryBlockExpressionContext.class,0);
		}
		public ExpressionWithBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExpressionWithBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExpressionWithBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExpressionWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithBlockContext expressionWithBlock() throws RecognitionException {
		ExpressionWithBlockContext _localctx = new ExpressionWithBlockContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_expressionWithBlock);
		try {
			int _alt;
			setState(1709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1692); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1691);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1694); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1696);
				expressionWithBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1698);
				blockExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1699);
				asyncBlockExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1700);
				generatorBlockExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1701);
				asyncGeneratorBlockExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1702);
				unsafeBlockExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1703);
				loopExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1704);
				ifExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1705);
				ifLetExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1706);
				matchExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1707);
				constBlockExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1708);
				tryBlockExpression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_GEN() { return getToken(RustParser.KW_GEN, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public GeneratorBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatorBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGeneratorBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGeneratorBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGeneratorBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratorBlockExpressionContext generatorBlockExpression() throws RecognitionException {
		GeneratorBlockExpressionContext _localctx = new GeneratorBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_generatorBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			match(KW_GEN);
			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1712);
				match(KW_MOVE);
				}
			}

			setState(1715);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsyncGeneratorBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_GEN() { return getToken(RustParser.KW_GEN, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public AsyncGeneratorBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asyncGeneratorBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAsyncGeneratorBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAsyncGeneratorBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAsyncGeneratorBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsyncGeneratorBlockExpressionContext asyncGeneratorBlockExpression() throws RecognitionException {
		AsyncGeneratorBlockExpressionContext _localctx = new AsyncGeneratorBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_asyncGeneratorBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			match(KW_ASYNC);
			setState(1718);
			match(KW_GEN);
			setState(1720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1719);
				match(KW_MOVE);
				}
			}

			setState(1722);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(RustParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(RustParser.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(RustParser.RAW_STRING_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(RustParser.BYTE_LITERAL, 0); }
		public TerminalNode BYTE_STRING_LITERAL() { return getToken(RustParser.BYTE_STRING_LITERAL, 0); }
		public TerminalNode RAW_BYTE_STRING_LITERAL() { return getToken(RustParser.RAW_BYTE_STRING_LITERAL, 0); }
		public TerminalNode C_STRING_LITERAL() { return getToken(RustParser.C_STRING_LITERAL, 0); }
		public TerminalNode RAW_C_STRING_LITERAL() { return getToken(RustParser.RAW_C_STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RustParser.FLOAT_LITERAL, 0); }
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_literalExpression);
		try {
			setState(1740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1724);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1725);
				match(STRING_LITERAL);
				}
				break;
			case RAW_STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1726);
				match(RAW_STRING_LITERAL);
				}
				break;
			case BYTE_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1727);
				match(BYTE_LITERAL);
				}
				break;
			case BYTE_STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1728);
				match(BYTE_STRING_LITERAL);
				}
				break;
			case RAW_BYTE_STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1729);
				match(RAW_BYTE_STRING_LITERAL);
				}
				break;
			case C_STRING_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1730);
				match(C_STRING_LITERAL);
				}
				break;
			case RAW_C_STRING_LITERAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1731);
				match(RAW_C_STRING_LITERAL);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1732);
				match(INTEGER_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1733);
				match(FLOAT_LITERAL);
				setState(1736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1734);
					match(UNDERSCORE);
					setState(1735);
					identifier();
					}
					break;
				}
				}
				break;
			case KW_TRUE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1738);
				match(KW_TRUE);
				}
				break;
			case KW_FALSE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1739);
				match(KW_FALSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathExpressionContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public PathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExpressionContext pathExpression() throws RecognitionException {
		PathExpressionContext _localctx = new PathExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_pathExpression);
		try {
			setState(1744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_DYN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1742);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1743);
				qualifiedPathInExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockExpressionContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_blockExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(LCURLYBRACE);
			setState(1750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1747);
					innerAttribute();
					}
					} 
				}
				setState(1752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161712390642090052L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6144035857251958287L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1753);
				statements();
				}
			}

			setState(1756);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_statements);
		int _la;
		try {
			int _alt;
			setState(1767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1759); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1758);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1761); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
					{
					setState(1763);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
				expression(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsyncBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public AsyncBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asyncBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAsyncBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAsyncBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAsyncBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsyncBlockExpressionContext asyncBlockExpression() throws RecognitionException {
		AsyncBlockExpressionContext _localctx = new AsyncBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_asyncBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			match(KW_ASYNC);
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1770);
				match(KW_MOVE);
				}
			}

			setState(1773);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnsafeBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public UnsafeBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsafeBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUnsafeBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUnsafeBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUnsafeBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsafeBlockExpressionContext unsafeBlockExpression() throws RecognitionException {
		UnsafeBlockExpressionContext _localctx = new UnsafeBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_unsafeBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			match(KW_UNSAFE);
			setState(1776);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public ConstBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterConstBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitConstBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitConstBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstBlockExpressionContext constBlockExpression() throws RecognitionException {
		ConstBlockExpressionContext _localctx = new ConstBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			match(KW_CONST);
			setState(1779);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_TRY() { return getToken(RustParser.KW_TRY, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TryBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTryBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTryBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTryBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockExpressionContext tryBlockExpression() throws RecognitionException {
		TryBlockExpressionContext _localctx = new TryBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_tryBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			match(KW_TRY);
			setState(1782);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArrayElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_arrayElements);
		int _la;
		try {
			int _alt;
			setState(1799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1784);
				expression(0);
				setState(1789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1785);
						match(COMMA);
						setState(1786);
						expression(0);
						}
						} 
					}
					setState(1791);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
				}
				setState(1793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1792);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1795);
				expression(0);
				setState(1796);
				match(SEMI);
				setState(1797);
				expression(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleElementsContext tupleElements() throws RecognitionException {
		TupleElementsContext _localctx = new TupleElementsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tupleElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1804); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1801);
					expression(0);
					setState(1802);
					match(COMMA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1806); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1808);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleIndexContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TupleIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleIndexContext tupleIndex() throws RecognitionException {
		TupleIndexContext _localctx = new TupleIndexContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_tupleIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			match(INTEGER_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructExpressionContext extends ParserRuleContext {
		public StructExprStructContext structExprStruct() {
			return getRuleContext(StructExprStructContext.class,0);
		}
		public StructExprTupleContext structExprTuple() {
			return getRuleContext(StructExprTupleContext.class,0);
		}
		public StructExprUnitContext structExprUnit() {
			return getRuleContext(StructExprUnitContext.class,0);
		}
		public StructExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExpressionContext structExpression() throws RecognitionException {
		StructExpressionContext _localctx = new StructExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_structExpression);
		try {
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1813);
				structExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1814);
				structExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1815);
				structExprUnit();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructExprStructContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public StructExprFieldsContext structExprFields() {
			return getRuleContext(StructExprFieldsContext.class,0);
		}
		public StructBaseContext structBase() {
			return getRuleContext(StructBaseContext.class,0);
		}
		public StructExprStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprStructContext structExprStruct() throws RecognitionException {
		StructExprStructContext _localctx = new StructExprStructContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_structExprStruct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_DYN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(1818);
				pathInExpression();
				}
				break;
			case LT:
				{
				setState(1819);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1822);
			match(LCURLYBRACE);
			setState(1826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1823);
					innerAttribute();
					}
					} 
				}
				setState(1828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			setState(1831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case INTEGER_LITERAL:
			case POUND:
				{
				setState(1829);
				structExprFields();
				}
				break;
			case DOTDOT:
				{
				setState(1830);
				structBase();
				}
				break;
			case RCURLYBRACE:
				break;
			default:
				break;
			}
			setState(1833);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructExprFieldsContext extends ParserRuleContext {
		public List<StructExprFieldContext> structExprField() {
			return getRuleContexts(StructExprFieldContext.class);
		}
		public StructExprFieldContext structExprField(int i) {
			return getRuleContext(StructExprFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructBaseContext structBase() {
			return getRuleContext(StructBaseContext.class,0);
		}
		public StructExprFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprFieldsContext structExprFields() throws RecognitionException {
		StructExprFieldsContext _localctx = new StructExprFieldsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_structExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			structExprField();
			setState(1840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1836);
					match(COMMA);
					setState(1837);
					structExprField();
					}
					} 
				}
				setState(1842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			setState(1848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1843);
				match(COMMA);
				setState(1844);
				structBase();
				}
				break;
			case 2:
				{
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1845);
					match(COMMA);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class StructExprFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public StructExprFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprFieldContext structExprField() throws RecognitionException {
		StructExprFieldContext _localctx = new StructExprFieldContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_structExprField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1850);
				outerAttribute();
				}
				}
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1856);
				identifier();
				}
				break;
			case 2:
				{
				setState(1859);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PIN:
				case KW_YEET:
				case KW_UNION:
				case KW_RAW:
				case KW_DEFAULT:
				case KW_MACRORULES:
				case KW_GEN:
				case CLOSURE_FN:
				case CLOSURE_FNMUT:
				case CLOSURE_FNONCE:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(1857);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(1858);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1861);
				match(COLON);
				setState(1862);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructBaseContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBaseContext structBase() throws RecognitionException {
		StructBaseContext _localctx = new StructBaseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_structBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(DOTDOT);
			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1867);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructExprTupleContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructExprTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprTupleContext structExprTuple() throws RecognitionException {
		StructExprTupleContext _localctx = new StructExprTupleContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_structExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			pathInExpression();
			setState(1871);
			match(LPAREN);
			setState(1875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1872);
					innerAttribute();
					}
					} 
				}
				setState(1877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			}
			setState(1889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1878);
				expression(0);
				setState(1883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1879);
						match(COMMA);
						setState(1880);
						expression(0);
						}
						} 
					}
					setState(1885);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
				}
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1886);
					match(COMMA);
					}
				}

				}
			}

			setState(1891);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructExprUnitContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public StructExprUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprUnitContext structExprUnit() throws RecognitionException {
		StructExprUnitContext _localctx = new StructExprUnitContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_structExprUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			pathInExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumerationVariantExpressionContext extends ParserRuleContext {
		public EnumExprStructContext enumExprStruct() {
			return getRuleContext(EnumExprStructContext.class,0);
		}
		public EnumExprTupleContext enumExprTuple() {
			return getRuleContext(EnumExprTupleContext.class,0);
		}
		public EnumExprFieldlessContext enumExprFieldless() {
			return getRuleContext(EnumExprFieldlessContext.class,0);
		}
		public EnumerationVariantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationVariantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumerationVariantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumerationVariantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumerationVariantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationVariantExpressionContext enumerationVariantExpression() throws RecognitionException {
		EnumerationVariantExpressionContext _localctx = new EnumerationVariantExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_enumerationVariantExpression);
		try {
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1895);
				enumExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1896);
				enumExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1897);
				enumExprFieldless();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumExprStructContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public EnumExprFieldsContext enumExprFields() {
			return getRuleContext(EnumExprFieldsContext.class,0);
		}
		public EnumExprStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprStructContext enumExprStruct() throws RecognitionException {
		EnumExprStructContext _localctx = new EnumExprStructContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enumExprStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			pathInExpression();
			setState(1901);
			match(LCURLYBRACE);
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 72066314971119617L) != 0)) {
				{
				setState(1902);
				enumExprFields();
				}
			}

			setState(1905);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumExprFieldsContext extends ParserRuleContext {
		public List<EnumExprFieldContext> enumExprField() {
			return getRuleContexts(EnumExprFieldContext.class);
		}
		public EnumExprFieldContext enumExprField(int i) {
			return getRuleContext(EnumExprFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public EnumExprFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprFieldsContext enumExprFields() throws RecognitionException {
		EnumExprFieldsContext _localctx = new EnumExprFieldsContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_enumExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			enumExprField();
			setState(1912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1908);
					match(COMMA);
					setState(1909);
					enumExprField();
					}
					} 
				}
				setState(1914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			setState(1916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1915);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumExprFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public EnumExprFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprFieldContext enumExprField() throws RecognitionException {
		EnumExprFieldContext _localctx = new EnumExprFieldContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_enumExprField);
		try {
			setState(1926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1918);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1921);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PIN:
				case KW_YEET:
				case KW_UNION:
				case KW_RAW:
				case KW_DEFAULT:
				case KW_MACRORULES:
				case KW_GEN:
				case CLOSURE_FN:
				case CLOSURE_FNMUT:
				case CLOSURE_FNONCE:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(1919);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(1920);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1923);
				match(COLON);
				setState(1924);
				expression(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumExprTupleContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public EnumExprTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprTupleContext enumExprTuple() throws RecognitionException {
		EnumExprTupleContext _localctx = new EnumExprTupleContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_enumExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			pathInExpression();
			setState(1929);
			match(LPAREN);
			setState(1941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1930);
				expression(0);
				setState(1935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1931);
						match(COMMA);
						setState(1932);
						expression(0);
						}
						} 
					}
					setState(1937);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
				}
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1938);
					match(COMMA);
					}
				}

				}
			}

			setState(1943);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumExprFieldlessContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public EnumExprFieldlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprFieldless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprFieldless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprFieldless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprFieldless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprFieldlessContext enumExprFieldless() throws RecognitionException {
		EnumExprFieldlessContext _localctx = new EnumExprFieldlessContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_enumExprFieldless);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			pathInExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public CallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamsContext callParams() throws RecognitionException {
		CallParamsContext _localctx = new CallParamsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_callParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			expression(0);
			setState(1952);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1948);
					match(COMMA);
					setState(1949);
					expression(0);
					}
					} 
				}
				setState(1954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			setState(1956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1955);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClosureExpressionContext extends ParserRuleContext {
		public TerminalNode OROR() { return getToken(RustParser.OROR, 0); }
		public List<TerminalNode> OR() { return getTokens(RustParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RustParser.OR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public TerminalNode KW_STATIC() { return getToken(RustParser.KW_STATIC, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public ClosureParametersContext closureParameters() {
			return getRuleContext(ClosureParametersContext.class,0);
		}
		public ClosureExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureExpressionContext closureExpression() throws RecognitionException {
		ClosureExpressionContext _localctx = new ClosureExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_closureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(1958);
				forLifetimes();
				}
			}

			setState(1962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATIC) {
				{
				setState(1961);
				match(KW_STATIC);
				}
			}

			setState(1965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(1964);
				match(KW_CONST);
				}
			}

			setState(1968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(1967);
				match(KW_ASYNC);
				}
			}

			setState(1971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1970);
				match(KW_MOVE);
				}
			}

			setState(1979);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OROR:
				{
				setState(1973);
				match(OROR);
				}
				break;
			case OR:
				{
				setState(1974);
				match(OR);
				setState(1976);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(1975);
					closureParameters();
					}
					break;
				}
				setState(1978);
				match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BREAK:
			case KW_CONST:
			case KW_CONTINUE:
			case KW_CRATE:
			case KW_FALSE:
			case KW_FOR:
			case KW_IF:
			case KW_LET:
			case KW_LOOP:
			case KW_MATCH:
			case KW_MOVE:
			case KW_MUT:
			case KW_REF:
			case KW_RETURN:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_STATIC:
			case KW_SUPER:
			case KW_TRUE:
			case KW_UNSAFE:
			case KW_WHILE:
			case KW_ASYNC:
			case KW_DYN:
			case KW_BECOME:
			case KW_BOX:
			case KW_DO:
			case KW_YEET:
			case KW_YIELD:
			case KW_TRY:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case RAW_STRING_LITERAL:
			case BYTE_LITERAL:
			case BYTE_STRING_LITERAL:
			case RAW_BYTE_STRING_LITERAL:
			case C_STRING_LITERAL:
			case RAW_C_STRING_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case LIFETIME_OR_LABEL:
			case MINUS:
			case STAR:
			case NOT:
			case AND:
			case OR:
			case ANDAND:
			case OROR:
			case LT:
			case UNDERSCORE:
			case DOTDOT:
			case DOTDOTEQ:
			case PATHSEP:
			case POUND:
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				{
				setState(1981);
				expression(0);
				}
				break;
			case RARROW:
				{
				setState(1982);
				match(RARROW);
				setState(1983);
				typeNoBounds();
				setState(1984);
				blockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClosureParametersContext extends ParserRuleContext {
		public List<ClosureParamContext> closureParam() {
			return getRuleContexts(ClosureParamContext.class);
		}
		public ClosureParamContext closureParam(int i) {
			return getRuleContext(ClosureParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public ClosureParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureParametersContext closureParameters() throws RecognitionException {
		ClosureParametersContext _localctx = new ClosureParametersContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_closureParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			closureParam();
			setState(1993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1989);
					match(COMMA);
					setState(1990);
					closureParam();
					}
					} 
				}
				setState(1995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1996);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClosureParamContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ClosureParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureParamContext closureParam() throws RecognitionException {
		ClosureParamContext _localctx = new ClosureParamContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_closureParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1999);
				outerAttribute();
				}
				}
				setState(2004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2005);
			pattern();
			setState(2008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2006);
				match(COLON);
				setState(2007);
				type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopExpressionContext extends ParserRuleContext {
		public InfiniteLoopExpressionContext infiniteLoopExpression() {
			return getRuleContext(InfiniteLoopExpressionContext.class,0);
		}
		public PredicateLoopExpressionContext predicateLoopExpression() {
			return getRuleContext(PredicateLoopExpressionContext.class,0);
		}
		public PredicatePatternLoopExpressionContext predicatePatternLoopExpression() {
			return getRuleContext(PredicatePatternLoopExpressionContext.class,0);
		}
		public IteratorLoopExpressionContext iteratorLoopExpression() {
			return getRuleContext(IteratorLoopExpressionContext.class,0);
		}
		public LoopLabelContext loopLabel() {
			return getRuleContext(LoopLabelContext.class,0);
		}
		public LabelBlockExpressionContext labelBlockExpression() {
			return getRuleContext(LabelBlockExpressionContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_loopExpression);
		int _la;
		try {
			setState(2022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIFETIME_OR_LABEL) {
					{
					setState(2010);
					loopLabel();
					}
				}

				setState(2017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2013);
					infiniteLoopExpression();
					}
					break;
				case 2:
					{
					setState(2014);
					predicateLoopExpression();
					}
					break;
				case 3:
					{
					setState(2015);
					predicatePatternLoopExpression();
					}
					break;
				case 4:
					{
					setState(2016);
					iteratorLoopExpression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2019);
				loopLabel();
				setState(2020);
				labelBlockExpression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class InfiniteLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_LOOP() { return getToken(RustParser.KW_LOOP, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public InfiniteLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infiniteLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInfiniteLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInfiniteLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInfiniteLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfiniteLoopExpressionContext infiniteLoopExpression() throws RecognitionException {
		InfiniteLoopExpressionContext _localctx = new InfiniteLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_infiniteLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			match(KW_LOOP);
			setState(2025);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PredicateLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPredicateLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPredicateLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPredicateLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateLoopExpressionContext predicateLoopExpression() throws RecognitionException {
		PredicateLoopExpressionContext _localctx = new PredicateLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_predicateLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			match(KW_WHILE);
			setState(2028);
			expression(0);
			setState(2029);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicatePatternLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PredicatePatternLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicatePatternLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPredicatePatternLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPredicatePatternLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPredicatePatternLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatePatternLoopExpressionContext predicatePatternLoopExpression() throws RecognitionException {
		PredicatePatternLoopExpressionContext _localctx = new PredicatePatternLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_predicatePatternLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			match(KW_WHILE);
			setState(2032);
			match(KW_LET);
			setState(2033);
			pattern();
			setState(2034);
			match(EQ);
			setState(2035);
			expression(0);
			setState(2036);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IteratorLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public IteratorLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIteratorLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIteratorLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIteratorLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorLoopExpressionContext iteratorLoopExpression() throws RecognitionException {
		IteratorLoopExpressionContext _localctx = new IteratorLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_iteratorLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			match(KW_FOR);
			setState(2039);
			pattern();
			setState(2040);
			match(KW_IN);
			setState(2041);
			expression(0);
			setState(2042);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelBlockExpressionContext extends ParserRuleContext {
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public LabelBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLabelBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLabelBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLabelBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelBlockExpressionContext labelBlockExpression() throws RecognitionException {
		LabelBlockExpressionContext _localctx = new LabelBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_labelBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			blockExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopLabelContext extends ParserRuleContext {
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public LoopLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLoopLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLoopLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLoopLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopLabelContext loopLabel() throws RecognitionException {
		LoopLabelContext _localctx = new LoopLabelContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_loopLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			match(LIFETIME_OR_LABEL);
			setState(2047);
			match(COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfLetExpressionContext ifLetExpression() {
			return getRuleContext(IfLetExpressionContext.class,0);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_ifExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			match(KW_IF);
			setState(2050);
			expression(0);
			setState(2051);
			blockExpression();
			setState(2058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2052);
				match(KW_ELSE);
				setState(2056);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2053);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(2054);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(2055);
					ifLetExpression();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfLetExpressionContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfLetExpressionContext ifLetExpression() {
			return getRuleContext(IfLetExpressionContext.class,0);
		}
		public IfLetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIfLetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIfLetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIfLetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLetExpressionContext ifLetExpression() throws RecognitionException {
		IfLetExpressionContext _localctx = new IfLetExpressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_ifLetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			match(KW_IF);
			setState(2061);
			match(KW_LET);
			setState(2062);
			pattern();
			setState(2063);
			match(EQ);
			setState(2064);
			expression(0);
			setState(2065);
			blockExpression();
			setState(2072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2066);
				match(KW_ELSE);
				setState(2070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2067);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(2068);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(2069);
					ifLetExpression();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetExpressionContext extends ParserRuleContext {
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetExpressionContext letExpression() throws RecognitionException {
		LetExpressionContext _localctx = new LetExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_letExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
			match(KW_LET);
			setState(2075);
			pattern();
			setState(2076);
			match(EQ);
			setState(2077);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchExpressionContext extends ParserRuleContext {
		public TerminalNode KW_MATCH() { return getToken(RustParser.KW_MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public MatchArmsContext matchArms() {
			return getRuleContext(MatchArmsContext.class,0);
		}
		public MatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExpressionContext matchExpression() throws RecognitionException {
		MatchExpressionContext _localctx = new MatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_matchExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			match(KW_MATCH);
			setState(2080);
			expression(0);
			setState(2081);
			match(LCURLYBRACE);
			setState(2085);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2082);
					innerAttribute();
					}
					} 
				}
				setState(2087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
			setState(2089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054921845931480L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 161L) != 0)) {
				{
				setState(2088);
				matchArms();
				}
			}

			setState(2091);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchArmsContext extends ParserRuleContext {
		public List<MatchArmContext> matchArm() {
			return getRuleContexts(MatchArmContext.class);
		}
		public MatchArmContext matchArm(int i) {
			return getRuleContext(MatchArmContext.class,i);
		}
		public List<TerminalNode> FATARROW() { return getTokens(RustParser.FATARROW); }
		public TerminalNode FATARROW(int i) {
			return getToken(RustParser.FATARROW, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<MatchArmExpressionContext> matchArmExpression() {
			return getRuleContexts(MatchArmExpressionContext.class);
		}
		public MatchArmExpressionContext matchArmExpression(int i) {
			return getRuleContext(MatchArmExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public MatchArmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmsContext matchArms() throws RecognitionException {
		MatchArmsContext _localctx = new MatchArmsContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_matchArms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2093);
					matchArm();
					setState(2094);
					match(FATARROW);
					setState(2095);
					matchArmExpression();
					}
					} 
				}
				setState(2101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			}
			setState(2102);
			matchArm();
			setState(2103);
			match(FATARROW);
			setState(2104);
			expression(0);
			setState(2106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2105);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchArmExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public MatchArmExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArmExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArmExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArmExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArmExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmExpressionContext matchArmExpression() throws RecognitionException {
		MatchArmExpressionContext _localctx = new MatchArmExpressionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_matchArmExpression);
		int _la;
		try {
			setState(2115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2108);
				expression(0);
				setState(2109);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2111);
				expressionWithBlock();
				setState(2113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2112);
					match(COMMA);
					}
				}

				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchArmContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public MatchArmGuardContext matchArmGuard() {
			return getRuleContext(MatchArmGuardContext.class,0);
		}
		public MatchArmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmContext matchArm() throws RecognitionException {
		MatchArmContext _localctx = new MatchArmContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_matchArm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2117);
				outerAttribute();
				}
				}
				setState(2122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2123);
			pattern();
			setState(2125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(2124);
				matchArmGuard();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchArmGuardContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchArmGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArmGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArmGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArmGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArmGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmGuardContext matchArmGuard() throws RecognitionException {
		MatchArmGuardContext _localctx = new MatchArmGuardContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_matchArmGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			match(KW_IF);
			setState(2128);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public List<PatternNoTopAltContext> patternNoTopAlt() {
			return getRuleContexts(PatternNoTopAltContext.class);
		}
		public PatternNoTopAltContext patternNoTopAlt(int i) {
			return getRuleContext(PatternNoTopAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(RustParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RustParser.OR, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(2130);
				match(OR);
				}
			}

			setState(2133);
			patternNoTopAlt();
			setState(2138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2134);
					match(OR);
					setState(2135);
					patternNoTopAlt();
					}
					} 
				}
				setState(2140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternNoTopAltContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PatternWithoutRangeContext patternWithoutRange() {
			return getRuleContext(PatternWithoutRangeContext.class,0);
		}
		public RangePatternContext rangePattern() {
			return getRuleContext(RangePatternContext.class,0);
		}
		public PatternNoTopAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternNoTopAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPatternNoTopAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPatternNoTopAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPatternNoTopAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternNoTopAltContext patternNoTopAlt() throws RecognitionException {
		PatternNoTopAltContext _localctx = new PatternNoTopAltContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_patternNoTopAlt);
		try {
			setState(2150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2141);
					patternWithoutRange();
					}
					break;
				case 2:
					{
					setState(2142);
					rangePattern();
					}
					break;
				}
				setState(2145);
				match(KW_IF);
				setState(2146);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2148);
				patternWithoutRange();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2149);
				rangePattern();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternWithoutRangeContext extends ParserRuleContext {
		public BoxPatternContext boxPattern() {
			return getRuleContext(BoxPatternContext.class,0);
		}
		public LiteralPatternContext literalPattern() {
			return getRuleContext(LiteralPatternContext.class,0);
		}
		public IdentifierPatternContext identifierPattern() {
			return getRuleContext(IdentifierPatternContext.class,0);
		}
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public RestPatternContext restPattern() {
			return getRuleContext(RestPatternContext.class,0);
		}
		public ReferencePatternContext referencePattern() {
			return getRuleContext(ReferencePatternContext.class,0);
		}
		public StructPatternContext structPattern() {
			return getRuleContext(StructPatternContext.class,0);
		}
		public TupleStructPatternContext tupleStructPattern() {
			return getRuleContext(TupleStructPatternContext.class,0);
		}
		public TuplePatternContext tuplePattern() {
			return getRuleContext(TuplePatternContext.class,0);
		}
		public GroupedPatternContext groupedPattern() {
			return getRuleContext(GroupedPatternContext.class,0);
		}
		public SlicePatternContext slicePattern() {
			return getRuleContext(SlicePatternContext.class,0);
		}
		public PathPatternContext pathPattern() {
			return getRuleContext(PathPatternContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public ConstBlockExpressionContext constBlockExpression() {
			return getRuleContext(ConstBlockExpressionContext.class,0);
		}
		public PatternWithoutRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternWithoutRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPatternWithoutRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPatternWithoutRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPatternWithoutRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternWithoutRangeContext patternWithoutRange() throws RecognitionException {
		PatternWithoutRangeContext _localctx = new PatternWithoutRangeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_patternWithoutRange);
		try {
			setState(2166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2152);
				boxPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2153);
				literalPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2154);
				identifierPattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2155);
				wildcardPattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2156);
				restPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2157);
				referencePattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2158);
				structPattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2159);
				tupleStructPattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2160);
				tuplePattern();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2161);
				groupedPattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2162);
				slicePattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2163);
				pathPattern();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2164);
				macroInvocation();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2165);
				constBlockExpression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoxPatternContext extends ParserRuleContext {
		public TerminalNode KW_BOX() { return getToken(RustParser.KW_BOX, 0); }
		public PatternNoTopAltContext patternNoTopAlt() {
			return getRuleContext(PatternNoTopAltContext.class,0);
		}
		public BoxPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBoxPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBoxPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBoxPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxPatternContext boxPattern() throws RecognitionException {
		BoxPatternContext _localctx = new BoxPatternContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_boxPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			match(KW_BOX);
			setState(2169);
			patternNoTopAlt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralPatternContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(RustParser.CHAR_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(RustParser.BYTE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(RustParser.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(RustParser.RAW_STRING_LITERAL, 0); }
		public TerminalNode BYTE_STRING_LITERAL() { return getToken(RustParser.BYTE_STRING_LITERAL, 0); }
		public TerminalNode RAW_BYTE_STRING_LITERAL() { return getToken(RustParser.RAW_BYTE_STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RustParser.FLOAT_LITERAL, 0); }
		public LiteralPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLiteralPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLiteralPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralPatternContext literalPattern() throws RecognitionException {
		LiteralPatternContext _localctx = new LiteralPatternContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_literalPattern);
		int _la;
		try {
			setState(2187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2171);
				match(KW_TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				match(KW_FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2173);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2174);
				match(BYTE_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2175);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2176);
				match(RAW_STRING_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2177);
				match(BYTE_STRING_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2178);
				match(RAW_BYTE_STRING_LITERAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2179);
					match(MINUS);
					}
				}

				setState(2182);
				match(INTEGER_LITERAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2183);
					match(MINUS);
					}
				}

				setState(2186);
				match(FLOAT_LITERAL);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierPatternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AT() { return getToken(RustParser.AT, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<TerminalNode> KW_REF() { return getTokens(RustParser.KW_REF); }
		public TerminalNode KW_REF(int i) {
			return getToken(RustParser.KW_REF, i);
		}
		public List<TerminalNode> KW_MUT() { return getTokens(RustParser.KW_MUT); }
		public TerminalNode KW_MUT(int i) {
			return getToken(RustParser.KW_MUT, i);
		}
		public IdentifierPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIdentifierPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIdentifierPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIdentifierPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierPatternContext identifierPattern() throws RecognitionException {
		IdentifierPatternContext _localctx = new IdentifierPatternContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_identifierPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_MUT || _la==KW_REF) {
				{
				{
				setState(2189);
				_la = _input.LA(1);
				if ( !(_la==KW_MUT || _la==KW_REF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(2194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2195);
			identifier();
			setState(2198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2196);
				match(AT);
				setState(2197);
				pattern();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WildcardPatternContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterWildcardPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitWildcardPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitWildcardPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			match(UNDERSCORE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RestPatternContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public RestPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRestPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRestPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRestPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestPatternContext restPattern() throws RecognitionException {
		RestPatternContext _localctx = new RestPatternContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_restPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			match(DOTDOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangePatternContext extends ParserRuleContext {
		public RangePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangePattern; }
	 
		public RangePatternContext() { }
		public void copyFrom(RangePatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeToPatternContext extends RangePatternContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public RangePatternBoundContext rangePatternBound() {
			return getRuleContext(RangePatternBoundContext.class,0);
		}
		public RangeToPatternContext(RangePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRangeToPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRangeToPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRangeToPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InclusiveRangePatternContext extends RangePatternContext {
		public List<RangePatternBoundContext> rangePatternBound() {
			return getRuleContexts(RangePatternBoundContext.class);
		}
		public RangePatternBoundContext rangePatternBound(int i) {
			return getRuleContext(RangePatternBoundContext.class,i);
		}
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public InclusiveRangePatternContext(RangePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInclusiveRangePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInclusiveRangePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInclusiveRangePattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InclusiveRangeToPatternContext extends RangePatternContext {
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public RangePatternBoundContext rangePatternBound() {
			return getRuleContext(RangePatternBoundContext.class,0);
		}
		public InclusiveRangeToPatternContext(RangePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInclusiveRangeToPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInclusiveRangeToPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInclusiveRangeToPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeFromPatternContext extends RangePatternContext {
		public RangePatternBoundContext rangePatternBound() {
			return getRuleContext(RangePatternBoundContext.class,0);
		}
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public RangeFromPatternContext(RangePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRangeFromPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRangeFromPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRangeFromPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObsoleteRangePatternContext extends RangePatternContext {
		public List<RangePatternBoundContext> rangePatternBound() {
			return getRuleContexts(RangePatternBoundContext.class);
		}
		public RangePatternBoundContext rangePatternBound(int i) {
			return getRuleContext(RangePatternBoundContext.class,i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public ObsoleteRangePatternContext(RangePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterObsoleteRangePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitObsoleteRangePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitObsoleteRangePattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExclusiveRangePatternContext extends RangePatternContext {
		public List<RangePatternBoundContext> rangePatternBound() {
			return getRuleContexts(RangePatternBoundContext.class);
		}
		public RangePatternBoundContext rangePatternBound(int i) {
			return getRuleContext(RangePatternBoundContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public ExclusiveRangePatternContext(RangePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExclusiveRangePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExclusiveRangePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExclusiveRangePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangePatternContext rangePattern() throws RecognitionException {
		RangePatternContext _localctx = new RangePatternContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_rangePattern);
		try {
			setState(2223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				_localctx = new ExclusiveRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2204);
				rangePatternBound();
				setState(2205);
				match(DOTDOT);
				setState(2206);
				rangePatternBound();
				}
				break;
			case 2:
				_localctx = new InclusiveRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2208);
				rangePatternBound();
				setState(2209);
				match(DOTDOTEQ);
				setState(2210);
				rangePatternBound();
				}
				break;
			case 3:
				_localctx = new RangeToPatternContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2212);
				match(DOTDOT);
				setState(2213);
				rangePatternBound();
				}
				break;
			case 4:
				_localctx = new InclusiveRangeToPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2214);
				match(DOTDOTEQ);
				setState(2215);
				rangePatternBound();
				}
				break;
			case 5:
				_localctx = new RangeFromPatternContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2216);
				rangePatternBound();
				setState(2217);
				match(DOTDOT);
				}
				break;
			case 6:
				_localctx = new ObsoleteRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2219);
				rangePatternBound();
				setState(2220);
				match(DOTDOTDOT);
				setState(2221);
				rangePatternBound();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangePatternBoundContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(RustParser.CHAR_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(RustParser.BYTE_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RustParser.FLOAT_LITERAL, 0); }
		public PathPatternContext pathPattern() {
			return getRuleContext(PathPatternContext.class,0);
		}
		public ConstBlockExpressionContext constBlockExpression() {
			return getRuleContext(ConstBlockExpressionContext.class,0);
		}
		public RangePatternBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangePatternBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRangePatternBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRangePatternBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRangePatternBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangePatternBoundContext rangePatternBound() throws RecognitionException {
		RangePatternBoundContext _localctx = new RangePatternBoundContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_rangePatternBound);
		int _la;
		try {
			setState(2237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2225);
				match(CHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2226);
				match(BYTE_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2227);
					match(MINUS);
					}
				}

				setState(2230);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2231);
					match(MINUS);
					}
				}

				setState(2234);
				match(FLOAT_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2235);
				pathPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2236);
				constBlockExpression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReferencePatternContext extends ParserRuleContext {
		public PatternWithoutRangeContext patternWithoutRange() {
			return getRuleContext(PatternWithoutRangeContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public ReferencePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReferencePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReferencePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReferencePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencePatternContext referencePattern() throws RecognitionException {
		ReferencePatternContext _localctx = new ReferencePatternContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_referencePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==ANDAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2240);
				match(KW_MUT);
				}
				break;
			}
			setState(2243);
			patternWithoutRange();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructPatternContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public StructPatternElementsContext structPatternElements() {
			return getRuleContext(StructPatternElementsContext.class,0);
		}
		public StructPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternContext structPattern() throws RecognitionException {
		StructPatternContext _localctx = new StructPatternContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_structPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_DYN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(2245);
				pathInExpression();
				}
				break;
			case LT:
				{
				setState(2246);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2249);
			match(LCURLYBRACE);
			setState(2251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 2306122079092604965L) != 0) || _la==DOTDOT || _la==POUND) {
				{
				setState(2250);
				structPatternElements();
				}
			}

			setState(2253);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructPatternElementsContext extends ParserRuleContext {
		public StructPatternFieldsContext structPatternFields() {
			return getRuleContext(StructPatternFieldsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public StructPatternEtCeteraContext structPatternEtCetera() {
			return getRuleContext(StructPatternEtCeteraContext.class,0);
		}
		public StructPatternElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternElementsContext structPatternElements() throws RecognitionException {
		StructPatternElementsContext _localctx = new StructPatternElementsContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_structPatternElements);
		int _la;
		try {
			setState(2263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2255);
				structPatternFields();
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2256);
					match(COMMA);
					setState(2258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOTDOT || _la==POUND) {
						{
						setState(2257);
						structPatternEtCetera();
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2262);
				structPatternEtCetera();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructPatternFieldsContext extends ParserRuleContext {
		public List<StructPatternFieldContext> structPatternField() {
			return getRuleContexts(StructPatternFieldContext.class);
		}
		public StructPatternFieldContext structPatternField(int i) {
			return getRuleContext(StructPatternFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructPatternFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternFieldsContext structPatternFields() throws RecognitionException {
		StructPatternFieldsContext _localctx = new StructPatternFieldsContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_structPatternFields);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			structPatternField();
			setState(2270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2266);
					match(COMMA);
					setState(2267);
					structPatternField();
					}
					} 
				}
				setState(2272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructPatternFieldContext extends ParserRuleContext {
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoxPatternContext boxPattern() {
			return getRuleContext(BoxPatternContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode KW_REF() { return getToken(RustParser.KW_REF, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public StructPatternFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternFieldContext structPatternField() throws RecognitionException {
		StructPatternFieldContext _localctx = new StructPatternFieldContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_structPatternField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2273);
				outerAttribute();
				}
				}
				setState(2278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2279);
				tupleIndex();
				setState(2280);
				match(COLON);
				setState(2281);
				pattern();
				}
				break;
			case 2:
				{
				setState(2283);
				identifier();
				setState(2284);
				match(COLON);
				setState(2285);
				pattern();
				}
				break;
			case 3:
				{
				setState(2288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_REF) {
					{
					setState(2287);
					match(KW_REF);
					}
				}

				setState(2291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MUT) {
					{
					setState(2290);
					match(KW_MUT);
					}
				}

				setState(2293);
				identifier();
				}
				break;
			case 4:
				{
				setState(2294);
				boxPattern();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructPatternEtCeteraContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public StructPatternEtCeteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternEtCetera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternEtCetera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternEtCetera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternEtCetera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternEtCeteraContext structPatternEtCetera() throws RecognitionException {
		StructPatternEtCeteraContext _localctx = new StructPatternEtCeteraContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_structPatternEtCetera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2297);
				outerAttribute();
				}
				}
				setState(2302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2303);
			match(DOTDOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleStructPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public TupleStructItemsContext tupleStructItems() {
			return getRuleContext(TupleStructItemsContext.class,0);
		}
		public TupleStructPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleStructPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleStructPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleStructPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleStructPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleStructPatternContext tupleStructPattern() throws RecognitionException {
		TupleStructPatternContext _localctx = new TupleStructPatternContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_tupleStructPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_DYN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(2305);
				pathInExpression();
				}
				break;
			case LT:
				{
				setState(2306);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2309);
			match(LPAREN);
			setState(2311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054921845931480L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || _la==LSQUAREBRACKET || _la==LPAREN) {
				{
				setState(2310);
				tupleStructItems();
				}
			}

			setState(2313);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleStructItemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleStructItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleStructItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleStructItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleStructItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleStructItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleStructItemsContext tupleStructItems() throws RecognitionException {
		TupleStructItemsContext _localctx = new TupleStructItemsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_tupleStructItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			pattern();
			setState(2320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2316);
					match(COMMA);
					setState(2317);
					pattern();
					}
					} 
				}
				setState(2322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			}
			setState(2324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2323);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TuplePatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TuplePatternItemsContext tuplePatternItems() {
			return getRuleContext(TuplePatternItemsContext.class,0);
		}
		public TuplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTuplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTuplePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTuplePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplePatternContext tuplePattern() throws RecognitionException {
		TuplePatternContext _localctx = new TuplePatternContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_tuplePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			match(LPAREN);
			setState(2328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054921845931480L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || _la==LSQUAREBRACKET || _la==LPAREN) {
				{
				setState(2327);
				tuplePatternItems();
				}
			}

			setState(2330);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TuplePatternItemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public RestPatternContext restPattern() {
			return getRuleContext(RestPatternContext.class,0);
		}
		public TuplePatternItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePatternItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTuplePatternItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTuplePatternItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTuplePatternItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplePatternItemsContext tuplePatternItems() throws RecognitionException {
		TuplePatternItemsContext _localctx = new TuplePatternItemsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_tuplePatternItems);
		int _la;
		try {
			int _alt;
			setState(2346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2332);
				pattern();
				setState(2333);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2335);
				restPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2336);
				pattern();
				setState(2339); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2337);
						match(COMMA);
						setState(2338);
						pattern();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2341); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2343);
					match(COMMA);
					}
				}

				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class GroupedPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public GroupedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupedPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGroupedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGroupedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGroupedPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupedPatternContext groupedPattern() throws RecognitionException {
		GroupedPatternContext _localctx = new GroupedPatternContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_groupedPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
			match(LPAREN);
			setState(2349);
			pattern();
			setState(2350);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SlicePatternContext extends ParserRuleContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public SlicePatternItemsContext slicePatternItems() {
			return getRuleContext(SlicePatternItemsContext.class,0);
		}
		public SlicePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSlicePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSlicePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSlicePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicePatternContext slicePattern() throws RecognitionException {
		SlicePatternContext _localctx = new SlicePatternContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_slicePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2352);
			match(LSQUAREBRACKET);
			setState(2354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054921845931480L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || _la==LSQUAREBRACKET || _la==LPAREN) {
				{
				setState(2353);
				slicePatternItems();
				}
			}

			setState(2356);
			match(RSQUAREBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SlicePatternItemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public SlicePatternItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicePatternItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSlicePatternItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSlicePatternItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSlicePatternItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicePatternItemsContext slicePatternItems() throws RecognitionException {
		SlicePatternItemsContext _localctx = new SlicePatternItemsContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_slicePatternItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			pattern();
			setState(2363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2359);
					match(COMMA);
					setState(2360);
					pattern();
					}
					} 
				}
				setState(2365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			setState(2367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2366);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathPatternContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public PathPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathPatternContext pathPattern() throws RecognitionException {
		PathPatternContext _localctx = new PathPatternContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_pathPattern);
		try {
			setState(2371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_DYN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2369);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2370);
				qualifiedPathInExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public ImplTraitTypeContext implTraitType() {
			return getRuleContext(ImplTraitTypeContext.class,0);
		}
		public TraitObjectTypeContext traitObjectType() {
			return getRuleContext(TraitObjectTypeContext.class,0);
		}
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public List<LifetimeContext> lifetime() {
			return getRuleContexts(LifetimeContext.class);
		}
		public LifetimeContext lifetime(int i) {
			return getRuleContext(LifetimeContext.class,i);
		}
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 306, RULE_type_);
		int _la;
		try {
			setState(2389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				typeNoBounds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2374);
				implTraitType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2375);
				traitObjectType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2376);
				match(KW_FOR);
				setState(2377);
				match(LT);
				setState(2378);
				lifetime();
				setState(2383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2379);
					match(COMMA);
					setState(2380);
					lifetime();
					}
					}
					setState(2385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2386);
				match(GT);
				setState(2387);
				type_();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNoBoundsContext extends ParserRuleContext {
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public ImplTraitTypeOneBoundContext implTraitTypeOneBound() {
			return getRuleContext(ImplTraitTypeOneBoundContext.class,0);
		}
		public TraitObjectTypeOneBoundContext traitObjectTypeOneBound() {
			return getRuleContext(TraitObjectTypeOneBoundContext.class,0);
		}
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public NeverTypeContext neverType() {
			return getRuleContext(NeverTypeContext.class,0);
		}
		public RawPointerTypeContext rawPointerType() {
			return getRuleContext(RawPointerTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public InferredTypeContext inferredType() {
			return getRuleContext(InferredTypeContext.class,0);
		}
		public QualifiedPathInTypeContext qualifiedPathInType() {
			return getRuleContext(QualifiedPathInTypeContext.class,0);
		}
		public BareFunctionTypeContext bareFunctionType() {
			return getRuleContext(BareFunctionTypeContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public TypeNoBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNoBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeNoBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeNoBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeNoBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNoBoundsContext typeNoBounds() throws RecognitionException {
		TypeNoBoundsContext _localctx = new TypeNoBoundsContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_typeNoBounds);
		try {
			setState(2405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2391);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2392);
				implTraitTypeOneBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2393);
				traitObjectTypeOneBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2394);
				typePath();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2395);
				tupleType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2396);
				neverType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2397);
				rawPointerType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2398);
				referenceType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2399);
				arrayType();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2400);
				sliceType();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2401);
				inferredType();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2402);
				qualifiedPathInType();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2403);
				bareFunctionType();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2404);
				macroInvocation();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public ParenthesizedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitParenthesizedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitParenthesizedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedTypeContext parenthesizedType() throws RecognitionException {
		ParenthesizedTypeContext _localctx = new ParenthesizedTypeContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			match(LPAREN);
			setState(2408);
			type_();
			setState(2409);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NeverTypeContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public NeverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNeverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNeverType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNeverType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeverTypeContext neverType() throws RecognitionException {
		NeverTypeContext _localctx = new NeverTypeContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_neverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2411);
			match(NOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_tupleType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			match(LPAREN);
			setState(2424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283486569L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2973631479024521L) != 0)) {
				{
				setState(2417); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2414);
						type_();
						setState(2415);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2419); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283486569L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2973631479024521L) != 0)) {
					{
					setState(2421);
					type_();
					}
				}

				}
			}

			setState(2426);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			match(LSQUAREBRACKET);
			setState(2429);
			type_();
			setState(2430);
			match(SEMI);
			setState(2431);
			expression(0);
			setState(2432);
			match(RSQUAREBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SliceTypeContext extends ParserRuleContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSliceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSliceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			match(LSQUAREBRACKET);
			setState(2435);
			type_();
			setState(2436);
			match(RSQUAREBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceTypeContext extends ParserRuleContext {
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public TerminalNode KW_PIN() { return getToken(RustParser.KW_PIN, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==ANDAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL || _la==KW_UNDERLINELIFETIME) {
				{
				setState(2439);
				lifetime();
				}
			}

			setState(2443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
			case 1:
				{
				setState(2442);
				match(KW_PIN);
				}
				break;
			}
			setState(2446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST || _la==KW_MUT) {
				{
				setState(2445);
				_la = _input.LA(1);
				if ( !(_la==KW_CONST || _la==KW_MUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2448);
			typeNoBounds();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RawPointerTypeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public RawPointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawPointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRawPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRawPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRawPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawPointerTypeContext rawPointerType() throws RecognitionException {
		RawPointerTypeContext _localctx = new RawPointerTypeContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_rawPointerType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			match(STAR);
			setState(2451);
			_la = _input.LA(1);
			if ( !(_la==KW_CONST || _la==KW_MUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2452);
			typeNoBounds();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BareFunctionTypeContext extends ParserRuleContext {
		public FunctionTypeQualifiersContext functionTypeQualifiers() {
			return getRuleContext(FunctionTypeQualifiersContext.class,0);
		}
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public FunctionParametersMaybeNamedVariadicContext functionParametersMaybeNamedVariadic() {
			return getRuleContext(FunctionParametersMaybeNamedVariadicContext.class,0);
		}
		public BareFunctionReturnTypeContext bareFunctionReturnType() {
			return getRuleContext(BareFunctionReturnTypeContext.class,0);
		}
		public BareFunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareFunctionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBareFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBareFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBareFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BareFunctionTypeContext bareFunctionType() throws RecognitionException {
		BareFunctionTypeContext _localctx = new BareFunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_bareFunctionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(2454);
				forLifetimes();
				}
			}

			setState(2457);
			functionTypeQualifiers();
			setState(2458);
			match(KW_FN);
			setState(2459);
			match(LPAREN);
			setState(2461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283486569L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2978046705404809L) != 0)) {
				{
				setState(2460);
				functionParametersMaybeNamedVariadic();
				}
			}

			setState(2463);
			match(RPAREN);
			setState(2465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2464);
				bareFunctionReturnType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeQualifiersContext extends ParserRuleContext {
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public AbiContext abi() {
			return getRuleContext(AbiContext.class,0);
		}
		public FunctionTypeQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionTypeQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionTypeQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionTypeQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeQualifiersContext functionTypeQualifiers() throws RecognitionException {
		FunctionTypeQualifiersContext _localctx = new FunctionTypeQualifiersContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_functionTypeQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(2467);
				match(KW_UNSAFE);
				}
			}

			setState(2474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERN) {
				{
				setState(2470);
				match(KW_EXTERN);
				setState(2472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
					{
					setState(2471);
					abi();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class BareFunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public BareFunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareFunctionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBareFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBareFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBareFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BareFunctionReturnTypeContext bareFunctionReturnType() throws RecognitionException {
		BareFunctionReturnTypeContext _localctx = new BareFunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_bareFunctionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			match(RARROW);
			setState(2477);
			typeNoBounds();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParametersMaybeNamedVariadicContext extends ParserRuleContext {
		public MaybeNamedFunctionParametersContext maybeNamedFunctionParameters() {
			return getRuleContext(MaybeNamedFunctionParametersContext.class,0);
		}
		public MaybeNamedFunctionParametersVariadicContext maybeNamedFunctionParametersVariadic() {
			return getRuleContext(MaybeNamedFunctionParametersVariadicContext.class,0);
		}
		public FunctionParametersMaybeNamedVariadicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParametersMaybeNamedVariadic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionParametersMaybeNamedVariadic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionParametersMaybeNamedVariadic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParametersMaybeNamedVariadic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersMaybeNamedVariadicContext functionParametersMaybeNamedVariadic() throws RecognitionException {
		FunctionParametersMaybeNamedVariadicContext _localctx = new FunctionParametersMaybeNamedVariadicContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_functionParametersMaybeNamedVariadic);
		try {
			setState(2481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2479);
				maybeNamedFunctionParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2480);
				maybeNamedFunctionParametersVariadic();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeNamedFunctionParametersContext extends ParserRuleContext {
		public List<MaybeNamedParamContext> maybeNamedParam() {
			return getRuleContexts(MaybeNamedParamContext.class);
		}
		public MaybeNamedParamContext maybeNamedParam(int i) {
			return getRuleContext(MaybeNamedParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public MaybeNamedFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNamedFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMaybeNamedFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMaybeNamedFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMaybeNamedFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNamedFunctionParametersContext maybeNamedFunctionParameters() throws RecognitionException {
		MaybeNamedFunctionParametersContext _localctx = new MaybeNamedFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_maybeNamedFunctionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			maybeNamedParam();
			setState(2488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2484);
					match(COMMA);
					setState(2485);
					maybeNamedParam();
					}
					} 
				}
				setState(2490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
			}
			setState(2492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2491);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeNamedParamContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public MaybeNamedParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNamedParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMaybeNamedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMaybeNamedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMaybeNamedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNamedParamContext maybeNamedParam() throws RecognitionException {
		MaybeNamedParamContext _localctx = new MaybeNamedParamContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_maybeNamedParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2494);
				outerAttribute();
				}
				}
				setState(2499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				{
				setState(2502);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PIN:
				case KW_YEET:
				case KW_UNION:
				case KW_RAW:
				case KW_DEFAULT:
				case KW_MACRORULES:
				case KW_GEN:
				case CLOSURE_FN:
				case CLOSURE_FNMUT:
				case CLOSURE_FNONCE:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(2500);
					identifier();
					}
					break;
				case UNDERSCORE:
					{
					setState(2501);
					match(UNDERSCORE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2504);
				match(COLON);
				}
				break;
			}
			setState(2509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_EXTERN:
			case KW_FN:
			case KW_FOR:
			case KW_IMPL:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_UNSAFE:
			case KW_USE:
			case KW_ASYNC:
			case KW_DYN:
			case KW_YEET:
			case KW_TRY:
			case KW_UNION:
			case KW_STATICLIFETIME:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case LIFETIME_OR_LABEL:
			case STAR:
			case NOT:
			case TILDE:
			case AND:
			case ANDAND:
			case LT:
			case UNDERSCORE:
			case PATHSEP:
			case QUESTION:
			case LSQUAREBRACKET:
			case LPAREN:
			case KW_UNDERLINELIFETIME:
				{
				setState(2507);
				type_();
				}
				break;
			case DOTDOTDOT:
				{
				setState(2508);
				match(DOTDOTDOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeNamedFunctionParametersVariadicContext extends ParserRuleContext {
		public List<MaybeNamedParamContext> maybeNamedParam() {
			return getRuleContexts(MaybeNamedParamContext.class);
		}
		public MaybeNamedParamContext maybeNamedParam(int i) {
			return getRuleContext(MaybeNamedParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public MaybeNamedFunctionParametersVariadicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNamedFunctionParametersVariadic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMaybeNamedFunctionParametersVariadic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMaybeNamedFunctionParametersVariadic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMaybeNamedFunctionParametersVariadic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNamedFunctionParametersVariadicContext maybeNamedFunctionParametersVariadic() throws RecognitionException {
		MaybeNamedFunctionParametersVariadicContext _localctx = new MaybeNamedFunctionParametersVariadicContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_maybeNamedFunctionParametersVariadic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2511);
					maybeNamedParam();
					setState(2512);
					match(COMMA);
					}
					} 
				}
				setState(2518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			}
			setState(2519);
			maybeNamedParam();
			setState(2520);
			match(COMMA);
			setState(2524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2521);
				outerAttribute();
				}
				}
				setState(2526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2527);
			match(DOTDOTDOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TraitObjectTypeContext extends ParserRuleContext {
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TraitObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitObjectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitObjectTypeContext traitObjectType() throws RecognitionException {
		TraitObjectTypeContext _localctx = new TraitObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_traitObjectType);
		int _la;
		try {
			setState(2539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2529);
				match(KW_DYN);
				setState(2530);
				if (!( _input.LA(1) != RustLexer.PATHSEP   // ::
				        && _input.LA(1) != RustLexer.LT     // <
				        && _input.LA(1) != RustLexer.LPAREN // (
				      )) throw new FailedPredicateException(this, " _input.LA(1) != RustLexer.PATHSEP   // ::\n        && _input.LA(1) != RustLexer.LT     // <\n        && _input.LA(1) != RustLexer.LPAREN // (\n      ");
				setState(2532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(2531);
					match(STAR);
					}
				}

				setState(2534);
				typeParamBounds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(2535);
					match(STAR);
					}
				}

				setState(2538);
				typeParamBounds();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TraitObjectTypeOneBoundContext extends ParserRuleContext {
		public TraitBoundContext traitBound() {
			return getRuleContext(TraitBoundContext.class,0);
		}
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TraitObjectTypeOneBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitObjectTypeOneBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitObjectTypeOneBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitObjectTypeOneBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitObjectTypeOneBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitObjectTypeOneBoundContext traitObjectTypeOneBound() throws RecognitionException {
		TraitObjectTypeOneBoundContext _localctx = new TraitObjectTypeOneBoundContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_traitObjectTypeOneBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				{
				setState(2541);
				match(KW_DYN);
				}
				break;
			}
			setState(2545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(2544);
				match(STAR);
				}
			}

			setState(2547);
			traitBound();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImplTraitTypeContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public ImplTraitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implTraitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterImplTraitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitImplTraitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitImplTraitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplTraitTypeContext implTraitType() throws RecognitionException {
		ImplTraitTypeContext _localctx = new ImplTraitTypeContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_implTraitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2549);
			match(KW_IMPL);
			setState(2551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(2550);
				match(KW_CONST);
				}
			}

			setState(2553);
			typeParamBounds();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImplTraitTypeOneBoundContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public ClosureTraitTypeContext closureTraitType() {
			return getRuleContext(ClosureTraitTypeContext.class,0);
		}
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TraitBoundContext traitBound() {
			return getRuleContext(TraitBoundContext.class,0);
		}
		public ImplTraitTypeOneBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implTraitTypeOneBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterImplTraitTypeOneBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitImplTraitTypeOneBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitImplTraitTypeOneBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplTraitTypeOneBoundContext implTraitTypeOneBound() throws RecognitionException {
		ImplTraitTypeOneBoundContext _localctx = new ImplTraitTypeOneBoundContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_implTraitTypeOneBound);
		int _la;
		try {
			setState(2565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2555);
				match(KW_IMPL);
				setState(2557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CONST) {
					{
					setState(2556);
					match(KW_CONST);
					}
				}

				setState(2559);
				closureTraitType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2560);
				match(KW_IMPL);
				setState(2562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CONST) {
					{
					setState(2561);
					match(KW_CONST);
					}
				}

				setState(2564);
				traitBound();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClosureTraitTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode CLOSURE_FN() { return getToken(RustParser.CLOSURE_FN, 0); }
		public TerminalNode CLOSURE_FNMUT() { return getToken(RustParser.CLOSURE_FNMUT, 0); }
		public TerminalNode CLOSURE_FNONCE() { return getToken(RustParser.CLOSURE_FNONCE, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public FunctionParametersMaybeNamedVariadicContext functionParametersMaybeNamedVariadic() {
			return getRuleContext(FunctionParametersMaybeNamedVariadicContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ClosureTraitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureTraitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureTraitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureTraitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureTraitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureTraitTypeContext closureTraitType() throws RecognitionException {
		ClosureTraitTypeContext _localctx = new ClosureTraitTypeContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_closureTraitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(2567);
				forLifetimes();
				}
			}

			setState(2571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(2570);
				match(KW_ASYNC);
				}
			}

			setState(2573);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2574);
			match(LPAREN);
			setState(2576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283486569L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 2978046705404809L) != 0)) {
				{
				setState(2575);
				functionParametersMaybeNamedVariadic();
				}
			}

			setState(2578);
			match(RPAREN);
			setState(2581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				{
				setState(2579);
				match(RARROW);
				setState(2580);
				type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InferredTypeContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public InferredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInferredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInferredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInferredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredTypeContext inferredType() throws RecognitionException {
		InferredTypeContext _localctx = new InferredTypeContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_inferredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2583);
			match(UNDERSCORE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamBoundsContext extends ParserRuleContext {
		public List<BoundElementContext> boundElement() {
			return getRuleContexts(BoundElementContext.class);
		}
		public BoundElementContext boundElement(int i) {
			return getRuleContext(BoundElementContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(RustParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RustParser.PLUS, i);
		}
		public TypeParamBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParamBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParamBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParamBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamBoundsContext typeParamBounds() throws RecognitionException {
		TypeParamBoundsContext _localctx = new TypeParamBoundsContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_typeParamBounds);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2585);
			boundElement();
			setState(2590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,371,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2586);
					match(PLUS);
					setState(2587);
					boundElement();
					}
					} 
				}
				setState(2592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,371,_ctx);
			}
			setState(2594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				{
				setState(2593);
				match(PLUS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoundElementContext extends ParserRuleContext {
		public TypeParamBoundContext typeParamBound() {
			return getRuleContext(TypeParamBoundContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public BoundElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBoundElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBoundElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBoundElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundElementContext boundElement() throws RecognitionException {
		BoundElementContext _localctx = new BoundElementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_boundElement);
		try {
			setState(2601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2596);
				typeParamBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2597);
				match(LPAREN);
				setState(2598);
				typeParamBounds();
				setState(2599);
				match(RPAREN);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamBoundContext extends ParserRuleContext {
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public TraitBoundContext traitBound() {
			return getRuleContext(TraitBoundContext.class,0);
		}
		public ClosureTraitTypeContext closureTraitType() {
			return getRuleContext(ClosureTraitTypeContext.class,0);
		}
		public UseBoundContext useBound() {
			return getRuleContext(UseBoundContext.class,0);
		}
		public TypeParamBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParamBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParamBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParamBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamBoundContext typeParamBound() throws RecognitionException {
		TypeParamBoundContext _localctx = new TypeParamBoundContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_typeParamBound);
		try {
			setState(2607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2603);
				lifetime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2604);
				traitBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2605);
				closureTraitType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2606);
				useBound();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TraitBoundContext extends ParserRuleContext {
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode QUESTION() { return getToken(RustParser.QUESTION, 0); }
		public TerminalNode TILDE() { return getToken(RustParser.TILDE, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TraitBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitBoundContext traitBound() throws RecognitionException {
		TraitBoundContext _localctx = new TraitBoundContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_traitBound);
		int _la;
		try {
			setState(2640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_FOR:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_DYN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case NOT:
			case TILDE:
			case PATHSEP:
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2609);
					match(NOT);
					}
				}

				setState(2613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2612);
					match(QUESTION);
					}
				}

				setState(2617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TILDE) {
					{
					setState(2615);
					match(TILDE);
					setState(2616);
					match(KW_CONST);
					}
				}

				setState(2620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2619);
					forLifetimes();
					}
				}

				setState(2622);
				typePath();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2623);
				match(LPAREN);
				setState(2625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2624);
					match(NOT);
					}
				}

				setState(2628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2627);
					match(QUESTION);
					}
				}

				setState(2632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TILDE) {
					{
					setState(2630);
					match(TILDE);
					setState(2631);
					match(KW_CONST);
					}
				}

				setState(2635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2634);
					forLifetimes();
					}
				}

				setState(2637);
				typePath();
				setState(2638);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseBoundContext extends ParserRuleContext {
		public TerminalNode KW_USE() { return getToken(RustParser.KW_USE, 0); }
		public UseBoundGenericArgsContext useBoundGenericArgs() {
			return getRuleContext(UseBoundGenericArgsContext.class,0);
		}
		public UseBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUseBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUseBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUseBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseBoundContext useBound() throws RecognitionException {
		UseBoundContext _localctx = new UseBoundContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_useBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2642);
			match(KW_USE);
			setState(2643);
			useBoundGenericArgs();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseBoundGenericArgsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public List<UseBoundGenericArgContext> useBoundGenericArg() {
			return getRuleContexts(UseBoundGenericArgContext.class);
		}
		public UseBoundGenericArgContext useBoundGenericArg(int i) {
			return getRuleContext(UseBoundGenericArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public UseBoundGenericArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useBoundGenericArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUseBoundGenericArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUseBoundGenericArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUseBoundGenericArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseBoundGenericArgsContext useBoundGenericArgs() throws RecognitionException {
		UseBoundGenericArgsContext _localctx = new UseBoundGenericArgsContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_useBoundGenericArgs);
		int _la;
		try {
			int _alt;
			setState(2662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2645);
				match(LT);
				setState(2646);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2647);
				match(LT);
				setState(2653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2648);
						useBoundGenericArg();
						setState(2649);
						match(COMMA);
						}
						} 
					}
					setState(2655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
				}
				setState(2656);
				useBoundGenericArg();
				setState(2658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2657);
					match(COMMA);
					}
				}

				setState(2660);
				match(GT);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseBoundGenericArgContext extends ParserRuleContext {
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SELFTYPE() { return getToken(RustParser.KW_SELFTYPE, 0); }
		public UseBoundGenericArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useBoundGenericArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUseBoundGenericArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUseBoundGenericArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUseBoundGenericArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseBoundGenericArgContext useBoundGenericArg() throws RecognitionException {
		UseBoundGenericArgContext _localctx = new UseBoundGenericArgContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_useBoundGenericArg);
		try {
			setState(2667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STATICLIFETIME:
			case LIFETIME_OR_LABEL:
			case KW_UNDERLINELIFETIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(2664);
				lifetime();
				}
				break;
			case KW_PIN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2665);
				identifier();
				}
				break;
			case KW_SELFTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2666);
				match(KW_SELFTYPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LifetimeBoundsContext extends ParserRuleContext {
		public List<LifetimeContext> lifetime() {
			return getRuleContexts(LifetimeContext.class);
		}
		public LifetimeContext lifetime(int i) {
			return getRuleContext(LifetimeContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(RustParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RustParser.PLUS, i);
		}
		public LifetimeBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeBoundsContext lifetimeBounds() throws RecognitionException {
		LifetimeBoundsContext _localctx = new LifetimeBoundsContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_lifetimeBounds);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2669);
					lifetime();
					setState(2670);
					match(PLUS);
					}
					} 
				}
				setState(2676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			}
			setState(2678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL || _la==KW_UNDERLINELIFETIME) {
				{
				setState(2677);
				lifetime();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LifetimeContext extends ParserRuleContext {
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public TerminalNode KW_STATICLIFETIME() { return getToken(RustParser.KW_STATICLIFETIME, 0); }
		public TerminalNode KW_UNDERLINELIFETIME() { return getToken(RustParser.KW_UNDERLINELIFETIME, 0); }
		public LifetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeContext lifetime() throws RecognitionException {
		LifetimeContext _localctx = new LifetimeContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_lifetime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2680);
			_la = _input.LA(1);
			if ( !(_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL || _la==KW_UNDERLINELIFETIME) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimplePathContext extends ParserRuleContext {
		public List<SimplePathSegmentContext> simplePathSegment() {
			return getRuleContexts(SimplePathSegmentContext.class);
		}
		public SimplePathSegmentContext simplePathSegment(int i) {
			return getRuleContext(SimplePathSegmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public SimplePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSimplePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSimplePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSimplePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePathContext simplePath() throws RecognitionException {
		SimplePathContext _localctx = new SimplePathContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_simplePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2682);
				match(PATHSEP);
				}
			}

			setState(2685);
			simplePathSegment();
			setState(2690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,391,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2686);
					match(PATHSEP);
					setState(2687);
					simplePathSegment();
					}
					} 
				}
				setState(2692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,391,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimplePathSegmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_DOLLARCRATE() { return getToken(RustParser.KW_DOLLARCRATE, 0); }
		public TerminalNode KW_TRY() { return getToken(RustParser.KW_TRY, 0); }
		public SimplePathSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePathSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSimplePathSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSimplePathSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSimplePathSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePathSegmentContext simplePathSegment() throws RecognitionException {
		SimplePathSegmentContext _localctx = new SimplePathSegmentContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_simplePathSegment);
		try {
			setState(2699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2693);
				identifier();
				}
				break;
			case KW_SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2694);
				match(KW_SUPER);
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2695);
				match(KW_SELFVALUE);
				}
				break;
			case KW_CRATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2696);
				match(KW_CRATE);
				}
				break;
			case KW_DOLLARCRATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2697);
				match(KW_DOLLARCRATE);
				}
				break;
			case KW_TRY:
				enterOuterAlt(_localctx, 6);
				{
				setState(2698);
				match(KW_TRY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathInExpressionContext extends ParserRuleContext {
		public List<PathExprSegmentContext> pathExprSegment() {
			return getRuleContexts(PathExprSegmentContext.class);
		}
		public PathExprSegmentContext pathExprSegment(int i) {
			return getRuleContext(PathExprSegmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public PathInExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathInExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathInExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathInExpressionContext pathInExpression() throws RecognitionException {
		PathInExpressionContext _localctx = new PathInExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_pathInExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2701);
				match(PATHSEP);
				}
			}

			setState(2704);
			pathExprSegment();
			setState(2709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2705);
					match(PATHSEP);
					setState(2706);
					pathExprSegment();
					}
					} 
				}
				setState(2711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathExprSegmentContext extends ParserRuleContext {
		public PathIdentSegmentContext pathIdentSegment() {
			return getRuleContext(PathIdentSegmentContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public GenericArgsContext genericArgs() {
			return getRuleContext(GenericArgsContext.class,0);
		}
		public PathExprSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExprSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathExprSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathExprSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathExprSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExprSegmentContext pathExprSegment() throws RecognitionException {
		PathExprSegmentContext _localctx = new PathExprSegmentContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_pathExprSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2712);
			pathIdentSegment();
			setState(2715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				{
				setState(2713);
				match(PATHSEP);
				setState(2714);
				genericArgs();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathIdentSegmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SELFTYPE() { return getToken(RustParser.KW_SELFTYPE, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_DOLLARCRATE() { return getToken(RustParser.KW_DOLLARCRATE, 0); }
		public PathIdentSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathIdentSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathIdentSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathIdentSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathIdentSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathIdentSegmentContext pathIdentSegment() throws RecognitionException {
		PathIdentSegmentContext _localctx = new PathIdentSegmentContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_pathIdentSegment);
		try {
			setState(2724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_YEET:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2717);
				identifier();
				}
				break;
			case KW_DYN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2718);
				match(KW_DYN);
				}
				break;
			case KW_SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2719);
				match(KW_SUPER);
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2720);
				match(KW_SELFVALUE);
				}
				break;
			case KW_SELFTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2721);
				match(KW_SELFTYPE);
				}
				break;
			case KW_CRATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2722);
				match(KW_CRATE);
				}
				break;
			case KW_DOLLARCRATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2723);
				match(KW_DOLLARCRATE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericArgsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public GenericArgsLifetimesContext genericArgsLifetimes() {
			return getRuleContext(GenericArgsLifetimesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsTypesContext genericArgsTypes() {
			return getRuleContext(GenericArgsTypesContext.class,0);
		}
		public GenericArgsBindingsContext genericArgsBindings() {
			return getRuleContext(GenericArgsBindingsContext.class,0);
		}
		public List<GenericArgContext> genericArg() {
			return getRuleContexts(GenericArgContext.class);
		}
		public GenericArgContext genericArg(int i) {
			return getRuleContext(GenericArgContext.class,i);
		}
		public GenericArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsContext genericArgs() throws RecognitionException {
		GenericArgsContext _localctx = new GenericArgsContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_genericArgs);
		int _la;
		try {
			int _alt;
			setState(2769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2726);
				match(LT);
				setState(2727);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2728);
				match(LT);
				setState(2729);
				genericArgsLifetimes();
				setState(2732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
				case 1:
					{
					setState(2730);
					match(COMMA);
					setState(2731);
					genericArgsTypes();
					}
					break;
				}
				setState(2736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
				case 1:
					{
					setState(2734);
					match(COMMA);
					setState(2735);
					genericArgsBindings();
					}
					break;
				}
				setState(2739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2738);
					match(COMMA);
					}
				}

				setState(2741);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2743);
				match(LT);
				setState(2744);
				genericArgsTypes();
				setState(2747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
				case 1:
					{
					setState(2745);
					match(COMMA);
					setState(2746);
					genericArgsBindings();
					}
					break;
				}
				setState(2750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2749);
					match(COMMA);
					}
				}

				setState(2752);
				match(GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2754);
				match(LT);
				setState(2760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2755);
						genericArg();
						setState(2756);
						match(COMMA);
						}
						} 
					}
					setState(2762);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
				}
				setState(2763);
				genericArg();
				setState(2765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2764);
					match(COMMA);
					}
				}

				setState(2767);
				match(GT);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericArgContext extends ParserRuleContext {
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public GenericArgsConstContext genericArgsConst() {
			return getRuleContext(GenericArgsConstContext.class,0);
		}
		public GenericArgsBindingContext genericArgsBinding() {
			return getRuleContext(GenericArgsBindingContext.class,0);
		}
		public GenericArgsBoundContext genericArgsBound() {
			return getRuleContext(GenericArgsBoundContext.class,0);
		}
		public GenericArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgContext genericArg() throws RecognitionException {
		GenericArgContext _localctx = new GenericArgContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_genericArg);
		try {
			setState(2776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2771);
				lifetime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2772);
				type_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2773);
				genericArgsConst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2774);
				genericArgsBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2775);
				genericArgsBound();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericArgsConstContext extends ParserRuleContext {
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public SimplePathSegmentContext simplePathSegment() {
			return getRuleContext(SimplePathSegmentContext.class,0);
		}
		public GenericArgsConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsConstContext genericArgsConst() throws RecognitionException {
		GenericArgsConstContext _localctx = new GenericArgsConstContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_genericArgsConst);
		int _la;
		try {
			setState(2784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2778);
				blockExpression();
				}
				break;
			case KW_FALSE:
			case KW_TRUE:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case RAW_STRING_LITERAL:
			case BYTE_LITERAL:
			case BYTE_STRING_LITERAL:
			case RAW_BYTE_STRING_LITERAL:
			case C_STRING_LITERAL:
			case RAW_C_STRING_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2779);
					match(MINUS);
					}
				}

				setState(2782);
				literalExpression();
				}
				break;
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SUPER:
			case KW_YEET:
			case KW_TRY:
			case KW_UNION:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2783);
				simplePathSegment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericArgsLifetimesContext extends ParserRuleContext {
		public List<LifetimeContext> lifetime() {
			return getRuleContexts(LifetimeContext.class);
		}
		public LifetimeContext lifetime(int i) {
			return getRuleContext(LifetimeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsLifetimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsLifetimes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsLifetimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsLifetimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsLifetimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsLifetimesContext genericArgsLifetimes() throws RecognitionException {
		GenericArgsLifetimesContext _localctx = new GenericArgsLifetimesContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_genericArgsLifetimes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2786);
			lifetime();
			setState(2791);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2787);
					match(COMMA);
					setState(2788);
					lifetime();
					}
					} 
				}
				setState(2793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericArgsTypesContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsTypesContext genericArgsTypes() throws RecognitionException {
		GenericArgsTypesContext _localctx = new GenericArgsTypesContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_genericArgsTypes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2794);
			type_();
			setState(2799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,409,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2795);
					match(COMMA);
					setState(2796);
					type_();
					}
					} 
				}
				setState(2801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,409,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericArgsBindingsContext extends ParserRuleContext {
		public List<GenericArgsBindingContext> genericArgsBinding() {
			return getRuleContexts(GenericArgsBindingContext.class);
		}
		public GenericArgsBindingContext genericArgsBinding(int i) {
			return getRuleContext(GenericArgsBindingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsBindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsBindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsBindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsBindings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsBindings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsBindingsContext genericArgsBindings() throws RecognitionException {
		GenericArgsBindingsContext _localctx = new GenericArgsBindingsContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_genericArgsBindings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2802);
			genericArgsBinding();
			setState(2807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,410,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2803);
					match(COMMA);
					setState(2804);
					genericArgsBinding();
					}
					} 
				}
				setState(2809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,410,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericArgsBindingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public GenericArgsContext genericArgs() {
			return getRuleContext(GenericArgsContext.class,0);
		}
		public TypePathFnContext typePathFn() {
			return getRuleContext(TypePathFnContext.class,0);
		}
		public GenericArgsBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsBindingContext genericArgsBinding() throws RecognitionException {
		GenericArgsBindingContext _localctx = new GenericArgsBindingContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_genericArgsBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2810);
			identifier();
			setState(2812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2811);
				match(PATHSEP);
				}
			}

			setState(2816);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				{
				setState(2814);
				genericArgs();
				}
				break;
			case LPAREN:
				{
				setState(2815);
				typePathFn();
				}
				break;
			case EQ:
				break;
			default:
				break;
			}
			setState(2818);
			match(EQ);
			setState(2821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
			case 1:
				{
				setState(2819);
				type_();
				}
				break;
			case 2:
				{
				setState(2820);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericArgsBoundContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public GenericArgsContext genericArgs() {
			return getRuleContext(GenericArgsContext.class,0);
		}
		public TypePathFnContext typePathFn() {
			return getRuleContext(TypePathFnContext.class,0);
		}
		public GenericArgsBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsBoundContext genericArgsBound() throws RecognitionException {
		GenericArgsBoundContext _localctx = new GenericArgsBoundContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_genericArgsBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2823);
			identifier();
			setState(2825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2824);
				match(PATHSEP);
				}
			}

			setState(2829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				{
				setState(2827);
				genericArgs();
				}
				break;
			case LPAREN:
				{
				setState(2828);
				typePathFn();
				}
				break;
			case COLON:
				break;
			default:
				break;
			}
			setState(2831);
			match(COLON);
			setState(2832);
			typeParamBounds();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedPathInExpressionContext extends ParserRuleContext {
		public QualifiedPathTypeContext qualifiedPathType() {
			return getRuleContext(QualifiedPathTypeContext.class,0);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public List<PathExprSegmentContext> pathExprSegment() {
			return getRuleContexts(PathExprSegmentContext.class);
		}
		public PathExprSegmentContext pathExprSegment(int i) {
			return getRuleContext(PathExprSegmentContext.class,i);
		}
		public QualifiedPathInExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPathInExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterQualifiedPathInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitQualifiedPathInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitQualifiedPathInExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPathInExpressionContext qualifiedPathInExpression() throws RecognitionException {
		QualifiedPathInExpressionContext _localctx = new QualifiedPathInExpressionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_qualifiedPathInExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2834);
			qualifiedPathType();
			setState(2837); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2835);
					match(PATHSEP);
					setState(2836);
					pathExprSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2839); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,416,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedPathTypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public QualifiedPathTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPathType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterQualifiedPathType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitQualifiedPathType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitQualifiedPathType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPathTypeContext qualifiedPathType() throws RecognitionException {
		QualifiedPathTypeContext _localctx = new QualifiedPathTypeContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_qualifiedPathType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2841);
			match(LT);
			setState(2842);
			type_();
			setState(2845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(2843);
				match(KW_AS);
				setState(2844);
				typePath();
				}
			}

			setState(2847);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedPathInTypeContext extends ParserRuleContext {
		public QualifiedPathTypeContext qualifiedPathType() {
			return getRuleContext(QualifiedPathTypeContext.class,0);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public List<TypePathSegmentContext> typePathSegment() {
			return getRuleContexts(TypePathSegmentContext.class);
		}
		public TypePathSegmentContext typePathSegment(int i) {
			return getRuleContext(TypePathSegmentContext.class,i);
		}
		public QualifiedPathInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPathInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterQualifiedPathInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitQualifiedPathInType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitQualifiedPathInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPathInTypeContext qualifiedPathInType() throws RecognitionException {
		QualifiedPathInTypeContext _localctx = new QualifiedPathInTypeContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_qualifiedPathInType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2849);
			qualifiedPathType();
			setState(2852); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2850);
					match(PATHSEP);
					setState(2851);
					typePathSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2854); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypePathContext extends ParserRuleContext {
		public List<TypePathSegmentContext> typePathSegment() {
			return getRuleContexts(TypePathSegmentContext.class);
		}
		public TypePathSegmentContext typePathSegment(int i) {
			return getRuleContext(TypePathSegmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public TypePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathContext typePath() throws RecognitionException {
		TypePathContext _localctx = new TypePathContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_typePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2856);
				match(PATHSEP);
				}
			}

			setState(2859);
			typePathSegment();
			setState(2864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2860);
					match(PATHSEP);
					setState(2861);
					typePathSegment();
					}
					} 
				}
				setState(2866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypePathSegmentContext extends ParserRuleContext {
		public PathIdentSegmentContext pathIdentSegment() {
			return getRuleContext(PathIdentSegmentContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public GenericArgsContext genericArgs() {
			return getRuleContext(GenericArgsContext.class,0);
		}
		public TypePathFnContext typePathFn() {
			return getRuleContext(TypePathFnContext.class,0);
		}
		public TypePathSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePathSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePathSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePathSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePathSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathSegmentContext typePathSegment() throws RecognitionException {
		TypePathSegmentContext _localctx = new TypePathSegmentContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_typePathSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2867);
			pathIdentSegment();
			setState(2869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
			case 1:
				{
				setState(2868);
				match(PATHSEP);
				}
				break;
			}
			setState(2873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,422,_ctx) ) {
			case 1:
				{
				setState(2871);
				genericArgs();
				}
				break;
			case 2:
				{
				setState(2872);
				typePathFn();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypePathFnContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TypePathInputsContext typePathInputs() {
			return getRuleContext(TypePathInputsContext.class,0);
		}
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypePathFnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePathFn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePathFn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePathFn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePathFn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathFnContext typePathFn() throws RecognitionException {
		TypePathFnContext _localctx = new TypePathFnContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_typePathFn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2875);
			match(LPAREN);
			setState(2878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_EXTERN:
			case KW_FN:
			case KW_FOR:
			case KW_IMPL:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_UNSAFE:
			case KW_USE:
			case KW_ASYNC:
			case KW_DYN:
			case KW_YEET:
			case KW_TRY:
			case KW_UNION:
			case KW_STATICLIFETIME:
			case KW_RAW:
			case KW_DEFAULT:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case KW_GEN:
			case CLOSURE_FN:
			case CLOSURE_FNMUT:
			case CLOSURE_FNONCE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case LIFETIME_OR_LABEL:
			case STAR:
			case NOT:
			case TILDE:
			case AND:
			case ANDAND:
			case LT:
			case UNDERSCORE:
			case PATHSEP:
			case QUESTION:
			case LSQUAREBRACKET:
			case LPAREN:
			case KW_UNDERLINELIFETIME:
				{
				setState(2876);
				typePathInputs();
				}
				break;
			case DOTDOT:
				{
				setState(2877);
				match(DOTDOT);
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(2880);
			match(RPAREN);
			setState(2883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				{
				setState(2881);
				match(RARROW);
				setState(2882);
				type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypePathInputsContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TypePathInputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePathInputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePathInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePathInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePathInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathInputsContext typePathInputs() throws RecognitionException {
		TypePathInputsContext _localctx = new TypePathInputsContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_typePathInputs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2885);
			type_();
			setState(2890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2886);
					match(COMMA);
					setState(2887);
					type_();
					}
					} 
				}
				setState(2892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
			}
			setState(2894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2893);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode KW_PUB() { return getToken(RustParser.KW_PUB, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitVisibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_visibility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2896);
			match(KW_PUB);
			setState(2906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,428,_ctx) ) {
			case 1:
				{
				setState(2897);
				match(LPAREN);
				setState(2903);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_CRATE:
					{
					setState(2898);
					match(KW_CRATE);
					}
					break;
				case KW_SELFVALUE:
					{
					setState(2899);
					match(KW_SELFVALUE);
					}
					break;
				case KW_SUPER:
					{
					setState(2900);
					match(KW_SUPER);
					}
					break;
				case KW_IN:
					{
					setState(2901);
					match(KW_IN);
					setState(2902);
					simplePath();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2905);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NON_KEYWORD_IDENTIFIER() { return getToken(RustParser.NON_KEYWORD_IDENTIFIER, 0); }
		public TerminalNode RAW_IDENTIFIER() { return getToken(RustParser.RAW_IDENTIFIER, 0); }
		public TerminalNode KW_MACRORULES() { return getToken(RustParser.KW_MACRORULES, 0); }
		public TerminalNode KW_UNION() { return getToken(RustParser.KW_UNION, 0); }
		public TerminalNode KW_RAW() { return getToken(RustParser.KW_RAW, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(RustParser.KW_DEFAULT, 0); }
		public TerminalNode CLOSURE_FN() { return getToken(RustParser.CLOSURE_FN, 0); }
		public TerminalNode CLOSURE_FNMUT() { return getToken(RustParser.CLOSURE_FNMUT, 0); }
		public TerminalNode CLOSURE_FNONCE() { return getToken(RustParser.CLOSURE_FNONCE, 0); }
		public TerminalNode KW_GEN() { return getToken(RustParser.KW_GEN, 0); }
		public TerminalNode KW_YEET() { return getToken(RustParser.KW_YEET, 0); }
		public TerminalNode KW_PIN() { return getToken(RustParser.KW_PIN, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2908);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 8720933191681L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TerminalNode KW_BREAK() { return getToken(RustParser.KW_BREAK, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(RustParser.KW_CONTINUE, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public TerminalNode KW_ENUM() { return getToken(RustParser.KW_ENUM, 0); }
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public TerminalNode KW_LOOP() { return getToken(RustParser.KW_LOOP, 0); }
		public TerminalNode KW_MATCH() { return getToken(RustParser.KW_MATCH, 0); }
		public TerminalNode KW_MOD() { return getToken(RustParser.KW_MOD, 0); }
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode KW_PUB() { return getToken(RustParser.KW_PUB, 0); }
		public TerminalNode KW_REF() { return getToken(RustParser.KW_REF, 0); }
		public TerminalNode KW_RETURN() { return getToken(RustParser.KW_RETURN, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SELFTYPE() { return getToken(RustParser.KW_SELFTYPE, 0); }
		public TerminalNode KW_STATIC() { return getToken(RustParser.KW_STATIC, 0); }
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_TRAIT() { return getToken(RustParser.KW_TRAIT, 0); }
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_TYPE() { return getToken(RustParser.KW_TYPE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_USE() { return getToken(RustParser.KW_USE, 0); }
		public TerminalNode KW_WHERE() { return getToken(RustParser.KW_WHERE, 0); }
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_AWAIT() { return getToken(RustParser.KW_AWAIT, 0); }
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TerminalNode KW_ABSTRACT() { return getToken(RustParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_BECOME() { return getToken(RustParser.KW_BECOME, 0); }
		public TerminalNode KW_BOX() { return getToken(RustParser.KW_BOX, 0); }
		public TerminalNode KW_DO() { return getToken(RustParser.KW_DO, 0); }
		public TerminalNode KW_FINAL() { return getToken(RustParser.KW_FINAL, 0); }
		public TerminalNode KW_MACRO() { return getToken(RustParser.KW_MACRO, 0); }
		public TerminalNode KW_OVERRIDE() { return getToken(RustParser.KW_OVERRIDE, 0); }
		public TerminalNode KW_PRIV() { return getToken(RustParser.KW_PRIV, 0); }
		public TerminalNode KW_TYPEOF() { return getToken(RustParser.KW_TYPEOF, 0); }
		public TerminalNode KW_UNSIZED() { return getToken(RustParser.KW_UNSIZED, 0); }
		public TerminalNode KW_VIRTUAL() { return getToken(RustParser.KW_VIRTUAL, 0); }
		public TerminalNode KW_YIELD() { return getToken(RustParser.KW_YIELD, 0); }
		public TerminalNode KW_TRY() { return getToken(RustParser.KW_TRY, 0); }
		public TerminalNode KW_UNION() { return getToken(RustParser.KW_UNION, 0); }
		public TerminalNode KW_STATICLIFETIME() { return getToken(RustParser.KW_STATICLIFETIME, 0); }
		public TerminalNode KW_AUTO() { return getToken(RustParser.KW_AUTO, 0); }
		public TerminalNode KW_SAFE() { return getToken(RustParser.KW_SAFE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2910);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 288160007373979646L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Non_crate_keywordContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TerminalNode KW_BREAK() { return getToken(RustParser.KW_BREAK, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(RustParser.KW_CONTINUE, 0); }
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public TerminalNode KW_ENUM() { return getToken(RustParser.KW_ENUM, 0); }
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public TerminalNode KW_LOOP() { return getToken(RustParser.KW_LOOP, 0); }
		public TerminalNode KW_MATCH() { return getToken(RustParser.KW_MATCH, 0); }
		public TerminalNode KW_MOD() { return getToken(RustParser.KW_MOD, 0); }
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode KW_PUB() { return getToken(RustParser.KW_PUB, 0); }
		public TerminalNode KW_REF() { return getToken(RustParser.KW_REF, 0); }
		public TerminalNode KW_RETURN() { return getToken(RustParser.KW_RETURN, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SELFTYPE() { return getToken(RustParser.KW_SELFTYPE, 0); }
		public TerminalNode KW_STATIC() { return getToken(RustParser.KW_STATIC, 0); }
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_TRAIT() { return getToken(RustParser.KW_TRAIT, 0); }
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_TYPE() { return getToken(RustParser.KW_TYPE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_USE() { return getToken(RustParser.KW_USE, 0); }
		public TerminalNode KW_WHERE() { return getToken(RustParser.KW_WHERE, 0); }
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_AWAIT() { return getToken(RustParser.KW_AWAIT, 0); }
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TerminalNode KW_ABSTRACT() { return getToken(RustParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_BECOME() { return getToken(RustParser.KW_BECOME, 0); }
		public TerminalNode KW_BOX() { return getToken(RustParser.KW_BOX, 0); }
		public TerminalNode KW_DO() { return getToken(RustParser.KW_DO, 0); }
		public TerminalNode KW_FINAL() { return getToken(RustParser.KW_FINAL, 0); }
		public TerminalNode KW_MACRO() { return getToken(RustParser.KW_MACRO, 0); }
		public TerminalNode KW_OVERRIDE() { return getToken(RustParser.KW_OVERRIDE, 0); }
		public TerminalNode KW_PRIV() { return getToken(RustParser.KW_PRIV, 0); }
		public TerminalNode KW_TYPEOF() { return getToken(RustParser.KW_TYPEOF, 0); }
		public TerminalNode KW_UNSIZED() { return getToken(RustParser.KW_UNSIZED, 0); }
		public TerminalNode KW_VIRTUAL() { return getToken(RustParser.KW_VIRTUAL, 0); }
		public TerminalNode KW_YIELD() { return getToken(RustParser.KW_YIELD, 0); }
		public TerminalNode KW_TRY() { return getToken(RustParser.KW_TRY, 0); }
		public TerminalNode KW_UNION() { return getToken(RustParser.KW_UNION, 0); }
		public TerminalNode KW_STATICLIFETIME() { return getToken(RustParser.KW_STATICLIFETIME, 0); }
		public TerminalNode KW_AUTO() { return getToken(RustParser.KW_AUTO, 0); }
		public TerminalNode KW_SAFE() { return getToken(RustParser.KW_SAFE, 0); }
		public TerminalNode KW_PIN() { return getToken(RustParser.KW_PIN, 0); }
		public Non_crate_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_crate_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNon_crate_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNon_crate_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNon_crate_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_crate_keywordContext non_crate_keyword() throws RecognitionException {
		Non_crate_keywordContext _localctx = new Non_crate_keywordContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_non_crate_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2912);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 288160007407534046L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroIdentifierLikeTokenContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_MACRORULES() { return getToken(RustParser.KW_MACRORULES, 0); }
		public TerminalNode KW_DOLLARCRATE() { return getToken(RustParser.KW_DOLLARCRATE, 0); }
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public MacroIdentifierLikeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroIdentifierLikeToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroIdentifierLikeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroIdentifierLikeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroIdentifierLikeToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroIdentifierLikeTokenContext macroIdentifierLikeToken() throws RecognitionException {
		MacroIdentifierLikeTokenContext _localctx = new MacroIdentifierLikeTokenContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_macroIdentifierLikeToken);
		try {
			setState(2919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,429,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2914);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2915);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2916);
				match(KW_MACRORULES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2917);
				match(KW_DOLLARCRATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2918);
				match(LIFETIME_OR_LABEL);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroLiteralTokenContext extends ParserRuleContext {
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public MacroLiteralTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroLiteralToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroLiteralToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroLiteralToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroLiteralToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroLiteralTokenContext macroLiteralToken() throws RecognitionException {
		MacroLiteralTokenContext _localctx = new MacroLiteralTokenContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_macroLiteralToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2921);
			literalExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacroPunctuationTokenContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode SLASH() { return getToken(RustParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(RustParser.PERCENT, 0); }
		public TerminalNode CARET() { return getToken(RustParser.CARET, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode OR() { return getToken(RustParser.OR, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(RustParser.OROR, 0); }
		public TerminalNode PLUSEQ() { return getToken(RustParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(RustParser.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(RustParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(RustParser.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(RustParser.PERCENTEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(RustParser.CARETEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(RustParser.ANDEQ, 0); }
		public TerminalNode OREQ() { return getToken(RustParser.OREQ, 0); }
		public TerminalNode SHLEQ() { return getToken(RustParser.SHLEQ, 0); }
		public TerminalNode SHREQ() { return getToken(RustParser.SHREQ, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public TerminalNode EQEQ() { return getToken(RustParser.EQEQ, 0); }
		public TerminalNode NE() { return getToken(RustParser.NE, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GE() { return getToken(RustParser.GE, 0); }
		public TerminalNode LE() { return getToken(RustParser.LE, 0); }
		public TerminalNode AT() { return getToken(RustParser.AT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TerminalNode FATARROW() { return getToken(RustParser.FATARROW, 0); }
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public TerminalNode TILDE() { return getToken(RustParser.TILDE, 0); }
		public MacroPunctuationTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroPunctuationToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroPunctuationToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroPunctuationToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroPunctuationToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroPunctuationTokenContext macroPunctuationToken() throws RecognitionException {
		MacroPunctuationTokenContext _localctx = new MacroPunctuationTokenContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_macroPunctuationToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2923);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 2199023255549L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShlContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(RustParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(RustParser.LT, i);
		}
		public ShlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterShl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitShl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitShl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShlContext shl() throws RecognitionException {
		ShlContext _localctx = new ShlContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_shl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2925);
			match(LT);
			setState(2926);
			if (!(this.next('<'))) throw new FailedPredicateException(this, "this.next('<')");
			setState(2927);
			match(LT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShrContext extends ParserRuleContext {
		public List<TerminalNode> GT() { return getTokens(RustParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(RustParser.GT, i);
		}
		public ShrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterShr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitShr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitShr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShrContext shr() throws RecognitionException {
		ShrContext _localctx = new ShrContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_shr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2929);
			match(GT);
			setState(2930);
			if (!(this.next('>'))) throw new FailedPredicateException(this, "this.next('>')");
			setState(2931);
			match(GT);
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
		case 51:
			return union__sempred((Union_Context)_localctx, predIndex);
		case 80:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 169:
			return traitObjectType_sempred((TraitObjectTypeContext)_localctx, predIndex);
		case 211:
			return shl_sempred((ShlContext)_localctx, predIndex);
		case 212:
			return shr_sempred((ShrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean union__sempred(Union_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.nextIsIdentifier();
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 33);
		case 2:
			return precpred(_ctx, 32);
		case 3:
			return precpred(_ctx, 31);
		case 4:
			return precpred(_ctx, 30);
		case 5:
			return precpred(_ctx, 29);
		case 6:
			return precpred(_ctx, 28);
		case 7:
			return precpred(_ctx, 27);
		case 8:
			return precpred(_ctx, 26);
		case 9:
			return precpred(_ctx, 25);
		case 10:
			return precpred(_ctx, 24);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 16);
		case 14:
			return precpred(_ctx, 46);
		case 15:
			return precpred(_ctx, 45);
		case 16:
			return precpred(_ctx, 44);
		case 17:
			return precpred(_ctx, 43);
		case 18:
			return precpred(_ctx, 42);
		case 19:
			return precpred(_ctx, 41);
		case 20:
			return precpred(_ctx, 40);
		case 21:
			return precpred(_ctx, 39);
		case 22:
			return precpred(_ctx, 34);
		case 23:
			return precpred(_ctx, 23);
		}
		return true;
	}
	private boolean traitObjectType_sempred(TraitObjectTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return  _input.LA(1) != RustLexer.PATHSEP   // ::
		        && _input.LA(1) != RustLexer.LT     // <
		        && _input.LA(1) != RustLexer.LPAREN // (
		      ;
		}
		return true;
	}
	private boolean shl_sempred(ShlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return this.next('<');
		}
		return true;
	}
	private boolean shr_sempred(ShrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return this.next('>');
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u008a\u0b76\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007"+
		"\u00c8\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007"+
		"\u00cb\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007"+
		"\u00ce\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007"+
		"\u00d1\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007"+
		"\u00d4\u0001\u0000\u0005\u0000\u01ac\b\u0000\n\u0000\f\u0000\u01af\t\u0000"+
		"\u0001\u0000\u0005\u0000\u01b2\b\u0000\n\u0000\f\u0000\u01b5\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u01bc"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u01c2"+
		"\b\u0002\n\u0002\f\u0002\u01c5\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u01ca\b\u0002\n\u0002\f\u0002\u01cd\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u01d2\b\u0002\n\u0002\f\u0002\u01d5\t\u0002"+
		"\u0001\u0002\u0003\u0002\u01d8\b\u0002\u0001\u0003\u0004\u0003\u01db\b"+
		"\u0003\u000b\u0003\f\u0003\u01dc\u0001\u0003\u0003\u0003\u01e0\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u01e7\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01ec\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u01f0\b\u0005\n\u0005\f\u0005"+
		"\u01f3\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u01fb\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u01ff\b\u0005\n\u0005\f\u0005\u0202\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u020a\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u020e\b\u0005\n\u0005\f\u0005\u0211\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0215\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u021d\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0223\b\u0007"+
		"\n\u0007\f\u0007\u0226\t\u0007\u0001\u0007\u0003\u0007\u0229\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u022d\b\u0007\n\u0007\f\u0007\u0230\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0240\b\b\u0001"+
		"\b\u0003\b\u0243\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u0248\b\t\n\t\f\t"+
		"\u024b\t\t\u0001\t\u0003\t\u024e\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0256\b\u000b\n\u000b\f\u000b\u0259\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u025e\b\u000b\n\u000b"+
		"\f\u000b\u0261\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0266\b\u000b\n\u000b\f\u000b\u0269\t\u000b\u0001\u000b\u0003\u000b\u026c"+
		"\b\u000b\u0001\f\u0004\f\u026f\b\f\u000b\f\f\f\u0270\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0278\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0004\f\u027f\b\f\u000b\f\f\f\u0280\u0001\f\u0001\f\u0003\f\u0285\b"+
		"\f\u0001\f\u0001\f\u0003\f\u0289\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u028f\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0297\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0005\u0012\u029e\b\u0012\n\u0012\f\u0012\u02a1"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u02a5\b\u0012\u0001\u0013"+
		"\u0003\u0013\u02a8\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u02b7\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u02bc\b\u0014\u0001\u0015\u0003\u0015"+
		"\u02bf\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u02c6\b\u0015\n\u0015\f\u0015\u02c9\t\u0015\u0001\u0015\u0005"+
		"\u0015\u02cc\b\u0015\n\u0015\f\u0015\u02cf\t\u0015\u0001\u0015\u0003\u0015"+
		"\u02d2\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u02d8\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u02de\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02e3\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0003"+
		"\u001a\u02ea\b\u001a\u0001\u001a\u0003\u001a\u02ed\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u02f4\b\u001a"+
		"\n\u001a\f\u001a\u02f7\t\u001a\u0001\u001a\u0003\u001a\u02fa\b\u001a\u0003"+
		"\u001a\u02fc\b\u001a\u0001\u001a\u0003\u001a\u02ff\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0305\b\u001a\u0003\u001a"+
		"\u0307\b\u001a\u0003\u001a\u0309\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u030f\b\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0313\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0317\b\u001b"+
		"\u0001\u001b\u0003\u001b\u031a\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u031e\b\u001b\u0001\u001c\u0003\u001c\u0321\b\u001c\u0001\u001c\u0003"+
		"\u001c\u0324\b\u001c\u0001\u001c\u0003\u001c\u0327\b\u001c\u0001\u001c"+
		"\u0003\u001c\u032a\b\u001c\u0001\u001c\u0003\u001c\u032d\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0331\b\u001c\u0003\u001c\u0333\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0339\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u033e\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u0343\b\u001e\n\u001e\f\u001e\u0346"+
		"\t\u001e\u0001\u001e\u0003\u001e\u0349\b\u001e\u0003\u001e\u034b\b\u001e"+
		"\u0001\u001f\u0005\u001f\u034e\b\u001f\n\u001f\f\u001f\u0351\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0355\b\u001f\u0001 \u0001 \u0003 \u0359"+
		"\b \u0003 \u035b\b \u0001 \u0003 \u035e\b \u0001 \u0001 \u0001!\u0003"+
		"!\u0363\b!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0005\"\u036a\b\"\n\"\f"+
		"\"\u036d\t\"\u0001\"\u0001\"\u0001\"\u0003\"\u0372\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u0378\b#\u0001$\u0001$\u0001$\u0001%\u0003%\u037e\b%\u0001"+
		"%\u0001%\u0001%\u0003%\u0383\b%\u0001%\u0001%\u0003%\u0387\b%\u0003%\u0389"+
		"\b%\u0001%\u0003%\u038c\b%\u0001%\u0001%\u0001%\u0003%\u0391\b%\u0003"+
		"%\u0393\b%\u0001%\u0001%\u0001&\u0001&\u0003&\u0399\b&\u0001\'\u0001\'"+
		"\u0001\'\u0003\'\u039e\b\'\u0001\'\u0003\'\u03a1\b\'\u0001\'\u0001\'\u0003"+
		"\'\u03a5\b\'\u0001\'\u0001\'\u0003\'\u03a9\b\'\u0001(\u0001(\u0001(\u0003"+
		"(\u03ae\b(\u0001(\u0001(\u0003(\u03b2\b(\u0001(\u0001(\u0003(\u03b6\b"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0005)\u03bd\b)\n)\f)\u03c0\t)\u0001"+
		")\u0003)\u03c3\b)\u0001*\u0005*\u03c6\b*\n*\f*\u03c9\t*\u0001*\u0003*"+
		"\u03cc\b*\u0001*\u0003*\u03cf\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u03d6\b*\u0001+\u0001+\u0001+\u0005+\u03db\b+\n+\f+\u03de\t+\u0001+"+
		"\u0003+\u03e1\b+\u0001,\u0005,\u03e4\b,\n,\f,\u03e7\t,\u0001,\u0003,\u03ea"+
		"\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u03f1\b-\u0001-\u0003-\u03f4"+
		"\b-\u0001-\u0001-\u0003-\u03f8\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005"+
		".\u03ff\b.\n.\f.\u0402\t.\u0001.\u0003.\u0405\b.\u0001/\u0005/\u0408\b"+
		"/\n/\f/\u040b\t/\u0001/\u0003/\u040e\b/\u0001/\u0001/\u0001/\u0003/\u0413"+
		"\b/\u0001/\u0003/\u0416\b/\u00010\u00010\u00030\u041a\b0\u00010\u0001"+
		"0\u00011\u00011\u00031\u0420\b1\u00011\u00011\u00012\u00012\u00012\u0001"+
		"3\u00013\u00013\u00013\u00033\u042b\b3\u00013\u00033\u042e\b3\u00013\u0001"+
		"3\u00033\u0432\b3\u00013\u00013\u00014\u00034\u0437\b4\u00014\u00014\u0001"+
		"4\u00034\u043c\b4\u00014\u00034\u043f\b4\u00014\u00014\u00014\u00014\u0003"+
		"4\u0445\b4\u00014\u00034\u0448\b4\u00014\u00014\u00015\u00035\u044d\b"+
		"5\u00015\u00015\u00035\u0451\b5\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u0458\b5\u00015\u00015\u00016\u00036\u045d\b6\u00016\u00036\u0460\b"+
		"6\u00016\u00016\u00016\u00036\u0465\b6\u00016\u00016\u00036\u0469\b6\u0003"+
		"6\u046b\b6\u00016\u00036\u046e\b6\u00016\u00016\u00056\u0472\b6\n6\f6"+
		"\u0475\t6\u00016\u00056\u0478\b6\n6\f6\u047b\t6\u00016\u00016\u00016\u0003"+
		"6\u0480\b6\u00016\u00036\u0483\b6\u00016\u00016\u00016\u00036\u0488\b"+
		"6\u00016\u00016\u00036\u048c\b6\u00036\u048e\b6\u00016\u00016\u00036\u0492"+
		"\b6\u00016\u00036\u0495\b6\u00016\u00016\u00036\u0499\b6\u00017\u0001"+
		"7\u00037\u049d\b7\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u04a5"+
		"\b8\u00018\u00018\u00038\u04a9\b8\u00018\u00038\u04ac\b8\u00018\u0001"+
		"8\u00038\u04b0\b8\u00018\u00018\u00058\u04b4\b8\n8\f8\u04b7\t8\u00018"+
		"\u00058\u04ba\b8\n8\f8\u04bd\t8\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00039\u04c7\b9\u00019\u00019\u00039\u04cb\b9\u00019\u0003"+
		"9\u04ce\b9\u00019\u00039\u04d1\b9\u00019\u00019\u00019\u00019\u00039\u04d7"+
		"\b9\u00019\u00019\u00059\u04db\b9\n9\f9\u04de\t9\u00019\u00059\u04e1\b"+
		"9\n9\f9\u04e4\t9\u00019\u00019\u0001:\u0003:\u04e9\b:\u0001:\u0001:\u0003"+
		":\u04ed\b:\u0001:\u0001:\u0005:\u04f1\b:\n:\f:\u04f4\t:\u0001:\u0005:"+
		"\u04f7\b:\n:\f:\u04fa\t:\u0001:\u0001:\u0001;\u0005;\u04ff\b;\n;\f;\u0502"+
		"\t;\u0001;\u0001;\u0003;\u0506\b;\u0001;\u0001;\u0001;\u0003;\u050b\b"+
		";\u0003;\u050d\b;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0005=\u0517\b=\n=\f=\u051a\t=\u0001=\u0001=\u0003=\u051e\b=\u0003="+
		"\u0520\b=\u0001=\u0001=\u0001>\u0005>\u0525\b>\n>\f>\u0528\t>\u0001>\u0001"+
		">\u0001>\u0003>\u052d\b>\u0001?\u0003?\u0530\b?\u0001?\u0001?\u0001?\u0003"+
		"?\u0535\b?\u0001@\u0003@\u0538\b@\u0001@\u0001@\u0001@\u0003@\u053d\b"+
		"@\u0003@\u053f\b@\u0001@\u0001@\u0003@\u0543\b@\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u054b\bA\u0001B\u0001B\u0001C\u0001C\u0001C\u0001"+
		"C\u0005C\u0553\bC\nC\fC\u0556\tC\u0001C\u0001C\u0003C\u055a\bC\u0001D"+
		"\u0001D\u0003D\u055e\bD\u0001E\u0001E\u0001E\u0001E\u0001F\u0003F\u0565"+
		"\bF\u0001F\u0001F\u0001F\u0003F\u056a\bF\u0001G\u0001G\u0001G\u0001H\u0005"+
		"H\u0570\bH\nH\fH\u0573\tH\u0001H\u0001H\u0003H\u0577\bH\u0001H\u0001H"+
		"\u0001H\u0003H\u057c\bH\u0003H\u057e\bH\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0003K\u058d"+
		"\bK\u0001K\u0001K\u0001K\u0001K\u0003K\u0593\bK\u0001K\u0001K\u0003K\u0597"+
		"\bK\u0001L\u0001L\u0001L\u0003L\u059c\bL\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0003M\u05a3\bM\u0001N\u0005N\u05a6\bN\nN\fN\u05a9\tN\u0001N\u0001N"+
		"\u0001N\u0001N\u0003N\u05af\bN\u0001N\u0001N\u0001N\u0001N\u0003N\u05b5"+
		"\bN\u0003N\u05b7\bN\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0003"+
		"O\u05c0\bO\u0003O\u05c2\bO\u0001P\u0001P\u0004P\u05c6\bP\u000bP\fP\u05c7"+
		"\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u05d0\bP\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003"+
		"P\u05dd\bP\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0003P\u05ea\bP\u0001P\u0003P\u05ed\bP\u0001P\u0001P\u0003"+
		"P\u05f1\bP\u0001P\u0003P\u05f4\bP\u0001P\u0001P\u0003P\u05f8\bP\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0003P\u05ff\bP\u0001P\u0001P\u0003P\u0603"+
		"\bP\u0001P\u0001P\u0005P\u0607\bP\nP\fP\u060a\tP\u0001P\u0001P\u0001P"+
		"\u0001P\u0001P\u0005P\u0611\bP\nP\fP\u0614\tP\u0001P\u0003P\u0617\bP\u0001"+
		"P\u0001P\u0001P\u0005P\u061c\bP\nP\fP\u061f\tP\u0001P\u0003P\u0622\bP"+
		"\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u062b\bP\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u0636"+
		"\bP\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0005"+
		"P\u065f\bP\nP\fP\u0662\tP\u0001P\u0003P\u0665\bP\u0001P\u0001P\u0001P"+
		"\u0001P\u0001P\u0001P\u0003P\u066d\bP\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0003P\u0676\bP\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0003P\u0681\bP\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003"+
		"P\u0691\bP\u0005P\u0693\bP\nP\fP\u0696\tP\u0001Q\u0001Q\u0001R\u0001R"+
		"\u0001S\u0004S\u069d\bS\u000bS\fS\u069e\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u06ae"+
		"\bS\u0001T\u0001T\u0003T\u06b2\bT\u0001T\u0001T\u0001U\u0001U\u0001U\u0003"+
		"U\u06b9\bU\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u06c9\bV\u0001V\u0001V\u0003"+
		"V\u06cd\bV\u0001W\u0001W\u0003W\u06d1\bW\u0001X\u0001X\u0005X\u06d5\b"+
		"X\nX\fX\u06d8\tX\u0001X\u0003X\u06db\bX\u0001X\u0001X\u0001Y\u0004Y\u06e0"+
		"\bY\u000bY\fY\u06e1\u0001Y\u0003Y\u06e5\bY\u0001Y\u0003Y\u06e8\bY\u0001"+
		"Z\u0001Z\u0003Z\u06ec\bZ\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001\\\u0001"+
		"\\\u0001\\\u0001]\u0001]\u0001]\u0001^\u0001^\u0001^\u0005^\u06fc\b^\n"+
		"^\f^\u06ff\t^\u0001^\u0003^\u0702\b^\u0001^\u0001^\u0001^\u0001^\u0003"+
		"^\u0708\b^\u0001_\u0001_\u0001_\u0004_\u070d\b_\u000b_\f_\u070e\u0001"+
		"_\u0003_\u0712\b_\u0001`\u0001`\u0001a\u0001a\u0001a\u0003a\u0719\ba\u0001"+
		"b\u0001b\u0003b\u071d\bb\u0001b\u0001b\u0005b\u0721\bb\nb\fb\u0724\tb"+
		"\u0001b\u0001b\u0003b\u0728\bb\u0001b\u0001b\u0001c\u0001c\u0001c\u0005"+
		"c\u072f\bc\nc\fc\u0732\tc\u0001c\u0001c\u0001c\u0003c\u0737\bc\u0003c"+
		"\u0739\bc\u0001d\u0005d\u073c\bd\nd\fd\u073f\td\u0001d\u0001d\u0001d\u0003"+
		"d\u0744\bd\u0001d\u0001d\u0001d\u0003d\u0749\bd\u0001e\u0001e\u0003e\u074d"+
		"\be\u0001f\u0001f\u0001f\u0005f\u0752\bf\nf\ff\u0755\tf\u0001f\u0001f"+
		"\u0001f\u0005f\u075a\bf\nf\ff\u075d\tf\u0001f\u0003f\u0760\bf\u0003f\u0762"+
		"\bf\u0001f\u0001f\u0001g\u0001g\u0001h\u0001h\u0001h\u0003h\u076b\bh\u0001"+
		"i\u0001i\u0001i\u0003i\u0770\bi\u0001i\u0001i\u0001j\u0001j\u0001j\u0005"+
		"j\u0777\bj\nj\fj\u077a\tj\u0001j\u0003j\u077d\bj\u0001k\u0001k\u0001k"+
		"\u0003k\u0782\bk\u0001k\u0001k\u0001k\u0003k\u0787\bk\u0001l\u0001l\u0001"+
		"l\u0001l\u0001l\u0005l\u078e\bl\nl\fl\u0791\tl\u0001l\u0003l\u0794\bl"+
		"\u0003l\u0796\bl\u0001l\u0001l\u0001m\u0001m\u0001n\u0001n\u0001n\u0005"+
		"n\u079f\bn\nn\fn\u07a2\tn\u0001n\u0003n\u07a5\bn\u0001o\u0003o\u07a8\b"+
		"o\u0001o\u0003o\u07ab\bo\u0001o\u0003o\u07ae\bo\u0001o\u0003o\u07b1\b"+
		"o\u0001o\u0003o\u07b4\bo\u0001o\u0001o\u0001o\u0003o\u07b9\bo\u0001o\u0003"+
		"o\u07bc\bo\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u07c3\bo\u0001p\u0001"+
		"p\u0001p\u0005p\u07c8\bp\np\fp\u07cb\tp\u0001p\u0003p\u07ce\bp\u0001q"+
		"\u0005q\u07d1\bq\nq\fq\u07d4\tq\u0001q\u0001q\u0001q\u0003q\u07d9\bq\u0001"+
		"r\u0003r\u07dc\br\u0001r\u0001r\u0001r\u0001r\u0003r\u07e2\br\u0001r\u0001"+
		"r\u0001r\u0003r\u07e7\br\u0001s\u0001s\u0001s\u0001t\u0001t\u0001t\u0001"+
		"t\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001v\u0001v\u0001"+
		"v\u0001v\u0001v\u0001v\u0001w\u0001w\u0001x\u0001x\u0001x\u0001y\u0001"+
		"y\u0001y\u0001y\u0001y\u0001y\u0001y\u0003y\u0809\by\u0003y\u080b\by\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0003"+
		"z\u0817\bz\u0003z\u0819\bz\u0001{\u0001{\u0001{\u0001{\u0001{\u0001|\u0001"+
		"|\u0001|\u0001|\u0005|\u0824\b|\n|\f|\u0827\t|\u0001|\u0003|\u082a\b|"+
		"\u0001|\u0001|\u0001}\u0001}\u0001}\u0001}\u0005}\u0832\b}\n}\f}\u0835"+
		"\t}\u0001}\u0001}\u0001}\u0001}\u0003}\u083b\b}\u0001~\u0001~\u0001~\u0001"+
		"~\u0001~\u0003~\u0842\b~\u0003~\u0844\b~\u0001\u007f\u0005\u007f\u0847"+
		"\b\u007f\n\u007f\f\u007f\u084a\t\u007f\u0001\u007f\u0001\u007f\u0003\u007f"+
		"\u084e\b\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0081\u0003\u0081"+
		"\u0854\b\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0005\u0081\u0859\b"+
		"\u0081\n\u0081\f\u0081\u085c\t\u0081\u0001\u0082\u0001\u0082\u0003\u0082"+
		"\u0860\b\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082"+
		"\u0003\u0082\u0867\b\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083"+
		"\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083"+
		"\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u0877\b\u0083"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0003\u0085\u0885\b\u0085\u0001\u0085\u0001\u0085\u0003\u0085\u0889\b"+
		"\u0085\u0001\u0085\u0003\u0085\u088c\b\u0085\u0001\u0086\u0005\u0086\u088f"+
		"\b\u0086\n\u0086\f\u0086\u0892\t\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0003\u0086\u0897\b\u0086\u0001\u0087\u0001\u0087\u0001\u0088\u0001\u0088"+
		"\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0003\u0089\u08b0\b\u0089\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0003\u008a\u08b5\b\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u08b9\b"+
		"\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u08be\b\u008a\u0001"+
		"\u008b\u0001\u008b\u0003\u008b\u08c2\b\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008c\u0001\u008c\u0003\u008c\u08c8\b\u008c\u0001\u008c\u0001\u008c\u0003"+
		"\u008c\u08cc\b\u008c\u0001\u008c\u0001\u008c\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0003\u008d\u08d3\b\u008d\u0003\u008d\u08d5\b\u008d\u0001\u008d"+
		"\u0003\u008d\u08d8\b\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0005\u008e"+
		"\u08dd\b\u008e\n\u008e\f\u008e\u08e0\t\u008e\u0001\u008f\u0005\u008f\u08e3"+
		"\b\u008f\n\u008f\f\u008f\u08e6\t\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0003\u008f\u08f1\b\u008f\u0001\u008f\u0003\u008f\u08f4\b\u008f\u0001"+
		"\u008f\u0001\u008f\u0003\u008f\u08f8\b\u008f\u0001\u0090\u0005\u0090\u08fb"+
		"\b\u0090\n\u0090\f\u0090\u08fe\t\u0090\u0001\u0090\u0001\u0090\u0001\u0091"+
		"\u0001\u0091\u0003\u0091\u0904\b\u0091\u0001\u0091\u0001\u0091\u0003\u0091"+
		"\u0908\b\u0091\u0001\u0091\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0005\u0092\u090f\b\u0092\n\u0092\f\u0092\u0912\t\u0092\u0001\u0092\u0003"+
		"\u0092\u0915\b\u0092\u0001\u0093\u0001\u0093\u0003\u0093\u0919\b\u0093"+
		"\u0001\u0093\u0001\u0093\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094"+
		"\u0001\u0094\u0001\u0094\u0001\u0094\u0004\u0094\u0924\b\u0094\u000b\u0094"+
		"\f\u0094\u0925\u0001\u0094\u0003\u0094\u0929\b\u0094\u0003\u0094\u092b"+
		"\b\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0096\u0001"+
		"\u0096\u0003\u0096\u0933\b\u0096\u0001\u0096\u0001\u0096\u0001\u0097\u0001"+
		"\u0097\u0001\u0097\u0005\u0097\u093a\b\u0097\n\u0097\f\u0097\u093d\t\u0097"+
		"\u0001\u0097\u0003\u0097\u0940\b\u0097\u0001\u0098\u0001\u0098\u0003\u0098"+
		"\u0944\b\u0098\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099"+
		"\u0001\u0099\u0001\u0099\u0001\u0099\u0005\u0099\u094e\b\u0099\n\u0099"+
		"\f\u0099\u0951\t\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0003\u0099"+
		"\u0956\b\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a"+
		"\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a"+
		"\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a\u0966\b\u009a\u0001\u009b"+
		"\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009c\u0001\u009c\u0001\u009d"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0004\u009d\u0972\b\u009d\u000b\u009d"+
		"\f\u009d\u0973\u0001\u009d\u0003\u009d\u0977\b\u009d\u0003\u009d\u0979"+
		"\b\u009d\u0001\u009d\u0001\u009d\u0001\u009e\u0001\u009e\u0001\u009e\u0001"+
		"\u009e\u0001\u009e\u0001\u009e\u0001\u009f\u0001\u009f\u0001\u009f\u0001"+
		"\u009f\u0001\u00a0\u0001\u00a0\u0003\u00a0\u0989\b\u00a0\u0001\u00a0\u0003"+
		"\u00a0\u098c\b\u00a0\u0001\u00a0\u0003\u00a0\u098f\b\u00a0\u0001\u00a0"+
		"\u0001\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a2"+
		"\u0003\u00a2\u0998\b\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2"+
		"\u0003\u00a2\u099e\b\u00a2\u0001\u00a2\u0001\u00a2\u0003\u00a2\u09a2\b"+
		"\u00a2\u0001\u00a3\u0003\u00a3\u09a5\b\u00a3\u0001\u00a3\u0001\u00a3\u0003"+
		"\u00a3\u09a9\b\u00a3\u0003\u00a3\u09ab\b\u00a3\u0001\u00a4\u0001\u00a4"+
		"\u0001\u00a4\u0001\u00a5\u0001\u00a5\u0003\u00a5\u09b2\b\u00a5\u0001\u00a6"+
		"\u0001\u00a6\u0001\u00a6\u0005\u00a6\u09b7\b\u00a6\n\u00a6\f\u00a6\u09ba"+
		"\t\u00a6\u0001\u00a6\u0003\u00a6\u09bd\b\u00a6\u0001\u00a7\u0005\u00a7"+
		"\u09c0\b\u00a7\n\u00a7\f\u00a7\u09c3\t\u00a7\u0001\u00a7\u0001\u00a7\u0003"+
		"\u00a7\u09c7\b\u00a7\u0001\u00a7\u0003\u00a7\u09ca\b\u00a7\u0001\u00a7"+
		"\u0001\u00a7\u0003\u00a7\u09ce\b\u00a7\u0001\u00a8\u0001\u00a8\u0001\u00a8"+
		"\u0005\u00a8\u09d3\b\u00a8\n\u00a8\f\u00a8\u09d6\t\u00a8\u0001\u00a8\u0001"+
		"\u00a8\u0001\u00a8\u0005\u00a8\u09db\b\u00a8\n\u00a8\f\u00a8\u09de\t\u00a8"+
		"\u0001\u00a8\u0001\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0003\u00a9"+
		"\u09e5\b\u00a9\u0001\u00a9\u0001\u00a9\u0003\u00a9\u09e9\b\u00a9\u0001"+
		"\u00a9\u0003\u00a9\u09ec\b\u00a9\u0001\u00aa\u0003\u00aa\u09ef\b\u00aa"+
		"\u0001\u00aa\u0003\u00aa\u09f2\b\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00ab"+
		"\u0001\u00ab\u0003\u00ab\u09f8\b\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ac"+
		"\u0001\u00ac\u0003\u00ac\u09fe\b\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac"+
		"\u0003\u00ac\u0a03\b\u00ac\u0001\u00ac\u0003\u00ac\u0a06\b\u00ac\u0001"+
		"\u00ad\u0003\u00ad\u0a09\b\u00ad\u0001\u00ad\u0003\u00ad\u0a0c\b\u00ad"+
		"\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u0a11\b\u00ad\u0001\u00ad"+
		"\u0001\u00ad\u0001\u00ad\u0003\u00ad\u0a16\b\u00ad\u0001\u00ae\u0001\u00ae"+
		"\u0001\u00af\u0001\u00af\u0001\u00af\u0005\u00af\u0a1d\b\u00af\n\u00af"+
		"\f\u00af\u0a20\t\u00af\u0001\u00af\u0003\u00af\u0a23\b\u00af\u0001\u00b0"+
		"\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0003\u00b0\u0a2a\b\u00b0"+
		"\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0003\u00b1\u0a30\b\u00b1"+
		"\u0001\u00b2\u0003\u00b2\u0a33\b\u00b2\u0001\u00b2\u0003\u00b2\u0a36\b"+
		"\u00b2\u0001\u00b2\u0001\u00b2\u0003\u00b2\u0a3a\b\u00b2\u0001\u00b2\u0003"+
		"\u00b2\u0a3d\b\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0003\u00b2\u0a42"+
		"\b\u00b2\u0001\u00b2\u0003\u00b2\u0a45\b\u00b2\u0001\u00b2\u0001\u00b2"+
		"\u0003\u00b2\u0a49\b\u00b2\u0001\u00b2\u0003\u00b2\u0a4c\b\u00b2\u0001"+
		"\u00b2\u0001\u00b2\u0001\u00b2\u0003\u00b2\u0a51\b\u00b2\u0001\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001"+
		"\u00b4\u0001\u00b4\u0005\u00b4\u0a5c\b\u00b4\n\u00b4\f\u00b4\u0a5f\t\u00b4"+
		"\u0001\u00b4\u0001\u00b4\u0003\u00b4\u0a63\b\u00b4\u0001\u00b4\u0001\u00b4"+
		"\u0003\u00b4\u0a67\b\u00b4\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0003\u00b5"+
		"\u0a6c\b\u00b5\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0005\u00b6\u0a71\b"+
		"\u00b6\n\u00b6\f\u00b6\u0a74\t\u00b6\u0001\u00b6\u0003\u00b6\u0a77\b\u00b6"+
		"\u0001\u00b7\u0001\u00b7\u0001\u00b8\u0003\u00b8\u0a7c\b\u00b8\u0001\u00b8"+
		"\u0001\u00b8\u0001\u00b8\u0005\u00b8\u0a81\b\u00b8\n\u00b8\f\u00b8\u0a84"+
		"\t\u00b8\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001"+
		"\u00b9\u0003\u00b9\u0a8c\b\u00b9\u0001\u00ba\u0003\u00ba\u0a8f\b\u00ba"+
		"\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0005\u00ba\u0a94\b\u00ba\n\u00ba"+
		"\f\u00ba\u0a97\t\u00ba\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb"+
		"\u0a9c\b\u00bb\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bc\u0003\u00bc\u0aa5\b\u00bc\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0003\u00bd\u0aad\b\u00bd"+
		"\u0001\u00bd\u0001\u00bd\u0003\u00bd\u0ab1\b\u00bd\u0001\u00bd\u0003\u00bd"+
		"\u0ab4\b\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0003\u00bd\u0abc\b\u00bd\u0001\u00bd\u0003\u00bd\u0abf\b"+
		"\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001"+
		"\u00bd\u0005\u00bd\u0ac7\b\u00bd\n\u00bd\f\u00bd\u0aca\t\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0003\u00bd\u0ace\b\u00bd\u0001\u00bd\u0001\u00bd\u0003\u00bd"+
		"\u0ad2\b\u00bd\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be"+
		"\u0003\u00be\u0ad9\b\u00be\u0001\u00bf\u0001\u00bf\u0003\u00bf\u0add\b"+
		"\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf\u0ae1\b\u00bf\u0001\u00c0\u0001"+
		"\u00c0\u0001\u00c0\u0005\u00c0\u0ae6\b\u00c0\n\u00c0\f\u00c0\u0ae9\t\u00c0"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0005\u00c1\u0aee\b\u00c1\n\u00c1"+
		"\f\u00c1\u0af1\t\u00c1\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0005\u00c2"+
		"\u0af6\b\u00c2\n\u00c2\f\u00c2\u0af9\t\u00c2\u0001\u00c3\u0001\u00c3\u0003"+
		"\u00c3\u0afd\b\u00c3\u0001\u00c3\u0001\u00c3\u0003\u00c3\u0b01\b\u00c3"+
		"\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0003\u00c3\u0b06\b\u00c3\u0001\u00c4"+
		"\u0001\u00c4\u0003\u00c4\u0b0a\b\u00c4\u0001\u00c4\u0001\u00c4\u0003\u00c4"+
		"\u0b0e\b\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0004\u00c5\u0b16\b\u00c5\u000b\u00c5\f\u00c5\u0b17\u0001"+
		"\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0003\u00c6\u0b1e\b\u00c6\u0001"+
		"\u00c6\u0001\u00c6\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0004\u00c7\u0b25"+
		"\b\u00c7\u000b\u00c7\f\u00c7\u0b26\u0001\u00c8\u0003\u00c8\u0b2a\b\u00c8"+
		"\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0005\u00c8\u0b2f\b\u00c8\n\u00c8"+
		"\f\u00c8\u0b32\t\u00c8\u0001\u00c9\u0001\u00c9\u0003\u00c9\u0b36\b\u00c9"+
		"\u0001\u00c9\u0001\u00c9\u0003\u00c9\u0b3a\b\u00c9\u0001\u00ca\u0001\u00ca"+
		"\u0001\u00ca\u0003\u00ca\u0b3f\b\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0003\u00ca\u0b44\b\u00ca\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0005\u00cb"+
		"\u0b49\b\u00cb\n\u00cb\f\u00cb\u0b4c\t\u00cb\u0001\u00cb\u0003\u00cb\u0b4f"+
		"\b\u00cb\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001"+
		"\u00cc\u0001\u00cc\u0003\u00cc\u0b58\b\u00cc\u0001\u00cc\u0003\u00cc\u0b5b"+
		"\b\u00cc\u0001\u00cd\u0001\u00cd\u0001\u00ce\u0001\u00ce\u0001\u00cf\u0001"+
		"\u00cf\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0003"+
		"\u00d0\u0b68\b\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d2\u0001\u00d2\u0001"+
		"\u00d3\u0001\u00d3\u0001\u00d3\u0001\u00d3\u0001\u00d4\u0001\u00d4\u0001"+
		"\u00d4\u0001\u00d4\u0001\u00d4\u0000\u0001\u00a0\u00d5\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6"+
		"\u01a8\u0000\u0012\u0002\u0000^^\u0081\u0081\u0003\u0000XXZZ\u0083\u0083"+
		"\u0001\u0000!\"\u0001\u0000JK\u0002\u0000``bb\u0002\u0000\u0003\u0003"+
		"\u0014\u0014\u0002\u0000YY^^\u0001\u0000Z\\\u0001\u0000XY\u0001\u0000"+
		"ot\u0001\u0000dm\u0002\u0000\u0014\u0014\u0016\u0016\u0001\u0000?A\u0003"+
		"\u000099WW\u008a\u008a\u0005\u0000\u0019\u0019..88:<>C\u0003\u0000\u0001"+
		"\u0018\u001a-/9\u0003\u0000\u0001\u0004\u0006-/9\u0002\u0000YY[\u0081"+
		"\u0d08\u0000\u01ad\u0001\u0000\u0000\u0000\u0002\u01b8\u0001\u0000\u0000"+
		"\u0000\u0004\u01d7\u0001\u0000\u0000\u0000\u0006\u01df\u0001\u0000\u0000"+
		"\u0000\b\u01e6\u0001\u0000\u0000\u0000\n\u0214\u0001\u0000\u0000\u0000"+
		"\f\u0216\u0001\u0000\u0000\u0000\u000e\u021c\u0001\u0000\u0000\u0000\u0010"+
		"\u0242\u0001\u0000\u0000\u0000\u0012\u0244\u0001\u0000\u0000\u0000\u0014"+
		"\u024f\u0001\u0000\u0000\u0000\u0016\u026b\u0001\u0000\u0000\u0000\u0018"+
		"\u0288\u0001\u0000\u0000\u0000\u001a\u028e\u0001\u0000\u0000\u0000\u001c"+
		"\u0290\u0001\u0000\u0000\u0000\u001e\u0296\u0001\u0000\u0000\u0000 \u0298"+
		"\u0001\u0000\u0000\u0000\"\u029a\u0001\u0000\u0000\u0000$\u029f\u0001"+
		"\u0000\u0000\u0000&\u02a7\u0001\u0000\u0000\u0000(\u02bb\u0001\u0000\u0000"+
		"\u0000*\u02be\u0001\u0000\u0000\u0000,\u02d3\u0001\u0000\u0000\u0000."+
		"\u02dd\u0001\u0000\u0000\u00000\u02df\u0001\u0000\u0000\u00002\u02e4\u0001"+
		"\u0000\u0000\u00004\u0308\u0001\u0000\u0000\u00006\u030a\u0001\u0000\u0000"+
		"\u00008\u0320\u0001\u0000\u0000\u0000:\u0334\u0001\u0000\u0000\u0000<"+
		"\u034a\u0001\u0000\u0000\u0000>\u034f\u0001\u0000\u0000\u0000@\u035a\u0001"+
		"\u0000\u0000\u0000B\u0362\u0001\u0000\u0000\u0000D\u036b\u0001\u0000\u0000"+
		"\u0000F\u0373\u0001\u0000\u0000\u0000H\u0379\u0001\u0000\u0000\u0000J"+
		"\u037d\u0001\u0000\u0000\u0000L\u0398\u0001\u0000\u0000\u0000N\u039a\u0001"+
		"\u0000\u0000\u0000P\u03aa\u0001\u0000\u0000\u0000R\u03b9\u0001\u0000\u0000"+
		"\u0000T\u03c7\u0001\u0000\u0000\u0000V\u03d7\u0001\u0000\u0000\u0000X"+
		"\u03e5\u0001\u0000\u0000\u0000Z\u03ed\u0001\u0000\u0000\u0000\\\u03fb"+
		"\u0001\u0000\u0000\u0000^\u0409\u0001\u0000\u0000\u0000`\u0417\u0001\u0000"+
		"\u0000\u0000b\u041d\u0001\u0000\u0000\u0000d\u0423\u0001\u0000\u0000\u0000"+
		"f\u0426\u0001\u0000\u0000\u0000h\u0436\u0001\u0000\u0000\u0000j\u044c"+
		"\u0001\u0000\u0000\u0000l\u0498\u0001\u0000\u0000\u0000n\u049c\u0001\u0000"+
		"\u0000\u0000p\u04a4\u0001\u0000\u0000\u0000r\u04c6\u0001\u0000\u0000\u0000"+
		"t\u04e8\u0001\u0000\u0000\u0000v\u0500\u0001\u0000\u0000\u0000x\u050e"+
		"\u0001\u0000\u0000\u0000z\u0512\u0001\u0000\u0000\u0000|\u0526\u0001\u0000"+
		"\u0000\u0000~\u052f\u0001\u0000\u0000\u0000\u0080\u0537\u0001\u0000\u0000"+
		"\u0000\u0082\u0544\u0001\u0000\u0000\u0000\u0084\u054c\u0001\u0000\u0000"+
		"\u0000\u0086\u054e\u0001\u0000\u0000\u0000\u0088\u055d\u0001\u0000\u0000"+
		"\u0000\u008a\u055f\u0001\u0000\u0000\u0000\u008c\u0564\u0001\u0000\u0000"+
		"\u0000\u008e\u056b\u0001\u0000\u0000\u0000\u0090\u0571\u0001\u0000\u0000"+
		"\u0000\u0092\u057f\u0001\u0000\u0000\u0000\u0094\u0585\u0001\u0000\u0000"+
		"\u0000\u0096\u0596\u0001\u0000\u0000\u0000\u0098\u059b\u0001\u0000\u0000"+
		"\u0000\u009a\u05a2\u0001\u0000\u0000\u0000\u009c\u05a7\u0001\u0000\u0000"+
		"\u0000\u009e\u05c1\u0001\u0000\u0000\u0000\u00a0\u062a\u0001\u0000\u0000"+
		"\u0000\u00a2\u0697\u0001\u0000\u0000\u0000\u00a4\u0699\u0001\u0000\u0000"+
		"\u0000\u00a6\u06ad\u0001\u0000\u0000\u0000\u00a8\u06af\u0001\u0000\u0000"+
		"\u0000\u00aa\u06b5\u0001\u0000\u0000\u0000\u00ac\u06cc\u0001\u0000\u0000"+
		"\u0000\u00ae\u06d0\u0001\u0000\u0000\u0000\u00b0\u06d2\u0001\u0000\u0000"+
		"\u0000\u00b2\u06e7\u0001\u0000\u0000\u0000\u00b4\u06e9\u0001\u0000\u0000"+
		"\u0000\u00b6\u06ef\u0001\u0000\u0000\u0000\u00b8\u06f2\u0001\u0000\u0000"+
		"\u0000\u00ba\u06f5\u0001\u0000\u0000\u0000\u00bc\u0707\u0001\u0000\u0000"+
		"\u0000\u00be\u070c\u0001\u0000\u0000\u0000\u00c0\u0713\u0001\u0000\u0000"+
		"\u0000\u00c2\u0718\u0001\u0000\u0000\u0000\u00c4\u071c\u0001\u0000\u0000"+
		"\u0000\u00c6\u072b\u0001\u0000\u0000\u0000\u00c8\u073d\u0001\u0000\u0000"+
		"\u0000\u00ca\u074a\u0001\u0000\u0000\u0000\u00cc\u074e\u0001\u0000\u0000"+
		"\u0000\u00ce\u0765\u0001\u0000\u0000\u0000\u00d0\u076a\u0001\u0000\u0000"+
		"\u0000\u00d2\u076c\u0001\u0000\u0000\u0000\u00d4\u0773\u0001\u0000\u0000"+
		"\u0000\u00d6\u0786\u0001\u0000\u0000\u0000\u00d8\u0788\u0001\u0000\u0000"+
		"\u0000\u00da\u0799\u0001\u0000\u0000\u0000\u00dc\u079b\u0001\u0000\u0000"+
		"\u0000\u00de\u07a7\u0001\u0000\u0000\u0000\u00e0\u07c4\u0001\u0000\u0000"+
		"\u0000\u00e2\u07d2\u0001\u0000\u0000\u0000\u00e4\u07e6\u0001\u0000\u0000"+
		"\u0000\u00e6\u07e8\u0001\u0000\u0000\u0000\u00e8\u07eb\u0001\u0000\u0000"+
		"\u0000\u00ea\u07ef\u0001\u0000\u0000\u0000\u00ec\u07f6\u0001\u0000\u0000"+
		"\u0000\u00ee\u07fc\u0001\u0000\u0000\u0000\u00f0\u07fe\u0001\u0000\u0000"+
		"\u0000\u00f2\u0801\u0001\u0000\u0000\u0000\u00f4\u080c\u0001\u0000\u0000"+
		"\u0000\u00f6\u081a\u0001\u0000\u0000\u0000\u00f8\u081f\u0001\u0000\u0000"+
		"\u0000\u00fa\u0833\u0001\u0000\u0000\u0000\u00fc\u0843\u0001\u0000\u0000"+
		"\u0000\u00fe\u0848\u0001\u0000\u0000\u0000\u0100\u084f\u0001\u0000\u0000"+
		"\u0000\u0102\u0853\u0001\u0000\u0000\u0000\u0104\u0866\u0001\u0000\u0000"+
		"\u0000\u0106\u0876\u0001\u0000\u0000\u0000\u0108\u0878\u0001\u0000\u0000"+
		"\u0000\u010a\u088b\u0001\u0000\u0000\u0000\u010c\u0890\u0001\u0000\u0000"+
		"\u0000\u010e\u0898\u0001\u0000\u0000\u0000\u0110\u089a\u0001\u0000\u0000"+
		"\u0000\u0112\u08af\u0001\u0000\u0000\u0000\u0114\u08bd\u0001\u0000\u0000"+
		"\u0000\u0116\u08bf\u0001\u0000\u0000\u0000\u0118\u08c7\u0001\u0000\u0000"+
		"\u0000\u011a\u08d7\u0001\u0000\u0000\u0000\u011c\u08d9\u0001\u0000\u0000"+
		"\u0000\u011e\u08e4\u0001\u0000\u0000\u0000\u0120\u08fc\u0001\u0000\u0000"+
		"\u0000\u0122\u0903\u0001\u0000\u0000\u0000\u0124\u090b\u0001\u0000\u0000"+
		"\u0000\u0126\u0916\u0001\u0000\u0000\u0000\u0128\u092a\u0001\u0000\u0000"+
		"\u0000\u012a\u092c\u0001\u0000\u0000\u0000\u012c\u0930\u0001\u0000\u0000"+
		"\u0000\u012e\u0936\u0001\u0000\u0000\u0000\u0130\u0943\u0001\u0000\u0000"+
		"\u0000\u0132\u0955\u0001\u0000\u0000\u0000\u0134\u0965\u0001\u0000\u0000"+
		"\u0000\u0136\u0967\u0001\u0000\u0000\u0000\u0138\u096b\u0001\u0000\u0000"+
		"\u0000\u013a\u096d\u0001\u0000\u0000\u0000\u013c\u097c\u0001\u0000\u0000"+
		"\u0000\u013e\u0982\u0001\u0000\u0000\u0000\u0140\u0986\u0001\u0000\u0000"+
		"\u0000\u0142\u0992\u0001\u0000\u0000\u0000\u0144\u0997\u0001\u0000\u0000"+
		"\u0000\u0146\u09a4\u0001\u0000\u0000\u0000\u0148\u09ac\u0001\u0000\u0000"+
		"\u0000\u014a\u09b1\u0001\u0000\u0000\u0000\u014c\u09b3\u0001\u0000\u0000"+
		"\u0000\u014e\u09c1\u0001\u0000\u0000\u0000\u0150\u09d4\u0001\u0000\u0000"+
		"\u0000\u0152\u09eb\u0001\u0000\u0000\u0000\u0154\u09ee\u0001\u0000\u0000"+
		"\u0000\u0156\u09f5\u0001\u0000\u0000\u0000\u0158\u0a05\u0001\u0000\u0000"+
		"\u0000\u015a\u0a08\u0001\u0000\u0000\u0000\u015c\u0a17\u0001\u0000\u0000"+
		"\u0000\u015e\u0a19\u0001\u0000\u0000\u0000\u0160\u0a29\u0001\u0000\u0000"+
		"\u0000\u0162\u0a2f\u0001\u0000\u0000\u0000\u0164\u0a50\u0001\u0000\u0000"+
		"\u0000\u0166\u0a52\u0001\u0000\u0000\u0000\u0168\u0a66\u0001\u0000\u0000"+
		"\u0000\u016a\u0a6b\u0001\u0000\u0000\u0000\u016c\u0a72\u0001\u0000\u0000"+
		"\u0000\u016e\u0a78\u0001\u0000\u0000\u0000\u0170\u0a7b\u0001\u0000\u0000"+
		"\u0000\u0172\u0a8b\u0001\u0000\u0000\u0000\u0174\u0a8e\u0001\u0000\u0000"+
		"\u0000\u0176\u0a98\u0001\u0000\u0000\u0000\u0178\u0aa4\u0001\u0000\u0000"+
		"\u0000\u017a\u0ad1\u0001\u0000\u0000\u0000\u017c\u0ad8\u0001\u0000\u0000"+
		"\u0000\u017e\u0ae0\u0001\u0000\u0000\u0000\u0180\u0ae2\u0001\u0000\u0000"+
		"\u0000\u0182\u0aea\u0001\u0000\u0000\u0000\u0184\u0af2\u0001\u0000\u0000"+
		"\u0000\u0186\u0afa\u0001\u0000\u0000\u0000\u0188\u0b07\u0001\u0000\u0000"+
		"\u0000\u018a\u0b12\u0001\u0000\u0000\u0000\u018c\u0b19\u0001\u0000\u0000"+
		"\u0000\u018e\u0b21\u0001\u0000\u0000\u0000\u0190\u0b29\u0001\u0000\u0000"+
		"\u0000\u0192\u0b33\u0001\u0000\u0000\u0000\u0194\u0b3b\u0001\u0000\u0000"+
		"\u0000\u0196\u0b45\u0001\u0000\u0000\u0000\u0198\u0b50\u0001\u0000\u0000"+
		"\u0000\u019a\u0b5c\u0001\u0000\u0000\u0000\u019c\u0b5e\u0001\u0000\u0000"+
		"\u0000\u019e\u0b60\u0001\u0000\u0000\u0000\u01a0\u0b67\u0001\u0000\u0000"+
		"\u0000\u01a2\u0b69\u0001\u0000\u0000\u0000\u01a4\u0b6b\u0001\u0000\u0000"+
		"\u0000\u01a6\u0b6d\u0001\u0000\u0000\u0000\u01a8\u0b71\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ac\u0003\u0092I\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b3\u0001\u0000\u0000\u0000"+
		"\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b2\u0003$\u0012\u0000\u01b1"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0005\u0000\u0000\u0001\u01b7\u0001\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0003\u0170\u00b8\u0000\u01b9\u01bb\u0007\u0000\u0000\u0000\u01ba"+
		"\u01bc\u0003\u0170\u00b8\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0003\u0004\u0002\u0000\u01be\u0003\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c3\u0005\u0088\u0000\u0000\u01c0\u01c2\u0003\u0006\u0003\u0000\u01c1"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6"+
		"\u01d8\u0005\u0089\u0000\u0000\u01c7\u01cb\u0005\u0086\u0000\u0000\u01c8"+
		"\u01ca\u0003\u0006\u0003\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d8\u0005\u0087\u0000\u0000\u01cf"+
		"\u01d3\u0005\u0084\u0000\u0000\u01d0\u01d2\u0003\u0006\u0003\u0000\u01d1"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d8\u0005\u0085\u0000\u0000\u01d7\u01bf\u0001\u0000\u0000\u0000\u01d7"+
		"\u01c7\u0001\u0000\u0000\u0000\u01d7\u01cf\u0001\u0000\u0000\u0000\u01d8"+
		"\u0005\u0001\u0000\u0000\u0000\u01d9\u01db\u0003\b\u0004\u0000\u01da\u01d9"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01e0"+
		"\u0001\u0000\u0000\u0000\u01de\u01e0\u0003\u0004\u0002\u0000\u01df\u01da"+
		"\u0001\u0000\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u0007"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e7\u0003\u01a0\u00d0\u0000\u01e2\u01e7"+
		"\u0003\u01a2\u00d1\u0000\u01e3\u01e7\u0003\u01a4\u00d2\u0000\u01e4\u01e7"+
		"\u0003 \u0010\u0000\u01e5\u01e7\u0005\u0082\u0000\u0000\u01e6\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e2\u0001\u0000\u0000\u0000\u01e6\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\t\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003\u0170"+
		"\u00b8\u0000\u01e9\u01eb\u0007\u0000\u0000\u0000\u01ea\u01ec\u0003\u0170"+
		"\u00b8\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01f1\u0005\u0088"+
		"\u0000\u0000\u01ee\u01f0\u0003\u0006\u0003\u0000\u01ef\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\u0089"+
		"\u0000\u0000\u01f5\u01f6\u0005|\u0000\u0000\u01f6\u0215\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0003\u0170\u00b8\u0000\u01f8\u01fa\u0007\u0000\u0000"+
		"\u0000\u01f9\u01fb\u0003\u0170\u00b8\u0000\u01fa\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fc\u0200\u0005\u0086\u0000\u0000\u01fd\u01ff\u0003\u0006\u0003"+
		"\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000"+
		"\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000"+
		"\u0000\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0005\u0087\u0000\u0000\u0204\u0205\u0005|\u0000\u0000"+
		"\u0205\u0215\u0001\u0000\u0000\u0000\u0206\u0207\u0003\u0170\u00b8\u0000"+
		"\u0207\u0209\u0007\u0000\u0000\u0000\u0208\u020a\u0003\u0170\u00b8\u0000"+
		"\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020f\u0005\u0084\u0000\u0000"+
		"\u020c\u020e\u0003\u0006\u0003\u0000\u020d\u020c\u0001\u0000\u0000\u0000"+
		"\u020e\u0211\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000"+
		"\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0213\u0005\u0085\u0000\u0000"+
		"\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u01e8\u0001\u0000\u0000\u0000"+
		"\u0214\u01f7\u0001\u0000\u0000\u0000\u0214\u0206\u0001\u0000\u0000\u0000"+
		"\u0215\u000b\u0001\u0000\u0000\u0000\u0216\u0217\u0005<\u0000\u0000\u0217"+
		"\u0218\u0005^\u0000\u0000\u0218\u0219\u0003\u019a\u00cd\u0000\u0219\u021a"+
		"\u0003\u0010\b\u0000\u021a\r\u0001\u0000\u0000\u0000\u021b\u021d\u0003"+
		"\u0198\u00cc\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021c\u021d\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u021f\u0005"+
		"0\u0000\u0000\u021f\u0228\u0003\u019a\u00cd\u0000\u0220\u0224\u0005\u0088"+
		"\u0000\u0000\u0221\u0223\u0003\u0006\u0003\u0000\u0222\u0221\u0001\u0000"+
		"\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000"+
		"\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0227\u0001\u0000"+
		"\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u0229\u0005\u0089"+
		"\u0000\u0000\u0228\u0220\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022e\u0005\u0084"+
		"\u0000\u0000\u022b\u022d\u0003\u0006\u0003\u0000\u022c\u022b\u0001\u0000"+
		"\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0231\u0001\u0000"+
		"\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0232\u0005\u0085"+
		"\u0000\u0000\u0232\u000f\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u0088"+
		"\u0000\u0000\u0234\u0235\u0003\u0012\t\u0000\u0235\u0236\u0005\u0089\u0000"+
		"\u0000\u0236\u0237\u0005|\u0000\u0000\u0237\u0243\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0005\u0086\u0000\u0000\u0239\u023a\u0003\u0012\t\u0000\u023a"+
		"\u023b\u0005\u0087\u0000\u0000\u023b\u023c\u0005|\u0000\u0000\u023c\u0243"+
		"\u0001\u0000\u0000\u0000\u023d\u023f\u0005\u0084\u0000\u0000\u023e\u0240"+
		"\u0003\u0012\t\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u023f\u0240\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0243\u0005"+
		"\u0085\u0000\u0000\u0242\u0233\u0001\u0000\u0000\u0000\u0242\u0238\u0001"+
		"\u0000\u0000\u0000\u0242\u023d\u0001\u0000\u0000\u0000\u0243\u0011\u0001"+
		"\u0000\u0000\u0000\u0244\u0249\u0003\u0014\n\u0000\u0245\u0246\u0005|"+
		"\u0000\u0000\u0246\u0248\u0003\u0014\n\u0000\u0247\u0245\u0001\u0000\u0000"+
		"\u0000\u0248\u024b\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000"+
		"\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024c\u024e\u0005|\u0000\u0000"+
		"\u024d\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000"+
		"\u024e\u0013\u0001\u0000\u0000\u0000\u024f\u0250\u0003\u0016\u000b\u0000"+
		"\u0250\u0251\u0005\u0080\u0000\u0000\u0251\u0252\u0003\"\u0011\u0000\u0252"+
		"\u0015\u0001\u0000\u0000\u0000\u0253\u0257\u0005\u0088\u0000\u0000\u0254"+
		"\u0256\u0003\u0018\f\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256\u0259"+
		"\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0001\u0000\u0000\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0257"+
		"\u0001\u0000\u0000\u0000\u025a\u026c\u0005\u0089\u0000\u0000\u025b\u025f"+
		"\u0005\u0086\u0000\u0000\u025c\u025e\u0003\u0018\f\u0000\u025d\u025c\u0001"+
		"\u0000\u0000\u0000\u025e\u0261\u0001\u0000\u0000\u0000\u025f\u025d\u0001"+
		"\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0262\u0001"+
		"\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u026c\u0005"+
		"\u0087\u0000\u0000\u0263\u0267\u0005\u0084\u0000\u0000\u0264\u0266\u0003"+
		"\u0018\f\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000"+
		"\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000"+
		"\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000"+
		"\u0000\u0000\u026a\u026c\u0005\u0085\u0000\u0000\u026b\u0253\u0001\u0000"+
		"\u0000\u0000\u026b\u025b\u0001\u0000\u0000\u0000\u026b\u0263\u0001\u0000"+
		"\u0000\u0000\u026c\u0017\u0001\u0000\u0000\u0000\u026d\u026f\u0003\u001a"+
		"\r\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000"+
		"\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000"+
		"\u0000\u0271\u0289\u0001\u0000\u0000\u0000\u0272\u0289\u0003\u0016\u000b"+
		"\u0000\u0273\u0277\u0005\u0082\u0000\u0000\u0274\u0278\u0003\u019a\u00cd"+
		"\u0000\u0275\u0278\u0003\u019e\u00cf\u0000\u0276\u0278\u0005\u008a\u0000"+
		"\u0000\u0277\u0274\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000"+
		"\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000"+
		"\u0000\u0279\u027a\u0005}\u0000\u0000\u027a\u0289\u0003\u001c\u000e\u0000"+
		"\u027b\u027c\u0005\u0082\u0000\u0000\u027c\u027e\u0005\u0088\u0000\u0000"+
		"\u027d\u027f\u0003\u0018\f\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027f"+
		"\u0280\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280"+
		"\u0281\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282"+
		"\u0284\u0005\u0089\u0000\u0000\u0283\u0285\u0003\u001e\u000f\u0000\u0284"+
		"\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0003 \u0010\u0000\u0287\u0289"+
		"\u0001\u0000\u0000\u0000\u0288\u026e\u0001\u0000\u0000\u0000\u0288\u0272"+
		"\u0001\u0000\u0000\u0000\u0288\u0273\u0001\u0000\u0000\u0000\u0288\u027b"+
		"\u0001\u0000\u0000\u0000\u0289\u0019\u0001\u0000\u0000\u0000\u028a\u028f"+
		"\u0003\u01a0\u00d0\u0000\u028b\u028f\u0003\u01a2\u00d1\u0000\u028c\u028f"+
		"\u0003\u01a4\u00d2\u0000\u028d\u028f\u0003 \u0010\u0000\u028e\u028a\u0001"+
		"\u0000\u0000\u0000\u028e\u028b\u0001\u0000\u0000\u0000\u028e\u028c\u0001"+
		"\u0000\u0000\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028f\u001b\u0001"+
		"\u0000\u0000\u0000\u0290\u0291\u0003\u019a\u00cd\u0000\u0291\u001d\u0001"+
		"\u0000\u0000\u0000\u0292\u0297\u0003\u01a0\u00d0\u0000\u0293\u0297\u0003"+
		"\u01a2\u00d1\u0000\u0294\u0297\u0003\u01a4\u00d2\u0000\u0295\u0297\u0005"+
		"\u0082\u0000\u0000\u0296\u0292\u0001\u0000\u0000\u0000\u0296\u0293\u0001"+
		"\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0295\u0001"+
		"\u0000\u0000\u0000\u0297\u001f\u0001\u0000\u0000\u0000\u0298\u0299\u0007"+
		"\u0001\u0000\u0000\u0299!\u0001\u0000\u0000\u0000\u029a\u029b\u0003\u0004"+
		"\u0002\u0000\u029b#\u0001\u0000\u0000\u0000\u029c\u029e\u0003\u0094J\u0000"+
		"\u029d\u029c\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000"+
		"\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a4\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a5\u0003&\u0013\u0000\u02a3\u02a5\u0003(\u0014\u0000\u02a4\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5%\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a8\u0003\u0198\u00cc\u0000\u02a7\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02b6\u0001"+
		"\u0000\u0000\u0000\u02a9\u02b7\u0003*\u0015\u0000\u02aa\u02b7\u0003,\u0016"+
		"\u0000\u02ab\u02b7\u00032\u0019\u0000\u02ac\u02b7\u00036\u001b\u0000\u02ad"+
		"\u02b7\u0003J%\u0000\u02ae\u02b7\u0003L&\u0000\u02af\u02b7\u0003Z-\u0000"+
		"\u02b0\u02b7\u0003f3\u0000\u02b1\u02b7\u0003h4\u0000\u02b2\u02b7\u0003"+
		"j5\u0000\u02b3\u02b7\u0003l6\u0000\u02b4\u02b7\u0003n7\u0000\u02b5\u02b7"+
		"\u0003t:\u0000\u02b6\u02a9\u0001\u0000\u0000\u0000\u02b6\u02aa\u0001\u0000"+
		"\u0000\u0000\u02b6\u02ab\u0001\u0000\u0000\u0000\u02b6\u02ac\u0001\u0000"+
		"\u0000\u0000\u02b6\u02ad\u0001\u0000\u0000\u0000\u02b6\u02ae\u0001\u0000"+
		"\u0000\u0000\u02b6\u02af\u0001\u0000\u0000\u0000\u02b6\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b1\u0001\u0000\u0000\u0000\u02b6\u02b2\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b7\'\u0001\u0000\u0000"+
		"\u0000\u02b8\u02bc\u0003\n\u0005\u0000\u02b9\u02bc\u0003\f\u0006\u0000"+
		"\u02ba\u02bc\u0003\u000e\u0007\u0000\u02bb\u02b8\u0001\u0000\u0000\u0000"+
		"\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000"+
		"\u02bc)\u0001\u0000\u0000\u0000\u02bd\u02bf\u0005!\u0000\u0000\u02be\u02bd"+
		"\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005\u0012\u0000\u0000\u02c1\u02d1"+
		"\u0003\u019a\u00cd\u0000\u02c2\u02d2\u0005|\u0000\u0000\u02c3\u02c7\u0005"+
		"\u0084\u0000\u0000\u02c4\u02c6\u0003\u0092I\u0000\u02c5\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02cd\u0001\u0000"+
		"\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca\u02cc\u0003$\u0012"+
		"\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001\u0000\u0000"+
		"\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000"+
		"\u0000\u02ce\u02d0\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d2\u0005\u0085\u0000\u0000\u02d1\u02c2\u0001\u0000\u0000"+
		"\u0000\u02d1\u02c3\u0001\u0000\u0000\u0000\u02d2+\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d4\u0005\b\u0000\u0000\u02d4\u02d5\u0005\u0005\u0000\u0000\u02d5"+
		"\u02d7\u0003.\u0017\u0000\u02d6\u02d8\u00030\u0018\u0000\u02d7\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001"+
		"\u0000\u0000\u0000\u02d9\u02da\u0005|\u0000\u0000\u02da-\u0001\u0000\u0000"+
		"\u0000\u02db\u02de\u0003\u019a\u00cd\u0000\u02dc\u02de\u0005\u0018\u0000"+
		"\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02dc\u0001\u0000\u0000"+
		"\u0000\u02de/\u0001\u0000\u0000\u0000\u02df\u02e2\u0005\u0001\u0000\u0000"+
		"\u02e0\u02e3\u0003\u019a\u00cd\u0000\u02e1\u02e3\u0005v\u0000\u0000\u02e2"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3"+
		"1\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005#\u0000\u0000\u02e5\u02e6\u0003"+
		"4\u001a\u0000\u02e6\u02e7\u0005|\u0000\u0000\u02e73\u0001\u0000\u0000"+
		"\u0000\u02e8\u02ea\u0003\u0170\u00b8\u0000\u02e9\u02e8\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000"+
		"\u0000\u02eb\u02ed\u0005~\u0000\u0000\u02ec\u02e9\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02fe\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ff\u0005Z\u0000\u0000\u02ef\u02fb\u0005\u0084\u0000\u0000\u02f0"+
		"\u02f5\u00034\u001a\u0000\u02f1\u02f2\u0005{\u0000\u0000\u02f2\u02f4\u0003"+
		"4\u001a\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f8\u02fa\u0005{\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fb\u02f0\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02ff\u0005\u0085\u0000"+
		"\u0000\u02fe\u02ee\u0001\u0000\u0000\u0000\u02fe\u02ef\u0001\u0000\u0000"+
		"\u0000\u02ff\u0309\u0001\u0000\u0000\u0000\u0300\u0306\u0003\u0170\u00b8"+
		"\u0000\u0301\u0304\u0005\u0001\u0000\u0000\u0302\u0305\u0003\u019a\u00cd"+
		"\u0000\u0303\u0305\u0005v\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000"+
		"\u0304\u0303\u0001\u0000\u0000\u0000\u0305\u0307\u0001\u0000\u0000\u0000"+
		"\u0306\u0301\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000"+
		"\u0307\u0309\u0001\u0000\u0000\u0000\u0308\u02ec\u0001\u0000\u0000\u0000"+
		"\u0308\u0300\u0001\u0000\u0000\u0000\u03095\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u00038\u001c\u0000\u030b\u030c\u0005\n\u0000\u0000\u030c\u030e"+
		"\u0003\u019a\u00cd\u0000\u030d\u030f\u0003z=\u0000\u030e\u030d\u0001\u0000"+
		"\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000"+
		"\u0000\u0000\u0310\u0312\u0005\u0088\u0000\u0000\u0311\u0313\u0003<\u001e"+
		"\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0316\u0005\u0089\u0000"+
		"\u0000\u0315\u0317\u0003H$\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0316"+
		"\u0317\u0001\u0000\u0000\u0000\u0317\u0319\u0001\u0000\u0000\u0000\u0318"+
		"\u031a\u0003\u0086C\u0000\u0319\u0318\u0001\u0000\u0000\u0000\u0319\u031a"+
		"\u0001\u0000\u0000\u0000\u031a\u031d\u0001\u0000\u0000\u0000\u031b\u031e"+
		"\u0003\u00b0X\u0000\u031c\u031e\u0005|\u0000\u0000\u031d\u031b\u0001\u0000"+
		"\u0000\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031e7\u0001\u0000\u0000"+
		"\u0000\u031f\u0321\u0005;\u0000\u0000\u0320\u031f\u0001\u0000\u0000\u0000"+
		"\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0323\u0001\u0000\u0000\u0000"+
		"\u0322\u0324\u0005\u0003\u0000\u0000\u0323\u0322\u0001\u0000\u0000\u0000"+
		"\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0326\u0001\u0000\u0000\u0000"+
		"\u0325\u0327\u0005&\u0000\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0326"+
		"\u0327\u0001\u0000\u0000\u0000\u0327\u0329\u0001\u0000\u0000\u0000\u0328"+
		"\u032a\u0005>\u0000\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a"+
		"\u0001\u0000\u0000\u0000\u032a\u032c\u0001\u0000\u0000\u0000\u032b\u032d"+
		"\u0007\u0002\u0000\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032c\u032d"+
		"\u0001\u0000\u0000\u0000\u032d\u0332\u0001\u0000\u0000\u0000\u032e\u0330"+
		"\u0005\b\u0000\u0000\u032f\u0331\u0003:\u001d\u0000\u0330\u032f\u0001"+
		"\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0333\u0001"+
		"\u0000\u0000\u0000\u0332\u032e\u0001\u0000\u0000\u0000\u0332\u0333\u0001"+
		"\u0000\u0000\u0000\u03339\u0001\u0000\u0000\u0000\u0334\u0335\u0007\u0003"+
		"\u0000\u0000\u0335;\u0001\u0000\u0000\u0000\u0336\u0338\u0003>\u001f\u0000"+
		"\u0337\u0339\u0005{\u0000\u0000\u0338\u0337\u0001\u0000\u0000\u0000\u0338"+
		"\u0339\u0001\u0000\u0000\u0000\u0339\u034b\u0001\u0000\u0000\u0000\u033a"+
		"\u033b\u0003>\u001f\u0000\u033b\u033c\u0005{\u0000\u0000\u033c\u033e\u0001"+
		"\u0000\u0000\u0000\u033d\u033a\u0001\u0000\u0000\u0000\u033d\u033e\u0001"+
		"\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u0344\u0003"+
		"D\"\u0000\u0340\u0341\u0005{\u0000\u0000\u0341\u0343\u0003D\"\u0000\u0342"+
		"\u0340\u0001\u0000\u0000\u0000\u0343\u0346\u0001\u0000\u0000\u0000\u0344"+
		"\u0342\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345"+
		"\u0348\u0001\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000\u0000\u0347"+
		"\u0349\u0005{\u0000\u0000\u0348\u0347\u0001\u0000\u0000\u0000\u0348\u0349"+
		"\u0001\u0000\u0000\u0000\u0349\u034b\u0001\u0000\u0000\u0000\u034a\u0336"+
		"\u0001\u0000\u0000\u0000\u034a\u033d\u0001\u0000\u0000\u0000\u034b=\u0001"+
		"\u0000\u0000\u0000\u034c\u034e\u0003\u0094J\u0000\u034d\u034c\u0001\u0000"+
		"\u0000\u0000\u034e\u0351\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000"+
		"\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0354\u0001\u0000"+
		"\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0352\u0355\u0003@ \u0000"+
		"\u0353\u0355\u0003B!\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0354\u0353"+
		"\u0001\u0000\u0000\u0000\u0355?\u0001\u0000\u0000\u0000\u0356\u0358\u0005"+
		"`\u0000\u0000\u0357\u0359\u0003\u016e\u00b7\u0000\u0358\u0357\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u035b\u0001\u0000"+
		"\u0000\u0000\u035a\u0356\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000"+
		"\u0000\u0000\u035b\u035d\u0001\u0000\u0000\u0000\u035c\u035e\u0005\u0014"+
		"\u0000\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000"+
		"\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0360\u0005\u0018"+
		"\u0000\u0000\u0360A\u0001\u0000\u0000\u0000\u0361\u0363\u0005\u0014\u0000"+
		"\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000"+
		"\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0365\u0005\u0018\u0000"+
		"\u0000\u0365\u0366\u0005}\u0000\u0000\u0366\u0367\u0003\u0132\u0099\u0000"+
		"\u0367C\u0001\u0000\u0000\u0000\u0368\u036a\u0003\u0094J\u0000\u0369\u0368"+
		"\u0001\u0000\u0000\u0000\u036a\u036d\u0001\u0000\u0000\u0000\u036b\u0369"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u0371"+
		"\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036e\u0372"+
		"\u0003F#\u0000\u036f\u0372\u0005y\u0000\u0000\u0370\u0372\u0003\u0132"+
		"\u0099\u0000\u0371\u036e\u0001\u0000\u0000\u0000\u0371\u036f\u0001\u0000"+
		"\u0000\u0000\u0371\u0370\u0001\u0000\u0000\u0000\u0372E\u0001\u0000\u0000"+
		"\u0000\u0373\u0374\u0003\u0102\u0081\u0000\u0374\u0377\u0005}\u0000\u0000"+
		"\u0375\u0378\u0003\u0132\u0099\u0000\u0376\u0378\u0005y\u0000\u0000\u0377"+
		"\u0375\u0001\u0000\u0000\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0378"+
		"G\u0001\u0000\u0000\u0000\u0379\u037a\u0005\u007f\u0000\u0000\u037a\u037b"+
		"\u0003\u0132\u0099\u0000\u037bI\u0001\u0000\u0000\u0000\u037c\u037e\u0005"+
		";\u0000\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000"+
		"\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0380\u0005 \u0000"+
		"\u0000\u0380\u0382\u0003\u019a\u00cd\u0000\u0381\u0383\u0003z=\u0000\u0382"+
		"\u0381\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383"+
		"\u0388\u0001\u0000\u0000\u0000\u0384\u0386\u0005}\u0000\u0000\u0385\u0387"+
		"\u0003\u015e\u00af\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0386\u0387"+
		"\u0001\u0000\u0000\u0000\u0387\u0389\u0001\u0000\u0000\u0000\u0388\u0384"+
		"\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u038b"+
		"\u0001\u0000\u0000\u0000\u038a\u038c\u0003\u0086C\u0000\u038b\u038a\u0001"+
		"\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u0392\u0001"+
		"\u0000\u0000\u0000\u038d\u038e\u0005n\u0000\u0000\u038e\u0390\u0003\u0132"+
		"\u0099\u0000\u038f\u0391\u0003\u0086C\u0000\u0390\u038f\u0001\u0000\u0000"+
		"\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0393\u0001\u0000\u0000"+
		"\u0000\u0392\u038d\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000"+
		"\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0005|\u0000\u0000"+
		"\u0395K\u0001\u0000\u0000\u0000\u0396\u0399\u0003N\'\u0000\u0397\u0399"+
		"\u0003P(\u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0397\u0001\u0000"+
		"\u0000\u0000\u0399M\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u001c\u0000"+
		"\u0000\u039b\u039d\u0003\u019a\u00cd\u0000\u039c\u039e\u0003z=\u0000\u039d"+
		"\u039c\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e"+
		"\u03a0\u0001\u0000\u0000\u0000\u039f\u03a1\u0003\u0086C\u0000\u03a0\u039f"+
		"\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a4\u0005\u0084\u0000\u0000\u03a3\u03a5"+
		"\u0003R)\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a9\u0005\u0085"+
		"\u0000\u0000\u03a7\u03a9\u0005|\u0000\u0000\u03a8\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a9O\u0001\u0000\u0000\u0000"+
		"\u03aa\u03ab\u0005\u001c\u0000\u0000\u03ab\u03ad\u0003\u019a\u00cd\u0000"+
		"\u03ac\u03ae\u0003z=\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ad\u03ae"+
		"\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000\u0000\u03af\u03b1"+
		"\u0005\u0088\u0000\u0000\u03b0\u03b2\u0003V+\u0000\u03b1\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b5\u0005\u0089\u0000\u0000\u03b4\u03b6\u0003\u0086"+
		"C\u0000\u03b5\u03b4\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8\u0005|\u0000\u0000"+
		"\u03b8Q\u0001\u0000\u0000\u0000\u03b9\u03be\u0003T*\u0000\u03ba\u03bb"+
		"\u0005{\u0000\u0000\u03bb\u03bd\u0003T*\u0000\u03bc\u03ba\u0001\u0000"+
		"\u0000\u0000\u03bd\u03c0\u0001\u0000\u0000\u0000\u03be\u03bc\u0001\u0000"+
		"\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c1\u03c3\u0005{\u0000"+
		"\u0000\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c3S\u0001\u0000\u0000\u0000\u03c4\u03c6\u0003\u0094J\u0000\u03c5"+
		"\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c9\u0001\u0000\u0000\u0000\u03c7"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8"+
		"\u03cb\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03ca"+
		"\u03cc\u0005!\u0000\u0000\u03cb\u03ca\u0001\u0000\u0000\u0000\u03cb\u03cc"+
		"\u0001\u0000\u0000\u0000\u03cc\u03ce\u0001\u0000\u0000\u0000\u03cd\u03cf"+
		"\u0003\u0198\u00cc\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce\u03cf"+
		"\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d1"+
		"\u0003\u019a\u00cd\u0000\u03d1\u03d2\u0005}\u0000\u0000\u03d2\u03d5\u0003"+
		"\u0132\u0099\u0000\u03d3\u03d4\u0005n\u0000\u0000\u03d4\u03d6\u0003\u00a0"+
		"P\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000"+
		"\u0000\u03d6U\u0001\u0000\u0000\u0000\u03d7\u03dc\u0003X,\u0000\u03d8"+
		"\u03d9\u0005{\u0000\u0000\u03d9\u03db\u0003X,\u0000\u03da\u03d8\u0001"+
		"\u0000\u0000\u0000\u03db\u03de\u0001\u0000\u0000\u0000\u03dc\u03da\u0001"+
		"\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000\u03dd\u03e0\u0001"+
		"\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03df\u03e1\u0005"+
		"{\u0000\u0000\u03e0\u03df\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000"+
		"\u0000\u0000\u03e1W\u0001\u0000\u0000\u0000\u03e2\u03e4\u0003\u0094J\u0000"+
		"\u03e3\u03e2\u0001\u0000\u0000\u0000\u03e4\u03e7\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e6\u03e9\u0001\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000"+
		"\u03e8\u03ea\u0003\u0198\u00cc\u0000\u03e9\u03e8\u0001\u0000\u0000\u0000"+
		"\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000"+
		"\u03eb\u03ec\u0003\u0132\u0099\u0000\u03ecY\u0001\u0000\u0000\u0000\u03ed"+
		"\u03ee\u0005\u0007\u0000\u0000\u03ee\u03f0\u0003\u019a\u00cd\u0000\u03ef"+
		"\u03f1\u0003z=\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f3\u0001\u0000\u0000\u0000\u03f2\u03f4\u0003"+
		"\u0086C\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f7\u0005\u0084"+
		"\u0000\u0000\u03f6\u03f8\u0003\\.\u0000\u03f7\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000"+
		"\u0000\u03f9\u03fa\u0005\u0085\u0000\u0000\u03fa[\u0001\u0000\u0000\u0000"+
		"\u03fb\u0400\u0003^/\u0000\u03fc\u03fd\u0005{\u0000\u0000\u03fd\u03ff"+
		"\u0003^/\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03ff\u0402\u0001\u0000"+
		"\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000"+
		"\u0000\u0000\u0401\u0404\u0001\u0000\u0000\u0000\u0402\u0400\u0001\u0000"+
		"\u0000\u0000\u0403\u0405\u0005{\u0000\u0000\u0404\u0403\u0001\u0000\u0000"+
		"\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405]\u0001\u0000\u0000\u0000"+
		"\u0406\u0408\u0003\u0094J\u0000\u0407\u0406\u0001\u0000\u0000\u0000\u0408"+
		"\u040b\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u0409"+
		"\u040a\u0001\u0000\u0000\u0000\u040a\u040d\u0001\u0000\u0000\u0000\u040b"+
		"\u0409\u0001\u0000\u0000\u0000\u040c\u040e\u0003\u0198\u00cc\u0000\u040d"+
		"\u040c\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e"+
		"\u040f\u0001\u0000\u0000\u0000\u040f\u0412\u0003\u019a\u00cd\u0000\u0410"+
		"\u0413\u0003`0\u0000\u0411\u0413\u0003b1\u0000\u0412\u0410\u0001\u0000"+
		"\u0000\u0000\u0412\u0411\u0001\u0000\u0000\u0000\u0412\u0413\u0001\u0000"+
		"\u0000\u0000\u0413\u0415\u0001\u0000\u0000\u0000\u0414\u0416\u0003d2\u0000"+
		"\u0415\u0414\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000"+
		"\u0416_\u0001\u0000\u0000\u0000\u0417\u0419\u0005\u0088\u0000\u0000\u0418"+
		"\u041a\u0003V+\u0000\u0419\u0418\u0001\u0000\u0000\u0000\u0419\u041a\u0001"+
		"\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041c\u0005"+
		"\u0089\u0000\u0000\u041ca\u0001\u0000\u0000\u0000\u041d\u041f\u0005\u0084"+
		"\u0000\u0000\u041e\u0420\u0003R)\u0000\u041f\u041e\u0001\u0000\u0000\u0000"+
		"\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000\u0000"+
		"\u0421\u0422\u0005\u0085\u0000\u0000\u0422c\u0001\u0000\u0000\u0000\u0423"+
		"\u0424\u0005n\u0000\u0000\u0424\u0425\u0003\u00a0P\u0000\u0425e\u0001"+
		"\u0000\u0000\u0000\u0426\u0427\u00058\u0000\u0000\u0427\u0428\u00043\u0000"+
		"\u0000\u0428\u042a\u0003\u019a\u00cd\u0000\u0429\u042b\u0003z=\u0000\u042a"+
		"\u0429\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b"+
		"\u042d\u0001\u0000\u0000\u0000\u042c\u042e\u0003\u0086C\u0000\u042d\u042c"+
		"\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u042f"+
		"\u0001\u0000\u0000\u0000\u042f\u0431\u0005\u0084\u0000\u0000\u0430\u0432"+
		"\u0003R)\u0000\u0431\u0430\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000"+
		"\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0434\u0005\u0085"+
		"\u0000\u0000\u0434g\u0001\u0000\u0000\u0000\u0435\u0437\u0005;\u0000\u0000"+
		"\u0436\u0435\u0001\u0000\u0000\u0000\u0436\u0437\u0001\u0000\u0000\u0000"+
		"\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u043b\u0005\u0003\u0000\u0000"+
		"\u0439\u043c\u0003\u019a\u00cd\u0000\u043a\u043c\u0005v\u0000\u0000\u043b"+
		"\u0439\u0001\u0000\u0000\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043c"+
		"\u043e\u0001\u0000\u0000\u0000\u043d\u043f\u0003z=\u0000\u043e\u043d\u0001"+
		"\u0000\u0000\u0000\u043e\u043f\u0001\u0000\u0000\u0000\u043f\u0440\u0001"+
		"\u0000\u0000\u0000\u0440\u0441\u0005}\u0000\u0000\u0441\u0444\u0003\u0132"+
		"\u0099\u0000\u0442\u0443\u0005n\u0000\u0000\u0443\u0445\u0003\u00a0P\u0000"+
		"\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000"+
		"\u0445\u0447\u0001\u0000\u0000\u0000\u0446\u0448\u0003\u0086C\u0000\u0447"+
		"\u0446\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000\u0000\u0448"+
		"\u0449\u0001\u0000\u0000\u0000\u0449\u044a\u0005|\u0000\u0000\u044ai\u0001"+
		"\u0000\u0000\u0000\u044b\u044d\u0007\u0002\u0000\u0000\u044c\u044b\u0001"+
		"\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044e\u0001"+
		"\u0000\u0000\u0000\u044e\u0450\u0005\u001b\u0000\u0000\u044f\u0451\u0005"+
		"\u0014\u0000\u0000\u0450\u044f\u0001\u0000\u0000\u0000\u0450\u0451\u0001"+
		"\u0000\u0000\u0000\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0453\u0003"+
		"\u019a\u00cd\u0000\u0453\u0454\u0005}\u0000\u0000\u0454\u0457\u0003\u0132"+
		"\u0099\u0000\u0455\u0456\u0005n\u0000\u0000\u0456\u0458\u0003\u00a0P\u0000"+
		"\u0457\u0455\u0001\u0000\u0000\u0000\u0457\u0458\u0001\u0000\u0000\u0000"+
		"\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u045a\u0005|\u0000\u0000\u045a"+
		"k\u0001\u0000\u0000\u0000\u045b\u045d\u0005!\u0000\u0000\u045c\u045b\u0001"+
		"\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u045f\u0001"+
		"\u0000\u0000\u0000\u045e\u0460\u0005)\u0000\u0000\u045f\u045e\u0001\u0000"+
		"\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000"+
		"\u0000\u0000\u0461\u0462\u0005\u001e\u0000\u0000\u0462\u0464\u0003\u019a"+
		"\u00cd\u0000\u0463\u0465\u0003z=\u0000\u0464\u0463\u0001\u0000\u0000\u0000"+
		"\u0464\u0465\u0001\u0000\u0000\u0000\u0465\u046a\u0001\u0000\u0000\u0000"+
		"\u0466\u0468\u0005}\u0000\u0000\u0467\u0469\u0003\u015e\u00af\u0000\u0468"+
		"\u0467\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469"+
		"\u046b\u0001\u0000\u0000\u0000\u046a\u0466\u0001\u0000\u0000\u0000\u046a"+
		"\u046b\u0001\u0000\u0000\u0000\u046b\u046d\u0001\u0000\u0000\u0000\u046c"+
		"\u046e\u0003\u0086C\u0000\u046d\u046c\u0001\u0000\u0000\u0000\u046d\u046e"+
		"\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0473"+
		"\u0005\u0084\u0000\u0000\u0470\u0472\u0003\u0092I\u0000\u0471\u0470\u0001"+
		"\u0000\u0000\u0000\u0472\u0475\u0001\u0000\u0000\u0000\u0473\u0471\u0001"+
		"\u0000\u0000\u0000\u0473\u0474\u0001\u0000\u0000\u0000\u0474\u0479\u0001"+
		"\u0000\u0000\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0476\u0478\u0003"+
		"\u0090H\u0000\u0477\u0476\u0001\u0000\u0000\u0000\u0478\u047b\u0001\u0000"+
		"\u0000\u0000\u0479\u0477\u0001\u0000\u0000\u0000\u0479\u047a\u0001\u0000"+
		"\u0000\u0000\u047a\u047c\u0001\u0000\u0000\u0000\u047b\u0479\u0001\u0000"+
		"\u0000\u0000\u047c\u047d\u0005\u0085\u0000\u0000\u047d\u0499\u0001\u0000"+
		"\u0000\u0000\u047e\u0480\u0005!\u0000\u0000\u047f\u047e\u0001\u0000\u0000"+
		"\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u0482\u0001\u0000\u0000"+
		"\u0000\u0481\u0483\u0005)\u0000\u0000\u0482\u0481\u0001\u0000\u0000\u0000"+
		"\u0482\u0483\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000"+
		"\u0484\u0485\u0005\u001e\u0000\u0000\u0485\u0487\u0003\u019a\u00cd\u0000"+
		"\u0486\u0488\u0003z=\u0000\u0487\u0486\u0001\u0000\u0000\u0000\u0487\u0488"+
		"\u0001\u0000\u0000\u0000\u0488\u048d\u0001\u0000\u0000\u0000\u0489\u048b"+
		"\u0005}\u0000\u0000\u048a\u048c\u0003\u015e\u00af\u0000\u048b\u048a\u0001"+
		"\u0000\u0000\u0000\u048b\u048c\u0001\u0000\u0000\u0000\u048c\u048e\u0001"+
		"\u0000\u0000\u0000\u048d\u0489\u0001\u0000\u0000\u0000\u048d\u048e\u0001"+
		"\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000\u0000\u048f\u0491\u0005"+
		"n\u0000\u0000\u0490\u0492\u0003\u015e\u00af\u0000\u0491\u0490\u0001\u0000"+
		"\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000\u0492\u0494\u0001\u0000"+
		"\u0000\u0000\u0493\u0495\u0003\u0086C\u0000\u0494\u0493\u0001\u0000\u0000"+
		"\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495\u0496\u0001\u0000\u0000"+
		"\u0000\u0496\u0497\u0005|\u0000\u0000\u0497\u0499\u0001\u0000\u0000\u0000"+
		"\u0498\u045c\u0001\u0000\u0000\u0000\u0498\u047f\u0001\u0000\u0000\u0000"+
		"\u0499m\u0001\u0000\u0000\u0000\u049a\u049d\u0003p8\u0000\u049b\u049d"+
		"\u0003r9\u0000\u049c\u049a\u0001\u0000\u0000\u0000\u049c\u049b\u0001\u0000"+
		"\u0000\u0000\u049do\u0001\u0000\u0000\u0000\u049e\u049f\u0005;\u0000\u0000"+
		"\u049f\u04a5\u0005!\u0000\u0000\u04a0\u04a1\u0005!\u0000\u0000\u04a1\u04a5"+
		"\u0005;\u0000\u0000\u04a2\u04a5\u0005;\u0000\u0000\u04a3\u04a5\u0005!"+
		"\u0000\u0000\u04a4\u049e\u0001\u0000\u0000\u0000\u04a4\u04a0\u0001\u0000"+
		"\u0000\u0000\u04a4\u04a2\u0001\u0000\u0000\u0000\u04a4\u04a3\u0001\u0000"+
		"\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000\u04a5\u04a6\u0001\u0000"+
		"\u0000\u0000\u04a6\u04a8\u0005\r\u0000\u0000\u04a7\u04a9\u0003z=\u0000"+
		"\u04a8\u04a7\u0001\u0000\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000\u0000"+
		"\u04a9\u04ab\u0001\u0000\u0000\u0000\u04aa\u04ac\u0005^\u0000\u0000\u04ab"+
		"\u04aa\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac"+
		"\u04ad\u0001\u0000\u0000\u0000\u04ad\u04af\u0003\u0132\u0099\u0000\u04ae"+
		"\u04b0\u0003\u0086C\u0000\u04af\u04ae\u0001\u0000\u0000\u0000\u04af\u04b0"+
		"\u0001\u0000\u0000\u0000\u04b0\u04b1\u0001\u0000\u0000\u0000\u04b1\u04b5"+
		"\u0005\u0084\u0000\u0000\u04b2\u04b4\u0003\u0092I\u0000\u04b3\u04b2\u0001"+
		"\u0000\u0000\u0000\u04b4\u04b7\u0001\u0000\u0000\u0000\u04b5\u04b3\u0001"+
		"\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6\u04bb\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b5\u0001\u0000\u0000\u0000\u04b8\u04ba\u0003"+
		"\u0090H\u0000\u04b9\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bd\u0001\u0000"+
		"\u0000\u0000\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000"+
		"\u0000\u0000\u04bc\u04be\u0001\u0000\u0000\u0000\u04bd\u04bb\u0001\u0000"+
		"\u0000\u0000\u04be\u04bf\u0005\u0085\u0000\u0000\u04bfq\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c1\u0005;\u0000\u0000\u04c1\u04c7\u0005!\u0000\u0000\u04c2"+
		"\u04c3\u0005!\u0000\u0000\u04c3\u04c7\u0005;\u0000\u0000\u04c4\u04c7\u0005"+
		";\u0000\u0000\u04c5\u04c7\u0005!\u0000\u0000\u04c6\u04c0\u0001\u0000\u0000"+
		"\u0000\u04c6\u04c2\u0001\u0000\u0000\u0000\u04c6\u04c4\u0001\u0000\u0000"+
		"\u0000\u04c6\u04c5\u0001\u0000\u0000\u0000\u04c6\u04c7\u0001\u0000\u0000"+
		"\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u04ca\u0005\r\u0000\u0000"+
		"\u04c9\u04cb\u0003z=\u0000\u04ca\u04c9\u0001\u0000\u0000\u0000\u04ca\u04cb"+
		"\u0001\u0000\u0000\u0000\u04cb\u04cd\u0001\u0000\u0000\u0000\u04cc\u04ce"+
		"\u0005\u0003\u0000\u0000\u04cd\u04cc\u0001\u0000\u0000\u0000\u04cd\u04ce"+
		"\u0001\u0000\u0000\u0000\u04ce\u04d0\u0001\u0000\u0000\u0000\u04cf\u04d1"+
		"\u0005^\u0000\u0000\u04d0\u04cf\u0001\u0000\u0000\u0000\u04d0\u04d1\u0001"+
		"\u0000\u0000\u0000\u04d1\u04d2\u0001\u0000\u0000\u0000\u04d2\u04d3\u0003"+
		"\u0190\u00c8\u0000\u04d3\u04d4\u0005\u000b\u0000\u0000\u04d4\u04d6\u0003"+
		"\u0132\u0099\u0000\u04d5\u04d7\u0003\u0086C\u0000\u04d6\u04d5\u0001\u0000"+
		"\u0000\u0000\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u04d8\u0001\u0000"+
		"\u0000\u0000\u04d8\u04dc\u0005\u0084\u0000\u0000\u04d9\u04db\u0003\u0092"+
		"I\u0000\u04da\u04d9\u0001\u0000\u0000\u0000\u04db\u04de\u0001\u0000\u0000"+
		"\u0000\u04dc\u04da\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001\u0000\u0000"+
		"\u0000\u04dd\u04e2\u0001\u0000\u0000\u0000\u04de\u04dc\u0001\u0000\u0000"+
		"\u0000\u04df\u04e1\u0003\u0090H\u0000\u04e0\u04df\u0001\u0000\u0000\u0000"+
		"\u04e1\u04e4\u0001\u0000\u0000\u0000\u04e2\u04e0\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04e5\u0001\u0000\u0000\u0000"+
		"\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e5\u04e6\u0005\u0085\u0000\u0000"+
		"\u04e6s\u0001\u0000\u0000\u0000\u04e7\u04e9\u0005!\u0000\u0000\u04e8\u04e7"+
		"\u0001\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000\u04e9\u04ea"+
		"\u0001\u0000\u0000\u0000\u04ea\u04ec\u0005\b\u0000\u0000\u04eb\u04ed\u0003"+
		":\u001d\u0000\u04ec\u04eb\u0001\u0000\u0000\u0000\u04ec\u04ed\u0001\u0000"+
		"\u0000\u0000\u04ed\u04ee\u0001\u0000\u0000\u0000\u04ee\u04f2\u0005\u0084"+
		"\u0000\u0000\u04ef\u04f1\u0003\u0092I\u0000\u04f0\u04ef\u0001\u0000\u0000"+
		"\u0000\u04f1\u04f4\u0001\u0000\u0000\u0000\u04f2\u04f0\u0001\u0000\u0000"+
		"\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u04f8\u0001\u0000\u0000"+
		"\u0000\u04f4\u04f2\u0001\u0000\u0000\u0000\u04f5\u04f7\u0003v;\u0000\u04f6"+
		"\u04f5\u0001\u0000\u0000\u0000\u04f7\u04fa\u0001\u0000\u0000\u0000\u04f8"+
		"\u04f6\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9"+
		"\u04fb\u0001\u0000\u0000\u0000\u04fa\u04f8\u0001\u0000\u0000\u0000\u04fb"+
		"\u04fc\u0005\u0085\u0000\u0000\u04fcu\u0001\u0000\u0000\u0000\u04fd\u04ff"+
		"\u0003\u0094J\u0000\u04fe\u04fd\u0001\u0000\u0000\u0000\u04ff\u0502\u0001"+
		"\u0000\u0000\u0000\u0500\u04fe\u0001\u0000\u0000\u0000\u0500\u0501\u0001"+
		"\u0000\u0000\u0000\u0501\u050c\u0001\u0000\u0000\u0000\u0502\u0500\u0001"+
		"\u0000\u0000\u0000\u0503\u050d\u0003\n\u0005\u0000\u0504\u0506\u0003\u0198"+
		"\u00cc\u0000\u0505\u0504\u0001\u0000\u0000\u0000\u0505\u0506\u0001\u0000"+
		"\u0000\u0000\u0506\u050a\u0001\u0000\u0000\u0000\u0507\u050b\u0003j5\u0000"+
		"\u0508\u050b\u00036\u001b\u0000\u0509\u050b\u0003x<\u0000\u050a\u0507"+
		"\u0001\u0000\u0000\u0000\u050a\u0508\u0001\u0000\u0000\u0000\u050a\u0509"+
		"\u0001\u0000\u0000\u0000\u050b\u050d\u0001\u0000\u0000\u0000\u050c\u0503"+
		"\u0001\u0000\u0000\u0000\u050c\u0505\u0001\u0000\u0000\u0000\u050dw\u0001"+
		"\u0000\u0000\u0000\u050e\u050f\u0005 \u0000\u0000\u050f\u0510\u0003\u019a"+
		"\u00cd\u0000\u0510\u0511\u0005|\u0000\u0000\u0511y\u0001\u0000\u0000\u0000"+
		"\u0512\u051f\u0005r\u0000\u0000\u0513\u0514\u0003|>\u0000\u0514\u0515"+
		"\u0005{\u0000\u0000\u0515\u0517\u0001\u0000\u0000\u0000\u0516\u0513\u0001"+
		"\u0000\u0000\u0000\u0517\u051a\u0001\u0000\u0000\u0000\u0518\u0516\u0001"+
		"\u0000\u0000\u0000\u0518\u0519\u0001\u0000\u0000\u0000\u0519\u051b\u0001"+
		"\u0000\u0000\u0000\u051a\u0518\u0001\u0000\u0000\u0000\u051b\u051d\u0003"+
		"|>\u0000\u051c\u051e\u0005{\u0000\u0000\u051d\u051c\u0001\u0000\u0000"+
		"\u0000\u051d\u051e\u0001\u0000\u0000\u0000\u051e\u0520\u0001\u0000\u0000"+
		"\u0000\u051f\u0518\u0001\u0000\u0000\u0000\u051f\u0520\u0001\u0000\u0000"+
		"\u0000\u0520\u0521\u0001\u0000\u0000\u0000\u0521\u0522\u0005q\u0000\u0000"+
		"\u0522{\u0001\u0000\u0000\u0000\u0523\u0525\u0003\u0094J\u0000\u0524\u0523"+
		"\u0001\u0000\u0000\u0000\u0525\u0528\u0001\u0000\u0000\u0000\u0526\u0524"+
		"\u0001\u0000\u0000\u0000\u0526\u0527\u0001\u0000\u0000\u0000\u0527\u052c"+
		"\u0001\u0000\u0000\u0000\u0528\u0526\u0001\u0000\u0000\u0000\u0529\u052d"+
		"\u0003~?\u0000\u052a\u052d\u0003\u0080@\u0000\u052b\u052d\u0003\u0082"+
		"A\u0000\u052c\u0529\u0001\u0000\u0000\u0000\u052c\u052a\u0001\u0000\u0000"+
		"\u0000\u052c\u052b\u0001\u0000\u0000\u0000\u052d}\u0001\u0000\u0000\u0000"+
		"\u052e\u0530\u0003\u0094J\u0000\u052f\u052e\u0001\u0000\u0000\u0000\u052f"+
		"\u0530\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000\u0000\u0000\u0531"+
		"\u0534\u0005W\u0000\u0000\u0532\u0533\u0005}\u0000\u0000\u0533\u0535\u0003"+
		"\u016c\u00b6\u0000\u0534\u0532\u0001\u0000\u0000\u0000\u0534\u0535\u0001"+
		"\u0000\u0000\u0000\u0535\u007f\u0001\u0000\u0000\u0000\u0536\u0538\u0003"+
		"\u0094J\u0000\u0537\u0536\u0001\u0000\u0000\u0000\u0537\u0538\u0001\u0000"+
		"\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539\u053e\u0003\u019a"+
		"\u00cd\u0000\u053a\u053c\u0005}\u0000\u0000\u053b\u053d\u0003\u015e\u00af"+
		"\u0000\u053c\u053b\u0001\u0000\u0000\u0000\u053c\u053d\u0001\u0000\u0000"+
		"\u0000\u053d\u053f\u0001\u0000\u0000\u0000\u053e\u053a\u0001\u0000\u0000"+
		"\u0000\u053e\u053f\u0001\u0000\u0000\u0000\u053f\u0542\u0001\u0000\u0000"+
		"\u0000\u0540\u0541\u0005n\u0000\u0000\u0541\u0543\u0003\u0132\u0099\u0000"+
		"\u0542\u0540\u0001\u0000\u0000\u0000\u0542\u0543\u0001\u0000\u0000\u0000"+
		"\u0543\u0081\u0001\u0000\u0000\u0000\u0544\u0545\u0005\u0003\u0000\u0000"+
		"\u0545\u0546\u0003\u019a\u00cd\u0000\u0546\u0547\u0005}\u0000\u0000\u0547"+
		"\u054a\u0003\u0132\u0099\u0000\u0548\u0549\u0005n\u0000\u0000\u0549\u054b"+
		"\u0003\u0084B\u0000\u054a\u0548\u0001\u0000\u0000\u0000\u054a\u054b\u0001"+
		"\u0000\u0000\u0000\u054b\u0083\u0001\u0000\u0000\u0000\u054c\u054d\u0003"+
		"\u00a0P\u0000\u054d\u0085\u0001\u0000\u0000\u0000\u054e\u0554\u0005$\u0000"+
		"\u0000\u054f\u0550\u0003\u0088D\u0000\u0550\u0551\u0005{\u0000\u0000\u0551"+
		"\u0553\u0001\u0000\u0000\u0000\u0552\u054f\u0001\u0000\u0000\u0000\u0553"+
		"\u0556\u0001\u0000\u0000\u0000\u0554\u0552\u0001\u0000\u0000\u0000\u0554"+
		"\u0555\u0001\u0000\u0000\u0000\u0555\u0557\u0001\u0000\u0000\u0000\u0556"+
		"\u0554\u0001\u0000\u0000\u0000\u0557\u0559\u0003\u0088D\u0000\u0558\u055a"+
		"\u0005{\u0000\u0000\u0559\u0558\u0001\u0000\u0000\u0000\u0559\u055a\u0001"+
		"\u0000\u0000\u0000\u055a\u0087\u0001\u0000\u0000\u0000\u055b\u055e\u0003"+
		"\u008aE\u0000\u055c\u055e\u0003\u008cF\u0000\u055d\u055b\u0001\u0000\u0000"+
		"\u0000\u055d\u055c\u0001\u0000\u0000\u0000\u055e\u0089\u0001\u0000\u0000"+
		"\u0000\u055f\u0560\u0003\u016e\u00b7\u0000\u0560\u0561\u0005}\u0000\u0000"+
		"\u0561\u0562\u0003\u016c\u00b6\u0000\u0562\u008b\u0001\u0000\u0000\u0000"+
		"\u0563\u0565\u0003\u008eG\u0000\u0564\u0563\u0001\u0000\u0000\u0000\u0564"+
		"\u0565\u0001\u0000\u0000\u0000\u0565\u0566\u0001\u0000\u0000\u0000\u0566"+
		"\u0567\u0003\u0132\u0099\u0000\u0567\u0569\u0005}\u0000\u0000\u0568\u056a"+
		"\u0003\u015e\u00af\u0000\u0569\u0568\u0001\u0000\u0000\u0000\u0569\u056a"+
		"\u0001\u0000\u0000\u0000\u056a\u008d\u0001\u0000\u0000\u0000\u056b\u056c"+
		"\u0005\u000b\u0000\u0000\u056c\u056d\u0003z=\u0000\u056d\u008f\u0001\u0000"+
		"\u0000\u0000\u056e\u0570\u0003\u0094J\u0000\u056f\u056e\u0001\u0000\u0000"+
		"\u0000\u0570\u0573\u0001\u0000\u0000\u0000\u0571\u056f\u0001\u0000\u0000"+
		"\u0000\u0571\u0572\u0001\u0000\u0000\u0000\u0572\u057d\u0001\u0000\u0000"+
		"\u0000\u0573\u0571\u0001\u0000\u0000\u0000\u0574\u057e\u0003\n\u0005\u0000"+
		"\u0575\u0577\u0003\u0198\u00cc\u0000\u0576\u0575\u0001\u0000\u0000\u0000"+
		"\u0576\u0577\u0001\u0000\u0000\u0000\u0577\u057b\u0001\u0000\u0000\u0000"+
		"\u0578\u057c\u0003J%\u0000\u0579\u057c\u0003h4\u0000\u057a\u057c\u0003"+
		"6\u001b\u0000\u057b\u0578\u0001\u0000\u0000\u0000\u057b\u0579\u0001\u0000"+
		"\u0000\u0000\u057b\u057a\u0001\u0000\u0000\u0000\u057c\u057e\u0001\u0000"+
		"\u0000\u0000\u057d\u0574\u0001\u0000\u0000\u0000\u057d\u0576\u0001\u0000"+
		"\u0000\u0000\u057e\u0091\u0001\u0000\u0000\u0000\u057f\u0580\u0005\u0081"+
		"\u0000\u0000\u0580\u0581\u0005^\u0000\u0000\u0581\u0582\u0005\u0086\u0000"+
		"\u0000\u0582\u0583\u0003\u0096K\u0000\u0583\u0584\u0005\u0087\u0000\u0000"+
		"\u0584\u0093\u0001\u0000\u0000\u0000\u0585\u0586\u0005\u0081\u0000\u0000"+
		"\u0586\u0587\u0005\u0086\u0000\u0000\u0587\u0588\u0003\u0096K\u0000\u0588"+
		"\u0589\u0005\u0087\u0000\u0000\u0589\u0095\u0001\u0000\u0000\u0000\u058a"+
		"\u058c\u0003\u0170\u00b8\u0000\u058b\u058d\u0003\u0098L\u0000\u058c\u058b"+
		"\u0001\u0000\u0000\u0000\u058c\u058d\u0001\u0000\u0000\u0000\u058d\u0597"+
		"\u0001\u0000\u0000\u0000\u058e\u058f\u0005!\u0000\u0000\u058f\u0590\u0005"+
		"\u0088\u0000\u0000\u0590\u0592\u0003\u0170\u00b8\u0000\u0591\u0593\u0003"+
		"\u0098L\u0000\u0592\u0591\u0001\u0000\u0000\u0000\u0592\u0593\u0001\u0000"+
		"\u0000\u0000\u0593\u0594\u0001\u0000\u0000\u0000\u0594\u0595\u0005\u0089"+
		"\u0000\u0000\u0595\u0597\u0001\u0000\u0000\u0000\u0596\u058a\u0001\u0000"+
		"\u0000\u0000\u0596\u058e\u0001\u0000\u0000\u0000\u0597\u0097\u0001\u0000"+
		"\u0000\u0000\u0598\u059c\u0003\u0004\u0002\u0000\u0599\u059a\u0005n\u0000"+
		"\u0000\u059a\u059c\u0003\u00a0P\u0000\u059b\u0598\u0001\u0000\u0000\u0000"+
		"\u059b\u0599\u0001\u0000\u0000\u0000\u059c\u0099\u0001\u0000\u0000\u0000"+
		"\u059d\u05a3\u0005|\u0000\u0000\u059e\u05a3\u0003\u009cN\u0000\u059f\u05a3"+
		"\u0003\u009eO\u0000\u05a0\u05a3\u0003\n\u0005\u0000\u05a1\u05a3\u0003"+
		"$\u0012\u0000\u05a2\u059d\u0001\u0000\u0000\u0000\u05a2\u059e\u0001\u0000"+
		"\u0000\u0000\u05a2\u059f\u0001\u0000\u0000\u0000\u05a2\u05a0\u0001\u0000"+
		"\u0000\u0000\u05a2\u05a1\u0001\u0000\u0000\u0000\u05a3\u009b\u0001\u0000"+
		"\u0000\u0000\u05a4\u05a6\u0003\u0094J\u0000\u05a5\u05a4\u0001\u0000\u0000"+
		"\u0000\u05a6\u05a9\u0001\u0000\u0000\u0000\u05a7\u05a5\u0001\u0000\u0000"+
		"\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u05aa\u0001\u0000\u0000"+
		"\u0000\u05a9\u05a7\u0001\u0000\u0000\u0000\u05aa\u05ab\u0005\u000f\u0000"+
		"\u0000\u05ab\u05ae\u0003\u0104\u0082\u0000\u05ac\u05ad\u0005}\u0000\u0000"+
		"\u05ad\u05af\u0003\u0132\u0099\u0000\u05ae\u05ac\u0001\u0000\u0000\u0000"+
		"\u05ae\u05af\u0001\u0000\u0000\u0000\u05af\u05b6\u0001\u0000\u0000\u0000"+
		"\u05b0\u05b1\u0005n\u0000\u0000\u05b1\u05b4\u0003\u00a0P\u0000\u05b2\u05b3"+
		"\u0005\u0006\u0000\u0000\u05b3\u05b5\u0003\u00b0X\u0000\u05b4\u05b2\u0001"+
		"\u0000\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000\u0000\u05b5\u05b7\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b0\u0001\u0000\u0000\u0000\u05b6\u05b7\u0001"+
		"\u0000\u0000\u0000\u05b7\u05b8\u0001\u0000\u0000\u0000\u05b8\u05b9\u0005"+
		"|\u0000\u0000\u05b9\u009d\u0001\u0000\u0000\u0000\u05ba\u05bb\u0003\u00a0"+
		"P\u0000\u05bb\u05bc\u0005|\u0000\u0000\u05bc\u05c2\u0001\u0000\u0000\u0000"+
		"\u05bd\u05bf\u0003\u00a6S\u0000\u05be\u05c0\u0005|\u0000\u0000\u05bf\u05be"+
		"\u0001\u0000\u0000\u0000\u05bf\u05c0\u0001\u0000\u0000\u0000\u05c0\u05c2"+
		"\u0001\u0000\u0000\u0000\u05c1\u05ba\u0001\u0000\u0000\u0000\u05c1\u05bd"+
		"\u0001\u0000\u0000\u0000\u05c2\u009f\u0001\u0000\u0000\u0000\u05c3\u05c5"+
		"\u0006P\uffff\uffff\u0000\u05c4\u05c6\u0003\u0094J\u0000\u05c5\u05c4\u0001"+
		"\u0000\u0000\u0000\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u05c5\u0001"+
		"\u0000\u0000\u0000\u05c7\u05c8\u0001\u0000\u0000\u0000\u05c8\u05c9\u0001"+
		"\u0000\u0000\u0000\u05c9\u05ca\u0003\u00a0P1\u05ca\u062b\u0001\u0000\u0000"+
		"\u0000\u05cb\u062b\u0003\u00acV\u0000\u05cc\u062b\u0003\u00aeW\u0000\u05cd"+
		"\u05cf\u0007\u0004\u0000\u0000\u05ce\u05d0\u0005\u0014\u0000\u0000\u05cf"+
		"\u05ce\u0001\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000\u0000\u0000\u05d0"+
		"\u05d1\u0001\u0000\u0000\u0000\u05d1\u062b\u0003\u00a0P&\u05d2\u05d3\u0005"+
		"`\u0000\u0000\u05d3\u05d4\u0005:\u0000\u0000\u05d4\u05d5\u0007\u0005\u0000"+
		"\u0000\u05d5\u062b\u0003\u00a0P%\u05d6\u05d7\u0005Z\u0000\u0000\u05d7"+
		"\u062b\u0003\u00a0P$\u05d8\u05d9\u0007\u0006\u0000\u0000\u05d9\u062b\u0003"+
		"\u00a0P#\u05da\u05dc\u0005x\u0000\u0000\u05db\u05dd\u0003\u00a0P\u0000"+
		"\u05dc\u05db\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001\u0000\u0000\u0000"+
		"\u05dd\u062b\u0001\u0000\u0000\u0000\u05de\u05df\u0005z\u0000\u0000\u05df"+
		"\u062b\u0003\u00a0P\u0015\u05e0\u05e1\u0003\u0104\u0082\u0000\u05e1\u05e2"+
		"\u0005n\u0000\u0000\u05e2\u05e3\u0003\u00a0P\u0012\u05e3\u062b\u0001\u0000"+
		"\u0000\u0000\u05e4\u05e5\u0005v\u0000\u0000\u05e5\u05e6\u0005n\u0000\u0000"+
		"\u05e6\u062b\u0003\u00a0P\u0011\u05e7\u05e9\u0005\u0004\u0000\u0000\u05e8"+
		"\u05ea\u0005W\u0000\u0000\u05e9\u05e8\u0001\u0000\u0000\u0000\u05e9\u05ea"+
		"\u0001\u0000\u0000\u0000\u05ea\u05ec\u0001\u0000\u0000\u0000\u05eb\u05ed"+
		"\u0003\u00a0P\u0000\u05ec\u05eb\u0001\u0000\u0000\u0000\u05ec\u05ed\u0001"+
		"\u0000\u0000\u0000\u05ed\u062b\u0001\u0000\u0000\u0000\u05ee\u05f0\u0005"+
		"\u0002\u0000\u0000\u05ef\u05f1\u0005W\u0000\u0000\u05f0\u05ef\u0001\u0000"+
		"\u0000\u0000\u05f0\u05f1\u0001\u0000\u0000\u0000\u05f1\u05f3\u0001\u0000"+
		"\u0000\u0000\u05f2\u05f4\u0003\u00a0P\u0000\u05f3\u05f2\u0001\u0000\u0000"+
		"\u0000\u05f3\u05f4\u0001\u0000\u0000\u0000\u05f4\u062b\u0001\u0000\u0000"+
		"\u0000\u05f5\u05f7\u0005\u0017\u0000\u0000\u05f6\u05f8\u0003\u00a0P\u0000"+
		"\u05f7\u05f6\u0001\u0000\u0000\u0000\u05f7\u05f8\u0001\u0000\u0000\u0000"+
		"\u05f8\u062b\u0001\u0000\u0000\u0000\u05f9\u05fa\u0005+\u0000\u0000\u05fa"+
		"\u062b\u0003\u00a0P\f\u05fb\u05fc\u0005-\u0000\u0000\u05fc\u05fe\u0005"+
		".\u0000\u0000\u05fd\u05ff\u0003\u00a0P\u0000\u05fe\u05fd\u0001\u0000\u0000"+
		"\u0000\u05fe\u05ff\u0001\u0000\u0000\u0000\u05ff\u062b\u0001\u0000\u0000"+
		"\u0000\u0600\u0602\u00056\u0000\u0000\u0601\u0603\u0003\u00a0P\u0000\u0602"+
		"\u0601\u0001\u0000\u0000\u0000\u0602\u0603\u0001\u0000\u0000\u0000\u0603"+
		"\u062b\u0001\u0000\u0000\u0000\u0604\u0608\u0005\u0088\u0000\u0000\u0605"+
		"\u0607\u0003\u0092I\u0000\u0606\u0605\u0001\u0000\u0000\u0000\u0607\u060a"+
		"\u0001\u0000\u0000\u0000\u0608\u0606\u0001\u0000\u0000\u0000\u0608\u0609"+
		"\u0001\u0000\u0000\u0000\u0609\u060b\u0001\u0000\u0000\u0000\u060a\u0608"+
		"\u0001\u0000\u0000\u0000\u060b\u060c\u0003\u00a0P\u0000\u060c\u060d\u0005"+
		"\u0089\u0000\u0000\u060d\u062b\u0001\u0000\u0000\u0000\u060e\u0612\u0005"+
		"\u0086\u0000\u0000\u060f\u0611\u0003\u0092I\u0000\u0610\u060f\u0001\u0000"+
		"\u0000\u0000\u0611\u0614\u0001\u0000\u0000\u0000\u0612\u0610\u0001\u0000"+
		"\u0000\u0000\u0612\u0613\u0001\u0000\u0000\u0000\u0613\u0616\u0001\u0000"+
		"\u0000\u0000\u0614\u0612\u0001\u0000\u0000\u0000\u0615\u0617\u0003\u00bc"+
		"^\u0000\u0616\u0615\u0001\u0000\u0000\u0000\u0616\u0617\u0001\u0000\u0000"+
		"\u0000\u0617\u0618\u0001\u0000\u0000\u0000\u0618\u062b\u0005\u0087\u0000"+
		"\u0000\u0619\u061d\u0005\u0088\u0000\u0000\u061a\u061c\u0003\u0092I\u0000"+
		"\u061b\u061a\u0001\u0000\u0000\u0000\u061c\u061f\u0001\u0000\u0000\u0000"+
		"\u061d\u061b\u0001\u0000\u0000\u0000\u061d\u061e\u0001\u0000\u0000\u0000"+
		"\u061e\u0621\u0001\u0000\u0000\u0000\u061f\u061d\u0001\u0000\u0000\u0000"+
		"\u0620\u0622\u0003\u00be_\u0000\u0621\u0620\u0001\u0000\u0000\u0000\u0621"+
		"\u0622\u0001\u0000\u0000\u0000\u0622\u0623\u0001\u0000\u0000\u0000\u0623"+
		"\u062b\u0005\u0089\u0000\u0000\u0624\u062b\u0003\u00c2a\u0000\u0625\u062b"+
		"\u0003\u00d0h\u0000\u0626\u062b\u0003\u00deo\u0000\u0627\u062b\u0003\u00a6"+
		"S\u0000\u0628\u062b\u0003\u00f6{\u0000\u0629\u062b\u0003\u0002\u0001\u0000"+
		"\u062a\u05c3\u0001\u0000\u0000\u0000\u062a\u05cb\u0001\u0000\u0000\u0000"+
		"\u062a\u05cc\u0001\u0000\u0000\u0000\u062a\u05cd\u0001\u0000\u0000\u0000"+
		"\u062a\u05d2\u0001\u0000\u0000\u0000\u062a\u05d6\u0001\u0000\u0000\u0000"+
		"\u062a\u05d8\u0001\u0000\u0000\u0000\u062a\u05da\u0001\u0000\u0000\u0000"+
		"\u062a\u05de\u0001\u0000\u0000\u0000\u062a\u05e0\u0001\u0000\u0000\u0000"+
		"\u062a\u05e4\u0001\u0000\u0000\u0000\u062a\u05e7\u0001\u0000\u0000\u0000"+
		"\u062a\u05ee\u0001\u0000\u0000\u0000\u062a\u05f5\u0001\u0000\u0000\u0000"+
		"\u062a\u05f9\u0001\u0000\u0000\u0000\u062a\u05fb\u0001\u0000\u0000\u0000"+
		"\u062a\u0600\u0001\u0000\u0000\u0000\u062a\u0604\u0001\u0000\u0000\u0000"+
		"\u062a\u060e\u0001\u0000\u0000\u0000\u062a\u0619\u0001\u0000\u0000\u0000"+
		"\u062a\u0624\u0001\u0000\u0000\u0000\u062a\u0625\u0001\u0000\u0000\u0000"+
		"\u062a\u0626\u0001\u0000\u0000\u0000\u062a\u0627\u0001\u0000\u0000\u0000"+
		"\u062a\u0628\u0001\u0000\u0000\u0000\u062a\u0629\u0001\u0000\u0000\u0000"+
		"\u062b\u0694\u0001\u0000\u0000\u0000\u062c\u062d\n!\u0000\u0000\u062d"+
		"\u062e\u0007\u0007\u0000\u0000\u062e\u0693\u0003\u00a0P\"\u062f\u0630"+
		"\n \u0000\u0000\u0630\u0631\u0007\b\u0000\u0000\u0631\u0693\u0003\u00a0"+
		"P!\u0632\u0635\n\u001f\u0000\u0000\u0633\u0636\u0003\u01a6\u00d3\u0000"+
		"\u0634\u0636\u0003\u01a8\u00d4\u0000\u0635\u0633\u0001\u0000\u0000\u0000"+
		"\u0635\u0634\u0001\u0000\u0000\u0000\u0636\u0637\u0001\u0000\u0000\u0000"+
		"\u0637\u0638\u0003\u00a0P \u0638\u0693\u0001\u0000\u0000\u0000\u0639\u063a"+
		"\n\u001e\u0000\u0000\u063a\u063b\u0005`\u0000\u0000\u063b\u0693\u0003"+
		"\u00a0P\u001f\u063c\u063d\n\u001d\u0000\u0000\u063d\u063e\u0005]\u0000"+
		"\u0000\u063e\u0693\u0003\u00a0P\u001e\u063f\u0640\n\u001c\u0000\u0000"+
		"\u0640\u0641\u0005a\u0000\u0000\u0641\u0693\u0003\u00a0P\u001d\u0642\u0643"+
		"\n\u001b\u0000\u0000\u0643\u0644\u0003\u00a2Q\u0000\u0644\u0645\u0003"+
		"\u00a0P\u001c\u0645\u0693\u0001\u0000\u0000\u0000\u0646\u0647\n\u001a"+
		"\u0000\u0000\u0647\u0648\u0005b\u0000\u0000\u0648\u0693\u0003\u00a0P\u001b"+
		"\u0649\u064a\n\u0019\u0000\u0000\u064a\u064b\u0005c\u0000\u0000\u064b"+
		"\u0693\u0003\u00a0P\u001a\u064c\u064d\n\u0018\u0000\u0000\u064d\u064e"+
		"\u0005y\u0000\u0000\u064e\u0693\u0003\u00a0P\u0019\u064f\u0650\n\u0014"+
		"\u0000\u0000\u0650\u0651\u0005z\u0000\u0000\u0651\u0693\u0003\u00a0P\u0015"+
		"\u0652\u0653\n\u0013\u0000\u0000\u0653\u0654\u0005n\u0000\u0000\u0654"+
		"\u0693\u0003\u00a0P\u0014\u0655\u0656\n\u0010\u0000\u0000\u0656\u0657"+
		"\u0003\u00a4R\u0000\u0657\u0658\u0003\u00a0P\u0011\u0658\u0693\u0001\u0000"+
		"\u0000\u0000\u0659\u065a\n.\u0000\u0000\u065a\u065b\u0005w\u0000\u0000"+
		"\u065b\u065c\u0005\u0011\u0000\u0000\u065c\u0660\u0005\u0084\u0000\u0000"+
		"\u065d\u065f\u0003\u0092I\u0000\u065e\u065d\u0001\u0000\u0000\u0000\u065f"+
		"\u0662\u0001\u0000\u0000\u0000\u0660\u065e\u0001\u0000\u0000\u0000\u0660"+
		"\u0661\u0001\u0000\u0000\u0000\u0661\u0664\u0001\u0000\u0000\u0000\u0662"+
		"\u0660\u0001\u0000\u0000\u0000\u0663\u0665\u0003\u00fa}\u0000\u0664\u0663"+
		"\u0001\u0000\u0000\u0000\u0664\u0665\u0001\u0000\u0000\u0000\u0665\u0666"+
		"\u0001\u0000\u0000\u0000\u0666\u0693\u0005\u0085\u0000\u0000\u0667\u0668"+
		"\n-\u0000\u0000\u0668\u0669\u0005w\u0000\u0000\u0669\u066a\u0003\u0176"+
		"\u00bb\u0000\u066a\u066c\u0005\u0088\u0000\u0000\u066b\u066d\u0003\u00dc"+
		"n\u0000\u066c\u066b\u0001\u0000\u0000\u0000\u066c\u066d\u0001\u0000\u0000"+
		"\u0000\u066d\u066e\u0001\u0000\u0000\u0000\u066e\u066f\u0005\u0089\u0000"+
		"\u0000\u066f\u0693\u0001\u0000\u0000\u0000\u0670\u0671\n,\u0000\u0000"+
		"\u0671\u0675\u0005w\u0000\u0000\u0672\u0676\u0003\u019a\u00cd\u0000\u0673"+
		"\u0676\u0005\u0018\u0000\u0000\u0674\u0676\u0005\u001a\u0000\u0000\u0675"+
		"\u0672\u0001\u0000\u0000\u0000\u0675\u0673\u0001\u0000\u0000\u0000\u0675"+
		"\u0674\u0001\u0000\u0000\u0000\u0676\u0693\u0001\u0000\u0000\u0000\u0677"+
		"\u0678\n+\u0000\u0000\u0678\u0679\u0005w\u0000\u0000\u0679\u0693\u0003"+
		"\u00c0`\u0000\u067a\u067b\n*\u0000\u0000\u067b\u067c\u0005w\u0000\u0000"+
		"\u067c\u0693\u0005\'\u0000\u0000\u067d\u067e\n)\u0000\u0000\u067e\u0680"+
		"\u0005\u0088\u0000\u0000\u067f\u0681\u0003\u00dcn\u0000\u0680\u067f\u0001"+
		"\u0000\u0000\u0000\u0680\u0681\u0001\u0000\u0000\u0000\u0681\u0682\u0001"+
		"\u0000\u0000\u0000\u0682\u0693\u0005\u0089\u0000\u0000\u0683\u0684\n("+
		"\u0000\u0000\u0684\u0685\u0005\u0086\u0000\u0000\u0685\u0686\u0003\u00a0"+
		"P\u0000\u0686\u0687\u0005\u0087\u0000\u0000\u0687\u0693\u0001\u0000\u0000"+
		"\u0000\u0688\u0689\n\'\u0000\u0000\u0689\u0693\u0005\u0083\u0000\u0000"+
		"\u068a\u068b\n\"\u0000\u0000\u068b\u068c\u0005\u0001\u0000\u0000\u068c"+
		"\u0693\u0003\u0134\u009a\u0000\u068d\u068e\n\u0017\u0000\u0000\u068e\u0690"+
		"\u0005x\u0000\u0000\u068f\u0691\u0003\u00a0P\u0000\u0690\u068f\u0001\u0000"+
		"\u0000\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u0693\u0001\u0000"+
		"\u0000\u0000\u0692\u062c\u0001\u0000\u0000\u0000\u0692\u062f\u0001\u0000"+
		"\u0000\u0000\u0692\u0632\u0001\u0000\u0000\u0000\u0692\u0639\u0001\u0000"+
		"\u0000\u0000\u0692\u063c\u0001\u0000\u0000\u0000\u0692\u063f\u0001\u0000"+
		"\u0000\u0000\u0692\u0642\u0001\u0000\u0000\u0000\u0692\u0646\u0001\u0000"+
		"\u0000\u0000\u0692\u0649\u0001\u0000\u0000\u0000\u0692\u064c\u0001\u0000"+
		"\u0000\u0000\u0692\u064f\u0001\u0000\u0000\u0000\u0692\u0652\u0001\u0000"+
		"\u0000\u0000\u0692\u0655\u0001\u0000\u0000\u0000\u0692\u0659\u0001\u0000"+
		"\u0000\u0000\u0692\u0667\u0001\u0000\u0000\u0000\u0692\u0670\u0001\u0000"+
		"\u0000\u0000\u0692\u0677\u0001\u0000\u0000\u0000\u0692\u067a\u0001\u0000"+
		"\u0000\u0000\u0692\u067d\u0001\u0000\u0000\u0000\u0692\u0683\u0001\u0000"+
		"\u0000\u0000\u0692\u0688\u0001\u0000\u0000\u0000\u0692\u068a\u0001\u0000"+
		"\u0000\u0000\u0692\u068d\u0001\u0000\u0000\u0000\u0693\u0696\u0001\u0000"+
		"\u0000\u0000\u0694\u0692\u0001\u0000\u0000\u0000\u0694\u0695\u0001\u0000"+
		"\u0000\u0000\u0695\u00a1\u0001\u0000\u0000\u0000\u0696\u0694\u0001\u0000"+
		"\u0000\u0000\u0697\u0698\u0007\t\u0000\u0000\u0698\u00a3\u0001\u0000\u0000"+
		"\u0000\u0699\u069a\u0007\n\u0000\u0000\u069a\u00a5\u0001\u0000\u0000\u0000"+
		"\u069b\u069d\u0003\u0094J\u0000\u069c\u069b\u0001\u0000\u0000\u0000\u069d"+
		"\u069e\u0001\u0000\u0000\u0000\u069e\u069c\u0001\u0000\u0000\u0000\u069e"+
		"\u069f\u0001\u0000\u0000\u0000\u069f\u06a0\u0001\u0000\u0000\u0000\u06a0"+
		"\u06a1\u0003\u00a6S\u0000\u06a1\u06ae\u0001\u0000\u0000\u0000\u06a2\u06ae"+
		"\u0003\u00b0X\u0000\u06a3\u06ae\u0003\u00b4Z\u0000\u06a4\u06ae\u0003\u00a8"+
		"T\u0000\u06a5\u06ae\u0003\u00aaU\u0000\u06a6\u06ae\u0003\u00b6[\u0000"+
		"\u06a7\u06ae\u0003\u00e4r\u0000\u06a8\u06ae\u0003\u00f2y\u0000\u06a9\u06ae"+
		"\u0003\u00f4z\u0000\u06aa\u06ae\u0003\u00f8|\u0000\u06ab\u06ae\u0003\u00b8"+
		"\\\u0000\u06ac\u06ae\u0003\u00ba]\u0000\u06ad\u069c\u0001\u0000\u0000"+
		"\u0000\u06ad\u06a2\u0001\u0000\u0000\u0000\u06ad\u06a3\u0001\u0000\u0000"+
		"\u0000\u06ad\u06a4\u0001\u0000\u0000\u0000\u06ad\u06a5\u0001\u0000\u0000"+
		"\u0000\u06ad\u06a6\u0001\u0000\u0000\u0000\u06ad\u06a7\u0001\u0000\u0000"+
		"\u0000\u06ad\u06a8\u0001\u0000\u0000\u0000\u06ad\u06a9\u0001\u0000\u0000"+
		"\u0000\u06ad\u06aa\u0001\u0000\u0000\u0000\u06ad\u06ab\u0001\u0000\u0000"+
		"\u0000\u06ad\u06ac\u0001\u0000\u0000\u0000\u06ae\u00a7\u0001\u0000\u0000"+
		"\u0000\u06af\u06b1\u0005>\u0000\u0000\u06b0\u06b2\u0005\u0013\u0000\u0000"+
		"\u06b1\u06b0\u0001\u0000\u0000\u0000\u06b1\u06b2\u0001\u0000\u0000\u0000"+
		"\u06b2\u06b3\u0001\u0000\u0000\u0000\u06b3\u06b4\u0003\u00b0X\u0000\u06b4"+
		"\u00a9\u0001\u0000\u0000\u0000\u06b5\u06b6\u0005&\u0000\u0000\u06b6\u06b8"+
		"\u0005>\u0000\u0000\u06b7\u06b9\u0005\u0013\u0000\u0000\u06b8\u06b7\u0001"+
		"\u0000\u0000\u0000\u06b8\u06b9\u0001\u0000\u0000\u0000\u06b9\u06ba\u0001"+
		"\u0000\u0000\u0000\u06ba\u06bb\u0003\u00b0X\u0000\u06bb\u00ab\u0001\u0000"+
		"\u0000\u0000\u06bc\u06cd\u0005I\u0000\u0000\u06bd\u06cd\u0005J\u0000\u0000"+
		"\u06be\u06cd\u0005K\u0000\u0000\u06bf\u06cd\u0005L\u0000\u0000\u06c0\u06cd"+
		"\u0005M\u0000\u0000\u06c1\u06cd\u0005N\u0000\u0000\u06c2\u06cd\u0005O"+
		"\u0000\u0000\u06c3\u06cd\u0005P\u0000\u0000\u06c4\u06cd\u0005Q\u0000\u0000"+
		"\u06c5\u06c8\u0005V\u0000\u0000\u06c6\u06c7\u0005v\u0000\u0000\u06c7\u06c9"+
		"\u0003\u019a\u00cd\u0000\u06c8\u06c6\u0001\u0000\u0000\u0000\u06c8\u06c9"+
		"\u0001\u0000\u0000\u0000\u06c9\u06cd\u0001\u0000\u0000\u0000\u06ca\u06cd"+
		"\u0005\u001f\u0000\u0000\u06cb\u06cd\u0005\t\u0000\u0000\u06cc\u06bc\u0001"+
		"\u0000\u0000\u0000\u06cc\u06bd\u0001\u0000\u0000\u0000\u06cc\u06be\u0001"+
		"\u0000\u0000\u0000\u06cc\u06bf\u0001\u0000\u0000\u0000\u06cc\u06c0\u0001"+
		"\u0000\u0000\u0000\u06cc\u06c1\u0001\u0000\u0000\u0000\u06cc\u06c2\u0001"+
		"\u0000\u0000\u0000\u06cc\u06c3\u0001\u0000\u0000\u0000\u06cc\u06c4\u0001"+
		"\u0000\u0000\u0000\u06cc\u06c5\u0001\u0000\u0000\u0000\u06cc\u06ca\u0001"+
		"\u0000\u0000\u0000\u06cc\u06cb\u0001\u0000\u0000\u0000\u06cd\u00ad\u0001"+
		"\u0000\u0000\u0000\u06ce\u06d1\u0003\u0174\u00ba\u0000\u06cf\u06d1\u0003"+
		"\u018a\u00c5\u0000\u06d0\u06ce\u0001\u0000\u0000\u0000\u06d0\u06cf\u0001"+
		"\u0000\u0000\u0000\u06d1\u00af\u0001\u0000\u0000\u0000\u06d2\u06d6\u0005"+
		"\u0084\u0000\u0000\u06d3\u06d5\u0003\u0092I\u0000\u06d4\u06d3\u0001\u0000"+
		"\u0000\u0000\u06d5\u06d8\u0001\u0000\u0000\u0000\u06d6\u06d4\u0001\u0000"+
		"\u0000\u0000\u06d6\u06d7\u0001\u0000\u0000\u0000\u06d7\u06da\u0001\u0000"+
		"\u0000\u0000\u06d8\u06d6\u0001\u0000\u0000\u0000\u06d9\u06db\u0003\u00b2"+
		"Y\u0000\u06da\u06d9\u0001\u0000\u0000\u0000\u06da\u06db\u0001\u0000\u0000"+
		"\u0000\u06db\u06dc\u0001\u0000\u0000\u0000\u06dc\u06dd\u0005\u0085\u0000"+
		"\u0000\u06dd\u00b1\u0001\u0000\u0000\u0000\u06de\u06e0\u0003\u009aM\u0000"+
		"\u06df\u06de\u0001\u0000\u0000\u0000\u06e0\u06e1\u0001\u0000\u0000\u0000"+
		"\u06e1\u06df\u0001\u0000\u0000\u0000\u06e1\u06e2\u0001\u0000\u0000\u0000"+
		"\u06e2\u06e4\u0001\u0000\u0000\u0000\u06e3\u06e5\u0003\u00a0P\u0000\u06e4"+
		"\u06e3\u0001\u0000\u0000\u0000\u06e4\u06e5\u0001\u0000\u0000\u0000\u06e5"+
		"\u06e8\u0001\u0000\u0000\u0000\u06e6\u06e8\u0003\u00a0P\u0000\u06e7\u06df"+
		"\u0001\u0000\u0000\u0000\u06e7\u06e6\u0001\u0000\u0000\u0000\u06e8\u00b3"+
		"\u0001\u0000\u0000\u0000\u06e9\u06eb\u0005&\u0000\u0000\u06ea\u06ec\u0005"+
		"\u0013\u0000\u0000\u06eb\u06ea\u0001\u0000\u0000\u0000\u06eb\u06ec\u0001"+
		"\u0000\u0000\u0000\u06ec\u06ed\u0001\u0000\u0000\u0000\u06ed\u06ee\u0003"+
		"\u00b0X\u0000\u06ee\u00b5\u0001\u0000\u0000\u0000\u06ef\u06f0\u0005!\u0000"+
		"\u0000\u06f0\u06f1\u0003\u00b0X\u0000\u06f1\u00b7\u0001\u0000\u0000\u0000"+
		"\u06f2\u06f3\u0005\u0003\u0000\u0000\u06f3\u06f4\u0003\u00b0X\u0000\u06f4"+
		"\u00b9\u0001\u0000\u0000\u0000\u06f5\u06f6\u00057\u0000\u0000\u06f6\u06f7"+
		"\u0003\u00b0X\u0000\u06f7\u00bb\u0001\u0000\u0000\u0000\u06f8\u06fd\u0003"+
		"\u00a0P\u0000\u06f9\u06fa\u0005{\u0000\u0000\u06fa\u06fc\u0003\u00a0P"+
		"\u0000\u06fb\u06f9\u0001\u0000\u0000\u0000\u06fc\u06ff\u0001\u0000\u0000"+
		"\u0000\u06fd\u06fb\u0001\u0000\u0000\u0000\u06fd\u06fe\u0001\u0000\u0000"+
		"\u0000\u06fe\u0701\u0001\u0000\u0000\u0000\u06ff\u06fd\u0001\u0000\u0000"+
		"\u0000\u0700\u0702\u0005{\u0000\u0000\u0701\u0700\u0001\u0000\u0000\u0000"+
		"\u0701\u0702\u0001\u0000\u0000\u0000\u0702\u0708\u0001\u0000\u0000\u0000"+
		"\u0703\u0704\u0003\u00a0P\u0000\u0704\u0705\u0005|\u0000\u0000\u0705\u0706"+
		"\u0003\u00a0P\u0000\u0706\u0708\u0001\u0000\u0000\u0000\u0707\u06f8\u0001"+
		"\u0000\u0000\u0000\u0707\u0703\u0001\u0000\u0000\u0000\u0708\u00bd\u0001"+
		"\u0000\u0000\u0000\u0709\u070a\u0003\u00a0P\u0000\u070a\u070b\u0005{\u0000"+
		"\u0000\u070b\u070d\u0001\u0000\u0000\u0000\u070c\u0709\u0001\u0000\u0000"+
		"\u0000\u070d\u070e\u0001\u0000\u0000\u0000\u070e\u070c\u0001\u0000\u0000"+
		"\u0000\u070e\u070f\u0001\u0000\u0000\u0000\u070f\u0711\u0001\u0000\u0000"+
		"\u0000\u0710\u0712\u0003\u00a0P\u0000\u0711\u0710\u0001\u0000\u0000\u0000"+
		"\u0711\u0712\u0001\u0000\u0000\u0000\u0712\u00bf\u0001\u0000\u0000\u0000"+
		"\u0713\u0714\u0005Q\u0000\u0000\u0714\u00c1\u0001\u0000\u0000\u0000\u0715"+
		"\u0719\u0003\u00c4b\u0000\u0716\u0719\u0003\u00ccf\u0000\u0717\u0719\u0003"+
		"\u00ceg\u0000\u0718\u0715\u0001\u0000\u0000\u0000\u0718\u0716\u0001\u0000"+
		"\u0000\u0000\u0718\u0717\u0001\u0000\u0000\u0000\u0719\u00c3\u0001\u0000"+
		"\u0000\u0000\u071a\u071d\u0003\u0174\u00ba\u0000\u071b\u071d\u0003\u018a"+
		"\u00c5\u0000\u071c\u071a\u0001\u0000\u0000\u0000\u071c\u071b\u0001\u0000"+
		"\u0000\u0000\u071d\u071e\u0001\u0000\u0000\u0000\u071e\u0722\u0005\u0084"+
		"\u0000\u0000\u071f\u0721\u0003\u0092I\u0000\u0720\u071f\u0001\u0000\u0000"+
		"\u0000\u0721\u0724\u0001\u0000\u0000\u0000\u0722\u0720\u0001\u0000\u0000"+
		"\u0000\u0722\u0723\u0001\u0000\u0000\u0000\u0723\u0727\u0001\u0000\u0000"+
		"\u0000\u0724\u0722\u0001\u0000\u0000\u0000\u0725\u0728\u0003\u00c6c\u0000"+
		"\u0726\u0728\u0003\u00cae\u0000\u0727\u0725\u0001\u0000\u0000\u0000\u0727"+
		"\u0726\u0001\u0000\u0000\u0000\u0727\u0728\u0001\u0000\u0000\u0000\u0728"+
		"\u0729\u0001\u0000\u0000\u0000\u0729\u072a\u0005\u0085\u0000\u0000\u072a"+
		"\u00c5\u0001\u0000\u0000\u0000\u072b\u0730\u0003\u00c8d\u0000\u072c\u072d"+
		"\u0005{\u0000\u0000\u072d\u072f\u0003\u00c8d\u0000\u072e\u072c\u0001\u0000"+
		"\u0000\u0000\u072f\u0732\u0001\u0000\u0000\u0000\u0730\u072e\u0001\u0000"+
		"\u0000\u0000\u0730\u0731\u0001\u0000\u0000\u0000\u0731\u0738\u0001\u0000"+
		"\u0000\u0000\u0732\u0730\u0001\u0000\u0000\u0000\u0733\u0734\u0005{\u0000"+
		"\u0000\u0734\u0739\u0003\u00cae\u0000\u0735\u0737\u0005{\u0000\u0000\u0736"+
		"\u0735\u0001\u0000\u0000\u0000\u0736\u0737\u0001\u0000\u0000\u0000\u0737"+
		"\u0739\u0001\u0000\u0000\u0000\u0738\u0733\u0001\u0000\u0000\u0000\u0738"+
		"\u0736\u0001\u0000\u0000\u0000\u0739\u00c7\u0001\u0000\u0000\u0000\u073a"+
		"\u073c\u0003\u0094J\u0000\u073b\u073a\u0001\u0000\u0000\u0000\u073c\u073f"+
		"\u0001\u0000\u0000\u0000\u073d\u073b\u0001\u0000\u0000\u0000\u073d\u073e"+
		"\u0001\u0000\u0000\u0000\u073e\u0748\u0001\u0000\u0000\u0000\u073f\u073d"+
		"\u0001\u0000\u0000\u0000\u0740\u0749\u0003\u019a\u00cd\u0000\u0741\u0744"+
		"\u0003\u019a\u00cd\u0000\u0742\u0744\u0003\u00c0`\u0000\u0743\u0741\u0001"+
		"\u0000\u0000\u0000\u0743\u0742\u0001\u0000\u0000\u0000\u0744\u0745\u0001"+
		"\u0000\u0000\u0000\u0745\u0746\u0005}\u0000\u0000\u0746\u0747\u0003\u00a0"+
		"P\u0000\u0747\u0749\u0001\u0000\u0000\u0000\u0748\u0740\u0001\u0000\u0000"+
		"\u0000\u0748\u0743\u0001\u0000\u0000\u0000\u0749\u00c9\u0001\u0000\u0000"+
		"\u0000\u074a\u074c\u0005x\u0000\u0000\u074b\u074d\u0003\u00a0P\u0000\u074c"+
		"\u074b\u0001\u0000\u0000\u0000\u074c\u074d\u0001\u0000\u0000\u0000\u074d"+
		"\u00cb\u0001\u0000\u0000\u0000\u074e\u074f\u0003\u0174\u00ba\u0000\u074f"+
		"\u0753\u0005\u0088\u0000\u0000\u0750\u0752\u0003\u0092I\u0000\u0751\u0750"+
		"\u0001\u0000\u0000\u0000\u0752\u0755\u0001\u0000\u0000\u0000\u0753\u0751"+
		"\u0001\u0000\u0000\u0000\u0753\u0754\u0001\u0000\u0000\u0000\u0754\u0761"+
		"\u0001\u0000\u0000\u0000\u0755\u0753\u0001\u0000\u0000\u0000\u0756\u075b"+
		"\u0003\u00a0P\u0000\u0757\u0758\u0005{\u0000\u0000\u0758\u075a\u0003\u00a0"+
		"P\u0000\u0759\u0757\u0001\u0000\u0000\u0000\u075a\u075d\u0001\u0000\u0000"+
		"\u0000\u075b\u0759\u0001\u0000\u0000\u0000\u075b\u075c\u0001\u0000\u0000"+
		"\u0000\u075c\u075f\u0001\u0000\u0000\u0000\u075d\u075b\u0001\u0000\u0000"+
		"\u0000\u075e\u0760\u0005{\u0000\u0000\u075f\u075e\u0001\u0000\u0000\u0000"+
		"\u075f\u0760\u0001\u0000\u0000\u0000\u0760\u0762\u0001\u0000\u0000\u0000"+
		"\u0761\u0756\u0001\u0000\u0000\u0000\u0761\u0762\u0001\u0000\u0000\u0000"+
		"\u0762\u0763\u0001\u0000\u0000\u0000\u0763\u0764\u0005\u0089\u0000\u0000"+
		"\u0764\u00cd\u0001\u0000\u0000\u0000\u0765\u0766\u0003\u0174\u00ba\u0000"+
		"\u0766\u00cf\u0001\u0000\u0000\u0000\u0767\u076b\u0003\u00d2i\u0000\u0768"+
		"\u076b\u0003\u00d8l\u0000\u0769\u076b\u0003\u00dam\u0000\u076a\u0767\u0001"+
		"\u0000\u0000\u0000\u076a\u0768\u0001\u0000\u0000\u0000\u076a\u0769\u0001"+
		"\u0000\u0000\u0000\u076b\u00d1\u0001\u0000\u0000\u0000\u076c\u076d\u0003"+
		"\u0174\u00ba\u0000\u076d\u076f\u0005\u0084\u0000\u0000\u076e\u0770\u0003"+
		"\u00d4j\u0000\u076f\u076e\u0001\u0000\u0000\u0000\u076f\u0770\u0001\u0000"+
		"\u0000\u0000\u0770\u0771\u0001\u0000\u0000\u0000\u0771\u0772\u0005\u0085"+
		"\u0000\u0000\u0772\u00d3\u0001\u0000\u0000\u0000\u0773\u0778\u0003\u00d6"+
		"k\u0000\u0774\u0775\u0005{\u0000\u0000\u0775\u0777\u0003\u00d6k\u0000"+
		"\u0776\u0774\u0001\u0000\u0000\u0000\u0777\u077a\u0001\u0000\u0000\u0000"+
		"\u0778\u0776\u0001\u0000\u0000\u0000\u0778\u0779\u0001\u0000\u0000\u0000"+
		"\u0779\u077c\u0001\u0000\u0000\u0000\u077a\u0778\u0001\u0000\u0000\u0000"+
		"\u077b\u077d\u0005{\u0000\u0000\u077c\u077b\u0001\u0000\u0000\u0000\u077c"+
		"\u077d\u0001\u0000\u0000\u0000\u077d\u00d5\u0001\u0000\u0000\u0000\u077e"+
		"\u0787\u0003\u019a\u00cd\u0000\u077f\u0782\u0003\u019a\u00cd\u0000\u0780"+
		"\u0782\u0003\u00c0`\u0000\u0781\u077f\u0001\u0000\u0000\u0000\u0781\u0780"+
		"\u0001\u0000\u0000\u0000\u0782\u0783\u0001\u0000\u0000\u0000\u0783\u0784"+
		"\u0005}\u0000\u0000\u0784\u0785\u0003\u00a0P\u0000\u0785\u0787\u0001\u0000"+
		"\u0000\u0000\u0786\u077e\u0001\u0000\u0000\u0000\u0786\u0781\u0001\u0000"+
		"\u0000\u0000\u0787\u00d7\u0001\u0000\u0000\u0000\u0788\u0789\u0003\u0174"+
		"\u00ba\u0000\u0789\u0795\u0005\u0088\u0000\u0000\u078a\u078f\u0003\u00a0"+
		"P\u0000\u078b\u078c\u0005{\u0000\u0000\u078c\u078e\u0003\u00a0P\u0000"+
		"\u078d\u078b\u0001\u0000\u0000\u0000\u078e\u0791\u0001\u0000\u0000\u0000"+
		"\u078f\u078d\u0001\u0000\u0000\u0000\u078f\u0790\u0001\u0000\u0000\u0000"+
		"\u0790\u0793\u0001\u0000\u0000\u0000\u0791\u078f\u0001\u0000\u0000\u0000"+
		"\u0792\u0794\u0005{\u0000\u0000\u0793\u0792\u0001\u0000\u0000\u0000\u0793"+
		"\u0794\u0001\u0000\u0000\u0000\u0794\u0796\u0001\u0000\u0000\u0000\u0795"+
		"\u078a\u0001\u0000\u0000\u0000\u0795\u0796\u0001\u0000\u0000\u0000\u0796"+
		"\u0797\u0001\u0000\u0000\u0000\u0797\u0798\u0005\u0089\u0000\u0000\u0798"+
		"\u00d9\u0001\u0000\u0000\u0000\u0799\u079a\u0003\u0174\u00ba\u0000\u079a"+
		"\u00db\u0001\u0000\u0000\u0000\u079b\u07a0\u0003\u00a0P\u0000\u079c\u079d"+
		"\u0005{\u0000\u0000\u079d\u079f\u0003\u00a0P\u0000\u079e\u079c\u0001\u0000"+
		"\u0000\u0000\u079f\u07a2\u0001\u0000\u0000\u0000\u07a0\u079e\u0001\u0000"+
		"\u0000\u0000\u07a0\u07a1\u0001\u0000\u0000\u0000\u07a1\u07a4\u0001\u0000"+
		"\u0000\u0000\u07a2\u07a0\u0001\u0000\u0000\u0000\u07a3\u07a5\u0005{\u0000"+
		"\u0000\u07a4\u07a3\u0001\u0000\u0000\u0000\u07a4\u07a5\u0001\u0000\u0000"+
		"\u0000\u07a5\u00dd\u0001\u0000\u0000\u0000\u07a6\u07a8\u0003\u008eG\u0000"+
		"\u07a7\u07a6\u0001\u0000\u0000\u0000\u07a7\u07a8\u0001\u0000\u0000\u0000"+
		"\u07a8\u07aa\u0001\u0000\u0000\u0000\u07a9\u07ab\u0005\u001b\u0000\u0000"+
		"\u07aa\u07a9\u0001\u0000\u0000\u0000\u07aa\u07ab\u0001\u0000\u0000\u0000"+
		"\u07ab\u07ad\u0001\u0000\u0000\u0000\u07ac\u07ae\u0005\u0003\u0000\u0000"+
		"\u07ad\u07ac\u0001\u0000\u0000\u0000\u07ad\u07ae\u0001\u0000\u0000\u0000"+
		"\u07ae\u07b0\u0001\u0000\u0000\u0000\u07af\u07b1\u0005&\u0000\u0000\u07b0"+
		"\u07af\u0001\u0000\u0000\u0000\u07b0\u07b1\u0001\u0000\u0000\u0000\u07b1"+
		"\u07b3\u0001\u0000\u0000\u0000\u07b2\u07b4\u0005\u0013\u0000\u0000\u07b3"+
		"\u07b2\u0001\u0000\u0000\u0000\u07b3\u07b4\u0001\u0000\u0000\u0000\u07b4"+
		"\u07bb\u0001\u0000\u0000\u0000\u07b5\u07bc\u0005c\u0000\u0000\u07b6\u07b8"+
		"\u0005a\u0000\u0000\u07b7\u07b9\u0003\u00e0p\u0000\u07b8\u07b7\u0001\u0000"+
		"\u0000\u0000\u07b8\u07b9\u0001\u0000\u0000\u0000\u07b9\u07ba\u0001\u0000"+
		"\u0000\u0000\u07ba\u07bc\u0005a\u0000\u0000\u07bb\u07b5\u0001\u0000\u0000"+
		"\u0000\u07bb\u07b6\u0001\u0000\u0000\u0000\u07bc\u07c2\u0001\u0000\u0000"+
		"\u0000\u07bd\u07c3\u0003\u00a0P\u0000\u07be\u07bf\u0005\u007f\u0000\u0000"+
		"\u07bf\u07c0\u0003\u0134\u009a\u0000\u07c0\u07c1\u0003\u00b0X\u0000\u07c1"+
		"\u07c3\u0001\u0000\u0000\u0000\u07c2\u07bd\u0001\u0000\u0000\u0000\u07c2"+
		"\u07be\u0001\u0000\u0000\u0000\u07c3\u00df\u0001\u0000\u0000\u0000\u07c4"+
		"\u07c9\u0003\u00e2q\u0000\u07c5\u07c6\u0005{\u0000\u0000\u07c6\u07c8\u0003"+
		"\u00e2q\u0000\u07c7\u07c5\u0001\u0000\u0000\u0000\u07c8\u07cb\u0001\u0000"+
		"\u0000\u0000\u07c9\u07c7\u0001\u0000\u0000\u0000\u07c9\u07ca\u0001\u0000"+
		"\u0000\u0000\u07ca\u07cd\u0001\u0000\u0000\u0000\u07cb\u07c9\u0001\u0000"+
		"\u0000\u0000\u07cc\u07ce\u0005{\u0000\u0000\u07cd\u07cc\u0001\u0000\u0000"+
		"\u0000\u07cd\u07ce\u0001\u0000\u0000\u0000\u07ce\u00e1\u0001\u0000\u0000"+
		"\u0000\u07cf\u07d1\u0003\u0094J\u0000\u07d0\u07cf\u0001\u0000\u0000\u0000"+
		"\u07d1\u07d4\u0001\u0000\u0000\u0000\u07d2\u07d0\u0001\u0000\u0000\u0000"+
		"\u07d2\u07d3\u0001\u0000\u0000\u0000\u07d3\u07d5\u0001\u0000\u0000\u0000"+
		"\u07d4\u07d2\u0001\u0000\u0000\u0000\u07d5\u07d8\u0003\u0102\u0081\u0000"+
		"\u07d6\u07d7\u0005}\u0000\u0000\u07d7\u07d9\u0003\u0132\u0099\u0000\u07d8"+
		"\u07d6\u0001\u0000\u0000\u0000\u07d8\u07d9\u0001\u0000\u0000\u0000\u07d9"+
		"\u00e3\u0001\u0000\u0000\u0000\u07da\u07dc\u0003\u00f0x\u0000\u07db\u07da"+
		"\u0001\u0000\u0000\u0000\u07db\u07dc\u0001\u0000\u0000\u0000\u07dc\u07e1"+
		"\u0001\u0000\u0000\u0000\u07dd\u07e2\u0003\u00e6s\u0000\u07de\u07e2\u0003"+
		"\u00e8t\u0000\u07df\u07e2\u0003\u00eau\u0000\u07e0\u07e2\u0003\u00ecv"+
		"\u0000\u07e1\u07dd\u0001\u0000\u0000\u0000\u07e1\u07de\u0001\u0000\u0000"+
		"\u0000\u07e1\u07df\u0001\u0000\u0000\u0000\u07e1\u07e0\u0001\u0000\u0000"+
		"\u0000\u07e2\u07e7\u0001\u0000\u0000\u0000\u07e3\u07e4\u0003\u00f0x\u0000"+
		"\u07e4\u07e5\u0003\u00eew\u0000\u07e5\u07e7\u0001\u0000\u0000\u0000\u07e6"+
		"\u07db\u0001\u0000\u0000\u0000\u07e6\u07e3\u0001\u0000\u0000\u0000\u07e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u07e8\u07e9\u0005\u0010\u0000\u0000\u07e9"+
		"\u07ea\u0003\u00b0X\u0000\u07ea\u00e7\u0001\u0000\u0000\u0000\u07eb\u07ec"+
		"\u0005%\u0000\u0000\u07ec\u07ed\u0003\u00a0P\u0000\u07ed\u07ee\u0003\u00b0"+
		"X\u0000\u07ee\u00e9\u0001\u0000\u0000\u0000\u07ef\u07f0\u0005%\u0000\u0000"+
		"\u07f0\u07f1\u0005\u000f\u0000\u0000\u07f1\u07f2\u0003\u0102\u0081\u0000"+
		"\u07f2\u07f3\u0005n\u0000\u0000\u07f3\u07f4\u0003\u00a0P\u0000\u07f4\u07f5"+
		"\u0003\u00b0X\u0000\u07f5\u00eb\u0001\u0000\u0000\u0000\u07f6\u07f7\u0005"+
		"\u000b\u0000\u0000\u07f7\u07f8\u0003\u0102\u0081\u0000\u07f8\u07f9\u0005"+
		"\u000e\u0000\u0000\u07f9\u07fa\u0003\u00a0P\u0000\u07fa\u07fb\u0003\u00b0"+
		"X\u0000\u07fb\u00ed\u0001\u0000\u0000\u0000\u07fc\u07fd\u0003\u00b0X\u0000"+
		"\u07fd\u00ef\u0001\u0000\u0000\u0000\u07fe\u07ff\u0005W\u0000\u0000\u07ff"+
		"\u0800\u0005}\u0000\u0000\u0800\u00f1\u0001\u0000\u0000\u0000\u0801\u0802"+
		"\u0005\f\u0000\u0000\u0802\u0803\u0003\u00a0P\u0000\u0803\u080a\u0003"+
		"\u00b0X\u0000\u0804\u0808\u0005\u0006\u0000\u0000\u0805\u0809\u0003\u00b0"+
		"X\u0000\u0806\u0809\u0003\u00f2y\u0000\u0807\u0809\u0003\u00f4z\u0000"+
		"\u0808\u0805\u0001\u0000\u0000\u0000\u0808\u0806\u0001\u0000\u0000\u0000"+
		"\u0808\u0807\u0001\u0000\u0000\u0000\u0809\u080b\u0001\u0000\u0000\u0000"+
		"\u080a\u0804\u0001\u0000\u0000\u0000\u080a\u080b\u0001\u0000\u0000\u0000"+
		"\u080b\u00f3\u0001\u0000\u0000\u0000\u080c\u080d\u0005\f\u0000\u0000\u080d"+
		"\u080e\u0005\u000f\u0000\u0000\u080e\u080f\u0003\u0102\u0081\u0000\u080f"+
		"\u0810\u0005n\u0000\u0000\u0810\u0811\u0003\u00a0P\u0000\u0811\u0818\u0003"+
		"\u00b0X\u0000\u0812\u0816\u0005\u0006\u0000\u0000\u0813\u0817\u0003\u00b0"+
		"X\u0000\u0814\u0817\u0003\u00f2y\u0000\u0815\u0817\u0003\u00f4z\u0000"+
		"\u0816\u0813\u0001\u0000\u0000\u0000\u0816\u0814\u0001\u0000\u0000\u0000"+
		"\u0816\u0815\u0001\u0000\u0000\u0000\u0817\u0819\u0001\u0000\u0000\u0000"+
		"\u0818\u0812\u0001\u0000\u0000\u0000\u0818\u0819\u0001\u0000\u0000\u0000"+
		"\u0819\u00f5\u0001\u0000\u0000\u0000\u081a\u081b\u0005\u000f\u0000\u0000"+
		"\u081b\u081c\u0003\u0102\u0081\u0000\u081c\u081d\u0005n\u0000\u0000\u081d"+
		"\u081e\u0003\u00a0P\u0000\u081e\u00f7\u0001\u0000\u0000\u0000\u081f\u0820"+
		"\u0005\u0011\u0000\u0000\u0820\u0821\u0003\u00a0P\u0000\u0821\u0825\u0005"+
		"\u0084\u0000\u0000\u0822\u0824\u0003\u0092I\u0000\u0823\u0822\u0001\u0000"+
		"\u0000\u0000\u0824\u0827\u0001\u0000\u0000\u0000\u0825\u0823\u0001\u0000"+
		"\u0000\u0000\u0825\u0826\u0001\u0000\u0000\u0000\u0826\u0829\u0001\u0000"+
		"\u0000\u0000\u0827\u0825\u0001\u0000\u0000\u0000\u0828\u082a\u0003\u00fa"+
		"}\u0000\u0829\u0828\u0001\u0000\u0000\u0000\u0829\u082a\u0001\u0000\u0000"+
		"\u0000\u082a\u082b\u0001\u0000\u0000\u0000\u082b\u082c\u0005\u0085\u0000"+
		"\u0000\u082c\u00f9\u0001\u0000\u0000\u0000\u082d\u082e\u0003\u00fe\u007f"+
		"\u0000\u082e\u082f\u0005\u0080\u0000\u0000\u082f\u0830\u0003\u00fc~\u0000"+
		"\u0830\u0832\u0001\u0000\u0000\u0000\u0831\u082d\u0001\u0000\u0000\u0000"+
		"\u0832\u0835\u0001\u0000\u0000\u0000\u0833\u0831\u0001\u0000\u0000\u0000"+
		"\u0833\u0834\u0001\u0000\u0000\u0000\u0834\u0836\u0001\u0000\u0000\u0000"+
		"\u0835\u0833\u0001\u0000\u0000\u0000\u0836\u0837\u0003\u00fe\u007f\u0000"+
		"\u0837\u0838\u0005\u0080\u0000\u0000\u0838\u083a\u0003\u00a0P\u0000\u0839"+
		"\u083b\u0005{\u0000\u0000\u083a\u0839\u0001\u0000\u0000\u0000\u083a\u083b"+
		"\u0001\u0000\u0000\u0000\u083b\u00fb\u0001\u0000\u0000\u0000\u083c\u083d"+
		"\u0003\u00a0P\u0000\u083d\u083e\u0005{\u0000\u0000\u083e\u0844\u0001\u0000"+
		"\u0000\u0000\u083f\u0841\u0003\u00a6S\u0000\u0840\u0842\u0005{\u0000\u0000"+
		"\u0841\u0840\u0001\u0000\u0000\u0000\u0841\u0842\u0001\u0000\u0000\u0000"+
		"\u0842\u0844\u0001\u0000\u0000\u0000\u0843\u083c\u0001\u0000\u0000\u0000"+
		"\u0843\u083f\u0001\u0000\u0000\u0000\u0844\u00fd\u0001\u0000\u0000\u0000"+
		"\u0845\u0847\u0003\u0094J\u0000\u0846\u0845\u0001\u0000\u0000\u0000\u0847"+
		"\u084a\u0001\u0000\u0000\u0000\u0848\u0846\u0001\u0000\u0000\u0000\u0848"+
		"\u0849\u0001\u0000\u0000\u0000\u0849\u084b\u0001\u0000\u0000\u0000\u084a"+
		"\u0848\u0001\u0000\u0000\u0000\u084b\u084d\u0003\u0102\u0081\u0000\u084c"+
		"\u084e\u0003\u0100\u0080\u0000\u084d\u084c\u0001\u0000\u0000\u0000\u084d"+
		"\u084e\u0001\u0000\u0000\u0000\u084e\u00ff\u0001\u0000\u0000\u0000\u084f"+
		"\u0850\u0005\f\u0000\u0000\u0850\u0851\u0003\u00a0P\u0000\u0851\u0101"+
		"\u0001\u0000\u0000\u0000\u0852\u0854\u0005a\u0000\u0000\u0853\u0852\u0001"+
		"\u0000\u0000\u0000\u0853\u0854\u0001\u0000\u0000\u0000\u0854\u0855\u0001"+
		"\u0000\u0000\u0000\u0855\u085a\u0003\u0104\u0082\u0000\u0856\u0857\u0005"+
		"a\u0000\u0000\u0857\u0859\u0003\u0104\u0082\u0000\u0858\u0856\u0001\u0000"+
		"\u0000\u0000\u0859\u085c\u0001\u0000\u0000\u0000\u085a\u0858\u0001\u0000"+
		"\u0000\u0000\u085a\u085b\u0001\u0000\u0000\u0000\u085b\u0103\u0001\u0000"+
		"\u0000\u0000\u085c\u085a\u0001\u0000\u0000\u0000\u085d\u0860\u0003\u0106"+
		"\u0083\u0000\u085e\u0860\u0003\u0112\u0089\u0000\u085f\u085d\u0001\u0000"+
		"\u0000\u0000\u085f\u085e\u0001\u0000\u0000\u0000\u0860\u0861\u0001\u0000"+
		"\u0000\u0000\u0861\u0862\u0005\f\u0000\u0000\u0862\u0863\u0003\u00a0P"+
		"\u0000\u0863\u0867\u0001\u0000\u0000\u0000\u0864\u0867\u0003\u0106\u0083"+
		"\u0000\u0865\u0867\u0003\u0112\u0089\u0000\u0866\u085f\u0001\u0000\u0000"+
		"\u0000\u0866\u0864\u0001\u0000\u0000\u0000\u0866\u0865\u0001\u0000\u0000"+
		"\u0000\u0867\u0105\u0001\u0000\u0000\u0000\u0868\u0877\u0003\u0108\u0084"+
		"\u0000\u0869\u0877\u0003\u010a\u0085\u0000\u086a\u0877\u0003\u010c\u0086"+
		"\u0000\u086b\u0877\u0003\u010e\u0087\u0000\u086c\u0877\u0003\u0110\u0088"+
		"\u0000\u086d\u0877\u0003\u0116\u008b\u0000\u086e\u0877\u0003\u0118\u008c"+
		"\u0000\u086f\u0877\u0003\u0122\u0091\u0000\u0870\u0877\u0003\u0126\u0093"+
		"\u0000\u0871\u0877\u0003\u012a\u0095\u0000\u0872\u0877\u0003\u012c\u0096"+
		"\u0000\u0873\u0877\u0003\u0130\u0098\u0000\u0874\u0877\u0003\u0002\u0001"+
		"\u0000\u0875\u0877\u0003\u00b8\\\u0000\u0876\u0868\u0001\u0000\u0000\u0000"+
		"\u0876\u0869\u0001\u0000\u0000\u0000\u0876\u086a\u0001\u0000\u0000\u0000"+
		"\u0876\u086b\u0001\u0000\u0000\u0000\u0876\u086c\u0001\u0000\u0000\u0000"+
		"\u0876\u086d\u0001\u0000\u0000\u0000\u0876\u086e\u0001\u0000\u0000\u0000"+
		"\u0876\u086f\u0001\u0000\u0000\u0000\u0876\u0870\u0001\u0000\u0000\u0000"+
		"\u0876\u0871\u0001\u0000\u0000\u0000\u0876\u0872\u0001\u0000\u0000\u0000"+
		"\u0876\u0873\u0001\u0000\u0000\u0000\u0876\u0874\u0001\u0000\u0000\u0000"+
		"\u0876\u0875\u0001\u0000\u0000\u0000\u0877\u0107\u0001\u0000\u0000\u0000"+
		"\u0878\u0879\u0005,\u0000\u0000\u0879\u087a\u0003\u0104\u0082\u0000\u087a"+
		"\u0109\u0001\u0000\u0000\u0000\u087b\u088c\u0005\u001f\u0000\u0000\u087c"+
		"\u088c\u0005\t\u0000\u0000\u087d\u088c\u0005I\u0000\u0000\u087e\u088c"+
		"\u0005L\u0000\u0000\u087f\u088c\u0005J\u0000\u0000\u0880\u088c\u0005K"+
		"\u0000\u0000\u0881\u088c\u0005M\u0000\u0000\u0882\u088c\u0005N\u0000\u0000"+
		"\u0883\u0885\u0005Y\u0000\u0000\u0884\u0883\u0001\u0000\u0000\u0000\u0884"+
		"\u0885\u0001\u0000\u0000\u0000\u0885\u0886\u0001\u0000\u0000\u0000\u0886"+
		"\u088c\u0005Q\u0000\u0000\u0887\u0889\u0005Y\u0000\u0000\u0888\u0887\u0001"+
		"\u0000\u0000\u0000\u0888\u0889\u0001\u0000\u0000\u0000\u0889\u088a\u0001"+
		"\u0000\u0000\u0000\u088a\u088c\u0005V\u0000\u0000\u088b\u087b\u0001\u0000"+
		"\u0000\u0000\u088b\u087c\u0001\u0000\u0000\u0000\u088b\u087d\u0001\u0000"+
		"\u0000\u0000\u088b\u087e\u0001\u0000\u0000\u0000\u088b\u087f\u0001\u0000"+
		"\u0000\u0000\u088b\u0880\u0001\u0000\u0000\u0000\u088b\u0881\u0001\u0000"+
		"\u0000\u0000\u088b\u0882\u0001\u0000\u0000\u0000\u088b\u0884\u0001\u0000"+
		"\u0000\u0000\u088b\u0888\u0001\u0000\u0000\u0000\u088c\u010b\u0001\u0000"+
		"\u0000\u0000\u088d\u088f\u0007\u000b\u0000\u0000\u088e\u088d\u0001\u0000"+
		"\u0000\u0000\u088f\u0892\u0001\u0000\u0000\u0000\u0890\u088e\u0001\u0000"+
		"\u0000\u0000\u0890\u0891\u0001\u0000\u0000\u0000\u0891\u0893\u0001\u0000"+
		"\u0000\u0000\u0892\u0890\u0001\u0000\u0000\u0000\u0893\u0896\u0003\u019a"+
		"\u00cd\u0000\u0894\u0895\u0005u\u0000\u0000\u0895\u0897\u0003\u0102\u0081"+
		"\u0000\u0896\u0894\u0001\u0000\u0000\u0000\u0896\u0897\u0001\u0000\u0000"+
		"\u0000\u0897\u010d\u0001\u0000\u0000\u0000\u0898\u0899\u0005v\u0000\u0000"+
		"\u0899\u010f\u0001\u0000\u0000\u0000\u089a\u089b\u0005x\u0000\u0000\u089b"+
		"\u0111\u0001\u0000\u0000\u0000\u089c\u089d\u0003\u0114\u008a\u0000\u089d"+
		"\u089e\u0005x\u0000\u0000\u089e\u089f\u0003\u0114\u008a\u0000\u089f\u08b0"+
		"\u0001\u0000\u0000\u0000\u08a0\u08a1\u0003\u0114\u008a\u0000\u08a1\u08a2"+
		"\u0005z\u0000\u0000\u08a2\u08a3\u0003\u0114\u008a\u0000\u08a3\u08b0\u0001"+
		"\u0000\u0000\u0000\u08a4\u08a5\u0005x\u0000\u0000\u08a5\u08b0\u0003\u0114"+
		"\u008a\u0000\u08a6\u08a7\u0005z\u0000\u0000\u08a7\u08b0\u0003\u0114\u008a"+
		"\u0000\u08a8\u08a9\u0003\u0114\u008a\u0000\u08a9\u08aa\u0005x\u0000\u0000"+
		"\u08aa\u08b0\u0001\u0000\u0000\u0000\u08ab\u08ac\u0003\u0114\u008a\u0000"+
		"\u08ac\u08ad\u0005y\u0000\u0000\u08ad\u08ae\u0003\u0114\u008a\u0000\u08ae"+
		"\u08b0\u0001\u0000\u0000\u0000\u08af\u089c\u0001\u0000\u0000\u0000\u08af"+
		"\u08a0\u0001\u0000\u0000\u0000\u08af\u08a4\u0001\u0000\u0000\u0000\u08af"+
		"\u08a6\u0001\u0000\u0000\u0000\u08af\u08a8\u0001\u0000\u0000\u0000\u08af"+
		"\u08ab\u0001\u0000\u0000\u0000\u08b0\u0113\u0001\u0000\u0000\u0000\u08b1"+
		"\u08be\u0005I\u0000\u0000\u08b2\u08be\u0005L\u0000\u0000\u08b3\u08b5\u0005"+
		"Y\u0000\u0000\u08b4\u08b3\u0001\u0000\u0000\u0000\u08b4\u08b5\u0001\u0000"+
		"\u0000\u0000\u08b5\u08b6\u0001\u0000\u0000\u0000\u08b6\u08be\u0005Q\u0000"+
		"\u0000\u08b7\u08b9\u0005Y\u0000\u0000\u08b8\u08b7\u0001\u0000\u0000\u0000"+
		"\u08b8\u08b9\u0001\u0000\u0000\u0000\u08b9\u08ba\u0001\u0000\u0000\u0000"+
		"\u08ba\u08be\u0005V\u0000\u0000\u08bb\u08be\u0003\u0130\u0098\u0000\u08bc"+
		"\u08be\u0003\u00b8\\\u0000\u08bd\u08b1\u0001\u0000\u0000\u0000\u08bd\u08b2"+
		"\u0001\u0000\u0000\u0000\u08bd\u08b4\u0001\u0000\u0000\u0000\u08bd\u08b8"+
		"\u0001\u0000\u0000\u0000\u08bd\u08bb\u0001\u0000\u0000\u0000\u08bd\u08bc"+
		"\u0001\u0000\u0000\u0000\u08be\u0115\u0001\u0000\u0000\u0000\u08bf\u08c1"+
		"\u0007\u0004\u0000\u0000\u08c0\u08c2\u0005\u0014\u0000\u0000\u08c1\u08c0"+
		"\u0001\u0000\u0000\u0000\u08c1\u08c2\u0001\u0000\u0000\u0000\u08c2\u08c3"+
		"\u0001\u0000\u0000\u0000\u08c3\u08c4\u0003\u0106\u0083\u0000\u08c4\u0117"+
		"\u0001\u0000\u0000\u0000\u08c5\u08c8\u0003\u0174\u00ba\u0000\u08c6\u08c8"+
		"\u0003\u018a\u00c5\u0000\u08c7\u08c5\u0001\u0000\u0000\u0000\u08c7\u08c6"+
		"\u0001\u0000\u0000\u0000\u08c8\u08c9\u0001\u0000\u0000\u0000\u08c9\u08cb"+
		"\u0005\u0084\u0000\u0000\u08ca\u08cc\u0003\u011a\u008d\u0000\u08cb\u08ca"+
		"\u0001\u0000\u0000\u0000\u08cb\u08cc\u0001\u0000\u0000\u0000\u08cc\u08cd"+
		"\u0001\u0000\u0000\u0000\u08cd\u08ce\u0005\u0085\u0000\u0000\u08ce\u0119"+
		"\u0001\u0000\u0000\u0000\u08cf\u08d4\u0003\u011c\u008e\u0000\u08d0\u08d2"+
		"\u0005{\u0000\u0000\u08d1\u08d3\u0003\u0120\u0090\u0000\u08d2\u08d1\u0001"+
		"\u0000\u0000\u0000\u08d2\u08d3\u0001\u0000\u0000\u0000\u08d3\u08d5\u0001"+
		"\u0000\u0000\u0000\u08d4\u08d0\u0001\u0000\u0000\u0000\u08d4\u08d5\u0001"+
		"\u0000\u0000\u0000\u08d5\u08d8\u0001\u0000\u0000\u0000\u08d6\u08d8\u0003"+
		"\u0120\u0090\u0000\u08d7\u08cf\u0001\u0000\u0000\u0000\u08d7\u08d6\u0001"+
		"\u0000\u0000\u0000\u08d8\u011b\u0001\u0000\u0000\u0000\u08d9\u08de\u0003"+
		"\u011e\u008f\u0000\u08da\u08db\u0005{\u0000\u0000\u08db\u08dd\u0003\u011e"+
		"\u008f\u0000\u08dc\u08da\u0001\u0000\u0000\u0000\u08dd\u08e0\u0001\u0000"+
		"\u0000\u0000\u08de\u08dc\u0001\u0000\u0000\u0000\u08de\u08df\u0001\u0000"+
		"\u0000\u0000\u08df\u011d\u0001\u0000\u0000\u0000\u08e0\u08de\u0001\u0000"+
		"\u0000\u0000\u08e1\u08e3\u0003\u0094J\u0000";
	private static final String _serializedATNSegment1 =
		"\u08e2\u08e1\u0001\u0000\u0000\u0000\u08e3\u08e6\u0001\u0000\u0000\u0000"+
		"\u08e4\u08e2\u0001\u0000\u0000\u0000\u08e4\u08e5\u0001\u0000\u0000\u0000"+
		"\u08e5\u08f7\u0001\u0000\u0000\u0000\u08e6\u08e4\u0001\u0000\u0000\u0000"+
		"\u08e7\u08e8\u0003\u00c0`\u0000\u08e8\u08e9\u0005}\u0000\u0000\u08e9\u08ea"+
		"\u0003\u0102\u0081\u0000\u08ea\u08f8\u0001\u0000\u0000\u0000\u08eb\u08ec"+
		"\u0003\u019a\u00cd\u0000\u08ec\u08ed\u0005}\u0000\u0000\u08ed\u08ee\u0003"+
		"\u0102\u0081\u0000\u08ee\u08f8\u0001\u0000\u0000\u0000\u08ef\u08f1\u0005"+
		"\u0016\u0000\u0000\u08f0\u08ef\u0001\u0000\u0000\u0000\u08f0\u08f1\u0001"+
		"\u0000\u0000\u0000\u08f1\u08f3\u0001\u0000\u0000\u0000\u08f2\u08f4\u0005"+
		"\u0014\u0000\u0000\u08f3\u08f2\u0001\u0000\u0000\u0000\u08f3\u08f4\u0001"+
		"\u0000\u0000\u0000\u08f4\u08f5\u0001\u0000\u0000\u0000\u08f5\u08f8\u0003"+
		"\u019a\u00cd\u0000\u08f6\u08f8\u0003\u0108\u0084\u0000\u08f7\u08e7\u0001"+
		"\u0000\u0000\u0000\u08f7\u08eb\u0001\u0000\u0000\u0000\u08f7\u08f0\u0001"+
		"\u0000\u0000\u0000\u08f7\u08f6\u0001\u0000\u0000\u0000\u08f8\u011f\u0001"+
		"\u0000\u0000\u0000\u08f9\u08fb\u0003\u0094J\u0000\u08fa\u08f9\u0001\u0000"+
		"\u0000\u0000\u08fb\u08fe\u0001\u0000\u0000\u0000\u08fc\u08fa\u0001\u0000"+
		"\u0000\u0000\u08fc\u08fd\u0001\u0000\u0000\u0000\u08fd\u08ff\u0001\u0000"+
		"\u0000\u0000\u08fe\u08fc\u0001\u0000\u0000\u0000\u08ff\u0900\u0005x\u0000"+
		"\u0000\u0900\u0121\u0001\u0000\u0000\u0000\u0901\u0904\u0003\u0174\u00ba"+
		"\u0000\u0902\u0904\u0003\u018a\u00c5\u0000\u0903\u0901\u0001\u0000\u0000"+
		"\u0000\u0903\u0902\u0001\u0000\u0000\u0000\u0904\u0905\u0001\u0000\u0000"+
		"\u0000\u0905\u0907\u0005\u0088\u0000\u0000\u0906\u0908\u0003\u0124\u0092"+
		"\u0000\u0907\u0906\u0001\u0000\u0000\u0000\u0907\u0908\u0001\u0000\u0000"+
		"\u0000\u0908\u0909\u0001\u0000\u0000\u0000\u0909\u090a\u0005\u0089\u0000"+
		"\u0000\u090a\u0123\u0001\u0000\u0000\u0000\u090b\u0910\u0003\u0102\u0081"+
		"\u0000\u090c\u090d\u0005{\u0000\u0000\u090d\u090f\u0003\u0102\u0081\u0000"+
		"\u090e\u090c\u0001\u0000\u0000\u0000\u090f\u0912\u0001\u0000\u0000\u0000"+
		"\u0910\u090e\u0001\u0000\u0000\u0000\u0910\u0911\u0001\u0000\u0000\u0000"+
		"\u0911\u0914\u0001\u0000\u0000\u0000\u0912\u0910\u0001\u0000\u0000\u0000"+
		"\u0913\u0915\u0005{\u0000\u0000\u0914\u0913\u0001\u0000\u0000\u0000\u0914"+
		"\u0915\u0001\u0000\u0000\u0000\u0915\u0125\u0001\u0000\u0000\u0000\u0916"+
		"\u0918\u0005\u0088\u0000\u0000\u0917\u0919\u0003\u0128\u0094\u0000\u0918"+
		"\u0917\u0001\u0000\u0000\u0000\u0918\u0919\u0001\u0000\u0000\u0000\u0919"+
		"\u091a\u0001\u0000\u0000\u0000\u091a\u091b\u0005\u0089\u0000\u0000\u091b"+
		"\u0127\u0001\u0000\u0000\u0000\u091c\u091d\u0003\u0102\u0081\u0000\u091d"+
		"\u091e\u0005{\u0000\u0000\u091e\u092b\u0001\u0000\u0000\u0000\u091f\u092b"+
		"\u0003\u0110\u0088\u0000\u0920\u0923\u0003\u0102\u0081\u0000\u0921\u0922"+
		"\u0005{\u0000\u0000\u0922\u0924\u0003\u0102\u0081\u0000\u0923\u0921\u0001"+
		"\u0000\u0000\u0000\u0924\u0925\u0001\u0000\u0000\u0000\u0925\u0923\u0001"+
		"\u0000\u0000\u0000\u0925\u0926\u0001\u0000\u0000\u0000\u0926\u0928\u0001"+
		"\u0000\u0000\u0000\u0927\u0929\u0005{\u0000\u0000\u0928\u0927\u0001\u0000"+
		"\u0000\u0000\u0928\u0929\u0001\u0000\u0000\u0000\u0929\u092b\u0001\u0000"+
		"\u0000\u0000\u092a\u091c\u0001\u0000\u0000\u0000\u092a\u091f\u0001\u0000"+
		"\u0000\u0000\u092a\u0920\u0001\u0000\u0000\u0000\u092b\u0129\u0001\u0000"+
		"\u0000\u0000\u092c\u092d\u0005\u0088\u0000\u0000\u092d\u092e\u0003\u0102"+
		"\u0081\u0000\u092e\u092f\u0005\u0089\u0000\u0000\u092f\u012b\u0001\u0000"+
		"\u0000\u0000\u0930\u0932\u0005\u0086\u0000\u0000\u0931\u0933\u0003\u012e"+
		"\u0097\u0000\u0932\u0931\u0001\u0000\u0000\u0000\u0932\u0933\u0001\u0000"+
		"\u0000\u0000\u0933\u0934\u0001\u0000\u0000\u0000\u0934\u0935\u0005\u0087"+
		"\u0000\u0000\u0935\u012d\u0001\u0000\u0000\u0000\u0936\u093b\u0003\u0102"+
		"\u0081\u0000\u0937\u0938\u0005{\u0000\u0000\u0938\u093a\u0003\u0102\u0081"+
		"\u0000\u0939\u0937\u0001\u0000\u0000\u0000\u093a\u093d\u0001\u0000\u0000"+
		"\u0000\u093b\u0939\u0001\u0000\u0000\u0000\u093b\u093c\u0001\u0000\u0000"+
		"\u0000\u093c\u093f\u0001\u0000\u0000\u0000\u093d\u093b\u0001\u0000\u0000"+
		"\u0000\u093e\u0940\u0005{\u0000\u0000\u093f\u093e\u0001\u0000\u0000\u0000"+
		"\u093f\u0940\u0001\u0000\u0000\u0000\u0940\u012f\u0001\u0000\u0000\u0000"+
		"\u0941\u0944\u0003\u0174\u00ba\u0000\u0942\u0944\u0003\u018a\u00c5\u0000"+
		"\u0943\u0941\u0001\u0000\u0000\u0000\u0943\u0942\u0001\u0000\u0000\u0000"+
		"\u0944\u0131\u0001\u0000\u0000\u0000\u0945\u0956\u0003\u0134\u009a\u0000"+
		"\u0946\u0956\u0003\u0156\u00ab\u0000\u0947\u0956\u0003\u0152\u00a9\u0000"+
		"\u0948\u0949\u0005\u000b\u0000\u0000\u0949\u094a\u0005r\u0000\u0000\u094a"+
		"\u094f\u0003\u016e\u00b7\u0000\u094b\u094c\u0005{\u0000\u0000\u094c\u094e"+
		"\u0003\u016e\u00b7\u0000\u094d\u094b\u0001\u0000\u0000\u0000\u094e\u0951"+
		"\u0001\u0000\u0000\u0000\u094f\u094d\u0001\u0000\u0000\u0000\u094f\u0950"+
		"\u0001\u0000\u0000\u0000\u0950\u0952\u0001\u0000\u0000\u0000\u0951\u094f"+
		"\u0001\u0000\u0000\u0000\u0952\u0953\u0005q\u0000\u0000\u0953\u0954\u0003"+
		"\u0132\u0099\u0000\u0954\u0956\u0001\u0000\u0000\u0000\u0955\u0945\u0001"+
		"\u0000\u0000\u0000\u0955\u0946\u0001\u0000\u0000\u0000\u0955\u0947\u0001"+
		"\u0000\u0000\u0000\u0955\u0948\u0001\u0000\u0000\u0000\u0956\u0133\u0001"+
		"\u0000\u0000\u0000\u0957\u0966\u0003\u0136\u009b\u0000\u0958\u0966\u0003"+
		"\u0158\u00ac\u0000\u0959\u0966\u0003\u0154\u00aa\u0000\u095a\u0966\u0003"+
		"\u0190\u00c8\u0000\u095b\u0966\u0003\u013a\u009d\u0000\u095c\u0966\u0003"+
		"\u0138\u009c\u0000\u095d\u0966\u0003\u0142\u00a1\u0000\u095e\u0966\u0003"+
		"\u0140\u00a0\u0000\u095f\u0966\u0003\u013c\u009e\u0000\u0960\u0966\u0003"+
		"\u013e\u009f\u0000\u0961\u0966\u0003\u015c\u00ae\u0000\u0962\u0966\u0003"+
		"\u018e\u00c7\u0000\u0963\u0966\u0003\u0144\u00a2\u0000\u0964\u0966\u0003"+
		"\u0002\u0001\u0000\u0965\u0957\u0001\u0000\u0000\u0000\u0965\u0958\u0001"+
		"\u0000\u0000\u0000\u0965\u0959\u0001\u0000\u0000\u0000\u0965\u095a\u0001"+
		"\u0000\u0000\u0000\u0965\u095b\u0001\u0000\u0000\u0000\u0965\u095c\u0001"+
		"\u0000\u0000\u0000\u0965\u095d\u0001\u0000\u0000\u0000\u0965\u095e\u0001"+
		"\u0000\u0000\u0000\u0965\u095f\u0001\u0000\u0000\u0000\u0965\u0960\u0001"+
		"\u0000\u0000\u0000\u0965\u0961\u0001\u0000\u0000\u0000\u0965\u0962\u0001"+
		"\u0000\u0000\u0000\u0965\u0963\u0001\u0000\u0000\u0000\u0965\u0964\u0001"+
		"\u0000\u0000\u0000\u0966\u0135\u0001\u0000\u0000\u0000\u0967\u0968\u0005"+
		"\u0088\u0000\u0000\u0968\u0969\u0003\u0132\u0099\u0000\u0969\u096a\u0005"+
		"\u0089\u0000\u0000\u096a\u0137\u0001\u0000\u0000\u0000\u096b\u096c\u0005"+
		"^\u0000\u0000\u096c\u0139\u0001\u0000\u0000\u0000\u096d\u0978\u0005\u0088"+
		"\u0000\u0000\u096e\u096f\u0003\u0132\u0099\u0000\u096f\u0970\u0005{\u0000"+
		"\u0000\u0970\u0972\u0001\u0000\u0000\u0000\u0971\u096e\u0001\u0000\u0000"+
		"\u0000\u0972\u0973\u0001\u0000\u0000\u0000\u0973\u0971\u0001\u0000\u0000"+
		"\u0000\u0973\u0974\u0001\u0000\u0000\u0000\u0974\u0976\u0001\u0000\u0000"+
		"\u0000\u0975\u0977\u0003\u0132\u0099\u0000\u0976\u0975\u0001\u0000\u0000"+
		"\u0000\u0976\u0977\u0001\u0000\u0000\u0000\u0977\u0979\u0001\u0000\u0000"+
		"\u0000\u0978\u0971\u0001\u0000\u0000\u0000\u0978\u0979\u0001\u0000\u0000"+
		"\u0000\u0979\u097a\u0001\u0000\u0000\u0000\u097a\u097b\u0005\u0089\u0000"+
		"\u0000\u097b\u013b\u0001\u0000\u0000\u0000\u097c\u097d\u0005\u0086\u0000"+
		"\u0000\u097d\u097e\u0003\u0132\u0099\u0000\u097e\u097f\u0005|\u0000\u0000"+
		"\u097f\u0980\u0003\u00a0P\u0000\u0980\u0981\u0005\u0087\u0000\u0000\u0981"+
		"\u013d\u0001\u0000\u0000\u0000\u0982\u0983\u0005\u0086\u0000\u0000\u0983"+
		"\u0984\u0003\u0132\u0099\u0000\u0984\u0985\u0005\u0087\u0000\u0000\u0985"+
		"\u013f\u0001\u0000\u0000\u0000\u0986\u0988\u0007\u0004\u0000\u0000\u0987"+
		"\u0989\u0003\u016e\u00b7\u0000\u0988\u0987\u0001\u0000\u0000\u0000\u0988"+
		"\u0989\u0001\u0000\u0000\u0000\u0989\u098b\u0001\u0000\u0000\u0000\u098a"+
		"\u098c\u0005\u0019\u0000\u0000\u098b\u098a\u0001\u0000\u0000\u0000\u098b"+
		"\u098c\u0001\u0000\u0000\u0000\u098c\u098e\u0001\u0000\u0000\u0000\u098d"+
		"\u098f\u0007\u0005\u0000\u0000\u098e\u098d\u0001\u0000\u0000\u0000\u098e"+
		"\u098f\u0001\u0000\u0000\u0000\u098f\u0990\u0001\u0000\u0000\u0000\u0990"+
		"\u0991\u0003\u0134\u009a\u0000\u0991\u0141\u0001\u0000\u0000\u0000\u0992"+
		"\u0993\u0005Z\u0000\u0000\u0993\u0994\u0007\u0005\u0000\u0000\u0994\u0995"+
		"\u0003\u0134\u009a\u0000\u0995\u0143\u0001\u0000\u0000\u0000\u0996\u0998"+
		"\u0003\u008eG\u0000\u0997\u0996\u0001\u0000\u0000\u0000\u0997\u0998\u0001"+
		"\u0000\u0000\u0000\u0998\u0999\u0001\u0000\u0000\u0000\u0999\u099a\u0003"+
		"\u0146\u00a3\u0000\u099a\u099b\u0005\n\u0000\u0000\u099b\u099d\u0005\u0088"+
		"\u0000\u0000\u099c\u099e\u0003\u014a\u00a5\u0000\u099d\u099c\u0001\u0000"+
		"\u0000\u0000\u099d\u099e\u0001\u0000\u0000\u0000\u099e\u099f\u0001\u0000"+
		"\u0000\u0000\u099f\u09a1\u0005\u0089\u0000\u0000\u09a0\u09a2\u0003\u0148"+
		"\u00a4\u0000\u09a1\u09a0\u0001\u0000\u0000\u0000\u09a1\u09a2\u0001\u0000"+
		"\u0000\u0000\u09a2\u0145\u0001\u0000\u0000\u0000\u09a3\u09a5\u0005!\u0000"+
		"\u0000\u09a4\u09a3\u0001\u0000\u0000\u0000\u09a4\u09a5\u0001\u0000\u0000"+
		"\u0000\u09a5\u09aa\u0001\u0000\u0000\u0000\u09a6\u09a8\u0005\b\u0000\u0000"+
		"\u09a7\u09a9\u0003:\u001d\u0000\u09a8\u09a7\u0001\u0000\u0000\u0000\u09a8"+
		"\u09a9\u0001\u0000\u0000\u0000\u09a9\u09ab\u0001\u0000\u0000\u0000\u09aa"+
		"\u09a6\u0001\u0000\u0000\u0000\u09aa\u09ab\u0001\u0000\u0000\u0000\u09ab"+
		"\u0147\u0001\u0000\u0000\u0000\u09ac\u09ad\u0005\u007f\u0000\u0000\u09ad"+
		"\u09ae\u0003\u0134\u009a\u0000\u09ae\u0149\u0001\u0000\u0000\u0000\u09af"+
		"\u09b2\u0003\u014c\u00a6\u0000\u09b0\u09b2\u0003\u0150\u00a8\u0000\u09b1"+
		"\u09af\u0001\u0000\u0000\u0000\u09b1\u09b0\u0001\u0000\u0000\u0000\u09b2"+
		"\u014b\u0001\u0000\u0000\u0000\u09b3\u09b8\u0003\u014e\u00a7\u0000\u09b4"+
		"\u09b5\u0005{\u0000\u0000\u09b5\u09b7\u0003\u014e\u00a7\u0000\u09b6\u09b4"+
		"\u0001\u0000\u0000\u0000\u09b7\u09ba\u0001\u0000\u0000\u0000\u09b8\u09b6"+
		"\u0001\u0000\u0000\u0000\u09b8\u09b9\u0001\u0000\u0000\u0000\u09b9\u09bc"+
		"\u0001\u0000\u0000\u0000\u09ba\u09b8\u0001\u0000\u0000\u0000\u09bb\u09bd"+
		"\u0005{\u0000\u0000\u09bc\u09bb\u0001\u0000\u0000\u0000\u09bc\u09bd\u0001"+
		"\u0000\u0000\u0000\u09bd\u014d\u0001\u0000\u0000\u0000\u09be\u09c0\u0003"+
		"\u0094J\u0000\u09bf\u09be\u0001\u0000\u0000\u0000\u09c0\u09c3\u0001\u0000"+
		"\u0000\u0000\u09c1\u09bf\u0001\u0000\u0000\u0000\u09c1\u09c2\u0001\u0000"+
		"\u0000\u0000\u09c2\u09c9\u0001\u0000\u0000\u0000\u09c3\u09c1\u0001\u0000"+
		"\u0000\u0000\u09c4\u09c7\u0003\u019a\u00cd\u0000\u09c5\u09c7\u0005v\u0000"+
		"\u0000\u09c6\u09c4\u0001\u0000\u0000\u0000\u09c6\u09c5\u0001\u0000\u0000"+
		"\u0000\u09c7\u09c8\u0001\u0000\u0000\u0000\u09c8\u09ca\u0005}\u0000\u0000"+
		"\u09c9\u09c6\u0001\u0000\u0000\u0000\u09c9\u09ca\u0001\u0000\u0000\u0000"+
		"\u09ca\u09cd\u0001\u0000\u0000\u0000\u09cb\u09ce\u0003\u0132\u0099\u0000"+
		"\u09cc\u09ce\u0005y\u0000\u0000\u09cd\u09cb\u0001\u0000\u0000\u0000\u09cd"+
		"\u09cc\u0001\u0000\u0000\u0000\u09ce\u014f\u0001\u0000\u0000\u0000\u09cf"+
		"\u09d0\u0003\u014e\u00a7\u0000\u09d0\u09d1\u0005{\u0000\u0000\u09d1\u09d3"+
		"\u0001\u0000\u0000\u0000\u09d2\u09cf\u0001\u0000\u0000\u0000\u09d3\u09d6"+
		"\u0001\u0000\u0000\u0000\u09d4\u09d2\u0001\u0000\u0000\u0000\u09d4\u09d5"+
		"\u0001\u0000\u0000\u0000\u09d5\u09d7\u0001\u0000\u0000\u0000\u09d6\u09d4"+
		"\u0001\u0000\u0000\u0000\u09d7\u09d8\u0003\u014e\u00a7\u0000\u09d8\u09dc"+
		"\u0005{\u0000\u0000\u09d9\u09db\u0003\u0094J\u0000\u09da\u09d9\u0001\u0000"+
		"\u0000\u0000\u09db\u09de\u0001\u0000\u0000\u0000\u09dc\u09da\u0001\u0000"+
		"\u0000\u0000\u09dc\u09dd\u0001\u0000\u0000\u0000\u09dd\u09df\u0001\u0000"+
		"\u0000\u0000\u09de\u09dc\u0001\u0000\u0000\u0000\u09df\u09e0\u0005y\u0000"+
		"\u0000\u09e0\u0151\u0001\u0000\u0000\u0000\u09e1\u09e2\u0005(\u0000\u0000"+
		"\u09e2\u09e4\u0004\u00a9\u0018\u0000\u09e3\u09e5\u0005Z\u0000\u0000\u09e4"+
		"\u09e3\u0001\u0000\u0000\u0000\u09e4\u09e5\u0001\u0000\u0000\u0000\u09e5"+
		"\u09e6\u0001\u0000\u0000\u0000\u09e6\u09ec\u0003\u015e\u00af\u0000\u09e7"+
		"\u09e9\u0005Z\u0000\u0000\u09e8\u09e7\u0001\u0000\u0000\u0000\u09e8\u09e9"+
		"\u0001\u0000\u0000\u0000\u09e9\u09ea\u0001\u0000\u0000\u0000\u09ea\u09ec"+
		"\u0003\u015e\u00af\u0000\u09eb\u09e1\u0001\u0000\u0000\u0000\u09eb\u09e8"+
		"\u0001\u0000\u0000\u0000\u09ec\u0153\u0001\u0000\u0000\u0000\u09ed\u09ef"+
		"\u0005(\u0000\u0000\u09ee\u09ed\u0001\u0000\u0000\u0000\u09ee\u09ef\u0001"+
		"\u0000\u0000\u0000\u09ef\u09f1\u0001\u0000\u0000\u0000\u09f0\u09f2\u0005"+
		"Z\u0000\u0000\u09f1\u09f0\u0001\u0000\u0000\u0000\u09f1\u09f2\u0001\u0000"+
		"\u0000\u0000\u09f2\u09f3\u0001\u0000\u0000\u0000\u09f3\u09f4\u0003\u0164"+
		"\u00b2\u0000\u09f4\u0155\u0001\u0000\u0000\u0000\u09f5\u09f7\u0005\r\u0000"+
		"\u0000\u09f6\u09f8\u0005\u0003\u0000\u0000\u09f7\u09f6\u0001\u0000\u0000"+
		"\u0000\u09f7\u09f8\u0001\u0000\u0000\u0000\u09f8\u09f9\u0001\u0000\u0000"+
		"\u0000\u09f9\u09fa\u0003\u015e\u00af\u0000\u09fa\u0157\u0001\u0000\u0000"+
		"\u0000\u09fb\u09fd\u0005\r\u0000\u0000\u09fc\u09fe\u0005\u0003\u0000\u0000"+
		"\u09fd\u09fc\u0001\u0000\u0000\u0000\u09fd\u09fe\u0001\u0000\u0000\u0000"+
		"\u09fe\u09ff\u0001\u0000\u0000\u0000\u09ff\u0a06\u0003\u015a\u00ad\u0000"+
		"\u0a00\u0a02\u0005\r\u0000\u0000\u0a01\u0a03\u0005\u0003\u0000\u0000\u0a02"+
		"\u0a01\u0001\u0000\u0000\u0000\u0a02\u0a03\u0001\u0000\u0000\u0000\u0a03"+
		"\u0a04\u0001\u0000\u0000\u0000\u0a04\u0a06\u0003\u0164\u00b2\u0000\u0a05"+
		"\u09fb\u0001\u0000\u0000\u0000\u0a05\u0a00\u0001\u0000\u0000\u0000\u0a06"+
		"\u0159\u0001\u0000\u0000\u0000\u0a07\u0a09\u0003\u008eG\u0000\u0a08\u0a07"+
		"\u0001\u0000\u0000\u0000\u0a08\u0a09\u0001\u0000\u0000\u0000\u0a09\u0a0b"+
		"\u0001\u0000\u0000\u0000\u0a0a\u0a0c\u0005&\u0000\u0000\u0a0b\u0a0a\u0001"+
		"\u0000\u0000\u0000\u0a0b\u0a0c\u0001\u0000\u0000\u0000\u0a0c\u0a0d\u0001"+
		"\u0000\u0000\u0000\u0a0d\u0a0e\u0007\f\u0000\u0000\u0a0e\u0a10\u0005\u0088"+
		"\u0000\u0000\u0a0f\u0a11\u0003\u014a\u00a5\u0000\u0a10\u0a0f\u0001\u0000"+
		"\u0000\u0000\u0a10\u0a11\u0001\u0000\u0000\u0000\u0a11\u0a12\u0001\u0000"+
		"\u0000\u0000\u0a12\u0a15\u0005\u0089\u0000\u0000\u0a13\u0a14\u0005\u007f"+
		"\u0000\u0000\u0a14\u0a16\u0003\u0132\u0099\u0000\u0a15\u0a13\u0001\u0000"+
		"\u0000\u0000\u0a15\u0a16\u0001\u0000\u0000\u0000\u0a16\u015b\u0001\u0000"+
		"\u0000\u0000\u0a17\u0a18\u0005v\u0000\u0000\u0a18\u015d\u0001\u0000\u0000"+
		"\u0000\u0a19\u0a1e\u0003\u0160\u00b0\u0000\u0a1a\u0a1b\u0005X\u0000\u0000"+
		"\u0a1b\u0a1d\u0003\u0160\u00b0\u0000\u0a1c\u0a1a\u0001\u0000\u0000\u0000"+
		"\u0a1d\u0a20\u0001\u0000\u0000\u0000\u0a1e\u0a1c\u0001\u0000\u0000\u0000"+
		"\u0a1e\u0a1f\u0001\u0000\u0000\u0000\u0a1f\u0a22\u0001\u0000\u0000\u0000"+
		"\u0a20\u0a1e\u0001\u0000\u0000\u0000\u0a21\u0a23\u0005X\u0000\u0000\u0a22"+
		"\u0a21\u0001\u0000\u0000\u0000\u0a22\u0a23\u0001\u0000\u0000\u0000\u0a23"+
		"\u015f\u0001\u0000\u0000\u0000\u0a24\u0a2a\u0003\u0162\u00b1\u0000\u0a25"+
		"\u0a26\u0005\u0088\u0000\u0000\u0a26\u0a27\u0003\u015e\u00af\u0000\u0a27"+
		"\u0a28\u0005\u0089\u0000\u0000\u0a28\u0a2a\u0001\u0000\u0000\u0000\u0a29"+
		"\u0a24\u0001\u0000\u0000\u0000\u0a29\u0a25\u0001\u0000\u0000\u0000\u0a2a"+
		"\u0161\u0001\u0000\u0000\u0000\u0a2b\u0a30\u0003\u016e\u00b7\u0000\u0a2c"+
		"\u0a30\u0003\u0164\u00b2\u0000\u0a2d\u0a30\u0003\u015a\u00ad\u0000\u0a2e"+
		"\u0a30\u0003\u0166\u00b3\u0000\u0a2f\u0a2b\u0001\u0000\u0000\u0000\u0a2f"+
		"\u0a2c\u0001\u0000\u0000\u0000\u0a2f\u0a2d\u0001\u0000\u0000\u0000\u0a2f"+
		"\u0a2e\u0001\u0000\u0000\u0000\u0a30\u0163\u0001\u0000\u0000\u0000\u0a31"+
		"\u0a33\u0005^\u0000\u0000\u0a32\u0a31\u0001\u0000\u0000\u0000\u0a32\u0a33"+
		"\u0001\u0000\u0000\u0000\u0a33\u0a35\u0001\u0000\u0000\u0000\u0a34\u0a36"+
		"\u0005\u0083\u0000\u0000\u0a35\u0a34\u0001\u0000\u0000\u0000\u0a35\u0a36"+
		"\u0001\u0000\u0000\u0000\u0a36\u0a39\u0001\u0000\u0000\u0000\u0a37\u0a38"+
		"\u0005_\u0000\u0000\u0a38\u0a3a\u0005\u0003\u0000\u0000\u0a39\u0a37\u0001"+
		"\u0000\u0000\u0000\u0a39\u0a3a\u0001\u0000\u0000\u0000\u0a3a\u0a3c\u0001"+
		"\u0000\u0000\u0000\u0a3b\u0a3d\u0003\u008eG\u0000\u0a3c\u0a3b\u0001\u0000"+
		"\u0000\u0000\u0a3c\u0a3d\u0001\u0000\u0000\u0000\u0a3d\u0a3e\u0001\u0000"+
		"\u0000\u0000\u0a3e\u0a51\u0003\u0190\u00c8\u0000\u0a3f\u0a41\u0005\u0088"+
		"\u0000\u0000\u0a40\u0a42\u0005^\u0000\u0000\u0a41\u0a40\u0001\u0000\u0000"+
		"\u0000\u0a41\u0a42\u0001\u0000\u0000\u0000\u0a42\u0a44\u0001\u0000\u0000"+
		"\u0000\u0a43\u0a45\u0005\u0083\u0000\u0000\u0a44\u0a43\u0001\u0000\u0000"+
		"\u0000\u0a44\u0a45\u0001\u0000\u0000\u0000\u0a45\u0a48\u0001\u0000\u0000"+
		"\u0000\u0a46\u0a47\u0005_\u0000\u0000\u0a47\u0a49\u0005\u0003\u0000\u0000"+
		"\u0a48\u0a46\u0001\u0000\u0000\u0000\u0a48\u0a49\u0001\u0000\u0000\u0000"+
		"\u0a49\u0a4b\u0001\u0000\u0000\u0000\u0a4a\u0a4c\u0003\u008eG\u0000\u0a4b"+
		"\u0a4a\u0001\u0000\u0000\u0000\u0a4b\u0a4c\u0001\u0000\u0000\u0000\u0a4c"+
		"\u0a4d\u0001\u0000\u0000\u0000\u0a4d\u0a4e\u0003\u0190\u00c8\u0000\u0a4e"+
		"\u0a4f\u0005\u0089\u0000\u0000\u0a4f\u0a51\u0001\u0000\u0000\u0000\u0a50"+
		"\u0a32\u0001\u0000\u0000\u0000\u0a50\u0a3f\u0001\u0000\u0000\u0000\u0a51"+
		"\u0165\u0001\u0000\u0000\u0000\u0a52\u0a53\u0005#\u0000\u0000\u0a53\u0a54"+
		"\u0003\u0168\u00b4\u0000\u0a54\u0167\u0001\u0000\u0000\u0000\u0a55\u0a56"+
		"\u0005r\u0000\u0000\u0a56\u0a67\u0005q\u0000\u0000\u0a57\u0a5d\u0005r"+
		"\u0000\u0000\u0a58\u0a59\u0003\u016a\u00b5\u0000\u0a59\u0a5a\u0005{\u0000"+
		"\u0000\u0a5a\u0a5c\u0001\u0000\u0000\u0000\u0a5b\u0a58\u0001\u0000\u0000"+
		"\u0000\u0a5c\u0a5f\u0001\u0000\u0000\u0000\u0a5d\u0a5b\u0001\u0000\u0000"+
		"\u0000\u0a5d\u0a5e\u0001\u0000\u0000\u0000\u0a5e\u0a60\u0001\u0000\u0000"+
		"\u0000\u0a5f\u0a5d\u0001\u0000\u0000\u0000\u0a60\u0a62\u0003\u016a\u00b5"+
		"\u0000\u0a61\u0a63\u0005{\u0000\u0000\u0a62\u0a61\u0001\u0000\u0000\u0000"+
		"\u0a62\u0a63\u0001\u0000\u0000\u0000\u0a63\u0a64\u0001\u0000\u0000\u0000"+
		"\u0a64\u0a65\u0005q\u0000\u0000\u0a65\u0a67\u0001\u0000\u0000\u0000\u0a66"+
		"\u0a55\u0001\u0000\u0000\u0000\u0a66\u0a57\u0001\u0000\u0000\u0000\u0a67"+
		"\u0169\u0001\u0000\u0000\u0000\u0a68\u0a6c\u0003\u016e\u00b7\u0000\u0a69"+
		"\u0a6c\u0003\u019a\u00cd\u0000\u0a6a\u0a6c\u0005\u001a\u0000\u0000\u0a6b"+
		"\u0a68\u0001\u0000\u0000\u0000\u0a6b\u0a69\u0001\u0000\u0000\u0000\u0a6b"+
		"\u0a6a\u0001\u0000\u0000\u0000\u0a6c\u016b\u0001\u0000\u0000\u0000\u0a6d"+
		"\u0a6e\u0003\u016e\u00b7\u0000\u0a6e\u0a6f\u0005X\u0000\u0000\u0a6f\u0a71"+
		"\u0001\u0000\u0000\u0000\u0a70\u0a6d\u0001\u0000\u0000\u0000\u0a71\u0a74"+
		"\u0001\u0000\u0000\u0000\u0a72\u0a70\u0001\u0000\u0000\u0000\u0a72\u0a73"+
		"\u0001\u0000\u0000\u0000\u0a73\u0a76\u0001\u0000\u0000\u0000\u0a74\u0a72"+
		"\u0001\u0000\u0000\u0000\u0a75\u0a77\u0003\u016e\u00b7\u0000\u0a76\u0a75"+
		"\u0001\u0000\u0000\u0000\u0a76\u0a77\u0001\u0000\u0000\u0000\u0a77\u016d"+
		"\u0001\u0000\u0000\u0000\u0a78\u0a79\u0007\r\u0000\u0000\u0a79\u016f\u0001"+
		"\u0000\u0000\u0000\u0a7a\u0a7c\u0005~\u0000\u0000\u0a7b\u0a7a\u0001\u0000"+
		"\u0000\u0000\u0a7b\u0a7c\u0001\u0000\u0000\u0000\u0a7c\u0a7d\u0001\u0000"+
		"\u0000\u0000\u0a7d\u0a82\u0003\u0172\u00b9\u0000\u0a7e\u0a7f\u0005~\u0000"+
		"\u0000\u0a7f\u0a81\u0003\u0172\u00b9\u0000\u0a80\u0a7e\u0001\u0000\u0000"+
		"\u0000\u0a81\u0a84\u0001\u0000\u0000\u0000\u0a82\u0a80\u0001\u0000\u0000"+
		"\u0000\u0a82\u0a83\u0001\u0000\u0000\u0000\u0a83\u0171\u0001\u0000\u0000"+
		"\u0000\u0a84\u0a82\u0001\u0000\u0000\u0000\u0a85\u0a8c\u0003\u019a\u00cd"+
		"\u0000\u0a86\u0a8c\u0005\u001d\u0000\u0000\u0a87\u0a8c\u0005\u0018\u0000"+
		"\u0000\u0a88\u0a8c\u0005\u0005\u0000\u0000\u0a89\u0a8c\u0005=\u0000\u0000"+
		"\u0a8a\u0a8c\u00057\u0000\u0000\u0a8b\u0a85\u0001\u0000\u0000\u0000\u0a8b"+
		"\u0a86\u0001\u0000\u0000\u0000\u0a8b\u0a87\u0001\u0000\u0000\u0000\u0a8b"+
		"\u0a88\u0001\u0000\u0000\u0000\u0a8b\u0a89\u0001\u0000\u0000\u0000\u0a8b"+
		"\u0a8a\u0001\u0000\u0000\u0000\u0a8c\u0173\u0001\u0000\u0000\u0000\u0a8d"+
		"\u0a8f\u0005~\u0000\u0000\u0a8e\u0a8d\u0001\u0000\u0000\u0000\u0a8e\u0a8f"+
		"\u0001\u0000\u0000\u0000\u0a8f\u0a90\u0001\u0000\u0000\u0000\u0a90\u0a95"+
		"\u0003\u0176\u00bb\u0000\u0a91\u0a92\u0005~\u0000\u0000\u0a92\u0a94\u0003"+
		"\u0176\u00bb\u0000\u0a93\u0a91\u0001\u0000\u0000\u0000\u0a94\u0a97\u0001"+
		"\u0000\u0000\u0000\u0a95\u0a93\u0001\u0000\u0000\u0000\u0a95\u0a96\u0001"+
		"\u0000\u0000\u0000\u0a96\u0175\u0001\u0000\u0000\u0000\u0a97\u0a95\u0001"+
		"\u0000\u0000\u0000\u0a98\u0a9b\u0003\u0178\u00bc\u0000\u0a99\u0a9a\u0005"+
		"~\u0000\u0000\u0a9a\u0a9c\u0003\u017a\u00bd\u0000\u0a9b\u0a99\u0001\u0000"+
		"\u0000\u0000\u0a9b\u0a9c\u0001\u0000\u0000\u0000\u0a9c\u0177\u0001\u0000"+
		"\u0000\u0000\u0a9d\u0aa5\u0003\u019a\u00cd\u0000\u0a9e\u0aa5\u0005(\u0000"+
		"\u0000\u0a9f\u0aa5\u0005\u001d\u0000\u0000\u0aa0\u0aa5\u0005\u0018\u0000"+
		"\u0000\u0aa1\u0aa5\u0005\u001a\u0000\u0000\u0aa2\u0aa5\u0005\u0005\u0000"+
		"\u0000\u0aa3\u0aa5\u0005=\u0000\u0000\u0aa4\u0a9d\u0001\u0000\u0000\u0000"+
		"\u0aa4\u0a9e\u0001\u0000\u0000\u0000\u0aa4\u0a9f\u0001\u0000\u0000\u0000"+
		"\u0aa4\u0aa0\u0001\u0000\u0000\u0000\u0aa4\u0aa1\u0001\u0000\u0000\u0000"+
		"\u0aa4\u0aa2\u0001\u0000\u0000\u0000\u0aa4\u0aa3\u0001\u0000\u0000\u0000"+
		"\u0aa5\u0179\u0001\u0000\u0000\u0000\u0aa6\u0aa7\u0005r\u0000\u0000\u0aa7"+
		"\u0ad2\u0005q\u0000\u0000\u0aa8\u0aa9\u0005r\u0000\u0000\u0aa9\u0aac\u0003"+
		"\u0180\u00c0\u0000\u0aaa\u0aab\u0005{\u0000\u0000\u0aab\u0aad\u0003\u0182"+
		"\u00c1\u0000\u0aac\u0aaa\u0001\u0000\u0000\u0000\u0aac\u0aad\u0001\u0000"+
		"\u0000\u0000\u0aad\u0ab0\u0001\u0000\u0000\u0000\u0aae\u0aaf\u0005{\u0000"+
		"\u0000\u0aaf\u0ab1\u0003\u0184\u00c2\u0000\u0ab0\u0aae\u0001\u0000\u0000"+
		"\u0000\u0ab0\u0ab1\u0001\u0000\u0000\u0000\u0ab1\u0ab3\u0001\u0000\u0000"+
		"\u0000\u0ab2\u0ab4\u0005{\u0000\u0000\u0ab3\u0ab2\u0001\u0000\u0000\u0000"+
		"\u0ab3\u0ab4\u0001\u0000\u0000\u0000\u0ab4\u0ab5\u0001\u0000\u0000\u0000"+
		"\u0ab5\u0ab6\u0005q\u0000\u0000\u0ab6\u0ad2\u0001\u0000\u0000\u0000\u0ab7"+
		"\u0ab8\u0005r\u0000\u0000\u0ab8\u0abb\u0003\u0182\u00c1\u0000\u0ab9\u0aba"+
		"\u0005{\u0000\u0000\u0aba\u0abc\u0003\u0184\u00c2\u0000\u0abb\u0ab9\u0001"+
		"\u0000\u0000\u0000\u0abb\u0abc\u0001\u0000\u0000\u0000\u0abc\u0abe\u0001"+
		"\u0000\u0000\u0000\u0abd\u0abf\u0005{\u0000\u0000\u0abe\u0abd\u0001\u0000"+
		"\u0000\u0000\u0abe\u0abf\u0001\u0000\u0000\u0000\u0abf\u0ac0\u0001\u0000"+
		"\u0000\u0000\u0ac0\u0ac1\u0005q\u0000\u0000\u0ac1\u0ad2\u0001\u0000\u0000"+
		"\u0000\u0ac2\u0ac8\u0005r\u0000\u0000\u0ac3\u0ac4\u0003\u017c\u00be\u0000"+
		"\u0ac4\u0ac5\u0005{\u0000\u0000\u0ac5\u0ac7\u0001\u0000\u0000\u0000\u0ac6"+
		"\u0ac3\u0001\u0000\u0000\u0000\u0ac7\u0aca\u0001\u0000\u0000\u0000\u0ac8"+
		"\u0ac6\u0001\u0000\u0000\u0000\u0ac8\u0ac9\u0001\u0000\u0000\u0000\u0ac9"+
		"\u0acb\u0001\u0000\u0000\u0000\u0aca\u0ac8\u0001\u0000\u0000\u0000\u0acb"+
		"\u0acd\u0003\u017c\u00be\u0000\u0acc\u0ace\u0005{\u0000\u0000\u0acd\u0acc"+
		"\u0001\u0000\u0000\u0000\u0acd\u0ace\u0001\u0000\u0000\u0000\u0ace\u0acf"+
		"\u0001\u0000\u0000\u0000\u0acf\u0ad0\u0005q\u0000\u0000\u0ad0\u0ad2\u0001"+
		"\u0000\u0000\u0000\u0ad1\u0aa6\u0001\u0000\u0000\u0000\u0ad1\u0aa8\u0001"+
		"\u0000\u0000\u0000\u0ad1\u0ab7\u0001\u0000\u0000\u0000\u0ad1\u0ac2\u0001"+
		"\u0000\u0000\u0000\u0ad2\u017b\u0001\u0000\u0000\u0000\u0ad3\u0ad9\u0003"+
		"\u016e\u00b7\u0000\u0ad4\u0ad9\u0003\u0132\u0099\u0000\u0ad5\u0ad9\u0003"+
		"\u017e\u00bf\u0000\u0ad6\u0ad9\u0003\u0186\u00c3\u0000\u0ad7\u0ad9\u0003"+
		"\u0188\u00c4\u0000\u0ad8\u0ad3\u0001\u0000\u0000\u0000\u0ad8\u0ad4\u0001"+
		"\u0000\u0000\u0000\u0ad8\u0ad5\u0001\u0000\u0000\u0000\u0ad8\u0ad6\u0001"+
		"\u0000\u0000\u0000\u0ad8\u0ad7\u0001\u0000\u0000\u0000\u0ad9\u017d\u0001"+
		"\u0000\u0000\u0000\u0ada\u0ae1\u0003\u00b0X\u0000\u0adb\u0add\u0005Y\u0000"+
		"\u0000\u0adc\u0adb\u0001\u0000\u0000\u0000\u0adc\u0add\u0001\u0000\u0000"+
		"\u0000\u0add\u0ade\u0001\u0000\u0000\u0000\u0ade\u0ae1\u0003\u00acV\u0000"+
		"\u0adf\u0ae1\u0003\u0172\u00b9\u0000\u0ae0\u0ada\u0001\u0000\u0000\u0000"+
		"\u0ae0\u0adc\u0001\u0000\u0000\u0000\u0ae0\u0adf\u0001\u0000\u0000\u0000"+
		"\u0ae1\u017f\u0001\u0000\u0000\u0000\u0ae2\u0ae7\u0003\u016e\u00b7\u0000"+
		"\u0ae3\u0ae4\u0005{\u0000\u0000\u0ae4\u0ae6\u0003\u016e\u00b7\u0000\u0ae5"+
		"\u0ae3\u0001\u0000\u0000\u0000\u0ae6\u0ae9\u0001\u0000\u0000\u0000\u0ae7"+
		"\u0ae5\u0001\u0000\u0000\u0000\u0ae7\u0ae8\u0001\u0000\u0000\u0000\u0ae8"+
		"\u0181\u0001\u0000\u0000\u0000\u0ae9\u0ae7\u0001\u0000\u0000\u0000\u0aea"+
		"\u0aef\u0003\u0132\u0099\u0000\u0aeb\u0aec\u0005{\u0000\u0000\u0aec\u0aee"+
		"\u0003\u0132\u0099\u0000\u0aed\u0aeb\u0001\u0000\u0000\u0000\u0aee\u0af1"+
		"\u0001\u0000\u0000\u0000\u0aef\u0aed\u0001\u0000\u0000\u0000\u0aef\u0af0"+
		"\u0001\u0000\u0000\u0000\u0af0\u0183\u0001\u0000\u0000\u0000\u0af1\u0aef"+
		"\u0001\u0000\u0000\u0000\u0af2\u0af7\u0003\u0186\u00c3\u0000\u0af3\u0af4"+
		"\u0005{\u0000\u0000\u0af4\u0af6\u0003\u0186\u00c3\u0000\u0af5\u0af3\u0001"+
		"\u0000\u0000\u0000\u0af6\u0af9\u0001\u0000\u0000\u0000\u0af7\u0af5\u0001"+
		"\u0000\u0000\u0000\u0af7\u0af8\u0001\u0000\u0000\u0000\u0af8\u0185\u0001"+
		"\u0000\u0000\u0000\u0af9\u0af7\u0001\u0000\u0000\u0000\u0afa\u0afc\u0003"+
		"\u019a\u00cd\u0000\u0afb\u0afd\u0005~\u0000\u0000\u0afc\u0afb\u0001\u0000"+
		"\u0000\u0000\u0afc\u0afd\u0001\u0000\u0000\u0000\u0afd\u0b00\u0001\u0000"+
		"\u0000\u0000\u0afe\u0b01\u0003\u017a\u00bd\u0000\u0aff\u0b01\u0003\u0194"+
		"\u00ca\u0000\u0b00\u0afe\u0001\u0000\u0000\u0000\u0b00\u0aff\u0001\u0000"+
		"\u0000\u0000\u0b00\u0b01\u0001\u0000\u0000\u0000\u0b01\u0b02\u0001\u0000"+
		"\u0000\u0000\u0b02\u0b05\u0005n\u0000\u0000\u0b03\u0b06\u0003\u0132\u0099"+
		"\u0000\u0b04\u0b06\u0003\u00a0P\u0000\u0b05\u0b03\u0001\u0000\u0000\u0000"+
		"\u0b05\u0b04\u0001\u0000\u0000\u0000\u0b06\u0187\u0001\u0000\u0000\u0000"+
		"\u0b07\u0b09\u0003\u019a\u00cd\u0000\u0b08\u0b0a\u0005~\u0000\u0000\u0b09"+
		"\u0b08\u0001\u0000\u0000\u0000\u0b09\u0b0a\u0001\u0000\u0000\u0000\u0b0a"+
		"\u0b0d\u0001\u0000\u0000\u0000\u0b0b\u0b0e\u0003\u017a\u00bd\u0000\u0b0c"+
		"\u0b0e\u0003\u0194\u00ca\u0000\u0b0d\u0b0b\u0001\u0000\u0000\u0000\u0b0d"+
		"\u0b0c\u0001\u0000\u0000\u0000\u0b0d\u0b0e\u0001\u0000\u0000\u0000\u0b0e"+
		"\u0b0f\u0001\u0000\u0000\u0000\u0b0f\u0b10\u0005}\u0000\u0000\u0b10\u0b11"+
		"\u0003\u015e\u00af\u0000\u0b11\u0189\u0001\u0000\u0000\u0000\u0b12\u0b15"+
		"\u0003\u018c\u00c6\u0000\u0b13\u0b14\u0005~\u0000\u0000\u0b14\u0b16\u0003"+
		"\u0176\u00bb\u0000\u0b15\u0b13\u0001\u0000\u0000\u0000\u0b16\u0b17\u0001"+
		"\u0000\u0000\u0000\u0b17\u0b15\u0001\u0000\u0000\u0000\u0b17\u0b18\u0001"+
		"\u0000\u0000\u0000\u0b18\u018b\u0001\u0000\u0000\u0000\u0b19\u0b1a\u0005"+
		"r\u0000\u0000\u0b1a\u0b1d\u0003\u0132\u0099\u0000\u0b1b\u0b1c\u0005\u0001"+
		"\u0000\u0000\u0b1c\u0b1e\u0003\u0190\u00c8\u0000\u0b1d\u0b1b\u0001\u0000"+
		"\u0000\u0000\u0b1d\u0b1e\u0001\u0000\u0000\u0000\u0b1e\u0b1f\u0001\u0000"+
		"\u0000\u0000\u0b1f\u0b20\u0005q\u0000\u0000\u0b20\u018d\u0001\u0000\u0000"+
		"\u0000\u0b21\u0b24\u0003\u018c\u00c6\u0000\u0b22\u0b23\u0005~\u0000\u0000"+
		"\u0b23\u0b25\u0003\u0192\u00c9\u0000\u0b24\u0b22\u0001\u0000\u0000\u0000"+
		"\u0b25\u0b26\u0001\u0000\u0000\u0000\u0b26\u0b24\u0001\u0000\u0000\u0000"+
		"\u0b26\u0b27\u0001\u0000\u0000\u0000\u0b27\u018f\u0001\u0000\u0000\u0000"+
		"\u0b28\u0b2a\u0005~\u0000\u0000\u0b29\u0b28\u0001\u0000\u0000\u0000\u0b29"+
		"\u0b2a\u0001\u0000\u0000\u0000\u0b2a\u0b2b\u0001\u0000\u0000\u0000\u0b2b"+
		"\u0b30\u0003\u0192\u00c9\u0000\u0b2c\u0b2d\u0005~\u0000\u0000\u0b2d\u0b2f"+
		"\u0003\u0192\u00c9\u0000\u0b2e\u0b2c\u0001\u0000\u0000\u0000\u0b2f\u0b32"+
		"\u0001\u0000\u0000\u0000\u0b30\u0b2e\u0001\u0000\u0000\u0000\u0b30\u0b31"+
		"\u0001\u0000\u0000\u0000\u0b31\u0191\u0001\u0000\u0000\u0000\u0b32\u0b30"+
		"\u0001\u0000\u0000\u0000\u0b33\u0b35\u0003\u0178\u00bc\u0000\u0b34\u0b36"+
		"\u0005~\u0000\u0000\u0b35\u0b34\u0001\u0000\u0000\u0000\u0b35\u0b36\u0001"+
		"\u0000\u0000\u0000\u0b36\u0b39\u0001\u0000\u0000\u0000\u0b37\u0b3a\u0003"+
		"\u017a\u00bd\u0000\u0b38\u0b3a\u0003\u0194\u00ca\u0000\u0b39\u0b37\u0001"+
		"\u0000\u0000\u0000\u0b39\u0b38\u0001\u0000\u0000\u0000\u0b39\u0b3a\u0001"+
		"\u0000\u0000\u0000\u0b3a\u0193\u0001\u0000\u0000\u0000\u0b3b\u0b3e\u0005"+
		"\u0088\u0000\u0000\u0b3c\u0b3f\u0003\u0196\u00cb\u0000\u0b3d\u0b3f\u0005"+
		"x\u0000\u0000\u0b3e\u0b3c\u0001\u0000\u0000\u0000\u0b3e\u0b3d\u0001\u0000"+
		"\u0000\u0000\u0b3e\u0b3f\u0001\u0000\u0000\u0000\u0b3f\u0b40\u0001\u0000"+
		"\u0000\u0000\u0b40\u0b43\u0005\u0089\u0000\u0000\u0b41\u0b42\u0005\u007f"+
		"\u0000\u0000\u0b42\u0b44\u0003\u0132\u0099\u0000\u0b43\u0b41\u0001\u0000"+
		"\u0000\u0000\u0b43\u0b44\u0001\u0000\u0000\u0000\u0b44\u0195\u0001\u0000"+
		"\u0000\u0000\u0b45\u0b4a\u0003\u0132\u0099\u0000\u0b46\u0b47\u0005{\u0000"+
		"\u0000\u0b47\u0b49\u0003\u0132\u0099\u0000\u0b48\u0b46\u0001\u0000\u0000"+
		"\u0000\u0b49\u0b4c\u0001\u0000\u0000\u0000\u0b4a\u0b48\u0001\u0000\u0000"+
		"\u0000\u0b4a\u0b4b\u0001\u0000\u0000\u0000\u0b4b\u0b4e\u0001\u0000\u0000"+
		"\u0000\u0b4c\u0b4a\u0001\u0000\u0000\u0000\u0b4d\u0b4f\u0005{\u0000\u0000"+
		"\u0b4e\u0b4d\u0001\u0000\u0000\u0000\u0b4e\u0b4f\u0001\u0000\u0000\u0000"+
		"\u0b4f\u0197\u0001\u0000\u0000\u0000\u0b50\u0b5a\u0005\u0015\u0000\u0000"+
		"\u0b51\u0b57\u0005\u0088\u0000\u0000\u0b52\u0b58\u0005\u0005\u0000\u0000"+
		"\u0b53\u0b58\u0005\u0018\u0000\u0000\u0b54\u0b58\u0005\u001d\u0000\u0000"+
		"\u0b55\u0b56\u0005\u000e\u0000\u0000\u0b56\u0b58\u0003\u0170\u00b8\u0000"+
		"\u0b57\u0b52\u0001\u0000\u0000\u0000\u0b57\u0b53\u0001\u0000\u0000\u0000"+
		"\u0b57\u0b54\u0001\u0000\u0000\u0000\u0b57\u0b55\u0001\u0000\u0000\u0000"+
		"\u0b58\u0b59\u0001\u0000\u0000\u0000\u0b59\u0b5b\u0005\u0089\u0000\u0000"+
		"\u0b5a\u0b51\u0001\u0000\u0000\u0000\u0b5a\u0b5b\u0001\u0000\u0000\u0000"+
		"\u0b5b\u0199\u0001\u0000\u0000\u0000\u0b5c\u0b5d\u0007\u000e\u0000\u0000"+
		"\u0b5d\u019b\u0001\u0000\u0000\u0000\u0b5e\u0b5f\u0007\u000f\u0000\u0000"+
		"\u0b5f\u019d\u0001\u0000\u0000\u0000\u0b60\u0b61\u0007\u0010\u0000\u0000"+
		"\u0b61\u019f\u0001\u0000\u0000\u0000\u0b62\u0b68\u0003\u019c\u00ce\u0000"+
		"\u0b63\u0b68\u0003\u019a\u00cd\u0000\u0b64\u0b68\u0005<\u0000\u0000\u0b65"+
		"\u0b68\u0005=\u0000\u0000\u0b66\u0b68\u0005W\u0000\u0000\u0b67\u0b62\u0001"+
		"\u0000\u0000\u0000\u0b67\u0b63\u0001\u0000\u0000\u0000\u0b67\u0b64\u0001"+
		"\u0000\u0000\u0000\u0b67\u0b65\u0001\u0000\u0000\u0000\u0b67\u0b66\u0001"+
		"\u0000\u0000\u0000\u0b68\u01a1\u0001\u0000\u0000\u0000\u0b69\u0b6a\u0003"+
		"\u00acV\u0000\u0b6a\u01a3\u0001\u0000\u0000\u0000\u0b6b\u0b6c\u0007\u0011"+
		"\u0000\u0000\u0b6c\u01a5\u0001\u0000\u0000\u0000\u0b6d\u0b6e\u0005r\u0000"+
		"\u0000\u0b6e\u0b6f\u0004\u00d3\u0019\u0000\u0b6f\u0b70\u0005r\u0000\u0000"+
		"\u0b70\u01a7\u0001\u0000\u0000\u0000\u0b71\u0b72\u0005q\u0000\u0000\u0b72"+
		"\u0b73\u0004\u00d4\u001a\u0000\u0b73\u0b74\u0005q\u0000\u0000\u0b74\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ad\u01b3\u01bb\u01c3\u01cb\u01d3\u01d7"+
		"\u01dc\u01df\u01e6\u01eb\u01f1\u01fa\u0200\u0209\u020f\u0214\u021c\u0224"+
		"\u0228\u022e\u023f\u0242\u0249\u024d\u0257\u025f\u0267\u026b\u0270\u0277"+
		"\u0280\u0284\u0288\u028e\u0296\u029f\u02a4\u02a7\u02b6\u02bb\u02be\u02c7"+
		"\u02cd\u02d1\u02d7\u02dd\u02e2\u02e9\u02ec\u02f5\u02f9\u02fb\u02fe\u0304"+
		"\u0306\u0308\u030e\u0312\u0316\u0319\u031d\u0320\u0323\u0326\u0329\u032c"+
		"\u0330\u0332\u0338\u033d\u0344\u0348\u034a\u034f\u0354\u0358\u035a\u035d"+
		"\u0362\u036b\u0371\u0377\u037d\u0382\u0386\u0388\u038b\u0390\u0392\u0398"+
		"\u039d\u03a0\u03a4\u03a8\u03ad\u03b1\u03b5\u03be\u03c2\u03c7\u03cb\u03ce"+
		"\u03d5\u03dc\u03e0\u03e5\u03e9\u03f0\u03f3\u03f7\u0400\u0404\u0409\u040d"+
		"\u0412\u0415\u0419\u041f\u042a\u042d\u0431\u0436\u043b\u043e\u0444\u0447"+
		"\u044c\u0450\u0457\u045c\u045f\u0464\u0468\u046a\u046d\u0473\u0479\u047f"+
		"\u0482\u0487\u048b\u048d\u0491\u0494\u0498\u049c\u04a4\u04a8\u04ab\u04af"+
		"\u04b5\u04bb\u04c6\u04ca\u04cd\u04d0\u04d6\u04dc\u04e2\u04e8\u04ec\u04f2"+
		"\u04f8\u0500\u0505\u050a\u050c\u0518\u051d\u051f\u0526\u052c\u052f\u0534"+
		"\u0537\u053c\u053e\u0542\u054a\u0554\u0559\u055d\u0564\u0569\u0571\u0576"+
		"\u057b\u057d\u058c\u0592\u0596\u059b\u05a2\u05a7\u05ae\u05b4\u05b6\u05bf"+
		"\u05c1\u05c7\u05cf\u05dc\u05e9\u05ec\u05f0\u05f3\u05f7\u05fe\u0602\u0608"+
		"\u0612\u0616\u061d\u0621\u062a\u0635\u0660\u0664\u066c\u0675\u0680\u0690"+
		"\u0692\u0694\u069e\u06ad\u06b1\u06b8\u06c8\u06cc\u06d0\u06d6\u06da\u06e1"+
		"\u06e4\u06e7\u06eb\u06fd\u0701\u0707\u070e\u0711\u0718\u071c\u0722\u0727"+
		"\u0730\u0736\u0738\u073d\u0743\u0748\u074c\u0753\u075b\u075f\u0761\u076a"+
		"\u076f\u0778\u077c\u0781\u0786\u078f\u0793\u0795\u07a0\u07a4\u07a7\u07aa"+
		"\u07ad\u07b0\u07b3\u07b8\u07bb\u07c2\u07c9\u07cd\u07d2\u07d8\u07db\u07e1"+
		"\u07e6\u0808\u080a\u0816\u0818\u0825\u0829\u0833\u083a\u0841\u0843\u0848"+
		"\u084d\u0853\u085a\u085f\u0866\u0876\u0884\u0888\u088b\u0890\u0896\u08af"+
		"\u08b4\u08b8\u08bd\u08c1\u08c7\u08cb\u08d2\u08d4\u08d7\u08de\u08e4\u08f0"+
		"\u08f3\u08f7\u08fc\u0903\u0907\u0910\u0914\u0918\u0925\u0928\u092a\u0932"+
		"\u093b\u093f\u0943\u094f\u0955\u0965\u0973\u0976\u0978\u0988\u098b\u098e"+
		"\u0997\u099d\u09a1\u09a4\u09a8\u09aa\u09b1\u09b8\u09bc\u09c1\u09c6\u09c9"+
		"\u09cd\u09d4\u09dc\u09e4\u09e8\u09eb\u09ee\u09f1\u09f7\u09fd\u0a02\u0a05"+
		"\u0a08\u0a0b\u0a10\u0a15\u0a1e\u0a22\u0a29\u0a2f\u0a32\u0a35\u0a39\u0a3c"+
		"\u0a41\u0a44\u0a48\u0a4b\u0a50\u0a5d\u0a62\u0a66\u0a6b\u0a72\u0a76\u0a7b"+
		"\u0a82\u0a8b\u0a8e\u0a95\u0a9b\u0aa4\u0aac\u0ab0\u0ab3\u0abb\u0abe\u0ac8"+
		"\u0acd\u0ad1\u0ad8\u0adc\u0ae0\u0ae7\u0aef\u0af7\u0afc\u0b00\u0b05\u0b09"+
		"\u0b0d\u0b17\u0b1d\u0b26\u0b29\u0b30\u0b35\u0b39\u0b3e\u0b43\u0b4a\u0b4e"+
		"\u0b57\u0b5a\u0b67";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}