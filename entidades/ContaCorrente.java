package entidades;

public class ContaCorrente extends Conta {

    private static final int DIGITO_CC = 13;

   
    public ContaCorrente(Cliente cliente){
        super(cliente);         
        this.numeroConta = setNumeroCC();
    }

    public static String setNumeroCC(){
        return AccNumber.geraNumero() + " - " + DIGITO_CC;
    }
    
}
