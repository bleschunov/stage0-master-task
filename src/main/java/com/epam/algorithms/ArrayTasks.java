package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] res = new int[length];

        for (int i = 1; i <= length; i++) {
            res[i - 1] = i;
        }

        return res;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }

        return res;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return i;
        }

        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] res = new String[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            res[j++] = arr[i];
        }

        return res;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                counter++;
        }

        int[] res = new int[counter];
        int j = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                res[j++] = arr[i];
        }

        return res;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        bubbleSortByArrLen(arr);

        for (int[] ints : arr) {
            bubbleSortByElemValue(ints);
        }

        return arr;
    }

    public void bubbleSortByArrLen(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length > arr[j + 1].length)
                    swapArr(j, j + 1, arr);
            }
        }
    }

    public void bubbleSortByElemValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swapInt(j, j + 1, arr);
            }
        }
    }

    public void swapArr(int indexA, int indexB, int[][] arr) {
        int[] temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public void swapInt(int indexA, int indexB, int[] arr) {
        arr[indexA] = arr[indexA] ^ arr[indexB];
        arr[indexB] = arr[indexA] ^ arr[indexB];
        arr[indexA] = arr[indexA] ^ arr[indexB];
    }

    public static void main(String[] args) {
        ArrayTasks arrayTasks = new ArrayTasks();

        arrayTasks.printDoubleArr(
                arrayTasks.sortRaggedArray(
                        new int[][]{{3, 1, 2}, {3, 2}}
                )
        );

        System.out.println();

        arrayTasks.printDoubleArr(
                arrayTasks.sortRaggedArray(
                        new int[][]{{5, 4}, {7}}
                )
        );

        System.out.println();

        System.out.println(arrayTasks.totalSum(new int[]{1, 3, 5}));
        System.out.println(arrayTasks.totalSum(new int[]{5, -3, -4}));
        System.out.println(arrayTasks.findIndexOfNumber(new int[]{99, -7, 102}, -7));
        System.out.println(arrayTasks.findIndexOfNumber(new int[]{5, -3, -4}, 10));
    }

    public void printArr(int[] arr) {
        for (int t : arr) {
            System.out.print(t + " ");
        }
    }

    public void printArr(String[] arr) {
        for (String t : arr) {
            System.out.print(t + " ");
        }
    }

    public void printDoubleArr(int[][] arr) {
        for (int[] t : arr) {
            System.out.print("[");
            printArr(t);
            System.out.print("]");
        }
    }

}
