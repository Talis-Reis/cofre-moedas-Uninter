package cofrinho;

public class Real extends Moeda {

    Real(float dado, String tipo) {
        super(dado, tipo);
    }

    @Override
    void getMoeda() {
        System.out.println("Real - "+ dado);
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
        return dado;
    }

}
