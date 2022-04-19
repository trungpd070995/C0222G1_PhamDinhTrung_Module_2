package _14_sorting_algorithms.pratice;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4, 5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {

            /**Tìm mức tối thiểu trong danh sách[i...list.length-1]*/
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /**Tráo đổi list[i] với list[currentMinIndex] nếu cần */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
