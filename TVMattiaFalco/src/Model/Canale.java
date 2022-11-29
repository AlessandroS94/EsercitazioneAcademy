package Model;

public class Canale {
    private int id = 0;
    private int num;
    private String nome;

    public Canale(int num) {
        this.num = num;
    }

    public Canale(int num, String nome) {
        this.id = id + 1;
        this.num = num;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
