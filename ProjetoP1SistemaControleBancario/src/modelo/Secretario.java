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
public class Secretario extends Pessoa {
    //ATRIBUTOS
    private String assinaturaDigital;
    private String regional;
    
    //CONSTRUTORES
    //VAZIO
    public Secretario() {
    }
    //CHEIO
    public Secretario(String assinaturaDigital, String regional, String nome, String fone, String email, double idade, String cpf) {
        super(nome, fone, email, idade, cpf);
        this.assinaturaDigital = assinaturaDigital;
        this.regional = regional;
    }
    
    //GETTERS E SETTERS
    public String getAssinaturaDigital() {
        return assinaturaDigital;
    }

    public void setAssinaturaDigital(String assinaturaDigital) {
        this.assinaturaDigital = assinaturaDigital;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
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
                           "\nIdade: " + this.getIdade() + "\nCPF: " + this.getCpf() + "\nAssinatura Digital: " + this.getAssinaturaDigital() +
                           "\nRegional: " + this.getRegional() + "\n");
    }    
}
