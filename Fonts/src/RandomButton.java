import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class RandomButton {
    public static void main(String[] args) {
        Fr fr = new Fr();
        fr.setVisible(true);
    }
}

class Fr extends JFrame  {
    int a;
    int c;
    private int wWidth, wHeight;
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dm = tk.getScreenSize();
    JLabel lbl;
    JButton b;

    private class ML extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            a = (int) (Math.random() * (dm.getWidth()-2*b.getWidth())+b.getWidth());
            c = (int) (Math.random() * (dm.getHeight()-2*b.getHeight())+b.getHeight());
            a = (int) (dm.getWidth()-b.getWidth());
            c = (int) (dm.getHeight()-2*b.getHeight());
            a = (int) (Math.random()*(dm.getWidth()-b.getWidth()-50))+(25);
            c = (int) (Math.random()*(dm.getHeight()-b.getHeight()-75))+(25);
            b.setBounds(a,c,b.getWidth(),b.getHeight());
            repaint();
        }
    }

    public Fr() {
        setTitle("КнопкоДав)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        dm = new Dimension((int)dm.getWidth(),(int)dm.height);
        setBounds(0, 0, dm.width/2, dm.height/2);  // half screen
        this.setMinimumSize(dm);
        this.setMaximumSize(dm);
        this.requestFocus();
        this.setFocusable(true);
        this.toFront();
        wWidth = dm.width;
        wHeight = dm.height;
        setResizable(false);
        setContentPane(new BgPanel());
        Container cont = getContentPane();

        lbl = new JLabel("Label");
        lbl.setFont(new Font("Arial", Font.BOLD, 24));
        b = new JButton("Нажми меня!!!");
        b.setBounds((int)(dm.width/4+dm.width/8), (int)(dm.height/4+dm.height/8), 200, 70);
        b.addMouseListener(new ML());
        cont.setLayout(null);
        cont.add(lbl);
        cont.add(b);
    }
}

class BgPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            im = ImageIO.read(new File("2.jpg"));
        } catch (IOException e) {
        }
        g.drawImage(im, 0, 0, null);
    }
}