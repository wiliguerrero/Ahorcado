/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;

/**
 *
 * @author Wili1
 */
public class viewBotonesListas extends javax.swing.JFrame {

    /**
     * Creates new form viewBotonesListas
     */
    public viewBotonesListas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelColor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        cboColores = new javax.swing.JComboBox<>();
        R = new javax.swing.JComboBox<>();
        V = new javax.swing.JComboBox<>();
        A = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelColor.setBackground(new java.awt.Color(0, 153, 153));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        cboColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Opción ", "Rojo", "Verde", "Amarillo", "Azul", "Morado", " " }));
        cboColores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboColoresItemStateChanged(evt);
            }
        });
        cboColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboColoresActionPerformed(evt);
            }
        });
        cboColores.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cboColoresPropertyChange(evt);
            }
        });

        R.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonalidad Rojo", "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "255", " " }));
        R.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RItemStateChanged(evt);
            }
        });
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        V.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonalidad Verde", "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "255" }));
        V.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                VItemStateChanged(evt);
            }
        });

        A.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonalidad Azul", "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "255" }));
        A.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(R, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(cboColores, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboColoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboColoresActionPerformed

    private void cboColoresPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cboColoresPropertyChange
        // TODO add your handling code here:

        
    }//GEN-LAST:event_cboColoresPropertyChange

    private void cboColoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboColoresItemStateChanged
        // TODO add your handling code here:
       // String color = cboColores.getSelectedItem().toString();
        int rojo  =Integer.valueOf(R.getSelectedItem().toString());
        int verde =Integer.valueOf(V.getSelectedItem().toString());
        int azul  = Integer.valueOf(A.getSelectedItem().toString());

        //switch(color.toLowerCase()){
            //case "rojo":
        panelColor.setBackground(new Color(rojo,verde,azul));
            //break;
            //case "verde":
         //panelColor.setBackground(new Color(rojo,verde,azul));
         /* break; 
            case "amarillo":
         panelColor.setBackground(new Color(rojo,verde,azul));
            break; 
            case "azul":
         panelColor.setBackground(new Color(rojo,verde,azul));
            break; 
            case "morado":
         panelColor.setBackground(new Color(rojo,verde,azul));
            break; 
                    }*/
    }//GEN-LAST:event_cboColoresItemStateChanged

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RActionPerformed

    private void RItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RItemStateChanged
 int rojo  =Integer.valueOf(R.getSelectedItem().toString());
        int verde =Integer.valueOf(V.getSelectedItem().toString());
        int azul  = Integer.valueOf(A.getSelectedItem().toString());

        //switch(color.toLowerCase()){
            //case "rojo":
        panelColor.setBackground(new Color(rojo,verde,azul));        // TODO add your handling code here:
    }//GEN-LAST:event_RItemStateChanged

    private void VItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_VItemStateChanged
 int rojo  =Integer.valueOf(R.getSelectedItem().toString());
        int verde =Integer.valueOf(V.getSelectedItem().toString());
        int azul  = Integer.valueOf(A.getSelectedItem().toString());

        //switch(color.toLowerCase()){
            //case "rojo":
        panelColor.setBackground(new Color(rojo,verde,azul));        // TODO add your handling code here:
    }//GEN-LAST:event_VItemStateChanged

    private void AItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AItemStateChanged
       int rojo  =Integer.valueOf(R.getSelectedItem().toString());
        int verde =Integer.valueOf(V.getSelectedItem().toString());
        int azul  = Integer.valueOf(A.getSelectedItem().toString());

        //switch(color.toLowerCase()){
            //case "rojo":
        panelColor.setBackground(new Color(rojo,verde,azul));
    }//GEN-LAST:event_AItemStateChanged

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
            java.util.logging.Logger.getLogger(viewBotonesListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewBotonesListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewBotonesListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewBotonesListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewBotonesListas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> A;
    private javax.swing.JComboBox<String> R;
    private javax.swing.JComboBox<String> V;
    private javax.swing.JComboBox<String> cboColores;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelColor;
    // End of variables declaration//GEN-END:variables
}
