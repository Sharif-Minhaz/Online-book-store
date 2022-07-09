
package online_book_store_system;

import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {


    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        signUpBtn = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        close2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        emailAddresss = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter your username: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter your password:");

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        signUpBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signUpBtn.setText("Sign up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        homeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        close2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        close2.setText("Close");
        close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter your email address:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Select gender:");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        male.setText("Male");

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        female.setText("Female");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(signUpBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(close2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(homeButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(male)
                                        .addGap(18, 18, 18)
                                        .addComponent(female))
                                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(emailAddresss)
                                    .addComponent(password)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddresss, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(signUpBtn)
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton)
                    .addComponent(close2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close2ActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        MainFrame mainPage = new MainFrame();
        mainPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed
    //----------------------------sign up --------------------------------------
    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        String user_name = userName.getText();
        String password_field = password.getText();
        String email = emailAddresss.getText();
        if(email.length()!= 0){
            Users forUserInfo = new Users(user_name,password_field);
            forUserInfo.signUp();
        }
        else{
            JOptionPane.showMessageDialog(this, "Information required");
        }
        
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed

    }//GEN-LAST:event_userNameActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton close2;
    private javax.swing.JTextField emailAddresss;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField password;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
