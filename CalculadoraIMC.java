import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Calculadora de IMC ===");
        double peso = lerNumero(entrada, "Peso (kg): ");
        double altura = lerNumero(entrada, "Altura (m): ");

        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser maiores que zero.");
            return;
        }

        double imc = peso / (altura * altura);
        System.out.printf("%nSeu IMC é %.2f (%s).%n", imc, classificar(imc));
    }

    static String classificar(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25.0) return "Peso normal";
        if (imc < 30.0) return "Sobrepeso";
        if (imc < 35.0) return "Obesidade grau I";
        if (imc < 40.0) return "Obesidade grau II";
        return "Obesidade grau III";
    }

    // Aceita vírgula ou ponto como separador decimal
    static double lerNumero(Scanner entrada, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Double.parseDouble(entrada.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número, por exemplo 1,75.");
            }
        }
    }
}
