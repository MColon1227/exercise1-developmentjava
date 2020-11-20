
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exercise1 {

    public static void main(String[] args)
    {
        //Comparison between 2 words
        System.out.println("--------->");
        String l1 = "marisol";
        String l2 = "Marisol";
        System.out.println("Comparing " + l1 + " " + "and " + l2 + " " + "= " +  stringCompare(l1, l2));
        System.out.println("--------->");

        //Verify biggest number in a list
        List<Integer> numbers = Arrays.asList(12, 72, 54, 83, 51, 100);
        biggestNumber(numbers);
        System.out.println("--------->");

        // Sort a list by asc and desc order
        sortList();
        System.out.println();
        System.out.println("--------->");

        // Count the length of a string
        System.out.printf("The length of the string is " + countLength());
        System.out.println();
        System.out.println("--------->");

    }

    //Comparison between 2 words
    public static String stringCompare(String l1, String l2)
    {
        try
        {
            int result = l1.compareTo(l2);
            if (result == 0)
                return "The strings are the same";
            else
                return "The strings are different";
        }
        catch(Exception e)
        {
            System.out.println("Exception handled:");
            return "L1 is null";
        }
    }

    //Verify biggest number in a list
    public static void biggestNumber(List<Integer> numbers)
    {
        System.out.println("The list is : ");
        numbers.forEach((Integer) -> System.out.print(Integer + " "));
        System.out.println();
        Integer bigNumber = numbers.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("Bigger number is: " + bigNumber);
    }

    // Sort a list by asc and desc order
    public static void sortList()
    {
        List<Integer> list = Arrays.asList( 32,342,434,23,31,233 );

        System.out.println("Unsorted List in Java: " + list);
        // Sorting List in Java in ascending
        Collections.sort(list);
        System.out.println("Elements of the list sorted in ascending order: " + list);
        // sorting List in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Elements of the list sorted in descending order: " + list);
    }

    // Count the length of a string
    public static String countLength()
    {
        String text = "stuff-that-we-are-testing-for-the-exercise";
        int count = 0;
        for (int c : text.toCharArray()) {
            count++;
        }
        System.out.println("The text is: " + text);
        return String.valueOf(count);
    }
}


