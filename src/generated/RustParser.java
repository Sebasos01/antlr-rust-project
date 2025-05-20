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
		RSQUAREBRACKET=135, LPAREN=136, RPAREN=137;
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
		RULE_typeBoundWhereClauseItem = 70, RULE_equalityBound = 71, RULE_forLifetimes = 72, 
		RULE_associatedItem = 73, RULE_innerAttribute = 74, RULE_outerAttribute = 75, 
		RULE_attr = 76, RULE_attrInput = 77, RULE_statement = 78, RULE_letStatement = 79, 
		RULE_expressionStatement = 80, RULE_expression = 81, RULE_comparisonOperator = 82, 
		RULE_compoundAssignOperator = 83, RULE_expressionWithBlock = 84, RULE_generatorBlockExpression = 85, 
		RULE_asyncGeneratorBlockExpression = 86, RULE_literalExpression = 87, 
		RULE_pathExpression = 88, RULE_blockExpression = 89, RULE_statements = 90, 
		RULE_asyncBlockExpression = 91, RULE_unsafeBlockExpression = 92, RULE_constBlockExpression = 93, 
		RULE_tryBlockExpression = 94, RULE_arrayElements = 95, RULE_tupleElements = 96, 
		RULE_tupleIndex = 97, RULE_structExpression = 98, RULE_structExprStruct = 99, 
		RULE_structExprFields = 100, RULE_structExprField = 101, RULE_structBase = 102, 
		RULE_structExprTuple = 103, RULE_structExprUnit = 104, RULE_enumerationVariantExpression = 105, 
		RULE_enumExprStruct = 106, RULE_enumExprFields = 107, RULE_enumExprField = 108, 
		RULE_enumExprTuple = 109, RULE_enumExprFieldless = 110, RULE_callParams = 111, 
		RULE_closureExpression = 112, RULE_closureParameters = 113, RULE_closureParam = 114, 
		RULE_loopExpression = 115, RULE_infiniteLoopExpression = 116, RULE_predicateLoopExpression = 117, 
		RULE_predicatePatternLoopExpression = 118, RULE_iteratorLoopExpression = 119, 
		RULE_labelBlockExpression = 120, RULE_loopLabel = 121, RULE_ifExpression = 122, 
		RULE_ifLetExpression = 123, RULE_letExpression = 124, RULE_matchExpression = 125, 
		RULE_matchArms = 126, RULE_matchArmExpression = 127, RULE_matchArm = 128, 
		RULE_matchArmGuard = 129, RULE_pattern = 130, RULE_patternNoTopAlt = 131, 
		RULE_patternWithoutRange = 132, RULE_boxPattern = 133, RULE_literalPattern = 134, 
		RULE_identifierPattern = 135, RULE_wildcardPattern = 136, RULE_restPattern = 137, 
		RULE_rangePattern = 138, RULE_rangePatternBound = 139, RULE_referencePattern = 140, 
		RULE_structPattern = 141, RULE_structPatternElements = 142, RULE_structPatternFields = 143, 
		RULE_structPatternField = 144, RULE_structPatternEtCetera = 145, RULE_tupleStructPattern = 146, 
		RULE_tupleStructItems = 147, RULE_tuplePattern = 148, RULE_tuplePatternItems = 149, 
		RULE_groupedPattern = 150, RULE_slicePattern = 151, RULE_slicePatternItems = 152, 
		RULE_pathPattern = 153, RULE_type_ = 154, RULE_typeNoBounds = 155, RULE_parenthesizedType = 156, 
		RULE_neverType = 157, RULE_tupleType = 158, RULE_arrayType = 159, RULE_sliceType = 160, 
		RULE_referenceType = 161, RULE_rawPointerType = 162, RULE_bareFunctionType = 163, 
		RULE_functionTypeQualifiers = 164, RULE_bareFunctionReturnType = 165, 
		RULE_functionParametersMaybeNamedVariadic = 166, RULE_maybeNamedFunctionParameters = 167, 
		RULE_maybeNamedParam = 168, RULE_maybeNamedFunctionParametersVariadic = 169, 
		RULE_traitObjectType = 170, RULE_traitObjectTypeOneBound = 171, RULE_implTraitType = 172, 
		RULE_implTraitTypeOneBound = 173, RULE_closureTraitType = 174, RULE_inferredType = 175, 
		RULE_typeParamBounds = 176, RULE_boundElement = 177, RULE_typeParamBound = 178, 
		RULE_traitBound = 179, RULE_useBound = 180, RULE_useBoundGenericArgs = 181, 
		RULE_useBoundGenericArg = 182, RULE_lifetimeBounds = 183, RULE_lifetime = 184, 
		RULE_simplePath = 185, RULE_simplePathSegment = 186, RULE_pathInExpression = 187, 
		RULE_pathExprSegment = 188, RULE_pathIdentSegment = 189, RULE_genericArgs = 190, 
		RULE_genericArg = 191, RULE_genericArgsConst = 192, RULE_genericArgsLifetimes = 193, 
		RULE_genericArgsTypes = 194, RULE_genericArgsBindings = 195, RULE_genericArgsBinding = 196, 
		RULE_genericArgsBound = 197, RULE_qualifiedPathInExpression = 198, RULE_qualifiedPathType = 199, 
		RULE_qualifiedPathInType = 200, RULE_typePath = 201, RULE_typePathSegment = 202, 
		RULE_typePathFn = 203, RULE_typePathInputs = 204, RULE_visibility = 205, 
		RULE_identifier = 206, RULE_keyword = 207, RULE_non_crate_keyword = 208, 
		RULE_macroIdentifierLikeToken = 209, RULE_macroLiteralToken = 210, RULE_macroPunctuationToken = 211, 
		RULE_shl = 212, RULE_shr = 213;
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
			"lifetimeWhereClauseItem", "typeBoundWhereClauseItem", "equalityBound", 
			"forLifetimes", "associatedItem", "innerAttribute", "outerAttribute", 
			"attr", "attrInput", "statement", "letStatement", "expressionStatement", 
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
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(428);
					innerAttribute();
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22473700122786635L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
				{
				{
				setState(434);
				item();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
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
			setState(442);
			simplePath();
			setState(443);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==POUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073340885532640L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
				{
				setState(444);
				simplePath();
				}
			}

			setState(447);
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
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(LPAREN);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(450);
					tokenTree();
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(LSQUAREBRACKET);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
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
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(LCURLYBRACE);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
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
			setState(481);
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
				setState(476); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(475);
						tokenTreeToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(478); 
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
				setState(480);
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
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				macroRepOp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
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
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				simplePath();
				setState(491);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==POUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073340885532640L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
					{
					setState(492);
					simplePath();
					}
				}

				setState(495);
				match(LPAREN);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(496);
					tokenTree();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502);
				match(RPAREN);
				setState(503);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				simplePath();
				setState(506);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==POUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073340885532640L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
					{
					setState(507);
					simplePath();
					}
				}

				setState(510);
				match(LSQUAREBRACKET);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(511);
					tokenTree();
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(517);
				match(RSQUAREBRACKET);
				setState(518);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				simplePath();
				setState(521);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==POUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073340885532640L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
					{
					setState(522);
					simplePath();
					}
				}

				setState(525);
				match(LCURLYBRACE);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(526);
					tokenTree();
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(532);
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
			setState(536);
			match(KW_MACRORULES);
			setState(537);
			match(NOT);
			setState(538);
			identifier();
			setState(539);
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
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(541);
				visibility();
				}
			}

			setState(544);
			match(KW_MACRO);
			setState(545);
			identifier();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(546);
				match(LPAREN);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(547);
					tokenTree();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
				match(RPAREN);
				}
			}

			setState(556);
			match(LCURLYBRACE);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
				{
				{
				setState(557);
				tokenTree();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
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
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(LPAREN);
				setState(566);
				macroRules();
				setState(567);
				match(RPAREN);
				setState(568);
				match(SEMI);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(LSQUAREBRACKET);
				setState(571);
				macroRules();
				setState(572);
				match(RSQUAREBRACKET);
				setState(573);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				match(LCURLYBRACE);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 21L) != 0)) {
					{
					setState(576);
					macroRules();
					}
				}

				setState(579);
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
			setState(582);
			macroRule();
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					match(SEMI);
					setState(584);
					macroRule();
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(590);
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
			setState(593);
			macroMatcher();
			setState(594);
			match(FATARROW);
			setState(595);
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
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(LPAREN);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
					{
					{
					setState(598);
					macroMatch();
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(604);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(LSQUAREBRACKET);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
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
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				match(LCURLYBRACE);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0)) {
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
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(623);
						macroMatchToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(626); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				macroMatcher();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				match(DOLLAR);
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(630);
					identifier();
					}
					break;
				case 2:
					{
					setState(631);
					non_crate_keyword();
					}
					break;
				case 3:
					{
					setState(632);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(635);
				match(COLON);
				setState(636);
				macroFragSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				match(DOLLAR);
				setState(638);
				match(LPAREN);
				setState(640); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(639);
					macroMatch();
					}
					}
					setState(642); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -3932657L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 351L) != 0) );
				setState(644);
				match(RPAREN);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -87818737L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 7L) != 0)) {
					{
					setState(645);
					macroRepSep();
					}
				}

				setState(648);
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
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
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
			setState(658);
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
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
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
			setState(666);
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
			setState(668);
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
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(670);
				outerAttribute();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(676);
				visItem();
				}
				break;
			case 2:
				{
				setState(677);
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
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(680);
				visibility();
				}
			}

			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(683);
				module();
				}
				break;
			case 2:
				{
				setState(684);
				externCrate();
				}
				break;
			case 3:
				{
				setState(685);
				useDeclaration();
				}
				break;
			case 4:
				{
				setState(686);
				function_();
				}
				break;
			case 5:
				{
				setState(687);
				typeAlias();
				}
				break;
			case 6:
				{
				setState(688);
				struct_();
				}
				break;
			case 7:
				{
				setState(689);
				enumeration();
				}
				break;
			case 8:
				{
				setState(690);
				union_();
				}
				break;
			case 9:
				{
				setState(691);
				constantItem();
				}
				break;
			case 10:
				{
				setState(692);
				staticItem();
				}
				break;
			case 11:
				{
				setState(693);
				trait_();
				}
				break;
			case 12:
				{
				setState(694);
				implementation();
				}
				break;
			case 13:
				{
				setState(695);
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
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				macroInvocationSemi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				macroRulesDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
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
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(703);
				match(KW_UNSAFE);
				}
			}

			setState(706);
			match(KW_MOD);
			setState(707);
			identifier();
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(708);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				{
				setState(709);
				match(LCURLYBRACE);
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(710);
						innerAttribute();
						}
						} 
					}
					setState(715);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22473700122786635L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
					{
					{
					setState(716);
					item();
					}
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(722);
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
			setState(725);
			match(KW_EXTERN);
			setState(726);
			match(KW_CRATE);
			setState(727);
			crateRef();
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(728);
				asClause();
				}
			}

			setState(731);
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
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_ASYNC:
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
				setState(733);
				identifier();
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
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
			setState(737);
			match(KW_AS);
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_ASYNC:
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
				setState(738);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(739);
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
			setState(742);
			match(KW_USE);
			setState(743);
			useTree();
			setState(744);
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
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180073340885532640L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4611686018427387919L) != 0)) {
					{
					setState(747);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(746);
						simplePath();
						}
						break;
					}
					setState(749);
					match(PATHSEP);
					}
				}

				setState(768);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(752);
					match(STAR);
					}
					break;
				case LCURLYBRACE:
					{
					setState(753);
					match(LCURLYBRACE);
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9217744744952102913L) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 4466765987841L) != 0)) {
						{
						setState(754);
						useTree();
						setState(759);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(755);
								match(COMMA);
								setState(756);
								useTree();
								}
								} 
							}
							setState(761);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
						}
						setState(763);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(762);
							match(COMMA);
							}
						}

						}
					}

					setState(767);
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
				setState(770);
				simplePath();
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(771);
					match(KW_AS);
					setState(774);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_PIN:
					case KW_ASYNC:
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
						setState(772);
						identifier();
						}
						break;
					case UNDERSCORE:
						{
						setState(773);
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
			setState(780);
			functionQualifiers();
			setState(781);
			match(KW_FN);
			setState(782);
			identifier();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(783);
				genericParams();
				}
			}

			setState(786);
			match(LPAREN);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -35939415942484184L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5135229508508614159L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 165L) != 0)) {
				{
				setState(787);
				functionParameters();
				}
			}

			setState(790);
			match(RPAREN);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(791);
				functionReturnType();
				}
			}

			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(794);
				whereClause();
				}
			}

			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				{
				setState(797);
				blockExpression();
				}
				break;
			case SEMI:
				{
				setState(798);
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
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(801);
				match(KW_DEFAULT);
				}
			}

			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(804);
				match(KW_CONST);
				}
			}

			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(807);
				match(KW_ASYNC);
				}
			}

			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_GEN) {
				{
				setState(810);
				match(KW_GEN);
				}
			}

			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE || _la==KW_SAFE) {
				{
				setState(813);
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

			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERN) {
				{
				setState(816);
				match(KW_EXTERN);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
					{
					setState(817);
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
			setState(822);
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
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				selfParam();
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(825);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(828);
					selfParam();
					setState(829);
					match(COMMA);
					}
					break;
				}
				setState(833);
				functionParam();
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(834);
						match(COMMA);
						setState(835);
						functionParam();
						}
						} 
					}
					setState(840);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(841);
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
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(846);
				outerAttribute();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(852);
				shorthandSelf();
				}
				break;
			case 2:
				{
				setState(853);
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
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(856);
				match(AND);
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL) {
					{
					setState(857);
					lifetime();
					}
				}

				}
			}

			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(862);
				match(KW_MUT);
				}
			}

			setState(865);
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
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(867);
				match(KW_MUT);
				}
			}

			setState(870);
			match(KW_SELFVALUE);
			setState(871);
			match(COLON);
			setState(872);
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
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(874);
				outerAttribute();
				}
				}
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(880);
				functionParamPattern();
				}
				break;
			case 2:
				{
				setState(881);
				match(DOTDOTDOT);
				}
				break;
			case 3:
				{
				setState(882);
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
			setState(885);
			pattern();
			setState(886);
			match(COLON);
			setState(889);
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
				{
				setState(887);
				type_();
				}
				break;
			case DOTDOTDOT:
				{
				setState(888);
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
			setState(891);
			match(RARROW);
			setState(892);
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
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(894);
				match(KW_DEFAULT);
				}
			}

			setState(897);
			match(KW_TYPE);
			setState(898);
			identifier();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(899);
				genericParams();
				}
			}

			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(902);
				match(COLON);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 581091895280001L) != 0)) {
					{
					setState(903);
					typeParamBounds();
					}
				}

				}
			}

			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(908);
				whereClause();
				}
			}

			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(911);
				match(EQ);
				setState(912);
				type_();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(913);
					whereClause();
					}
				}

				}
			}

			setState(918);
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
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				structStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
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
			setState(924);
			match(KW_STRUCT);
			setState(925);
			identifier();
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(926);
				genericParams();
				}
			}

			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(929);
				whereClause();
				}
			}

			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				{
				setState(932);
				match(LCURLYBRACE);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 139534931202065L) != 0) || _la==POUND) {
					{
					setState(933);
					structFields();
					}
				}

				setState(936);
				match(RCURLYBRACE);
				}
				break;
			case SEMI:
				{
				setState(937);
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
			setState(940);
			match(KW_STRUCT);
			setState(941);
			identifier();
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(942);
				genericParams();
				}
			}

			setState(945);
			match(LPAREN);
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283552105L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 726229711850377L) != 0)) {
				{
				setState(946);
				tupleFields();
				}
			}

			setState(949);
			match(RPAREN);
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(950);
				whereClause();
				}
			}

			setState(953);
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
			setState(955);
			structField();
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(956);
					match(COMMA);
					setState(957);
					structField();
					}
					} 
				}
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(963);
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
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(966);
				outerAttribute();
				}
				}
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(972);
				match(KW_UNSAFE);
				}
			}

			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(975);
				visibility();
				}
			}

			setState(978);
			identifier();
			setState(979);
			match(COLON);
			setState(980);
			type_();
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(981);
				match(EQ);
				setState(982);
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
			setState(985);
			tupleField();
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(986);
					match(COMMA);
					setState(987);
					tupleField();
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(993);
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
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(996);
				outerAttribute();
				}
				}
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1002);
				visibility();
				}
			}

			setState(1005);
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
			setState(1007);
			match(KW_ENUM);
			setState(1008);
			identifier();
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1009);
				genericParams();
				}
			}

			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1012);
				whereClause();
				}
			}

			setState(1015);
			match(LCURLYBRACE);
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 139534931197969L) != 0) || _la==POUND) {
				{
				setState(1016);
				enumItems();
				}
			}

			setState(1019);
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
			setState(1021);
			enumItem();
			setState(1026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1022);
					match(COMMA);
					setState(1023);
					enumItem();
					}
					} 
				}
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1029);
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
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1032);
				outerAttribute();
				}
				}
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(1038);
				visibility();
				}
			}

			setState(1041);
			identifier();
			setState(1044);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1042);
				enumItemTuple();
				}
				break;
			case LCURLYBRACE:
				{
				setState(1043);
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
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1046);
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
			setState(1049);
			match(LPAREN);
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283552105L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 726229711850377L) != 0)) {
				{
				setState(1050);
				tupleFields();
				}
			}

			setState(1053);
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
			setState(1055);
			match(LCURLYBRACE);
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 139534931202065L) != 0) || _la==POUND) {
				{
				setState(1056);
				structFields();
				}
			}

			setState(1059);
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
			setState(1061);
			match(EQ);
			setState(1062);
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
			setState(1064);
			match(KW_UNION);
			setState(1065);
			if (!(this.nextIsIdentifier())) throw new FailedPredicateException(this, "this.nextIsIdentifier()");
			setState(1066);
			identifier();
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1067);
				genericParams();
				}
			}

			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1070);
				whereClause();
				}
			}

			setState(1073);
			match(LCURLYBRACE);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 139534931202065L) != 0) || _la==POUND) {
				{
				setState(1074);
				structFields();
				}
			}

			setState(1077);
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
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT) {
				{
				setState(1079);
				match(KW_DEFAULT);
				}
			}

			setState(1082);
			match(KW_CONST);
			setState(1085);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_ASYNC:
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
				setState(1083);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(1084);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1087);
				genericParams();
				}
			}

			setState(1090);
			match(COLON);
			setState(1091);
			type_();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1092);
				match(EQ);
				setState(1093);
				expression(0);
				}
			}

			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1096);
				whereClause();
				}
			}

			setState(1099);
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
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE || _la==KW_SAFE) {
				{
				setState(1101);
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

			setState(1104);
			match(KW_STATIC);
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(1105);
				match(KW_MUT);
				}
			}

			setState(1108);
			identifier();
			setState(1109);
			match(COLON);
			setState(1110);
			type_();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1111);
				match(EQ);
				setState(1112);
				expression(0);
				}
			}

			setState(1115);
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
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_UNSAFE) {
					{
					setState(1117);
					match(KW_UNSAFE);
					}
				}

				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AUTO) {
					{
					setState(1120);
					match(KW_AUTO);
					}
				}

				setState(1123);
				match(KW_TRAIT);
				setState(1124);
				identifier();
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1125);
					genericParams();
					}
				}

				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1128);
					match(COLON);
					setState(1130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 581091895280001L) != 0)) {
						{
						setState(1129);
						typeParamBounds();
						}
					}

					}
				}

				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(1134);
					whereClause();
					}
				}

				setState(1137);
				match(LCURLYBRACE);
				setState(1141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1138);
						innerAttribute();
						}
						} 
					}
					setState(1143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22509163852332891L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
					{
					{
					setState(1144);
					associatedItem();
					}
					}
					setState(1149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1150);
				match(RCURLYBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_UNSAFE) {
					{
					setState(1152);
					match(KW_UNSAFE);
					}
				}

				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AUTO) {
					{
					setState(1155);
					match(KW_AUTO);
					}
				}

				setState(1158);
				match(KW_TRAIT);
				setState(1159);
				identifier();
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1160);
					genericParams();
					}
				}

				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1163);
					match(COLON);
					setState(1165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 581091895280001L) != 0)) {
						{
						setState(1164);
						typeParamBounds();
						}
					}

					}
				}

				setState(1169);
				match(EQ);
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 581091895280001L) != 0)) {
					{
					setState(1170);
					typeParamBounds();
					}
				}

				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(1173);
					whereClause();
					}
				}

				setState(1176);
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
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				inherentImpl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
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
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1184);
				match(KW_DEFAULT);
				setState(1185);
				match(KW_UNSAFE);
				}
				break;
			case 2:
				{
				setState(1186);
				match(KW_UNSAFE);
				setState(1187);
				match(KW_DEFAULT);
				}
				break;
			case 3:
				{
				setState(1188);
				match(KW_DEFAULT);
				}
				break;
			case 4:
				{
				setState(1189);
				match(KW_UNSAFE);
				}
				break;
			}
			setState(1192);
			match(KW_IMPL);
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1193);
				genericParams();
				}
				break;
			}
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1196);
				match(NOT);
				}
				break;
			}
			setState(1199);
			type_();
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1200);
				whereClause();
				}
			}

			setState(1203);
			match(LCURLYBRACE);
			setState(1207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1204);
					innerAttribute();
					}
					} 
				}
				setState(1209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22509163852332891L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
				{
				{
				setState(1210);
				associatedItem();
				}
				}
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1216);
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
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1218);
				match(KW_DEFAULT);
				setState(1219);
				match(KW_UNSAFE);
				}
				break;
			case 2:
				{
				setState(1220);
				match(KW_UNSAFE);
				setState(1221);
				match(KW_DEFAULT);
				}
				break;
			case 3:
				{
				setState(1222);
				match(KW_DEFAULT);
				}
				break;
			case 4:
				{
				setState(1223);
				match(KW_UNSAFE);
				}
				break;
			}
			setState(1226);
			match(KW_IMPL);
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1227);
				genericParams();
				}
			}

			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(1230);
				match(KW_CONST);
				}
			}

			setState(1234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1233);
				match(NOT);
				}
			}

			setState(1236);
			typePath();
			setState(1237);
			match(KW_FOR);
			setState(1238);
			type_();
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1239);
				whereClause();
				}
			}

			setState(1242);
			match(LCURLYBRACE);
			setState(1246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1243);
					innerAttribute();
					}
					} 
				}
				setState(1248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22509163852332891L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
				{
				{
				setState(1249);
				associatedItem();
				}
				}
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1255);
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
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(1257);
				match(KW_UNSAFE);
				}
			}

			setState(1260);
			match(KW_EXTERN);
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
				{
				setState(1261);
				abi();
				}
			}

			setState(1264);
			match(LCURLYBRACE);
			setState(1268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1265);
					innerAttribute();
					}
					} 
				}
				setState(1270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -22509163835555675L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 5188146770730811393L) != 0)) {
				{
				{
				setState(1271);
				externalItem();
				}
				}
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1277);
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
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1279);
				outerAttribute();
				}
				}
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1285);
				macroInvocationSemi();
				}
				break;
			case 2:
				{
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1286);
					visibility();
					}
				}

				setState(1292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1289);
					staticItem();
					}
					break;
				case 2:
					{
					setState(1290);
					function_();
					}
					break;
				case 3:
					{
					setState(1291);
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
			setState(1296);
			match(KW_TYPE);
			setState(1297);
			identifier();
			setState(1298);
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
			setState(1300);
			match(LT);
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -315243143458979839L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 4611686018428436481L) != 0)) {
				{
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1301);
						genericParam();
						setState(1302);
						match(COMMA);
						}
						} 
					}
					setState(1308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				setState(1309);
				genericParam();
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1310);
					match(COMMA);
					}
				}

				}
			}

			setState(1315);
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
			setState(1320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1317);
					outerAttribute();
					}
					} 
				}
				setState(1322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1323);
				lifetimeParam();
				}
				break;
			case 2:
				{
				setState(1324);
				typeParam();
				}
				break;
			case 3:
				{
				setState(1325);
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
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1328);
				outerAttribute();
				}
			}

			setState(1331);
			match(LIFETIME_OR_LABEL);
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1332);
				match(COLON);
				setState(1333);
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
			setState(1337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1336);
				outerAttribute();
				}
			}

			setState(1339);
			identifier();
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1340);
				match(COLON);
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 581091895280001L) != 0)) {
					{
					setState(1341);
					typeParamBounds();
					}
				}

				}
			}

			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1346);
				match(EQ);
				setState(1347);
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
			setState(1350);
			match(KW_CONST);
			setState(1351);
			identifier();
			setState(1352);
			match(COLON);
			setState(1353);
			type_();
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1354);
				match(EQ);
				setState(1355);
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
			setState(1358);
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
			setState(1360);
			match(KW_WHERE);
			setState(1366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1361);
					whereClauseItem();
					setState(1362);
					match(COMMA);
					}
					} 
				}
				setState(1368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			setState(1369);
			whereClauseItem();
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1370);
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
		enterRule(_localctx, 136, RULE_whereClauseItem);
		try {
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				lifetimeWhereClauseItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374);
				typeBoundWhereClauseItem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1375);
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
		enterRule(_localctx, 138, RULE_lifetimeWhereClauseItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			lifetime();
			setState(1379);
			match(COLON);
			setState(1380);
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
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1382);
				forLifetimes();
				}
				break;
			}
			setState(1385);
			type_();
			setState(1386);
			match(COLON);
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9221122480108208193L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 581091895280001L) != 0)) {
				{
				setState(1387);
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
		enterRule(_localctx, 142, RULE_equalityBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(1390);
				forLifetimes();
				}
			}

			setState(1393);
			typePath();
			setState(1394);
			match(EQ);
			setState(1395);
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
		enterRule(_localctx, 144, RULE_forLifetimes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(KW_FOR);
			setState(1398);
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
		enterRule(_localctx, 146, RULE_associatedItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1400);
				outerAttribute();
				}
				}
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1406);
				macroInvocationSemi();
				}
				break;
			case 2:
				{
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1407);
					visibility();
					}
				}

				setState(1413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1410);
					typeAlias();
					}
					break;
				case 2:
					{
					setState(1411);
					constantItem();
					}
					break;
				case 3:
					{
					setState(1412);
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
		enterRule(_localctx, 148, RULE_innerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(POUND);
			setState(1418);
			match(NOT);
			setState(1419);
			match(LSQUAREBRACKET);
			setState(1420);
			attr();
			setState(1421);
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
		enterRule(_localctx, 150, RULE_outerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(POUND);
			setState(1424);
			match(LSQUAREBRACKET);
			setState(1425);
			attr();
			setState(1426);
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
		enterRule(_localctx, 152, RULE_attr);
		int _la;
		try {
			setState(1440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SUPER:
			case KW_ASYNC:
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
				setState(1428);
				simplePath();
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 88080385L) != 0)) {
					{
					setState(1429);
					attrInput();
					}
				}

				}
				break;
			case KW_UNSAFE:
			case KW_SAFE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1432);
				_la = _input.LA(1);
				if ( !(_la==KW_UNSAFE || _la==KW_SAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1433);
				match(LPAREN);
				setState(1434);
				simplePath();
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 88080385L) != 0)) {
					{
					setState(1435);
					attrInput();
					}
				}

				setState(1438);
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
		enterRule(_localctx, 154, RULE_attrInput);
		try {
			setState(1445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				delimTokenTree();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				match(EQ);
				setState(1444);
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
		enterRule(_localctx, 156, RULE_statement);
		try {
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				letStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1449);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1450);
				macroInvocationSemi();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1451);
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
		enterRule(_localctx, 158, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1454);
				outerAttribute();
				}
				}
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1460);
			match(KW_LET);
			setState(1461);
			patternNoTopAlt();
			setState(1467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(1462);
				match(COLON);
				setState(1463);
				type_();
				}
				}
				break;
			case PATHSEP:
				{
				{
				setState(1464);
				match(PATHSEP);
				setState(1465);
				match(COLON);
				setState(1466);
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
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1469);
				match(EQ);
				setState(1470);
				expression(0);
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(1471);
					match(KW_ELSE);
					setState(1472);
					blockExpression();
					}
				}

				}
			}

			setState(1477);
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
		enterRule(_localctx, 160, RULE_expressionStatement);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				expression(0);
				setState(1480);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1482);
				expressionWithBlock();
				setState(1484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1483);
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
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				_localctx = new AttributedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1490); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1489);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1492); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1494);
				expression(49);
				}
				break;
			case 2:
				{
				_localctx = new LiteralExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1496);
				literalExpression();
				}
				break;
			case 3:
				{
				_localctx = new PathExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1497);
				pathExpression();
				}
				break;
			case 4:
				{
				_localctx = new BorrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1498);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==ANDAND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1499);
					match(KW_MUT);
					}
					break;
				}
				setState(1502);
				expression(38);
				}
				break;
			case 5:
				{
				_localctx = new RawPointerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1503);
				match(AND);
				setState(1504);
				match(KW_RAW);
				setState(1505);
				_la = _input.LA(1);
				if ( !(_la==KW_CONST || _la==KW_MUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1506);
				expression(37);
				}
				break;
			case 6:
				{
				_localctx = new DereferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1507);
				match(STAR);
				setState(1508);
				expression(36);
				}
				break;
			case 7:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1509);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1510);
				expression(35);
				}
				break;
			case 8:
				{
				_localctx = new RangeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1511);
				match(DOTDOT);
				setState(1513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1512);
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
				setState(1515);
				match(DOTDOTEQ);
				setState(1516);
				expression(21);
				}
				break;
			case 10:
				{
				_localctx = new DestructuringAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1517);
				patternNoTopAlt();
				setState(1518);
				match(EQ);
				setState(1519);
				expression(18);
				}
				break;
			case 11:
				{
				_localctx = new AssignmentExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1521);
				match(UNDERSCORE);
				setState(1522);
				match(EQ);
				setState(1523);
				expression(17);
				}
				break;
			case 12:
				{
				_localctx = new ContinueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1524);
				match(KW_CONTINUE);
				setState(1526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1525);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1528);
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
				setState(1531);
				match(KW_BREAK);
				setState(1533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1532);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1535);
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
				setState(1538);
				match(KW_RETURN);
				setState(1540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1539);
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
				setState(1542);
				match(KW_BECOME);
				setState(1543);
				expression(12);
				}
				break;
			case 16:
				{
				_localctx = new YeetExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1544);
				match(KW_DO);
				setState(1545);
				match(KW_YEET);
				setState(1547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1546);
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
				setState(1549);
				match(KW_YIELD);
				setState(1551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1550);
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
				setState(1553);
				match(LPAREN);
				setState(1557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1554);
						innerAttribute();
						}
						} 
					}
					setState(1559);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				}
				setState(1560);
				expression(0);
				setState(1561);
				match(RPAREN);
				}
				break;
			case 19:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1563);
				match(LSQUAREBRACKET);
				setState(1567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1564);
						innerAttribute();
						}
						} 
					}
					setState(1569);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
					{
					setState(1570);
					arrayElements();
					}
				}

				setState(1573);
				match(RSQUAREBRACKET);
				}
				break;
			case 20:
				{
				_localctx = new TupleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1574);
				match(LPAREN);
				setState(1578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1575);
						innerAttribute();
						}
						} 
					}
					setState(1580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
					{
					setState(1581);
					tupleElements();
					}
				}

				setState(1584);
				match(RPAREN);
				}
				break;
			case 21:
				{
				_localctx = new StructExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1585);
				structExpression();
				}
				break;
			case 22:
				{
				_localctx = new EnumerationVariantExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1586);
				enumerationVariantExpression();
				}
				break;
			case 23:
				{
				_localctx = new ClosureExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1587);
				closureExpression();
				}
				break;
			case 24:
				{
				_localctx = new ExpressionWithBlock_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1588);
				expressionWithBlock();
				}
				break;
			case 25:
				{
				_localctx = new LetExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1589);
				letExpression();
				}
				break;
			case 26:
				{
				_localctx = new MacroInvocationAsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1590);
				macroInvocation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1695);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1593);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1594);
						_la = _input.LA(1);
						if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1595);
						expression(34);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1596);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1597);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1598);
						expression(33);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1599);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1602);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1600);
							shl();
							}
							break;
						case GT:
							{
							setState(1601);
							shr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1604);
						expression(32);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1606);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1607);
						match(AND);
						setState(1608);
						expression(31);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1609);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1610);
						match(CARET);
						setState(1611);
						expression(30);
						}
						break;
					case 6:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1612);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1613);
						match(OR);
						setState(1614);
						expression(29);
						}
						break;
					case 7:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1615);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1616);
						comparisonOperator();
						setState(1617);
						expression(28);
						}
						break;
					case 8:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1619);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1620);
						match(ANDAND);
						setState(1621);
						expression(27);
						}
						break;
					case 9:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1622);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1623);
						match(OROR);
						setState(1624);
						expression(26);
						}
						break;
					case 10:
						{
						_localctx = new ObsoleteRangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1625);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1626);
						match(DOTDOTDOT);
						setState(1627);
						expression(25);
						}
						break;
					case 11:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1628);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1629);
						match(DOTDOTEQ);
						setState(1630);
						expression(21);
						}
						break;
					case 12:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1631);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1632);
						match(EQ);
						setState(1633);
						expression(20);
						}
						break;
					case 13:
						{
						_localctx = new CompoundAssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1634);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1635);
						compoundAssignOperator();
						setState(1636);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new PostfixMatchExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1638);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(1639);
						match(DOT);
						setState(1640);
						match(KW_MATCH);
						setState(1641);
						match(LCURLYBRACE);
						setState(1645);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1642);
								innerAttribute();
								}
								} 
							}
							setState(1647);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
						}
						setState(1649);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054646968024536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 161L) != 0)) {
							{
							setState(1648);
							matchArms();
							}
						}

						setState(1651);
						match(RCURLYBRACE);
						}
						break;
					case 15:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1652);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(1653);
						match(DOT);
						setState(1654);
						pathExprSegment();
						setState(1655);
						match(LPAREN);
						setState(1657);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
							{
							setState(1656);
							callParams();
							}
						}

						setState(1659);
						match(RPAREN);
						}
						break;
					case 16:
						{
						_localctx = new FieldExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1661);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(1662);
						match(DOT);
						setState(1666);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case KW_PIN:
						case KW_ASYNC:
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
							setState(1663);
							identifier();
							}
							break;
						case KW_SELFVALUE:
							{
							setState(1664);
							match(KW_SELFVALUE);
							}
							break;
						case KW_SELFTYPE:
							{
							setState(1665);
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
						setState(1668);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(1669);
						match(DOT);
						setState(1670);
						tupleIndex();
						}
						break;
					case 18:
						{
						_localctx = new AwaitExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1671);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(1672);
						match(DOT);
						setState(1673);
						match(KW_AWAIT);
						}
						break;
					case 19:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1674);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(1675);
						match(LPAREN);
						setState(1677);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
							{
							setState(1676);
							callParams();
							}
						}

						setState(1679);
						match(RPAREN);
						}
						break;
					case 20:
						{
						_localctx = new IndexExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1680);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1681);
						match(LSQUAREBRACKET);
						setState(1682);
						expression(0);
						setState(1683);
						match(RSQUAREBRACKET);
						}
						break;
					case 21:
						{
						_localctx = new ErrorPropagationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1685);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1686);
						match(QUESTION);
						}
						break;
					case 22:
						{
						_localctx = new TypeCastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1687);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1688);
						match(KW_AS);
						setState(1689);
						typeNoBounds();
						}
						break;
					case 23:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1690);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1691);
						match(DOTDOT);
						setState(1693);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
						case 1:
							{
							setState(1692);
							expression(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
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
		enterRule(_localctx, 164, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
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
		enterRule(_localctx, 166, RULE_compoundAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
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
		enterRule(_localctx, 168, RULE_expressionWithBlock);
		try {
			int _alt;
			setState(1722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1705); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1704);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1707); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1709);
				expressionWithBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				blockExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1712);
				asyncBlockExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1713);
				generatorBlockExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1714);
				asyncGeneratorBlockExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1715);
				unsafeBlockExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1716);
				loopExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1717);
				ifExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1718);
				ifLetExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1719);
				matchExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1720);
				constBlockExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1721);
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
		enterRule(_localctx, 170, RULE_generatorBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			match(KW_GEN);
			setState(1726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1725);
				match(KW_MOVE);
				}
			}

			setState(1728);
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
		enterRule(_localctx, 172, RULE_asyncGeneratorBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			match(KW_ASYNC);
			setState(1731);
			match(KW_GEN);
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1732);
				match(KW_MOVE);
				}
			}

			setState(1735);
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
		enterRule(_localctx, 174, RULE_literalExpression);
		try {
			setState(1780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1737);
				match(CHAR_LITERAL);
				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1738);
					identifier();
					}
					break;
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1741);
				match(STRING_LITERAL);
				setState(1743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1742);
					identifier();
					}
					break;
				}
				}
				break;
			case RAW_STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1745);
				match(RAW_STRING_LITERAL);
				setState(1747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1746);
					identifier();
					}
					break;
				}
				}
				break;
			case BYTE_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1749);
				match(BYTE_LITERAL);
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1750);
					identifier();
					}
					break;
				}
				}
				break;
			case BYTE_STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1753);
				match(BYTE_STRING_LITERAL);
				setState(1755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1754);
					identifier();
					}
					break;
				}
				}
				break;
			case RAW_BYTE_STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1757);
				match(RAW_BYTE_STRING_LITERAL);
				setState(1759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1758);
					identifier();
					}
					break;
				}
				}
				break;
			case C_STRING_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1761);
				match(C_STRING_LITERAL);
				setState(1763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1762);
					identifier();
					}
					break;
				}
				}
				break;
			case RAW_C_STRING_LITERAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1765);
				match(RAW_C_STRING_LITERAL);
				setState(1767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1766);
					identifier();
					}
					break;
				}
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1769);
				match(INTEGER_LITERAL);
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1770);
					identifier();
					}
					break;
				}
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1773);
				match(FLOAT_LITERAL);
				setState(1776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1774);
					match(UNDERSCORE);
					setState(1775);
					identifier();
					}
					break;
				}
				}
				break;
			case KW_TRUE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1778);
				match(KW_TRUE);
				}
				break;
			case KW_FALSE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1779);
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
		enterRule(_localctx, 176, RULE_pathExpression);
		try {
			setState(1784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_ASYNC:
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
				setState(1782);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1783);
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
		enterRule(_localctx, 178, RULE_blockExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			match(LCURLYBRACE);
			setState(1790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1787);
					innerAttribute();
					}
					} 
				}
				setState(1792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161712390642090052L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6144035857251958287L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1793);
				statements();
				}
			}

			setState(1796);
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
		enterRule(_localctx, 180, RULE_statements);
		int _la;
		try {
			int _alt;
			setState(1807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1799); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1798);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1801); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
					{
					setState(1803);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1806);
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
		enterRule(_localctx, 182, RULE_asyncBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			match(KW_ASYNC);
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1810);
				match(KW_MOVE);
				}
			}

			setState(1813);
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
		enterRule(_localctx, 184, RULE_unsafeBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			match(KW_UNSAFE);
			setState(1816);
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
		enterRule(_localctx, 186, RULE_constBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			match(KW_CONST);
			setState(1819);
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
		enterRule(_localctx, 188, RULE_tryBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			match(KW_TRY);
			setState(1822);
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
		enterRule(_localctx, 190, RULE_arrayElements);
		int _la;
		try {
			int _alt;
			setState(1839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				expression(0);
				setState(1829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1825);
						match(COMMA);
						setState(1826);
						expression(0);
						}
						} 
					}
					setState(1831);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
				}
				setState(1833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1832);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				expression(0);
				setState(1836);
				match(SEMI);
				setState(1837);
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
		enterRule(_localctx, 192, RULE_tupleElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1844); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1841);
					expression(0);
					setState(1842);
					match(COMMA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1846); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1848);
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
		enterRule(_localctx, 194, RULE_tupleIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
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
		enterRule(_localctx, 196, RULE_structExpression);
		try {
			setState(1856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853);
				structExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1854);
				structExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1855);
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
		enterRule(_localctx, 198, RULE_structExprStruct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_ASYNC:
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
				setState(1858);
				pathInExpression();
				}
				break;
			case LT:
				{
				setState(1859);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1862);
			match(LCURLYBRACE);
			setState(1866);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1863);
					innerAttribute();
					}
					} 
				}
				setState(1868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			setState(1871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_ASYNC:
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
				setState(1869);
				structExprFields();
				}
				break;
			case DOTDOT:
				{
				setState(1870);
				structBase();
				}
				break;
			case RCURLYBRACE:
				break;
			default:
				break;
			}
			setState(1873);
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
		enterRule(_localctx, 200, RULE_structExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			structExprField();
			setState(1880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1876);
					match(COMMA);
					setState(1877);
					structExprField();
					}
					} 
				}
				setState(1882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			}
			setState(1888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1883);
				match(COMMA);
				setState(1884);
				structBase();
				}
				break;
			case 2:
				{
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1885);
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
		enterRule(_localctx, 202, RULE_structExprField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1890);
				outerAttribute();
				}
				}
				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(1896);
				identifier();
				}
				break;
			case 2:
				{
				setState(1899);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PIN:
				case KW_ASYNC:
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
					setState(1897);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(1898);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1901);
				match(COLON);
				setState(1902);
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
		enterRule(_localctx, 204, RULE_structBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			match(DOTDOT);
			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1907);
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
		enterRule(_localctx, 206, RULE_structExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			pathInExpression();
			setState(1911);
			match(LPAREN);
			setState(1915);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1912);
					innerAttribute();
					}
					} 
				}
				setState(1917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			}
			setState(1929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1918);
				expression(0);
				setState(1923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1919);
						match(COMMA);
						setState(1920);
						expression(0);
						}
						} 
					}
					setState(1925);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				}
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1926);
					match(COMMA);
					}
				}

				}
			}

			setState(1931);
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
		enterRule(_localctx, 208, RULE_structExprUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
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
		enterRule(_localctx, 210, RULE_enumerationVariantExpression);
		try {
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1935);
				enumExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936);
				enumExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1937);
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
		enterRule(_localctx, 212, RULE_enumExprStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			pathInExpression();
			setState(1941);
			match(LCURLYBRACE);
			setState(1943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 72066314971127809L) != 0)) {
				{
				setState(1942);
				enumExprFields();
				}
			}

			setState(1945);
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
		enterRule(_localctx, 214, RULE_enumExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			enumExprField();
			setState(1952);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1948);
					match(COMMA);
					setState(1949);
					enumExprField();
					}
					} 
				}
				setState(1954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
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
		enterRule(_localctx, 216, RULE_enumExprField);
		try {
			setState(1966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1958);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1961);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PIN:
				case KW_ASYNC:
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
					setState(1959);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(1960);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1963);
				match(COLON);
				setState(1964);
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
		enterRule(_localctx, 218, RULE_enumExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			pathInExpression();
			setState(1969);
			match(LPAREN);
			setState(1981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -161996121821177284L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114352645111311L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 169L) != 0)) {
				{
				setState(1970);
				expression(0);
				setState(1975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1971);
						match(COMMA);
						setState(1972);
						expression(0);
						}
						} 
					}
					setState(1977);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
				}
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1978);
					match(COMMA);
					}
				}

				}
			}

			setState(1983);
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
		enterRule(_localctx, 220, RULE_enumExprFieldless);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
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
		enterRule(_localctx, 222, RULE_callParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			expression(0);
			setState(1992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1988);
					match(COMMA);
					setState(1989);
					expression(0);
					}
					} 
				}
				setState(1994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			setState(1996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1995);
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
		enterRule(_localctx, 224, RULE_closureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(1998);
				forLifetimes();
				}
			}

			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATIC) {
				{
				setState(2001);
				match(KW_STATIC);
				}
			}

			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(2004);
				match(KW_CONST);
				}
			}

			setState(2008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(2007);
				match(KW_ASYNC);
				}
			}

			setState(2011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(2010);
				match(KW_MOVE);
				}
			}

			setState(2019);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OROR:
				{
				setState(2013);
				match(OROR);
				}
				break;
			case OR:
				{
				setState(2014);
				match(OR);
				setState(2016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2015);
					closureParameters();
					}
					break;
				}
				setState(2018);
				match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2026);
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
				setState(2021);
				expression(0);
				}
				break;
			case RARROW:
				{
				setState(2022);
				match(RARROW);
				setState(2023);
				typeNoBounds();
				setState(2024);
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
		enterRule(_localctx, 226, RULE_closureParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			closureParam();
			setState(2033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2029);
					match(COMMA);
					setState(2030);
					closureParam();
					}
					} 
				}
				setState(2035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			setState(2037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2036);
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
		enterRule(_localctx, 228, RULE_closureParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2039);
				outerAttribute();
				}
				}
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2045);
			pattern();
			setState(2048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2046);
				match(COLON);
				setState(2047);
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
		enterRule(_localctx, 230, RULE_loopExpression);
		int _la;
		try {
			setState(2062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIFETIME_OR_LABEL) {
					{
					setState(2050);
					loopLabel();
					}
				}

				setState(2057);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2053);
					infiniteLoopExpression();
					}
					break;
				case 2:
					{
					setState(2054);
					predicateLoopExpression();
					}
					break;
				case 3:
					{
					setState(2055);
					predicatePatternLoopExpression();
					}
					break;
				case 4:
					{
					setState(2056);
					iteratorLoopExpression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2059);
				loopLabel();
				setState(2060);
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
		enterRule(_localctx, 232, RULE_infiniteLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			match(KW_LOOP);
			setState(2065);
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
		enterRule(_localctx, 234, RULE_predicateLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(KW_WHILE);
			setState(2068);
			expression(0);
			setState(2069);
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
		enterRule(_localctx, 236, RULE_predicatePatternLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			match(KW_WHILE);
			setState(2072);
			match(KW_LET);
			setState(2073);
			pattern();
			setState(2074);
			match(EQ);
			setState(2075);
			expression(0);
			setState(2076);
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
		enterRule(_localctx, 238, RULE_iteratorLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			match(KW_FOR);
			setState(2079);
			pattern();
			setState(2080);
			match(KW_IN);
			setState(2081);
			expression(0);
			setState(2082);
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
		enterRule(_localctx, 240, RULE_labelBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
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
		enterRule(_localctx, 242, RULE_loopLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2086);
			match(LIFETIME_OR_LABEL);
			setState(2087);
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
		enterRule(_localctx, 244, RULE_ifExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			match(KW_IF);
			setState(2090);
			expression(0);
			setState(2091);
			blockExpression();
			setState(2098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2092);
				match(KW_ELSE);
				setState(2096);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2093);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(2094);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(2095);
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
		enterRule(_localctx, 246, RULE_ifLetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			match(KW_IF);
			setState(2101);
			match(KW_LET);
			setState(2102);
			pattern();
			setState(2103);
			match(EQ);
			setState(2104);
			expression(0);
			setState(2105);
			blockExpression();
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2106);
				match(KW_ELSE);
				setState(2110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2107);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(2108);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(2109);
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
		enterRule(_localctx, 248, RULE_letExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			match(KW_LET);
			setState(2115);
			pattern();
			setState(2116);
			match(EQ);
			setState(2117);
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
		enterRule(_localctx, 250, RULE_matchExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2119);
			match(KW_MATCH);
			setState(2120);
			expression(0);
			setState(2121);
			match(LCURLYBRACE);
			setState(2125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2122);
					innerAttribute();
					}
					} 
				}
				setState(2127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			}
			setState(2129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054646968024536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 161L) != 0)) {
				{
				setState(2128);
				matchArms();
				}
			}

			setState(2131);
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
		enterRule(_localctx, 252, RULE_matchArms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2133);
					matchArm();
					setState(2134);
					match(FATARROW);
					setState(2135);
					matchArmExpression();
					}
					} 
				}
				setState(2141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			setState(2142);
			matchArm();
			setState(2143);
			match(FATARROW);
			setState(2144);
			expression(0);
			setState(2146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2145);
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
		enterRule(_localctx, 254, RULE_matchArmExpression);
		int _la;
		try {
			setState(2155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2148);
				expression(0);
				setState(2149);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2151);
				expressionWithBlock();
				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2152);
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
		enterRule(_localctx, 256, RULE_matchArm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2157);
				outerAttribute();
				}
				}
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2163);
			pattern();
			setState(2165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(2164);
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
		enterRule(_localctx, 258, RULE_matchArmGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			match(KW_IF);
			setState(2168);
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
		enterRule(_localctx, 260, RULE_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(2170);
				match(OR);
				}
			}

			setState(2173);
			patternNoTopAlt();
			setState(2178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2174);
					match(OR);
					setState(2175);
					patternNoTopAlt();
					}
					} 
				}
				setState(2180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
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
		enterRule(_localctx, 262, RULE_patternNoTopAlt);
		try {
			setState(2190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2181);
					patternWithoutRange();
					}
					break;
				case 2:
					{
					setState(2182);
					rangePattern();
					}
					break;
				}
				setState(2185);
				match(KW_IF);
				setState(2186);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2188);
				patternWithoutRange();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2189);
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
		enterRule(_localctx, 264, RULE_patternWithoutRange);
		try {
			setState(2206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2192);
				boxPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2193);
				literalPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2194);
				identifierPattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2195);
				wildcardPattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2196);
				restPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2197);
				referencePattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2198);
				structPattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2199);
				tupleStructPattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2200);
				tuplePattern();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2201);
				groupedPattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2202);
				slicePattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2203);
				pathPattern();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2204);
				macroInvocation();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2205);
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
		enterRule(_localctx, 266, RULE_boxPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(KW_BOX);
			setState(2209);
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
		enterRule(_localctx, 268, RULE_literalPattern);
		int _la;
		try {
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2211);
				match(KW_TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2212);
				match(KW_FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2213);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2214);
				match(BYTE_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2215);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2216);
				match(RAW_STRING_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2217);
				match(BYTE_STRING_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2218);
				match(RAW_BYTE_STRING_LITERAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2219);
					match(MINUS);
					}
				}

				setState(2222);
				match(INTEGER_LITERAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2223);
					match(MINUS);
					}
				}

				setState(2226);
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
		enterRule(_localctx, 270, RULE_identifierPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_MUT || _la==KW_REF) {
				{
				{
				setState(2229);
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
				setState(2234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2235);
			identifier();
			setState(2238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2236);
				match(AT);
				setState(2237);
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
		enterRule(_localctx, 272, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
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
		enterRule(_localctx, 274, RULE_restPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
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
		enterRule(_localctx, 276, RULE_rangePattern);
		try {
			setState(2263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				_localctx = new ExclusiveRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2244);
				rangePatternBound();
				setState(2245);
				match(DOTDOT);
				setState(2246);
				rangePatternBound();
				}
				break;
			case 2:
				_localctx = new InclusiveRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2248);
				rangePatternBound();
				setState(2249);
				match(DOTDOTEQ);
				setState(2250);
				rangePatternBound();
				}
				break;
			case 3:
				_localctx = new RangeToPatternContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2252);
				match(DOTDOT);
				setState(2253);
				rangePatternBound();
				}
				break;
			case 4:
				_localctx = new InclusiveRangeToPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2254);
				match(DOTDOTEQ);
				setState(2255);
				rangePatternBound();
				}
				break;
			case 5:
				_localctx = new RangeFromPatternContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2256);
				rangePatternBound();
				setState(2257);
				match(DOTDOT);
				}
				break;
			case 6:
				_localctx = new ObsoleteRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2259);
				rangePatternBound();
				setState(2260);
				match(DOTDOTDOT);
				setState(2261);
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
		enterRule(_localctx, 278, RULE_rangePatternBound);
		int _la;
		try {
			setState(2277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2265);
				match(CHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2266);
				match(BYTE_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2267);
					match(MINUS);
					}
				}

				setState(2270);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2271);
					match(MINUS);
					}
				}

				setState(2274);
				match(FLOAT_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2275);
				pathPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2276);
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
		enterRule(_localctx, 280, RULE_referencePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==ANDAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2280);
				match(KW_MUT);
				}
				break;
			}
			setState(2283);
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
		enterRule(_localctx, 282, RULE_structPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_ASYNC:
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
				setState(2285);
				pathInExpression();
				}
				break;
			case LT:
				{
				setState(2286);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2289);
			match(LCURLYBRACE);
			setState(2291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 2306122079092867109L) != 0) || _la==DOTDOT || _la==POUND) {
				{
				setState(2290);
				structPatternElements();
				}
			}

			setState(2293);
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
		enterRule(_localctx, 284, RULE_structPatternElements);
		int _la;
		try {
			setState(2303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2295);
				structPatternFields();
				setState(2300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2296);
					match(COMMA);
					setState(2298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOTDOT || _la==POUND) {
						{
						setState(2297);
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
				setState(2302);
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
		enterRule(_localctx, 286, RULE_structPatternFields);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
			structPatternField();
			setState(2310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2306);
					match(COMMA);
					setState(2307);
					structPatternField();
					}
					} 
				}
				setState(2312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
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
		enterRule(_localctx, 288, RULE_structPatternField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2313);
				outerAttribute();
				}
				}
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2319);
				tupleIndex();
				setState(2320);
				match(COLON);
				setState(2321);
				pattern();
				}
				break;
			case 2:
				{
				setState(2323);
				identifier();
				setState(2324);
				match(COLON);
				setState(2325);
				pattern();
				}
				break;
			case 3:
				{
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_REF) {
					{
					setState(2327);
					match(KW_REF);
					}
				}

				setState(2331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MUT) {
					{
					setState(2330);
					match(KW_MUT);
					}
				}

				setState(2333);
				identifier();
				}
				break;
			case 4:
				{
				setState(2334);
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
		enterRule(_localctx, 290, RULE_structPatternEtCetera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2337);
				outerAttribute();
				}
				}
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2343);
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
		enterRule(_localctx, 292, RULE_tupleStructPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_ASYNC:
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
				setState(2345);
				pathInExpression();
				}
				break;
			case LT:
				{
				setState(2346);
				qualifiedPathInExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2349);
			match(LPAREN);
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054646968024536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || _la==LSQUAREBRACKET || _la==LPAREN) {
				{
				setState(2350);
				tupleStructItems();
				}
			}

			setState(2353);
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
		enterRule(_localctx, 294, RULE_tupleStructItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			pattern();
			setState(2360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2356);
					match(COMMA);
					setState(2357);
					pattern();
					}
					} 
				}
				setState(2362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			}
			setState(2364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2363);
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
		enterRule(_localctx, 296, RULE_tuplePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2366);
			match(LPAREN);
			setState(2368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054646968024536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || _la==LSQUAREBRACKET || _la==LPAREN) {
				{
				setState(2367);
				tuplePatternItems();
				}
			}

			setState(2370);
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
		enterRule(_localctx, 298, RULE_tuplePatternItems);
		int _la;
		try {
			int _alt;
			setState(2386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2372);
				pattern();
				setState(2373);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2375);
				restPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2376);
				pattern();
				setState(2379); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2377);
						match(COMMA);
						setState(2378);
						pattern();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2381); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2383);
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
		enterRule(_localctx, 300, RULE_groupedPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			match(LPAREN);
			setState(2389);
			pattern();
			setState(2390);
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
		enterRule(_localctx, 302, RULE_slicePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			match(LSQUAREBRACKET);
			setState(2394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -180054646968024536L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4991114317136035343L) != 0) || _la==LSQUAREBRACKET || _la==LPAREN) {
				{
				setState(2393);
				slicePatternItems();
				}
			}

			setState(2396);
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
		enterRule(_localctx, 304, RULE_slicePatternItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			pattern();
			setState(2403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2399);
					match(COMMA);
					setState(2400);
					pattern();
					}
					} 
				}
				setState(2405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			setState(2407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2406);
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
		enterRule(_localctx, 306, RULE_pathPattern);
		try {
			setState(2411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_ASYNC:
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
				setState(2409);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2410);
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
		enterRule(_localctx, 308, RULE_type_);
		int _la;
		try {
			setState(2429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				typeNoBounds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2414);
				implTraitType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2415);
				traitObjectType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2416);
				match(KW_FOR);
				setState(2417);
				match(LT);
				setState(2418);
				lifetime();
				setState(2423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2419);
					match(COMMA);
					setState(2420);
					lifetime();
					}
					}
					setState(2425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2426);
				match(GT);
				setState(2427);
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
		enterRule(_localctx, 310, RULE_typeNoBounds);
		try {
			setState(2449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2431);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
				implTraitTypeOneBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2433);
				match(KW_UNSAFE);
				setState(2434);
				genericParams();
				setState(2435);
				typeNoBounds();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2437);
				traitObjectTypeOneBound();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2438);
				typePath();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2439);
				tupleType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2440);
				neverType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2441);
				rawPointerType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2442);
				referenceType();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2443);
				arrayType();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2444);
				sliceType();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2445);
				inferredType();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2446);
				qualifiedPathInType();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2447);
				bareFunctionType();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2448);
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
		enterRule(_localctx, 312, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			match(LPAREN);
			setState(2452);
			type_();
			setState(2453);
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
		enterRule(_localctx, 314, RULE_neverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
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
		enterRule(_localctx, 316, RULE_tupleType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			match(LPAREN);
			setState(2468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283486569L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 721831665339273L) != 0)) {
				{
				setState(2461); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2458);
						type_();
						setState(2459);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2463); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283486569L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 721831665339273L) != 0)) {
					{
					setState(2465);
					type_();
					}
				}

				}
			}

			setState(2470);
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
		enterRule(_localctx, 318, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			match(LSQUAREBRACKET);
			setState(2473);
			type_();
			setState(2474);
			match(SEMI);
			setState(2475);
			expression(0);
			setState(2476);
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
		enterRule(_localctx, 320, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			match(LSQUAREBRACKET);
			setState(2479);
			type_();
			setState(2480);
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
		enterRule(_localctx, 322, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==ANDAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL) {
				{
				setState(2483);
				lifetime();
				}
			}

			setState(2487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				{
				setState(2486);
				match(KW_PIN);
				}
				break;
			}
			setState(2490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST || _la==KW_MUT) {
				{
				setState(2489);
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

			setState(2492);
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
		enterRule(_localctx, 324, RULE_rawPointerType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2494);
			match(STAR);
			setState(2495);
			_la = _input.LA(1);
			if ( !(_la==KW_CONST || _la==KW_MUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2496);
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
		enterRule(_localctx, 326, RULE_bareFunctionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(2498);
				forLifetimes();
				}
			}

			setState(2501);
			functionTypeQualifiers();
			setState(2502);
			match(KW_FN);
			setState(2503);
			match(LPAREN);
			setState(2505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283486569L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 726246891719561L) != 0)) {
				{
				setState(2504);
				functionParametersMaybeNamedVariadic();
				}
			}

			setState(2507);
			match(RPAREN);
			setState(2509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				{
				setState(2508);
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
		enterRule(_localctx, 328, RULE_functionTypeQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(2511);
				match(KW_UNSAFE);
				}
			}

			setState(2518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERN) {
				{
				setState(2514);
				match(KW_EXTERN);
				setState(2516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
					{
					setState(2515);
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
		enterRule(_localctx, 330, RULE_bareFunctionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2520);
			match(RARROW);
			setState(2521);
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
		enterRule(_localctx, 332, RULE_functionParametersMaybeNamedVariadic);
		try {
			setState(2525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2523);
				maybeNamedFunctionParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2524);
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
		enterRule(_localctx, 334, RULE_maybeNamedFunctionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2527);
			maybeNamedParam();
			setState(2532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2528);
					match(COMMA);
					setState(2529);
					maybeNamedParam();
					}
					} 
				}
				setState(2534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			}
			setState(2536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2535);
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
		enterRule(_localctx, 336, RULE_maybeNamedParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2538);
				outerAttribute();
				}
				}
				setState(2543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				{
				setState(2546);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PIN:
				case KW_ASYNC:
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
					setState(2544);
					identifier();
					}
					break;
				case UNDERSCORE:
					{
					setState(2545);
					match(UNDERSCORE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2548);
				match(COLON);
				}
				break;
			}
			setState(2553);
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
				{
				setState(2551);
				type_();
				}
				break;
			case DOTDOTDOT:
				{
				setState(2552);
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
		enterRule(_localctx, 338, RULE_maybeNamedFunctionParametersVariadic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2555);
					maybeNamedParam();
					setState(2556);
					match(COMMA);
					}
					} 
				}
				setState(2562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
			}
			setState(2563);
			maybeNamedParam();
			setState(2564);
			match(COMMA);
			setState(2568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2565);
				outerAttribute();
				}
				}
				setState(2570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2571);
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
		enterRule(_localctx, 340, RULE_traitObjectType);
		int _la;
		try {
			setState(2583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2573);
				match(KW_DYN);
				setState(2574);
				if (!( _input.LA(1) != RustLexer.PATHSEP   // ::
				        && _input.LA(1) != RustLexer.LT     // <
				      )) throw new FailedPredicateException(this, " _input.LA(1) != RustLexer.PATHSEP   // ::\n        && _input.LA(1) != RustLexer.LT     // <\n      ");
				setState(2576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(2575);
					match(STAR);
					}
				}

				setState(2578);
				typeParamBounds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(2579);
					match(STAR);
					}
				}

				setState(2582);
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
		enterRule(_localctx, 342, RULE_traitObjectTypeOneBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				{
				setState(2585);
				match(KW_DYN);
				}
				break;
			}
			setState(2589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(2588);
				match(STAR);
				}
			}

			setState(2591);
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
		enterRule(_localctx, 344, RULE_implTraitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
			match(KW_IMPL);
			setState(2595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(2594);
				match(KW_CONST);
				}
			}

			setState(2597);
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
		enterRule(_localctx, 346, RULE_implTraitTypeOneBound);
		int _la;
		try {
			setState(2609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2599);
				match(KW_IMPL);
				setState(2601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CONST) {
					{
					setState(2600);
					match(KW_CONST);
					}
				}

				setState(2603);
				closureTraitType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2604);
				match(KW_IMPL);
				setState(2606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CONST) {
					{
					setState(2605);
					match(KW_CONST);
					}
				}

				setState(2608);
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
		enterRule(_localctx, 348, RULE_closureTraitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(2611);
				forLifetimes();
				}
			}

			setState(2615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(2614);
				match(KW_ASYNC);
				}
			}

			setState(2617);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2618);
			match(LPAREN);
			setState(2620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 9222248380283486569L) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 726246891719561L) != 0)) {
				{
				setState(2619);
				functionParametersMaybeNamedVariadic();
				}
			}

			setState(2622);
			match(RPAREN);
			setState(2625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				{
				setState(2623);
				match(RARROW);
				setState(2624);
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
		enterRule(_localctx, 350, RULE_inferredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
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
		enterRule(_localctx, 352, RULE_typeParamBounds);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
			boundElement();
			setState(2634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,381,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2630);
					match(PLUS);
					setState(2631);
					boundElement();
					}
					} 
				}
				setState(2636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,381,_ctx);
			}
			setState(2638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				{
				setState(2637);
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
		enterRule(_localctx, 354, RULE_boundElement);
		try {
			setState(2645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2640);
				typeParamBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2641);
				match(LPAREN);
				setState(2642);
				typeParamBounds();
				setState(2643);
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
		enterRule(_localctx, 356, RULE_typeParamBound);
		try {
			setState(2651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2647);
				lifetime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2648);
				traitBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2649);
				closureTraitType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2650);
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
		enterRule(_localctx, 358, RULE_traitBound);
		int _la;
		try {
			setState(2684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_FOR:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_ASYNC:
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
				setState(2654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2653);
					match(NOT);
					}
				}

				setState(2657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2656);
					match(QUESTION);
					}
				}

				setState(2661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TILDE) {
					{
					setState(2659);
					match(TILDE);
					setState(2660);
					match(KW_CONST);
					}
				}

				setState(2664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2663);
					forLifetimes();
					}
				}

				setState(2666);
				typePath();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2667);
				match(LPAREN);
				setState(2669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2668);
					match(NOT);
					}
				}

				setState(2672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2671);
					match(QUESTION);
					}
				}

				setState(2676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TILDE) {
					{
					setState(2674);
					match(TILDE);
					setState(2675);
					match(KW_CONST);
					}
				}

				setState(2679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2678);
					forLifetimes();
					}
				}

				setState(2681);
				typePath();
				setState(2682);
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
		enterRule(_localctx, 360, RULE_useBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2686);
			match(KW_USE);
			setState(2687);
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
		enterRule(_localctx, 362, RULE_useBoundGenericArgs);
		int _la;
		try {
			int _alt;
			setState(2706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2689);
				match(LT);
				setState(2690);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2691);
				match(LT);
				setState(2697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2692);
						useBoundGenericArg();
						setState(2693);
						match(COMMA);
						}
						} 
					}
					setState(2699);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
				}
				setState(2700);
				useBoundGenericArg();
				setState(2702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2701);
					match(COMMA);
					}
				}

				setState(2704);
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
		enterRule(_localctx, 364, RULE_useBoundGenericArg);
		try {
			setState(2711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STATICLIFETIME:
			case LIFETIME_OR_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2708);
				lifetime();
				}
				break;
			case KW_PIN:
			case KW_ASYNC:
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
				setState(2709);
				identifier();
				}
				break;
			case KW_SELFTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2710);
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
		enterRule(_localctx, 366, RULE_lifetimeBounds);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,398,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2713);
					lifetime();
					setState(2714);
					match(PLUS);
					}
					} 
				}
				setState(2720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,398,_ctx);
			}
			setState(2722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATICLIFETIME || _la==LIFETIME_OR_LABEL) {
				{
				setState(2721);
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
		enterRule(_localctx, 368, RULE_lifetime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
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
		enterRule(_localctx, 370, RULE_simplePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2726);
				match(PATHSEP);
				}
			}

			setState(2729);
			simplePathSegment();
			setState(2734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2730);
					match(PATHSEP);
					setState(2731);
					simplePathSegment();
					}
					} 
				}
				setState(2736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
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
		enterRule(_localctx, 372, RULE_simplePathSegment);
		try {
			setState(2743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_ASYNC:
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
				setState(2737);
				identifier();
				}
				break;
			case KW_SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2738);
				match(KW_SUPER);
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2739);
				match(KW_SELFVALUE);
				}
				break;
			case KW_CRATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2740);
				match(KW_CRATE);
				}
				break;
			case KW_DOLLARCRATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2741);
				match(KW_DOLLARCRATE);
				}
				break;
			case KW_TRY:
				enterOuterAlt(_localctx, 6);
				{
				setState(2742);
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
		enterRule(_localctx, 374, RULE_pathInExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2745);
				match(PATHSEP);
				}
			}

			setState(2748);
			pathExprSegment();
			setState(2753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2749);
					match(PATHSEP);
					setState(2750);
					pathExprSegment();
					}
					} 
				}
				setState(2755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,404,_ctx);
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
		enterRule(_localctx, 376, RULE_pathExprSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2756);
			pathIdentSegment();
			setState(2759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
			case 1:
				{
				setState(2757);
				match(PATHSEP);
				setState(2758);
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
		enterRule(_localctx, 378, RULE_pathIdentSegment);
		try {
			setState(2768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PIN:
			case KW_ASYNC:
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
				setState(2761);
				identifier();
				}
				break;
			case KW_DYN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2762);
				match(KW_DYN);
				}
				break;
			case KW_SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2763);
				match(KW_SUPER);
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2764);
				match(KW_SELFVALUE);
				}
				break;
			case KW_SELFTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2765);
				match(KW_SELFTYPE);
				}
				break;
			case KW_CRATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2766);
				match(KW_CRATE);
				}
				break;
			case KW_DOLLARCRATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2767);
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
		enterRule(_localctx, 380, RULE_genericArgs);
		int _la;
		try {
			int _alt;
			setState(2813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2770);
				match(LT);
				setState(2771);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2772);
				match(LT);
				setState(2773);
				genericArgsLifetimes();
				setState(2776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
				case 1:
					{
					setState(2774);
					match(COMMA);
					setState(2775);
					genericArgsTypes();
					}
					break;
				}
				setState(2780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
				case 1:
					{
					setState(2778);
					match(COMMA);
					setState(2779);
					genericArgsBindings();
					}
					break;
				}
				setState(2783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2782);
					match(COMMA);
					}
				}

				setState(2785);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2787);
				match(LT);
				setState(2788);
				genericArgsTypes();
				setState(2791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
				case 1:
					{
					setState(2789);
					match(COMMA);
					setState(2790);
					genericArgsBindings();
					}
					break;
				}
				setState(2794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2793);
					match(COMMA);
					}
				}

				setState(2796);
				match(GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2798);
				match(LT);
				setState(2804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,412,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2799);
						genericArg();
						setState(2800);
						match(COMMA);
						}
						} 
					}
					setState(2806);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,412,_ctx);
				}
				setState(2807);
				genericArg();
				setState(2809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2808);
					match(COMMA);
					}
				}

				setState(2811);
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
		enterRule(_localctx, 382, RULE_genericArg);
		try {
			setState(2820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2815);
				lifetime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2816);
				type_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2817);
				genericArgsConst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2818);
				genericArgsBinding();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2819);
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
		enterRule(_localctx, 384, RULE_genericArgsConst);
		int _la;
		try {
			setState(2828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2822);
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
				setState(2824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2823);
					match(MINUS);
					}
				}

				setState(2826);
				literalExpression();
				}
				break;
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_PIN:
			case KW_SUPER:
			case KW_ASYNC:
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
				setState(2827);
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
		enterRule(_localctx, 386, RULE_genericArgsLifetimes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2830);
			lifetime();
			setState(2835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2831);
					match(COMMA);
					setState(2832);
					lifetime();
					}
					} 
				}
				setState(2837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
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
		enterRule(_localctx, 388, RULE_genericArgsTypes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2838);
			type_();
			setState(2843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,419,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2839);
					match(COMMA);
					setState(2840);
					type_();
					}
					} 
				}
				setState(2845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,419,_ctx);
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
		enterRule(_localctx, 390, RULE_genericArgsBindings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2846);
			genericArgsBinding();
			setState(2851);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2847);
					match(COMMA);
					setState(2848);
					genericArgsBinding();
					}
					} 
				}
				setState(2853);
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
		enterRule(_localctx, 392, RULE_genericArgsBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2854);
			identifier();
			setState(2856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2855);
				match(PATHSEP);
				}
			}

			setState(2860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				{
				setState(2858);
				genericArgs();
				}
				break;
			case LPAREN:
				{
				setState(2859);
				typePathFn();
				}
				break;
			case EQ:
				break;
			default:
				break;
			}
			setState(2862);
			match(EQ);
			setState(2865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,423,_ctx) ) {
			case 1:
				{
				setState(2863);
				type_();
				}
				break;
			case 2:
				{
				setState(2864);
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
		enterRule(_localctx, 394, RULE_genericArgsBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2867);
			identifier();
			setState(2869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2868);
				match(PATHSEP);
				}
			}

			setState(2873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				{
				setState(2871);
				genericArgs();
				}
				break;
			case LPAREN:
				{
				setState(2872);
				typePathFn();
				}
				break;
			case COLON:
				break;
			default:
				break;
			}
			setState(2875);
			match(COLON);
			setState(2876);
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
		enterRule(_localctx, 396, RULE_qualifiedPathInExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2878);
			qualifiedPathType();
			setState(2881); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2879);
					match(PATHSEP);
					setState(2880);
					pathExprSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2883); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,426,_ctx);
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
		enterRule(_localctx, 398, RULE_qualifiedPathType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885);
			match(LT);
			setState(2886);
			type_();
			setState(2889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(2887);
				match(KW_AS);
				setState(2888);
				typePath();
				}
			}

			setState(2891);
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
		enterRule(_localctx, 400, RULE_qualifiedPathInType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2893);
			qualifiedPathType();
			setState(2896); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2894);
					match(PATHSEP);
					setState(2895);
					typePathSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2898); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,428,_ctx);
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
		enterRule(_localctx, 402, RULE_typePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2900);
				match(PATHSEP);
				}
			}

			setState(2903);
			typePathSegment();
			setState(2908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,430,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2904);
					match(PATHSEP);
					setState(2905);
					typePathSegment();
					}
					} 
				}
				setState(2910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,430,_ctx);
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
		enterRule(_localctx, 404, RULE_typePathSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2911);
			pathIdentSegment();
			setState(2913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,431,_ctx) ) {
			case 1:
				{
				setState(2912);
				match(PATHSEP);
				}
				break;
			}
			setState(2917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				{
				setState(2915);
				genericArgs();
				}
				break;
			case 2:
				{
				setState(2916);
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
		enterRule(_localctx, 406, RULE_typePathFn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2919);
			match(LPAREN);
			setState(2922);
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
				{
				setState(2920);
				typePathInputs();
				}
				break;
			case DOTDOT:
				{
				setState(2921);
				match(DOTDOT);
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(2924);
			match(RPAREN);
			setState(2927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
			case 1:
				{
				setState(2925);
				match(RARROW);
				setState(2926);
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
		enterRule(_localctx, 408, RULE_typePathInputs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2929);
			type_();
			setState(2934);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,435,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2930);
					match(COMMA);
					setState(2931);
					type_();
					}
					} 
				}
				setState(2936);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,435,_ctx);
			}
			setState(2938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2937);
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
		enterRule(_localctx, 410, RULE_visibility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2940);
			match(KW_PUB);
			setState(2950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,438,_ctx) ) {
			case 1:
				{
				setState(2941);
				match(LPAREN);
				setState(2947);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_CRATE:
					{
					setState(2942);
					match(KW_CRATE);
					}
					break;
				case KW_SELFVALUE:
					{
					setState(2943);
					match(KW_SELFVALUE);
					}
					break;
				case KW_SUPER:
					{
					setState(2944);
					match(KW_SUPER);
					}
					break;
				case KW_IN:
					{
					setState(2945);
					match(KW_IN);
					setState(2946);
					simplePath();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2949);
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
		enterRule(_localctx, 412, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2952);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 8720933199873L) != 0)) ) {
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
		enterRule(_localctx, 414, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2954);
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
		enterRule(_localctx, 416, RULE_non_crate_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2956);
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
		enterRule(_localctx, 418, RULE_macroIdentifierLikeToken);
		try {
			setState(2963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,439,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2958);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2959);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2960);
				match(KW_MACRORULES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2961);
				match(KW_DOLLARCRATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2962);
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
		enterRule(_localctx, 420, RULE_macroLiteralToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2965);
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
		enterRule(_localctx, 422, RULE_macroPunctuationToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2967);
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
		enterRule(_localctx, 424, RULE_shl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2969);
			match(LT);
			setState(2970);
			if (!(this.next('<'))) throw new FailedPredicateException(this, "this.next('<')");
			setState(2971);
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
		enterRule(_localctx, 426, RULE_shr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2973);
			match(GT);
			setState(2974);
			if (!(this.next('>'))) throw new FailedPredicateException(this, "this.next('>')");
			setState(2975);
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
		case 81:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 170:
			return traitObjectType_sempred((TraitObjectTypeContext)_localctx, predIndex);
		case 212:
			return shl_sempred((ShlContext)_localctx, predIndex);
		case 213:
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
		"\u0004\u0001\u0089\u0ba2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u00d4\u0002\u00d5\u0007\u00d5\u0001\u0000\u0005\u0000\u01ae\b\u0000\n"+
		"\u0000\f\u0000\u01b1\t\u0000\u0001\u0000\u0005\u0000\u01b4\b\u0000\n\u0000"+
		"\f\u0000\u01b7\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u01be\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u01c4\b\u0002\n\u0002\f\u0002\u01c7\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u01cc\b\u0002\n\u0002\f\u0002"+
		"\u01cf\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u01d4\b"+
		"\u0002\n\u0002\f\u0002\u01d7\t\u0002\u0001\u0002\u0003\u0002\u01da\b\u0002"+
		"\u0001\u0003\u0004\u0003\u01dd\b\u0003\u000b\u0003\f\u0003\u01de\u0001"+
		"\u0003\u0003\u0003\u01e2\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u01e9\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u01ee\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u01f2"+
		"\b\u0005\n\u0005\f\u0005\u01f5\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01fd\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0201\b\u0005\n\u0005\f\u0005\u0204\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u020c\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0210\b\u0005"+
		"\n\u0005\f\u0005\u0213\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0217"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0003\u0007\u021f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0225\b\u0007\n\u0007\f\u0007\u0228\t\u0007\u0001\u0007"+
		"\u0003\u0007\u022b\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u022f\b"+
		"\u0007\n\u0007\f\u0007\u0232\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0242\b\b\u0001\b\u0003\b\u0245\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u024a\b\t\n\t\f\t\u024d\t\t\u0001\t\u0003\t\u0250\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u0258"+
		"\b\u000b\n\u000b\f\u000b\u025b\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0260\b\u000b\n\u000b\f\u000b\u0263\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0268\b\u000b\n\u000b\f\u000b\u026b\t\u000b"+
		"\u0001\u000b\u0003\u000b\u026e\b\u000b\u0001\f\u0004\f\u0271\b\f\u000b"+
		"\f\f\f\u0272\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u027a\b\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0281\b\f\u000b\f\f\f"+
		"\u0282\u0001\f\u0001\f\u0003\f\u0287\b\f\u0001\f\u0001\f\u0003\f\u028b"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0291\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0299"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0005"+
		"\u0012\u02a0\b\u0012\n\u0012\f\u0012\u02a3\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u02a7\b\u0012\u0001\u0013\u0003\u0013\u02aa\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u02b9\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u02be\b\u0014\u0001\u0015\u0003\u0015\u02c1\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u02c8\b\u0015"+
		"\n\u0015\f\u0015\u02cb\t\u0015\u0001\u0015\u0005\u0015\u02ce\b\u0015\n"+
		"\u0015\f\u0015\u02d1\t\u0015\u0001\u0015\u0003\u0015\u02d4\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u02da\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u02e0\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02e5\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0003\u001a\u02ec\b\u001a\u0001"+
		"\u001a\u0003\u001a\u02ef\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u02f6\b\u001a\n\u001a\f\u001a\u02f9\t\u001a"+
		"\u0001\u001a\u0003\u001a\u02fc\b\u001a\u0003\u001a\u02fe\b\u001a\u0001"+
		"\u001a\u0003\u001a\u0301\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0307\b\u001a\u0003\u001a\u0309\b\u001a\u0003\u001a"+
		"\u030b\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0311\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0315\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0319\b\u001b\u0001\u001b\u0003\u001b\u031c"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0320\b\u001b\u0001\u001c"+
		"\u0003\u001c\u0323\b\u001c\u0001\u001c\u0003\u001c\u0326\b\u001c\u0001"+
		"\u001c\u0003\u001c\u0329\b\u001c\u0001\u001c\u0003\u001c\u032c\b\u001c"+
		"\u0001\u001c\u0003\u001c\u032f\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0333\b\u001c\u0003\u001c\u0335\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u033b\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0340\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0345\b\u001e\n\u001e\f\u001e\u0348\t\u001e\u0001\u001e\u0003\u001e"+
		"\u034b\b\u001e\u0003\u001e\u034d\b\u001e\u0001\u001f\u0005\u001f\u0350"+
		"\b\u001f\n\u001f\f\u001f\u0353\t\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0357\b\u001f\u0001 \u0001 \u0003 \u035b\b \u0003 \u035d\b \u0001 \u0003"+
		" \u0360\b \u0001 \u0001 \u0001!\u0003!\u0365\b!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0005\"\u036c\b\"\n\"\f\"\u036f\t\"\u0001\"\u0001\"\u0001\""+
		"\u0003\"\u0374\b\"\u0001#\u0001#\u0001#\u0001#\u0003#\u037a\b#\u0001$"+
		"\u0001$\u0001$\u0001%\u0003%\u0380\b%\u0001%\u0001%\u0001%\u0003%\u0385"+
		"\b%\u0001%\u0001%\u0003%\u0389\b%\u0003%\u038b\b%\u0001%\u0003%\u038e"+
		"\b%\u0001%\u0001%\u0001%\u0003%\u0393\b%\u0003%\u0395\b%\u0001%\u0001"+
		"%\u0001&\u0001&\u0003&\u039b\b&\u0001\'\u0001\'\u0001\'\u0003\'\u03a0"+
		"\b\'\u0001\'\u0003\'\u03a3\b\'\u0001\'\u0001\'\u0003\'\u03a7\b\'\u0001"+
		"\'\u0001\'\u0003\'\u03ab\b\'\u0001(\u0001(\u0001(\u0003(\u03b0\b(\u0001"+
		"(\u0001(\u0003(\u03b4\b(\u0001(\u0001(\u0003(\u03b8\b(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0005)\u03bf\b)\n)\f)\u03c2\t)\u0001)\u0003)\u03c5\b)"+
		"\u0001*\u0005*\u03c8\b*\n*\f*\u03cb\t*\u0001*\u0003*\u03ce\b*\u0001*\u0003"+
		"*\u03d1\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u03d8\b*\u0001+\u0001"+
		"+\u0001+\u0005+\u03dd\b+\n+\f+\u03e0\t+\u0001+\u0003+\u03e3\b+\u0001,"+
		"\u0005,\u03e6\b,\n,\f,\u03e9\t,\u0001,\u0003,\u03ec\b,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0003-\u03f3\b-\u0001-\u0003-\u03f6\b-\u0001-\u0001-\u0003"+
		"-\u03fa\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u0401\b.\n.\f.\u0404"+
		"\t.\u0001.\u0003.\u0407\b.\u0001/\u0005/\u040a\b/\n/\f/\u040d\t/\u0001"+
		"/\u0003/\u0410\b/\u0001/\u0001/\u0001/\u0003/\u0415\b/\u0001/\u0003/\u0418"+
		"\b/\u00010\u00010\u00030\u041c\b0\u00010\u00010\u00011\u00011\u00031\u0422"+
		"\b1\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u0003"+
		"3\u042d\b3\u00013\u00033\u0430\b3\u00013\u00013\u00033\u0434\b3\u0001"+
		"3\u00013\u00014\u00034\u0439\b4\u00014\u00014\u00014\u00034\u043e\b4\u0001"+
		"4\u00034\u0441\b4\u00014\u00014\u00014\u00014\u00034\u0447\b4\u00014\u0003"+
		"4\u044a\b4\u00014\u00014\u00015\u00035\u044f\b5\u00015\u00015\u00035\u0453"+
		"\b5\u00015\u00015\u00015\u00015\u00015\u00035\u045a\b5\u00015\u00015\u0001"+
		"6\u00036\u045f\b6\u00016\u00036\u0462\b6\u00016\u00016\u00016\u00036\u0467"+
		"\b6\u00016\u00016\u00036\u046b\b6\u00036\u046d\b6\u00016\u00036\u0470"+
		"\b6\u00016\u00016\u00056\u0474\b6\n6\f6\u0477\t6\u00016\u00056\u047a\b"+
		"6\n6\f6\u047d\t6\u00016\u00016\u00016\u00036\u0482\b6\u00016\u00036\u0485"+
		"\b6\u00016\u00016\u00016\u00036\u048a\b6\u00016\u00016\u00036\u048e\b"+
		"6\u00036\u0490\b6\u00016\u00016\u00036\u0494\b6\u00016\u00036\u0497\b"+
		"6\u00016\u00016\u00036\u049b\b6\u00017\u00017\u00037\u049f\b7\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00038\u04a7\b8\u00018\u00018\u00038\u04ab"+
		"\b8\u00018\u00038\u04ae\b8\u00018\u00018\u00038\u04b2\b8\u00018\u0001"+
		"8\u00058\u04b6\b8\n8\f8\u04b9\t8\u00018\u00058\u04bc\b8\n8\f8\u04bf\t"+
		"8\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u04c9"+
		"\b9\u00019\u00019\u00039\u04cd\b9\u00019\u00039\u04d0\b9\u00019\u0003"+
		"9\u04d3\b9\u00019\u00019\u00019\u00019\u00039\u04d9\b9\u00019\u00019\u0005"+
		"9\u04dd\b9\n9\f9\u04e0\t9\u00019\u00059\u04e3\b9\n9\f9\u04e6\t9\u0001"+
		"9\u00019\u0001:\u0003:\u04eb\b:\u0001:\u0001:\u0003:\u04ef\b:\u0001:\u0001"+
		":\u0005:\u04f3\b:\n:\f:\u04f6\t:\u0001:\u0005:\u04f9\b:\n:\f:\u04fc\t"+
		":\u0001:\u0001:\u0001;\u0005;\u0501\b;\n;\f;\u0504\t;\u0001;\u0001;\u0003"+
		";\u0508\b;\u0001;\u0001;\u0001;\u0003;\u050d\b;\u0003;\u050f\b;\u0001"+
		"<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0005=\u0519\b=\n="+
		"\f=\u051c\t=\u0001=\u0001=\u0003=\u0520\b=\u0003=\u0522\b=\u0001=\u0001"+
		"=\u0001>\u0005>\u0527\b>\n>\f>\u052a\t>\u0001>\u0001>\u0001>\u0003>\u052f"+
		"\b>\u0001?\u0003?\u0532\b?\u0001?\u0001?\u0001?\u0003?\u0537\b?\u0001"+
		"@\u0003@\u053a\b@\u0001@\u0001@\u0001@\u0003@\u053f\b@\u0003@\u0541\b"+
		"@\u0001@\u0001@\u0003@\u0545\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u054d\bA\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0005C\u0555"+
		"\bC\nC\fC\u0558\tC\u0001C\u0001C\u0003C\u055c\bC\u0001D\u0001D\u0001D"+
		"\u0003D\u0561\bD\u0001E\u0001E\u0001E\u0001E\u0001F\u0003F\u0568\bF\u0001"+
		"F\u0001F\u0001F\u0003F\u056d\bF\u0001G\u0003G\u0570\bG\u0001G\u0001G\u0001"+
		"G\u0001G\u0001H\u0001H\u0001H\u0001I\u0005I\u057a\bI\nI\fI\u057d\tI\u0001"+
		"I\u0001I\u0003I\u0581\bI\u0001I\u0001I\u0001I\u0003I\u0586\bI\u0003I\u0588"+
		"\bI\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001L\u0001L\u0003L\u0597\bL\u0001L\u0001L\u0001L\u0001L\u0003"+
		"L\u059d\bL\u0001L\u0001L\u0003L\u05a1\bL\u0001M\u0001M\u0001M\u0003M\u05a6"+
		"\bM\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u05ad\bN\u0001O\u0005O\u05b0"+
		"\bO\nO\fO\u05b3\tO\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003"+
		"O\u05bc\bO\u0001O\u0001O\u0001O\u0001O\u0003O\u05c2\bO\u0003O\u05c4\b"+
		"O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u05cd\bP\u0003"+
		"P\u05cf\bP\u0001Q\u0001Q\u0004Q\u05d3\bQ\u000bQ\fQ\u05d4\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u05dd\bQ\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u05ea\bQ\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0003Q\u05f7\bQ\u0001Q\u0003Q\u05fa\bQ\u0001Q\u0001Q\u0003Q\u05fe\b"+
		"Q\u0001Q\u0003Q\u0601\bQ\u0001Q\u0001Q\u0003Q\u0605\bQ\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0003Q\u060c\bQ\u0001Q\u0001Q\u0003Q\u0610\bQ\u0001Q\u0001"+
		"Q\u0005Q\u0614\bQ\nQ\fQ\u0617\tQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0005"+
		"Q\u061e\bQ\nQ\fQ\u0621\tQ\u0001Q\u0003Q\u0624\bQ\u0001Q\u0001Q\u0001Q"+
		"\u0005Q\u0629\bQ\nQ\fQ\u062c\tQ\u0001Q\u0003Q\u062f\bQ\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0638\bQ\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0643\bQ\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u066c\bQ\nQ\fQ\u066f"+
		"\tQ\u0001Q\u0003Q\u0672\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003"+
		"Q\u067a\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0683"+
		"\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003"+
		"Q\u068e\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u069e\bQ\u0005Q\u06a0\bQ\n"+
		"Q\fQ\u06a3\tQ\u0001R\u0001R\u0001S\u0001S\u0001T\u0004T\u06aa\bT\u000b"+
		"T\fT\u06ab\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0001T\u0001T\u0003T\u06bb\bT\u0001U\u0001U\u0003U\u06bf"+
		"\bU\u0001U\u0001U\u0001V\u0001V\u0001V\u0003V\u06c6\bV\u0001V\u0001V\u0001"+
		"W\u0001W\u0003W\u06cc\bW\u0001W\u0001W\u0003W\u06d0\bW\u0001W\u0001W\u0003"+
		"W\u06d4\bW\u0001W\u0001W\u0003W\u06d8\bW\u0001W\u0001W\u0003W\u06dc\b"+
		"W\u0001W\u0001W\u0003W\u06e0\bW\u0001W\u0001W\u0003W\u06e4\bW\u0001W\u0001"+
		"W\u0003W\u06e8\bW\u0001W\u0001W\u0003W\u06ec\bW\u0001W\u0001W\u0001W\u0003"+
		"W\u06f1\bW\u0001W\u0001W\u0003W\u06f5\bW\u0001X\u0001X\u0003X\u06f9\b"+
		"X\u0001Y\u0001Y\u0005Y\u06fd\bY\nY\fY\u0700\tY\u0001Y\u0003Y\u0703\bY"+
		"\u0001Y\u0001Y\u0001Z\u0004Z\u0708\bZ\u000bZ\fZ\u0709\u0001Z\u0003Z\u070d"+
		"\bZ\u0001Z\u0003Z\u0710\bZ\u0001[\u0001[\u0003[\u0714\b[\u0001[\u0001"+
		"[\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001^\u0001^\u0001^\u0001"+
		"_\u0001_\u0001_\u0005_\u0724\b_\n_\f_\u0727\t_\u0001_\u0003_\u072a\b_"+
		"\u0001_\u0001_\u0001_\u0001_\u0003_\u0730\b_\u0001`\u0001`\u0001`\u0004"+
		"`\u0735\b`\u000b`\f`\u0736\u0001`\u0003`\u073a\b`\u0001a\u0001a\u0001"+
		"b\u0001b\u0001b\u0003b\u0741\bb\u0001c\u0001c\u0003c\u0745\bc\u0001c\u0001"+
		"c\u0005c\u0749\bc\nc\fc\u074c\tc\u0001c\u0001c\u0003c\u0750\bc\u0001c"+
		"\u0001c\u0001d\u0001d\u0001d\u0005d\u0757\bd\nd\fd\u075a\td\u0001d\u0001"+
		"d\u0001d\u0003d\u075f\bd\u0003d\u0761\bd\u0001e\u0005e\u0764\be\ne\fe"+
		"\u0767\te\u0001e\u0001e\u0001e\u0003e\u076c\be\u0001e\u0001e\u0001e\u0003"+
		"e\u0771\be\u0001f\u0001f\u0003f\u0775\bf\u0001g\u0001g\u0001g\u0005g\u077a"+
		"\bg\ng\fg\u077d\tg\u0001g\u0001g\u0001g\u0005g\u0782\bg\ng\fg\u0785\t"+
		"g\u0001g\u0003g\u0788\bg\u0003g\u078a\bg\u0001g\u0001g\u0001h\u0001h\u0001"+
		"i\u0001i\u0001i\u0003i\u0793\bi\u0001j\u0001j\u0001j\u0003j\u0798\bj\u0001"+
		"j\u0001j\u0001k\u0001k\u0001k\u0005k\u079f\bk\nk\fk\u07a2\tk\u0001k\u0003"+
		"k\u07a5\bk\u0001l\u0001l\u0001l\u0003l\u07aa\bl\u0001l\u0001l\u0001l\u0003"+
		"l\u07af\bl\u0001m\u0001m\u0001m\u0001m\u0001m\u0005m\u07b6\bm\nm\fm\u07b9"+
		"\tm\u0001m\u0003m\u07bc\bm\u0003m\u07be\bm\u0001m\u0001m\u0001n\u0001"+
		"n\u0001o\u0001o\u0001o\u0005o\u07c7\bo\no\fo\u07ca\to\u0001o\u0003o\u07cd"+
		"\bo\u0001p\u0003p\u07d0\bp\u0001p\u0003p\u07d3\bp\u0001p\u0003p\u07d6"+
		"\bp\u0001p\u0003p\u07d9\bp\u0001p\u0003p\u07dc\bp\u0001p\u0001p\u0001"+
		"p\u0003p\u07e1\bp\u0001p\u0003p\u07e4\bp\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0003p\u07eb\bp\u0001q\u0001q\u0001q\u0005q\u07f0\bq\nq\fq\u07f3\tq"+
		"\u0001q\u0003q\u07f6\bq\u0001r\u0005r\u07f9\br\nr\fr\u07fc\tr\u0001r\u0001"+
		"r\u0001r\u0003r\u0801\br\u0001s\u0003s\u0804\bs\u0001s\u0001s\u0001s\u0001"+
		"s\u0003s\u080a\bs\u0001s\u0001s\u0001s\u0003s\u080f\bs\u0001t\u0001t\u0001"+
		"t\u0001u\u0001u\u0001u\u0001u\u0001v\u0001v\u0001v\u0001v\u0001v\u0001"+
		"v\u0001v\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001x\u0001x\u0001"+
		"y\u0001y\u0001y\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0003"+
		"z\u0831\bz\u0003z\u0833\bz\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0003{\u083f\b{\u0003{\u0841\b{\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001}\u0001}\u0001}\u0001}\u0005}\u084c\b}\n}\f}\u084f"+
		"\t}\u0001}\u0003}\u0852\b}\u0001}\u0001}\u0001~\u0001~\u0001~\u0001~\u0005"+
		"~\u085a\b~\n~\f~\u085d\t~\u0001~\u0001~\u0001~\u0001~\u0003~\u0863\b~"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f"+
		"\u086a\b\u007f\u0003\u007f\u086c\b\u007f\u0001\u0080\u0005\u0080\u086f"+
		"\b\u0080\n\u0080\f\u0080\u0872\t\u0080\u0001\u0080\u0001\u0080\u0003\u0080"+
		"\u0876\b\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0082\u0003\u0082"+
		"\u087c\b\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u0881\b"+
		"\u0082\n\u0082\f\u0082\u0884\t\u0082\u0001\u0083\u0001\u0083\u0003\u0083"+
		"\u0888\b\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083"+
		"\u0003\u0083\u088f\b\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u089f\b\u0084"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0003\u0086\u08ad\b\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u08b1\b"+
		"\u0086\u0001\u0086\u0003\u0086\u08b4\b\u0086\u0001\u0087\u0005\u0087\u08b7"+
		"\b\u0087\n\u0087\f\u0087\u08ba\t\u0087\u0001\u0087\u0001\u0087\u0001\u0087"+
		"\u0003\u0087\u08bf\b\u0087\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0003\u008a\u08d8\b\u008a\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0003\u008b\u08dd\b\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u08e1\b"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u08e6\b\u008b\u0001"+
		"\u008c\u0001\u008c\u0003\u008c\u08ea\b\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008d\u0001\u008d\u0003\u008d\u08f0\b\u008d\u0001\u008d\u0001\u008d\u0003"+
		"\u008d\u08f4\b\u008d\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0003\u008e\u08fb\b\u008e\u0003\u008e\u08fd\b\u008e\u0001\u008e"+
		"\u0003\u008e\u0900\b\u008e\u0001\u008f\u0001\u008f\u0001\u008f\u0005\u008f"+
		"\u0905\b\u008f\n\u008f\f\u008f\u0908\t\u008f\u0001\u0090\u0005\u0090\u090b"+
		"\b\u0090\n\u0090\f\u0090\u090e\t\u0090\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0003\u0090\u0919\b\u0090\u0001\u0090\u0003\u0090\u091c\b\u0090\u0001"+
		"\u0090\u0001\u0090\u0003\u0090\u0920\b\u0090\u0001\u0091\u0005\u0091\u0923"+
		"\b\u0091\n\u0091\f\u0091\u0926\t\u0091\u0001\u0091\u0001\u0091\u0001\u0092"+
		"\u0001\u0092\u0003\u0092\u092c\b\u0092\u0001\u0092\u0001\u0092\u0003\u0092"+
		"\u0930\b\u0092\u0001\u0092\u0001\u0092\u0001\u0093\u0001\u0093\u0001\u0093"+
		"\u0005\u0093\u0937\b\u0093\n\u0093\f\u0093\u093a\t\u0093\u0001\u0093\u0003"+
		"\u0093\u093d\b\u0093\u0001\u0094\u0001\u0094\u0003\u0094\u0941\b\u0094"+
		"\u0001\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095"+
		"\u0001\u0095\u0001\u0095\u0001\u0095\u0004\u0095\u094c\b\u0095\u000b\u0095"+
		"\f\u0095\u094d\u0001\u0095\u0003\u0095\u0951\b\u0095\u0003\u0095\u0953"+
		"\b\u0095\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0097\u0001"+
		"\u0097\u0003\u0097\u095b\b\u0097\u0001\u0097\u0001\u0097\u0001\u0098\u0001"+
		"\u0098\u0001\u0098\u0005\u0098\u0962\b\u0098\n\u0098\f\u0098\u0965\t\u0098"+
		"\u0001\u0098\u0003\u0098\u0968\b\u0098\u0001\u0099\u0001\u0099\u0003\u0099"+
		"\u096c\b\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a"+
		"\u0001\u009a\u0001\u009a\u0001\u009a\u0005\u009a\u0976\b\u009a\n\u009a"+
		"\f\u009a\u0979\t\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a"+
		"\u097e\b\u009a\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0001\u009b\u0003\u009b\u0992\b\u009b\u0001\u009c\u0001\u009c\u0001\u009c"+
		"\u0001\u009c\u0001\u009d\u0001\u009d\u0001\u009e\u0001\u009e\u0001\u009e"+
		"\u0001\u009e\u0004\u009e\u099e\b\u009e\u000b\u009e\f\u009e\u099f\u0001"+
		"\u009e\u0003\u009e\u09a3\b\u009e\u0003\u009e\u09a5\b\u009e\u0001\u009e"+
		"\u0001\u009e\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u009f"+
		"\u0001\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a1"+
		"\u0001\u00a1\u0003\u00a1\u09b5\b\u00a1\u0001\u00a1\u0003\u00a1\u09b8\b"+
		"\u00a1\u0001\u00a1\u0003\u00a1\u09bb\b\u00a1\u0001\u00a1\u0001\u00a1\u0001"+
		"\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a3\u0003\u00a3\u09c4"+
		"\b\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0003\u00a3\u09ca"+
		"\b\u00a3\u0001\u00a3\u0001\u00a3\u0003\u00a3\u09ce\b\u00a3\u0001\u00a4"+
		"\u0003\u00a4\u09d1\b\u00a4\u0001\u00a4\u0001\u00a4\u0003\u00a4\u09d5\b"+
		"\u00a4\u0003\u00a4\u09d7\b\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001"+
		"\u00a6\u0001\u00a6\u0003\u00a6\u09de\b\u00a6\u0001\u00a7\u0001\u00a7\u0001"+
		"\u00a7\u0005\u00a7\u09e3\b\u00a7\n\u00a7\f\u00a7\u09e6\t\u00a7\u0001\u00a7"+
		"\u0003\u00a7\u09e9\b\u00a7\u0001\u00a8\u0005\u00a8\u09ec\b\u00a8\n\u00a8"+
		"\f\u00a8\u09ef\t\u00a8\u0001\u00a8\u0001\u00a8\u0003\u00a8\u09f3\b\u00a8"+
		"\u0001\u00a8\u0003\u00a8\u09f6\b\u00a8\u0001\u00a8\u0001\u00a8\u0003\u00a8"+
		"\u09fa\b\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0005\u00a9\u09ff\b"+
		"\u00a9\n\u00a9\f\u00a9\u0a02\t\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9"+
		"\u0005\u00a9\u0a07\b\u00a9\n\u00a9\f\u00a9\u0a0a\t\u00a9\u0001\u00a9\u0001"+
		"\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0003\u00aa\u0a11\b\u00aa\u0001"+
		"\u00aa\u0001\u00aa\u0003\u00aa\u0a15\b\u00aa\u0001\u00aa\u0003\u00aa\u0a18"+
		"\b\u00aa\u0001\u00ab\u0003\u00ab\u0a1b\b\u00ab\u0001\u00ab\u0003\u00ab"+
		"\u0a1e\b\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0003\u00ac"+
		"\u0a24\b\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ad\u0001\u00ad\u0003\u00ad"+
		"\u0a2a\b\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u0a2f\b"+
		"\u00ad\u0001\u00ad\u0003\u00ad\u0a32\b\u00ad\u0001\u00ae\u0003\u00ae\u0a35"+
		"\b\u00ae\u0001\u00ae\u0003\u00ae\u0a38\b\u00ae\u0001\u00ae\u0001\u00ae"+
		"\u0001\u00ae\u0003\u00ae\u0a3d\b\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae"+
		"\u0003\u00ae\u0a42\b\u00ae\u0001\u00af\u0001\u00af\u0001\u00b0\u0001\u00b0"+
		"\u0001\u00b0\u0005\u00b0\u0a49\b\u00b0\n\u00b0\f\u00b0\u0a4c\t\u00b0\u0001"+
		"\u00b0\u0003\u00b0\u0a4f\b\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001"+
		"\u00b1\u0001\u00b1\u0003\u00b1\u0a56\b\u00b1\u0001\u00b2\u0001\u00b2\u0001"+
		"\u00b2\u0001\u00b2\u0003\u00b2\u0a5c\b\u00b2\u0001\u00b3\u0003\u00b3\u0a5f"+
		"\b\u00b3\u0001\u00b3\u0003\u00b3\u0a62\b\u00b3\u0001\u00b3\u0001\u00b3"+
		"\u0003\u00b3\u0a66\b\u00b3\u0001\u00b3\u0003\u00b3\u0a69\b\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b3\u0003\u00b3\u0a6e\b\u00b3\u0001\u00b3\u0003"+
		"\u00b3\u0a71\b\u00b3\u0001\u00b3\u0001\u00b3\u0003\u00b3\u0a75\b\u00b3"+
		"\u0001\u00b3\u0003\u00b3\u0a78\b\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3"+
		"\u0003\u00b3\u0a7d\b\u00b3\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b5"+
		"\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0005\u00b5"+
		"\u0a88\b\u00b5\n\u00b5\f\u00b5\u0a8b\t\u00b5\u0001\u00b5\u0001\u00b5\u0003"+
		"\u00b5\u0a8f\b\u00b5\u0001\u00b5\u0001\u00b5\u0003\u00b5\u0a93\b\u00b5"+
		"\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0003\u00b6\u0a98\b\u00b6\u0001\u00b7"+
		"\u0001\u00b7\u0001\u00b7\u0005\u00b7\u0a9d\b\u00b7\n\u00b7\f\u00b7\u0aa0"+
		"\t\u00b7\u0001\u00b7\u0003\u00b7\u0aa3\b\u00b7\u0001\u00b8\u0001\u00b8"+
		"\u0001\u00b9\u0003\u00b9\u0aa8\b\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9"+
		"\u0005\u00b9\u0aad\b\u00b9\n\u00b9\f\u00b9\u0ab0\t\u00b9\u0001\u00ba\u0001"+
		"\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0003\u00ba\u0ab8"+
		"\b\u00ba\u0001\u00bb\u0003\u00bb\u0abb\b\u00bb\u0001\u00bb\u0001\u00bb"+
		"\u0001\u00bb\u0005\u00bb\u0ac0\b\u00bb\n\u00bb\f\u00bb\u0ac3\t\u00bb\u0001"+
		"\u00bc\u0001\u00bc\u0001\u00bc\u0003\u00bc\u0ac8\b\u00bc\u0001\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0003"+
		"\u00bd\u0ad1\b\u00bd\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0001"+
		"\u00be\u0001\u00be\u0003\u00be\u0ad9\b\u00be\u0001\u00be\u0001\u00be\u0003"+
		"\u00be\u0add\b\u00be\u0001\u00be\u0003\u00be\u0ae0\b\u00be\u0001\u00be"+
		"\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0003\u00be"+
		"\u0ae8\b\u00be\u0001\u00be\u0003\u00be\u0aeb\b\u00be\u0001\u00be\u0001"+
		"\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0005\u00be\u0af3"+
		"\b\u00be\n\u00be\f\u00be\u0af6\t\u00be\u0001\u00be\u0001\u00be\u0003\u00be"+
		"\u0afa\b\u00be\u0001\u00be\u0001\u00be\u0003\u00be\u0afe\b\u00be\u0001"+
		"\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf\u0b05"+
		"\b\u00bf\u0001\u00c0\u0001\u00c0\u0003\u00c0\u0b09\b\u00c0\u0001\u00c0"+
		"\u0001\u00c0\u0003\u00c0\u0b0d\b\u00c0\u0001\u00c1\u0001\u00c1\u0001\u00c1"+
		"\u0005\u00c1\u0b12\b\u00c1\n\u00c1\f\u00c1\u0b15\t\u00c1\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0005\u00c2\u0b1a\b\u00c2\n\u00c2\f\u00c2\u0b1d\t\u00c2"+
		"\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0005\u00c3\u0b22\b\u00c3\n\u00c3"+
		"\f\u00c3\u0b25\t\u00c3\u0001\u00c4\u0001\u00c4\u0003\u00c4\u0b29\b\u00c4"+
		"\u0001\u00c4\u0001\u00c4\u0003\u00c4\u0b2d\b\u00c4\u0001\u00c4\u0001\u00c4"+
		"\u0001\u00c4\u0003\u00c4\u0b32\b\u00c4\u0001\u00c5\u0001\u00c5\u0003\u00c5"+
		"\u0b36\b\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u0b3a\b\u00c5\u0001"+
		"\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0004"+
		"\u00c6\u0b42\b\u00c6\u000b\u00c6\f\u00c6\u0b43\u0001\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0003\u00c7\u0b4a\b\u00c7\u0001\u00c7\u0001\u00c7"+
		"\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0004\u00c8\u0b51\b\u00c8\u000b\u00c8"+
		"\f\u00c8\u0b52\u0001\u00c9\u0003\u00c9\u0b56\b\u00c9\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0005\u00c9\u0b5b\b\u00c9\n\u00c9\f\u00c9\u0b5e\t\u00c9"+
		"\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0b62\b\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0003\u00ca\u0b66\b\u00ca\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb"+
		"\u0b6b\b\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u0b70\b"+
		"\u00cb\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0005\u00cc\u0b75\b\u00cc\n"+
		"\u00cc\f\u00cc\u0b78\t\u00cc\u0001\u00cc\u0003\u00cc\u0b7b\b\u00cc\u0001"+
		"\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001"+
		"\u00cd\u0003\u00cd\u0b84\b\u00cd\u0001\u00cd\u0003\u00cd\u0b87\b\u00cd"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00cf\u0001\u00cf\u0001\u00d0\u0001\u00d0"+
		"\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0003\u00d1"+
		"\u0b94\b\u00d1\u0001\u00d2\u0001\u00d2\u0001\u00d3\u0001\u00d3\u0001\u00d4"+
		"\u0001\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d5\u0001\u00d5\u0001\u00d5"+
		"\u0001\u00d5\u0001\u00d5\u0000\u0001\u00a2\u00d6\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"+
		"\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"+
		"\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"+
		"\u01aa\u0000\u0012\u0002\u0000^^\u0081\u0081\u0003\u0000XXZZ\u0083\u0083"+
		"\u0001\u0000!\"\u0001\u0000JK\u0002\u0000``bb\u0002\u0000\u0003\u0003"+
		"\u0014\u0014\u0002\u0000YY^^\u0001\u0000Z\\\u0001\u0000XY\u0001\u0000"+
		"ot\u0001\u0000dm\u0002\u0000\u0014\u0014\u0016\u0016\u0001\u0000?A\u0002"+
		"\u000099WW\u0006\u0000\u0019\u0019&&..88:<>C\u0003\u0000\u0001\u0018\u001a"+
		"-/9\u0003\u0000\u0001\u0004\u0006-/9\u0002\u0000YY[\u0081\u0d40\u0000"+
		"\u01af\u0001\u0000\u0000\u0000\u0002\u01ba\u0001\u0000\u0000\u0000\u0004"+
		"\u01d9\u0001\u0000\u0000\u0000\u0006\u01e1\u0001\u0000\u0000\u0000\b\u01e8"+
		"\u0001\u0000\u0000\u0000\n\u0216\u0001\u0000\u0000\u0000\f\u0218\u0001"+
		"\u0000\u0000\u0000\u000e\u021e\u0001\u0000\u0000\u0000\u0010\u0244\u0001"+
		"\u0000\u0000\u0000\u0012\u0246\u0001\u0000\u0000\u0000\u0014\u0251\u0001"+
		"\u0000\u0000\u0000\u0016\u026d\u0001\u0000\u0000\u0000\u0018\u028a\u0001"+
		"\u0000\u0000\u0000\u001a\u0290\u0001\u0000\u0000\u0000\u001c\u0292\u0001"+
		"\u0000\u0000\u0000\u001e\u0298\u0001\u0000\u0000\u0000 \u029a\u0001\u0000"+
		"\u0000\u0000\"\u029c\u0001\u0000\u0000\u0000$\u02a1\u0001\u0000\u0000"+
		"\u0000&\u02a9\u0001\u0000\u0000\u0000(\u02bd\u0001\u0000\u0000\u0000*"+
		"\u02c0\u0001\u0000\u0000\u0000,\u02d5\u0001\u0000\u0000\u0000.\u02df\u0001"+
		"\u0000\u0000\u00000\u02e1\u0001\u0000\u0000\u00002\u02e6\u0001\u0000\u0000"+
		"\u00004\u030a\u0001\u0000\u0000\u00006\u030c\u0001\u0000\u0000\u00008"+
		"\u0322\u0001\u0000\u0000\u0000:\u0336\u0001\u0000\u0000\u0000<\u034c\u0001"+
		"\u0000\u0000\u0000>\u0351\u0001\u0000\u0000\u0000@\u035c\u0001\u0000\u0000"+
		"\u0000B\u0364\u0001\u0000\u0000\u0000D\u036d\u0001\u0000\u0000\u0000F"+
		"\u0375\u0001\u0000\u0000\u0000H\u037b\u0001\u0000\u0000\u0000J\u037f\u0001"+
		"\u0000\u0000\u0000L\u039a\u0001\u0000\u0000\u0000N\u039c\u0001\u0000\u0000"+
		"\u0000P\u03ac\u0001\u0000\u0000\u0000R\u03bb\u0001\u0000\u0000\u0000T"+
		"\u03c9\u0001\u0000\u0000\u0000V\u03d9\u0001\u0000\u0000\u0000X\u03e7\u0001"+
		"\u0000\u0000\u0000Z\u03ef\u0001\u0000\u0000\u0000\\\u03fd\u0001\u0000"+
		"\u0000\u0000^\u040b\u0001\u0000\u0000\u0000`\u0419\u0001\u0000\u0000\u0000"+
		"b\u041f\u0001\u0000\u0000\u0000d\u0425\u0001\u0000\u0000\u0000f\u0428"+
		"\u0001\u0000\u0000\u0000h\u0438\u0001\u0000\u0000\u0000j\u044e\u0001\u0000"+
		"\u0000\u0000l\u049a\u0001\u0000\u0000\u0000n\u049e\u0001\u0000\u0000\u0000"+
		"p\u04a6\u0001\u0000\u0000\u0000r\u04c8\u0001\u0000\u0000\u0000t\u04ea"+
		"\u0001\u0000\u0000\u0000v\u0502\u0001\u0000\u0000\u0000x\u0510\u0001\u0000"+
		"\u0000\u0000z\u0514\u0001\u0000\u0000\u0000|\u0528\u0001\u0000\u0000\u0000"+
		"~\u0531\u0001\u0000\u0000\u0000\u0080\u0539\u0001\u0000\u0000\u0000\u0082"+
		"\u0546\u0001\u0000\u0000\u0000\u0084\u054e\u0001\u0000\u0000\u0000\u0086"+
		"\u0550\u0001\u0000\u0000\u0000\u0088\u0560\u0001\u0000\u0000\u0000\u008a"+
		"\u0562\u0001\u0000\u0000\u0000\u008c\u0567\u0001\u0000\u0000\u0000\u008e"+
		"\u056f\u0001\u0000\u0000\u0000\u0090\u0575\u0001\u0000\u0000\u0000\u0092"+
		"\u057b\u0001\u0000\u0000\u0000\u0094\u0589\u0001\u0000\u0000\u0000\u0096"+
		"\u058f\u0001\u0000\u0000\u0000\u0098\u05a0\u0001\u0000\u0000\u0000\u009a"+
		"\u05a5\u0001\u0000\u0000\u0000\u009c\u05ac\u0001\u0000\u0000\u0000\u009e"+
		"\u05b1\u0001\u0000\u0000\u0000\u00a0\u05ce\u0001\u0000\u0000\u0000\u00a2"+
		"\u0637\u0001\u0000\u0000\u0000\u00a4\u06a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u06a6\u0001\u0000\u0000\u0000\u00a8\u06ba\u0001\u0000\u0000\u0000\u00aa"+
		"\u06bc\u0001\u0000\u0000\u0000\u00ac\u06c2\u0001\u0000\u0000\u0000\u00ae"+
		"\u06f4\u0001\u0000\u0000\u0000\u00b0\u06f8\u0001\u0000\u0000\u0000\u00b2"+
		"\u06fa\u0001\u0000\u0000\u0000\u00b4\u070f\u0001\u0000\u0000\u0000\u00b6"+
		"\u0711\u0001\u0000\u0000\u0000\u00b8\u0717\u0001\u0000\u0000\u0000\u00ba"+
		"\u071a\u0001\u0000\u0000\u0000\u00bc\u071d\u0001\u0000\u0000\u0000\u00be"+
		"\u072f\u0001\u0000\u0000\u0000\u00c0\u0734\u0001\u0000\u0000\u0000\u00c2"+
		"\u073b\u0001\u0000\u0000\u0000\u00c4\u0740\u0001\u0000\u0000\u0000\u00c6"+
		"\u0744\u0001\u0000\u0000\u0000\u00c8\u0753\u0001\u0000\u0000\u0000\u00ca"+
		"\u0765\u0001\u0000\u0000\u0000\u00cc\u0772\u0001\u0000\u0000\u0000\u00ce"+
		"\u0776\u0001\u0000\u0000\u0000\u00d0\u078d\u0001\u0000\u0000\u0000\u00d2"+
		"\u0792\u0001\u0000\u0000\u0000\u00d4\u0794\u0001\u0000\u0000\u0000\u00d6"+
		"\u079b\u0001\u0000\u0000\u0000\u00d8\u07ae\u0001\u0000\u0000\u0000\u00da"+
		"\u07b0\u0001\u0000\u0000\u0000\u00dc\u07c1\u0001\u0000\u0000\u0000\u00de"+
		"\u07c3\u0001\u0000\u0000\u0000\u00e0\u07cf\u0001\u0000\u0000\u0000\u00e2"+
		"\u07ec\u0001\u0000\u0000\u0000\u00e4\u07fa\u0001\u0000\u0000\u0000\u00e6"+
		"\u080e\u0001\u0000\u0000\u0000\u00e8\u0810\u0001\u0000\u0000\u0000\u00ea"+
		"\u0813\u0001\u0000\u0000\u0000\u00ec\u0817\u0001\u0000\u0000\u0000\u00ee"+
		"\u081e\u0001\u0000\u0000\u0000\u00f0\u0824\u0001\u0000\u0000\u0000\u00f2"+
		"\u0826\u0001\u0000\u0000\u0000\u00f4\u0829\u0001\u0000\u0000\u0000\u00f6"+
		"\u0834\u0001\u0000\u0000\u0000\u00f8\u0842\u0001\u0000\u0000\u0000\u00fa"+
		"\u0847\u0001\u0000\u0000\u0000\u00fc\u085b\u0001\u0000\u0000\u0000\u00fe"+
		"\u086b\u0001\u0000\u0000\u0000\u0100\u0870\u0001\u0000\u0000\u0000\u0102"+
		"\u0877\u0001\u0000\u0000\u0000\u0104\u087b\u0001\u0000\u0000\u0000\u0106"+
		"\u088e\u0001\u0000\u0000\u0000\u0108\u089e\u0001\u0000\u0000\u0000\u010a"+
		"\u08a0\u0001\u0000\u0000\u0000\u010c\u08b3\u0001\u0000\u0000\u0000\u010e"+
		"\u08b8\u0001\u0000\u0000\u0000\u0110\u08c0\u0001\u0000\u0000\u0000\u0112"+
		"\u08c2\u0001\u0000\u0000\u0000\u0114\u08d7\u0001\u0000\u0000\u0000\u0116"+
		"\u08e5\u0001\u0000\u0000\u0000\u0118\u08e7\u0001\u0000\u0000\u0000\u011a"+
		"\u08ef\u0001\u0000\u0000\u0000\u011c\u08ff\u0001\u0000\u0000\u0000\u011e"+
		"\u0901\u0001\u0000\u0000\u0000\u0120\u090c\u0001\u0000\u0000\u0000\u0122"+
		"\u0924\u0001\u0000\u0000\u0000\u0124\u092b\u0001\u0000\u0000\u0000\u0126"+
		"\u0933\u0001\u0000\u0000\u0000\u0128\u093e\u0001\u0000\u0000\u0000\u012a"+
		"\u0952\u0001\u0000\u0000\u0000\u012c\u0954\u0001\u0000\u0000\u0000\u012e"+
		"\u0958\u0001\u0000\u0000\u0000\u0130\u095e\u0001\u0000\u0000\u0000\u0132"+
		"\u096b\u0001\u0000\u0000\u0000\u0134\u097d\u0001\u0000\u0000\u0000\u0136"+
		"\u0991\u0001\u0000\u0000\u0000\u0138\u0993\u0001\u0000\u0000\u0000\u013a"+
		"\u0997\u0001\u0000\u0000\u0000\u013c\u0999\u0001\u0000\u0000\u0000\u013e"+
		"\u09a8\u0001\u0000\u0000\u0000\u0140\u09ae\u0001\u0000\u0000\u0000\u0142"+
		"\u09b2\u0001\u0000\u0000\u0000\u0144\u09be\u0001\u0000\u0000\u0000\u0146"+
		"\u09c3\u0001\u0000\u0000\u0000\u0148\u09d0\u0001\u0000\u0000\u0000\u014a"+
		"\u09d8\u0001\u0000\u0000\u0000\u014c\u09dd\u0001\u0000\u0000\u0000\u014e"+
		"\u09df\u0001\u0000\u0000\u0000\u0150\u09ed\u0001\u0000\u0000\u0000\u0152"+
		"\u0a00\u0001\u0000\u0000\u0000\u0154\u0a17\u0001\u0000\u0000\u0000\u0156"+
		"\u0a1a\u0001\u0000\u0000\u0000\u0158\u0a21\u0001\u0000\u0000\u0000\u015a"+
		"\u0a31\u0001\u0000\u0000\u0000\u015c\u0a34\u0001\u0000\u0000\u0000\u015e"+
		"\u0a43\u0001\u0000\u0000\u0000\u0160\u0a45\u0001\u0000\u0000\u0000\u0162"+
		"\u0a55\u0001\u0000\u0000\u0000\u0164\u0a5b\u0001\u0000\u0000\u0000\u0166"+
		"\u0a7c\u0001\u0000\u0000\u0000\u0168\u0a7e\u0001\u0000\u0000\u0000\u016a"+
		"\u0a92\u0001\u0000\u0000\u0000\u016c\u0a97\u0001\u0000\u0000\u0000\u016e"+
		"\u0a9e\u0001\u0000\u0000\u0000\u0170\u0aa4\u0001\u0000\u0000\u0000\u0172"+
		"\u0aa7\u0001\u0000\u0000\u0000\u0174\u0ab7\u0001\u0000\u0000\u0000\u0176"+
		"\u0aba\u0001\u0000\u0000\u0000\u0178\u0ac4\u0001\u0000\u0000\u0000\u017a"+
		"\u0ad0\u0001\u0000\u0000\u0000\u017c\u0afd\u0001\u0000\u0000\u0000\u017e"+
		"\u0b04\u0001\u0000\u0000\u0000\u0180\u0b0c\u0001\u0000\u0000\u0000\u0182"+
		"\u0b0e\u0001\u0000\u0000\u0000\u0184\u0b16\u0001\u0000\u0000\u0000\u0186"+
		"\u0b1e\u0001\u0000\u0000\u0000\u0188\u0b26\u0001\u0000\u0000\u0000\u018a"+
		"\u0b33\u0001\u0000\u0000\u0000\u018c\u0b3e\u0001\u0000\u0000\u0000\u018e"+
		"\u0b45\u0001\u0000\u0000\u0000\u0190\u0b4d\u0001\u0000\u0000\u0000\u0192"+
		"\u0b55\u0001\u0000\u0000\u0000\u0194\u0b5f\u0001\u0000\u0000\u0000\u0196"+
		"\u0b67\u0001\u0000\u0000\u0000\u0198\u0b71\u0001\u0000\u0000\u0000\u019a"+
		"\u0b7c\u0001\u0000\u0000\u0000\u019c\u0b88\u0001\u0000\u0000\u0000\u019e"+
		"\u0b8a\u0001\u0000\u0000\u0000\u01a0\u0b8c\u0001\u0000\u0000\u0000\u01a2"+
		"\u0b93\u0001\u0000\u0000\u0000\u01a4\u0b95\u0001\u0000\u0000\u0000\u01a6"+
		"\u0b97\u0001\u0000\u0000\u0000\u01a8\u0b99\u0001\u0000\u0000\u0000\u01aa"+
		"\u0b9d\u0001\u0000\u0000\u0000\u01ac\u01ae\u0003\u0094J\u0000\u01ad\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b4"+
		"\u0003$\u0012\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0005\u0000\u0000\u0001\u01b9\u0001\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0003\u0172\u00b9\u0000\u01bb\u01bd\u0007"+
		"\u0000\u0000\u0000\u01bc\u01be\u0003\u0172\u00b9\u0000\u01bd\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0003\u0004\u0002\u0000\u01c0\u0003\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c5\u0005\u0088\u0000\u0000\u01c2\u01c4\u0003"+
		"\u0006\u0003\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c8\u01da\u0005\u0089\u0000\u0000\u01c9\u01cd\u0005"+
		"\u0086\u0000\u0000\u01ca\u01cc\u0003\u0006\u0003\u0000\u01cb\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01da\u0005"+
		"\u0087\u0000\u0000\u01d1\u01d5\u0005\u0084\u0000\u0000\u01d2\u01d4\u0003"+
		"\u0006\u0003\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d8\u01da\u0005\u0085\u0000\u0000\u01d9\u01c1\u0001"+
		"\u0000\u0000\u0000\u01d9\u01c9\u0001\u0000\u0000\u0000\u01d9\u01d1\u0001"+
		"\u0000\u0000\u0000\u01da\u0005\u0001\u0000\u0000\u0000\u01db\u01dd\u0003"+
		"\b\u0004\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000"+
		"\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01e2\u0003\u0004"+
		"\u0002\u0000\u01e1\u01dc\u0001\u0000\u0000\u0000\u01e1\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e2\u0007\u0001\u0000\u0000\u0000\u01e3\u01e9\u0003\u01a2"+
		"\u00d1\u0000\u01e4\u01e9\u0003\u01a4\u00d2\u0000\u01e5\u01e9\u0003\u01a6"+
		"\u00d3\u0000\u01e6\u01e9\u0003 \u0010\u0000\u01e7\u01e9\u0005\u0082\u0000"+
		"\u0000\u01e8\u01e3\u0001\u0000\u0000\u0000\u01e8\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\t\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0003\u0172\u00b9\u0000\u01eb\u01ed\u0007\u0000\u0000\u0000"+
		"\u01ec\u01ee\u0003\u0172\u00b9\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f3\u0005\u0088\u0000\u0000\u01f0\u01f2\u0003\u0006\u0003\u0000"+
		"\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0005\u0089\u0000\u0000\u01f7\u01f8\u0005|\u0000\u0000\u01f8"+
		"\u0217\u0001\u0000\u0000\u0000\u01f9\u01fa\u0003\u0172\u00b9\u0000\u01fa"+
		"\u01fc\u0007\u0000\u0000\u0000\u01fb\u01fd\u0003\u0172\u00b9\u0000\u01fc"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fe\u0202\u0005\u0086\u0000\u0000\u01ff"+
		"\u0201\u0003\u0006\u0003\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0201"+
		"\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204"+
		"\u0202\u0001\u0000\u0000\u0000\u0205\u0206\u0005\u0087\u0000\u0000\u0206"+
		"\u0207\u0005|\u0000\u0000\u0207\u0217\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0003\u0172\u00b9\u0000\u0209\u020b\u0007\u0000\u0000\u0000\u020a\u020c"+
		"\u0003\u0172\u00b9\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u0211"+
		"\u0005\u0084\u0000\u0000\u020e\u0210\u0003\u0006\u0003\u0000\u020f\u020e"+
		"\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0214"+
		"\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0005\u0085\u0000\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u01ea"+
		"\u0001\u0000\u0000\u0000\u0216\u01f9\u0001\u0000\u0000\u0000\u0216\u0208"+
		"\u0001\u0000\u0000\u0000\u0217\u000b\u0001\u0000\u0000\u0000\u0218\u0219"+
		"\u0005<\u0000\u0000\u0219\u021a\u0005^\u0000\u0000\u021a\u021b\u0003\u019c"+
		"\u00ce\u0000\u021b\u021c\u0003\u0010\b\u0000\u021c\r\u0001\u0000\u0000"+
		"\u0000\u021d\u021f\u0003\u019a\u00cd\u0000\u021e\u021d\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u00050\u0000\u0000\u0221\u022a\u0003\u019c\u00ce\u0000"+
		"\u0222\u0226\u0005\u0088\u0000\u0000\u0223\u0225\u0003\u0006\u0003\u0000"+
		"\u0224\u0223\u0001\u0000\u0000\u0000\u0225\u0228\u0001\u0000\u0000\u0000"+
		"\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000"+
		"\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000"+
		"\u0229\u022b\u0005\u0089\u0000\u0000\u022a\u0222\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022c\u0230\u0005\u0084\u0000\u0000\u022d\u022f\u0003\u0006\u0003\u0000"+
		"\u022e\u022d\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000"+
		"\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000"+
		"\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000"+
		"\u0233\u0234\u0005\u0085\u0000\u0000\u0234\u000f\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0005\u0088\u0000\u0000\u0236\u0237\u0003\u0012\t\u0000\u0237"+
		"\u0238\u0005\u0089\u0000\u0000\u0238\u0239\u0005|\u0000\u0000\u0239\u0245"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0005\u0086\u0000\u0000\u023b\u023c"+
		"\u0003\u0012\t\u0000\u023c\u023d\u0005\u0087\u0000\u0000\u023d\u023e\u0005"+
		"|\u0000\u0000\u023e\u0245\u0001\u0000\u0000\u0000\u023f\u0241\u0005\u0084"+
		"\u0000\u0000\u0240\u0242\u0003\u0012\t\u0000\u0241\u0240\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000"+
		"\u0000\u0243\u0245\u0005\u0085\u0000\u0000\u0244\u0235\u0001\u0000\u0000"+
		"\u0000\u0244\u023a\u0001\u0000\u0000\u0000\u0244\u023f\u0001\u0000\u0000"+
		"\u0000\u0245\u0011\u0001\u0000\u0000\u0000\u0246\u024b\u0003\u0014\n\u0000"+
		"\u0247\u0248\u0005|\u0000\u0000\u0248\u024a\u0003\u0014\n\u0000\u0249"+
		"\u0247\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b"+
		"\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c"+
		"\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e"+
		"\u0250\u0005|\u0000\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u024f\u0250"+
		"\u0001\u0000\u0000\u0000\u0250\u0013\u0001\u0000\u0000\u0000\u0251\u0252"+
		"\u0003\u0016\u000b\u0000\u0252\u0253\u0005\u0080\u0000\u0000\u0253\u0254"+
		"\u0003\"\u0011\u0000\u0254\u0015\u0001\u0000\u0000\u0000\u0255\u0259\u0005"+
		"\u0088\u0000\u0000\u0256\u0258\u0003\u0018\f\u0000\u0257\u0256\u0001\u0000"+
		"\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000"+
		"\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025c\u0001\u0000"+
		"\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c\u026e\u0005\u0089"+
		"\u0000\u0000\u025d\u0261\u0005\u0086\u0000\u0000\u025e\u0260\u0003\u0018"+
		"\f\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260\u0263\u0001\u0000\u0000"+
		"\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000"+
		"\u0000\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000"+
		"\u0000\u0264\u026e\u0005\u0087\u0000\u0000\u0265\u0269\u0005\u0084\u0000"+
		"\u0000\u0266\u0268\u0003\u0018\f\u0000\u0267\u0266\u0001\u0000\u0000\u0000"+
		"\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026c\u0001\u0000\u0000\u0000"+
		"\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026e\u0005\u0085\u0000\u0000"+
		"\u026d\u0255\u0001\u0000\u0000\u0000\u026d\u025d\u0001\u0000\u0000\u0000"+
		"\u026d\u0265\u0001\u0000\u0000\u0000\u026e\u0017\u0001\u0000\u0000\u0000"+
		"\u026f\u0271\u0003\u001a\r\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0271"+
		"\u0272\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272"+
		"\u0273\u0001\u0000\u0000\u0000\u0273\u028b\u0001\u0000\u0000\u0000\u0274"+
		"\u028b\u0003\u0016\u000b\u0000\u0275\u0279\u0005\u0082\u0000\u0000\u0276"+
		"\u027a\u0003\u019c\u00ce\u0000\u0277\u027a\u0003\u01a0\u00d0\u0000\u0278"+
		"\u027a\u0005W\u0000\u0000\u0279\u0276\u0001\u0000\u0000\u0000\u0279\u0277"+
		"\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0005}\u0000\u0000\u027c\u028b\u0003"+
		"\u001c\u000e\u0000\u027d\u027e\u0005\u0082\u0000\u0000\u027e\u0280\u0005"+
		"\u0088\u0000\u0000\u027f\u0281\u0003\u0018\f\u0000\u0280\u027f\u0001\u0000"+
		"\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000"+
		"\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000"+
		"\u0000\u0000\u0284\u0286\u0005\u0089\u0000\u0000\u0285\u0287\u0003\u001e"+
		"\u000f\u0000\u0286\u0285\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0003 \u0010"+
		"\u0000\u0289\u028b\u0001\u0000\u0000\u0000\u028a\u0270\u0001\u0000\u0000"+
		"\u0000\u028a\u0274\u0001\u0000\u0000\u0000\u028a\u0275\u0001\u0000\u0000"+
		"\u0000\u028a\u027d\u0001\u0000\u0000\u0000\u028b\u0019\u0001\u0000\u0000"+
		"\u0000\u028c\u0291\u0003\u01a2\u00d1\u0000\u028d\u0291\u0003\u01a4\u00d2"+
		"\u0000\u028e\u0291\u0003\u01a6\u00d3\u0000\u028f\u0291\u0003 \u0010\u0000"+
		"\u0290\u028c\u0001\u0000\u0000\u0000\u0290\u028d\u0001\u0000\u0000\u0000"+
		"\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000"+
		"\u0291\u001b\u0001\u0000\u0000\u0000\u0292\u0293\u0003\u019c\u00ce\u0000"+
		"\u0293\u001d\u0001\u0000\u0000\u0000\u0294\u0299\u0003\u01a2\u00d1\u0000"+
		"\u0295\u0299\u0003\u01a4\u00d2\u0000\u0296\u0299\u0003\u01a6\u00d3\u0000"+
		"\u0297\u0299\u0005\u0082\u0000\u0000\u0298\u0294\u0001\u0000\u0000\u0000"+
		"\u0298\u0295\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0298\u0297\u0001\u0000\u0000\u0000\u0299\u001f\u0001\u0000\u0000\u0000"+
		"\u029a\u029b\u0007\u0001\u0000\u0000\u029b!\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0003\u0004\u0002\u0000\u029d#\u0001\u0000\u0000\u0000\u029e\u02a0"+
		"\u0003\u0096K\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a6\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a7\u0003&\u0013\u0000\u02a5\u02a7\u0003(\u0014"+
		"\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a7%\u0001\u0000\u0000\u0000\u02a8\u02aa\u0003\u019a\u00cd\u0000"+
		"\u02a9\u02a8\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000"+
		"\u02aa\u02b8\u0001\u0000\u0000\u0000\u02ab\u02b9\u0003*\u0015\u0000\u02ac"+
		"\u02b9\u0003,\u0016\u0000\u02ad\u02b9\u00032\u0019\u0000\u02ae\u02b9\u0003"+
		"6\u001b\u0000\u02af\u02b9\u0003J%\u0000\u02b0\u02b9\u0003L&\u0000\u02b1"+
		"\u02b9\u0003Z-\u0000\u02b2\u02b9\u0003f3\u0000\u02b3\u02b9\u0003h4\u0000"+
		"\u02b4\u02b9\u0003j5\u0000\u02b5\u02b9\u0003l6\u0000\u02b6\u02b9\u0003"+
		"n7\u0000\u02b7\u02b9\u0003t:\u0000\u02b8\u02ab\u0001\u0000\u0000\u0000"+
		"\u02b8\u02ac\u0001\u0000\u0000\u0000\u02b8\u02ad\u0001\u0000\u0000\u0000"+
		"\u02b8\u02ae\u0001\u0000\u0000\u0000\u02b8\u02af\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b0\u0001\u0000\u0000\u0000\u02b8\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b2\u0001\u0000\u0000\u0000\u02b8\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b4\u0001\u0000\u0000\u0000\u02b8\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b9\'\u0001\u0000\u0000\u0000\u02ba\u02be\u0003\n\u0005\u0000\u02bb"+
		"\u02be\u0003\f\u0006\u0000\u02bc\u02be\u0003\u000e\u0007\u0000\u02bd\u02ba"+
		"\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02bc"+
		"\u0001\u0000\u0000\u0000\u02be)\u0001\u0000\u0000\u0000\u02bf\u02c1\u0005"+
		"!\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u0005\u0012"+
		"\u0000\u0000\u02c3\u02d3\u0003\u019c\u00ce\u0000\u02c4\u02d4\u0005|\u0000"+
		"\u0000\u02c5\u02c9\u0005\u0084\u0000\u0000\u02c6\u02c8\u0003\u0094J\u0000"+
		"\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02cb\u0001\u0000\u0000\u0000"+
		"\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000"+
		"\u02ca\u02cf\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000"+
		"\u02cc\u02ce\u0003$\u0012\u0000\u02cd\u02cc\u0001\u0000\u0000\u0000\u02ce"+
		"\u02d1\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d2\u0001\u0000\u0000\u0000\u02d1"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d2\u02d4\u0005\u0085\u0000\u0000\u02d3"+
		"\u02c4\u0001\u0000\u0000\u0000\u02d3\u02c5\u0001\u0000\u0000\u0000\u02d4"+
		"+\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005\b\u0000\u0000\u02d6\u02d7"+
		"\u0005\u0005\u0000\u0000\u02d7\u02d9\u0003.\u0017\u0000\u02d8\u02da\u0003"+
		"0\u0018\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000"+
		"\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u0005|\u0000"+
		"\u0000\u02dc-\u0001\u0000\u0000\u0000\u02dd\u02e0\u0003\u019c\u00ce\u0000"+
		"\u02de\u02e0\u0005\u0018\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000"+
		"\u02df\u02de\u0001\u0000\u0000\u0000\u02e0/\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e4\u0005\u0001\u0000\u0000\u02e2\u02e5\u0003\u019c\u00ce\u0000\u02e3"+
		"\u02e5\u0005v\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e51\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005"+
		"#\u0000\u0000\u02e7\u02e8\u00034\u001a\u0000\u02e8\u02e9\u0005|\u0000"+
		"\u0000\u02e93\u0001\u0000\u0000\u0000\u02ea\u02ec\u0003\u0172\u00b9\u0000"+
		"\u02eb\u02ea\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ef\u0005~\u0000\u0000\u02ee"+
		"\u02eb\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef"+
		"\u0300\u0001\u0000\u0000\u0000\u02f0\u0301\u0005Z\u0000\u0000\u02f1\u02fd"+
		"\u0005\u0084\u0000\u0000\u02f2\u02f7\u00034\u001a\u0000\u02f3\u02f4\u0005"+
		"{\u0000\u0000\u02f4\u02f6\u00034\u001a\u0000\u02f5\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fb\u0001\u0000\u0000"+
		"\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fc\u0005{\u0000\u0000"+
		"\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02f2\u0001\u0000\u0000\u0000"+
		"\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000"+
		"\u02ff\u0301\u0005\u0085\u0000\u0000\u0300\u02f0\u0001\u0000\u0000\u0000"+
		"\u0300\u02f1\u0001\u0000\u0000\u0000\u0301\u030b\u0001\u0000\u0000\u0000"+
		"\u0302\u0308\u0003\u0172\u00b9\u0000\u0303\u0306\u0005\u0001\u0000\u0000"+
		"\u0304\u0307\u0003\u019c\u00ce\u0000\u0305\u0307\u0005v\u0000\u0000\u0306"+
		"\u0304\u0001\u0000\u0000\u0000\u0306\u0305\u0001\u0000\u0000\u0000\u0307"+
		"\u0309\u0001\u0000\u0000\u0000\u0308\u0303\u0001\u0000\u0000\u0000\u0308"+
		"\u0309\u0001\u0000\u0000\u0000\u0309\u030b\u0001\u0000\u0000\u0000\u030a"+
		"\u02ee\u0001\u0000\u0000\u0000\u030a\u0302\u0001\u0000\u0000\u0000\u030b"+
		"5\u0001\u0000\u0000\u0000\u030c\u030d\u00038\u001c\u0000\u030d\u030e\u0005"+
		"\n\u0000\u0000\u030e\u0310\u0003\u019c\u00ce\u0000\u030f\u0311\u0003z"+
		"=\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000"+
		"\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0314\u0005\u0088\u0000"+
		"\u0000\u0313\u0315\u0003<\u001e\u0000\u0314\u0313\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000"+
		"\u0316\u0318\u0005\u0089\u0000\u0000\u0317\u0319\u0003H$\u0000\u0318\u0317"+
		"\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u031b"+
		"\u0001\u0000\u0000\u0000\u031a\u031c\u0003\u0086C\u0000\u031b\u031a\u0001"+
		"\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031f\u0001"+
		"\u0000\u0000\u0000\u031d\u0320\u0003\u00b2Y\u0000\u031e\u0320\u0005|\u0000"+
		"\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u031e\u0001\u0000\u0000"+
		"\u0000\u03207\u0001\u0000\u0000\u0000\u0321\u0323\u0005;\u0000\u0000\u0322"+
		"\u0321\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323"+
		"\u0325\u0001\u0000\u0000\u0000\u0324\u0326\u0005\u0003\u0000\u0000\u0325"+
		"\u0324\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326"+
		"\u0328\u0001\u0000\u0000\u0000\u0327\u0329\u0005&\u0000\u0000\u0328\u0327"+
		"\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b"+
		"\u0001\u0000\u0000\u0000\u032a\u032c\u0005>\u0000\u0000\u032b\u032a\u0001"+
		"\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032e\u0001"+
		"\u0000\u0000\u0000\u032d\u032f\u0007\u0002\u0000\u0000\u032e\u032d\u0001"+
		"\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0334\u0001"+
		"\u0000\u0000\u0000\u0330\u0332\u0005\b\u0000\u0000\u0331\u0333\u0003:"+
		"\u001d\u0000\u0332\u0331\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000"+
		"\u0000\u0000\u0333\u0335\u0001\u0000\u0000\u0000\u0334\u0330\u0001\u0000"+
		"\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u03359\u0001\u0000\u0000"+
		"\u0000\u0336\u0337\u0007\u0003\u0000\u0000\u0337;\u0001\u0000\u0000\u0000"+
		"\u0338\u033a\u0003>\u001f\u0000\u0339\u033b\u0005{\u0000\u0000\u033a\u0339"+
		"\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u034d"+
		"\u0001\u0000\u0000\u0000\u033c\u033d\u0003>\u001f\u0000\u033d\u033e\u0005"+
		"{\u0000\u0000\u033e\u0340\u0001\u0000\u0000\u0000\u033f\u033c\u0001\u0000"+
		"\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000"+
		"\u0000\u0000\u0341\u0346\u0003D\"\u0000\u0342\u0343\u0005{\u0000\u0000"+
		"\u0343\u0345\u0003D\"\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345"+
		"\u0348\u0001\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000\u0000\u0346"+
		"\u0347\u0001\u0000\u0000\u0000\u0347\u034a\u0001\u0000\u0000\u0000\u0348"+
		"\u0346\u0001\u0000\u0000\u0000\u0349\u034b\u0005{\u0000\u0000\u034a\u0349"+
		"\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034d"+
		"\u0001\u0000\u0000\u0000\u034c\u0338\u0001\u0000\u0000\u0000\u034c\u033f"+
		"\u0001\u0000\u0000\u0000\u034d=\u0001\u0000\u0000\u0000\u034e\u0350\u0003"+
		"\u0096K\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u0350\u0353\u0001\u0000"+
		"\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000"+
		"\u0000\u0000\u0352\u0356\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000"+
		"\u0000\u0000\u0354\u0357\u0003@ \u0000\u0355\u0357\u0003B!\u0000\u0356"+
		"\u0354\u0001\u0000\u0000\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0357"+
		"?\u0001\u0000\u0000\u0000\u0358\u035a\u0005`\u0000\u0000\u0359\u035b\u0003"+
		"\u0170\u00b8\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035a\u035b\u0001"+
		"\u0000\u0000\u0000\u035b\u035d\u0001\u0000\u0000\u0000\u035c\u0358\u0001"+
		"\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035f\u0001"+
		"\u0000\u0000\u0000\u035e\u0360\u0005\u0014\u0000\u0000\u035f\u035e\u0001"+
		"\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u0361\u0001"+
		"\u0000\u0000\u0000\u0361\u0362\u0005\u0018\u0000\u0000\u0362A\u0001\u0000"+
		"\u0000\u0000\u0363\u0365\u0005\u0014\u0000\u0000\u0364\u0363\u0001\u0000"+
		"\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000"+
		"\u0000\u0000\u0366\u0367\u0005\u0018\u0000\u0000\u0367\u0368\u0005}\u0000"+
		"\u0000\u0368\u0369\u0003\u0134\u009a\u0000\u0369C\u0001\u0000\u0000\u0000"+
		"\u036a\u036c\u0003\u0096K\u0000\u036b\u036a\u0001\u0000\u0000\u0000\u036c"+
		"\u036f\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d"+
		"\u036e\u0001\u0000\u0000\u0000\u036e\u0373\u0001\u0000\u0000\u0000\u036f"+
		"\u036d\u0001\u0000\u0000\u0000\u0370\u0374\u0003F#\u0000\u0371\u0374\u0005"+
		"y\u0000\u0000\u0372\u0374\u0003\u0134\u009a\u0000\u0373\u0370\u0001\u0000"+
		"\u0000\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0372\u0001\u0000"+
		"\u0000\u0000\u0374E\u0001\u0000\u0000\u0000\u0375\u0376\u0003\u0104\u0082"+
		"\u0000\u0376\u0379\u0005}\u0000\u0000\u0377\u037a\u0003\u0134\u009a\u0000"+
		"\u0378\u037a\u0005y\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379"+
		"\u0378\u0001\u0000\u0000\u0000\u037aG\u0001\u0000\u0000\u0000\u037b\u037c"+
		"\u0005\u007f\u0000\u0000\u037c\u037d\u0003\u0134\u009a\u0000\u037dI\u0001"+
		"\u0000\u0000\u0000\u037e\u0380\u0005;\u0000\u0000\u037f\u037e\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000"+
		"\u0000\u0000\u0381\u0382\u0005 \u0000\u0000\u0382\u0384\u0003\u019c\u00ce"+
		"\u0000\u0383\u0385\u0003z=\u0000\u0384\u0383\u0001\u0000\u0000\u0000\u0384"+
		"\u0385\u0001\u0000\u0000\u0000\u0385\u038a\u0001\u0000\u0000\u0000\u0386"+
		"\u0388\u0005}\u0000\u0000\u0387\u0389\u0003\u0160\u00b0\u0000\u0388\u0387"+
		"\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u038b"+
		"\u0001\u0000\u0000\u0000\u038a\u0386\u0001\u0000\u0000\u0000\u038a\u038b"+
		"\u0001\u0000\u0000\u0000\u038b\u038d\u0001\u0000\u0000\u0000\u038c\u038e"+
		"\u0003\u0086C\u0000\u038d\u038c\u0001\u0000\u0000\u0000\u038d\u038e\u0001"+
		"\u0000\u0000\u0000\u038e\u0394\u0001\u0000\u0000\u0000\u038f\u0390\u0005"+
		"n\u0000\u0000\u0390\u0392\u0003\u0134\u009a\u0000\u0391\u0393\u0003\u0086"+
		"C\u0000\u0392\u0391\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000"+
		"\u0000\u0393\u0395\u0001\u0000\u0000\u0000\u0394\u038f\u0001\u0000\u0000"+
		"\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000"+
		"\u0000\u0396\u0397\u0005|\u0000\u0000\u0397K\u0001\u0000\u0000\u0000\u0398"+
		"\u039b\u0003N\'\u0000\u0399\u039b\u0003P(\u0000\u039a\u0398\u0001\u0000"+
		"\u0000\u0000\u039a\u0399\u0001\u0000\u0000\u0000\u039bM\u0001\u0000\u0000"+
		"\u0000\u039c\u039d\u0005\u001c\u0000\u0000\u039d\u039f\u0003\u019c\u00ce"+
		"\u0000\u039e\u03a0\u0003z=\u0000\u039f\u039e\u0001\u0000\u0000\u0000\u039f"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a2\u0001\u0000\u0000\u0000\u03a1"+
		"\u03a3\u0003\u0086C\u0000\u03a2\u03a1\u0001\u0000\u0000\u0000\u03a2\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a3\u03aa\u0001\u0000\u0000\u0000\u03a4\u03a6"+
		"\u0005\u0084\u0000\u0000\u03a5\u03a7\u0003R)\u0000\u03a6\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000"+
		"\u0000\u0000\u03a8\u03ab\u0005\u0085\u0000\u0000\u03a9\u03ab\u0005|\u0000"+
		"\u0000\u03aa\u03a4\u0001\u0000\u0000\u0000\u03aa\u03a9\u0001\u0000\u0000"+
		"\u0000\u03abO\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005\u001c\u0000\u0000"+
		"\u03ad\u03af\u0003\u019c\u00ce\u0000\u03ae\u03b0\u0003z=\u0000\u03af\u03ae"+
		"\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b1"+
		"\u0001\u0000\u0000\u0000\u03b1\u03b3\u0005\u0088\u0000\u0000\u03b2\u03b4"+
		"\u0003V+\u0000\u03b3\u03b2\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b7\u0005\u0089"+
		"\u0000\u0000\u03b6\u03b8\u0003\u0086C\u0000\u03b7\u03b6\u0001\u0000\u0000"+
		"\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000"+
		"\u0000\u03b9\u03ba\u0005|\u0000\u0000\u03baQ\u0001\u0000\u0000\u0000\u03bb"+
		"\u03c0\u0003T*\u0000\u03bc\u03bd\u0005{\u0000\u0000\u03bd\u03bf\u0003"+
		"T*\u0000\u03be\u03bc\u0001\u0000\u0000\u0000\u03bf\u03c2\u0001\u0000\u0000"+
		"\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000"+
		"\u0000\u03c1\u03c4\u0001\u0000\u0000\u0000\u03c2\u03c0\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c5\u0005{\u0000\u0000\u03c4\u03c3\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5S\u0001\u0000\u0000\u0000\u03c6"+
		"\u03c8\u0003\u0096K\u0000\u03c7\u03c6\u0001\u0000\u0000\u0000\u03c8\u03cb"+
		"\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03c9\u03ca"+
		"\u0001\u0000\u0000\u0000\u03ca\u03cd\u0001\u0000\u0000\u0000\u03cb\u03c9"+
		"\u0001\u0000\u0000\u0000\u03cc\u03ce\u0005!\u0000\u0000\u03cd\u03cc\u0001"+
		"\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce\u03d0\u0001"+
		"\u0000\u0000\u0000\u03cf\u03d1\u0003\u019a\u00cd\u0000\u03d0\u03cf\u0001"+
		"\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d2\u03d3\u0003\u019c\u00ce\u0000\u03d3\u03d4\u0005"+
		"}\u0000\u0000\u03d4\u03d7\u0003\u0134\u009a\u0000\u03d5\u03d6\u0005n\u0000"+
		"\u0000\u03d6\u03d8\u0003\u00a2Q\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d7\u03d8\u0001\u0000\u0000\u0000\u03d8U\u0001\u0000\u0000\u0000\u03d9"+
		"\u03de\u0003X,\u0000\u03da\u03db\u0005{\u0000\u0000\u03db\u03dd\u0003"+
		"X,\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dd\u03e0\u0001\u0000\u0000"+
		"\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000"+
		"\u0000\u03df\u03e2\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000"+
		"\u0000\u03e1\u03e3\u0005{\u0000\u0000\u03e2\u03e1\u0001\u0000\u0000\u0000"+
		"\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3W\u0001\u0000\u0000\u0000\u03e4"+
		"\u03e6\u0003\u0096K\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e9"+
		"\u0001\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e8"+
		"\u0001\u0000\u0000\u0000\u03e8\u03eb\u0001\u0000\u0000\u0000\u03e9\u03e7"+
		"\u0001\u0000\u0000\u0000\u03ea\u03ec\u0003\u019a\u00cd\u0000\u03eb\u03ea"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ed"+
		"\u0001\u0000\u0000\u0000\u03ed\u03ee\u0003\u0134\u009a\u0000\u03eeY\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f0\u0005\u0007\u0000\u0000\u03f0\u03f2\u0003"+
		"\u019c\u00ce\u0000\u03f1\u03f3\u0003z=\u0000\u03f2\u03f1\u0001\u0000\u0000"+
		"\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f6\u0003\u0086C\u0000\u03f5\u03f4\u0001\u0000\u0000\u0000"+
		"\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000"+
		"\u03f7\u03f9\u0005\u0084\u0000\u0000\u03f8\u03fa\u0003\\.\u0000\u03f9"+
		"\u03f8\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa"+
		"\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fc\u0005\u0085\u0000\u0000\u03fc"+
		"[\u0001\u0000\u0000\u0000\u03fd\u0402\u0003^/\u0000\u03fe\u03ff\u0005"+
		"{\u0000\u0000\u03ff\u0401\u0003^/\u0000\u0400\u03fe\u0001\u0000\u0000"+
		"\u0000\u0401\u0404\u0001\u0000\u0000\u0000\u0402\u0400\u0001\u0000\u0000"+
		"\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u0406\u0001\u0000\u0000"+
		"\u0000\u0404\u0402\u0001\u0000\u0000\u0000\u0405\u0407\u0005{\u0000\u0000"+
		"\u0406\u0405\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000\u0000"+
		"\u0407]\u0001\u0000\u0000\u0000\u0408\u040a\u0003\u0096K\u0000\u0409\u0408"+
		"\u0001\u0000\u0000\u0000\u040a\u040d\u0001\u0000\u0000\u0000\u040b\u0409"+
		"\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040f"+
		"\u0001\u0000\u0000\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040e\u0410"+
		"\u0003\u019a\u00cd\u0000\u040f\u040e\u0001\u0000\u0000\u0000\u040f\u0410"+
		"\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411\u0414"+
		"\u0003\u019c\u00ce\u0000\u0412\u0415\u0003`0\u0000\u0413\u0415\u0003b"+
		"1\u0000\u0414\u0412\u0001\u0000\u0000\u0000\u0414\u0413\u0001\u0000\u0000"+
		"\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0417\u0001\u0000\u0000"+
		"\u0000\u0416\u0418\u0003d2\u0000\u0417\u0416\u0001\u0000\u0000\u0000\u0417"+
		"\u0418\u0001\u0000\u0000\u0000\u0418_\u0001\u0000\u0000\u0000\u0419\u041b"+
		"\u0005\u0088\u0000\u0000\u041a\u041c\u0003V+\u0000\u041b\u041a\u0001\u0000"+
		"\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000"+
		"\u0000\u0000\u041d\u041e\u0005\u0089\u0000\u0000\u041ea\u0001\u0000\u0000"+
		"\u0000\u041f\u0421\u0005\u0084\u0000\u0000\u0420\u0422\u0003R)\u0000\u0421"+
		"\u0420\u0001\u0000\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422"+
		"\u0423\u0001\u0000\u0000\u0000\u0423\u0424\u0005\u0085\u0000\u0000\u0424"+
		"c\u0001\u0000\u0000\u0000\u0425\u0426\u0005n\u0000\u0000\u0426\u0427\u0003"+
		"\u00a2Q\u0000\u0427e\u0001\u0000\u0000\u0000\u0428\u0429\u00058\u0000"+
		"\u0000\u0429\u042a\u00043\u0000\u0000\u042a\u042c\u0003\u019c\u00ce\u0000"+
		"\u042b\u042d\u0003z=\u0000\u042c\u042b\u0001\u0000\u0000\u0000\u042c\u042d"+
		"\u0001\u0000\u0000\u0000\u042d\u042f\u0001\u0000\u0000\u0000\u042e\u0430"+
		"\u0003\u0086C\u0000\u042f\u042e\u0001\u0000\u0000\u0000\u042f\u0430\u0001"+
		"\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431\u0433\u0005"+
		"\u0084\u0000\u0000\u0432\u0434\u0003R)\u0000\u0433\u0432\u0001\u0000\u0000"+
		"\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u0435\u0001\u0000\u0000"+
		"\u0000\u0435\u0436\u0005\u0085\u0000\u0000\u0436g\u0001\u0000\u0000\u0000"+
		"\u0437\u0439\u0005;\u0000\u0000\u0438\u0437\u0001\u0000\u0000\u0000\u0438"+
		"\u0439\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000\u0000\u043a"+
		"\u043d\u0005\u0003\u0000\u0000\u043b\u043e\u0003\u019c\u00ce\u0000\u043c"+
		"\u043e\u0005v\u0000\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043c"+
		"\u0001\u0000\u0000\u0000\u043e\u0440\u0001\u0000\u0000\u0000\u043f\u0441"+
		"\u0003z=\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000"+
		"\u0000\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0443\u0005}\u0000"+
		"\u0000\u0443\u0446\u0003\u0134\u009a\u0000\u0444\u0445\u0005n\u0000\u0000"+
		"\u0445\u0447\u0003\u00a2Q\u0000\u0446\u0444\u0001\u0000\u0000\u0000\u0446"+
		"\u0447\u0001\u0000\u0000\u0000\u0447\u0449\u0001\u0000\u0000\u0000\u0448"+
		"\u044a\u0003\u0086C\u0000\u0449\u0448\u0001\u0000\u0000\u0000\u0449\u044a"+
		"\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044c"+
		"\u0005|\u0000\u0000\u044ci\u0001\u0000\u0000\u0000\u044d\u044f\u0007\u0002"+
		"\u0000\u0000\u044e\u044d\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000"+
		"\u0000\u0000\u044f\u0450\u0001\u0000\u0000\u0000\u0450\u0452\u0005\u001b"+
		"\u0000\u0000\u0451\u0453\u0005\u0014\u0000\u0000\u0452\u0451\u0001\u0000"+
		"\u0000\u0000\u0452\u0453\u0001\u0000\u0000\u0000\u0453\u0454\u0001\u0000"+
		"\u0000\u0000\u0454\u0455\u0003\u019c\u00ce\u0000\u0455\u0456\u0005}\u0000"+
		"\u0000\u0456\u0459\u0003\u0134\u009a\u0000\u0457\u0458\u0005n\u0000\u0000"+
		"\u0458\u045a\u0003\u00a2Q\u0000\u0459\u0457\u0001\u0000\u0000\u0000\u0459"+
		"\u045a\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000\u045b"+
		"\u045c\u0005|\u0000\u0000\u045ck\u0001\u0000\u0000\u0000\u045d\u045f\u0005"+
		"!\u0000\u0000\u045e\u045d\u0001\u0000\u0000\u0000\u045e\u045f\u0001\u0000"+
		"\u0000\u0000\u045f\u0461\u0001\u0000\u0000\u0000\u0460\u0462\u0005)\u0000"+
		"\u0000\u0461\u0460\u0001\u0000\u0000\u0000\u0461\u0462\u0001\u0000\u0000"+
		"\u0000\u0462\u0463\u0001\u0000\u0000\u0000\u0463\u0464\u0005\u001e\u0000"+
		"\u0000\u0464\u0466\u0003\u019c\u00ce\u0000\u0465\u0467\u0003z=\u0000\u0466"+
		"\u0465\u0001\u0000\u0000\u0000\u0466\u0467\u0001\u0000\u0000\u0000\u0467"+
		"\u046c\u0001\u0000\u0000\u0000\u0468\u046a\u0005}\u0000\u0000\u0469\u046b"+
		"\u0003\u0160\u00b0\u0000\u046a\u0469\u0001\u0000\u0000\u0000\u046a\u046b"+
		"\u0001\u0000\u0000\u0000\u046b\u046d\u0001\u0000\u0000\u0000\u046c\u0468"+
		"\u0001\u0000\u0000\u0000\u046c\u046d\u0001\u0000\u0000\u0000\u046d\u046f"+
		"\u0001\u0000\u0000\u0000\u046e\u0470\u0003\u0086C\u0000\u046f\u046e\u0001"+
		"\u0000\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u0471\u0001"+
		"\u0000\u0000\u0000\u0471\u0475\u0005\u0084\u0000\u0000\u0472\u0474\u0003"+
		"\u0094J\u0000\u0473\u0472\u0001\u0000\u0000\u0000\u0474\u0477\u0001\u0000"+
		"\u0000\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000"+
		"\u0000\u0000\u0476\u047b\u0001\u0000\u0000\u0000\u0477\u0475\u0001\u0000"+
		"\u0000\u0000\u0478\u047a\u0003\u0092I\u0000\u0479\u0478\u0001\u0000\u0000"+
		"\u0000\u047a\u047d\u0001\u0000\u0000\u0000\u047b\u0479\u0001\u0000\u0000"+
		"\u0000\u047b\u047c\u0001\u0000\u0000\u0000\u047c\u047e\u0001\u0000\u0000"+
		"\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047e\u047f\u0005\u0085\u0000"+
		"\u0000\u047f\u049b\u0001\u0000\u0000\u0000\u0480\u0482\u0005!\u0000\u0000"+
		"\u0481\u0480\u0001\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000"+
		"\u0482\u0484\u0001\u0000\u0000\u0000\u0483\u0485\u0005)\u0000\u0000\u0484"+
		"\u0483\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000\u0485"+
		"\u0486\u0001\u0000\u0000\u0000\u0486\u0487\u0005\u001e\u0000\u0000\u0487"+
		"\u0489\u0003\u019c\u00ce\u0000\u0488\u048a\u0003z=\u0000\u0489\u0488\u0001"+
		"\u0000\u0000\u0000\u0489\u048a\u0001\u0000\u0000\u0000\u048a\u048f\u0001"+
		"\u0000\u0000\u0000\u048b\u048d\u0005}\u0000\u0000\u048c\u048e\u0003\u0160"+
		"\u00b0\u0000\u048d\u048c\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000"+
		"\u0000\u0000\u048e\u0490\u0001\u0000\u0000\u0000\u048f\u048b\u0001\u0000"+
		"\u0000\u0000\u048f\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000"+
		"\u0000\u0000\u0491\u0493\u0005n\u0000\u0000\u0492\u0494\u0003\u0160\u00b0"+
		"\u0000\u0493\u0492\u0001\u0000\u0000\u0000\u0493\u0494\u0001\u0000\u0000"+
		"\u0000\u0494\u0496\u0001\u0000\u0000\u0000\u0495\u0497\u0003\u0086C\u0000"+
		"\u0496\u0495\u0001\u0000\u0000\u0000\u0496\u0497\u0001\u0000\u0000\u0000"+
		"\u0497\u0498\u0001\u0000\u0000\u0000\u0498\u0499\u0005|\u0000\u0000\u0499"+
		"\u049b\u0001\u0000\u0000\u0000\u049a\u045e\u0001\u0000\u0000\u0000\u049a"+
		"\u0481\u0001\u0000\u0000\u0000\u049bm\u0001\u0000\u0000\u0000\u049c\u049f"+
		"\u0003p8\u0000\u049d\u049f\u0003r9\u0000\u049e\u049c\u0001\u0000\u0000"+
		"\u0000\u049e\u049d\u0001\u0000\u0000\u0000\u049fo\u0001\u0000\u0000\u0000"+
		"\u04a0\u04a1\u0005;\u0000\u0000\u04a1\u04a7\u0005!\u0000\u0000\u04a2\u04a3"+
		"\u0005!\u0000\u0000\u04a3\u04a7\u0005;\u0000\u0000\u04a4\u04a7\u0005;"+
		"\u0000\u0000\u04a5\u04a7\u0005!\u0000\u0000\u04a6\u04a0\u0001\u0000\u0000"+
		"\u0000\u04a6\u04a2\u0001\u0000\u0000\u0000\u04a6\u04a4\u0001\u0000\u0000"+
		"\u0000\u04a6\u04a5\u0001\u0000\u0000\u0000\u04a6\u04a7\u0001\u0000\u0000"+
		"\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8\u04aa\u0005\r\u0000\u0000"+
		"\u04a9\u04ab\u0003z=\u0000\u04aa\u04a9\u0001\u0000\u0000\u0000\u04aa\u04ab"+
		"\u0001\u0000\u0000\u0000\u04ab\u04ad\u0001\u0000\u0000\u0000\u04ac\u04ae"+
		"\u0005^\u0000\u0000\u04ad\u04ac\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001"+
		"\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b1\u0003"+
		"\u0134\u009a\u0000\u04b0\u04b2\u0003\u0086C\u0000\u04b1\u04b0\u0001\u0000"+
		"\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u04b3\u0001\u0000"+
		"\u0000\u0000\u04b3\u04b7\u0005\u0084\u0000\u0000\u04b4\u04b6\u0003\u0094"+
		"J\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000\u04b6\u04b9\u0001\u0000\u0000"+
		"\u0000\u04b7\u04b5\u0001\u0000\u0000\u0000\u04b7\u04b8\u0001\u0000\u0000"+
		"\u0000\u04b8\u04bd\u0001\u0000\u0000\u0000\u04b9\u04b7\u0001\u0000\u0000"+
		"\u0000\u04ba\u04bc\u0003\u0092I\u0000\u04bb\u04ba\u0001\u0000\u0000\u0000"+
		"\u04bc\u04bf\u0001\u0000\u0000\u0000\u04bd\u04bb\u0001\u0000\u0000\u0000"+
		"\u04bd\u04be\u0001\u0000\u0000\u0000\u04be\u04c0\u0001\u0000\u0000\u0000"+
		"\u04bf\u04bd\u0001\u0000\u0000\u0000\u04c0\u04c1\u0005\u0085\u0000\u0000"+
		"\u04c1q\u0001\u0000\u0000\u0000\u04c2\u04c3\u0005;\u0000\u0000\u04c3\u04c9"+
		"\u0005!\u0000\u0000\u04c4\u04c5\u0005!\u0000\u0000\u04c5\u04c9\u0005;"+
		"\u0000\u0000\u04c6\u04c9\u0005;\u0000\u0000\u04c7\u04c9\u0005!\u0000\u0000"+
		"\u04c8\u04c2\u0001\u0000\u0000\u0000\u04c8\u04c4\u0001\u0000\u0000\u0000"+
		"\u04c8\u04c6\u0001\u0000\u0000\u0000\u04c8\u04c7\u0001\u0000\u0000\u0000"+
		"\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000"+
		"\u04ca\u04cc\u0005\r\u0000\u0000\u04cb\u04cd\u0003z=\u0000\u04cc\u04cb"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u04cf"+
		"\u0001\u0000\u0000\u0000\u04ce\u04d0\u0005\u0003\u0000\u0000\u04cf\u04ce"+
		"\u0001\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u04d2"+
		"\u0001\u0000\u0000\u0000\u04d1\u04d3\u0005^\u0000\u0000\u04d2\u04d1\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d4\u04d5\u0003\u0192\u00c9\u0000\u04d5\u04d6\u0005"+
		"\u000b\u0000\u0000\u04d6\u04d8\u0003\u0134\u009a\u0000\u04d7\u04d9\u0003"+
		"\u0086C\u0000\u04d8\u04d7\u0001\u0000\u0000\u0000\u04d8\u04d9\u0001\u0000"+
		"\u0000\u0000\u04d9\u04da\u0001\u0000\u0000\u0000\u04da\u04de\u0005\u0084"+
		"\u0000\u0000\u04db\u04dd\u0003\u0094J\u0000\u04dc\u04db\u0001\u0000\u0000"+
		"\u0000\u04dd\u04e0\u0001\u0000\u0000\u0000\u04de\u04dc\u0001\u0000\u0000"+
		"\u0000\u04de\u04df\u0001\u0000\u0000\u0000\u04df\u04e4\u0001\u0000\u0000"+
		"\u0000\u04e0\u04de\u0001\u0000\u0000\u0000\u04e1\u04e3\u0003\u0092I\u0000"+
		"\u04e2\u04e1\u0001\u0000\u0000\u0000\u04e3\u04e6\u0001\u0000\u0000\u0000"+
		"\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000\u0000"+
		"\u04e5\u04e7\u0001\u0000\u0000\u0000\u04e6\u04e4\u0001\u0000\u0000\u0000"+
		"\u04e7\u04e8\u0005\u0085\u0000\u0000\u04e8s\u0001\u0000\u0000\u0000\u04e9"+
		"\u04eb\u0005!\u0000\u0000\u04ea\u04e9\u0001\u0000\u0000\u0000\u04ea\u04eb"+
		"\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001\u0000\u0000\u0000\u04ec\u04ee"+
		"\u0005\b\u0000\u0000\u04ed\u04ef\u0003:\u001d\u0000\u04ee\u04ed\u0001"+
		"\u0000\u0000\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001"+
		"\u0000\u0000\u0000\u04f0\u04f4\u0005\u0084\u0000\u0000\u04f1\u04f3\u0003"+
		"\u0094J\u0000\u04f2\u04f1\u0001\u0000\u0000\u0000\u04f3\u04f6\u0001\u0000"+
		"\u0000\u0000\u04f4\u04f2\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f5\u04fa\u0001\u0000\u0000\u0000\u04f6\u04f4\u0001\u0000"+
		"\u0000\u0000\u04f7\u04f9\u0003v;\u0000\u04f8\u04f7\u0001\u0000\u0000\u0000"+
		"\u04f9\u04fc\u0001\u0000\u0000\u0000\u04fa\u04f8\u0001\u0000\u0000\u0000"+
		"\u04fa\u04fb\u0001\u0000\u0000\u0000\u04fb\u04fd\u0001\u0000\u0000\u0000"+
		"\u04fc\u04fa\u0001\u0000\u0000\u0000\u04fd\u04fe\u0005\u0085\u0000\u0000"+
		"\u04feu\u0001\u0000\u0000\u0000\u04ff\u0501\u0003\u0096K\u0000\u0500\u04ff"+
		"\u0001\u0000\u0000\u0000\u0501\u0504\u0001\u0000\u0000\u0000\u0502\u0500"+
		"\u0001\u0000\u0000\u0000\u0502\u0503\u0001\u0000\u0000\u0000\u0503\u050e"+
		"\u0001\u0000\u0000\u0000\u0504\u0502\u0001\u0000\u0000\u0000\u0505\u050f"+
		"\u0003\n\u0005\u0000\u0506\u0508\u0003\u019a\u00cd\u0000\u0507\u0506\u0001"+
		"\u0000\u0000\u0000\u0507\u0508\u0001\u0000\u0000\u0000\u0508\u050c\u0001"+
		"\u0000\u0000\u0000\u0509\u050d\u0003j5\u0000\u050a\u050d\u00036\u001b"+
		"\u0000\u050b\u050d\u0003x<\u0000\u050c\u0509\u0001\u0000\u0000\u0000\u050c"+
		"\u050a\u0001\u0000\u0000\u0000\u050c\u050b\u0001\u0000\u0000\u0000\u050d"+
		"\u050f\u0001\u0000\u0000\u0000\u050e\u0505\u0001\u0000\u0000\u0000\u050e"+
		"\u0507\u0001\u0000\u0000\u0000\u050fw\u0001\u0000\u0000\u0000\u0510\u0511"+
		"\u0005 \u0000\u0000\u0511\u0512\u0003\u019c\u00ce\u0000\u0512\u0513\u0005"+
		"|\u0000\u0000\u0513y\u0001\u0000\u0000\u0000\u0514\u0521\u0005r\u0000"+
		"\u0000\u0515\u0516\u0003|>\u0000\u0516\u0517\u0005{\u0000\u0000\u0517"+
		"\u0519\u0001\u0000\u0000\u0000\u0518\u0515\u0001\u0000\u0000\u0000\u0519"+
		"\u051c\u0001\u0000\u0000\u0000\u051a\u0518\u0001\u0000\u0000\u0000\u051a"+
		"\u051b\u0001\u0000\u0000\u0000\u051b\u051d\u0001\u0000\u0000\u0000\u051c"+
		"\u051a\u0001\u0000\u0000\u0000\u051d\u051f\u0003|>\u0000\u051e\u0520\u0005"+
		"{\u0000\u0000\u051f\u051e\u0001\u0000\u0000\u0000\u051f\u0520\u0001\u0000"+
		"\u0000\u0000\u0520\u0522\u0001\u0000\u0000\u0000\u0521\u051a\u0001\u0000"+
		"\u0000\u0000\u0521\u0522\u0001\u0000\u0000\u0000\u0522\u0523\u0001\u0000"+
		"\u0000\u0000\u0523\u0524\u0005q\u0000\u0000\u0524{\u0001\u0000\u0000\u0000"+
		"\u0525\u0527\u0003\u0096K\u0000\u0526\u0525\u0001\u0000\u0000\u0000\u0527"+
		"\u052a\u0001\u0000\u0000\u0000\u0528\u0526\u0001\u0000\u0000\u0000\u0528"+
		"\u0529\u0001\u0000\u0000\u0000\u0529\u052e\u0001\u0000\u0000\u0000\u052a"+
		"\u0528\u0001\u0000\u0000\u0000\u052b\u052f\u0003~?\u0000\u052c\u052f\u0003"+
		"\u0080@\u0000\u052d\u052f\u0003\u0082A\u0000\u052e\u052b\u0001\u0000\u0000"+
		"\u0000\u052e\u052c\u0001\u0000\u0000\u0000\u052e\u052d\u0001\u0000\u0000"+
		"\u0000\u052f}\u0001\u0000\u0000\u0000\u0530\u0532\u0003\u0096K\u0000\u0531"+
		"\u0530\u0001\u0000\u0000\u0000\u0531\u0532\u0001\u0000\u0000\u0000\u0532"+
		"\u0533\u0001\u0000\u0000\u0000\u0533\u0536\u0005W\u0000\u0000\u0534\u0535"+
		"\u0005}\u0000\u0000\u0535\u0537\u0003\u016e\u00b7\u0000\u0536\u0534\u0001"+
		"\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537\u007f\u0001"+
		"\u0000\u0000\u0000\u0538\u053a\u0003\u0096K\u0000\u0539\u0538\u0001\u0000"+
		"\u0000\u0000\u0539\u053a\u0001\u0000\u0000\u0000\u053a\u053b\u0001\u0000"+
		"\u0000\u0000\u053b\u0540\u0003\u019c\u00ce\u0000\u053c\u053e\u0005}\u0000"+
		"\u0000\u053d\u053f\u0003\u0160\u00b0\u0000\u053e\u053d\u0001\u0000\u0000"+
		"\u0000\u053e\u053f\u0001\u0000\u0000\u0000\u053f\u0541\u0001\u0000\u0000"+
		"\u0000\u0540\u053c\u0001\u0000\u0000\u0000\u0540\u0541\u0001\u0000\u0000"+
		"\u0000\u0541\u0544\u0001\u0000\u0000\u0000\u0542\u0543\u0005n\u0000\u0000"+
		"\u0543\u0545\u0003\u0134\u009a\u0000\u0544\u0542\u0001\u0000\u0000\u0000"+
		"\u0544\u0545\u0001\u0000\u0000\u0000\u0545\u0081\u0001\u0000\u0000\u0000"+
		"\u0546\u0547\u0005\u0003\u0000\u0000\u0547\u0548\u0003\u019c\u00ce\u0000"+
		"\u0548\u0549\u0005}\u0000\u0000\u0549\u054c\u0003\u0134\u009a\u0000\u054a"+
		"\u054b\u0005n\u0000\u0000\u054b\u054d\u0003\u0084B\u0000\u054c\u054a\u0001"+
		"\u0000\u0000\u0000\u054c\u054d\u0001\u0000\u0000\u0000\u054d\u0083\u0001"+
		"\u0000\u0000\u0000\u054e\u054f\u0003\u00a2Q\u0000\u054f\u0085\u0001\u0000"+
		"\u0000\u0000\u0550\u0556\u0005$\u0000\u0000\u0551\u0552\u0003\u0088D\u0000"+
		"\u0552\u0553\u0005{\u0000\u0000\u0553\u0555\u0001\u0000\u0000\u0000\u0554"+
		"\u0551\u0001\u0000\u0000\u0000\u0555\u0558\u0001\u0000\u0000\u0000\u0556"+
		"\u0554\u0001\u0000\u0000\u0000\u0556\u0557\u0001\u0000\u0000\u0000\u0557"+
		"\u0559\u0001\u0000\u0000\u0000\u0558\u0556\u0001\u0000\u0000\u0000\u0559"+
		"\u055b\u0003\u0088D\u0000\u055a\u055c\u0005{\u0000\u0000\u055b\u055a\u0001"+
		"\u0000\u0000\u0000\u055b\u055c\u0001\u0000\u0000\u0000\u055c\u0087\u0001"+
		"\u0000\u0000\u0000\u055d\u0561\u0003\u008aE\u0000\u055e\u0561\u0003\u008c"+
		"F\u0000\u055f\u0561\u0003\u008eG\u0000\u0560\u055d\u0001\u0000\u0000\u0000"+
		"\u0560\u055e\u0001\u0000\u0000\u0000\u0560\u055f\u0001\u0000\u0000\u0000"+
		"\u0561\u0089\u0001\u0000\u0000\u0000\u0562\u0563\u0003\u0170\u00b8\u0000"+
		"\u0563\u0564\u0005}\u0000\u0000\u0564\u0565\u0003\u016e\u00b7\u0000\u0565"+
		"\u008b\u0001\u0000\u0000\u0000\u0566\u0568\u0003\u0090H\u0000\u0567\u0566"+
		"\u0001\u0000\u0000\u0000\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u0569"+
		"\u0001\u0000\u0000\u0000\u0569\u056a\u0003\u0134\u009a\u0000\u056a\u056c"+
		"\u0005}\u0000\u0000\u056b\u056d\u0003\u0160\u00b0\u0000\u056c\u056b\u0001"+
		"\u0000\u0000\u0000\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u008d\u0001"+
		"\u0000\u0000\u0000\u056e\u0570\u0003\u0090H\u0000\u056f\u056e\u0001\u0000"+
		"\u0000\u0000\u056f\u0570\u0001\u0000\u0000\u0000\u0570\u0571\u0001\u0000"+
		"\u0000\u0000\u0571\u0572\u0003\u0192\u00c9\u0000\u0572\u0573\u0005n\u0000"+
		"\u0000\u0573\u0574\u0003\u0134\u009a\u0000\u0574\u008f\u0001\u0000\u0000"+
		"\u0000\u0575\u0576\u0005\u000b\u0000\u0000\u0576\u0577\u0003z=\u0000\u0577"+
		"\u0091\u0001\u0000\u0000\u0000\u0578\u057a\u0003\u0096K\u0000\u0579\u0578"+
		"\u0001\u0000\u0000\u0000\u057a\u057d\u0001\u0000\u0000\u0000\u057b\u0579"+
		"\u0001\u0000\u0000\u0000\u057b\u057c\u0001\u0000\u0000\u0000\u057c\u0587"+
		"\u0001\u0000\u0000\u0000\u057d\u057b\u0001\u0000\u0000\u0000\u057e\u0588"+
		"\u0003\n\u0005\u0000\u057f\u0581\u0003\u019a\u00cd\u0000\u0580\u057f\u0001"+
		"\u0000\u0000\u0000\u0580\u0581\u0001\u0000\u0000\u0000\u0581\u0585\u0001"+
		"\u0000\u0000\u0000\u0582\u0586\u0003J%\u0000\u0583\u0586\u0003h4\u0000"+
		"\u0584\u0586\u00036\u001b\u0000\u0585\u0582\u0001\u0000\u0000\u0000\u0585"+
		"\u0583\u0001\u0000\u0000\u0000\u0585\u0584\u0001\u0000\u0000\u0000\u0586"+
		"\u0588\u0001\u0000\u0000\u0000\u0587\u057e\u0001\u0000\u0000\u0000\u0587"+
		"\u0580\u0001\u0000\u0000\u0000\u0588\u0093\u0001\u0000\u0000\u0000\u0589"+
		"\u058a\u0005\u0081\u0000\u0000\u058a\u058b\u0005^\u0000\u0000\u058b\u058c"+
		"\u0005\u0086\u0000\u0000\u058c\u058d\u0003\u0098L\u0000\u058d\u058e\u0005"+
		"\u0087\u0000\u0000\u058e\u0095\u0001\u0000\u0000\u0000\u058f\u0590\u0005"+
		"\u0081\u0000\u0000\u0590\u0591\u0005\u0086\u0000\u0000\u0591\u0592\u0003"+
		"\u0098L\u0000\u0592\u0593\u0005\u0087\u0000\u0000\u0593\u0097\u0001\u0000"+
		"\u0000\u0000\u0594\u0596\u0003\u0172\u00b9\u0000\u0595\u0597\u0003\u009a"+
		"M\u0000\u0596\u0595\u0001\u0000\u0000\u0000\u0596\u0597\u0001\u0000\u0000"+
		"\u0000\u0597\u05a1\u0001\u0000\u0000\u0000\u0598\u0599\u0007\u0002\u0000"+
		"\u0000\u0599\u059a\u0005\u0088\u0000\u0000\u059a\u059c\u0003\u0172\u00b9"+
		"\u0000\u059b\u059d\u0003\u009aM\u0000\u059c\u059b\u0001\u0000\u0000\u0000"+
		"\u059c\u059d\u0001\u0000\u0000\u0000\u059d\u059e\u0001\u0000\u0000\u0000"+
		"\u059e\u059f\u0005\u0089\u0000\u0000\u059f\u05a1\u0001\u0000\u0000\u0000"+
		"\u05a0\u0594\u0001\u0000\u0000\u0000\u05a0\u0598\u0001\u0000\u0000\u0000"+
		"\u05a1\u0099\u0001\u0000\u0000\u0000\u05a2\u05a6\u0003\u0004\u0002\u0000"+
		"\u05a3\u05a4\u0005n\u0000\u0000\u05a4\u05a6\u0003\u00a2Q\u0000\u05a5\u05a2"+
		"\u0001\u0000\u0000\u0000\u05a5\u05a3\u0001\u0000\u0000\u0000\u05a6\u009b"+
		"\u0001\u0000\u0000\u0000\u05a7\u05ad\u0005|\u0000\u0000\u05a8\u05ad\u0003"+
		"\u009eO\u0000\u05a9\u05ad\u0003\u00a0P\u0000\u05aa\u05ad\u0003\n\u0005"+
		"\u0000\u05ab\u05ad\u0003$\u0012\u0000\u05ac\u05a7\u0001\u0000\u0000\u0000"+
		"\u05ac\u05a8\u0001\u0000\u0000\u0000\u05ac\u05a9\u0001\u0000\u0000\u0000"+
		"\u05ac\u05aa\u0001\u0000\u0000\u0000\u05ac\u05ab\u0001\u0000\u0000\u0000"+
		"\u05ad\u009d\u0001\u0000\u0000\u0000\u05ae\u05b0\u0003\u0096K\u0000\u05af"+
		"\u05ae\u0001\u0000\u0000\u0000\u05b0\u05b3\u0001\u0000\u0000\u0000\u05b1"+
		"\u05af\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000\u0000\u05b2"+
		"\u05b4\u0001\u0000\u0000\u0000\u05b3\u05b1\u0001\u0000\u0000\u0000\u05b4"+
		"\u05b5\u0005\u000f\u0000\u0000\u05b5\u05bb\u0003\u0106\u0083\u0000\u05b6"+
		"\u05b7\u0005}\u0000\u0000\u05b7\u05bc\u0003\u0134\u009a\u0000\u05b8\u05b9"+
		"\u0005~\u0000\u0000\u05b9\u05ba\u0005}\u0000\u0000\u05ba\u05bc\u0003\u0134"+
		"\u009a\u0000\u05bb\u05b6\u0001\u0000\u0000\u0000\u05bb\u05b8\u0001\u0000"+
		"\u0000\u0000\u05bb\u05bc\u0001\u0000\u0000\u0000\u05bc\u05c3\u0001\u0000"+
		"\u0000\u0000\u05bd\u05be\u0005n\u0000\u0000\u05be\u05c1\u0003\u00a2Q\u0000"+
		"\u05bf\u05c0\u0005\u0006\u0000\u0000\u05c0\u05c2\u0003\u00b2Y\u0000\u05c1"+
		"\u05bf\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001\u0000\u0000\u0000\u05c2"+
		"\u05c4\u0001\u0000\u0000\u0000\u05c3\u05bd\u0001\u0000\u0000\u0000\u05c3"+
		"\u05c4\u0001\u0000\u0000\u0000\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5"+
		"\u05c6\u0005|\u0000\u0000\u05c6\u009f\u0001\u0000\u0000\u0000\u05c7\u05c8"+
		"\u0003\u00a2Q\u0000\u05c8\u05c9\u0005|\u0000\u0000\u05c9\u05cf\u0001\u0000"+
		"\u0000\u0000\u05ca\u05cc\u0003\u00a8T\u0000\u05cb\u05cd\u0005|\u0000\u0000"+
		"\u05cc\u05cb\u0001\u0000\u0000\u0000\u05cc\u05cd\u0001\u0000\u0000\u0000"+
		"\u05cd\u05cf\u0001\u0000\u0000\u0000\u05ce\u05c7\u0001\u0000\u0000\u0000"+
		"\u05ce\u05ca\u0001\u0000\u0000\u0000\u05cf\u00a1\u0001\u0000\u0000\u0000"+
		"\u05d0\u05d2\u0006Q\uffff\uffff\u0000\u05d1\u05d3\u0003\u0096K\u0000\u05d2"+
		"\u05d1\u0001\u0000\u0000\u0000\u05d3\u05d4\u0001\u0000\u0000\u0000\u05d4"+
		"\u05d2\u0001\u0000\u0000\u0000\u05d4\u05d5\u0001\u0000\u0000\u0000\u05d5"+
		"\u05d6\u0001\u0000\u0000\u0000\u05d6\u05d7\u0003\u00a2Q1\u05d7\u0638\u0001"+
		"\u0000\u0000\u0000\u05d8\u0638\u0003\u00aeW\u0000\u05d9\u0638\u0003\u00b0"+
		"X\u0000\u05da\u05dc\u0007\u0004\u0000\u0000\u05db\u05dd\u0005\u0014\u0000"+
		"\u0000\u05dc\u05db\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001\u0000\u0000"+
		"\u0000\u05dd\u05de\u0001\u0000\u0000\u0000\u05de\u0638\u0003\u00a2Q&\u05df"+
		"\u05e0\u0005`\u0000\u0000\u05e0\u05e1\u0005:\u0000\u0000\u05e1\u05e2\u0007"+
		"\u0005\u0000\u0000\u05e2\u0638\u0003\u00a2Q%\u05e3\u05e4\u0005Z\u0000"+
		"\u0000\u05e4\u0638\u0003\u00a2Q$\u05e5\u05e6\u0007\u0006\u0000\u0000\u05e6"+
		"\u0638\u0003\u00a2Q#\u05e7\u05e9\u0005x\u0000\u0000\u05e8\u05ea\u0003"+
		"\u00a2Q\u0000\u05e9\u05e8\u0001\u0000\u0000\u0000\u05e9\u05ea\u0001\u0000"+
		"\u0000\u0000\u05ea\u0638\u0001\u0000\u0000\u0000\u05eb\u05ec\u0005z\u0000"+
		"\u0000\u05ec\u0638\u0003\u00a2Q\u0015\u05ed\u05ee\u0003\u0106\u0083\u0000"+
		"\u05ee\u05ef\u0005n\u0000\u0000\u05ef\u05f0\u0003\u00a2Q\u0012\u05f0\u0638"+
		"\u0001\u0000\u0000\u0000\u05f1\u05f2\u0005v\u0000\u0000\u05f2\u05f3\u0005"+
		"n\u0000\u0000\u05f3\u0638\u0003\u00a2Q\u0011\u05f4\u05f6\u0005\u0004\u0000"+
		"\u0000\u05f5\u05f7\u0005W\u0000\u0000\u05f6\u05f5\u0001\u0000\u0000\u0000"+
		"\u05f6\u05f7\u0001\u0000\u0000\u0000\u05f7\u05f9\u0001\u0000\u0000\u0000"+
		"\u05f8\u05fa\u0003\u00a2Q\u0000\u05f9\u05f8\u0001\u0000\u0000\u0000\u05f9"+
		"\u05fa\u0001\u0000\u0000\u0000\u05fa\u0638\u0001\u0000\u0000\u0000\u05fb"+
		"\u05fd\u0005\u0002\u0000\u0000\u05fc\u05fe\u0005W\u0000\u0000\u05fd\u05fc"+
		"\u0001\u0000\u0000\u0000\u05fd\u05fe\u0001\u0000\u0000\u0000\u05fe\u0600"+
		"\u0001\u0000\u0000\u0000\u05ff\u0601\u0003\u00a2Q\u0000\u0600\u05ff\u0001"+
		"\u0000\u0000\u0000\u0600\u0601\u0001\u0000\u0000\u0000\u0601\u0638\u0001"+
		"\u0000\u0000\u0000\u0602\u0604\u0005\u0017\u0000\u0000\u0603\u0605\u0003"+
		"\u00a2Q\u0000\u0604\u0603\u0001\u0000\u0000\u0000\u0604\u0605\u0001\u0000"+
		"\u0000\u0000\u0605\u0638\u0001\u0000\u0000\u0000\u0606\u0607\u0005+\u0000"+
		"\u0000\u0607\u0638\u0003\u00a2Q\f\u0608\u0609\u0005-\u0000\u0000\u0609"+
		"\u060b\u0005.\u0000\u0000\u060a\u060c\u0003\u00a2Q\u0000\u060b\u060a\u0001"+
		"\u0000\u0000\u0000\u060b\u060c\u0001\u0000\u0000\u0000\u060c\u0638\u0001"+
		"\u0000\u0000\u0000\u060d\u060f\u00056\u0000\u0000\u060e\u0610\u0003\u00a2"+
		"Q\u0000\u060f\u060e\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000"+
		"\u0000\u0610\u0638\u0001\u0000\u0000\u0000\u0611\u0615\u0005\u0088\u0000"+
		"\u0000\u0612\u0614\u0003\u0094J\u0000\u0613\u0612\u0001\u0000\u0000\u0000"+
		"\u0614\u0617\u0001\u0000\u0000\u0000\u0615\u0613\u0001\u0000\u0000\u0000"+
		"\u0615\u0616\u0001\u0000\u0000\u0000\u0616\u0618\u0001\u0000\u0000\u0000"+
		"\u0617\u0615\u0001\u0000\u0000\u0000\u0618\u0619\u0003\u00a2Q\u0000\u0619"+
		"\u061a\u0005\u0089\u0000\u0000\u061a\u0638\u0001\u0000\u0000\u0000\u061b"+
		"\u061f\u0005\u0086\u0000\u0000\u061c\u061e\u0003\u0094J\u0000\u061d\u061c"+
		"\u0001\u0000\u0000\u0000\u061e\u0621\u0001\u0000\u0000\u0000\u061f\u061d"+
		"\u0001\u0000\u0000\u0000\u061f\u0620\u0001\u0000\u0000\u0000\u0620\u0623"+
		"\u0001\u0000\u0000\u0000\u0621\u061f\u0001\u0000\u0000\u0000\u0622\u0624"+
		"\u0003\u00be_\u0000\u0623\u0622\u0001\u0000\u0000\u0000\u0623\u0624\u0001"+
		"\u0000\u0000\u0000\u0624\u0625\u0001\u0000\u0000\u0000\u0625\u0638\u0005"+
		"\u0087\u0000\u0000\u0626\u062a\u0005\u0088\u0000\u0000\u0627\u0629\u0003"+
		"\u0094J\u0000\u0628\u0627\u0001\u0000\u0000\u0000\u0629\u062c\u0001\u0000"+
		"\u0000\u0000\u062a\u0628\u0001\u0000\u0000\u0000\u062a\u062b\u0001\u0000"+
		"\u0000\u0000\u062b\u062e\u0001\u0000\u0000\u0000\u062c\u062a\u0001\u0000"+
		"\u0000\u0000\u062d\u062f\u0003\u00c0`\u0000\u062e\u062d\u0001\u0000\u0000"+
		"\u0000\u062e\u062f\u0001\u0000\u0000\u0000\u062f\u0630\u0001\u0000\u0000"+
		"\u0000\u0630\u0638\u0005\u0089\u0000\u0000\u0631\u0638\u0003\u00c4b\u0000"+
		"\u0632\u0638\u0003\u00d2i\u0000\u0633\u0638\u0003\u00e0p\u0000\u0634\u0638"+
		"\u0003\u00a8T\u0000\u0635\u0638\u0003\u00f8|\u0000\u0636\u0638\u0003\u0002"+
		"\u0001\u0000\u0637\u05d0\u0001\u0000\u0000\u0000\u0637\u05d8\u0001\u0000"+
		"\u0000\u0000\u0637\u05d9\u0001\u0000\u0000\u0000\u0637\u05da\u0001\u0000"+
		"\u0000\u0000\u0637\u05df\u0001\u0000\u0000\u0000\u0637\u05e3\u0001\u0000"+
		"\u0000\u0000\u0637\u05e5\u0001\u0000\u0000\u0000\u0637\u05e7\u0001\u0000"+
		"\u0000\u0000\u0637\u05eb\u0001\u0000\u0000\u0000\u0637\u05ed\u0001\u0000"+
		"\u0000\u0000\u0637\u05f1\u0001\u0000\u0000\u0000\u0637\u05f4\u0001\u0000"+
		"\u0000\u0000\u0637\u05fb\u0001\u0000\u0000\u0000\u0637\u0602\u0001\u0000"+
		"\u0000\u0000\u0637\u0606\u0001\u0000\u0000\u0000\u0637\u0608\u0001\u0000"+
		"\u0000\u0000\u0637\u060d\u0001\u0000\u0000\u0000\u0637\u0611\u0001\u0000"+
		"\u0000\u0000\u0637\u061b\u0001\u0000\u0000\u0000\u0637\u0626\u0001\u0000"+
		"\u0000\u0000\u0637\u0631\u0001\u0000\u0000\u0000\u0637\u0632\u0001\u0000"+
		"\u0000\u0000\u0637\u0633\u0001\u0000\u0000\u0000\u0637\u0634\u0001\u0000"+
		"\u0000\u0000\u0637\u0635\u0001\u0000\u0000\u0000\u0637\u0636\u0001\u0000"+
		"\u0000\u0000\u0638\u06a1\u0001\u0000\u0000\u0000\u0639\u063a\n!\u0000"+
		"\u0000\u063a\u063b\u0007\u0007\u0000\u0000\u063b\u06a0\u0003\u00a2Q\""+
		"\u063c\u063d\n \u0000\u0000\u063d\u063e\u0007\b\u0000\u0000\u063e\u06a0"+
		"\u0003\u00a2Q!\u063f\u0642\n\u001f\u0000\u0000\u0640\u0643\u0003\u01a8"+
		"\u00d4\u0000\u0641\u0643\u0003\u01aa\u00d5\u0000\u0642\u0640\u0001\u0000"+
		"\u0000\u0000\u0642\u0641\u0001\u0000\u0000\u0000\u0643\u0644\u0001\u0000"+
		"\u0000\u0000\u0644\u0645\u0003\u00a2Q \u0645\u06a0\u0001\u0000\u0000\u0000"+
		"\u0646\u0647\n\u001e\u0000\u0000\u0647\u0648\u0005`\u0000\u0000\u0648"+
		"\u06a0\u0003\u00a2Q\u001f\u0649\u064a\n\u001d\u0000\u0000\u064a\u064b"+
		"\u0005]\u0000\u0000\u064b\u06a0\u0003\u00a2Q\u001e\u064c\u064d\n\u001c"+
		"\u0000\u0000\u064d\u064e\u0005a\u0000\u0000\u064e\u06a0\u0003\u00a2Q\u001d"+
		"\u064f\u0650\n\u001b\u0000\u0000\u0650\u0651\u0003\u00a4R\u0000\u0651"+
		"\u0652\u0003\u00a2Q\u001c\u0652\u06a0\u0001\u0000\u0000\u0000\u0653\u0654"+
		"\n\u001a\u0000\u0000\u0654\u0655\u0005b\u0000\u0000\u0655\u06a0\u0003"+
		"\u00a2Q\u001b\u0656\u0657\n\u0019\u0000\u0000\u0657\u0658\u0005c\u0000"+
		"\u0000\u0658\u06a0\u0003\u00a2Q\u001a\u0659\u065a\n\u0018\u0000\u0000"+
		"\u065a\u065b\u0005y\u0000\u0000\u065b\u06a0\u0003\u00a2Q\u0019\u065c\u065d"+
		"\n\u0014\u0000\u0000\u065d\u065e\u0005z\u0000\u0000\u065e\u06a0\u0003"+
		"\u00a2Q\u0015\u065f\u0660\n\u0013\u0000\u0000\u0660\u0661\u0005n\u0000"+
		"\u0000\u0661\u06a0\u0003\u00a2Q\u0014\u0662\u0663\n\u0010\u0000\u0000"+
		"\u0663\u0664\u0003\u00a6S\u0000\u0664\u0665\u0003\u00a2Q\u0011\u0665\u06a0"+
		"\u0001\u0000\u0000\u0000\u0666\u0667\n.\u0000\u0000\u0667\u0668\u0005"+
		"w\u0000\u0000\u0668\u0669\u0005\u0011\u0000\u0000\u0669\u066d\u0005\u0084"+
		"\u0000\u0000\u066a\u066c\u0003\u0094J\u0000\u066b\u066a\u0001\u0000\u0000"+
		"\u0000\u066c\u066f\u0001\u0000\u0000\u0000\u066d\u066b\u0001\u0000\u0000"+
		"\u0000\u066d\u066e\u0001\u0000\u0000\u0000\u066e\u0671\u0001\u0000\u0000"+
		"\u0000\u066f\u066d\u0001\u0000\u0000\u0000\u0670\u0672\u0003\u00fc~\u0000"+
		"\u0671\u0670\u0001\u0000\u0000\u0000\u0671\u0672\u0001\u0000\u0000\u0000"+
		"\u0672\u0673\u0001\u0000\u0000\u0000\u0673\u06a0\u0005\u0085\u0000\u0000"+
		"\u0674\u0675\n-\u0000\u0000\u0675\u0676\u0005w\u0000\u0000\u0676\u0677"+
		"\u0003\u0178\u00bc\u0000\u0677\u0679\u0005\u0088\u0000\u0000\u0678\u067a"+
		"\u0003\u00deo\u0000\u0679\u0678\u0001\u0000\u0000\u0000\u0679\u067a\u0001"+
		"\u0000\u0000\u0000\u067a\u067b\u0001\u0000\u0000\u0000\u067b\u067c\u0005"+
		"\u0089\u0000\u0000\u067c\u06a0\u0001\u0000\u0000\u0000\u067d\u067e\n,"+
		"\u0000\u0000\u067e\u0682\u0005w\u0000\u0000\u067f\u0683\u0003\u019c\u00ce"+
		"\u0000\u0680\u0683\u0005\u0018\u0000\u0000\u0681\u0683\u0005\u001a\u0000"+
		"\u0000\u0682\u067f\u0001\u0000\u0000\u0000\u0682\u0680\u0001\u0000\u0000"+
		"\u0000\u0682\u0681\u0001\u0000\u0000\u0000\u0683\u06a0\u0001\u0000\u0000"+
		"\u0000\u0684\u0685\n+\u0000\u0000\u0685\u0686\u0005w\u0000\u0000\u0686"+
		"\u06a0\u0003\u00c2a\u0000\u0687\u0688\n*\u0000\u0000\u0688\u0689\u0005"+
		"w\u0000\u0000\u0689\u06a0\u0005\'\u0000\u0000\u068a\u068b\n)\u0000\u0000"+
		"\u068b\u068d\u0005\u0088\u0000\u0000\u068c\u068e\u0003\u00deo\u0000\u068d"+
		"\u068c\u0001\u0000\u0000\u0000\u068d\u068e\u0001\u0000\u0000\u0000\u068e"+
		"\u068f\u0001\u0000\u0000\u0000\u068f\u06a0\u0005\u0089\u0000\u0000\u0690"+
		"\u0691\n(\u0000\u0000\u0691\u0692\u0005\u0086\u0000\u0000\u0692\u0693"+
		"\u0003\u00a2Q\u0000\u0693\u0694\u0005\u0087\u0000\u0000\u0694\u06a0\u0001"+
		"\u0000\u0000\u0000\u0695\u0696\n\'\u0000\u0000\u0696\u06a0\u0005\u0083"+
		"\u0000\u0000\u0697\u0698\n\"\u0000\u0000\u0698\u0699\u0005\u0001\u0000"+
		"\u0000\u0699\u06a0\u0003\u0136\u009b\u0000\u069a\u069b\n\u0017\u0000\u0000"+
		"\u069b\u069d\u0005x\u0000\u0000\u069c\u069e\u0003\u00a2Q\u0000\u069d\u069c"+
		"\u0001\u0000\u0000\u0000\u069d\u069e\u0001\u0000\u0000\u0000\u069e\u06a0"+
		"\u0001\u0000\u0000\u0000\u069f\u0639\u0001\u0000\u0000\u0000\u069f\u063c"+
		"\u0001\u0000\u0000\u0000\u069f\u063f\u0001\u0000\u0000\u0000\u069f\u0646"+
		"\u0001\u0000\u0000\u0000\u069f\u0649\u0001\u0000\u0000\u0000\u069f\u064c"+
		"\u0001\u0000\u0000\u0000\u069f\u064f\u0001\u0000\u0000\u0000\u069f\u0653"+
		"\u0001\u0000\u0000\u0000\u069f\u0656\u0001\u0000\u0000\u0000\u069f\u0659"+
		"\u0001\u0000\u0000\u0000\u069f\u065c\u0001\u0000\u0000\u0000\u069f\u065f"+
		"\u0001\u0000\u0000\u0000\u069f\u0662\u0001\u0000\u0000\u0000\u069f\u0666"+
		"\u0001\u0000\u0000\u0000\u069f\u0674\u0001\u0000\u0000\u0000\u069f\u067d"+
		"\u0001\u0000\u0000\u0000\u069f\u0684\u0001\u0000\u0000\u0000\u069f\u0687"+
		"\u0001\u0000\u0000\u0000\u069f\u068a\u0001\u0000\u0000\u0000\u069f\u0690"+
		"\u0001\u0000\u0000\u0000\u069f\u0695\u0001\u0000\u0000\u0000\u069f\u0697"+
		"\u0001\u0000\u0000\u0000\u069f\u069a\u0001\u0000\u0000\u0000\u06a0\u06a3"+
		"\u0001\u0000\u0000\u0000\u06a1\u069f\u0001\u0000\u0000\u0000\u06a1\u06a2"+
		"\u0001\u0000\u0000\u0000\u06a2\u00a3\u0001\u0000\u0000\u0000\u06a3\u06a1"+
		"\u0001\u0000\u0000\u0000\u06a4\u06a5\u0007\t\u0000\u0000\u06a5\u00a5\u0001"+
		"\u0000\u0000\u0000\u06a6\u06a7\u0007\n\u0000\u0000\u06a7\u00a7\u0001\u0000"+
		"\u0000\u0000\u06a8\u06aa\u0003\u0096K\u0000\u06a9\u06a8\u0001\u0000\u0000"+
		"\u0000\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab\u06a9\u0001\u0000\u0000"+
		"\u0000\u06ab\u06ac\u0001\u0000\u0000\u0000\u06ac\u06ad\u0001\u0000\u0000"+
		"\u0000\u06ad\u06ae\u0003\u00a8T\u0000\u06ae\u06bb\u0001\u0000\u0000\u0000"+
		"\u06af\u06bb\u0003\u00b2Y\u0000\u06b0\u06bb\u0003\u00b6[\u0000\u06b1\u06bb"+
		"\u0003\u00aaU\u0000\u06b2\u06bb\u0003\u00acV\u0000\u06b3\u06bb\u0003\u00b8"+
		"\\\u0000\u06b4\u06bb\u0003\u00e6s\u0000\u06b5\u06bb\u0003\u00f4z\u0000"+
		"\u06b6\u06bb\u0003\u00f6{\u0000\u06b7\u06bb\u0003\u00fa}\u0000\u06b8\u06bb"+
		"\u0003\u00ba]\u0000\u06b9\u06bb\u0003\u00bc^\u0000\u06ba\u06a9\u0001\u0000"+
		"\u0000\u0000\u06ba\u06af\u0001\u0000\u0000\u0000\u06ba\u06b0\u0001\u0000"+
		"\u0000\u0000\u06ba\u06b1\u0001\u0000\u0000\u0000\u06ba\u06b2\u0001\u0000"+
		"\u0000\u0000\u06ba\u06b3\u0001\u0000\u0000\u0000\u06ba\u06b4\u0001\u0000"+
		"\u0000\u0000\u06ba\u06b5\u0001\u0000\u0000\u0000\u06ba\u06b6\u0001\u0000"+
		"\u0000\u0000\u06ba\u06b7\u0001\u0000\u0000\u0000\u06ba\u06b8\u0001\u0000"+
		"\u0000\u0000\u06ba\u06b9\u0001\u0000\u0000\u0000\u06bb\u00a9\u0001\u0000"+
		"\u0000\u0000\u06bc\u06be\u0005>\u0000\u0000\u06bd\u06bf\u0005\u0013\u0000"+
		"\u0000\u06be\u06bd\u0001\u0000\u0000\u0000\u06be\u06bf\u0001\u0000\u0000"+
		"\u0000\u06bf\u06c0\u0001\u0000\u0000\u0000\u06c0\u06c1\u0003\u00b2Y\u0000"+
		"\u06c1\u00ab\u0001\u0000\u0000\u0000\u06c2\u06c3\u0005&\u0000\u0000\u06c3"+
		"\u06c5\u0005>\u0000\u0000\u06c4\u06c6\u0005\u0013\u0000\u0000\u06c5\u06c4"+
		"\u0001\u0000\u0000\u0000\u06c5\u06c6\u0001\u0000\u0000\u0000\u06c6\u06c7"+
		"\u0001\u0000\u0000\u0000\u06c7\u06c8\u0003\u00b2Y\u0000\u06c8\u00ad\u0001"+
		"\u0000\u0000\u0000\u06c9\u06cb\u0005I\u0000\u0000\u06ca\u06cc\u0003\u019c"+
		"\u00ce\u0000\u06cb\u06ca\u0001\u0000\u0000\u0000\u06cb\u06cc\u0001\u0000"+
		"\u0000\u0000\u06cc\u06f5\u0001\u0000\u0000\u0000\u06cd\u06cf\u0005J\u0000"+
		"\u0000\u06ce\u06d0\u0003\u019c\u00ce\u0000\u06cf\u06ce\u0001\u0000\u0000"+
		"\u0000\u06cf\u06d0\u0001\u0000\u0000\u0000\u06d0\u06f5\u0001\u0000\u0000"+
		"\u0000\u06d1\u06d3\u0005K\u0000\u0000\u06d2\u06d4\u0003\u019c\u00ce\u0000"+
		"\u06d3\u06d2\u0001\u0000\u0000\u0000\u06d3\u06d4\u0001\u0000\u0000\u0000"+
		"\u06d4\u06f5\u0001\u0000\u0000\u0000\u06d5\u06d7\u0005L\u0000\u0000\u06d6"+
		"\u06d8\u0003\u019c\u00ce\u0000\u06d7\u06d6\u0001\u0000\u0000\u0000\u06d7"+
		"\u06d8\u0001\u0000\u0000\u0000\u06d8\u06f5\u0001\u0000\u0000\u0000\u06d9"+
		"\u06db\u0005M\u0000\u0000\u06da\u06dc\u0003\u019c\u00ce\u0000\u06db\u06da"+
		"\u0001\u0000\u0000\u0000\u06db\u06dc\u0001\u0000\u0000\u0000\u06dc\u06f5"+
		"\u0001\u0000\u0000\u0000\u06dd\u06df\u0005N\u0000\u0000\u06de\u06e0\u0003"+
		"\u019c\u00ce\u0000\u06df\u06de\u0001\u0000\u0000\u0000\u06df\u06e0\u0001"+
		"\u0000\u0000\u0000\u06e0\u06f5\u0001\u0000\u0000\u0000\u06e1\u06e3\u0005"+
		"O\u0000\u0000\u06e2\u06e4\u0003\u019c\u00ce\u0000\u06e3\u06e2\u0001\u0000"+
		"\u0000\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000\u06e4\u06f5\u0001\u0000"+
		"\u0000\u0000\u06e5\u06e7\u0005P\u0000\u0000\u06e6\u06e8\u0003\u019c\u00ce"+
		"\u0000\u06e7\u06e6\u0001\u0000\u0000\u0000\u06e7\u06e8\u0001\u0000\u0000"+
		"\u0000\u06e8\u06f5\u0001\u0000\u0000\u0000\u06e9\u06eb\u0005Q\u0000\u0000"+
		"\u06ea\u06ec\u0003\u019c\u00ce\u0000\u06eb\u06ea\u0001\u0000\u0000\u0000"+
		"\u06eb\u06ec\u0001\u0000\u0000\u0000\u06ec\u06f5\u0001\u0000\u0000\u0000"+
		"\u06ed\u06f0\u0005V\u0000\u0000\u06ee\u06ef\u0005v\u0000\u0000\u06ef\u06f1"+
		"\u0003\u019c\u00ce\u0000\u06f0\u06ee\u0001\u0000\u0000\u0000\u06f0\u06f1"+
		"\u0001\u0000\u0000\u0000\u06f1\u06f5\u0001\u0000\u0000\u0000\u06f2\u06f5"+
		"\u0005\u001f\u0000\u0000\u06f3\u06f5\u0005\t\u0000\u0000\u06f4\u06c9\u0001"+
		"\u0000\u0000\u0000\u06f4\u06cd\u0001\u0000\u0000\u0000\u06f4\u06d1\u0001"+
		"\u0000\u0000\u0000\u06f4\u06d5\u0001\u0000\u0000\u0000\u06f4\u06d9\u0001"+
		"\u0000\u0000\u0000\u06f4\u06dd\u0001\u0000\u0000\u0000\u06f4\u06e1\u0001"+
		"\u0000\u0000\u0000\u06f4\u06e5\u0001\u0000\u0000\u0000\u06f4\u06e9\u0001"+
		"\u0000\u0000\u0000\u06f4\u06ed\u0001\u0000\u0000\u0000\u06f4\u06f2\u0001"+
		"\u0000\u0000\u0000\u06f4\u06f3\u0001\u0000\u0000\u0000\u06f5\u00af\u0001"+
		"\u0000\u0000\u0000\u06f6\u06f9\u0003\u0176\u00bb\u0000\u06f7\u06f9\u0003"+
		"\u018c\u00c6\u0000\u06f8\u06f6\u0001\u0000\u0000\u0000\u06f8\u06f7\u0001"+
		"\u0000\u0000\u0000\u06f9\u00b1\u0001\u0000\u0000\u0000\u06fa\u06fe\u0005"+
		"\u0084\u0000\u0000\u06fb\u06fd\u0003\u0094J\u0000\u06fc\u06fb\u0001\u0000"+
		"\u0000\u0000\u06fd\u0700\u0001\u0000\u0000\u0000\u06fe\u06fc\u0001\u0000"+
		"\u0000\u0000\u06fe\u06ff\u0001\u0000\u0000\u0000\u06ff\u0702\u0001\u0000"+
		"\u0000\u0000\u0700\u06fe\u0001\u0000\u0000\u0000\u0701\u0703\u0003\u00b4"+
		"Z\u0000\u0702\u0701\u0001\u0000\u0000\u0000\u0702\u0703\u0001\u0000\u0000"+
		"\u0000\u0703\u0704\u0001\u0000\u0000\u0000\u0704\u0705\u0005\u0085\u0000"+
		"\u0000\u0705\u00b3\u0001\u0000\u0000\u0000\u0706\u0708\u0003\u009cN\u0000"+
		"\u0707\u0706\u0001\u0000\u0000\u0000\u0708\u0709\u0001\u0000\u0000\u0000"+
		"\u0709\u0707\u0001\u0000\u0000\u0000\u0709\u070a\u0001\u0000\u0000\u0000"+
		"\u070a\u070c\u0001\u0000\u0000\u0000\u070b\u070d\u0003\u00a2Q\u0000\u070c"+
		"\u070b\u0001\u0000\u0000\u0000\u070c\u070d\u0001\u0000\u0000\u0000\u070d"+
		"\u0710\u0001\u0000\u0000\u0000\u070e\u0710\u0003\u00a2Q\u0000\u070f\u0707"+
		"\u0001\u0000\u0000\u0000\u070f\u070e\u0001\u0000\u0000\u0000\u0710\u00b5"+
		"\u0001\u0000\u0000\u0000\u0711\u0713\u0005&\u0000\u0000\u0712\u0714\u0005"+
		"\u0013\u0000\u0000\u0713\u0712\u0001\u0000\u0000\u0000\u0713\u0714\u0001"+
		"\u0000\u0000\u0000\u0714\u0715\u0001\u0000\u0000\u0000\u0715\u0716\u0003"+
		"\u00b2Y\u0000\u0716\u00b7\u0001\u0000\u0000\u0000\u0717\u0718\u0005!\u0000"+
		"\u0000\u0718\u0719\u0003\u00b2Y\u0000\u0719\u00b9\u0001\u0000\u0000\u0000"+
		"\u071a\u071b\u0005\u0003\u0000\u0000\u071b\u071c\u0003\u00b2Y\u0000\u071c"+
		"\u00bb\u0001\u0000\u0000\u0000\u071d\u071e\u00057\u0000\u0000\u071e\u071f"+
		"\u0003\u00b2Y\u0000\u071f\u00bd\u0001\u0000\u0000\u0000\u0720\u0725\u0003"+
		"\u00a2Q\u0000\u0721\u0722\u0005{\u0000\u0000\u0722\u0724\u0003\u00a2Q"+
		"\u0000\u0723\u0721\u0001\u0000\u0000\u0000\u0724\u0727\u0001\u0000\u0000"+
		"\u0000\u0725\u0723\u0001\u0000\u0000\u0000\u0725\u0726\u0001\u0000\u0000"+
		"\u0000\u0726\u0729\u0001\u0000\u0000\u0000\u0727\u0725\u0001\u0000\u0000"+
		"\u0000\u0728\u072a\u0005{\u0000\u0000\u0729\u0728\u0001\u0000\u0000\u0000"+
		"\u0729\u072a\u0001\u0000\u0000\u0000\u072a\u0730\u0001\u0000\u0000\u0000"+
		"\u072b\u072c\u0003\u00a2Q\u0000\u072c\u072d\u0005|\u0000\u0000\u072d\u072e"+
		"\u0003\u00a2Q\u0000\u072e\u0730\u0001\u0000\u0000\u0000\u072f\u0720\u0001"+
		"\u0000\u0000\u0000\u072f\u072b\u0001\u0000\u0000\u0000\u0730\u00bf\u0001"+
		"\u0000\u0000\u0000\u0731\u0732\u0003\u00a2Q\u0000\u0732\u0733\u0005{\u0000"+
		"\u0000\u0733\u0735\u0001\u0000\u0000\u0000\u0734\u0731\u0001\u0000\u0000"+
		"\u0000\u0735\u0736\u0001\u0000\u0000\u0000\u0736\u0734\u0001\u0000\u0000"+
		"\u0000\u0736\u0737\u0001\u0000\u0000\u0000\u0737\u0739\u0001\u0000\u0000"+
		"\u0000\u0738\u073a\u0003\u00a2Q\u0000\u0739\u0738\u0001\u0000\u0000\u0000"+
		"\u0739\u073a\u0001\u0000\u0000\u0000\u073a\u00c1\u0001\u0000\u0000\u0000"+
		"\u073b\u073c\u0005Q\u0000\u0000\u073c\u00c3\u0001\u0000\u0000\u0000\u073d"+
		"\u0741\u0003\u00c6c\u0000\u073e\u0741\u0003\u00ceg\u0000\u073f\u0741\u0003"+
		"\u00d0h\u0000\u0740\u073d\u0001\u0000\u0000\u0000\u0740\u073e\u0001\u0000"+
		"\u0000\u0000\u0740\u073f\u0001\u0000\u0000\u0000\u0741\u00c5\u0001\u0000"+
		"\u0000\u0000\u0742\u0745\u0003\u0176\u00bb\u0000\u0743\u0745\u0003\u018c"+
		"\u00c6\u0000\u0744\u0742\u0001\u0000\u0000\u0000\u0744\u0743\u0001\u0000"+
		"\u0000\u0000\u0745\u0746\u0001\u0000\u0000\u0000\u0746\u074a\u0005\u0084"+
		"\u0000\u0000\u0747\u0749\u0003\u0094J\u0000\u0748\u0747\u0001\u0000\u0000"+
		"\u0000\u0749\u074c\u0001\u0000\u0000\u0000\u074a\u0748\u0001\u0000\u0000"+
		"\u0000\u074a\u074b\u0001\u0000\u0000\u0000\u074b\u074f\u0001\u0000\u0000"+
		"\u0000\u074c\u074a\u0001\u0000\u0000\u0000\u074d\u0750\u0003\u00c8d\u0000"+
		"\u074e\u0750\u0003\u00ccf\u0000\u074f\u074d\u0001\u0000\u0000\u0000\u074f"+
		"\u074e\u0001\u0000\u0000\u0000\u074f\u0750\u0001\u0000\u0000\u0000\u0750"+
		"\u0751\u0001\u0000\u0000\u0000\u0751\u0752\u0005\u0085\u0000\u0000\u0752"+
		"\u00c7\u0001\u0000\u0000\u0000\u0753\u0758\u0003\u00cae\u0000\u0754\u0755"+
		"\u0005{\u0000\u0000\u0755\u0757\u0003\u00cae\u0000\u0756\u0754\u0001\u0000"+
		"\u0000\u0000\u0757\u075a\u0001\u0000\u0000\u0000\u0758\u0756\u0001\u0000"+
		"\u0000\u0000\u0758\u0759\u0001\u0000\u0000\u0000\u0759\u0760\u0001\u0000"+
		"\u0000\u0000\u075a\u0758\u0001\u0000\u0000\u0000\u075b\u075c\u0005{\u0000"+
		"\u0000\u075c\u0761\u0003\u00ccf\u0000\u075d\u075f\u0005{\u0000\u0000\u075e"+
		"\u075d\u0001\u0000\u0000\u0000\u075e\u075f\u0001\u0000\u0000\u0000\u075f"+
		"\u0761\u0001\u0000\u0000\u0000\u0760\u075b\u0001\u0000\u0000\u0000\u0760"+
		"\u075e\u0001\u0000\u0000\u0000\u0761\u00c9\u0001\u0000\u0000\u0000\u0762"+
		"\u0764\u0003\u0096K\u0000\u0763\u0762\u0001\u0000\u0000\u0000\u0764\u0767"+
		"\u0001\u0000\u0000\u0000\u0765\u0763\u0001\u0000\u0000\u0000\u0765\u0766"+
		"\u0001\u0000\u0000\u0000\u0766\u0770\u0001\u0000\u0000\u0000\u0767\u0765"+
		"\u0001\u0000\u0000\u0000\u0768\u0771\u0003\u019c\u00ce\u0000\u0769\u076c"+
		"\u0003\u019c\u00ce\u0000\u076a\u076c\u0003\u00c2a\u0000\u076b\u0769\u0001"+
		"\u0000\u0000\u0000\u076b\u076a\u0001\u0000\u0000\u0000\u076c\u076d\u0001"+
		"\u0000\u0000\u0000\u076d\u076e\u0005}\u0000\u0000\u076e\u076f\u0003\u00a2"+
		"Q\u0000\u076f\u0771\u0001\u0000\u0000\u0000\u0770\u0768\u0001\u0000\u0000"+
		"\u0000\u0770\u076b\u0001\u0000\u0000\u0000\u0771\u00cb\u0001\u0000\u0000"+
		"\u0000\u0772\u0774\u0005x\u0000\u0000\u0773\u0775\u0003\u00a2Q\u0000\u0774"+
		"\u0773\u0001\u0000\u0000\u0000\u0774\u0775\u0001\u0000\u0000\u0000\u0775"+
		"\u00cd\u0001\u0000\u0000\u0000\u0776\u0777\u0003\u0176\u00bb\u0000\u0777"+
		"\u077b\u0005\u0088\u0000\u0000\u0778\u077a\u0003\u0094J\u0000\u0779\u0778"+
		"\u0001\u0000\u0000\u0000\u077a\u077d\u0001\u0000\u0000\u0000\u077b\u0779"+
		"\u0001\u0000\u0000\u0000\u077b\u077c\u0001\u0000\u0000\u0000\u077c\u0789"+
		"\u0001\u0000\u0000\u0000\u077d\u077b\u0001\u0000\u0000\u0000\u077e\u0783"+
		"\u0003\u00a2Q\u0000\u077f\u0780\u0005{\u0000\u0000\u0780\u0782\u0003\u00a2"+
		"Q\u0000\u0781\u077f\u0001\u0000\u0000\u0000\u0782\u0785\u0001\u0000\u0000"+
		"\u0000\u0783\u0781\u0001\u0000\u0000\u0000\u0783\u0784\u0001\u0000\u0000"+
		"\u0000\u0784\u0787\u0001\u0000\u0000\u0000\u0785\u0783\u0001\u0000\u0000"+
		"\u0000\u0786\u0788\u0005{\u0000\u0000\u0787\u0786\u0001\u0000\u0000\u0000"+
		"\u0787\u0788\u0001\u0000\u0000\u0000\u0788\u078a\u0001\u0000\u0000\u0000"+
		"\u0789\u077e\u0001\u0000\u0000\u0000\u0789\u078a\u0001\u0000\u0000\u0000"+
		"\u078a\u078b\u0001\u0000\u0000\u0000\u078b\u078c\u0005\u0089\u0000\u0000"+
		"\u078c\u00cf\u0001\u0000\u0000\u0000\u078d\u078e\u0003\u0176\u00bb\u0000"+
		"\u078e\u00d1\u0001\u0000\u0000\u0000\u078f\u0793\u0003\u00d4j\u0000\u0790"+
		"\u0793\u0003\u00dam\u0000\u0791\u0793\u0003\u00dcn\u0000\u0792\u078f\u0001"+
		"\u0000\u0000\u0000\u0792\u0790\u0001\u0000\u0000\u0000\u0792\u0791\u0001"+
		"\u0000\u0000\u0000\u0793\u00d3\u0001\u0000\u0000\u0000\u0794\u0795\u0003"+
		"\u0176\u00bb\u0000\u0795\u0797\u0005\u0084\u0000\u0000\u0796\u0798\u0003"+
		"\u00d6k\u0000\u0797\u0796\u0001\u0000\u0000\u0000\u0797\u0798\u0001\u0000"+
		"\u0000\u0000\u0798\u0799\u0001\u0000\u0000\u0000\u0799\u079a\u0005\u0085"+
		"\u0000\u0000\u079a\u00d5\u0001\u0000\u0000\u0000\u079b\u07a0\u0003\u00d8"+
		"l\u0000\u079c\u079d\u0005{\u0000\u0000\u079d\u079f\u0003\u00d8l\u0000"+
		"\u079e\u079c\u0001\u0000\u0000\u0000\u079f\u07a2\u0001\u0000\u0000\u0000"+
		"\u07a0\u079e\u0001\u0000\u0000\u0000\u07a0\u07a1\u0001\u0000\u0000\u0000"+
		"\u07a1\u07a4\u0001\u0000\u0000\u0000\u07a2\u07a0\u0001\u0000\u0000\u0000"+
		"\u07a3\u07a5\u0005{\u0000\u0000\u07a4\u07a3\u0001\u0000\u0000\u0000\u07a4"+
		"\u07a5\u0001\u0000\u0000\u0000\u07a5\u00d7\u0001\u0000\u0000\u0000\u07a6"+
		"\u07af\u0003\u019c\u00ce\u0000\u07a7\u07aa\u0003\u019c\u00ce\u0000\u07a8"+
		"\u07aa\u0003\u00c2a\u0000\u07a9\u07a7\u0001\u0000\u0000\u0000\u07a9\u07a8"+
		"\u0001\u0000\u0000\u0000\u07aa\u07ab\u0001\u0000\u0000\u0000\u07ab\u07ac"+
		"\u0005}\u0000\u0000\u07ac\u07ad\u0003\u00a2Q\u0000\u07ad\u07af\u0001\u0000"+
		"\u0000\u0000\u07ae\u07a6\u0001\u0000\u0000\u0000\u07ae\u07a9\u0001\u0000"+
		"\u0000\u0000\u07af\u00d9\u0001\u0000\u0000\u0000\u07b0\u07b1\u0003\u0176"+
		"\u00bb\u0000\u07b1\u07bd\u0005\u0088\u0000\u0000\u07b2\u07b7\u0003\u00a2"+
		"Q\u0000\u07b3\u07b4\u0005{\u0000\u0000\u07b4\u07b6\u0003\u00a2Q\u0000"+
		"\u07b5\u07b3\u0001\u0000\u0000\u0000\u07b6\u07b9\u0001\u0000\u0000\u0000"+
		"\u07b7\u07b5\u0001\u0000\u0000\u0000\u07b7\u07b8\u0001\u0000\u0000\u0000"+
		"\u07b8\u07bb\u0001\u0000\u0000\u0000\u07b9\u07b7\u0001\u0000\u0000\u0000"+
		"\u07ba\u07bc\u0005{\u0000\u0000\u07bb\u07ba\u0001\u0000\u0000\u0000\u07bb"+
		"\u07bc\u0001\u0000\u0000\u0000\u07bc\u07be\u0001\u0000\u0000\u0000\u07bd"+
		"\u07b2\u0001\u0000\u0000\u0000\u07bd\u07be\u0001\u0000\u0000\u0000\u07be"+
		"\u07bf\u0001\u0000\u0000\u0000\u07bf\u07c0\u0005\u0089\u0000\u0000\u07c0"+
		"\u00db\u0001\u0000\u0000\u0000\u07c1\u07c2\u0003\u0176\u00bb\u0000\u07c2"+
		"\u00dd\u0001\u0000\u0000\u0000\u07c3\u07c8\u0003\u00a2Q\u0000\u07c4\u07c5"+
		"\u0005{\u0000\u0000\u07c5\u07c7\u0003\u00a2Q\u0000\u07c6\u07c4\u0001\u0000"+
		"\u0000\u0000\u07c7\u07ca\u0001\u0000\u0000\u0000\u07c8\u07c6\u0001\u0000"+
		"\u0000\u0000\u07c8\u07c9\u0001\u0000\u0000\u0000\u07c9\u07cc\u0001\u0000"+
		"\u0000\u0000\u07ca\u07c8\u0001\u0000\u0000\u0000\u07cb\u07cd\u0005{\u0000"+
		"\u0000\u07cc\u07cb\u0001\u0000\u0000\u0000\u07cc\u07cd\u0001\u0000\u0000"+
		"\u0000\u07cd\u00df\u0001\u0000\u0000\u0000\u07ce\u07d0\u0003\u0090H\u0000"+
		"\u07cf\u07ce\u0001\u0000\u0000\u0000\u07cf\u07d0\u0001\u0000\u0000\u0000"+
		"\u07d0\u07d2\u0001\u0000\u0000\u0000\u07d1\u07d3\u0005\u001b\u0000\u0000"+
		"\u07d2\u07d1\u0001\u0000\u0000\u0000\u07d2\u07d3\u0001\u0000\u0000\u0000"+
		"\u07d3\u07d5\u0001\u0000\u0000\u0000\u07d4\u07d6\u0005\u0003\u0000\u0000"+
		"\u07d5\u07d4\u0001\u0000\u0000\u0000\u07d5\u07d6\u0001\u0000\u0000\u0000"+
		"\u07d6\u07d8\u0001\u0000\u0000\u0000\u07d7\u07d9\u0005&\u0000\u0000\u07d8"+
		"\u07d7\u0001\u0000\u0000\u0000\u07d8\u07d9\u0001\u0000\u0000\u0000\u07d9"+
		"\u07db\u0001\u0000\u0000\u0000\u07da\u07dc\u0005\u0013\u0000\u0000\u07db"+
		"\u07da\u0001\u0000\u0000\u0000\u07db\u07dc\u0001\u0000\u0000\u0000\u07dc"+
		"\u07e3\u0001\u0000\u0000\u0000\u07dd\u07e4\u0005c\u0000\u0000\u07de\u07e0"+
		"\u0005a\u0000\u0000\u07df\u07e1\u0003\u00e2q\u0000\u07e0\u07df\u0001\u0000"+
		"\u0000\u0000\u07e0\u07e1\u0001\u0000\u0000\u0000\u07e1\u07e2\u0001\u0000"+
		"\u0000\u0000\u07e2\u07e4\u0005a\u0000\u0000\u07e3\u07dd\u0001\u0000\u0000"+
		"\u0000\u07e3\u07de\u0001\u0000\u0000\u0000\u07e4\u07ea\u0001\u0000\u0000"+
		"\u0000\u07e5\u07eb\u0003\u00a2Q\u0000\u07e6\u07e7\u0005\u007f\u0000\u0000"+
		"\u07e7\u07e8\u0003\u0136\u009b\u0000\u07e8\u07e9\u0003\u00b2Y\u0000\u07e9"+
		"\u07eb\u0001\u0000\u0000\u0000\u07ea\u07e5\u0001\u0000\u0000\u0000\u07ea"+
		"\u07e6\u0001\u0000\u0000\u0000\u07eb\u00e1\u0001\u0000\u0000\u0000\u07ec"+
		"\u07f1\u0003\u00e4r\u0000\u07ed\u07ee\u0005{\u0000\u0000\u07ee\u07f0\u0003"+
		"\u00e4r\u0000\u07ef\u07ed\u0001\u0000\u0000\u0000\u07f0\u07f3\u0001\u0000"+
		"\u0000\u0000\u07f1\u07ef\u0001\u0000\u0000\u0000\u07f1\u07f2\u0001\u0000"+
		"\u0000\u0000\u07f2\u07f5\u0001\u0000\u0000\u0000\u07f3\u07f1\u0001\u0000"+
		"\u0000\u0000\u07f4\u07f6\u0005{\u0000\u0000\u07f5\u07f4\u0001\u0000\u0000"+
		"\u0000\u07f5\u07f6\u0001\u0000\u0000\u0000\u07f6\u00e3\u0001\u0000\u0000"+
		"\u0000\u07f7\u07f9\u0003\u0096K\u0000\u07f8\u07f7\u0001\u0000\u0000\u0000"+
		"\u07f9\u07fc\u0001\u0000\u0000\u0000\u07fa\u07f8\u0001\u0000\u0000\u0000"+
		"\u07fa\u07fb\u0001\u0000\u0000\u0000\u07fb\u07fd\u0001\u0000\u0000\u0000"+
		"\u07fc\u07fa\u0001\u0000\u0000\u0000\u07fd\u0800\u0003\u0104\u0082\u0000"+
		"\u07fe\u07ff\u0005}\u0000\u0000\u07ff\u0801\u0003\u0134\u009a\u0000\u0800"+
		"\u07fe\u0001\u0000\u0000\u0000\u0800\u0801\u0001\u0000\u0000\u0000\u0801"+
		"\u00e5\u0001\u0000\u0000\u0000\u0802\u0804\u0003\u00f2y\u0000\u0803\u0802"+
		"\u0001\u0000\u0000\u0000\u0803\u0804\u0001\u0000\u0000\u0000\u0804\u0809"+
		"\u0001\u0000\u0000\u0000\u0805\u080a\u0003\u00e8t\u0000\u0806\u080a\u0003"+
		"\u00eau\u0000\u0807\u080a\u0003\u00ecv\u0000\u0808\u080a\u0003\u00eew"+
		"\u0000\u0809\u0805\u0001\u0000\u0000\u0000\u0809\u0806\u0001\u0000\u0000"+
		"\u0000\u0809\u0807\u0001\u0000\u0000\u0000\u0809\u0808\u0001\u0000\u0000"+
		"\u0000\u080a\u080f\u0001\u0000\u0000\u0000\u080b\u080c\u0003\u00f2y\u0000"+
		"\u080c\u080d\u0003\u00f0x\u0000\u080d\u080f\u0001\u0000\u0000\u0000\u080e"+
		"\u0803\u0001\u0000\u0000\u0000\u080e\u080b\u0001\u0000\u0000\u0000\u080f"+
		"\u00e7\u0001\u0000\u0000\u0000\u0810\u0811\u0005\u0010\u0000\u0000\u0811"+
		"\u0812\u0003\u00b2Y\u0000\u0812\u00e9\u0001\u0000\u0000\u0000\u0813\u0814"+
		"\u0005%\u0000\u0000\u0814\u0815\u0003\u00a2Q\u0000\u0815\u0816\u0003\u00b2"+
		"Y\u0000\u0816\u00eb\u0001\u0000\u0000\u0000\u0817\u0818\u0005%\u0000\u0000"+
		"\u0818\u0819\u0005\u000f\u0000\u0000\u0819\u081a\u0003\u0104\u0082\u0000"+
		"\u081a\u081b\u0005n\u0000\u0000\u081b\u081c\u0003\u00a2Q\u0000\u081c\u081d"+
		"\u0003\u00b2Y\u0000\u081d\u00ed\u0001\u0000\u0000\u0000\u081e\u081f\u0005"+
		"\u000b\u0000\u0000\u081f\u0820\u0003\u0104\u0082\u0000\u0820\u0821\u0005"+
		"\u000e\u0000\u0000\u0821\u0822\u0003\u00a2Q\u0000\u0822\u0823\u0003\u00b2"+
		"Y\u0000\u0823\u00ef\u0001\u0000\u0000\u0000\u0824\u0825\u0003\u00b2Y\u0000"+
		"\u0825\u00f1\u0001\u0000\u0000\u0000\u0826\u0827\u0005W\u0000\u0000\u0827"+
		"\u0828\u0005}\u0000\u0000\u0828\u00f3\u0001\u0000\u0000\u0000\u0829\u082a"+
		"\u0005\f\u0000\u0000\u082a\u082b\u0003\u00a2Q\u0000\u082b\u0832\u0003"+
		"\u00b2Y\u0000\u082c\u0830\u0005\u0006\u0000\u0000\u082d\u0831\u0003\u00b2"+
		"Y\u0000\u082e\u0831\u0003\u00f4z\u0000\u082f\u0831\u0003\u00f6{\u0000"+
		"\u0830\u082d\u0001\u0000\u0000\u0000\u0830\u082e\u0001\u0000\u0000\u0000"+
		"\u0830\u082f\u0001\u0000\u0000\u0000\u0831\u0833\u0001\u0000\u0000\u0000"+
		"\u0832\u082c\u0001\u0000\u0000\u0000\u0832\u0833\u0001\u0000\u0000\u0000"+
		"\u0833\u00f5\u0001\u0000\u0000\u0000\u0834\u0835\u0005\f\u0000\u0000\u0835"+
		"\u0836\u0005\u000f\u0000\u0000\u0836\u0837\u0003\u0104\u0082\u0000\u0837"+
		"\u0838\u0005n\u0000\u0000\u0838\u0839\u0003\u00a2Q\u0000\u0839\u0840\u0003"+
		"\u00b2Y\u0000\u083a\u083e\u0005\u0006\u0000\u0000\u083b\u083f\u0003\u00b2"+
		"Y\u0000\u083c\u083f\u0003\u00f4z\u0000\u083d\u083f\u0003\u00f6{\u0000"+
		"\u083e\u083b\u0001\u0000\u0000\u0000\u083e\u083c\u0001\u0000\u0000\u0000"+
		"\u083e\u083d\u0001\u0000\u0000\u0000\u083f\u0841\u0001\u0000\u0000\u0000"+
		"\u0840\u083a\u0001\u0000\u0000\u0000\u0840\u0841\u0001\u0000\u0000\u0000"+
		"\u0841\u00f7\u0001\u0000\u0000\u0000\u0842\u0843\u0005\u000f\u0000\u0000"+
		"\u0843\u0844\u0003\u0104\u0082\u0000\u0844\u0845\u0005n\u0000\u0000\u0845"+
		"\u0846\u0003\u00a2Q\u0000\u0846\u00f9\u0001\u0000\u0000\u0000\u0847\u0848"+
		"\u0005\u0011\u0000\u0000\u0848\u0849\u0003\u00a2Q\u0000\u0849\u084d\u0005"+
		"\u0084\u0000\u0000\u084a\u084c\u0003\u0094J\u0000\u084b\u084a\u0001\u0000"+
		"\u0000\u0000\u084c\u084f\u0001\u0000\u0000\u0000\u084d\u084b\u0001\u0000"+
		"\u0000\u0000\u084d\u084e\u0001\u0000\u0000\u0000\u084e\u0851\u0001\u0000"+
		"\u0000\u0000\u084f\u084d\u0001\u0000\u0000\u0000\u0850\u0852\u0003\u00fc"+
		"~\u0000\u0851\u0850\u0001\u0000\u0000\u0000\u0851\u0852\u0001\u0000\u0000"+
		"\u0000\u0852\u0853\u0001\u0000\u0000\u0000\u0853\u0854\u0005\u0085\u0000"+
		"\u0000\u0854\u00fb\u0001\u0000\u0000\u0000\u0855\u0856\u0003\u0100\u0080"+
		"\u0000\u0856\u0857\u0005\u0080\u0000\u0000\u0857\u0858\u0003\u00fe\u007f"+
		"\u0000\u0858\u085a\u0001\u0000\u0000\u0000\u0859\u0855\u0001\u0000\u0000"+
		"\u0000\u085a\u085d\u0001\u0000\u0000\u0000\u085b\u0859\u0001\u0000\u0000"+
		"\u0000\u085b\u085c\u0001\u0000\u0000\u0000\u085c\u085e\u0001\u0000\u0000"+
		"\u0000\u085d\u085b\u0001\u0000\u0000\u0000\u085e\u085f\u0003\u0100\u0080"+
		"\u0000\u085f\u0860\u0005\u0080\u0000\u0000\u0860\u0862\u0003\u00a2Q\u0000"+
		"\u0861\u0863\u0005{\u0000\u0000\u0862\u0861\u0001\u0000\u0000\u0000\u0862"+
		"\u0863\u0001\u0000\u0000\u0000\u0863\u00fd\u0001\u0000\u0000\u0000\u0864"+
		"\u0865\u0003\u00a2Q\u0000\u0865\u0866\u0005{\u0000\u0000\u0866\u086c\u0001"+
		"\u0000\u0000\u0000\u0867\u0869\u0003\u00a8T\u0000\u0868\u086a\u0005{\u0000"+
		"\u0000\u0869\u0868\u0001\u0000\u0000\u0000\u0869\u086a\u0001\u0000\u0000"+
		"\u0000\u086a\u086c\u0001\u0000\u0000\u0000\u086b\u0864\u0001\u0000\u0000"+
		"\u0000\u086b\u0867\u0001\u0000\u0000\u0000\u086c\u00ff\u0001\u0000\u0000"+
		"\u0000\u086d\u086f\u0003\u0096K\u0000\u086e\u086d\u0001\u0000\u0000\u0000"+
		"\u086f\u0872\u0001\u0000\u0000\u0000\u0870\u086e\u0001\u0000\u0000\u0000"+
		"\u0870\u0871\u0001\u0000\u0000\u0000\u0871\u0873\u0001\u0000\u0000\u0000"+
		"\u0872\u0870\u0001\u0000\u0000\u0000\u0873\u0875\u0003\u0104\u0082\u0000"+
		"\u0874\u0876\u0003\u0102\u0081\u0000\u0875\u0874\u0001\u0000\u0000\u0000"+
		"\u0875\u0876\u0001\u0000\u0000\u0000\u0876\u0101\u0001\u0000\u0000\u0000"+
		"\u0877\u0878\u0005\f\u0000\u0000\u0878\u0879\u0003\u00a2Q\u0000\u0879"+
		"\u0103\u0001\u0000\u0000\u0000\u087a\u087c\u0005a\u0000\u0000\u087b\u087a"+
		"\u0001\u0000\u0000\u0000\u087b\u087c\u0001\u0000\u0000\u0000\u087c\u087d"+
		"\u0001\u0000\u0000\u0000\u087d\u0882\u0003\u0106\u0083\u0000\u087e\u087f"+
		"\u0005a\u0000\u0000\u087f\u0881\u0003\u0106\u0083\u0000\u0880\u087e\u0001"+
		"\u0000\u0000\u0000\u0881\u0884\u0001\u0000\u0000\u0000\u0882\u0880\u0001"+
		"\u0000\u0000\u0000\u0882\u0883\u0001\u0000\u0000\u0000\u0883\u0105\u0001"+
		"\u0000\u0000\u0000\u0884\u0882\u0001\u0000\u0000\u0000\u0885\u0888\u0003"+
		"\u0108\u0084\u0000\u0886\u0888\u0003\u0114\u008a\u0000\u0887\u0885\u0001"+
		"\u0000\u0000\u0000\u0887\u0886\u0001\u0000\u0000\u0000\u0888\u0889\u0001"+
		"\u0000\u0000\u0000\u0889\u088a\u0005\f\u0000\u0000\u088a\u088b\u0003\u00a2"+
		"Q\u0000\u088b\u088f\u0001\u0000\u0000\u0000\u088c\u088f\u0003\u0108\u0084"+
		"\u0000\u088d\u088f\u0003\u0114\u008a\u0000\u088e\u0887\u0001\u0000\u0000"+
		"\u0000\u088e\u088c\u0001\u0000\u0000\u0000\u088e\u088d\u0001\u0000\u0000"+
		"\u0000\u088f\u0107\u0001\u0000\u0000\u0000\u0890\u089f\u0003\u010a\u0085"+
		"\u0000\u0891\u089f\u0003\u010c\u0086\u0000\u0892\u089f\u0003\u010e\u0087"+
		"\u0000\u0893\u089f\u0003\u0110\u0088\u0000\u0894\u089f\u0003\u0112\u0089"+
		"\u0000\u0895\u089f\u0003\u0118\u008c\u0000\u0896\u089f\u0003\u011a\u008d"+
		"\u0000\u0897\u089f\u0003\u0124\u0092\u0000\u0898\u089f\u0003\u0128\u0094"+
		"\u0000\u0899\u089f\u0003\u012c\u0096\u0000\u089a\u089f\u0003\u012e\u0097"+
		"\u0000\u089b\u089f\u0003\u0132\u0099\u0000\u089c\u089f\u0003\u0002\u0001"+
		"\u0000\u089d\u089f\u0003\u00ba]\u0000\u089e\u0890\u0001\u0000\u0000\u0000"+
		"\u089e\u0891\u0001\u0000\u0000\u0000\u089e\u0892\u0001\u0000\u0000\u0000"+
		"\u089e\u0893\u0001\u0000\u0000\u0000\u089e\u0894\u0001\u0000\u0000\u0000"+
		"\u089e\u0895\u0001\u0000\u0000\u0000\u089e\u0896\u0001\u0000\u0000\u0000"+
		"\u089e\u0897\u0001\u0000\u0000\u0000\u089e\u0898\u0001\u0000\u0000\u0000"+
		"\u089e\u0899\u0001\u0000\u0000\u0000\u089e\u089a\u0001\u0000\u0000\u0000"+
		"\u089e\u089b\u0001\u0000\u0000\u0000\u089e\u089c\u0001\u0000\u0000\u0000"+
		"\u089e\u089d\u0001\u0000\u0000\u0000\u089f\u0109\u0001\u0000\u0000\u0000"+
		"\u08a0\u08a1\u0005,\u0000\u0000\u08a1\u08a2\u0003\u0106\u0083\u0000\u08a2"+
		"\u010b\u0001\u0000\u0000\u0000\u08a3\u08b4\u0005\u001f\u0000\u0000\u08a4"+
		"\u08b4\u0005\t\u0000\u0000\u08a5\u08b4\u0005I\u0000\u0000\u08a6\u08b4"+
		"\u0005L\u0000\u0000\u08a7\u08b4\u0005J\u0000\u0000\u08a8\u08b4\u0005K"+
		"\u0000\u0000\u08a9\u08b4\u0005M\u0000\u0000\u08aa\u08b4\u0005N\u0000\u0000"+
		"\u08ab\u08ad\u0005Y\u0000\u0000\u08ac\u08ab\u0001\u0000\u0000\u0000\u08ac"+
		"\u08ad\u0001\u0000\u0000\u0000\u08ad\u08ae\u0001\u0000\u0000\u0000\u08ae"+
		"\u08b4\u0005Q\u0000\u0000\u08af\u08b1\u0005Y\u0000\u0000\u08b0\u08af\u0001"+
		"\u0000\u0000\u0000\u08b0\u08b1\u0001\u0000\u0000\u0000\u08b1\u08b2\u0001"+
		"\u0000\u0000\u0000\u08b2\u08b4\u0005V\u0000\u0000\u08b3\u08a3\u0001\u0000"+
		"\u0000\u0000\u08b3\u08a4\u0001\u0000\u0000\u0000\u08b3\u08a5\u0001\u0000"+
		"\u0000\u0000\u08b3\u08a6\u0001\u0000\u0000\u0000\u08b3\u08a7\u0001\u0000"+
		"\u0000\u0000\u08b3\u08a8\u0001\u0000\u0000\u0000\u08b3\u08a9\u0001\u0000"+
		"\u0000\u0000\u08b3\u08aa\u0001\u0000\u0000\u0000\u08b3\u08ac\u0001\u0000"+
		"\u0000\u0000\u08b3\u08b0\u0001\u0000\u0000\u0000\u08b4\u010d\u0001\u0000"+
		"\u0000\u0000\u08b5\u08b7\u0007\u000b\u0000\u0000\u08b6\u08b5\u0001\u0000"+
		"\u0000\u0000\u08b7\u08ba\u0001\u0000\u0000\u0000\u08b8\u08b6\u0001\u0000"+
		"\u0000\u0000\u08b8\u08b9\u0001\u0000\u0000\u0000\u08b9\u08bb\u0001\u0000"+
		"\u0000\u0000\u08ba\u08b8\u0001\u0000\u0000\u0000\u08bb\u08be\u0003\u019c"+
		"\u00ce\u0000\u08bc\u08bd\u0005u\u0000\u0000\u08bd\u08bf\u0003\u0104\u0082"+
		"\u0000\u08be\u08bc\u0001\u0000\u0000\u0000\u08be\u08bf\u0001\u0000\u0000"+
		"\u0000\u08bf\u010f\u0001\u0000\u0000\u0000\u08c0\u08c1\u0005v\u0000\u0000"+
		"\u08c1\u0111\u0001\u0000\u0000\u0000\u08c2\u08c3\u0005x\u0000\u0000\u08c3"+
		"\u0113\u0001\u0000\u0000\u0000\u08c4\u08c5\u0003\u0116\u008b\u0000\u08c5"+
		"\u08c6\u0005x\u0000\u0000\u08c6\u08c7\u0003\u0116\u008b\u0000\u08c7\u08d8"+
		"\u0001\u0000\u0000\u0000\u08c8\u08c9\u0003\u0116\u008b\u0000\u08c9\u08ca"+
		"\u0005z\u0000\u0000\u08ca\u08cb\u0003\u0116\u008b\u0000\u08cb\u08d8\u0001"+
		"\u0000\u0000\u0000\u08cc\u08cd\u0005x\u0000\u0000\u08cd\u08d8\u0003\u0116"+
		"\u008b\u0000\u08ce\u08cf\u0005z\u0000\u0000\u08cf\u08d8\u0003\u0116\u008b"+
		"\u0000\u08d0\u08d1\u0003\u0116\u008b\u0000\u08d1\u08d2\u0005x\u0000\u0000"+
		"\u08d2\u08d8\u0001\u0000\u0000\u0000\u08d3\u08d4\u0003\u0116\u008b\u0000"+
		"\u08d4\u08d5\u0005y\u0000\u0000\u08d5\u08d6\u0003\u0116\u008b\u0000\u08d6"+
		"\u08d8\u0001\u0000\u0000\u0000\u08d7\u08c4\u0001\u0000\u0000\u0000\u08d7"+
		"\u08c8\u0001\u0000\u0000\u0000\u08d7\u08cc\u0001";
	private static final String _serializedATNSegment1 =
		"\u0000\u0000\u0000\u08d7\u08ce\u0001\u0000\u0000\u0000\u08d7\u08d0\u0001"+
		"\u0000\u0000\u0000\u08d7\u08d3\u0001\u0000\u0000\u0000\u08d8\u0115\u0001"+
		"\u0000\u0000\u0000\u08d9\u08e6\u0005I\u0000\u0000\u08da\u08e6\u0005L\u0000"+
		"\u0000\u08db\u08dd\u0005Y\u0000\u0000\u08dc\u08db\u0001\u0000\u0000\u0000"+
		"\u08dc\u08dd\u0001\u0000\u0000\u0000\u08dd\u08de\u0001\u0000\u0000\u0000"+
		"\u08de\u08e6\u0005Q\u0000\u0000\u08df\u08e1\u0005Y\u0000\u0000\u08e0\u08df"+
		"\u0001\u0000\u0000\u0000\u08e0\u08e1\u0001\u0000\u0000\u0000\u08e1\u08e2"+
		"\u0001\u0000\u0000\u0000\u08e2\u08e6\u0005V\u0000\u0000\u08e3\u08e6\u0003"+
		"\u0132\u0099\u0000\u08e4\u08e6\u0003\u00ba]\u0000\u08e5\u08d9\u0001\u0000"+
		"\u0000\u0000\u08e5\u08da\u0001\u0000\u0000\u0000\u08e5\u08dc\u0001\u0000"+
		"\u0000\u0000\u08e5\u08e0\u0001\u0000\u0000\u0000\u08e5\u08e3\u0001\u0000"+
		"\u0000\u0000\u08e5\u08e4\u0001\u0000\u0000\u0000\u08e6\u0117\u0001\u0000"+
		"\u0000\u0000\u08e7\u08e9\u0007\u0004\u0000\u0000\u08e8\u08ea\u0005\u0014"+
		"\u0000\u0000\u08e9\u08e8\u0001\u0000\u0000\u0000\u08e9\u08ea\u0001\u0000"+
		"\u0000\u0000\u08ea\u08eb\u0001\u0000\u0000\u0000\u08eb\u08ec\u0003\u0108"+
		"\u0084\u0000\u08ec\u0119\u0001\u0000\u0000\u0000\u08ed\u08f0\u0003\u0176"+
		"\u00bb\u0000\u08ee\u08f0\u0003\u018c\u00c6\u0000\u08ef\u08ed\u0001\u0000"+
		"\u0000\u0000\u08ef\u08ee\u0001\u0000\u0000\u0000\u08f0\u08f1\u0001\u0000"+
		"\u0000\u0000\u08f1\u08f3\u0005\u0084\u0000\u0000\u08f2\u08f4\u0003\u011c"+
		"\u008e\u0000\u08f3\u08f2\u0001\u0000\u0000\u0000\u08f3\u08f4\u0001\u0000"+
		"\u0000\u0000\u08f4\u08f5\u0001\u0000\u0000\u0000\u08f5\u08f6\u0005\u0085"+
		"\u0000\u0000\u08f6\u011b\u0001\u0000\u0000\u0000\u08f7\u08fc\u0003\u011e"+
		"\u008f\u0000\u08f8\u08fa\u0005{\u0000\u0000\u08f9\u08fb\u0003\u0122\u0091"+
		"\u0000\u08fa\u08f9\u0001\u0000\u0000\u0000\u08fa\u08fb\u0001\u0000\u0000"+
		"\u0000\u08fb\u08fd\u0001\u0000\u0000\u0000\u08fc\u08f8\u0001\u0000\u0000"+
		"\u0000\u08fc\u08fd\u0001\u0000\u0000\u0000\u08fd\u0900\u0001\u0000\u0000"+
		"\u0000\u08fe\u0900\u0003\u0122\u0091\u0000\u08ff\u08f7\u0001\u0000\u0000"+
		"\u0000\u08ff\u08fe\u0001\u0000\u0000\u0000\u0900\u011d\u0001\u0000\u0000"+
		"\u0000\u0901\u0906\u0003\u0120\u0090\u0000\u0902\u0903\u0005{\u0000\u0000"+
		"\u0903\u0905\u0003\u0120\u0090\u0000\u0904\u0902\u0001\u0000\u0000\u0000"+
		"\u0905\u0908\u0001\u0000\u0000\u0000\u0906\u0904\u0001\u0000\u0000\u0000"+
		"\u0906\u0907\u0001\u0000\u0000\u0000\u0907\u011f\u0001\u0000\u0000\u0000"+
		"\u0908\u0906\u0001\u0000\u0000\u0000\u0909\u090b\u0003\u0096K\u0000\u090a"+
		"\u0909\u0001\u0000\u0000\u0000\u090b\u090e\u0001\u0000\u0000\u0000\u090c"+
		"\u090a\u0001\u0000\u0000\u0000\u090c\u090d\u0001\u0000\u0000\u0000\u090d"+
		"\u091f\u0001\u0000\u0000\u0000\u090e\u090c\u0001\u0000\u0000\u0000\u090f"+
		"\u0910\u0003\u00c2a\u0000\u0910\u0911\u0005}\u0000\u0000\u0911\u0912\u0003"+
		"\u0104\u0082\u0000\u0912\u0920\u0001\u0000\u0000\u0000\u0913\u0914\u0003"+
		"\u019c\u00ce\u0000\u0914\u0915\u0005}\u0000\u0000\u0915\u0916\u0003\u0104"+
		"\u0082\u0000\u0916\u0920\u0001\u0000\u0000\u0000\u0917\u0919\u0005\u0016"+
		"\u0000\u0000\u0918\u0917\u0001\u0000\u0000\u0000\u0918\u0919\u0001\u0000"+
		"\u0000\u0000\u0919\u091b\u0001\u0000\u0000\u0000\u091a\u091c\u0005\u0014"+
		"\u0000\u0000\u091b\u091a\u0001\u0000\u0000\u0000\u091b\u091c\u0001\u0000"+
		"\u0000\u0000\u091c\u091d\u0001\u0000\u0000\u0000\u091d\u0920\u0003\u019c"+
		"\u00ce\u0000\u091e\u0920\u0003\u010a\u0085\u0000\u091f\u090f\u0001\u0000"+
		"\u0000\u0000\u091f\u0913\u0001\u0000\u0000\u0000\u091f\u0918\u0001\u0000"+
		"\u0000\u0000\u091f\u091e\u0001\u0000\u0000\u0000\u0920\u0121\u0001\u0000"+
		"\u0000\u0000\u0921\u0923\u0003\u0096K\u0000\u0922\u0921\u0001\u0000\u0000"+
		"\u0000\u0923\u0926\u0001\u0000\u0000\u0000\u0924\u0922\u0001\u0000\u0000"+
		"\u0000\u0924\u0925\u0001\u0000\u0000\u0000\u0925\u0927\u0001\u0000\u0000"+
		"\u0000\u0926\u0924\u0001\u0000\u0000\u0000\u0927\u0928\u0005x\u0000\u0000"+
		"\u0928\u0123\u0001\u0000\u0000\u0000\u0929\u092c\u0003\u0176\u00bb\u0000"+
		"\u092a\u092c\u0003\u018c\u00c6\u0000\u092b\u0929\u0001\u0000\u0000\u0000"+
		"\u092b\u092a\u0001\u0000\u0000\u0000\u092c\u092d\u0001\u0000\u0000\u0000"+
		"\u092d\u092f\u0005\u0088\u0000\u0000\u092e\u0930\u0003\u0126\u0093\u0000"+
		"\u092f\u092e\u0001\u0000\u0000\u0000\u092f\u0930\u0001\u0000\u0000\u0000"+
		"\u0930\u0931\u0001\u0000\u0000\u0000\u0931\u0932\u0005\u0089\u0000\u0000"+
		"\u0932\u0125\u0001\u0000\u0000\u0000\u0933\u0938\u0003\u0104\u0082\u0000"+
		"\u0934\u0935\u0005{\u0000\u0000\u0935\u0937\u0003\u0104\u0082\u0000\u0936"+
		"\u0934\u0001\u0000\u0000\u0000\u0937\u093a\u0001\u0000\u0000\u0000\u0938"+
		"\u0936\u0001\u0000\u0000\u0000\u0938\u0939\u0001\u0000\u0000\u0000\u0939"+
		"\u093c\u0001\u0000\u0000\u0000\u093a\u0938\u0001\u0000\u0000\u0000\u093b"+
		"\u093d\u0005{\u0000\u0000\u093c\u093b\u0001\u0000\u0000\u0000\u093c\u093d"+
		"\u0001\u0000\u0000\u0000\u093d\u0127\u0001\u0000\u0000\u0000\u093e\u0940"+
		"\u0005\u0088\u0000\u0000\u093f\u0941\u0003\u012a\u0095\u0000\u0940\u093f"+
		"\u0001\u0000\u0000\u0000\u0940\u0941\u0001\u0000\u0000\u0000\u0941\u0942"+
		"\u0001\u0000\u0000\u0000\u0942\u0943\u0005\u0089\u0000\u0000\u0943\u0129"+
		"\u0001\u0000\u0000\u0000\u0944\u0945\u0003\u0104\u0082\u0000\u0945\u0946"+
		"\u0005{\u0000\u0000\u0946\u0953\u0001\u0000\u0000\u0000\u0947\u0953\u0003"+
		"\u0112\u0089\u0000\u0948\u094b\u0003\u0104\u0082\u0000\u0949\u094a\u0005"+
		"{\u0000\u0000\u094a\u094c\u0003\u0104\u0082\u0000\u094b\u0949\u0001\u0000"+
		"\u0000\u0000\u094c\u094d\u0001\u0000\u0000\u0000\u094d\u094b\u0001\u0000"+
		"\u0000\u0000\u094d\u094e\u0001\u0000\u0000\u0000\u094e\u0950\u0001\u0000"+
		"\u0000\u0000\u094f\u0951\u0005{\u0000\u0000\u0950\u094f\u0001\u0000\u0000"+
		"\u0000\u0950\u0951\u0001\u0000\u0000\u0000\u0951\u0953\u0001\u0000\u0000"+
		"\u0000\u0952\u0944\u0001\u0000\u0000\u0000\u0952\u0947\u0001\u0000\u0000"+
		"\u0000\u0952\u0948\u0001\u0000\u0000\u0000\u0953\u012b\u0001\u0000\u0000"+
		"\u0000\u0954\u0955\u0005\u0088\u0000\u0000\u0955\u0956\u0003\u0104\u0082"+
		"\u0000\u0956\u0957\u0005\u0089\u0000\u0000\u0957\u012d\u0001\u0000\u0000"+
		"\u0000\u0958\u095a\u0005\u0086\u0000\u0000\u0959\u095b\u0003\u0130\u0098"+
		"\u0000\u095a\u0959\u0001\u0000\u0000\u0000\u095a\u095b\u0001\u0000\u0000"+
		"\u0000\u095b\u095c\u0001\u0000\u0000\u0000\u095c\u095d\u0005\u0087\u0000"+
		"\u0000\u095d\u012f\u0001\u0000\u0000\u0000\u095e\u0963\u0003\u0104\u0082"+
		"\u0000\u095f\u0960\u0005{\u0000\u0000\u0960\u0962\u0003\u0104\u0082\u0000"+
		"\u0961\u095f\u0001\u0000\u0000\u0000\u0962\u0965\u0001\u0000\u0000\u0000"+
		"\u0963\u0961\u0001\u0000\u0000\u0000\u0963\u0964\u0001\u0000\u0000\u0000"+
		"\u0964\u0967\u0001\u0000\u0000\u0000\u0965\u0963\u0001\u0000\u0000\u0000"+
		"\u0966\u0968\u0005{\u0000\u0000\u0967\u0966\u0001\u0000\u0000\u0000\u0967"+
		"\u0968\u0001\u0000\u0000\u0000\u0968\u0131\u0001\u0000\u0000\u0000\u0969"+
		"\u096c\u0003\u0176\u00bb\u0000\u096a\u096c\u0003\u018c\u00c6\u0000\u096b"+
		"\u0969\u0001\u0000\u0000\u0000\u096b\u096a\u0001\u0000\u0000\u0000\u096c"+
		"\u0133\u0001\u0000\u0000\u0000\u096d\u097e\u0003\u0136\u009b\u0000\u096e"+
		"\u097e\u0003\u0158\u00ac\u0000\u096f\u097e\u0003\u0154\u00aa\u0000\u0970"+
		"\u0971\u0005\u000b\u0000\u0000\u0971\u0972\u0005r\u0000\u0000\u0972\u0977"+
		"\u0003\u0170\u00b8\u0000\u0973\u0974\u0005{\u0000\u0000\u0974\u0976\u0003"+
		"\u0170\u00b8\u0000\u0975\u0973\u0001\u0000\u0000\u0000\u0976\u0979\u0001"+
		"\u0000\u0000\u0000\u0977\u0975\u0001\u0000\u0000\u0000\u0977\u0978\u0001"+
		"\u0000\u0000\u0000\u0978\u097a\u0001\u0000\u0000\u0000\u0979\u0977\u0001"+
		"\u0000\u0000\u0000\u097a\u097b\u0005q\u0000\u0000\u097b\u097c\u0003\u0134"+
		"\u009a\u0000\u097c\u097e\u0001\u0000\u0000\u0000\u097d\u096d\u0001\u0000"+
		"\u0000\u0000\u097d\u096e\u0001\u0000\u0000\u0000\u097d\u096f\u0001\u0000"+
		"\u0000\u0000\u097d\u0970\u0001\u0000\u0000\u0000\u097e\u0135\u0001\u0000"+
		"\u0000\u0000\u097f\u0992\u0003\u0138\u009c\u0000\u0980\u0992\u0003\u015a"+
		"\u00ad\u0000\u0981\u0982\u0005!\u0000\u0000\u0982\u0983\u0003z=\u0000"+
		"\u0983\u0984\u0003\u0136\u009b\u0000\u0984\u0992\u0001\u0000\u0000\u0000"+
		"\u0985\u0992\u0003\u0156\u00ab\u0000\u0986\u0992\u0003\u0192\u00c9\u0000"+
		"\u0987\u0992\u0003\u013c\u009e\u0000\u0988\u0992\u0003\u013a\u009d\u0000"+
		"\u0989\u0992\u0003\u0144\u00a2\u0000\u098a\u0992\u0003\u0142\u00a1\u0000"+
		"\u098b\u0992\u0003\u013e\u009f\u0000\u098c\u0992\u0003\u0140\u00a0\u0000"+
		"\u098d\u0992\u0003\u015e\u00af\u0000\u098e\u0992\u0003\u0190\u00c8\u0000"+
		"\u098f\u0992\u0003\u0146\u00a3\u0000\u0990\u0992\u0003\u0002\u0001\u0000"+
		"\u0991\u097f\u0001\u0000\u0000\u0000\u0991\u0980\u0001\u0000\u0000\u0000"+
		"\u0991\u0981\u0001\u0000\u0000\u0000\u0991\u0985\u0001\u0000\u0000\u0000"+
		"\u0991\u0986\u0001\u0000\u0000\u0000\u0991\u0987\u0001\u0000\u0000\u0000"+
		"\u0991\u0988\u0001\u0000\u0000\u0000\u0991\u0989\u0001\u0000\u0000\u0000"+
		"\u0991\u098a\u0001\u0000\u0000\u0000\u0991\u098b\u0001\u0000\u0000\u0000"+
		"\u0991\u098c\u0001\u0000\u0000\u0000\u0991\u098d\u0001\u0000\u0000\u0000"+
		"\u0991\u098e\u0001\u0000\u0000\u0000\u0991\u098f\u0001\u0000\u0000\u0000"+
		"\u0991\u0990\u0001\u0000\u0000\u0000\u0992\u0137\u0001\u0000\u0000\u0000"+
		"\u0993\u0994\u0005\u0088\u0000\u0000\u0994\u0995\u0003\u0134\u009a\u0000"+
		"\u0995\u0996\u0005\u0089\u0000\u0000\u0996\u0139\u0001\u0000\u0000\u0000"+
		"\u0997\u0998\u0005^\u0000\u0000\u0998\u013b\u0001\u0000\u0000\u0000\u0999"+
		"\u09a4\u0005\u0088\u0000\u0000\u099a\u099b\u0003\u0134\u009a\u0000\u099b"+
		"\u099c\u0005{\u0000\u0000\u099c\u099e\u0001\u0000\u0000\u0000\u099d\u099a"+
		"\u0001\u0000\u0000\u0000\u099e\u099f\u0001\u0000\u0000\u0000\u099f\u099d"+
		"\u0001\u0000\u0000\u0000\u099f\u09a0\u0001\u0000\u0000\u0000\u09a0\u09a2"+
		"\u0001\u0000\u0000\u0000\u09a1\u09a3\u0003\u0134\u009a\u0000\u09a2\u09a1"+
		"\u0001\u0000\u0000\u0000\u09a2\u09a3\u0001\u0000\u0000\u0000\u09a3\u09a5"+
		"\u0001\u0000\u0000\u0000\u09a4\u099d\u0001\u0000\u0000\u0000\u09a4\u09a5"+
		"\u0001\u0000\u0000\u0000\u09a5\u09a6\u0001\u0000\u0000\u0000\u09a6\u09a7"+
		"\u0005\u0089\u0000\u0000\u09a7\u013d\u0001\u0000\u0000\u0000\u09a8\u09a9"+
		"\u0005\u0086\u0000\u0000\u09a9\u09aa\u0003\u0134\u009a\u0000\u09aa\u09ab"+
		"\u0005|\u0000\u0000\u09ab\u09ac\u0003\u00a2Q\u0000\u09ac\u09ad\u0005\u0087"+
		"\u0000\u0000\u09ad\u013f\u0001\u0000\u0000\u0000\u09ae\u09af\u0005\u0086"+
		"\u0000\u0000\u09af\u09b0\u0003\u0134\u009a\u0000\u09b0\u09b1\u0005\u0087"+
		"\u0000\u0000\u09b1\u0141\u0001\u0000\u0000\u0000\u09b2\u09b4\u0007\u0004"+
		"\u0000\u0000\u09b3\u09b5\u0003\u0170\u00b8\u0000\u09b4\u09b3\u0001\u0000"+
		"\u0000\u0000\u09b4\u09b5\u0001\u0000\u0000\u0000\u09b5\u09b7\u0001\u0000"+
		"\u0000\u0000\u09b6\u09b8\u0005\u0019\u0000\u0000\u09b7\u09b6\u0001\u0000"+
		"\u0000\u0000\u09b7\u09b8\u0001\u0000\u0000\u0000\u09b8\u09ba\u0001\u0000"+
		"\u0000\u0000\u09b9\u09bb\u0007\u0005\u0000\u0000\u09ba\u09b9\u0001\u0000"+
		"\u0000\u0000\u09ba\u09bb\u0001\u0000\u0000\u0000\u09bb\u09bc\u0001\u0000"+
		"\u0000\u0000\u09bc\u09bd\u0003\u0136\u009b\u0000\u09bd\u0143\u0001\u0000"+
		"\u0000\u0000\u09be\u09bf\u0005Z\u0000\u0000\u09bf\u09c0\u0007\u0005\u0000"+
		"\u0000\u09c0\u09c1\u0003\u0136\u009b\u0000\u09c1\u0145\u0001\u0000\u0000"+
		"\u0000\u09c2\u09c4\u0003\u0090H\u0000\u09c3\u09c2\u0001\u0000\u0000\u0000"+
		"\u09c3\u09c4\u0001\u0000\u0000\u0000\u09c4\u09c5\u0001\u0000\u0000\u0000"+
		"\u09c5\u09c6\u0003\u0148\u00a4\u0000\u09c6\u09c7\u0005\n\u0000\u0000\u09c7"+
		"\u09c9\u0005\u0088\u0000\u0000\u09c8\u09ca\u0003\u014c\u00a6\u0000\u09c9"+
		"\u09c8\u0001\u0000\u0000\u0000\u09c9\u09ca\u0001\u0000\u0000\u0000\u09ca"+
		"\u09cb\u0001\u0000\u0000\u0000\u09cb\u09cd\u0005\u0089\u0000\u0000\u09cc"+
		"\u09ce\u0003\u014a\u00a5\u0000\u09cd\u09cc\u0001\u0000\u0000\u0000\u09cd"+
		"\u09ce\u0001\u0000\u0000\u0000\u09ce\u0147\u0001\u0000\u0000\u0000\u09cf"+
		"\u09d1\u0005!\u0000\u0000\u09d0\u09cf\u0001\u0000\u0000\u0000\u09d0\u09d1"+
		"\u0001\u0000\u0000\u0000\u09d1\u09d6\u0001\u0000\u0000\u0000\u09d2\u09d4"+
		"\u0005\b\u0000\u0000\u09d3\u09d5\u0003:\u001d\u0000\u09d4\u09d3\u0001"+
		"\u0000\u0000\u0000\u09d4\u09d5\u0001\u0000\u0000\u0000\u09d5\u09d7\u0001"+
		"\u0000\u0000\u0000\u09d6\u09d2\u0001\u0000\u0000\u0000\u09d6\u09d7\u0001"+
		"\u0000\u0000\u0000\u09d7\u0149\u0001\u0000\u0000\u0000\u09d8\u09d9\u0005"+
		"\u007f\u0000\u0000\u09d9\u09da\u0003\u0136\u009b\u0000\u09da\u014b\u0001"+
		"\u0000\u0000\u0000\u09db\u09de\u0003\u014e\u00a7\u0000\u09dc\u09de\u0003"+
		"\u0152\u00a9\u0000\u09dd\u09db\u0001\u0000\u0000\u0000\u09dd\u09dc\u0001"+
		"\u0000\u0000\u0000\u09de\u014d\u0001\u0000\u0000\u0000\u09df\u09e4\u0003"+
		"\u0150\u00a8\u0000\u09e0\u09e1\u0005{\u0000\u0000\u09e1\u09e3\u0003\u0150"+
		"\u00a8\u0000\u09e2\u09e0\u0001\u0000\u0000\u0000\u09e3\u09e6\u0001\u0000"+
		"\u0000\u0000\u09e4\u09e2\u0001\u0000\u0000\u0000\u09e4\u09e5\u0001\u0000"+
		"\u0000\u0000\u09e5\u09e8\u0001\u0000\u0000\u0000\u09e6\u09e4\u0001\u0000"+
		"\u0000\u0000\u09e7\u09e9\u0005{\u0000\u0000\u09e8\u09e7\u0001\u0000\u0000"+
		"\u0000\u09e8\u09e9\u0001\u0000\u0000\u0000\u09e9\u014f\u0001\u0000\u0000"+
		"\u0000\u09ea\u09ec\u0003\u0096K\u0000\u09eb\u09ea\u0001\u0000\u0000\u0000"+
		"\u09ec\u09ef\u0001\u0000\u0000\u0000\u09ed\u09eb\u0001\u0000\u0000\u0000"+
		"\u09ed\u09ee\u0001\u0000\u0000\u0000\u09ee\u09f5\u0001\u0000\u0000\u0000"+
		"\u09ef\u09ed\u0001\u0000\u0000\u0000\u09f0\u09f3\u0003\u019c\u00ce\u0000"+
		"\u09f1\u09f3\u0005v\u0000\u0000\u09f2\u09f0\u0001\u0000\u0000\u0000\u09f2"+
		"\u09f1\u0001\u0000\u0000\u0000\u09f3\u09f4\u0001\u0000\u0000\u0000\u09f4"+
		"\u09f6\u0005}\u0000\u0000\u09f5\u09f2\u0001\u0000\u0000\u0000\u09f5\u09f6"+
		"\u0001\u0000\u0000\u0000\u09f6\u09f9\u0001\u0000\u0000\u0000\u09f7\u09fa"+
		"\u0003\u0134\u009a\u0000\u09f8\u09fa\u0005y\u0000\u0000\u09f9\u09f7\u0001"+
		"\u0000\u0000\u0000\u09f9\u09f8\u0001\u0000\u0000\u0000\u09fa\u0151\u0001"+
		"\u0000\u0000\u0000\u09fb\u09fc\u0003\u0150\u00a8\u0000\u09fc\u09fd\u0005"+
		"{\u0000\u0000\u09fd\u09ff\u0001\u0000\u0000\u0000\u09fe\u09fb\u0001\u0000"+
		"\u0000\u0000\u09ff\u0a02\u0001\u0000\u0000\u0000\u0a00\u09fe\u0001\u0000"+
		"\u0000\u0000\u0a00\u0a01\u0001\u0000\u0000\u0000\u0a01\u0a03\u0001\u0000"+
		"\u0000\u0000\u0a02\u0a00\u0001\u0000\u0000\u0000\u0a03\u0a04\u0003\u0150"+
		"\u00a8\u0000\u0a04\u0a08\u0005{\u0000\u0000\u0a05\u0a07\u0003\u0096K\u0000"+
		"\u0a06\u0a05\u0001\u0000\u0000\u0000\u0a07\u0a0a\u0001\u0000\u0000\u0000"+
		"\u0a08\u0a06\u0001\u0000\u0000\u0000\u0a08\u0a09\u0001\u0000\u0000\u0000"+
		"\u0a09\u0a0b\u0001\u0000\u0000\u0000\u0a0a\u0a08\u0001\u0000\u0000\u0000"+
		"\u0a0b\u0a0c\u0005y\u0000\u0000\u0a0c\u0153\u0001\u0000\u0000\u0000\u0a0d"+
		"\u0a0e\u0005(\u0000\u0000\u0a0e\u0a10\u0004\u00aa\u0018\u0000\u0a0f\u0a11"+
		"\u0005Z\u0000\u0000\u0a10\u0a0f\u0001\u0000\u0000\u0000\u0a10\u0a11\u0001"+
		"\u0000\u0000\u0000\u0a11\u0a12\u0001\u0000\u0000\u0000\u0a12\u0a18\u0003"+
		"\u0160\u00b0\u0000\u0a13\u0a15\u0005Z\u0000\u0000\u0a14\u0a13\u0001\u0000"+
		"\u0000\u0000\u0a14\u0a15\u0001\u0000\u0000\u0000\u0a15\u0a16\u0001\u0000"+
		"\u0000\u0000\u0a16\u0a18\u0003\u0160\u00b0\u0000\u0a17\u0a0d\u0001\u0000"+
		"\u0000\u0000\u0a17\u0a14\u0001\u0000\u0000\u0000\u0a18\u0155\u0001\u0000"+
		"\u0000\u0000\u0a19\u0a1b\u0005(\u0000\u0000\u0a1a\u0a19\u0001\u0000\u0000"+
		"\u0000\u0a1a\u0a1b\u0001\u0000\u0000\u0000\u0a1b\u0a1d\u0001\u0000\u0000"+
		"\u0000\u0a1c\u0a1e\u0005Z\u0000\u0000\u0a1d\u0a1c\u0001\u0000\u0000\u0000"+
		"\u0a1d\u0a1e\u0001\u0000\u0000\u0000\u0a1e\u0a1f\u0001\u0000\u0000\u0000"+
		"\u0a1f\u0a20\u0003\u0166\u00b3\u0000\u0a20\u0157\u0001\u0000\u0000\u0000"+
		"\u0a21\u0a23\u0005\r\u0000\u0000\u0a22\u0a24\u0005\u0003\u0000\u0000\u0a23"+
		"\u0a22\u0001\u0000\u0000\u0000\u0a23\u0a24\u0001\u0000\u0000\u0000\u0a24"+
		"\u0a25\u0001\u0000\u0000\u0000\u0a25\u0a26\u0003\u0160\u00b0\u0000\u0a26"+
		"\u0159\u0001\u0000\u0000\u0000\u0a27\u0a29\u0005\r\u0000\u0000\u0a28\u0a2a"+
		"\u0005\u0003\u0000\u0000\u0a29\u0a28\u0001\u0000\u0000\u0000\u0a29\u0a2a"+
		"\u0001\u0000\u0000\u0000\u0a2a\u0a2b\u0001\u0000\u0000\u0000\u0a2b\u0a32"+
		"\u0003\u015c\u00ae\u0000\u0a2c\u0a2e\u0005\r\u0000\u0000\u0a2d\u0a2f\u0005"+
		"\u0003\u0000\u0000\u0a2e\u0a2d\u0001\u0000\u0000\u0000\u0a2e\u0a2f\u0001"+
		"\u0000\u0000\u0000\u0a2f\u0a30\u0001\u0000\u0000\u0000\u0a30\u0a32\u0003"+
		"\u0166\u00b3\u0000\u0a31\u0a27\u0001\u0000\u0000\u0000\u0a31\u0a2c\u0001"+
		"\u0000\u0000\u0000\u0a32\u015b\u0001\u0000\u0000\u0000\u0a33\u0a35\u0003"+
		"\u0090H\u0000\u0a34\u0a33\u0001\u0000\u0000\u0000\u0a34\u0a35\u0001\u0000"+
		"\u0000\u0000\u0a35\u0a37\u0001\u0000\u0000\u0000\u0a36\u0a38\u0005&\u0000"+
		"\u0000\u0a37\u0a36\u0001\u0000\u0000\u0000\u0a37\u0a38\u0001\u0000\u0000"+
		"\u0000\u0a38\u0a39\u0001\u0000\u0000\u0000\u0a39\u0a3a\u0007\f\u0000\u0000"+
		"\u0a3a\u0a3c\u0005\u0088\u0000\u0000\u0a3b\u0a3d\u0003\u014c\u00a6\u0000"+
		"\u0a3c\u0a3b\u0001\u0000\u0000\u0000\u0a3c\u0a3d\u0001\u0000\u0000\u0000"+
		"\u0a3d\u0a3e\u0001\u0000\u0000\u0000\u0a3e\u0a41\u0005\u0089\u0000\u0000"+
		"\u0a3f\u0a40\u0005\u007f\u0000\u0000\u0a40\u0a42\u0003\u0134\u009a\u0000"+
		"\u0a41\u0a3f\u0001\u0000\u0000\u0000\u0a41\u0a42\u0001\u0000\u0000\u0000"+
		"\u0a42\u015d\u0001\u0000\u0000\u0000\u0a43\u0a44\u0005v\u0000\u0000\u0a44"+
		"\u015f\u0001\u0000\u0000\u0000\u0a45\u0a4a\u0003\u0162\u00b1\u0000\u0a46"+
		"\u0a47\u0005X\u0000\u0000\u0a47\u0a49\u0003\u0162\u00b1\u0000\u0a48\u0a46"+
		"\u0001\u0000\u0000\u0000\u0a49\u0a4c\u0001\u0000\u0000\u0000\u0a4a\u0a48"+
		"\u0001\u0000\u0000\u0000\u0a4a\u0a4b\u0001\u0000\u0000\u0000\u0a4b\u0a4e"+
		"\u0001\u0000\u0000\u0000\u0a4c\u0a4a\u0001\u0000\u0000\u0000\u0a4d\u0a4f"+
		"\u0005X\u0000\u0000\u0a4e\u0a4d\u0001\u0000\u0000\u0000\u0a4e\u0a4f\u0001"+
		"\u0000\u0000\u0000\u0a4f\u0161\u0001\u0000\u0000\u0000\u0a50\u0a56\u0003"+
		"\u0164\u00b2\u0000\u0a51\u0a52\u0005\u0088\u0000\u0000\u0a52\u0a53\u0003"+
		"\u0160\u00b0\u0000\u0a53\u0a54\u0005\u0089\u0000\u0000\u0a54\u0a56\u0001"+
		"\u0000\u0000\u0000\u0a55\u0a50\u0001\u0000\u0000\u0000\u0a55\u0a51\u0001"+
		"\u0000\u0000\u0000\u0a56\u0163\u0001\u0000\u0000\u0000\u0a57\u0a5c\u0003"+
		"\u0170\u00b8\u0000\u0a58\u0a5c\u0003\u0166\u00b3\u0000\u0a59\u0a5c\u0003"+
		"\u015c\u00ae\u0000\u0a5a\u0a5c\u0003\u0168\u00b4\u0000\u0a5b\u0a57\u0001"+
		"\u0000\u0000\u0000\u0a5b\u0a58\u0001\u0000\u0000\u0000\u0a5b\u0a59\u0001"+
		"\u0000\u0000\u0000\u0a5b\u0a5a\u0001\u0000\u0000\u0000\u0a5c\u0165\u0001"+
		"\u0000\u0000\u0000\u0a5d\u0a5f\u0005^\u0000\u0000\u0a5e\u0a5d\u0001\u0000"+
		"\u0000\u0000\u0a5e\u0a5f\u0001\u0000\u0000\u0000\u0a5f\u0a61\u0001\u0000"+
		"\u0000\u0000\u0a60\u0a62\u0005\u0083\u0000\u0000\u0a61\u0a60\u0001\u0000"+
		"\u0000\u0000\u0a61\u0a62\u0001\u0000\u0000\u0000\u0a62\u0a65\u0001\u0000"+
		"\u0000\u0000\u0a63\u0a64\u0005_\u0000\u0000\u0a64\u0a66\u0005\u0003\u0000"+
		"\u0000\u0a65\u0a63\u0001\u0000\u0000\u0000\u0a65\u0a66\u0001\u0000\u0000"+
		"\u0000\u0a66\u0a68\u0001\u0000\u0000\u0000\u0a67\u0a69\u0003\u0090H\u0000"+
		"\u0a68\u0a67\u0001\u0000\u0000\u0000\u0a68\u0a69\u0001\u0000\u0000\u0000"+
		"\u0a69\u0a6a\u0001\u0000\u0000\u0000\u0a6a\u0a7d\u0003\u0192\u00c9\u0000"+
		"\u0a6b\u0a6d\u0005\u0088\u0000\u0000\u0a6c\u0a6e\u0005^\u0000\u0000\u0a6d"+
		"\u0a6c\u0001\u0000\u0000\u0000\u0a6d\u0a6e\u0001\u0000\u0000\u0000\u0a6e"+
		"\u0a70\u0001\u0000\u0000\u0000\u0a6f\u0a71\u0005\u0083\u0000\u0000\u0a70"+
		"\u0a6f\u0001\u0000\u0000\u0000\u0a70\u0a71\u0001\u0000\u0000\u0000\u0a71"+
		"\u0a74\u0001\u0000\u0000\u0000\u0a72\u0a73\u0005_\u0000\u0000\u0a73\u0a75"+
		"\u0005\u0003\u0000\u0000\u0a74\u0a72\u0001\u0000\u0000\u0000\u0a74\u0a75"+
		"\u0001\u0000\u0000\u0000\u0a75\u0a77\u0001\u0000\u0000\u0000\u0a76\u0a78"+
		"\u0003\u0090H\u0000\u0a77\u0a76\u0001\u0000\u0000\u0000\u0a77\u0a78\u0001"+
		"\u0000\u0000\u0000\u0a78\u0a79\u0001\u0000\u0000\u0000\u0a79\u0a7a\u0003"+
		"\u0192\u00c9\u0000\u0a7a\u0a7b\u0005\u0089\u0000\u0000\u0a7b\u0a7d\u0001"+
		"\u0000\u0000\u0000\u0a7c\u0a5e\u0001\u0000\u0000\u0000\u0a7c\u0a6b\u0001"+
		"\u0000\u0000\u0000\u0a7d\u0167\u0001\u0000\u0000\u0000\u0a7e\u0a7f\u0005"+
		"#\u0000\u0000\u0a7f\u0a80\u0003\u016a\u00b5\u0000\u0a80\u0169\u0001\u0000"+
		"\u0000\u0000\u0a81\u0a82\u0005r\u0000\u0000\u0a82\u0a93\u0005q\u0000\u0000"+
		"\u0a83\u0a89\u0005r\u0000\u0000\u0a84\u0a85\u0003\u016c\u00b6\u0000\u0a85"+
		"\u0a86\u0005{\u0000\u0000\u0a86\u0a88\u0001\u0000\u0000\u0000\u0a87\u0a84"+
		"\u0001\u0000\u0000\u0000\u0a88\u0a8b\u0001\u0000\u0000\u0000\u0a89\u0a87"+
		"\u0001\u0000\u0000\u0000\u0a89\u0a8a\u0001\u0000\u0000\u0000\u0a8a\u0a8c"+
		"\u0001\u0000\u0000\u0000\u0a8b\u0a89\u0001\u0000\u0000\u0000\u0a8c\u0a8e"+
		"\u0003\u016c\u00b6\u0000\u0a8d\u0a8f\u0005{\u0000\u0000\u0a8e\u0a8d\u0001"+
		"\u0000\u0000\u0000\u0a8e\u0a8f\u0001\u0000\u0000\u0000\u0a8f\u0a90\u0001"+
		"\u0000\u0000\u0000\u0a90\u0a91\u0005q\u0000\u0000\u0a91\u0a93\u0001\u0000"+
		"\u0000\u0000\u0a92\u0a81\u0001\u0000\u0000\u0000\u0a92\u0a83\u0001\u0000"+
		"\u0000\u0000\u0a93\u016b\u0001\u0000\u0000\u0000\u0a94\u0a98\u0003\u0170"+
		"\u00b8\u0000\u0a95\u0a98\u0003\u019c\u00ce\u0000\u0a96\u0a98\u0005\u001a"+
		"\u0000\u0000\u0a97\u0a94\u0001\u0000\u0000\u0000\u0a97\u0a95\u0001\u0000"+
		"\u0000\u0000\u0a97\u0a96\u0001\u0000\u0000\u0000\u0a98\u016d\u0001\u0000"+
		"\u0000\u0000\u0a99\u0a9a\u0003\u0170\u00b8\u0000\u0a9a\u0a9b\u0005X\u0000"+
		"\u0000\u0a9b\u0a9d\u0001\u0000\u0000\u0000\u0a9c\u0a99\u0001\u0000\u0000"+
		"\u0000\u0a9d\u0aa0\u0001\u0000\u0000\u0000\u0a9e\u0a9c\u0001\u0000\u0000"+
		"\u0000\u0a9e\u0a9f\u0001\u0000\u0000\u0000\u0a9f\u0aa2\u0001\u0000\u0000"+
		"\u0000\u0aa0\u0a9e\u0001\u0000\u0000\u0000\u0aa1\u0aa3\u0003\u0170\u00b8"+
		"\u0000\u0aa2\u0aa1\u0001\u0000\u0000\u0000\u0aa2\u0aa3\u0001\u0000\u0000"+
		"\u0000\u0aa3\u016f\u0001\u0000\u0000\u0000\u0aa4\u0aa5\u0007\r\u0000\u0000"+
		"\u0aa5\u0171\u0001\u0000\u0000\u0000\u0aa6\u0aa8\u0005~\u0000\u0000\u0aa7"+
		"\u0aa6\u0001\u0000\u0000\u0000\u0aa7\u0aa8\u0001\u0000\u0000\u0000\u0aa8"+
		"\u0aa9\u0001\u0000\u0000\u0000\u0aa9\u0aae\u0003\u0174\u00ba\u0000\u0aaa"+
		"\u0aab\u0005~\u0000\u0000\u0aab\u0aad\u0003\u0174\u00ba\u0000\u0aac\u0aaa"+
		"\u0001\u0000\u0000\u0000\u0aad\u0ab0\u0001\u0000\u0000\u0000\u0aae\u0aac"+
		"\u0001\u0000\u0000\u0000\u0aae\u0aaf\u0001\u0000\u0000\u0000\u0aaf\u0173"+
		"\u0001\u0000\u0000\u0000\u0ab0\u0aae\u0001\u0000\u0000\u0000\u0ab1\u0ab8"+
		"\u0003\u019c\u00ce\u0000\u0ab2\u0ab8\u0005\u001d\u0000\u0000\u0ab3\u0ab8"+
		"\u0005\u0018\u0000\u0000\u0ab4\u0ab8\u0005\u0005\u0000\u0000\u0ab5\u0ab8"+
		"\u0005=\u0000\u0000\u0ab6\u0ab8\u00057\u0000\u0000\u0ab7\u0ab1\u0001\u0000"+
		"\u0000\u0000\u0ab7\u0ab2\u0001\u0000\u0000\u0000\u0ab7\u0ab3\u0001\u0000"+
		"\u0000\u0000\u0ab7\u0ab4\u0001\u0000\u0000\u0000\u0ab7\u0ab5\u0001\u0000"+
		"\u0000\u0000\u0ab7\u0ab6\u0001\u0000\u0000\u0000\u0ab8\u0175\u0001\u0000"+
		"\u0000\u0000\u0ab9\u0abb\u0005~\u0000\u0000\u0aba\u0ab9\u0001\u0000\u0000"+
		"\u0000\u0aba\u0abb\u0001\u0000\u0000\u0000\u0abb\u0abc\u0001\u0000\u0000"+
		"\u0000\u0abc\u0ac1\u0003\u0178\u00bc\u0000\u0abd\u0abe\u0005~\u0000\u0000"+
		"\u0abe\u0ac0\u0003\u0178\u00bc\u0000\u0abf\u0abd\u0001\u0000\u0000\u0000"+
		"\u0ac0\u0ac3\u0001\u0000\u0000\u0000\u0ac1\u0abf\u0001\u0000\u0000\u0000"+
		"\u0ac1\u0ac2\u0001\u0000\u0000\u0000\u0ac2\u0177\u0001\u0000\u0000\u0000"+
		"\u0ac3\u0ac1\u0001\u0000\u0000\u0000\u0ac4\u0ac7\u0003\u017a\u00bd\u0000"+
		"\u0ac5\u0ac6\u0005~\u0000\u0000\u0ac6\u0ac8\u0003\u017c\u00be\u0000\u0ac7"+
		"\u0ac5\u0001\u0000\u0000\u0000\u0ac7\u0ac8\u0001\u0000\u0000\u0000\u0ac8"+
		"\u0179\u0001\u0000\u0000\u0000\u0ac9\u0ad1\u0003\u019c\u00ce\u0000\u0aca"+
		"\u0ad1\u0005(\u0000\u0000\u0acb\u0ad1\u0005\u001d\u0000\u0000\u0acc\u0ad1"+
		"\u0005\u0018\u0000\u0000\u0acd\u0ad1\u0005\u001a\u0000\u0000\u0ace\u0ad1"+
		"\u0005\u0005\u0000\u0000\u0acf\u0ad1\u0005=\u0000\u0000\u0ad0\u0ac9\u0001"+
		"\u0000\u0000\u0000\u0ad0\u0aca\u0001\u0000\u0000\u0000\u0ad0\u0acb\u0001"+
		"\u0000\u0000\u0000\u0ad0\u0acc\u0001\u0000\u0000\u0000\u0ad0\u0acd\u0001"+
		"\u0000\u0000\u0000\u0ad0\u0ace\u0001\u0000\u0000\u0000\u0ad0\u0acf\u0001"+
		"\u0000\u0000\u0000\u0ad1\u017b\u0001\u0000\u0000\u0000\u0ad2\u0ad3\u0005"+
		"r\u0000\u0000\u0ad3\u0afe\u0005q\u0000\u0000\u0ad4\u0ad5\u0005r\u0000"+
		"\u0000\u0ad5\u0ad8\u0003\u0182\u00c1\u0000\u0ad6\u0ad7\u0005{\u0000\u0000"+
		"\u0ad7\u0ad9\u0003\u0184\u00c2\u0000\u0ad8\u0ad6\u0001\u0000\u0000\u0000"+
		"\u0ad8\u0ad9\u0001\u0000\u0000\u0000\u0ad9\u0adc\u0001\u0000\u0000\u0000"+
		"\u0ada\u0adb\u0005{\u0000\u0000\u0adb\u0add\u0003\u0186\u00c3\u0000\u0adc"+
		"\u0ada\u0001\u0000\u0000\u0000\u0adc\u0add\u0001\u0000\u0000\u0000\u0add"+
		"\u0adf\u0001\u0000\u0000\u0000\u0ade\u0ae0\u0005{\u0000\u0000\u0adf\u0ade"+
		"\u0001\u0000\u0000\u0000\u0adf\u0ae0\u0001\u0000\u0000\u0000\u0ae0\u0ae1"+
		"\u0001\u0000\u0000\u0000\u0ae1\u0ae2\u0005q\u0000\u0000\u0ae2\u0afe\u0001"+
		"\u0000\u0000\u0000\u0ae3\u0ae4\u0005r\u0000\u0000\u0ae4\u0ae7\u0003\u0184"+
		"\u00c2\u0000\u0ae5\u0ae6\u0005{\u0000\u0000\u0ae6\u0ae8\u0003\u0186\u00c3"+
		"\u0000\u0ae7\u0ae5\u0001\u0000\u0000\u0000\u0ae7\u0ae8\u0001\u0000\u0000"+
		"\u0000\u0ae8\u0aea\u0001\u0000\u0000\u0000\u0ae9\u0aeb\u0005{\u0000\u0000"+
		"\u0aea\u0ae9\u0001\u0000\u0000\u0000\u0aea\u0aeb\u0001\u0000\u0000\u0000"+
		"\u0aeb\u0aec\u0001\u0000\u0000\u0000\u0aec\u0aed\u0005q\u0000\u0000\u0aed"+
		"\u0afe\u0001\u0000\u0000\u0000\u0aee\u0af4\u0005r\u0000\u0000\u0aef\u0af0"+
		"\u0003\u017e\u00bf\u0000\u0af0\u0af1\u0005{\u0000\u0000\u0af1\u0af3\u0001"+
		"\u0000\u0000\u0000\u0af2\u0aef\u0001\u0000\u0000\u0000\u0af3\u0af6\u0001"+
		"\u0000\u0000\u0000\u0af4\u0af2\u0001\u0000\u0000\u0000\u0af4\u0af5\u0001"+
		"\u0000\u0000\u0000\u0af5\u0af7\u0001\u0000\u0000\u0000\u0af6\u0af4\u0001"+
		"\u0000\u0000\u0000\u0af7\u0af9\u0003\u017e\u00bf\u0000\u0af8\u0afa\u0005"+
		"{\u0000\u0000\u0af9\u0af8\u0001\u0000\u0000\u0000\u0af9\u0afa\u0001\u0000"+
		"\u0000\u0000\u0afa\u0afb\u0001\u0000\u0000\u0000\u0afb\u0afc\u0005q\u0000"+
		"\u0000\u0afc\u0afe\u0001\u0000\u0000\u0000\u0afd\u0ad2\u0001\u0000\u0000"+
		"\u0000\u0afd\u0ad4\u0001\u0000\u0000\u0000\u0afd\u0ae3\u0001\u0000\u0000"+
		"\u0000\u0afd\u0aee\u0001\u0000\u0000\u0000\u0afe\u017d\u0001\u0000\u0000"+
		"\u0000\u0aff\u0b05\u0003\u0170\u00b8\u0000\u0b00\u0b05\u0003\u0134\u009a"+
		"\u0000\u0b01\u0b05\u0003\u0180\u00c0\u0000\u0b02\u0b05\u0003\u0188\u00c4"+
		"\u0000\u0b03\u0b05\u0003\u018a\u00c5\u0000\u0b04\u0aff\u0001\u0000\u0000"+
		"\u0000\u0b04\u0b00\u0001\u0000\u0000\u0000\u0b04\u0b01\u0001\u0000\u0000"+
		"\u0000\u0b04\u0b02\u0001\u0000\u0000\u0000\u0b04\u0b03\u0001\u0000\u0000"+
		"\u0000\u0b05\u017f\u0001\u0000\u0000\u0000\u0b06\u0b0d\u0003\u00b2Y\u0000"+
		"\u0b07\u0b09\u0005Y\u0000\u0000\u0b08\u0b07\u0001\u0000\u0000\u0000\u0b08"+
		"\u0b09\u0001\u0000\u0000\u0000\u0b09\u0b0a\u0001\u0000\u0000\u0000\u0b0a"+
		"\u0b0d\u0003\u00aeW\u0000\u0b0b\u0b0d\u0003\u0174\u00ba\u0000\u0b0c\u0b06"+
		"\u0001\u0000\u0000\u0000\u0b0c\u0b08\u0001\u0000\u0000\u0000\u0b0c\u0b0b"+
		"\u0001\u0000\u0000\u0000\u0b0d\u0181\u0001\u0000\u0000\u0000\u0b0e\u0b13"+
		"\u0003\u0170\u00b8\u0000\u0b0f\u0b10\u0005{\u0000\u0000\u0b10\u0b12\u0003"+
		"\u0170\u00b8\u0000\u0b11\u0b0f\u0001\u0000\u0000\u0000\u0b12\u0b15\u0001"+
		"\u0000\u0000\u0000\u0b13\u0b11\u0001\u0000\u0000\u0000\u0b13\u0b14\u0001"+
		"\u0000\u0000\u0000\u0b14\u0183\u0001\u0000\u0000\u0000\u0b15\u0b13\u0001"+
		"\u0000\u0000\u0000\u0b16\u0b1b\u0003\u0134\u009a\u0000\u0b17\u0b18\u0005"+
		"{\u0000\u0000\u0b18\u0b1a\u0003\u0134\u009a\u0000\u0b19\u0b17\u0001\u0000"+
		"\u0000\u0000\u0b1a\u0b1d\u0001\u0000\u0000\u0000\u0b1b\u0b19\u0001\u0000"+
		"\u0000\u0000\u0b1b\u0b1c\u0001\u0000\u0000\u0000\u0b1c\u0185\u0001\u0000"+
		"\u0000\u0000\u0b1d\u0b1b\u0001\u0000\u0000\u0000\u0b1e\u0b23\u0003\u0188"+
		"\u00c4\u0000\u0b1f\u0b20\u0005{\u0000\u0000\u0b20\u0b22\u0003\u0188\u00c4"+
		"\u0000\u0b21\u0b1f\u0001\u0000\u0000\u0000\u0b22\u0b25\u0001\u0000\u0000"+
		"\u0000\u0b23\u0b21\u0001\u0000\u0000\u0000\u0b23\u0b24\u0001\u0000\u0000"+
		"\u0000\u0b24\u0187\u0001\u0000\u0000\u0000\u0b25\u0b23\u0001\u0000\u0000"+
		"\u0000\u0b26\u0b28\u0003\u019c\u00ce\u0000\u0b27\u0b29\u0005~\u0000\u0000"+
		"\u0b28\u0b27\u0001\u0000\u0000\u0000\u0b28\u0b29\u0001\u0000\u0000\u0000"+
		"\u0b29\u0b2c\u0001\u0000\u0000\u0000\u0b2a\u0b2d\u0003\u017c\u00be\u0000"+
		"\u0b2b\u0b2d\u0003\u0196\u00cb\u0000\u0b2c\u0b2a\u0001\u0000\u0000\u0000"+
		"\u0b2c\u0b2b\u0001\u0000\u0000\u0000\u0b2c\u0b2d\u0001\u0000\u0000\u0000"+
		"\u0b2d\u0b2e\u0001\u0000\u0000\u0000\u0b2e\u0b31\u0005n\u0000\u0000\u0b2f"+
		"\u0b32\u0003\u0134\u009a\u0000\u0b30\u0b32\u0003\u00a2Q\u0000\u0b31\u0b2f"+
		"\u0001\u0000\u0000\u0000\u0b31\u0b30\u0001\u0000\u0000\u0000\u0b32\u0189"+
		"\u0001\u0000\u0000\u0000\u0b33\u0b35\u0003\u019c\u00ce\u0000\u0b34\u0b36"+
		"\u0005~\u0000\u0000\u0b35\u0b34\u0001\u0000\u0000\u0000\u0b35\u0b36\u0001"+
		"\u0000\u0000\u0000\u0b36\u0b39\u0001\u0000\u0000\u0000\u0b37\u0b3a\u0003"+
		"\u017c\u00be\u0000\u0b38\u0b3a\u0003\u0196\u00cb\u0000\u0b39\u0b37\u0001"+
		"\u0000\u0000\u0000\u0b39\u0b38\u0001\u0000\u0000\u0000\u0b39\u0b3a\u0001"+
		"\u0000\u0000\u0000\u0b3a\u0b3b\u0001\u0000\u0000\u0000\u0b3b\u0b3c\u0005"+
		"}\u0000\u0000\u0b3c\u0b3d\u0003\u0160\u00b0\u0000\u0b3d\u018b\u0001\u0000"+
		"\u0000\u0000\u0b3e\u0b41\u0003\u018e\u00c7\u0000\u0b3f\u0b40\u0005~\u0000"+
		"\u0000\u0b40\u0b42\u0003\u0178\u00bc\u0000\u0b41\u0b3f\u0001\u0000\u0000"+
		"\u0000\u0b42\u0b43\u0001\u0000\u0000\u0000\u0b43\u0b41\u0001\u0000\u0000"+
		"\u0000\u0b43\u0b44\u0001\u0000\u0000\u0000\u0b44\u018d\u0001\u0000\u0000"+
		"\u0000\u0b45\u0b46\u0005r\u0000\u0000\u0b46\u0b49\u0003\u0134\u009a\u0000"+
		"\u0b47\u0b48\u0005\u0001\u0000\u0000\u0b48\u0b4a\u0003\u0192\u00c9\u0000"+
		"\u0b49\u0b47\u0001\u0000\u0000\u0000\u0b49\u0b4a\u0001\u0000\u0000\u0000"+
		"\u0b4a\u0b4b\u0001\u0000\u0000\u0000\u0b4b\u0b4c\u0005q\u0000\u0000\u0b4c"+
		"\u018f\u0001\u0000\u0000\u0000\u0b4d\u0b50\u0003\u018e\u00c7\u0000\u0b4e"+
		"\u0b4f\u0005~\u0000\u0000\u0b4f\u0b51\u0003\u0194\u00ca\u0000\u0b50\u0b4e"+
		"\u0001\u0000\u0000\u0000\u0b51\u0b52\u0001\u0000\u0000\u0000\u0b52\u0b50"+
		"\u0001\u0000\u0000\u0000\u0b52\u0b53\u0001\u0000\u0000\u0000\u0b53\u0191"+
		"\u0001\u0000\u0000\u0000\u0b54\u0b56\u0005~\u0000\u0000\u0b55\u0b54\u0001"+
		"\u0000\u0000\u0000\u0b55\u0b56\u0001\u0000\u0000\u0000\u0b56\u0b57\u0001"+
		"\u0000\u0000\u0000\u0b57\u0b5c\u0003\u0194\u00ca\u0000\u0b58\u0b59\u0005"+
		"~\u0000\u0000\u0b59\u0b5b\u0003\u0194\u00ca\u0000\u0b5a\u0b58\u0001\u0000"+
		"\u0000\u0000\u0b5b\u0b5e\u0001\u0000\u0000\u0000\u0b5c\u0b5a\u0001\u0000"+
		"\u0000\u0000\u0b5c\u0b5d\u0001\u0000\u0000\u0000\u0b5d\u0193\u0001\u0000"+
		"\u0000\u0000\u0b5e\u0b5c\u0001\u0000\u0000\u0000\u0b5f\u0b61\u0003\u017a"+
		"\u00bd\u0000\u0b60\u0b62\u0005~\u0000\u0000\u0b61\u0b60\u0001\u0000\u0000"+
		"\u0000\u0b61\u0b62\u0001\u0000\u0000\u0000\u0b62\u0b65\u0001\u0000\u0000"+
		"\u0000\u0b63\u0b66\u0003\u017c\u00be\u0000\u0b64\u0b66\u0003\u0196\u00cb"+
		"\u0000\u0b65\u0b63\u0001\u0000\u0000\u0000\u0b65\u0b64\u0001\u0000\u0000"+
		"\u0000\u0b65\u0b66\u0001\u0000\u0000\u0000\u0b66\u0195\u0001\u0000\u0000"+
		"\u0000\u0b67\u0b6a\u0005\u0088\u0000\u0000\u0b68\u0b6b\u0003\u0198\u00cc"+
		"\u0000\u0b69\u0b6b\u0005x\u0000\u0000\u0b6a\u0b68\u0001\u0000\u0000\u0000"+
		"\u0b6a\u0b69\u0001\u0000\u0000\u0000\u0b6a\u0b6b\u0001\u0000\u0000\u0000"+
		"\u0b6b\u0b6c\u0001\u0000\u0000\u0000\u0b6c\u0b6f\u0005\u0089\u0000\u0000"+
		"\u0b6d\u0b6e\u0005\u007f\u0000\u0000\u0b6e\u0b70\u0003\u0134\u009a\u0000"+
		"\u0b6f\u0b6d\u0001\u0000\u0000\u0000\u0b6f\u0b70\u0001\u0000\u0000\u0000"+
		"\u0b70\u0197\u0001\u0000\u0000\u0000\u0b71\u0b76\u0003\u0134\u009a\u0000"+
		"\u0b72\u0b73\u0005{\u0000\u0000\u0b73\u0b75\u0003\u0134\u009a\u0000\u0b74"+
		"\u0b72\u0001\u0000\u0000\u0000\u0b75\u0b78\u0001\u0000\u0000\u0000\u0b76"+
		"\u0b74\u0001\u0000\u0000\u0000\u0b76\u0b77\u0001\u0000\u0000\u0000\u0b77"+
		"\u0b7a\u0001\u0000\u0000\u0000\u0b78\u0b76\u0001\u0000\u0000\u0000\u0b79"+
		"\u0b7b\u0005{\u0000\u0000\u0b7a\u0b79\u0001\u0000\u0000\u0000\u0b7a\u0b7b"+
		"\u0001\u0000\u0000\u0000\u0b7b\u0199\u0001\u0000\u0000\u0000\u0b7c\u0b86"+
		"\u0005\u0015\u0000\u0000\u0b7d\u0b83\u0005\u0088\u0000\u0000\u0b7e\u0b84"+
		"\u0005\u0005\u0000\u0000\u0b7f\u0b84\u0005\u0018\u0000\u0000\u0b80\u0b84"+
		"\u0005\u001d\u0000\u0000\u0b81\u0b82\u0005\u000e\u0000\u0000\u0b82\u0b84"+
		"\u0003\u0172\u00b9\u0000\u0b83\u0b7e\u0001\u0000\u0000\u0000\u0b83\u0b7f"+
		"\u0001\u0000\u0000\u0000\u0b83\u0b80\u0001\u0000\u0000\u0000\u0b83\u0b81"+
		"\u0001\u0000\u0000\u0000\u0b84\u0b85\u0001\u0000\u0000\u0000\u0b85\u0b87"+
		"\u0005\u0089\u0000\u0000\u0b86\u0b7d\u0001\u0000\u0000\u0000\u0b86\u0b87"+
		"\u0001\u0000\u0000\u0000\u0b87\u019b\u0001\u0000\u0000\u0000\u0b88\u0b89"+
		"\u0007\u000e\u0000\u0000\u0b89\u019d\u0001\u0000\u0000\u0000\u0b8a\u0b8b"+
		"\u0007\u000f\u0000\u0000\u0b8b\u019f\u0001\u0000\u0000\u0000\u0b8c\u0b8d"+
		"\u0007\u0010\u0000\u0000\u0b8d\u01a1\u0001\u0000\u0000\u0000\u0b8e\u0b94"+
		"\u0003\u019e\u00cf\u0000\u0b8f\u0b94\u0003\u019c\u00ce\u0000\u0b90\u0b94"+
		"\u0005<\u0000\u0000\u0b91\u0b94\u0005=\u0000\u0000\u0b92\u0b94\u0005W"+
		"\u0000\u0000\u0b93\u0b8e\u0001\u0000\u0000\u0000\u0b93\u0b8f\u0001\u0000"+
		"\u0000\u0000\u0b93\u0b90\u0001\u0000\u0000\u0000\u0b93\u0b91\u0001\u0000"+
		"\u0000\u0000\u0b93\u0b92\u0001\u0000\u0000\u0000\u0b94\u01a3\u0001\u0000"+
		"\u0000\u0000\u0b95\u0b96\u0003\u00aeW\u0000\u0b96\u01a5\u0001\u0000\u0000"+
		"\u0000\u0b97\u0b98\u0007\u0011\u0000\u0000\u0b98\u01a7\u0001\u0000\u0000"+
		"\u0000\u0b99\u0b9a\u0005r\u0000\u0000\u0b9a\u0b9b\u0004\u00d4\u0019\u0000"+
		"\u0b9b\u0b9c\u0005r\u0000\u0000\u0b9c\u01a9\u0001\u0000\u0000\u0000\u0b9d"+
		"\u0b9e\u0005q\u0000\u0000\u0b9e\u0b9f\u0004\u00d5\u001a\u0000\u0b9f\u0ba0"+
		"\u0005q\u0000\u0000\u0ba0\u01ab\u0001\u0000\u0000\u0000\u01b8\u01af\u01b5"+
		"\u01bd\u01c5\u01cd\u01d5\u01d9\u01de\u01e1\u01e8\u01ed\u01f3\u01fc\u0202"+
		"\u020b\u0211\u0216\u021e\u0226\u022a\u0230\u0241\u0244\u024b\u024f\u0259"+
		"\u0261\u0269\u026d\u0272\u0279\u0282\u0286\u028a\u0290\u0298\u02a1\u02a6"+
		"\u02a9\u02b8\u02bd\u02c0\u02c9\u02cf\u02d3\u02d9\u02df\u02e4\u02eb\u02ee"+
		"\u02f7\u02fb\u02fd\u0300\u0306\u0308\u030a\u0310\u0314\u0318\u031b\u031f"+
		"\u0322\u0325\u0328\u032b\u032e\u0332\u0334\u033a\u033f\u0346\u034a\u034c"+
		"\u0351\u0356\u035a\u035c\u035f\u0364\u036d\u0373\u0379\u037f\u0384\u0388"+
		"\u038a\u038d\u0392\u0394\u039a\u039f\u03a2\u03a6\u03aa\u03af\u03b3\u03b7"+
		"\u03c0\u03c4\u03c9\u03cd\u03d0\u03d7\u03de\u03e2\u03e7\u03eb\u03f2\u03f5"+
		"\u03f9\u0402\u0406\u040b\u040f\u0414\u0417\u041b\u0421\u042c\u042f\u0433"+
		"\u0438\u043d\u0440\u0446\u0449\u044e\u0452\u0459\u045e\u0461\u0466\u046a"+
		"\u046c\u046f\u0475\u047b\u0481\u0484\u0489\u048d\u048f\u0493\u0496\u049a"+
		"\u049e\u04a6\u04aa\u04ad\u04b1\u04b7\u04bd\u04c8\u04cc\u04cf\u04d2\u04d8"+
		"\u04de\u04e4\u04ea\u04ee\u04f4\u04fa\u0502\u0507\u050c\u050e\u051a\u051f"+
		"\u0521\u0528\u052e\u0531\u0536\u0539\u053e\u0540\u0544\u054c\u0556\u055b"+
		"\u0560\u0567\u056c\u056f\u057b\u0580\u0585\u0587\u0596\u059c\u05a0\u05a5"+
		"\u05ac\u05b1\u05bb\u05c1\u05c3\u05cc\u05ce\u05d4\u05dc\u05e9\u05f6\u05f9"+
		"\u05fd\u0600\u0604\u060b\u060f\u0615\u061f\u0623\u062a\u062e\u0637\u0642"+
		"\u066d\u0671\u0679\u0682\u068d\u069d\u069f\u06a1\u06ab\u06ba\u06be\u06c5"+
		"\u06cb\u06cf\u06d3\u06d7\u06db\u06df\u06e3\u06e7\u06eb\u06f0\u06f4\u06f8"+
		"\u06fe\u0702\u0709\u070c\u070f\u0713\u0725\u0729\u072f\u0736\u0739\u0740"+
		"\u0744\u074a\u074f\u0758\u075e\u0760\u0765\u076b\u0770\u0774\u077b\u0783"+
		"\u0787\u0789\u0792\u0797\u07a0\u07a4\u07a9\u07ae\u07b7\u07bb\u07bd\u07c8"+
		"\u07cc\u07cf\u07d2\u07d5\u07d8\u07db\u07e0\u07e3\u07ea\u07f1\u07f5\u07fa"+
		"\u0800\u0803\u0809\u080e\u0830\u0832\u083e\u0840\u084d\u0851\u085b\u0862"+
		"\u0869\u086b\u0870\u0875\u087b\u0882\u0887\u088e\u089e\u08ac\u08b0\u08b3"+
		"\u08b8\u08be\u08d7\u08dc\u08e0\u08e5\u08e9\u08ef\u08f3\u08fa\u08fc\u08ff"+
		"\u0906\u090c\u0918\u091b\u091f\u0924\u092b\u092f\u0938\u093c\u0940\u094d"+
		"\u0950\u0952\u095a\u0963\u0967\u096b\u0977\u097d\u0991\u099f\u09a2\u09a4"+
		"\u09b4\u09b7\u09ba\u09c3\u09c9\u09cd\u09d0\u09d4\u09d6\u09dd\u09e4\u09e8"+
		"\u09ed\u09f2\u09f5\u09f9\u0a00\u0a08\u0a10\u0a14\u0a17\u0a1a\u0a1d\u0a23"+
		"\u0a29\u0a2e\u0a31\u0a34\u0a37\u0a3c\u0a41\u0a4a\u0a4e\u0a55\u0a5b\u0a5e"+
		"\u0a61\u0a65\u0a68\u0a6d\u0a70\u0a74\u0a77\u0a7c\u0a89\u0a8e\u0a92\u0a97"+
		"\u0a9e\u0aa2\u0aa7\u0aae\u0ab7\u0aba\u0ac1\u0ac7\u0ad0\u0ad8\u0adc\u0adf"+
		"\u0ae7\u0aea\u0af4\u0af9\u0afd\u0b04\u0b08\u0b0c\u0b13\u0b1b\u0b23\u0b28"+
		"\u0b2c\u0b31\u0b35\u0b39\u0b43\u0b49\u0b52\u0b55\u0b5c\u0b61\u0b65\u0b6a"+
		"\u0b6f\u0b76\u0b7a\u0b83\u0b86\u0b93";
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