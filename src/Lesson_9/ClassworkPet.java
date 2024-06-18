package Lesson_9;

public class ClassworkPet {
   private String name;
   private int hungerLevel;
   private   int happyLevel;


    public ClassworkPet(String name, int hungerLevel, int happyLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.happyLevel = happyLevel;


    }

    public void feed(){
        hungerLevel+=10;
        happyLevel-=5;

        System.out.println(hungerLevel);
        System.out.println(happyLevel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappyLevel() {
        return happyLevel;
    }

    public void setHappyLevel(int happyLevel) {
        this.happyLevel = happyLevel;
    }

    @Override
    public String toString() {
        return "ClassworkPet{" +
                "name='" + name + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", happyLevel=" + happyLevel +
                '}';
    }

    public static void main(String[] args) {
        ClassworkPet pet=new ClassworkPet("Lucy",50,100);

        System.out.println(pet);
        pet.feed();
    }
}
