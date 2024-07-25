package Ejercicios;

import java.util.Random;
import java.util.concurrent.*;

public class Ej3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        Random random = new Random();
        
        CompletableFuture<Integer> primerTarea = CompletableFuture.supplyAsync(() -> {return random.nextInt(1,500);});
        CompletableFuture<Integer> segundaTarea = CompletableFuture.supplyAsync(() -> {return random.nextInt(1,500);});
        CompletableFuture<Integer> terceraTarea = CompletableFuture.supplyAsync(() -> {return random.nextInt(1,500);});
        CompletableFuture<Integer> cuartaTarea = CompletableFuture.supplyAsync(() -> {return random.nextInt(1,500);});

        CompletableFuture<Integer> suma = primerTarea
                .thenCombine(segundaTarea, Integer::sum)
                .thenCombine(terceraTarea, Integer::sum)
                .thenCombine(cuartaTarea, Integer::sum);

        suma.thenAccept(result -> System.out.println("Resultado de la suma: " + result));
        executor.shutdown();
    }
}
