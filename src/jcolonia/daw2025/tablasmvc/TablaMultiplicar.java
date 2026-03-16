package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una tabla de multiplicar de un número determinado.
 * <p>
 * Permite generar la tabla de multiplicar de un número entre 0 y 1000,
 * almacenando cada línea de la tabla en una lista de textos.
 * </p>
 * 
 * @author 
 */
public class TablaMultiplicar {

    /** Número del que se generará la tabla de multiplicar. */
    private int numero;

    /** Lista de textos que contiene cada línea de la tabla generada. */
    private List<String> listaTextos;

    /**
     * Constructor de la tabla de multiplicar.
     * <p>
     * Valida que el número esté dentro del rango permitido (0 a 1000).
     * </p>
     * 
     * @param numero número del que se quiere generar la tabla
     * @throws ExcepcionES si el número es negativo o mayor que 1000
     */
    public TablaMultiplicar(int numero) throws ExcepcionES {

        if (numero < 0) {
            throw new ExcepcionES("El número no puede ser negativo.");
        }

        if (numero > 1000) {
            throw new ExcepcionES("El número es demasiado grande.");
        }

        this.numero = numero;
        this.listaTextos = new ArrayList<>();
    }

    /**
     * Genera la tabla de multiplicar del número almacenado.
     * <p>
     * La tabla se genera del 1 al 10 y cada resultado se guarda como
     * una cadena de texto dentro de la lista.
     * </p>
     */
    public void generarTabla() {
        listaTextos.clear();
        for (int i = 1; i <= 10; i++) {
            listaTextos.add(numero + " x " + i + " = " + (numero * i));
        }
    }

    /**
     * Devuelve la tabla en formato de lista de textos para exportación.
     * 
     * @return lista de líneas con la tabla de multiplicar
     */
    public List<String> toListaExportacion() {
        return listaTextos;
    }

    /**
     * Devuelve la tabla en formato de lista de textos para mostrar en pantalla.
     * 
     * @return lista de líneas con la tabla de multiplicar
     */
    public List<String> toListaPantalla() {
        return listaTextos;
    }

    /**
     * Devuelve la tabla completa como una única cadena de texto.
     * Cada línea aparece separada por un salto de línea.
     * 
     * @return tabla de multiplicar en formato texto
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String linea : listaTextos) {
            sb.append(linea).append("\n");
        }
        return sb.toString();
    }

    /**
     * Obtiene el número asociado a la tabla de multiplicar.
     * 
     * @return número de la tabla
     */
    public int getNumero() {
        // TODO Auto-generated method stub
        return 0;
    }
}