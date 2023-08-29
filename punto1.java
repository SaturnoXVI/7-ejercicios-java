import javax.swing.JOptionPane;

public class punto1 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");

        String resultado = "";

        for (int i = 1; i <= 100; i++) {

            resultado += i + " ";
        }

        JOptionPane.showMessageDialog(null, "Hola, " + nombre + ". Los números del 1 al 100 son:\n" + resultado);
    }
}