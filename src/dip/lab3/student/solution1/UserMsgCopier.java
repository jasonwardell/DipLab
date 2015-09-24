
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author jWardell
 */
public class UserMsgCopier implements MsgOutput{
    
    @Override
    public String deliverMessage(String text) {
      JOptionPane.showMessageDialog(null, text);
      return text;
    }




    
}
