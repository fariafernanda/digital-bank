public class ContaPoupanca extends Conta{
    
    
    private static final int DIGITO_POUP = 42;
 

    public ContaPoupanca(){
        super.numeroConta = AccNumber.geraNumero() + "-" + DIGITO_POUP;
    }
}
