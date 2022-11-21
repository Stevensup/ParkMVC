package vista;
import javax.swing.JOptionPane;

public class FrontConsole {

    public void MostrarMensaje(String Param) {
        String salida = Param;
        JOptionPane.showMessageDialog(null, salida, " APP-JAVA", JOptionPane.PLAIN_MESSAGE);
    }

    public char LeerText(String Param) {
        String salida = JOptionPane.showInputDialog(Param);
        char c = (char) Integer.parseInt(salida);
        return c;
    }

    public String LeerTexto(String Param) {
        String x = JOptionPane.showInputDialog(Param);
        return  x;

    }

    public int LeerNumero(String Param) {
        String salida = JOptionPane.showInputDialog(Param);
        int x = Integer.parseInt(salida);
        return x;

    }

}
