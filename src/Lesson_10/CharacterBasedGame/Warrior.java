package Lesson_10.CharacterBasedGame;

public class Warrior extends Character {
    private int strength;
    public int health;

    public Warrior(String name, int strength,int health) {
        super(name);
        this.strength = strength;
        this.health=health;
    }
public int damage(){
        return strength*2;

}
public int fulldamage(){
       return strength*5;
}

    @Override
    public void attack() {
        super.attack();
        System.out.println("Warrior name : "+getName()+" \nWarrior damage (G): "+strength*2);
        System.out.println("Warrior Health : "+health);
    }

    @Override
    public void useSpecialAbility() {
        super.useSpecialAbility();
        System.out.println("Special Ability damage(S) :"+strength*5);
    }


}
