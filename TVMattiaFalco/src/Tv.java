public class Tv extends Elettrodomestici{
    private Canale[] canali;
    private int cont = 0;

    public Tv(int max) {
        super();
        this.canali = new Canale[max];
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
    public String toStringRicorsivo(int n){
        if (this.canali[n+1] == null){
            System.out.println(this.canali[n].getNome());
            return "fine";
        }
        System.out.println(this.canali[n].getNome());
        return toStringRicorsivo(n+1);
    }
}
