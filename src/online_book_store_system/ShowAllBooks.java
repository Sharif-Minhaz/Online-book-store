
package online_book_store_system;

/**
 *
 * @author ACER
 */
public class ShowAllBooks extends javax.swing.JFrame {

    /** Creates new form ShowAllBooks */
    public ShowAllBooks() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeBtnInAvailableBooks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showAllBooksTextArea = new javax.swing.JTextArea();
        gotoMenuBtn = new javax.swing.JButton();
        showAllBooks = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeBtnInAvailableBooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        closeBtnInAvailableBooks.setText("Close");
        closeBtnInAvailableBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnInAvailableBooksActionPerformed(evt);
            }
        });

        showAllBooksTextArea.setEditable(false);
        showAllBooksTextArea.setColumns(20);
        showAllBooksTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        showAllBooksTextArea.setRows(5);
        jScrollPane1.setViewportView(showAllBooksTextArea);

        gotoMenuBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gotoMenuBtn.setText("Menu");
        gotoMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoMenuBtnActionPerformed(evt);
            }
        });

        showAllBooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showAllBooks.setText("Show all available books");
        showAllBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllBooksActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("All available books are: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(closeBtnInAvailableBooks)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gotoMenuBtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showAllBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showAllBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeBtnInAvailableBooks)
                    .addComponent(gotoMenuBtn))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnInAvailableBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnInAvailableBooksActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBtnInAvailableBooksActionPerformed

    private void gotoMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoMenuBtnActionPerformed
        Menu gotoMenu = new Menu();
        gotoMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_gotoMenuBtnActionPerformed

    private void showAllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllBooksActionPerformed

        ShowBooks sBooks = new ShowBooks();
        sBooks.showAllBooks();
        String allBook = sBooks.bookData;
        showAllBooksTextArea.setText(allBook);
    }//GEN-LAST:event_showAllBooksActionPerformed

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
            java.util.logging.Logger.getLogger(ShowAllBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAllBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAllBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAllBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAllBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtnInAvailableBooks;
    private javax.swing.JButton gotoMenuBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showAllBooks;
    private javax.swing.JTextArea showAllBooksTextArea;
    // End of variables declaration//GEN-END:variables

}
