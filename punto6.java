import javax.swing.JOptionPane;

public class punto6 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola. ingresa su nombre");

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            
            String numero = JOptionPane.showInputDialog("Ingresa el número " + (i + 1));

            numeros[i] = Integer.parseInt(numero);
        }

        String resultado = "";

        resultado += "El primero: " + numeros[0] + "\n";

        resultado += "El último: " + numeros[9] + "\n";

        resultado += "El segundo: " + numeros[1] + "\n";

        resultado += "El penúltimo: " + numeros[8] + "\n";

        resultado += "El tercero: " + numeros[2] + "\n";

        JOptionPane.showMessageDialog(null,
                "Hola, " + nombre + ". Los números que ingresaste en el orden solicitado son:\n" + resultado);
    }
}