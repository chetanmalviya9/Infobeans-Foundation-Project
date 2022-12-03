
package infobeans.foundation;


import java.sql.*;
import javax.swing.*;



public class Information extends javax.swing.JFrame {

    public Information() {
        initComponents();
       
    }

   
    @SuppressWarnings("unchecked")
      private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        regNo = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        regDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        view = new javax.swing.JButton();
        view1 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(726, 558));
        setResizable(false);

        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(726, 580));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))), " Enter Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        a.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        a.setText("Reg No.");

        b.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        b.setText("Name");

        c.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        c.setText("Reg Date");

        regNo.setBackground(new java.awt.Color(240, 240, 240));
        regNo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        name.setBackground(new java.awt.Color(240, 240, 240));
        name.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        regDate.setBackground(new java.awt.Color(240, 240, 240));
        regDate.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        regDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b)
                    .addComponent(a)
                    .addComponent(c))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regDate, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(name)
                    .addComponent(regNo))
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b))
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c)
                    .addComponent(regDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(200, 110, 280, 280);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/avx2.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 130, 140);

        update.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/icons8-update-30.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(540, 110, 130, 39);

        exit.setBackground(new java.awt.Color(255, 153, 153));
        exit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/red-x-mark-transparent-background-3.png"))); // NOI18N
        exit.setText("Exit");
        exit.setBorder(new javax.swing.border.MatteBorder(null));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exitKeyPressed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(30, 420, 80, 40);

        delete.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/icons8-remove-30.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(540, 170, 130, 39);

        view.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/icons8-search-30.png"))); // NOI18N
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view);
        view.setBounds(540, 240, 130, 39);

        view1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        view1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/icons8-more-details-30.png"))); // NOI18N
        view1.setText("View All");
        view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view1ActionPerformed(evt);
            }
        });
        jPanel1.add(view1);
        view1.setBounds(540, 310, 130, 40);

        next.setBackground(new java.awt.Color(204, 255, 204));
        next.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        next.setForeground(new java.awt.Color(255, 0, 0));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/icons8-circled-right-25.png"))); // NOI18N
        next.setText("Next");
        next.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(next);
        next.setBounds(450, 420, 100, 40);

        back.setBackground(new java.awt.Color(255, 204, 204));
        back.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 0));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/icons8-back-25.png"))); // NOI18N
        back.setText("Back");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(240, 420, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/IB bg.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 740, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);

        Menu m=new Menu();
        m.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view1ActionPerformed
        new ViewAll().setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_view1ActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        String i = regNo.getText();
        new View1(i).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_viewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infobeansFoundation","root","chetan");
            String sql = "delete from Registration where RegNo = ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,regNo.getText());

            pst.execute();

          
            pst.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, " Something went Wrong.....");
        }
        finally{
             
        }
            JOptionPane.showMessageDialog(null, "Delete Successfully.......");
    }//GEN-LAST:event_deleteActionPerformed

    private void exitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitKeyPressed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        String i = regNo.getText();
        new Update(i).setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void regDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regDateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton back;
    private javax.swing.JLabel c;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField name;
    private javax.swing.JButton next;
    private javax.swing.JTextField regDate;
    private javax.swing.JTextField regNo;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    private javax.swing.JButton view1;
    // End of variables declaration//GEN-END:variables

}
