package design;

public class FindClosetToTarget {

    static int findClosest(int[] arr, int n, int target){
        int left = 0, right=n-1;
        while(left < right){
            if(Math.abs(arr[left] - target)
                    <= Math.abs(arr[right] - target)){
                right--;
            } else {
                left ++;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 6, 8, 8, 9 };
        int n = arr.length;
        int target = 11;
        System.out.println(findClosest(arr, n, target));
    }
}
