import java.awt.*;

class AWTCheckbox {
    public static void main(String[] args) {
        Frame f = new Frame("Checkbox Example");

        Checkbox cb1 = new Checkbox("Java");
        cb1.setBounds(50, 50, 100, 30);

        Checkbox cb2 = new Checkbox("Python");
        cb2.setBounds(50, 100, 100, 30);

        f.add(cb1);
        f.add(cb2);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
