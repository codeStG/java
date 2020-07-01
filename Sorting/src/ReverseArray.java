import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        Integer [] myArray = {24, 83, 76, 9, 4, 8, 25, 39};

        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));
   }

    static void reverse (Integer array[]) {
        //Impure function because it does not return output
        Collections.reverse(Arrays.asList(array));
    }
}
