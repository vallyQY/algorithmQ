package algorithmTestDemo;

import java.util.Comparator;

public class StringLengthCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        return Integer.compare(len1, len2);
    }

    public Comparable[] sort(Comparable<String>[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
                exch(arr, j, j - 1);
            }
        }
        return arr;
    }

    private boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2) < 0;
    }

    private void exch(Comparable[] com, int i, int j) {
        Comparable co = com[i];
        com[i] = com[j];
        com[j] = co;
    }

}
