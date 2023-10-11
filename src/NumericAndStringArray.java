
import java.util.Arrays;
import java.util.Scanner;

public class NumericAndStringArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements in the numeric array:");
          //input for numeric array
        int numericArrayLength = scanner.nextInt();
        int[] numericArray = new int[numericArrayLength];
        System.out.println("Enter the elements of the numeric array: ");
        for (int i = 0; i < numericArrayLength; i++)
        {
            numericArray[i] = scanner.nextInt();
        }
       //input for string array
        System.out.println("enter the number of elements in the string array:");
        int stringArrayLength = scanner.nextInt();
        String[] stringArray = new String[stringArrayLength];
        System.out.println("enter the elements of the string array:");
        for (int i = 0; i < stringArrayLength; i++)
        {
            stringArray[i] = scanner.next();
        }
        //sort and print the numeric array
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array (Ascending): " + Arrays.toString(numericArray));
         //sort and print the string array
        Arrays.sort(stringArray);
        System.out.println("sorted string Array (Ascending) " + Arrays.toString(stringArray));

        scanner.close();
    }
}
