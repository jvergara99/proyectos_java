package estudiantes;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;

    public Student(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public void display() {
        System.out.println("Nombre: " + this.name +
        "\nId: " + this.id + 
        "\nEdad: " + this.age +
        "\nGénero: " + this.gender );
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", age=" +
         age + ", gender=" + gender + "]";
    }
}

