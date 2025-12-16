public class App {

    private GestProy gestProy;

    public App() {
        // TODO 11: Inicializar atributos

    }

    public void run() {
        int numOpc = -1;

        while (numOpc != 0) {
            Gui.mostrarMenu();
            numOpc = Gui.leerNumero("Opción: ");
            ejecutarOpcion(numOpc);
        }

    }

    private void ejecutarOpcion(int numOpc) {
        switch (numOpc) {
            case Ctes.OPC_CREAR_PROY:
                crearProyecto(); break;
            case Ctes.OPC_TERMINAR_PROY:
                terminarProyecto(); break;
            case Ctes.OPC_METER_HORAS_PROY:
                meterHorasProyecto(); break;
            case Ctes.OPC_MOSTRAR_PROYS:
                mostrarProyectos(); break;
        }
    }

    private void crearProyecto() {
        if (!gestProy.puedeHaberMasProyectos()) {
            System.out.println("Termina algún proyecto para crear uno nuevo.");
            return;
        }

        String nombre = Gui.leerTexto("Nombre del proyecto: ");
        if (nombre.isEmpty()) return;

        int presupuesto = Gui.leerNumero("Presupuesto para el proyecto: ");

        int numProyecto = gestProy.addProyectoNuevo(nombre, presupuesto);

        System.out.println("Define el equipo de desarrollo:");

        // TODO 12: Mientras no se indique la opción 0 para terminar y se puedan añadir participantes hacerlo
        // mostrar la lista de trabajadores, leer el número del trabajador y añadirlo al proyecto
        // si no se puede agregar el participante al proyecto salir del bucle








        System.out.println("Define el líder del equipo:");
        gestProy.mostrarEquipoProyecto(numProyecto);
        int numLider = Gui.leerNumero("El líder es el número (0 para ninguno): ");
        gestProy.setLiderProyecto(numProyecto, numLider);

        System.out.println("Proyecto agregado con el número " + numProyecto);
    }

    private void terminarProyecto() {
        int numProyecto = Gui.leerNumero("Indica el número del proyecto a cerrar: ");
        // TODO 13: Terminar el proyecto

        System.out.println("Hecho.");
    }

    private void meterHorasProyecto() {
        int numProyecto = Gui.leerNumero("Indica el número del proyecto: ");
        int numHoras = Gui.leerNumero("Indica el número de horas a añadir: ");
        if (!gestProy.addHorasProyecto(numProyecto, numHoras)) {
            System.out.println("Ese proyecto no existe.");
        }
        System.out.println("Hecho.");
    }

    private void mostrarProyectos() {
        // TODO 14: Mostrar proyectos

    }

}
