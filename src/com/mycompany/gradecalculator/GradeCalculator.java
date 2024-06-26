/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gradecalculator;

import com.mycompany.model.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author lance
 */
public class GradeCalculator extends javax.swing.JFrame {

    /**
     * Creates new form GradeCalculator
     */
    public GradeCalculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblStudentInformation = new javax.swing.JLabel();
        lblStudentNumber = new javax.swing.JLabel();
        txtStudentNumber = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        lblStudentName = new javax.swing.JLabel();
        lblMilestoneNumber = new javax.swing.JLabel();
        lblGradeInPercentage = new javax.swing.JLabel();
        txtMilestoneOneGrade = new javax.swing.JTextField();
        lblMilestoneOne = new javax.swing.JLabel();
        lblMilestoneTwo = new javax.swing.JLabel();
        txtMilestoneTwoGrade = new javax.swing.JTextField();
        txtTerminalAssessmentGrade = new javax.swing.JTextField();
        lblTerminalAssessment = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblFinalGrade = new javax.swing.JLabel();
        txtFinalGrade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Milestone Calculator");
        setBackground(new java.awt.Color(232, 222, 159));
        setLocation(new java.awt.Point(700, 200));
        setName("frame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(450, 406));

        pnlMain.setBackground(new java.awt.Color(232, 222, 159));

        lblStudentInformation.setFont(new java.awt.Font("Ubuntu Mono", 1, 15)); // NOI18N
        lblStudentInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentInformation.setText("Student Information");

        lblStudentNumber.setBackground(new java.awt.Color(231, 231, 231));
        lblStudentNumber.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        lblStudentNumber.setForeground(new java.awt.Color(51, 51, 51));
        lblStudentNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentNumber.setText("Student #");
        lblStudentNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblStudentNumber.setOpaque(true);

        txtStudentNumber.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        txtStudentNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStudentNumber.setToolTipText("");
        txtStudentNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtStudentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNumberActionPerformed(evt);
            }
        });

        txtStudentName.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        txtStudentName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStudentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblStudentName.setBackground(new java.awt.Color(231, 231, 231));
        lblStudentName.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        lblStudentName.setForeground(new java.awt.Color(51, 51, 51));
        lblStudentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentName.setText("Student Name");
        lblStudentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblStudentName.setOpaque(true);

        lblMilestoneNumber.setFont(new java.awt.Font("Ubuntu Mono", 1, 15)); // NOI18N
        lblMilestoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMilestoneNumber.setText("Milestone #");

        lblGradeInPercentage.setFont(new java.awt.Font("Ubuntu Mono", 1, 15)); // NOI18N
        lblGradeInPercentage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGradeInPercentage.setText("Grade (%)");

        txtMilestoneOneGrade.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        txtMilestoneOneGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMilestoneOneGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMilestoneOneGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMilestoneOneGradeActionPerformed(evt);
            }
        });

        lblMilestoneOne.setBackground(new java.awt.Color(231, 231, 231));
        lblMilestoneOne.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        lblMilestoneOne.setForeground(new java.awt.Color(51, 51, 51));
        lblMilestoneOne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMilestoneOne.setText("Milestone 1");
        lblMilestoneOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMilestoneOne.setOpaque(true);

        lblMilestoneTwo.setBackground(new java.awt.Color(231, 231, 231));
        lblMilestoneTwo.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        lblMilestoneTwo.setForeground(new java.awt.Color(51, 51, 51));
        lblMilestoneTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMilestoneTwo.setText("Milestone 2");
        lblMilestoneTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMilestoneTwo.setOpaque(true);

        txtMilestoneTwoGrade.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        txtMilestoneTwoGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMilestoneTwoGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMilestoneTwoGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMilestoneTwoGradeActionPerformed(evt);
            }
        });

        txtTerminalAssessmentGrade.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        txtTerminalAssessmentGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTerminalAssessmentGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTerminalAssessmentGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerminalAssessmentGradeActionPerformed(evt);
            }
        });

        lblTerminalAssessment.setBackground(new java.awt.Color(231, 231, 231));
        lblTerminalAssessment.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        lblTerminalAssessment.setForeground(new java.awt.Color(51, 51, 51));
        lblTerminalAssessment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTerminalAssessment.setText("Terminal Assessment");
        lblTerminalAssessment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTerminalAssessment.setOpaque(true);

        btnCalculate.setBackground(new java.awt.Color(229, 229, 229));
        btnCalculate.setFont(new java.awt.Font("Ubuntu Mono", 1, 15)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setBorder(null);
        btnCalculate.setFocusable(false);
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 204, 204));
        btnClear.setFont(new java.awt.Font("Ubuntu Mono", 1, 15)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.setFocusable(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblFinalGrade.setBackground(new java.awt.Color(231, 231, 231));
        lblFinalGrade.setFont(new java.awt.Font("Ubuntu Mono", 1, 15)); // NOI18N
        lblFinalGrade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinalGrade.setText("Final Grade");
        lblFinalGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFinalGrade.setOpaque(true);

        txtFinalGrade.setEditable(false);
        txtFinalGrade.setBackground(new java.awt.Color(231, 231, 231));
        txtFinalGrade.setFont(new java.awt.Font("Ubuntu Mono", 1, 15)); // NOI18N
        txtFinalGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFinalGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFinalGrade.setFocusable(false);
        txtFinalGrade.setOpaque(true);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(txtStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblMilestoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGradeInPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMilestoneOne, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblMilestoneTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTerminalAssessment, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMilestoneTwoGrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTerminalAssessmentGrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMilestoneOneGrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                        .addComponent(lblFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblStudentInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMilestoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGradeInPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMilestoneOne, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMilestoneOneGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMilestoneTwoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMilestoneTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTerminalAssessment, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTerminalAssessmentGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Clear all inputs
        txtStudentNumber.setText("");
        txtStudentName.setText("");
        txtMilestoneOneGrade.setText("");
        txtMilestoneTwoGrade.setText("");
        txtTerminalAssessmentGrade.setText("");
        txtFinalGrade.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtStudentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNumberActionPerformed
        // TODO add your handling code here:
        try {
            Integer.valueOf(txtStudentNumber.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(pnlMain, "Error: Student # must be a number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtStudentNumberActionPerformed

    private void txtMilestoneOneGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMilestoneOneGradeActionPerformed
        // The maximum grade for Milestone One
        String milestoneOneGrade = txtMilestoneOneGrade.getText();
        String pastLimitErrorMessage = "Error: Milestone One grade must not be higher than 25%";
        String nanErrorMessage = "Error: Milestone One grade must be a number";
        int MILESTONE_ONE_MAX_GRADE = 25;

        validateGrade(milestoneOneGrade, pastLimitErrorMessage, nanErrorMessage, MILESTONE_ONE_MAX_GRADE);
    }//GEN-LAST:event_txtMilestoneOneGradeActionPerformed

    private void txtMilestoneTwoGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMilestoneTwoGradeActionPerformed
        // The maximum grade for Milestone Two
        String milestoneTwoGrade = txtMilestoneTwoGrade.getText();
        String pastLimitErrorMessage = "Error: Milestone Two grade must not be higher than 40%";
        String nanErrorMessage = "Error: Milestone Two grade must be a number";
        int MILESTONE_TWO_MAX_GRADE = 40;

        validateGrade(milestoneTwoGrade, pastLimitErrorMessage, nanErrorMessage, MILESTONE_TWO_MAX_GRADE);
    }//GEN-LAST:event_txtMilestoneTwoGradeActionPerformed

    private void txtTerminalAssessmentGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerminalAssessmentGradeActionPerformed
        // The maximum grade for Terminal Assessment
        String terminalAssessmentGrade = txtTerminalAssessmentGrade.getText();
        String pastLimitErrorMessage = "Error: Terminal Assessment grade must not be higher than 35%";
        String nanErrorMessage = "Error: Terminal Assessment grade must be a number";
        int TERMINAL_ASSESSMENT_MAX_GRADE = 35;

        validateGrade(terminalAssessmentGrade, pastLimitErrorMessage, nanErrorMessage, TERMINAL_ASSESSMENT_MAX_GRADE);
    }//GEN-LAST:event_txtTerminalAssessmentGradeActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // Invoke all text fields' action performed method for error checking of inputs
        txtStudentNumberActionPerformed(evt);
        txtMilestoneOneGradeActionPerformed(evt);
        txtMilestoneTwoGradeActionPerformed(evt);
        txtTerminalAssessmentGradeActionPerformed(evt);

        // Instantiate Student class
        Student student = new Student();

        try {
            // Assign textfield values to student object
            student.setStudentNumber(txtStudentNumber.getText());
            student.setStudentName(txtStudentName.getText());
            student.setMilestoneOne(Double.parseDouble(txtMilestoneOneGrade.getText()));
            student.setMilestoneTwo(Double.parseDouble(txtMilestoneTwoGrade.getText()));
            student.setTerminalAssessment(Double.parseDouble(txtTerminalAssessmentGrade.getText()));
        } catch (NumberFormatException e) {
            // Pop-up grade is not a number error message
            JOptionPane.showMessageDialog(pnlMain, "Error: All inputs must be complete", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Compute final grade
        txtFinalGrade.setText(student.computeFinalGrade());
    }//GEN-LAST:event_btnCalculateActionPerformed

    // Method for validating grade inputs
    private void validateGrade(String gradeText, String pastLimitErrorMessage, String nanErrorMessage, int maxGrade) {
        try {
            double grade = Double.parseDouble(gradeText);

            // if Milestone One grade is higher than 25
            if (grade > maxGrade) {

                // Pop-up grade is higher than the maximum limit error message
                JOptionPane.showMessageDialog(pnlMain, pastLimitErrorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Pop-up grade is not a number error message
            JOptionPane.showMessageDialog(pnlMain, nanErrorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(GradeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel lblFinalGrade;
    private javax.swing.JLabel lblGradeInPercentage;
    private javax.swing.JLabel lblMilestoneNumber;
    private javax.swing.JLabel lblMilestoneOne;
    private javax.swing.JLabel lblMilestoneTwo;
    private javax.swing.JLabel lblStudentInformation;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblStudentNumber;
    private javax.swing.JLabel lblTerminalAssessment;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextField txtFinalGrade;
    private javax.swing.JTextField txtMilestoneOneGrade;
    private javax.swing.JTextField txtMilestoneTwoGrade;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtStudentNumber;
    private javax.swing.JTextField txtTerminalAssessmentGrade;
    // End of variables declaration//GEN-END:variables
}
