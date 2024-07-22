package Basics;
public class countDigits {
    public static void main(String args[]){
        countDigit(123456);
    }   
    static void countDigit(int n){
        int temp = 0;
        while (n>0) {
            n = n/10;
            temp++;
        }
        System.out.println(temp);
    } 
}

