import java.util.Scanner;
public class Triangle{
    public static void main(String[] agrs){
        Scanner sc  = new Scanner(System.in);

        System.out.print(" enter  angle1 :");
        int angle1 = sc.nextInt();
        
        System.out.print(" enter  angle2 :");
        int angle2 = sc.nextInt();

        System.out.print(" enter  angle3 :");
        int angle3 = sc.nextInt();

        int sum;
         sum = angle1+angle2+angle3;
        
        if (sum ==180){
            
            System.out.println("is triangle");
        }
        else {
            System.out.println("not trianlge");
        }
        sc.close();;


    }
}