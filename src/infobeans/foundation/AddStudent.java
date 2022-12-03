package infobeans.foundation;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class AddStudent extends javax.swing.JFrame {
Connection con=null;
PreparedStatement pst=null;
JDateChooser dob;
      
    public AddStudent() {
        initComponents();
        callDate();

    }
   
    public void callDate(){
        Date dt=new Date();
        
        SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
        
        regDate.setText(sf.format(dt));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regNo = new javax.swing.JTextField();
        batchNo = new javax.swing.JTextField();
        regDate = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        mName = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        fOcc = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        mOcc = new javax.swing.JTextField();
        cate = new javax.swing.JComboBox<>();
        marrial = new javax.swing.JComboBox<>();
        incm = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sssm = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        adhar = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ug = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        stream12th = new javax.swing.JComboBox<>();
        per12 = new javax.swing.JTextField();
        perPg = new javax.swing.JTextField();
        perUg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pg = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addLocal = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        addPer = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        Submit = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Submit2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ITEP Registration Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(5, 0, 830, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Registration Date : ");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Registration No.   : ");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Batch No.               :");

        regNo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        regNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNoActionPerformed(evt);
            }
        });
        regNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                regNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regNoKeyTyped(evt);
            }
        });

        batchNo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        batchNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                batchNoKeyPressed(evt);
            }
        });

        regDate.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        regDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regDateKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regNo)
                    .addComponent(batchNo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 50, 360, 170);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel9.setText("Name                 :");

        name.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel22.setText("Father Name :");

        jLabel23.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel23.setText("Mother Name :");

        jLabel24.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel24.setText("Date Of Birth :");

        jLabel26.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel26.setText("Gender :");

        mName.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        mName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mNameKeyPressed(evt);
            }
        });

        fName.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });
        fName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fNameKeyPressed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel27.setText("Maritial Status :");

        jLabel30.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel30.setText("Mother Occup. :");

        jLabel31.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel31.setText("Father Occup. :");

        jLabel32.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel32.setText("Annual Income :");

        fOcc.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fOcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fOccActionPerformed(evt);
            }
        });
        fOcc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fOccKeyPressed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        gender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                genderKeyPressed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel28.setText("Category :");

        mOcc.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        mOcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOccActionPerformed(evt);
            }
        });
        mOcc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mOccKeyPressed(evt);
            }
        });

        cate.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Gen", "St", "Sc", "Obc" }));
        cate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cateKeyPressed(evt);
            }
        });

        marrial.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        marrial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Married", "Unmarried" }));
        marrial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                marrialKeyPressed(evt);
            }
        });

        incm.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        incm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incmActionPerformed(evt);
            }
        });
        incm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                incmKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/res160.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fOcc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mOcc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marrial, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel28)
                            .addComponent(cate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(fOcc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel30)
                            .addComponent(mOcc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel32)
                            .addComponent(incm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(marrial, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        dob=new JDateChooser();
        dob.setBounds(180,135,126,20);
        dob.setFont(new java.awt.Font("Calibri Light", 0, 12));
        jPanel5.add(dob);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 230, 810, 210);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel8.setText("Mobile No. :");

        mobile.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobileKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobileKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel11.setText("Email Id :");

        jLabel14.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel14.setText("Adhar Card No. :");

        sssm.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        sssm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sssmKeyPressed(evt);
            }
        });

        email.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel25.setText("SSSM ID : ");

        adhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adharActionPerformed(evt);
            }
        });
        adhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adharKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adharKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sssm, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(adhar))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(adhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(sssm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(400, 50, 410, 170);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Qualification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel10.setText("UG Course :");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel12.setText("PG Course :");

        ug.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        ug.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "BBA", "BCA", "B.COM", "B.ED", "BA.LLB", "BBA(HR)", "BBA(FINANCE)", "BSC(CS)", "B.TECH", "B.ARCH", "B.VOC", "BA", "BMA", "" }));
        ug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ugActionPerformed(evt);
            }
        });
        ug.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ugKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel13.setText("12th Class :");

        stream12th.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        stream12th.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "PCM+IP", "PCM+PE", "PCB", "COMM.+IP", "COMM.+PE", "COMM.+MATHS", " " }));
        stream12th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stream12thActionPerformed(evt);
            }
        });
        stream12th.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stream12thKeyPressed(evt);
            }
        });

        per12.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        per12.setText("0");
        per12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per12ActionPerformed(evt);
            }
        });
        per12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                per12KeyPressed(evt);
            }
        });

        perPg.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        perPg.setText("0");
        perPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perPgActionPerformed(evt);
            }
        });
        perPg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                perPgKeyPressed(evt);
            }
        });

        perUg.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        perUg.setText("0");
        perUg.setToolTipText("");
        perUg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perUgActionPerformed(evt);
            }
        });
        perUg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                perUgKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel7.setText("Percentage");

        pg.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        pg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "MBA", "MCA", "M.COM", "M.ED", "MA.LLB", "MBA(HR)", "MBA(FINANCE)", "MSC(CS)", "M.TECH", "M.ARCH", "M.VOC", "MA", "MMA" }));
        pg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgActionPerformed(evt);
            }
        });
        pg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pgKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(pg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stream12th, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(per12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perUg, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perPg, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(per12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(stream12th, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perUg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perPg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(20, 440, 390, 210);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel16.setText("Correspondence");

        jLabel17.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel17.setText("Permanent");

        addLocal.setColumns(20);
        addLocal.setRows(5);
        addLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addLocalKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(addLocal);

        addPer.setColumns(20);
        addPer.setRows(5);
        addPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addPerKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(addPer);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel17)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(420, 440, 410, 210);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 880, 10);

        Submit.setBackground(new java.awt.Color(204, 204, 204));
        Submit.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/login.png"))); // NOI18N
        Submit.setText("SUBMIT");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        Submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SubmitKeyPressed(evt);
            }
        });
        jPanel1.add(Submit);
        Submit.setBounds(640, 650, 160, 50);

        exit.setBackground(new java.awt.Color(204, 204, 204));
        exit.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/red-x-mark-transparent-background-3.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(20, 650, 160, 50);

        Submit2.setBackground(new java.awt.Color(204, 204, 204));
        Submit2.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        Submit2.setText("Cancel");
        Submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit2ActionPerformed(evt);
            }
        });
        jPanel1.add(Submit2);
        Submit2.setBounds(330, 650, 160, 50);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infobeans/foundation/IB bg.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, -130, 840, 840);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
         
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void fOccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fOccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fOccActionPerformed

    private void mOccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mOccActionPerformed

    private void incmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incmActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
            
          SimpleDateFormat s;
          s = new SimpleDateFormat("yyyy-MM-dd");
       
        String form=s.format(dob.getDate());

        try{
            String query = "Insert into registration(RegNo,RegDate,BatchNo,Name,FatherName,MotherName,DOB,Gender,Category,FatherOcc"
                    + ",MotherOcc,AnnualIncome,MarrialStatus,MobNo,EmailID,AadharNo,SSSMID,Stream12th,"
                    + "Per12th,UgStream,UgPer,PgStream,PgPer,LocalAddress,PermanentAddress)values"
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/infobeansfoundation","root","chetan"); 
            
            pst=con.prepareStatement(query);
            pst.setString(1,regNo.getText());
            pst.setString(2,regDate.getText());
            pst.setString(3,batchNo.getText());
            pst.setString(4,name.getText());
            pst.setString(5,fName.getText());
            pst.setString(6,mName.getText());
            pst.setString(7,form);
            pst.setString(8,gender.getSelectedItem().toString());
            pst.setString(9,cate.getSelectedItem().toString());
            pst.setString(10,fOcc.getText());
            pst.setString(11,mOcc.getText());
            pst.setString(12,incm.getText());
            pst.setString(13,marrial.getSelectedItem().toString());
            pst.setString(14,mobile.getText());
            pst.setString(15,email.getText());
            pst.setString(16,adhar.getText());
            pst.setString(17,sssm.getText());
            pst.setString(18,stream12th.getSelectedItem().toString());
            pst.setString(19,per12.getText());
            pst.setString(20,ug.getSelectedItem().toString());
            pst.setString(21,perUg.getText());
            pst.setString(22,pg.getSelectedItem().toString());
            pst.setString(23,perPg.getText());
            pst.setString(24,addLocal.getText());
            pst.setString(25,addPer.getText());
           
            pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"REGISTER SUCCESFULLY");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void adharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adharActionPerformed
     
    }//GEN-LAST:event_adharActionPerformed

    private void per12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per12ActionPerformed

    }//GEN-LAST:event_per12ActionPerformed

    private void perPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perPgActionPerformed
    
    }//GEN-LAST:event_perPgActionPerformed

    private void perUgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perUgActionPerformed
       
    }//GEN-LAST:event_perUgActionPerformed

    private void pgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgActionPerformed
      
    }//GEN-LAST:event_pgActionPerformed

    private void ugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugActionPerformed
      
    }//GEN-LAST:event_ugActionPerformed

    private void stream12thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stream12thActionPerformed

    }//GEN-LAST:event_stream12thActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
         System.exit(0); 
    }//GEN-LAST:event_exitActionPerformed

    private void Submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit2ActionPerformed
         setVisible(false);
         Menu m=new Menu();
         m.setVisible(true);
    }//GEN-LAST:event_Submit2ActionPerformed

    private void regNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regNoKeyReleased

    }//GEN-LAST:event_regNoKeyReleased

    private void regNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regNoKeyPressed

                char ch = evt.getKeyChar();
                if(Character.isLetter(ch)){
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    regNo.setText("");
                }
                
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          batchNo.requestFocus();
   
 else if(evt.getKeyCode()==40)
      batchNo.requestFocus();

    }//GEN-LAST:event_regNoKeyPressed

    private void regNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNoActionPerformed

    }//GEN-LAST:event_regNoActionPerformed

    private void regNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regNoKeyTyped

    }//GEN-LAST:event_regNoKeyTyped

    private void mobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyPressed
char ch = evt.getKeyChar();
                if(Character.isLetter(ch))   {
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    mobile.setText("");
                }        
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           email.requestFocus();
   
         else if(evt.getKeyCode()==40)
           email.requestFocus();
 
         else if(evt.getKeyCode()==38)
           batchNo.requestFocus();
    }//GEN-LAST:event_mobileKeyPressed

    private void regDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regDateKeyPressed
  if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          batchNo.requestFocus();
   
 else if(evt.getKeyCode()==40)
       batchNo.requestFocus();

    }//GEN-LAST:event_regDateKeyPressed

    private void batchNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_batchNoKeyPressed
char ch = evt.getKeyChar();
                if(Character.isLetter(ch)){
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    batchNo.setText(" ");
                }
        
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          mobile.requestFocus();
   
         else if(evt.getKeyCode()==40)
         mobile.requestFocus();
 
         else if(evt.getKeyCode()==38)
         regNo.requestFocus();
    
        // TODO add your handling code here:
    }//GEN-LAST:event_batchNoKeyPressed

    private void adharKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adharKeyPressed

         char ch = evt.getKeyChar();
                if(Character.isLetter(ch)){
                    JOptionPane.showMessageDialog(null, "Write Numbers Only");
                    adhar.setText("");
                }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         sssm.requestFocus();
   
 else if(evt.getKeyCode()==40)
       sssm.requestFocus();
 
 else if(evt.getKeyCode()==38)
       email.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_adharKeyPressed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          adhar.requestFocus();
   
 else if(evt.getKeyCode()==40)
       adhar.requestFocus();
 
 else if(evt.getKeyCode()==38)
       mobile.requestFocus();
    

        // TODO add your handling code here:
    }//GEN-LAST:event_emailKeyPressed

    private void sssmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sssmKeyPressed

         char ch = evt.getKeyChar();
                if(Character.isLetter(ch)){
                    JOptionPane.showMessageDialog(null, "Write Numbers Only");
                    sssm.setText("");
                }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          name.requestFocus();
   
 else if(evt.getKeyCode()==40)
       name.requestFocus();
 
 else if(evt.getKeyCode()==38)
       adhar.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_sssmKeyPressed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed

        char ch = evt.getKeyChar();
                if(Character.isDigit(ch)){
                    JOptionPane.showMessageDialog(null, "Write Characters Only");
                    name.setText(" ");
                }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          fName.requestFocus();
   
 else if(evt.getKeyCode()==40)
       fName.requestFocus();
 
 else if(evt.getKeyCode()==38)
       sssm.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyPressed

    private void mNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mNameKeyPressed

        char ch = evt.getKeyChar();
                if(Character.isDigit(ch)){
                    JOptionPane.showMessageDialog(null, "Write Characters Only");
                    mName.setText(" ");
                }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          gender.requestFocus();
   
 else if(evt.getKeyCode()==40)
       gender.requestFocus();
 
 else if(evt.getKeyCode()==38)
       fName.requestFocus();
    }//GEN-LAST:event_mNameKeyPressed

    private void fNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameKeyPressed
        char ch = evt.getKeyChar();
                if(Character.isDigit(ch)){
                    JOptionPane.showMessageDialog(null, "Write Characters Only");
                    fName.setText("");
                }
        
          if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          mName.requestFocus();
   
          else if(evt.getKeyCode()==40)
          mName.requestFocus();
 
          else if(evt.getKeyCode()==38)
          name.requestFocus();
    }//GEN-LAST:event_fNameKeyPressed

    private void genderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genderKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         cate.requestFocus();
   
 else if(evt.getKeyCode()==40)
       cate.requestFocus();
 
 else if(evt.getKeyCode()==38)
       mName.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_genderKeyPressed

    private void cateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cateKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          fOcc.requestFocus();
   
 else if(evt.getKeyCode()==40)
       fOcc.requestFocus();
 
 else if(evt.getKeyCode()==38)
       gender.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_cateKeyPressed

    private void fOccKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fOccKeyPressed

          char ch = evt.getKeyChar();
                if(Character.isDigit(ch)){
                    JOptionPane.showMessageDialog(null, "Write Characters Only");
                    fOcc.setText("");
                }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          mOcc.requestFocus();
   
 else if(evt.getKeyCode()==40)
       mOcc.requestFocus();
 
 else if(evt.getKeyCode()==38)
       cate.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_fOccKeyPressed

    private void mOccKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mOccKeyPressed

          char ch = evt.getKeyChar();
                if(Character.isDigit(ch)){
                    JOptionPane.showMessageDialog(null, "Write Characters Only");
                    mOcc.setText("");
                }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          incm.requestFocus();
   
 else if(evt.getKeyCode()==40)
       incm.requestFocus();
 
 else if(evt.getKeyCode()==38)
       fOcc.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_mOccKeyPressed

    private void incmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_incmKeyPressed

        
          char ch = evt.getKeyChar();
                if(Character.isLetter(ch)){
                    JOptionPane.showMessageDialog(null, "Write numbers only");
                    incm.setText("");
                }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          marrial.requestFocus();
   
 else if(evt.getKeyCode()==40)
       marrial.requestFocus();
 
 else if(evt.getKeyCode()==38)
       mOcc.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_incmKeyPressed

    private void marrialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marrialKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          stream12th.requestFocus();
   
 else if(evt.getKeyCode()==40)
       stream12th.requestFocus();
 
 else if(evt.getKeyCode()==38)
       incm.requestFocus();
            // TODO add your handling code here:
    }//GEN-LAST:event_marrialKeyPressed

    private void stream12thKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stream12thKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          ug.requestFocus();
   
 else if(evt.getKeyCode()==40)
       ug.requestFocus();
 
 else if(evt.getKeyCode()==38)
       marrial.requestFocus();

else if(evt.getKeyCode()==39)
       per12.requestFocus();
    
// TODO add your handling code here:
    }//GEN-LAST:event_stream12thKeyPressed

    private void ugKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ugKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          pg.requestFocus();
   
 else if(evt.getKeyCode()==40)
       pg.requestFocus();
 
 else if(evt.getKeyCode()==38)
       stream12th.requestFocus();

else if(evt.getKeyCode()==39)
       perUg.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_ugKeyPressed

    private void pgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pgKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          addLocal.requestFocus();
   
 else if(evt.getKeyCode()==40)
       addLocal.requestFocus();
 
 else if(evt.getKeyCode()==38)
       ug.requestFocus();
else if(evt.getKeyCode()==39)
       perPg.requestFocus();

      // TODO add your handling code here:
    }//GEN-LAST:event_pgKeyPressed

    private void per12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_per12KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          perUg.requestFocus();
   
 else if(evt.getKeyCode()==37)
       stream12th.requestFocus();
 else if(evt.getKeyCode()==38)
       stream12th.requestFocus();

else if(evt.getKeyCode()==40)
       perUg.requestFocus();
 
 
        // TODO add your handling code here:
    }//GEN-LAST:event_per12KeyPressed

    private void perUgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perUgKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          perPg.requestFocus();
else if(evt.getKeyCode()==40)
       perPg.requestFocus();   

 else if(evt.getKeyCode()==37)
       ug.requestFocus();
 
  else if(evt.getKeyCode()==38)
       per12.requestFocus();



         // TODO add your handling code here:
    }//GEN-LAST:event_perUgKeyPressed

    private void perPgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perPgKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          addLocal.requestFocus();
   
 else if(evt.getKeyCode()==37)
      pg.requestFocus();
else if(evt.getKeyCode()==38)
       perUg.requestFocus();
else if(evt.getKeyCode()==40)
       addLocal.requestFocus();
         // TODO add your handling code here:
    }//GEN-LAST:event_perPgKeyPressed

    private void addLocalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addLocalKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         addPer.requestFocus();
   
 else if(evt.getKeyCode()==40)
       addPer.requestFocus();
 
 else if(evt.getKeyCode()==38)
       perPg.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_addLocalKeyPressed

    private void addPerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addPerKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         Submit.requestFocus();
   
 else if(evt.getKeyCode()==40)
       Submit.requestFocus();
 
 else if(evt.getKeyCode()==38)
       addLocal.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_addPerKeyPressed

    private void SubmitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SubmitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitKeyPressed

    private void mobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyReleased
   String s=mobile.getText();
   
    char ch = evt.getKeyChar();
                
   if(s.length()==10)
   {
       mobile.setBackground(Color.WHITE);
   }
   else
       mobile.setBackground(Color.orange);
       //JOptionPane.showMessageDialog(null, "Incorrect No.");

        // TODO add your handling code here:
    }//GEN-LAST:event_mobileKeyReleased

    private void adharKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adharKeyReleased
        String s=adhar.getText();
   
    char ch = evt.getKeyChar();
                
   if(Character.isDigit(ch)&&s.length()==12)
   {
       adhar.setBackground(Color.WHITE);
   }
   else
       adhar.setBackground(Color.orange);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_adharKeyReleased

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit2;
    private javax.swing.JTextArea addLocal;
    private javax.swing.JTextArea addPer;
    private javax.swing.JTextField adhar;
    private javax.swing.JTextField batchNo;
    private javax.swing.JComboBox<String> cate;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField fOcc;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField incm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mName;
    private javax.swing.JTextField mOcc;
    private javax.swing.JComboBox<String> marrial;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JTextField per12;
    private javax.swing.JTextField perPg;
    private javax.swing.JTextField perUg;
    private javax.swing.JComboBox<String> pg;
    private javax.swing.JLabel regDate;
    private javax.swing.JTextField regNo;
    private javax.swing.JTextField sssm;
    private javax.swing.JComboBox<String> stream12th;
    private javax.swing.JComboBox<String> ug;
    // End of variables declaration//GEN-END:variables
}
