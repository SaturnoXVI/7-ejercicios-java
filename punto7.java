import javax.swing.JOptionPane;

public class punto7 {

    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
       
        String input = JOptionPane.showInputDialog("Ingrese el tamaño del lado del cuadrado");
       
        int lado = Integer.parseInt(input);
       
        String resultado = "";
       
        for (int i = 0; i < lado; i++) {
           
            for (int j = 0; j < lado; j++) {
               
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    resultado += "*";
                } else {
                
                    resultado += " ";
                }
            }
           
            resultado += "\n";
        }
        
        resultado += "\n" + nombre;
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}