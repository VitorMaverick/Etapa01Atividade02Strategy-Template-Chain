package cenarioCadeiaDeRequisicao;

import java.math.BigDecimal;

public abstract class Exportador {
    protected Exportador proximo;

    protected Exportador(Exportador proximo) {
        this.proximo = proximo;
    }

    public String exportar(Requisicao requisicao, Conta conta) {
        if (deveAplicar(requisicao)) {
            return efetuaExport(conta);
        }

        return proximo.exportar(requisicao, conta);
    }
    protected abstract String efetuaExport(Conta conta);
    abstract boolean deveAplicar(Requisicao requisicao);
}
