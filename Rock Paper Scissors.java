import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock,Paper,Scissors!\nChose your Input:\n0 for rock\n1 for paper\n2 for Scissors");
        int a = sc.nextInt();

        Random rand = new Random();
        int b = rand.nextInt(3);

        if (a > 2) {
            System.out.println("This is not a valid input!");
        } else {

            if(b == 0 && a == 0 || b == 1 && a == 1 || b == 2 && a == 2){
                System.out.println("Draw!");
            }
            else if(a == 0 && b == 1 || a == 1 && b == 2 || a == 2 && b == 0){
                System.out.println("You Lose!\nLOSER!!!!!!!");
            }
            else{
                System.out.println("You Win!\nBALLER!!!!!");
            }
        }
        if(b==0) {
            System.out.println("Computer chose: rock");
        }
        if(b==1) {
            System.out.println("Computer chose: paper");
        }
        if(b==2) {
            System.out.println("Computer chose: scissors");
        }
    }
}
