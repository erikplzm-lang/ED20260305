package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

public class VistaGeneral {
    private static Scanner scanner;

    public VistaGeneral() {
        scanner = new Scanner(System.in);
    }

    // Mostrar texto normal
    public void mostrarTexto(String texto) {
        System.out.println(texto);
    }

    // Mostrar aviso
    public static void mostrarAviso(String texto) {
        System.out.println("⚠ " + texto);
    }

    // Mostrar título principal
    public void mostrarTitulo1(String texto) {
        System.out.println("\n=== " + texto.toUpperCase() + " ===");
    }

    // Mostrar título secundario
    public void mostrarTitulo2(String texto) {
        System.out.println("\n-- " + texto + " --");
    }

    // Pedir número al usuario
    public static int pedirNumero(String texto) {
        System.out.print(texto + ": ");
        return scanner.nextInt();
    }

    // Pausa del programa
    public void pausa(String texto) {
        System.out.println(texto);
        System.out.println("Pulsa ENTER para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

