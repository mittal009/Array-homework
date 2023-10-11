import java.util.Scanner;

public class PresentInArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //create an array of integers
        int[] array = {2,4,6,8,10};
        //input for the element to check
        System.out.println("enter the element to check: ");
        int targetElement = scanner.nextInt();

        //initialise a flag to indicate if the element is found
        boolean found = false;

        //loop through the array to check if it contains the target element
        for (int element : array)
        {
            if (element == targetElement)
            {
                found = true;
                break;  //exit the loop once element is found

            }

        }//check the flag to determine if the element was found
        if (found)
        {
            System.out.println("the array contains the element " + targetElement);
        }else
        {
            System.out.println("the array does not contain the element: " + targetElement);
        }

    }
}
