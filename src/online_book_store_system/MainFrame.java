
package online_book_store_system;

public class MainFrame extends javax.swing.JFrame {


    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        getStartedBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N

        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 70)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Welcome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("to");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        jLabel4.setText("Online Book Store");

        getStartedBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getStartedBtn.setText("Get Started");
        getStartedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getStartedBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginBtn.setText("Log in");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signUpBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signUpBtn.setText("Sign up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("or");

        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(getStartedBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(loginBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(signUpBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpBtn)
                .addGap(21, 21, 21))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(getStartedBtn))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel3))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel4)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(signUpBtn)
                    .addComponent(jLabel2))
                .addGap(64, 64, 64)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addComponent(getStartedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 246, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 245, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 188, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 188, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        SignUp signUpPage = new SignUp();
        signUpPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        Login loginPage = new Login();
        loginPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void getStartedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getStartedBtnActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_getStartedBtnActionPerformed


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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getStartedBtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
