import java.awt.*;

class AWTListScroll {
    public static void main(String[] args) {
        Frame f = new Frame("List & Scrollbar Example");

        List list = new List(5);
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("HTML");
        list.setBounds(50, 50, 100, 100);

        Scrollbar sb = new Scrollbar();
        sb.setBounds(170, 50, 20, 100);

        f.add(list);
        f.add(sb);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
