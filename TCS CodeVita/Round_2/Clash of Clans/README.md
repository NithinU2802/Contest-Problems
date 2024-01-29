# Question - Clash of Clans
	In Clash of Clans, you as a village chief is gearing up for a raid on an enemy village. The success of this
mission depends on assembling the most potent raiding army by selecting troops from various categories.
Each troop type has distinct strengths and weaknesses, and your goal is to create a formidable army that
maximizes overall damage.
To build an army you first need to train them in the "Barracks" which has some capacity (B). Each troop has
some size (S) it occupies in the barrack that trains and increases some amount of damage per second (D)
for each troop.
There are various troops (for e.g. Barbarian, Archer, Giant, Goblin and so on) which belong to some
category C (for e.g. Elixir Troop, Temporary Troop, Super Troops and so on).
To train them you decided to have a versatile army where you select at most one or no troops from each
category of the troops such that it has maximum damage per second and the troops fit within the barrack
size for training.
Constraints
Length of S = D = C
1 <= length of S, D <= 100
1 <= Number of categories <= 20
1 <= B <= Sum of S
Size of the troop <= Size of the Barrack i.e. Si <= B
Input
The first line contains the list of integers denoting damage per second capability Di of the troop.
The second line contains the list of integers denoting the size Si of the troop.
The third line contains a list of integers denoting the category Ciof the troop.
Last line contains an integer denoting the size of the barrack.
Output
Print the maximum damage per second that can be achieved.
Time Limit (secs)
1
Examples
Example 1
Input
8 9 4 9 1 8 1 5 6 8
2 5 7 2 3 4 5 9 3 8
4 2 2 3 4 3 2 1 2 1
10
Output
26
Explanation
The goal is to maximize the damage per second where you select at most one or none from each category.
So here we choose the 1st troop which belongs to category 4, 2nd troop which belongs to category 2 and
4th troop which belongs to category 3 whose total size is 9 which is within the barrack size. We could not
accommodate any troop from category 1 because the damage per second capability reduces or the barrack
capacity falls short. Hence, the total damage per second is 26.
Example 2
Input
6 8 2 1 5 1 2 2 3 10
5 9 2 2 1 2 2 3 3 4
1 3 4 4 3 1 2 2 3 4
10
Output
21
Explanation
Here we choose the 1st troop which belongs to category 1, 5th troop which belongs to category 3 and
10th troop which belongs to category 4 whose total size is 9 which is within the barrack size. We could not
accommodate any troop from category 2 because the damage per second capability reduces or the barrack
capacity falls short. Hence, the total damage per second is 21.