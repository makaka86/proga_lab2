package attacks.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stomp extends PhysicalMove {

    public Stomp() {
        super(Type.NORMAL, 0.9, 0.85);
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3){
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Stomp";
    }

}
