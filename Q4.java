import java.util.Scanner;
class Q4{

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);  
        for(int a = 1; a<=1000;a++){

            for(int b= 1; b<=1000;b++){

                double c =Math.sqrt(Math.pow(a,2)+Math.pow(b,2)); 
                if(a+b+c==1000){
                    System.out.println("A= "+a+ ",B= " +b+ ",C=" +c);
                    System.out.println("Product is " +a*b*c);
                }

            }
        }

  
  

    }

}
