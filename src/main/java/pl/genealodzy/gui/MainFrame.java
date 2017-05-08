package pl.genealodzy.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class MainFrame extends JFrame implements Runnable {

    private static final long serialVersionUID = -2880527860129156140L;
    private static final int DEFAULT_WIDTH = 1440;
    private static final int DEFAULT_HEIGHT = 900;

    
    public MainFrame() {
        initialize();
    }

    private void initialize() {
        setWindowSize();
        
    }

    private void setWindowSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width > DEFAULT_WIDTH ? DEFAULT_WIDTH : screenSize.width;
        int height = screenSize.height > DEFAULT_HEIGHT ? DEFAULT_HEIGHT : screenSize.height;
        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;
        setBounds(x, y, width, height);
    }

    @Override
    public void run() {
        setVisible(true);
    }

}
