/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;


import br.com.satc.objeto.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.159417
 */
public class MainCalculaSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String cargo =  JOptionPane.showInputDialog(null,"Informe o cargo: ");
     float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe O valor da hora do funcionario: "));
     float qtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: "));
    
     
     Funcionario funcionario = new Funcionario(cargo, valorHora, qtdeHora, cargo, cargo, cargo);
     
        JOptionPane.showMessageDialog(null,funcionario.getSalario() );

    }
    
}
