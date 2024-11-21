package asociacion;

public class Woman {
    private String name;
    private int age;
    private Man husband;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
        husband = null;
    }

    public void setHusband(Man husband) {
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void displayWomanInfo() {
        System.out.println("Nombre: " + this.name);
        System.out.println("Edad: " + this.age);
        if (husband != null) {
            System.out.println("Nombre de esposo: " + husband.getName());
            System.out.println("Edad del esposo: " + husband.getAge());
        }
    }
}
