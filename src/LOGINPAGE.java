import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGINPAGE {
    private JTextField textField1;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JFrame frame;

    public LOGINPAGE() {
        frame = new JFrame("User Login Frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 250));
        frame.setResizable(false);

        // Add panel to frame
        frame.add(panel1);
        button1.setText("Enter");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Adding ActionListener to the login button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = new String(passwordField1.getPassword());

                // Input validation: Check if username and password are valid
                if (!validateInput(username, password)) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Username and password must not be empty or exceed 15 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }


                if (username.equals("chimz") && password.equals("securecoding")) {
                    frame.dispose(); // Close the login page
                    openDisplayPage(); // Open the next page
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid login credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Input validation method
    private boolean validateInput(String username, String password) {
        // Check for null, empty, or too long username and password
        if (username == null || username.isEmpty() || username.length() > 15) {
            return false;
        }
        if (password == null || password.isEmpty() || password.length() > 15) {
            return false;
        }
        return true;
    }

    // Method to open the next page (display page)
    private void openDisplayPage() {
        JFrame displayFrame = new JFrame("Display Page");
        displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        displayFrame.setSize(400, 200);
        displayFrame.setLocationRelativeTo(null);

        // Creating a label with the welcome message
        JLabel welcomeLabel = new JLabel("WELCOME TINOTENDA CHIMINA H230694J", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 16));

        // Add the label to the frame
        displayFrame.add(welcomeLabel);

        // Make the display frame visible
        displayFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show login page
        new LOGINPAGE();
    }
}
