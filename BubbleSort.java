import java.util.Scanner;
class Sorting {
    public static void PrintArray(int array[]) {
        System.out.println("Sorted array is:");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        int array[] = new int[size];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }

        //BUBBLE SORT
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
if(array[j] > array[j+1]){
    int temp = array[j];
    array[j] = array[j+1];
    array[j+1] = temp;
}
            }
        }
        PrintArray(array);
    }
}
