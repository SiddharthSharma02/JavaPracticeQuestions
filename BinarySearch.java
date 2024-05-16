import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of elements in the array:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int array[] = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search:");
        int search = sc.nextInt();

    int a = 0;
    int b = array.length - 1;
    while(a<=b){
        int mid = (a+b)/2;
       int midn = array[mid];

       if(midn == search){
           System.out.println("Element is found at "+ (array.length - 1));
       }

       if (midn > search){
           b = mid - 1;
       }
      else{
           a = mid + 1;
       }
    }
  }
}
