import java.util.Scanner;

public class ex2 {
   public static void main(String args[]) {
       
        // set the variables
        double altura = 0;
        double peso = 0;
        double imc = 0;
       
        // Read the value from the user
        Scanner number = new Scanner(System.in);

        // scan the birth value from the user
        System.out.print("Digite a sua altura : ");
        altura = number.nextDouble();
       
        System.out.print("Digite o seu peso, sua van : ");
        peso = number.nextDouble();
       
        imc = (peso / (altura * altura));
       
        System.out.print("O seu IMC é de :" + imc);
       
        if (imc <= 18.5) {
            System.out.print("\n" + "Sua classificacao e de MAGREZA, seu pau");
        } else if (imc >= 18.5 && imc <= 24.9 ) {
            System.out.print("\n" + "Sua classificacao e NORMAL" + "\n");
        } else if (imc >= 25.0 && imc <= 29.9 ) {
            System.out.print("\n" + "Sua classificacao e SOBREPESO"+ "\n");
        } else if (imc >= 30.0 && imc <= 39.9 ) {
            System.out.print("\n" + "Sua classificacao e OBESIDADE"+ "\n");
        } else if (imc > 40.0) {
            System.out.print("\n" + "Sua classificacao e OBESIDADE GRAVE");
        }
       
   }
}