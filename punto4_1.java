import javax.swing.JOptionPane;

public class punto7_1 {

    public static void main(String[] args) {
        
        char[] letras = {'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        
        
        String resultado = "";
        
        
        for (int i = letras.length - 1; i >= 0; i--) {
           
            resultado += letras[i] + " ";
            
            
            JOptionPane.showMessageDialog(null, resultado);
        }
        
        
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
        
        
        JOptionPane.showMessageDialog(null, "Hola, " + nombre + ". Espero que te haya gustado el programa.");
    }
}