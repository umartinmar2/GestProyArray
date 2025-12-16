public class Trabajador {

    private String nombre;
    private int categoria;

    public Trabajador(String nombre, int categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public Trabajador(String nombre) {
        this.nombre = nombre;
        this.categoria = Ctes.CAT_PRACTICAS;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioHora() {
        switch (categoria) {
            case Ctes.CAT_PRACTICAS: return Ctes.PRECIO_HORA_PRACTICAS;
            case Ctes.CAT_JUNIOR: return Ctes.PRECIO_HORA_JUNIOR;
            case Ctes.CAT_SENIOR: return Ctes.PRECIO_HORA_SENIOR;
        }
        return 0;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        // TODO 51: Mostrar la información del trabajador según el formato dado utilizando String.format
        // 10 espacios para el nombre alineado a la izquierda seguido de su precio hora espacio y "E." utilizando format
        // 123456789012345678901234567890
        // Aitor     90 E.
        return "";
    }

}
