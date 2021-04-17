/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tdortona
 */
public class ConversorGenerico extends javax.swing.JFrame {

    private final List<Conversor> conversores = new ArrayList<>();
    private Conversor conversorSeleccionado;
    
    /**
     * Creates new form ConversorGenerico
     */
    public ConversorGenerico() {
        initComponents();
        setTitle("Conversor genérico");
        setLocationRelativeTo(null);
        
        conversores.add(new CentimetrosPulgadasConversor());
        conversores.add(new GalonesLitrosConversor());
        conversores.add(new KilogramosLibrasConversor());
        conversores.add(new KilometrosMetrosConversor());
        conversores.add(new KilometrosMillasConversor());
        conversores.add(new CentimetrosMetrosConversor());
        conversores.add(new MetrosYardasConversor());
        
        for (Conversor conversor : conversores) {
            jComboBoxConvertir.addItem(conversor.toString());    
        }
        
        conversorSeleccionado = conversores.get(0);
        jLabel1.setText(conversorSeleccionado.getLabelValor1());
        jLabel2.setText(conversorSeleccionado.getLabelValor2());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();
        jComboBoxConvertir = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jButtonConvertir.setText("Convertir");
        jButtonConvertir.setToolTipText("Convertir los valores seleccionados");
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });

        jComboBoxConvertir.setToolTipText("Seleccione un tipo de conversor");
        jComboBoxConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConvertirActionPerformed(evt);
            }
        });

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(332, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jComboBoxConvertir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConvertir)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConvertir))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
        // TODO add your handling code here:
        realizarConversion(convertirAValor2);
    }//GEN-LAST:event_jButtonConvertirActionPerformed

    private void jComboBoxConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConvertirActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jComboBoxConvertir.getSelectedIndex();
        conversorSeleccionado = conversores.get(selectedIndex);
        jLabel1.setText(conversorSeleccionado.getLabelValor1());
        jLabel2.setText(conversorSeleccionado.getLabelValor2());
    }//GEN-LAST:event_jComboBoxConvertirActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        convertirAValor2 = true;
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        convertirAValor2 = false;
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            realizarConversion(true);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            realizarConversion(false);
        }
    }//GEN-LAST:event_jTextField2KeyPressed

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
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorGenerico().setVisible(true);
            }
        });
    }
    
    private void realizarConversion(boolean convertirAValor2) throws NumberFormatException {
        String valorAConvertirString = convertirAValor2 ? jTextField1.getText().replace(',', '.') : jTextField2.getText().replace(',', '.');
        
        if (valorAConvertirString.toLowerCase().contains("d") || valorAConvertirString.toLowerCase().contains("f")) {
            showErrorMessage();
            return;
        }
        
        Double valorAConvertirDouble;
        
        try {
            valorAConvertirDouble = Double.valueOf(valorAConvertirString);
        } catch (NumberFormatException ex) {
            showErrorMessage();
            return;
        }
        Double valorConvertido = convertirAValor2 ? conversorSeleccionado.convertirValor1AValor2(valorAConvertirDouble) : conversorSeleccionado.convertirValor2AValor1(valorAConvertirDouble);
        
        if (convertirAValor2) {
            jTextField2.setText(String.format("%.2f", valorConvertido));
        }
        else {
            jTextField1.setText(String.format("%.2f", valorConvertido));
        }
    }
    
    private void showErrorMessage() {
        JOptionPane.showMessageDialog(this, "Error al convertir", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private boolean convertirAValor2;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JComboBox<String> jComboBoxConvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}