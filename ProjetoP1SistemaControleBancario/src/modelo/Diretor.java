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
public class Diretor extends Pessoa implements IAcessoContaBancaria {
    //ATRIBUTOS
    private int anoCargo;
    private String situacao;//ATIVO/INATIVO
    
    //CONSTRUTORES
    //VAZIO
    public Diretor() {
    }
    //CHEIO
    public Diretor(int anoCargo, String situacao, String nome, String fone, String email, double idade, String cpf) {
        //ATRIBUTOS HERDADOS PELO COMANDO SUPER DA CLASSE Pessoa
        super(nome, fone, email, idade, cpf);
        this.anoCargo = anoCargo;
        this.situacao = situacao;
    }
    
    //GETTERS E SETTERS
    public int getAnoCargo() {
        return anoCargo;
    }

    public void setAnoCargo(int anoCargo) {
        this.anoCargo = anoCargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
                           "\nIdade: " + this.getIdade() + "\nCPF: " + this.getCpf() + "\nAno Cargo: " + this.getAnoCargo() + 
                           "\nSituação: " + this.getSituacao() + "\n");
    }   
    
    //MÉTODO OBRIGATÓRIAMENTE HERDADO DA INTERFACE
    @Override
    public boolean autenticacao(int senha) {
        if(senha == 4321){
            return true;
        }
        else{
            return false;
        }
    }
    
}
