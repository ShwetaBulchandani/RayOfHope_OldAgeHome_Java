/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Adoption.FinanceCheck;

import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.FinanceVerificationOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.Utility.SendMail;
import Business.WorkQueue.AdopterWorkStatusCheckRequest;
import Business.WorkQueue.FinanceCheckProcessWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * Finance Check Process
 * @author khyati
 */
public class FinanceCheckProcess extends javax.swing.JPanel {

    /**
     * Creates new form FinanceCheckProcess
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    AdopterDirectory adopterdirectory;
    FinanceVerificationOrganization financeOrganization;
    Adopter adopter;
    FinanceCheckProcessWorkRequest financeCCWorkRequest;
    
    public FinanceCheckProcess(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory adopterdirectory, FinanceCheckProcessWorkRequest financeCCWorkRequest, Adopter adopter) {
        initComponents();
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.adopterdirectory=adopterdirectory;
        this.account=account;
        this.enterprise=enterprise;
        this.business = business;
        this.financeOrganization = (FinanceVerificationOrganization)organization;
        this.adopter = adopter;
        this.financeCCWorkRequest =  financeCCWorkRequest;
        populateWorkRequest();
        setUserDetailsField();
        
        txtName.setEnabled(false);
        txtAge.setEnabled(false);
        txtSSN.setEnabled(false);
        txtIncome.setEnabled(false);
        txtEmail.setEnabled(false);
        rdbMale.setEnabled(false);
        rdbFemale.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtIncome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        lblRemarks = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        btnDeny = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 226, 187));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 52, 58));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Finance Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 338, 24));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Email ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 90, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Age");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("SSN");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Gender");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 90, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Income");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 90, 20));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 170, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 160, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 160, -1));
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 160, -1));
        add(txtIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 170, -1));

        tblRequest.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "User ID", "User Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 900, 110));

        lblRemarks.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblRemarks.setText("Remarks");
        add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 70, -1));

        txtRemarks.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtRemarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemarksActionPerformed(evt);
            }
        });
        add(txtRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 210, 70));

        btnDeny.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnDeny.setText("Deny");
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });
        add(btnDeny, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 120, -1));

        btnApprove.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 120, -1));

        rdbMale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdbMale.setText("Male");
        add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 70, -1));

        rdbFemale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdbFemale.setText("Female");
        add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/finance-png-20994.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 560, 580));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshBtn.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    // Approve Action
    
    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the request to proceed.");
            return;
        }

        Object statusval = tblRequest.getValueAt(selectedRow, 5);
        Object receiverval = tblRequest.getValueAt(selectedRow, 2);
        if ("Approved".equals(statusval) || "Denied".equals(statusval)) {
            JOptionPane.showMessageDialog(null, "Request already processed");
        } else {
            if (receiverval.equals(account.getUsername())) {
                FinanceCheckProcessWorkRequest request = (FinanceCheckProcessWorkRequest) tblRequest.getValueAt(selectedRow, 0);

                request.setStatus("Approved");
                request.setRemarks(txtRemarks.getText());
                request.setSender(account);
                request.setUserId(adopter.getUserId());
                request.setFinanceStatus("Approved");
                populateWorkRequest();

                for (WorkRequest req : business.getWorkQueue().getWorkRequestList()) {
                    if (req.getUserId() == adopter.getUserId()) {
                        if (req instanceof AdopterWorkStatusCheckRequest) {

                            ((AdopterWorkStatusCheckRequest) req).setFinanceStatus("Approved");
                            ((AdopterWorkStatusCheckRequest) req).setBgcStatus("Approved");
                        }
                    }
                }
                String subject = "Finance Check Approved For Adoption";
                String content = "Congratulations! Your finance check process has been completed and approved. You can confirm your status through portal. You will shortly recieve final confirmation mail on your adoption procedure. \nThank you.";
                try {
                    SendMail.sendEmailMessage(adopter.getEmailId(), subject, content);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(FinanceCheckProcess.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Finance check completed successfully!");
                JOptionPane.showMessageDialog(null, "Checks cleared, User is good to proceed with Adoption!");
            } else {
                JOptionPane.showMessageDialog(null, "Please select work request assigned to you");
            }
        }
        txtRemarks.setText("");
    }//GEN-LAST:event_btnApproveActionPerformed
 
    
    // Deny Action
    
    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the request to proceed.");
            return;
        }
        Object statusval = tblRequest.getValueAt(selectedRow, 5);
        Object receiverval = tblRequest.getValueAt(selectedRow, 2);

        if ("Approved".equals(statusval) || "Denied".equals(statusval)) {
            JOptionPane.showMessageDialog(null, "Request already processed");
        } else {

            if (receiverval.equals(account.getUsername())) {

                FinanceCheckProcessWorkRequest request = (FinanceCheckProcessWorkRequest) tblRequest.getValueAt(selectedRow, 0);

                request.setStatus("Denied");
                request.setRemarks(txtRemarks.getText());
                request.setUserId(adopter.getUserId());
                request.setFinanceStatus("Denied");
                populateWorkRequest();

                for (WorkRequest req : business.getWorkQueue().getWorkRequestList()) {
                    if (req.getUserId() == adopter.getUserId()) {
                        if (req instanceof AdopterWorkStatusCheckRequest) {
                            ((AdopterWorkStatusCheckRequest) req).setFinanceStatus("Denied");
                            ((AdopterWorkStatusCheckRequest) req).setBgcStatus("Approved");
                        }
                    }
                }
                String subject = "Finance Check Verification failed";
                String content = "We are sorry to inform you that your finance check has been failed and you cannot proceed further with adoption procedure. You can confirm your status through portal. \nThank you.";
                try {
                    SendMail.sendEmailMessage(adopter.getEmailId(), subject, content);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(FinanceCheckProcess.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        txtRemarks.setText("");
    }//GEN-LAST:event_btnDenyActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        populateWorkRequest();
    }//GEN-LAST:event_jLabel9MousePressed

    private void txtRemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarksActionPerformed
    
    public void populateWorkRequest() {

        DefaultTableModel dtm = (DefaultTableModel) tblRequest.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : financeOrganization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof FinanceCheckProcessWorkRequest) {
                if (request.getUserId() == financeCCWorkRequest.getUserId()) {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = request;
                    row[1] = request.getSender().getEmployee().getName();
                    row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    row[3] = request.getUserId();
                    row[4] = request.getName();
                    row[5] = request.getStatus();
                    dtm.addRow(row);
                }
            }
        }
    }

    public void setUserDetailsField() {
        txtAge.setText(String.valueOf(adopter.getAge()));
        txtEmail.setText(adopter.getEmailId());
        if (adopter.getGender().equalsIgnoreCase("male")) {
            rdbMale.setSelected(true);
        } else {
            rdbFemale.setSelected(true);
        }
        txtIncome.setText(String.valueOf(adopter.getAnnualIncome()));
        txtName.setText(adopter.getName());
        txtSSN.setText(adopter.getSsn());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnDeny;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}
