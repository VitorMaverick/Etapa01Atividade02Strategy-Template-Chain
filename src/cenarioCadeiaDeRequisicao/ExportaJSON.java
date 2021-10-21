package cenarioCadeiaDeRequisicao;

public class ExportaJSON extends Exportador {
    protected ExportaJSON() {
        super(null);
    }

    @Override
    protected String efetuaExport(Conta conta) {
        return "{ titular: " + conta.getNomeTitular() + "," +
                "\nsaldo: " + conta.getSaldo() + " }";

    }

    @Override
    boolean deveAplicar(Requisicao requisicao) {
        return requisicao.getFormato() == Formato.JSON;
    }
}
