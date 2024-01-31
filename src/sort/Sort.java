package sort;

import java.util.Arrays;

/**
 * 출처 : https://velog.io/@pppp0722/%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-7%EA%B0%9C-%EC%A0%95%EB%A6%AC-Java
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 3, 5};
//        sortByBubbleSort(arr);
        sortBySelectionSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }


    /**
     * 버블 정렬
     * 비교와 교환이 모두 일어날 수 있기 때문에 코드는 단순하지만 성능은 좋지 않다.
     * @param arr
     */
    public static void sortByBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 선택 정렬
     * 맨 앞 인덱스부터 차례대로 들어갈 원소를 선택하여 정렬하는 알고리즘이다.
     * @param arr
     */
    public static void sortBySelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }

    /**
     * 배열의 두 인덱스의 원소를 교환하는 메소드이다.
     * @param arr
     * @param idx1
     * @param idx2
     */
    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

}
