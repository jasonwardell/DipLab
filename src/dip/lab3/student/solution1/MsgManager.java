package dip.lab3.student.solution1;

/**
 *
 * @author jWardell
 */
public class MsgManager {
    
    private MsgInput msgInput;
    private MsgOutput msgOutput;
    
    
    public MsgManager(MsgInput msgInput, MsgOutput msgOutput) {
        this.msgInput = msgInput;
        this.msgOutput = msgOutput;
    }
    
    public String copier() {
            String keyboard = ("Your message is ") + msgInput.getMessage();
            msgOutput.deliverMessage( keyboard );
            return keyboard;
	}
}
