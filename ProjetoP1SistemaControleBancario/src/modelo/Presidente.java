/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Presidente extends Pessoa implements IAcessoContaBancaria {
    //ATRIBUTOS
    private String indicacao;
    private int anoNascimento;
    
    //CONSTRUTORES
    //VAZIO
    public Presidente() {
    }
    //CHEIO
    public Presidente(String indicacao, int anoNascimento, String nome, String fone, String email, double idade, String cpf) {
        //ATRIBUTOS HERDADOS PELO COMANDO SUPER DA CLASSE Pessoa
        super(nome, fone, email, idade, cpf);
        this.indicacao = indicacao;
        this.anoNascimento = anoNascimento;
    }
    
    
    //GETTERS E SETTERS
    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    //MÉTODOS
    //MÉTODO HERDADO
    @Override
    public boolean validarCPF(String cpf){
        boolean valida;
        int teste;
        teste = cpf.length();
        if(teste == 11){
            valida = true;
        }
        else{
            valida = false;
        }
        return valida;
    }
    //MÉTODO HERDADO(OBRIGATÓRIAMENTE) DA CLASSE PESSOA POR SER ABSTRATO
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + this.getNome() + "\nFone: " + this.getFone() + "\nEmail: " + this.getEmail() +
                           "\nIdade: " + this.getIdade() + "\nCPF: " + this.getCpf() + "\nIndicação: " + this.getIndicacao() +
                           "\nAno de Nascimento: " + this.getAnoNascimento() + "\n");
    }    
    //MÉTODO DA SUBCLASSE
    

    //MÉTODO OBRIGATÓRIAMENTE HERDADO DA INTERFACE
    @Override
    public boolean autenticacao(int senha) {
        if(senha == 1234){
            return true;
        }
        else{
            return false;
        }
    }
}
