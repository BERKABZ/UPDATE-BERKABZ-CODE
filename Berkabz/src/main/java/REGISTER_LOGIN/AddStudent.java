/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package REGISTER_LOGIN;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;

public class AddStudent extends javax.swing.JFrame {

    public AddStudent() {
        initComponents();
        setFieldListeners();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelProduct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STUDENT INFORMATION SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(154, 154, 154))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        btnCancelProduct.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelProduct.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCancelProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelProduct.setText("CANCEL");
        btnCancelProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelProductActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("ADD STUDENT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("ID Number:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Age:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Course:");

        btnAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnAddProduct.setText("ADD");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Year:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(225, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelProduct)
                    .addComponent(btnAddProduct))
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCancelProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelProductActionPerformed
        clearFields();
        StudentInformation x = new StudentInformation();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnCancelProductActionPerformed
    private void clearFields() {
    txtID.setText("");
    txtName.setText("");
    txtAge.setText("");
    txtCourse.setText("");
    txtYear.setText("");
}

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        String id = txtID.getText().trim();
        String name = txtName.getText().trim();
        String age = txtAge.getText().trim();
        String course = txtCourse.getText().trim();
        String year = txtYear.getText().trim();

        boolean errorOccurred = false;

        if (id.isEmpty() || id.equals("Please input a ID number.")) {
            txtID.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtID.setText("Please input a ID number.");
            errorOccurred = true;
        }
        if (name.isEmpty() || name.equals("Please input a name.")) {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtName.setText("Please input a name.");
            errorOccurred = true;
        }
        if (age.isEmpty() || age.equals("Please input an age.")) {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtAge.setText("Please input an age.");
            errorOccurred = true;
        }
        if (course.isEmpty() || course.equals("Please input a course.")) {
            txtCourse.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtCourse.setText("Please input a course.");
            errorOccurred = true;
        }
        if (year.isEmpty() || year.equals("Please input a year.")) {
            txtYear.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtYear.setText("Please input a year.");
            errorOccurred = true;
        }

        if (!errorOccurred) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to add the book?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    String filePath = "STUDENT LIST INFORMATION\\" + "StudentList.txt";

                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
                    writer.write("STUDENT LIST INFORMATION");
                    writer.newLine();
                    writer.write("------------------");
                    writer.newLine();
                    writer.write("ID Number: " + id);
                    writer.newLine();
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Age: " + age);
                    writer.newLine();
                    writer.write("Course: " + course);
                    writer.newLine();
                    writer.write("Year: " + year);
                    writer.newLine();
                    writer.write("------------------");
                    writer.newLine();
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Student Added Successfully", "The student is successfully added!", JOptionPane.INFORMATION_MESSAGE);
                    StudentInformation x = new StudentInformation();
                    x.show();
                    this.hide();
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error occurred while saving data!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            clearWarningText(txtID, "Please input a ID.");
            clearWarningText(txtName, "Please input a name.");
            clearWarningText(txtAge, "Please input an age.");
            clearWarningText(txtCourse, "Please input a course.");
            clearWarningText(txtYear, "Please input a year.");
            // Add similar code to handle warnings for other fields if needed
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void setFieldListener(JTextField textField, String warningText) {
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(warningText)) {
                    textField.setText("");
                    textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(warningText);
                    textField.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });
    } 
    private void clearWarningText(javax.swing.JTextField textField, String warningText) {
        if (textField.getText().equals(warningText)) {
            textField.setText("");
            textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }
    private void setFieldListeners() {
        setFieldListener(txtID, "Please input a ID.");
        setFieldListener(txtName, "Please input a name.");
        setFieldListener(txtAge, "Please input a age.");
        setFieldListener(txtCourse, "Please input a course.");
        setFieldListener(txtYear, "Please input a year.");
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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancelProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
