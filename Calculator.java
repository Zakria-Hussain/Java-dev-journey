import java.util.Scanner; 

public class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1= scanner.nextInt();

        System.out.print( "Enter operator(+,-,*,/): ");

        char operator = scanner.next().charAt(0);

        System.out.print("enter num2: ");
        int num2 = scanner.nextInt();


        if(operator == '+'){
            System.out.println("Result = " + (num1+num2));
        }
        else if( operator =='-'){
            System.out.println("Result = " + (num1-num2));
        }
        else if(operator=='*'){
            System.out.println("Result = " + (num1*num2));
        }
        else if(operator == '/'){
            if(num2==0){ System.out.println("cant divide");}
            else{
            System.out.println("Result = " + (num1/num2 ));}
        } 
        else{
            System.out.println("invalid input");
        
        }
        scanner.close();
        
    }
}
