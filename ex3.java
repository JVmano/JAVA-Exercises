import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		double celsius = 0;
		Scanner t = new Scanner(Systm.in);

		System.out.print("Temperatura Celsius: ");
		celsius = t.nextDouble();

		System.out.print(" Graus Kelvin: " + (celsius + 273.15) + "\n");
		System.out.print(" Graus Fahrenheit: " + (celsius * 1.8 + 32) + "\n");
	}
}	
