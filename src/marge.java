public class marge {

    static void marge(int arr[], int s, int e, int mid) {

        int leftArrLen = mid - s + 1;
        int rightArrLen = e - mid;

        int leftArr[] = new int[leftArrLen];
        int rightArr[] = new int[rightArrLen];

        // Copy left array
        int k = s;
        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = arr[k];
            k++;
        }

        // Copy right array
        k = mid + 1;
        for (int j = 0; j < rightArrLen; j++) {
            rightArr[j] = arr[k];
            k++;
        }

        int i = 0;
        int j = 0;
        k = s;

        // Merge both arrays
        while (i < leftArrLen && j < rightArrLen) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left array
        while (i < leftArrLen) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Remaining elements of right array
        while (j < rightArrLen) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    static void margeSort(int arr[], int l, int r) {

        int s = l;
        int e = r;

        // Base case
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;

        // Left part
        margeSort(arr, s, mid);

        // Right part
        margeSort(arr, mid + 1, e);

        // Merge
        marge(arr, s, e, mid);
    }

    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 2, 1, 4};

        margeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}