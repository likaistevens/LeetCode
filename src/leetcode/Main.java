package leetcode;

import java.util.Scanner;

/**
 *
 * @author kaili
 */
public class Main {
    public int select(int n){
        int sum = 0;
        int div = (int)Math.pow(10, 9) + 7;
        for(int i = 1; i <= n ; i ++){
            if(sum > div)   
                sum -= div;
            else
                sum += (helper(i,n) * i);
        }
        return sum;
    }    
    
//    public double helper(double m, double n){
//        double top = 1;
//        double but = 1;
//        int div = (int)Math.pow(10, 9) + 7;
//        double count = 0;
//        for(double i = m ; i > 0 ; i --){
//            but *= i;
//            count += 1;
//        }
//        for(double j = n ; j > n-count ; j --){
//            top *= j;
//        }
//        double res = (top  / but * m) / div;
//        return res;
//    }
    
    public int helper(int m, int n){
        int top = 1;
        int but = 1;
        int count = 0;
        for(int i = m ; i > 0 ; i --){
            but *= i;
            count += 1;
        }
        for(int j = n ; j > n-count ; j --){
            top *= j;
        }
        int res = top / but;
        return res;
    }
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Main main = new Main();
//        System.out.println(main.select(n));

//        int n = (int)Math.pow(10, 9) + 7;
//        System.out.println(n);
        int m = 2;
        Main main = new Main();
        System.out.println(main.select(m));
    }
}
