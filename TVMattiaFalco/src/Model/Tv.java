package Model;

import Interface.Hub;
import Interface.Telecomando;

import java.util.ArrayList;

public class Tv extends Elettrodomestici implements Telecomando, Hub {
    private ArrayList<Canale> canali;
    private Canale canaleInVisione;

    public Tv() {
        super();
        this.canali = new ArrayList<>();
    }

    public Canale getCanaleInVisione() {
        return canaleInVisione;
    }

    public void setCanaleInVisione(Canale canaleInVisione) {
        this.canaleInVisione = canaleInVisione;
    }

    public ArrayList<Canale> getCanali() {
        return canali;
    }

    public void setCanali(ArrayList<Canale> canali) {
        this.canali = canali;
    }

    public void addCanale(Canale canale){
        this.canali.add(canale);
    }
    public Canale trovaCanale(String name){
        for(int i = 0; i<canali.size(); i++){
            if(canali.get(i).getNome() == name){
                return canali.get(i);
            }
        }
        return canaleInVisione;
    }
    public boolean exists(int n){
        if (canali.contains(trovaCanale(n))){
            return true;
        }
        return false;
    }
    public Canale trovaCanale(int n){
        for(int i = 0; i < this.canali.size(); i++){
            if(canali.get(i).getNum() == n){
                return canali.get(i);
            }
        }
        return canaleInVisione;
    }
    public Canale trovaCanaleById(int id){
        for(int i = 0; i < this.canali.size(); i++){
            if(canali.get(i).getId()==id){
                return canali.get(i);
            }
        }
        return canaleInVisione;
    }

    public void stampaCanale(int num){
        System.out.println(trovaCanale(num).getNome());
    }

    public void stampaCanali(){
        for(int i = 0; i < this.canali.size() && this.canali.get(i) != null; i++){
            System.out.print(canali.get(i).getNome() + ", ");
        }
    }
    public void stampaCanaleInVisione(){
        System.out.println(this.canaleInVisione.getNome());
    }
    public String toStringRicorsivo(int n){
        if (this.canali.get(n+1) == null){
            System.out.println(this.canali.get(n).getNome());
            return "fine";
        }
        System.out.println(this.canali.get(n).getNome());
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
        if(canaleInVisione.getId()==canali.size()) {
            this.canaleInVisione = canali.get(0);
        }else{
            this.canaleInVisione = trovaCanaleById(canaleInVisione.getId()+1);
        }
    }
    public void precedenteCanaleClick(){
        if(canaleInVisione.getId()==1){
            this.canaleInVisione = canali.get(this.canali.size());
        }else{
            this.canaleInVisione = trovaCanaleById(canaleInVisione.getId()-1);
        }
    }


}
