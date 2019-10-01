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
public interface IAcessoContaBancaria {
    //- INTERFACE possui apenas a assinatura (declaração) dos
    //métodos - e a implementação dos métodos estará
    //nas classes que assinarem o contrato com a minha interface
    //- OBRIGATÓRIAMENTE todos os métodos declarados na INTERFACE
    //deverão ser implementados nas classes que assinaram os
    //métodos
    public boolean autenticacao(int senha);   
    
}
