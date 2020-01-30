package rewertoy.leson06.homework;

public class Horse extends Animal {
    public Horse(String name) {
        super(name, "лошадка");
        this.abilityRun = stamina(150, 1450);
        this.abilitySwim = stamina(20, 95);
        this.abilityJump = stamina(2, 2.5f);
    }

    @Override
    protected float stamina(float a, float b) {
        return super.stamina(a, b);
    }


}
