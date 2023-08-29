import javax.swing.JOptionPane;

public class punto4 {

    public static void main(String[] args) {
      
        StringBuilder sb = new StringBuilder();
        
       
        for (char letra = 'Z'; letra >= 'A'; letra--) {
            
            sb.append(letra);
            
            sb.append("\n");
            
            for (char anterior = 'Z'; anterior > letra; anterior--) {
               
                sb.append(anterior);
            }
        }
        
       
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}