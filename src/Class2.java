
import java.util.HashMap;

public class Class2 {

    public static void main(String[] args)
    {

        //Verify smallest number in a list
        int numbers[]= {88,33,55,23,64,123,1};
        smallestNumber(numbers);
        System.out.println("--------->");

        // trough a HashMap and print the value based on the Key
        HashMap<Integer, String> testHashMap = new HashMap<>();
        testHashMap.put(18, "Alexa");
        testHashMap.put(56, "Marisol");
        testHashMap.put(34, "Kassandra");

        String test1 = testHashMap.get(18);
        System.out.println("The Value mapped to Key 18 is: "+ test1);

        String test2 = testHashMap.get(56);
        System.out.println("The Value mapped to Key 56 is: "+ test2);

        testHashMap.forEach((key, value) -> System.out.println(key + " : " + value));

    }

    //Verify smallest number in a list
    public static void smallestNumber(int numbers[])
    {
        int smallest = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]>0) {
                smallest=numbers[i];
                break;
            }
        }
        for (int i=0;i<numbers.length;i++) {
            if(smallest>numbers[i]&&numbers[i]>0) {
                smallest=numbers[i];
            }
        }
        System.out.println(smallest);
    }
}

