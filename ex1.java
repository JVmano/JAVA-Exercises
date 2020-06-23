import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class ex1 {
   public static void main(String args[]) {
        //Getting the current date value
        LocalDate currentdate = LocalDate.now();
       
        //getting the current year
        int currentYear = currentdate.getYear();
       
        // get the birth year
        int ano = 0;
        // Read the value from the user
        Scanner number = new Scanner(System.in);
        // get the result of the future math
        int total = 0;

        // scan the birth value from the user
        System.out.print("Digite o ano em que você nasceu : ");
        ano = number.nextInt();
       
        // do the math of the birth year
        total = currentYear - ano;
       
       // print the birth year
       System.out.print("Sua idade é : " + total);
       
   }
}