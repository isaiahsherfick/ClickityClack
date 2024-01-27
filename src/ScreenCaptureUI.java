import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ScreenCaptureUI extends JFrame {

public ScreenCaptureUI() {
setUndecorated(true); // Remove window decorations
setExtendedState(JFrame.MAXIMIZED_BOTH); // Full-screen window
setLayout(new BorderLayout());

setOpacity(0.5f); // Set transparency (0.0f to 1.0f)

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Handle mouse click events
                System.out.println("Mouse Clicked at: " + e.getPoint());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScreenCaptureUI());
    }
}
