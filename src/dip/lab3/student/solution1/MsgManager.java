package dip.lab3.student.solution1;

/**
 *
 * @author jWardell
 */
public class MsgManager {
    
    private final MsgInput msgInput;
    private final MsgOutput msgOutput;
    
    
    public MsgManager(MsgInput msgInput, MsgOutput msgOutput) {
        this.msgInput = msgInput;
        this.msgOutput = msgOutput;
    }
    
    public String copier() {
            String keyboard = msgInput.getMessage();
            return msgOutput.deliverMessage( keyboard );
	}
    
}
