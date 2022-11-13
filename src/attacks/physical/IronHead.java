package attacks.physical;

import ru.ifmo.se.pokemon.*;


public class IronHead extends PhysicalMove {

    public IronHead() {
        super(Type.STEEL, 0.8, 1.0);
    }

    @Override
        protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3){
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует IronHead";
    }

}
