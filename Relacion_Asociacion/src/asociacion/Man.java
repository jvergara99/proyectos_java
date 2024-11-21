package asociacion;

public class Man {
    private String name;
    private int age;
    private Woman arrWives[];
    private int nbWives;

    public Man(String name, int age) { 
        this.name = name;
        this.age = age;
        arrWives = new Woman[4];
        nbWives = 0;
    }

    public boolean addWife(Woman wife) {
        if (nbWives < arrWives.length) {
            arrWives[nbWives] = wife;
            arrWives[nbWives].setHusband(this);
            nbWives++;
            return true;
        }
        return false;
    }

    public void displayWivesInfo() {
        if (nbWives == 0) {
            System.out.println("Él es soltero");
        } else {
            for (int i = 0; i < nbWives; i++) {
                System.out.println("Esposa: " + (i + 1) +
                "\nNombre: " + arrWives[i].getName() +
                "\nEdad: " + arrWives[i].getAge());
            }
        }
    }
    
    public boolean divorce(Woman w) {
        int index = -1;
        for (int i = 0; i < nbWives; i++) {
            if (arrWives[i].getName().equals(w.getName())){
                index = i;
            }
        }
        if (index == -1) return false;
        arrWives[index] = arrWives[--nbWives];
        return true;
    }

    public Woman getYoungestWife() {
        if (nbWives == 0) return null;
        Woman temp = arrWives[0];
        for (int i = 0; i < nbWives; i++) {
            if(arrWives[i].getAge() < temp.getAge()) {
                temp = arrWives[i];
            }
        }
        return temp;
    }

    public Woman[] getWives(int a) {
        int size = 0;
        for (int i = 0; i <nbWives; i++) {
            if (arrWives[i].getAge() < a) {
                size++;
            }
        }
        if (size == 0) return null;
        Woman[] temp = new Woman[size];
        int j = 0;
        for (int i = 0; i < nbWives; i++) {
            if (arrWives[i].getAge() < a) {
                temp[j++] = arrWives[i];
            }
        }
        return temp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
     
}
