/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asclepio.user.common.view.edit;

import asclepio.server.funcs.WriterCommon;
import asclepio.server.funcs.ReaderCommon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caio
 */
public class Allergies extends javax.swing.JInternalFrame {

    ReaderCommon leitura;
    WriterCommon escrita;
    String values;
    String CPF;

    /**
     * Creates new form Alergia
     */
    public Allergies(String CPF) throws IOException {
        initComponents();
        escrita = new WriterCommon();
        leitura = new ReaderCommon();

        this.CPF = CPF;
        getValue();
         setImage();
    }
    public void setImage() {
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/main/icons/hospital.png")));
    }

    public void getValue() throws IOException {
        values = leitura.leituraAlergias(CPF);
        if (!values.isEmpty()) {
            setValue();
        }
    }

    public void setValue() {
        String value[] = values.split("#");
        DefaultTableModel tableAlergias = (DefaultTableModel) jTableAlergias.getModel();

        for (int i = 0; i < value.length; i++) {
            String value_split[] = value[i].split(";");

            tableAlergias.addRow(new Object[]{value_split[0], value_split[1]});

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAlergias = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        alergia = new javax.swing.JTextField();
        button_Add_Alergia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Alergias");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Alergia"));

        jTableAlergias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alergias", "Verificação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableAlergias);

        jButtonAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/save.png"))); // NOI18N
        jButtonAlterar.setText("Salvar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/delete.png"))); // NOI18N
        jButtonDelete.setText("Deletar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        button_Add_Alergia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_Add_Alergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asclepio/user/common/icons/add.png"))); // NOI18N
        button_Add_Alergia.setText("Adicionar");
        button_Add_Alergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Add_AlergiaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("V = Alergia Verificada;  X= Alergia NÃO Verificada;");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(alergia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_Add_Alergia))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Add_Alergia))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        DefaultTableModel tableAlergias = (DefaultTableModel) jTableAlergias.getModel();

        Object obj;
        Object obj2;
        ArrayList<String> alergias = new ArrayList<String>();
        for (int i = 0; i < tableAlergias.getRowCount(); i++) {

            obj = jTableAlergias.getValueAt(i, 0);
            obj2 = jTableAlergias.getValueAt(i, 1);
            alergias.add(obj.toString() + ";" + obj2.toString());

        }
        try {
            escrita.escreveAlergias(CPF, alergias, true);
            JOptionPane.showMessageDialog(null, "Alergias alteradas com sucesso");
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Allergies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        DefaultTableModel tableAlergias = (DefaultTableModel) jTableAlergias.getModel();
        if (jTableAlergias.getSelectedRow() >= 0) {
            infoVerificada(tableAlergias, jTableAlergias.getSelectedRow());
        } else {

            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }

    }//GEN-LAST:event_jButtonDeleteActionPerformed
    void infoVerificada(DefaultTableModel tableAlergias, int i) {
        Object obj = jTableAlergias.getValueAt(i, 1);
        if (obj.toString().equals("V")) {
            JOptionPane.showMessageDialog(null, "Favor ir ao medico para remover essa informação");
        } else {
            tableAlergias.removeRow(jTableAlergias.getSelectedRow());
            jTableAlergias.setModel(tableAlergias);
        }

    }
    private void button_Add_AlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Add_AlergiaActionPerformed
        DefaultTableModel tableAlergias = (DefaultTableModel) jTableAlergias.getModel();
        Object[] alergi = {alergia.getText(), "X"};
        tableAlergias.addRow(alergi);
        alergia.setText("");
    }//GEN-LAST:event_button_Add_AlergiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alergia;
    private javax.swing.JButton button_Add_Alergia;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAlergias;
    // End of variables declaration//GEN-END:variables
}