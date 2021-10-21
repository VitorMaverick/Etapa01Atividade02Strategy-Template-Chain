package cenarioCadeiaDeRequisicao;

public class ExportadorTeste {
    public static void main(String[] args) {
        Requisicao requisicao = new Requisicao(Formato.CSV);
        Conta conta = new Conta(100, "Vitor");

        Exportador exportador = new ExportaCSV(new ExportaXML(new ExportaJSON()));
        System.out.println(exportador.exportar(requisicao, conta));
    }
}
