
package online_book_store_system;

public class Login extends javax.swing.JFrame {
    int leave;
    public Login() {
        initComponents();
    }
    int value;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginButtonFromSignin = new javax.swing.JButton();
        homeButtonFromLogin = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameLogin = new javax.swing.JTextField();
        passwordLogin = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginButtonFromSignin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginButtonFromSignin.setText("Log in");
        loginButtonFromSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonFromSigninActionPerformed(evt);
            }
        });

        homeButtonFromLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeButtonFromLogin.setText("Home");
        homeButtonFromLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonFromLoginActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter your username: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter your password:");

        menu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(close)
                        .addGap(85, 85, 85)
                        .addComponent(menu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButtonFromLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(passwordLogin))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(loginButtonFromSignin)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userNameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(loginButtonFromSignin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButtonFromLogin)
                    .addComponent(close)
                    .addComponent(menu))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonFromSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonFromSigninActionPerformed
        String user_name_login = userNameLogin.getText();
        String password_field_login = passwordLogin.getText();
        Users forUserLogin = new Users(user_name_login, password_field_login);
        forUserLogin.login();
        leave = forUserLogin.flagForLogin;
    }//GEN-LAST:event_loginButtonFromSigninActionPerformed

    private void homeButtonFromLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonFromLoginActionPerformed
        MainFrame mainPage2 = new MainFrame();
        mainPage2.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonFromLoginActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.value = leave;
        dispose();
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton homeButtonFromLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginButtonFromSignin;
    private javax.swing.JButton menu;
    private javax.swing.JPasswordField passwordLogin;
    private javax.swing.JTextField userNameLogin;
    // End of variables declaration//GEN-END:variables
}
