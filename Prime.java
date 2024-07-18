public class Prime {
   public static void main(String args[]){
    isPrime(3);
   }

static void isPrime(int n){
    int count = 0;
    for (int i = 0; i <= n; i++){
        if(n%i==0){
            count++;
        }
        if (count == 2){
            System.out.println("It is a Prime number");
        }
        else {System.out.println("Not a Prime number");}
    }
}
}