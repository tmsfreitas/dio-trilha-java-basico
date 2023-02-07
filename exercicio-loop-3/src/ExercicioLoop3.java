import java.util.Scanner;

public class ExercicioLoop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;
        int media;

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            soma = soma + numero;
            media = soma / 5;
            if (numero > maior) maior = numero;
            count = count + 1;
        } while(count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + media);
    }
}