import java.util.Scanner;

public class SumValueOfAnArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //input for the number of elements in the array
        System.out.println("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        //create an array to store the elements
        int[] numbers = new int[numElements];
        //input for array elements
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i <numElements; i++)
        {
            System.out.println("Elements " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        //calculate the sum of the ARRAY elements
        int sum = 0;
        for (int i = 0; i <numElements; i++)
        {
            sum += numbers[i];
        }
        //print the sum
        System.out.println("Sum of the array elements: " + sum);

    }
}
