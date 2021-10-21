package cenarioRelatorios;

import java.math.BigDecimal;

public abstract class AbstractRelatorio {
    String nomeBanco, telefone, titularDaConta;
    BigDecimal saldo;

    public AbstractRelatorio (String nomeBanco, String telefone, String titularDaConta, BigDecimal saldo) {

        this.nomeBanco = nomeBanco;
        this.telefone = telefone;
        this.titularDaConta = titularDaConta;
        this.saldo = saldo;

    }
    public void exibeRelatorio() {
        geraCabecalho();
        geraRelatorio();
        geraRodape();
    }

    abstract void geraCabecalho();

    abstract void geraRelatorio();

    abstract void geraRodape();

}
