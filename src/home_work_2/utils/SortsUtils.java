package home_work_2.utils;

public class SortsUtils {
    /**
     * Сортирует массив методом пузырьковой сортировки
     * @param arr - заданный массив для сортировки
     */
    public static void sort(int[] arr) {
        int length=arr.length;
        int middle;
        for (int i=0; i<length-1; i++) {
            for (int j=length-1; j>i; j--) {
                if (arr[j-1]>arr[j]){
                    middle=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=middle;
                }
            }
        }
    }

    /**
     * Сортирует массив методом шейкерной сортировки
     * @param arr - заданный массив для сортировки
     */
    public static void shake(int[] arr) {
        int length=arr.length;
        int left=0;
        int right=length-1;
        boolean moves=true;
        int middle;
        while(left<right&&moves) {
            moves=false;
            for (int i=left; i<right; i++) {
                if (arr[i]>arr[i+1]) {
                    middle=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=middle;
                    moves=true;
                }
            }
            right--;

            for (int i=right; i>left; i--) {
                if (arr[i-1]>arr[i]){
                    middle=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=middle;
                    moves=true;
                }
            }
            left++;
        }
    }
}
