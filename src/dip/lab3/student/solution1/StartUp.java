
package dip.lab3.student.solution1;

/**
 *
 * @author jWardell
 */
public class StartUp {
    public static void main(String[] args) {
       
        MsgOutput msgOutput = new KeyboardCopier();
        MsgInput msgInput = new KeyboardScanner();
        MsgInput msgInput2 = new UserMsgScanner();
        MsgOutput msgOutput2 = new UserMsgCopier();
        
        MsgManager msgManager = new MsgManager(msgInput, msgOutput);
        MsgManager msgManager2 = new MsgManager(msgInput2, msgOutput2);
        
        System.out.println(msgManager.copier());
        System.out.println(msgManager2.copier());
    }
 
    
}
