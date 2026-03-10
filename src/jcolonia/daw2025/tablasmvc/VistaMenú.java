package jcolonia.daw2025.tablasmvc;

import java.io.Console;

import java.util.List;
import java.util.Scanner;

public class VistaMenú {
    private String titulo;
    private List<String> opciones;

    // Constructor
    public void Menu(String titulo, List<String> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    // Mostrar el título del menú
    public void mostrarTitulo() {
        System.out.println("=== " + titulo + " ===");
    }

    // Mostrar todas las opciones
    public void mostrarOpciones() {
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i));
        }
    }

    // Pedir al usuario que seleccione una opción
    public int pedirOpcion() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        while (opcion < 1 || opcion > opciones.size()) {
            System.out.print("Seleccione una opción (1-" + opciones.size() + "): ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion < 1 || opcion > opciones.size()) {
                    System.out.println("Opción inválida. Intente de nuevo.");
                }
            } else {
                System.out.println("Debe ingresar un número.");
                scanner.next(); // Limpiar entrada inválida
            }
        }
        return opcion;
    }

    // Mostrar un texto cualquiera
    public void mostrarTexto(String texto) {
        System.out.println(texto);
    }

    // Método para ejecutar el menú completo (opcional)
    public int ejecutar() {
        mostrarTitulo();
        mostrarOpciones();
        return pedirOpcion();
    }
}