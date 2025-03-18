import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] result = filterEvenIndexOddValue(array);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] filterEvenIndexOddValue(int[] array) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                lista.add(array[i]);
            }
        }

        int[] result = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            result[i] = lista.get(i);
        }

        return result;
    }
}