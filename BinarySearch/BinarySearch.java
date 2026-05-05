// package BinarySearch;

public class BinarySearch {
    public static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // found
            }

            else if (arr[mid] < target) {
                start = mid + 1; // go right
            } else {
                end = mid - 1; // go left
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7 };
        System.out.println(BinarySearch(arr, 3));
    }

}
