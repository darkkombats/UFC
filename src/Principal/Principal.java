package Principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Lutador> lutadores = new ArrayList<>();
        Lutador lutador0 = new Lutador("Thomas", "Brasileiro", "Brasil", 72, 1.89, 24, 1.78, 15, 2, 1);
        Lutador lutador1 = new Lutador("Chales du Bronx", "Brasileiro", "Brasil", 70, 1.87, 32, 1.75, 30, 8, 1);
        Lutador lutador2 = new Lutador("Jon Jones", "Norte Americano", "Estados Unidos", 102, 2.01, 35, 1.95, 25, 1, 1);
        Lutador lutador3 = new Lutador("Islam Mackachev", "Russo", "Russia", 68, 1.76, 31, 1.75, 25, 1, 0);
        Lutador lutador4 = new Lutador("Paulo Borrachinha", "Brasileiro", "Brasil", 87, 1.90, 31, 1.56, 25, 1, 0);
        Lutador lutador5 = new Lutador("Anderson Silva", "Brasileiro", "Brasil", 85, 1.90, 38, 1.56, 25, 1, 0);
        lutadores.add(lutador0);
        lutadores.add(lutador1);
        lutadores.add(lutador2);
        lutadores.add(lutador3);
        lutadores.add(lutador4);
        lutadores.add(lutador5);

        Luta luta1 = new Luta();
        luta1.marcarLuta(lutadores.get(1), lutadores.get(3), 3, "UFC Rio");
        luta1.lutar();
    }
}
