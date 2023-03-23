import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int a =8;
        String [][] arr = new String[a][a];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i+j)%2 ==1){
                    arr[i][j]="B ";
                }
                else {
                    arr[i][j]="W ";
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
