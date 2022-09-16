package exepion;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
public class rand0m {
    public static void main(String[] args) {

        Fr fr = new Fr();
        fr.setVisible(true);
    }

}
public class Fr extends JFrame implements  MouseMotionListener {
    int a = (int) ( Math.random() * 1920 );
    int c = (int) ( Math.random() * 1920 );
    private int wWidth, wHeight;
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dm = tk.getScreenSize();
    JLabel lbl;
    JButton b;
    public Fr(){
        setTitle("Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, dm.width, dm.height);
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
        b = new JButton("Button");
        b.setBounds(800,50,200,70);

        cont.setLayout(null);
        cont.add(lbl);
        cont.add(b);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Автоматически созданная заглушка метода

    }
    @Override
    public void mouseMoved(MouseEvent e) {
        b.setBounds(a,c,200,70);
    }


}

public class BgPanel extends JPanel{
    public void paintComponent(Graphics g){
        Image im = null;
        try {
            im = ImageIO.read(new File("Untitled-1.jpg"));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0, null);

    }
}