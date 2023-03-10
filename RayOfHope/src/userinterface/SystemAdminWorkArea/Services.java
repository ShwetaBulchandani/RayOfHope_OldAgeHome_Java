/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.WorkQueue.AdoptionProcessWorkRequest;
import Business.WorkQueue.PersonCareWorkRequest;
import Business.WorkQueue.MedicalAssistanceWorkRequest;
import Business.WorkQueue.EducationAssistWorkRequest;

import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author khyati
 */
public class Services extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    JFreeChart barChart;

    public Services(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateBarGraph();
    }
    
    public void populateBarGraph() {
        ArrayList<AdoptionProcessWorkRequest> adpReqList = new ArrayList<>();
        ArrayList<MedicalAssistanceWorkRequest> medReqList = new ArrayList<>();
        ArrayList<EducationAssistWorkRequest> finReqList = new ArrayList<>();
        ArrayList<PersonCareWorkRequest> ccReqList = new ArrayList<>();
        Map<String, Integer> workReqMap = new HashMap<>();
        for (WorkRequest workQue : system.getWorkQueue().getWorkRequestList()) {
            if (workQue instanceof AdoptionProcessWorkRequest) {
                adpReqList.add((AdoptionProcessWorkRequest) workQue);
            } else if (workQue instanceof MedicalAssistanceWorkRequest) {
                medReqList.add((MedicalAssistanceWorkRequest) workQue);
            } else if (workQue instanceof EducationAssistWorkRequest) {
                finReqList.add((EducationAssistWorkRequest) workQue);
            }
            else if (workQue instanceof PersonCareWorkRequest) {
                ccReqList.add((PersonCareWorkRequest) workQue);
        }

        }
        workReqMap.put("Adoption Services", adpReqList.size());
        workReqMap.put("Medical Help Services", medReqList.size());
        workReqMap.put("Financial Help Services", finReqList.size());
        workReqMap.put("Care Co-ordination Services", ccReqList.size());

        barChart = ChartFactory.createPieChart(
                "Services At a Glance",
                createDataset(workReqMap),
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel, BorderLayout.CENTER);
        jPanel1.validate();
    }
    
    private PieDataset createDataset(Map<String, Integer> workReqMap) {
        final DefaultPieDataset dataset = new DefaultPieDataset();
        for (String r : workReqMap.keySet()) {
            dataset.setValue(r, workReqMap.get(r));
        }
        return dataset;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 226, 187));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 860, 600));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 52, 58));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Services we provide ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 594, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}