import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		String[] options = {"YES","NO"};
		int option = JOptionPane.showOptionDialog(null,"Do you want to change first ticket?",null ,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		JOptionPane.showMessageDialog(null,"You've chosen: " + (option == JOptionPane.YES_OPTION?"YES":"NO"));
		System.exit(0);
	}
}
