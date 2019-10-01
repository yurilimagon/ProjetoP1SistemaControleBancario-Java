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
public class Gerente extends Pessoa {
    //ATRIBUTOS
    private String setor;
    private double salario;
    private int qtdadePessoasGerencia;
    
    //CONSTRUTORES
    //VAZIO
    public Gerente() {
    }
    //CHEIO
    public Gerente(String setor, double salario, int qtdadePessoasGerencia, String nome, String fone, String email, double idade, String cpf) {
        //ATRIBUTOS HERDADOS PELO COMANDO SUPER DA CLASSE Pessoa
        super(nome, fone, email, idade, cpf);
        this.setor = setor;
        this.salario = salario;
        this.qtdadePessoasGerencia = qtdadePessoasGerencia;
    }
    
    //GETTERS E SETTERS
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQtdadePessoasGerencia() {
        return qtdadePessoasGerencia;
    }

    public void setQtdadePessoasGerencia(int qtdadePessoasGerencia) {
        this.qtdadePessoasGerencia = qtdadePessoasGerencia;
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
                           "\nIdade: " + this.getIdade() + "\nCPF: " + this.getCpf() + "\nSetor: " + this.getSetor() + 
                           "\nSalário: " + this.getSalario() + "\nQtde. Pessoas que Gerencia: " + 
                           this.getQtdadePessoasGerencia() + "\n");
    }    
    //MÉTODO BONIFICAÇÃO SALÁRIO
    public double bonificacao(double salario){
        if((this.qtdadePessoasGerencia > 10) && ("Compras".equals(setor))){
            salario += (salario * 0.1);
        }
        else{
            if(this.qtdadePessoasGerencia > 10){
                salario += (salario * 0.1); 
            }
            if("Compras".equals(setor)){
                salario += (salario * 0.05);
            } 
        }
        this.salario = salario;
        return this.salario;
    }
}
