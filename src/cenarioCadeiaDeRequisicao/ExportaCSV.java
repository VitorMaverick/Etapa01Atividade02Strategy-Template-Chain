package cenarioCadeiaDeRequisicao;

public class ExportaCSV extends Exportador {
    protected ExportaCSV(Exportador proximo) {
        super(proximo);
    }

    @Override
    protected String efetuaExport(Conta conta) {
        return conta.getNomeTitular() + "%" + conta.getSaldo();
    }

    @Override
    boolean deveAplicar(Requisicao requisicao) {
        return requisicao.getFormato() == Formato.CSV;
    }

}
