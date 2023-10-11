import java.util.HashMap;
import java.util.Map;

public class DuplicateValue
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,2,5,6,4,7};

        //create a map to store elements and their counts
        Map<Integer,Integer>elementsCounts = new HashMap<>();

        //find and print duplicate value
        System.out.println("duplicate values in the array: ");
        for (int value : array)
        {
            if (elementsCounts.containsKey(value))
            {
                System.out.println(value + " ");
            }else
            {
                elementsCounts.put(value, 1);
            }
        }
    }
}
