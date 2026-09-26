import  java.util.Scanner;

public class basic{
public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

System.out.print("NAME:");

String name = scanner.nextLine();

System.out.print("YOUR AGE: ");
 int age = scanner.nextInt();
if(age>=18){

System.out.println("my name is: "+ name);
System.out.print("my age is: "+ age);
}
 else{
    System.out.println(" hello kiddo ");
 }
 




scanner.close();
}
}