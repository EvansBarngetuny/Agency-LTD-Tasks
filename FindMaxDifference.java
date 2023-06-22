import java.util.Arrays;
import java.util.List;

public class FindMaxDifference {
    //Main function where the method invocation is done.
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,10);
        int maxDifference = FindMaxDifference.findMaxDifference(numbers);
        System.out.println("The largest Difference is: " + maxDifference);
    }
    public static int findMaxDifference(List<Integer> numbers) {
        int min = numbers.get(0);
        int maxDiff = 0;
      //Check if the list has less than elements
        if(numbers.size() < 2) {
            return 0;
        }
        //Iterate through the list and maximum number
        for (int i= 1; i < numbers.size(); i++){
            int currentNumb = numbers.get(i);
            maxDiff = Math.max(maxDiff, currentNumb -min);
            min = Math.min(min, currentNumb);
        }
        return maxDiff;
    }
}
