package currencyconverter;
import javax.swing.*;

public class RunProgram {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameDisplay disp = new FrameDisplay();
            }
        });
    }
    
}
