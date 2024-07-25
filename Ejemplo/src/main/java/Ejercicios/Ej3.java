package Ejercicios;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ej3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        EsperaYNumero calculo = new EsperaYNumero();

        CompletableFuture<Integer> primerTarea = CompletableFuture.supplyAsync(calculo::esperaYNumero);
        CompletableFuture<Integer> segundaTarea = CompletableFuture.supplyAsync(calculo::esperaYNumero);
        CompletableFuture<Integer> terceraTarea = CompletableFuture.supplyAsync(calculo::esperaYNumero);
        CompletableFuture<Integer> cuartaTarea = CompletableFuture.supplyAsync(calculo::esperaYNumero);

        CompletableFuture<Void> allOf = CompletableFuture.allOf(primerTarea, segundaTarea, terceraTarea, cuartaTarea);
        allOf.join();
        CompletableFuture<Integer> suma = primerTarea
                .thenCombine(segundaTarea, Integer::sum)
                .thenCombine(terceraTarea, Integer::sum)
                .thenCombine(cuartaTarea, Integer::sum);

        suma.thenAccept(result -> System.out.println("Resultado de la suma: " + result));
        suma.join();
        executor.shutdown();
    }
}
