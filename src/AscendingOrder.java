import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //input for the number of elements in the array
        System.out.println("enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        //create an array to store the elements
        int[] array = new int[numElements];

        //input for array elements
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i <numElements; i++)
        {
            System.out.println("elements " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        //sort the array in ascending order
        Arrays.sort(array);
        //print the sorted array
        System.out.println("sorted array in ascending order: " + Arrays.toString(array));

    }
}
