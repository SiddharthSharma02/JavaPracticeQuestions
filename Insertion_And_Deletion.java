import java.util.Scanner;
public class InsertionAndDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 int capacity = 50;
 int array[] = new int[50];

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        System.out.println("Enter the values: ");
        for(int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Array before insertion:");
        for(int i =0; i < size; i ++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Enter the element to be inserted:");
        int a = sc.nextInt();

        System.out.println("Enter the position of the new element: ");
        int pos = sc.nextInt();

        for(int i = size; i > pos; i--){
            array[i] = array[i-1];
        }
        array[pos] = a;
        ++size;

        System.out.println("Array after insertion: ");
        for(int i = 0; i < size; i ++){
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");


        System.out.println("Enter the index of the element you want to delete: ");
        int del = sc.nextInt();
        for(int i = del; i < size; i++){
            array[i]= array[i+1];
        }
--size;
        System.out.println("Array after deletion:");
        for(int i = 0; i < size; i ++){
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");
    }
}
