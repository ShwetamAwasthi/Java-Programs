import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Game game = new Game();
        while(!game.corr){
            game.takeUserInput();
            game.isCorrect();
        }
    }
}
 class Game{
    Scanner sc = new Scanner(System.in);
    int ranNum;
    int userInput;
    int noOfGuess = 0;
    boolean corr= false;
   Game(){
    Random rand = new Random();
    ranNum = rand.nextInt(100)+1;
   }
   public void takeUserInput(){
    noOfGuess++;
    System.out.print("enter number between 1 - 100 : ");
    userInput = sc.nextInt();
   }

   public void isCorrect(){
    if(userInput==ranNum){
        System.out.println();
        System.out.println("congrates!!! you guessed "+ranNum+" right in "+noOfGuess+" guesses");
        corr= true;
    }
    else if(userInput>ranNum){
        System.out.println(userInput+" is little high");
    }
    else if(userInput<ranNum){
        System.out.println(userInput+" is little low");
    }
   }
}
