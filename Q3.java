import java.util.Scanner;
class Q3{
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int sum=0;
    int sum2=0;
    int ans=0;
    int difference;
    for(int n = 1;n<=100;n++){
       /* Math.pow(n,2);*/
       sum=sum+(int)(Math.pow(n,2));
        
    }
    for(int x = 1; x<=100;x++){
       sum2=sum2+x;
       ans=(int)(Math.pow(sum2,2));
        
    }
    difference=ans-sum;
    System.out.println(sum);
    System.out.println(ans);
    System.out.println(difference);
}
    
}
