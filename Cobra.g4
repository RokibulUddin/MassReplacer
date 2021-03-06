grammar Cobra;

@header {
package riki.cobra.language;
}

cobra: stat+;

stat: use '{' instructions* '}'
	| assignment
	| backup
	;
	
backup: 'backup' 'on' string #backupon
	;

use: 'use' (folder|file)+ #useStat
	;
	
folder: 'folder' atomic (',' atomic)* #folders
	| 'sub' folder excludes?	#subFolder
	;

excludes: 'exclude' atomic (',' atomic)* ;

file: 'file' atomic (',' atomic)* excludes?
	;
	
instructions: assignment 
	|	replace
	|	replacefrom
	| 	cmd
	;

// Single commands
cmd: 'exit' #exit
	;

replace: 'replace' tofind ',' replacewith ;
replacefrom: 'replace' 'from' from=atomic 'to' to=atomic 'with' replacewith;

assignment: ID '=' atomic;

array: '[' atomic+ (',' atomic)* ']' ;

atomic: string
	| array
	| ID
	;
	
tofind: atomic (',' atomic)*;
replacewith: atomic;

string : STRING;

STRING: '"' (~[\r\n"] | '\\"')* '"' {setText(getText().substring(1, getText().length()-1));};
ID:	'$'[A-Z_]+  {setText(getText().substring(1, getText().length()));};
WS: [ \t\r\n] -> skip;
COMMENT: '#' ~[\r?\n]* -> skip ;