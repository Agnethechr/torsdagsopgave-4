import java.util.Scanner;

public class task2{
public static void main(String[]args){

Scanner scan = new Scanner(System.in);
System.out.println("Type your name");

String input = scan.nextLine();
System.out.println(input + " , type your age: ");

Scanner scan2 = new Scanner(System.in);
String input2 = scan2.nextLine();

int age = Integer.parseInt(input2);

System.out.println( age + " years old");

int yearsToRetirement = 67-age;

System.out.println("You only have " + yearsToRetirement + " years left until you can retire")


}

}