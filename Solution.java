import java.util.Scanner;

class Solution {
 static boolean isPrime(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0) return false;
    }
    return true;
}

public static void main(String[] args) {
   
   int t=22;
if(isPrime(t)) System.out.println("yes");
else System.out.println("no");
}

}