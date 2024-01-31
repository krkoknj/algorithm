import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3, 7, 2};
        int[] b = {8, 11, 9};
        System.out.println("solution.solution(a, b) = " + solution.solution(a, b));
    }
}

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        quickSort(A, 0, A.length - 1, false);
        quickSort(B, 0, B.length - 1, true);

        for (int i = 0; i < B.length; i++) {
            answer += A[i] * B[i];
        }

        System.out.println("Arrays.toString(A) = " + Arrays.toString(A));
        System.out.println("Arrays.toString(B) = " + Arrays.toString(B));
        return answer;
    }

    public static void quickSort(int[] arr, int low, int high, boolean asc) {
        if (low < high) {
            // 피벗의 위치를 찾아서 배열을 둘로 나누고,
            // 피벗을 기준으로 왼쪽 부분 배열과 오른쪽 부분 배열을 정렬한다.
            int pivotIndex = partition(arr, low, high, asc);

            // 왼쪽 부분 배열 정렬
            quickSort(arr, low, pivotIndex - 1, asc);

            // 오른쪽 부분 배열 정렬
            quickSort(arr, pivotIndex + 1, high, asc);
        }
    }

    private static int partition(int[] arr, int low, int high, boolean acs) {
        // 피벗을 가장 오른쪽 원소로 선택
        int pivot = arr[high];

        // 피벗을 기준으로 작은 값은 왼쪽으로 큰 값은 오른쪽으로 이동
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (acs) {
                if (arr[j] >= pivot) {
                    i++;
                    swap(arr, i, j);
                }
            } else {
                if (arr[j] <= pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }

        }

        // 피벗의 위치를 확정
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}