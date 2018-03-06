/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Funcionario;
import java.util.Date;

/**
 *
 * @author juan.159417
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
     
        
        Funcionario funcionario = new Funcionario("Estudante",0, 0, "Juan", "123", "321");
        
     
        Date dataCadastro = new Date();
        Cliente client = new Cliente(dataCadastro, "Juan","123", "321");
        
        
        
        
        
        
        
        

    }
    
}
