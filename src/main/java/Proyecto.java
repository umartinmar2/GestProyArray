public class Proyecto {

    private String nombre;
    private Equipo equipo;
    private int horas;
    private int presupuesto;

    // region constructores
    public Proyecto(String nombre){
        // TODO 41: Constructor 1 Proyecto

    }
    public Proyecto(String nombre, int presupuesto) {
        // TODO 42: Constructor 2 Proyecto

    }
    // endregion

    // region getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    // endregion

    public void addHoras(int horas) {
        this.horas += horas;
    }

    public int getPrecio() {
        return horas * equipo.getPrecioHora();
    }

    public boolean addParticipante(Trabajador trabajador) {
        return equipo.addParticipante(trabajador);
    }

    public Trabajador getLider() {
        return equipo.getLider();
    }

    public void setLider(int numeroParticipante) {
        equipo.setLider(numeroParticipante);
    }
    public void mostrarEquipo() {
        // TODO 43: Mostrar el equipo

    }

    public String toString() {
        // TODO 44: Mostrar la información del proyecto según el formato dado utilizando String.format
        // 20 huecos para el nombre del proyecto y 10 para el nombre del líder alineados a la izquierda
        // 10 huecos para cada número entero alineados a la derecha. Después de las horas poner " h."
        // los tres últimos valores se corresponden con el precio de coste, el presupuesto y la diferencia
        //          1         2         3         4         5         6         7         8
        // 12345678901234567890123456789012345678901234567890123456789012345678901234567890
        // |                   |        |         |            |         |         |
        // CartasCoches        Aitor             10 h.      1300      1200      -100
        Trabajador lider = equipo.getLider();



        return "";
    }

}