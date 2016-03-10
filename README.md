# TowersOfHanoi
Mathematical puzzle game
#### Compiling
Simply go to the directy of the file TowersOfHanoi.java and compile using javac.<br />
Execute the file using the command line "java TowersOfHanoi" after compiling.
#### How to Play
Your goal is to move all the blocks from the s1 to s3. <br />
There are 2 main rules <br />
1. You can only move one disk at a time
2. You can never put a bigger block on top of a smaller block. 

When you execute the file you are prompted with "Choose the number of blocks you want to play with" <br />
Simply input the number of blocks you want, and hit enter. 3 is the recommended number of blocks for beginners. <br />

The screen after that looks like

Welcome to Towers of Hanoi!!<br />
==========================================<br />

STATE<br />
-------------------------------(tries: 0)<br />
s1: 3 2 1 <br />
s2: <br />
s3: <br />
------------------------------------------<br />

press command to see "command"<br />

The three blocks are denoted by the 3 2 1 where 1 is the smallest block and 3 is the biggest block<br />

If you type "commands" and enter, you will get the info

Commands : "s1s2"- move top block from s1 to s2  
           "s1s3"- move top block from s1 to s3  
           "s2s1"- move top block from s2 to s1  
           "s2s3"- move top block from s2 to s3  
           "s3s1"- move top block from s3 to s1  
           "s3s2"- move top block from s3 to s2  
           "state"- to see the current state  
           "min"- see minimum number of minimum steps to complete  
           "restart"- restart game to beginning  
           "end"- end program  
#### Winning

When you complete the game you are prompted with the screen:
s1s3

STATE
-------------------------------(tries: 9)
s1: 
s2: 
s3: 3 2 1 
------------------------------------------

Congratulations!! You solved it! number of tries were: 9
The minimum number of tries is: 7



STATE
-------------------------------(tries: 7)
s1: 
s2: 
s3: 3 2 1 
------------------------------------------

Congratulations!! you finished in minimum number of tries!!

