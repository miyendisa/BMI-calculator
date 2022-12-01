import java.util.Scanner;
public class IndexCalculator {
    public static void main(String []args){
        double weight,height,index; 
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter your weight(kg): ");
        weight=scanner.nextDouble();
        
        System.out.print("Enter your height(m): ");
        height=scanner.nextDouble();
        
        index=weight/(height*height);
        System.out.print("Your Body-Mass Index:"+ index );
    }
}
