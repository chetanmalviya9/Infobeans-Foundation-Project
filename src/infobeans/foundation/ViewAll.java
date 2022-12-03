
package infobeans.foundation;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class ViewAll extends javax.swing.JFrame {

    public ViewAll() {
        initComponents();
        initilizeValue();
    }
   public void initilizeValue()   {
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/InfobeansFoundation","root","chetan");
            
            Statement pst = connection.createStatement();
            String sql = "select * from Registration ";
            ResultSet rs = pst.executeQuery(sql);
            
            while(rs.next()){
                String regNo = String.valueOf(rs.getInt("RegNo"));
                String regDate = rs.getString("RegDate");
                String batchNo = rs.getString("BatchNo");
                String name = rs.getString("Name");
                String fName= rs.getString("FatherName");
                String mName= rs.getString("MotherName");
                String dob = rs.getString("DOB");
                String gender = rs.getString("Gender");
                String cate= rs.getString("Category");
                String fOcc= rs.getString("FatherOcc");
                String mOcc= rs.getString("MotherOcc");
                String annual= rs.getString("AnnualIncome");
                String status= rs.getString("MarrialStatus");
                String mobNo= rs.getString("MobNo");
                String email= rs.getString("EmailID");
                String aadhar= rs.getString("AadharNo");
                String sssm= rs.getString("SSSMID");
                String str12= rs.getString("Stream12th");
                String per12= rs.getString("Per12th");
                String ug= rs.getString("UgStream");
                String perUg= rs.getString("UgPer");
                String pg= rs.getString("PgStream");
                String perPg= rs.getString("PgPer");
                String local= rs.getString("LocalAddress");
                String permanent= rs.getString("PermanentAddress");
                String tableData[] = {regNo,regDate,batchNo,name,fName,mName,dob,gender,cate,fOcc,mOcc,annual,status,mobNo,email,aadhar,sssm,str12,per12,ug,perUg,pg,perPg,local,permanent};
                DefaultTableModel model = (DefaultTableModel)dataTable.getModel();
                model.addRow(tableData);
            }
        }
            catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        } 
   } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        back = new javax.swing.JButton();
        back1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dataTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dataTable.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration No.", "Registration Date", "Batch No.", "Name", "Farther's Name", "Mother's Name", "DOB", "Gender", "Category", "Father Occupation", "Mother Occupation", "Annual Income", "Marital Status", "Mobile No.", "Email ID", "Aadhar No.", "SSSM ID", "12th Stream", "12th Percentage", "UG Stream", "UG Percentage", "PG Stream", "PG Percentage", "Local Address", "Permanent Address"
            }
        ));
        dataTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        dataTable.setAutoscrolls(false);
        jScrollPane2.setViewportView(dataTable);

        back.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/red-x-mark-transparent-background-3.png"))); // NOI18N
        back.setText("Exit");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        back1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        back1.setText("Back");
        back1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         System.exit(0);
    }//GEN-LAST:event_backActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
  this.setVisible(false);

       Information i=new Information();
        i.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_back1ActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JTable dataTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
