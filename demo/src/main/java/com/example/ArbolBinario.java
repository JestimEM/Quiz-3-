package com.example;

// Clase para representar un nodo en el árbol binario
class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    // Constructor
    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

// Clase para representar el árbol binario
class ArbolBinario {
    Nodo raiz;

    // Constructor
    ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }

    // Método auxiliar para insertar un nuevo nodo en el árbol
    Nodo insertarNodo(Nodo raiz, int valor) {
        // Si el árbol está vacío, se crea un nuevo nodo
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // Recorrer el árbol para encontrar la posición adecuada para el nuevo nodo
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarNodo(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarNodo(raiz.derecho, valor);
        }

        // Retorna el nodo raíz modificado
        return raiz;
    }

    boolean buscar(int valor) {
        Nodo nodoActual = raiz;
        while (nodoActual != null) {
            if (valor == nodoActual.valor) {
                return true; // Elemento encontrado
            } else if (valor < nodoActual.valor) {
                nodoActual = nodoActual.izquierdo; // Buscar en el subárbol izquierdo
            } else {
                nodoActual = nodoActual.derecho; // Buscar en el subárbol derecho
            }
        }
        return false; // Elemento no encontrado
    }
}
