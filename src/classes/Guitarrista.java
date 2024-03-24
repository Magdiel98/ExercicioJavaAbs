package classes;

public class Guitarrista extends Musico{
    @Override
    public void tocar(){
        System.out.println("Guitarra");
    }

    @Override
    public void harmonizar() {
        System.out.println("Cadência Half: V7-I");
    }

    public void solar()
    {
        System.out.println("Solar em modo grego Mixolídio.");
    }
}
