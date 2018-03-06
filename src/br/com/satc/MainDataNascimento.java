/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Dependente;
import static br.com.satc.objeto.Dependente.calculaIdade;
import static br.com.satc.objeto.Funcionario.calculaSalario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.159417
 */
public class MainDataNascimento {
    
    public static void main(String[] arg) throws ParseException{
      
       Date dataNascimento = new Date();
       Date data = new Date();
       
       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataNascimento = sdf.parse("21/01/2001");
        
        Cliente pai = new Cliente(data,"Juan","321", "333");
        Dependente filho = new Dependente(pai, dataNascimento, "Juan", "321", "123");
        
        
        JOptionPane.showMessageDialog(null, filho.getIdade());
        
        
        
    }
    
}
