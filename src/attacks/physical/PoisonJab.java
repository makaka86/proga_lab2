package attacks.physical;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove {

    public PoisonJab() {
        super(Type.POISON, 0.8, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (0.3 > Math.random() && !pokemon.hasType(Type.POISON) && !pokemon.hasType(Type.STEEL))
            Effect.poison(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Poison Jab";
    }
}