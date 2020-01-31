package rewertoy.leson06.homework;

public class Bird extends Animal {
    public Bird(String name) {
        super(name, "птичка");
        this.abilityRun = stamina(0.5f, 4.7f);
        this.abilityJump = stamina(0.2f, 0.2f);
    }

    @Override
    protected float stamina(float a, float b) {
        return super.stamina(a, b);
    }

    @Override
    public String swim(float distance) {
        return species +
                " не может плыть, она не водоплавающая!";
    }
}
