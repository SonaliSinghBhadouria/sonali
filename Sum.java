package learningJava;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,290};
        int t = 90;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
            if(sum>t){
                sum=sum-arr[0];
                if(sum==t){
                    System.out.println("true");
                }
            }
            
        }

    }
    
}
