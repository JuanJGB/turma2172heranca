/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import static br.com.satc.objeto.Funcionario.calculaSalario;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.159417
 */
public class MainSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
float valorHora,qtdeHora;
        
        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor hora: "));
        qtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Qtde hora "));
        

        float salario = calculaSalario(qtdeHora, valorHora);
        
        JOptionPane.showMessageDialog(null, "salario: R$"+salario);

    }
    
}
