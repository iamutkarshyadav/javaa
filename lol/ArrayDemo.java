public class ArrayDemo {
    public static void arrayFunc(int[] arr, int target) {
        System.out.println("Pairs of the element whose sum is " + target + "are :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void arrayFunc(int[] A, int p, int[] B, int q) {
        int[] mergerdArray = new int[p + q];
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (A[i] < B[j]) {
                mergerdArray[k++] = A[i++];
            } else {
                mergerdArray[k++] = B[j++];
            }
        }
        while (i < p) {
            mergerdArray[k++] = A[i++];
        }
        while (j < q) {
            mergerdArray[k++] = B[j++];
        }
        System.out.println("Merged Array is :");
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 5, -10, 8, 5, 20 };
        int target = 10;
        arrayFunc(arr, target);
        int[] A = { 1, 5, 6, 7, 8, 9 };
        int[] B = { 2, 4, 9 };
        arrayFunc(A, A.length, B, B.length);
    }

}