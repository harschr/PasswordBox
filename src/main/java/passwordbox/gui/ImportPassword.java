package passwordbox.gui;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import passwordbox.model.Password;
import passwordbox.dao.impl.PasswordRepositoryJBDCImpl;

public class ImportPassword extends javax.swing.JDialog {

    private static int userId;
    private static String language;
    private static String country;
    PasswordRepositoryJBDCImpl pwDAO = new PasswordRepositoryJBDCImpl();
    final JFileChooser fc = new JFileChooser();
    Path path;
    List<Password> importedPasswords = new ArrayList<>();
      // JOptionPane nyelvbeállításaihoz:
    private static String imported;

    public ImportPassword(java.awt.Frame parent, boolean modal, int userId, String language, String country) {
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

        lb_selectid = new javax.swing.JLabel();
        tf_filepath = new javax.swing.JTextField();
        bt_import = new javax.swing.JButton();
        bt_filechooser = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/ImportPassword/Bundle"); // NOI18N
        setTitle(bundle.getString("ImportPassword.title")); // NOI18N

        lb_selectid.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lb_selectid.setText(bundle.getString("ImportPassword.lb_selectid.text")); // NOI18N

        tf_filepath.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        tf_filepath.setText(bundle.getString("ImportPassword.tf_filepath.text")); // NOI18N

        bt_import.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_import.setForeground(new java.awt.Color(254, 0, 0));
        bt_import.setText(bundle.getString("ImportPassword.bt_import.text")); // NOI18N
        bt_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_importActionPerformed(evt);
            }
        });
        bt_import.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_importKeyPressed(evt);
            }
        });

        bt_filechooser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_filechooser.setForeground(new java.awt.Color(254, 0, 0));
        bt_filechooser.setText(bundle.getString("ImportPassword.bt_filechooser.text")); // NOI18N
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

        bt_cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_cancel.setText(bundle.getString("ImportPassword.bt_cancel.text")); // NOI18N
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

        jLabel1.setText(bundle.getString("ImportPassword.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("ImportPassword.jLabel2.text")); // NOI18N

        jLabel3.setText(bundle.getString("ImportPassword.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("ImportPassword.jLabel4.text")); // NOI18N

        jLabel5.setText(bundle.getString("ImportPassword.jLabel5.text")); // NOI18N

        jLabel6.setText(bundle.getString("ImportPassword.jLabel6.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_selectid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(tf_filepath, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(bt_import)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_cancel)
                        .addGap(127, 127, 127)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_selectid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(tf_filepath, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_import, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void setLanguage() {
        Locale locale = new Locale(language, country);
        ResourceBundle resbundle = ResourceBundle.getBundle("gui/ImportPassword/Bundle", locale);
                       
        jLabel1.setText(resbundle.getString("ImportPassword.jLabel1.text"));
        jLabel2.setText(resbundle.getString("ImportPassword.jLabel2.text"));
        jLabel3.setText(resbundle.getString("ImportPassword.jLabel3.text"));
        jLabel4.setText(resbundle.getString("ImportPassword.jLabel4.text"));
        jLabel5.setText(resbundle.getString("ImportPassword.jLabel5.text"));
        jLabel6.setText(resbundle.getString("ImportPassword.jLabel6.text"));      
        bt_cancel.setText(resbundle.getString("ImportPassword.bt_cancel.text"));
        bt_filechooser.setText(resbundle.getString("ImportPassword.bt_filechooser.text"));
        bt_import.setText(resbundle.getString("ImportPassword.bt_import.text"));
         this.setTitle(resbundle.getString("ImportPassword.title"));
        lb_selectid.setText(resbundle.getString("ImportPassword.lb_selectid.text"));     
        tf_filepath.setText(resbundle.getString("ImportPassword.tf_filepath.text"));
        
        imported = resbundle.getString("JOptionPane.imported.text");       
    }

    private void bt_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_importActionPerformed
        writeToSQL(importedPasswords);
    }

    private void writeToSQL(List<Password> passwordList) {
        for (Password pw : passwordList) {
            pwDAO.insert(pw);
        }
        JOptionPane.showMessageDialog(this, imported);
        dispose();
        SelectOption start = new SelectOption(userId);
        start.setVisible(true);
    }//GEN-LAST:event_bt_importActionPerformed

    private void bt_filechooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_filechooserActionPerformed
        chooseFile();
    }//GEN-LAST:event_bt_filechooserActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        dispose();
        SelectOption start = new SelectOption(userId);
        start.setVisible(true);
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void bt_filechooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_filechooserKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            chooseFile();
        }
    }//GEN-LAST:event_bt_filechooserKeyPressed

    private void bt_importKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_importKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            writeToSQL(importedPasswords);
        }
    }//GEN-LAST:event_bt_importKeyPressed

    private void bt_cancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_cancelKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            dispose();
            SelectOption start = new SelectOption(userId);
            start.setVisible(true);
        }
    }//GEN-LAST:event_bt_cancelKeyPressed

    private void chooseFile() {
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            Path path = Paths.get(fc.getSelectedFile().getAbsolutePath());
            tf_filepath.setText(path.toString());

            try (BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {
                String actualLine;

                while ((actualLine = br.readLine()) != null) {
                    if (!actualLine.startsWith("#")) {
                        String[] data = actualLine.split(",");

                        Password password = new Password(userId, data[0].toString(), data[1].toString(), data[2].toString(), data[3].toString());
                        importedPasswords.add(password);
                    }
                }
            } catch (FileNotFoundException ex) {
                System.err.println(ex.getMessage());
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
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
            java.util.logging.Logger.getLogger(ImportPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImportPassword dialog = new ImportPassword(new javax.swing.JFrame(), true, userId, language, country);
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
    private javax.swing.JButton bt_filechooser;
    private javax.swing.JButton bt_import;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lb_selectid;
    private javax.swing.JTextField tf_filepath;
    // End of variables declaration//GEN-END:variables
}
