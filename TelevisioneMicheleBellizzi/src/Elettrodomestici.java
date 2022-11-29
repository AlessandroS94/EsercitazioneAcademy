
public class Elettrodomestici {
int NumSeriale;
String produttore;
public int getNumSeriale() {
	return NumSeriale;
}
public void setNumSeriale(int numSeriale) {
	NumSeriale = numSeriale;
}
public Elettrodomestici(int numSeriale, String produttore) {
	super();
	NumSeriale = numSeriale;
	this.produttore = produttore;
}
public String getProduttore() {
	return produttore;
}
public void setProduttore(String produttore) {
	this.produttore = produttore;
}
public Elettrodomestici() {
	
}
}
