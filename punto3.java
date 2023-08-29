import javax.swing.JOptionPane;

public class punto3 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre ");

        String numero = JOptionPane.showInputDialog("¿De qué número quieres la tabla de multiplicar?");

        int n = Integer.parseInt(numero);

        String resultado = "";

        for (int i = 1; i <= 10; i++) {

            resultado += n + " x " + i + " = " + (n * i) + "\n";
        }

        JOptionPane.showMessageDialog(null,
                "Hola, " + nombre + ". La tabla de multiplicar del " + n + " es:\n" + resultado);
    }
}