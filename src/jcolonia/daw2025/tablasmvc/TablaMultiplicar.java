package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

public class TablaMultiplicar {

    private int numero;
    private List<String> listaTextos;

    // Constructor con validación mediante ExcepcionES
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

    public void generarTabla() {
        listaTextos.clear();
        for (int i = 1; i <= 10; i++) {
            listaTextos.add(numero + " x " + i + " = " + (numero * i));
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
        for (String linea : listaTextos) {
            sb.append(linea).append("\n");
        }
        return sb.toString();
    }

	public int getNumero() {
		// TODO Auto-generated method stub
		return 0;
	}
}