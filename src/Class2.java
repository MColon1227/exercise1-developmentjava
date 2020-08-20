import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;

public class Class2 {
    public static void main(String[] args)
    {

        //Verify smallest number in a list
        List<Integer> numbers = Stream.of(12, 72, 54, 83, 51, 100).collect(Collectors.toList());
        System.out.printf("" , smallestNumber(numbers));
        System.out.println("--------->");

        // trough a HashMap and print the value based on the Key
        HashMap<Integer, String> testHashMap = new HashMap<>();
        testHashMap.put(18, "Alexa");
        testHashMap.put(56, "Marisol");
        testHashMap.put(34, "Kassandra");

        String test1 = testHashMap.get(18);
        System.out.println("The Value mapped to Key 18 is: "+ test1);

        String test2 = testHashMap.get(4);
        System.out.println("The Value mapped to Key 4 is: "+ test2);
        System.out.println("--------->");

    }

    //Verify smallest number in a list
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
