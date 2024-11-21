package estudiantes;

import java.util.ArrayList;

public class Section {
    private ArrayList<Student> arrayStu;

    public Section() {
        arrayStu = new ArrayList<Student>();
    }
    public void addStudent(Student student) {
            arrayStu.add(student);
            System.out.println("Estudiante agregado Ok");
    }

    public void searchStudent(int id) {
        for (int i = 0; i < arrayStu.size(); i++) {
            if (!arrayStu.isEmpty() && id == arrayStu.get(i).getId()) {
                System.out.println("Id: " + arrayStu.get(i).getId());
                System.out.println("Nombre: " + arrayStu.get(i).getName());
                System.out.println("Edad: " + arrayStu.get(i).getAge());
                System.out.println("Género: " + arrayStu.get(i).getGender());
                break;
            }
            System.out.println("No se encontró el Id del estudiante");
        }
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < arrayStu.size(); i++) {
            if (!arrayStu.isEmpty() && id == arrayStu.get(i).getId()) 
                arrayStu.remove(i);
        }
    }

    public void printGender(String gender) {
        if (!arrayStu.isEmpty()) {
            for (int i = 0; i < arrayStu.size(); i++) {
                if (gender.equals(arrayStu.get(i).getGender())) 
                    System.out.println(arrayStu.get(i).getName() + " es: " + arrayStu.get(i).getGender());
            }
        } else
            System.out.println("Lista vacía...");
    }
    @Override
    public String toString() {
        if (!arrayStu.isEmpty())
            return "Section [arrayStu=" + arrayStu + "]";
        else return "Lista vacía...";
    }   
}

