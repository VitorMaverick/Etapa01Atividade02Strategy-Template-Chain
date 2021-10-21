package cenarioCadeiaDeRequisicao;

public class Conta {
    double saldo;
    String nomeTitular;

    public Conta(double saldo, String nomeTitular) {
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
}
