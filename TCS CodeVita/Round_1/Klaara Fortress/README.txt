Question - Klaara Fortress
	Queen Klaara is the ruler of Fairy Land. Her fortress has several adjacent rooms resembling a matrix-like structure, and she is renowned for possessing unique diamonds. Kings and Queens of different Kingdoms will visit her fortress to see the jewellery. The Fortress has one Entrance at the top left (0,0) and exit at the bottom right (m-1, n-1).
One day a person from neighbouring kingdom thought of stealing as much as he can, from the queen Klaara's jewellery room. The thief thought that he can anonymously enter, rob, and exit the fort. But at the entrance itself, he was caught and the watch keepers started chasing him from the point where he entered into the fort. Now from there, he is trying to reach the room having the exit.
Klaara came to know about this and she thought of using the newly bought automatic locking application. Using this device, she can lock a room from all sides. Some of the rooms are already locked and no entry/exit into them. Every other room will be having its gates open for left, right, up and down rooms (if there are adjacent rooms).
The thief is wise and already aware of the fortress structure so he is trying to escape early by choosing the shortest path, but Klaara is aiming for increasing the path length using this application. She cannot lock a room if it results in no path between Entrance and exit, since visitors will be blocked and then klaara will have to make robbery information public. Klaara can use this application only one time. To move from one room to another room, thief needs 1 minute. The structure of the fortress is given. "1" represents locked room and "0" represents open room.
Find the max time that thief will take to reach the exit from the entrance of the fortress. considering
klaara can block at most one room.
klaara cannot block the room which result is no path between entrance and exit.
the thief will choose the shortest path to exit.
Constraints
3 <= M, N <=20
Input
First line consists of two integers M, N denoting the number of rows and columns.
Next M lines contain N space separated integers which will represent the structure of the fortress.
Output
Print the time taken to reach the exit by the thief.
Time Limit (secs)
1
Examples
Example 1
Input
5 5
0 0 0 0 0
1 1 1 0 0
0 0 0 0 1
0 1 1 0 1
0 0 0 0 0
Output
15
Explanation
If Klaraa locks the room at position (3,3) (0-indexed), then the thief has to take the path - (0,0) -> (0,1) -> (0,2) -> (0,3) -> (1,3) -> (2,3) -> (2,2) -> (2,1) -> (2,0) -> (3,0) -> (4,0) -> (4,1) -> (4,2) -> (4,3) -> (4,4) i.e., he will need 15 minutes for exiting the fortress.
Blocking no other cell will result in longest path taking more than 15 minutes between entry and exit
Example 2
Input
5 5
0 1 0 0 0
0 0 0 0 0
0 1 0 0 1
0 1 1 0 0
1 0 1 1 0
Output
9
Explanation
Here max 9 minutes will be taken by the thief to reach the exit. Blocking rooms like (2,2),(1,3) will result in the same time.
