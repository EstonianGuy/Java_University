
package GuiField;

import java.awt.event.*;
import java.awt.*;
import java.util.jar.JarEntry;

class AL extends Frame implements ActionListener {

    Button b;
    private int numClicks = 0;

    public static void main(String[] args) {
        AL myWindow = new AL("My first window");
        myWindow.setSize(350,100);
        myWindow.setVisible(true);
    }

    public AL(String title) {

        super(title);
        setLayout(new FlowLayout());
        //addWindowListener(this);
        b = new Button("Click me");
        add(text);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        numClicks++;
        text.setText("Button Clicked " + numClicks + " times");
    }



 public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }



 public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}


}

