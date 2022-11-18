package cofrinho;

public class Dolar extends Moeda {
    Dolar(float dado, String tipo) {
        super(dado, tipo);
    }

    @Override
    void getMoeda() {
        System.out.println("Dolar - "+ dado);
    }

    @Override
    String getTipo() {
        return tipo;
    }

    @Override
    float getValorMoeda() {
        return dado;
    }

    @Override
    float getConversao() {
        return (float) (dado * 5.34);
    }
}
