/*
Copyright (c) 2010 The Rust Project Developers
Copyright (c) 2020-2022 Student Main

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice (including the next paragraph) shall be included in all copies or
substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

// $antlr-format alignTrailingComments true, columnLimit 150, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine true, allowShortBlocksOnASingleLine true, minEmptyLines 0, alignSemicolons ownLine
// $antlr-format alignColons trailing, singleLineOverrulesHangingColon true, alignLexerCommands true, alignLabels true, alignTrailers true

lexer grammar RustLexer;

// Insert here @header for C++ lexer.

options
{
    superClass = RustLexerBase;
}

// https://doc.rust-lang.org/reference/keywords.html strict
KW_AS        : 'as';
KW_BREAK     : 'break';
KW_CONST     : 'const';
KW_CONTINUE  : 'continue';
KW_CRATE     : 'crate';
KW_ELSE      : 'else';
KW_ENUM      : 'enum';
KW_EXTERN    : 'extern';
KW_FALSE     : 'false';
KW_FN        : 'fn';
KW_FOR       : 'for';
KW_IF        : 'if';
KW_IMPL      : 'impl';
KW_IN        : 'in';
KW_LET       : 'let';
KW_LOOP      : 'loop';
KW_MATCH     : 'match';
KW_MOD       : 'mod';
KW_MOVE      : 'move';
KW_MUT       : 'mut';
KW_PUB       : 'pub';
KW_REF       : 'ref';
KW_RETURN    : 'return';
KW_SELFVALUE : 'self';
KW_PIN       : 'pin';
KW_SELFTYPE  : 'Self';
KW_STATIC    : 'static';
KW_STRUCT    : 'struct';
KW_SUPER     : 'super';
KW_TRAIT     : 'trait';
KW_TRUE      : 'true';
KW_TYPE      : 'type';
KW_UNSAFE    : 'unsafe';
KW_SAFE      : 'safe';
KW_USE       : 'use';
KW_REUSE     : 'reuse';
KW_WHERE     : 'where';
KW_WHILE     : 'while';

// Internal contracts-machinery syntax (gated by contracts_internals)
KW_CONTRACT_REQUIRES : 'contract_requires';
KW_CONTRACT_ENSURES : 'contract_ensures';

// 2018+
KW_ASYNC : 'async';
KW_AWAIT : 'await';
KW_DYN   : 'dyn';
KW_AUTO  : 'auto';

// reserved
KW_ABSTRACT : 'abstract';
KW_BECOME   : 'become';
KW_BOX      : 'box';
KW_DO       : 'do';
KW_YEET     : 'yeet';
KW_FINAL    : 'final';
KW_MACRO    : 'macro';
KW_OVERRIDE : 'override';
KW_PRIV     : 'priv';
KW_TYPEOF   : 'typeof';
KW_UNSIZED  : 'unsized';
KW_VIRTUAL  : 'virtual';
KW_YIELD    : 'yield';

// reserved 2018+
KW_TRY: 'try';

// weak
KW_UNION          : 'union';
KW_STATICLIFETIME : '\'static';
KW_RAW            : 'raw';
KW_DEFAULT        : 'default';

KW_MACRORULES        : 'macro_rules';
KW_DOLLARCRATE       : '$crate';
KW_GEN       : 'gen';  

// — closure‐trait names for impl async Fn/FnMut/FnOnce
CLOSURE_FN       : 'Fn' ;
CLOSURE_FNMUT    : 'FnMut' ;
CLOSURE_FNONCE   : 'FnOnce' ;

// rule itself allow any identifier, but keyword has been matched before
NON_KEYWORD_IDENTIFIER: XID_Start XID_Continue* | '_' XID_Continue+;

// [\p{L}\p{Nl}\p{Other_ID_Start}-\p{Pattern_Syntax}-\p{Pattern_White_Space}]
fragment XID_Start: [\p{L}\p{Nl}\p{So}] | UNICODE_OIDS;

// [\p{ID_Start}\p{Mn}\p{Mc}\p{Nd}\p{Pc}\p{Other_ID_Continue}-\p{Pattern_Syntax}-\p{Pattern_White_Space}]
fragment XID_Continue: XID_Start | [\p{Mn}\p{Mc}\p{Nd}\p{Pc}] | UNICODE_OIDC;

fragment UNICODE_OIDS: '\u1885' ..'\u1886' | '\u2118' | '\u212e' | '\u309b' ..'\u309c';

fragment UNICODE_OIDC: '\u00b7' | '\u0387' | '\u1369' ..'\u1371' | '\u19da';

RAW_IDENTIFIER: 'r#' NON_KEYWORD_IDENTIFIER;
// comments https://doc.rust-lang.org/reference/comments.html

// Line (y doc-line) comments: todo hasta fin de línea, oculto
LINE_COMMENT  : '//' ~[\n]*                  -> channel(HIDDEN);

// Block comments (anidados), desde /* hasta el próximo */, oculto
BLOCK_COMMENT : '/*' ( BLOCK_COMMENT | . )*? '*/' -> channel(HIDDEN);


SHEBANG
    :   {this.SOF()}? '\uFEFF'? '#!' {notNext2('[')}? ~[\r\n]* -> channel(HIDDEN)
    ;


//ISOLATED_CR
// : '\r' {_input.LA(1)!='\n'}// not followed with \n ;

// whitespace https://doc.rust-lang.org/reference/whitespace.html
WHITESPACE : [\p{Zs}\t\u000B\u000C\u0085\u200E\u200F\u2028\u2029] -> channel(HIDDEN);
// Skip a UTF-8 Byte Order Mark at the start of the file
BOM : '\uFEFF' -> channel(HIDDEN);
NEWLINE    : ('\r\n' | [\r\n]) -> channel(HIDDEN);

// tokens char and string
CHAR_LITERAL: '\'' ( ~['\\\n\r\t] | QUOTE_ESCAPE | ASCII_ESCAPE | UNICODE_ESCAPE) '\'';

STRING_LITERAL
    : '"' ( ESC_NEWLINE | QUOTE_ESCAPE | ASCII_ESCAPE | UNICODE_ESCAPE | ~["\\] )* '"'
    ;

// ──────────────── Raw string literals (Rust-style, any # count) ────────────────
fragment RAW_CHAR
    : ~[\u0000]                           // any Unicode scalar except NUL (allow CR)
    ;

fragment RAW_STRING_BODY
    : '"'  RAW_CHAR*? '"'                // base case: r"…"
    | '#' RAW_STRING_BODY '#'            // recursive: add one hash pair
    ;

RAW_STRING_LITERAL
    : 'r' RAW_STRING_BODY
    ;

// keep HASHES if other rules still use it
fragment HASHES
    : '#' HASHES?
    ;

BYTE_LITERAL: 'b\'' (. | QUOTE_ESCAPE | BYTE_ESCAPE) '\'';

BYTE_STRING_LITERAL
    : 'b"' ( ESC_NEWLINE       // allow backslash  line-continuation
           | QUOTE_ESCAPE      // existing escape rules
           | BYTE_ESCAPE
           | ~["\\]
           )* '"'
    ;

// Raw byte string: br#"…"#, br##"… "##, etc.
RAW_BYTE_STRING_LITERAL
    : 'br' RAW_STRING_BODY
    ;

fragment ASCII_ESCAPE: '\\x' OCT_DIGIT HEX_DIGIT | COMMON_ESCAPE;

fragment BYTE_ESCAPE: '\\x' HEX_DIGIT HEX_DIGIT | COMMON_ESCAPE;

fragment COMMON_ESCAPE: '\\' [nrt\\0];

fragment UNICODE_ESCAPE:
    '\\u{' ( HEX_DIGIT | '_' )+ '}'
;

fragment QUOTE_ESCAPE: '\\' ['"];

// Allow backslash  CRLF *or* LF as a line-continuation
fragment ESC_NEWLINE
    : '\\' ('\r'? '\n')
    ;

C_STRING_LITERAL
    : 'c"'
      (C_STRING_CHAR)*
      '"'
      C_STRING_SUFFIX?
    ;

/** Inside a fragment rule, no semantic actions! Just a raw pattern. */
fragment C_STRING_CHAR
    : ~["\\\u0000\u000D] // anything but " \ NUL CR
    | C_STRING_ESCAPE
    | C_STRING_CONTINUATION
    ;

fragment C_STRING_ESCAPE
    : '\\'
      (
        [nrt\\"]
        | 'x' [0-9a-fA-F] [0-9a-fA-F] // (No actions in a fragment!)
        | 'u' '{' [0-9a-fA-F]{1,6} '}'
      )
    ;

/** Example 'line continuation' approach
 *  to skip or absorb whitespace, you can customize. 
 */
fragment C_STRING_CONTINUATION
    : '\\'
      [^\r\n]*?      // anything except CR or LF, non-greedy
      [\r]? '\n'
      [^\r\n]*?
    ;

/** Suffix, if your language allows c"foo"someSuffix */
fragment C_STRING_SUFFIX
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

RAW_C_STRING_LITERAL
    : 'cr'
      RAW_C_STRING_HASHES? 
      '"'
      RAW_C_STRING_BODY? 
      '"'
      RAW_C_STRING_HASHES? 
      C_STRING_SUFFIX?
    ;

/** No actions in a fragment rule! Just define the pattern. */
fragment RAW_C_STRING_HASHES
    : '#'*
    ;

/** A basic placeholder—real logic can be more advanced if you want to 
 *  precisely ensure the same number of '#' are matched at the end, etc.
 */
fragment RAW_C_STRING_BODY
    : ~[\u0000\u000D"]*?
    ;

// number

INTEGER_LITERAL: ( DEC_LITERAL | BIN_LITERAL | OCT_LITERAL | HEX_LITERAL) INTEGER_SUFFIX?;

DEC_LITERAL: DEC_DIGIT (DEC_DIGIT | '_')*;

HEX_LITERAL: '0x' '_'* HEX_DIGIT (HEX_DIGIT | '_')*;

OCT_LITERAL: '0o' '_'* OCT_DIGIT (OCT_DIGIT | '_')*;

BIN_LITERAL: '0b' '_'* [01] [01_]*;

FLOAT_LITERAL:
                        {this.floatLiteralPossible()}? (
        DEC_LITERAL '.' {this.floatDotPossible()}?
        | DEC_LITERAL ( '.' DEC_LITERAL)? FLOAT_EXPONENT? FLOAT_SUFFIX?
    )
;

fragment INTEGER_SUFFIX:
    'u8'
    | 'u16'
    | 'u32'
    | 'u64'
    | 'u128'
    | 'usize'
    | 'i8'
    | 'i16'
    | 'i32'
    | 'i64'
    | 'i128'
    | 'isize'
;

fragment FLOAT_SUFFIX
    : '_'? ( 'f16' | 'f32' | 'f64' | 'f128' )
    ;

fragment FLOAT_EXPONENT: [eE] [+-]? '_'* DEC_LITERAL;

fragment OCT_DIGIT: [0-7];

fragment DEC_DIGIT: [0-9];

fragment HEX_DIGIT: [0-9a-fA-F];

// LIFETIME_TOKEN: '\'' IDENTIFIER_OR_KEYWORD | '\'_';

LIFETIME_OR_LABEL
    // apostrophe  (Rust identifier, raw identifier, or underscore elided lifetime)
    : '\'' ( RAW_IDENTIFIER
            | NON_KEYWORD_IDENTIFIER
            | '_'           // allow the elided/inferred lifetime `'_`
            )
    ;

PLUS    : '+';
MINUS   : '-';
STAR    : '*';
SLASH   : '/';
PERCENT : '%';
CARET   : '^';
NOT     : '!';
TILDE   : '~';
AND     : '&';
OR      : '|';
ANDAND  : '&&';
//OROR    : '||';
//SHL: '<<'; SHR: '>>'; removed to avoid confusion in type parameter
//PLUSEQ     : '+=';
MINUSEQ    : '-=';
STAREQ     : '*=';
SLASHEQ    : '/=';
PERCENTEQ  : '%=';
CARETEQ    : '^=';
ANDEQ      : '&=';
OREQ       : '|=';
SHLEQ      : '<<=';
//SHREQ      : '>>=';
EQ         : '=';
EQEQ       : '==';
NE         : '!=';
GT         : '>';
LT         : '<';
//GE         : '>=';
LE         : '<=';
AT         : '@';
UNDERSCORE : '_';
DOT        : '.';
DOTDOT     : '..';
DOTDOTDOT  : '...';
DOTDOTEQ   : '..=';
COMMA      : ',';
SEMI       : ';';
COLON      : ':';
PATHSEP    : '::';
RARROW     : '->';
FATARROW   : '=>';
POUND      : '#';
DOLLAR     : '$';
QUESTION   : '?';

LCURLYBRACE    : '{';
RCURLYBRACE    : '}';
LSQUAREBRACKET : '[';
RSQUAREBRACKET : ']';
LPAREN         : '(';
RPAREN         : ')';


