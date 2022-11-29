import java.util.Arrays;

public class Tv {
 private String s[];

    public Tv(String[] s) {
        this.s = s;
    }

    public String[] getS() {
        return s;
    }

    public void setS(String[] s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "TvFDM{" +
                "s=" + Arrays.toString(s) +
                '}';
    }




}