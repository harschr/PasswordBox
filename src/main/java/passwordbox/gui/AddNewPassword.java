package passwordbox.gui;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import passwordbox.dao.impl.PasswordRepositoryJBDCImpl;
import passwordbox.gui.ListAllPassword;
import passwordbox.model.Password;

public class AddNewPassword extends javax.swing.JFrame {

    private static int userId;
    private static String language;
    private static String country;
    private static String messageErr;
    private static String messageAdded;
    private static String titleErr;

    public AddNewPassword(java.awt.Frame parent, boolean modal, int userId, String language, String country) {
        initComponents();
        setLocationRelativeTo(null);
        this.userId = userId;
        this.language = language;
        this.country = country;
        setLanguage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_title = new javax.swing.JLabel();
        lb_website = new javax.swing.JLabel();
        lb_username = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lb_enterinfo = new javax.swing.JLabel();
        tf_title = new javax.swing.JTextField();
        tf_website = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        bt_save = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        lb_mandatory = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        cb_showpassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/AddNewPassword/Bundle"); // NOI18N
        setTitle(bundle.getString("AddNewPassword.title")); // NOI18N
        setResizable(false);

        lb_title.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_title.setText(bundle.getString("AddNewPassword.lb_title.text")); // NOI18N

        lb_website.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_website.setText(bundle.getString("AddNewPassword.lb_website.text")); // NOI18N

        lb_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_username.setText(bundle.getString("AddNewPassword.lb_username.text")); // NOI18N

        lb_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_password.setText(bundle.getString("AddNewPassword.lb_password.text")); // NOI18N

        lb_enterinfo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_enterinfo.setText(bundle.getString("AddNewPassword.lb_enterinfo.text")); // NOI18N

        tf_website.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_websiteActionPerformed(evt);
            }
        });

        tf_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_usernameActionPerformed(evt);
            }
        });

        bt_save.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_save.setForeground(new java.awt.Color(204, 0, 51));
        bt_save.setText(bundle.getString("AddNewPassword.bt_save.text")); // NOI18N
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });
        bt_save.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_saveKeyPressed(evt);
            }
        });

        bt_cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_cancel.setText(bundle.getString("AddNewPassword.bt_cancel.text")); // NOI18N
        bt_cancel.setMaximumSize(new java.awt.Dimension(69, 25));
        bt_cancel.setMinimumSize(new java.awt.Dimension(69, 25));
        bt_cancel.setPreferredSize(new java.awt.Dimension(69, 25));
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });
        bt_cancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_cancelKeyPressed(evt);
            }
        });

        lb_mandatory.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lb_mandatory.setForeground(new java.awt.Color(255, 0, 0));
        lb_mandatory.setText(bundle.getString("AddNewPassword.lb_mandatory.text")); // NOI18N

        pf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_passwordKeyPressed(evt);
            }
        });

        cb_showpassword.setText(bundle.getString("AddNewPassword.cb_showpassword.text")); // NOI18N
        cb_showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_showpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_mandatory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_enterinfo)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(bt_save)
                .addGap(52, 52, 52)
                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_website, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_password, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_username, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_showpassword)
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_website, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_enterinfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_mandatory)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_title)
                    .addComponent(tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_website)
                    .addComponent(tf_website, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_username)
                    .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_password)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_showpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        bt_cancel.getAccessibleContext().setAccessibleDescription(bundle.getString("AddNewPassword.bt_cancel.AccessibleContext.accessibleDescription")); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void setLanguage() {           
        Locale locale = new Locale(language,country);
        ResourceBundle resbundle = ResourceBundle.getBundle("gui/AddNewPassword/Bundle",locale);
        lb_enterinfo.setText(resbundle.getString("AddNewPassword.lb_enterinfo.text"));
        lb_password.setText(resbundle.getString("AddNewPassword.lb_password.text"));
        lb_username.setText(resbundle.getString("AddNewPassword.lb_username.text"));
        cb_showpassword.setText(resbundle.getString("AddNewPassword.cb_showpassword.text"));
        lb_website.setText(resbundle.getString("AddNewPassword.lb_website.text"));
        lb_title.setText(resbundle.getString("AddNewPassword.lb_title.text"));
        lb_mandatory.setText(resbundle.getString("AddNewPassword.lb_mandatory.text"));
        bt_cancel.setText(resbundle.getString("AddNewPassword.bt_cancel.text"));
        bt_save.setText(resbundle.getString("AddNewPassword.bt_save.text"));
        this.setTitle(resbundle.getString("AddNewPassword.title")); 
        messageErr= resbundle.getString("JOptionPane.error.msg.text");
        titleErr = resbundle.getString("JOptionPane.error.title.text");   
        messageAdded = resbundle.getString("JOptionPane.added.msg.text");
    }   
    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        save();
    }//GEN-LAST:event_bt_saveActionPerformed

    private void showError() {          
       JOptionPane.showInternalMessageDialog(null, messageErr, titleErr, JOptionPane.ERROR_MESSAGE); 
    }

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        dispose();
        SelectOption startCancelled = new SelectOption(userId);
        startCancelled.setVisible(true);
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void cb_showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_showpasswordActionPerformed
        if (cb_showpassword.isSelected()) {
            pf_password.setEchoChar((char) 0);
        } else {
            pf_password.setEchoChar('•');
        }
    }//GEN-LAST:event_cb_showpasswordActionPerformed

    private void pf_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_passwordKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            save();
        }
    }//GEN-LAST:event_pf_passwordKeyPressed

    private void bt_saveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_saveKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            save();
        }
    }//GEN-LAST:event_bt_saveKeyPressed

    private void bt_cancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_cancelKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            dispose();
            SelectOption startCancelled = new SelectOption(userId);
            startCancelled.setVisible(true);
        }
    }//GEN-LAST:event_bt_cancelKeyPressed

    private void tf_websiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_websiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_websiteActionPerformed

    private void tf_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_usernameActionPerformed

    private void save() {
        if (tf_title.getText().isBlank() || tf_username.getText().isBlank() || pf_password.getText().isBlank()) {
            showError();
        } else {

            PasswordRepositoryJBDCImpl pwDAO = new PasswordRepositoryJBDCImpl();
            String title = tf_title.getText();
            String username = tf_username.getText();
            String password = pf_password.getText();
            String website = tf_website.getText();

            Password newPassword = new Password(userId, title, username, password, website);

            tf_title.requestFocus();

            pwDAO.insert(newPassword);

            JOptionPane.showMessageDialog(this, messageAdded);

            tf_title.setText("");
            tf_username.setText("");
            pf_password.setText("");
            tf_website.setText("");
            dispose();
            ListAllPassword updatedList = new ListAllPassword(new javax.swing.JFrame(), true, userId, language, country);
            updatedList.setVisible(true);
        }
    }

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
            java.util.logging.Logger.getLogger(AddNewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewPassword dialog = new AddNewPassword(new javax.swing.JFrame(), true, userId, language, country);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_save;
    private javax.swing.JCheckBox cb_showpassword;
    private javax.swing.JLabel lb_enterinfo;
    private javax.swing.JLabel lb_mandatory;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_username;
    private javax.swing.JLabel lb_website;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_title;
    private javax.swing.JTextField tf_username;
    private javax.swing.JTextField tf_website;
    // End of variables declaration//GEN-END:variables
}
