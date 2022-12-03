
package infobeans.foundation;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        unm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        unm2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        unm1 = new javax.swing.JLabel();
        PIN1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(null);

        unm.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        unm.setForeground(new java.awt.Color(255, 255, 255));
        unm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unm.setText("ADMIN LOGIN ");
        jPanel3.add(unm);
        unm.setBounds(0, -10, 690, 90);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/lgin.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(310, 300, 90, 30);

        unm2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        unm2.setForeground(new java.awt.Color(255, 0, 0));
        unm2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unm2.setText("Welcome to InfoBeans Foundation !!");
        jPanel2.add(unm2);
        unm2.setBounds(190, 10, 380, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/avx2.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 50, 117, 150);

        unm1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        unm1.setForeground(new java.awt.Color(255, 0, 0));
        unm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/icons8-security-pass-30.png"))); // NOI18N
        unm1.setText(" ");
        jPanel2.add(unm1);
        unm1.setBounds(230, 180, 40, 30);

        PIN1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PIN1.setForeground(new java.awt.Color(255, 0, 0));
        PIN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PIN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/icons8-password-30.png"))); // NOI18N
        PIN1.setText(" ");
        jPanel2.add(PIN1);
        PIN1.setBounds(230, 220, 40, 30);

        tf1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tf1.setForeground(new java.awt.Color(204, 204, 204));
        tf1.setText("Username");
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf1FocusLost(evt);
            }
        });
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
        });
        jPanel2.add(tf1);
        tf1.setBounds(300, 180, 120, 30);

        pf1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pf1.setForeground(new java.awt.Color(204, 204, 204));
        pf1.setText("Password");
        pf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pf1FocusLost(evt);
            }
        });
        pf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf1ActionPerformed(evt);
            }
        });
        pf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf1KeyPressed(evt);
            }
        });
        jPanel2.add(pf1);
        pf1.setBounds(300, 220, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/office-worker-icon (2).png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(430, 60, 110, 110);

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setAlignmentX(2.0F);
        jSeparator1.setAlignmentY(2.0F);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(180, 0, 10, 420);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(50, 60, 590, 420);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/IB bg.png"))); // NOI18N
        jLabel2.setText(" ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 690, 520);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void pf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String user = tf1.getText();
        String P =new String(pf1.getPassword());

        if ( P.equals("1234") && user.equals("Admin"))
        {      Menu m=new Menu();
               m.setVisible(true);
               this.setVisible(false);
        }
        
        else{
            JOptionPane.showMessageDialog(rootPane,"Incorrect UserName & Password");
            tf1.setText("");
            pf1.setText("");
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
   if(evt.getKeyCode()==KeyEvent.VK_ENTER)
   {
       pf1.requestFocus();
   }
   else if(evt.getKeyCode()==40)
       pf1.requestFocus();
    }//GEN-LAST:event_tf1KeyPressed

    private void pf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf1KeyPressed
 if(evt.getKeyCode()==KeyEvent.VK_ENTER)
   { if(evt.getKeyCode()==KeyEvent.VK_ENTER)
   {
        String user = tf1.getText();
        String P =new String(pf1.getPassword());

        if ( P.equals("1234") && user.equals("Admin"))
        {      Menu m=new Menu();
               m.setVisible(true);
        }
        
        else{
            JOptionPane.showMessageDialog(rootPane,"Incorrect UserName & Password");
            tf1.setText("");
            pf1.setText("");
        }
   }
}
 else if(evt.getKeyCode()==38)
     tf1.requestFocus();
    }//GEN-LAST:event_pf1KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained
if(tf1.getText().equals("Username"))
{
    tf1.setText("");
    tf1.setForeground(new Color(0,0,0));
}
    }//GEN-LAST:event_tf1FocusGained

    private void pf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf1FocusGained
if(pf1.getText().equals("Password"))
{
    pf1.setText(null);
    pf1.setForeground(new Color(0,0,0));
    
}   

    }//GEN-LAST:event_pf1FocusGained

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
if(tf1.getText().equals(""))
{
    tf1.setText("Username");
    tf1.setForeground(new Color(153,153,153));
}
        
// TODO add your handling code here:
    }//GEN-LAST:event_tf1FocusLost

    private void pf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf1FocusLost
      if(pf1.getText().equals(""))
{
    pf1.setText("Password");
    pf1.setForeground(new Color(153,153,153));
    
}     // TODO add your handling code here:
    }//GEN-LAST:event_pf1FocusLost

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PIN1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JTextField tf1;
    private javax.swing.JLabel unm;
    private javax.swing.JLabel unm1;
    private javax.swing.JLabel unm2;
    // End of variables declaration//GEN-END:variables
}
