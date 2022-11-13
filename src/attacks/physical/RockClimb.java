package attacks.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockClimb extends PhysicalMove {


    public RockClimb() {
        super(Type.NORMAL, 0.65, 1.0);
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2){
            Effect.confuse(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует RockClimb";
    }

}
