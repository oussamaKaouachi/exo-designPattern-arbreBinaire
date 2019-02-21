package arbre;

public class ArbreBinaireDemo {
    public static void main(String[] args) {
        ArbreBinaire a1 = new ArbreBinaire("a1");
        ArbreBinaire a2 = new ArbreBinaire(a1, "a2");
        ArbreBinaire a3 = new ArbreBinaire("a3");
        ArbreBinaire a4 = new ArbreBinaire(a2, a3, "a4");

        a4.getEtiquette();
        a4.getIterator().nextD();
        a4.getIterator().nextG();
        System.out.println(a3.getEtiquette());
    }
}
