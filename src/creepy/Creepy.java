package creepy;

 
import java.util.Scanner;

  /**
   * 
   * @author binalfew
   *
   */

 

public class Creepy {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        
        String questionOne ="You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?";
        String upstairsChoice = "upstairs";
 
        String answerOne;
        
        String questionTwo ="You are now in a hall way with a pile of trash and hole. Do you want to stay here? Y/N";
        String questionTwoYesAnswer ="y";
 
        String answerTwo;
        
        String questionThree = "You see an old and expensive looking bottle of wine and a sandwich, do you \"drink\" the wine or \"eat\" the sandwich?";
        String questionThreeDrinkAnswer = "drink";
 
        String answerThree;
        
        
        String questionFour = "As you wait, a giant spider drops down in front of you.  Do you touch it or not? Y/N";
        String questionFourYesAnswer = "y";
      
        String answerFour;
        
        String questionFive = "You have decided to keep moving, do you want to go down the \"hole\" or \"dig\" through the pile of trash?";
        String questionFiveHoleAnswer = "hole";
        
        String answerFive;
        
        String questionSix = "Almost immediately, you start feeling dizzy.  Do you polish of the bottle? Y/N";
        String questionSixYesAnswer = "y";
        
        String answerSix;
        
        String questionSeven = "This sandwich tastes great, but as you get to the center, you notice live maggots crawling around. Do you continue eating? Y/N";
        String questionSevenYesAnswer = "y";
         
        String answerSeven;
        String response; // holds users response yes or no to continue the program
        
        do{
        System.out.println( "WELCOME TO MITCHELL'S TINY ADVENTURE!");
        
        System.out.println(questionOne);
        answerOne =scan.nextLine();
        
        if(answerOne.equalsIgnoreCase(upstairsChoice)) {
            System.out.println(questionTwo);
            answerTwo = scan.nextLine(); // will be Y or N
            
            if(answerTwo.equalsIgnoreCase(questionTwoYesAnswer)) { // you stay in the hallway
                System.out.println(questionFour); // spider drops down, touch it or not?
                answerFour = scan.nextLine();
                
                if(answerFour.equalsIgnoreCase(questionFourYesAnswer)) { // touched the spider
                    System.out.println("Big mistake!! This is a poisonous spider, and you die a slow painful death."); // dead
                }
                else { // did not touch the spider
                    System.out.println("The spider transforms into a zombie and eats your brains.  Too bad for you!"); // dead
                }
            }
            else { // you do not stay in the hallway
                System.out.println(questionFive); // go down hole or dig through trash pile?
                answerFive = scan.nextLine();
                
                if(answerFive.equalsIgnoreCase(questionFiveHoleAnswer)) { // you go down the hole
                    System.out.println("Mustering all your courage, you jump into the hole, fall for 5 straight minutes, and land in a lake of lava.  Too bad for you.");
                }
                else { // you dig in trash pile
                    System.out.println("You rummage through the trash, and you find a magic ring.  You put it on and are transported to a magical fairy realm where you live out the rest of you life in ectasy");
                }
            }
        }
        else { // kitchen choice
            System.out.println(questionThree); // drink wine or eat sandwich?
            answerThree = scan.nextLine();
            
            if(answerThree.equalsIgnoreCase(questionThreeDrinkAnswer)) { // you drink the wine
                System.out.println(questionSix);
                answerSix = scan.nextLine();
                
                if(answerSix.equalsIgnoreCase(questionSixYesAnswer)) { // you finish off the bottle
                    System.out.println("Unsurprisingly, as you continue to drink the wine, you feel even worse.  You notice everything around you starts looking really big.  \nOh no! You are shrinking down to the size of a mouse.  Too bad for you");
                }
                else { // stop drinking the wine
                    System.out.println("Good call.  You feel better after a few minutes. You head out the front door before things get any worse.  At least you made it out alive!");
                }
            }
            else { // you eat the sandwich
                System.out.println(questionSeven); // continue eating with maggots?
                answerSeven = scan.nextLine();
                
                if(answerSeven.equalsIgnoreCase(questionSevenYesAnswer)) { // you eat the maggots
                    System.out.println("While gross looking, these are good fresh maggots, and you get a lot of protein and energy.  Well done!");
                }
                else { // you do continue eaingt the sandwich
                    System.out.println("You put the sandwich down, then it slowly starts transforming in a pile of gold.  You grab it, head out the front door, and sell it for a pile of cash!");
                }
                
                
            }
            
        
        }
       System.out.println( "Do you want to continue the game? yes/ no");
        
        
         response =scan.nextLine();
        }
        
   
        while(response.equalsIgnoreCase( "yes"));

        
        
    }

}

