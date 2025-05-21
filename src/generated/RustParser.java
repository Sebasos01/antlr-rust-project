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
		KW_UNSAFE=33, KW_SAFE=34, KW_USE=35, KW_REUSE=36, KW_WHERE=37, KW_WHILE=38, 
		KW_ASYNC=39, KW_AWAIT=40, KW_DYN=41, KW_AUTO=42, KW_ABSTRACT=43, KW_BECOME=44, 
		KW_BOX=45, KW_DO=46, KW_YEET=47, KW_FINAL=48, KW_MACRO=49, KW_OVERRIDE=50, 
		KW_PRIV=51, KW_TYPEOF=52, KW_UNSIZED=53, KW_VIRTUAL=54, KW_YIELD=55, KW_TRY=56, 
		KW_UNION=57, KW_STATICLIFETIME=58, KW_RAW=59, KW_DEFAULT=60, KW_MACRORULES=61, 
		KW_DOLLARCRATE=62, KW_GEN=63, CLOSURE_FN=64, CLOSURE_FNMUT=65, CLOSURE_FNONCE=66, 
		NON_KEYWORD_IDENTIFIER=67, RAW_IDENTIFIER=68, LINE_COMMENT=69, BLOCK_COMMENT=70, 
		SHEBANG=71, WHITESPACE=72, BOM=73, NEWLINE=74, CHAR_LITERAL=75, STRING_LITERAL=76, 
		RAW_STRING_LITERAL=77, BYTE_LITERAL=78, BYTE_STRING_LITERAL=79, RAW_BYTE_STRING_LITERAL=80, 
		C_STRING_LITERAL=81, RAW_C_STRING_LITERAL=82, INTEGER_LITERAL=83, DEC_LITERAL=84, 
		HEX_LITERAL=85, OCT_LITERAL=86, BIN_LITERAL=87, FLOAT_LITERAL=88, LIFETIME_OR_LABEL=89, 
		PLUS=90, MINUS=91, STAR=92, SLASH=93, PERCENT=94, CARET=95, NOT=96, TILDE=97, 
		AND=98, OR=99, ANDAND=100, OROR=101, PLUSEQ=102, MINUSEQ=103, STAREQ=104, 
		SLASHEQ=105, PERCENTEQ=106, CARETEQ=107, ANDEQ=108, OREQ=109, SHLEQ=110, 
		EQ=111, EQEQ=112, NE=113, GT=114, LT=115, LE=116, AT=117, UNDERSCORE=118, 
		DOT=119, DOTDOT=120, DOTDOTDOT=121, DOTDOTEQ=122, COMMA=123, SEMI=124, 
		COLON=125, PATHSEP=126, RARROW=127, FATARROW=128, POUND=129, DOLLAR=130, 
		QUESTION=131, LCURLYBRACE=132, RCURLYBRACE=133, LSQUAREBRACKET=134, RSQUAREBRACKET=135, 
		LPAREN=136, RPAREN=137;
	public static final int
		RULE_crate = 0, RULE_macroInvocation = 1, RULE_delimTokenTree = 2, RULE_tokenTree = 3, 
		RULE_tokenTreeToken = 4, RULE_macroInvocationSemi = 5, RULE_macroRulesDefinition = 6, 
		RULE_declMacro = 7, RULE_macroRulesDef = 8, RULE_macroRules = 9, RULE_macroRule = 10, 
		RULE_macroMatcher = 11, RULE_macroMatch = 12, RULE_macroMatchToken = 13, 
		RULE_macroFragSpec = 14, RULE_macroRepSep = 15, RULE_macroRepOp = 16, 
		RULE_macroTranscriber = 17, RULE_item = 18, RULE_visItem = 19, RULE_macroItem = 20, 
		RULE_module = 21, RULE_externCrate = 22, RULE_crateRef = 23, RULE_asClause = 24, 
		RULE_useDeclaration = 25, RULE_reuseDeclaration = 26, RULE_reuseTarget = 27, 
		RULE_alias = 28, RULE_reuseList = 29, RULE_useTree = 30, RULE_function_ = 31, 
		RULE_functionQualifiers = 32, RULE_abi = 33, RULE_functionParameters = 34, 
		RULE_selfParam = 35, RULE_shorthandSelf = 36, RULE_typedSelf = 37, RULE_functionParam = 38, 
		RULE_functionParamPattern = 39, RULE_functionReturnType = 40, RULE_typeAlias = 41, 
		RULE_struct_ = 42, RULE_structStruct = 43, RULE_tupleStruct = 44, RULE_structFields = 45, 
		RULE_structField = 46, RULE_tupleFields = 47, RULE_tupleField = 48, RULE_enumeration = 49, 
		RULE_enumItems = 50, RULE_enumItem = 51, RULE_enumItemTuple = 52, RULE_enumItemStruct = 53, 
		RULE_enumItemDiscriminant = 54, RULE_union_ = 55, RULE_constantItem = 56, 
		RULE_staticItem = 57, RULE_trait_ = 58, RULE_implementation = 59, RULE_inherentImpl = 60, 
		RULE_traitImpl = 61, RULE_externBlock = 62, RULE_externalItem = 63, RULE_externType = 64, 
		RULE_genericParams = 65, RULE_genericParam = 66, RULE_lifetimeParam = 67, 
		RULE_typeParam = 68, RULE_constParam = 69, RULE_constParamDefault = 70, 
		RULE_whereClause = 71, RULE_whereClauseItem = 72, RULE_lifetimeWhereClauseItem = 73, 
		RULE_typeBoundWhereClauseItem = 74, RULE_equalityBound = 75, RULE_forLifetimes = 76, 
		RULE_associatedItem = 77, RULE_innerAttribute = 78, RULE_outerAttribute = 79, 
		RULE_attr = 80, RULE_attrInput = 81, RULE_statement = 82, RULE_letStatement = 83, 
		RULE_expressionStatement = 84, RULE_expression = 85, RULE_comparisonOperator = 86, 
		RULE_compoundAssignOperator = 87, RULE_expressionWithBlock = 88, RULE_generatorBlockExpression = 89, 
		RULE_asyncGeneratorBlockExpression = 90, RULE_literalExpression = 91, 
		RULE_pathExpression = 92, RULE_blockExpression = 93, RULE_statements = 94, 
		RULE_asyncBlockExpression = 95, RULE_unsafeBlockExpression = 96, RULE_constBlockExpression = 97, 
		RULE_tryBlockExpression = 98, RULE_arrayElements = 99, RULE_tupleElements = 100, 
		RULE_tupleIndex = 101, RULE_structExpression = 102, RULE_structExprStruct = 103, 
		RULE_structExprFields = 104, RULE_structExprField = 105, RULE_structBase = 106, 
		RULE_structExprTuple = 107, RULE_structExprUnit = 108, RULE_enumerationVariantExpression = 109, 
		RULE_enumExprStruct = 110, RULE_enumExprFields = 111, RULE_enumExprField = 112, 
		RULE_enumExprTuple = 113, RULE_enumExprFieldless = 114, RULE_callParams = 115, 
		RULE_closureExpression = 116, RULE_closureParameters = 117, RULE_closureParam = 118, 
		RULE_loopExpression = 119, RULE_infiniteLoopExpression = 120, RULE_predicateLoopExpression = 121, 
		RULE_predicatePatternLoopExpression = 122, RULE_iteratorLoopExpression = 123, 
		RULE_labelBlockExpression = 124, RULE_loopLabel = 125, RULE_ifExpression = 126, 
		RULE_ifLetExpression = 127, RULE_letExpression = 128, RULE_matchExpression = 129, 
		RULE_matchArms = 130, RULE_matchArmExpression = 131, RULE_matchArm = 132, 
		RULE_matchArmGuard = 133, RULE_pattern = 134, RULE_patternNoTopAlt = 135, 
		RULE_patternWithoutRange = 136, RULE_boxPattern = 137, RULE_literalPattern = 138, 
		RULE_identifierPattern = 139, RULE_wildcardPattern = 140, RULE_restPattern = 141, 
		RULE_rangePattern = 142, RULE_rangePatternBound = 143, RULE_referencePattern = 144, 
		RULE_structPattern = 145, RULE_structPatternElements = 146, RULE_structPatternFields = 147, 
		RULE_structPatternField = 148, RULE_structPatternEtCetera = 149, RULE_tupleStructPattern = 150, 
		RULE_tupleStructItems = 151, RULE_tuplePattern = 152, RULE_tuplePatternItems = 153, 
		RULE_groupedPattern = 154, RULE_slicePattern = 155, RULE_slicePatternItems = 156, 
		RULE_pathPattern = 157, RULE_type_ = 158, RULE_typeNoBounds = 159, RULE_parenthesizedType = 160, 
		RULE_neverType = 161, RULE_tupleType = 162, RULE_arrayType = 163, RULE_sliceType = 164, 
		RULE_referenceType = 165, RULE_rawPointerType = 166, RULE_bareFunctionType = 167, 
		RULE_functionTypeQualifiers = 168, RULE_bareFunctionReturnType = 169, 
		RULE_functionParametersMaybeNamedVariadic = 170, RULE_maybeNamedFunctionParameters = 171, 
		RULE_maybeNamedParam = 172, RULE_maybeNamedFunctionParametersVariadic = 173, 
		RULE_traitObjectType = 174, RULE_traitObjectTypeOneBound = 175, RULE_implTraitType = 176, 
		RULE_implTraitTypeOneBound = 177, RULE_closureTraitType = 178, RULE_inferredType = 179, 
		RULE_typeParamBounds = 180, RULE_boundElement = 181, RULE_typeParamBound = 182, 
		RULE_traitBound = 183, RULE_useBound = 184, RULE_useBoundGenericArgs = 185, 
		RULE_useBoundGenericArg = 186, RULE_lifetimeBounds = 187, RULE_lifetime = 188, 
		RULE_simplePath = 189, RULE_simplePathSegment = 190, RULE_pathInExpression = 191, 
		RULE_pathExprSegment = 192, RULE_pathIdentSegment = 193, RULE_genericArgs = 194, 
		RULE_genericArg = 195, RULE_genericArgsConst = 196, RULE_genericArgsLifetimes = 197, 
		RULE_genericArgsTypes = 198, RULE_genericArgsBindings = 199, RULE_genericArgsBinding = 200, 
		RULE_genericArgsBound = 201, RULE_qualifiedPathInExpression = 202, RULE_qualifiedPathType = 203, 
		RULE_qualifiedPathInType = 204, RULE_typePath = 205, RULE_typePathSegment = 206, 
		RULE_typePathFn = 207, RULE_typePathInputs = 208, RULE_visibility = 209, 
		RULE_identifier = 210, RULE_keyword = 211, RULE_non_crate_keyword = 212, 
		RULE_macroIdentifierLikeToken = 213, RULE_macroLiteralToken = 214, RULE_macroPunctuationToken = 215, 
		RULE_shl = 216, RULE_shr = 217;
	private static String[] makeRuleNames() {
		return new String[] {
			"crate", "macroInvocation", "delimTokenTree", "tokenTree", "tokenTreeToken", 
			"macroInvocationSemi", "macroRulesDefinition", "declMacro", "macroRulesDef", 
			"macroRules", "macroRule", "macroMatcher", "macroMatch", "macroMatchToken", 
			"macroFragSpec", "macroRepSep", "macroRepOp", "macroTranscriber", "item", 
			"visItem", "macroItem", "module", "externCrate", "crateRef", "asClause", 
			"useDeclaration", "reuseDeclaration", "reuseTarget", "alias", "reuseList", 
			"useTree", "function_", "functionQualifiers", "abi", "functionParameters", 
			"selfParam", "shorthandSelf", "typedSelf", "functionParam", "functionParamPattern", 
			"functionReturnType", "typeAlias", "struct_", "structStruct", "tupleStruct", 
			"structFields", "structField", "tupleFields", "tupleField", "enumeration", 
			"enumItems", "enumItem", "enumItemTuple", "enumItemStruct", "enumItemDiscriminant", 
			"union_", "constantItem", "staticItem", "trait_", "implementation", "inherentImpl", 
			"traitImpl", "externBlock", "externalItem", "externType", "genericParams", 
			"genericParam", "lifetimeParam", "typeParam", "constParam", "constParamDefault", 
			"whereClause", "whereClauseItem", "lifetimeWhereClauseItem", "typeBoundWhereClauseItem", 
			"equalityBound", "forLifetimes", "associatedItem", "innerAttribute", 
			"outerAttribute", "attr", "attrInput", "statement", "letStatement", "expressionStatement", 
			"expression", "comparisonOperator", "compoundAssignOperator", "expressionWithBlock", 
			"generatorBlockExpression", "asyncGeneratorBlockExpression", "literalExpression", 
			"pathExpression", "blockExpression", "statements", "asyncBlockExpression", 
			"unsafeBlockExpression", "constBlockExpression", "tryBlockExpression", 
			"arrayElements", "tupleElements", "tupleIndex", "structExpression", "structExprStruct", 
			"structExprFields", "structExprField", "structBase", "structExprTuple", 
			"structExprUnit", "enumerationVariantExpression", "enumExprStruct", "enumExprFields", 
			"enumExprField", "enumExprTuple", "enumExprFieldless", "callParams", 
			"closureExpression", "closureParameters", "closureParam", "loopExpression", 
			"infiniteLoopExpression", "predicateLoopExpression", "predicatePatternLoopExpression", 
			"iteratorLoopExpression", "labelBlockExpression", "loopLabel", "ifExpression", 
			"ifLetExpression", "letExpression", "matchExpression", "matchArms", "matchArmExpression", 
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
			"'trait'", "'true'", "'type'", "'unsafe'", "'safe'", "'use'", "'reuse'", 
			"'where'", "'while'", "'async'", "'await'", "'dyn'", "'auto'", "'abstract'", 
			"'become'", "'box'", "'do'", "'yeet'", "'final'", "'macro'", "'override'", 
			"'priv'", "'typeof'", "'unsized'", "'virtual'", "'yield'", "'try'", "'union'", 
			"''static'", "'raw'", "'default'", "'macro_rules'", "'$crate'", "'gen'", 
			"'Fn'", "'FnMut'", "'FnOnce'", null, null, null, null, null, null, "'\\uFEFF'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", 
			"'~'", "'&'", "'|'", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'^='", "'&='", "'|='", "'<<='", "'='", "'=='", "'!='", "'>'", 
			"'<'", "'<='", "'@'", "'_'", "'.'", "'..'", "'...'", "'..='", "','", 
			"';'", "':'", "'::'", "'->'", "'=>'", "'#'", "'$'", "'?'", "'{'", "'}'", 
			"'['", "']'", "'('", "')'"
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
			"KW_UNSAFE", "KW_SAFE", "KW_USE", "KW_REUSE", "KW_WHERE", "KW_WHILE", 
			"KW_ASYNC", "KW_AWAIT", "KW_DYN", "KW_AUTO", "KW_ABSTRACT", "KW_BECOME", 
			"KW_BOX", "KW_DO", "KW_YEET", "KW_FINAL", "KW_MACRO", "KW_OVERRIDE", 
			"KW_PRIV", "KW_TYPEOF", "KW_UNSIZED", "KW_VIRTUAL", "KW_YIELD", "KW_TRY", 
			"KW_UNION", "KW_STATICLIFETIME", "KW_RAW", "KW_DEFAULT", "KW_MACRORULES", 
			"KW_DOLLARCRATE", "KW_GEN", "CLOSURE_FN", "CLOSURE_FNMUT", "CLOSURE_FNONCE", 
			"NON_KEYWORD_IDENTIFIER", "RAW_IDENTIFIER", "LINE_COMMENT", "BLOCK_COMMENT", 
			"SHEBANG", "WHITESPACE", "BOM", "NEWLINE", "CHAR_LITERAL", "STRING_LITERAL", 
			"RAW_STRING_LITERAL", "BYTE_LITERAL", "BYTE_STRING_LITERAL", "RAW_BYTE_STRING_LITERAL", 
			"C_STRING_LITERAL", "RAW_C_STRING_LITERAL", "INTEGER_LITERAL", "DEC_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BIN_LITERAL", "FLOAT_LITERAL", "LIFETIME_OR_LABEL", 
			"PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "CARET", "NOT", "TILDE", 
			"AND", "OR", "ANDAND", "OROR", "PLUSEQ", "MINUSEQ", "STAREQ", "SLASHEQ", 
			"PERCENTEQ", "CARETEQ", "ANDEQ", "OREQ", "SHLEQ", "EQ", "EQEQ", "NE", 
			"GT", "LT", "LE", "AT", "UNDERSCORE", "DOT", "DOTDOT", "DOTDOTDOT", "DOTDOTEQ", 
			"COMMA", "SEMI", "COLON", "PATHSEP", "RARROW", "FATARROW", "POUND", "DOLLAR", 
			"QUESTION", "LCURLYBRACE", "RCURLYBRACE", "LSQUAREBRACKET", "RSQUAREBRACKET", 
			"LPAREN", "RPAREN"
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
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					innerAttribute();
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -44946987650087755L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811395L) != 0)) {
				{
				{
				setState(442);
				item();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
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
			setState(450);
			simplePath();
			setState(451);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==POUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360138899877527520L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387935L) != 0)) {
				{
				setState(452);
				simplePath();
				}
			}

			setState(455);
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
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(LPAREN);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(458);
					tokenTree();
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(464);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(LSQUAREBRACKET);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(466);
					tokenTree();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(472);
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(LCURLYBRACE);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(474);
					tokenTree();
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480);
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
			setState(489);
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
			case KW_REUSE:
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
			case EQ:
			case EQEQ:
			case NE:
			case GT:
			case LT:
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
				setState(484); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(483);
						tokenTreeToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(486); 
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
				setState(488);
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
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				macroRepOp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
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
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				simplePath();
				setState(499);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==POUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360138899877527520L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387935L) != 0)) {
					{
					setState(500);
					simplePath();
					}
				}

				setState(503);
				match(LPAREN);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(504);
					tokenTree();
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
				match(RPAREN);
				setState(511);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				simplePath();
				setState(514);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==POUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360138899877527520L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387935L) != 0)) {
					{
					setState(515);
					simplePath();
					}
				}

				setState(518);
				match(LSQUAREBRACKET);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(519);
					tokenTree();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				match(RSQUAREBRACKET);
				setState(526);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				simplePath();
				setState(529);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==POUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360138899877527520L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387935L) != 0)) {
					{
					setState(530);
					simplePath();
					}
				}

				setState(533);
				match(LCURLYBRACE);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(534);
					tokenTree();
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
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
			setState(544);
			match(KW_MACRORULES);
			setState(545);
			match(NOT);
			setState(546);
			identifier();
			setState(547);
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
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(549);
				visibility();
				}
			}

			setState(552);
			match(KW_MACRO);
			setState(553);
			identifier();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(554);
				match(LPAREN);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
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
				match(RPAREN);
				}
			}

			setState(564);
			match(LCURLYBRACE);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
				{
				{
				setState(565);
				tokenTree();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
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
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(LPAREN);
				setState(574);
				macroRules();
				setState(575);
				match(RPAREN);
				setState(576);
				match(SEMI);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(LSQUAREBRACKET);
				setState(579);
				macroRules();
				setState(580);
				match(RSQUAREBRACKET);
				setState(581);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				match(LCURLYBRACE);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 21L) != 0)) {
					{
					setState(584);
					macroRules();
					}
				}

				setState(587);
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
			setState(590);
			macroRule();
			setState(595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(591);
					match(SEMI);
					setState(592);
					macroRule();
					}
					} 
				}
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(598);
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
			setState(601);
			macroMatcher();
			setState(602);
			match(FATARROW);
			setState(603);
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
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(LPAREN);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(606);
					macroMatch();
					}
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(612);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(LSQUAREBRACKET);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(614);
					macroMatch();
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(620);
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				match(LCURLYBRACE);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(622);
					macroMatch();
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(628);
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
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
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
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(631);
						macroMatchToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(634); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				macroMatcher();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				match(DOLLAR);
				setState(641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(638);
					identifier();
					}
					break;
				case 2:
					{
					setState(639);
					non_crate_keyword();
					}
					break;
				case 3:
					{
					setState(640);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(643);
				match(COLON);
				setState(644);
				macroFragSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(645);
				match(DOLLAR);
				setState(646);
				match(LPAREN);
				setState(648); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(647);
					macroMatch();
					}
					}
					setState(650); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -15730657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0) );
				setState(652);
				match(RPAREN);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -351274977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 7L) != 0)) {
					{
					setState(653);
					macroRepSep();
					}
				}

				setState(656);
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
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(663);
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
			setState(666);
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
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(671);
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
			setState(674);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2199023255557L) != 0)) ) {
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
			setState(676);
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
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(678);
				outerAttribute();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(684);
				visItem();
				}
				break;
			case 2:
				{
				setState(685);
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
		public ReuseDeclarationContext reuseDeclaration() {
			return getRuleContext(ReuseDeclarationContext.class,0);
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
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(688);
				visibility();
				}
			}

			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(691);
				module();
				}
				break;
			case 2:
				{
				setState(692);
				externCrate();
				}
				break;
			case 3:
				{
				setState(693);
				useDeclaration();
				}
				break;
			case 4:
				{
				setState(694);
				reuseDeclaration();
				}
				break;
			case 5:
				{
				setState(695);
				function_();
				}
				break;
			case 6:
				{
				setState(696);
				typeAlias();
				}
				break;
			case 7:
				{
				setState(697);
				struct_();
				}
				break;
			case 8:
				{
				setState(698);
				enumeration();
				}
				break;
			case 9:
				{
				setState(699);
				union_();
				}
				break;
			case 10:
				{
				setState(700);
				constantItem();
				}
				break;
			case 11:
				{
				setState(701);
				staticItem();
				}
				break;
			case 12:
				{
				setState(702);
				trait_();
				}
				break;
			case 13:
				{
				setState(703);
				implementation();
				}
				break;
			case 14:
				{
				setState(704);
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
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				macroInvocationSemi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				macroRulesDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
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
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(712);
				match(KW_UNSAFE);
				}
			}

			setState(715);
			match(KW_MOD);
			setState(716);
			identifier();
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(717);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				{
				setState(718);
				match(LCURLYBRACE);
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(719);
						innerAttribute();
						}
						} 
					}
					setState(724);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -44946987650087755L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811395L) != 0)) {
					{
					{
					setState(725);
					item();
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(731);
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
			setState(734);
			match(KW_EXTERN);
			setState(735);
			match(KW_CRATE);
			setState(736);
			crateRef();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(737);
				asClause();
				}
			}

			setState(740);
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
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(742);
				identifier();
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
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
			setState(746);
			match(KW_AS);
			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(747);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(748);
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
			setState(751);
			match(KW_USE);
			setState(752);
			useTree();
			setState(753);
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
	public static class ReuseDeclarationContext extends ParserRuleContext {
		public TerminalNode KW_REUSE() { return getToken(RustParser.KW_REUSE, 0); }
		public ReuseTargetContext reuseTarget() {
			return getRuleContext(ReuseTargetContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public ReuseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reuseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReuseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReuseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReuseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReuseDeclarationContext reuseDeclaration() throws RecognitionException {
		ReuseDeclarationContext _localctx = new ReuseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_reuseDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(KW_REUSE);
			setState(756);
			reuseTarget();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(757);
				alias();
				}
			}

			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(760);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				{
				setState(761);
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
	public static class ReuseTargetContext extends ParserRuleContext {
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public QualifiedPathTypeContext qualifiedPathType() {
			return getRuleContext(QualifiedPathTypeContext.class,0);
		}
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public ReuseListContext reuseList() {
			return getRuleContext(ReuseListContext.class,0);
		}
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public ReuseTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reuseTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReuseTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReuseTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReuseTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReuseTargetContext reuseTarget() throws RecognitionException {
		ReuseTargetContext _localctx = new ReuseTargetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reuseTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(764);
				simplePath();
				}
				break;
			case 2:
				{
				setState(765);
				qualifiedPathInExpression();
				}
				break;
			case 3:
				{
				setState(766);
				qualifiedPathType();
				}
				break;
			case 4:
				{
				setState(767);
				pathInExpression();
				}
				break;
			}
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(770);
				match(PATHSEP);
				setState(776);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(771);
					match(STAR);
					}
					break;
				case LCURLYBRACE:
					{
					setState(772);
					match(LCURLYBRACE);
					setState(773);
					reuseList();
					setState(774);
					match(RCURLYBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(KW_AS);
			setState(781);
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
	public static class ReuseListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public ReuseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reuseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReuseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReuseList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReuseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReuseListContext reuseList() throws RecognitionException {
		ReuseListContext _localctx = new ReuseListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_reuseList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(783);
			identifier();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(784);
				alias();
				}
			}

			}
			setState(794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(787);
					match(COMMA);
					setState(788);
					identifier();
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_AS) {
						{
						setState(789);
						alias();
						}
					}

					}
					} 
				}
				setState(796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(797);
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
		enterRule(_localctx, 60, RULE_useTree);
		int _la;
		try {
			int _alt;
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360138899877527520L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387935L) != 0)) {
					{
					setState(801);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(800);
						simplePath();
						}
						break;
					}
					setState(803);
					match(PATHSEP);
					}
				}

				setState(822);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(806);
					match(STAR);
					}
					break;
				case LCURLYBRACE:
					{
					setState(807);
					match(LCURLYBRACE);
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -11254340621172735L) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1116691496961L) != 0)) {
						{
						setState(808);
						useTree();
						setState(813);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(809);
								match(COMMA);
								setState(810);
								useTree();
								}
								} 
							}
							setState(815);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
						}
						setState(817);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(816);
							match(COMMA);
							}
						}

						}
					}

					setState(821);
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
				setState(824);
				simplePath();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(825);
					match(KW_AS);
					setState(828);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_PIN:
					case KW_SAFE:
					case KW_REUSE:
					case KW_ASYNC:
					case KW_AWAIT:
					case KW_DYN:
					case KW_AUTO:
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
						setState(826);
						identifier();
						}
						break;
					case UNDERSCORE:
						{
						setState(827);
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
		enterRule(_localctx, 62, RULE_function_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			functionQualifiers();
			setState(835);
			match(KW_FN);
			setState(836);
			identifier();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(837);
				genericParams();
				}
			}

			setState(840);
			match(LPAREN);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -71873294184206552L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5136355508613675039L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 165L) != 0)) {
				{
				setState(841);
				functionParameters();
				}
			}

			setState(844);
			match(RPAREN);
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(845);
				functionReturnType();
				}
			}

			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(848);
				whereClause();
				}
			}

			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				{
				setState(851);
				blockExpression();
				}
				break;
			case SEMI:
				{
				setState(852);
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
		enterRule(_localctx, 64, RULE_functionQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(855);
				match(KW_DEFAULT);
				}
			}

			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(858);
				match(KW_CONST);
				}
			}

			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(861);
				match(KW_ASYNC);
				}
			}

			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_GEN) {
				{
				setState(864);
				match(KW_GEN);
				}
			}

			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE || _la==KW_SAFE) {
				{
				setState(867);
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

			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERN) {
				{
				setState(870);
				match(KW_EXTERN);
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
					{
					setState(871);
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
		enterRule(_localctx, 66, RULE_abi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
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
		enterRule(_localctx, 68, RULE_functionParameters);
		int _la;
		try {
			int _alt;
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				selfParam();
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(879);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(882);
					selfParam();
					setState(883);
					match(COMMA);
					}
					break;
				}
				setState(887);
				functionParam();
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(888);
						match(COMMA);
						setState(889);
						functionParam();
						}
						} 
					}
					setState(894);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(895);
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
		enterRule(_localctx, 70, RULE_selfParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(900);
				outerAttribute();
				}
				}
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(906);
				shorthandSelf();
				}
				break;
			case 2:
				{
				setState(907);
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
		enterRule(_localctx, 72, RULE_shorthandSelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(910);
				match(AND);
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL) {
					{
					setState(911);
					lifetime();
					}
				}

				}
			}

			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(916);
				match(KW_MUT);
				}
			}

			setState(919);
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
		enterRule(_localctx, 74, RULE_typedSelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(921);
				match(KW_MUT);
				}
			}

			setState(924);
			match(KW_SELFVALUE);
			setState(925);
			match(COLON);
			setState(926);
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
		enterRule(_localctx, 76, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(928);
				outerAttribute();
				}
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(934);
				functionParamPattern();
				}
				break;
			case 2:
				{
				setState(935);
				match(DOTDOTDOT);
				}
				break;
			case 3:
				{
				setState(936);
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
		enterRule(_localctx, 78, RULE_functionParamPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			pattern();
			setState(940);
			match(COLON);
			setState(943);
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
			case KW_SAFE:
			case KW_USE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				{
				setState(941);
				type_();
				}
				break;
			case DOTDOTDOT:
				{
				setState(942);
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
		enterRule(_localctx, 80, RULE_functionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(RARROW);
			setState(946);
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
		enterRule(_localctx, 82, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(948);
				match(KW_DEFAULT);
				}
			}

			setState(951);
			match(KW_TYPE);
			setState(952);
			identifier();
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(953);
				genericParams();
				}
			}

			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(956);
				match(COLON);
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -4498940104277951L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 145272973820289L) != 0)) {
					{
					setState(957);
					typeParamBounds();
					}
				}

				}
			}

			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(962);
				whereClause();
				}
			}

			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(965);
				match(EQ);
				setState(966);
				type_();
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(967);
					whereClause();
					}
				}

				}
			}

			setState(972);
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
		enterRule(_localctx, 84, RULE_struct_);
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				structStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
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
		enterRule(_localctx, 86, RULE_structStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(KW_STRUCT);
			setState(979);
			identifier();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(980);
				genericParams();
				}
			}

			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(983);
				whereClause();
				}
			}

			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				{
				setState(986);
				match(LCURLYBRACE);
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 279069866110993L) != 0) || _la==POUND) {
					{
					setState(987);
					structFields();
					}
				}

				setState(990);
				match(RCURLYBRACE);
				}
				break;
			case SEMI:
				{
				setState(991);
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
		enterRule(_localctx, 88, RULE_tupleStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(KW_STRUCT);
			setState(995);
			identifier();
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(996);
				genericParams();
				}
			}

			setState(999);
			match(LPAREN);
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -2247140022091415L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 181557461519241L) != 0)) {
				{
				setState(1000);
				tupleFields();
				}
			}

			setState(1003);
			match(RPAREN);
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1004);
				whereClause();
				}
			}

			setState(1007);
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
		enterRule(_localctx, 90, RULE_structFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			structField();
			setState(1014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1010);
					match(COMMA);
					setState(1011);
					structField();
					}
					} 
				}
				setState(1016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1017);
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
		enterRule(_localctx, 92, RULE_structField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1020);
				outerAttribute();
				}
				}
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(1026);
				match(KW_UNSAFE);
				}
			}

			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1029);
				visibility();
				}
			}

			setState(1032);
			identifier();
			setState(1033);
			match(COLON);
			setState(1034);
			type_();
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1035);
				match(EQ);
				setState(1036);
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
		enterRule(_localctx, 94, RULE_tupleFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			tupleField();
			setState(1044);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1040);
					match(COMMA);
					setState(1041);
					tupleField();
					}
					} 
				}
				setState(1046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1047);
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
		enterRule(_localctx, 96, RULE_tupleField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1050);
				outerAttribute();
				}
				}
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1056);
				visibility();
				}
			}

			setState(1059);
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
		enterRule(_localctx, 98, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(KW_ENUM);
			setState(1062);
			identifier();
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1063);
				genericParams();
				}
			}

			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1066);
				whereClause();
				}
			}

			setState(1069);
			match(LCURLYBRACE);
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 279069866106897L) != 0) || _la==POUND) {
				{
				setState(1070);
				enumItems();
				}
			}

			setState(1073);
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
		enterRule(_localctx, 100, RULE_enumItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			enumItem();
			setState(1080);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1076);
					match(COMMA);
					setState(1077);
					enumItem();
					}
					} 
				}
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1083);
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
		enterRule(_localctx, 102, RULE_enumItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1086);
				outerAttribute();
				}
				}
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1092);
				visibility();
				}
			}

			setState(1095);
			identifier();
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1096);
				enumItemTuple();
				}
				break;
			case LCURLYBRACE:
				{
				setState(1097);
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
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1100);
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
		enterRule(_localctx, 104, RULE_enumItemTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(LPAREN);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -2247140022091415L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 181557461519241L) != 0)) {
				{
				setState(1104);
				tupleFields();
				}
			}

			setState(1107);
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
		enterRule(_localctx, 106, RULE_enumItemStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(LCURLYBRACE);
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 279069866110993L) != 0) || _la==POUND) {
				{
				setState(1110);
				structFields();
				}
			}

			setState(1113);
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
		enterRule(_localctx, 108, RULE_enumItemDiscriminant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			match(EQ);
			setState(1116);
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
		enterRule(_localctx, 110, RULE_union_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(KW_UNION);
			setState(1119);
			if (!(this.nextIsIdentifier())) throw new FailedPredicateException(this, "this.nextIsIdentifier()");
			setState(1120);
			identifier();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1121);
				genericParams();
				}
			}

			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1124);
				whereClause();
				}
			}

			setState(1127);
			match(LCURLYBRACE);
			setState(1129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 279069866110993L) != 0) || _la==POUND) {
				{
				setState(1128);
				structFields();
				}
			}

			setState(1131);
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
		enterRule(_localctx, 112, RULE_constantItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(1133);
				match(KW_DEFAULT);
				}
			}

			setState(1136);
			match(KW_CONST);
			setState(1139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(1137);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(1138);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1141);
				genericParams();
				}
			}

			setState(1144);
			match(COLON);
			setState(1145);
			type_();
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1146);
				match(EQ);
				setState(1147);
				expression(0);
				}
			}

			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1150);
				whereClause();
				}
			}

			setState(1153);
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
		enterRule(_localctx, 114, RULE_staticItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE || _la==KW_SAFE) {
				{
				setState(1155);
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

			setState(1158);
			match(KW_STATIC);
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(1159);
				match(KW_MUT);
				}
			}

			setState(1162);
			identifier();
			setState(1163);
			match(COLON);
			setState(1164);
			type_();
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1165);
				match(EQ);
				setState(1166);
				expression(0);
				}
			}

			setState(1169);
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
		enterRule(_localctx, 116, RULE_trait_);
		int _la;
		try {
			int _alt;
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_UNSAFE) {
					{
					setState(1171);
					match(KW_UNSAFE);
					}
				}

				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AUTO) {
					{
					setState(1174);
					match(KW_AUTO);
					}
				}

				setState(1177);
				match(KW_TRAIT);
				setState(1178);
				identifier();
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1179);
					genericParams();
					}
				}

				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1182);
					match(COLON);
					setState(1184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -4498940104277951L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 145272973820289L) != 0)) {
						{
						setState(1183);
						typeParamBounds();
						}
					}

					}
				}

				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(1188);
					whereClause();
					}
				}

				setState(1191);
				match(LCURLYBRACE);
				setState(1195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1192);
						innerAttribute();
						}
						} 
					}
					setState(1197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -45017360873815899L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811395L) != 0)) {
					{
					{
					setState(1198);
					associatedItem();
					}
					}
					setState(1203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1204);
				match(RCURLYBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_UNSAFE) {
					{
					setState(1206);
					match(KW_UNSAFE);
					}
				}

				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AUTO) {
					{
					setState(1209);
					match(KW_AUTO);
					}
				}

				setState(1212);
				match(KW_TRAIT);
				setState(1213);
				identifier();
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1214);
					genericParams();
					}
				}

				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1217);
					match(COLON);
					setState(1219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -4498940104277951L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 145272973820289L) != 0)) {
						{
						setState(1218);
						typeParamBounds();
						}
					}

					}
				}

				setState(1223);
				match(EQ);
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -4498940104277951L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 145272973820289L) != 0)) {
					{
					setState(1224);
					typeParamBounds();
					}
				}

				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(1227);
					whereClause();
					}
				}

				setState(1230);
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
		enterRule(_localctx, 118, RULE_implementation);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				inherentImpl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
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
		enterRule(_localctx, 120, RULE_inherentImpl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1238);
				match(KW_DEFAULT);
				setState(1239);
				match(KW_UNSAFE);
				}
				break;
			case 2:
				{
				setState(1240);
				match(KW_UNSAFE);
				setState(1241);
				match(KW_DEFAULT);
				}
				break;
			case 3:
				{
				setState(1242);
				match(KW_DEFAULT);
				}
				break;
			case 4:
				{
				setState(1243);
				match(KW_UNSAFE);
				}
				break;
			}
			setState(1246);
			match(KW_IMPL);
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1247);
				genericParams();
				}
				break;
			}
			setState(1251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1250);
				match(NOT);
				}
				break;
			}
			setState(1253);
			type_();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1254);
				whereClause();
				}
			}

			setState(1257);
			match(LCURLYBRACE);
			setState(1261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1258);
					innerAttribute();
					}
					} 
				}
				setState(1263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -45017360873815899L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811395L) != 0)) {
				{
				{
				setState(1264);
				associatedItem();
				}
				}
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1270);
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
		enterRule(_localctx, 122, RULE_traitImpl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1272);
				match(KW_DEFAULT);
				setState(1273);
				match(KW_UNSAFE);
				}
				break;
			case 2:
				{
				setState(1274);
				match(KW_UNSAFE);
				setState(1275);
				match(KW_DEFAULT);
				}
				break;
			case 3:
				{
				setState(1276);
				match(KW_DEFAULT);
				}
				break;
			case 4:
				{
				setState(1277);
				match(KW_UNSAFE);
				}
				break;
			}
			setState(1280);
			match(KW_IMPL);
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1281);
				genericParams();
				}
			}

			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(1284);
				match(KW_CONST);
				}
			}

			setState(1288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1287);
				match(NOT);
				}
			}

			setState(1290);
			typePath();
			setState(1291);
			match(KW_FOR);
			setState(1292);
			type_();
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1293);
				whereClause();
				}
			}

			setState(1296);
			match(LCURLYBRACE);
			setState(1300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1297);
					innerAttribute();
					}
					} 
				}
				setState(1302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -45017360873815899L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811395L) != 0)) {
				{
				{
				setState(1303);
				associatedItem();
				}
				}
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1309);
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
		enterRule(_localctx, 124, RULE_externBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(1311);
				match(KW_UNSAFE);
				}
			}

			setState(1314);
			match(KW_EXTERN);
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
				{
				setState(1315);
				abi();
				}
			}

			setState(1318);
			match(LCURLYBRACE);
			setState(1322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1319);
					innerAttribute();
					}
					} 
				}
				setState(1324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -45017360857038683L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811395L) != 0)) {
				{
				{
				setState(1325);
				externalItem();
				}
				}
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1331);
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
		enterRule(_localctx, 126, RULE_externalItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1333);
				outerAttribute();
				}
				}
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1339);
				macroInvocationSemi();
				}
				break;
			case 2:
				{
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1340);
					visibility();
					}
				}

				setState(1346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1343);
					staticItem();
					}
					break;
				case 2:
					{
					setState(1344);
					function_();
					}
					break;
				case 3:
					{
					setState(1345);
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
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(RustParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(RustParser.COLON, i);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
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
		enterRule(_localctx, 128, RULE_externType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(KW_TYPE);
			setState(1351);
			identifier();
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1352);
				genericParams();
				}
			}

			setState(1357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1355);
				match(COLON);
				setState(1356);
				typeParamBounds();
				}
				break;
			}
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE || _la==COLON) {
				{
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1359);
					match(COLON);
					}
				}

				setState(1362);
				whereClause();
				}
			}

			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1365);
				match(EQ);
				setState(1366);
				type_();
				}
			}

			setState(1369);
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
		enterRule(_localctx, 130, RULE_genericParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(LT);
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -630485314112061439L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4611686018431582211L) != 0)) {
				{
				setState(1377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1372);
						genericParam();
						setState(1373);
						match(COMMA);
						}
						} 
					}
					setState(1379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1380);
				genericParam();
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1381);
					match(COMMA);
					}
				}

				}
			}

			setState(1386);
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
		enterRule(_localctx, 132, RULE_genericParam);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1388);
					outerAttribute();
					}
					} 
				}
				setState(1393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1394);
				lifetimeParam();
				}
				break;
			case 2:
				{
				setState(1395);
				typeParam();
				}
				break;
			case 3:
				{
				setState(1396);
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
		enterRule(_localctx, 134, RULE_lifetimeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1399);
				outerAttribute();
				}
			}

			setState(1402);
			match(LIFETIME_OR_LABEL);
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1403);
				match(COLON);
				setState(1404);
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
		enterRule(_localctx, 136, RULE_typeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1407);
				outerAttribute();
				}
			}

			setState(1410);
			identifier();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1411);
				match(COLON);
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -4498940104277951L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 145272973820289L) != 0)) {
					{
					setState(1412);
					typeParamBounds();
					}
				}

				}
			}

			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1417);
				match(EQ);
				setState(1418);
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
		enterRule(_localctx, 138, RULE_constParam);
		int _la;
		try {
			setState(1437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				match(KW_CONST);
				setState(1422);
				identifier();
				setState(1423);
				match(COLON);
				setState(1424);
				type_();
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1425);
					match(EQ);
					setState(1426);
					constParamDefault();
					}
				}

				}
				break;
			case KW_PIN:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(1429);
				identifier();
				setState(1430);
				match(COLON);
				setState(1431);
				match(KW_CONST);
				setState(1432);
				type_();
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1433);
					match(EQ);
					setState(1434);
					constParamDefault();
					}
				}

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
		enterRule(_localctx, 140, RULE_constParamDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
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
		enterRule(_localctx, 142, RULE_whereClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(KW_WHERE);
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -2247140022156951L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 180457949891465L) != 0)) {
				{
				setState(1442);
				whereClauseItem();
				setState(1447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1443);
						match(COMMA);
						setState(1444);
						whereClauseItem();
						}
						} 
					}
					setState(1449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				}
				}
			}

			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1452);
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
		public EqualityBoundContext equalityBound() {
			return getRuleContext(EqualityBoundContext.class,0);
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
		enterRule(_localctx, 144, RULE_whereClauseItem);
		try {
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				lifetimeWhereClauseItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				typeBoundWhereClauseItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1457);
				equalityBound();
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
		enterRule(_localctx, 146, RULE_lifetimeWhereClauseItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			lifetime();
			setState(1461);
			match(COLON);
			setState(1462);
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
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
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
		enterRule(_localctx, 148, RULE_typeBoundWhereClauseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1464);
				forLifetimes();
				}
				break;
			}
			setState(1467);
			type_();
			setState(1468);
			match(COLON);
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(1469);
				match(KW_CONST);
				}
			}

			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -4498940104277951L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 145272973820289L) != 0)) {
				{
				setState(1472);
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
	public static class EqualityBoundContext extends ParserRuleContext {
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public EqualityBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEqualityBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEqualityBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEqualityBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityBoundContext equalityBound() throws RecognitionException {
		EqualityBoundContext _localctx = new EqualityBoundContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_equalityBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(1475);
				forLifetimes();
				}
			}

			setState(1478);
			typePath();
			setState(1479);
			match(EQ);
			setState(1480);
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
		enterRule(_localctx, 152, RULE_forLifetimes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			match(KW_FOR);
			setState(1483);
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
		public ReuseDeclarationContext reuseDeclaration() {
			return getRuleContext(ReuseDeclarationContext.class,0);
		}
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
		enterRule(_localctx, 154, RULE_associatedItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1485);
				outerAttribute();
				}
				}
				setState(1490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1491);
				reuseDeclaration();
				}
				break;
			case 2:
				{
				setState(1492);
				macroInvocationSemi();
				}
				break;
			case 3:
				{
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1493);
					visibility();
					}
				}

				setState(1499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1496);
					typeAlias();
					}
					break;
				case 2:
					{
					setState(1497);
					constantItem();
					}
					break;
				case 3:
					{
					setState(1498);
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
		enterRule(_localctx, 156, RULE_innerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(POUND);
			setState(1504);
			match(NOT);
			setState(1505);
			match(LSQUAREBRACKET);
			setState(1506);
			attr();
			setState(1507);
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
		enterRule(_localctx, 158, RULE_outerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(POUND);
			setState(1510);
			match(LSQUAREBRACKET);
			setState(1511);
			attr();
			setState(1512);
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
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_SAFE() { return getToken(RustParser.KW_SAFE, 0); }
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
		enterRule(_localctx, 160, RULE_attr);
		int _la;
		try {
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514);
				simplePath();
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 44040193L) != 0)) {
					{
					setState(1515);
					attrInput();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1518);
				_la = _input.LA(1);
				if ( !(_la==KW_UNSAFE || _la==KW_SAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1519);
				match(LPAREN);
				setState(1520);
				simplePath();
				setState(1522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 44040193L) != 0)) {
					{
					setState(1521);
					attrInput();
					}
				}

				setState(1524);
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
		enterRule(_localctx, 162, RULE_attrInput);
		try {
			setState(1531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528);
				delimTokenTree();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529);
				match(EQ);
				setState(1530);
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
		enterRule(_localctx, 164, RULE_statement);
		try {
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				letStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1536);
				macroInvocationSemi();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1537);
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
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
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
		enterRule(_localctx, 166, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1540);
				outerAttribute();
				}
				}
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1546);
			match(KW_LET);
			setState(1547);
			patternNoTopAlt();
			setState(1553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(1548);
				match(COLON);
				setState(1549);
				type_();
				}
				}
				break;
			case PATHSEP:
				{
				{
				setState(1550);
				match(PATHSEP);
				setState(1551);
				match(COLON);
				setState(1552);
				type_();
				}
				}
				break;
			case EQ:
			case SEMI:
				break;
			default:
				break;
			}
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1555);
				match(EQ);
				setState(1556);
				expression(0);
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(1557);
					match(KW_ELSE);
					setState(1558);
					blockExpression();
					}
				}

				}
			}

			setState(1563);
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
		enterRule(_localctx, 168, RULE_expressionStatement);
		try {
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1565);
				expression(0);
				setState(1566);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1568);
				expressionWithBlock();
				setState(1570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1569);
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
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				_localctx = new AttributedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1576); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1575);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1578); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1580);
				expression(49);
				}
				break;
			case 2:
				{
				_localctx = new LiteralExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1582);
				literalExpression();
				}
				break;
			case 3:
				{
				_localctx = new PathExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1583);
				pathExpression();
				}
				break;
			case 4:
				{
				_localctx = new BorrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1584);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==ANDAND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1585);
					match(KW_MUT);
					}
					break;
				}
				setState(1588);
				expression(38);
				}
				break;
			case 5:
				{
				_localctx = new RawPointerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1589);
				match(AND);
				setState(1590);
				match(KW_RAW);
				setState(1591);
				_la = _input.LA(1);
				if ( !(_la==KW_CONST || _la==KW_MUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1592);
				expression(37);
				}
				break;
			case 6:
				{
				_localctx = new DereferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1593);
				match(STAR);
				setState(1594);
				expression(36);
				}
				break;
			case 7:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1595);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1596);
				expression(35);
				}
				break;
			case 8:
				{
				_localctx = new RangeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1597);
				match(DOTDOT);
				setState(1599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1598);
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
				setState(1601);
				match(DOTDOTEQ);
				setState(1602);
				expression(21);
				}
				break;
			case 10:
				{
				_localctx = new DestructuringAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1603);
				patternNoTopAlt();
				setState(1604);
				match(EQ);
				setState(1605);
				expression(18);
				}
				break;
			case 11:
				{
				_localctx = new AssignmentExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1607);
				match(UNDERSCORE);
				setState(1608);
				match(EQ);
				setState(1609);
				expression(17);
				}
				break;
			case 12:
				{
				_localctx = new ContinueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1610);
				match(KW_CONTINUE);
				setState(1612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1611);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1614);
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
				setState(1617);
				match(KW_BREAK);
				setState(1619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1618);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1622);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1621);
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
				setState(1624);
				match(KW_RETURN);
				setState(1626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1625);
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
				setState(1628);
				match(KW_BECOME);
				setState(1629);
				expression(12);
				}
				break;
			case 16:
				{
				_localctx = new YeetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1630);
				match(KW_DO);
				setState(1631);
				match(KW_YEET);
				setState(1633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1632);
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
				setState(1635);
				match(KW_YIELD);
				setState(1637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1636);
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
				setState(1639);
				match(LPAREN);
				setState(1643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1640);
						innerAttribute();
						}
						} 
					}
					setState(1645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				}
				setState(1646);
				expression(0);
				setState(1647);
				match(RPAREN);
				}
				break;
			case 19:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1649);
				match(LSQUAREBRACKET);
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1650);
						innerAttribute();
						}
						} 
					}
					setState(1655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				}
				setState(1657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323986671725209028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240449387231263L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
					{
					setState(1656);
					arrayElements();
					}
				}

				setState(1659);
				match(RSQUAREBRACKET);
				}
				break;
			case 20:
				{
				_localctx = new TupleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1660);
				match(LPAREN);
				setState(1664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1661);
						innerAttribute();
						}
						} 
					}
					setState(1666);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
				}
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323986671725209028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240449387231263L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
					{
					setState(1667);
					tupleElements();
					}
				}

				setState(1670);
				match(RPAREN);
				}
				break;
			case 21:
				{
				_localctx = new StructExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1671);
				structExpression();
				}
				break;
			case 22:
				{
				_localctx = new EnumerationVariantExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1672);
				enumerationVariantExpression();
				}
				break;
			case 23:
				{
				_localctx = new ClosureExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1673);
				closureExpression();
				}
				break;
			case 24:
				{
				_localctx = new ExpressionWithBlock_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1674);
				expressionWithBlock();
				}
				break;
			case 25:
				{
				_localctx = new LetExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1675);
				letExpression();
				}
				break;
			case 26:
				{
				_localctx = new MacroInvocationAsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1676);
				macroInvocation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1781);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1679);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1680);
						_la = _input.LA(1);
						if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1681);
						expression(34);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1682);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1683);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1684);
						expression(33);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1685);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1688);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1686);
							shl();
							}
							break;
						case GT:
							{
							setState(1687);
							shr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1690);
						expression(32);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1692);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1693);
						match(AND);
						setState(1694);
						expression(31);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1695);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1696);
						match(CARET);
						setState(1697);
						expression(30);
						}
						break;
					case 6:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1698);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1699);
						match(OR);
						setState(1700);
						expression(29);
						}
						break;
					case 7:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1701);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1702);
						comparisonOperator();
						setState(1703);
						expression(28);
						}
						break;
					case 8:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1705);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1706);
						match(ANDAND);
						setState(1707);
						expression(27);
						}
						break;
					case 9:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1708);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1709);
						match(OROR);
						setState(1710);
						expression(26);
						}
						break;
					case 10:
						{
						_localctx = new ObsoleteRangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1711);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1712);
						match(DOTDOTDOT);
						setState(1713);
						expression(25);
						}
						break;
					case 11:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1714);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1715);
						match(DOTDOTEQ);
						setState(1716);
						expression(21);
						}
						break;
					case 12:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1717);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1718);
						match(EQ);
						setState(1719);
						expression(20);
						}
						break;
					case 13:
						{
						_localctx = new CompoundAssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1720);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1721);
						compoundAssignOperator();
						setState(1722);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new PostfixMatchExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1724);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(1725);
						match(DOT);
						setState(1726);
						match(KW_MATCH);
						setState(1727);
						match(LCURLYBRACE);
						setState(1731);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1728);
								innerAttribute();
								}
								} 
							}
							setState(1733);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
						}
						setState(1735);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360103713285602776L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240311645894687L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 161L) != 0)) {
							{
							setState(1734);
							matchArms();
							}
						}

						setState(1737);
						match(RCURLYBRACE);
						}
						break;
					case 15:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1738);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(1739);
						match(DOT);
						setState(1740);
						pathExprSegment();
						setState(1741);
						match(LPAREN);
						setState(1743);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323986671725209028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240449387231263L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
							{
							setState(1742);
							callParams();
							}
						}

						setState(1745);
						match(RPAREN);
						}
						break;
					case 16:
						{
						_localctx = new FieldExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1747);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(1748);
						match(DOT);
						setState(1752);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case KW_PIN:
						case KW_SAFE:
						case KW_REUSE:
						case KW_ASYNC:
						case KW_AWAIT:
						case KW_DYN:
						case KW_AUTO:
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
							setState(1749);
							identifier();
							}
							break;
						case KW_SELFVALUE:
							{
							setState(1750);
							match(KW_SELFVALUE);
							}
							break;
						case KW_SELFTYPE:
							{
							setState(1751);
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
						setState(1754);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(1755);
						match(DOT);
						setState(1756);
						tupleIndex();
						}
						break;
					case 18:
						{
						_localctx = new AwaitExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1757);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(1758);
						match(DOT);
						setState(1759);
						match(KW_AWAIT);
						}
						break;
					case 19:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1760);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(1761);
						match(LPAREN);
						setState(1763);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323986671725209028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240449387231263L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
							{
							setState(1762);
							callParams();
							}
						}

						setState(1765);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new IndexExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1766);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1767);
						match(LSQUAREBRACKET);
						setState(1768);
						expression(0);
						setState(1769);
						match(RSQUAREBRACKET);
						}
						break;
					case 21:
						{
						_localctx = new ErrorPropagationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1771);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1772);
						match(QUESTION);
						}
						break;
					case 22:
						{
						_localctx = new TypeCastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1773);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1774);
						match(KW_AS);
						setState(1775);
						typeNoBounds();
						}
						break;
					case 23:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1776);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1777);
						match(DOTDOT);
						setState(1779);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
						case 1:
							{
							setState(1778);
							expression(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
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
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
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
		enterRule(_localctx, 172, RULE_comparisonOperator);
		try {
			setState(1793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1786);
				match(EQEQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1787);
				match(NE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1788);
				match(GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1789);
				match(LT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1790);
				match(GT);
				setState(1791);
				match(EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1792);
				match(LE);
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
		public List<TerminalNode> GT() { return getTokens(RustParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(RustParser.GT, i);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
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
		enterRule(_localctx, 174, RULE_compoundAssignOperator);
		try {
			setState(1807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1795);
				match(PLUSEQ);
				}
				break;
			case MINUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1796);
				match(MINUSEQ);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(1797);
				match(STAREQ);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(1798);
				match(SLASHEQ);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(1799);
				match(PERCENTEQ);
				}
				break;
			case ANDEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(1800);
				match(ANDEQ);
				}
				break;
			case OREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(1801);
				match(OREQ);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(1802);
				match(CARETEQ);
				}
				break;
			case SHLEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(1803);
				match(SHLEQ);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1804);
				match(GT);
				setState(1805);
				match(GT);
				setState(1806);
				match(EQ);
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
		enterRule(_localctx, 176, RULE_expressionWithBlock);
		try {
			int _alt;
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1810); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1809);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1812); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1814);
				expressionWithBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1816);
				blockExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1817);
				asyncBlockExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1818);
				generatorBlockExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1819);
				asyncGeneratorBlockExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1820);
				unsafeBlockExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1821);
				loopExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1822);
				ifExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1823);
				ifLetExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1824);
				matchExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1825);
				constBlockExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1826);
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
		enterRule(_localctx, 178, RULE_generatorBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			match(KW_GEN);
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1830);
				match(KW_MOVE);
				}
			}

			setState(1833);
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
		enterRule(_localctx, 180, RULE_asyncGeneratorBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			match(KW_ASYNC);
			setState(1836);
			match(KW_GEN);
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1837);
				match(KW_MOVE);
				}
			}

			setState(1840);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 182, RULE_literalExpression);
		try {
			setState(1885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1842);
				match(CHAR_LITERAL);
				setState(1844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1843);
					identifier();
					}
					break;
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				match(STRING_LITERAL);
				setState(1848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1847);
					identifier();
					}
					break;
				}
				}
				break;
			case RAW_STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1850);
				match(RAW_STRING_LITERAL);
				setState(1852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(1851);
					identifier();
					}
					break;
				}
				}
				break;
			case BYTE_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1854);
				match(BYTE_LITERAL);
				setState(1856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(1855);
					identifier();
					}
					break;
				}
				}
				break;
			case BYTE_STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1858);
				match(BYTE_STRING_LITERAL);
				setState(1860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1859);
					identifier();
					}
					break;
				}
				}
				break;
			case RAW_BYTE_STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1862);
				match(RAW_BYTE_STRING_LITERAL);
				setState(1864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1863);
					identifier();
					}
					break;
				}
				}
				break;
			case C_STRING_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1866);
				match(C_STRING_LITERAL);
				setState(1868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(1867);
					identifier();
					}
					break;
				}
				}
				break;
			case RAW_C_STRING_LITERAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1870);
				match(RAW_C_STRING_LITERAL);
				setState(1872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(1871);
					identifier();
					}
					break;
				}
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1874);
				match(INTEGER_LITERAL);
				setState(1876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(1875);
					identifier();
					}
					break;
				}
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1878);
				match(FLOAT_LITERAL);
				setState(1881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1879);
					match(UNDERSCORE);
					setState(1880);
					identifier();
					}
					break;
				}
				}
				break;
			case KW_TRUE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1883);
				match(KW_TRUE);
				}
				break;
			case KW_FALSE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1884);
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
		enterRule(_localctx, 184, RULE_pathExpression);
		try {
			setState(1889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(1887);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1888);
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
		enterRule(_localctx, 186, RULE_blockExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(LCURLYBRACE);
			setState(1895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1892);
					innerAttribute();
					}
					} 
				}
				setState(1897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			}
			setState(1899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323423681772535876L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145161953994078239L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1898);
				statements();
				}
			}

			setState(1901);
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
		enterRule(_localctx, 188, RULE_statements);
		int _la;
		try {
			int _alt;
			setState(1912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1904); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1903);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1906); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323986671725209028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240449387231263L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
					{
					setState(1908);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911);
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
		enterRule(_localctx, 190, RULE_asyncBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			match(KW_ASYNC);
			setState(1916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1915);
				match(KW_MOVE);
				}
			}

			setState(1918);
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
		enterRule(_localctx, 192, RULE_unsafeBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			match(KW_UNSAFE);
			setState(1921);
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
		enterRule(_localctx, 194, RULE_constBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			match(KW_CONST);
			setState(1924);
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
		enterRule(_localctx, 196, RULE_tryBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			match(KW_TRY);
			setState(1927);
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
		enterRule(_localctx, 198, RULE_arrayElements);
		int _la;
		try {
			int _alt;
			setState(1944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1929);
				expression(0);
				setState(1934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1930);
						match(COMMA);
						setState(1931);
						expression(0);
						}
						} 
					}
					setState(1936);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
				}
				setState(1938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1937);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				expression(0);
				setState(1941);
				match(SEMI);
				setState(1942);
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
		enterRule(_localctx, 200, RULE_tupleElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1949); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1946);
					expression(0);
					setState(1947);
					match(COMMA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1951); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323986671725209028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240449387231263L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1953);
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
		enterRule(_localctx, 202, RULE_tupleIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
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
		enterRule(_localctx, 204, RULE_structExpression);
		try {
			setState(1961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1958);
				structExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1959);
				structExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1960);
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
		enterRule(_localctx, 206, RULE_structExprStruct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(1963);
				pathInExpression();
				}
				break;
			case LT:
				{
				setState(1964);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1967);
			match(LCURLYBRACE);
			setState(1971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1968);
					innerAttribute();
					}
					} 
				}
				setState(1973);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			}
			setState(1976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(1974);
				structExprFields();
				}
				break;
			case DOTDOT:
				{
				setState(1975);
				structBase();
				}
				break;
			case RCURLYBRACE:
				break;
			default:
				break;
			}
			setState(1978);
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
		enterRule(_localctx, 208, RULE_structExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			structExprField();
			setState(1985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1981);
					match(COMMA);
					setState(1982);
					structExprField();
					}
					} 
				}
				setState(1987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(1988);
				match(COMMA);
				setState(1989);
				structBase();
				}
				break;
			case 2:
				{
				setState(1991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1990);
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
		enterRule(_localctx, 210, RULE_structExprField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1995);
				outerAttribute();
				}
				}
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2001);
				identifier();
				}
				break;
			case 2:
				{
				setState(2004);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PIN:
				case KW_SAFE:
				case KW_REUSE:
				case KW_ASYNC:
				case KW_AWAIT:
				case KW_DYN:
				case KW_AUTO:
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
					setState(2002);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(2003);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2006);
				match(COLON);
				setState(2007);
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
		enterRule(_localctx, 212, RULE_structBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			match(DOTDOT);
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323986671725209028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240449387231263L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(2012);
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
		enterRule(_localctx, 214, RULE_structExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			pathInExpression();
			setState(2016);
			match(LPAREN);
			setState(2020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2017);
					innerAttribute();
					}
					} 
				}
				setState(2022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			}
			setState(2034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323986671725209028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240449387231263L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(2023);
				expression(0);
				setState(2028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2024);
						match(COMMA);
						setState(2025);
						expression(0);
						}
						} 
					}
					setState(2030);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				}
				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2031);
					match(COMMA);
					}
				}

				}
			}

			setState(2036);
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
		enterRule(_localctx, 216, RULE_structExprUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
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
		enterRule(_localctx, 218, RULE_enumerationVariantExpression);
		try {
			setState(2043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2040);
				enumExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2041);
				enumExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2042);
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
		enterRule(_localctx, 220, RULE_enumExprStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			pathInExpression();
			setState(2046);
			match(LCURLYBRACE);
			setState(2048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 288247818018343425L) != 0)) {
				{
				setState(2047);
				enumExprFields();
				}
			}

			setState(2050);
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
		enterRule(_localctx, 222, RULE_enumExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			enumExprField();
			setState(2057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2053);
					match(COMMA);
					setState(2054);
					enumExprField();
					}
					} 
				}
				setState(2059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			}
			setState(2061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2060);
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
		enterRule(_localctx, 224, RULE_enumExprField);
		try {
			setState(2071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2063);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2066);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PIN:
				case KW_SAFE:
				case KW_REUSE:
				case KW_ASYNC:
				case KW_AWAIT:
				case KW_DYN:
				case KW_AUTO:
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
					setState(2064);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(2065);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2068);
				match(COLON);
				setState(2069);
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
		enterRule(_localctx, 226, RULE_enumExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			pathInExpression();
			setState(2074);
			match(LPAREN);
			setState(2086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -323986671725209028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240449387231263L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(2075);
				expression(0);
				setState(2080);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2076);
						match(COMMA);
						setState(2077);
						expression(0);
						}
						} 
					}
					setState(2082);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
				}
				setState(2084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2083);
					match(COMMA);
					}
				}

				}
			}

			setState(2088);
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
		enterRule(_localctx, 228, RULE_enumExprFieldless);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2090);
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
		enterRule(_localctx, 230, RULE_callParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2092);
			expression(0);
			setState(2097);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2093);
					match(COMMA);
					setState(2094);
					expression(0);
					}
					} 
				}
				setState(2099);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			}
			setState(2101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2100);
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
		enterRule(_localctx, 232, RULE_closureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(2103);
				forLifetimes();
				}
			}

			setState(2107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATIC) {
				{
				setState(2106);
				match(KW_STATIC);
				}
			}

			setState(2110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(2109);
				match(KW_CONST);
				}
			}

			setState(2113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(2112);
				match(KW_ASYNC);
				}
			}

			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(2115);
				match(KW_MOVE);
				}
			}

			setState(2124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OROR:
				{
				setState(2118);
				match(OROR);
				}
				break;
			case OR:
				{
				setState(2119);
				match(OR);
				setState(2121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2120);
					closureParameters();
					}
					break;
				}
				setState(2123);
				match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2131);
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
			case KW_SAFE:
			case KW_REUSE:
			case KW_WHILE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(2126);
				expression(0);
				}
				break;
			case RARROW:
				{
				setState(2127);
				match(RARROW);
				setState(2128);
				typeNoBounds();
				setState(2129);
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
		enterRule(_localctx, 234, RULE_closureParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			closureParam();
			setState(2138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2134);
					match(COMMA);
					setState(2135);
					closureParam();
					}
					} 
				}
				setState(2140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			setState(2142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2141);
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
		enterRule(_localctx, 236, RULE_closureParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2144);
				outerAttribute();
				}
				}
				setState(2149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2150);
			pattern();
			setState(2153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2151);
				match(COLON);
				setState(2152);
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
		enterRule(_localctx, 238, RULE_loopExpression);
		int _la;
		try {
			setState(2167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIFETIME_OR_LABEL) {
					{
					setState(2155);
					loopLabel();
					}
				}

				setState(2162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
				case 1:
					{
					setState(2158);
					infiniteLoopExpression();
					}
					break;
				case 2:
					{
					setState(2159);
					predicateLoopExpression();
					}
					break;
				case 3:
					{
					setState(2160);
					predicatePatternLoopExpression();
					}
					break;
				case 4:
					{
					setState(2161);
					iteratorLoopExpression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2164);
				loopLabel();
				setState(2165);
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
		enterRule(_localctx, 240, RULE_infiniteLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2169);
			match(KW_LOOP);
			setState(2170);
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
		enterRule(_localctx, 242, RULE_predicateLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2172);
			match(KW_WHILE);
			setState(2173);
			expression(0);
			setState(2174);
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
		enterRule(_localctx, 244, RULE_predicatePatternLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2176);
			match(KW_WHILE);
			setState(2177);
			match(KW_LET);
			setState(2178);
			pattern();
			setState(2179);
			match(EQ);
			setState(2180);
			expression(0);
			setState(2181);
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
		enterRule(_localctx, 246, RULE_iteratorLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			match(KW_FOR);
			setState(2184);
			pattern();
			setState(2185);
			match(KW_IN);
			setState(2186);
			expression(0);
			setState(2187);
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
		enterRule(_localctx, 248, RULE_labelBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
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
		enterRule(_localctx, 250, RULE_loopLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2191);
			match(LIFETIME_OR_LABEL);
			setState(2192);
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
		enterRule(_localctx, 252, RULE_ifExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			match(KW_IF);
			setState(2195);
			expression(0);
			setState(2196);
			blockExpression();
			setState(2203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2197);
				match(KW_ELSE);
				setState(2201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2198);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(2199);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(2200);
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
		enterRule(_localctx, 254, RULE_ifLetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			match(KW_IF);
			setState(2206);
			match(KW_LET);
			setState(2207);
			pattern();
			setState(2208);
			match(EQ);
			setState(2209);
			expression(0);
			setState(2210);
			blockExpression();
			setState(2217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(2211);
				match(KW_ELSE);
				setState(2215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2212);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(2213);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(2214);
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
		enterRule(_localctx, 256, RULE_letExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2219);
			match(KW_LET);
			setState(2220);
			pattern();
			setState(2221);
			match(EQ);
			setState(2222);
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
		enterRule(_localctx, 258, RULE_matchExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			match(KW_MATCH);
			setState(2225);
			expression(0);
			setState(2226);
			match(LCURLYBRACE);
			setState(2230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2227);
					innerAttribute();
					}
					} 
				}
				setState(2232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			setState(2234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360103713285602776L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240311645894687L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 161L) != 0)) {
				{
				setState(2233);
				matchArms();
				}
			}

			setState(2236);
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
		public PatternNoTopAltContext patternNoTopAlt() {
			return getRuleContext(PatternNoTopAltContext.class,0);
		}
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
		enterRule(_localctx, 260, RULE_matchArms);
		int _la;
		try {
			int _alt;
			setState(2257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2238);
						matchArm();
						setState(2239);
						match(FATARROW);
						setState(2240);
						matchArmExpression();
						}
						} 
					}
					setState(2246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
				}
				setState(2247);
				matchArm();
				setState(2248);
				match(FATARROW);
				setState(2249);
				expression(0);
				setState(2251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2250);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2253);
				patternNoTopAlt();
				setState(2255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2254);
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
		enterRule(_localctx, 262, RULE_matchArmExpression);
		int _la;
		try {
			setState(2266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2259);
				expression(0);
				setState(2260);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2262);
				expressionWithBlock();
				setState(2264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2263);
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
		enterRule(_localctx, 264, RULE_matchArm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2268);
				outerAttribute();
				}
				}
				setState(2273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2274);
			pattern();
			setState(2276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(2275);
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
		enterRule(_localctx, 266, RULE_matchArmGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			match(KW_IF);
			setState(2279);
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
		enterRule(_localctx, 268, RULE_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(2281);
				match(OR);
				}
			}

			setState(2284);
			patternNoTopAlt();
			setState(2289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2285);
					match(OR);
					setState(2286);
					patternNoTopAlt();
					}
					} 
				}
				setState(2291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
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
		enterRule(_localctx, 270, RULE_patternNoTopAlt);
		try {
			setState(2301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2292);
					patternWithoutRange();
					}
					break;
				case 2:
					{
					setState(2293);
					rangePattern();
					}
					break;
				}
				setState(2296);
				match(KW_IF);
				setState(2297);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2299);
				patternWithoutRange();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2300);
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
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
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
		enterRule(_localctx, 272, RULE_patternWithoutRange);
		try {
			setState(2318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2303);
				boxPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2304);
				literalPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2305);
				match(NOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2306);
				identifierPattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2307);
				wildcardPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2308);
				restPattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2309);
				referencePattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2310);
				structPattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2311);
				tupleStructPattern();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2312);
				tuplePattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2313);
				groupedPattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2314);
				slicePattern();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2315);
				pathPattern();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2316);
				macroInvocation();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2317);
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
		enterRule(_localctx, 274, RULE_boxPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2320);
			match(KW_BOX);
			setState(2321);
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
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
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
		enterRule(_localctx, 276, RULE_literalPattern);
		int _la;
		try {
			setState(2340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2323);
				match(KW_TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2324);
				match(KW_FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2325);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2326);
				match(BYTE_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2327);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2328);
				match(RAW_STRING_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2329);
				match(BYTE_STRING_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2330);
				match(NOT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2331);
				match(RAW_BYTE_STRING_LITERAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2332);
					match(MINUS);
					}
				}

				setState(2335);
				match(INTEGER_LITERAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2336);
					match(MINUS);
					}
				}

				setState(2339);
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
		enterRule(_localctx, 278, RULE_identifierPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_MUT || _la==KW_REF) {
				{
				{
				setState(2342);
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
				setState(2347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2348);
			identifier();
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2349);
				match(AT);
				setState(2350);
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
		enterRule(_localctx, 280, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
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
		enterRule(_localctx, 282, RULE_restPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
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
		enterRule(_localctx, 284, RULE_rangePattern);
		try {
			setState(2376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				_localctx = new ExclusiveRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2357);
				rangePatternBound();
				setState(2358);
				match(DOTDOT);
				setState(2359);
				rangePatternBound();
				}
				break;
			case 2:
				_localctx = new InclusiveRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2361);
				rangePatternBound();
				setState(2362);
				match(DOTDOTEQ);
				setState(2363);
				rangePatternBound();
				}
				break;
			case 3:
				_localctx = new RangeToPatternContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2365);
				match(DOTDOT);
				setState(2366);
				rangePatternBound();
				}
				break;
			case 4:
				_localctx = new InclusiveRangeToPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2367);
				match(DOTDOTEQ);
				setState(2368);
				rangePatternBound();
				}
				break;
			case 5:
				_localctx = new RangeFromPatternContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2369);
				rangePatternBound();
				setState(2370);
				match(DOTDOT);
				}
				break;
			case 6:
				_localctx = new ObsoleteRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2372);
				rangePatternBound();
				setState(2373);
				match(DOTDOTDOT);
				setState(2374);
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
		enterRule(_localctx, 286, RULE_rangePatternBound);
		int _la;
		try {
			setState(2390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2378);
				match(CHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2379);
				match(BYTE_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2380);
					match(MINUS);
					}
				}

				setState(2383);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2384);
					match(MINUS);
					}
				}

				setState(2387);
				match(FLOAT_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2388);
				pathPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2389);
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
		enterRule(_localctx, 288, RULE_referencePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==ANDAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				setState(2393);
				match(KW_MUT);
				}
				break;
			}
			setState(2396);
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
		enterRule(_localctx, 290, RULE_structPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(2398);
				pathInExpression();
				}
				break;
			case LT:
				{
				setState(2399);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2402);
			match(LCURLYBRACE);
			setState(2404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & -9222813897089007579L) != 0) || _la==DOTDOT || _la==POUND) {
				{
				setState(2403);
				structPatternElements();
				}
			}

			setState(2406);
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
		enterRule(_localctx, 292, RULE_structPatternElements);
		int _la;
		try {
			setState(2416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2408);
				structPatternFields();
				setState(2413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2409);
					match(COMMA);
					setState(2411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOTDOT || _la==POUND) {
						{
						setState(2410);
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
				setState(2415);
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
		enterRule(_localctx, 294, RULE_structPatternFields);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			structPatternField();
			setState(2423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2419);
					match(COMMA);
					setState(2420);
					structPatternField();
					}
					} 
				}
				setState(2425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
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
		enterRule(_localctx, 296, RULE_structPatternField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2426);
				outerAttribute();
				}
				}
				setState(2431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				{
				setState(2432);
				tupleIndex();
				setState(2433);
				match(COLON);
				setState(2434);
				pattern();
				}
				break;
			case 2:
				{
				setState(2436);
				identifier();
				setState(2437);
				match(COLON);
				setState(2438);
				pattern();
				}
				break;
			case 3:
				{
				setState(2441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_REF) {
					{
					setState(2440);
					match(KW_REF);
					}
				}

				setState(2444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MUT) {
					{
					setState(2443);
					match(KW_MUT);
					}
				}

				setState(2446);
				identifier();
				}
				break;
			case 4:
				{
				setState(2447);
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
		enterRule(_localctx, 298, RULE_structPatternEtCetera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2450);
				outerAttribute();
				}
				}
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2456);
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
		enterRule(_localctx, 300, RULE_tupleStructPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(2458);
				pathInExpression();
				}
				break;
			case LT:
				{
				setState(2459);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2462);
			match(LPAREN);
			setState(2464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360103713285602776L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240311645894687L) != 0) || _la==LSQUAREBRACKET || _la==LPAREN) {
				{
				setState(2463);
				tupleStructItems();
				}
			}

			setState(2466);
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
		enterRule(_localctx, 302, RULE_tupleStructItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2468);
			pattern();
			setState(2473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2469);
					match(COMMA);
					setState(2470);
					pattern();
					}
					} 
				}
				setState(2475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
			}
			setState(2477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2476);
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
		enterRule(_localctx, 304, RULE_tuplePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(LPAREN);
			setState(2481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360103713285602776L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240311645894687L) != 0) || _la==LSQUAREBRACKET || _la==LPAREN) {
				{
				setState(2480);
				tuplePatternItems();
				}
			}

			setState(2483);
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
		enterRule(_localctx, 306, RULE_tuplePatternItems);
		int _la;
		try {
			int _alt;
			setState(2499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2485);
				pattern();
				setState(2486);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2488);
				restPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2489);
				pattern();
				setState(2492); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2490);
						match(COMMA);
						setState(2491);
						pattern();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2494); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,359,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2496);
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
		enterRule(_localctx, 308, RULE_groupedPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2501);
			match(LPAREN);
			setState(2502);
			pattern();
			setState(2503);
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
		enterRule(_localctx, 310, RULE_slicePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			match(LSQUAREBRACKET);
			setState(2507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -360103713285602776L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4992240311645894687L) != 0) || _la==LSQUAREBRACKET || _la==LPAREN) {
				{
				setState(2506);
				slicePatternItems();
				}
			}

			setState(2509);
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
		enterRule(_localctx, 312, RULE_slicePatternItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2511);
			pattern();
			setState(2516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2512);
					match(COMMA);
					setState(2513);
					pattern();
					}
					} 
				}
				setState(2518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			}
			setState(2520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2519);
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
		enterRule(_localctx, 314, RULE_pathPattern);
		try {
			setState(2524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(2522);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2523);
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
		enterRule(_localctx, 316, RULE_type_);
		int _la;
		try {
			setState(2542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2526);
				typeNoBounds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2527);
				implTraitType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2528);
				traitObjectType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2529);
				match(KW_FOR);
				setState(2530);
				match(LT);
				setState(2531);
				lifetime();
				setState(2536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2532);
					match(COMMA);
					setState(2533);
					lifetime();
					}
					}
					setState(2538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2539);
				match(GT);
				setState(2540);
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
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
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
		enterRule(_localctx, 318, RULE_typeNoBounds);
		try {
			setState(2562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2544);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2545);
				implTraitTypeOneBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2546);
				match(KW_UNSAFE);
				setState(2547);
				genericParams();
				setState(2548);
				typeNoBounds();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2550);
				traitObjectTypeOneBound();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2551);
				typePath();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2552);
				tupleType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2553);
				neverType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2554);
				rawPointerType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2555);
				referenceType();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2556);
				arrayType();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2557);
				sliceType();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2558);
				inferredType();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2559);
				qualifiedPathInType();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2560);
				bareFunctionType();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2561);
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
		enterRule(_localctx, 320, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			match(LPAREN);
			setState(2565);
			type_();
			setState(2566);
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
		enterRule(_localctx, 322, RULE_neverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
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
		enterRule(_localctx, 324, RULE_tupleType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
			match(LPAREN);
			setState(2581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -2247140022156951L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 180457949891465L) != 0)) {
				{
				setState(2574); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2571);
						type_();
						setState(2572);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2576); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -2247140022156951L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 180457949891465L) != 0)) {
					{
					setState(2578);
					type_();
					}
				}

				}
			}

			setState(2583);
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
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
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
		enterRule(_localctx, 326, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2585);
			match(LSQUAREBRACKET);
			setState(2586);
			type_();
			setState(2587);
			match(SEMI);
			setState(2590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				{
				setState(2588);
				expression(0);
				}
				break;
			case 2:
				{
				setState(2589);
				match(UNDERSCORE);
				}
				break;
			}
			setState(2592);
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
		enterRule(_localctx, 328, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2594);
			match(LSQUAREBRACKET);
			setState(2595);
			type_();
			setState(2596);
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
		enterRule(_localctx, 330, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==ANDAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL) {
				{
				setState(2599);
				lifetime();
				}
			}

			setState(2603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				{
				setState(2602);
				match(KW_PIN);
				}
				break;
			}
			setState(2606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST || _la==KW_MUT) {
				{
				setState(2605);
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

			setState(2608);
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
		enterRule(_localctx, 332, RULE_rawPointerType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			match(STAR);
			setState(2611);
			_la = _input.LA(1);
			if ( !(_la==KW_CONST || _la==KW_MUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2612);
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
		enterRule(_localctx, 334, RULE_bareFunctionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(2614);
				forLifetimes();
				}
			}

			setState(2617);
			functionTypeQualifiers();
			setState(2618);
			match(KW_FN);
			setState(2619);
			match(LPAREN);
			setState(2621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -2247140022124183L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 181561756486537L) != 0)) {
				{
				setState(2620);
				functionParametersMaybeNamedVariadic();
				}
			}

			setState(2623);
			match(RPAREN);
			setState(2625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				{
				setState(2624);
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
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode KW_SAFE() { return getToken(RustParser.KW_SAFE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
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
		enterRule(_localctx, 336, RULE_functionTypeQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE || _la==KW_SAFE) {
				{
				setState(2627);
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

			setState(2634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERN) {
				{
				setState(2630);
				match(KW_EXTERN);
				setState(2632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
					{
					setState(2631);
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
		enterRule(_localctx, 338, RULE_bareFunctionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2636);
			match(RARROW);
			setState(2637);
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
		enterRule(_localctx, 340, RULE_functionParametersMaybeNamedVariadic);
		try {
			setState(2641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2639);
				maybeNamedFunctionParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2640);
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
		public SelfParamContext selfParam() {
			return getRuleContext(SelfParamContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public List<MaybeNamedParamContext> maybeNamedParam() {
			return getRuleContexts(MaybeNamedParamContext.class);
		}
		public MaybeNamedParamContext maybeNamedParam(int i) {
			return getRuleContext(MaybeNamedParamContext.class,i);
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
		enterRule(_localctx, 342, RULE_maybeNamedFunctionParameters);
		int _la;
		try {
			int _alt;
			setState(2665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2643);
				selfParam();
				setState(2648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2644);
						match(COMMA);
						setState(2645);
						maybeNamedParam();
						}
						} 
					}
					setState(2650);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
				}
				setState(2652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2651);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2654);
				maybeNamedParam();
				setState(2659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2655);
						match(COMMA);
						setState(2656);
						maybeNamedParam();
						}
						} 
					}
					setState(2661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
				}
				setState(2663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2662);
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
		enterRule(_localctx, 344, RULE_maybeNamedParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2667);
				outerAttribute();
				}
				}
				setState(2672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
			case 1:
				{
				setState(2675);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PIN:
				case KW_SAFE:
				case KW_REUSE:
				case KW_ASYNC:
				case KW_AWAIT:
				case KW_DYN:
				case KW_AUTO:
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
					setState(2673);
					identifier();
					}
					break;
				case UNDERSCORE:
					{
					setState(2674);
					match(UNDERSCORE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2677);
				match(COLON);
				}
				break;
			}
			setState(2682);
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
			case KW_SAFE:
			case KW_USE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				{
				setState(2680);
				type_();
				}
				break;
			case DOTDOTDOT:
				{
				setState(2681);
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
		enterRule(_localctx, 346, RULE_maybeNamedFunctionParametersVariadic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2684);
					maybeNamedParam();
					setState(2685);
					match(COMMA);
					}
					} 
				}
				setState(2691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
			}
			setState(2692);
			maybeNamedParam();
			setState(2693);
			match(COMMA);
			setState(2697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2694);
				outerAttribute();
				}
				}
				setState(2699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2700);
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
		enterRule(_localctx, 348, RULE_traitObjectType);
		int _la;
		try {
			setState(2712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2702);
				match(KW_DYN);
				setState(2703);
				if (!( _input.LA(1) != RustLexer.PATHSEP   // ::
				        && _input.LA(1) != RustLexer.LT     // <
				      )) throw new FailedPredicateException(this, " _input.LA(1) != RustLexer.PATHSEP   // ::\n        && _input.LA(1) != RustLexer.LT     // <\n      ");
				setState(2705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(2704);
					match(STAR);
					}
				}

				setState(2707);
				typeParamBounds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(2708);
					match(STAR);
					}
				}

				setState(2711);
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
		enterRule(_localctx, 350, RULE_traitObjectTypeOneBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
			case 1:
				{
				setState(2714);
				match(KW_DYN);
				}
				break;
			}
			setState(2718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(2717);
				match(STAR);
				}
			}

			setState(2720);
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
		enterRule(_localctx, 352, RULE_implTraitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2722);
			match(KW_IMPL);
			setState(2724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(2723);
				match(KW_CONST);
				}
			}

			setState(2726);
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
		enterRule(_localctx, 354, RULE_implTraitTypeOneBound);
		int _la;
		try {
			setState(2738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2728);
				match(KW_IMPL);
				setState(2730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CONST) {
					{
					setState(2729);
					match(KW_CONST);
					}
				}

				setState(2732);
				closureTraitType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2733);
				match(KW_IMPL);
				setState(2735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CONST) {
					{
					setState(2734);
					match(KW_CONST);
					}
				}

				setState(2737);
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
		enterRule(_localctx, 356, RULE_closureTraitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(2740);
				forLifetimes();
				}
			}

			setState(2744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(2743);
				match(KW_ASYNC);
				}
			}

			setState(2746);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2747);
			match(LPAREN);
			setState(2749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & -2247140022124183L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 181561756486537L) != 0)) {
				{
				setState(2748);
				functionParametersMaybeNamedVariadic();
				}
			}

			setState(2751);
			match(RPAREN);
			setState(2754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
			case 1:
				{
				setState(2752);
				match(RARROW);
				setState(2753);
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
		enterRule(_localctx, 358, RULE_inferredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2756);
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
		enterRule(_localctx, 360, RULE_typeParamBounds);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2758);
			boundElement();
			setState(2763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2759);
					match(PLUS);
					setState(2760);
					boundElement();
					}
					} 
				}
				setState(2765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
			}
			setState(2767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
			case 1:
				{
				setState(2766);
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
		enterRule(_localctx, 362, RULE_boundElement);
		try {
			setState(2774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2769);
				typeParamBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2770);
				match(LPAREN);
				setState(2771);
				typeParamBounds();
				setState(2772);
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
		enterRule(_localctx, 364, RULE_typeParamBound);
		try {
			setState(2780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2776);
				lifetime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2777);
				traitBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2778);
				closureTraitType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2779);
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
		public List<TerminalNode> TILDE() { return getTokens(RustParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(RustParser.TILDE, i);
		}
		public List<TerminalNode> KW_CONST() { return getTokens(RustParser.KW_CONST); }
		public TerminalNode KW_CONST(int i) {
			return getToken(RustParser.KW_CONST, i);
		}
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
		enterRule(_localctx, 366, RULE_traitBound);
		int _la;
		try {
			setState(2821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_FOR:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(2783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2782);
					match(NOT);
					}
				}

				setState(2786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2785);
					match(QUESTION);
					}
				}

				{
				setState(2790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
				case 1:
					{
					setState(2788);
					match(TILDE);
					setState(2789);
					match(KW_CONST);
					}
					break;
				}
				setState(2793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2792);
					forLifetimes();
					}
				}

				setState(2797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TILDE) {
					{
					setState(2795);
					match(TILDE);
					setState(2796);
					match(KW_CONST);
					}
				}

				}
				setState(2799);
				typePath();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2800);
				match(LPAREN);
				setState(2802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2801);
					match(NOT);
					}
				}

				setState(2805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2804);
					match(QUESTION);
					}
				}

				{
				setState(2809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
				case 1:
					{
					setState(2807);
					match(TILDE);
					setState(2808);
					match(KW_CONST);
					}
					break;
				}
				setState(2812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2811);
					forLifetimes();
					}
				}

				setState(2816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TILDE) {
					{
					setState(2814);
					match(TILDE);
					setState(2815);
					match(KW_CONST);
					}
				}

				}
				setState(2818);
				typePath();
				setState(2819);
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
		enterRule(_localctx, 368, RULE_useBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2823);
			match(KW_USE);
			setState(2824);
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
		enterRule(_localctx, 370, RULE_useBoundGenericArgs);
		int _la;
		try {
			int _alt;
			setState(2843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2826);
				match(LT);
				setState(2827);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2828);
				match(LT);
				setState(2834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,422,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2829);
						useBoundGenericArg();
						setState(2830);
						match(COMMA);
						}
						} 
					}
					setState(2836);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,422,_ctx);
				}
				setState(2837);
				useBoundGenericArg();
				setState(2839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2838);
					match(COMMA);
					}
				}

				setState(2841);
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
		enterRule(_localctx, 372, RULE_useBoundGenericArg);
		try {
			setState(2848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STATICLIFETIME:
			case LIFETIME_OR_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2845);
				lifetime();
				}
				break;
			case KW_PIN:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(2846);
				identifier();
				}
				break;
			case KW_SELFTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2847);
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
		enterRule(_localctx, 374, RULE_lifetimeBounds);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,426,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2850);
					lifetime();
					setState(2851);
					match(PLUS);
					}
					} 
				}
				setState(2857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,426,_ctx);
			}
			setState(2859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL) {
				{
				setState(2858);
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
		enterRule(_localctx, 376, RULE_lifetime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2861);
			_la = _input.LA(1);
			if ( !(_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL) ) {
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
		enterRule(_localctx, 378, RULE_simplePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2863);
				match(PATHSEP);
				}
			}

			setState(2866);
			simplePathSegment();
			setState(2871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,429,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2867);
					match(PATHSEP);
					setState(2868);
					simplePathSegment();
					}
					} 
				}
				setState(2873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,429,_ctx);
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
		public TerminalNode KW_AUTO() { return getToken(RustParser.KW_AUTO, 0); }
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
		enterRule(_localctx, 380, RULE_simplePathSegment);
		try {
			setState(2881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,430,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2874);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2875);
				match(KW_SUPER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2876);
				match(KW_SELFVALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2877);
				match(KW_CRATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2878);
				match(KW_DOLLARCRATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2879);
				match(KW_TRY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2880);
				match(KW_AUTO);
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
		enterRule(_localctx, 382, RULE_pathInExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2883);
				match(PATHSEP);
				}
			}

			setState(2886);
			pathExprSegment();
			setState(2891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,432,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2887);
					match(PATHSEP);
					setState(2888);
					pathExprSegment();
					}
					} 
				}
				setState(2893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,432,_ctx);
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
		enterRule(_localctx, 384, RULE_pathExprSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2894);
			pathIdentSegment();
			setState(2897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,433,_ctx) ) {
			case 1:
				{
				setState(2895);
				match(PATHSEP);
				setState(2896);
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
		enterRule(_localctx, 386, RULE_pathIdentSegment);
		try {
			setState(2906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2899);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2900);
				match(KW_DYN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2901);
				match(KW_SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2902);
				match(KW_SELFVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2903);
				match(KW_SELFTYPE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2904);
				match(KW_CRATE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2905);
				match(KW_DOLLARCRATE);
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
		enterRule(_localctx, 388, RULE_genericArgs);
		int _la;
		try {
			int _alt;
			setState(2951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,442,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2908);
				match(LT);
				setState(2909);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2910);
				match(LT);
				setState(2911);
				genericArgsLifetimes();
				setState(2914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,435,_ctx) ) {
				case 1:
					{
					setState(2912);
					match(COMMA);
					setState(2913);
					genericArgsTypes();
					}
					break;
				}
				setState(2918);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,436,_ctx) ) {
				case 1:
					{
					setState(2916);
					match(COMMA);
					setState(2917);
					genericArgsBindings();
					}
					break;
				}
				setState(2921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2920);
					match(COMMA);
					}
				}

				setState(2923);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2925);
				match(LT);
				setState(2926);
				genericArgsTypes();
				setState(2929);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,438,_ctx) ) {
				case 1:
					{
					setState(2927);
					match(COMMA);
					setState(2928);
					genericArgsBindings();
					}
					break;
				}
				setState(2932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2931);
					match(COMMA);
					}
				}

				setState(2934);
				match(GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2936);
				match(LT);
				setState(2942);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,440,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2937);
						genericArg();
						setState(2938);
						match(COMMA);
						}
						} 
					}
					setState(2944);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,440,_ctx);
				}
				setState(2945);
				genericArg();
				setState(2947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2946);
					match(COMMA);
					}
				}

				setState(2949);
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
		enterRule(_localctx, 390, RULE_genericArg);
		try {
			setState(2958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,443,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2953);
				lifetime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2954);
				type_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2955);
				genericArgsConst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2956);
				genericArgsBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2957);
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
		enterRule(_localctx, 392, RULE_genericArgsConst);
		int _la;
		try {
			setState(2966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2960);
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
				setState(2962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2961);
					match(MINUS);
					}
				}

				setState(2964);
				literalExpression();
				}
				break;
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SUPER:
			case KW_SAFE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				setState(2965);
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
		enterRule(_localctx, 394, RULE_genericArgsLifetimes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2968);
			lifetime();
			setState(2973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,446,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2969);
					match(COMMA);
					setState(2970);
					lifetime();
					}
					} 
				}
				setState(2975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,446,_ctx);
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
		enterRule(_localctx, 396, RULE_genericArgsTypes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2976);
			type_();
			setState(2981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,447,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2977);
					match(COMMA);
					setState(2978);
					type_();
					}
					} 
				}
				setState(2983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,447,_ctx);
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
		enterRule(_localctx, 398, RULE_genericArgsBindings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2984);
			genericArgsBinding();
			setState(2989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,448,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2985);
					match(COMMA);
					setState(2986);
					genericArgsBinding();
					}
					} 
				}
				setState(2991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,448,_ctx);
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
		enterRule(_localctx, 400, RULE_genericArgsBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2992);
			identifier();
			setState(2994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2993);
				match(PATHSEP);
				}
			}

			setState(2998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				{
				setState(2996);
				genericArgs();
				}
				break;
			case LPAREN:
				{
				setState(2997);
				typePathFn();
				}
				break;
			case EQ:
				break;
			default:
				break;
			}
			setState(3000);
			match(EQ);
			setState(3003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,451,_ctx) ) {
			case 1:
				{
				setState(3001);
				type_();
				}
				break;
			case 2:
				{
				setState(3002);
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
		enterRule(_localctx, 402, RULE_genericArgsBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3005);
			identifier();
			setState(3007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(3006);
				match(PATHSEP);
				}
			}

			setState(3011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				{
				setState(3009);
				genericArgs();
				}
				break;
			case LPAREN:
				{
				setState(3010);
				typePathFn();
				}
				break;
			case COLON:
				break;
			default:
				break;
			}
			setState(3013);
			match(COLON);
			setState(3014);
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
		enterRule(_localctx, 404, RULE_qualifiedPathInExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3016);
			qualifiedPathType();
			setState(3019); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3017);
					match(PATHSEP);
					setState(3018);
					pathExprSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3021); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,454,_ctx);
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
		enterRule(_localctx, 406, RULE_qualifiedPathType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3023);
			match(LT);
			setState(3024);
			type_();
			setState(3027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(3025);
				match(KW_AS);
				setState(3026);
				typePath();
				}
			}

			setState(3029);
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
		enterRule(_localctx, 408, RULE_qualifiedPathInType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3031);
			qualifiedPathType();
			setState(3034); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3032);
					match(PATHSEP);
					setState(3033);
					typePathSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3036); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
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
		enterRule(_localctx, 410, RULE_typePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(3038);
				match(PATHSEP);
				}
			}

			setState(3041);
			typePathSegment();
			setState(3046);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,458,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3042);
					match(PATHSEP);
					setState(3043);
					typePathSegment();
					}
					} 
				}
				setState(3048);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,458,_ctx);
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
		enterRule(_localctx, 412, RULE_typePathSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3049);
			pathIdentSegment();
			setState(3051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,459,_ctx) ) {
			case 1:
				{
				setState(3050);
				match(PATHSEP);
				}
				break;
			}
			setState(3055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,460,_ctx) ) {
			case 1:
				{
				setState(3053);
				genericArgs();
				}
				break;
			case 2:
				{
				setState(3054);
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
		enterRule(_localctx, 414, RULE_typePathFn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3057);
			match(LPAREN);
			setState(3060);
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
			case KW_SAFE:
			case KW_USE:
			case KW_REUSE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_AUTO:
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
				{
				setState(3058);
				typePathInputs();
				}
				break;
			case DOTDOT:
				{
				setState(3059);
				match(DOTDOT);
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(3062);
			match(RPAREN);
			setState(3065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,462,_ctx) ) {
			case 1:
				{
				setState(3063);
				match(RARROW);
				setState(3064);
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
		enterRule(_localctx, 416, RULE_typePathInputs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3067);
			type_();
			setState(3072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,463,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3068);
					match(COMMA);
					setState(3069);
					type_();
					}
					} 
				}
				setState(3074);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,463,_ctx);
			}
			setState(3076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(3075);
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
		enterRule(_localctx, 418, RULE_visibility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3078);
			match(KW_PUB);
			setState(3088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,466,_ctx) ) {
			case 1:
				{
				setState(3079);
				match(LPAREN);
				setState(3085);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_CRATE:
					{
					setState(3080);
					match(KW_CRATE);
					}
					break;
				case KW_SELFVALUE:
					{
					setState(3081);
					match(KW_SELFVALUE);
					}
					break;
				case KW_SUPER:
					{
					setState(3082);
					match(KW_SUPER);
					}
					break;
				case KW_IN:
					{
					setState(3083);
					match(KW_IN);
					setState(3084);
					simplePath();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3087);
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
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_REUSE() { return getToken(RustParser.KW_REUSE, 0); }
		public TerminalNode KW_AWAIT() { return getToken(RustParser.KW_AWAIT, 0); }
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TerminalNode KW_SAFE() { return getToken(RustParser.KW_SAFE, 0); }
		public TerminalNode KW_AUTO() { return getToken(RustParser.KW_AUTO, 0); }
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
		enterRule(_localctx, 420, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3090);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 17441866631681L) != 0)) ) {
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
		public TerminalNode KW_REUSE() { return getToken(RustParser.KW_REUSE, 0); }
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
		enterRule(_localctx, 422, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3092);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014781513726L) != 0)) ) {
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
		public TerminalNode KW_REUSE() { return getToken(RustParser.KW_REUSE, 0); }
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
		enterRule(_localctx, 424, RULE_non_crate_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3094);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815068126L) != 0)) ) {
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
		enterRule(_localctx, 426, RULE_macroIdentifierLikeToken);
		try {
			setState(3101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,467,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3096);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3097);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3098);
				match(KW_MACRORULES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3099);
				match(KW_DOLLARCRATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3100);
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
		enterRule(_localctx, 428, RULE_macroLiteralToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3103);
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
		public List<TerminalNode> GT() { return getTokens(RustParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(RustParser.GT, i);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public TerminalNode EQEQ() { return getToken(RustParser.EQEQ, 0); }
		public TerminalNode NE() { return getToken(RustParser.NE, 0); }
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
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
		enterRule(_localctx, 430, RULE_macroPunctuationToken);
		try {
			setState(3148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,468,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3105);
				match(MINUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3106);
				match(SLASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3107);
				match(PERCENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3108);
				match(CARET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3109);
				match(NOT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3110);
				match(AND);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3111);
				match(OR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3112);
				match(ANDAND);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3113);
				match(OROR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3114);
				match(PLUSEQ);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3115);
				match(MINUSEQ);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3116);
				match(STAREQ);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3117);
				match(SLASHEQ);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3118);
				match(PERCENTEQ);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3119);
				match(CARETEQ);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3120);
				match(ANDEQ);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3121);
				match(OREQ);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3122);
				match(SHLEQ);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3123);
				match(GT);
				setState(3124);
				match(GT);
				setState(3125);
				match(EQ);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3126);
				match(EQ);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(3127);
				match(EQEQ);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(3128);
				match(NE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(3129);
				match(GT);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(3130);
				match(LT);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(3131);
				match(GT);
				setState(3132);
				match(EQ);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(3133);
				match(LE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(3134);
				match(AT);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(3135);
				match(UNDERSCORE);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(3136);
				match(DOT);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(3137);
				match(DOTDOT);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(3138);
				match(DOTDOTDOT);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(3139);
				match(DOTDOTEQ);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(3140);
				match(COMMA);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(3141);
				match(SEMI);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(3142);
				match(COLON);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(3143);
				match(PATHSEP);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(3144);
				match(RARROW);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(3145);
				match(FATARROW);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(3146);
				match(POUND);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(3147);
				match(TILDE);
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
		enterRule(_localctx, 432, RULE_shl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3150);
			match(LT);
			setState(3151);
			if (!(this.next('<'))) throw new FailedPredicateException(this, "this.next('<')");
			setState(3152);
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
		enterRule(_localctx, 434, RULE_shr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3154);
			match(GT);
			setState(3155);
			if (!(this.next('>'))) throw new FailedPredicateException(this, "this.next('>')");
			setState(3156);
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
		case 55:
			return union__sempred((Union_Context)_localctx, predIndex);
		case 85:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 174:
			return traitObjectType_sempred((TraitObjectTypeContext)_localctx, predIndex);
		case 216:
			return shl_sempred((ShlContext)_localctx, predIndex);
		case 217:
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
		"\u0004\u0001\u0089\u0c57\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u00d4\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007"+
		"\u00d7\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0001\u0000\u0005"+
		"\u0000\u01b6\b\u0000\n\u0000\f\u0000\u01b9\t\u0000\u0001\u0000\u0005\u0000"+
		"\u01bc\b\u0000\n\u0000\f\u0000\u01bf\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u01c6\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u01cc\b\u0002\n\u0002\f\u0002"+
		"\u01cf\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u01d4\b"+
		"\u0002\n\u0002\f\u0002\u01d7\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u01dc\b\u0002\n\u0002\f\u0002\u01df\t\u0002\u0001\u0002\u0003"+
		"\u0002\u01e2\b\u0002\u0001\u0003\u0004\u0003\u01e5\b\u0003\u000b\u0003"+
		"\f\u0003\u01e6\u0001\u0003\u0003\u0003\u01ea\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u01f1\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01f6\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u01fa\b\u0005\n\u0005\f\u0005\u01fd\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0205\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0209\b\u0005\n\u0005"+
		"\f\u0005\u020c\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0214\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0218\b\u0005\n\u0005\f\u0005\u021b\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u021f\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u0227\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u022d\b\u0007\n\u0007\f\u0007"+
		"\u0230\t\u0007\u0001\u0007\u0003\u0007\u0233\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0237\b\u0007\n\u0007\f\u0007\u023a\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u024a\b\b\u0001\b\u0003\b\u024d"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u0252\b\t\n\t\f\t\u0255\t\t\u0001"+
		"\t\u0003\t\u0258\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0260\b\u000b\n\u000b\f\u000b\u0263\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0268\b\u000b\n\u000b\f\u000b\u026b"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0270\b\u000b"+
		"\n\u000b\f\u000b\u0273\t\u000b\u0001\u000b\u0003\u000b\u0276\b\u000b\u0001"+
		"\f\u0004\f\u0279\b\f\u000b\f\f\f\u027a\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u0282\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004"+
		"\f\u0289\b\f\u000b\f\f\f\u028a\u0001\f\u0001\f\u0003\f\u028f\b\f\u0001"+
		"\f\u0001\f\u0003\f\u0293\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0299"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u02a1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0005\u0012\u02a8\b\u0012\n\u0012\f\u0012\u02ab\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u02af\b\u0012\u0001\u0013\u0003\u0013"+
		"\u02b2\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u02c2\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u02c7\b\u0014\u0001\u0015\u0003\u0015"+
		"\u02ca\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u02d1\b\u0015\n\u0015\f\u0015\u02d4\t\u0015\u0001\u0015\u0005"+
		"\u0015\u02d7\b\u0015\n\u0015\f\u0015\u02da\t\u0015\u0001\u0015\u0003\u0015"+
		"\u02dd\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u02e3\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u02e9\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02ee\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u02f7\b\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u02fb\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0301\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0309\b\u001b\u0003\u001b\u030b\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0312\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0317\b"+
		"\u001d\u0005\u001d\u0319\b\u001d\n\u001d\f\u001d\u031c\t\u001d\u0001\u001d"+
		"\u0003\u001d\u031f\b\u001d\u0001\u001e\u0003\u001e\u0322\b\u001e\u0001"+
		"\u001e\u0003\u001e\u0325\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u032c\b\u001e\n\u001e\f\u001e\u032f\t\u001e"+
		"\u0001\u001e\u0003\u001e\u0332\b\u001e\u0003\u001e\u0334\b\u001e\u0001"+
		"\u001e\u0003\u001e\u0337\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u033d\b\u001e\u0003\u001e\u033f\b\u001e\u0003\u001e"+
		"\u0341\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0347\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u034b\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u034f\b\u001f\u0001\u001f\u0003\u001f\u0352"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0356\b\u001f\u0001 \u0003"+
		" \u0359\b \u0001 \u0003 \u035c\b \u0001 \u0003 \u035f\b \u0001 \u0003"+
		" \u0362\b \u0001 \u0003 \u0365\b \u0001 \u0001 \u0003 \u0369\b \u0003"+
		" \u036b\b \u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0371\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0376\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u037b\b\""+
		"\n\"\f\"\u037e\t\"\u0001\"\u0003\"\u0381\b\"\u0003\"\u0383\b\"\u0001#"+
		"\u0005#\u0386\b#\n#\f#\u0389\t#\u0001#\u0001#\u0003#\u038d\b#\u0001$\u0001"+
		"$\u0003$\u0391\b$\u0003$\u0393\b$\u0001$\u0003$\u0396\b$\u0001$\u0001"+
		"$\u0001%\u0003%\u039b\b%\u0001%\u0001%\u0001%\u0001%\u0001&\u0005&\u03a2"+
		"\b&\n&\f&\u03a5\t&\u0001&\u0001&\u0001&\u0003&\u03aa\b&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u03b0\b\'\u0001(\u0001(\u0001(\u0001)\u0003"+
		")\u03b6\b)\u0001)\u0001)\u0001)\u0003)\u03bb\b)\u0001)\u0001)\u0003)\u03bf"+
		"\b)\u0003)\u03c1\b)\u0001)\u0003)\u03c4\b)\u0001)\u0001)\u0001)\u0003"+
		")\u03c9\b)\u0003)\u03cb\b)\u0001)\u0001)\u0001*\u0001*\u0003*\u03d1\b"+
		"*\u0001+\u0001+\u0001+\u0003+\u03d6\b+\u0001+\u0003+\u03d9\b+\u0001+\u0001"+
		"+\u0003+\u03dd\b+\u0001+\u0001+\u0003+\u03e1\b+\u0001,\u0001,\u0001,\u0003"+
		",\u03e6\b,\u0001,\u0001,\u0003,\u03ea\b,\u0001,\u0001,\u0003,\u03ee\b"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0005-\u03f5\b-\n-\f-\u03f8\t-\u0001"+
		"-\u0003-\u03fb\b-\u0001.\u0005.\u03fe\b.\n.\f.\u0401\t.\u0001.\u0003."+
		"\u0404\b.\u0001.\u0003.\u0407\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u040e\b.\u0001/\u0001/\u0001/\u0005/\u0413\b/\n/\f/\u0416\t/\u0001/"+
		"\u0003/\u0419\b/\u00010\u00050\u041c\b0\n0\f0\u041f\t0\u00010\u00030\u0422"+
		"\b0\u00010\u00010\u00011\u00011\u00011\u00031\u0429\b1\u00011\u00031\u042c"+
		"\b1\u00011\u00011\u00031\u0430\b1\u00011\u00011\u00012\u00012\u00012\u0005"+
		"2\u0437\b2\n2\f2\u043a\t2\u00012\u00032\u043d\b2\u00013\u00053\u0440\b"+
		"3\n3\f3\u0443\t3\u00013\u00033\u0446\b3\u00013\u00013\u00013\u00033\u044b"+
		"\b3\u00013\u00033\u044e\b3\u00014\u00014\u00034\u0452\b4\u00014\u0001"+
		"4\u00015\u00015\u00035\u0458\b5\u00015\u00015\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00037\u0463\b7\u00017\u00037\u0466\b7\u00017\u0001"+
		"7\u00037\u046a\b7\u00017\u00017\u00018\u00038\u046f\b8\u00018\u00018\u0001"+
		"8\u00038\u0474\b8\u00018\u00038\u0477\b8\u00018\u00018\u00018\u00018\u0003"+
		"8\u047d\b8\u00018\u00038\u0480\b8\u00018\u00018\u00019\u00039\u0485\b"+
		"9\u00019\u00019\u00039\u0489\b9\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u0490\b9\u00019\u00019\u0001:\u0003:\u0495\b:\u0001:\u0003:\u0498\b"+
		":\u0001:\u0001:\u0001:\u0003:\u049d\b:\u0001:\u0001:\u0003:\u04a1\b:\u0003"+
		":\u04a3\b:\u0001:\u0003:\u04a6\b:\u0001:\u0001:\u0005:\u04aa\b:\n:\f:"+
		"\u04ad\t:\u0001:\u0005:\u04b0\b:\n:\f:\u04b3\t:\u0001:\u0001:\u0001:\u0003"+
		":\u04b8\b:\u0001:\u0003:\u04bb\b:\u0001:\u0001:\u0001:\u0003:\u04c0\b"+
		":\u0001:\u0001:\u0003:\u04c4\b:\u0003:\u04c6\b:\u0001:\u0001:\u0003:\u04ca"+
		"\b:\u0001:\u0003:\u04cd\b:\u0001:\u0001:\u0003:\u04d1\b:\u0001;\u0001"+
		";\u0003;\u04d5\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u04dd"+
		"\b<\u0001<\u0001<\u0003<\u04e1\b<\u0001<\u0003<\u04e4\b<\u0001<\u0001"+
		"<\u0003<\u04e8\b<\u0001<\u0001<\u0005<\u04ec\b<\n<\f<\u04ef\t<\u0001<"+
		"\u0005<\u04f2\b<\n<\f<\u04f5\t<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0003=\u04ff\b=\u0001=\u0001=\u0003=\u0503\b=\u0001=\u0003"+
		"=\u0506\b=\u0001=\u0003=\u0509\b=\u0001=\u0001=\u0001=\u0001=\u0003=\u050f"+
		"\b=\u0001=\u0001=\u0005=\u0513\b=\n=\f=\u0516\t=\u0001=\u0005=\u0519\b"+
		"=\n=\f=\u051c\t=\u0001=\u0001=\u0001>\u0003>\u0521\b>\u0001>\u0001>\u0003"+
		">\u0525\b>\u0001>\u0001>\u0005>\u0529\b>\n>\f>\u052c\t>\u0001>\u0005>"+
		"\u052f\b>\n>\f>\u0532\t>\u0001>\u0001>\u0001?\u0005?\u0537\b?\n?\f?\u053a"+
		"\t?\u0001?\u0001?\u0003?\u053e\b?\u0001?\u0001?\u0001?\u0003?\u0543\b"+
		"?\u0003?\u0545\b?\u0001@\u0001@\u0001@\u0003@\u054a\b@\u0001@\u0001@\u0003"+
		"@\u054e\b@\u0001@\u0003@\u0551\b@\u0001@\u0003@\u0554\b@\u0001@\u0001"+
		"@\u0003@\u0558\b@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0005A\u0560"+
		"\bA\nA\fA\u0563\tA\u0001A\u0001A\u0003A\u0567\bA\u0003A\u0569\bA\u0001"+
		"A\u0001A\u0001B\u0005B\u056e\bB\nB\fB\u0571\tB\u0001B\u0001B\u0001B\u0003"+
		"B\u0576\bB\u0001C\u0003C\u0579\bC\u0001C\u0001C\u0001C\u0003C\u057e\b"+
		"C\u0001D\u0003D\u0581\bD\u0001D\u0001D\u0001D\u0003D\u0586\bD\u0003D\u0588"+
		"\bD\u0001D\u0001D\u0003D\u058c\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0003E\u0594\bE\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u059c"+
		"\bE\u0003E\u059e\bE\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0005G\u05a6"+
		"\bG\nG\fG\u05a9\tG\u0003G\u05ab\bG\u0001G\u0003G\u05ae\bG\u0001H\u0001"+
		"H\u0001H\u0003H\u05b3\bH\u0001I\u0001I\u0001I\u0001I\u0001J\u0003J\u05ba"+
		"\bJ\u0001J\u0001J\u0001J\u0003J\u05bf\bJ\u0001J\u0003J\u05c2\bJ\u0001"+
		"K\u0003K\u05c5\bK\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001"+
		"M\u0005M\u05cf\bM\nM\fM\u05d2\tM\u0001M\u0001M\u0001M\u0003M\u05d7\bM"+
		"\u0001M\u0001M\u0001M\u0003M\u05dc\bM\u0003M\u05de\bM\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0001P\u0001"+
		"P\u0003P\u05ed\bP\u0001P\u0001P\u0001P\u0001P\u0003P\u05f3\bP\u0001P\u0001"+
		"P\u0003P\u05f7\bP\u0001Q\u0001Q\u0001Q\u0003Q\u05fc\bQ\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0003R\u0603\bR\u0001S\u0005S\u0606\bS\nS\fS\u0609\tS"+
		"\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0612\bS\u0001"+
		"S\u0001S\u0001S\u0001S\u0003S\u0618\bS\u0003S\u061a\bS\u0001S\u0001S\u0001"+
		"T\u0001T\u0001T\u0001T\u0001T\u0003T\u0623\bT\u0003T\u0625\bT\u0001U\u0001"+
		"U\u0004U\u0629\bU\u000bU\fU\u062a\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0003U\u0633\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0003U\u0640\bU\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u064d\bU\u0001U\u0003"+
		"U\u0650\bU\u0001U\u0001U\u0003U\u0654\bU\u0001U\u0003U\u0657\bU\u0001"+
		"U\u0001U\u0003U\u065b\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u0662"+
		"\bU\u0001U\u0001U\u0003U\u0666\bU\u0001U\u0001U\u0005U\u066a\bU\nU\fU"+
		"\u066d\tU\u0001U\u0001U\u0001U\u0001U\u0001U\u0005U\u0674\bU\nU\fU\u0677"+
		"\tU\u0001U\u0003U\u067a\bU\u0001U\u0001U\u0001U\u0005U\u067f\bU\nU\fU"+
		"\u0682\tU\u0001U\u0003U\u0685\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0003U\u068e\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0003U\u0699\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0005U\u06c2\bU\nU\fU\u06c5\tU\u0001U\u0003U\u06c8"+
		"\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u06d0\bU\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u06d9\bU\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u06e4\bU\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0003U\u06f4\bU\u0005U\u06f6\bU\nU\fU\u06f9\tU\u0001V"+
		"\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u0702\bV\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0003W\u0710\bW\u0001X\u0004X\u0713\bX\u000bX\fX\u0714\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0003X\u0724\bX\u0001Y\u0001Y\u0003Y\u0728\bY\u0001Y\u0001Y\u0001"+
		"Z\u0001Z\u0001Z\u0003Z\u072f\bZ\u0001Z\u0001Z\u0001[\u0001[\u0003[\u0735"+
		"\b[\u0001[\u0001[\u0003[\u0739\b[\u0001[\u0001[\u0003[\u073d\b[\u0001"+
		"[\u0001[\u0003[\u0741\b[\u0001[\u0001[\u0003[\u0745\b[\u0001[\u0001[\u0003"+
		"[\u0749\b[\u0001[\u0001[\u0003[\u074d\b[\u0001[\u0001[\u0003[\u0751\b"+
		"[\u0001[\u0001[\u0003[\u0755\b[\u0001[\u0001[\u0001[\u0003[\u075a\b[\u0001"+
		"[\u0001[\u0003[\u075e\b[\u0001\\\u0001\\\u0003\\\u0762\b\\\u0001]\u0001"+
		"]\u0005]\u0766\b]\n]\f]\u0769\t]\u0001]\u0003]\u076c\b]\u0001]\u0001]"+
		"\u0001^\u0004^\u0771\b^\u000b^\f^\u0772\u0001^\u0003^\u0776\b^\u0001^"+
		"\u0003^\u0779\b^\u0001_\u0001_\u0003_\u077d\b_\u0001_\u0001_\u0001`\u0001"+
		"`\u0001`\u0001a\u0001a\u0001a\u0001b\u0001b\u0001b\u0001c\u0001c\u0001"+
		"c\u0005c\u078d\bc\nc\fc\u0790\tc\u0001c\u0003c\u0793\bc\u0001c\u0001c"+
		"\u0001c\u0001c\u0003c\u0799\bc\u0001d\u0001d\u0001d\u0004d\u079e\bd\u000b"+
		"d\fd\u079f\u0001d\u0003d\u07a3\bd\u0001e\u0001e\u0001f\u0001f\u0001f\u0003"+
		"f\u07aa\bf\u0001g\u0001g\u0003g\u07ae\bg\u0001g\u0001g\u0005g\u07b2\b"+
		"g\ng\fg\u07b5\tg\u0001g\u0001g\u0003g\u07b9\bg\u0001g\u0001g\u0001h\u0001"+
		"h\u0001h\u0005h\u07c0\bh\nh\fh\u07c3\th\u0001h\u0001h\u0001h\u0003h\u07c8"+
		"\bh\u0003h\u07ca\bh\u0001i\u0005i\u07cd\bi\ni\fi\u07d0\ti\u0001i\u0001"+
		"i\u0001i\u0003i\u07d5\bi\u0001i\u0001i\u0001i\u0003i\u07da\bi\u0001j\u0001"+
		"j\u0003j\u07de\bj\u0001k\u0001k\u0001k\u0005k\u07e3\bk\nk\fk\u07e6\tk"+
		"\u0001k\u0001k\u0001k\u0005k\u07eb\bk\nk\fk\u07ee\tk\u0001k\u0003k\u07f1"+
		"\bk\u0003k\u07f3\bk\u0001k\u0001k\u0001l\u0001l\u0001m\u0001m\u0001m\u0003"+
		"m\u07fc\bm\u0001n\u0001n\u0001n\u0003n\u0801\bn\u0001n\u0001n\u0001o\u0001"+
		"o\u0001o\u0005o\u0808\bo\no\fo\u080b\to\u0001o\u0003o\u080e\bo\u0001p"+
		"\u0001p\u0001p\u0003p\u0813\bp\u0001p\u0001p\u0001p\u0003p\u0818\bp\u0001"+
		"q\u0001q\u0001q\u0001q\u0001q\u0005q\u081f\bq\nq\fq\u0822\tq\u0001q\u0003"+
		"q\u0825\bq\u0003q\u0827\bq\u0001q\u0001q\u0001r\u0001r\u0001s\u0001s\u0001"+
		"s\u0005s\u0830\bs\ns\fs\u0833\ts\u0001s\u0003s\u0836\bs\u0001t\u0003t"+
		"\u0839\bt\u0001t\u0003t\u083c\bt\u0001t\u0003t\u083f\bt\u0001t\u0003t"+
		"\u0842\bt\u0001t\u0003t\u0845\bt\u0001t\u0001t\u0001t\u0003t\u084a\bt"+
		"\u0001t\u0003t\u084d\bt\u0001t\u0001t\u0001t\u0001t\u0001t\u0003t\u0854"+
		"\bt\u0001u\u0001u\u0001u\u0005u\u0859\bu\nu\fu\u085c\tu\u0001u\u0003u"+
		"\u085f\bu\u0001v\u0005v\u0862\bv\nv\fv\u0865\tv\u0001v\u0001v\u0001v\u0003"+
		"v\u086a\bv\u0001w\u0003w\u086d\bw\u0001w\u0001w\u0001w\u0001w\u0003w\u0873"+
		"\bw\u0001w\u0001w\u0001w\u0003w\u0878\bw\u0001x\u0001x\u0001x\u0001y\u0001"+
		"y\u0001y\u0001y\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001|\u0001|\u0001}\u0001}\u0001"+
		"}\u0001~\u0001~\u0001~\u0001~\u0001~\u0001~\u0001~\u0003~\u089a\b~\u0003"+
		"~\u089c\b~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f"+
		"\u08a8\b\u007f\u0003\u007f\u08aa\b\u007f\u0001\u0080\u0001\u0080\u0001"+
		"\u0080\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001"+
		"\u0081\u0005\u0081\u08b5\b\u0081\n\u0081\f\u0081\u08b8\t\u0081\u0001\u0081"+
		"\u0003\u0081\u08bb\b\u0081\u0001\u0081\u0001\u0081\u0001\u0082\u0001\u0082"+
		"\u0001\u0082\u0001\u0082\u0005\u0082\u08c3\b\u0082\n\u0082\f\u0082\u08c6"+
		"\t\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u08cc"+
		"\b\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u08d0\b\u0082\u0003\u0082"+
		"\u08d2\b\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083"+
		"\u0003\u0083\u08d9\b\u0083\u0003\u0083\u08db\b\u0083\u0001\u0084\u0005"+
		"\u0084\u08de\b\u0084\n\u0084\f\u0084\u08e1\t\u0084\u0001\u0084\u0001\u0084"+
		"\u0003\u0084\u08e5\b\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0086"+
		"\u0003\u0086\u08eb\b\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0005\u0086"+
		"\u08f0\b\u0086\n\u0086\f\u0086\u08f3\t\u0086\u0001\u0087\u0001\u0087\u0003"+
		"\u0087\u08f7\b\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0003\u0087\u08fe\b\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0003"+
		"\u0088\u090f\b\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u008a\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u091e\b\u008a\u0001\u008a\u0001"+
		"\u008a\u0003\u008a\u0922\b\u008a\u0001\u008a\u0003\u008a\u0925\b\u008a"+
		"\u0001\u008b\u0005\u008b\u0928\b\u008b\n\u008b\f\u008b\u092b\t\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u0930\b\u008b\u0001\u008c\u0001"+
		"\u008c\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0003\u008e\u0949\b\u008e\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u094e\b\u008f\u0001\u008f\u0001"+
		"\u008f\u0003\u008f\u0952\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003"+
		"\u008f\u0957\b\u008f\u0001\u0090\u0001\u0090\u0003\u0090\u095b\b\u0090"+
		"\u0001\u0090\u0001\u0090\u0001\u0091\u0001\u0091\u0003\u0091\u0961\b\u0091"+
		"\u0001\u0091\u0001\u0091\u0003\u0091\u0965\b\u0091\u0001\u0091\u0001\u0091"+
		"\u0001\u0092\u0001\u0092\u0001\u0092\u0003\u0092\u096c\b\u0092\u0003\u0092"+
		"\u096e\b\u0092\u0001\u0092\u0003\u0092\u0971\b\u0092\u0001\u0093\u0001"+
		"\u0093\u0001\u0093\u0005\u0093\u0976\b\u0093\n\u0093\f\u0093\u0979\t\u0093"+
		"\u0001\u0094\u0005\u0094\u097c\b\u0094\n\u0094\f\u0094\u097f\t\u0094\u0001"+
		"\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001"+
		"\u0094\u0001\u0094\u0001\u0094\u0003\u0094\u098a\b\u0094\u0001\u0094\u0003"+
		"\u0094\u098d\b\u0094\u0001\u0094\u0001\u0094\u0003\u0094\u0991\b\u0094"+
		"\u0001\u0095\u0005\u0095\u0994\b\u0095\n\u0095\f\u0095\u0997\t\u0095\u0001"+
		"\u0095\u0001\u0095\u0001\u0096\u0001\u0096\u0003\u0096\u099d\b\u0096\u0001"+
		"\u0096\u0001\u0096\u0003\u0096\u09a1\b\u0096\u0001\u0096\u0001\u0096\u0001"+
		"\u0097\u0001\u0097\u0001\u0097\u0005\u0097\u09a8\b\u0097\n\u0097\f\u0097"+
		"\u09ab\t\u0097\u0001\u0097\u0003\u0097\u09ae\b\u0097\u0001\u0098\u0001"+
		"\u0098\u0003\u0098\u09b2\b\u0098\u0001\u0098\u0001\u0098\u0001\u0099\u0001"+
		"\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0004"+
		"\u0099\u09bd\b\u0099\u000b\u0099\f\u0099\u09be\u0001\u0099\u0003\u0099"+
		"\u09c2\b\u0099\u0003\u0099\u09c4\b\u0099\u0001\u009a\u0001\u009a\u0001"+
		"\u009a\u0001\u009a\u0001\u009b\u0001\u009b\u0003\u009b\u09cc\b\u009b\u0001"+
		"\u009b\u0001\u009b\u0001\u009c\u0001\u009c\u0001\u009c\u0005\u009c\u09d3"+
		"\b\u009c\n\u009c\f\u009c\u09d6\t\u009c\u0001\u009c\u0003\u009c\u09d9\b"+
		"\u009c\u0001\u009d\u0001\u009d\u0003\u009d\u09dd\b\u009d\u0001\u009e\u0001"+
		"\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001"+
		"\u009e\u0005\u009e\u09e7\b\u009e\n\u009e\f\u009e\u09ea\t\u009e\u0001\u009e"+
		"\u0001\u009e\u0001\u009e\u0003\u009e\u09ef\b\u009e\u0001\u009f\u0001\u009f"+
		"\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f"+
		"\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f"+
		"\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f\u0003\u009f\u0a03\b\u009f"+
		"\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001\u00a1"+
		"\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0004\u00a2\u0a0f\b\u00a2"+
		"\u000b\u00a2\f\u00a2\u0a10\u0001\u00a2\u0003\u00a2\u0a14\b\u00a2\u0003"+
		"\u00a2\u0a16\b\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a3\u0001\u00a3\u0001"+
		"\u00a3\u0001\u00a3\u0001\u00a3\u0003\u00a3\u0a1f\b\u00a3\u0001\u00a3\u0001"+
		"\u00a3\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a5\u0001"+
		"\u00a5\u0003\u00a5\u0a29\b\u00a5\u0001\u00a5\u0003\u00a5\u0a2c\b\u00a5"+
		"\u0001\u00a5\u0003\u00a5\u0a2f\b\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a6"+
		"\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a7\u0003\u00a7\u0a38\b\u00a7"+
		"\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0003\u00a7\u0a3e\b\u00a7"+
		"\u0001\u00a7\u0001\u00a7\u0003\u00a7\u0a42\b\u00a7\u0001\u00a8\u0003\u00a8"+
		"\u0a45\b\u00a8\u0001\u00a8\u0001\u00a8\u0003\u00a8\u0a49\b\u00a8\u0003"+
		"\u00a8\u0a4b\b\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00aa\u0001"+
		"\u00aa\u0003\u00aa\u0a52\b\u00aa\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0005"+
		"\u00ab\u0a57\b\u00ab\n\u00ab\f\u00ab\u0a5a\t\u00ab\u0001\u00ab\u0003\u00ab"+
		"\u0a5d\b\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0005\u00ab\u0a62\b"+
		"\u00ab\n\u00ab\f\u00ab\u0a65\t\u00ab\u0001\u00ab\u0003\u00ab\u0a68\b\u00ab"+
		"\u0003\u00ab\u0a6a\b\u00ab\u0001\u00ac\u0005\u00ac\u0a6d\b\u00ac\n\u00ac"+
		"\f\u00ac\u0a70\t\u00ac\u0001\u00ac\u0001\u00ac\u0003\u00ac\u0a74\b\u00ac"+
		"\u0001\u00ac\u0003\u00ac\u0a77\b\u00ac\u0001\u00ac\u0001\u00ac\u0003\u00ac"+
		"\u0a7b\b\u00ac\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0005\u00ad\u0a80\b"+
		"\u00ad\n\u00ad\f\u00ad\u0a83\t\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad"+
		"\u0005\u00ad\u0a88\b\u00ad\n\u00ad\f\u00ad\u0a8b\t\u00ad\u0001\u00ad\u0001"+
		"\u00ad\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0003\u00ae\u0a92\b\u00ae\u0001"+
		"\u00ae\u0001\u00ae\u0003\u00ae\u0a96\b\u00ae\u0001\u00ae\u0003\u00ae\u0a99"+
		"\b\u00ae\u0001\u00af\u0003\u00af\u0a9c\b\u00af\u0001\u00af\u0003\u00af"+
		"\u0a9f\b\u00af\u0001\u00af\u0001\u00af\u0001\u00b0\u0001\u00b0\u0003\u00b0"+
		"\u0aa5\b\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b1\u0001\u00b1\u0003\u00b1"+
		"\u0aab\b\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0003\u00b1\u0ab0\b"+
		"\u00b1\u0001\u00b1\u0003\u00b1\u0ab3\b\u00b1\u0001\u00b2\u0003\u00b2\u0ab6"+
		"\b\u00b2\u0001\u00b2\u0003\u00b2\u0ab9\b\u00b2\u0001\u00b2\u0001\u00b2"+
		"\u0001\u00b2\u0003\u00b2\u0abe\b\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2"+
		"\u0003\u00b2\u0ac3\b\u00b2\u0001\u00b3\u0001\u00b3\u0001\u00b4\u0001\u00b4"+
		"\u0001\u00b4\u0005\u00b4\u0aca\b\u00b4\n\u00b4\f\u00b4\u0acd\t\u00b4\u0001"+
		"\u00b4\u0003\u00b4\u0ad0\b\u00b4\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001"+
		"\u00b5\u0001\u00b5\u0003\u00b5\u0ad7\b\u00b5\u0001\u00b6\u0001\u00b6\u0001"+
		"\u00b6\u0001\u00b6\u0003\u00b6\u0add\b\u00b6\u0001\u00b7\u0003\u00b7\u0ae0"+
		"\b\u00b7\u0001\u00b7\u0003\u00b7\u0ae3\b\u00b7\u0001\u00b7\u0001\u00b7"+
		"\u0003\u00b7\u0ae7\b\u00b7\u0001\u00b7\u0003\u00b7\u0aea\b\u00b7\u0001"+
		"\u00b7\u0001\u00b7\u0003\u00b7\u0aee\b\u00b7\u0001\u00b7\u0001\u00b7\u0001"+
		"\u00b7\u0003\u00b7\u0af3\b\u00b7\u0001\u00b7\u0003\u00b7\u0af6\b\u00b7"+
		"\u0001\u00b7\u0001\u00b7\u0003\u00b7\u0afa\b\u00b7\u0001\u00b7\u0003\u00b7"+
		"\u0afd\b\u00b7\u0001\u00b7\u0001\u00b7\u0003\u00b7\u0b01\b\u00b7\u0001"+
		"\u00b7\u0001\u00b7\u0001\u00b7\u0003\u00b7\u0b06\b\u00b7\u0001\u00b8\u0001"+
		"\u00b8\u0001\u00b8\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001"+
		"\u00b9\u0001\u00b9\u0005\u00b9\u0b11\b\u00b9\n\u00b9\f\u00b9\u0b14\t\u00b9"+
		"\u0001\u00b9\u0001\u00b9\u0003\u00b9\u0b18\b\u00b9\u0001\u00b9\u0001\u00b9"+
		"\u0003\u00b9\u0b1c\b\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0003\u00ba"+
		"\u0b21\b\u00ba\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0005\u00bb\u0b26\b"+
		"\u00bb\n\u00bb\f\u00bb\u0b29\t\u00bb\u0001\u00bb\u0003\u00bb\u0b2c\b\u00bb"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bd\u0003\u00bd\u0b31\b\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0001\u00bd\u0005\u00bd\u0b36\b\u00bd\n\u00bd\f\u00bd\u0b39"+
		"\t\u00bd\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0001"+
		"\u00be\u0001\u00be\u0003\u00be\u0b42\b\u00be\u0001\u00bf\u0003\u00bf\u0b45"+
		"\b\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0005\u00bf\u0b4a\b\u00bf"+
		"\n\u00bf\f\u00bf\u0b4d\t\u00bf\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0003"+
		"\u00c0\u0b52\b\u00c0\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001"+
		"\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1\u0b5b\b\u00c1\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0003\u00c2\u0b63"+
		"\b\u00c2\u0001\u00c2\u0001\u00c2\u0003\u00c2\u0b67\b\u00c2\u0001\u00c2"+
		"\u0003\u00c2\u0b6a\b\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0003\u00c2\u0b72\b\u00c2\u0001\u00c2\u0003\u00c2"+
		"\u0b75\b\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0005\u00c2\u0b7d\b\u00c2\n\u00c2\f\u00c2\u0b80\t\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0003\u00c2\u0b84\b\u00c2\u0001\u00c2\u0001\u00c2\u0003"+
		"\u00c2\u0b88\b\u00c2\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001"+
		"\u00c3\u0003\u00c3\u0b8f\b\u00c3\u0001\u00c4\u0001\u00c4\u0003\u00c4\u0b93"+
		"\b\u00c4\u0001\u00c4\u0001\u00c4\u0003\u00c4\u0b97\b\u00c4\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0005\u00c5\u0b9c\b\u00c5\n\u00c5\f\u00c5\u0b9f"+
		"\t\u00c5\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0005\u00c6\u0ba4\b\u00c6"+
		"\n\u00c6\f\u00c6\u0ba7\t\u00c6\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0005"+
		"\u00c7\u0bac\b\u00c7\n\u00c7\f\u00c7\u0baf\t\u00c7\u0001\u00c8\u0001\u00c8"+
		"\u0003\u00c8\u0bb3\b\u00c8\u0001\u00c8\u0001\u00c8\u0003\u00c8\u0bb7\b"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0003\u00c8\u0bbc\b\u00c8\u0001"+
		"\u00c9\u0001\u00c9\u0003\u00c9\u0bc0\b\u00c9\u0001\u00c9\u0001\u00c9\u0003"+
		"\u00c9\u0bc4\b\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0004\u00ca\u0bcc\b\u00ca\u000b\u00ca\f\u00ca\u0bcd"+
		"\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u0bd4\b\u00cb"+
		"\u0001\u00cb\u0001\u00cb\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0004\u00cc"+
		"\u0bdb\b\u00cc\u000b\u00cc\f\u00cc\u0bdc\u0001\u00cd\u0003\u00cd\u0be0"+
		"\b\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0005\u00cd\u0be5\b\u00cd"+
		"\n\u00cd\f\u00cd\u0be8\t\u00cd\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0bec"+
		"\b\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0bf0\b\u00ce\u0001\u00cf"+
		"\u0001\u00cf\u0001\u00cf\u0003\u00cf\u0bf5\b\u00cf\u0001\u00cf\u0001\u00cf"+
		"\u0001\u00cf\u0003\u00cf\u0bfa\b\u00cf\u0001\u00d0\u0001\u00d0\u0001\u00d0"+
		"\u0005\u00d0\u0bff\b\u00d0\n\u00d0\f\u00d0\u0c02\t\u00d0\u0001\u00d0\u0003"+
		"\u00d0\u0c05\b\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0001"+
		"\u00d1\u0001\u00d1\u0001\u00d1\u0003\u00d1\u0c0e\b\u00d1\u0001\u00d1\u0003"+
		"\u00d1\u0c11\b\u00d1\u0001\u00d2\u0001\u00d2\u0001\u00d3\u0001\u00d3\u0001"+
		"\u00d4\u0001\u00d4\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0001"+
		"\u00d5\u0003\u00d5\u0c1e\b\u00d5\u0001\u00d6\u0001\u00d6\u0001\u00d7\u0001"+
		"\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001"+
		"\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001"+
		"\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001"+
		"\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001"+
		"\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001"+
		"\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001"+
		"\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0003"+
		"\u00d7\u0c4d\b\u00d7\u0001\u00d8\u0001\u00d8\u0001\u00d8\u0001\u00d8\u0001"+
		"\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0000\u0001\u00aa"+
		"\u00da\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0"+
		"\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u0000\u000f\u0002"+
		"\u0000``\u0081\u0081\u0003\u0000ZZ\\\\\u0083\u0083\u0001\u0000!\"\u0001"+
		"\u0000LM\u0002\u0000bbdd\u0002\u0000\u0003\u0003\u0014\u0014\u0002\u0000"+
		"[[``\u0001\u0000\\^\u0001\u0000Z[\u0002\u0000\u0014\u0014\u0016\u0016"+
		"\u0001\u0000@B\u0002\u0000::YY\b\u0000\u0019\u0019\"\"$$\'*//99;=?D\u0003"+
		"\u0000\u0001\u0018\u001a.0:\u0003\u0000\u0001\u0004\u0006.0:\u0e47\u0000"+
		"\u01b7\u0001\u0000\u0000\u0000\u0002\u01c2\u0001\u0000\u0000\u0000\u0004"+
		"\u01e1\u0001\u0000\u0000\u0000\u0006\u01e9\u0001\u0000\u0000\u0000\b\u01f0"+
		"\u0001\u0000\u0000\u0000\n\u021e\u0001\u0000\u0000\u0000\f\u0220\u0001"+
		"\u0000\u0000\u0000\u000e\u0226\u0001\u0000\u0000\u0000\u0010\u024c\u0001"+
		"\u0000\u0000\u0000\u0012\u024e\u0001\u0000\u0000\u0000\u0014\u0259\u0001"+
		"\u0000\u0000\u0000\u0016\u0275\u0001\u0000\u0000\u0000\u0018\u0292\u0001"+
		"\u0000\u0000\u0000\u001a\u0298\u0001\u0000\u0000\u0000\u001c\u029a\u0001"+
		"\u0000\u0000\u0000\u001e\u02a0\u0001\u0000\u0000\u0000 \u02a2\u0001\u0000"+
		"\u0000\u0000\"\u02a4\u0001\u0000\u0000\u0000$\u02a9\u0001\u0000\u0000"+
		"\u0000&\u02b1\u0001\u0000\u0000\u0000(\u02c6\u0001\u0000\u0000\u0000*"+
		"\u02c9\u0001\u0000\u0000\u0000,\u02de\u0001\u0000\u0000\u0000.\u02e8\u0001"+
		"\u0000\u0000\u00000\u02ea\u0001\u0000\u0000\u00002\u02ef\u0001\u0000\u0000"+
		"\u00004\u02f3\u0001\u0000\u0000\u00006\u0300\u0001\u0000\u0000\u00008"+
		"\u030c\u0001\u0000\u0000\u0000:\u030f\u0001\u0000\u0000\u0000<\u0340\u0001"+
		"\u0000\u0000\u0000>\u0342\u0001\u0000\u0000\u0000@\u0358\u0001\u0000\u0000"+
		"\u0000B\u036c\u0001\u0000\u0000\u0000D\u0382\u0001\u0000\u0000\u0000F"+
		"\u0387\u0001\u0000\u0000\u0000H\u0392\u0001\u0000\u0000\u0000J\u039a\u0001"+
		"\u0000\u0000\u0000L\u03a3\u0001\u0000\u0000\u0000N\u03ab\u0001\u0000\u0000"+
		"\u0000P\u03b1\u0001\u0000\u0000\u0000R\u03b5\u0001\u0000\u0000\u0000T"+
		"\u03d0\u0001\u0000\u0000\u0000V\u03d2\u0001\u0000\u0000\u0000X\u03e2\u0001"+
		"\u0000\u0000\u0000Z\u03f1\u0001\u0000\u0000\u0000\\\u03ff\u0001\u0000"+
		"\u0000\u0000^\u040f\u0001\u0000\u0000\u0000`\u041d\u0001\u0000\u0000\u0000"+
		"b\u0425\u0001\u0000\u0000\u0000d\u0433\u0001\u0000\u0000\u0000f\u0441"+
		"\u0001\u0000\u0000\u0000h\u044f\u0001\u0000\u0000\u0000j\u0455\u0001\u0000"+
		"\u0000\u0000l\u045b\u0001\u0000\u0000\u0000n\u045e\u0001\u0000\u0000\u0000"+
		"p\u046e\u0001\u0000\u0000\u0000r\u0484\u0001\u0000\u0000\u0000t\u04d0"+
		"\u0001\u0000\u0000\u0000v\u04d4\u0001\u0000\u0000\u0000x\u04dc\u0001\u0000"+
		"\u0000\u0000z\u04fe\u0001\u0000\u0000\u0000|\u0520\u0001\u0000\u0000\u0000"+
		"~\u0538\u0001\u0000\u0000\u0000\u0080\u0546\u0001\u0000\u0000\u0000\u0082"+
		"\u055b\u0001\u0000\u0000\u0000\u0084\u056f\u0001\u0000\u0000\u0000\u0086"+
		"\u0578\u0001\u0000\u0000\u0000\u0088\u0580\u0001\u0000\u0000\u0000\u008a"+
		"\u059d\u0001\u0000\u0000\u0000\u008c\u059f\u0001\u0000\u0000\u0000\u008e"+
		"\u05a1\u0001\u0000\u0000\u0000\u0090\u05b2\u0001\u0000\u0000\u0000\u0092"+
		"\u05b4\u0001\u0000\u0000\u0000\u0094\u05b9\u0001\u0000\u0000\u0000\u0096"+
		"\u05c4\u0001\u0000\u0000\u0000\u0098\u05ca\u0001\u0000\u0000\u0000\u009a"+
		"\u05d0\u0001\u0000\u0000\u0000\u009c\u05df\u0001\u0000\u0000\u0000\u009e"+
		"\u05e5\u0001\u0000\u0000\u0000\u00a0\u05f6\u0001\u0000\u0000\u0000\u00a2"+
		"\u05fb\u0001\u0000\u0000\u0000\u00a4\u0602\u0001\u0000\u0000\u0000\u00a6"+
		"\u0607\u0001\u0000\u0000\u0000\u00a8\u0624\u0001\u0000\u0000\u0000\u00aa"+
		"\u068d\u0001\u0000\u0000\u0000\u00ac\u0701\u0001\u0000\u0000\u0000\u00ae"+
		"\u070f\u0001\u0000\u0000\u0000\u00b0\u0723\u0001\u0000\u0000\u0000\u00b2"+
		"\u0725\u0001\u0000\u0000\u0000\u00b4\u072b\u0001\u0000\u0000\u0000\u00b6"+
		"\u075d\u0001\u0000\u0000\u0000\u00b8\u0761\u0001\u0000\u0000\u0000\u00ba"+
		"\u0763\u0001\u0000\u0000\u0000\u00bc\u0778\u0001\u0000\u0000\u0000\u00be"+
		"\u077a\u0001\u0000\u0000\u0000\u00c0\u0780\u0001\u0000\u0000\u0000\u00c2"+
		"\u0783\u0001\u0000\u0000\u0000\u00c4\u0786\u0001\u0000\u0000\u0000\u00c6"+
		"\u0798\u0001\u0000\u0000\u0000\u00c8\u079d\u0001\u0000\u0000\u0000\u00ca"+
		"\u07a4\u0001\u0000\u0000\u0000\u00cc\u07a9\u0001\u0000\u0000\u0000\u00ce"+
		"\u07ad\u0001\u0000\u0000\u0000\u00d0\u07bc\u0001\u0000\u0000\u0000\u00d2"+
		"\u07ce\u0001\u0000\u0000\u0000\u00d4\u07db\u0001\u0000\u0000\u0000\u00d6"+
		"\u07df\u0001\u0000\u0000\u0000\u00d8\u07f6\u0001\u0000\u0000\u0000\u00da"+
		"\u07fb\u0001\u0000\u0000\u0000\u00dc\u07fd\u0001\u0000\u0000\u0000\u00de"+
		"\u0804\u0001\u0000\u0000\u0000\u00e0\u0817\u0001\u0000\u0000\u0000\u00e2"+
		"\u0819\u0001\u0000\u0000\u0000\u00e4\u082a\u0001\u0000\u0000\u0000\u00e6"+
		"\u082c\u0001\u0000\u0000\u0000\u00e8\u0838\u0001\u0000\u0000\u0000\u00ea"+
		"\u0855\u0001\u0000\u0000\u0000\u00ec\u0863\u0001\u0000\u0000\u0000\u00ee"+
		"\u0877\u0001\u0000\u0000\u0000\u00f0\u0879\u0001\u0000\u0000\u0000\u00f2"+
		"\u087c\u0001\u0000\u0000\u0000\u00f4\u0880\u0001\u0000\u0000\u0000\u00f6"+
		"\u0887\u0001\u0000\u0000\u0000\u00f8\u088d\u0001\u0000\u0000\u0000\u00fa"+
		"\u088f\u0001\u0000\u0000\u0000\u00fc\u0892\u0001\u0000\u0000\u0000\u00fe"+
		"\u089d\u0001\u0000\u0000\u0000\u0100\u08ab\u0001\u0000\u0000\u0000\u0102"+
		"\u08b0\u0001\u0000\u0000\u0000\u0104\u08d1\u0001\u0000\u0000\u0000\u0106"+
		"\u08da\u0001\u0000\u0000\u0000\u0108\u08df\u0001\u0000\u0000\u0000\u010a"+
		"\u08e6\u0001\u0000\u0000\u0000\u010c\u08ea\u0001\u0000\u0000\u0000\u010e"+
		"\u08fd\u0001\u0000\u0000\u0000\u0110\u090e\u0001\u0000\u0000\u0000\u0112"+
		"\u0910\u0001\u0000\u0000\u0000\u0114\u0924\u0001\u0000\u0000\u0000\u0116"+
		"\u0929\u0001\u0000\u0000\u0000\u0118\u0931\u0001\u0000\u0000\u0000\u011a"+
		"\u0933\u0001\u0000\u0000\u0000\u011c\u0948\u0001\u0000\u0000\u0000\u011e"+
		"\u0956\u0001\u0000\u0000\u0000\u0120\u0958\u0001\u0000\u0000\u0000\u0122"+
		"\u0960\u0001\u0000\u0000\u0000\u0124\u0970\u0001\u0000\u0000\u0000\u0126"+
		"\u0972\u0001\u0000\u0000\u0000\u0128\u097d\u0001\u0000\u0000\u0000\u012a"+
		"\u0995\u0001\u0000\u0000\u0000\u012c\u099c\u0001\u0000\u0000\u0000\u012e"+
		"\u09a4\u0001\u0000\u0000\u0000\u0130\u09af\u0001\u0000\u0000\u0000\u0132"+
		"\u09c3\u0001\u0000\u0000\u0000\u0134\u09c5\u0001\u0000\u0000\u0000\u0136"+
		"\u09c9\u0001\u0000\u0000\u0000\u0138\u09cf\u0001\u0000\u0000\u0000\u013a"+
		"\u09dc\u0001\u0000\u0000\u0000\u013c\u09ee\u0001\u0000\u0000\u0000\u013e"+
		"\u0a02\u0001\u0000\u0000\u0000\u0140\u0a04\u0001\u0000\u0000\u0000\u0142"+
		"\u0a08\u0001\u0000\u0000\u0000\u0144\u0a0a\u0001\u0000\u0000\u0000\u0146"+
		"\u0a19\u0001\u0000\u0000\u0000\u0148\u0a22\u0001\u0000\u0000\u0000\u014a"+
		"\u0a26\u0001\u0000\u0000\u0000\u014c\u0a32\u0001\u0000\u0000\u0000\u014e"+
		"\u0a37\u0001\u0000\u0000\u0000\u0150\u0a44\u0001\u0000\u0000\u0000\u0152"+
		"\u0a4c\u0001\u0000\u0000\u0000\u0154\u0a51\u0001\u0000\u0000\u0000\u0156"+
		"\u0a69\u0001\u0000\u0000\u0000\u0158\u0a6e\u0001\u0000\u0000\u0000\u015a"+
		"\u0a81\u0001\u0000\u0000\u0000\u015c\u0a98\u0001\u0000\u0000\u0000\u015e"+
		"\u0a9b\u0001\u0000\u0000\u0000\u0160\u0aa2\u0001\u0000\u0000\u0000\u0162"+
		"\u0ab2\u0001\u0000\u0000\u0000\u0164\u0ab5\u0001\u0000\u0000\u0000\u0166"+
		"\u0ac4\u0001\u0000\u0000\u0000\u0168\u0ac6\u0001\u0000\u0000\u0000\u016a"+
		"\u0ad6\u0001\u0000\u0000\u0000\u016c\u0adc\u0001\u0000\u0000\u0000\u016e"+
		"\u0b05\u0001\u0000\u0000\u0000\u0170\u0b07\u0001\u0000\u0000\u0000\u0172"+
		"\u0b1b\u0001\u0000\u0000\u0000\u0174\u0b20\u0001\u0000\u0000\u0000\u0176"+
		"\u0b27\u0001\u0000\u0000\u0000\u0178\u0b2d\u0001\u0000\u0000\u0000\u017a"+
		"\u0b30\u0001\u0000\u0000\u0000\u017c\u0b41\u0001\u0000\u0000\u0000\u017e"+
		"\u0b44\u0001\u0000\u0000\u0000\u0180\u0b4e\u0001\u0000\u0000\u0000\u0182"+
		"\u0b5a\u0001\u0000\u0000\u0000\u0184\u0b87\u0001\u0000\u0000\u0000\u0186"+
		"\u0b8e\u0001\u0000\u0000\u0000\u0188\u0b96\u0001\u0000\u0000\u0000\u018a"+
		"\u0b98\u0001\u0000\u0000\u0000\u018c\u0ba0\u0001\u0000\u0000\u0000\u018e"+
		"\u0ba8\u0001\u0000\u0000\u0000\u0190\u0bb0\u0001\u0000\u0000\u0000\u0192"+
		"\u0bbd\u0001\u0000\u0000\u0000\u0194\u0bc8\u0001\u0000\u0000\u0000\u0196"+
		"\u0bcf\u0001\u0000\u0000\u0000\u0198\u0bd7\u0001\u0000\u0000\u0000\u019a"+
		"\u0bdf\u0001\u0000\u0000\u0000\u019c\u0be9\u0001\u0000\u0000\u0000\u019e"+
		"\u0bf1\u0001\u0000\u0000\u0000\u01a0\u0bfb\u0001\u0000\u0000\u0000\u01a2"+
		"\u0c06\u0001\u0000\u0000\u0000\u01a4\u0c12\u0001\u0000\u0000\u0000\u01a6"+
		"\u0c14\u0001\u0000\u0000\u0000\u01a8\u0c16\u0001\u0000\u0000\u0000\u01aa"+
		"\u0c1d\u0001\u0000\u0000\u0000\u01ac\u0c1f\u0001\u0000\u0000\u0000\u01ae"+
		"\u0c4c\u0001\u0000\u0000\u0000\u01b0\u0c4e\u0001\u0000\u0000\u0000\u01b2"+
		"\u0c52\u0001\u0000\u0000\u0000\u01b4\u01b6\u0003\u009cN\u0000\u01b5\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bd"+
		"\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bc"+
		"\u0003$\u0012\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0005\u0000\u0000\u0001\u01c1\u0001\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0003\u017a\u00bd\u0000\u01c3\u01c5\u0007"+
		"\u0000\u0000\u0000\u01c4\u01c6\u0003\u017a\u00bd\u0000\u01c5\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0003\u0004\u0002\u0000\u01c8\u0003\u0001"+
		"\u0000\u0000\u0000\u01c9\u01cd\u0005\u0088\u0000\u0000\u01ca\u01cc\u0003"+
		"\u0006\u0003\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001"+
		"\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001"+
		"\u0000\u0000\u0000\u01d0\u01e2\u0005\u0089\u0000\u0000\u01d1\u01d5\u0005"+
		"\u0086\u0000\u0000\u01d2\u01d4\u0003\u0006\u0003\u0000\u01d3\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01e2\u0005"+
		"\u0087\u0000\u0000\u01d9\u01dd\u0005\u0084\u0000\u0000\u01da\u01dc\u0003"+
		"\u0006\u0003\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dc\u01df\u0001"+
		"\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001"+
		"\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01dd\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e2\u0005\u0085\u0000\u0000\u01e1\u01c9\u0001"+
		"\u0000\u0000\u0000\u01e1\u01d1\u0001\u0000\u0000\u0000\u01e1\u01d9\u0001"+
		"\u0000\u0000\u0000\u01e2\u0005\u0001\u0000\u0000\u0000\u01e3\u01e5\u0003"+
		"\b\u0004\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01ea\u0003\u0004"+
		"\u0002\u0000\u01e9\u01e4\u0001\u0000\u0000\u0000\u01e9\u01e8\u0001\u0000"+
		"\u0000\u0000\u01ea\u0007\u0001\u0000\u0000\u0000\u01eb\u01f1\u0003\u01aa"+
		"\u00d5\u0000\u01ec\u01f1\u0003\u01ac\u00d6\u0000\u01ed\u01f1\u0003\u01ae"+
		"\u00d7\u0000\u01ee\u01f1\u0003 \u0010\u0000\u01ef\u01f1\u0005\u0082\u0000"+
		"\u0000\u01f0\u01eb\u0001\u0000\u0000\u0000\u01f0\u01ec\u0001\u0000\u0000"+
		"\u0000\u01f0\u01ed\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1\t\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0003\u017a\u00bd\u0000\u01f3\u01f5\u0007\u0000\u0000\u0000"+
		"\u01f4\u01f6\u0003\u017a\u00bd\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f7\u01fb\u0005\u0088\u0000\u0000\u01f8\u01fa\u0003\u0006\u0003\u0000"+
		"\u01f9\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u0005\u0089\u0000\u0000\u01ff\u0200\u0005|\u0000\u0000\u0200"+
		"\u021f\u0001\u0000\u0000\u0000\u0201\u0202\u0003\u017a\u00bd\u0000\u0202"+
		"\u0204\u0007\u0000\u0000\u0000\u0203\u0205\u0003\u017a\u00bd\u0000\u0204"+
		"\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0001\u0000\u0000\u0000\u0206\u020a\u0005\u0086\u0000\u0000\u0207"+
		"\u0209\u0003\u0006\u0003\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209"+
		"\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a"+
		"\u020b\u0001\u0000\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c"+
		"\u020a\u0001\u0000\u0000\u0000\u020d\u020e\u0005\u0087\u0000\u0000\u020e"+
		"\u020f\u0005|\u0000\u0000\u020f\u021f\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0003\u017a\u00bd\u0000\u0211\u0213\u0007\u0000\u0000\u0000\u0212\u0214"+
		"\u0003\u017a\u00bd\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0219"+
		"\u0005\u0084\u0000\u0000\u0216\u0218\u0003\u0006\u0003\u0000\u0217\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217"+
		"\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021c"+
		"\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0005\u0085\u0000\u0000\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u01f2"+
		"\u0001\u0000\u0000\u0000\u021e\u0201\u0001\u0000\u0000\u0000\u021e\u0210"+
		"\u0001\u0000\u0000\u0000\u021f\u000b\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0005=\u0000\u0000\u0221\u0222\u0005`\u0000\u0000\u0222\u0223\u0003\u01a4"+
		"\u00d2\u0000\u0223\u0224\u0003\u0010\b\u0000\u0224\r\u0001\u0000\u0000"+
		"\u0000\u0225\u0227\u0003\u01a2\u00d1\u0000\u0226\u0225\u0001\u0000\u0000"+
		"\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u00051\u0000\u0000\u0229\u0232\u0003\u01a4\u00d2\u0000"+
		"\u022a\u022e\u0005\u0088\u0000\u0000\u022b\u022d\u0003\u0006\u0003\u0000"+
		"\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000"+
		"\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000"+
		"\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000"+
		"\u0231\u0233\u0005\u0089\u0000\u0000\u0232\u022a\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000"+
		"\u0234\u0238\u0005\u0084\u0000\u0000\u0235\u0237\u0003\u0006\u0003\u0000"+
		"\u0236\u0235\u0001\u0000\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000"+
		"\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0005\u0085\u0000\u0000\u023c\u000f\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0005\u0088\u0000\u0000\u023e\u023f\u0003\u0012\t\u0000\u023f"+
		"\u0240\u0005\u0089\u0000\u0000\u0240\u0241\u0005|\u0000\u0000\u0241\u024d"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0005\u0086\u0000\u0000\u0243\u0244"+
		"\u0003\u0012\t\u0000\u0244\u0245\u0005\u0087\u0000\u0000\u0245\u0246\u0005"+
		"|\u0000\u0000\u0246\u024d\u0001\u0000\u0000\u0000\u0247\u0249\u0005\u0084"+
		"\u0000\u0000\u0248\u024a\u0003\u0012\t\u0000\u0249\u0248\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000"+
		"\u0000\u024b\u024d\u0005\u0085\u0000\u0000\u024c\u023d\u0001\u0000\u0000"+
		"\u0000\u024c\u0242\u0001\u0000\u0000\u0000\u024c\u0247\u0001\u0000\u0000"+
		"\u0000\u024d\u0011\u0001\u0000\u0000\u0000\u024e\u0253\u0003\u0014\n\u0000"+
		"\u024f\u0250\u0005|\u0000\u0000\u0250\u0252\u0003\u0014\n\u0000\u0251"+
		"\u024f\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000\u0000\u0000\u0253"+
		"\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254"+
		"\u0257\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0256"+
		"\u0258\u0005|\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0001\u0000\u0000\u0000\u0258\u0013\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0003\u0016\u000b\u0000\u025a\u025b\u0005\u0080\u0000\u0000\u025b\u025c"+
		"\u0003\"\u0011\u0000\u025c\u0015\u0001\u0000\u0000\u0000\u025d\u0261\u0005"+
		"\u0088\u0000\u0000\u025e\u0260\u0003\u0018\f\u0000\u025f\u025e\u0001\u0000"+
		"\u0000\u0000\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0264\u0001\u0000"+
		"\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0276\u0005\u0089"+
		"\u0000\u0000\u0265\u0269\u0005\u0086\u0000\u0000\u0266\u0268\u0003\u0018"+
		"\f\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000"+
		"\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000"+
		"\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000"+
		"\u0000\u026c\u0276\u0005\u0087\u0000\u0000\u026d\u0271\u0005\u0084\u0000"+
		"\u0000\u026e\u0270\u0003\u0018\f\u0000\u026f\u026e\u0001\u0000\u0000\u0000"+
		"\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0274\u0001\u0000\u0000\u0000"+
		"\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0276\u0005\u0085\u0000\u0000"+
		"\u0275\u025d\u0001\u0000\u0000\u0000\u0275\u0265\u0001\u0000\u0000\u0000"+
		"\u0275\u026d\u0001\u0000\u0000\u0000\u0276\u0017\u0001\u0000\u0000\u0000"+
		"\u0277\u0279\u0003\u001a\r\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0001\u0000\u0000\u0000\u027b\u0293\u0001\u0000\u0000\u0000\u027c"+
		"\u0293\u0003\u0016\u000b\u0000\u027d\u0281\u0005\u0082\u0000\u0000\u027e"+
		"\u0282\u0003\u01a4\u00d2\u0000\u027f\u0282\u0003\u01a8\u00d4\u0000\u0280"+
		"\u0282\u0005Y\u0000\u0000\u0281\u027e\u0001\u0000\u0000\u0000\u0281\u027f"+
		"\u0001\u0000\u0000\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0282\u0283"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0005}\u0000\u0000\u0284\u0293\u0003"+
		"\u001c\u000e\u0000\u0285\u0286\u0005\u0082\u0000\u0000\u0286\u0288\u0005"+
		"\u0088\u0000\u0000\u0287\u0289\u0003\u0018\f\u0000\u0288\u0287\u0001\u0000"+
		"\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000"+
		"\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000"+
		"\u0000\u0000\u028c\u028e\u0005\u0089\u0000\u0000\u028d\u028f\u0003\u001e"+
		"\u000f\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0291\u0003 \u0010"+
		"\u0000\u0291\u0293\u0001\u0000\u0000\u0000\u0292\u0278\u0001\u0000\u0000"+
		"\u0000\u0292\u027c\u0001\u0000\u0000\u0000\u0292\u027d\u0001\u0000\u0000"+
		"\u0000\u0292\u0285\u0001\u0000\u0000\u0000\u0293\u0019\u0001\u0000\u0000"+
		"\u0000\u0294\u0299\u0003\u01aa\u00d5\u0000\u0295\u0299\u0003\u01ac\u00d6"+
		"\u0000\u0296\u0299\u0003\u01ae\u00d7\u0000\u0297\u0299\u0003 \u0010\u0000"+
		"\u0298\u0294\u0001\u0000\u0000\u0000\u0298\u0295\u0001\u0000\u0000\u0000"+
		"\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0297\u0001\u0000\u0000\u0000"+
		"\u0299\u001b\u0001\u0000\u0000\u0000\u029a\u029b\u0003\u01a4\u00d2\u0000"+
		"\u029b\u001d\u0001\u0000\u0000\u0000\u029c\u02a1\u0003\u01aa\u00d5\u0000"+
		"\u029d\u02a1\u0003\u01ac\u00d6\u0000\u029e\u02a1\u0003\u01ae\u00d7\u0000"+
		"\u029f\u02a1\u0005\u0082\u0000\u0000\u02a0\u029c\u0001\u0000\u0000\u0000"+
		"\u02a0\u029d\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000"+
		"\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1\u001f\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a3\u0007\u0001\u0000\u0000\u02a3!\u0001\u0000\u0000\u0000\u02a4"+
		"\u02a5\u0003\u0004\u0002\u0000\u02a5#\u0001\u0000\u0000\u0000\u02a6\u02a8"+
		"\u0003\u009eO\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001"+
		"\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ae\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001"+
		"\u0000\u0000\u0000\u02ac\u02af\u0003&\u0013\u0000\u02ad\u02af\u0003(\u0014"+
		"\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000"+
		"\u0000\u02af%\u0001\u0000\u0000\u0000\u02b0\u02b2\u0003\u01a2\u00d1\u0000"+
		"\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b2\u02c1\u0001\u0000\u0000\u0000\u02b3\u02c2\u0003*\u0015\u0000\u02b4"+
		"\u02c2\u0003,\u0016\u0000\u02b5\u02c2\u00032\u0019\u0000\u02b6\u02c2\u0003"+
		"4\u001a\u0000\u02b7\u02c2\u0003>\u001f\u0000\u02b8\u02c2\u0003R)\u0000"+
		"\u02b9\u02c2\u0003T*\u0000\u02ba\u02c2\u0003b1\u0000\u02bb\u02c2\u0003"+
		"n7\u0000\u02bc\u02c2\u0003p8\u0000\u02bd\u02c2\u0003r9\u0000\u02be\u02c2"+
		"\u0003t:\u0000\u02bf\u02c2\u0003v;\u0000\u02c0\u02c2\u0003|>\u0000\u02c1"+
		"\u02b3\u0001\u0000\u0000\u0000\u02c1\u02b4\u0001\u0000\u0000\u0000\u02c1"+
		"\u02b5\u0001\u0000\u0000\u0000\u02c1\u02b6\u0001\u0000\u0000\u0000\u02c1"+
		"\u02b7\u0001\u0000\u0000\u0000\u02c1\u02b8\u0001\u0000\u0000\u0000\u02c1"+
		"\u02b9\u0001\u0000\u0000\u0000\u02c1\u02ba\u0001\u0000\u0000\u0000\u02c1"+
		"\u02bb\u0001\u0000\u0000\u0000\u02c1\u02bc\u0001\u0000\u0000\u0000\u02c1"+
		"\u02bd\u0001\u0000\u0000\u0000\u02c1\u02be\u0001\u0000\u0000\u0000\u02c1"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2"+
		"\'\u0001\u0000\u0000\u0000\u02c3\u02c7\u0003\n\u0005\u0000\u02c4\u02c7"+
		"\u0003\f\u0006\u0000\u02c5\u02c7\u0003\u000e\u0007\u0000\u02c6\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c6\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c7)\u0001\u0000\u0000\u0000\u02c8\u02ca\u0005!\u0000"+
		"\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005\u0012\u0000"+
		"\u0000\u02cc\u02dc\u0003\u01a4\u00d2\u0000\u02cd\u02dd\u0005|\u0000\u0000"+
		"\u02ce\u02d2\u0005\u0084\u0000\u0000\u02cf\u02d1\u0003\u009cN\u0000\u02d0"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d8\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d7\u0003$\u0012\u0000\u02d6\u02d5\u0001\u0000\u0000\u0000\u02d7\u02da"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d8\u02d9"+
		"\u0001\u0000\u0000\u0000\u02d9\u02db\u0001\u0000\u0000\u0000\u02da\u02d8"+
		"\u0001\u0000\u0000\u0000\u02db\u02dd\u0005\u0085\u0000\u0000\u02dc\u02cd"+
		"\u0001\u0000\u0000\u0000\u02dc\u02ce\u0001\u0000\u0000\u0000\u02dd+\u0001"+
		"\u0000\u0000\u0000\u02de\u02df\u0005\b\u0000\u0000\u02df\u02e0\u0005\u0005"+
		"\u0000\u0000\u02e0\u02e2\u0003.\u0017\u0000\u02e1\u02e3\u00030\u0018\u0000"+
		"\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005|\u0000\u0000\u02e5"+
		"-\u0001\u0000\u0000\u0000\u02e6\u02e9\u0003\u01a4\u00d2\u0000\u02e7\u02e9"+
		"\u0005\u0018\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e8\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e9/\u0001\u0000\u0000\u0000\u02ea\u02ed\u0005"+
		"\u0001\u0000\u0000\u02eb\u02ee\u0003\u01a4\u00d2\u0000\u02ec\u02ee\u0005"+
		"v\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ee1\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005#\u0000\u0000"+
		"\u02f0\u02f1\u0003<\u001e\u0000\u02f1\u02f2\u0005|\u0000\u0000\u02f23"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005$\u0000\u0000\u02f4\u02f6\u0003"+
		"6\u001b\u0000\u02f5\u02f7\u00038\u001c\u0000\u02f6\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02fa\u0001\u0000\u0000"+
		"\u0000\u02f8\u02fb\u0005|\u0000\u0000\u02f9\u02fb\u0003\u00ba]\u0000\u02fa"+
		"\u02f8\u0001\u0000\u0000\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fb"+
		"5\u0001\u0000\u0000\u0000\u02fc\u0301\u0003\u017a\u00bd\u0000\u02fd\u0301"+
		"\u0003\u0194\u00ca\u0000\u02fe\u0301\u0003\u0196\u00cb\u0000\u02ff\u0301"+
		"\u0003\u017e\u00bf\u0000\u0300\u02fc\u0001\u0000\u0000\u0000\u0300\u02fd"+
		"\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u02ff"+
		"\u0001\u0000\u0000\u0000\u0301\u030a\u0001\u0000\u0000\u0000\u0302\u0308"+
		"\u0005~\u0000\u0000\u0303\u0309\u0005\\\u0000\u0000\u0304\u0305\u0005"+
		"\u0084\u0000\u0000\u0305\u0306\u0003:\u001d\u0000\u0306\u0307\u0005\u0085"+
		"\u0000\u0000\u0307\u0309\u0001\u0000\u0000\u0000\u0308\u0303\u0001\u0000"+
		"\u0000\u0000\u0308\u0304\u0001\u0000\u0000\u0000\u0309\u030b\u0001\u0000"+
		"\u0000\u0000\u030a\u0302\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000"+
		"\u0000\u0000\u030b7\u0001\u0000\u0000\u0000\u030c\u030d\u0005\u0001\u0000"+
		"\u0000\u030d\u030e\u0003\u01a4\u00d2\u0000\u030e9\u0001\u0000\u0000\u0000"+
		"\u030f\u0311\u0003\u01a4\u00d2\u0000\u0310\u0312\u00038\u001c\u0000\u0311"+
		"\u0310\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312"+
		"\u031a\u0001\u0000\u0000\u0000\u0313\u0314\u0005{\u0000\u0000\u0314\u0316"+
		"\u0003\u01a4\u00d2\u0000\u0315\u0317\u00038\u001c\u0000\u0316\u0315\u0001"+
		"\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0319\u0001"+
		"\u0000\u0000\u0000\u0318\u0313\u0001\u0000\u0000\u0000\u0319\u031c\u0001"+
		"\u0000\u0000\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031a\u031b\u0001"+
		"\u0000\u0000\u0000\u031b\u031e\u0001\u0000\u0000\u0000\u031c\u031a\u0001"+
		"\u0000\u0000\u0000\u031d\u031f\u0005{\u0000\u0000\u031e\u031d\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f;\u0001\u0000\u0000"+
		"\u0000\u0320\u0322\u0003\u017a\u00bd\u0000\u0321\u0320\u0001\u0000\u0000"+
		"\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000"+
		"\u0000\u0323\u0325\u0005~\u0000\u0000\u0324\u0321\u0001\u0000\u0000\u0000"+
		"\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0336\u0001\u0000\u0000\u0000"+
		"\u0326\u0337\u0005\\\u0000\u0000\u0327\u0333\u0005\u0084\u0000\u0000\u0328"+
		"\u032d\u0003<\u001e\u0000\u0329\u032a\u0005{\u0000\u0000\u032a\u032c\u0003"+
		"<\u001e\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032c\u032f\u0001\u0000"+
		"\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000"+
		"\u0000\u0000\u032e\u0331\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000"+
		"\u0000\u0000\u0330\u0332\u0005{\u0000\u0000\u0331\u0330\u0001\u0000\u0000"+
		"\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0334\u0001\u0000\u0000"+
		"\u0000\u0333\u0328\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000"+
		"\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0337\u0005\u0085\u0000"+
		"\u0000\u0336\u0326\u0001\u0000\u0000\u0000\u0336\u0327\u0001\u0000\u0000"+
		"\u0000\u0337\u0341\u0001\u0000\u0000\u0000\u0338\u033e\u0003\u017a\u00bd"+
		"\u0000\u0339\u033c\u0005\u0001\u0000\u0000\u033a\u033d\u0003\u01a4\u00d2"+
		"\u0000\u033b\u033d\u0005v\u0000\u0000\u033c\u033a\u0001\u0000\u0000\u0000"+
		"\u033c\u033b\u0001\u0000\u0000\u0000\u033d\u033f\u0001\u0000\u0000\u0000"+
		"\u033e\u0339\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000"+
		"\u033f\u0341\u0001\u0000\u0000\u0000\u0340\u0324\u0001\u0000\u0000\u0000"+
		"\u0340\u0338\u0001\u0000\u0000\u0000\u0341=\u0001\u0000\u0000\u0000\u0342"+
		"\u0343\u0003@ \u0000\u0343\u0344\u0005\n\u0000\u0000\u0344\u0346\u0003"+
		"\u01a4\u00d2\u0000\u0345\u0347\u0003\u0082A\u0000\u0346\u0345\u0001\u0000"+
		"\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000"+
		"\u0000\u0000\u0348\u034a\u0005\u0088\u0000\u0000\u0349\u034b\u0003D\""+
		"\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000"+
		"\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u034e\u0005\u0089\u0000"+
		"\u0000\u034d\u034f\u0003P(\u0000\u034e\u034d\u0001\u0000\u0000\u0000\u034e"+
		"\u034f\u0001\u0000\u0000\u0000\u034f\u0351\u0001\u0000\u0000\u0000\u0350"+
		"\u0352\u0003\u008eG\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0351\u0352"+
		"\u0001\u0000\u0000\u0000\u0352\u0355\u0001\u0000\u0000\u0000\u0353\u0356"+
		"\u0003\u00ba]\u0000\u0354\u0356\u0005|\u0000\u0000\u0355\u0353\u0001\u0000"+
		"\u0000\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0356?\u0001\u0000\u0000"+
		"\u0000\u0357\u0359\u0005<\u0000\u0000\u0358\u0357\u0001\u0000\u0000\u0000"+
		"\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u035b\u0001\u0000\u0000\u0000"+
		"\u035a\u035c\u0005\u0003\u0000\u0000\u035b\u035a\u0001\u0000\u0000\u0000"+
		"\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035e\u0001\u0000\u0000\u0000"+
		"\u035d\u035f\u0005\'\u0000\u0000\u035e\u035d\u0001\u0000\u0000\u0000\u035e"+
		"\u035f\u0001\u0000\u0000\u0000\u035f\u0361\u0001\u0000\u0000\u0000\u0360"+
		"\u0362\u0005?\u0000\u0000\u0361\u0360\u0001\u0000\u0000\u0000\u0361\u0362"+
		"\u0001\u0000\u0000\u0000\u0362\u0364\u0001\u0000\u0000\u0000\u0363\u0365"+
		"\u0007\u0002\u0000\u0000\u0364\u0363\u0001\u0000\u0000\u0000\u0364\u0365"+
		"\u0001\u0000\u0000\u0000\u0365\u036a\u0001\u0000\u0000\u0000\u0366\u0368"+
		"\u0005\b\u0000\u0000\u0367\u0369\u0003B!\u0000\u0368\u0367\u0001\u0000"+
		"\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u036b\u0001\u0000"+
		"\u0000\u0000\u036a\u0366\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000"+
		"\u0000\u0000\u036bA\u0001\u0000\u0000\u0000\u036c\u036d\u0007\u0003\u0000"+
		"\u0000\u036dC\u0001\u0000\u0000\u0000\u036e\u0370\u0003F#\u0000\u036f"+
		"\u0371\u0005{\u0000\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0370\u0371"+
		"\u0001\u0000\u0000\u0000\u0371\u0383\u0001\u0000\u0000\u0000\u0372\u0373"+
		"\u0003F#\u0000\u0373\u0374\u0005{\u0000\u0000\u0374\u0376\u0001\u0000"+
		"\u0000\u0000\u0375\u0372\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u037c\u0003L&\u0000"+
		"\u0378\u0379\u0005{\u0000\u0000\u0379\u037b\u0003L&\u0000\u037a\u0378"+
		"\u0001\u0000\u0000\u0000\u037b\u037e\u0001\u0000\u0000\u0000\u037c\u037a"+
		"\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u0380"+
		"\u0001\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037f\u0381"+
		"\u0005{\u0000\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0380\u0381\u0001"+
		"\u0000\u0000\u0000\u0381\u0383\u0001\u0000\u0000\u0000\u0382\u036e\u0001"+
		"\u0000\u0000\u0000\u0382\u0375\u0001\u0000\u0000\u0000\u0383E\u0001\u0000"+
		"\u0000\u0000\u0384\u0386\u0003\u009eO\u0000\u0385\u0384\u0001\u0000\u0000"+
		"\u0000\u0386\u0389\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000\u0000"+
		"\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u038c\u0001\u0000\u0000"+
		"\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u038a\u038d\u0003H$\u0000\u038b"+
		"\u038d\u0003J%\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038c\u038b\u0001"+
		"\u0000\u0000\u0000\u038dG\u0001\u0000\u0000\u0000\u038e\u0390\u0005b\u0000"+
		"\u0000\u038f\u0391\u0003\u0178\u00bc\u0000\u0390\u038f\u0001\u0000\u0000"+
		"\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0393\u0001\u0000\u0000"+
		"\u0000\u0392\u038e\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000"+
		"\u0000\u0393\u0395\u0001\u0000\u0000\u0000\u0394\u0396\u0005\u0014\u0000"+
		"\u0000\u0395\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000"+
		"\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0398\u0005\u0018\u0000"+
		"\u0000\u0398I\u0001\u0000\u0000\u0000\u0399\u039b\u0005\u0014\u0000\u0000"+
		"\u039a\u0399\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000"+
		"\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u039d\u0005\u0018\u0000\u0000"+
		"\u039d\u039e\u0005}\u0000\u0000\u039e\u039f\u0003\u013c\u009e\u0000\u039f"+
		"K\u0001\u0000\u0000\u0000\u03a0\u03a2\u0003\u009eO\u0000\u03a1\u03a0\u0001"+
		"\u0000\u0000\u0000\u03a2\u03a5\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001"+
		"\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a6\u03aa\u0003"+
		"N\'\u0000\u03a7\u03aa\u0005y\u0000\u0000\u03a8\u03aa\u0003\u013c\u009e"+
		"\u0000\u03a9\u03a6\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000"+
		"\u0000\u03a9\u03a8\u0001\u0000\u0000\u0000\u03aaM\u0001\u0000\u0000\u0000"+
		"\u03ab\u03ac\u0003\u010c\u0086\u0000\u03ac\u03af\u0005}\u0000\u0000\u03ad"+
		"\u03b0\u0003\u013c\u009e\u0000\u03ae\u03b0\u0005y\u0000\u0000\u03af\u03ad"+
		"\u0001\u0000\u0000\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03b0O\u0001"+
		"\u0000\u0000\u0000\u03b1\u03b2\u0005\u007f\u0000\u0000\u03b2\u03b3\u0003"+
		"\u013c\u009e\u0000\u03b3Q\u0001\u0000\u0000\u0000\u03b4\u03b6\u0005<\u0000"+
		"\u0000\u03b5\u03b4\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8\u0005 \u0000\u0000"+
		"\u03b8\u03ba\u0003\u01a4\u00d2\u0000\u03b9\u03bb\u0003\u0082A\u0000\u03ba"+
		"\u03b9\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb"+
		"\u03c0\u0001\u0000\u0000\u0000\u03bc\u03be\u0005}\u0000\u0000\u03bd\u03bf"+
		"\u0003\u0168\u00b4\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03be\u03bf"+
		"\u0001\u0000\u0000\u0000\u03bf\u03c1\u0001\u0000\u0000\u0000\u03c0\u03bc"+
		"\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c3"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c4\u0003\u008eG\u0000\u03c3\u03c2\u0001"+
		"\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000\u03c4\u03ca\u0001"+
		"\u0000\u0000\u0000\u03c5\u03c6\u0005o\u0000\u0000\u03c6\u03c8\u0003\u013c"+
		"\u009e\u0000\u03c7\u03c9\u0003\u008eG\u0000\u03c8\u03c7\u0001\u0000\u0000"+
		"\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cb\u0001\u0000\u0000"+
		"\u0000\u03ca\u03c5\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000"+
		"\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03cd\u0005|\u0000\u0000"+
		"\u03cdS\u0001\u0000\u0000\u0000\u03ce\u03d1\u0003V+\u0000\u03cf\u03d1"+
		"\u0003X,\u0000\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d0\u03cf\u0001\u0000"+
		"\u0000\u0000\u03d1U\u0001\u0000\u0000\u0000\u03d2\u03d3\u0005\u001c\u0000"+
		"\u0000\u03d3\u03d5\u0003\u01a4\u00d2\u0000\u03d4\u03d6\u0003\u0082A\u0000"+
		"\u03d5\u03d4\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d8\u0001\u0000\u0000\u0000\u03d7\u03d9\u0003\u008eG\u0000\u03d8"+
		"\u03d7\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9"+
		"\u03e0\u0001\u0000\u0000\u0000\u03da\u03dc\u0005\u0084\u0000\u0000\u03db"+
		"\u03dd\u0003Z-\u0000\u03dc\u03db\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de\u03e1\u0005"+
		"\u0085\u0000\u0000\u03df\u03e1\u0005|\u0000\u0000\u03e0\u03da\u0001\u0000"+
		"\u0000\u0000\u03e0\u03df\u0001\u0000\u0000\u0000\u03e1W\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e3\u0005\u001c\u0000\u0000\u03e3\u03e5\u0003\u01a4\u00d2"+
		"\u0000\u03e4\u03e6\u0003\u0082A\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e9\u0005\u0088\u0000\u0000\u03e8\u03ea\u0003^/\u0000\u03e9\u03e8"+
		"\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03eb"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ed\u0005\u0089\u0000\u0000\u03ec\u03ee"+
		"\u0003\u008eG\u0000\u03ed\u03ec\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f0\u0005"+
		"|\u0000\u0000\u03f0Y\u0001\u0000\u0000\u0000\u03f1\u03f6\u0003\\.\u0000"+
		"\u03f2\u03f3\u0005{\u0000\u0000\u03f3\u03f5\u0003\\.\u0000\u03f4\u03f2"+
		"\u0001\u0000\u0000\u0000\u03f5\u03f8\u0001\u0000\u0000\u0000\u03f6\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7\u03fa"+
		"\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f9\u03fb"+
		"\u0005{\u0000\u0000\u03fa\u03f9\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fb[\u0001\u0000\u0000\u0000\u03fc\u03fe\u0003\u009e"+
		"O\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fe\u0401\u0001\u0000\u0000"+
		"\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000"+
		"\u0000\u0400\u0403\u0001\u0000\u0000\u0000\u0401\u03ff\u0001\u0000\u0000"+
		"\u0000\u0402\u0404\u0005!\u0000\u0000\u0403\u0402\u0001\u0000\u0000\u0000"+
		"\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0406\u0001\u0000\u0000\u0000"+
		"\u0405\u0407\u0003\u01a2\u00d1\u0000\u0406\u0405\u0001\u0000\u0000\u0000"+
		"\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000"+
		"\u0408\u0409\u0003\u01a4\u00d2\u0000\u0409\u040a\u0005}\u0000\u0000\u040a"+
		"\u040d\u0003\u013c\u009e\u0000\u040b\u040c\u0005o\u0000\u0000\u040c\u040e"+
		"\u0003\u00aaU\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040d\u040e\u0001"+
		"\u0000\u0000\u0000\u040e]\u0001\u0000\u0000\u0000\u040f\u0414\u0003`0"+
		"\u0000\u0410\u0411\u0005{\u0000\u0000\u0411\u0413\u0003`0\u0000\u0412"+
		"\u0410\u0001\u0000\u0000\u0000\u0413\u0416\u0001\u0000\u0000\u0000\u0414"+
		"\u0412\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415"+
		"\u0418\u0001\u0000\u0000\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0417"+
		"\u0419\u0005{\u0000\u0000\u0418\u0417\u0001\u0000\u0000\u0000\u0418\u0419"+
		"\u0001\u0000\u0000\u0000\u0419_\u0001\u0000\u0000\u0000\u041a\u041c\u0003"+
		"\u009eO\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041c\u041f\u0001\u0000"+
		"\u0000\u0000\u041d\u041b\u0001\u0000\u0000\u0000\u041d\u041e\u0001\u0000"+
		"\u0000\u0000\u041e\u0421\u0001\u0000\u0000\u0000\u041f\u041d\u0001\u0000"+
		"\u0000\u0000\u0420\u0422\u0003\u01a2\u00d1\u0000\u0421\u0420\u0001\u0000"+
		"\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000"+
		"\u0000\u0000\u0423\u0424\u0003\u013c\u009e\u0000\u0424a\u0001\u0000\u0000"+
		"\u0000\u0425\u0426\u0005\u0007\u0000\u0000\u0426\u0428\u0003\u01a4\u00d2"+
		"\u0000\u0427\u0429\u0003\u0082A\u0000\u0428\u0427\u0001\u0000\u0000\u0000"+
		"\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u042b\u0001\u0000\u0000\u0000"+
		"\u042a\u042c\u0003\u008eG\u0000\u042b\u042a\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0001\u0000\u0000\u0000\u042c\u042d\u0001\u0000\u0000\u0000\u042d"+
		"\u042f\u0005\u0084\u0000\u0000\u042e\u0430\u0003d2\u0000\u042f\u042e\u0001"+
		"\u0000\u0000\u0000\u042f\u0430\u0001\u0000\u0000\u0000\u0430\u0431\u0001"+
		"\u0000\u0000\u0000\u0431\u0432\u0005\u0085\u0000\u0000\u0432c\u0001\u0000"+
		"\u0000\u0000\u0433\u0438\u0003f3\u0000\u0434\u0435\u0005{\u0000\u0000"+
		"\u0435\u0437\u0003f3\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0437\u043a"+
		"\u0001\u0000\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438\u0439"+
		"\u0001\u0000\u0000\u0000\u0439\u043c\u0001\u0000\u0000\u0000\u043a\u0438"+
		"\u0001\u0000\u0000\u0000\u043b\u043d\u0005{\u0000\u0000\u043c\u043b\u0001"+
		"\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000\u043de\u0001\u0000"+
		"\u0000\u0000\u043e\u0440\u0003\u009eO\u0000\u043f\u043e\u0001\u0000\u0000"+
		"\u0000\u0440\u0443\u0001\u0000\u0000\u0000\u0441\u043f\u0001\u0000\u0000"+
		"\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0445\u0001\u0000\u0000"+
		"\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0444\u0446\u0003\u01a2\u00d1"+
		"\u0000\u0445\u0444\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000"+
		"\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u044a\u0003\u01a4\u00d2"+
		"\u0000\u0448\u044b\u0003h4\u0000\u0449\u044b\u0003j5\u0000\u044a\u0448"+
		"\u0001\u0000\u0000\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044a\u044b"+
		"\u0001\u0000\u0000\u0000\u044b\u044d\u0001\u0000\u0000\u0000\u044c\u044e"+
		"\u0003l6\u0000\u044d\u044c\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000"+
		"\u0000\u0000\u044eg\u0001\u0000\u0000\u0000\u044f\u0451\u0005\u0088\u0000"+
		"\u0000\u0450\u0452\u0003^/\u0000\u0451\u0450\u0001\u0000\u0000\u0000\u0451"+
		"\u0452\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000\u0000\u0000\u0453"+
		"\u0454\u0005\u0089\u0000\u0000\u0454i\u0001\u0000\u0000\u0000\u0455\u0457"+
		"\u0005\u0084\u0000\u0000\u0456\u0458\u0003Z-\u0000\u0457\u0456\u0001\u0000"+
		"\u0000\u0000\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000"+
		"\u0000\u0000\u0459\u045a\u0005\u0085\u0000\u0000\u045ak\u0001\u0000\u0000"+
		"\u0000\u045b\u045c\u0005o\u0000\u0000\u045c\u045d\u0003\u00aaU\u0000\u045d"+
		"m\u0001\u0000\u0000\u0000\u045e\u045f\u00059\u0000\u0000\u045f\u0460\u0004"+
		"7\u0000\u0000\u0460\u0462\u0003\u01a4\u00d2\u0000\u0461\u0463\u0003\u0082"+
		"A\u0000\u0462\u0461\u0001\u0000\u0000\u0000\u0462\u0463\u0001\u0000\u0000"+
		"\u0000\u0463\u0465\u0001\u0000\u0000\u0000\u0464\u0466\u0003\u008eG\u0000"+
		"\u0465\u0464\u0001\u0000\u0000\u0000\u0465\u0466\u0001\u0000\u0000\u0000"+
		"\u0466\u0467\u0001\u0000\u0000\u0000\u0467\u0469\u0005\u0084\u0000\u0000"+
		"\u0468\u046a\u0003Z-\u0000\u0469\u0468\u0001\u0000\u0000\u0000\u0469\u046a"+
		"\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000\u0000\u046b\u046c"+
		"\u0005\u0085\u0000\u0000\u046co\u0001\u0000\u0000\u0000\u046d\u046f\u0005"+
		"<\u0000\u0000\u046e\u046d\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000"+
		"\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u0473\u0005\u0003"+
		"\u0000\u0000\u0471\u0474\u0003\u01a4\u00d2\u0000\u0472\u0474\u0005v\u0000"+
		"\u0000\u0473\u0471\u0001\u0000\u0000\u0000\u0473\u0472\u0001\u0000\u0000"+
		"\u0000\u0474\u0476\u0001\u0000\u0000\u0000\u0475\u0477\u0003\u0082A\u0000"+
		"\u0476\u0475\u0001\u0000\u0000\u0000\u0476\u0477\u0001\u0000\u0000\u0000"+
		"\u0477\u0478\u0001\u0000\u0000\u0000\u0478\u0479\u0005}\u0000\u0000\u0479"+
		"\u047c\u0003\u013c\u009e\u0000\u047a\u047b\u0005o\u0000\u0000\u047b\u047d"+
		"\u0003\u00aaU\u0000\u047c\u047a\u0001\u0000\u0000\u0000\u047c\u047d\u0001"+
		"\u0000\u0000\u0000\u047d\u047f\u0001\u0000\u0000\u0000\u047e\u0480\u0003"+
		"\u008eG\u0000\u047f\u047e\u0001\u0000\u0000\u0000\u047f\u0480\u0001\u0000"+
		"\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u0482\u0005|\u0000"+
		"\u0000\u0482q\u0001\u0000\u0000\u0000\u0483\u0485\u0007\u0002\u0000\u0000"+
		"\u0484\u0483\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000"+
		"\u0485\u0486\u0001\u0000\u0000\u0000\u0486\u0488\u0005\u001b\u0000\u0000"+
		"\u0487\u0489\u0005\u0014\u0000\u0000\u0488\u0487\u0001\u0000\u0000\u0000"+
		"\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u048a\u0001\u0000\u0000\u0000"+
		"\u048a\u048b\u0003\u01a4\u00d2\u0000\u048b\u048c\u0005}\u0000\u0000\u048c"+
		"\u048f\u0003\u013c\u009e\u0000\u048d\u048e\u0005o\u0000\u0000\u048e\u0490"+
		"\u0003\u00aaU\u0000\u048f\u048d\u0001\u0000\u0000\u0000\u048f\u0490\u0001"+
		"\u0000\u0000\u0000\u0490\u0491\u0001\u0000\u0000\u0000\u0491\u0492\u0005"+
		"|\u0000\u0000\u0492s\u0001\u0000\u0000\u0000\u0493\u0495\u0005!\u0000"+
		"\u0000\u0494\u0493\u0001\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000"+
		"\u0000\u0495\u0497\u0001\u0000\u0000\u0000\u0496\u0498\u0005*\u0000\u0000"+
		"\u0497\u0496\u0001\u0000\u0000\u0000\u0497\u0498\u0001\u0000\u0000\u0000"+
		"\u0498\u0499\u0001\u0000\u0000\u0000\u0499\u049a\u0005\u001e\u0000\u0000"+
		"\u049a\u049c\u0003\u01a4\u00d2\u0000\u049b\u049d\u0003\u0082A\u0000\u049c"+
		"\u049b\u0001\u0000\u0000\u0000\u049c\u049d\u0001\u0000\u0000\u0000\u049d"+
		"\u04a2\u0001\u0000\u0000\u0000\u049e\u04a0\u0005}\u0000\u0000\u049f\u04a1"+
		"\u0003\u0168\u00b4\u0000\u04a0\u049f\u0001\u0000\u0000\u0000\u04a0\u04a1"+
		"\u0001\u0000\u0000\u0000\u04a1\u04a3\u0001\u0000\u0000\u0000\u04a2\u049e"+
		"\u0001\u0000\u0000\u0000\u04a2\u04a3\u0001\u0000\u0000\u0000\u04a3\u04a5"+
		"\u0001\u0000\u0000\u0000\u04a4\u04a6\u0003\u008eG\u0000\u04a5\u04a4\u0001"+
		"\u0000\u0000\u0000\u04a5\u04a6\u0001\u0000\u0000\u0000\u04a6\u04a7\u0001"+
		"\u0000\u0000\u0000\u04a7\u04ab\u0005\u0084\u0000\u0000\u04a8\u04aa\u0003"+
		"\u009cN\u0000\u04a9\u04a8\u0001\u0000\u0000\u0000\u04aa\u04ad\u0001\u0000"+
		"\u0000\u0000\u04ab\u04a9\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000"+
		"\u0000\u0000\u04ac\u04b1\u0001\u0000\u0000\u0000\u04ad\u04ab\u0001\u0000"+
		"\u0000\u0000\u04ae\u04b0\u0003\u009aM\u0000\u04af\u04ae\u0001\u0000\u0000"+
		"\u0000\u04b0\u04b3\u0001\u0000\u0000\u0000\u04b1\u04af\u0001\u0000\u0000"+
		"\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u04b4\u0001\u0000\u0000"+
		"\u0000\u04b3\u04b1\u0001\u0000\u0000\u0000\u04b4\u04b5\u0005\u0085\u0000"+
		"\u0000\u04b5\u04d1\u0001\u0000\u0000\u0000\u04b6\u04b8\u0005!\u0000\u0000"+
		"\u04b7\u04b6\u0001\u0000\u0000\u0000\u04b7\u04b8\u0001\u0000\u0000\u0000"+
		"\u04b8\u04ba\u0001\u0000\u0000\u0000\u04b9\u04bb\u0005*\u0000\u0000\u04ba"+
		"\u04b9\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb"+
		"\u04bc\u0001\u0000\u0000\u0000\u04bc\u04bd\u0005\u001e\u0000\u0000\u04bd"+
		"\u04bf\u0003\u01a4\u00d2\u0000\u04be\u04c0\u0003\u0082A\u0000\u04bf\u04be"+
		"\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u04c5"+
		"\u0001\u0000\u0000\u0000\u04c1\u04c3\u0005}\u0000\u0000\u04c2\u04c4\u0003"+
		"\u0168\u00b4\u0000\u04c3\u04c2\u0001\u0000\u0000\u0000\u04c3\u04c4\u0001"+
		"\u0000\u0000\u0000\u04c4\u04c6\u0001\u0000\u0000\u0000\u04c5\u04c1\u0001"+
		"\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000\u0000\u04c6\u04c7\u0001"+
		"\u0000\u0000\u0000\u04c7\u04c9\u0005o\u0000\u0000\u04c8\u04ca\u0003\u0168"+
		"\u00b4\u0000\u04c9\u04c8\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000"+
		"\u0000\u0000\u04ca\u04cc\u0001\u0000\u0000\u0000\u04cb\u04cd\u0003\u008e"+
		"G\u0000\u04cc\u04cb\u0001\u0000\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000"+
		"\u0000\u04cd\u04ce\u0001\u0000\u0000\u0000\u04ce\u04cf\u0005|\u0000\u0000"+
		"\u04cf\u04d1\u0001\u0000\u0000\u0000\u04d0\u0494\u0001\u0000\u0000\u0000"+
		"\u04d0\u04b7\u0001\u0000\u0000\u0000\u04d1u\u0001\u0000\u0000\u0000\u04d2"+
		"\u04d5\u0003x<\u0000\u04d3\u04d5\u0003z=\u0000\u04d4\u04d2\u0001\u0000"+
		"\u0000\u0000\u04d4\u04d3\u0001\u0000\u0000\u0000\u04d5w\u0001\u0000\u0000"+
		"\u0000\u04d6\u04d7\u0005<\u0000\u0000\u04d7\u04dd\u0005!\u0000\u0000\u04d8"+
		"\u04d9\u0005!\u0000\u0000\u04d9\u04dd\u0005<\u0000\u0000\u04da\u04dd\u0005"+
		"<\u0000\u0000\u04db\u04dd\u0005!\u0000\u0000\u04dc\u04d6\u0001\u0000\u0000"+
		"\u0000\u04dc\u04d8\u0001\u0000\u0000\u0000\u04dc\u04da\u0001\u0000\u0000"+
		"\u0000\u04dc\u04db\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001\u0000\u0000"+
		"\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04e0\u0005\r\u0000\u0000"+
		"\u04df\u04e1\u0003\u0082A\u0000\u04e0\u04df\u0001\u0000\u0000\u0000\u04e0"+
		"\u04e1\u0001\u0000\u0000\u0000\u04e1\u04e3\u0001\u0000\u0000\u0000\u04e2"+
		"\u04e4\u0005`\u0000\u0000\u04e3\u04e2\u0001\u0000\u0000\u0000\u04e3\u04e4"+
		"\u0001\u0000\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000\u0000\u04e5\u04e7"+
		"\u0003\u013c\u009e\u0000\u04e6\u04e8\u0003\u008eG\u0000\u04e7\u04e6\u0001"+
		"\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u04e9\u0001"+
		"\u0000\u0000\u0000\u04e9\u04ed\u0005\u0084\u0000\u0000\u04ea\u04ec\u0003"+
		"\u009cN\u0000\u04eb\u04ea\u0001\u0000\u0000\u0000\u04ec\u04ef\u0001\u0000"+
		"\u0000\u0000\u04ed\u04eb\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001\u0000"+
		"\u0000\u0000\u04ee\u04f3\u0001\u0000\u0000\u0000\u04ef\u04ed\u0001\u0000"+
		"\u0000\u0000\u04f0\u04f2\u0003\u009aM\u0000\u04f1\u04f0\u0001\u0000\u0000"+
		"\u0000\u04f2\u04f5\u0001\u0000\u0000\u0000\u04f3\u04f1\u0001\u0000\u0000"+
		"\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f6\u0001\u0000\u0000"+
		"\u0000\u04f5\u04f3\u0001\u0000\u0000\u0000\u04f6\u04f7\u0005\u0085\u0000"+
		"\u0000\u04f7y\u0001\u0000\u0000\u0000\u04f8\u04f9\u0005<\u0000\u0000\u04f9"+
		"\u04ff\u0005!\u0000\u0000\u04fa\u04fb\u0005!\u0000\u0000\u04fb\u04ff\u0005"+
		"<\u0000\u0000\u04fc\u04ff\u0005<\u0000\u0000\u04fd\u04ff\u0005!\u0000"+
		"\u0000\u04fe\u04f8\u0001\u0000\u0000\u0000\u04fe\u04fa\u0001\u0000\u0000"+
		"\u0000\u04fe\u04fc\u0001\u0000\u0000\u0000\u04fe\u04fd\u0001\u0000\u0000"+
		"\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff\u0500\u0001\u0000\u0000"+
		"\u0000\u0500\u0502\u0005\r\u0000\u0000\u0501\u0503\u0003\u0082A\u0000"+
		"\u0502\u0501\u0001\u0000\u0000\u0000\u0502\u0503\u0001\u0000\u0000\u0000"+
		"\u0503\u0505\u0001\u0000\u0000\u0000\u0504\u0506\u0005\u0003\u0000\u0000"+
		"\u0505\u0504\u0001\u0000\u0000\u0000\u0505\u0506\u0001\u0000\u0000\u0000"+
		"\u0506\u0508\u0001\u0000\u0000\u0000\u0507\u0509\u0005`\u0000\u0000\u0508"+
		"\u0507\u0001\u0000\u0000\u0000\u0508\u0509\u0001\u0000\u0000\u0000\u0509"+
		"\u050a\u0001\u0000\u0000\u0000\u050a\u050b\u0003\u019a\u00cd\u0000\u050b"+
		"\u050c\u0005\u000b\u0000\u0000\u050c\u050e\u0003\u013c\u009e\u0000\u050d"+
		"\u050f\u0003\u008eG\u0000\u050e\u050d\u0001\u0000\u0000\u0000\u050e\u050f"+
		"\u0001\u0000\u0000\u0000\u050f\u0510\u0001\u0000\u0000\u0000\u0510\u0514"+
		"\u0005\u0084\u0000\u0000\u0511\u0513\u0003\u009cN\u0000\u0512\u0511\u0001"+
		"\u0000\u0000\u0000\u0513\u0516\u0001\u0000\u0000\u0000\u0514\u0512\u0001"+
		"\u0000\u0000\u0000\u0514\u0515\u0001\u0000\u0000\u0000\u0515\u051a\u0001"+
		"\u0000\u0000\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0517\u0519\u0003"+
		"\u009aM\u0000\u0518\u0517\u0001\u0000\u0000\u0000\u0519\u051c\u0001\u0000"+
		"\u0000\u0000\u051a\u0518\u0001\u0000\u0000\u0000\u051a\u051b\u0001\u0000"+
		"\u0000\u0000\u051b\u051d\u0001\u0000\u0000\u0000\u051c\u051a\u0001\u0000"+
		"\u0000\u0000\u051d\u051e\u0005\u0085\u0000\u0000\u051e{\u0001\u0000\u0000"+
		"\u0000\u051f\u0521\u0005!\u0000\u0000\u0520\u051f\u0001\u0000\u0000\u0000"+
		"\u0520\u0521\u0001\u0000\u0000\u0000\u0521\u0522\u0001\u0000\u0000\u0000"+
		"\u0522\u0524\u0005\b\u0000\u0000\u0523\u0525\u0003B!\u0000\u0524\u0523"+
		"\u0001\u0000\u0000\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525\u0526"+
		"\u0001\u0000\u0000\u0000\u0526\u052a\u0005\u0084\u0000\u0000\u0527\u0529"+
		"\u0003\u009cN\u0000\u0528\u0527\u0001\u0000\u0000\u0000\u0529\u052c\u0001"+
		"\u0000\u0000\u0000\u052a\u0528\u0001\u0000\u0000\u0000\u052a\u052b\u0001"+
		"\u0000\u0000\u0000\u052b\u0530\u0001\u0000\u0000\u0000\u052c\u052a\u0001"+
		"\u0000\u0000\u0000\u052d\u052f\u0003~?\u0000\u052e\u052d\u0001\u0000\u0000"+
		"\u0000\u052f\u0532\u0001\u0000\u0000\u0000\u0530\u052e\u0001\u0000\u0000"+
		"\u0000\u0530\u0531\u0001\u0000\u0000\u0000\u0531\u0533\u0001\u0000\u0000"+
		"\u0000\u0532\u0530\u0001\u0000\u0000\u0000\u0533\u0534\u0005\u0085\u0000"+
		"\u0000\u0534}\u0001\u0000\u0000\u0000\u0535\u0537\u0003\u009eO\u0000\u0536"+
		"\u0535\u0001\u0000\u0000\u0000\u0537\u053a\u0001\u0000\u0000\u0000\u0538"+
		"\u0536\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539"+
		"\u0544\u0001\u0000\u0000\u0000\u053a\u0538\u0001\u0000\u0000\u0000\u053b"+
		"\u0545\u0003\n\u0005\u0000\u053c\u053e\u0003\u01a2\u00d1\u0000\u053d\u053c"+
		"\u0001\u0000\u0000\u0000\u053d\u053e\u0001\u0000\u0000\u0000\u053e\u0542"+
		"\u0001\u0000\u0000\u0000\u053f\u0543\u0003r9\u0000\u0540\u0543\u0003>"+
		"\u001f\u0000\u0541\u0543\u0003\u0080@\u0000\u0542\u053f\u0001\u0000\u0000"+
		"\u0000\u0542\u0540\u0001\u0000\u0000\u0000\u0542\u0541\u0001\u0000\u0000"+
		"\u0000\u0543\u0545\u0001\u0000\u0000\u0000\u0544\u053b\u0001\u0000\u0000"+
		"\u0000\u0544\u053d\u0001\u0000\u0000\u0000\u0545\u007f\u0001\u0000\u0000"+
		"\u0000\u0546\u0547\u0005 \u0000\u0000\u0547\u0549\u0003\u01a4\u00d2\u0000"+
		"\u0548\u054a\u0003\u0082A\u0000\u0549\u0548\u0001\u0000\u0000\u0000\u0549"+
		"\u054a\u0001\u0000\u0000\u0000\u054a\u054d\u0001\u0000\u0000\u0000\u054b"+
		"\u054c\u0005}\u0000\u0000\u054c\u054e\u0003\u0168\u00b4\u0000\u054d\u054b"+
		"\u0001\u0000\u0000\u0000\u054d\u054e\u0001\u0000\u0000\u0000\u054e\u0553"+
		"\u0001\u0000\u0000\u0000\u054f\u0551\u0005}\u0000\u0000\u0550\u054f\u0001"+
		"\u0000\u0000\u0000\u0550\u0551\u0001\u0000\u0000\u0000\u0551\u0552\u0001"+
		"\u0000\u0000\u0000\u0552\u0554\u0003\u008eG\u0000\u0553\u0550\u0001\u0000"+
		"\u0000\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0557\u0001\u0000"+
		"\u0000\u0000\u0555\u0556\u0005o\u0000\u0000\u0556\u0558\u0003\u013c\u009e"+
		"\u0000\u0557\u0555\u0001\u0000\u0000\u0000\u0557\u0558\u0001\u0000\u0000"+
		"\u0000\u0558\u0559\u0001\u0000\u0000\u0000\u0559\u055a\u0005|\u0000\u0000"+
		"\u055a\u0081\u0001\u0000\u0000\u0000\u055b\u0568\u0005s\u0000\u0000\u055c"+
		"\u055d\u0003\u0084B\u0000\u055d\u055e\u0005{\u0000\u0000\u055e\u0560\u0001"+
		"\u0000\u0000\u0000\u055f\u055c\u0001\u0000\u0000\u0000\u0560\u0563\u0001"+
		"\u0000\u0000\u0000\u0561\u055f\u0001\u0000\u0000\u0000\u0561\u0562\u0001"+
		"\u0000\u0000\u0000\u0562\u0564\u0001\u0000\u0000\u0000\u0563\u0561\u0001"+
		"\u0000\u0000\u0000\u0564\u0566\u0003\u0084B\u0000\u0565\u0567\u0005{\u0000"+
		"\u0000\u0566\u0565\u0001\u0000\u0000\u0000\u0566\u0567\u0001\u0000\u0000"+
		"\u0000\u0567\u0569\u0001\u0000\u0000\u0000\u0568\u0561\u0001\u0000\u0000"+
		"\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000\u0000"+
		"\u0000\u056a\u056b\u0005r\u0000\u0000\u056b\u0083\u0001\u0000\u0000\u0000"+
		"\u056c\u056e\u0003\u009eO\u0000\u056d\u056c\u0001\u0000\u0000\u0000\u056e"+
		"\u0571\u0001\u0000\u0000\u0000\u056f\u056d\u0001\u0000\u0000\u0000\u056f"+
		"\u0570\u0001\u0000\u0000\u0000\u0570\u0575\u0001\u0000\u0000\u0000\u0571"+
		"\u056f\u0001\u0000\u0000\u0000\u0572\u0576\u0003\u0086C\u0000\u0573\u0576"+
		"\u0003\u0088D\u0000\u0574\u0576\u0003\u008aE\u0000\u0575\u0572\u0001\u0000"+
		"\u0000\u0000\u0575\u0573\u0001\u0000\u0000\u0000\u0575\u0574\u0001\u0000"+
		"\u0000\u0000\u0576\u0085\u0001\u0000\u0000\u0000\u0577\u0579\u0003\u009e"+
		"O\u0000\u0578\u0577\u0001\u0000\u0000\u0000\u0578\u0579\u0001\u0000\u0000"+
		"\u0000\u0579\u057a\u0001\u0000\u0000\u0000\u057a\u057d\u0005Y\u0000\u0000"+
		"\u057b\u057c\u0005}\u0000\u0000\u057c\u057e\u0003\u0176\u00bb\u0000\u057d"+
		"\u057b\u0001\u0000\u0000\u0000\u057d\u057e\u0001\u0000\u0000\u0000\u057e"+
		"\u0087\u0001\u0000\u0000\u0000\u057f\u0581\u0003\u009eO\u0000\u0580\u057f"+
		"\u0001\u0000\u0000\u0000\u0580\u0581\u0001\u0000\u0000\u0000\u0581\u0582"+
		"\u0001\u0000\u0000\u0000\u0582\u0587\u0003\u01a4\u00d2\u0000\u0583\u0585"+
		"\u0005}\u0000\u0000\u0584\u0586\u0003\u0168\u00b4\u0000\u0585\u0584\u0001"+
		"\u0000\u0000\u0000\u0585\u0586\u0001\u0000\u0000\u0000\u0586\u0588\u0001"+
		"\u0000\u0000\u0000\u0587\u0583\u0001\u0000\u0000\u0000\u0587\u0588\u0001"+
		"\u0000\u0000\u0000\u0588\u058b\u0001\u0000\u0000\u0000\u0589\u058a\u0005"+
		"o\u0000\u0000\u058a\u058c\u0003\u013c\u009e\u0000\u058b\u0589\u0001\u0000"+
		"\u0000\u0000\u058b\u058c\u0001\u0000\u0000\u0000\u058c\u0089\u0001\u0000"+
		"\u0000\u0000\u058d\u058e\u0005\u0003\u0000\u0000\u058e\u058f\u0003\u01a4"+
		"\u00d2\u0000\u058f\u0590\u0005}\u0000\u0000\u0590\u0593\u0003\u013c\u009e"+
		"\u0000\u0591\u0592\u0005o\u0000\u0000\u0592\u0594\u0003\u008cF\u0000\u0593"+
		"\u0591\u0001\u0000\u0000\u0000\u0593\u0594\u0001\u0000\u0000\u0000\u0594"+
		"\u059e\u0001\u0000\u0000\u0000\u0595\u0596\u0003\u01a4\u00d2\u0000\u0596"+
		"\u0597\u0005}\u0000\u0000\u0597\u0598\u0005\u0003\u0000\u0000\u0598\u059b"+
		"\u0003\u013c\u009e\u0000\u0599\u059a\u0005o\u0000\u0000\u059a\u059c\u0003"+
		"\u008cF\u0000\u059b\u0599\u0001\u0000\u0000\u0000\u059b\u059c\u0001\u0000"+
		"\u0000\u0000\u059c\u059e\u0001\u0000\u0000\u0000\u059d\u058d\u0001\u0000"+
		"\u0000\u0000\u059d\u0595\u0001\u0000\u0000\u0000\u059e\u008b\u0001\u0000"+
		"\u0000\u0000\u059f\u05a0\u0003\u00aaU\u0000\u05a0\u008d\u0001\u0000\u0000"+
		"\u0000\u05a1\u05aa\u0005%\u0000\u0000\u05a2\u05a7\u0003\u0090H\u0000\u05a3"+
		"\u05a4\u0005{\u0000\u0000\u05a4\u05a6\u0003\u0090H\u0000\u05a5\u05a3\u0001"+
		"\u0000\u0000\u0000\u05a6\u05a9\u0001\u0000\u0000\u0000\u05a7\u05a5\u0001"+
		"\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u05ab\u0001"+
		"\u0000\u0000\u0000\u05a9\u05a7\u0001\u0000\u0000\u0000\u05aa\u05a2\u0001"+
		"\u0000\u0000\u0000\u05aa\u05ab\u0001\u0000\u0000\u0000\u05ab\u05ad\u0001"+
		"\u0000\u0000\u0000\u05ac\u05ae\u0005{\u0000\u0000\u05ad\u05ac\u0001\u0000"+
		"\u0000\u0000\u05ad\u05ae\u0001\u0000\u0000\u0000\u05ae\u008f\u0001\u0000"+
		"\u0000\u0000\u05af\u05b3\u0003\u0092I\u0000\u05b0\u05b3\u0003\u0094J\u0000"+
		"\u05b1\u05b3\u0003\u0096K\u0000\u05b2\u05af\u0001\u0000\u0000\u0000\u05b2"+
		"\u05b0\u0001\u0000\u0000\u0000\u05b2\u05b1\u0001\u0000\u0000\u0000\u05b3"+
		"\u0091\u0001\u0000\u0000\u0000\u05b4\u05b5\u0003\u0178\u00bc\u0000\u05b5"+
		"\u05b6\u0005}\u0000\u0000\u05b6\u05b7\u0003\u0176\u00bb\u0000\u05b7\u0093"+
		"\u0001\u0000\u0000\u0000\u05b8\u05ba\u0003\u0098L\u0000\u05b9\u05b8\u0001"+
		"\u0000\u0000\u0000\u05b9\u05ba\u0001\u0000\u0000\u0000\u05ba\u05bb\u0001"+
		"\u0000\u0000\u0000\u05bb\u05bc\u0003\u013c\u009e\u0000\u05bc\u05be\u0005"+
		"}\u0000\u0000\u05bd\u05bf\u0005\u0003\u0000\u0000\u05be\u05bd\u0001\u0000"+
		"\u0000\u0000\u05be\u05bf\u0001\u0000\u0000\u0000\u05bf\u05c1\u0001\u0000"+
		"\u0000\u0000\u05c0\u05c2\u0003\u0168\u00b4\u0000\u05c1\u05c0\u0001\u0000"+
		"\u0000\u0000\u05c1\u05c2\u0001\u0000\u0000\u0000\u05c2\u0095\u0001\u0000"+
		"\u0000\u0000\u05c3\u05c5\u0003\u0098L\u0000\u05c4\u05c3\u0001\u0000\u0000"+
		"\u0000\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5\u05c6\u0001\u0000\u0000"+
		"\u0000\u05c6\u05c7\u0003\u019a\u00cd\u0000\u05c7\u05c8\u0005o\u0000\u0000"+
		"\u05c8\u05c9\u0003\u013c\u009e\u0000\u05c9\u0097\u0001\u0000\u0000\u0000"+
		"\u05ca\u05cb\u0005\u000b\u0000\u0000\u05cb\u05cc\u0003\u0082A\u0000\u05cc"+
		"\u0099\u0001\u0000\u0000\u0000\u05cd\u05cf\u0003\u009eO\u0000\u05ce\u05cd"+
		"\u0001\u0000\u0000\u0000\u05cf\u05d2\u0001\u0000\u0000\u0000\u05d0\u05ce"+
		"\u0001\u0000\u0000\u0000\u05d0\u05d1\u0001\u0000\u0000\u0000\u05d1\u05dd"+
		"\u0001\u0000\u0000\u0000\u05d2\u05d0\u0001\u0000\u0000\u0000\u05d3\u05de"+
		"\u00034\u001a\u0000\u05d4\u05de\u0003\n\u0005\u0000\u05d5\u05d7\u0003"+
		"\u01a2\u00d1\u0000\u05d6\u05d5\u0001\u0000\u0000\u0000\u05d6\u05d7\u0001"+
		"\u0000\u0000\u0000\u05d7\u05db\u0001\u0000\u0000\u0000\u05d8\u05dc\u0003"+
		"R)\u0000\u05d9\u05dc\u0003p8\u0000\u05da\u05dc\u0003>\u001f\u0000\u05db"+
		"\u05d8\u0001\u0000\u0000\u0000\u05db\u05d9\u0001\u0000\u0000\u0000\u05db"+
		"\u05da\u0001\u0000\u0000\u0000\u05dc\u05de\u0001\u0000\u0000\u0000\u05dd"+
		"\u05d3\u0001\u0000\u0000\u0000\u05dd\u05d4\u0001\u0000\u0000\u0000\u05dd"+
		"\u05d6\u0001\u0000\u0000\u0000\u05de\u009b\u0001\u0000\u0000\u0000\u05df"+
		"\u05e0\u0005\u0081\u0000\u0000\u05e0\u05e1\u0005`\u0000\u0000\u05e1\u05e2"+
		"\u0005\u0086\u0000\u0000\u05e2\u05e3\u0003\u00a0P\u0000\u05e3\u05e4\u0005"+
		"\u0087\u0000\u0000\u05e4\u009d\u0001\u0000\u0000\u0000\u05e5\u05e6\u0005"+
		"\u0081\u0000\u0000\u05e6\u05e7\u0005\u0086\u0000\u0000\u05e7\u05e8\u0003"+
		"\u00a0P\u0000\u05e8\u05e9\u0005\u0087\u0000\u0000\u05e9\u009f\u0001\u0000"+
		"\u0000\u0000\u05ea\u05ec\u0003\u017a\u00bd\u0000\u05eb\u05ed\u0003\u00a2"+
		"Q\u0000\u05ec\u05eb\u0001\u0000\u0000\u0000\u05ec\u05ed\u0001\u0000\u0000"+
		"\u0000\u05ed\u05f7\u0001\u0000\u0000\u0000\u05ee\u05ef\u0007\u0002\u0000"+
		"\u0000\u05ef\u05f0\u0005\u0088\u0000\u0000\u05f0\u05f2\u0003\u017a\u00bd"+
		"\u0000\u05f1\u05f3\u0003\u00a2Q\u0000\u05f2\u05f1\u0001\u0000\u0000\u0000"+
		"\u05f2\u05f3\u0001\u0000\u0000\u0000\u05f3\u05f4\u0001\u0000\u0000\u0000"+
		"\u05f4\u05f5\u0005\u0089\u0000\u0000\u05f5\u05f7\u0001\u0000\u0000\u0000"+
		"\u05f6\u05ea\u0001\u0000\u0000\u0000\u05f6\u05ee\u0001\u0000\u0000\u0000"+
		"\u05f7\u00a1\u0001\u0000\u0000\u0000\u05f8\u05fc\u0003\u0004\u0002\u0000"+
		"\u05f9\u05fa\u0005o\u0000\u0000\u05fa\u05fc\u0003\u00aaU\u0000\u05fb\u05f8"+
		"\u0001\u0000\u0000\u0000\u05fb\u05f9\u0001\u0000\u0000\u0000\u05fc\u00a3"+
		"\u0001\u0000\u0000\u0000\u05fd\u0603\u0005|\u0000\u0000\u05fe\u0603\u0003"+
		"\u00a6S\u0000\u05ff\u0603\u0003\u00a8T\u0000\u0600\u0603\u0003\n\u0005"+
		"\u0000\u0601\u0603\u0003$\u0012\u0000\u0602\u05fd\u0001\u0000\u0000\u0000"+
		"\u0602\u05fe\u0001\u0000\u0000\u0000\u0602\u05ff\u0001\u0000\u0000\u0000"+
		"\u0602\u0600\u0001\u0000\u0000\u0000\u0602\u0601\u0001\u0000\u0000\u0000"+
		"\u0603\u00a5\u0001\u0000\u0000\u0000\u0604\u0606\u0003\u009eO\u0000\u0605"+
		"\u0604\u0001\u0000\u0000\u0000\u0606\u0609\u0001\u0000\u0000\u0000\u0607"+
		"\u0605\u0001\u0000\u0000\u0000\u0607\u0608\u0001\u0000\u0000\u0000\u0608"+
		"\u060a\u0001\u0000\u0000\u0000\u0609\u0607\u0001\u0000\u0000\u0000\u060a"+
		"\u060b\u0005\u000f\u0000\u0000\u060b\u0611\u0003\u010e\u0087\u0000\u060c"+
		"\u060d\u0005}\u0000\u0000\u060d\u0612\u0003\u013c\u009e\u0000\u060e\u060f"+
		"\u0005~\u0000\u0000\u060f\u0610\u0005}\u0000\u0000\u0610\u0612\u0003\u013c"+
		"\u009e\u0000\u0611\u060c\u0001\u0000\u0000\u0000\u0611\u060e\u0001\u0000"+
		"\u0000\u0000\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u0619\u0001\u0000"+
		"\u0000\u0000\u0613\u0614\u0005o\u0000\u0000\u0614\u0617\u0003\u00aaU\u0000"+
		"\u0615\u0616\u0005\u0006\u0000\u0000\u0616\u0618\u0003\u00ba]\u0000\u0617"+
		"\u0615\u0001\u0000\u0000\u0000\u0617\u0618\u0001\u0000\u0000\u0000\u0618"+
		"\u061a\u0001\u0000\u0000\u0000\u0619\u0613\u0001\u0000\u0000\u0000\u0619"+
		"\u061a\u0001\u0000\u0000\u0000\u061a\u061b\u0001\u0000\u0000\u0000\u061b"+
		"\u061c\u0005|\u0000\u0000\u061c\u00a7\u0001\u0000\u0000\u0000\u061d\u061e"+
		"\u0003\u00aaU\u0000\u061e\u061f\u0005|\u0000\u0000\u061f\u0625\u0001\u0000"+
		"\u0000\u0000\u0620\u0622\u0003\u00b0X\u0000\u0621\u0623\u0005|\u0000\u0000"+
		"\u0622\u0621\u0001\u0000\u0000\u0000\u0622\u0623\u0001\u0000\u0000\u0000"+
		"\u0623\u0625\u0001\u0000\u0000\u0000\u0624\u061d\u0001\u0000\u0000\u0000"+
		"\u0624\u0620\u0001\u0000\u0000\u0000\u0625\u00a9\u0001\u0000\u0000\u0000"+
		"\u0626\u0628\u0006U\uffff\uffff\u0000\u0627\u0629\u0003\u009eO\u0000\u0628"+
		"\u0627\u0001\u0000\u0000\u0000\u0629\u062a\u0001\u0000\u0000\u0000\u062a"+
		"\u0628\u0001\u0000\u0000\u0000\u062a\u062b\u0001\u0000\u0000\u0000\u062b"+
		"\u062c\u0001\u0000\u0000\u0000\u062c\u062d\u0003\u00aaU1\u062d\u068e\u0001"+
		"\u0000\u0000\u0000\u062e\u068e\u0003\u00b6[\u0000\u062f\u068e\u0003\u00b8"+
		"\\\u0000\u0630\u0632\u0007\u0004\u0000\u0000\u0631\u0633\u0005\u0014\u0000"+
		"\u0000\u0632\u0631\u0001\u0000\u0000\u0000\u0632\u0633\u0001\u0000\u0000"+
		"\u0000\u0633\u0634\u0001\u0000\u0000\u0000\u0634\u068e\u0003\u00aaU&\u0635"+
		"\u0636\u0005b\u0000\u0000\u0636\u0637\u0005;\u0000\u0000\u0637\u0638\u0007"+
		"\u0005\u0000\u0000\u0638\u068e\u0003\u00aaU%\u0639\u063a\u0005\\\u0000"+
		"\u0000\u063a\u068e\u0003\u00aaU$\u063b\u063c\u0007\u0006\u0000\u0000\u063c"+
		"\u068e\u0003\u00aaU#\u063d\u063f\u0005x\u0000\u0000\u063e\u0640\u0003"+
		"\u00aaU\u0000\u063f\u063e\u0001\u0000\u0000\u0000\u063f\u0640\u0001\u0000"+
		"\u0000\u0000\u0640\u068e\u0001\u0000\u0000\u0000\u0641\u0642\u0005z\u0000"+
		"\u0000\u0642\u068e\u0003\u00aaU\u0015\u0643\u0644\u0003\u010e\u0087\u0000"+
		"\u0644\u0645\u0005o\u0000\u0000\u0645\u0646\u0003\u00aaU\u0012\u0646\u068e"+
		"\u0001\u0000\u0000\u0000\u0647\u0648\u0005v\u0000\u0000\u0648\u0649\u0005"+
		"o\u0000\u0000\u0649\u068e\u0003\u00aaU\u0011\u064a\u064c\u0005\u0004\u0000"+
		"\u0000\u064b\u064d\u0005Y\u0000\u0000\u064c\u064b\u0001\u0000\u0000\u0000"+
		"\u064c\u064d\u0001\u0000\u0000\u0000\u064d\u064f\u0001\u0000\u0000\u0000"+
		"\u064e\u0650\u0003\u00aaU\u0000\u064f\u064e\u0001\u0000\u0000\u0000\u064f"+
		"\u0650\u0001\u0000\u0000\u0000\u0650\u068e\u0001\u0000\u0000\u0000\u0651"+
		"\u0653\u0005\u0002\u0000\u0000\u0652\u0654\u0005Y\u0000\u0000\u0653\u0652"+
		"\u0001\u0000\u0000\u0000\u0653\u0654\u0001\u0000\u0000\u0000\u0654\u0656"+
		"\u0001\u0000\u0000\u0000\u0655\u0657\u0003\u00aaU\u0000\u0656\u0655\u0001"+
		"\u0000\u0000\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u068e\u0001"+
		"\u0000\u0000\u0000\u0658\u065a\u0005\u0017\u0000\u0000\u0659\u065b\u0003"+
		"\u00aaU\u0000\u065a\u0659\u0001\u0000\u0000\u0000\u065a\u065b\u0001\u0000"+
		"\u0000\u0000\u065b\u068e\u0001\u0000\u0000\u0000\u065c\u065d\u0005,\u0000"+
		"\u0000\u065d\u068e\u0003\u00aaU\f\u065e\u065f\u0005.\u0000\u0000\u065f"+
		"\u0661\u0005/\u0000\u0000\u0660\u0662\u0003\u00aaU\u0000\u0661\u0660\u0001"+
		"\u0000\u0000\u0000\u0661\u0662\u0001\u0000\u0000\u0000\u0662\u068e\u0001"+
		"\u0000\u0000\u0000\u0663\u0665\u00057\u0000\u0000\u0664\u0666\u0003\u00aa"+
		"U\u0000\u0665\u0664\u0001\u0000\u0000\u0000\u0665\u0666\u0001\u0000\u0000"+
		"\u0000\u0666\u068e\u0001\u0000\u0000\u0000\u0667\u066b\u0005\u0088\u0000"+
		"\u0000\u0668\u066a\u0003\u009cN\u0000\u0669\u0668\u0001\u0000\u0000\u0000"+
		"\u066a\u066d\u0001\u0000\u0000\u0000\u066b\u0669\u0001\u0000\u0000\u0000"+
		"\u066b\u066c\u0001\u0000\u0000\u0000\u066c\u066e\u0001\u0000\u0000\u0000"+
		"\u066d\u066b\u0001\u0000\u0000\u0000\u066e\u066f\u0003\u00aaU\u0000\u066f"+
		"\u0670\u0005\u0089\u0000\u0000\u0670\u068e\u0001\u0000\u0000\u0000\u0671"+
		"\u0675\u0005\u0086\u0000\u0000\u0672\u0674\u0003\u009cN\u0000\u0673\u0672"+
		"\u0001\u0000\u0000\u0000\u0674\u0677\u0001\u0000\u0000\u0000\u0675\u0673"+
		"\u0001\u0000\u0000\u0000\u0675\u0676\u0001\u0000\u0000\u0000\u0676\u0679"+
		"\u0001\u0000\u0000\u0000\u0677\u0675\u0001\u0000\u0000\u0000\u0678\u067a"+
		"\u0003\u00c6c\u0000\u0679\u0678\u0001\u0000\u0000\u0000\u0679\u067a\u0001"+
		"\u0000\u0000\u0000\u067a\u067b\u0001\u0000\u0000\u0000\u067b\u068e\u0005"+
		"\u0087\u0000\u0000\u067c\u0680\u0005\u0088\u0000\u0000\u067d\u067f\u0003"+
		"\u009cN\u0000\u067e\u067d\u0001\u0000\u0000\u0000\u067f\u0682\u0001\u0000"+
		"\u0000\u0000\u0680\u067e\u0001\u0000\u0000\u0000\u0680\u0681\u0001\u0000"+
		"\u0000\u0000\u0681\u0684\u0001\u0000\u0000\u0000\u0682\u0680\u0001\u0000"+
		"\u0000\u0000\u0683\u0685\u0003\u00c8d\u0000\u0684\u0683\u0001\u0000\u0000"+
		"\u0000\u0684\u0685\u0001\u0000\u0000\u0000\u0685\u0686\u0001\u0000\u0000"+
		"\u0000\u0686\u068e\u0005\u0089\u0000\u0000\u0687\u068e\u0003\u00ccf\u0000"+
		"\u0688\u068e\u0003\u00dam\u0000\u0689\u068e\u0003\u00e8t\u0000\u068a\u068e"+
		"\u0003\u00b0X\u0000\u068b\u068e\u0003\u0100\u0080\u0000\u068c\u068e\u0003"+
		"\u0002\u0001\u0000\u068d\u0626\u0001\u0000\u0000\u0000\u068d\u062e\u0001"+
		"\u0000\u0000\u0000\u068d\u062f\u0001\u0000\u0000\u0000\u068d\u0630\u0001"+
		"\u0000\u0000\u0000\u068d\u0635\u0001\u0000\u0000\u0000\u068d\u0639\u0001"+
		"\u0000\u0000\u0000\u068d\u063b\u0001\u0000\u0000\u0000\u068d\u063d\u0001"+
		"\u0000\u0000\u0000\u068d\u0641\u0001\u0000\u0000\u0000\u068d\u0643\u0001"+
		"\u0000\u0000\u0000\u068d\u0647\u0001\u0000\u0000\u0000\u068d\u064a\u0001"+
		"\u0000\u0000\u0000\u068d\u0651\u0001\u0000\u0000\u0000\u068d\u0658\u0001"+
		"\u0000\u0000\u0000\u068d\u065c\u0001\u0000\u0000\u0000\u068d\u065e\u0001"+
		"\u0000\u0000\u0000\u068d\u0663\u0001\u0000\u0000\u0000\u068d\u0667\u0001"+
		"\u0000\u0000\u0000\u068d\u0671\u0001\u0000\u0000\u0000\u068d\u067c\u0001"+
		"\u0000\u0000\u0000\u068d\u0687\u0001\u0000\u0000\u0000\u068d\u0688\u0001"+
		"\u0000\u0000\u0000\u068d\u0689\u0001\u0000\u0000\u0000\u068d\u068a\u0001"+
		"\u0000\u0000\u0000\u068d\u068b\u0001\u0000\u0000\u0000\u068d\u068c\u0001"+
		"\u0000\u0000\u0000\u068e\u06f7\u0001\u0000\u0000\u0000\u068f\u0690\n!"+
		"\u0000\u0000\u0690\u0691\u0007\u0007\u0000\u0000\u0691\u06f6\u0003\u00aa"+
		"U\"\u0692\u0693\n \u0000\u0000\u0693\u0694\u0007\b\u0000\u0000\u0694\u06f6"+
		"\u0003\u00aaU!\u0695\u0698\n\u001f\u0000\u0000\u0696\u0699\u0003\u01b0"+
		"\u00d8\u0000\u0697\u0699\u0003\u01b2\u00d9\u0000\u0698\u0696\u0001\u0000"+
		"\u0000\u0000\u0698\u0697\u0001\u0000\u0000\u0000\u0699\u069a\u0001\u0000"+
		"\u0000\u0000\u069a\u069b\u0003\u00aaU \u069b\u06f6\u0001\u0000\u0000\u0000"+
		"\u069c\u069d\n\u001e\u0000\u0000\u069d\u069e\u0005b\u0000\u0000\u069e"+
		"\u06f6\u0003\u00aaU\u001f\u069f\u06a0\n\u001d\u0000\u0000\u06a0\u06a1"+
		"\u0005_\u0000\u0000\u06a1\u06f6\u0003\u00aaU\u001e\u06a2\u06a3\n\u001c"+
		"\u0000\u0000\u06a3\u06a4\u0005c\u0000\u0000\u06a4\u06f6\u0003\u00aaU\u001d"+
		"\u06a5\u06a6\n\u001b\u0000\u0000\u06a6\u06a7\u0003\u00acV\u0000\u06a7"+
		"\u06a8\u0003\u00aaU\u001c\u06a8\u06f6\u0001\u0000\u0000\u0000\u06a9\u06aa"+
		"\n\u001a\u0000\u0000\u06aa\u06ab\u0005d\u0000\u0000\u06ab\u06f6\u0003"+
		"\u00aaU\u001b\u06ac\u06ad\n\u0019\u0000\u0000\u06ad\u06ae\u0005e\u0000"+
		"\u0000\u06ae\u06f6\u0003\u00aaU\u001a\u06af\u06b0\n\u0018\u0000\u0000"+
		"\u06b0\u06b1\u0005y\u0000\u0000\u06b1\u06f6\u0003\u00aaU\u0019\u06b2\u06b3"+
		"\n\u0014\u0000\u0000\u06b3\u06b4\u0005z\u0000\u0000\u06b4\u06f6\u0003"+
		"\u00aaU\u0015\u06b5\u06b6\n\u0013\u0000\u0000\u06b6\u06b7\u0005o\u0000"+
		"\u0000\u06b7\u06f6\u0003\u00aaU\u0014\u06b8\u06b9\n\u0010\u0000\u0000"+
		"\u06b9\u06ba\u0003\u00aeW\u0000\u06ba\u06bb\u0003\u00aaU\u0011\u06bb\u06f6"+
		"\u0001\u0000\u0000\u0000\u06bc\u06bd\n.\u0000\u0000\u06bd\u06be\u0005"+
		"w\u0000\u0000\u06be\u06bf\u0005\u0011\u0000\u0000\u06bf\u06c3\u0005\u0084"+
		"\u0000\u0000\u06c0\u06c2\u0003\u009cN\u0000\u06c1\u06c0\u0001\u0000\u0000"+
		"\u0000\u06c2\u06c5\u0001\u0000\u0000\u0000\u06c3\u06c1\u0001\u0000\u0000"+
		"\u0000\u06c3\u06c4\u0001\u0000\u0000\u0000\u06c4\u06c7\u0001\u0000\u0000"+
		"\u0000\u06c5\u06c3\u0001\u0000\u0000\u0000\u06c6\u06c8\u0003\u0104\u0082"+
		"\u0000\u06c7\u06c6\u0001\u0000\u0000\u0000\u06c7\u06c8\u0001\u0000\u0000"+
		"\u0000\u06c8\u06c9\u0001\u0000\u0000\u0000\u06c9\u06f6\u0005\u0085\u0000"+
		"\u0000\u06ca\u06cb\n-\u0000\u0000\u06cb\u06cc\u0005w\u0000\u0000\u06cc"+
		"\u06cd\u0003\u0180\u00c0\u0000\u06cd\u06cf\u0005\u0088\u0000\u0000\u06ce"+
		"\u06d0\u0003\u00e6s\u0000\u06cf\u06ce\u0001\u0000\u0000\u0000\u06cf\u06d0"+
		"\u0001\u0000\u0000\u0000\u06d0\u06d1\u0001\u0000\u0000\u0000\u06d1\u06d2"+
		"\u0005\u0089\u0000\u0000\u06d2\u06f6\u0001\u0000\u0000\u0000\u06d3\u06d4"+
		"\n,\u0000\u0000\u06d4\u06d8\u0005w\u0000\u0000\u06d5\u06d9\u0003\u01a4"+
		"\u00d2\u0000\u06d6\u06d9\u0005\u0018\u0000\u0000\u06d7\u06d9\u0005\u001a"+
		"\u0000\u0000\u06d8\u06d5\u0001\u0000\u0000\u0000\u06d8\u06d6\u0001\u0000"+
		"\u0000\u0000\u06d8\u06d7\u0001\u0000\u0000\u0000\u06d9\u06f6\u0001\u0000"+
		"\u0000\u0000\u06da\u06db\n+\u0000\u0000\u06db\u06dc\u0005w\u0000\u0000"+
		"\u06dc\u06f6\u0003\u00cae\u0000\u06dd\u06de\n*\u0000\u0000\u06de\u06df"+
		"\u0005w\u0000\u0000\u06df\u06f6\u0005(\u0000\u0000\u06e0\u06e1\n)\u0000"+
		"\u0000\u06e1\u06e3\u0005\u0088\u0000\u0000\u06e2\u06e4\u0003\u00e6s\u0000"+
		"\u06e3\u06e2\u0001\u0000\u0000\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000"+
		"\u06e4\u06e5\u0001\u0000\u0000\u0000\u06e5\u06f6\u0005\u0089\u0000\u0000"+
		"\u06e6\u06e7\n(\u0000\u0000\u06e7\u06e8\u0005\u0086\u0000\u0000\u06e8"+
		"\u06e9\u0003\u00aaU\u0000\u06e9\u06ea\u0005\u0087\u0000\u0000\u06ea\u06f6"+
		"\u0001\u0000\u0000\u0000\u06eb\u06ec\n\'\u0000\u0000\u06ec\u06f6\u0005"+
		"\u0083\u0000\u0000\u06ed\u06ee\n\"\u0000\u0000\u06ee\u06ef\u0005\u0001"+
		"\u0000\u0000\u06ef\u06f6\u0003\u013e\u009f\u0000\u06f0\u06f1\n\u0017\u0000"+
		"\u0000\u06f1\u06f3\u0005x\u0000\u0000\u06f2\u06f4\u0003\u00aaU\u0000\u06f3"+
		"\u06f2\u0001\u0000\u0000\u0000\u06f3\u06f4\u0001\u0000\u0000\u0000\u06f4"+
		"\u06f6\u0001\u0000\u0000\u0000\u06f5\u068f\u0001\u0000\u0000\u0000\u06f5"+
		"\u0692\u0001\u0000\u0000\u0000\u06f5\u0695\u0001\u0000\u0000\u0000\u06f5"+
		"\u069c\u0001\u0000\u0000\u0000\u06f5\u069f\u0001\u0000\u0000\u0000\u06f5"+
		"\u06a2\u0001\u0000\u0000\u0000\u06f5\u06a5\u0001\u0000\u0000\u0000\u06f5"+
		"\u06a9\u0001\u0000\u0000\u0000\u06f5\u06ac\u0001\u0000\u0000\u0000\u06f5"+
		"\u06af\u0001\u0000\u0000\u0000\u06f5\u06b2\u0001\u0000\u0000\u0000\u06f5"+
		"\u06b5\u0001\u0000\u0000\u0000\u06f5\u06b8\u0001\u0000\u0000\u0000\u06f5"+
		"\u06bc\u0001\u0000\u0000\u0000\u06f5\u06ca\u0001\u0000\u0000\u0000\u06f5"+
		"\u06d3\u0001\u0000\u0000\u0000\u06f5\u06da\u0001\u0000\u0000\u0000\u06f5"+
		"\u06dd\u0001\u0000\u0000\u0000\u06f5\u06e0\u0001\u0000\u0000\u0000\u06f5"+
		"\u06e6\u0001\u0000\u0000\u0000\u06f5\u06eb\u0001\u0000\u0000\u0000\u06f5"+
		"\u06ed\u0001\u0000\u0000\u0000\u06f5\u06f0\u0001\u0000\u0000\u0000\u06f6"+
		"\u06f9\u0001\u0000\u0000\u0000\u06f7\u06f5\u0001\u0000\u0000\u0000\u06f7"+
		"\u06f8\u0001\u0000\u0000\u0000\u06f8\u00ab\u0001\u0000\u0000\u0000\u06f9"+
		"\u06f7\u0001\u0000\u0000\u0000\u06fa\u0702\u0005p\u0000\u0000\u06fb\u0702"+
		"\u0005q\u0000\u0000\u06fc\u0702\u0005r\u0000\u0000\u06fd\u0702\u0005s"+
		"\u0000\u0000\u06fe\u06ff\u0005r\u0000\u0000\u06ff\u0702\u0005o\u0000\u0000"+
		"\u0700\u0702\u0005t\u0000\u0000\u0701\u06fa\u0001\u0000\u0000\u0000\u0701"+
		"\u06fb\u0001\u0000\u0000\u0000\u0701\u06fc\u0001\u0000\u0000\u0000\u0701"+
		"\u06fd\u0001\u0000\u0000\u0000\u0701\u06fe\u0001\u0000\u0000\u0000\u0701"+
		"\u0700\u0001\u0000\u0000\u0000\u0702\u00ad\u0001\u0000\u0000\u0000\u0703"+
		"\u0710\u0005f\u0000\u0000\u0704\u0710\u0005g\u0000\u0000\u0705\u0710\u0005"+
		"h\u0000\u0000\u0706\u0710\u0005i\u0000\u0000\u0707\u0710\u0005j\u0000"+
		"\u0000\u0708\u0710\u0005l\u0000\u0000\u0709\u0710\u0005m\u0000\u0000\u070a"+
		"\u0710\u0005k\u0000\u0000\u070b\u0710\u0005n\u0000\u0000\u070c\u070d\u0005"+
		"r\u0000\u0000\u070d\u070e\u0005r\u0000\u0000\u070e\u0710\u0005o\u0000"+
		"\u0000\u070f\u0703\u0001\u0000\u0000\u0000\u070f\u0704\u0001\u0000\u0000"+
		"\u0000\u070f\u0705\u0001\u0000\u0000\u0000\u070f\u0706\u0001\u0000\u0000"+
		"\u0000\u070f\u0707\u0001\u0000\u0000\u0000\u070f\u0708\u0001\u0000\u0000"+
		"\u0000\u070f\u0709\u0001\u0000\u0000\u0000\u070f\u070a\u0001\u0000\u0000"+
		"\u0000\u070f\u070b\u0001\u0000\u0000\u0000\u070f\u070c\u0001\u0000\u0000"+
		"\u0000\u0710\u00af\u0001\u0000\u0000\u0000\u0711\u0713\u0003\u009eO\u0000"+
		"\u0712\u0711\u0001\u0000\u0000\u0000\u0713\u0714\u0001\u0000\u0000\u0000"+
		"\u0714\u0712\u0001\u0000\u0000\u0000\u0714\u0715\u0001\u0000\u0000\u0000"+
		"\u0715\u0716\u0001\u0000\u0000\u0000\u0716\u0717\u0003\u00b0X\u0000\u0717"+
		"\u0724\u0001\u0000\u0000\u0000\u0718\u0724\u0003\u00ba]\u0000\u0719\u0724"+
		"\u0003\u00be_\u0000\u071a\u0724\u0003\u00b2Y\u0000\u071b\u0724\u0003\u00b4"+
		"Z\u0000\u071c\u0724\u0003\u00c0`\u0000\u071d\u0724\u0003\u00eew\u0000"+
		"\u071e\u0724\u0003\u00fc~\u0000\u071f\u0724\u0003\u00fe\u007f\u0000\u0720"+
		"\u0724\u0003\u0102\u0081\u0000\u0721\u0724\u0003\u00c2a\u0000\u0722\u0724"+
		"\u0003\u00c4b\u0000\u0723\u0712\u0001\u0000\u0000\u0000\u0723\u0718\u0001"+
		"\u0000\u0000\u0000\u0723\u0719\u0001\u0000\u0000\u0000\u0723\u071a\u0001"+
		"\u0000\u0000\u0000\u0723\u071b\u0001\u0000\u0000\u0000\u0723\u071c\u0001"+
		"\u0000\u0000\u0000\u0723\u071d\u0001\u0000\u0000\u0000\u0723\u071e\u0001"+
		"\u0000\u0000\u0000\u0723\u071f\u0001\u0000\u0000\u0000\u0723\u0720\u0001"+
		"\u0000\u0000\u0000\u0723\u0721\u0001\u0000\u0000\u0000\u0723\u0722\u0001"+
		"\u0000\u0000\u0000\u0724\u00b1\u0001\u0000\u0000\u0000\u0725\u0727\u0005"+
		"?\u0000\u0000\u0726\u0728\u0005\u0013\u0000\u0000\u0727\u0726\u0001\u0000"+
		"\u0000\u0000\u0727\u0728\u0001\u0000\u0000\u0000\u0728\u0729\u0001\u0000"+
		"\u0000\u0000\u0729\u072a\u0003\u00ba]\u0000\u072a\u00b3\u0001\u0000\u0000"+
		"\u0000\u072b\u072c\u0005\'\u0000\u0000\u072c\u072e\u0005?\u0000\u0000"+
		"\u072d\u072f\u0005\u0013\u0000\u0000\u072e\u072d\u0001\u0000\u0000\u0000"+
		"\u072e\u072f\u0001\u0000\u0000\u0000\u072f\u0730\u0001\u0000\u0000\u0000"+
		"\u0730\u0731\u0003\u00ba]\u0000\u0731\u00b5\u0001\u0000\u0000\u0000\u0732"+
		"\u0734\u0005K\u0000\u0000\u0733\u0735\u0003\u01a4\u00d2\u0000\u0734\u0733"+
		"\u0001\u0000\u0000\u0000\u0734\u0735\u0001\u0000\u0000\u0000\u0735\u075e"+
		"\u0001\u0000\u0000\u0000\u0736\u0738\u0005L\u0000\u0000\u0737\u0739\u0003"+
		"\u01a4\u00d2\u0000\u0738\u0737\u0001\u0000\u0000\u0000\u0738\u0739\u0001"+
		"\u0000\u0000\u0000\u0739\u075e\u0001\u0000\u0000\u0000\u073a\u073c\u0005"+
		"M\u0000\u0000\u073b\u073d\u0003\u01a4\u00d2\u0000\u073c\u073b\u0001\u0000"+
		"\u0000\u0000\u073c\u073d\u0001\u0000\u0000\u0000\u073d\u075e\u0001\u0000"+
		"\u0000\u0000\u073e\u0740\u0005N\u0000\u0000\u073f\u0741\u0003\u01a4\u00d2"+
		"\u0000\u0740\u073f\u0001\u0000\u0000\u0000\u0740\u0741\u0001\u0000\u0000"+
		"\u0000\u0741\u075e\u0001\u0000\u0000\u0000\u0742\u0744\u0005O\u0000\u0000"+
		"\u0743\u0745\u0003\u01a4\u00d2\u0000\u0744\u0743\u0001\u0000\u0000\u0000"+
		"\u0744\u0745\u0001\u0000\u0000\u0000\u0745\u075e\u0001\u0000\u0000\u0000"+
		"\u0746\u0748\u0005P\u0000\u0000\u0747\u0749\u0003\u01a4\u00d2\u0000\u0748"+
		"\u0747\u0001\u0000\u0000\u0000\u0748\u0749\u0001\u0000\u0000\u0000\u0749"+
		"\u075e\u0001\u0000\u0000\u0000\u074a\u074c\u0005Q\u0000\u0000\u074b\u074d"+
		"\u0003\u01a4\u00d2\u0000\u074c\u074b\u0001\u0000\u0000\u0000\u074c\u074d"+
		"\u0001\u0000\u0000\u0000\u074d\u075e\u0001\u0000\u0000\u0000\u074e\u0750"+
		"\u0005R\u0000\u0000\u074f\u0751\u0003\u01a4\u00d2\u0000\u0750\u074f\u0001"+
		"\u0000\u0000\u0000\u0750\u0751\u0001\u0000\u0000\u0000\u0751\u075e\u0001"+
		"\u0000\u0000\u0000\u0752\u0754\u0005S\u0000\u0000\u0753\u0755\u0003\u01a4"+
		"\u00d2\u0000\u0754\u0753\u0001\u0000\u0000\u0000\u0754\u0755\u0001\u0000"+
		"\u0000\u0000\u0755\u075e\u0001\u0000\u0000\u0000\u0756\u0759\u0005X\u0000"+
		"\u0000\u0757\u0758\u0005v\u0000\u0000\u0758\u075a\u0003\u01a4\u00d2\u0000"+
		"\u0759\u0757\u0001\u0000\u0000\u0000\u0759\u075a\u0001\u0000\u0000\u0000"+
		"\u075a\u075e\u0001\u0000\u0000\u0000\u075b\u075e\u0005\u001f\u0000\u0000"+
		"\u075c\u075e\u0005\t\u0000\u0000\u075d\u0732\u0001\u0000\u0000\u0000\u075d"+
		"\u0736\u0001\u0000\u0000\u0000\u075d\u073a\u0001\u0000\u0000\u0000\u075d"+
		"\u073e\u0001\u0000\u0000\u0000\u075d\u0742\u0001\u0000\u0000\u0000\u075d"+
		"\u0746\u0001\u0000\u0000\u0000\u075d\u074a\u0001\u0000\u0000\u0000\u075d"+
		"\u074e\u0001\u0000\u0000\u0000\u075d\u0752\u0001\u0000\u0000\u0000\u075d"+
		"\u0756\u0001\u0000\u0000\u0000\u075d\u075b\u0001\u0000\u0000\u0000\u075d"+
		"\u075c\u0001\u0000\u0000\u0000\u075e\u00b7\u0001\u0000\u0000\u0000\u075f"+
		"\u0762\u0003\u017e\u00bf\u0000\u0760\u0762\u0003\u0194\u00ca\u0000\u0761"+
		"\u075f\u0001\u0000\u0000\u0000\u0761\u0760\u0001\u0000\u0000\u0000\u0762"+
		"\u00b9\u0001\u0000\u0000\u0000\u0763\u0767\u0005\u0084\u0000\u0000\u0764"+
		"\u0766\u0003\u009cN\u0000\u0765\u0764\u0001\u0000\u0000\u0000\u0766\u0769"+
		"\u0001\u0000\u0000\u0000\u0767\u0765\u0001\u0000\u0000\u0000\u0767\u0768"+
		"\u0001\u0000\u0000\u0000\u0768\u076b\u0001\u0000\u0000\u0000\u0769\u0767"+
		"\u0001\u0000\u0000\u0000\u076a\u076c\u0003\u00bc^\u0000\u076b\u076a\u0001"+
		"\u0000\u0000\u0000\u076b\u076c\u0001\u0000\u0000\u0000\u076c\u076d\u0001"+
		"\u0000\u0000\u0000\u076d\u076e\u0005\u0085\u0000\u0000\u076e\u00bb\u0001"+
		"\u0000\u0000\u0000\u076f\u0771\u0003\u00a4R\u0000\u0770\u076f\u0001\u0000"+
		"\u0000\u0000\u0771\u0772\u0001\u0000\u0000\u0000\u0772\u0770\u0001\u0000"+
		"\u0000\u0000\u0772\u0773\u0001\u0000\u0000\u0000\u0773\u0775\u0001\u0000"+
		"\u0000\u0000\u0774\u0776\u0003\u00aaU\u0000\u0775\u0774\u0001\u0000\u0000"+
		"\u0000\u0775\u0776\u0001\u0000\u0000\u0000\u0776\u0779\u0001\u0000\u0000"+
		"\u0000\u0777\u0779\u0003\u00aaU\u0000\u0778\u0770\u0001\u0000\u0000\u0000"+
		"\u0778\u0777\u0001\u0000\u0000\u0000\u0779\u00bd\u0001\u0000\u0000\u0000"+
		"\u077a\u077c\u0005\'\u0000\u0000\u077b\u077d\u0005\u0013\u0000\u0000\u077c"+
		"\u077b\u0001\u0000\u0000\u0000\u077c\u077d\u0001\u0000\u0000\u0000\u077d"+
		"\u077e\u0001\u0000\u0000\u0000\u077e\u077f\u0003\u00ba]\u0000\u077f\u00bf"+
		"\u0001\u0000\u0000\u0000\u0780\u0781\u0005!\u0000\u0000\u0781\u0782\u0003"+
		"\u00ba]\u0000\u0782\u00c1\u0001\u0000\u0000\u0000\u0783\u0784\u0005\u0003"+
		"\u0000\u0000\u0784\u0785\u0003\u00ba]\u0000\u0785\u00c3\u0001\u0000\u0000"+
		"\u0000\u0786\u0787\u00058\u0000\u0000\u0787\u0788\u0003\u00ba]\u0000\u0788"+
		"\u00c5\u0001\u0000\u0000\u0000\u0789\u078e\u0003\u00aaU\u0000\u078a\u078b"+
		"\u0005{\u0000\u0000\u078b\u078d\u0003\u00aaU\u0000\u078c\u078a\u0001\u0000"+
		"\u0000\u0000\u078d\u0790\u0001\u0000\u0000\u0000\u078e\u078c\u0001\u0000"+
		"\u0000\u0000\u078e\u078f\u0001\u0000\u0000\u0000\u078f\u0792\u0001\u0000"+
		"\u0000\u0000\u0790\u078e\u0001\u0000\u0000\u0000\u0791\u0793\u0005{\u0000"+
		"\u0000\u0792\u0791\u0001\u0000\u0000\u0000\u0792\u0793\u0001\u0000\u0000"+
		"\u0000\u0793\u0799\u0001\u0000\u0000\u0000\u0794\u0795\u0003\u00aaU\u0000"+
		"\u0795\u0796\u0005|\u0000\u0000\u0796\u0797\u0003\u00aaU\u0000\u0797\u0799"+
		"\u0001\u0000\u0000\u0000\u0798\u0789\u0001\u0000\u0000\u0000\u0798\u0794"+
		"\u0001\u0000\u0000\u0000\u0799\u00c7\u0001\u0000\u0000\u0000\u079a\u079b"+
		"\u0003\u00aaU\u0000\u079b\u079c\u0005{\u0000\u0000\u079c\u079e\u0001\u0000"+
		"\u0000\u0000\u079d\u079a\u0001\u0000\u0000\u0000\u079e\u079f\u0001\u0000"+
		"\u0000\u0000\u079f\u079d\u0001\u0000\u0000\u0000\u079f\u07a0\u0001\u0000"+
		"\u0000\u0000\u07a0\u07a2\u0001\u0000\u0000\u0000\u07a1\u07a3\u0003\u00aa"+
		"U\u0000\u07a2\u07a1\u0001\u0000\u0000\u0000\u07a2\u07a3\u0001\u0000\u0000"+
		"\u0000\u07a3\u00c9\u0001\u0000\u0000\u0000\u07a4\u07a5\u0005S\u0000\u0000"+
		"\u07a5\u00cb\u0001\u0000\u0000\u0000\u07a6\u07aa\u0003\u00ceg\u0000\u07a7"+
		"\u07aa\u0003\u00d6k\u0000\u07a8\u07aa\u0003\u00d8l\u0000\u07a9\u07a6\u0001"+
		"\u0000\u0000\u0000\u07a9\u07a7\u0001\u0000\u0000\u0000\u07a9\u07a8\u0001"+
		"\u0000\u0000\u0000\u07aa\u00cd\u0001\u0000\u0000\u0000\u07ab\u07ae\u0003"+
		"\u017e\u00bf\u0000\u07ac\u07ae\u0003\u0194\u00ca\u0000\u07ad\u07ab\u0001"+
		"\u0000\u0000\u0000\u07ad\u07ac\u0001\u0000\u0000\u0000\u07ae\u07af\u0001"+
		"\u0000\u0000\u0000\u07af\u07b3\u0005\u0084\u0000\u0000\u07b0\u07b2\u0003"+
		"\u009cN\u0000\u07b1\u07b0\u0001\u0000\u0000\u0000\u07b2\u07b5\u0001\u0000"+
		"\u0000\u0000\u07b3\u07b1\u0001\u0000\u0000\u0000\u07b3\u07b4\u0001\u0000"+
		"\u0000\u0000\u07b4\u07b8\u0001\u0000\u0000\u0000\u07b5\u07b3\u0001\u0000"+
		"\u0000\u0000\u07b6\u07b9\u0003\u00d0h\u0000\u07b7\u07b9\u0003\u00d4j\u0000"+
		"\u07b8\u07b6\u0001\u0000\u0000\u0000\u07b8\u07b7\u0001\u0000\u0000\u0000"+
		"\u07b8\u07b9\u0001\u0000\u0000\u0000\u07b9\u07ba\u0001\u0000\u0000\u0000"+
		"\u07ba\u07bb\u0005\u0085\u0000\u0000\u07bb\u00cf\u0001\u0000\u0000\u0000"+
		"\u07bc\u07c1\u0003\u00d2i\u0000\u07bd\u07be\u0005{\u0000\u0000\u07be\u07c0"+
		"\u0003\u00d2i\u0000\u07bf\u07bd\u0001\u0000\u0000\u0000\u07c0\u07c3\u0001"+
		"\u0000\u0000\u0000\u07c1\u07bf\u0001\u0000\u0000\u0000\u07c1\u07c2\u0001"+
		"\u0000\u0000\u0000\u07c2\u07c9\u0001\u0000\u0000\u0000\u07c3\u07c1\u0001"+
		"\u0000\u0000\u0000\u07c4\u07c5\u0005{\u0000\u0000\u07c5\u07ca\u0003\u00d4"+
		"j\u0000\u07c6\u07c8\u0005{\u0000\u0000\u07c7\u07c6\u0001\u0000\u0000\u0000"+
		"\u07c7\u07c8\u0001\u0000\u0000\u0000\u07c8\u07ca\u0001\u0000\u0000\u0000"+
		"\u07c9\u07c4\u0001\u0000\u0000\u0000\u07c9\u07c7\u0001\u0000\u0000\u0000"+
		"\u07ca\u00d1\u0001\u0000\u0000\u0000\u07cb\u07cd\u0003\u009eO\u0000\u07cc"+
		"\u07cb\u0001\u0000\u0000\u0000\u07cd\u07d0\u0001\u0000\u0000\u0000\u07ce"+
		"\u07cc\u0001\u0000\u0000\u0000\u07ce\u07cf\u0001\u0000\u0000\u0000\u07cf"+
		"\u07d9\u0001\u0000\u0000\u0000\u07d0\u07ce\u0001\u0000\u0000\u0000\u07d1"+
		"\u07da\u0003\u01a4\u00d2\u0000\u07d2\u07d5\u0003\u01a4\u00d2\u0000\u07d3"+
		"\u07d5\u0003\u00cae\u0000\u07d4\u07d2\u0001\u0000\u0000\u0000\u07d4\u07d3"+
		"\u0001\u0000\u0000\u0000\u07d5\u07d6\u0001\u0000\u0000\u0000\u07d6\u07d7"+
		"\u0005}\u0000\u0000\u07d7\u07d8\u0003\u00aaU\u0000\u07d8\u07da\u0001\u0000"+
		"\u0000\u0000\u07d9\u07d1\u0001\u0000\u0000\u0000\u07d9\u07d4\u0001\u0000"+
		"\u0000\u0000\u07da\u00d3\u0001\u0000\u0000\u0000\u07db\u07dd\u0005x\u0000"+
		"\u0000\u07dc\u07de\u0003\u00aaU\u0000\u07dd\u07dc\u0001\u0000\u0000\u0000"+
		"\u07dd\u07de\u0001\u0000\u0000\u0000\u07de\u00d5\u0001\u0000\u0000\u0000"+
		"\u07df\u07e0\u0003\u017e\u00bf\u0000\u07e0\u07e4\u0005\u0088\u0000\u0000"+
		"\u07e1\u07e3\u0003\u009cN\u0000\u07e2\u07e1\u0001\u0000\u0000\u0000\u07e3"+
		"\u07e6\u0001\u0000\u0000\u0000\u07e4\u07e2\u0001\u0000\u0000\u0000\u07e4"+
		"\u07e5\u0001\u0000\u0000\u0000\u07e5\u07f2\u0001\u0000\u0000\u0000\u07e6"+
		"\u07e4\u0001\u0000\u0000\u0000\u07e7\u07ec\u0003\u00aaU\u0000\u07e8\u07e9"+
		"\u0005{\u0000\u0000\u07e9\u07eb\u0003\u00aaU\u0000\u07ea\u07e8\u0001\u0000"+
		"\u0000\u0000\u07eb\u07ee\u0001\u0000\u0000\u0000\u07ec\u07ea\u0001\u0000"+
		"\u0000\u0000\u07ec\u07ed\u0001\u0000\u0000\u0000\u07ed\u07f0\u0001\u0000"+
		"\u0000\u0000\u07ee\u07ec\u0001\u0000\u0000\u0000\u07ef\u07f1\u0005{\u0000"+
		"\u0000\u07f0\u07ef\u0001\u0000\u0000\u0000\u07f0\u07f1\u0001\u0000\u0000"+
		"\u0000\u07f1\u07f3\u0001\u0000\u0000\u0000\u07f2\u07e7\u0001\u0000\u0000"+
		"\u0000\u07f2\u07f3\u0001\u0000\u0000\u0000\u07f3\u07f4\u0001\u0000\u0000"+
		"\u0000\u07f4\u07f5\u0005\u0089\u0000\u0000\u07f5\u00d7\u0001\u0000\u0000"+
		"\u0000\u07f6\u07f7\u0003\u017e\u00bf\u0000\u07f7\u00d9\u0001\u0000\u0000"+
		"\u0000\u07f8\u07fc\u0003\u00dcn\u0000\u07f9\u07fc\u0003\u00e2q\u0000\u07fa"+
		"\u07fc\u0003\u00e4r\u0000\u07fb\u07f8\u0001\u0000\u0000\u0000\u07fb\u07f9"+
		"\u0001\u0000\u0000\u0000\u07fb\u07fa\u0001\u0000\u0000\u0000\u07fc\u00db"+
		"\u0001\u0000\u0000\u0000\u07fd\u07fe\u0003\u017e\u00bf\u0000\u07fe\u0800"+
		"\u0005\u0084\u0000\u0000\u07ff\u0801\u0003\u00deo\u0000\u0800\u07ff\u0001"+
		"\u0000\u0000\u0000\u0800\u0801\u0001\u0000\u0000\u0000\u0801\u0802\u0001"+
		"\u0000\u0000\u0000\u0802\u0803\u0005\u0085\u0000\u0000\u0803\u00dd\u0001"+
		"\u0000\u0000\u0000\u0804\u0809\u0003\u00e0p\u0000\u0805\u0806\u0005{\u0000"+
		"\u0000\u0806\u0808\u0003\u00e0p\u0000\u0807\u0805\u0001\u0000\u0000\u0000"+
		"\u0808\u080b\u0001\u0000\u0000\u0000\u0809\u0807\u0001\u0000\u0000\u0000"+
		"\u0809\u080a\u0001\u0000\u0000\u0000\u080a\u080d\u0001\u0000\u0000\u0000"+
		"\u080b\u0809\u0001\u0000\u0000\u0000\u080c\u080e\u0005{\u0000\u0000\u080d"+
		"\u080c\u0001\u0000\u0000\u0000\u080d\u080e\u0001\u0000\u0000\u0000\u080e"+
		"\u00df\u0001\u0000\u0000\u0000\u080f\u0818\u0003\u01a4\u00d2\u0000\u0810"+
		"\u0813\u0003\u01a4\u00d2\u0000\u0811\u0813\u0003\u00cae\u0000\u0812\u0810"+
		"\u0001\u0000\u0000\u0000\u0812\u0811\u0001\u0000\u0000\u0000\u0813\u0814"+
		"\u0001\u0000\u0000\u0000\u0814\u0815\u0005}\u0000\u0000\u0815\u0816\u0003"+
		"\u00aaU\u0000\u0816\u0818\u0001\u0000\u0000\u0000\u0817\u080f\u0001\u0000"+
		"\u0000\u0000\u0817\u0812\u0001\u0000\u0000\u0000\u0818\u00e1\u0001\u0000"+
		"\u0000\u0000\u0819\u081a\u0003\u017e\u00bf\u0000\u081a\u0826\u0005\u0088"+
		"\u0000\u0000\u081b\u0820\u0003\u00aaU\u0000\u081c\u081d\u0005{\u0000\u0000"+
		"\u081d\u081f\u0003\u00aaU\u0000\u081e\u081c\u0001\u0000\u0000\u0000\u081f"+
		"\u0822\u0001\u0000\u0000\u0000\u0820\u081e\u0001\u0000\u0000\u0000\u0820"+
		"\u0821\u0001\u0000\u0000\u0000\u0821\u0824\u0001\u0000\u0000\u0000\u0822"+
		"\u0820\u0001\u0000\u0000\u0000\u0823\u0825\u0005{\u0000\u0000\u0824\u0823"+
		"\u0001\u0000\u0000\u0000\u0824\u0825\u0001\u0000\u0000\u0000\u0825\u0827"+
		"\u0001\u0000\u0000\u0000\u0826\u081b\u0001\u0000\u0000\u0000\u0826\u0827"+
		"\u0001\u0000\u0000\u0000\u0827\u0828\u0001\u0000\u0000\u0000\u0828\u0829"+
		"\u0005\u0089\u0000\u0000\u0829\u00e3\u0001\u0000\u0000\u0000\u082a\u082b"+
		"\u0003\u017e\u00bf\u0000\u082b\u00e5\u0001\u0000\u0000\u0000\u082c\u0831"+
		"\u0003\u00aaU\u0000\u082d\u082e\u0005{\u0000\u0000\u082e\u0830\u0003\u00aa"+
		"U\u0000\u082f\u082d\u0001\u0000\u0000\u0000\u0830\u0833\u0001\u0000\u0000"+
		"\u0000\u0831\u082f\u0001\u0000\u0000\u0000\u0831\u0832\u0001\u0000\u0000"+
		"\u0000\u0832\u0835\u0001\u0000\u0000\u0000\u0833\u0831\u0001\u0000\u0000"+
		"\u0000\u0834\u0836\u0005{\u0000\u0000\u0835\u0834\u0001\u0000\u0000\u0000"+
		"\u0835\u0836\u0001\u0000\u0000\u0000\u0836\u00e7\u0001\u0000\u0000\u0000"+
		"\u0837\u0839\u0003\u0098L\u0000\u0838\u0837\u0001\u0000\u0000\u0000\u0838"+
		"\u0839\u0001\u0000\u0000\u0000\u0839\u083b\u0001\u0000\u0000\u0000\u083a"+
		"\u083c\u0005\u001b\u0000\u0000\u083b\u083a\u0001\u0000\u0000\u0000\u083b"+
		"\u083c\u0001\u0000\u0000\u0000\u083c\u083e\u0001\u0000\u0000\u0000\u083d"+
		"\u083f\u0005\u0003\u0000\u0000\u083e\u083d\u0001\u0000\u0000\u0000\u083e"+
		"\u083f\u0001\u0000\u0000\u0000\u083f\u0841\u0001\u0000\u0000\u0000\u0840"+
		"\u0842\u0005\'\u0000\u0000\u0841\u0840\u0001\u0000\u0000\u0000\u0841\u0842"+
		"\u0001\u0000\u0000\u0000\u0842\u0844\u0001\u0000\u0000\u0000\u0843\u0845"+
		"\u0005\u0013\u0000\u0000\u0844\u0843\u0001\u0000\u0000\u0000\u0844\u0845"+
		"\u0001\u0000\u0000\u0000\u0845\u084c\u0001\u0000\u0000\u0000\u0846\u084d"+
		"\u0005e\u0000\u0000\u0847\u0849\u0005c\u0000\u0000\u0848\u084a\u0003\u00ea"+
		"u\u0000\u0849\u0848\u0001\u0000\u0000\u0000\u0849\u084a\u0001\u0000\u0000"+
		"\u0000\u084a\u084b\u0001\u0000\u0000\u0000\u084b\u084d\u0005c\u0000\u0000"+
		"\u084c\u0846\u0001\u0000\u0000\u0000\u084c\u0847\u0001\u0000\u0000\u0000"+
		"\u084d\u0853\u0001\u0000\u0000\u0000\u084e\u0854\u0003\u00aaU\u0000\u084f"+
		"\u0850\u0005\u007f\u0000\u0000\u0850\u0851\u0003\u013e\u009f\u0000\u0851"+
		"\u0852\u0003\u00ba]\u0000\u0852\u0854\u0001\u0000\u0000\u0000\u0853\u084e"+
		"\u0001\u0000\u0000\u0000\u0853\u084f\u0001\u0000\u0000\u0000\u0854\u00e9"+
		"\u0001\u0000\u0000\u0000\u0855\u085a\u0003\u00ecv\u0000\u0856\u0857\u0005"+
		"{\u0000\u0000\u0857\u0859\u0003\u00ecv\u0000\u0858\u0856\u0001\u0000\u0000"+
		"\u0000\u0859\u085c\u0001\u0000\u0000\u0000\u085a\u0858\u0001\u0000\u0000"+
		"\u0000\u085a\u085b\u0001\u0000\u0000\u0000\u085b\u085e\u0001\u0000\u0000"+
		"\u0000\u085c\u085a\u0001\u0000\u0000\u0000\u085d\u085f\u0005{\u0000\u0000"+
		"\u085e\u085d\u0001\u0000\u0000\u0000\u085e\u085f\u0001\u0000\u0000\u0000"+
		"\u085f\u00eb\u0001\u0000\u0000\u0000\u0860\u0862\u0003\u009eO\u0000\u0861"+
		"\u0860\u0001\u0000\u0000\u0000\u0862\u0865\u0001\u0000\u0000\u0000\u0863"+
		"\u0861\u0001\u0000\u0000\u0000\u0863\u0864\u0001\u0000\u0000\u0000\u0864"+
		"\u0866\u0001\u0000\u0000\u0000\u0865\u0863\u0001\u0000\u0000\u0000\u0866"+
		"\u0869\u0003\u010c\u0086\u0000\u0867\u0868\u0005}\u0000\u0000\u0868\u086a"+
		"\u0003\u013c\u009e\u0000\u0869\u0867\u0001\u0000\u0000\u0000\u0869\u086a"+
		"\u0001\u0000\u0000\u0000\u086a\u00ed\u0001\u0000\u0000\u0000\u086b\u086d"+
		"\u0003\u00fa}\u0000\u086c\u086b\u0001\u0000\u0000\u0000\u086c\u086d\u0001"+
		"\u0000\u0000\u0000\u086d\u0872\u0001\u0000\u0000\u0000\u086e\u0873\u0003"+
		"\u00f0x\u0000\u086f\u0873\u0003\u00f2y\u0000\u0870\u0873\u0003\u00f4z"+
		"\u0000\u0871\u0873\u0003\u00f6{\u0000\u0872\u086e\u0001\u0000\u0000\u0000"+
		"\u0872\u086f\u0001\u0000\u0000\u0000\u0872\u0870\u0001\u0000\u0000\u0000"+
		"\u0872\u0871\u0001\u0000\u0000\u0000\u0873\u0878\u0001\u0000\u0000\u0000"+
		"\u0874\u0875\u0003\u00fa}\u0000\u0875\u0876\u0003\u00f8|\u0000\u0876\u0878"+
		"\u0001\u0000\u0000\u0000\u0877\u086c\u0001\u0000\u0000\u0000\u0877\u0874"+
		"\u0001\u0000\u0000\u0000\u0878\u00ef\u0001\u0000\u0000\u0000\u0879\u087a"+
		"\u0005\u0010\u0000\u0000\u087a\u087b\u0003\u00ba]\u0000\u087b\u00f1\u0001"+
		"\u0000\u0000\u0000\u087c\u087d\u0005&\u0000\u0000\u087d\u087e\u0003\u00aa"+
		"U\u0000\u087e\u087f\u0003\u00ba]\u0000\u087f\u00f3\u0001\u0000\u0000\u0000"+
		"\u0880\u0881\u0005&\u0000\u0000\u0881\u0882\u0005\u000f\u0000\u0000\u0882"+
		"\u0883\u0003\u010c\u0086\u0000\u0883\u0884\u0005o\u0000\u0000\u0884\u0885"+
		"\u0003\u00aaU\u0000\u0885\u0886\u0003\u00ba]\u0000\u0886\u00f5\u0001\u0000"+
		"\u0000\u0000\u0887\u0888\u0005\u000b\u0000\u0000\u0888\u0889\u0003\u010c"+
		"\u0086\u0000\u0889\u088a\u0005\u000e\u0000\u0000\u088a\u088b\u0003\u00aa"+
		"U\u0000\u088b\u088c\u0003\u00ba]\u0000\u088c\u00f7\u0001\u0000\u0000\u0000"+
		"\u088d\u088e\u0003\u00ba]\u0000\u088e\u00f9\u0001\u0000\u0000\u0000\u088f"+
		"\u0890\u0005Y\u0000\u0000\u0890\u0891\u0005}\u0000\u0000\u0891\u00fb\u0001"+
		"\u0000\u0000\u0000\u0892\u0893\u0005\f\u0000\u0000\u0893\u0894\u0003\u00aa"+
		"U\u0000\u0894\u089b\u0003\u00ba]\u0000\u0895\u0899\u0005\u0006\u0000\u0000"+
		"\u0896\u089a\u0003\u00ba]\u0000\u0897\u089a\u0003\u00fc~\u0000\u0898\u089a"+
		"\u0003\u00fe\u007f\u0000\u0899\u0896\u0001\u0000\u0000\u0000\u0899\u0897"+
		"\u0001\u0000\u0000\u0000\u0899\u0898\u0001\u0000\u0000\u0000\u089a\u089c"+
		"\u0001\u0000\u0000\u0000\u089b\u0895\u0001\u0000\u0000\u0000\u089b\u089c"+
		"\u0001\u0000\u0000\u0000\u089c\u00fd\u0001\u0000\u0000\u0000\u089d\u089e"+
		"\u0005\f\u0000\u0000\u089e\u089f\u0005\u000f\u0000\u0000\u089f\u08a0\u0003"+
		"\u010c\u0086\u0000\u08a0\u08a1\u0005o\u0000\u0000\u08a1\u08a2\u0003\u00aa"+
		"U\u0000\u08a2\u08a9\u0003\u00ba]\u0000";
	private static final String _serializedATNSegment1 =
		"\u08a3\u08a7\u0005\u0006\u0000\u0000\u08a4\u08a8\u0003\u00ba]\u0000\u08a5"+
		"\u08a8\u0003\u00fc~\u0000\u08a6\u08a8\u0003\u00fe\u007f\u0000\u08a7\u08a4"+
		"\u0001\u0000\u0000\u0000\u08a7\u08a5\u0001\u0000\u0000\u0000\u08a7\u08a6"+
		"\u0001\u0000\u0000\u0000\u08a8\u08aa\u0001\u0000\u0000\u0000\u08a9\u08a3"+
		"\u0001\u0000\u0000\u0000\u08a9\u08aa\u0001\u0000\u0000\u0000\u08aa\u00ff"+
		"\u0001\u0000\u0000\u0000\u08ab\u08ac\u0005\u000f\u0000\u0000\u08ac\u08ad"+
		"\u0003\u010c\u0086\u0000\u08ad\u08ae\u0005o\u0000\u0000\u08ae\u08af\u0003"+
		"\u00aaU\u0000\u08af\u0101\u0001\u0000\u0000\u0000\u08b0\u08b1\u0005\u0011"+
		"\u0000\u0000\u08b1\u08b2\u0003\u00aaU\u0000\u08b2\u08b6\u0005\u0084\u0000"+
		"\u0000\u08b3\u08b5\u0003\u009cN\u0000\u08b4\u08b3\u0001\u0000\u0000\u0000"+
		"\u08b5\u08b8\u0001\u0000\u0000\u0000\u08b6\u08b4\u0001\u0000\u0000\u0000"+
		"\u08b6\u08b7\u0001\u0000\u0000\u0000\u08b7\u08ba\u0001\u0000\u0000\u0000"+
		"\u08b8\u08b6\u0001\u0000\u0000\u0000\u08b9\u08bb\u0003\u0104\u0082\u0000"+
		"\u08ba\u08b9\u0001\u0000\u0000\u0000\u08ba\u08bb\u0001\u0000\u0000\u0000"+
		"\u08bb\u08bc\u0001\u0000\u0000\u0000\u08bc\u08bd\u0005\u0085\u0000\u0000"+
		"\u08bd\u0103\u0001\u0000\u0000\u0000\u08be\u08bf\u0003\u0108\u0084\u0000"+
		"\u08bf\u08c0\u0005\u0080\u0000\u0000\u08c0\u08c1\u0003\u0106\u0083\u0000"+
		"\u08c1\u08c3\u0001\u0000\u0000\u0000\u08c2\u08be\u0001\u0000\u0000\u0000"+
		"\u08c3\u08c6\u0001\u0000\u0000\u0000\u08c4\u08c2\u0001\u0000\u0000\u0000"+
		"\u08c4\u08c5\u0001\u0000\u0000\u0000\u08c5\u08c7\u0001\u0000\u0000\u0000"+
		"\u08c6\u08c4\u0001\u0000\u0000\u0000\u08c7\u08c8\u0003\u0108\u0084\u0000"+
		"\u08c8\u08c9\u0005\u0080\u0000\u0000\u08c9\u08cb\u0003\u00aaU\u0000\u08ca"+
		"\u08cc\u0005{\u0000\u0000\u08cb\u08ca\u0001\u0000\u0000\u0000\u08cb\u08cc"+
		"\u0001\u0000\u0000\u0000\u08cc\u08d2\u0001\u0000\u0000\u0000\u08cd\u08cf"+
		"\u0003\u010e\u0087\u0000\u08ce\u08d0\u0005{\u0000\u0000\u08cf\u08ce\u0001"+
		"\u0000\u0000\u0000\u08cf\u08d0\u0001\u0000\u0000\u0000\u08d0\u08d2\u0001"+
		"\u0000\u0000\u0000\u08d1\u08c4\u0001\u0000\u0000\u0000\u08d1\u08cd\u0001"+
		"\u0000\u0000\u0000\u08d2\u0105\u0001\u0000\u0000\u0000\u08d3\u08d4\u0003"+
		"\u00aaU\u0000\u08d4\u08d5\u0005{\u0000\u0000\u08d5\u08db\u0001\u0000\u0000"+
		"\u0000\u08d6\u08d8\u0003\u00b0X\u0000\u08d7\u08d9\u0005{\u0000\u0000\u08d8"+
		"\u08d7\u0001\u0000\u0000\u0000\u08d8\u08d9\u0001\u0000\u0000\u0000\u08d9"+
		"\u08db\u0001\u0000\u0000\u0000\u08da\u08d3\u0001\u0000\u0000\u0000\u08da"+
		"\u08d6\u0001\u0000\u0000\u0000\u08db\u0107\u0001\u0000\u0000\u0000\u08dc"+
		"\u08de\u0003\u009eO\u0000\u08dd\u08dc\u0001\u0000\u0000\u0000\u08de\u08e1"+
		"\u0001\u0000\u0000\u0000\u08df\u08dd\u0001\u0000\u0000\u0000\u08df\u08e0"+
		"\u0001\u0000\u0000\u0000\u08e0\u08e2\u0001\u0000\u0000\u0000\u08e1\u08df"+
		"\u0001\u0000\u0000\u0000\u08e2\u08e4\u0003\u010c\u0086\u0000\u08e3\u08e5"+
		"\u0003\u010a\u0085\u0000\u08e4\u08e3\u0001\u0000\u0000\u0000\u08e4\u08e5"+
		"\u0001\u0000\u0000\u0000\u08e5\u0109\u0001\u0000\u0000\u0000\u08e6\u08e7"+
		"\u0005\f\u0000\u0000\u08e7\u08e8\u0003\u00aaU\u0000\u08e8\u010b\u0001"+
		"\u0000\u0000\u0000\u08e9\u08eb\u0005c\u0000\u0000\u08ea\u08e9\u0001\u0000"+
		"\u0000\u0000\u08ea\u08eb\u0001\u0000\u0000\u0000\u08eb\u08ec\u0001\u0000"+
		"\u0000\u0000\u08ec\u08f1\u0003\u010e\u0087\u0000\u08ed\u08ee\u0005c\u0000"+
		"\u0000\u08ee\u08f0\u0003\u010e\u0087\u0000\u08ef\u08ed\u0001\u0000\u0000"+
		"\u0000\u08f0\u08f3\u0001\u0000\u0000\u0000\u08f1\u08ef\u0001\u0000\u0000"+
		"\u0000\u08f1\u08f2\u0001\u0000\u0000\u0000\u08f2\u010d\u0001\u0000\u0000"+
		"\u0000\u08f3\u08f1\u0001\u0000\u0000\u0000\u08f4\u08f7\u0003\u0110\u0088"+
		"\u0000\u08f5\u08f7\u0003\u011c\u008e\u0000\u08f6\u08f4\u0001\u0000\u0000"+
		"\u0000\u08f6\u08f5\u0001\u0000\u0000\u0000\u08f7\u08f8\u0001\u0000\u0000"+
		"\u0000\u08f8\u08f9\u0005\f\u0000\u0000\u08f9\u08fa\u0003\u00aaU\u0000"+
		"\u08fa\u08fe\u0001\u0000\u0000\u0000\u08fb\u08fe\u0003\u0110\u0088\u0000"+
		"\u08fc\u08fe\u0003\u011c\u008e\u0000\u08fd\u08f6\u0001\u0000\u0000\u0000"+
		"\u08fd\u08fb\u0001\u0000\u0000\u0000\u08fd\u08fc\u0001\u0000\u0000\u0000"+
		"\u08fe\u010f\u0001\u0000\u0000\u0000\u08ff\u090f\u0003\u0112\u0089\u0000"+
		"\u0900\u090f\u0003\u0114\u008a\u0000\u0901\u090f\u0005`\u0000\u0000\u0902"+
		"\u090f\u0003\u0116\u008b\u0000\u0903\u090f\u0003\u0118\u008c\u0000\u0904"+
		"\u090f\u0003\u011a\u008d\u0000\u0905\u090f\u0003\u0120\u0090\u0000\u0906"+
		"\u090f\u0003\u0122\u0091\u0000\u0907\u090f\u0003\u012c\u0096\u0000\u0908"+
		"\u090f\u0003\u0130\u0098\u0000\u0909\u090f\u0003\u0134\u009a\u0000\u090a"+
		"\u090f\u0003\u0136\u009b\u0000\u090b\u090f\u0003\u013a\u009d\u0000\u090c"+
		"\u090f\u0003\u0002\u0001\u0000\u090d\u090f\u0003\u00c2a\u0000\u090e\u08ff"+
		"\u0001\u0000\u0000\u0000\u090e\u0900\u0001\u0000\u0000\u0000\u090e\u0901"+
		"\u0001\u0000\u0000\u0000\u090e\u0902\u0001\u0000\u0000\u0000\u090e\u0903"+
		"\u0001\u0000\u0000\u0000\u090e\u0904\u0001\u0000\u0000\u0000\u090e\u0905"+
		"\u0001\u0000\u0000\u0000\u090e\u0906\u0001\u0000\u0000\u0000\u090e\u0907"+
		"\u0001\u0000\u0000\u0000\u090e\u0908\u0001\u0000\u0000\u0000\u090e\u0909"+
		"\u0001\u0000\u0000\u0000\u090e\u090a\u0001\u0000\u0000\u0000\u090e\u090b"+
		"\u0001\u0000\u0000\u0000\u090e\u090c\u0001\u0000\u0000\u0000\u090e\u090d"+
		"\u0001\u0000\u0000\u0000\u090f\u0111\u0001\u0000\u0000\u0000\u0910\u0911"+
		"\u0005-\u0000\u0000\u0911\u0912\u0003\u010e\u0087\u0000\u0912\u0113\u0001"+
		"\u0000\u0000\u0000\u0913\u0925\u0005\u001f\u0000\u0000\u0914\u0925\u0005"+
		"\t\u0000\u0000\u0915\u0925\u0005K\u0000\u0000\u0916\u0925\u0005N\u0000"+
		"\u0000\u0917\u0925\u0005L\u0000\u0000\u0918\u0925\u0005M\u0000\u0000\u0919"+
		"\u0925\u0005O\u0000\u0000\u091a\u0925\u0005`\u0000\u0000\u091b\u0925\u0005"+
		"P\u0000\u0000\u091c\u091e\u0005[\u0000\u0000\u091d\u091c\u0001\u0000\u0000"+
		"\u0000\u091d\u091e\u0001\u0000\u0000\u0000\u091e\u091f\u0001\u0000\u0000"+
		"\u0000\u091f\u0925\u0005S\u0000\u0000\u0920\u0922\u0005[\u0000\u0000\u0921"+
		"\u0920\u0001\u0000\u0000\u0000\u0921\u0922\u0001\u0000\u0000\u0000\u0922"+
		"\u0923\u0001\u0000\u0000\u0000\u0923\u0925\u0005X\u0000\u0000\u0924\u0913"+
		"\u0001\u0000\u0000\u0000\u0924\u0914\u0001\u0000\u0000\u0000\u0924\u0915"+
		"\u0001\u0000\u0000\u0000\u0924\u0916\u0001\u0000\u0000\u0000\u0924\u0917"+
		"\u0001\u0000\u0000\u0000\u0924\u0918\u0001\u0000\u0000\u0000\u0924\u0919"+
		"\u0001\u0000\u0000\u0000\u0924\u091a\u0001\u0000\u0000\u0000\u0924\u091b"+
		"\u0001\u0000\u0000\u0000\u0924\u091d\u0001\u0000\u0000\u0000\u0924\u0921"+
		"\u0001\u0000\u0000\u0000\u0925\u0115\u0001\u0000\u0000\u0000\u0926\u0928"+
		"\u0007\t\u0000\u0000\u0927\u0926\u0001\u0000\u0000\u0000\u0928\u092b\u0001"+
		"\u0000\u0000\u0000\u0929\u0927\u0001\u0000\u0000\u0000\u0929\u092a\u0001"+
		"\u0000\u0000\u0000\u092a\u092c\u0001\u0000\u0000\u0000\u092b\u0929\u0001"+
		"\u0000\u0000\u0000\u092c\u092f\u0003\u01a4\u00d2\u0000\u092d\u092e\u0005"+
		"u\u0000\u0000\u092e\u0930\u0003\u010c\u0086\u0000\u092f\u092d\u0001\u0000"+
		"\u0000\u0000\u092f\u0930\u0001\u0000\u0000\u0000\u0930\u0117\u0001\u0000"+
		"\u0000\u0000\u0931\u0932\u0005v\u0000\u0000\u0932\u0119\u0001\u0000\u0000"+
		"\u0000\u0933\u0934\u0005x\u0000\u0000\u0934\u011b\u0001\u0000\u0000\u0000"+
		"\u0935\u0936\u0003\u011e\u008f\u0000\u0936\u0937\u0005x\u0000\u0000\u0937"+
		"\u0938\u0003\u011e\u008f\u0000\u0938\u0949\u0001\u0000\u0000\u0000\u0939"+
		"\u093a\u0003\u011e\u008f\u0000\u093a\u093b\u0005z\u0000\u0000\u093b\u093c"+
		"\u0003\u011e\u008f\u0000\u093c\u0949\u0001\u0000\u0000\u0000\u093d\u093e"+
		"\u0005x\u0000\u0000\u093e\u0949\u0003\u011e\u008f\u0000\u093f\u0940\u0005"+
		"z\u0000\u0000\u0940\u0949\u0003\u011e\u008f\u0000\u0941\u0942\u0003\u011e"+
		"\u008f\u0000\u0942\u0943\u0005x\u0000\u0000\u0943\u0949\u0001\u0000\u0000"+
		"\u0000\u0944\u0945\u0003\u011e\u008f\u0000\u0945\u0946\u0005y\u0000\u0000"+
		"\u0946\u0947\u0003\u011e\u008f\u0000\u0947\u0949\u0001\u0000\u0000\u0000"+
		"\u0948\u0935\u0001\u0000\u0000\u0000\u0948\u0939\u0001\u0000\u0000\u0000"+
		"\u0948\u093d\u0001\u0000\u0000\u0000\u0948\u093f\u0001\u0000\u0000\u0000"+
		"\u0948\u0941\u0001\u0000\u0000\u0000\u0948\u0944\u0001\u0000\u0000\u0000"+
		"\u0949\u011d\u0001\u0000\u0000\u0000\u094a\u0957\u0005K\u0000\u0000\u094b"+
		"\u0957\u0005N\u0000\u0000\u094c\u094e\u0005[\u0000\u0000\u094d\u094c\u0001"+
		"\u0000\u0000\u0000\u094d\u094e\u0001\u0000\u0000\u0000\u094e\u094f\u0001"+
		"\u0000\u0000\u0000\u094f\u0957\u0005S\u0000\u0000\u0950\u0952\u0005[\u0000"+
		"\u0000\u0951\u0950\u0001\u0000\u0000\u0000\u0951\u0952\u0001\u0000\u0000"+
		"\u0000\u0952\u0953\u0001\u0000\u0000\u0000\u0953\u0957\u0005X\u0000\u0000"+
		"\u0954\u0957\u0003\u013a\u009d\u0000\u0955\u0957\u0003\u00c2a\u0000\u0956"+
		"\u094a\u0001\u0000\u0000\u0000\u0956\u094b\u0001\u0000\u0000\u0000\u0956"+
		"\u094d\u0001\u0000\u0000\u0000\u0956\u0951\u0001\u0000\u0000\u0000\u0956"+
		"\u0954\u0001\u0000\u0000\u0000\u0956\u0955\u0001\u0000\u0000\u0000\u0957"+
		"\u011f\u0001\u0000\u0000\u0000\u0958\u095a\u0007\u0004\u0000\u0000\u0959"+
		"\u095b\u0005\u0014\u0000\u0000\u095a\u0959\u0001\u0000\u0000\u0000\u095a"+
		"\u095b\u0001\u0000\u0000\u0000\u095b\u095c\u0001\u0000\u0000\u0000\u095c"+
		"\u095d\u0003\u0110\u0088\u0000\u095d\u0121\u0001\u0000\u0000\u0000\u095e"+
		"\u0961\u0003\u017e\u00bf\u0000\u095f\u0961\u0003\u0194\u00ca\u0000\u0960"+
		"\u095e\u0001\u0000\u0000\u0000\u0960\u095f\u0001\u0000\u0000\u0000\u0961"+
		"\u0962\u0001\u0000\u0000\u0000\u0962\u0964\u0005\u0084\u0000\u0000\u0963"+
		"\u0965\u0003\u0124\u0092\u0000\u0964\u0963\u0001\u0000\u0000\u0000\u0964"+
		"\u0965\u0001\u0000\u0000\u0000\u0965\u0966\u0001\u0000\u0000\u0000\u0966"+
		"\u0967\u0005\u0085\u0000\u0000\u0967\u0123\u0001\u0000\u0000\u0000\u0968"+
		"\u096d\u0003\u0126\u0093\u0000\u0969\u096b\u0005{\u0000\u0000\u096a\u096c"+
		"\u0003\u012a\u0095\u0000\u096b\u096a\u0001\u0000\u0000\u0000\u096b\u096c"+
		"\u0001\u0000\u0000\u0000\u096c\u096e\u0001\u0000\u0000\u0000\u096d\u0969"+
		"\u0001\u0000\u0000\u0000\u096d\u096e\u0001\u0000\u0000\u0000\u096e\u0971"+
		"\u0001\u0000\u0000\u0000\u096f\u0971\u0003\u012a\u0095\u0000\u0970\u0968"+
		"\u0001\u0000\u0000\u0000\u0970\u096f\u0001\u0000\u0000\u0000\u0971\u0125"+
		"\u0001\u0000\u0000\u0000\u0972\u0977\u0003\u0128\u0094\u0000\u0973\u0974"+
		"\u0005{\u0000\u0000\u0974\u0976\u0003\u0128\u0094\u0000\u0975\u0973\u0001"+
		"\u0000\u0000\u0000\u0976\u0979\u0001\u0000\u0000\u0000\u0977\u0975\u0001"+
		"\u0000\u0000\u0000\u0977\u0978\u0001\u0000\u0000\u0000\u0978\u0127\u0001"+
		"\u0000\u0000\u0000\u0979\u0977\u0001\u0000\u0000\u0000\u097a\u097c\u0003"+
		"\u009eO\u0000\u097b\u097a\u0001\u0000\u0000\u0000\u097c\u097f\u0001\u0000"+
		"\u0000\u0000\u097d\u097b\u0001\u0000\u0000\u0000\u097d\u097e\u0001\u0000"+
		"\u0000\u0000\u097e\u0990\u0001\u0000\u0000\u0000\u097f\u097d\u0001\u0000"+
		"\u0000\u0000\u0980\u0981\u0003\u00cae\u0000\u0981\u0982\u0005}\u0000\u0000"+
		"\u0982\u0983\u0003\u010c\u0086\u0000\u0983\u0991\u0001\u0000\u0000\u0000"+
		"\u0984\u0985\u0003\u01a4\u00d2\u0000\u0985\u0986\u0005}\u0000\u0000\u0986"+
		"\u0987\u0003\u010c\u0086\u0000\u0987\u0991\u0001\u0000\u0000\u0000\u0988"+
		"\u098a\u0005\u0016\u0000\u0000\u0989\u0988\u0001\u0000\u0000\u0000\u0989"+
		"\u098a\u0001\u0000\u0000\u0000\u098a\u098c\u0001\u0000\u0000\u0000\u098b"+
		"\u098d\u0005\u0014\u0000\u0000\u098c\u098b\u0001\u0000\u0000\u0000\u098c"+
		"\u098d\u0001\u0000\u0000\u0000\u098d\u098e\u0001\u0000\u0000\u0000\u098e"+
		"\u0991\u0003\u01a4\u00d2\u0000\u098f\u0991\u0003\u0112\u0089\u0000\u0990"+
		"\u0980\u0001\u0000\u0000\u0000\u0990\u0984\u0001\u0000\u0000\u0000\u0990"+
		"\u0989\u0001\u0000\u0000\u0000\u0990\u098f\u0001\u0000\u0000\u0000\u0991"+
		"\u0129\u0001\u0000\u0000\u0000\u0992\u0994\u0003\u009eO\u0000\u0993\u0992"+
		"\u0001\u0000\u0000\u0000\u0994\u0997\u0001\u0000\u0000\u0000\u0995\u0993"+
		"\u0001\u0000\u0000\u0000\u0995\u0996\u0001\u0000\u0000\u0000\u0996\u0998"+
		"\u0001\u0000\u0000\u0000\u0997\u0995\u0001\u0000\u0000\u0000\u0998\u0999"+
		"\u0005x\u0000\u0000\u0999\u012b\u0001\u0000\u0000\u0000\u099a\u099d\u0003"+
		"\u017e\u00bf\u0000\u099b\u099d\u0003\u0194\u00ca\u0000\u099c\u099a\u0001"+
		"\u0000\u0000\u0000\u099c\u099b\u0001\u0000\u0000\u0000\u099d\u099e\u0001"+
		"\u0000\u0000\u0000\u099e\u09a0\u0005\u0088\u0000\u0000\u099f\u09a1\u0003"+
		"\u012e\u0097\u0000\u09a0\u099f\u0001\u0000\u0000\u0000\u09a0\u09a1\u0001"+
		"\u0000\u0000\u0000\u09a1\u09a2\u0001\u0000\u0000\u0000\u09a2\u09a3\u0005"+
		"\u0089\u0000\u0000\u09a3\u012d\u0001\u0000\u0000\u0000\u09a4\u09a9\u0003"+
		"\u010c\u0086\u0000\u09a5\u09a6\u0005{\u0000\u0000\u09a6\u09a8\u0003\u010c"+
		"\u0086\u0000\u09a7\u09a5\u0001\u0000\u0000\u0000\u09a8\u09ab\u0001\u0000"+
		"\u0000\u0000\u09a9\u09a7\u0001\u0000\u0000\u0000\u09a9\u09aa\u0001\u0000"+
		"\u0000\u0000\u09aa\u09ad\u0001\u0000\u0000\u0000\u09ab\u09a9\u0001\u0000"+
		"\u0000\u0000\u09ac\u09ae\u0005{\u0000\u0000\u09ad\u09ac\u0001\u0000\u0000"+
		"\u0000\u09ad\u09ae\u0001\u0000\u0000\u0000\u09ae\u012f\u0001\u0000\u0000"+
		"\u0000\u09af\u09b1\u0005\u0088\u0000\u0000\u09b0\u09b2\u0003\u0132\u0099"+
		"\u0000\u09b1\u09b0\u0001\u0000\u0000\u0000\u09b1\u09b2\u0001\u0000\u0000"+
		"\u0000\u09b2\u09b3\u0001\u0000\u0000\u0000\u09b3\u09b4\u0005\u0089\u0000"+
		"\u0000\u09b4\u0131\u0001\u0000\u0000\u0000\u09b5\u09b6\u0003\u010c\u0086"+
		"\u0000\u09b6\u09b7\u0005{\u0000\u0000\u09b7\u09c4\u0001\u0000\u0000\u0000"+
		"\u09b8\u09c4\u0003\u011a\u008d\u0000\u09b9\u09bc\u0003\u010c\u0086\u0000"+
		"\u09ba\u09bb\u0005{\u0000\u0000\u09bb\u09bd\u0003\u010c\u0086\u0000\u09bc"+
		"\u09ba\u0001\u0000\u0000\u0000\u09bd\u09be\u0001\u0000\u0000\u0000\u09be"+
		"\u09bc\u0001\u0000\u0000\u0000\u09be\u09bf\u0001\u0000\u0000\u0000\u09bf"+
		"\u09c1\u0001\u0000\u0000\u0000\u09c0\u09c2\u0005{\u0000\u0000\u09c1\u09c0"+
		"\u0001\u0000\u0000\u0000\u09c1\u09c2\u0001\u0000\u0000\u0000\u09c2\u09c4"+
		"\u0001\u0000\u0000\u0000\u09c3\u09b5\u0001\u0000\u0000\u0000\u09c3\u09b8"+
		"\u0001\u0000\u0000\u0000\u09c3\u09b9\u0001\u0000\u0000\u0000\u09c4\u0133"+
		"\u0001\u0000\u0000\u0000\u09c5\u09c6\u0005\u0088\u0000\u0000\u09c6\u09c7"+
		"\u0003\u010c\u0086\u0000\u09c7\u09c8\u0005\u0089\u0000\u0000\u09c8\u0135"+
		"\u0001\u0000\u0000\u0000\u09c9\u09cb\u0005\u0086\u0000\u0000\u09ca\u09cc"+
		"\u0003\u0138\u009c\u0000\u09cb\u09ca\u0001\u0000\u0000\u0000\u09cb\u09cc"+
		"\u0001\u0000\u0000\u0000\u09cc\u09cd\u0001\u0000\u0000\u0000\u09cd\u09ce"+
		"\u0005\u0087\u0000\u0000\u09ce\u0137\u0001\u0000\u0000\u0000\u09cf\u09d4"+
		"\u0003\u010c\u0086\u0000\u09d0\u09d1\u0005{\u0000\u0000\u09d1\u09d3\u0003"+
		"\u010c\u0086\u0000\u09d2\u09d0\u0001\u0000\u0000\u0000\u09d3\u09d6\u0001"+
		"\u0000\u0000\u0000\u09d4\u09d2\u0001\u0000\u0000\u0000\u09d4\u09d5\u0001"+
		"\u0000\u0000\u0000\u09d5\u09d8\u0001\u0000\u0000\u0000\u09d6\u09d4\u0001"+
		"\u0000\u0000\u0000\u09d7\u09d9\u0005{\u0000\u0000\u09d8\u09d7\u0001\u0000"+
		"\u0000\u0000\u09d8\u09d9\u0001\u0000\u0000\u0000\u09d9\u0139\u0001\u0000"+
		"\u0000\u0000\u09da\u09dd\u0003\u017e\u00bf\u0000\u09db\u09dd\u0003\u0194"+
		"\u00ca\u0000\u09dc\u09da\u0001\u0000\u0000\u0000\u09dc\u09db\u0001\u0000"+
		"\u0000\u0000\u09dd\u013b\u0001\u0000\u0000\u0000\u09de\u09ef\u0003\u013e"+
		"\u009f\u0000\u09df\u09ef\u0003\u0160\u00b0\u0000\u09e0\u09ef\u0003\u015c"+
		"\u00ae\u0000\u09e1\u09e2\u0005\u000b\u0000\u0000\u09e2\u09e3\u0005s\u0000"+
		"\u0000\u09e3\u09e8\u0003\u0178\u00bc\u0000\u09e4\u09e5\u0005{\u0000\u0000"+
		"\u09e5\u09e7\u0003\u0178\u00bc\u0000\u09e6\u09e4\u0001\u0000\u0000\u0000"+
		"\u09e7\u09ea\u0001\u0000\u0000\u0000\u09e8\u09e6\u0001\u0000\u0000\u0000"+
		"\u09e8\u09e9\u0001\u0000\u0000\u0000\u09e9\u09eb\u0001\u0000\u0000\u0000"+
		"\u09ea\u09e8\u0001\u0000\u0000\u0000\u09eb\u09ec\u0005r\u0000\u0000\u09ec"+
		"\u09ed\u0003\u013c\u009e\u0000\u09ed\u09ef\u0001\u0000\u0000\u0000\u09ee"+
		"\u09de\u0001\u0000\u0000\u0000\u09ee\u09df\u0001\u0000\u0000\u0000\u09ee"+
		"\u09e0\u0001\u0000\u0000\u0000\u09ee\u09e1\u0001\u0000\u0000\u0000\u09ef"+
		"\u013d\u0001\u0000\u0000\u0000\u09f0\u0a03\u0003\u0140\u00a0\u0000\u09f1"+
		"\u0a03\u0003\u0162\u00b1\u0000\u09f2\u09f3\u0005!\u0000\u0000\u09f3\u09f4"+
		"\u0003\u0082A\u0000\u09f4\u09f5\u0003\u013e\u009f\u0000\u09f5\u0a03\u0001"+
		"\u0000\u0000\u0000\u09f6\u0a03\u0003\u015e\u00af\u0000\u09f7\u0a03\u0003"+
		"\u019a\u00cd\u0000\u09f8\u0a03\u0003\u0144\u00a2\u0000\u09f9\u0a03\u0003"+
		"\u0142\u00a1\u0000\u09fa\u0a03\u0003\u014c\u00a6\u0000\u09fb\u0a03\u0003"+
		"\u014a\u00a5\u0000\u09fc\u0a03\u0003\u0146\u00a3\u0000\u09fd\u0a03\u0003"+
		"\u0148\u00a4\u0000\u09fe\u0a03\u0003\u0166\u00b3\u0000\u09ff\u0a03\u0003"+
		"\u0198\u00cc\u0000\u0a00\u0a03\u0003\u014e\u00a7\u0000\u0a01\u0a03\u0003"+
		"\u0002\u0001\u0000\u0a02\u09f0\u0001\u0000\u0000\u0000\u0a02\u09f1\u0001"+
		"\u0000\u0000\u0000\u0a02\u09f2\u0001\u0000\u0000\u0000\u0a02\u09f6\u0001"+
		"\u0000\u0000\u0000\u0a02\u09f7\u0001\u0000\u0000\u0000\u0a02\u09f8\u0001"+
		"\u0000\u0000\u0000\u0a02\u09f9\u0001\u0000\u0000\u0000\u0a02\u09fa\u0001"+
		"\u0000\u0000\u0000\u0a02\u09fb\u0001\u0000\u0000\u0000\u0a02\u09fc\u0001"+
		"\u0000\u0000\u0000\u0a02\u09fd\u0001\u0000\u0000\u0000\u0a02\u09fe\u0001"+
		"\u0000\u0000\u0000\u0a02\u09ff\u0001\u0000\u0000\u0000\u0a02\u0a00\u0001"+
		"\u0000\u0000\u0000\u0a02\u0a01\u0001\u0000\u0000\u0000\u0a03\u013f\u0001"+
		"\u0000\u0000\u0000\u0a04\u0a05\u0005\u0088\u0000\u0000\u0a05\u0a06\u0003"+
		"\u013c\u009e\u0000\u0a06\u0a07\u0005\u0089\u0000\u0000\u0a07\u0141\u0001"+
		"\u0000\u0000\u0000\u0a08\u0a09\u0005`\u0000\u0000\u0a09\u0143\u0001\u0000"+
		"\u0000\u0000\u0a0a\u0a15\u0005\u0088\u0000\u0000\u0a0b\u0a0c\u0003\u013c"+
		"\u009e\u0000\u0a0c\u0a0d\u0005{\u0000\u0000\u0a0d\u0a0f\u0001\u0000\u0000"+
		"\u0000\u0a0e\u0a0b\u0001\u0000\u0000\u0000\u0a0f\u0a10\u0001\u0000\u0000"+
		"\u0000\u0a10\u0a0e\u0001\u0000\u0000\u0000\u0a10\u0a11\u0001\u0000\u0000"+
		"\u0000\u0a11\u0a13\u0001\u0000\u0000\u0000\u0a12\u0a14\u0003\u013c\u009e"+
		"\u0000\u0a13\u0a12\u0001\u0000\u0000\u0000\u0a13\u0a14\u0001\u0000\u0000"+
		"\u0000\u0a14\u0a16\u0001\u0000\u0000\u0000\u0a15\u0a0e\u0001\u0000\u0000"+
		"\u0000\u0a15\u0a16\u0001\u0000\u0000\u0000\u0a16\u0a17\u0001\u0000\u0000"+
		"\u0000\u0a17\u0a18\u0005\u0089\u0000\u0000\u0a18\u0145\u0001\u0000\u0000"+
		"\u0000\u0a19\u0a1a\u0005\u0086\u0000\u0000\u0a1a\u0a1b\u0003\u013c\u009e"+
		"\u0000\u0a1b\u0a1e\u0005|\u0000\u0000\u0a1c\u0a1f\u0003\u00aaU\u0000\u0a1d"+
		"\u0a1f\u0005v\u0000\u0000\u0a1e\u0a1c\u0001\u0000\u0000\u0000\u0a1e\u0a1d"+
		"\u0001\u0000\u0000\u0000\u0a1f\u0a20\u0001\u0000\u0000\u0000\u0a20\u0a21"+
		"\u0005\u0087\u0000\u0000\u0a21\u0147\u0001\u0000\u0000\u0000\u0a22\u0a23"+
		"\u0005\u0086\u0000\u0000\u0a23\u0a24\u0003\u013c\u009e\u0000\u0a24\u0a25"+
		"\u0005\u0087\u0000\u0000\u0a25\u0149\u0001\u0000\u0000\u0000\u0a26\u0a28"+
		"\u0007\u0004\u0000\u0000\u0a27\u0a29\u0003\u0178\u00bc\u0000\u0a28\u0a27"+
		"\u0001\u0000\u0000\u0000\u0a28\u0a29\u0001\u0000\u0000\u0000\u0a29\u0a2b"+
		"\u0001\u0000\u0000\u0000\u0a2a\u0a2c\u0005\u0019\u0000\u0000\u0a2b\u0a2a"+
		"\u0001\u0000\u0000\u0000\u0a2b\u0a2c\u0001\u0000\u0000\u0000\u0a2c\u0a2e"+
		"\u0001\u0000\u0000\u0000\u0a2d\u0a2f\u0007\u0005\u0000\u0000\u0a2e\u0a2d"+
		"\u0001\u0000\u0000\u0000\u0a2e\u0a2f\u0001\u0000\u0000\u0000\u0a2f\u0a30"+
		"\u0001\u0000\u0000\u0000\u0a30\u0a31\u0003\u013e\u009f\u0000\u0a31\u014b"+
		"\u0001\u0000\u0000\u0000\u0a32\u0a33\u0005\\\u0000\u0000\u0a33\u0a34\u0007"+
		"\u0005\u0000\u0000\u0a34\u0a35\u0003\u013e\u009f\u0000\u0a35\u014d\u0001"+
		"\u0000\u0000\u0000\u0a36\u0a38\u0003\u0098L\u0000\u0a37\u0a36\u0001\u0000"+
		"\u0000\u0000\u0a37\u0a38\u0001\u0000\u0000\u0000\u0a38\u0a39\u0001\u0000"+
		"\u0000\u0000\u0a39\u0a3a\u0003\u0150\u00a8\u0000\u0a3a\u0a3b\u0005\n\u0000"+
		"\u0000\u0a3b\u0a3d\u0005\u0088\u0000\u0000\u0a3c\u0a3e\u0003\u0154\u00aa"+
		"\u0000\u0a3d\u0a3c\u0001\u0000\u0000\u0000\u0a3d\u0a3e\u0001\u0000\u0000"+
		"\u0000\u0a3e\u0a3f\u0001\u0000\u0000\u0000\u0a3f\u0a41\u0005\u0089\u0000"+
		"\u0000\u0a40\u0a42\u0003\u0152\u00a9\u0000\u0a41\u0a40\u0001\u0000\u0000"+
		"\u0000\u0a41\u0a42\u0001\u0000\u0000\u0000\u0a42\u014f\u0001\u0000\u0000"+
		"\u0000\u0a43\u0a45\u0007\u0002\u0000\u0000\u0a44\u0a43\u0001\u0000\u0000"+
		"\u0000\u0a44\u0a45\u0001\u0000\u0000\u0000\u0a45\u0a4a\u0001\u0000\u0000"+
		"\u0000\u0a46\u0a48\u0005\b\u0000\u0000\u0a47\u0a49\u0003B!\u0000\u0a48"+
		"\u0a47\u0001\u0000\u0000\u0000\u0a48\u0a49\u0001\u0000\u0000\u0000\u0a49"+
		"\u0a4b\u0001\u0000\u0000\u0000\u0a4a\u0a46\u0001\u0000\u0000\u0000\u0a4a"+
		"\u0a4b\u0001\u0000\u0000\u0000\u0a4b\u0151\u0001\u0000\u0000\u0000\u0a4c"+
		"\u0a4d\u0005\u007f\u0000\u0000\u0a4d\u0a4e\u0003\u013e\u009f\u0000\u0a4e"+
		"\u0153\u0001\u0000\u0000\u0000\u0a4f\u0a52\u0003\u0156\u00ab\u0000\u0a50"+
		"\u0a52\u0003\u015a\u00ad\u0000\u0a51\u0a4f\u0001\u0000\u0000\u0000\u0a51"+
		"\u0a50\u0001\u0000\u0000\u0000\u0a52\u0155\u0001\u0000\u0000\u0000\u0a53"+
		"\u0a58\u0003F#\u0000\u0a54\u0a55\u0005{\u0000\u0000\u0a55\u0a57\u0003"+
		"\u0158\u00ac\u0000\u0a56\u0a54\u0001\u0000\u0000\u0000\u0a57\u0a5a\u0001"+
		"\u0000\u0000\u0000\u0a58\u0a56\u0001\u0000\u0000\u0000\u0a58\u0a59\u0001"+
		"\u0000\u0000\u0000\u0a59\u0a5c\u0001\u0000\u0000\u0000\u0a5a\u0a58\u0001"+
		"\u0000\u0000\u0000\u0a5b\u0a5d\u0005{\u0000\u0000\u0a5c\u0a5b\u0001\u0000"+
		"\u0000\u0000\u0a5c\u0a5d\u0001\u0000\u0000\u0000\u0a5d\u0a6a\u0001\u0000"+
		"\u0000\u0000\u0a5e\u0a63\u0003\u0158\u00ac\u0000\u0a5f\u0a60\u0005{\u0000"+
		"\u0000\u0a60\u0a62\u0003\u0158\u00ac\u0000\u0a61\u0a5f\u0001\u0000\u0000"+
		"\u0000\u0a62\u0a65\u0001\u0000\u0000\u0000\u0a63\u0a61\u0001\u0000\u0000"+
		"\u0000\u0a63\u0a64\u0001\u0000\u0000\u0000\u0a64\u0a67\u0001\u0000\u0000"+
		"\u0000\u0a65\u0a63\u0001\u0000\u0000\u0000\u0a66\u0a68\u0005{\u0000\u0000"+
		"\u0a67\u0a66\u0001\u0000\u0000\u0000\u0a67\u0a68\u0001\u0000\u0000\u0000"+
		"\u0a68\u0a6a\u0001\u0000\u0000\u0000\u0a69\u0a53\u0001\u0000\u0000\u0000"+
		"\u0a69\u0a5e\u0001\u0000\u0000\u0000\u0a6a\u0157\u0001\u0000\u0000\u0000"+
		"\u0a6b\u0a6d\u0003\u009eO\u0000\u0a6c\u0a6b\u0001\u0000\u0000\u0000\u0a6d"+
		"\u0a70\u0001\u0000\u0000\u0000\u0a6e\u0a6c\u0001\u0000\u0000\u0000\u0a6e"+
		"\u0a6f\u0001\u0000\u0000\u0000\u0a6f\u0a76\u0001\u0000\u0000\u0000\u0a70"+
		"\u0a6e\u0001\u0000\u0000\u0000\u0a71\u0a74\u0003\u01a4\u00d2\u0000\u0a72"+
		"\u0a74\u0005v\u0000\u0000\u0a73\u0a71\u0001\u0000\u0000\u0000\u0a73\u0a72"+
		"\u0001\u0000\u0000\u0000\u0a74\u0a75\u0001\u0000\u0000\u0000\u0a75\u0a77"+
		"\u0005}\u0000\u0000\u0a76\u0a73\u0001\u0000\u0000\u0000\u0a76\u0a77\u0001"+
		"\u0000\u0000\u0000\u0a77\u0a7a\u0001\u0000\u0000\u0000\u0a78\u0a7b\u0003"+
		"\u013c\u009e\u0000\u0a79\u0a7b\u0005y\u0000\u0000\u0a7a\u0a78\u0001\u0000"+
		"\u0000\u0000\u0a7a\u0a79\u0001\u0000\u0000\u0000\u0a7b\u0159\u0001\u0000"+
		"\u0000\u0000\u0a7c\u0a7d\u0003\u0158\u00ac\u0000\u0a7d\u0a7e\u0005{\u0000"+
		"\u0000\u0a7e\u0a80\u0001\u0000\u0000\u0000\u0a7f\u0a7c\u0001\u0000\u0000"+
		"\u0000\u0a80\u0a83\u0001\u0000\u0000\u0000\u0a81\u0a7f\u0001\u0000\u0000"+
		"\u0000\u0a81\u0a82\u0001\u0000\u0000\u0000\u0a82\u0a84\u0001\u0000\u0000"+
		"\u0000\u0a83\u0a81\u0001\u0000\u0000\u0000\u0a84\u0a85\u0003\u0158\u00ac"+
		"\u0000\u0a85\u0a89\u0005{\u0000\u0000\u0a86\u0a88\u0003\u009eO\u0000\u0a87"+
		"\u0a86\u0001\u0000\u0000\u0000\u0a88\u0a8b\u0001\u0000\u0000\u0000\u0a89"+
		"\u0a87\u0001\u0000\u0000\u0000\u0a89\u0a8a\u0001\u0000\u0000\u0000\u0a8a"+
		"\u0a8c\u0001\u0000\u0000\u0000\u0a8b\u0a89\u0001\u0000\u0000\u0000\u0a8c"+
		"\u0a8d\u0005y\u0000\u0000\u0a8d\u015b\u0001\u0000\u0000\u0000\u0a8e\u0a8f"+
		"\u0005)\u0000\u0000\u0a8f\u0a91\u0004\u00ae\u0018\u0000\u0a90\u0a92\u0005"+
		"\\\u0000\u0000\u0a91\u0a90\u0001\u0000\u0000\u0000\u0a91\u0a92\u0001\u0000"+
		"\u0000\u0000\u0a92\u0a93\u0001\u0000\u0000\u0000\u0a93\u0a99\u0003\u0168"+
		"\u00b4\u0000\u0a94\u0a96\u0005\\\u0000\u0000\u0a95\u0a94\u0001\u0000\u0000"+
		"\u0000\u0a95\u0a96\u0001\u0000\u0000\u0000\u0a96\u0a97\u0001\u0000\u0000"+
		"\u0000\u0a97\u0a99\u0003\u0168\u00b4\u0000\u0a98\u0a8e\u0001\u0000\u0000"+
		"\u0000\u0a98\u0a95\u0001\u0000\u0000\u0000\u0a99\u015d\u0001\u0000\u0000"+
		"\u0000\u0a9a\u0a9c\u0005)\u0000\u0000\u0a9b\u0a9a\u0001\u0000\u0000\u0000"+
		"\u0a9b\u0a9c\u0001\u0000\u0000\u0000\u0a9c\u0a9e\u0001\u0000\u0000\u0000"+
		"\u0a9d\u0a9f\u0005\\\u0000\u0000\u0a9e\u0a9d\u0001\u0000\u0000\u0000\u0a9e"+
		"\u0a9f\u0001\u0000\u0000\u0000\u0a9f\u0aa0\u0001\u0000\u0000\u0000\u0aa0"+
		"\u0aa1\u0003\u016e\u00b7\u0000\u0aa1\u015f\u0001\u0000\u0000\u0000\u0aa2"+
		"\u0aa4\u0005\r\u0000\u0000\u0aa3\u0aa5\u0005\u0003\u0000\u0000\u0aa4\u0aa3"+
		"\u0001\u0000\u0000\u0000\u0aa4\u0aa5\u0001\u0000\u0000\u0000\u0aa5\u0aa6"+
		"\u0001\u0000\u0000\u0000\u0aa6\u0aa7\u0003\u0168\u00b4\u0000\u0aa7\u0161"+
		"\u0001\u0000\u0000\u0000\u0aa8\u0aaa\u0005\r\u0000\u0000\u0aa9\u0aab\u0005"+
		"\u0003\u0000\u0000\u0aaa\u0aa9\u0001\u0000\u0000\u0000\u0aaa\u0aab\u0001"+
		"\u0000\u0000\u0000\u0aab\u0aac\u0001\u0000\u0000\u0000\u0aac\u0ab3\u0003"+
		"\u0164\u00b2\u0000\u0aad\u0aaf\u0005\r\u0000\u0000\u0aae\u0ab0\u0005\u0003"+
		"\u0000\u0000\u0aaf\u0aae\u0001\u0000\u0000\u0000\u0aaf\u0ab0\u0001\u0000"+
		"\u0000\u0000\u0ab0\u0ab1\u0001\u0000\u0000\u0000\u0ab1\u0ab3\u0003\u016e"+
		"\u00b7\u0000\u0ab2\u0aa8\u0001\u0000\u0000\u0000\u0ab2\u0aad\u0001\u0000"+
		"\u0000\u0000\u0ab3\u0163\u0001\u0000\u0000\u0000\u0ab4\u0ab6\u0003\u0098"+
		"L\u0000\u0ab5\u0ab4\u0001\u0000\u0000\u0000\u0ab5\u0ab6\u0001\u0000\u0000"+
		"\u0000\u0ab6\u0ab8\u0001\u0000\u0000\u0000\u0ab7\u0ab9\u0005\'\u0000\u0000"+
		"\u0ab8\u0ab7\u0001\u0000\u0000\u0000\u0ab8\u0ab9\u0001\u0000\u0000\u0000"+
		"\u0ab9\u0aba\u0001\u0000\u0000\u0000\u0aba\u0abb\u0007\n\u0000\u0000\u0abb"+
		"\u0abd\u0005\u0088\u0000\u0000\u0abc\u0abe\u0003\u0154\u00aa\u0000\u0abd"+
		"\u0abc\u0001\u0000\u0000\u0000\u0abd\u0abe\u0001\u0000\u0000\u0000\u0abe"+
		"\u0abf\u0001\u0000\u0000\u0000\u0abf\u0ac2\u0005\u0089\u0000\u0000\u0ac0"+
		"\u0ac1\u0005\u007f\u0000\u0000\u0ac1\u0ac3\u0003\u013c\u009e\u0000\u0ac2"+
		"\u0ac0\u0001\u0000\u0000\u0000\u0ac2\u0ac3\u0001\u0000\u0000\u0000\u0ac3"+
		"\u0165\u0001\u0000\u0000\u0000\u0ac4\u0ac5\u0005v\u0000\u0000\u0ac5\u0167"+
		"\u0001\u0000\u0000\u0000\u0ac6\u0acb\u0003\u016a\u00b5\u0000\u0ac7\u0ac8"+
		"\u0005Z\u0000\u0000\u0ac8\u0aca\u0003\u016a\u00b5\u0000\u0ac9\u0ac7\u0001"+
		"\u0000\u0000\u0000\u0aca\u0acd\u0001\u0000\u0000\u0000\u0acb\u0ac9\u0001"+
		"\u0000\u0000\u0000\u0acb\u0acc\u0001\u0000\u0000\u0000\u0acc\u0acf\u0001"+
		"\u0000\u0000\u0000\u0acd\u0acb\u0001\u0000\u0000\u0000\u0ace\u0ad0\u0005"+
		"Z\u0000\u0000\u0acf\u0ace\u0001\u0000\u0000\u0000\u0acf\u0ad0\u0001\u0000"+
		"\u0000\u0000\u0ad0\u0169\u0001\u0000\u0000\u0000\u0ad1\u0ad7\u0003\u016c"+
		"\u00b6\u0000\u0ad2\u0ad3\u0005\u0088\u0000\u0000\u0ad3\u0ad4\u0003\u0168"+
		"\u00b4\u0000\u0ad4\u0ad5\u0005\u0089\u0000\u0000\u0ad5\u0ad7\u0001\u0000"+
		"\u0000\u0000\u0ad6\u0ad1\u0001\u0000\u0000\u0000\u0ad6\u0ad2\u0001\u0000"+
		"\u0000\u0000\u0ad7\u016b\u0001\u0000\u0000\u0000\u0ad8\u0add\u0003\u0178"+
		"\u00bc\u0000\u0ad9\u0add\u0003\u016e\u00b7\u0000\u0ada\u0add\u0003\u0164"+
		"\u00b2\u0000\u0adb\u0add\u0003\u0170\u00b8\u0000\u0adc\u0ad8\u0001\u0000"+
		"\u0000\u0000\u0adc\u0ad9\u0001\u0000\u0000\u0000\u0adc\u0ada\u0001\u0000"+
		"\u0000\u0000\u0adc\u0adb\u0001\u0000\u0000\u0000\u0add\u016d\u0001\u0000"+
		"\u0000\u0000\u0ade\u0ae0\u0005`\u0000\u0000\u0adf\u0ade\u0001\u0000\u0000"+
		"\u0000\u0adf\u0ae0\u0001\u0000\u0000\u0000\u0ae0\u0ae2\u0001\u0000\u0000"+
		"\u0000\u0ae1\u0ae3\u0005\u0083\u0000\u0000\u0ae2\u0ae1\u0001\u0000\u0000"+
		"\u0000\u0ae2\u0ae3\u0001\u0000\u0000\u0000\u0ae3\u0ae6\u0001\u0000\u0000"+
		"\u0000\u0ae4\u0ae5\u0005a\u0000\u0000\u0ae5\u0ae7\u0005\u0003\u0000\u0000"+
		"\u0ae6\u0ae4\u0001\u0000\u0000\u0000\u0ae6\u0ae7\u0001\u0000\u0000\u0000"+
		"\u0ae7\u0ae9\u0001\u0000\u0000\u0000\u0ae8\u0aea\u0003\u0098L\u0000\u0ae9"+
		"\u0ae8\u0001\u0000\u0000\u0000\u0ae9\u0aea\u0001\u0000\u0000\u0000\u0aea"+
		"\u0aed\u0001\u0000\u0000\u0000\u0aeb\u0aec\u0005a\u0000\u0000\u0aec\u0aee"+
		"\u0005\u0003\u0000\u0000\u0aed\u0aeb\u0001\u0000\u0000\u0000\u0aed\u0aee"+
		"\u0001\u0000\u0000\u0000\u0aee\u0aef\u0001\u0000\u0000\u0000\u0aef\u0b06"+
		"\u0003\u019a\u00cd\u0000\u0af0\u0af2\u0005\u0088\u0000\u0000\u0af1\u0af3"+
		"\u0005`\u0000\u0000\u0af2\u0af1\u0001\u0000\u0000\u0000\u0af2\u0af3\u0001"+
		"\u0000\u0000\u0000\u0af3\u0af5\u0001\u0000\u0000\u0000\u0af4\u0af6\u0005"+
		"\u0083\u0000\u0000\u0af5\u0af4\u0001\u0000\u0000\u0000\u0af5\u0af6\u0001"+
		"\u0000\u0000\u0000\u0af6\u0af9\u0001\u0000\u0000\u0000\u0af7\u0af8\u0005"+
		"a\u0000\u0000\u0af8\u0afa\u0005\u0003\u0000\u0000\u0af9\u0af7\u0001\u0000"+
		"\u0000\u0000\u0af9\u0afa\u0001\u0000\u0000\u0000\u0afa\u0afc\u0001\u0000"+
		"\u0000\u0000\u0afb\u0afd\u0003\u0098L\u0000\u0afc\u0afb\u0001\u0000\u0000"+
		"\u0000\u0afc\u0afd\u0001\u0000\u0000\u0000\u0afd\u0b00\u0001\u0000\u0000"+
		"\u0000\u0afe\u0aff\u0005a\u0000\u0000\u0aff\u0b01\u0005\u0003\u0000\u0000"+
		"\u0b00\u0afe\u0001\u0000\u0000\u0000\u0b00\u0b01\u0001\u0000\u0000\u0000"+
		"\u0b01\u0b02\u0001\u0000\u0000\u0000\u0b02\u0b03\u0003\u019a\u00cd\u0000"+
		"\u0b03\u0b04\u0005\u0089\u0000\u0000\u0b04\u0b06\u0001\u0000\u0000\u0000"+
		"\u0b05\u0adf\u0001\u0000\u0000\u0000\u0b05\u0af0\u0001\u0000\u0000\u0000"+
		"\u0b06\u016f\u0001\u0000\u0000\u0000\u0b07\u0b08\u0005#\u0000\u0000\u0b08"+
		"\u0b09\u0003\u0172\u00b9\u0000\u0b09\u0171\u0001\u0000\u0000\u0000\u0b0a"+
		"\u0b0b\u0005s\u0000\u0000\u0b0b\u0b1c\u0005r\u0000\u0000\u0b0c\u0b12\u0005"+
		"s\u0000\u0000\u0b0d\u0b0e\u0003\u0174\u00ba\u0000\u0b0e\u0b0f\u0005{\u0000"+
		"\u0000\u0b0f\u0b11\u0001\u0000\u0000\u0000\u0b10\u0b0d\u0001\u0000\u0000"+
		"\u0000\u0b11\u0b14\u0001\u0000\u0000\u0000\u0b12\u0b10\u0001\u0000\u0000"+
		"\u0000\u0b12\u0b13\u0001\u0000\u0000\u0000\u0b13\u0b15\u0001\u0000\u0000"+
		"\u0000\u0b14\u0b12\u0001\u0000\u0000\u0000\u0b15\u0b17\u0003\u0174\u00ba"+
		"\u0000\u0b16\u0b18\u0005{\u0000\u0000\u0b17\u0b16\u0001\u0000\u0000\u0000"+
		"\u0b17\u0b18\u0001\u0000\u0000\u0000\u0b18\u0b19\u0001\u0000\u0000\u0000"+
		"\u0b19\u0b1a\u0005r\u0000\u0000\u0b1a\u0b1c\u0001\u0000\u0000\u0000\u0b1b"+
		"\u0b0a\u0001\u0000\u0000\u0000\u0b1b\u0b0c\u0001\u0000\u0000\u0000\u0b1c"+
		"\u0173\u0001\u0000\u0000\u0000\u0b1d\u0b21\u0003\u0178\u00bc\u0000\u0b1e"+
		"\u0b21\u0003\u01a4\u00d2\u0000\u0b1f\u0b21\u0005\u001a\u0000\u0000\u0b20"+
		"\u0b1d\u0001\u0000\u0000\u0000\u0b20\u0b1e\u0001\u0000\u0000\u0000\u0b20"+
		"\u0b1f\u0001\u0000\u0000\u0000\u0b21\u0175\u0001\u0000\u0000\u0000\u0b22"+
		"\u0b23\u0003\u0178\u00bc\u0000\u0b23\u0b24\u0005Z\u0000\u0000\u0b24\u0b26"+
		"\u0001\u0000\u0000\u0000\u0b25\u0b22\u0001\u0000\u0000\u0000\u0b26\u0b29"+
		"\u0001\u0000\u0000\u0000\u0b27\u0b25\u0001\u0000\u0000\u0000\u0b27\u0b28"+
		"\u0001\u0000\u0000\u0000\u0b28\u0b2b\u0001\u0000\u0000\u0000\u0b29\u0b27"+
		"\u0001\u0000\u0000\u0000\u0b2a\u0b2c\u0003\u0178\u00bc\u0000\u0b2b\u0b2a"+
		"\u0001\u0000\u0000\u0000\u0b2b\u0b2c\u0001\u0000\u0000\u0000\u0b2c\u0177"+
		"\u0001\u0000\u0000\u0000\u0b2d\u0b2e\u0007\u000b\u0000\u0000\u0b2e\u0179"+
		"\u0001\u0000\u0000\u0000\u0b2f\u0b31\u0005~\u0000\u0000\u0b30\u0b2f\u0001"+
		"\u0000\u0000\u0000\u0b30\u0b31\u0001\u0000\u0000\u0000\u0b31\u0b32\u0001"+
		"\u0000\u0000\u0000\u0b32\u0b37\u0003\u017c\u00be\u0000\u0b33\u0b34\u0005"+
		"~\u0000\u0000\u0b34\u0b36\u0003\u017c\u00be\u0000\u0b35\u0b33\u0001\u0000"+
		"\u0000\u0000\u0b36\u0b39\u0001\u0000\u0000\u0000\u0b37\u0b35\u0001\u0000"+
		"\u0000\u0000\u0b37\u0b38\u0001\u0000\u0000\u0000\u0b38\u017b\u0001\u0000"+
		"\u0000\u0000\u0b39\u0b37\u0001\u0000\u0000\u0000\u0b3a\u0b42\u0003\u01a4"+
		"\u00d2\u0000\u0b3b\u0b42\u0005\u001d\u0000\u0000\u0b3c\u0b42\u0005\u0018"+
		"\u0000\u0000\u0b3d\u0b42\u0005\u0005\u0000\u0000\u0b3e\u0b42\u0005>\u0000"+
		"\u0000\u0b3f\u0b42\u00058\u0000\u0000\u0b40\u0b42\u0005*\u0000\u0000\u0b41"+
		"\u0b3a\u0001\u0000\u0000\u0000\u0b41\u0b3b\u0001\u0000\u0000\u0000\u0b41"+
		"\u0b3c\u0001\u0000\u0000\u0000\u0b41\u0b3d\u0001\u0000\u0000\u0000\u0b41"+
		"\u0b3e\u0001\u0000\u0000\u0000\u0b41\u0b3f\u0001\u0000\u0000\u0000\u0b41"+
		"\u0b40\u0001\u0000\u0000\u0000\u0b42\u017d\u0001\u0000\u0000\u0000\u0b43"+
		"\u0b45\u0005~\u0000\u0000\u0b44\u0b43\u0001\u0000\u0000\u0000\u0b44\u0b45"+
		"\u0001\u0000\u0000\u0000\u0b45\u0b46\u0001\u0000\u0000\u0000\u0b46\u0b4b"+
		"\u0003\u0180\u00c0\u0000\u0b47\u0b48\u0005~\u0000\u0000\u0b48\u0b4a\u0003"+
		"\u0180\u00c0\u0000\u0b49\u0b47\u0001\u0000\u0000\u0000\u0b4a\u0b4d\u0001"+
		"\u0000\u0000\u0000\u0b4b\u0b49\u0001\u0000\u0000\u0000\u0b4b\u0b4c\u0001"+
		"\u0000\u0000\u0000\u0b4c\u017f\u0001\u0000\u0000\u0000\u0b4d\u0b4b\u0001"+
		"\u0000\u0000\u0000\u0b4e\u0b51\u0003\u0182\u00c1\u0000\u0b4f\u0b50\u0005"+
		"~\u0000\u0000\u0b50\u0b52\u0003\u0184\u00c2\u0000\u0b51\u0b4f\u0001\u0000"+
		"\u0000\u0000\u0b51\u0b52\u0001\u0000\u0000\u0000\u0b52\u0181\u0001\u0000"+
		"\u0000\u0000\u0b53\u0b5b\u0003\u01a4\u00d2\u0000\u0b54\u0b5b\u0005)\u0000"+
		"\u0000\u0b55\u0b5b\u0005\u001d\u0000\u0000\u0b56\u0b5b\u0005\u0018\u0000"+
		"\u0000\u0b57\u0b5b\u0005\u001a\u0000\u0000\u0b58\u0b5b\u0005\u0005\u0000"+
		"\u0000\u0b59\u0b5b\u0005>\u0000\u0000\u0b5a\u0b53\u0001\u0000\u0000\u0000"+
		"\u0b5a\u0b54\u0001\u0000\u0000\u0000\u0b5a\u0b55\u0001\u0000\u0000\u0000"+
		"\u0b5a\u0b56\u0001\u0000\u0000\u0000\u0b5a\u0b57\u0001\u0000\u0000\u0000"+
		"\u0b5a\u0b58\u0001\u0000\u0000\u0000\u0b5a\u0b59\u0001\u0000\u0000\u0000"+
		"\u0b5b\u0183\u0001\u0000\u0000\u0000\u0b5c\u0b5d\u0005s\u0000\u0000\u0b5d"+
		"\u0b88\u0005r\u0000\u0000\u0b5e\u0b5f\u0005s\u0000\u0000\u0b5f\u0b62\u0003"+
		"\u018a\u00c5\u0000\u0b60\u0b61\u0005{\u0000\u0000\u0b61\u0b63\u0003\u018c"+
		"\u00c6\u0000\u0b62\u0b60\u0001\u0000\u0000\u0000\u0b62\u0b63\u0001\u0000"+
		"\u0000\u0000\u0b63\u0b66\u0001\u0000\u0000\u0000\u0b64\u0b65\u0005{\u0000"+
		"\u0000\u0b65\u0b67\u0003\u018e\u00c7\u0000\u0b66\u0b64\u0001\u0000\u0000"+
		"\u0000\u0b66\u0b67\u0001\u0000\u0000\u0000\u0b67\u0b69\u0001\u0000\u0000"+
		"\u0000\u0b68\u0b6a\u0005{\u0000\u0000\u0b69\u0b68\u0001\u0000\u0000\u0000"+
		"\u0b69\u0b6a\u0001\u0000\u0000\u0000\u0b6a\u0b6b\u0001\u0000\u0000\u0000"+
		"\u0b6b\u0b6c\u0005r\u0000\u0000\u0b6c\u0b88\u0001\u0000\u0000\u0000\u0b6d"+
		"\u0b6e\u0005s\u0000\u0000\u0b6e\u0b71\u0003\u018c\u00c6\u0000\u0b6f\u0b70"+
		"\u0005{\u0000\u0000\u0b70\u0b72\u0003\u018e\u00c7\u0000\u0b71\u0b6f\u0001"+
		"\u0000\u0000\u0000\u0b71\u0b72\u0001\u0000\u0000\u0000\u0b72\u0b74\u0001"+
		"\u0000\u0000\u0000\u0b73\u0b75\u0005{\u0000\u0000\u0b74\u0b73\u0001\u0000"+
		"\u0000\u0000\u0b74\u0b75\u0001\u0000\u0000\u0000\u0b75\u0b76\u0001\u0000"+
		"\u0000\u0000\u0b76\u0b77\u0005r\u0000\u0000\u0b77\u0b88\u0001\u0000\u0000"+
		"\u0000\u0b78\u0b7e\u0005s\u0000\u0000\u0b79\u0b7a\u0003\u0186\u00c3\u0000"+
		"\u0b7a\u0b7b\u0005{\u0000\u0000\u0b7b\u0b7d\u0001\u0000\u0000\u0000\u0b7c"+
		"\u0b79\u0001\u0000\u0000\u0000\u0b7d\u0b80\u0001\u0000\u0000\u0000\u0b7e"+
		"\u0b7c\u0001\u0000\u0000\u0000\u0b7e\u0b7f\u0001\u0000\u0000\u0000\u0b7f"+
		"\u0b81\u0001\u0000\u0000\u0000\u0b80\u0b7e\u0001\u0000\u0000\u0000\u0b81"+
		"\u0b83\u0003\u0186\u00c3\u0000\u0b82\u0b84\u0005{\u0000\u0000\u0b83\u0b82"+
		"\u0001\u0000\u0000\u0000\u0b83\u0b84\u0001\u0000\u0000\u0000\u0b84\u0b85"+
		"\u0001\u0000\u0000\u0000\u0b85\u0b86\u0005r\u0000\u0000\u0b86\u0b88\u0001"+
		"\u0000\u0000\u0000\u0b87\u0b5c\u0001\u0000\u0000\u0000\u0b87\u0b5e\u0001"+
		"\u0000\u0000\u0000\u0b87\u0b6d\u0001\u0000\u0000\u0000\u0b87\u0b78\u0001"+
		"\u0000\u0000\u0000\u0b88\u0185\u0001\u0000\u0000\u0000\u0b89\u0b8f\u0003"+
		"\u0178\u00bc\u0000\u0b8a\u0b8f\u0003\u013c\u009e\u0000\u0b8b\u0b8f\u0003"+
		"\u0188\u00c4\u0000\u0b8c\u0b8f\u0003\u0190\u00c8\u0000\u0b8d\u0b8f\u0003"+
		"\u0192\u00c9\u0000\u0b8e\u0b89\u0001\u0000\u0000\u0000\u0b8e\u0b8a\u0001"+
		"\u0000\u0000\u0000\u0b8e\u0b8b\u0001\u0000\u0000\u0000\u0b8e\u0b8c\u0001"+
		"\u0000\u0000\u0000\u0b8e\u0b8d\u0001\u0000\u0000\u0000\u0b8f\u0187\u0001"+
		"\u0000\u0000\u0000\u0b90\u0b97\u0003\u00ba]\u0000\u0b91\u0b93\u0005[\u0000"+
		"\u0000\u0b92\u0b91\u0001\u0000\u0000\u0000\u0b92\u0b93\u0001\u0000\u0000"+
		"\u0000\u0b93\u0b94\u0001\u0000\u0000\u0000\u0b94\u0b97\u0003\u00b6[\u0000"+
		"\u0b95\u0b97\u0003\u017c\u00be\u0000\u0b96\u0b90\u0001\u0000\u0000\u0000"+
		"\u0b96\u0b92\u0001\u0000\u0000\u0000\u0b96\u0b95\u0001\u0000\u0000\u0000"+
		"\u0b97\u0189\u0001\u0000\u0000\u0000\u0b98\u0b9d\u0003\u0178\u00bc\u0000"+
		"\u0b99\u0b9a\u0005{\u0000\u0000\u0b9a\u0b9c\u0003\u0178\u00bc\u0000\u0b9b"+
		"\u0b99\u0001\u0000\u0000\u0000\u0b9c\u0b9f\u0001\u0000\u0000\u0000\u0b9d"+
		"\u0b9b\u0001\u0000\u0000\u0000\u0b9d\u0b9e\u0001\u0000\u0000\u0000\u0b9e"+
		"\u018b\u0001\u0000\u0000\u0000\u0b9f\u0b9d\u0001\u0000\u0000\u0000\u0ba0"+
		"\u0ba5\u0003\u013c\u009e\u0000\u0ba1\u0ba2\u0005{\u0000\u0000\u0ba2\u0ba4"+
		"\u0003\u013c\u009e\u0000\u0ba3\u0ba1\u0001\u0000\u0000\u0000\u0ba4\u0ba7"+
		"\u0001\u0000\u0000\u0000\u0ba5\u0ba3\u0001\u0000\u0000\u0000\u0ba5\u0ba6"+
		"\u0001\u0000\u0000\u0000\u0ba6\u018d\u0001\u0000\u0000\u0000\u0ba7\u0ba5"+
		"\u0001\u0000\u0000\u0000\u0ba8\u0bad\u0003\u0190\u00c8\u0000\u0ba9\u0baa"+
		"\u0005{\u0000\u0000\u0baa\u0bac\u0003\u0190\u00c8\u0000\u0bab\u0ba9\u0001"+
		"\u0000\u0000\u0000\u0bac\u0baf\u0001\u0000\u0000\u0000\u0bad\u0bab\u0001"+
		"\u0000\u0000\u0000\u0bad\u0bae\u0001\u0000\u0000\u0000\u0bae\u018f\u0001"+
		"\u0000\u0000\u0000\u0baf\u0bad\u0001\u0000\u0000\u0000\u0bb0\u0bb2\u0003"+
		"\u01a4\u00d2\u0000\u0bb1\u0bb3\u0005~\u0000\u0000\u0bb2\u0bb1\u0001\u0000"+
		"\u0000\u0000\u0bb2\u0bb3\u0001\u0000\u0000\u0000\u0bb3\u0bb6\u0001\u0000"+
		"\u0000\u0000\u0bb4\u0bb7\u0003\u0184\u00c2\u0000\u0bb5\u0bb7\u0003\u019e"+
		"\u00cf\u0000\u0bb6\u0bb4\u0001\u0000\u0000\u0000\u0bb6\u0bb5\u0001\u0000"+
		"\u0000\u0000\u0bb6\u0bb7\u0001\u0000\u0000\u0000\u0bb7\u0bb8\u0001\u0000"+
		"\u0000\u0000\u0bb8\u0bbb\u0005o\u0000\u0000\u0bb9\u0bbc\u0003\u013c\u009e"+
		"\u0000\u0bba\u0bbc\u0003\u00aaU\u0000\u0bbb\u0bb9\u0001\u0000\u0000\u0000"+
		"\u0bbb\u0bba\u0001\u0000\u0000\u0000\u0bbc\u0191\u0001\u0000\u0000\u0000"+
		"\u0bbd\u0bbf\u0003\u01a4\u00d2\u0000\u0bbe\u0bc0\u0005~\u0000\u0000\u0bbf"+
		"\u0bbe\u0001\u0000\u0000\u0000\u0bbf\u0bc0\u0001\u0000\u0000\u0000\u0bc0"+
		"\u0bc3\u0001\u0000\u0000\u0000\u0bc1\u0bc4\u0003\u0184\u00c2\u0000\u0bc2"+
		"\u0bc4\u0003\u019e\u00cf\u0000\u0bc3\u0bc1\u0001\u0000\u0000\u0000\u0bc3"+
		"\u0bc2\u0001\u0000\u0000\u0000\u0bc3\u0bc4\u0001\u0000\u0000\u0000\u0bc4"+
		"\u0bc5\u0001\u0000\u0000\u0000\u0bc5\u0bc6\u0005}\u0000\u0000\u0bc6\u0bc7"+
		"\u0003\u0168\u00b4\u0000\u0bc7\u0193\u0001\u0000\u0000\u0000\u0bc8\u0bcb"+
		"\u0003\u0196\u00cb\u0000\u0bc9\u0bca\u0005~\u0000\u0000\u0bca\u0bcc\u0003"+
		"\u0180\u00c0\u0000\u0bcb\u0bc9\u0001\u0000\u0000\u0000\u0bcc\u0bcd\u0001"+
		"\u0000\u0000\u0000\u0bcd\u0bcb\u0001\u0000\u0000\u0000\u0bcd\u0bce\u0001"+
		"\u0000\u0000\u0000\u0bce\u0195\u0001\u0000\u0000\u0000\u0bcf\u0bd0\u0005"+
		"s\u0000\u0000\u0bd0\u0bd3\u0003\u013c\u009e\u0000\u0bd1\u0bd2\u0005\u0001"+
		"\u0000\u0000\u0bd2\u0bd4\u0003\u019a\u00cd\u0000\u0bd3\u0bd1\u0001\u0000"+
		"\u0000\u0000\u0bd3\u0bd4\u0001\u0000\u0000\u0000\u0bd4\u0bd5\u0001\u0000"+
		"\u0000\u0000\u0bd5\u0bd6\u0005r\u0000\u0000\u0bd6\u0197\u0001\u0000\u0000"+
		"\u0000\u0bd7\u0bda\u0003\u0196\u00cb\u0000\u0bd8\u0bd9\u0005~\u0000\u0000"+
		"\u0bd9\u0bdb\u0003\u019c\u00ce\u0000\u0bda\u0bd8\u0001\u0000\u0000\u0000"+
		"\u0bdb\u0bdc\u0001\u0000\u0000\u0000\u0bdc\u0bda\u0001\u0000\u0000\u0000"+
		"\u0bdc\u0bdd\u0001\u0000\u0000\u0000\u0bdd\u0199\u0001\u0000\u0000\u0000"+
		"\u0bde\u0be0\u0005~\u0000\u0000\u0bdf\u0bde\u0001\u0000\u0000\u0000\u0bdf"+
		"\u0be0\u0001\u0000\u0000\u0000\u0be0\u0be1\u0001\u0000\u0000\u0000\u0be1"+
		"\u0be6\u0003\u019c\u00ce\u0000\u0be2\u0be3\u0005~\u0000\u0000\u0be3\u0be5"+
		"\u0003\u019c\u00ce\u0000\u0be4\u0be2\u0001\u0000\u0000\u0000\u0be5\u0be8"+
		"\u0001\u0000\u0000\u0000\u0be6\u0be4\u0001\u0000\u0000\u0000\u0be6\u0be7"+
		"\u0001\u0000\u0000\u0000\u0be7\u019b\u0001\u0000\u0000\u0000\u0be8\u0be6"+
		"\u0001\u0000\u0000\u0000\u0be9\u0beb\u0003\u0182\u00c1\u0000\u0bea\u0bec"+
		"\u0005~\u0000\u0000\u0beb\u0bea\u0001\u0000\u0000\u0000\u0beb\u0bec\u0001"+
		"\u0000\u0000\u0000\u0bec\u0bef\u0001\u0000\u0000\u0000\u0bed\u0bf0\u0003"+
		"\u0184\u00c2\u0000\u0bee\u0bf0\u0003\u019e\u00cf\u0000\u0bef\u0bed\u0001"+
		"\u0000\u0000\u0000\u0bef\u0bee\u0001\u0000\u0000\u0000\u0bef\u0bf0\u0001"+
		"\u0000\u0000\u0000\u0bf0\u019d\u0001\u0000\u0000\u0000\u0bf1\u0bf4\u0005"+
		"\u0088\u0000\u0000\u0bf2\u0bf5\u0003\u01a0\u00d0\u0000\u0bf3\u0bf5\u0005"+
		"x\u0000\u0000\u0bf4\u0bf2\u0001\u0000\u0000\u0000\u0bf4\u0bf3\u0001\u0000"+
		"\u0000\u0000\u0bf4\u0bf5\u0001\u0000\u0000\u0000\u0bf5\u0bf6\u0001\u0000"+
		"\u0000\u0000\u0bf6\u0bf9\u0005\u0089\u0000\u0000\u0bf7\u0bf8\u0005\u007f"+
		"\u0000\u0000\u0bf8\u0bfa\u0003\u013c\u009e\u0000\u0bf9\u0bf7\u0001\u0000"+
		"\u0000\u0000\u0bf9\u0bfa\u0001\u0000\u0000\u0000\u0bfa\u019f\u0001\u0000"+
		"\u0000\u0000\u0bfb\u0c00\u0003\u013c\u009e\u0000\u0bfc\u0bfd\u0005{\u0000"+
		"\u0000\u0bfd\u0bff\u0003\u013c\u009e\u0000\u0bfe\u0bfc\u0001\u0000\u0000"+
		"\u0000\u0bff\u0c02\u0001\u0000\u0000\u0000\u0c00\u0bfe\u0001\u0000\u0000"+
		"\u0000\u0c00\u0c01\u0001\u0000\u0000\u0000\u0c01\u0c04\u0001\u0000\u0000"+
		"\u0000\u0c02\u0c00\u0001\u0000\u0000\u0000\u0c03\u0c05\u0005{\u0000\u0000"+
		"\u0c04\u0c03\u0001\u0000\u0000\u0000\u0c04\u0c05\u0001\u0000\u0000\u0000"+
		"\u0c05\u01a1\u0001\u0000\u0000\u0000\u0c06\u0c10\u0005\u0015\u0000\u0000"+
		"\u0c07\u0c0d\u0005\u0088\u0000\u0000\u0c08\u0c0e\u0005\u0005\u0000\u0000"+
		"\u0c09\u0c0e\u0005\u0018\u0000\u0000\u0c0a\u0c0e\u0005\u001d\u0000\u0000"+
		"\u0c0b\u0c0c\u0005\u000e\u0000\u0000\u0c0c\u0c0e\u0003\u017a\u00bd\u0000"+
		"\u0c0d\u0c08\u0001\u0000\u0000\u0000\u0c0d\u0c09\u0001\u0000\u0000\u0000"+
		"\u0c0d\u0c0a\u0001\u0000\u0000\u0000\u0c0d\u0c0b\u0001\u0000\u0000\u0000"+
		"\u0c0e\u0c0f\u0001\u0000\u0000\u0000\u0c0f\u0c11\u0005\u0089\u0000\u0000"+
		"\u0c10\u0c07\u0001\u0000\u0000\u0000\u0c10\u0c11\u0001\u0000\u0000\u0000"+
		"\u0c11\u01a3\u0001\u0000\u0000\u0000\u0c12\u0c13\u0007\f\u0000\u0000\u0c13"+
		"\u01a5\u0001\u0000\u0000\u0000\u0c14\u0c15\u0007\r\u0000\u0000\u0c15\u01a7"+
		"\u0001\u0000\u0000\u0000\u0c16\u0c17\u0007\u000e\u0000\u0000\u0c17\u01a9"+
		"\u0001\u0000\u0000\u0000\u0c18\u0c1e\u0003\u01a6\u00d3\u0000\u0c19\u0c1e"+
		"\u0003\u01a4\u00d2\u0000\u0c1a\u0c1e\u0005=\u0000\u0000\u0c1b\u0c1e\u0005"+
		">\u0000\u0000\u0c1c\u0c1e\u0005Y\u0000\u0000\u0c1d\u0c18\u0001\u0000\u0000"+
		"\u0000\u0c1d\u0c19\u0001\u0000\u0000\u0000\u0c1d\u0c1a\u0001\u0000\u0000"+
		"\u0000\u0c1d\u0c1b\u0001\u0000\u0000\u0000\u0c1d\u0c1c\u0001\u0000\u0000"+
		"\u0000\u0c1e\u01ab\u0001\u0000\u0000\u0000\u0c1f\u0c20\u0003\u00b6[\u0000"+
		"\u0c20\u01ad\u0001\u0000\u0000\u0000\u0c21\u0c4d\u0005[\u0000\u0000\u0c22"+
		"\u0c4d\u0005]\u0000\u0000\u0c23\u0c4d\u0005^\u0000\u0000\u0c24\u0c4d\u0005"+
		"_\u0000\u0000\u0c25\u0c4d\u0005`\u0000\u0000\u0c26\u0c4d\u0005b\u0000"+
		"\u0000\u0c27\u0c4d\u0005c\u0000\u0000\u0c28\u0c4d\u0005d\u0000\u0000\u0c29"+
		"\u0c4d\u0005e\u0000\u0000\u0c2a\u0c4d\u0005f\u0000\u0000\u0c2b\u0c4d\u0005"+
		"g\u0000\u0000\u0c2c\u0c4d\u0005h\u0000\u0000\u0c2d\u0c4d\u0005i\u0000"+
		"\u0000\u0c2e\u0c4d\u0005j\u0000\u0000\u0c2f\u0c4d\u0005k\u0000\u0000\u0c30"+
		"\u0c4d\u0005l\u0000\u0000\u0c31\u0c4d\u0005m\u0000\u0000\u0c32\u0c4d\u0005"+
		"n\u0000\u0000\u0c33\u0c34\u0005r\u0000\u0000\u0c34\u0c35\u0005r\u0000"+
		"\u0000\u0c35\u0c4d\u0005o\u0000\u0000\u0c36\u0c4d\u0005o\u0000\u0000\u0c37"+
		"\u0c4d\u0005p\u0000\u0000\u0c38\u0c4d\u0005q\u0000\u0000\u0c39\u0c4d\u0005"+
		"r\u0000\u0000\u0c3a\u0c4d\u0005s\u0000\u0000\u0c3b\u0c3c\u0005r\u0000"+
		"\u0000\u0c3c\u0c4d\u0005o\u0000\u0000\u0c3d\u0c4d\u0005t\u0000\u0000\u0c3e"+
		"\u0c4d\u0005u\u0000\u0000\u0c3f\u0c4d\u0005v\u0000\u0000\u0c40\u0c4d\u0005"+
		"w\u0000\u0000\u0c41\u0c4d\u0005x\u0000\u0000\u0c42\u0c4d\u0005y\u0000"+
		"\u0000\u0c43\u0c4d\u0005z\u0000\u0000\u0c44\u0c4d\u0005{\u0000\u0000\u0c45"+
		"\u0c4d\u0005|\u0000\u0000\u0c46\u0c4d\u0005}\u0000\u0000\u0c47\u0c4d\u0005"+
		"~\u0000\u0000\u0c48\u0c4d\u0005\u007f\u0000\u0000\u0c49\u0c4d\u0005\u0080"+
		"\u0000\u0000\u0c4a\u0c4d\u0005\u0081\u0000\u0000\u0c4b\u0c4d\u0005a\u0000"+
		"\u0000\u0c4c\u0c21\u0001\u0000\u0000\u0000\u0c4c\u0c22\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c23\u0001\u0000\u0000\u0000\u0c4c\u0c24\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c25\u0001\u0000\u0000\u0000\u0c4c\u0c26\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c27\u0001\u0000\u0000\u0000\u0c4c\u0c28\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c29\u0001\u0000\u0000\u0000\u0c4c\u0c2a\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c2b\u0001\u0000\u0000\u0000\u0c4c\u0c2c\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c2d\u0001\u0000\u0000\u0000\u0c4c\u0c2e\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c2f\u0001\u0000\u0000\u0000\u0c4c\u0c30\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c31\u0001\u0000\u0000\u0000\u0c4c\u0c32\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c33\u0001\u0000\u0000\u0000\u0c4c\u0c36\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c37\u0001\u0000\u0000\u0000\u0c4c\u0c38\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c39\u0001\u0000\u0000\u0000\u0c4c\u0c3a\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c3b\u0001\u0000\u0000\u0000\u0c4c\u0c3d\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c3e\u0001\u0000\u0000\u0000\u0c4c\u0c3f\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c40\u0001\u0000\u0000\u0000\u0c4c\u0c41\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c42\u0001\u0000\u0000\u0000\u0c4c\u0c43\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c44\u0001\u0000\u0000\u0000\u0c4c\u0c45\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c46\u0001\u0000\u0000\u0000\u0c4c\u0c47\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c48\u0001\u0000\u0000\u0000\u0c4c\u0c49\u0001\u0000\u0000"+
		"\u0000\u0c4c\u0c4a\u0001\u0000\u0000\u0000\u0c4c\u0c4b\u0001\u0000\u0000"+
		"\u0000\u0c4d\u01af\u0001\u0000\u0000\u0000\u0c4e\u0c4f\u0005s\u0000\u0000"+
		"\u0c4f\u0c50\u0004\u00d8\u0019\u0000\u0c50\u0c51\u0005s\u0000\u0000\u0c51"+
		"\u01b1\u0001\u0000\u0000\u0000\u0c52\u0c53\u0005r\u0000\u0000\u0c53\u0c54"+
		"\u0004\u00d9\u001a\u0000\u0c54\u0c55\u0005r\u0000\u0000\u0c55\u01b3\u0001"+
		"\u0000\u0000\u0000\u01d5\u01b7\u01bd\u01c5\u01cd\u01d5\u01dd\u01e1\u01e6"+
		"\u01e9\u01f0\u01f5\u01fb\u0204\u020a\u0213\u0219\u021e\u0226\u022e\u0232"+
		"\u0238\u0249\u024c\u0253\u0257\u0261\u0269\u0271\u0275\u027a\u0281\u028a"+
		"\u028e\u0292\u0298\u02a0\u02a9\u02ae\u02b1\u02c1\u02c6\u02c9\u02d2\u02d8"+
		"\u02dc\u02e2\u02e8\u02ed\u02f6\u02fa\u0300\u0308\u030a\u0311\u0316\u031a"+
		"\u031e\u0321\u0324\u032d\u0331\u0333\u0336\u033c\u033e\u0340\u0346\u034a"+
		"\u034e\u0351\u0355\u0358\u035b\u035e\u0361\u0364\u0368\u036a\u0370\u0375"+
		"\u037c\u0380\u0382\u0387\u038c\u0390\u0392\u0395\u039a\u03a3\u03a9\u03af"+
		"\u03b5\u03ba\u03be\u03c0\u03c3\u03c8\u03ca\u03d0\u03d5\u03d8\u03dc\u03e0"+
		"\u03e5\u03e9\u03ed\u03f6\u03fa\u03ff\u0403\u0406\u040d\u0414\u0418\u041d"+
		"\u0421\u0428\u042b\u042f\u0438\u043c\u0441\u0445\u044a\u044d\u0451\u0457"+
		"\u0462\u0465\u0469\u046e\u0473\u0476\u047c\u047f\u0484\u0488\u048f\u0494"+
		"\u0497\u049c\u04a0\u04a2\u04a5\u04ab\u04b1\u04b7\u04ba\u04bf\u04c3\u04c5"+
		"\u04c9\u04cc\u04d0\u04d4\u04dc\u04e0\u04e3\u04e7\u04ed\u04f3\u04fe\u0502"+
		"\u0505\u0508\u050e\u0514\u051a\u0520\u0524\u052a\u0530\u0538\u053d\u0542"+
		"\u0544\u0549\u054d\u0550\u0553\u0557\u0561\u0566\u0568\u056f\u0575\u0578"+
		"\u057d\u0580\u0585\u0587\u058b\u0593\u059b\u059d\u05a7\u05aa\u05ad\u05b2"+
		"\u05b9\u05be\u05c1\u05c4\u05d0\u05d6\u05db\u05dd\u05ec\u05f2\u05f6\u05fb"+
		"\u0602\u0607\u0611\u0617\u0619\u0622\u0624\u062a\u0632\u063f\u064c\u064f"+
		"\u0653\u0656\u065a\u0661\u0665\u066b\u0675\u0679\u0680\u0684\u068d\u0698"+
		"\u06c3\u06c7\u06cf\u06d8\u06e3\u06f3\u06f5\u06f7\u0701\u070f\u0714\u0723"+
		"\u0727\u072e\u0734\u0738\u073c\u0740\u0744\u0748\u074c\u0750\u0754\u0759"+
		"\u075d\u0761\u0767\u076b\u0772\u0775\u0778\u077c\u078e\u0792\u0798\u079f"+
		"\u07a2\u07a9\u07ad\u07b3\u07b8\u07c1\u07c7\u07c9\u07ce\u07d4\u07d9\u07dd"+
		"\u07e4\u07ec\u07f0\u07f2\u07fb\u0800\u0809\u080d\u0812\u0817\u0820\u0824"+
		"\u0826\u0831\u0835\u0838\u083b\u083e\u0841\u0844\u0849\u084c\u0853\u085a"+
		"\u085e\u0863\u0869\u086c\u0872\u0877\u0899\u089b\u08a7\u08a9\u08b6\u08ba"+
		"\u08c4\u08cb\u08cf\u08d1\u08d8\u08da\u08df\u08e4\u08ea\u08f1\u08f6\u08fd"+
		"\u090e\u091d\u0921\u0924\u0929\u092f\u0948\u094d\u0951\u0956\u095a\u0960"+
		"\u0964\u096b\u096d\u0970\u0977\u097d\u0989\u098c\u0990\u0995\u099c\u09a0"+
		"\u09a9\u09ad\u09b1\u09be\u09c1\u09c3\u09cb\u09d4\u09d8\u09dc\u09e8\u09ee"+
		"\u0a02\u0a10\u0a13\u0a15\u0a1e\u0a28\u0a2b\u0a2e\u0a37\u0a3d\u0a41\u0a44"+
		"\u0a48\u0a4a\u0a51\u0a58\u0a5c\u0a63\u0a67\u0a69\u0a6e\u0a73\u0a76\u0a7a"+
		"\u0a81\u0a89\u0a91\u0a95\u0a98\u0a9b\u0a9e\u0aa4\u0aaa\u0aaf\u0ab2\u0ab5"+
		"\u0ab8\u0abd\u0ac2\u0acb\u0acf\u0ad6\u0adc\u0adf\u0ae2\u0ae6\u0ae9\u0aed"+
		"\u0af2\u0af5\u0af9\u0afc\u0b00\u0b05\u0b12\u0b17\u0b1b\u0b20\u0b27\u0b2b"+
		"\u0b30\u0b37\u0b41\u0b44\u0b4b\u0b51\u0b5a\u0b62\u0b66\u0b69\u0b71\u0b74"+
		"\u0b7e\u0b83\u0b87\u0b8e\u0b92\u0b96\u0b9d\u0ba5\u0bad\u0bb2\u0bb6\u0bbb"+
		"\u0bbf\u0bc3\u0bcd\u0bd3\u0bdc\u0bdf\u0be6\u0beb\u0bef\u0bf4\u0bf9\u0c00"+
		"\u0c04\u0c0d\u0c10\u0c1d\u0c4c";
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