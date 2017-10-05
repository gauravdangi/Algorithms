String  always consists of two distinct alternating characters. For example, if string 's two distinct characters are x and y, then t could be xyxyx or yxyxy but not xxyy or xyyx.

You can convert some string  to string  by deleting characters from . When you delete a character from , you must delete all occurrences of it in . For example, if  abaacdabd and you delete the character a, then the string becomes bcdbd.

Given , convert it to the longest possible string . Then print the length of string  on a new line; if no string  can be formed from , print  instead.

### Input Format

The first line contains a single integer denoting the length of . 
The second line contains string s.

### Output Format

Print a single integer denoting the maximum length of  for the given ; if it is not possible to form string , print instead.

### Sample Input

10
beabeefeab

### Sample Output

5