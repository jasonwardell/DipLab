
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author jWardell
 */
public class UserMsgScanner implements MsgInput{
    
    //JOptionPane.showMessageDialog(null,"My Message");
    String response = JOptionPane.showInputDialog(null, "A Prompt, like enter message here:");

    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
