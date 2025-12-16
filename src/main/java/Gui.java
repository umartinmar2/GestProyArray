import java.util.Scanner;

public class Gui {

    public static void mostrarMenu() {
        System.out.println("*****************************************");
        System.out.println("*            G E S T P R O Y            *");
        System.out.println("*****************************************");
        System.out.println(" 1. Crear un proyecto");
        System.out.println(" 2. Terminar un proyecto");
        System.out.println(" 3. Añadir horas a un proyecto");
        System.out.println(" 4. Mostrar proyectos");
        System.out.println(" 0. Exit");
        System.out.println("*****************************************");
    }

    public static int leerNumero(String txt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(txt);
        return scanner.nextInt();
    }

    public static String leerTexto(String txt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(txt);
        return scanner.nextLine().trim();
    }

}
