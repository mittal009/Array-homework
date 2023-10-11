
import java.util.Scanner;

public class SpecificValue
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        //input for the number of elements in the array
        System.out.println("please enter the number of elements in the Array: ");
        int numElements = scanner.nextInt();

        //create aan array to store the elements
        int[] numbers = new int[numElements];

        //input for array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < numElements; i++) {
            System.out.println("Elements " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        //input for the value to check for
        System.out.println("Enter the value to check for: ");
        int targetValue = scanner.nextInt();
        //initialize a flag to indicate if the value is found
        boolean found = false;

        //loop through array to check if it contains the target value
        for (int number : numbers)
        {
            if (number == targetValue)
            {
                found = true;
                break;
                // exit the loop early once the value is found
            }
        }
        //check the flag to determine if the value was found
        if (found)
        {
            System.out.println("The array contains the value " + targetValue);
        } else

        {
            System.out.println("The array does not contains the value " + targetValue);
        }

    }
}

