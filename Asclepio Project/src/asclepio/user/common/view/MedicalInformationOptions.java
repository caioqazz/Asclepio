/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asclepio.user.common.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caio
 */
public class MedicalInformationOptions extends javax.swing.JInternalFrame {

    /**
     * Creates new form MedicalInformation
     */
    public MedicalInformationOptions() {
        initComponents();
        setImage();
    }

    public void setImage() {
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/main/icons/hospital.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonOrtopedista = new javax.swing.JButton();
        jButtonCardiologista = new javax.swing.JButton();
        jButtonDentista = new javax.swing.JButton();
        jButtonOftalmologista = new javax.swing.JButton();
        jButtonPneumologista = new javax.swing.JButton();
        jButtonHepatologista = new javax.swing.JButton();
        jButtonOtorrinolaringologista = new javax.swing.JButton();
        jButtonHematologista = new javax.swing.JButton();
        jButtonNutricionista = new javax.swing.JButton();
        jButtonNefrologista = new javax.swing.JButton();

        setClosable(true);
        setTitle("Informações Medicas");

        jButtonOrtopedista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOrtopedista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOrtopedista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/femur.png"))); // NOI18N
        jButtonOrtopedista.setText("Ortopedista");
        jButtonOrtopedista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrtopedistaActionPerformed(evt);
            }
        });

        jButtonCardiologista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCardiologista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonCardiologista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/heart.png"))); // NOI18N
        jButtonCardiologista.setText("Cardiologista");
        jButtonCardiologista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCardiologistaActionPerformed(evt);
            }
        });

        jButtonDentista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDentista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonDentista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/tooth-1.png"))); // NOI18N
        jButtonDentista.setText("Dentista");
        jButtonDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDentistaActionPerformed(evt);
            }
        });

        jButtonOftalmologista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOftalmologista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOftalmologista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/iris.png"))); // NOI18N
        jButtonOftalmologista.setText("Oftalmologista");
        jButtonOftalmologista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOftalmologistaActionPerformed(evt);
            }
        });

        jButtonPneumologista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPneumologista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonPneumologista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/lungs-2.png"))); // NOI18N
        jButtonPneumologista.setText("Pneumologista");
        jButtonPneumologista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPneumologistaActionPerformed(evt);
            }
        });

        jButtonHepatologista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHepatologista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonHepatologista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/liver.png"))); // NOI18N
        jButtonHepatologista.setText("Hepatologista");
        jButtonHepatologista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHepatologistaActionPerformed(evt);
            }
        });

        jButtonOtorrinolaringologista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOtorrinolaringologista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOtorrinolaringologista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/ear.png"))); // NOI18N
        jButtonOtorrinolaringologista.setText("Otorrinolaringologista");
        jButtonOtorrinolaringologista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtorrinolaringologistaActionPerformed(evt);
            }
        });

        jButtonHematologista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHematologista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonHematologista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/blood-sample-1.png"))); // NOI18N
        jButtonHematologista.setText("Hematologista");
        jButtonHematologista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHematologistaActionPerformed(evt);
            }
        });

        jButtonNutricionista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNutricionista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonNutricionista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/fit.png"))); // NOI18N
        jButtonNutricionista.setText("Nutricionista");
        jButtonNutricionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNutricionistaActionPerformed(evt);
            }
        });

        jButtonNefrologista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNefrologista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonNefrologista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/medicalinfos/kidney-1.png"))); // NOI18N
        jButtonNefrologista.setText("Nefrologista");
        jButtonNefrologista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNefrologistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCardiologista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOrtopedista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDentista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOftalmologista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jButtonNefrologista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonHematologista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHepatologista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPneumologista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNutricionista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOtorrinolaringologista, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNefrologista, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOrtopedista, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPneumologista, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHepatologista, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonHematologista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOftalmologista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCardiologista, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOtorrinolaringologista, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNefrologistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNefrologistaActionPerformed

        try {
            MedicalInformationResult result = new MedicalInformationResult("Nefrologista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonNefrologistaActionPerformed

    private void jButtonOrtopedistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrtopedistaActionPerformed
        try {
            MedicalInformationResult result = new MedicalInformationResult("Ortopedista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOrtopedistaActionPerformed

    private void jButtonDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDentistaActionPerformed
        try {
            MedicalInformationResult result = new MedicalInformationResult("Dentista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDentistaActionPerformed

    private void jButtonOftalmologistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOftalmologistaActionPerformed
        try {
            MedicalInformationResult result = new MedicalInformationResult("Oftalmologista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOftalmologistaActionPerformed

    private void jButtonCardiologistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCardiologistaActionPerformed
        try {
            MedicalInformationResult result = new MedicalInformationResult("Cardiologista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCardiologistaActionPerformed

    private void jButtonNutricionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNutricionistaActionPerformed
        try {
            MedicalInformationResult result = new MedicalInformationResult("Nutricionista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonNutricionistaActionPerformed

    private void jButtonPneumologistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPneumologistaActionPerformed
        try {
            MedicalInformationResult result = new MedicalInformationResult("Pneumologista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPneumologistaActionPerformed

    private void jButtonHepatologistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHepatologistaActionPerformed
        try {
            MedicalInformationResult result = new MedicalInformationResult("Hepatologista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonHepatologistaActionPerformed

    private void jButtonHematologistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHematologistaActionPerformed
        try {
            MedicalInformationResult result = new MedicalInformationResult("Hematologista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonHematologistaActionPerformed

    private void jButtonOtorrinolaringologistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOtorrinolaringologistaActionPerformed
        try {
            MedicalInformationResult result = new MedicalInformationResult("Otorrinolaringologista");
            MainMenu_Common.getDesktopPane().add(result);
            result.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MedicalInformationOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOtorrinolaringologistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCardiologista;
    private javax.swing.JButton jButtonDentista;
    private javax.swing.JButton jButtonHematologista;
    private javax.swing.JButton jButtonHepatologista;
    private javax.swing.JButton jButtonNefrologista;
    private javax.swing.JButton jButtonNutricionista;
    private javax.swing.JButton jButtonOftalmologista;
    private javax.swing.JButton jButtonOrtopedista;
    private javax.swing.JButton jButtonOtorrinolaringologista;
    private javax.swing.JButton jButtonPneumologista;
    // End of variables declaration//GEN-END:variables
}
