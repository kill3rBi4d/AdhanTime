package hiqma.tech.org.panels;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public Home(){
        int width = 800;
        int height = 480;

        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(new Color(0, 0, 0, 0));
        this.setBorder(BorderFactory.createLineBorder(new Color(0x046679), 1, false));
        this.setOpaque(false);
        this.setLayout(new BorderLayout());

    }
}
