package CommonDataStructuresAndAlgorithms;

public class BinarySearch {
    /*Binary Search starts from the middle point in the array and then evaluates if target
    meets conditions from there decrement or increment the search until find the number
    */
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 19, 24, 25};
        int target = 7;
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("element found at index:" + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}