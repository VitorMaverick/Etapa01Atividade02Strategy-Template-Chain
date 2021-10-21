package cenarioRelatorios;

import java.math.BigDecimal;
import java.util.Date;

public class RelatorioComposto extends AbstractRelatorio {
    String endereco;
    String email;
    Date data;
    double agencia;
    double conta;

    public RelatorioComposto(String nomeBanco, String telefone, String titularDaConta, BigDecimal saldo, String endereco, String email, Date data, double agencia, double conta) {
        super( nomeBanco, telefone, titularDaConta, saldo);
        this.endereco = endereco;
        this.email = email;
        this.data = data;
        this.agencia = agencia;
        this.conta = conta;
    }

    @Override
    void geraCabecalho() {
        System.out.println("Nome do banco: " + super.nomeBanco + " Endereco: " + this.endereco +
                " Telefone " + super.telefone);

    }

    @Override
    void geraRelatorio() {
        System.out.println("Titular " + super.titularDaConta + " Agencia: " + agencia +
                "Numero da conta: " + this.conta + " saldo da conta: " + super.saldo);
    }

    @Override
    void geraRodape() {
        System.out.println("E-mail: " + this.email + " Data: " + this.data);
    }

}
