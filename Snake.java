import java.util.*;
public class Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [][] arr = new int[rows][columns];
         int count = 1;
         for (int i = 0; i < rows; i++) {
            if(i%2 == 0){
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = count ;
                    count ++;
                }
            }else{
                for (int j =columns-1 ; j >=0; j--) {
                    arr[i][j] = count ;
                    count ++;
                }
            }
         }
         System.out.println("the snake pattern is :");
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();
         }
    }
}
/* rows = 3
    column = 3
    output
    1 2 3
    6 5 4
    7 8 9
*/  
