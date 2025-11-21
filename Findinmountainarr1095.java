public class Findinmountainarr1095 {
    public static void main(String[] args) {
        /*we have not posted this at leetcode as we need to have the 
        knowledge of oop and modify the code */
    }

    int search(int[] arr, int target) {
        int peak = peakindexinmountainarray(arr);
        int firsttry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firsttry!=-1) {
            return firsttry;
        } //try to search in second half
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
}
    public int peakindexinmountainarray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in the ans , but look at left
                //this may be the ans, but look at left
                //this is why end ! = mid -1
                end = mid;
            } else {
                //you are in the asc part of array
                start = mid + 1;//because we know that mid +1 element>mid element
            }
        }
        //in the end,start == end and pointing to the largest num because of the 2 checks above 
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element ,that is the max one because that is what the checks say
        //more elaboration: at every point of time for start and end,they have the best possible answer till that time
        //and if we are saying that only one item is remaining , hence cuz that is the best possible ans
        return start; // or return end as both are =
    }
 static int orderAgnosticBinarySearch(int[] arr, int target, int start,int end) {
        // Check if array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;  // target not found
    }
}
