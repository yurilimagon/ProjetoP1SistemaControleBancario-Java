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
public abstract class Pessoa {
        //ATRIBUTOS
        //Protected para que sejam visíveis pelas subclasses
        protected String nome;
        protected String fone;
        protected String email;
        protected double idade;
        protected String cpf;
        
    //CONSTRUTORES
    //VAZIO
    public Pessoa() {
    }
    //CHEIO
    public Pessoa(String nome, String fone, String email, double idade, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
    }
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //MÉTODOS
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
    
    //MÉTODO ABSTRATO
    public abstract void exibirDados();
}
