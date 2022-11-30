package it.nttdata;

public class TV extends Elettrodomestici {

    String[] canali;

    public String[] getCanali() {
		return canali;
	}



	public void setCanali(String[] canali) {
		this.canali = canali;
	}



	public TV(int numero_seriale, String produttore) {
        super(numero_seriale, produttore);
    }


    
   @Override
    public String toString(){
        return "produttore: "+this.getProduttore()+
                ", numero_seriale: "+this.getNumero_seriale()+
                ", Canali disponibili: "+this.canali;
    }

}
