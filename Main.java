import entidades.*;

public class Main {
    
    public static void main(String[] args) {
        
        
        Cliente Ana = new Cliente("Ana Maria da Silva", "12345678-90", "Rua dos Sonhos, 321", 3600.00, "(11)99999-3434", "23/04/1983");
       Conta poupancaAna = new ContaPoupanca(Ana);
       Conta correnteAna = new ContaCorrente(Ana);

       System.out.println(poupancaAna.getAgencia());
        System.out.println(correnteAna.getNumeroConta());
    }
}
