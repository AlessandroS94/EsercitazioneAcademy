package it.nttdata;

public class Elettrodomestici {

    public int numero_seriale ;
    public String produttore;




        public int getNumero_seriale() {
        return numero_seriale;
    }

    public void setNumero_seriale(int numero_seriale) {
        this.numero_seriale = numero_seriale;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }


    public Elettrodomestici(int numero_seriale, String produttore){

        this.numero_seriale = numero_seriale;
        this.produttore= produttore;






        }
    }
