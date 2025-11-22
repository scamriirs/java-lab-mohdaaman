import java.awt.*;
import java.awt.event.*;

class AWTExample extends Frame implements ActionListener {

    Label l;
    TextField tf;
    Button b;

    AWTExample() {

        l = new Label("Enter Name:");
        l.setBounds(50, 50, 100, 30);

        tf = new TextField();
        tf.setBounds(160, 50, 120, 30);

        b = new Button("Submit");
        b.setBounds(100, 100, 80, 30);

        add(l);
        add(tf);
        add(b);

        b.addActionListener(this);   // Button event

        setSize(350, 200);
        setLayout(null);
        setVisible(true);

        // This closes the AWT window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String name = tf.getText();
        System.out.println("Entered Name: " + name);
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
