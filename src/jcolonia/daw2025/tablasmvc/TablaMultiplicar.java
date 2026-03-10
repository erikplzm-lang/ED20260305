package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una tabla de multiplicar de un número.
 * Genera y almacena las líneas de texto correspondientes a la
 * tabla de multiplicar del número indicado.
 * 
 * Las líneas generadas se guardan en una lista de textos que puede
 * utilizarse tanto para mostrar en pantalla como para exportar.
 */
public class TablaMultiplicar {

    /** Número del que se generará la tabla de multiplicar */
    private int numero;

    /** Lista que almacena las líneas de texto de la tabla */
    private List<String> listaTextos;

    /**
     * Constructor de la clase.
     * Inicializa el número y crea la lista donde se guardarán
     * las líneas de la tabla de multiplicar.
     * 
     * @param numero número del cual se generará la tabla de multiplicar
     */
    public TablaMultiplicar(int numero) {
        this.numero = numero;
        this.listaTextos = new ArrayList<>();
    }

    /**
     * Genera la tabla de multiplicar del número indicado.
     * 
     * Crea las multiplicaciones desde 1 hasta 10 y las guarda
     * en la lista de textos con formato:
     * {@code numero x i = resultado}.
     */
    public void generarTabla() {
        listaTextos.clear();
        for (int i = 1; i <= 10; i++) {
            listaTextos.add(numero + " x " + i + " = " + (numero * i));
        }
    }

    /**
     * Devuelve la lista de textos preparada para exportación.
     * 
     * @return lista de líneas de la tabla de multiplicar
     */
    public List<String> toListaExportacion() {
        return listaTextos;
    }

    /**
     * Devuelve la lista de textos preparada para mostrar en pantalla.
     * 
     * @return lista de líneas de la tabla de multiplicar
     */
    public List<String> toListaPantalla() {
        return listaTextos;
    }

    /**
     * Convierte la tabla de multiplicar en una cadena de texto.
     * Cada línea de la tabla aparece separada por un salto de línea.
     * 
     * @return representación textual completa de la tabla de multiplicar
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String linea : listaTextos) {
            sb.append(linea).append("\n");
        }
        return sb.toString();
    }
}