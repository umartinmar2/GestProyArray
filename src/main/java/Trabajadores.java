public class Trabajadores {

    public static Trabajador getTrabajador(int numero) {
        switch (numero) {
            case 1: return new Trabajador("Aitor", 2);
            case 2: return new Trabajador("Alba", 2);
            case 3: return new Trabajador("Ander", 1);
            case 4: return new Trabajador("Laura", 1);
            case 5: return new Trabajador("Nerea", 1);
            case 6: return new Trabajador("Edurne", 0);
            case 7: return new Trabajador("Tasio", 0);
            case 8: return new Trabajador("Iosu", 0);
        }
        return null;
    }

    public static void mostrar() {
        // TODO 61: Mostrar la información del trabajador según el formato dado utilizando printf
        // 2 espacios para el número del trabajador, luego un punto, un espacio y la representación del trabajador
        // 12345678901234567890
        //  1. Aitor     90 E.
        //  2. Alba      90 E.
        //  3. Ander     50 E.
        //  4. Laura     50 E.
        //  5. Nerea     50 E.
        //  6. Edurne    20 E.
        //  7. Tasio     20 E.
        //  8. Iosu      20 E.



    }

}
