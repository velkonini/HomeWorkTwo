import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //fillArray();
        //invertArray();
        //changeArray();
        //fillDiagonal();



    }

    //Задача1
    public static void invertArray() {
        int[] arr = {0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] += 1;
            } else
                arr[i] -= 1;
        }

        System.out.println(Arrays.toString(arr));
    }

    //Задача2
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    //Задача4
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == j) || (i == 5 - 1 - j)) {
                    arr[i][j] = 1;
                }
            }

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

















