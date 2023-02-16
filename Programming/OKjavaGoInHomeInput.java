
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import javax.swing.JOptionPane;

public class OKjavaGoInHomeInput {

    // Parameter, 매개변수
    public static void main(String[] args) {

        // string id = args[0]
        // string bright = args[1]
        String id = JOptionPane.showInputDialog("Enter a ID");
        String bright = JOptionPane.showInputDialog("Enter a Bright Level");

        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        Security mySecurity = new Security(id);
        mySecurity.off();

        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / floor Lamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id + "mood Lamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
    }
}
