/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author yuril
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INSTANCIANDO OBJETOS
        Presidente presidente01 = new Presidente("AMIGO", 1970, "PRES01", "99999-8888", "p1@p.com", 49, "111333444555");
        Presidente presidente02 = new Presidente("AMIGO", 1960, "PRES02", "99999-7777", "p2@p.com", 59, "666777888999");
        
        Diretor diretor01 = new Diretor(1999, "ATIVO", "DIR01", "99999-0000", "d1@d.com", 48, "12345678910");
        Diretor diretor02 = new Diretor(2010, "INATIVO", "DIR02", "99999-1111", "d2@d.com", 48, "10987654321");
        
        Gerente gerente01 = new Gerente("Compras", 2000.00, 15, "GER01", "98888-7777", "g1@g.com", 34, "000133332222");
        Gerente gerente02 = new Gerente("Vendas", 2000.00, 20, "GER02", "98888-8888", "g2@g.com", 43, "777133332222");
        
        Engenheiro engenheiro01 = new Engenheiro("Casas", "Masculino", 90.5, 1.90, "ENG01", "97777-6666", "e1@e.com", 33, "999988887777");
        Engenheiro engenheiro02 = new Engenheiro("Pontes", "Feminino", 60.1, 1.75, "ENG02", "97777-5555", "e2@e.com", 30, "555588887777");
        
        Secretario secretario01 = new Secretario("ASSDIG01", "REG01", "SEC01", "91111-2222", "s1@s.com", 28, "999944441111");
        Secretario secretario02 = new Secretario("ASSDIG02", "REG02", "SEC02", "91111-3333", "s2@s.com", 38, "111144441111");
        
         ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
         listaPessoas.add(presidente01);
         listaPessoas.add(presidente02);
         listaPessoas.add(diretor01);
         listaPessoas.add(diretor02);
         listaPessoas.add(gerente01);
         listaPessoas.add(gerente02);
         listaPessoas.add(engenheiro01);
         listaPessoas.add(engenheiro02);
         listaPessoas.add(secretario01);
         listaPessoas.add(secretario02);
         
         for(int i = 0; i < listaPessoas.size(); i++){
            listaPessoas.get(i).exibirDados();
         }
        
         Engenheiro engenheiro03 = new Engenheiro("Casas", "Masculino", 90.5, 1.90, "ENG01", "97777-6666", "e1@e.com", 33, "777766665555");
         Engenheiro engenheiro04 = new Engenheiro("Pontes", "Feminino", 60.1, 1.75, "ENG02", "97777-5555", "e2@e.com", 30, "111133332222");
         
         Engenheiro objEng1 = new Engenheiro();
         for(int j = 0; j < listaPessoas.size(); j++){
             objEng1 = (Engenheiro) listaPessoas.get(j);
             if("ENG01".equals(objEng1.getNome())){
                 System.out.println("Engenheiro: " + objEng1.getNome());
             }
         }
         Engenheiro objEng2 = new Engenheiro();
         for(int k = 0; k < listaPessoas.size(); k++){
              if("555588887777".equals(objEng1.getCpf())){
                 System.out.println("CPF: " + objEng1.getCpf());
             }
         }
    }
    /*-Método Abstrato: Obrigatoriamente deve ser implementado nas classes filho (concretas). Não pode implementar o corpo do método.
      -Função e conceito de Polimorfismo:
      A função é @Override e o conceito é a reutilização dos métodos na classe filho (métodos de mesmo nome).
      -Construtor Cheio: Método chamado para construir objetos a partir dos atributos estabelecidos pela classe.
      -Getters: Recuperar.
      -Setter: Atribuir.
      -Protected: De modo que esses atributos da classe (Pai) tenham visibilidade dentro da hierarquia de herança (super).
      -Extends: Se existir um método abstrato na classe pai, as classes filho herdam esses métodos obrigatoriamente. Se a classe pai for abstrata, as classes filho herdam seus atributos.
      -Implements: Assina os métodos da interface.
      -Casting em tipos primitivos
      -Casting em classes e objetos
      -Interface: Possui apenas a assinatura (declaração) dos métodos. A implementação dos métodos estará na classe que assinarem o contrato 
      com a interface obrigatoriamente todos os métodos declarados na interface deverão ser implementados nas classes que assinarem os métodos.
      -ArrayList – Lista de vetores de objetos instanciados.*/
    
}
