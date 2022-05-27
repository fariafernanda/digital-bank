

public class ContaCorrente extends Conta {

    private static final int DIGITO_CC = 13;

   
    public ContaCorrente(){
        super.numeroConta = AccNumber.geraNumero() + " - " + DIGITO_CC;
    }
    
}
