import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3}; //Array of integers

        //Print out the unsorted array (same order as they were typed in)
        System.out.println("Usorteret array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println(); // for udprintes skyld så hver talrække kommer på hver deres linje

        Arrays.sort(numbers); //Sorts the array to the natural order and saves the order for further use of the array
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println(); // for udprintes skyld så hver talrække kommer på hver deres linje

        System.out.println("Test"); //Test to show that it works
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}
