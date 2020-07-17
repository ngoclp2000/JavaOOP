import javax.swing.JOptionPane;
public class equation {
    public static void main(String[] args){
        String choice;
        choice = JOptionPane.showInputDialog(null,"Enter the your choice:\n1.First degree equation 1 variable\n2.First degree equation 2 variable\n3. Second degree equation 1 variable\n");
        switch(choice){
            case "1":
                // First degree equation 1 variable
                // ax + b = c
                Double a,b,c;
                a = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant a of c = ax + b equation"));
                b = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant b of c = ax + b equation"));
                c = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant c of c = ax + b equation"));
                Double x = (c-b)/a;
                JOptionPane.showMessageDialog(null,"The value of y = a*x +b(a = " + a + " b = " + b + " c = " + c + " ): "+x);
            break;
            case "2":
                // First degree equation 2 variables
                // ax + by = c
                // For x to solve y because if we input a,b,c the equation has infinite solutions
                a = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant a of c = ax + by equation"));
                b = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant b of c = ax + by equation"));
                c = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant c of c = ax + by equation"));
                x = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant x of c = ax + by equation"));
                Double y = (c-a*x)/b;
                JOptionPane.showMessageDialog(null,"The value of y = a*x +b(a = " + a + " b = " + b + " c = " + c + " x = " + x + " ): " + y);
            break;
            case "3":
                //Second degree equation with 1 variable
                // ax^2 + bx + c = 0
                a = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant a of 0 = ax^2 +bx +c equation"));
                b = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant b of 0 = ax^2 +bx +c equation"));
                c = Double.parseDouble(JOptionPane.showInputDialog(null,"Input constant c of 0 = ax^2 +bx +c equation"));
                Double delta = b*b -4*a*c;
                if (delta < 0 ) JOptionPane.showMessageDialog(null,"There no solution for this equation");
                else if (delta == 0) JOptionPane.showMessageDialog(null,"The solution of this equation is: " + -b/(2*a));
                else{
                    Double x1,x2;
                    x1 = (-b - Math.sqrt(delta))/(2*a);
                    x2 = (-b + Math.sqrt(delta))/(2*a);
                    JOptionPane.showMessageDialog(null,"Two solutions of this equation are: " + x1 + " and " + x2);
                }
            break;
        }
        
    }
}