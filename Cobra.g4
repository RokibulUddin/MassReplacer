grammar Cobra;

@header {
package riki.cobra.language;
}

cobra: stat+;

stat: use '{' '}'
	;
	
use: 'use' (folder|file)+ #useStat
	;
	
folder: 'folder' STRING (',' STRING)*
	| 'sub' folder
	;

file: 'file' STRING (',' STRING)*
	;

STRING: '"' .*? '"' {setText(getText().substring(1, getText().length()-1));}; 
WS: [ \t\r\n] -> skip;