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
        return "Tv{" +
                "s=" + Arrays.toString(s) +
                '}';
    }

    public String toStringRicorsivo(int n, String s[])

    {
          if (n ==0) {

              System.out.println(s[n)];

              return "fine";
          }

         System.out.println(s[n]);
          return toStringRicorsivo( n-1, s[]);

    }



}