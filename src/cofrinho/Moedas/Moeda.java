package cofrinho.Moedas;

abstract public class Moeda {
    public float dado;
    public String tipo;

    Moeda(float dado, String tipo){
        this.dado = dado;
        this.tipo = tipo;
    }

    public abstract void getMoeda();

    public abstract String getTipo();
    public abstract float getValorMoeda();

    public abstract float getConversao();

}
