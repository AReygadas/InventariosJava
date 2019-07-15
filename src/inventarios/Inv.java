package inventarios;

import javax.swing.table.DefaultTableModel;
import conexion.ConexionDB;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit;
/**
 *
 * @author areyg
 */
public class Inv extends javax.swing.JInternalFrame {

    /** variables Globales **/
    
    
    public Inv() {
        initComponents();
        comboBoxRound1.setModel(cargarteorias());
        Tabla();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entrada = new javax.swing.JFrame();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboBoxRound1 = new org.edisoncor.gui.comboBox.ComboBoxRound();
        comboBoxRound2 = new org.edisoncor.gui.comboBox.ComboBoxRound();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        textFieldRoundBackground1 = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        jSpinner1 = new javax.swing.JSpinner();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        buttonTask2 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask3 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask4 = new org.edisoncor.gui.button.ButtonTask();
        textFieldRoundBackground2 = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/background.jpg"))); // NOI18N
        panelImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelImage2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 730, 360));

        comboBoxRound1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxRound1ItemStateChanged(evt);
            }
        });
        comboBoxRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRound1ActionPerformed(evt);
            }
        });
        panelImage2.add(comboBoxRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 72, 225, -1));

        comboBoxRound2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxRound2ItemStateChanged(evt);
            }
        });
        panelImage2.add(comboBoxRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 126, 225, -1));

        labelMetric1.setText("CATEGORIA");
        panelImage2.add(labelMetric1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 48, 165, -1));

        labelMetric2.setText("PRODUCTO");
        panelImage2.add(labelMetric2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 105, 162, -1));

        textFieldRoundBackground1.setDescripcion("COSTO UNITARIO");
        panelImage2.add(textFieldRoundBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 179, 126, -1));
        panelImage2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 177, 70, -1));

        labelMetric3.setText("CANTIDAD");
        panelImage2.add(labelMetric3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 153, -1, -1));
        panelImage2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 13, 145, -1));

        buttonTask2.setForeground(new java.awt.Color(255, 255, 255));
        buttonTask2.setText("Agregar");
        buttonTask2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask2ActionPerformed(evt);
            }
        });
        panelImage2.add(buttonTask2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 170, -1));

        buttonTask3.setForeground(new java.awt.Color(255, 255, 255));
        buttonTask3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/17262-Phoenix27-Corbeillevide.png"))); // NOI18N
        buttonTask3.setText("Cargar ");
        buttonTask3.setDescription("FACTURA");
        buttonTask3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask3ActionPerformed(evt);
            }
        });
        panelImage2.add(buttonTask3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 160, 60));

        buttonTask4.setForeground(new java.awt.Color(255, 255, 255));
        buttonTask4.setText("Guardar");
        buttonTask4.setDescription("Entrada");
        buttonTask4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask4ActionPerformed(evt);
            }
        });
        panelImage2.add(buttonTask4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 170, -1));

        textFieldRoundBackground2.setDescripcion("Factura o Nota de entrada");
        panelImage2.add(textFieldRoundBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, -1));

        Entrada.getContentPane().add(panelImage2, java.awt.BorderLayout.CENTER);

        setTitle("INVENTARIOS");
        setToolTipText("");

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/lmgFondo.jpg"))); // NOI18N

        buttonTask1.setText("Entrada");
        buttonTask1.setActionCommand("Agregar");
        buttonTask1.setDescription("Entrada");
        buttonTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1027, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(684, Short.MAX_VALUE))
        );

        getContentPane().add(panelImage1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRound1ActionPerformed
        
    }//GEN-LAST:event_comboBoxRound1ActionPerformed

    private void buttonTask1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask1ActionPerformed
       Entrada.setSize(600, 60);
       Entrada.show();
       cargarteorias();
       
    }//GEN-LAST:event_buttonTask1ActionPerformed

     private DefaultComboBoxModel cargarteorias(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            String sql1 = "SELECT Tipo from productos group by Tipo";
            Connection cn = (Connection)ConexionDB.GetConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            
            while (rs.next()) {
              modelo.addElement(rs.getString("Tipo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return modelo;
    }
    private void comboBoxRound2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxRound2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxRound2ItemStateChanged

    private void comboBoxRound1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxRound1ItemStateChanged
        comboBoxRound2.setModel(productos(comboBoxRound1.getSelectedItem().toString()));
    }//GEN-LAST:event_comboBoxRound1ItemStateChanged
    
    private void buttonTask3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask3ActionPerformed
        try {
            imagen();
        } catch (IOException ex) {
            Logger.getLogger(Inv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonTask3ActionPerformed

    String pad = System.getProperty("user.dir") ;
    boolean factura = false;
    String ruta = null;
    
    public void imagen() throws IOException{
        final JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(false);
        elegirImagen.setCurrentDirectory(new File(pad));
        int o = elegirImagen.showOpenDialog(this);
        if(o == JFileChooser.APPROVE_OPTION){
            ruta = elegirImagen.getSelectedFile().getCanonicalPath();
            String nombre = elegirImagen.getSelectedFile().getName();
            //jTextField1.setText(ruta);
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta);
            if(preview != null){
//                jLabel1.setText("");
                JOptionPane.showMessageDialog(null, ruta);
 //               ImageIcon icon = new ImageIcon(preview.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                //panelImage3.setIcon(new javax.swing.ImageIcon(ruta)); // NOI18N

//              panelImage4.setIcon(icon);
              // panelImage3.updateUI();
                buttonTask3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/45.png")));
                factura = true;
            }
        }
        pad=ruta;
    }
    
    public boolean guardarImagen(String nombre){
        String insert = "INSERT INTO `latinoamricana`.`doctos` (`doc`) VALUES (?);";
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            Connection cn=(Connection)ConexionDB.GetConnection();
            cn.setAutoCommit(false);
            File file = new File(ruta);
            fis = new FileInputStream(file);
            ps = cn.prepareStatement(insert);
            ps.setBinaryStream(1,fis,(int)file.length());
            ps.executeUpdate();
            cn.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Inv.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                fis.close();
                factura = false;
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex);
            }
        }        
        return false;
    }
    
    DefaultTableModel model = new DefaultTableModel();
    private void Tabla(){
        model.addColumn("Fecha");
        model.addColumn("Producto");
        model.addColumn("Cantidad");
        model.addColumn("Costo U");
        model.addColumn("Factura");
    }
    private void buttonTask2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask2ActionPerformed
        if (factura = true) {
            String datos[] = new  String[10];
            datos[0] = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
            
            datos[1] = comboBoxRound1.getSelectedItem().toString();
            model.addRow(datos);
            
        }else{
            JOptionPane.showMessageDialog(null, "Debes cargar antes la factura o comprobante de alta");
        }
        
        
        
        
    }//GEN-LAST:event_buttonTask2ActionPerformed

    private void buttonTask4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTask4ActionPerformed
 private DefaultComboBoxModel productos(String tipo){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            String sql1 = "SELECT Descripcion from productos where Tipo = '"+tipo+"'";
            Connection cn = (Connection)ConexionDB.GetConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            
            while (rs.next()) {
              modelo.addElement(rs.getString("Descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return modelo;
    }
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Entrada;
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private org.edisoncor.gui.button.ButtonTask buttonTask2;
    private org.edisoncor.gui.button.ButtonTask buttonTask3;
    private org.edisoncor.gui.button.ButtonTask buttonTask4;
    private org.edisoncor.gui.comboBox.ComboBoxRound comboBoxRound1;
    private org.edisoncor.gui.comboBox.ComboBoxRound comboBoxRound2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textFieldRoundBackground1;
    private org.edisoncor.gui.textField.TextFieldRoundBackground textFieldRoundBackground2;
    // End of variables declaration//GEN-END:variables
}
