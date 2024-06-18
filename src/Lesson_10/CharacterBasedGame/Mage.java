package Lesson_10.CharacterBasedGame;

public class Mage extends Character {
    private int intellect;
    public int health;

    public Mage(String name, int intellect,int health) {
        super(name);
        this.intellect = intellect;
        this.health=health;
    }
public int damage(){
        return intellect*2;
}

public int fulldamage(){
        return intellect*5;
}

    @Override
    public void attack() {
       super.attack();
        System.out.println("Mage name : "+getName()+"\n Mage damage(E) : "+intellect*2);
        System.out.println("Elera health : "+health);
    }

    @Override
    public void useSpecialAbility() {
        super.useSpecialAbility();
        System.out.println("Special Ability damage(D) : "+intellect*5);
    }


}
