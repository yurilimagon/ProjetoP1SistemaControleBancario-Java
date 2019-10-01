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
public class Engenheiro extends Pessoa {
    //ATRIBUTOS
    private String projeto;
    private String sexo;
    private double peso;
    private double altura;
    //CONSTARTE
    public final String FORMAÇÃO = "ENG. CIVIL";
    
    //CONSTRUTORES
    //VAZIO
    public Engenheiro() {
    }
    //CHEIO
    public Engenheiro(String projeto, String sexo, double peso, double altura, String nome, String fone, String email, double idade, String cpf) {
        //ATRIBUTOS HERDADOS PELO COMANDO SUPER DA CLASSE Pessoa
        super(nome, fone, email, idade, cpf);
        this.projeto = projeto;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //GETTERS E SETTERS
    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
                           "\nIdade: " + this.getIdade() + "\nCPF: " + this.getCpf() + "\nProjeto: " + this.getProjeto() +
                           "\nSexo: " + this.getSexo() + "\nPeso: " + this.getPeso() + "\nAltura: " + this.getAltura() + "\n");
    }   
    //MÉTODO DE CÁLCULO DO IMC
    public double calculaIMC(double altura, double peso){
        return ((peso) / (altura * altura));
    }
    //MÉTODO DE RESULTADO DO IMC
    public void resultIMC(){
        double IMC = this.calculaIMC(this.altura, this.peso);
        System.out.println("Nome: " + this.getNome() + "\nSexo: " + this.getSexo() + "\nPeso: " + this.getPeso() + 
                   "\nAltura: " + this.getAltura() + "\nValor do IMC: " + IMC + "\nResultado do IMC: ");
        if("Homem".equals(this.sexo)){
            if(IMC < 20.7){
                System.out.print("Abaixo do peso ideal!");
            }
            else if((20.7 < IMC) && (IMC < 26.4)){
                System.out.print("Peso ideal!");
            }
            else if(IMC > 26.4){
                System.out.print("Acima do peso ideal!");
            }
        }
        else if("Mulher".equals(this.sexo)){
            if(IMC < 19){
                System.out.print("Abaixo do peso ideal!");
            }
            else if((19 < IMC) && (IMC < 25.8)){
                System.out.print("Peso ideal!");
            }
            else if(IMC > 25.8){
                System.out.print("Acima do peso ideal!");
            }
        }
    }
}
