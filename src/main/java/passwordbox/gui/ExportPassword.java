package passwordbox.gui;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import passwordbox.dao.impl.PasswordRepositoryJBDCImpl;

public class ExportPassword extends javax.swing.JDialog {

    private static int userId;
    private static String language;
    private static String country;
    private final JFileChooser fc = new JFileChooser();
    private String pathToString;
    PasswordRepositoryJBDCImpl pwDAO = new PasswordRepositoryJBDCImpl();
    // JOptionPane nyelvbeállításaihoz:
    private static String exported;

    public ExportPassword(java.awt.Frame parent, boolean modal, int userId, String language, String country) {
        super(parent, modal);
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

        lb_insertpath = new javax.swing.JLabel();
        tf_filepath = new javax.swing.JTextField();
        bt_export = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        bt_filechooser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/ExportPassword/Bundle"); // NOI18N
        setTitle(bundle.getString("ExportPassword.title")); // NOI18N

        lb_insertpath.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_insertpath.setText(bundle.getString("ExportPassword.lb_insertpath.text")); // NOI18N

        tf_filepath.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        tf_filepath.setText(bundle.getString("ExportPassword.tf_filepath.text")); // NOI18N

        bt_export.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_export.setForeground(new java.awt.Color(254, 0, 0));
        bt_export.setText(bundle.getString("ExportPassword.bt_export.text")); // NOI18N
        bt_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exportActionPerformed(evt);
            }
        });
        bt_export.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_exportKeyPressed(evt);
            }
        });

        bt_cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_cancel.setText(bundle.getString("ExportPassword.bt_cancel.text")); // NOI18N
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

        bt_filechooser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_filechooser.setForeground(new java.awt.Color(254, 0, 0));
        bt_filechooser.setText(bundle.getString("ExportPassword.bt_filechooser.text")); // NOI18N
        bt_filechooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_filechooserActionPerformed(evt);
            }
        });
        bt_filechooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_filechooserKeyPressed(evt);
            }
        });

        jLabel1.setText(bundle.getString("ExportPassword.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("ExportPassword.jLabel2.text")); // NOI18N

        jLabel3.setText(bundle.getString("ExportPassword.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("ExportPassword.jLabel4.text")); // NOI18N

        jLabel5.setText(bundle.getString("ExportPassword.jLabel5.text")); // NOI18N

        jLabel6.setText(bundle.getString("ExportPassword.jLabel6.text")); // NOI18N

        jLabel7.setText(bundle.getString("ExportPassword.jLabel7.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_filechooser, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addGap(72, 72, 72)
                                .addComponent(bt_export)
                                .addGap(68, 68, 68)
                                .addComponent(bt_cancel)
                                .addGap(108, 108, 108))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(lb_insertpath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(tf_filepath, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_insertpath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_filepath, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_export, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setLanguage() {
        Locale locale = new Locale(language, country);
        ResourceBundle resbundle = ResourceBundle.getBundle("gui/ExportPassword/Bundle", locale);

        jLabel1.setText(resbundle.getString("ExportPassword.jLabel1.text"));
        jLabel2.setText(resbundle.getString("ExportPassword.jLabel2.text"));
        jLabel3.setText(resbundle.getString("ExportPassword.jLabel3.text"));
        jLabel4.setText(resbundle.getString("ExportPassword.jLabel4.text"));
        jLabel5.setText(resbundle.getString("ExportPassword.jLabel5.text"));
        jLabel6.setText(resbundle.getString("ExportPassword.jLabel6.text"));
        jLabel7.setText(resbundle.getString("ExportPassword.jLabel7.text"));
        bt_cancel.setText(resbundle.getString("ExportPassword.bt_cancel.text"));
        bt_filechooser.setText(resbundle.getString("ExportPassword.bt_filechooser.text"));
        bt_export.setText(resbundle.getString("ExportPassword.bt_export.text"));
        this.setTitle(resbundle.getString("ExportPassword.title"));
        lb_insertpath.setText(resbundle.getString("ExportPassword.lb_insertpath.text"));
        tf_filepath.setText(resbundle.getString("ExportPassword.tf_filepath.text"));
        
        exported = resbundle.getString("JOptionPane.exported.text");    
    }

    public void writeToCSV(String pathToString) {

        try (PrintWriter pw = new PrintWriter(new File(pathToString))) {

            StringBuilder sb = pwDAO.writeToCSV(userId);
            pw.write(sb.toString());

        } catch (IOException ioex) {
            System.err.println(ioex.getMessage());
        }
        JOptionPane.showMessageDialog(this, exported);
    }

    private void bt_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exportActionPerformed
        writeToCSV(pathToString);
    }//GEN-LAST:event_bt_exportActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        dispose();
        SelectOption start = new SelectOption(userId);
        start.setVisible(true);
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void bt_filechooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_filechooserActionPerformed
        chooseFile();
    }//GEN-LAST:event_bt_filechooserActionPerformed

    private void bt_filechooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_filechooserKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            chooseFile();
        }
    }//GEN-LAST:event_bt_filechooserKeyPressed

    private void bt_exportKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_exportKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            writeToCSV(pathToString);
        }
    }//GEN-LAST:event_bt_exportKeyPressed

    private void bt_cancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_cancelKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            dispose();
            SelectOption start = new SelectOption(userId);
            start.setVisible(true);
        }
    }//GEN-LAST:event_bt_cancelKeyPressed

    private void chooseFile() {
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            Path path = Paths.get(fc.getSelectedFile().getAbsolutePath());
            pathToString = path.toString();
            tf_filepath.setText(pathToString);
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
            java.util.logging.Logger.getLogger(ExportPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ExportPassword dialog = new ExportPassword(new javax.swing.JFrame(), true, userId, language, country);
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
    private javax.swing.JButton bt_export;
    private javax.swing.JButton bt_filechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb_insertpath;
    private javax.swing.JTextField tf_filepath;
    // End of variables declaration//GEN-END:variables
}
