public class zad2 {
    public static void main(String[] args) {

        int[] array = {5,5,5,5,5,1};
        System.out.println(findDominant(array));


    }

    public static int findDominant(int[] array) {
        int n = array.length;
        int wynik = 0;
        int count = 0;


        for (int i : array) {
            if (count == 0) {
                wynik = i;
            }

            if (i == wynik) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : array) {
            if (num == wynik) {
                count++;
            }
        }

        if (count > n / 2) {
            return wynik;
        } else {
            return -1;
        }

    }
}
