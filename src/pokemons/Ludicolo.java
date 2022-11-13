package pokemons;

import attacks.physical.Facade;

public class Ludicolo extends Lombre{
    public Ludicolo(String s, int i) {
        super(s, i);
        this.setStats(80, 70, 70, 90, 100, 70);
        addMove(new Facade());
    }
}
