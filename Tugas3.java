import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Tugas3 extends JFrame {
    private JPanel mainPanel, loginPanel, registerPanel;
    private CardLayout cardLayout;

    public Tugas3() {
        setTitle("Tugas 3 Login dan Register");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        loginPanel = createLoginPanel();
        registerPanel = createRegisterPanel();

        mainPanel.add(loginPanel, "Login");
        mainPanel.add(registerPanel, "Regis");

        add(mainPanel);
        setVisible(true);
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("Login", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("Kata Sandi:"));
        formPanel.add(passwordField);

        JButton loginButton = new JButton("Gass Login");
        JButton switchToRegisterButton = new JButton("Buat Akun Dulu");

        formPanel.add(loginButton);
        formPanel.add(switchToRegisterButton);
        panel.add(formPanel, BorderLayout.CENTER);

        loginButton.addActionListener(e -> loginAction(emailField, passwordField));
        switchToRegisterButton.addActionListener(e -> cardLayout.show(mainPanel, "Regis"));
        
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    loginAction(emailField, passwordField);
                }
            }
        });

        return panel;
    }

    private JPanel createRegisterPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("Register", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(4, 5, 5, 5));
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        formPanel.add(new JLabel("Nama:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("Kata Sandi:"));
        formPanel.add(passwordField);

        JButton registerButton = new JButton("Cuss Regis");
        JButton switchToLoginButton = new JButton("Login");

        formPanel.add(registerButton);
        formPanel.add(switchToLoginButton);
        panel.add(formPanel, BorderLayout.CENTER);

        registerButton.addActionListener(e -> registerAction(nameField, emailField, passwordField));
        switchToLoginButton.addActionListener(e -> cardLayout.show(mainPanel, "Login"));

        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    registerAction(nameField, emailField, passwordField);
                }
            }
        });

        return panel;
    }

    private void loginAction(JTextField emailField, JPasswordField passwordField) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        JOptionPane.showMessageDialog(this, "Login Anda Berjaya!!!\nEmail: " + email);
    }

    private void registerAction(JTextField nameField, JTextField emailField, JPasswordField passwordField) {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        JOptionPane.showMessageDialog(this, "Regis Anda Berhasil!!!\nNama: " + name + "\nEmail: " + email);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Tugas3::new);
    }
}


