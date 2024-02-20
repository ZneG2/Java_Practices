class Dog {
    private String name;
    private String breed;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDogDetail() {
        System.out.println("Name:" + this.name + "--Breed:" + this.breed + "--Age:" + this.age);
    }
}

public class TET_HOLIDAY {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Micky");
        d.setBreed("Husky");
        d.setAge(12);
        d.printDogDetail();
    }
}