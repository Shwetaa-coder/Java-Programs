import java.util.ArrayList;

public class Practice56 {

    public static ArrayList<Integer> un(int[] a1, int[] a2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != a1[i]) {
                    arr.add(a1[i]);
                }
                i++;
            } else if (a1[i] > a2[j]) {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != a2[j]) {
                    arr.add(a2[j]);
                }
                j++;
            } else {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != a1[i]) {
                    arr.add(a1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < a1.length) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != a1[i]) {
                arr.add(a1[i]);
            }
            i++;
        }
        while (j < a2.length) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != a2[j]) {
                arr.add(a2[j]);
            }
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2 = { 2, 3, 4, 4, 5, 6 };

        ArrayList<Integer> result = un(a1, a2);

        System.out.println("Union of two sorted arrays:");
        System.out.println(result);
    }
}