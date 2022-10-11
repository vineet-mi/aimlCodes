import java.util.*;
public class magic{
    public static void main(String[] args) {
        int n = 3;
        int[][] magicSquare = new int[n][n];

        int number = 1;
        int row = n-1;
        int column = n / 2;
        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            row -= 1;
            column += 1;
           
            if (row == n-1) {
                row -= 1;
            }
            if(column == n-1){
                column -=1;
            }
            if (row == 0 && column == n-1) {
                row += 2;
                column -= 2;
            }
                            
            }
        

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
