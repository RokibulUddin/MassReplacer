# Cobra
A language prototype for manipulate text and xml files
# Sample

```
$USER_FOLDER = "c:\Users"
use folder "e:\*\Desktop"
	sub folder "<$USER_FOLDER>\*\eclipse-workspace" exclude ".*\.metadata", ".*org.example.*", ".*.recommenders", ".*\.[a-z]+"
	file "*.java", "*2nd*.txt" exclude "CSV*", "Array*"
{
	replace "({H}\d\d):(\d\d):(\d\d)", "Hour=${H}, Minute=$2, Sec=$3"
	replace "monkey", "animal"
	replace "banana", "orange", ""
}
```
File selector with filters:
Search on folder for example e:\Users\ruddin\Desktop or every else that match like e:\Users\dylan\Desktop
search on sub folder of c:\Users\*\eclipse-workspace (same criteria as previous) excluding all regex expression from the path,
match only file ending for .java and .txt that contain 2nd in the filename. Exclude files that start with "CSV" or "Array".

Then replace pattern in each files.

Variables: Only uppercase chars and _ allowed. To include variable into string use <$VAR_NAME>. Outside string just use $VAR_NAME.
Replace: Replace for example "11:12:30" with "Hour=11, Minute=12, Sec=30". ${Name} refer to group name and $Number refer to group index.
Then replace "monkey" with "animal" and in the end replace all occurence of "banana" and "orange" with an empty string.
