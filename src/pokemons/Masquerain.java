package pokemons;

import attacks.physical.AerialAce;
import ru.ifmo.se.pokemon.Type;

public class Masquerain extends Surskit{
    public Masquerain(String s, int i) {
        super(s, i);
        this.setStats(70, 60, 62, 100, 82 , 80);
        this.setType(Type.FLYING, Type.BUG);
        addMove(new AerialAce());
        }
    }

