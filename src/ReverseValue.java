import java.util.Arrays;

public class ReverseValue
{
    public static void main(String[] args)
    {
        int [] originalArray = {1,2,3,4,5};
        //reverse the array
        int[] reverseArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++)
        {
           reverseArray[i] = originalArray[originalArray.length -1 -i];
        }
        // print the original and reversed arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray));
    }
}
