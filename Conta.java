public abstract class Conta implements iConta {

    private static final String AG_PADRAO = "0001";
   

    protected String agencia;
    protected String numeroConta;
    protected Double saldo;

    public Conta(){
        this.agencia = Conta.AG_PADRAO;
    }
    
  
    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void sacar(double valor) {
       saldo = saldo - valor;
        
    }
    @Override
    public void transferir(Conta contaDestino, double valor) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    public String getAgencia() {
        return agencia;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
  
    public Double getSaldo() {
        return saldo;
    }
  


}