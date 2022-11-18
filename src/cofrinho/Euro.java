package cofrinho;

public class Euro extends Moeda {
    Euro(float dado, String tipo) {
        super(dado, tipo);
    }

    @Override
    void getMoeda() {
        System.out.println("Euro - "+ dado);
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
        return (float) (dado * 5.54);
    }
}
