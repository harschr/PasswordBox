package passwordbox.gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import passwordbox.dao.impl.PasswordRepositoryJBDCImpl;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import passwordbox.model.Password;

public class ListAllPassword extends javax.swing.JFrame {

    private static int userId;
    private static String language;
    private static String country;
    PasswordRepositoryJBDCImpl pwDAO = new PasswordRepositoryJBDCImpl();
   // JOptionPane nyelvbeállításaihoz:
    private static String messageNotDel;
    private static String titleNotDel;
    private static String messageConDel;
    private static String titleConDel;
    private static String removed;
    private static String messageNotSave;
    private static String titleNotSave;
    private static String updated;
 

    public ListAllPassword(java.awt.Frame parent, boolean modal, int userId, String language, String country) {
        initComponents();
        setLocationRelativeTo(null);
        this.userId = userId;
        this.language = language;
        this.country = country;
        setLanguage();
        ListAllPasswords();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_seelist = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_allrecords = new javax.swing.JTable();
        bt_back = new javax.swing.JButton();
        bt_save = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        lb_edit = new javax.swing.JLabel();
        bt_addnew = new javax.swing.JButton();
        lb_addnew = new javax.swing.JLabel();
        lb_delete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/ListAllPassword/Bundle"); // NOI18N
        setTitle(bundle.getString("ListAllPassword.title")); // NOI18N
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lb_seelist.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_seelist.setText(bundle.getString("ListAllPassword.lb_seelist.text")); // NOI18N

        jtable_allrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Username", "Password", "Website"
            }
        ));
        jScrollPane1.setViewportView(jtable_allrecords);
        if (jtable_allrecords.getColumnModel().getColumnCount() > 0) {
            jtable_allrecords.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("ListAllPassword.jtable_allrecords.columnModel.title0")); // NOI18N
            jtable_allrecords.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("ListAllPassword.jtable_allrecords.columnModel.title1")); // NOI18N
            jtable_allrecords.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("ListAllPassword.jtable_allrecords.columnModel.title2")); // NOI18N
            jtable_allrecords.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("ListAllPassword.jtable_allrecords.columnModel.title3")); // NOI18N
            jtable_allrecords.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("ListAllPassword.jtable_allrecords.columnModel.title4")); // NOI18N
        }

        bt_back.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_back.setText(bundle.getString("ListAllPassword.bt_back.text")); // NOI18N
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        bt_save.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_save.setForeground(new java.awt.Color(204, 0, 51));
        bt_save.setText(bundle.getString("ListAllPassword.bt_save.text")); // NOI18N
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        bt_delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_delete.setForeground(new java.awt.Color(204, 0, 51));
        bt_delete.setText(bundle.getString("ListAllPassword.bt_delete.text")); // NOI18N
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        lb_edit.setText(bundle.getString("ListAllPassword.lb_edit.text")); // NOI18N

        bt_addnew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_addnew.setForeground(new java.awt.Color(204, 0, 51));
        bt_addnew.setText(bundle.getString("ListAllPassword.bt_addnew.text")); // NOI18N
        bt_addnew.setToolTipText(bundle.getString("ListAllPassword.bt_addnew.toolTipText")); // NOI18N
        bt_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addnewActionPerformed(evt);
            }
        });

        lb_addnew.setText(bundle.getString("ListAllPassword.lb_addnew.text")); // NOI18N

        lb_delete.setText(bundle.getString("ListAllPassword.lb_delete.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(54, Short.MAX_VALUE)
                        .addComponent(bt_addnew)
                        .addGap(43, 43, 43)
                        .addComponent(bt_save)
                        .addGap(44, 44, 44)
                        .addComponent(bt_delete)
                        .addGap(47, 47, 47)
                        .addComponent(bt_back)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_seelist)
                                    .addComponent(lb_edit)
                                    .addComponent(lb_addnew))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_seelist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_addnew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_delete)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void setLanguage() {           
        Locale locale = new Locale(language,country);
        ResourceBundle resbundle = ResourceBundle.getBundle("gui/ListAllPassword/Bundle",locale);
        bt_delete.setText(resbundle.getString("ListAllPassword.bt_delete.text"));
        bt_save.setText(resbundle.getString("ListAllPassword.bt_save.text"));
        bt_back.setText(resbundle.getString("ListAllPassword.bt_back.text"));
        lb_seelist.setText(resbundle.getString("ListAllPassword.lb_seelist.text"));
        this.setTitle(resbundle.getString("ListAllPassword.title"));
        lb_delete.setText(resbundle.getString("ListAllPassword.lb_delete.text"));
        lb_edit.setText(resbundle.getString("ListAllPassword.lb_edit.text"));
        bt_addnew.setText(resbundle.getString("ListAllPassword.bt_addnew.text"));
        lb_addnew.setText(resbundle.getString("ListAllPassword.lb_addnew.text"));
        lb_addnew.setText(resbundle.getString("ListAllPassword.lb_addnew.text"));
        lb_addnew.setText(resbundle.getString("ListAllPassword.lb_addnew.text"));
        lb_addnew.setText(resbundle.getString("ListAllPassword.lb_addnew.text"));
        lb_addnew.setText(resbundle.getString("ListAllPassword.lb_addnew.text"));
        
        JTableHeader th = jtable_allrecords.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        TableColumn tc0 = tcm.getColumn(0);
        TableColumn tc1 = tcm.getColumn(1);
        TableColumn tc2 = tcm.getColumn(2);
        TableColumn tc3 = tcm.getColumn(3);
        TableColumn tc4 = tcm.getColumn(4);
        tc0.setHeaderValue(resbundle.getString("ListAllPassword.jtable_allrecords.columnModel.title0"));
        tc1.setHeaderValue(resbundle.getString("ListAllPassword.jtable_allrecords.columnModel.title1"));
        tc2.setHeaderValue(resbundle.getString("ListAllPassword.jtable_allrecords.columnModel.title2"));
        tc3.setHeaderValue(resbundle.getString("ListAllPassword.jtable_allrecords.columnModel.title3"));
        tc4.setHeaderValue(resbundle.getString("ListAllPassword.jtable_allrecords.columnModel.title4"));
        
        messageNotDel= resbundle.getString("JOptionPane.messageNotDel.text");
        titleNotDel= resbundle.getString("JOptionPane.titleNotDel.text");
        messageConDel= resbundle.getString("JOptionPane.messageConDel.text");
        titleConDel = resbundle.getString("JOptionPane.titleConDel.text");
        UIManager.put("OptionPane.yesButtonText", resbundle.getString("JOptionPane.ConDelYes.text"));
        UIManager.put("OptionPane.noButtonText", resbundle.getString("JOptionPane.ConDelNo.text"));
         removed = resbundle.getString("JOptionPane.removed.text");
         messageNotSave = resbundle.getString("JOptionPane.messageNotSave.text");
         titleNotSave = resbundle.getString("JOptionPane.titleNotSave.text");
         updated = resbundle.getString("JOptionPane.updated.text");       
    }   
    
    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        dispose();
        SelectOption start = new SelectOption(userId);
        start.setVisible(true);
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        if (jtable_allrecords.getSelectedRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, messageNotDel, titleNotDel, JOptionPane.WARNING_MESSAGE);
        } else {
            int kijelolt = jtable_allrecords.getSelectedRow();
            TableModel model = jtable_allrecords.getModel();
            String id = model.getValueAt(kijelolt, 0).toString();

            int gomb = JOptionPane.YES_NO_OPTION;
            int valasz = JOptionPane.showConfirmDialog(this, messageConDel, titleConDel, gomb);

            if (valasz == JOptionPane.YES_OPTION) {
                pwDAO.delete(id);
                JOptionPane.showMessageDialog(this, removed);
                dispose();
                ListAllPassword updated = new ListAllPassword(new javax.swing.JFrame(), true, userId, language, country);
                updated.setVisible(true);
            }
        }
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        if (jtable_allrecords.getSelectedRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, messageNotSave, titleNotSave, JOptionPane.WARNING_MESSAGE);
        } else {
            int kijelolt = jtable_allrecords.getSelectedRow();
            TableModel model = jtable_allrecords.getModel();

            int passwordId = Integer.parseInt(model.getValueAt(kijelolt, 0).toString());
            String newTitle = jtable_allrecords.getValueAt(kijelolt, 1).toString();
            String newUser = jtable_allrecords.getValueAt(kijelolt, 2).toString();
            String newPassword = jtable_allrecords.getValueAt(kijelolt, 3).toString();
            String newWebsite = jtable_allrecords.getValueAt(kijelolt, 4).toString();

            Password pwUpdated = new Password(userId, newTitle, newUser, newPassword, newWebsite);
            pwDAO.update(pwUpdated, passwordId);
            JOptionPane.showMessageDialog(this, updated);       
        }
    }//GEN-LAST:event_bt_saveActionPerformed

    private void bt_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addnewActionPerformed
        dispose();
        new AddNewPassword(new javax.swing.JFrame(), true, userId, language, country).setVisible(true);

    }//GEN-LAST:event_bt_addnewActionPerformed

    private void ListAllPasswords() {
        ArrayList<String[]> passwordList = pwDAO.listAll(userId);
        DefaultTableModel tableModel = (DefaultTableModel) jtable_allrecords.getModel();
        for (String[] data : passwordList) {
            tableModel.addRow(data);
        }
    }

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
            java.util.logging.Logger.getLogger(ListAllPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListAllPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListAllPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListAllPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListAllPassword dialog = new ListAllPassword(new javax.swing.JFrame(), true, userId, language, country);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                dialog.pack();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addnew;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_save;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_allrecords;
    private javax.swing.JLabel lb_addnew;
    private javax.swing.JLabel lb_delete;
    private javax.swing.JLabel lb_edit;
    private javax.swing.JLabel lb_seelist;
    // End of variables declaration//GEN-END:variables
}
