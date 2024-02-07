package calculadora;

//Importacion de libreria
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        //Declaracion de Variables
        int numero1, numero2, suma, Resta, Mult, Div;
        char operacion;
        
        //Le pedimos al usuario que nos diguite 2 numeros

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Diguita un numero"));

        //Le pedimos al usuario que nos diga que operacion va a realizar
        
        operacion = JOptionPane.showInputDialog("digite la operacion que desea realizar :").charAt(0);
        
        //Dependiendo de la selecion se va a hacer una operacion diferente y imprimira el resultado

        switch (operacion) {
            case 's':
            case 'S':
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "La suma es " + suma);
                break;
            case 'r':
            case 'R':
                Resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "La Resta es " + Resta);
                break;
            case 'm':
            case 'M':
                Mult = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "La Multiplicacion es " + Mult);
                break;
            case 'd':
            case 'D':
                Div = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "La Division es " + Div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lo siento no pudimos realisar ninguna operacion \n no has indicado que operacion realizar");

        }

    }

}
