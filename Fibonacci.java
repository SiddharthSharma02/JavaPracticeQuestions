import java.util.Scanner;
public class Fibonacci{
    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b,c,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers till you want Fibonacci");
        int n = sc.nextInt();

        System.out.println("What meathod do you want to use?\nPress 1 for Iteration\nPress 2 for Recursion");
int chose = sc.nextInt();

        int a=0;
        int b=1;

        System.out.println(a);
        System.out.println(b);

if(chose == 1){

    for(int i =0; i<n;i++){
        int c = a+b;
        System.out.println(c);
        a = b;
        b = c;
    }
}

else if (chose == 2){
    int c = a+b;
    System.out.println(c);
    printFib(a,b,n-2);
}
    }
}
