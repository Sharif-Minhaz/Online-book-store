
package online_book_store_system;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class OrderBook extends javax.swing.JFrame {
    int bill;
    String orderBook;
    public OrderBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JButton();
        goMenu = new javax.swing.JButton();
        orderBookComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        billTextField = new javax.swing.JTextField();
        billing = new javax.swing.JButton();
        addToCart = new javax.swing.JButton();
        cartDetails = new javax.swing.JTextField();
        orderNowBtn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        goMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        goMenu.setText("Menu");
        goMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goMenuActionPerformed(evt);
            }
        });

        orderBookComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderBookComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a book--", "The Hobbit", "The lie of pie", "War and Peace", "Paradoxical sajid", "Beloved" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Select a book for order:");

        quantity.setBackground(new java.awt.Color(240, 240, 240));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Quantity:");

        billTextField.setEditable(false);

        billing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        billing.setText("Get total Bill");
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });

        addToCart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addToCart.setText("Add to cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        cartDetails.setEditable(false);

        orderNowBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderNowBtn.setText("Order now!!!");
        orderNowBtn.setToolTipText("");
        orderNowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNowBtnActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("Clear cart");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(close)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(goMenu)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addToCart)
                            .addComponent(jLabel1)
                            .addComponent(billing)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(orderBookComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cartDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(billTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(quantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderNowBtn)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addGap(70, 70, 70)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderBookComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billing)
                    .addComponent(billTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCart)
                    .addComponent(cartDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderNowBtn)
                    .addComponent(clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goMenu)
                    .addComponent(close))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void goMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goMenuActionPerformed
        Menu goMenu = new Menu();
        goMenu.setVisible(true); 
        dispose();
    }//GEN-LAST:event_goMenuActionPerformed

    private void orderNowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderNowBtnActionPerformed
        String amounts = quantity.getText(); 
        String billing = billTextField.getText();
        String cart = cartDetails.getText();
        if(amounts.length()==0 || billing.length()==0 || cart.length()==0 || billing.equals("0 TK")){  
            JOptionPane.showMessageDialog(this, "Fill up all details first");
        } 
        else{
            JOptionPane.showMessageDialog(this, "Order recieved successfully");
        }
    }//GEN-LAST:event_orderNowBtnActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        String selectedBook = orderBookComboBox.getItemAt(orderBookComboBox.getSelectedIndex());
        int emptyBox=0;
        if(selectedBook.equals("The Hobbit")){
            orderBook = "The Hobbit";
        }
        else if(selectedBook.equals("The lie of pie")){
            orderBook = "The lie of pie";
        }
        else if(selectedBook.equals("War and Peace")){
            orderBook = "War and Peace";
        }
        else if(selectedBook.equals("Paradoxical sajid")){
            orderBook = "Paradoxical sajid";
        }
        else if(selectedBook.equals("Life of pie")){
            orderBook = "Life of pie";
        }
        else if(selectedBook.equals("Beloved")){
            orderBook = "Beloved";
        }
        else{
            emptyBox = 1;
        }
        //---------------- empty details or details-----------------------------
        if(emptyBox == 1){
            JOptionPane.showMessageDialog(this, "Select book !!!");
        }
        else{
            cartDetails.setText(orderBook+" ---"+bill+" TK");
        }
    }//GEN-LAST:event_addToCartActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        cartDetails.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
        int itemQuantity = 0;
        try{
            itemQuantity = parseInt(quantity.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid amount");
        }
        GetBill getBill = new GetBill(itemQuantity);
        bill = getBill.getTotalBill();
        billTextField.setText(String.valueOf(bill)+" TK");
    }//GEN-LAST:event_billingActionPerformed

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
            java.util.logging.Logger.getLogger(OrderBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart;
    private javax.swing.JTextField billTextField;
    private javax.swing.JButton billing;
    private javax.swing.JTextField cartDetails;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JButton goMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> orderBookComboBox;
    private javax.swing.JButton orderNowBtn;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
