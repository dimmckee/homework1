package ru.geekbrains.lesson2;

public class HomeWork2 {
    private static void main(String[] args) {
        /* Задание 1 */
        int[] arr = {1, 0, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }

        System.out.println(Arrays.toString(arr));

        /* Задание 2 */

        int[] arr2 = new int[8];
        for (int i = 0, int j = 1;
        i<arr2.length ;
        i++, j = j + 3){
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));

        /* Задание 3 */


        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
        }
        System.out.println(Arrays.toString(arr3));

        /* Задание 4 */
        int[] arr4 = {6, 4, 2, 2, 16, 8, 5, 9, 3, 8,};
        int min = arr4[0], max = arr4[0], i, imin = 0, imax = 0;
        for (i = 0; i != arr4.length; i++) {
            if (arr4[i] < min) {
                min = arr4[i];
                imin = i;
            }
            if (arr4[i] > max) {
                max = arr4[i];
                imax = i;
            }
            System.out.println("max = " + max + " min = " + min);
            System.out.println("imax = " + imax + " imin = " + imin);
        }
        /* Задание 5 */

        int[][] arr5 = new int[4][4];
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5.length; j++) {
                if ((i == j) || /* ? */) {
                    arr5[i][j] = 1;
                }

            }
        }

    }
}
