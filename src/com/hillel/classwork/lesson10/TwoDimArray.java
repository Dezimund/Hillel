package classwork.lesson10;

public class TwoDimArray {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            arr[0][0] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }



    }
}
