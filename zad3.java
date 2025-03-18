import java.util.Arrays;

public class zad3 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};
        int positions = 3;
        System.out.println(Arrays.toString(rotateArray(array, positions)));

    }

    public static int[] rotateArray(int[] array, int positions){

        int n = array.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + positions) % n] = array[i];
        }



     return result;

    }
}
