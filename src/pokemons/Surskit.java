package pokemons;

import attacks.physical.*;
import attacks.special.Scald;
import attacks.status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Surskit extends Pokemon {
    public Surskit(String s, int i) {
        super(s, i);
        this.setStats(40, 30, 32, 50, 52, 65);
        this.setType(Type.BUG, Type.WATER);
        this.setMove(new DoubleTeam(), new Scald(), new Facade());
    }
}
