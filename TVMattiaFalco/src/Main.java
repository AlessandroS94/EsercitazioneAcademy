public class Main {
    public static void main(String[] args) {
        int max = 10;
        Canale c = new Canale(1, "Rai 1");
        Canale c2 = new Canale(2, "Rai 2");
        Canale c3 = new Canale(5, "Canale 5");
        Tv tv = new Tv(max);
        tv.addCanale(c);
        tv.addCanale(c2);
        tv.addCanale(c3);
        tv.stampaCanale(1);
        tv.stampaCanali();
        System.out.println("\n");
        System.out.println(tv.toStringRicorsivo(0));
    }
}