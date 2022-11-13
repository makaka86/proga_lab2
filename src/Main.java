import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Bouffalant p1 = new Bouffalant("Bouffalant", 1);
        Surskit p2 = new Surskit("Surskit", 1);
        Pokemon p3 = new Masquerain("Masquerain", 1);
        Pokemon p4 = new Lotad("Lotad", 1);
        Pokemon p5 = new Lombre("Lombre", 1);
        Pokemon p6 = new Ludicolo("Ludicolo", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
