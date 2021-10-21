package cenarioRelatorios;

import java.math.BigDecimal;

public class RelatorioSimples extends AbstractRelatorio {
    public RelatorioSimples(String nomeBanco, String telefone, String titularDaConta, BigDecimal saldo) {
        super( nomeBanco, telefone, titularDaConta, saldo);
    }

    @Override
     void geraCabecalho() {
        System.out.println("Nome do banco: " + super.nomeBanco);
    }

    @Override
    void geraRelatorio() {
        System.out.println("Titular " + super.titularDaConta + " saldo da conta: " + super.saldo);
    }

    @Override
    void geraRodape() {
        System.out.println("Telefone " + super.telefone);
    }

}
