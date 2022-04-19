package _14_sorting_algorithms.excise.insertion_sort_algorithm;

public class InsertionSortAlgorithm {
    static int[] list = {22, 3, -10, 15, 0, 1, -2, 36, 4, 2};

    public static void insertionSort(int[] list) {
        int mid, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            mid = i;
            while (mid > 0 && x < list[mid - 1]) {
                list[mid] = list[mid - 1];
                mid--;
            }
            list[mid] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}