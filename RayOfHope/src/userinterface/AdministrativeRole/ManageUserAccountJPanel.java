/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author khyati
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private EcoSystem ecosystem;

    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        this.ecosystem = ecosystem;
        popOrganizationComboBox();
        popData();
    }
    
     public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        employeeJComboBox.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            employeeJComboBox.addItem(employee);
        }
    }

    private void populateRoleComboBox(Organization organization) {
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            roleJComboBox.addItem(role);
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

        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 226, 187));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createUserJButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 133, 33));

        nameJTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 200, 35));
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 506, 200, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 89, 35));

        userJTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setResizable(false);
            userJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 680, 140));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 89, 35));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 105, 35));

        employeeJComboBox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 200, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 105, 34));

        organizationJComboBox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 200, 30));
        organizationJComboBox.getAccessibleContext().setAccessibleName("");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 66, 35));

        roleJComboBox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 200, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/491-4918411_thumb-image-user-management-cartoon-hd-png-download-removebg-preview.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 570, 560));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 52, 58));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage User Account");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 420, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
            String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        if ("".equals(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter username");
        } else if (!ecosystem.checkIfUserIsUnique(userName)) {
            JOptionPane.showMessageDialog(null, "Please enter unique username");
        } else if ("".equals(password)) {
            JOptionPane.showMessageDialog(null, "Please enter password");
        } else {
            Organization organization = (Organization) organizationJComboBox.getSelectedItem();
            Employee employee = (Employee) employeeJComboBox.getSelectedItem();
            Role role = (Role) roleJComboBox.getSelectedItem();
            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
            JOptionPane.showMessageDialog(null, "User Account Created");
            nameJTextField.setText("");
            passwordJTextField.setText("");
            popData();
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
            nameJTextField.setText("");
            passwordJTextField.setText("");
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
