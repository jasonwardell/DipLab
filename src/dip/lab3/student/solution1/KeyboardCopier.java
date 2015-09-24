
package dip.lab3.student.solution1;

/**
 *
 * @author jWardell
 */
public class KeyboardCopier implements MsgOutput{

    
    @Override
    public String deliverMessage(String text) {
     System.out.println("Your message is ");
            return text;
    }

    
    
    
}
