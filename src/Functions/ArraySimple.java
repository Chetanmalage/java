package Functions;

import java.util.Arrays;

public class ArraySimple {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        array(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void array(int[] ass){
        ass[0] = 99;
    }

}
