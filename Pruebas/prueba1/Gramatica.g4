grammar Gramatica;

// tokens

INT     : [0-9]+ ;
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
STRING  : '"' (~["\r\n] | '""')* '"' ;
WS      : [ \n\t]+ -> skip ;
// rules
prule: 'HOLI' (ID | INT)*;

segundo: ;