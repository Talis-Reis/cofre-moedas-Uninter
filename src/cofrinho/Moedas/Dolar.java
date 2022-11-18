package cofrinho.Moedas;

public class Dolar extends Moeda {
    public Dolar(float dado, String tipo) {
        super(dado, tipo);
    }

    @Override
    public void getMoeda() {
        System.out.println("Dolar - "+ dado);
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
        return (float) (dado * 5.34);
    }
}
