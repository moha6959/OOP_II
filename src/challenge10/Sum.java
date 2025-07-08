package challenge10;

public class Sum {

    public static int sum (int n){
        //base case 
        if(n==1){
            return 1;
        }else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        int result=sum(5);//calculates sum of numbers from 1 to 5
        System.out.println("Sum"+ result);
    }
}