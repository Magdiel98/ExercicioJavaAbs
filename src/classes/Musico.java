package classes;

public abstract class Musico extends Banda{
    @Override
    public void tocar()
    {
        System.out.println("Instrumento");
    }

    public abstract void harmonizar();
}
