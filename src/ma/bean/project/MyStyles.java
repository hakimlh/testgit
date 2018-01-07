/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.bean.project;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Hakim
 */
public class MyStyles {

    public static void GetMyStyle(JButton btn_ajt, JButton btn_mod, JButton btn_sup, JLabel lbl_bg, JFrame f) {

        f.setSize(720, 570);
        lbl_bg.setSize(720, 570);

        btn_mod.setEnabled(false);
        btn_sup.setEnabled(false);

        btn_ajt.setBorderPainted(false);
        btn_ajt.setContentAreaFilled(false);
        btn_ajt.setFocusPainted(false);
        btn_ajt.setOpaque(false);

        btn_mod.setBorderPainted(false);
        btn_mod.setContentAreaFilled(false);
        btn_mod.setFocusPainted(false);
        btn_mod.setOpaque(false);

        btn_sup.setBorderPainted(false);
        btn_sup.setContentAreaFilled(false);
        btn_sup.setFocusPainted(false);
        btn_sup.setOpaque(false);

        btn_ajt.setSize(50, 50);
        btn_mod.setSize(50, 50);
        btn_sup.setSize(50, 50);

        btn_ajt.setIcon(new ImageIcon(new ImageIcon("src\\files\\add.png").getImage()
                .getScaledInstance(btn_ajt.getWidth(), btn_ajt.getHeight(), Image.SCALE_SMOOTH)));
        btn_mod.setIcon(new ImageIcon(new ImageIcon("src\\files\\edit.png").getImage()
                .getScaledInstance(btn_mod.getWidth(), btn_mod.getHeight(), Image.SCALE_SMOOTH)));
        btn_sup.setIcon(new ImageIcon(new ImageIcon("src\\files\\delete.png").getImage()
                .getScaledInstance(btn_sup.getWidth(), btn_sup.getHeight(), Image.SCALE_SMOOTH)));

        lbl_bg.setIcon(new ImageIcon(new ImageIcon("src\\files\\bg.jpg").getImage()
                .getScaledInstance(lbl_bg.getWidth(), lbl_bg.getHeight(), Image.SCALE_SMOOTH)));

    }
}
