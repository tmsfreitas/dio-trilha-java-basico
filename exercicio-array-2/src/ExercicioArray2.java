import java.util.Random;
import java.util.Scanner;

public class ExercicioArray2 {

    public static void main(String[] args) {
        Random random = new Random ();

        int [] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.print("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            
            System.out.println(numero + " ");
        }

        System.out.print("Sucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            
            System.out.println((numero + 1) + " ");
        }

    }
}