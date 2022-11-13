package pokemons;

import attacks.physical.ZenHeadbutt;

public class Lombre extends Lotad{
    public Lombre(String s, int i) {
        super(s, i);
        this.setStats(60, 50, 50, 60, 70, 50);
        addMove(new ZenHeadbutt());
    }
}
