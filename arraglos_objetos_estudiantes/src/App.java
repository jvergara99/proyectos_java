import java.util.Scanner;

import estudiantes.Section;
import estudiantes.Student;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Section nrc301 = new Section();
        int opcion;

        do {
            System.out.println("1) Agregar\n2) Buscar\n3) Borrar\n4) Imprimir todo\n5) Imprimir por género\n6) Salir");
            opcion = in.nextInt();
            nrc301.toString();
            switch (opcion) {
                case 1: // Agregar un estudiante a la sección
                    System.out.println("Ingresa Id, Nombre, Edad, Género");
                    Student st1 = new Student(in.nextInt(), in.next(), in.nextInt(), in.next());
                    nrc301.addStudent(st1);
                    break;
                case 2: // Buscar estudiante
                    System.out.println("Ingresa Id de búsqueda: ");
                    nrc301.searchStudent(in.nextInt());
                    break;
                case 3: // Borrar estudiante
                    System.out.println("Ingresa Id de estudiante a borrar:");
                    nrc301.deleteStudent(in.nextInt());
                    break;
                case 4: // Imprimir todos los estudiantes
                    System.out.println(nrc301.toString());
                    break;
                case 5: // Imprimir por género
                    System.out.println("Ingresa género: ");
                    nrc301.printGender(in.next());
                    break;
                case 6: // Salir
                    System.out.println("Ejecución finalizada...");
                    break;
                default:
                    System.out.println("Opción incorrecta, intenta nuevamente");
                    break;
            }
        } while (opcion != 6);
    }
}


