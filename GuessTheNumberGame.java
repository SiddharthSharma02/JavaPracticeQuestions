import java.util.Random;
import java.util.Scanner;

class game{
    Scanner sc = new Scanner(System.in);
    public int userInput, compInput, NoOfGuesses = 0;

    public int game(){
        Random r = new Random();
        compInput = r.nextInt(101);
        return compInput;
    }
public void takeUserInput(){
    System.out.println("Enter a number and see how close you are to the number the computer is thinking of: ");
    do{

        userInput = sc.nextInt();


        if(userInput > compInput){
            System.out.println("Smaller!");
        }
        else if(userInput < compInput){
            System.out.println("Bigger!");
        }
        NoOfGuesses++;
    }while(userInput != compInput);
}

public void isCorrect(){
        if(userInput == compInput){
            System.out.println("You Got It!!!");
        }
}
public void NumberOfGuesses(){
        if(NoOfGuesses == 1){
            System.out.println("Did you hack?!");
        }
       else if(NoOfGuesses < 3){
            System.out.println("Excellent!");
        }
        else if(NoOfGuesses <= 3 && NoOfGuesses>= 5){
        System.out.println("Great!");
    }
       else if(NoOfGuesses >5 && NoOfGuesses < 10){
            System.out.println("Hard Luck Buddy!");
        }
       else{
            System.out.println("Wow you're not a quitter!");
        }
    System.out.println("You took "+ NoOfGuesses+ " attemps!!");
}
}
public class GuessTheNumberGame {
    public static void main(String[] args) {
        game gtn = new game();
        gtn.game();
        gtn.takeUserInput();
        gtn.isCorrect();
        gtn.NumberOfGuesses();

    }
}
