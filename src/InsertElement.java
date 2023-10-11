import java.util.Arrays;
import java.util.Scanner;

public class InsertElement
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input for the number of elements in the array
        System.out.println("enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        //create an array to store the elements
        int[] originalArray = new int[numElements];

        //input for array elements
        System.out.println("enter the element of the array: ");
        for (int i = 0; i < numElements; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }
        //input for the element to insert
        System.out.println("enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        //input for the position to enter the element
        System.out.println("enter the position to insert the element: ");
        int positionToInsert = scanner.nextInt();

        //check if the position is valid
        if (positionToInsert < 0 || positionToInsert > originalArray.length)
        {
            System.out.println("Invalid position to insert the element.");
        } else {
            //create new array with one additional element
            int[] newArray = new int[originalArray.length + 1];

            //copy element from the original array to new array

            for (int i = 0, j = 0; i < newArray.length ;i++) {
                if (i == positionToInsert) {
                    newArray[i] = elementToInsert;
                } else {
                    newArray[i] = originalArray[j++];
                }
            }
            System.out.println("Original Array: " + Arrays.toString(originalArray));
            System.out.println("New Array after insertion: " + Arrays.toString(newArray));
        }


    }
}
