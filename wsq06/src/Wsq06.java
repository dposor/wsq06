import java.util.Scanner;

public class Wsq06 {

	public static void main(String finn[]){
		
		System.out.println("Hello, this program calculates the greatest common divisor of two numbers you choose, using the Euclidean algorithm.");	
		
		System.out.println("Give me the value of the first number.");	
		Scanner usersNumber1 = new Scanner(System.in);
		int value1 = usersNumber1.nextInt();
		FinnNumber num1 = new FinnNumber(value1);
				
		System.out.println("Give me the value of the second number.");	
		Scanner usersNumber2 = new Scanner(System.in);
		int value2 = usersNumber2.nextInt();
		FinnNumber num2 = new FinnNumber(value2);

		System.out.println("The greatest common divisor of " + num1.giveValue() + " and " + num2.giveValue() + " is " + num1.gcd(num2).giveValue() + ".");
	}	
	
}
