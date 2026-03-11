package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una tabla de multiplicar de un número.
 */
public class TablaMultiplicar {

    /** Número del que se generará la tabla */
    private int numero;

    /** Lista que almacena las líneas de texto */
    private List<String> listaTextos;

    /**
     * Constructor con control de excepciones
     * @param numero número del que se generará la tabla
     */
    public TablaMultiplicar(int numero) {

        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }

        if (numero > 1000) {
            throw new IllegalArgumentException("El número es demasiado grande.");
        }

        this.numero = numero;
        this.listaTextos = new ArrayList<>();
    }

    /**
     * Genera la tabla de multiplicar
     */
    public void generarTabla() {

        if (listaTextos == null) {
            throw new IllegalStateException("La lista de textos no está inicializada.");
        }

        listaTextos.clear();

        try {
            for (int i = 1; i <= 10; i++) {
                listaTextos.add(numero + " x " + i + " = " + (numero * i));
            }
        } catch (Exception e) {
            System.err.println("Error al generar la tabla: " + e.getMessage());
        }
    }

    public List<String> toListaExportacion() {
        return listaTextos;
    }

    public List<String> toListaPantalla() {
        return listaTextos;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        try {
            for (String linea : listaTextos) {
                sb.append(linea).append("\n");
            }
        } catch (Exception e) {
            return "Error al convertir la tabla a texto.";
        }

        return sb.toString();
    }
}