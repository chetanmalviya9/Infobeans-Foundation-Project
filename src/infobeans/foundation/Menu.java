
package infobeans.foundation;

import java.awt.event.KeyEvent;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        B4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Infobeans Foundation");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(10, 10, 400, 400));
        setResizable(false);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.light"));
        jPanel1.setLayout(null);

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        B1.setForeground(java.awt.Color.red);
        B1.setText("New Registration");
        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        B1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B1KeyPressed(evt);
            }
        });
        jPanel1.add(B1);
        B1.setBounds(150, 150, 220, 33);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/avx2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 360, 130, 140);

        B4.setBackground(new java.awt.Color(255, 255, 255));
        B4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        B4.setForeground(java.awt.Color.red);
        B4.setText("Other Operations");
        B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        B4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B4KeyPressed(evt);
            }
        });
        jPanel1.add(B4);
        B4.setBounds(150, 230, 220, 33);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAIN MENU");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 20, 220, 42);

        exit.setBackground(new java.awt.Color(255, 153, 153));
        exit.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/red-x-mark-transparent-background-3.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(230, 450, 110, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/IB bg.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 690, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
this.setVisible(false);
        AddStudent a=new AddStudent();
         a.setVisible(true);
      


    }//GEN-LAST:event_B1ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed

        this.setVisible(false);
        Information i=new Information();
     i.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            this.setVisible(false);
            AddStudent a=new AddStudent();
            a.setVisible(true);
        }
        else if(evt.getKeyCode()==40)
        B4.requestFocus();
    }//GEN-LAST:event_B1KeyPressed

    private void B4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B4KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
   {
        this.setVisible(false);
        Information a=new Information();
        a.setVisible(true);
   }
else if(evt.getKeyCode()==38)
     B1.requestFocus();



        // TODO add your handling code here:
    }//GEN-LAST:event_B4KeyPressed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B4;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
