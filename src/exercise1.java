
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class exercise1 {

    public static void main(String[] args)
    {
        //Comparison between 2 words
        String l1 = "marisol";
        String l2 = "Marisol";
        System.out.println("Comparing " + l1 + " " + "and " + l2 + " " + "= " +  stringCompare(l1, l2));
        System.out.println("--------->");

        //Verify biggest number in a list
        List<Integer> numbers = Stream.of(12, 72, 54, 83, 51, 100).collect(Collectors.toList());
        System.out.printf("" , biggestNumber(numbers));
        System.out.println("--------->");

        // Sort a list by asc and desc order
        System.out.println(sortList());
        System.out.println("--------->");

        // Count the length of a string
        System.out.printf(new StringBuilder().append("text's length: ").append(countLength()).toString());
        System.out.println();
        System.out.println("--------->");

        //Verify smallest number in a list
        System.out.printf("" , smallestNumber(numbers));
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
    public static Object biggestNumber(List<Integer> numbers)
    {
        System.out.println("The list: ");
        numbers.forEach((i) -> System.out.print(i + " "));
        System.out.println();
        Integer bigNumber = numbers.stream()
                .max(Comparator.comparing(i -> i)).get();
        System.out.println("Big number is: " + bigNumber);
        return numbers;
    }

    // Sort a list by asc and desc order
    public static Object sortList()
    {
        int [] numberList =  new int [] {32,342,434,23,31,233};
        int temp;
        System.out.printf("Elements of the array: ");
        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + " ");
        }
        for (int i = 0; i < numberList.length; i++) {
            for (int x = i+1; x < numberList.length; x++) {
                if(numberList[i] < numberList[x]) {
                    temp = numberList[i];
                    numberList[i] = numberList[x];
                    numberList[x] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + " ");
        }
        System.out.println();
        System.out.println("--------->");

        //Sort the array in ascending order
        for (int i = 0; i < numberList.length; i++) {
            for (int x = i+1; x < numberList.length; x++) {
                if(numberList[i] > numberList[x]) {
                    temp = numberList[i];
                    numberList[i] = numberList[x];
                    numberList[x] = temp;
                }
            }
        }

        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + " ");
        }
        return 0;
    }

    // Count the length of a string
    public static String countLength()
    {
        String text = "stuff-that-we-are-testing";
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        System.out.println("The text is: "+ text);
        return String.valueOf(count);
    }

    public static Object smallestNumber(List<Integer> numbers)
    {
        System.out.println("The list: ");
        numbers.forEach((i) -> System.out.print(i + " "));
        System.out.println();
        Integer smallNumber = numbers.stream()
                .min(Comparator.comparing(i -> i)).get();
        System.out.println("Small number is: " + smallNumber);
        return numbers;
    }
}

