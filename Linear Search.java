import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        System.out.println("Enter the Numbers in the array: ");
        int array[] = new int[size];
     for(int i = 0; i < size; i++){
         array[i] = sc.nextInt();
     }


        System.out.println("Enter the number you want to search: ");
        int search = sc.nextInt();

       for(int i =0; i < size; i++){
           if(array[i] == search){
               System.out.println("Element is present at " + (i+1));
           }
        }
    }
}
