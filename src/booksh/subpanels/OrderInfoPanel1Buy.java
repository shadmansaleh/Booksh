/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package booksh.subpanels;

/**
 *
 * @author shadman
 */
public class OrderInfoPanel1Buy extends javax.swing.JPanel {

    /**
     * Creates new form OrderInfoPanel
     */
    public OrderInfoPanel1Buy() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_bookname = new javax.swing.JLabel();
        lb_bookname = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        btn_approve = new javax.swing.JLabel();
        btn_reject = new javax.swing.JLabel();
        lb_bookname1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 251, 151));

        lbl_bookname.setFont(new java.awt.Font("Glass Antiqua", 2, 24)); // NOI18N
        lbl_bookname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bookname.setText("Book Name");

        lb_bookname.setFont(new java.awt.Font("Glass Antiqua", 0, 22)); // NOI18N
        lb_bookname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_bookname.setText("wants to buy");

        lbl_uname.setFont(new java.awt.Font("Glass Antiqua", 2, 24)); // NOI18N
        lbl_uname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_uname.setText("Username");

        lbl_author.setFont(new java.awt.Font("Glass Antiqua", 2, 24)); // NOI18N
        lbl_author.setText("Author");

        btn_approve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cross-red-50.png"))); // NOI18N

        btn_reject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-check-green-48.png"))); // NOI18N
        btn_reject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rejectMouseClicked(evt);
            }
        });

        lb_bookname1.setFont(new java.awt.Font("Glass Antiqua", 0, 22)); // NOI18N
        lb_bookname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_bookname1.setText("by");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_bookname1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_author, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(btn_reject, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_approve)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_bookname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_author, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_approve)
                            .addComponent(btn_reject))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_rejectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rejectMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_rejectMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_approve;
    private javax.swing.JLabel btn_reject;
    private javax.swing.JLabel lb_bookname;
    private javax.swing.JLabel lb_bookname1;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_bookname;
    private javax.swing.JLabel lbl_uname;
    // End of variables declaration//GEN-END:variables
}