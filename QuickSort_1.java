package hellowaorldcom.company;

public class QuickSort_1 {

    // Partition method now returns int
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot to correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    // QuickSort method
    public static void Quick_Sort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            Quick_Sort(arr, low, pidx - 1);
            Quick_Sort(arr, pidx + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        Quick_Sort(arr, 0, n - 1);

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

