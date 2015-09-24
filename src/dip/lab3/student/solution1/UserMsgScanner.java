
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author jWardell
 */
public class UserMsgScanner implements MsgInput{
    
    @Override
    public String getMessage() {
        String response = JOptionPane.showInputDialog(null, "Enter your message here:");
        return response;
    }


}
