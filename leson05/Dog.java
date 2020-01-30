package rewertoy.leson06.homework;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, "пёсик");
        this.abilityRun = stamina(150, 450);
        this.abilitySwim = stamina(3, 8);
        this.abilityJump = stamina(0.3f, 0.4f);
    }

    @Override
    protected float stamina(float a, float b) {
        return super.stamina(a, b);
    }

}
