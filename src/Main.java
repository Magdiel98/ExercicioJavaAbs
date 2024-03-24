import classes.Banda;
import classes.Guitarrista;
import classes.Musico;

public class Main {
    public static void main(String[] args) {

        Banda beatles = new Guitarrista();

        System.out.println(beatles instanceof Banda);
        System.out.println(beatles instanceof Musico);
        System.out.println(beatles instanceof Guitarrista );

    }
}