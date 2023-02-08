import java.util.Scanner;

public class ExercicioLoop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Será utilizada a tabuada de qual número? Insira aqui: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}