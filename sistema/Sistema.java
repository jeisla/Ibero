package sistema;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import docentes.Docente;
import estudiantes.Estudiante;
import persona.Persona;
import administrativos.Administrativo;
import proveedores.Proveedor;
import java.awt.HeadlessException;


public class Sistema {

    // Atributos
    ArrayList<Persona> docentes;
    ArrayList<Persona> estudiantes;
    ArrayList<Persona> proveedores;
    ArrayList<Persona> administrativos;
    ArrayList<Persona> listaSeleccionada;
    Persona individuoSeleccionado;

    // Constructor
    public Sistema() {
        this.docentes = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.administrativos = new ArrayList<>();
        this.listaSeleccionada = new ArrayList<>();
        this.individuoSeleccionado = null;
    }

    // Métodos

    // Añadir un docente a la lista de docentes
    public void añadirDocente() {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del docente: ");
            String correo = JOptionPane.showInputDialog("Ingrese el correo del docente: ");
            // Crear una instancia de Docente con los datos ingresados
            Docente nuevoDocente = new Docente(nombre, correo);
            // Agregar el nuevo docente a la lista de docentes
            docentes.add(nuevoDocente);
            // Notificar al usuario que el docente ha sido añadido exitosamente
            JOptionPane.showMessageDialog(null, "Docente añadido correctamente");
        } catch (HeadlessException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error al añadir el docente: " + e.getMessage());
        }
    }

    // Añadir un estudiante a la lista de estudiantes
    public void añadirEstudiante() {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            String correo = JOptionPane.showInputDialog("Ingrese el correo del estudiante: ");
            // Crear una instancia de Estudiante con los datos ingresados
            Estudiante nuevoEstudiante = new Estudiante(nombre, correo);
            // Agregar el nuevo estudiante a la lista de estudiantes
            estudiantes.add(nuevoEstudiante);
            // Notificar al usuario que el estudiante ha sido añadido exitosamente
            JOptionPane.showMessageDialog(null, "Estudiante añadido correctamente");
        } catch (HeadlessException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error al añadir el estudiante: " + e.getMessage());
        }
    }

    // Añadir un administrativo a la lista de administrativos
    public void añadirAdministrativo() {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del administrativo: ");
            String correo = JOptionPane.showInputDialog("Ingrese el correo del administrativo: ");
            // Crear una instancia de Administrativo con los datos ingresados
            Administrativo nuevoAdministrativo = new Administrativo(nombre, correo);
            // Agregar el nuevo administrativo a la lista de administrativos
            administrativos.add(nuevoAdministrativo);
            // Notificar al usuario que el administrativo ha sido añadido exitosamente
            JOptionPane.showMessageDialog(null, "Administrativo añadido correctamente");
        } catch (HeadlessException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error al añadir el administrativo: " + e.getMessage());
        }
    }

    // Añadir un proveedor a la lista de proveedores
    public void añadirProveedor() {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proveedor: ");
            String correo = JOptionPane.showInputDialog("Ingrese el correo del proveedor: ");
            // Crear una instancia de Proveedor con los datos ingresados
            Proveedor nuevoProveedor = new Proveedor(nombre, correo);
            // Agregar el nuevo proveedor a la lista de proveedores
            proveedores.add(nuevoProveedor);
            // Notificar al usuario que el proveedor ha sido añadido exitosamente
            JOptionPane.showMessageDialog(null, "Proveedor añadido correctamente");
        } catch (HeadlessException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error al añadir el proveedor: " + e.getMessage());
        }
    }

    // Ver información personal de un individuo seleccionado
    public void verInformacionPersonal() {
        try {
            // Seleccionar a la persona
            seleccionarPersona();
            // Mostrar la información de la persona seleccionada
            JOptionPane.showMessageDialog(null, individuoSeleccionado.toString());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar la información personal: " + e.getMessage());
        }
    }

    // Ver información de todos los integrantes de una lista seleccionada
    public void verInformacionDeLaLista() {
        try {
            // Seleccionar una lista
            seleccionarLista();
            // Construir un mensaje con la información de todos los integrantes de la lista seleccionada
            StringBuilder mensaje = new StringBuilder();
            for (Persona persona : listaSeleccionada) {
                mensaje.append(persona.toString()).append("\n");
            }
            // Mostrar la información de la lista seleccionada
            JOptionPane.showMessageDialog(null, mensaje.toString());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar la información de la lista: " + e.getMessage());
        }
    }

    // Método para seleccionar una lista
    private void seleccionarLista() {
        try {
            // Implementar lógica para seleccionar una lista
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar la lista: " + e.getMessage());
        }
    }

    // Método para seleccionar un individuo de una lista
    private void seleccionarPersona() {
        try {
            // Implementar lógica para seleccionar un individuo de una lista
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar la persona: " + e.getMessage());
        }
    }

    // FUNCIONALIDAD MENU PRINCIPAL --------------------------------------------------------
    public void mostrarMenuPrincipal() {
        try {
            String[] opciones = {
                "Añadir docente",
                "Añadir estudiante",
                "Añadir administrativo",
                "Añadir proveedor",
                "Ver información individual",
                "Ver información grupal"
            };

            String eleccion = (String) JOptionPane.showInputDialog(null, "Bienvenido. Seleccione una opción", "Menú principal", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (eleccion) {
                case "Añadir docente":
                    añadirDocente();
                    break;
                case "Añadir estudiante":
                    añadirEstudiante();
                    break;
                case "Añadir administrativo":
                    añadirAdministrativo();
                    break;
                case "Añadir proveedor":
                    añadirProveedor();
                    break;
                case "Ver información individual":
                    verInformacionPersonal();
                    break;
                case "Ver información grupal":
                    verInformacionDeLaLista();
                    break;
                default:
                    System.exit(0);
            }
        } catch (HeadlessException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Fin del programa");
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    // INICIAR PROGRAMA --------------------------------------------------------------------
    public void iniciarPrograma() {
        try {
            mostrarMenuPrincipal();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Fin del programa");
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    // VOLVER A MENU PRINCIPAL -------------------------------------------------------------
    public void volverAMenuPrincipal(String mensaje, String titulo) {
        try {
            int eleccionRespuesta = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION);

            if (eleccionRespuesta == JOptionPane.YES_OPTION) {
                mostrarMenuPrincipal();
            } else {
                JOptionPane.showMessageDialog(null, "Fin del programa");
                System.exit(0);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Fin del programa");
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}	

