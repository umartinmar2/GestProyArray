public class GestProy {

    // region atributos
    private Proyecto proyecto1;
    private Proyecto proyecto2;
    private Proyecto proyecto3;
    private Proyecto proyecto4;
    // endregion

    // getters y setters
    public Proyecto getProyecto(int numero) {
        switch (numero){
            case 1: return proyecto1;
            case 2: return proyecto2;
            case 3: return proyecto3;
            case 4: return proyecto4;
        }
        return null;
    }

    public void setProyecto(int numero, Proyecto proyecto) {
        switch (numero){
            case 1: proyecto1 = proyecto; break;
            case 2: proyecto2 = proyecto; break;
            case 3: proyecto3 = proyecto; break;
            case 4: proyecto4 = proyecto; break;
        }
    }
    // endregion

    public void terminarProyecto(int numProyecto) {
        // TODO 31: Terminar proyecto

    }

    public boolean puedeHaberMasProyectos() {
        return getCantidadProyectosActivos() < Ctes.MAX_NUM_PROYECTOS_GESTOR;
    }

    public int getMaxNumProyectos() {
        return Ctes.MAX_NUM_PROYECTOS_GESTOR;
    }

    public int getCantidadProyectosActivos() {
        int cantidad = 0;
        // TODO 32: Contar el número de proyectos activos utilizando un bucle






        return cantidad;
    }

    public boolean addHorasProyecto(int numeroProyecto, int numeroHoras) {
        // TODO 33: Añadir horas al número de proyecto indicado
        // Si el proyecto no existe devolver false, sino true tras asignar las horas





        return true;
    }

    public int addProyectoNuevo(String nombreProyecto, int presupuesto) {
        // TODO 34: Agregar el proyecto si hay hueco utilizando un bucle








        return 0;
    }

    public boolean addParticipanteProyecto(int numProyecto, int numTrabajador) {
        // TODO 35: Añadir al proyecto el participante validando que el proyecto y el trabajador existe
        // si el trababajador o proyecto no existe devolver false
        // si el proyecto y el trabajador existen pero no admiten más trabajadores devolver false








        return true;
    }

    public void mostrarProyectos() {
        // TODO 36: Mostrar los proyectos junto con su número de proyecto utilizando un bucle







    }

    public void mostrarEquipoProyecto(int numProyecto) {
        // TODO 37: Mostrar el equipo si existe




    }

    public void setLiderProyecto(int numProyecto, int numParticipante) {
        Proyecto proyecto = getProyecto(numProyecto);
        if (proyecto == null) {
            return;
        }
        proyecto.setLider(numParticipante);
    }

    public void mostrarTrabajadoresEmpresa() {
        Trabajadores.mostrar();
    }

}
