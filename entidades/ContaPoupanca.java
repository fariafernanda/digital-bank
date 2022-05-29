package entidades;


public class ContaPoupanca extends Conta{
    
    
    private static final int DIGITO_POUP = 42;
 

    public ContaPoupanca(Cliente cliente){
        super(cliente);
        this.numeroConta = setNumeroPoup();

    }

    public static String setNumeroPoup(){
        return AccNumber.geraNumero() + " - " + DIGITO_POUP;
    }

    @Override
    public String toString() {
        return "ContaPoupanca []";
    }

    
}
