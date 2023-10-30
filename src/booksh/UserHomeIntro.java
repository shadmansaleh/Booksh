/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package booksh;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

/**


/**
 *
 * @author shadman
 */
public class UserHomeIntro extends javax.swing.JPanel {

    Color mouseEnterColor = new Color(0, 0, 0);
    Color mouseExitColor = new Color(77, 75, 86);
    /**
     * Creates new form UserHomeIntro
     */
    public UserHomeIntro() {
        initComponents();
        JScrollBar verticalScrollBar = jScrollPane3.getVerticalScrollBar();
        verticalScrollBar.setUnitIncrement(20);
        verticalScrollBar.setBlockIncrement(200);
    }
//      public void show(int index) {
//        String[] Images = takeimage();
//        ImageIcon icon = new ImageIcon(Images[index]);
//        Image image = icon.getImage().getScaledInstance(580, 330, Image.SCALE_SMOOTH);
//        lbl.setIcon(new ImageIcon(image));
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel25 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel16 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        jPanel26 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        rSLabelImage6 = new rojerusan.RSLabelImage();
        jPanel32 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        multilineLabel3 = new io.github.parubok.text.multiline.MultilineLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        multilineLabel1 = new io.github.parubok.text.multiline.MultilineLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        multilineLabel2 = new io.github.parubok.text.multiline.MultilineLabel();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        rSLabelImage4 = new rojerusan.RSLabelImage();
        rSLabelImage5 = new rojerusan.RSLabelImage();
        jLabel53 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        rSLabelImage7 = new rojerusan.RSLabelImage();

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel16.setBackground(new java.awt.Color(247, 247, 247));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 100)); // NOI18N
        jLabel18.setText("Libarary");
        jPanel16.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 430, 120));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 40)); // NOI18N
        jLabel23.setText("Spread the joy of learning");
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 490, 50));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 100)); // NOI18N
        jLabel19.setText("Booksh");
        jPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 400, 140));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibaryImages/pexels-polina-zimmerman-3747505.jpg"))); // NOI18N
        jPanel16.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1210, 1280));

        jPanel26.setBackground(new java.awt.Color(155, 61, 27));
        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel26.setForeground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ORDER NOW");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel26.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 3, 120, 40));

        jPanel16.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1720, 170, 50));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel66.setText("DELIVERY EXPANDED");
        jPanel27.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 220, 30));

        jLabel45.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 60)); // NOI18N
        jLabel45.setText("BORROW");
        jPanel27.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 270, -1));

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 380, 1));
        jPanel27.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 530));

        jLabel67.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(155, 61, 27));
        jLabel67.setText("pick-up & delivery");
        jPanel27.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, 30));

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Lostmates, GrubHub, Seamless & Uber");
        jPanel27.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 300, -1));

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("please order via Square.");
        jPanel27.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 160, -1));

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("To place an order for pickup,");
        jPanel27.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 220, -1));

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("To place an order for delivery, please choose from");
        jPanel27.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 350, -1));

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("one of our partners below:");
        jPanel27.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 220, -1));

        jPanel28.setBackground(new java.awt.Color(155, 61, 27));
        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel28.setForeground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("BORROW NOW");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });
        jPanel28.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, 40));

        jPanel16.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1850, -1, 530));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 60)); // NOI18N
        jLabel41.setText("ABOUT");
        jPanel29.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 230, -1));

        jLabel42.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(155, 61, 27));
        jLabel42.setText("PHONE");
        jPanel29.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 70, 30));

        jPanel30.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel29.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 380, 1));

        jLabel55.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(155, 61, 27));
        jLabel55.setText("   our service");
        jPanel29.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 170, 30));

        jLabel56.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(155, 61, 27));
        jLabel56.setText("Monday - 12pm-9pm");
        jPanel29.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 190, 30));

        jLabel57.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(155, 61, 27));
        jLabel57.setText("01783928393");
        jPanel29.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 110, 30));

        jLabel58.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(155, 61, 27));
        jLabel58.setText("Tuesday - 12pm-9pm");
        jPanel29.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 160, 30));

        jLabel59.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(155, 61, 27));
        jLabel59.setText("Wednesday - 12pm-9pm");
        jPanel29.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 190, 30));

        jLabel60.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(155, 61, 27));
        jLabel60.setText("Friday - 12pm-9pm");
        jPanel29.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 190, 30));

        jLabel61.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(155, 61, 27));
        jLabel61.setText("Saturday - 12pm-9pm");
        jPanel29.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 190, 30));

        jLabel62.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(155, 61, 27));
        jLabel62.setText("Sunday - 12pm-9pm");
        jPanel29.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 160, 30));

        jLabel63.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(155, 61, 27));
        jLabel63.setText("HOURS");
        jPanel29.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 80, 30));

        jLabel64.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(155, 61, 27));
        jLabel64.setText("Thursday - 12pm-9pm");
        jPanel29.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 190, 30));

        jLabel65.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(155, 61, 27));
        jLabel65.setText("01756737342");
        jPanel29.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 110, 30));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/message.png"))); // NOI18N
        jPanel29.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 30, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone.png"))); // NOI18N
        jPanel29.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 30, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/location.png"))); // NOI18N
        jPanel29.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 30, -1));

        rSLabelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibaryImages/side bar books.jpeg"))); // NOI18N
        jPanel29.add(rSLabelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 500, 600));

        jPanel16.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 3000, 1160, 620));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(155, 61, 27));
        jLabel71.setText("          EVER\"");
        jPanel32.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 220, 30));

        jLabel74.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(155, 61, 27));
        jLabel74.setText("\"Best Liberary");
        jPanel32.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, 30));
        jPanel32.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 50, 40));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cow.png"))); // NOI18N
        jPanel32.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 22, 150, 120));

        multilineLabel3.setBackground(new java.awt.Color(255, 255, 255));
        multilineLabel3.setForeground(new java.awt.Color(102, 102, 102));
        multilineLabel3.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        multilineLabel3.setText("\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        jPanel32.add(multilineLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 280, 170));

        jPanel16.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 2420, 360, 450));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(155, 61, 27));
        jLabel69.setText("expectations!\"");
        jPanel33.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 30));

        jLabel72.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(155, 61, 27));
        jLabel72.setText("\"It surpassed all my");
        jPanel33.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 190, 30));
        jPanel33.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 50, 40));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yelp.png"))); // NOI18N
        jPanel33.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 22, -1, -1));

        multilineLabel1.setBackground(new java.awt.Color(255, 255, 255));
        multilineLabel1.setForeground(new java.awt.Color(102, 102, 102));
        multilineLabel1.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        multilineLabel1.setText("\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        jPanel33.add(multilineLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 280, 170));

        jPanel16.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2420, 360, 450));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(155, 61, 27));
        jLabel70.setText("good prices\"");
        jPanel34.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 30));

        jLabel73.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(155, 61, 27));
        jLabel73.setText("\"Amazing books,");
        jPanel34.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 170, 30));
        jPanel34.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 50, 40));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bird.png"))); // NOI18N
        jPanel34.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 22, 150, 127));

        multilineLabel2.setBackground(new java.awt.Color(255, 255, 255));
        multilineLabel2.setForeground(new java.awt.Color(102, 102, 102));
        multilineLabel2.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        multilineLabel2.setText("\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        jPanel34.add(multilineLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 280, 170));

        jPanel16.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2420, 360, 450));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibaryImages/books/Screenshot_20231030_103353.jpeg"))); // NOI18N
        jPanel16.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1350, 210, 330));

        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibaryImages/books/Screenshot_20231030_103249.jpeg"))); // NOI18N
        jPanel16.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1350, 210, 330));

        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibaryImages/books/Screenshot_20231030_103234.jpeg"))); // NOI18N
        jPanel16.add(rSLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1350, 210, 330));

        rSLabelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibaryImages/books/Screenshot_20231030_103119.jpeg"))); // NOI18N
        jPanel16.add(rSLabelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1350, 210, 330));

        jLabel53.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 54)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("connect with us");
        jPanel16.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 3900, 400, 120));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twitter.png"))); // NOI18N
        jPanel16.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 4050, -1, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/instagram.png"))); // NOI18N
        jPanel16.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 4050, -1, 50));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/facebook.png"))); // NOI18N
        jPanel16.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 4050, -1, -1));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel79.setText("DELIVERY EXPANDED");
        jPanel35.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 220, 30));

        jLabel51.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 60)); // NOI18N
        jLabel51.setText("ORDER");
        jPanel35.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 200, -1));

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel35.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 380, 1));
        jPanel35.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 530));

        jLabel80.setFont(new java.awt.Font("Yu Gothic UI", 0, 22)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(155, 61, 27));
        jLabel80.setText("pick-up & delivery");
        jPanel35.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 220, 30));

        jLabel52.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("Lostmates, GrubHub, Seamless & Uber");
        jPanel35.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 300, -1));

        jLabel81.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 102, 102));
        jLabel81.setText("please order via Square.");
        jPanel35.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 160, -1));

        jLabel83.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 102, 102));
        jLabel83.setText("To place an order for pickup,");
        jPanel35.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 220, -1));

        jLabel84.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 102, 102));
        jLabel84.setText("To place an order for delivery, please choose from");
        jPanel35.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 350, -1));

        jLabel85.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 102, 102));
        jLabel85.setText("one of our partners below:");
        jPanel35.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 220, -1));

        jPanel37.setBackground(new java.awt.Color(155, 61, 27));
        jPanel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel37.setForeground(new java.awt.Color(255, 255, 255));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("ORDER NOW");
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel86MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel86MouseExited(evt);
            }
        });
        jPanel37.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel35.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, 40));

        jPanel16.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 1850, -1, 530));

        rSLabelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG Res.png"))); // NOI18N
        jPanel16.add(rSLabelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3750, 1210, 490));

        jScrollPane3.setViewportView(jPanel16);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1213, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
//        MainMenu mm = new MainMenu();
//        mm.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        // TODO add your handling code here:
        Color rd = new Color(144, 44, 6);
        jPanel26.setBackground(rd);
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        // TODO add your handling code here:
        Color m = new Color(155,61,27);
        jPanel26.setBackground(m);
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
//        OrderOnline oo = new OrderOnline();
//        oo.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseEntered
        // TODO add your handling code here:
        Color rd = new Color(144, 44, 6);
        jPanel28.setBackground(rd);
    }//GEN-LAST:event_jLabel38MouseEntered

    private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
        // TODO add your handling code here:
        Color m = new Color(155,61,27);
        jPanel28.setBackground(m);
    }//GEN-LAST:event_jLabel38MouseExited

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel86MouseClicked

    private void jLabel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel86MouseEntered

    private void jLabel86MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel86MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JScrollPane jScrollPane3;
    private io.github.parubok.text.multiline.MultilineLabel multilineLabel1;
    private io.github.parubok.text.multiline.MultilineLabel multilineLabel2;
    private io.github.parubok.text.multiline.MultilineLabel multilineLabel3;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private rojerusan.RSLabelImage rSLabelImage4;
    private rojerusan.RSLabelImage rSLabelImage5;
    private rojerusan.RSLabelImage rSLabelImage6;
    private rojerusan.RSLabelImage rSLabelImage7;
    // End of variables declaration//GEN-END:variables
}
