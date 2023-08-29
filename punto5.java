import javax.swing.JOptionPane;

public class punto5 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola. Ingresa su nombre");

        int pares = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 20; i++) {

            String numero = JOptionPane.showInputDialog("Ingresa el número " + i);

            int n = Integer.parseInt(numero);

            if (n % 2 == 0) {
                pares++;
            }
            if (n < 0) {
                negativos++;
            }
            if (n == 0) {
                ceros++;
            }
        }

        JOptionPane.showMessageDialog(null, "Hola, " + nombre + ". De los 20 números que ingresaste, hay:\n" +
                pares + " números pares\n" +
                negativos + " números negativos\n" +
                ceros + " números ceros");
    }
}