import java.util.Scanner;
class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int sum =0;
        
        for ( int n = 0; n<4000000;n = a + b){
            
            
            if(n%2 == 0){
                sum=sum+n;
            }
            
            a=b;
            b=n;
            
        }
        System.out.println("answer: "  +sum);
    }
}
