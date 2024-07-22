package Recursion;


public class sumOfN {
    // Parameterised way
    static void Psum(int n, int sum1){
        if(n<1){
            System.out.println(sum1);
            return;
        }
        Psum(n-1, sum1+n);
    }

    // Functional Recursion
    static int sum(int n){
        if(n==0) return 0;
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Psum(5,0);
        System.out.println(sum(5));

    }
}
