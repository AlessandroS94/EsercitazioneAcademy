public class Elettrodomestici {
    private int numeroSeriale;
    private String produttore;

    public Elettrodomestici() {
    }

    public Elettrodomestici(int numeroSeriale, String produttore) {
        this.numeroSeriale = numeroSeriale;
        this.produttore = produttore;
    }

    public int getNumeroSeriale() {
        return numeroSeriale;
    }

    public void setNumeroSeriale(int numeroSeriale) {
        this.numeroSeriale = numeroSeriale;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }
}
