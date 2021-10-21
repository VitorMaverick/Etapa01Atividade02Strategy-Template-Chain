package cenarioRelatorios;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        RelatorioComposto composto = new RelatorioComposto( "Banco do Brasil", "984380866", "Vitor",
                new BigDecimal("100"), "Rua 2 av 1", "email@email.com",
                new Date(), 3205, 9023);
        composto.exibeRelatorio();
    }
}
