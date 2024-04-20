package com.example;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // Realizar 10 pruebas
        for (int prueba = 1; prueba <= 10; prueba++) {
            System.out.println("Prueba #" + prueba + ":");

            // Generar 10K elementos aleatorios
            int numElementos = 10000;
            Random random = new Random();
            int[] elementos = new int[numElementos];
            for (int i = 0; i < numElementos; i++) {
                elementos[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
            }

            // Crear lista enlazada y árbol binario
            ListaEnlazada lista = new ListaEnlazada();
            ArbolBinario arbol = new ArbolBinario();

            // Insertar elementos en ambas estructuras
            for (int elemento : elementos) {
                lista.insertarAlFinal(elemento);
                arbol.insertar(elemento);
            }

            // Medir tiempo de búsqueda en lista enlazada
            long tiempoInicioLista = System.nanoTime();
            boolean encontradoLista = lista.buscar(10);
            long tiempoFinLista = System.nanoTime();
            long tiempoLista = tiempoFinLista - tiempoInicioLista;

            // Medir tiempo de búsqueda en árbol binario
            long tiempoInicioArbol = System.nanoTime();
            boolean encontradoArbol = arbol.buscar(10);
            long tiempoFinArbol = System.nanoTime();
            long tiempoArbol = tiempoFinArbol - tiempoInicioArbol;

            // Imprimir resultados
            System.out.println("Búsqueda en lista enlazada:");
            System.out.println("Elemento 10 encontrado: " + encontradoLista);
            System.out.println("Tiempo de búsqueda: " + tiempoLista + " nanosegundos");

            System.out.println();

            System.out.println("Búsqueda en árbol binario:");
            System.out.println("Elemento 10 encontrado: " + encontradoArbol);
            System.out.println("Tiempo de búsqueda: " + tiempoArbol + " nanosegundos");

            // Calcular y mostrar la diferencia de tiempos
            long diferenciaTiempos = tiempoLista - tiempoArbol;
            System.out.println("Diferencia de tiempos (Lista - Árbol): " + diferenciaTiempos + " nanosegundos");
            System.out.println();
        }
    }
}
