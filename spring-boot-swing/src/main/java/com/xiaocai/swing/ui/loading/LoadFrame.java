package com.xiaocai.swing.ui.loading;

import org.springframework.core.io.ClassPathResource;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-15 09:42
 **/
public class LoadFrame extends JFrame {


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JProgressBar progress;
    private JPanel imgPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public LoadFrame() {
        //不显示边框
        setUndecorated(true);

        initComponents();
    }

    public JProgressBar getProgress() {
        return progress;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        progress = new JProgressBar();

        imgPanel = new ImagePanel();

        //======== this ========
        setMinimumSize(new Dimension(600, 400));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());


        contentPane.add(progress, BorderLayout.SOUTH);

        //======== imgPanel ========
        {
            imgPanel.setMinimumSize(new Dimension(0, 0));
            imgPanel.setLayout(null);
        }
        contentPane.add(imgPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    public void setForce(){
        if(progress.getValue()<20){
            this.progress.setForeground(Color.BLUE);
        }
        else if(progress.getValue()<40){
            this.progress.setForeground(Color.YELLOW);
        }
        else if(progress.getValue()<60){
            this.progress.setForeground(Color.RED);
        }
        else if(progress.getValue()<80){
            this.progress.setForeground(Color.GREEN);
        }
        else{
            this.progress.setForeground(Color.CYAN);
        }
    }

    private class ImagePanel extends JPanel{

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            try {
                BufferedImage img = ImageIO.read(new ClassPathResource("/icon/logo.jpg").getURL());
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
