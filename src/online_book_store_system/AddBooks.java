
package online_book_store_system;

import javax.swing.JOptionPane;

public class AddBooks extends javax.swing.JFrame {

    public AddBooks() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addBooksTxtField = new javax.swing.JTextField();
        addSign = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        roleCombobox = new javax.swing.JComboBox<>();
        closeBtnFromAddBooks = new javax.swing.JButton();
        gotoMenuBtnFromAddBooks = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Add Books: ");

        addSign.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addSign.setText("+");
        addSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSignActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Select Your Role: ");

        roleCombobox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        roleCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--", "User", "Maintainer", "Admin" }));
        roleCombobox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        closeBtnFromAddBooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        closeBtnFromAddBooks.setText("Close");
        closeBtnFromAddBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnFromAddBooksActionPerformed(evt);
            }
        });

        gotoMenuBtnFromAddBooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gotoMenuBtnFromAddBooks.setText("Menu");
        gotoMenuBtnFromAddBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoMenuBtnFromAddBooksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addBooksTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSign, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(roleCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeBtnFromAddBooks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gotoMenuBtnFromAddBooks)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(roleCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBooksTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addSign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBtnFromAddBooks)
                    .addComponent(gotoMenuBtnFromAddBooks))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnFromAddBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnFromAddBooksActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBtnFromAddBooksActionPerformed

    private void gotoMenuBtnFromAddBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoMenuBtnFromAddBooksActionPerformed
        Menu gotoMenuF = new Menu();
        gotoMenuF.setVisible(true);
        dispose();
    }//GEN-LAST:event_gotoMenuBtnFromAddBooksActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        addBooksTxtField.setText(null);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSignActionPerformed
        
        //-----------------Role----------------
        String role = roleCombobox.getItemAt(roleCombobox.getSelectedIndex());
        if(role.equals("User")){
            JOptionPane.showMessageDialog(this, "You don't have the proper right");
        }
        else if(role.equals("Admin")){
            if(addBooksTxtField.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Enter the book name which you want to add");
            }
            else{
                String newBook = addBooksTxtField.getText();
                AddBooksAdmin addBook = new AddBooksAdmin(newBook);
                addBook.addBooks();
            }
        }
        else if(role.equals("Maintainer")){
            JOptionPane.showMessageDialog(this, "You don't have the proper right");
        }
        else{
            JOptionPane.showMessageDialog(this, "Confirm your role first");
        }
    }//GEN-LAST:event_addSignActionPerformed

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
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addBooksTxtField;
    private javax.swing.JButton addSign;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton closeBtnFromAddBooks;
    private javax.swing.JButton gotoMenuBtnFromAddBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> roleCombobox;
    // End of variables declaration//GEN-END:variables
}
