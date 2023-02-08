public class ExercicioArray1 {

    public static void main(String[] args) {
        
        int[] vetor = {11, 25, 3, 74, 5, 97};

        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length -1); i >= 0; i = i - 1){
            System.out.print(vetor[i] + " ");
        }
    }
}