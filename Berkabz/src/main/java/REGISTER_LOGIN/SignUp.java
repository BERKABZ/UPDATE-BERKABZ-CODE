/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package REGISTER_LOGIN;

import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        addFocusListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        SIGNUP = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtEmail_Number = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtPass2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnSignUp = new javax.swing.JButton();
        btnBacktoLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radiobtnFemale = new javax.swing.JRadioButton();
        Course = new javax.swing.JComboBox<>();
        radiobtnMale = new javax.swing.JRadioButton();
        radiobtnGay = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cReading = new javax.swing.JCheckBox();
        cPlay = new javax.swing.JCheckBox();
        cExercise = new javax.swing.JCheckBox();
        cEat = new javax.swing.JCheckBox();
        cStudy = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGNUP");
        setResizable(false);

        SIGNUP.setBackground(new java.awt.Color(255, 255, 255));
        SIGNUP.setPreferredSize(new java.awt.Dimension(500, 600));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 600));

        txtFname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFname.setText("Firstname");
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
        });
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        txtLname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLname.setText("Lastname");
        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLnameFocusGained(evt);
            }
        });
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });

        txtEmail_Number.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail_Number.setText("Email or number");
        txtEmail_Number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmail_NumberFocusGained(evt);
            }
        });
        txtEmail_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_NumberActionPerformed(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.setText("Password");
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        txtPass2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass2.setText("Confirm password");
        txtPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPass2FocusGained(evt);
            }
        });
        txtPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("I agree to the terms of use");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(0, 0, 0));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnBacktoLogin.setText("Already have an account");
        btnBacktoLogin.setBorder(null);
        btnBacktoLogin.setBorderPainted(false);
        btnBacktoLogin.setContentAreaFilled(false);
        btnBacktoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBacktoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setText("CREATE ACCOUNT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("It's quick and easy.");

        buttonGroup1.add(radiobtnFemale);
        radiobtnFemale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radiobtnFemale.setText("FEMALE");
        radiobtnFemale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radiobtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnFemaleActionPerformed(evt);
            }
        });

        Course.setEditable(true);
        Course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSIT", "BSBA", "BSOA", "BSCRIM", "BSEDUC" }));
        Course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobtnMale);
        radiobtnMale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radiobtnMale.setText("MALE");
        radiobtnMale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radiobtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobtnGay);
        radiobtnGay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radiobtnGay.setText("GAY");
        radiobtnGay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radiobtnGay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnGayActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("GENDER:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("HOBBIES:");

        cReading.setText("Reading");

        cPlay.setText("Playing Online Games");

        cExercise.setText("Exercising");

        cEat.setText("Eating");

        cStudy.setText("Study");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jCheckBox1)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(Course, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(radiobtnMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radiobtnFemale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radiobtnGay))
                                            .addComponent(jLabel5)
                                            .addComponent(cPlay))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cEat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cReading))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cExercise)
                                                .addComponent(cStudy)))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtEmail_Number)
                                .addComponent(txtPass))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btnBacktoLogin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiobtnMale, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radiobtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radiobtnGay)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cEat)
                    .addComponent(cExercise))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cReading)
                    .addComponent(cStudy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBacktoLogin)
                .addGap(317, 317, 317))
        );

        javax.swing.GroupLayout SIGNUPLayout = new javax.swing.GroupLayout(SIGNUP);
        SIGNUP.setLayout(SIGNUPLayout);
        SIGNUPLayout.setHorizontalGroup(
            SIGNUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        SIGNUPLayout.setVerticalGroup(
            SIGNUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SIGNUPLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SIGNUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SIGNUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SIGNUP.getAccessibleContext().setAccessibleName("SIGNUP");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBacktoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoLoginActionPerformed
        LOGIN x = new LOGIN();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnBacktoLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // Retrieving input values from text fields
        String fname = txtFname.getText().trim();
        String lname = txtLname.getText().trim();
        String email_num = txtEmail_Number.getText().trim();
        String pass = txtPass.getText();
        String pass2 = txtPass2.getText();
        String selectedCourse = getSelectedCourse();
        String selectedGender = getSelectedGender();
        ArrayList<String> selectedHobbies = getSelectedHobbies();

        // Boolean to track if an error occurred during validation
        boolean errorOccurred = false;

        // Validation checks for passwords
        if (!pass.equals(pass2)) {
            setErrorText("Passwords do not match!", txtPass2);
            setErrorBorder(txtPass2);
            errorOccurred = true;
        } else {
            clearErrorText(txtPass2);
        }
        if (pass.isEmpty() || pass.equals("Password") || pass.equals("Please input a password.")) {
            setErrorText("Please input a password.", txtPass);
            setErrorBorder(txtPass);
            errorOccurred = true;
        } else {
            clearErrorText(txtPass);
        }
        if (pass2.isEmpty() || pass2.equals("Confirm password") || pass2.equals("Please confirm password.")) {
            setErrorText("Please confirm password.", txtPass2);
            setErrorBorder(txtPass2);
            errorOccurred = true;
        } else {
            clearErrorText(txtPass2);
        }

        // Validation checks for first name
        if (fname.isEmpty() || fname.equals("Firstname") || fname.equals("Please input the first name.")) {
            setErrorText("Please input the first name.", txtFname);
            setErrorBorder(txtFname);
            errorOccurred = true;
        } else {
            clearErrorText(txtFname);
        }

        // Validation checks for last name
        if (lname.isEmpty() || lname.equals("Lastname") || lname.equals("Please input the last name.")) {
            setErrorText("Please input the last name.", txtLname);
            setErrorBorder(txtLname);
            errorOccurred = true;
        } else {
            clearErrorText(txtLname);
        }

        // Validation checks for email/number
        if (email_num.isEmpty() || email_num.equals("Email or number") || email_num.equals("Please input an email or number!")) {
            setErrorText("Please input an email or number!", txtEmail_Number);
            setErrorBorder(txtEmail_Number);
            errorOccurred = true;
        } else {
            clearErrorText(txtEmail_Number);
        }

        // Validation check for terms of use agreement
        if (!jCheckBox1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please agree to the terms of use!", "Error", JOptionPane.ERROR_MESSAGE);
            errorOccurred = true;
        }

        // Validation for existing email/number
        if (!errorOccurred && isEmailOrNumberExists(email_num)) {
            JOptionPane.showMessageDialog(this, "Email or number already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            setErrorText("Email or number already exists!", txtEmail_Number);
            setErrorBorder(txtEmail_Number);
            errorOccurred = true;
        }

        // Validation for selecting a gender
        if (selectedGender == null) {
            JOptionPane.showMessageDialog(this, "Please select a gender!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation for selecting hobbies
        if (!cExercise.isSelected() && !cReading.isSelected() && !cEat.isSelected() && !cStudy.isSelected() && !cPlay.isSelected()){
            JOptionPane.showMessageDialog(this, "Please select a hobbies!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation for at least one or more hobbies selected
        if (selectedHobbies.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select at least one or more hobbies!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

            if (!errorOccurred) {
                try {
                    String filePath = "STUDENTS ACCOUNT INFORMATION\\" + email_num + ".txt";

                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));  
                    
                    writer.write("----------------------------");
                    writer.newLine();
                    writer.write("STUDENTS ACCOUNT INFORMATION");
                    writer.newLine();
                    writer.write("----------------------------");
                    writer.newLine();
                    writer.write("Name: " + fname + " " + lname);
                    writer.newLine();
                    writer.write("Email/Num.: " + email_num);
                    writer.newLine();
                    writer.write("Password: " + pass);
                    writer.newLine();
                    writer.write("Gender: " + selectedGender);
                    writer.newLine();
                    writer.write("Course: " + selectedCourse);
                    writer.newLine();
                    writer.write("HOBBIES: ");
                    writer.newLine();
                    for (String hobby : selectedHobbies) {
                        writer.write(hobby);
                        writer.newLine();
                    }
                    writer.write("--------------------------");
                    writer.newLine();
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Student account has been createed successfully!", "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
                    txtFname.setText("");
                    txtLname.setText("");
                    txtEmail_Number.setText("");
                    txtPass.setText("");
                    txtPass2.setText("");
                    buttonGroup1.clearSelection(); 
                    cExercise.setSelected(false);
                    cReading.setSelected(false);
                    cEat.setSelected(false);
                    cStudy.setSelected(false);
                    cPlay.setSelected(false);
                    jCheckBox1.setSelected(false);
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error occurred while saving data!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_btnSignUpActionPerformed
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPass2ActionPerformed

    private void txtPass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass2FocusGained
        clearTextField(txtPass2, "Confirm password");
        setNormalBorder(txtPass2);
        txtPass2.setForeground(Color.BLACK);
        setErrorText("", txtPass2);
    }//GEN-LAST:event_txtPass2FocusGained

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed

    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        clearTextField(txtPass, "Password");
        setNormalBorder(txtPass);
        txtPass.setForeground(Color.BLACK);
        setErrorText("", txtPass);
    }//GEN-LAST:event_txtPassFocusGained

    private void txtEmail_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_NumberActionPerformed

    }//GEN-LAST:event_txtEmail_NumberActionPerformed

    private void txtEmail_NumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmail_NumberFocusGained
        clearTextField(txtEmail_Number, "Email or number");
        setNormalBorder(txtEmail_Number);
        txtEmail_Number.setForeground(Color.BLACK);
        setErrorText("", txtEmail_Number);
    }//GEN-LAST:event_txtEmail_NumberFocusGained

    private void txtLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusGained
        clearTextField(txtLname, "Lastname");
        setNormalBorder(txtLname);
        txtLname.setForeground(Color.BLACK);
        setErrorText("", txtLname);
    }//GEN-LAST:event_txtLnameFocusGained

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed

    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusGained
        clearTextField(txtFname, "Firstname");
        setNormalBorder(txtFname);
        txtFname.setForeground(Color.BLACK);
        setErrorText("", txtFname);
    }//GEN-LAST:event_txtFnameFocusGained

    private void radiobtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnFemaleActionPerformed

    private void radiobtnGayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnGayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnGayActionPerformed
    private String getSelectedGender() {
    if (radiobtnMale.isSelected()) {
        return radiobtnMale.getText();
    } else if (radiobtnFemale.isSelected()) {
        return radiobtnFemale.getText();
    } else if (radiobtnGay.isSelected()) {
        return radiobtnGay.getText();
    } else {
        return null;
    }
    }
    private ArrayList<String> getSelectedHobbies() {
    ArrayList<String> selectedHobbies = new ArrayList<>();
    if (cExercise.isSelected()) {
        selectedHobbies.add(cExercise.getText());
    }
    if (cReading.isSelected()) {
        selectedHobbies.add(cReading.getText());
    }
    if (cEat.isSelected()) {
        selectedHobbies.add(cEat.getText());
    }
    if (cStudy.isSelected()) {
        selectedHobbies.add(cStudy.getText());
    }
    if (cPlay.isSelected()) {
        selectedHobbies.add(cPlay.getText());
    }
    return selectedHobbies;
    }
    private void CourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseActionPerformed

    }//GEN-LAST:event_CourseActionPerformed
    private String getSelectedCourse() {
    return Course.getSelectedItem().toString();
    }
    private void radiobtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnMaleActionPerformed
 
    }//GEN-LAST:event_radiobtnMaleActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed
    private void clearErrorText(javax.swing.JTextField textField) {
        textField.setForeground(Color.BLACK);
    }
    private void setErrorText(String message, javax.swing.JTextField textField) {
        textField.setText(message);
        textField.setForeground(Color.BLACK);
    }
    private void setErrorBorder(javax.swing.JTextField textField) {
        textField.setBorder(BorderFactory.createLineBorder(Color.RED));
    }
    private void setNormalBorder(javax.swing.JTextField textField) {
        textField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
    }
    private boolean isEmailOrNumberExists(String emailOrNumber) {
    boolean exists = false;
    String filePath = "STUDENTS ACCOUNT INFORMATION\\"+ txtEmail_Number + " .txt";

        File directory = new File(filePath);
        File[] files = directory.listFiles();

    if (files != null) {
        for (File file : files) {
            if (file.getName().equalsIgnoreCase(emailOrNumber + ".txt")) {
                exists = true;
                break;
            }
        }
    }

    return exists;
}

    private void clearTextField(javax.swing.JTextField textField, String defaultText) {
        textField.addFocusListener(new java.awt.event.FocusAdapter() {
        boolean cleared = false;

        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (!cleared && textField.getText().equals(defaultText)) {
                textField.setText("");
                cleared = true;
            }
        }

        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            cleared = false; // Reset the flag when focus is lost
        }
    });
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Course;
    private javax.swing.JPanel SIGNUP;
    private javax.swing.JButton btnBacktoLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cEat;
    private javax.swing.JCheckBox cExercise;
    private javax.swing.JCheckBox cPlay;
    private javax.swing.JCheckBox cReading;
    private javax.swing.JCheckBox cStudy;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radiobtnFemale;
    private javax.swing.JRadioButton radiobtnGay;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JTextField txtEmail_Number;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPass2;
    // End of variables declaration//GEN-END:variables

    private void addFocusListeners() {
    txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
        private boolean isFirstFocus = true;

        public void focusGained(java.awt.event.FocusEvent evt) {
            if (isFirstFocus) {
                isFirstFocus = false;
                clearTextField(txtFname, "Firstname");
            }
            txtFnameFocusGained(evt);
        }
    });

    txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
        private boolean isFirstFocus = true;

        public void focusGained(java.awt.event.FocusEvent evt) {
            if (isFirstFocus) {
                isFirstFocus = false;
                clearTextField(txtLname, "Lastname");
            }
            txtLnameFocusGained(evt);
        }
    });

    txtEmail_Number.addFocusListener(new java.awt.event.FocusAdapter() {
        private boolean isFirstFocus = true;

        public void focusGained(java.awt.event.FocusEvent evt) {
            if (isFirstFocus) {
                isFirstFocus = false;
                clearTextField(txtEmail_Number, "Email or number");
            }
            txtEmail_NumberFocusGained(evt);
        }
    });

    txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
        private boolean isFirstFocus = true;

        public void focusGained(java.awt.event.FocusEvent evt) {
            if (isFirstFocus) {
                isFirstFocus = false;
                clearTextField(txtPass, "Password");
            }
            txtPassFocusGained(evt);
        }
    });

    txtPass2.addFocusListener(new java.awt.event.FocusAdapter() {
        private boolean isFirstFocus = true;

        public void focusGained(java.awt.event.FocusEvent evt) {
            if (isFirstFocus) {
                isFirstFocus = false;
                clearTextField(txtPass2, "Confirm password");
            }
            txtPass2FocusGained(evt);
        }
    });
}

}
