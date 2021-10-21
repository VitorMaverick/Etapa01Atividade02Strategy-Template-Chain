package cenarioCadeiaDeRequisicao;

public class ExportaXML extends Exportador {
    protected ExportaXML(Exportador proximo) {
        super(proximo);
    }

    @Override
    protected String efetuaExport(Conta conta) {
        return "<conta > <titular>" + conta.getNomeTitular() +
                "</titular> <saldo>" + conta.getSaldo() + "</saldo></conta>";
    }

    @Override
    boolean deveAplicar(Requisicao requisicao) {
        return requisicao.getFormato() == Formato.XML;
    }
}
