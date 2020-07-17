import javax.swing.JOptionPane;
public class operator {
    public static void main(String[] args){
        String num1,num2;
        num1 = JOptionPane.showInputDialog(null,"Enter the first number",JOptionPane.INFORMATION_MESSAGE);
        num2 = JOptionPane.showInputDialog(null,"Enter the second number",JOptionPane.INFORMATION_MESSAGE);
        Double numDoub1,numDoub2;
        numDoub1 = Double.parseDouble(num1);
        numDoub2 = Double.parseDouble(num2);
        String option;
        option = JOptionPane.showInputDialog(null,"Enter the the operator\n1.Sum\n2.Difference\n3.Product\n4.Qutient\n",JOptionPane.INFORMATION_MESSAGE);
        switch (option){
            case "1":
                Double sum = numDoub1 + numDoub2;
                JOptionPane.showMessageDialog(null,"The Sum of two number is : "+sum); 
            break;
            case "2":
                Double diff = numDoub1 - numDoub2;
                if (diff < 0) diff = -diff;
                JOptionPane.showMessageDialog(null,"The Sum of two number is : " + diff); 
            break;
            case "3":
                Double product = numDoub1 * numDoub2;
                JOptionPane.showMessageDialog(null,"The Sum of two number is : " + product); 
            break;
            case "4":
                Double quotient = numDoub1 / numDoub2;
                JOptionPane.showMessageDialog(null,"The Sum of two number is : " + quotient); 
            break;
        }
    }
}