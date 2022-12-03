package Array;

public class binary_search {
    public static int binarysearch(int numbers[],int key) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        int result = binarysearch(numbers, key);
        if (result == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index " + result);
        }

    }
}
