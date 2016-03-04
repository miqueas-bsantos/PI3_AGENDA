/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.senac.tads.pi3.onepunchman.agenda;

import java.util.Scanner;


/**
 *
 * @author miqueas.bsantos1
 */

public class AgendaTeste {
    
    static void menu(){
        System.out.println("************** Agenda TADAS 3º **************");
        System.out.println(" 1 - Cadastrar");
        System.out.println(" 2 - Alterar");
        System.out.println(" 3 - Excluir");
        System.out.println(" 4 - Consultar");
        System.out.println(" 5 - Sair");
        System.out.println("************** Agenda TADAS 3º **************");
    }
    
    public static void main(String[] args){
     
        Agenda agenda = new Agenda();
        agenda.listarPessoas();
        
        boolean continuar = true;
        int opcao; 
        Scanner s = new Scanner(System.in);
        int id;
        String nome, telefone, email;
        StringBuffer nascimentoReverse;
        do {            
            menu();
            opcao = s.nextInt();
            
            switch(opcao){
                case 1:                  
                    System.out.println("Nome: ");
                    nome = s.next();
                    System.out.println("Data de nascimento dd-mm-yyyy: ");
                    nascimentoReverse = new StringBuffer(s.next());
                    System.out.println("telefone: ");
                    telefone = s.next();
                    System.out.println("Email: ");
                    email = s.next();
                    agenda.cadastrarPessoas(nome, new String(nascimentoReverse.reverse()), telefone, email);
                break;
                case 2:
                    System.out.println("ID contato: ");
                    id = s.nextInt();
                    System.out.println("Nome: ");
                    nome = s.next();
                    System.out.println("Data de nascimento dd-mm-yyyy: ");
                    nascimentoReverse = new StringBuffer(s.next());
                    System.out.println("telefone: ");
                    telefone = s.next();
                    System.out.println("Email: ");
                    email = s.next();
                    agenda.alterarPessoas(id, nome, new String(nascimentoReverse.reverse()), telefone, email);
                break;
                case 3:
                break;
                case 4:
                    agenda.listarPessoas();
                break;
                case 5:
                    continuar = false;
                break;
                default:
                    System.out.println("Opção invalida.");
                break;   
            }
            
        } while (continuar);
    
        //agenda.cadastrarPessoas("adilson", "1996-04-21" , "59243259", "miqueas.bsantos@gmail.com");
        agenda.alterarPessoas(1, "asdkhashdas", "1999-12-31", "59243259", "asdasd");
        agenda.listarPessoas();
        
    }
}
