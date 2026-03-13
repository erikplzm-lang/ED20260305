package jcolonia.daw2025.tablasmvc;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class ControlTablaMultiplicar {

    public static final String FORMATO_RUTA_ARCHIVO_EXPORTACION =
            "tabla del %02d.txt";

    private TablaMultiplicar tabla;

    public ControlTablaMultiplicar() {
        init();
    }

    private void init() {
        cambiarTabla(); // inicializa la primera tabla
    }

    private void cambiarTabla() {
        try {
            int n = VistaGeneral.pedirNumero("Introduzca el número para la tabla");

            // Crear tabla; el constructor lanza ExcepcionES si el número es inválido
            tabla = new TablaMultiplicar(n);

            tabla.generarTabla();

        } catch (ExcepcionES e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    

    public void buclePrincipal() {

        List<String> opciones = Arrays.asList(
                "Salir",
                "Mostrar tabla",
                "Cambiar tabla",
                "Exportar tabla"
        );

        VistaMenú menu = new VistaMenú("MENÚ PRINCIPAL", opciones);
        int opcion;

        do {
            menu.mostrarTitulo();
            menu.mostrarOpciones();
            opcion = menu.pedirOpcion();

            switch (opcion) {
                case 1 -> mostrarTabla();
                case 2 -> cambiarTabla();
                case 3 -> exportarTabla();
                case 0 -> {}
                default -> opcionNoDisponible();
            }

        } while (opcion != 0);

        VistaGeneral.mostrarAviso("FIN");
    }

    private void mostrarTabla() {
        System.out.println("\n" + tabla);
    }

    private void exportarTabla() {

        try {

            int n = VistaGeneral.pedirNumero("Número de tabla a exportar");

            String nombreArchivo = String.format(FORMATO_RUTA_ARCHIVO_EXPORTACION, n);

            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo));

            for (String linea : tabla.toListaExportacion()) {
                salida.println(linea);
            }

            salida.close();

            System.out.println("Tabla exportada correctamente.");

        } catch (Exception e) {

            System.out.println("Error al exportar la tabla.");

        }
    }
    private void opcionNoDisponible() {
        VistaGeneral.mostrarAviso("Opción no disponible");
    }
}