

public class Missingnumsort268 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                // int correct = arr[i] - 1;
                // if (arr[i] != arr[correct]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        } //case 2
        return arr.length;
    }

    // public static int missingNumber(int[] arr) {
    //     int i = 0;
    //     while (i < arr.length) {
    //         int correct = arr[i];
    //         if (arr[i] < arr.length && arr[i] != arr[correct]) {
    //             // if (arr[i] != arr[correct]) {
    //             swap(arr, i, correct);
    //         } else {
    //             i++;
    //         }
    // }
    //search for first missing number
// for (int index = 0; index < arr.length; index++) {
//     if (arr[index]!=index) {
//         return index;
//     }
// } //case 2
// return arr.length;
    // }
    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
