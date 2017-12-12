# Cobra
A language prototype for manipulate text and xml files
# Sample
use folder "e:\*\Desktop"
	sub folder "c:\Users\*\eclipse-workspace" excludes ".*\.metadata", ".*org.example.*", ".*.recommenders", ".*\.[a-z]+"
	file "*.java", "*2nd*.pdf" excludes "CSV*", "Array*"
{
	
}
File selector with filters:
Search on folder for example e:\Users\ruddin\Desktop or every else that match like e:\Users\dylan\Desktop
search on sub folder of c:\Users\*\eclipse-workspace (same criteria as previous) excluding all regex expression from the path,
match only file ending for .java and .pdf that contain 2nd in the filename. Exclude files that start with "CSV" or "Array".
