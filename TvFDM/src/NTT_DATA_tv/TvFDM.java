package NTT_DATA_tv;

import java.util.Arrays;

public class TvFDM {
 private String s[];

    public TvFDM(String[] s) {
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
