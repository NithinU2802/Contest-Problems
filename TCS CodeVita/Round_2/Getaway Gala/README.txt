# Question - Getaway Gala
At the annual office holiday party, excitement buzzed as employees gathered for a lucky draw. Among the
prizes was a weekend getaway voucher.
With a small number of attendees forming a row, the organizer chose to forego the conventional lucky dip
approach. Instead, they introduced a more curious and engaging method that will eliminate every
employee except one, who is considered as winner.
The organizer aimed to eliminate employees in two rounds. In the first round, he will form a row of
employees who participated. Then he will select the first letters of all the employees from left to right and
form a string S. Then he will start eliminating the employees whose name is forming the palindrome (every
time he will delete the first name from left to right which is forming a palindrome). He will continue this
process till the string S does not have any sub strings which are palindromes.
For example, consider the names {Hari Giri Siri Gopi Hima} in the row. Here the string S formed by picking
the first letter of the names is HGSGH. Note that substring GSG is a palindrome .When processing from left
to right, the alphabet G from the name Gopi forms a palindrome. We call the name Gopi as Mirror Word.
Hence we eliminate Gopi in the first iteration.
Now only names {Hari Giri Siri Hima} remain. String S is HGSH which does not have any palindrome. Hence
the final row will be {Hari Giri Siri Hima}. If string S had more palindromes we would apply the same
procedure as mentioned in paragraph above. Since string S is now palindrome free, the organizers will now
apply a different criteria.
This criteria will be to remove every Nth person from the remaining names everytime processing the names
from left to right. The last name remaining is the winner of the lucky draw.
Given the list of names of employees, and the value of N, find out the who the winner is.
Constraints
Names comprise of upper and lower case characters. Processing is case insensitive.

Constraints:
1 <= number of employees <= 1000
1 <= N <= 1000
1 <= length of name <= 10

Input:
First line consists of an array indicating the names of employees present in the row. Names are space
separated.
Second line consists of a single integer N denoting the interval of elimination.

Output
Print the name of the employee who is going to be the winner. Print the name as it is given in the array.

Time Limit (secs)
1

Examples
Example 1
Input
Janu gita sana gopi jaslin Tony Ritu Naina sonu Neha
2
Output
Janu
Explanation
As we can see, gopi is forming a mirror word according to the given rules, thus we eliminate the employee
named gopi. Now gopi's position will be empty. Again, the name Neha is forming mirror word, hence we
remove the name Neha and the resulting row will be {Janu gita sana jaslin Tony Ritu Naina sonu}. Now
there can be no palindromes after picking the first alphabets of the remaining names. Hence the second
criteria is now applied where N is 2. Now, processing from left to right, if we start removing every 2nd name
(Nth name) until we are left with one person, then it turns out that Janu will be the winner, hence print
"Janu".

Example 2
Input
Vishal ram Vina veda Lekha Rahul Keerthi
1
Output
Keerthi
Explanation
As we can see, Vina is forming a mirror word, removing it will result in {Vishal ram veda Lekha Rahul
Keerthi}. Next, veda forms the mirror word. On removing we will get {Vishal ram Lekha Rahul Keerthi}.
Next, Rahul forms the mirror word which upon removal will yeild {Vishal ram Lekha Keerthi}. Now there
can be no palindromes after picking the first alphabets of the remaining names. Hence the second criteria
is now applied where N is 1.From Vishal, if we start removing every 1st name until we are left with one
person, it turns out that Keerthi will be the winner, hence print "Keerthi".