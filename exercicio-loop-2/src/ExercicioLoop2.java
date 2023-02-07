import java.util.Scanner;

public class ExercicioLoop2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite sua nota aqui: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10){
            System.out.println("Nota inválida. Digite novamente: ");
            nota = scan.nextInt();    
        }
    }
}