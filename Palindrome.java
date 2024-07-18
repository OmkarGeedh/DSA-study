public class Palindrome {
    public static void main(String args[]){
        isPal(123454321);
    }
    
    static void isPal(int n){
        int rev = 0;
        int temp=n;
        while(temp!=0){
            int ld= temp%10;
            rev = rev*10+ld;
            temp = temp/10;
        }
        if(rev == n){System.out.println("Palindrome");} else{System.out.println("no");}
    }
}
