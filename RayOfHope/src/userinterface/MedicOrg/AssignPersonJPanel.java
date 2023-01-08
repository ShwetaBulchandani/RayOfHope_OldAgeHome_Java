/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.MedicOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.LabOrganization;
import Business.Organizations.MedicOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicalAssistanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Organizations.PharmacistOrganization;
import Business.WorkQueue.LabAssistanceWorkRequest;
import Business.WorkQueue.PharmacistAssistWorkRequest;
import javax.swing.BorderFactory;
import userinterface.MedicOrg.MedicMedicinePrescription;
import userinterface.MedicOrg.MedicLabRequest;

/**
 * Assign Person JPanel
 * @author shwetabulchandani
 */
public class AssignPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignPersonJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PharmacistOrganization pharmacyOrganization;
    private MedicOrganization medicorganization;
    private EcoSystem business;
    MedicalAssistanceWorkRequest request;
    private PersonDirectory persondirectory;
    private Person person;
    private LabOrganization labOrganization;
    double temperature;
    double pulserate;
    double BP;
    double respirationrate;
    Network network;
    public AssignPersonJPanel(JPanel userProcessContainer, MedicalAssistanceWorkRequest request, Person person, UserAccount userAccount, MedicOrganization medicorganization, Enterprise enterprise, EcoSystem business, PersonDirectory persondirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.persondirectory = persondirectory;
        this.person = person;
        this.medicorganization = medicorganization;
        this.business = business;
        for (Network net : business.getNetworkCatalog()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
            }
        }
        getPersonDetails();
        displayImage();
        populateLabTable();
        populateMedicationTable();
        txtName.setEnabled(false);
        txtAge.setEnabled(false);
        btnMale.setEnabled(false);
        btnFemale.setEnabled(false);
        txtMark.setEnabled(false);
        lblName.setEnabled(false);
        lblAge.setEnabled(false);
        lblGender.setEnabled(false);
        lblMark.setEnabled(false);
    }
    
    // Populate Table 
    
    public void populateLabTable() {
        DefaultTableModel model = (DefaultTableModel) tblLab.getModel();
        model.setRowCount(0);
        for (WorkRequest labrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (labrequest instanceof MedicalAssistanceWorkRequest || labrequest instanceof LabAssistanceWorkRequest) {
                if (labrequest.getPersonId() == person.getPersonId()) {
                    Object[] row = new Object[model.getColumnCount()];
                    row[0] = labrequest;
                    row[1] = labrequest.getPersonId();
                    row[2] = labrequest.getPersonName();
                    row[3] = labrequest.getReceiver();
                    row[4] = labrequest.getStatus();
                    if (labrequest instanceof MedicalAssistanceWorkRequest) {
                        String result = ((MedicalAssistanceWorkRequest) labrequest).getTestResult();
                        row[5] = result == null ? "Waiting" : result;
                    } else if (labrequest instanceof LabAssistanceWorkRequest) {
                        String result = ((LabAssistanceWorkRequest) labrequest).getResult();
                        row[5] = result == null ? "Waiting" : result;
                    }
                    model.addRow(row);
                }
            }
        }
    }
    
    public void populateMedicationTable() {
        DefaultTableModel model = (DefaultTableModel) tblMedication.getModel();
        model.setRowCount(0);
        for (WorkRequest pharrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (pharrequest instanceof MedicalAssistanceWorkRequest || pharrequest instanceof PharmacistAssistWorkRequest) {
                if (pharrequest.getPersonId() == person.getPersonId()) {
                    Object[] row = new Object[model.getColumnCount()];
                    row[0] = pharrequest;
                    row[1] = request.getPersonId();
                    row[2] = request.getPersonName();
                    row[3] = pharrequest.getReceiver();
                    if (pharrequest instanceof MedicalAssistanceWorkRequest) {
                        String result = ((MedicalAssistanceWorkRequest) pharrequest).getTestResult();
                        row[4] = result == null ? "Prescribed Medicine" : result;
                    } else if (pharrequest instanceof PharmacistAssistWorkRequest) {
                        String result = ((PharmacistAssistWorkRequest) pharrequest).getResult();
                        row[4] = result == null ? "Waiting" : result;
                    }
                    if (pharrequest instanceof MedicalAssistanceWorkRequest) {
                        String medicalPrescription = ((MedicalAssistanceWorkRequest) pharrequest).getPrescription();
                        row[5] = medicalPrescription == null ? "" : medicalPrescription;
                    } else if (pharrequest instanceof PharmacistAssistWorkRequest) {
                        String medicalPrescription = ((PharmacistAssistWorkRequest) pharrequest).getPrescription();
                        row[5] = medicalPrescription == null ? "" : medicalPrescription;
                    }
                    model.addRow(row);
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
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblMark = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtMark = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        lblPulseRate = new javax.swing.JLabel();
        lblRespiratoryRate = new javax.swing.JLabel();
        lblBP = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtRR = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        btnRequestTest = new javax.swing.JButton();
        btnPrescribeMedication = new javax.swing.JButton();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        lblPersonPic = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        ScrollPaneLabWork = new javax.swing.JScrollPane();
        tblLab = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedication = new javax.swing.JTable();
        lblLabWork = new javax.swing.JLabel();
        lblMedicationHistory = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 226, 187));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personal Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 350, 20));

        lblName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 30));

        lblAge.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, 20));

        lblGender.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 130, 20));

        lblMark.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblMark.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMark.setText("Identification Mark");
        add(lblMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, 20));

        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 210, 30));

        txtMark.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtMark.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 210, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vital Signs Of Patient");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 340, 20));

        lblTemp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblTemp.setText("Body Temperature");
        add(lblTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 130, 20));

        lblPulseRate.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblPulseRate.setText("Pulse Rate");
        add(lblPulseRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 110, 20));

        lblRespiratoryRate.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblRespiratoryRate.setText("Respiratory Rate");
        add(lblRespiratoryRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 120, -1));

        lblBP.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblBP.setText("Blood Pressure");
        add(lblBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 140, 20));

        txtTemp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 160, 30));

        txtPulse.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 160, -1));

        txtRR.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtRR, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 160, -1));

        txtBP.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 160, -1));

        btnRequestTest.setText("Request Lab Test");
        btnRequestTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTestActionPerformed(evt);
            }
        });
        add(btnRequestTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 150, -1));

        btnPrescribeMedication.setText("Prescribe Medication");
        btnPrescribeMedication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescribeMedicationActionPerformed(evt);
            }
        });
        add(btnPrescribeMedication, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 160, 30));

        btnMale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnMale.setText("Male");
        add(btnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        btnFemale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnFemale.setText("Female");
        add(btnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 120, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 90, -1));

        lblPersonPic.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(lblPersonPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 180, 180));

        txtAge.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 210, 30));

        tblLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Test Requested", "Person ID", "Person Name", "Receiver", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPaneLabWork.setViewportView(tblLab);

        add(ScrollPaneLabWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 850, 90));

        tblMedication.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Person ID", "Person Name", "Receiver", "Status", "Medication Prescribed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMedication);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 850, 90));

        lblLabWork.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lblLabWork.setText("Lab Work History");
        add(lblLabWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 200, 20));

        lblMedicationHistory.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lblMedicationHistory.setText("Medication History");
        add(lblMedicationHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 190, -1));

        btnBack.setForeground(new java.awt.Color(255, 51, 51));
        btnBack.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnBack.setContentAreaFilled(false);
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3076404-removebg-preview.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 860, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTestActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("MedicRequestLab", new MedicLabRequest(userProcessContainer, userAccount, enterprise, person, persondirectory, request ,business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestTestActionPerformed

    private void btnPrescribeMedicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescribeMedicationActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("MedicMedicinePrescription", new MedicMedicinePrescription(userProcessContainer, userAccount,  enterprise ,person, persondirectory,request ,business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPrescribeMedicationActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtTemp.getText().isEmpty() || txtPulse.getText().isEmpty() || txtRR.getText().isEmpty() || txtBP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vital Signs cannot be empty");
            return;
        } else {
            try {
                temperature = Double.parseDouble(txtTemp.getText());
                if (temperature <= 0.0) {
                    JOptionPane.showMessageDialog(null, "Body Temperature should be positive");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Body Temperature should be numeric");
                return;
            }
            try {
                pulserate = Double.parseDouble(txtPulse.getText());
                if (pulserate <= 0.0) {
                    JOptionPane.showMessageDialog(null, "Pulse Rate should be positive");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Pulse Rate should be numeric");
                return;
            }
            try {
                BP = Double.parseDouble(txtBP.getText());
                if (BP <= 0.0) {
                    JOptionPane.showMessageDialog(null, "Bloodpressure should be positive");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Blood Pressure should be numeric");
                return;
            }
            try {
                respirationrate = Double.parseDouble(txtRR.getText());
                if (respirationrate <= 0.0) {
                    JOptionPane.showMessageDialog(null, "Respiration rate should be positive");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Repiration Rate should be numeric");
                return;
            }
        }
        person.setBP(BP);
        person.setBodytemp(temperature);
        person.setPulseRate(pulserate);
        person.setRespirationRate(respirationrate);
        txtTemp.setEnabled(true);
        txtPulse.setEnabled(true);
        txtBP.setEnabled(true);
        txtRR.setEnabled(true);
        JOptionPane.showMessageDialog(this, "Vital Signs have been added.");
        btnRequestTest.setEnabled(true);
        btnPrescribeMedication.setEnabled(true);


        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
       MedicJPanel panel = (MedicJPanel) component;
        panel.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    public void displayImage() {
        BufferedImage image = null; //Buffered image object
        String filename = person.getImageDetails(); //Getting the filepath and storing into the string
        try {
            image = ImageIO.read(new File(filename));  //Reading the filename and storing it in image
        } catch (Exception e) { //Generic exception if something goes wrong while reading the image
            JOptionPane.showMessageDialog(null, "File not found");
            //Setting the image to the icon and then passing it ot he image JLabel  
        }
            ImageIcon icon = new ImageIcon(image);
            lblPersonPic.setIcon(icon);
        
    }
    
    private void getPersonDetails() {
        displayImage();
        txtName.setText(person.getName());
        txtAge.setText(String.valueOf(person.getPersonAge()));
        if (person.getGender().equalsIgnoreCase("male")) {
            btnMale.setSelected(true);
        } else {
            btnFemale.setSelected(true);
        }
        txtMark.setText(person.getIdentificationMark());
        txtTemp.setText(String.valueOf(person.getBodytemp()));
        txtPulse.setText(String.valueOf(person.getPulseRate()));
        txtBP.setText(String.valueOf(person.getBP()));
        txtRR.setText(String.valueOf(person.getRespirationRate()));
        if (person.getBodytemp() == 0.0 || person.getBP() == 0.0 || person.getPulseRate() == 0.0 || person.getRespirationRate() == 0.0) {
            btnRequestTest.setEnabled(false);
            btnPrescribeMedication.setEnabled(false);
        } else {
            btnRequestTest.setEnabled(true);
            btnPrescribeMedication.setEnabled(true);
        }
        displayImage();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneLabWork;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JButton btnPrescribeMedication;
    private javax.swing.JButton btnRequestTest;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLabWork;
    private javax.swing.JLabel lblMark;
    private javax.swing.JLabel lblMedicationHistory;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPersonPic;
    private javax.swing.JLabel lblPulseRate;
    private javax.swing.JLabel lblRespiratoryRate;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JTable tblLab;
    private javax.swing.JTable tblMedication;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtMark;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtRR;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}
