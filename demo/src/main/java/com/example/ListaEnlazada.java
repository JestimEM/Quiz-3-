package com.example;


// Clase para representar un nodo en la lista enlazada
class NodoLista {
    int dato;
    NodoLista siguiente;

    // Constructor
    public NodoLista(int dato) {
        this.dato = dato;
        siguiente = null;
    }
}

// Clase para representar la lista enlazada
class ListaEnlazada {
    NodoLista cabeza; // El primer nodo de la lista

    // Constructor
    public ListaEnlazada() {
        cabeza = null;
    }

    // Método para insertar un nuevo nodo al inicio de la lista
    public void insertarAlInicio(int dato) {
        NodoLista nuevoNodo = new NodoLista(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    // Método para insertar un nuevo nodo al final de la lista
    public void insertarAlFinal(int dato) {
        NodoLista nuevoNodo = new NodoLista(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }
        NodoLista ultimo = cabeza;
        while (ultimo.siguiente != null) {
            ultimo = ultimo.siguiente;
        }
        ultimo.siguiente = nuevoNodo;
    }

    // Método para imprimir los elementos de la lista
    public void imprimirLista() {
        NodoLista nodoActual = cabeza;
        while (nodoActual != null) {
            System.out.print(nodoActual.dato + " ");
            nodoActual = nodoActual.siguiente;
        }
        System.out.println();
    }



    // Método para buscar un elemento en la lista
    public boolean buscar(int valor) {
        NodoLista nodoActual = cabeza;
        while (nodoActual != null) {
            if (nodoActual.dato == valor) {
                return true; // Se encontró el elemento
            }
            nodoActual = nodoActual.siguiente;
        }
        return false; // No se encontró el elemento
    }
}

