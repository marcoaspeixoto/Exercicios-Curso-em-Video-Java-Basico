/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author marco
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension tamanho = resolucao.getScreenSize();
        System.out.println("Sua tela tem resolução " + tamanho.width + " X " + tamanho.height);
    }
}