package passwordbox.gui;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import passwordbox.dao.impl.PasswordRepositoryJBDCImpl;
import passwordbox.model.User;

public class Register extends javax.swing.JDialog {
    
    private Pattern pattern;
    private Matcher matcher;
    private Locale locale;
    private ResourceBundle resbundle;
    private static String language;
    private static String country;
        // JOptionPane nyelvbeállításaihoz:
    private static String messageReg;
    private static String messageEmail;
    private static String messagePwConf;
    private static String messagePwFormat;
    private static String messageBlank;
    private static String title;
    
    public Register(java.awt.Frame parent, boolean modal, String language, String country) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.language = language;
        this.country = country;
        setLanguage();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lb_firstName = new javax.swing.JLabel();
        lb_lastName = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_user = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        tf_firstName = new javax.swing.JTextField();
        tf_lastName = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_user = new javax.swing.JTextField();
        bt_register = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lb_language = new javax.swing.JLabel();
        cb_language = new javax.swing.JComboBox<>();
        lb_mandatory = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        cb_showpassword = new javax.swing.JCheckBox();
        bt_cancel = new javax.swing.JButton();
        lb_passwordconfirm = new javax.swing.JLabel();
        pf_passwordconfirm = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/Register/Bundle"); // NOI18N
        jTextField1.setText(bundle.getString("Register.jTextField1.text")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(bundle.getString("Register.title")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(bundle.getString("Register.jLabel1.text")); // NOI18N

        lb_firstName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_firstName.setText(bundle.getString("Register.lb_firstName.text")); // NOI18N

        lb_lastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_lastName.setText(bundle.getString("Register.lb_lastName.text")); // NOI18N

        lb_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_email.setText(bundle.getString("Register.lb_email.text")); // NOI18N

        lb_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_user.setText(bundle.getString("Register.lb_user.text")); // NOI18N

        lb_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_password.setText(bundle.getString("Register.lb_password.text")); // NOI18N

        bt_register.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_register.setForeground(new java.awt.Color(255, 0, 0));
        bt_register.setText(bundle.getString("Register.bt_register.text")); // NOI18N
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

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(bundle.getString("Register.jTextArea1.text")); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        lb_language.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_language.setText(bundle.getString("Register.lb_language.text")); // NOI18N

        cb_language.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_language.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Hungarian", "Polish", "German" }));

        lb_mandatory.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lb_mandatory.setForeground(new java.awt.Color(255, 0, 0));
        lb_mandatory.setText(bundle.getString("Register.lb_mandatory.text")); // NOI18N

        cb_showpassword.setText(bundle.getString("Register.cb_showpassword.text")); // NOI18N
        cb_showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_showpasswordActionPerformed(evt);
            }
        });

        bt_cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_cancel.setText(bundle.getString("Register.bt_cancel.text")); // NOI18N
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

        lb_passwordconfirm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_passwordconfirm.setText(bundle.getString("Register.lb_passwordconfirm.text")); // NOI18N

        pf_passwordconfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_passwordconfirmKeyPressed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText(bundle.getString("Register.jTextArea2.text")); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(bt_register)
                .addGap(31, 31, 31)
                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_email))
                    .addComponent(lb_mandatory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lb_lastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_lastName))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lb_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lb_passwordconfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pf_passwordconfirm))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_user)
                            .addComponent(lb_password)
                            .addComponent(lb_language, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pf_password)
                            .addComponent(tf_user)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_showpassword)
                                    .addComponent(cb_language, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(lb_mandatory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_firstName)
                    .addComponent(tf_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_lastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_email)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_language))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_user))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_showpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_passwordconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_passwordconfirm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_register, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setLanguage() {
        
        locale = new Locale(language, country);
        resbundle = ResourceBundle.getBundle("gui/Register/Bundle", locale);
        
        bt_register.setText(resbundle.getString("Register.bt_register.text"));
        bt_cancel.setText(resbundle.getString("Register.bt_cancel.text"));
        lb_password.setText(resbundle.getString("Register.lb_password.text"));
        lb_user.setText(resbundle.getString("Register.lb_user.text"));
        lb_email.setText(resbundle.getString("Register.lb_email.text"));
        lb_lastName.setText(resbundle.getString("Register.lb_lastName.text"));
        lb_firstName.setText(resbundle.getString("Register.lb_firstName.text"));
        lb_passwordconfirm.setText(resbundle.getString("Register.lb_passwordconfirm.text"));
        lb_mandatory.setText(resbundle.getString("Register.lb_mandatory.text"));
        lb_language.setText(resbundle.getString("Register.lb_language.text"));
        jTextArea1.setText(resbundle.getString("Register.jTextArea1.text"));
        jTextArea2.setText(resbundle.getString("Register.jTextArea2.text"));
        jLabel1.setText(resbundle.getString("Register.jLabel1.text"));
        cb_showpassword.setText(resbundle.getString("Register.cb_showpassword.text"));
        this.setTitle(resbundle.getString("Register.title"));
        
        messageReg = resbundle.getString("JOptionPane.messageReg.text");
        messageEmail = resbundle.getString("JOptionPane.messageEmail.text");
        messagePwConf = resbundle.getString("JOptionPane.messagePwConf.text");
        messagePwFormat = resbundle.getString("JOptionPane.messagePwFormat.text");
        messageBlank = resbundle.getString("JOptionPane.messageBlank.text");
        title = resbundle.getString("JOptionPane.title.text");
    }
    

    private void bt_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registerActionPerformed
        register();
    }//GEN-LAST:event_bt_registerActionPerformed

    private void cb_showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_showpasswordActionPerformed
        if (cb_showpassword.isSelected()) {
            pf_password.setEchoChar((char) 0);
        } else {
            pf_password.setEchoChar('•');
        }
    }//GEN-LAST:event_cb_showpasswordActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        dispose();
        Login loginCancelled = new Login();
        loginCancelled.setVisible(true);
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void pf_passwordconfirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_passwordconfirmKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            register();
        }
    }//GEN-LAST:event_pf_passwordconfirmKeyPressed

    private void bt_registerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_registerKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            register();
        }
    }//GEN-LAST:event_bt_registerKeyPressed

    private void bt_cancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_cancelKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {
            dispose();
            Login loginCancelled = new Login(language, country);
            loginCancelled.setVisible(true);
        }
    }//GEN-LAST:event_bt_cancelKeyPressed
    
    private void register() {
        if (tf_firstName.getText().isBlank() || tf_email.getText().isBlank() || tf_user.getText().isBlank() || pf_password.getText().isBlank() || pf_passwordconfirm.getText().isBlank()) {
            showError();
        } else {
            
            PasswordRepositoryJBDCImpl pwDAO = new PasswordRepositoryJBDCImpl();
            String firstName = tf_firstName.getText();
            String lastName = tf_lastName.getText();
            String email = tf_email.getText();
            String language = cb_language.getSelectedItem().toString();
            String user = tf_user.getText();
            String password = pf_password.getText();
            String passwordConfirmed = pf_passwordconfirm.getText();
            
            if (validatePassword(password)) {
                if (confirmPassword(password, passwordConfirmed)) {
                    if (validateEmail(email)) {
                        User newUser = new User(firstName, lastName, email, language, user, password);
                        pwDAO.register(newUser);
                        JOptionPane.showMessageDialog(this, messageReg);
                        
                        tf_firstName.setText("");
                        tf_lastName.setText("");
                        tf_email.setText("");
                        tf_user.setText("");
                        pf_password.setText("");
                        pf_passwordconfirm.setText("");
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, messageEmail);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, messagePwConf);
                }
            } else {
                JOptionPane.showMessageDialog(this, messagePwFormat);
            }
        }
    }
    
    private boolean validateEmail(String email) {
        final String EMAIL_REGEX = "([^ @]+@[a-z.]+[^.])";
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    private boolean validatePassword(String password) {
        final String PASSWORD_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!?]).{6,20})";
        pattern = Pattern.compile(PASSWORD_REGEX);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    private boolean confirmPassword(String password, String passwordConfirmed) {
        return password.equals(passwordConfirmed);
    }
    
    private void showError() {
        JOptionPane.showInternalMessageDialog(null, messageBlank, title, JOptionPane.ERROR_MESSAGE);
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setTheme("Blue-Small-Font");
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Register dialog = new Register(new javax.swing.JFrame(), true, language, country);
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
    private javax.swing.JButton bt_register;
    private javax.swing.JComboBox<String> cb_language;
    private javax.swing.JCheckBox cb_showpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_firstName;
    private javax.swing.JLabel lb_language;
    private javax.swing.JLabel lb_lastName;
    private javax.swing.JLabel lb_mandatory;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_passwordconfirm;
    private javax.swing.JLabel lb_user;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pf_passwordconfirm;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_firstName;
    private javax.swing.JTextField tf_lastName;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
