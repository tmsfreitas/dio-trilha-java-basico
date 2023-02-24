import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.logging.Filter;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI1 {
    public static <T> void main(String[] args) {

        var numerosAleatorios = 
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        
        System.out.println("Imprima todos os elementos dessa lista de String: ");

        /*PRIMEIRA SOLUÇÃO 
            numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s){
            System.out.println(s);

            }
            
        });*/

        /* SEGUNDA SOLUÇÃO COM LAMBDA
            numerosAleatorios.stream().forEach(s -> System.out.println(s));
         */

        /* TERCEIRA SOLUÇÃO COM REFERENCE METHOD  */
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");

        numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet())
            .forEach(System.out::println);

        System.out.println("Transforme essa lista de String em uma lista de números inteiros: ");

        /* PRIMEIRA SOLUÇÃO 
            numerosAleatorios.stream()
            .map(new Function<String, Integer>(){
                @Override
                public Integer apply(String s) {
                    return Integer.parseInt(s);
                }
            });
        */
        /*SOLUÇÃO ABREVIADA SEM REFERENCE METHOD
        numerosAleatorios.stream()
            .map(s -> Integer.parseInt(s));*/
        
        /*SOLUÇÃO COM REFERENCE METHOD*/

        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

        System.out.println("Pegue os numeros pares e maiors que 2 e coloque em uma lista: ");
        
        /*SOLUÇÃO EXTENSA
        List<Integer> listParesMenoresQue2 = numerosAleatorios.stream()
        .map(Integer::parseInt).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i){
                if (i%2 == 0 && i > 2 ) return true;
                return false;
            }
            
        }).collect(Collectors.toList());
        System.out.println(listParesMenoresQue2);
        */

        /*SOLUÇÃO RESUMIDA COM LAMBDA E REFERENCE METHOD*/
        List<Integer> listParesMenoresQue2 = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(i -> (i%2 == 0 && i > 2 ))
        .collect(Collectors.toList());
        System.out.println(listParesMenoresQue2);

        System.out.println("Exiba a média dos números: ");

        /*PRIMEIRA SOLUÇÃO
        numerosAleatorios.stream()
        .mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String s) {
                return Integer.paserInt(s);
            } 
        });*/

        /*SOLUÇÃO COM LAMBDA SEM A PARTE DA MÉDIA
        numerosAleatorios.stream()
        .mapToInt( s -> Integer.parseInt(s));
        */

        /*SOLUÇÃO COM LAMBDA E REFERENCE METHOD COMPLETO
        numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)*/

       /* ESTA PARTE É PRA FAZER A MÉDIA MAS SEM LAMBDA E REFERENCE METHOD
        .average()
        .ifPresent(new DoubleConsumer() {
            @Override
            public void accept(double v){
                System.out.println(v);
            }
        }); */
        
        /*VERSÃO FINAL!!! */
        numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .average()
        .ifPresent(System.out::println);
        
    }
}
    

