import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDemo implements ActionListener {

    private static JLabel userLabel, passLabel,success;
    private static JTextField userText;
    private static JPasswordField passText;
    private static JButton button;

    private static JFrame frame;


    public static void main(String[] args) {
        JPanel panel = new JPanel();
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passLabel = new JLabel("Password");
        passLabel.setBounds(10, 50, 80, 25);
        panel.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(100, 50, 165, 25);
        panel.add(passText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new LoginDemo());
        panel.add(button);

        success = new JLabel();
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.setBounds(1920+(1920/2)-150,440,300,200);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String user = userText.getText();
        String pass = passText.getText();

        if (user.equals("asdf") && pass.equals("1234")){
            success.setText("Login Successfully");
        }else{
            success.setText("Wrong User or Password");
        }

        System.out.println(frame.getX());
        System.out.println(frame.getBounds());
    }
}
