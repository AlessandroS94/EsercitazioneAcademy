public class Tv {
    private Canale[] canali;
    private int cont = 0;

    public Tv(int max) {
        this.canali = new Canale[max];
    }

    public Canale[] getCanale() {
        return canali;
    }

    public void setCanale(Canale[] canale) {
        this.canali = canale;
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
