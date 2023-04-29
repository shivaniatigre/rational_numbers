import java.util.Scanner;	
	
public class main_rn {	
public static void main(String[] args) {	
Scanner scanner = new Scanner(System.in);	
	
System.out.print("Enter the first rational number (in the form a/b): ");	
String input1 = scanner.next();	
String[] parts1 = input1.split("	/");
int a1 = Integer.parseInt(parts1[0]);	
int b1 = Integer.parseInt(parts1[1]);	
RationalNumber rational1 = new RationalNumber(a1, b1);	
	
System.out.print("Enter the second rational number (in the form a/b):	
");	
String input2 = scanner.next();	
String[] parts2 = input2.split("/"); int a2 = Integer.parseInt(parts2[0]);	
int b2 = Integer.parseInt(parts2[1]);	
RationalNumber rational2 = new RationalNumber(a2, b2);	
	
System.out.println("Addition: " + rational1.add(rational2));	
System.out.println("Subtraction: " + rational1.subtract(rational2));	
System.out.println("Multiplication: " + rational1.multiply(rational2));	
	
try {	
System.out.println("Division: " + rational1.divide(rational2));	
} catch (ArithmeticException e){	
System.out.println("Division by zero is not allowed.");	
}	
System.out.println("Comparison:");	
System.out.println(rational1 + " == " + rational2 + " : " +	
rational1.equals(rational2));	
System.out.println(rational1 + " > " + rational2 + " : " +	
rational1.isGreaterThan(rational2));	
System.out.println(rational1 + " < " + rational2 + " : " +	
rational1.isLessThan(rational2));	
	
System.out.println("Absolute value of " + rational1 + ": " +	
rational1.abs());	
System.out.println("Absolute value of " + rational2 + ": " +	
rational2.abs());	
	
System.out.println("Floating point representation of " + rational1 + ":	
" + rational1.toDouble());	
System.out.println("Floating point representation of " + rational2 + ":	
" + rational2.toDouble());	
}	
}	
