import javax.swing.JOptionPane;
public class dialog {
    public static void main(String[] args) {
        String num1;
        num1 = JOptionPane.showInputDialog(null,"Input the first number",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Your number is" + num1);
        System.exit(0);
    }
}