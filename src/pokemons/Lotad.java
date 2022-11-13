package pokemons;


import attacks.special.Scald;
import attacks.status.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lotad extends Pokemon {
    public Lotad(String s, int i) {
        super(s, i);
        this.setStats(40, 30, 30, 40, 50, 30);
        this.setType(Type.WATER, Type.GRASS);
        this.setMove(new Confide(), new Scald());
    }
}

