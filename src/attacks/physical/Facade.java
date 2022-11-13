package attacks.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 0.7, 1);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        double baseDamage = super.calcBaseDamage(att, def);
        if (att.getCondition() == Status.BURN ||
                att.getCondition() == Status.POISON ||
                att.getCondition() == Status.PARALYZE) {
            return baseDamage * 2;
        }
        return baseDamage;
    }

    @Override
    protected String describe() {
        return "Использует Facade";
    }
}