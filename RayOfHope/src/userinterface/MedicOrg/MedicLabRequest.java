/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.MedicOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.LabOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import Business.Person.PersonDirectory;
import Business.Person.Person;
import Business.WorkQueue.LabAssistanceWorkRequest;
import Business.WorkQueue.MedicalAssistanceWorkRequest;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
/**
 * Medic Lab Request
 * @author shwetabulchandani
 */
public class MedicLabRequest extends javax.swing.JPanel {

    /**
     * Creates new form MedicLabRequest
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PersonDirectory persondirectory;
    private Person person;
    private  MedicalAssistanceWorkRequest request;
    private  EcoSystem business;
    Network network;
    public MedicLabRequest(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Person person, PersonDirectory persondirectory, MedicalAssistanceWorkRequest request, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.person = person;
        this.persondirectory = persondirectory;
        this.business = business;
        this.request = request;
        for (Network net : business.getNetworkCatalog()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
            }
        }
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
        txtTest = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 226, 187));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 52, 58));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request a test");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 350, 30));

        txtTest.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 270, 90));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Test Description");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 140, 20));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 110, 30));

        btnBack.setForeground(new java.awt.Color(255, 51, 51));
        btnBack.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnBack.setContentAreaFilled(false);
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/female doc and patients.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 760, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String message = txtTest.getText();
        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter test name");
        } else {
            LabAssistanceWorkRequest labRequest = new LabAssistanceWorkRequest();
            labRequest.setMessage(message);
            labRequest.setSender(userAccount);
            labRequest.setStatus("Sent");
            labRequest.setPersonId(request.getPersonId());
            labRequest.setPersonName(request.getPersonName());
            labRequest.setStatus("Medical Test Requested");
            JOptionPane.showMessageDialog(this, "Lab Test details added! ");
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof LabOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(labRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(labRequest);
            }
        }
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AssignPersonJPanel panel = (AssignPersonJPanel) component;
        panel.populateLabTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AssignPersonJPanel panel = (AssignPersonJPanel) component;
        panel.populateLabTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtTest;
    // End of variables declaration//GEN-END:variables
}
