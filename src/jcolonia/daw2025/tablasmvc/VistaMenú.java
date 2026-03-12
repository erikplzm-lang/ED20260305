package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

public class VistaMenú {

    private String titulo;
    private List<String> opciones;
    private static Scanner scanner = new Scanner(System.in);

    public VistaMenú(String titulo, List<String> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    public void mostrarTitulo() {
        System.out.println("=== " + titulo + " ===");
    }

    public void mostrarOpciones() {
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println(i + ". " + opciones.get(i));
        }
    }

    public int pedirOpcion() {
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }
}