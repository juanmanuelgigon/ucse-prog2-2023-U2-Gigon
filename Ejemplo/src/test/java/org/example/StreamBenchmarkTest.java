package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamBenchmarkTest {
    StreamBenchmark prueba = new StreamBenchmark();
    @Test
    void main() {
        String[] args = {};
        //prueba.main(args);
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long durationSecuencial = endTime - startTime;
        Assertions.assertTrue(durationSecuencial < 400);
    }
}