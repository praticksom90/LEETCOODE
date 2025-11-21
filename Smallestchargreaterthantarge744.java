public class Smallestchargreaterthantarge744 {
    // public static void main(String[] args) {
    public static void main(String[] args) {
        // int[] arr = {"c","f","j"};
        // int target = 687;
        // int ans = binarysearchceiling(arr, target);
        // System.out.println(ans); // should print index 4
    }

public char nextGreatestLetter(char[] letters, char target) {
int start = 0;
int end = letters.length-1;
while (start<=end) {//letters  //find the middle element
    // int mid=(start+end/2);//might be possible that (start +end) exceeds the range of int in java
int mid = start+(end-start)/2;
if (target<letters[mid]) {
    end=mid-1;

}else{
    start=mid+1;
}
}
return letters[start%letters.length];
}

}

//     static int binarysearchceiling(int[] letters, int target) {
//   //but what if the target is greater than the greatest number in the array
// if (target>letterd.length-1]) {
//     return -1;
// }      
//         int start = 0;
//         int end = letterd.length - 1;

//         // Check if array is ascending or descending
//         boolean isAsc = letterd[start] < letterd[end];

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (letterd[mid] == target) {
//                 return mid;
//             }

//             if (isAsc) {
//                 if (target < letterd[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } else {
//                 if (target > letterd[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }
//         }

//         return start;  // target not found
//     }
// }

// }
