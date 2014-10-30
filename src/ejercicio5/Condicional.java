


package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Condicional {
    private double numero1;
    private double numero2;
    private double numero3;
    
    public Condicional(){
        
    }
    public double numeros(){
        String respuesta= JOptionPane.showInputDialog("Introducir número: ");
        double valor= Double.parseDouble(respuesta);
        return valor;
    }
    public void comparar(double n1, double n2, double n3){
        numero1=n1;
        numero2=n2;
        numero3=n3;
        if (n1>n2&&n1>n3){
            JOptionPane.showMessageDialog(null, n1);
            }else if(n2>n1&&n2>n3){
                JOptionPane.showMessageDialog(null, n2);
            }else{
                JOptionPane.showMessageDialog(null, n3);
        }
    }
}
