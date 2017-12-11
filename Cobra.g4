grammar Cobra;

@header {
package riki.cobra.language;
}

cobra: stat+;

stat: use '{' '}'
	;
	
use: 'use' (folder|file)+ #useStat
	;
	
folder: 'folder' STRING (',' STRING)* #folders
	| 'sub' folder excludes?	#subFolder
	;

excludes: 'excludes' STRING (',' STRING)* ;

file: 'file' STRING (',' STRING)* excludes?
	;

STRING: '"' .*? '"' {setText(getText().substring(1, getText().length()-1));}; 
WS: [ \t\r\n] -> skip;