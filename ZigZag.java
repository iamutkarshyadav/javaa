//Question5 
import java.util.*;

class ZigZag {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n, i;
        System.out.print("Enter the size of an Array : ");
        n = sr.nextInt();
        int arr[] = new int[n];
        System.out.print("Input the array elements : ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sr.nextInt();
        }
        System.out.println("Original array :");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        boolean flag = true;
        int temp = 0;
        for (i = 0; i <= arr.length - 2; i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag;
        }
        System.out.println("Rearranged array :");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
/*
 * Output:
 * Enter the size of an Array : 7
 * Input the array elements : 4 3 7 8 6 2 1
 * Original array :4 3 7 8 6 2 1
 * Rearranged array :3 7 4 8 2 6 1
 */
