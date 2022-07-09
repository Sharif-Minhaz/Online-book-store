
package online_book_store_system;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class ContactAndSupport extends javax.swing.JFrame {

    /**
     * Creates new form ContactAndDonation
     */
    public ContactAndSupport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();
        sendComment = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        donateField = new javax.swing.JTextField();
        donateBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        close = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        homeButtonFromLogin = new javax.swing.JButton();
        currency = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Contact Us");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("First name: ");

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Email: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Last name: ");

        email.setText("@gmail.com");

        comment.setColumns(20);
        comment.setRows(5);
        comment.setText("Ask question or report bugs...");
        jScrollPane1.setViewportView(comment);

        sendComment.setText("Send");
        sendComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendCommentActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Support Us");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mobile:");

        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });

        jLabel7.setText("N. B. : Your support will help us to improve this free system");

        donateBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        donateBtn.setText("Donate");
        donateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBtnActionPerformed(evt);
            }
        });

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        homeButtonFromLogin.setText("Home");
        homeButtonFromLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonFromLoginActionPerformed(evt);
            }
        });

        currency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "TK" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(close)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menu)
                        .addGap(147, 147, 147)
                        .addComponent(homeButtonFromLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sendComment, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(currency, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(donateField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(donateBtn)))
                        .addGap(133, 133, 133))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendComment)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(donateField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currency, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(donateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu)
                    .addComponent(close)
                    .addComponent(homeButtonFromLogin))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void homeButtonFromLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonFromLoginActionPerformed
        MainFrame mainPage2 = new MainFrame();
        mainPage2.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonFromLoginActionPerformed

    private void sendCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendCommentActionPerformed
        String fName = firstName.getText();
        String lName = lastName.getText();
        String mail = email.getText();
        Contact contactIssue = new Contact(fName, lName, mail);
        contactIssue.sendMsg();
    }//GEN-LAST:event_sendCommentActionPerformed

    private void donateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateBtnActionPerformed
        String currencyType = "";
        int money;
        String currencyComboBox = currency.getItemAt(currency.getSelectedIndex());
        if(currencyComboBox.equals("USD")){
            currencyType = "USD";
        }
        else if(currencyComboBox.equals("TK")){
            currencyType = "TK";
        }
        try{
            money = parseInt(donateField.getText());
            Donate sendDonation = new Donate(currencyType, money);
            sendDonation.confirmation();
        }
        catch(NumberFormatException e){ 
            JOptionPane.showMessageDialog(this, "Invalid amount or empty field");
        }
        
    }//GEN-LAST:event_donateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ContactAndSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactAndSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactAndSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactAndSupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactAndSupport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JTextArea comment;
    private javax.swing.JComboBox<String> currency;
    private javax.swing.JButton donateBtn;
    private javax.swing.JTextField donateField;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton homeButtonFromLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton menu;
    private javax.swing.JTextField mobile;
    private javax.swing.JButton sendComment;
    // End of variables declaration//GEN-END:variables
}
