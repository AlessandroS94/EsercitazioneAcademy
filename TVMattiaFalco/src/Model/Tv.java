package Model;

import Interface.Hub;
import Interface.Telecomando;

public class Tv extends Elettrodomestici implements Telecomando, Hub {
    private Canale[] canali;
    private Canale canaleInVisione;
    private int cont = 0;

    public Tv(int max) {
        super();
        this.canali = new Canale[max];
    }

    public Canale getCanaleInVisione() {
        return canaleInVisione;
    }

    public void setCanaleInVisione(Canale canaleInVisione) {
        this.canaleInVisione = canaleInVisione;
    }

    public Canale[] getCanali() {
        return canali;
    }

    public void setCanali(Canale[] canali) {
        this.canali = canali;
    }


    public void addCanale(Canale canale){
        if (this.cont < this.canali.length) {
            this.canali[cont] = canale;
            this.cont++;
        }
    }
    public Canale trovaCanale(String name){
        for(int i = 0; i < this.cont; i++){
            if(name == canali[i].getNome()){
                return canali[i];
            }
        }
        return canaleInVisione;
    }
    public boolean exists(int n){
        for(int i = 0; i < this.cont; i++){
            if(n == canali[i].getNum()){
                return true;
            }
        }
        return false;
    }
    public Canale trovaCanale(int n){
        for(int i = 0; i < this.cont; i++){
            if(n == canali[i].getNum()){
                return canali[i];
            }
        }
        return canaleInVisione;
    }
    public Canale trovaCanaleById(int id){
        for(int i = 0; i < this.cont; i++){
            if(id == canali[i].getId()){
                return canali[i];
            }
        }
        return canaleInVisione;
    }

    public void stampaCanale(int num){
        for(int i = 0; i<this.cont; i++) {
            if (num == canali[i].getNum()) {
                String can = canali[i].getNome();
                System.out.println(can);
            }
        }
    }

    public void stampaCanali(){
        for(int i = 0; i < this.canali.length && this.canali[i] != null; i++){
            System.out.print(canali[i].getNome() + ", ");
        }
    }
    public void stampaCanaleInVisione(){
        System.out.println(this.canaleInVisione.getNome());
    }
    public String toStringRicorsivo(int n){
        if (this.canali[n+1] == null){
            System.out.println(this.canali[n].getNome());
            return "fine";
        }
        System.out.println(this.canali[n].getNome());
        return toStringRicorsivo(n+1);
    }

    @Override
    public void cambiaCanaleClick(int n) {
        this.canaleInVisione = trovaCanale(n);
    }
    @Override
    public void cambiaCanaleVoce(String name){
        this.canaleInVisione = trovaCanale(name);
    }
    @Override
    public void prossimoCanaleClick(){
        if(canaleInVisione.getId()==canali.length) {
            this.canaleInVisione = canali[0];
        }else{
            this.canaleInVisione = trovaCanaleById(canaleInVisione.getId()+1);
        }
    }
    public void precedenteCanaleClick(){
        if(canaleInVisione.getId()==1){
            this.canaleInVisione = canali[this.cont];
        }else{
            this.canaleInVisione = trovaCanaleById(canaleInVisione.getId()-1);
        }
    }

}
