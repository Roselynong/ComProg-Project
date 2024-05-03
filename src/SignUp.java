import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import java.io.*;

public class SignUp extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField_1;
    private JLabel lblPassword;
    private JPasswordField passwordField;
    private JLabel lblNewLabel_1;
    private JLabel lblSignUp;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUp frame = new SignUp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SignUp() {
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
        textField_1.setBounds(352, 127, 298, 32);
        contentPane.add(textField_1);
        
        JLabel lblNewLabel = new JLabel("Email");
        lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        lblNewLabel.setBounds(286, 99, 60, 19);
        contentPane.add(lblNewLabel);
        
        lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Monospaced", Font.BOLD, 20));
        lblPassword.setBounds(286, 169, 96, 19);
        contentPane.add(lblPassword);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(352, 198, 298, 32);
        contentPane.add(passwordField);
        
        lblNewLabel_1 = new JLabel("Already have an account?");
        lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(295, 240, 269, 32);
        contentPane.add(lblNewLabel_1);
        
        JButton btnNewButton = new JButton("Sign-Up");
        btnNewButton.setFont(new Font("Monospaced", Font.PLAIN, 15));
        btnNewButton.setBounds(428, 282, 130, 40);
        btnNewButton.addActionListener(e -> saveUserData());
        contentPane.add(btnNewButton);
        
        lblSignUp = new JLabel("Login");
        lblSignUp.setForeground(new Color(0, 128, 255));
        lblSignUp.setFont(new Font("Monospaced", Font.PLAIN, 18));
        lblSignUp.setBounds(574, 240, 67, 32);
        lblSignUp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openHomeFrame(); // Open Home frame when clicked
                dispose(); // Close current frame
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblSignUp.setText("<html><u>Login</u></html>"); // Underline when mouse enters
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblSignUp.setText("Login"); // Remove underline when mouse exits
            }
        });
        contentPane.add(lblSignUp);
    }
    
    private void saveUserData() {
        String email = textField_1.getText();
        String password = new String(passwordField.getPassword());
        try (PrintWriter writer = new PrintWriter(new FileWriter("userdata.txt", true))) {
            writer.println(email + "," + password);
            JOptionPane.showMessageDialog(this, "User data saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving user data!");
        }
    }
    
    private void openHomeFrame() {
        Home homeFrame = new Home();
        homeFrame.setVisible(true);
    }
}
