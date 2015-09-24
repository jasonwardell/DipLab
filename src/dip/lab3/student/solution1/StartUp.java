
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author jWardell
 */
public class StartUp {
    public static void main(String[] args) {
       
        MsgOutput msgOutput = new KeyboardCopier();
        MsgInput msgInput = new KeyboardScanner();
        
        MsgManager msgManager = new MsgManager(msgInput, msgOutput);
        
        System.out.println(msgManager.copier());
    }
 
    
}
