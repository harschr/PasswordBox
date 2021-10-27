package passwordbox.gui;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.util.Locale;
import java.util.ResourceBundle;
import passwordbox.dao.impl.PasswordRepositoryJBDCImpl;

public class SelectOption extends javax.swing.JFrame {

    PasswordRepositoryJBDCImpl pwDAO = new PasswordRepositoryJBDCImpl();
    private static int userId;
    private String language;
    private String country;

    public SelectOption(int userId) {
        initComponents();
        setLocationRelativeTo(null);
        this.userId = userId;
        setLanguage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rb_new = new javax.swing.JRadioButton();
        rb_editdelete = new javax.swing.JRadioButton();
        rb_import = new javax.swing.JRadioButton();
        rb_list = new javax.swing.JRadioButton();
        bt_ok = new javax.swing.JButton();
        rb_export = new javax.swing.JRadioButton();
        bt_close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/SelectOption/Bundle"); // NOI18N
        setTitle(bundle.getString("SelectOption.title")); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(rb_new);
        rb_new.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb_new.setText(bundle.getString("SelectOption.rb_new.text")); // NOI18N
        rb_new.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rb_newKeyPressed(evt);
            }
        });

        buttonGroup1.add(rb_editdelete);
        rb_editdelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb_editdelete.setText(bundle.getString("SelectOption.rb_editdelete.text")); // NOI18N
        rb_editdelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rb_editdeleteKeyPressed(evt);
            }
        });

        buttonGroup1.add(rb_import);
        rb_import.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb_import.setText(bundle.getString("SelectOption.rb_import.text")); // NOI18N
        rb_import.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rb_importKeyPressed(evt);
            }
        });

        buttonGroup1.add(rb_list);
        rb_list.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb_list.setText(bundle.getString("SelectOption.rb_list.text")); // NOI18N
        rb_list.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rb_listKeyPressed(evt);
            }
        });

        bt_ok.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_ok.setForeground(new java.awt.Color(204, 0, 51));
        bt_ok.setText(bundle.getString("SelectOption.bt_ok.text")); // NOI18N
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_okActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_export);
        rb_export.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb_export.setText(bundle.getString("SelectOption.rb_export.text")); // NOI18N
        rb_export.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rb_exportKeyPressed(evt);
            }
        });

        bt_close.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_close.setText(bundle.getString("SelectOption.bt_close.text")); // NOI18N
        bt_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_closeActionPerformed(evt);
            }
        });
        bt_close.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_closeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(bt_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_export)
                            .addComponent(rb_editdelete)
                            .addComponent(rb_new)
                            .addComponent(rb_list)
                            .addComponent(rb_import))
                        .addGap(80, 96, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rb_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_editdelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_list)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_import)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_export)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText(bundle.getString("SelectOption.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed
        selectOption();
    }//GEN-LAST:event_bt_okActionPerformed

        
    private void setLanguage() {
        String languageUser = pwDAO.findLanguage(userId);
        switch(languageUser) {
            case "Hungarian":
                language = "hu";
                country = "HU";
                break;
            case "Polish":
                language = "pl";
                country = "PL";
                break;
            case "German":
                language = "de";
                country = "DE";
                break;           
            case "English":
                language = "en";
                country = "EN";
                break;               
        }
        
        Locale locale = new Locale(language,country);
        ResourceBundle resbundle = ResourceBundle.getBundle("gui/SelectOption/Bundle",locale);
        bt_close.setText(resbundle.getString("SelectOption.bt_close.text"));
        rb_export.setText(resbundle.getString("SelectOption.rb_export.text"));
        rb_list.setText(resbundle.getString("SelectOption.rb_list.text"));
        rb_import.setText(resbundle.getString("SelectOption.rb_import.text"));
        rb_editdelete.setText(resbundle.getString("SelectOption.rb_editdelete.text"));
        rb_new.setText(resbundle.getString("SelectOption.rb_new.text"));
        jLabel1.setText(resbundle.getString("SelectOption.jLabel1.text"));
    }   
    
    private void selectOption() {
        if (rb_new.isSelected()) {
            dispose();
            AddNewPassword newDialog = new AddNewPassword(this, true, userId, language, country);
            newDialog.setVisible(true);
        } else {
            if (rb_list.isSelected() || rb_editdelete.isSelected()) {
                dispose();
                ListAllPassword listDialog = new ListAllPassword(this, true, userId, language, country);
                listDialog.setVisible(true);
            } else {
                if (rb_import.isSelected()) {
                    dispose();
                    ImportPassword importDialog = new ImportPassword(this, true, userId, language, country);
                    importDialog.setVisible(true);
                } else {
                    if (rb_export.isSelected()) {
                        dispose();
                        ExportPassword exportDialog = new ExportPassword(this, true, userId, language, country);
                        exportDialog.setVisible(true);
                    }
                }
            }
        }
    }

    private void bt_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_closeActionPerformed

    private void rb_newKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rb_newKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            selectOption();
        }
    }//GEN-LAST:event_rb_newKeyPressed

    private void rb_editdeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rb_editdeleteKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            selectOption();
        }
    }//GEN-LAST:event_rb_editdeleteKeyPressed

    private void rb_listKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rb_listKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            selectOption();
        }
    }//GEN-LAST:event_rb_listKeyPressed

    private void rb_importKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rb_importKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            selectOption();
        }
    }//GEN-LAST:event_rb_importKeyPressed

    private void rb_exportKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rb_exportKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            selectOption();
        }
    }//GEN-LAST:event_rb_exportKeyPressed

    private void bt_closeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_closeKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            System.exit(0);
        }
    }//GEN-LAST:event_bt_closeKeyPressed

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
                /*  if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                                      if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;*/
                // Properties props = new Properties();
                //props.put("windowTitleForegroundColor", "0 0 0");
                //  props.put("windowTitleBackgroundColor", "254 0 0"); 
                //  AcrylLookAndFeel.setCurrentTheme(props);
                com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setTheme("Blue-Small-Font");
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");

                new SelectOption(userId);
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectOption(userId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_close;
    private javax.swing.JButton bt_ok;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb_editdelete;
    private javax.swing.JRadioButton rb_export;
    private javax.swing.JRadioButton rb_import;
    private javax.swing.JRadioButton rb_list;
    private javax.swing.JRadioButton rb_new;
    // End of variables declaration//GEN-END:variables
}
