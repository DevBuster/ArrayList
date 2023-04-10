package main;

import clases.ListaPersona;
import javax.swing.JOptionPane;

/**
 *
 * @author DevBuster
 */
public class Main {

    public static void main(String[] args) {
        ListaPersona listaPersona = new ListaPersona();

        int opciones;

        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("""
                                        1. Consultar persona
                                        2. Agregar persona
                                        3. Eliminar persona
                                        4. Salir
                                        """));

            switch (opciones) {
                case 1:
                    listaPersona.obtenerPersona();
                    break;
                case 2:
                    listaPersona.agregarPersona();
                    break;
                case 3:
                    listaPersona.eliminarPersona();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "programa finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No existe la opción");
            }
        } while (opciones != 4);
    }
}
