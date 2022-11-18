package cofrinho.Moedas;

public class Euro extends Moeda {
    public Euro(float dado, String tipo) {
        super(dado, tipo);
    }

    @Override
    public void getMoeda() {
        System.out.println("Euro - "+ dado);
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
        return (float) (dado * 5.54);
    }
}
