/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Phamagest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author TOYIFANE
 */
public class VoirUser extends javax.swing.JFrame {

    private String username = "";

    /**
     * Creates new form VoirUser
     */
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet res = null;

    public VoirUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = Connect.getConnection();
    }

    public VoirUser(String tempUsername) {
        initComponents();
        username = tempUsername;
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUtil = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAdresse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboFonction = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtPass = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Admin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 10));

        tbUtil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prenom", "Telephone", "Email", "Fonction", "Adresse", "Password"
            }
        ));
        tbUtil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUtilMouseClicked(evt);
            }
        });
        tbUtil.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tbUtilComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tbUtil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 800, 130));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 20, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 240, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 230, -1));
        jPanel1.add(txtPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 230, -1));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 230, -1));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 230, -1));
        jPanel1.add(txtAdresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 230, -1));

        jLabel2.setText("Adresse");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setText("Nom");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setText("Prenom");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel7.setText("Téléphone");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        comboFonction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "pharmacien" }));
        jPanel1.add(comboFonction, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 230, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 700, 10));

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, 30));

        jButton4.setText("Modifier");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, 30));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 230, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 230, -1));

        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel9.setText("Fonction");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 700, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbUtil.getModel();
        try {
            con = Connect.getConnection();
            pst = con.prepareStatement("SELECT * FROM utilisateurs ORDER BY idutil ASC ");
            res = pst.executeQuery();
            while (res.next()) {
                model.addRow(new Object[]{res.getString("idutil"), res.getString("nom"), res.getString("prenom"),
                    res.getString("telephone"), res.getString("email"),
                    res.getString("fonction"), res.getString("adresse"), res.getString("pass")});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void tbUtilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUtilMouseClicked
        // TODO add your handling code here:
        int row = tbUtil.getSelectedRow();
        String t = tbUtil.getModel().getValueAt(row, 0).toString();
        String sql = "select * from utilisateurs where idutil='" + t + "' ";
        try {
            pst = con.prepareStatement(sql);
            res = pst.executeQuery();
            if (res.next()) {
                String id = res.getString("idutil");
                txtID.setText(id);
                String nom = res.getString("nom");
                txtNom.setText(nom);
                String prenom = res.getString("prenom");
                txtPrenom.setText(prenom);
                String email = res.getString("email");
                txtEmail.setText(email);
                String password = res.getString("pass");
                txtPass.setText(password);
                String phone = res.getString("telephone");
                txtPhone.setText(phone);
                String adresse = res.getString("adresse");
                txtAdresse.setText(adresse);
                String fonction = res.getString("fonction").split("-")[0];
                comboFonction.setSelectedItem(fonction);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bonnes informations", "Erreur", 2);

        }
    }//GEN-LAST:event_tbUtilMouseClicked

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Entrez l'ID que vous souhaitez supprimer", "Information manquante", 2);
        } else if (verifierm()) {
            String sql = "DELETE FROM utilisateurs WHERE idutil='" + txtID.getText() + "' ";
            try {
                int check = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de supprimer cette uttilisateur", "Message", JOptionPane.YES_NO_OPTION);
                if (check == 0) {
                    pst = con.prepareStatement(sql);
                    pst.executeQuery();
                    JOptionPane.showMessageDialog(null, "Utilisateur supprimé avec succès", "Message", 1);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Utilisateur supprimé avec succès", "Message", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "L'utilisateur est introuvable", "Mauvaise opération", 2);
        }
        setVisible(false);
        new VoirUser().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
        String nom = txtNom.getText();
        String prenom = txtPrenom.getText();
        String adresse = txtAdresse.getText();
        String email = txtEmail.getText();
        String password = txtPass.getText();
        String phone = txtPhone.getText();
        String fonction = comboFonction.getSelectedItem().toString();

        if (id.equals("") || nom.equals("") || prenom.equals("") || adresse.equals("")
                || email.equals("") || password.equals("") || phone.equals("") || fonction.equals("")) {
            JOptionPane.showMessageDialog(null, "Completez les informations", "Information manquante", 2);
        } else {
            String sql = " update utilisateurs set nom='" + nom + "',prenom='" + prenom + "',adresse='" + adresse + "',email='" + email + "',pass='" + password + "',telephone='" + phone + "',fonction='" + fonction + "' where idutil='" + id + "' ";
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Modification reusi", "Succès", 1);
                setVisible(false);
                new VoirUser().setVisible(true);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Merci", "Message", 2);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbUtilComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tbUtilComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tbUtilComponentShown

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
            java.util.logging.Logger.getLogger(VoirUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoirUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoirUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoirUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoirUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboFonction;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbUtil;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables
 private boolean verifierm() {
        boolean verifier = false;
        String sql = "select idutil from utilisateurs where idutil='" + txtID.getText() + "' ";
        try {
            pst = con.prepareStatement(sql);
            res = pst.executeQuery();
            if (res.next()) {
                verifier = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", 2);
        }
        return verifier;

    }

}
