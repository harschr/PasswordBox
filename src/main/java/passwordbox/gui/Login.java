package passwordbox.gui;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import passwordbox.dao.impl.PasswordRepositoryJBDCImpl;

public class Login extends javax.swing.JFrame {

    PasswordRepositoryJBDCImpl pwDAO = new PasswordRepositoryJBDCImpl();
    Locale locale;
    ResourceBundle resbundle;
    private static String language;
    private static String country;
      // JOptionPane nyelvbeállításaihoz:
    private static String messagePw;
    private static String title;
    private static String messageUser;
   

    public Login() {
        language = "en";
        country = "GB";
        initComponents();
        setLocationRelativeTo(null);
        setLanguage();
    }

    public Login(String languageCurr, String countryCurr) {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb_user = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        bt_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bt_register = new javax.swing.JButton();
        pf_password = new javax.swing.JPasswordField();
        bt_close = new javax.swing.JButton();
        cb_showpassword = new javax.swing.JCheckBox();
        cb_keepsignedin = new javax.swing.JCheckBox();
        bt_hu = new javax.swing.JButton();
        bt_pl = new javax.swing.JButton();
        bt_de = new javax.swing.JButton();
        bt_en = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/Login/Bundle"); // NOI18N
        setTitle(bundle.getString("Login.title")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(bundle.getString("Login.jLabel1.text")); // NOI18N

        lb_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_user.setText(bundle.getString("Login.lb_user.text")); // NOI18N

        lb_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_password.setText(bundle.getString("Login.lb_password.text")); // NOI18N

        bt_login.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_login.setForeground(new java.awt.Color(255, 0, 0));
        bt_login.setText(bundle.getString("Login.bt_login.text")); // NOI18N
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });
        bt_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_loginKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText(bundle.getString("Login.jLabel2.text")); // NOI18N

        bt_register.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt_register.setText(bundle.getString("Login.bt_register.text")); // NOI18N
        bt_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registerActionPerformed(evt);
            }
        });
        bt_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_registerKeyPressed(evt);
            }
        });

        pf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_passwordKeyPressed(evt);
            }
        });

        bt_close.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_close.setText(bundle.getString("Login.bt_close.text")); // NOI18N
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

        cb_showpassword.setText(bundle.getString("Login.cb_showpassword.text")); // NOI18N
        cb_showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_showpasswordActionPerformed(evt);
            }
        });

        cb_keepsignedin.setText(bundle.getString("Login.cb_keepsignedin.text")); // NOI18N
        cb_keepsignedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_keepsignedinActionPerformed(evt);
            }
        });

        bt_hu.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        bt_hu.setText(bundle.getString("Login.bt_hu.text")); // NOI18N
        bt_hu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_huActionPerformed(evt);
            }
        });

        bt_pl.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        bt_pl.setText(bundle.getString("Login.bt_pl.text")); // NOI18N
        bt_pl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_plActionPerformed(evt);
            }
        });

        bt_de.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        bt_de.setText(bundle.getString("Login.bt_de.text")); // NOI18N
        bt_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deActionPerformed(evt);
            }
        });

        bt_en.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        bt_en.setText(bundle.getString("Login.bt_en.text")); // NOI18N
        bt_en.setToolTipText(bundle.getString("Login.bt_en.toolTipText")); // NOI18N
        bt_en.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(bt_register))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(57, 57, 57)
                                            .addComponent(bt_login)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bt_close))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lb_user)
                                                .addComponent(lb_password))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cb_showpassword))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(cb_keepsignedin)))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_hu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_pl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_de)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_en)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_pl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_hu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_de, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_en))
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_user)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_password)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(cb_showpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_keepsignedin)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bt_register, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setLanguage() {

        locale = new Locale(language, country);
        resbundle = ResourceBundle.getBundle("gui/Login/Bundle", locale);

        bt_login.setText(resbundle.getString("Login.bt_login.text"));
        lb_password.setText(resbundle.getString("Login.lb_password.text"));
        lb_user.setText(resbundle.getString("Login.lb_user.text"));
        jLabel1.setText(resbundle.getString("Login.jLabel1.text"));
        jLabel2.setText(resbundle.getString("Login.jLabel2.text"));
        cb_showpassword.setText(resbundle.getString("Login.cb_showpassword.text"));
        cb_keepsignedin.setText(resbundle.getString("Login.cb_keepsignedin.text"));
        bt_close.setText(resbundle.getString("Login.bt_close.text"));
        bt_register.setText(resbundle.getString("Login.bt_register.text"));
        this.setTitle(resbundle.getString("Login.title"));
        
        messagePw = resbundle.getString("JOptionPane.messagePw.text");
        messageUser = resbundle.getString("JOptionPane.messageUser.text");
        title = resbundle.getString("JOptionPane.title.text");
    }

    private void bt_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registerActionPerformed
        Register registerDialog = new Register(this, true, language, country);
        registerDialog.setVisible(true);
    }//GEN-LAST:event_bt_registerActionPerformed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        login();
    }//GEN-LAST:event_bt_loginActionPerformed

    private void bt_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_closeActionPerformed

    private void cb_showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_showpasswordActionPerformed
        if (cb_showpassword.isSelected()) {
            pf_password.setEchoChar((char) 0);
        } else {
            pf_password.setEchoChar('•');
        }
    }//GEN-LAST:event_cb_showpasswordActionPerformed

    private void bt_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_loginKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            login();
        }
    }//GEN-LAST:event_bt_loginKeyPressed

    private void pf_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_passwordKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            login();
        }
    }//GEN-LAST:event_pf_passwordKeyPressed

    private void bt_closeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_closeKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            System.exit(0);
        }
    }//GEN-LAST:event_bt_closeKeyPressed

    private void bt_registerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_registerKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            Register registerDialog = new Register(this, true, language, country);
            registerDialog.setVisible(true);
        }
    }//GEN-LAST:event_bt_registerKeyPressed

    private void cb_keepsignedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_keepsignedinActionPerformed
        if (cb_keepsignedin.isSelected()) {

        }
    }//GEN-LAST:event_cb_keepsignedinActionPerformed

    private void bt_huActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_huActionPerformed
        language = "hu";
        country = "HU";
        setLanguage();
    }//GEN-LAST:event_bt_huActionPerformed

    private void bt_plActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_plActionPerformed
        language = "pl";
        country = "PL";
        setLanguage();
    }//GEN-LAST:event_bt_plActionPerformed

    private void bt_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deActionPerformed
        language = "de";
        country = "DE";
        setLanguage();
    }//GEN-LAST:event_bt_deActionPerformed

    private void bt_enActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enActionPerformed
        language = "en";
        country = "EN";
        setLanguage();
    }//GEN-LAST:event_bt_enActionPerformed

    private void login() {
        String passwordBoxUser = tf_user.getText();
        boolean exists = pwDAO.usernameCheck(passwordBoxUser);
        String password = pf_password.getText();
        PasswordRepositoryJBDCImpl pwDAO = new PasswordRepositoryJBDCImpl();

        if (exists) {
            String passwordSQL = pwDAO.login(passwordBoxUser);
            int userId = pwDAO.retrieveUserId(passwordBoxUser);

            if (!passwordSQL.equals(password)) {
                JOptionPane.showInternalMessageDialog(null, messagePw, title, JOptionPane.ERROR_MESSAGE);
                pf_password.setText("");
            } else {
                dispose();
                SelectOption start = new SelectOption(userId);
                start.setVisible(true);
            }
        } else {
            JOptionPane.showInternalMessageDialog(null, messageUser, title, JOptionPane.ERROR_MESSAGE);
            tf_user.setText("");
            pf_password.setText("");

        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setTheme("Blue-Small-Font");
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                new Login(language, country);
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(language, country).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_close;
    private javax.swing.JButton bt_de;
    private javax.swing.JButton bt_en;
    private javax.swing.JButton bt_hu;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_pl;
    private javax.swing.JButton bt_register;
    private javax.swing.JCheckBox cb_keepsignedin;
    private javax.swing.JCheckBox cb_showpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_user;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
