
import java.util.Arrays;
import java.util.HashSet;

public class CommonElements
{
    public static void main(String[] args)
    {
        String[] array1 = {"pink", "red", "yellow", "green", "orange"};
        String[] array2 = {"yellow", "green", "purple", "orange", "white"};

        //convert arrat1 to a hashset for efficient lookups
        HashSet<String> set1 = new HashSet<>(Arrays.asList(array1));

        //find and print common values between array1 and array2
        System.out.println("Common values between the two arrays: ");
        for (String value : array2)
        {
            if (set1.contains(value))
            {
                System.out.println(value + " ");
            }
        }
    }
}
