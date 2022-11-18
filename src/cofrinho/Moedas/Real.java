package cofrinho.Moedas;

public class Real extends Moeda {

    public Real(float dado, String tipo) {
        super(dado, tipo);
    }

    @Override
    public void getMoeda() {
        System.out.println("Real - "+ dado);
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public float getValorMoeda() {
        return dado;
    }

    @Override
    public float getConversao() {
        return dado;
    }

}
