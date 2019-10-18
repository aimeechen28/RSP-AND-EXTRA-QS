import java.util.Scanner;
class Q1{
 public static void main(String[] args){
     Scanner sc =new Scanner(System.in);
     int sum=0;
     for(int n=0;n<1000;n++){
      if(n%3 == 0||n%5 == 0){
        sum=sum+n;
        
        }
        
        }
        System.out.println("Answer" +sum);
    }
}
