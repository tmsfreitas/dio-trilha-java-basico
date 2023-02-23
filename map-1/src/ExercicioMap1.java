import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.sound.sampled.SourceDataLine;

public class ExercicioMap1 {
    
    public static void main(String[] args) {
        
    System.out.println("Crie um dicionário que relacione ios modelos e seus respectivos consumos: ");
    Map<String, Double> carrosPopulares = new HashMap<>(){{
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
    }};
    System.out.println(carrosPopulares);

    System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
    System.out.println(carrosPopulares);

    System.out.println("Confira se Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

    System.out.println("Confira se Uno está no dicionário: " + carrosPopulares.containsKey("uno"));

    System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("uno"));

    System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

    System.out.println("Exiba o consumo dos carros: " + carrosPopulares.values());
    // Exemplo para a situação acima: 
    // System.out.println("Exiba o consumo dos carros: ");
    // Collections <Double> consumos = carrosPopulares.values();
    // System.out.println(consumos);
    System.out.println("Exiba o modelos mais econômico e seu consumo: ");
    Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
    Set <Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
    String modeloMaisEficiente = "";

    for (Map.Entry<String,Double> entry:entries) {
        if (entry.getValue().equals(consumoMaisEficiente))
            modeloMaisEficiente = entry.getKey();
    }

    System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

    System.out.println("Exiba o modelo menos econômico: ");
    Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
    String modeloMenosEficiente = "";

    for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()){
        if (entry.getValue().equals(consumoMenosEficiente)){
            modeloMenosEficiente = entry.getKey();
            System.out.println("Modelos menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
        }
    }

    Iterator<Double> iterator = carrosPopulares.values().iterator();
    Double soma = 0d;
    while (iterator.hasNext()){
        soma += iterator.next();
    }
    System.out.println("Exiba a soma dos consumos: " + soma);

    System.out.println("Exiba a média dos consumos: " + (soma/carrosPopulares.size()));

    System.out.println("Remova os modelos com consumo igual a 15,6: ");
    Iterator<Double> iterator1 = carrosPopulares.values().iterator();
    while (iterator1.hasNext()){
        if (iterator1.next().equals(15.6)) iterator1.remove();
    }
    System.out.println(carrosPopulares);

    System.out.println("Exiba todos os carros na ordem que foram informados: ");
    Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
    }};
    System.out.println(carrosPopulares1);

    System.out.println("Exiba o dicionário ordenado pelo modelo: ");
    Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
    System.out.println(carrosPopulares2.toString());    

    System.out.println("Apague o dicionário!");
    carrosPopulares.clear();

    System.out.println("Verifique se p dicionário está vazio: " + carrosPopulares.isEmpty());
    
    }
}

