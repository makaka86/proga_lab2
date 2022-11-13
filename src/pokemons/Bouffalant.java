package pokemons;

import attacks.physical.IronHead;
import attacks.physical.PoisonJab;
import attacks.physical.RockClimb;
import attacks.physical.Stomp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bouffalant extends Pokemon {
    public Bouffalant(String s, int i) {
        super(s, i);
        this.setStats(95, 110, 95, 40, 95, 55);
        this.setType(Type.NORMAL);
        this.setMove(new RockClimb(), new IronHead(), new Stomp(), new PoisonJab());
    }
}
