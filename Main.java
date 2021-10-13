import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Jenkins Remote Control\n");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Jenkins Jobs Remote Control");
        JLabel label2 = new JLabel("\nCreated by Edgar Vardanyan");
        JLabel label3 = new JLabel("\nOnly for Internal using");
        label3.setForeground(Color.RED);
        label2.setVerticalAlignment(JLabel.BOTTOM);
        JButton button = new JButton();
        button.setText("Start job in dev env");
        String command = "curl http://jen1001:8080/job/Pipeline%20SAP-Marketplace-pipeline-alpha-dev-env/build?token=158097#DevFullDeploy";
        button.addActionListener(event -> {
            try {
                Runtime.getRuntime().exec(command);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        JButton button2 = new JButton();
        button2.setText("Start job in test env");
        String command2 = "curl http://jen1001:8080/job/Pipeline%20SAP-Marketplace-pipeline-alpha-test-env/build?token=371524%#TestFullDeploy";
        button2.addActionListener(event -> {
            try {
                Runtime.getRuntime().exec(command2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        JButton button3 = new JButton();
        button3.setText("Start job in prod env");
        String command3 = "curl http://jen1001:8080/job/Pipeline%20SAP-Marketplace-pipeline-alpha-test-env/build?token=3192762@%#ProdFullDeploy";
        button3.addActionListener(event -> {
            try {
                Runtime.getRuntime().exec(command3);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        JButton button4 = new JButton();
        button4.setText("Testing");
        String command4 = "curl http://jen1001:8080/job/fixing-test-pipeline/build?token=4169$Atest";
        button4.addActionListener(event -> {
            try {
                Runtime.getRuntime().exec(command4);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        panel.add(label);
        panel.add(Box.createVerticalStrut(15));
        panel.add(button);
        panel.add(Box.createVerticalStrut(15));
        panel.add(button2);
        panel.add(Box.createVerticalStrut(15));
        panel.add(button3);
        panel.add(Box.createVerticalStrut(15));
        panel.add(button4);
        panel.add(Box.createVerticalStrut(15));
        panel.add(label3);
        panel.add(Box.createVerticalStrut(15));
        panel.add(label2);
        frame.add(panel);
        frame.setSize(200, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
