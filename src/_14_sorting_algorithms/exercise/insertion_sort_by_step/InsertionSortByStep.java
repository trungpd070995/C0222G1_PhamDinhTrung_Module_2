package _14_sorting_algorithms.exercise.insertion_sort_by_step;

import java.util.Arrays;

public class InsertionSortByStep {
    public static void main(String[] args) {
        int[] array = {3,0,2,4,-1,10,12,20,16};
        int x , mid;
        System.out.println("Mảng khởi tạo đầu vào: " + Arrays.toString(array));
        for(int i = 1 ; i < array.length;i++){
            x = array[i];
            mid = i;

            while( mid >0 && x < array[mid-1]){
                System.out.println("Vị trí hoán đổi lần lặp thứ " + i + " : "+array[mid]+" : "+array[mid-1]);
                array[mid] = array[mid-1];

                mid--;

            }
            array[mid] = x;
            System.out.println("Vị trí sau hoán đổi của lần lặp thứ " + i + ":"+Arrays.toString(array));

        }
        System.out.println("Mảng sau khi sử dụng insertionSort: " + Arrays.toString(array));
    }
}
