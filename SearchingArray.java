package basicjava;

import java.util.*;
public class SearchingArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] numbers = new int[n][m];
        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter your element");
        int x = sc.nextInt();
        boolean f = false;
        System.out.print("the searched element index is:");
        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                if(numbers[i][j] == x){
                    System.out.println("(" + i +","+  j+")");
                    f=true;
                }
            }
        
        }
        if(!f){
            System.out.println("element not found");
        }

        
    }
    
}
