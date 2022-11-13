package attacks.status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam() {
        super(Type.NORMAL, 0.0, 1.0);
    }


    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(1).stat(Stat.EVASION, 1));
    }

    @Override
    protected String describe() {
        return "использует Double Team";
    }
}
