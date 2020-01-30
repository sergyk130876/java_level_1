package rewertoy.leson06.homework;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, "котик");
        this.abilityRun = stamina(30, 190);
        this.abilityJump = stamina(2, 1.5f);
    }

    @Override
    protected float stamina(float a, float b) {
        return super.stamina(a, b);
    }

    @Override
    public String swim(float distance) {
        return name +
                " не может плыть, котики не плавают.";
    }
}
