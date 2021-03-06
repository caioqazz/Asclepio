/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asclepio.user.profissional.view;

import asclepio.server.funcs.Initialization;
import asclepio.user.profissional.view.LoginProfissional;
import asclepio.user.profissional.view.UserWorkspaceProfissional;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author Caio
 */
public class MainMenu_Profissional extends javax.swing.JFrame {

    private static MainMenu_Profissional menuPrincipal;
    Initialization inicia = new Initialization();
    public String id_logado;
    public boolean tela_login;

    /**
     * Creates new form MenuPrincipal_Especial
     */
    public MainMenu_Profissional() throws IOException {
        initComponents();
        inicia.iniciaPrograma();
        id_logado = "";
        tela_login = false;
        setImage();
    }

    public void setImage() {
        URL url = this.getClass().getResource("/asclepio/main/icons/hospital.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);

    }

    public void flushPane() throws IOException {
        JInternalFrame[] a = this.getDesktopPane().getAllFrames();
        for (int i = 0; i < a.length; i++) {
            a[i].dispose();

        }

    }

    public void flushPane(JInternalFrame atual) throws IOException {
        JInternalFrame[] a = this.getDesktopPane().getAllFrames();
        boolean position = false;
        for (int i = 0; i < a.length; i++) {
            if (a.equals(atual)) {
                System.out.println("achei");
                System.out.println(i);
                position = true;
            } else {
                if (position) {
                    a[i].dispose();
                }
            }
        }

    }

    public static MainMenu_Profissional getInstancia() throws IOException {
        if (menuPrincipal == null) {
            menuPrincipal = new MainMenu_Profissional();
        }

        return menuPrincipal;
    }

    public static JDesktopPane getDesktopPane() throws IOException {
        return getInstancia().jDesktopPane1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/asclepio/user/profissional/icons/medicine.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,140,100,512,512,this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asclépio Profissional");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/main/icons/folder.png"))); // NOI18N
        jMenu1.setText("Arquivo");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/main/icons/cross.png"))); // NOI18N
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/main/icons/user.png"))); // NOI18N
        jMenu2.setText("Usuario");

        jMenuItemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/main/icons/user_go.png"))); // NOI18N
        jMenuItemLogin.setText("Entrar");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemLogin);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed

        if (!tela_login) {
            try {
                login();
            } catch (IOException ex) {
                Logger.getLogger(MainMenu_Profissional.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        tela_login = true;
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    public void login() throws IOException {
        if (id_logado.equals("")) {
            LoginProfissional login = new LoginProfissional();
            jDesktopPane1.add(login);
            login.setVisible(true);
        } else {
            UserWorkspaceProfissional user;

            user = new UserWorkspaceProfissional(id_logado);
            MainMenu_Profissional.getDesktopPane().add(user);
            user.setVisible(true);

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
            java.util.logging.Logger.getLogger(MainMenu_Profissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu_Profissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu_Profissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu_Profissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    getInstancia().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu_Profissional.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemLogin;
    // End of variables declaration//GEN-END:variables
}
