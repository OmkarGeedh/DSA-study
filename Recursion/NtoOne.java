package Recursion;

public class NtoOne {
    public static void main(String[] args) {
        printNos(10);
    }

    static void printNos(int N) {
        // code here
        if(N <= 0){
            return;
        }
        System.out.print(N + " ");
        printNos(N-1);
    }
}

