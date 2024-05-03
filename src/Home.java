import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.EventQueue;
import java.io.*;
import java.util.Scanner;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField_1;
    private JLabel lblPassword;
    private JPasswordField passwordField;
    private JLabel lblNewLabel_1;
    private JLabel lblSignUp;

    // Variables for sliding menu
    private JPanel menuPanel;
    private JButton menuButton;
    private boolean isMenuOpen = false;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home frame = new Home();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Home() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 740, 420);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 226, 179));
        panel.setBounds(0, 0, 231, 383);
        contentPane.add(panel);
        panel.setLayout(null);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(353, 127, 298, 32);
        contentPane.add(textField_1);
        
        JLabel lblNewLabel = new JLabel("Email");
        lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        lblNewLabel.setBounds(287, 99, 60, 19);
        contentPane.add(lblNewLabel);
        
        lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Monospaced", Font.BOLD, 20));
        lblPassword.setBounds(287, 169, 96, 19);
        contentPane.add(lblPassword);
        passwordField = new JPasswordField();
        passwordField.setBounds(353, 198, 298, 32);
        contentPane.add(passwordField);
        
        lblNewLabel_1 = new JLabel("No account yet?");
        lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(353, 240, 168, 32);
        contentPane.add(lblNewLabel_1);
        
        JButton btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 15));
        btnNewButton.setBounds(429, 282, 130, 40);
        btnNewButton.addActionListener(e -> loginUser());
        contentPane.add(btnNewButton);
        
        lblSignUp = new JLabel("Sign-Up");
        lblSignUp.setForeground(new Color(0, 128, 255));
        lblSignUp.setFont(new Font("Monospaced", Font.PLAIN, 18));
        lblSignUp.setBounds(525, 240, 86, 32);
        lblSignUp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openSignUpFrame(); // Open SignUp frame when clicked
                dispose(); // Close current frame
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblSignUp.setText("<html><u>Sign-Up</u></html>"); // Underline when mouse enters
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblSignUp.setText("Sign-Up"); // Remove underline when mouse exits
            }
        });
        contentPane.add(lblSignUp);
        
        // Add menu button
        ImageIcon menuIcon = new ImageIcon("menu-removebg-preview.png"); // Replace with your menu icon image file path
        menuButton = new JButton(menuIcon);
        menuButton.setBounds(10, 10, 30, 30); // Adjust position and size as needed
        menuButton.addActionListener(e -> toggleMenu());
        panel.add(menuButton);
        
        // Initialize menu panel
        menuPanel = new JPanel();
        menuPanel.setBackground(Color.WHITE);
        menuPanel.setBounds(0, 0, 231, 383); // Same size as panel
        contentPane.add(menuPanel);
        menuPanel.setLayout(null);
        menuPanel.setVisible(false); // Initially hide menu panel
    }

    // Method to toggle menu visibility
    private void toggleMenu() {
        isMenuOpen = !isMenuOpen;
        menuPanel.setVisible(isMenuOpen);
    }
    
    private void loginUser() {
        String email = textField_1.getText();
        String password = new String(passwordField.getPassword());
        boolean isAuthenticated = false;
        try (Scanner scanner = new Scanner(new File("userdata.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(email) && parts[1].equals(password)) {
                    isAuthenticated = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "User data file not found!");
        }
        if (isAuthenticated) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            openMain(); // Replace Main.java with the class you want to open after successful login
            dispose(); // Close current frame
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email or password!");
        }
    }

    private void openMain() {
        Main mainFrame = new Main(); // Instantiate your Main class (replace Main with the correct class name)
        mainFrame.setVisible(true); // Show the main frame
    }

    private void openSignUpFrame() {
        SignUp signUpFrame = new SignUp();
        signUpFrame.setVisible(true);
    }
}
