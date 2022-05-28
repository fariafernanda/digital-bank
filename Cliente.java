public class Cliente {
    
    public String nomeCompleto;
    public String cpf;
    public String endereço;
    public Double rendaMensalAprox;
    public String telefone;
    public String dataNascimento;


    public Cliente (String nomeCompleto, String cpf, String endereço, Double rendaMensalAprox, String telefone,
            String dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereço = endereço;
        this.rendaMensalAprox = rendaMensalAprox;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }


    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEndereço() {
        return endereço;
    }


    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }


    public Double getRendaMensalAprox() {
        return rendaMensalAprox;
    }


    public void setRendaMensalAprox(Double rendaMensalAprox) {
        this.rendaMensalAprox = rendaMensalAprox;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    

    
}
