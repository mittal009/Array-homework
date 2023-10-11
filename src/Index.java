import java.util.Scanner;

public class Index
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //input for the number of elements in the array
        System.out.println("please enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        //create an array to store the elements
        int [] numbers = new int[numElements];

        //input for array elements
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < numElements; i++)
        {
            System.out.println("Elements " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        //input for the elements to find
        System.out.println("enter the elements to find: ");
        int targetElement = scanner.nextInt();

        //find and print the index of the target element
        int index = -1;
        //initialize to -1 to indicate not found

        for (int i = 0; i <numElements; i++)
        {
            if (numbers[i] == targetElement)
            {
                index = i;
                break; // exit the loop once the element is found
            }
        }
            if (index != -1)
            {
                System.out.println("The element " + targetElement + "is at index " + index);
            }else
            {
                System.out.println("The element " + targetElement + " is not in the array. ");
            }
    }

}
