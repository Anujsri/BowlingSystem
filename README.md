
## Bowling
Use OOPs based design to implement the Bowling Alley game, the purpose is to get the winner of the game.
 
## Technology Used ##

 Java
 
## Usage ##
I  am using five classes to design it                                                                                                          

     1. MainClass
     2. Strategies
     3. Bowling
     4. CustomizeGame
     5. Player
     
   #
                                                   # MainClass
                                                      
  This class create objects and execute methods of rest 4 classes to give us the winner of Bowling Alley Game
     
  #
                                                           
                                                   # Strategies Class
                                                                                                         
  1. As a user has two tries in each sets so we need two inputs to define a new rule(Strategies) like spare and strike 
     and a bonus based on the Strategies.
     
  2. Let's take an example to understand it, suppose we want to create a new Strategy such that if pin knocked in try1 and 
     try2 in a set, both are zero then we will deduct 10 points from a player's score.
                                  input1= 0, input2=0, bonus = -10, strategie_name="XYZ"
                                  new Strategies(input1,input2,bonus,strategie_name)
        suppose Player A's score till (i-1)th set is = 45, and the ith set pin knocked in try1=0 and try2=0; hence his score
        will be 40+bonus = 40-10 = 30
  
  #
  
                                                  # Bowling Class
                                                                                                          
  The purpose of this class to set up an environment to execute Bowling game like storing the value of try1 and try2 
  and each set to this I am creating an array which will store it, get a bonus based on the strategy and get the total 
  score of each player
     
 #
    
                                                  # CustomizeGame Class                                            
                                    
  1. The purpose of this class to customize the Bowling Alley game like in problem statement we have given two strategies
     and set size 10 but by this class based on user's choice, we can add more strategies and can change set size.
     
  2. A user will have three option
            1. He can define a new strategy
            2. He can change the number of the set (by default it is 10)
            3. If he does choose option 1 or 2 default set value and strategies will be defined CustomizeGame class itself
#
 
                                                  # Player Class
                                                                                                          
  this class used to store each players total score, the score of each set, and values which he got in try1 and try2 in each set
  and a bonus based on the Strategies.
  
 #

# Execution Process
   1. when we run Mainclass it will ask to user *Enter 1 to add new strategie,enter 2 to change no. of rounds, 3 for default*
   ###### If he enters 1:
      to define any new Strategy we need four parameters two numbers for try1 and try2 value, bonus and strategy name
<img width="700" alt="Screenshot 2019-11-21 at 2 08 14 AM" src="https://user-images.githubusercontent.com/25398413/69279209-e2f27180-0c09-11ea-92fa-b5fa6426ce5b.png">

  ###### If he enters 2:
      he can change number of set default was 10 
<img width="675" alt="Screenshot 2019-11-21 at 2 00 13 AM" src="https://user-images.githubusercontent.com/25398413/69279508-8774b380-0c0a-11ea-8f3e-58f6565bc353.png">

 ###### if he enters 3:
 it will take default values
 <img width="618" alt="Screenshot 2019-11-21 at 1 46 17 AM" src="https://user-images.githubusercontent.com/25398413/69279688-edf9d180-0c0a-11ea-9e21-4a2ee193a235.png">
 
 2. User is asked whether he wants sees detail view of game or not, if he enters yes : detailed view will be shown of each 
     player else program will exit.
<img width="700" alt="Screenshot 2019-11-21 at 1 47 37 AM" src="https://user-images.githubusercontent.com/25398413/69280040-9314aa00-0c0b-11ea-8ab3-0b103e75cd34.png">
 
     
# Thank You!
