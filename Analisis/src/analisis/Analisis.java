/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis;

import Gato.Gato;

/**
 *
 * @author treznor
 */
public class Analisis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Prueba 
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gato().setVisible(true);
            }
        });
    }
    private Object[][] TABLERO;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    void Reiniciar()
    {
        int Contador = 0;
    	for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                TABLERO[i][j].A.setIcon(null);
                TABLERO[i][j].B=0;
                TABLERO[i][j].A.addActionListener(this);
            }
        }
    }
    
}

    
