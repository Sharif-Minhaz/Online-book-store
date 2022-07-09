
package online_book_store_system;

import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    int value;
    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomeBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        showAllBooks = new javax.swing.JButton();
        orderBook = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        addBooks = new javax.swing.JButton();
        donate = new javax.swing.JButton();
        contact = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showRecentBooksTextField = new javax.swing.JTextArea();
        showRecentBooks = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomeBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HomeBtn.setText("Home");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        showAllBooks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        showAllBooks.setText("Show all books");
        showAllBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllBooksActionPerformed(evt);
            }
        });

        orderBook.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        orderBook.setText("Order a book");
        orderBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBookActionPerformed(evt);
            }
        });

        searchBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        addBooks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addBooks.setText("Add books");
        addBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBooksActionPerformed(evt);
            }
        });

        donate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        donate.setText("Support Us");
        donate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateActionPerformed(evt);
            }
        });

        contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contact.setText("Contact Us");
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        showRecentBooksTextField.setEditable(false);
        showRecentBooksTextField.setColumns(20);
        showRecentBooksTextField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        showRecentBooksTextField.setRows(5);
        jScrollPane1.setViewportView(showRecentBooksTextField);

        showRecentBooks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showRecentBooks.setText("Show recently added books");
        showRecentBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRecentBooksActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Online Book Store");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(exitBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showAllBooks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBooks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(donate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(showRecentBooks)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showAllBooks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBooks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(donate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showRecentBooks)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBtn)
                    .addComponent(HomeBtn))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        MainFrame gotoHome = new MainFrame();
        gotoHome.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String bookName = searchBox.getText();
        bookSearch search = new bookSearch(bookName); 
        search.searchBooks();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void showAllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllBooksActionPerformed
        ShowAllBooks availableBooks = new ShowAllBooks();
        availableBooks.setVisible(true);
        dispose();
    }//GEN-LAST:event_showAllBooksActionPerformed

    private void addBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBooksActionPerformed
        AddBooks gotoAddBooks = new AddBooks();
        gotoAddBooks.setVisible(true);
        dispose();
    }//GEN-LAST:event_addBooksActionPerformed

    private void showRecentBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRecentBooksActionPerformed
        RecentBooks showRecent = new RecentBooks();
        showRecent.recent();
        showRecent.finalShow();
        String showRecentB = showRecent.info;
        showRecentBooksTextField.setText(showRecentB);
    }//GEN-LAST:event_showRecentBooksActionPerformed

    private void orderBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBookActionPerformed
     
        if(value == 0){
            JOptionPane.showMessageDialog(this, "Login required");
        }
        else{
            OrderBook order = new OrderBook();
            order.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_orderBookActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        ContactAndSupport contact = new ContactAndSupport();
        contact.setVisible(true);
        dispose();
    }//GEN-LAST:event_contactActionPerformed

    private void donateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateActionPerformed
        ContactAndSupport donate = new ContactAndSupport();
        donate.setVisible(true);
        dispose();
    }//GEN-LAST:event_donateActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton addBooks;
    private javax.swing.JButton contact;
    private javax.swing.JButton donate;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton orderBook;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton showAllBooks;
    private javax.swing.JButton showRecentBooks;
    private javax.swing.JTextArea showRecentBooksTextField;
    // End of variables declaration//GEN-END:variables
}