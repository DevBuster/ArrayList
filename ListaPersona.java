package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DevBuster
 */
public class ListaPersona {

    ArrayList<Persona> listaPersona = new ArrayList();

    public String Entrada(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    public void agregarPersona() {
        String nombre = Entrada("Nombre de la persona");
        String apellido = Entrada("Apellido de la persona");
        String genero = Entrada("Genero de la persona");
        int edad = Integer.parseInt(Entrada("edad de la persona"));

        Persona objetoPersona = new Persona();

        objetoPersona.setNombre(nombre);
        objetoPersona.setApellido(apellido);
        objetoPersona.setGenero(genero);
        objetoPersona.setEdad(edad);
        listaPersona.add(objetoPersona);
    }

    public void obtenerPersona() {

        if (listaPersona.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        } else {
            String separador = "";
            for (int i = 0; i < listaPersona.size(); i++) {
                separador += "\nPersona numero: " + (i + 1);
                separador += "\nNombre: " + listaPersona.get(i).getNombre();
                separador += "\nApellido: " + listaPersona.get(i).getApellido();
                separador += "\nGenero: " + listaPersona.get(i).getGenero();
                separador += "\nEdad: " + listaPersona.get(i).getEdad();
            }
            JOptionPane.showMessageDialog(null, separador);
        }
    }

    public void eliminarPersona() {
        listaPersona.clear();
        JOptionPane.showMessageDialog(null, "Lista Eliminada");
    }
}
