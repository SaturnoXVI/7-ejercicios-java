import javax.swing.JOptionPane;

public class punto2 {

    public static void main(String[] args) {
        // Pedir el nombre del usuario con un cuadro de entrada
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");

        int suma = 0;

        for (int i = 1; i <= 10; i++) {

            String numero = JOptionPane.showInputDialog("Ingresa el número " + i);

            suma += Integer.parseInt(numero);
        }

        JOptionPane.showMessageDialog(null,
                "Hola, " + nombre + ". La suma de los 10 números que ingresaste es: " + suma);
    }
}