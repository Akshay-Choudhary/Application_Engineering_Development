package business;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class MyNumericVerifier extends InputVerifier {
    
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        try {
            int number=Integer.parseInt(text);
            input.setBackground(Color.white);
            if(number<0)
                {
                    input.setBackground(Color.red);
                    JOptionPane.showMessageDialog(input, "Number cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
        } catch (NumberFormatException e) {
            input.setBackground(Color.red);
            JOptionPane.showMessageDialog(input, "Please enter integer value", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
