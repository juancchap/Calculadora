package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        int numero1, numero2,suma,Resta,Mult,Div;
        char operacion;
        
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Diguita un numero"));
        
        operacion=JOptionPane.showInputDialog("digite la operacion que desea realizar :").charAt(0);
        
        
        switch (operacion)
        {
            case 's':
            case 'S':
                suma=numero1+numero2;
                JOptionPane.showMessageDialog(null,"La suma es "+suma);
            break;
            case 'r':
            case 'R':
                Resta=numero1-numero2;
                JOptionPane.showMessageDialog(null,"La Resta es "+Resta);
            break;
            case 'm':
            case 'M':
                Mult=numero1*numero2;
                JOptionPane.showMessageDialog(null,"La Multiplicacion es "+Mult);
            break;
            case 'd':
            case 'D':
                Div=numero1/numero2;
                JOptionPane.showMessageDialog(null,"La Division es "+Div);
            break;
            default :
                JOptionPane.showMessageDialog(null,"Lo siento no pudimos realisar ninguna operacion \n no has indicado que operacion realizar");

        }
        
        

    }

}