package cofrinho;

abstract public class Moeda {
    public float dado;
    public String tipo;

    Moeda(float dado, String tipo){
        this.dado = dado;
        this.tipo = tipo;
    }

    abstract void getMoeda();

    abstract String getTipo();
    abstract float getValorMoeda();

    abstract float getConversao();

}
