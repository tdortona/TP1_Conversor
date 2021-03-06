package conversor;

import conversor.entities.MetrosYardasConversor;
import conversor.entities.KilometrosMetrosConversor;
import conversor.entities.KilogramosLibrasConversor;
import conversor.entities.KilometrosMillasConversor;
import conversor.entities.GalonesLitrosConversor;
import conversor.entities.CentimetrosPulgadasConversor;
import conversor.entities.CentimetrosMetrosConversor;
import conversor.base.Conversor;
import conversor.utils.Utilities;
import conversor.view.About;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConversorGenerico extends javax.swing.JFrame {

    /**
     * Aqui realizamos la declaracion de las variable que hacen al correcto
     * funcionamiento del formulario y son utilizadas durante toda la vida util
     * del mismo
     */
    private final List<Conversor> conversores = new ArrayList<>();
    private Conversor conversorSeleccionado;
    private boolean convertirAValor2;
    private JComponent convertFromControl;

    /**
     * Este es el constructor del formulario, y en este se encuentran declaradas
     * todas las inicializaciones de los componentes del form
     */
    public ConversorGenerico() {
        initComponents();
        setTitle("Conversor genérico");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setResizable(false);

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
        lblConvert1.setText(conversorSeleccionado.getLabelValor1());
        lblConvert2.setText(conversorSeleccionado.getLabelValor2());
        txtConvert1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConvert1 = new javax.swing.JLabel();
        lblConvert2 = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();
        jComboBoxConvertir = new javax.swing.JComboBox<>();
        txtConvert1 = new javax.swing.JTextField();
        txtConvert2 = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuItemSalir = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuItemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblConvert1.setText("jLabel1");

        lblConvert2.setText("jLabel2");

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

        txtConvert1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConvert1FocusLost(evt);
            }
        });
        txtConvert1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConvert1KeyPressed(evt);
            }
        });

        txtConvert2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConvert2FocusLost(evt);
            }
        });
        txtConvert2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConvert2KeyPressed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Conversion:");

        mnuArchivo.setText("Archivo");

        mnuItemSalir.setText("Salir");
        mnuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItemSalir);

        jMenuBar1.add(mnuArchivo);

        mnuAyuda.setText("Ayuda");

        mnuItemAcerca.setText("Acerca de...");
        mnuItemAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemAcercaActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuItemAcerca);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jButtonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConvert2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConvert1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxConvertir, 0, 348, Short.MAX_VALUE)
                            .addComponent(txtConvert1)
                            .addComponent(txtConvert2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConvert1)
                    .addComponent(txtConvert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConvert2)
                    .addComponent(txtConvert2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConvertir)
                    .addComponent(jButtonLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
        Utilities.INSTANCE.paintControl(txtConvert1, Color.white);
        Utilities.INSTANCE.paintControl(txtConvert2, Color.white);
        realizarConversion(convertFromControl, convertirAValor2);
    }//GEN-LAST:event_jButtonConvertirActionPerformed
    /**
     * Esta funcion hace que cuando cambie el valor del combo se modifiquen los
     * textos de los labels
     */
    private void jComboBoxConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConvertirActionPerformed
        int selectedIndex = jComboBoxConvertir.getSelectedIndex();
        conversorSeleccionado = conversores.get(selectedIndex);
        lblConvert1.setText(conversorSeleccionado.getLabelValor1());
        lblConvert2.setText(conversorSeleccionado.getLabelValor2());
        clearControls();
        txtConvert1.requestFocus();
    }//GEN-LAST:event_jComboBoxConvertirActionPerformed
    /**
     * Este metodo es el que se ejecuta cuando un control del formulario pierde
     * el foco, y cuando eso pasa se setea la variable Booleana como true para
     * saber que la voncersion debe ir desde el txtConvert1 a txtConvert2
     */
    private void txtConvert1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConvert1FocusLost
        convertirAValor2 = true;
        convertFromControl = txtConvert1;
    }//GEN-LAST:event_txtConvert1FocusLost
    /**
     * Este metodo es el que se ejecuta cuando un control del formulario pierde
     * el foco, y cuando eso pasa se setea la variable Booleana como false para
     * saber que la voncersion debe ir desde el txtConvert2 a txtConvert1
     */
    private void txtConvert2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConvert2FocusLost
        convertirAValor2 = false;
        convertFromControl = txtConvert2;
    }//GEN-LAST:event_txtConvert2FocusLost
    /**
     * Este metodo es el que se ejecuta cuando se presiona una tecla,
     * particularmente se captura la tecla ENTER y cuando es presionada se llama
     * al metodo para realizar la conversion.
     */
    private void txtConvert1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConvert1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            realizarConversion(txtConvert1, true);
        }
    }//GEN-LAST:event_txtConvert1KeyPressed
    /**
     * Este metodo es el que se ejecuta cuando se presiona una tecla,
     * particularmente se captura la tecla ENTER y cuando es presionada se llama
     * al metodo para realizar la conversion.
     */
    private void txtConvert2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConvert2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            realizarConversion(txtConvert2, false);
        }
    }//GEN-LAST:event_txtConvert2KeyPressed
    /**
     * Este metodo se utiliza para hacer la limpieza de los controles y
     * volverlos a su estado original
     */
    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        clearControls();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    /**
     * Opcion del menu que realiza la consulta sobre salir del sistema
     */
    private void mnuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemSalirActionPerformed
        Integer answer = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea salir del sistema?", "Salir del sistema", JOptionPane.YES_NO_OPTION);
        if (answer.equals(0)) {
            System.exit(0);
        }

    }//GEN-LAST:event_mnuItemSalirActionPerformed

    private void mnuItemAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemAcercaActionPerformed
        About frame = new About();
        frame.setLocationRelativeTo(this);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }//GEN-LAST:event_mnuItemAcercaActionPerformed

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

    /**
     * Este metodo es el que se encarga de realizar la conversion en si, recibe
     * como parametros un JComponent y un Boolean. Cuando empieza el proceso lo
     * primero que se hace es convertir el control recibido en una instancia de
     * JTextField para poder manipular los datos con mayor simpleza, luego de
     * eso se envian los valores a una variable local del tipo string y se
     * realiza replace de las "," por ".". Luego de obtener los datos mediante a
     * la funcion isNumeric que se encuentra en Utilities se realiza la
     * evaluacion de la cadena en caso de error se ejecuta el metodo de error
     * generico. Caso contrario se econtinua con el proceso de conversion y
     * realizando la conversion segun corresponda
     *
     * @param control
     * @param convertFrom
     * @throws NumberFormatException
     */
    private void realizarConversion(JComponent control, Boolean convertFrom) throws NumberFormatException {
        JTextField txtControl = (JTextField) control;
        String valorAConvertirString = txtControl.getText().replace(',', '.');
        if (txtControl.getText().trim().equals("")) {
            showErrorMessage(control, "Debe ingresar un valor en el campo");
            return;
        }

        if (!Utilities.INSTANCE.isNumeric(valorAConvertirString)) {
            showErrorMessage(control, "Debe ingresar un valor NUMERICO en el campo");
            return;
        }
        Double valorAConvertirDouble = Double.valueOf(valorAConvertirString);
        Double valorConvertido = convertirAValor2 ? conversorSeleccionado.convertirValor1AValor2(valorAConvertirDouble) : conversorSeleccionado.convertirValor2AValor1(valorAConvertirDouble);
        if (convertFrom) {
            txtConvert2.setText(String.format("%.2f", valorConvertido));
        } else {
            txtConvert1.setText(String.format("%.2f", valorConvertido));
        }
    }

    /**
     * Este metodo maneja los errores que se va encontrando al momento de
     * realizar la conversion recibe como parametro un JComponent que es
     * utilizado para enviarlo al metodo "paintControl" que se encuentra dentro
     * de Utilities, luego de eso muestra el mensaje de error y una vez que se
     * presiona sobre el boton aceptar se envia el cursor al objeto que tiene el
     * error.
     *
     * @param control
     */
    private void showErrorMessage(JComponent control, String mensaje) {
        Utilities.INSTANCE.paintControl(control, Color.red);
        JOptionPane.showMessageDialog(this, "Error al intentar convertir: " + mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        control.requestFocus();
    }
    /**
     * Esta funcion limpia los controles
     */
    private void clearControls() {
        txtConvert1.setText("");
        txtConvert2.setText("");
        Utilities.INSTANCE.paintControl(txtConvert1, Color.white);
        Utilities.INSTANCE.paintControl(txtConvert2, Color.white);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxConvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblConvert1;
    private javax.swing.JLabel lblConvert2;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuItemAcerca;
    private javax.swing.JMenuItem mnuItemSalir;
    private javax.swing.JTextField txtConvert1;
    private javax.swing.JTextField txtConvert2;
    // End of variables declaration//GEN-END:variables

}
