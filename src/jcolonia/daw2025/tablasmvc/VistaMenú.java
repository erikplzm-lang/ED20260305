package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa una vista de menú en consola.
 * <p>
 * Permite mostrar un título, una lista de opciones y solicitar al usuario
 * que seleccione una opción mediante teclado.
 * </p>
 * 
 * @author 
 */
public class VistaMenú {

    /** Título que se mostrará en el menú. */
    private String titulo;

    /** Lista de opciones que se mostrarán al usuario. */
    private List<String> opciones;

    /** Objeto Scanner compartido para leer datos desde teclado. */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Constructor del menú.
     * 
     * @param titulo título que se mostrará en el menú
     * @param opciones lista de opciones disponibles para el usuario
     */
    public VistaMenú(String titulo, List<String> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    /**
     * Muestra el título del menú en la consola.
     */
    public void mostrarTitulo() {
        System.out.println("=== " + titulo + " ===");
    }

    /**
     * Muestra todas las opciones disponibles del menú numeradas.
     */
    public void mostrarOpciones() {
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println(i + ". " + opciones.get(i));
        }
    }

    /**
     * Solicita al usuario que seleccione una opción del menú.
     * 
     * @return número de la opción introducida por el usuario
     */
    public int pedirOpcion() {
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }
}