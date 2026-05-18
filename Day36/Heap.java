public class Heap {

        // Heapify function
        public static void heapify(int arr[], int n, int i) {
            int largest = i;       // root
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // If left child is larger
            if (left < n && arr[left] > arr[largest])
                largest = left;

            // If right child is larger
            if (right < n && arr[right] > arr[largest])
                largest = right;

            // If largest is not root
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                heapify(arr, n, largest);
            }
        }

        // Main Heap Sort function
        public static void heapSort(int arr[]) {
            int n = arr.length;

            // Step 1: Build Max Heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }

            // Step 2: Extract elements one by one
            for (int i = n - 1; i > 0; i--) {

                // Move current root to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // Call heapify on reduced heap
                heapify(arr, i, 0);
            }
        }

        // Print array
        public static void printArray(int arr[]) {
            for (int num : arr)
                System.out.print(num + " ");
            System.out.println();
        }

        // Main method
        public static void main(String[] args) {
            int arr[] = {12, 11,23,4,1, 13, 5, 6, 7};

            heapSort(arr);

            System.out.println("Sorted array:");
            printArray(arr);
        }

}
