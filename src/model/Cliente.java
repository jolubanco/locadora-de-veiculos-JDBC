package model;

public class Cliente implements Autenticavel{

    private String nome;
    private String cpf;
    private AutenticacaoPratica autenticador;

    public Cliente(){
        this.autenticador = new AutenticacaoPratica();
    }

    public Cliente(String cpf){
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nome = '" + nome + '\'' +
                ", cpf = '" + cpf + '\'';
    }

    //ainda nao existem implementação para o cliente utilizar a senha!
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }
}


