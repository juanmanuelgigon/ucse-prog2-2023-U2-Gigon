package Ejercicios;

import java.util.Random;
import java.util.concurrent.*;

public class Ej4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        EsperaYNumero calculo = new EsperaYNumero();

        CompletableFuture<Integer> primerTarea = CompletableFuture.supplyAsync(calculo::esperaYNumero);
        CompletableFuture<Integer> segundaTarea = CompletableFuture.supplyAsync(calculo::esperaYNumero);
        CompletableFuture<Integer> terceraTarea = CompletableFuture.supplyAsync(calculo::esperaYNumero);
        CompletableFuture<Integer> cuartaTarea = CompletableFuture.supplyAsync(calculo::esperaYNumero);

        CompletableFuture<Object> primeraTerminada = CompletableFuture.anyOf(primerTarea, segundaTarea, terceraTarea, cuartaTarea);
        primeraTerminada.thenAccept(result ->
        {
            if (result.equals(primerTarea.join())) {
                System.out.println("Termino primera la primer tarea y su resultado es: " + result);
            }
            if (result.equals(segundaTarea.join())) {
                System.out.println("Termino primera la segunda tarea y su resultado es: " + result);
            }
            if (result.equals(terceraTarea.join())) {
                System.out.println("Termino primera la tercer tarea y su resultado es: " + result);
            }
            if (result.equals(cuartaTarea.join())) {
                System.out.println("Termino primera la cuarta tarea y su resultado es: " + result);
            }
        });
        executor.shutdown();
    }

}
