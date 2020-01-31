package rewertoy.leson06.homework;

import java.util.Random;

public class Animal {
    protected String name;
    protected String species;
    protected float abilityRun;
    protected float abilitySwim;
    protected float abilityJump;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    protected float stamina(float a, float b) {
        Random st = new Random();

        return st.nextFloat() * a + b;
    }


    public String run(float distance) {
        if (distance <= abilityRun) {
            return species + " " +
                    name + " пробежал " +
                    distance + " м.";
        } else {
            return species + " " +
                    name +
                    " может пробежать не более " +
                    abilityRun + " м.";
        }
    }

    public String swim(float distance) {
        if (distance <= abilitySwim) {
            return species + " " +
                    name + " проплыл " +
                    distance + " м.";
        } else {
            return species + " " +
                    name +
                    " может проплыть только " +
                    abilitySwim + " м.";
        }
    }

    public String jump(float height) {
        if (height <= abilityJump) {
            return species + " " +
                    name + " перепрыгнул " +
                    height + " м.";
        } else {
            return species + " " +
                    name +
                    " может перепрыгнуть не более " +
                    abilityJump + " м.";
        }
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public float getAbilityRun() {
        return abilityRun;
    }

    public float getAbilitySwim() {
        return abilitySwim;
    }

    public float getAbilityJump() {
        return abilityJump;
    }


}


