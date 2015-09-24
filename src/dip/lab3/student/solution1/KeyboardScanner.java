package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author jWardell
 */
public class KeyboardScanner implements MsgInput {

    @Override
    public String getMessage() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Just type your message and hit the return key.");
        String msg = keyboard.nextLine();
        return msg;
    }

}
