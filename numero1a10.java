import javax.swing.JOptionPane;

public class numero1a10 {
    public static void main(String[] args) {
        while (true) {
            String input = JOptionPane.showInputDialog("Introduce un número (0 para salir):");
            int num = Integer.parseInt(input);
            if (num == 0) {
                break;
            }
            String output = "Tabla del " + num + ":\n";
            for (int i = 1; i <= 10; i++) {
                output += num + " x " + i + " = " + (num * i) + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
