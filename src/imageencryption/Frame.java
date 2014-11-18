package imageencryption;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        try {
            initComponents();
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            lblImagen.setSize(jPanel1.getWidth(), jPanel1.getHeight());
            
            /*SortedMap<String, Charset> availableCharsets = Charset.availableCharsets();
            Collection<Charset> values = availableCharsets.values();
            Iterator<Charset> i = values.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }*/
        } catch (Exception ex) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex1) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpCifrar = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        rdbCifrarString = new javax.swing.JRadioButton();
        txtCifrarString = new javax.swing.JTextField();
        rdbCifrarArchivo = new javax.swing.JRadioButton();
        txtCifrarArchivo = new javax.swing.JTextField();
        btnCifrarArchivo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCifrarImagen = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        btnCifrar = new javax.swing.JButton();
        btnDescifrar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cifrado por imagen by Blau");
        setResizable(false);

        grpCifrar.add(rdbCifrarString);
        rdbCifrarString.setText("String");
        rdbCifrarString.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbCifrarStringMouseClicked(evt);
            }
        });
        rdbCifrarString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCifrarStringActionPerformed(evt);
            }
        });

        txtCifrarString.setEnabled(false);

        grpCifrar.add(rdbCifrarArchivo);
        rdbCifrarArchivo.setText("Archivo");
        rdbCifrarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCifrarArchivoActionPerformed(evt);
            }
        });

        txtCifrarArchivo.setEnabled(false);

        btnCifrarArchivo.setText("Buscar");
        btnCifrarArchivo.setEnabled(false);
        btnCifrarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrarArchivoActionPerformed(evt);
            }
        });

        jLabel2.setText("Imagen");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        btnCifrar.setText("CIFRAR");
        btnCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrarActionPerformed(evt);
            }
        });

        btnDescifrar.setText("DESCIFRAR");
        btnDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescifrarActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDescifrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(txtCifrarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbCifrarArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCifrarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCifrarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbCifrarString)
                        .addGap(14, 14, 14)
                        .addComponent(txtCifrarString, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtResultado))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCifrarString)
                    .addComponent(txtCifrarString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCifrarArchivo)
                    .addComponent(txtCifrarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCifrarArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCifrarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCifrar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnDescifrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbCifrarStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCifrarStringActionPerformed
        txtCifrarString.setEnabled(rdbCifrarString.isSelected());
        txtCifrarArchivo.setEnabled(rdbCifrarArchivo.isSelected());
        btnCifrarArchivo.setEnabled(rdbCifrarArchivo.isSelected());
    }//GEN-LAST:event_rdbCifrarStringActionPerformed

    private void rdbCifrarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCifrarArchivoActionPerformed
        txtCifrarArchivo.setEnabled(rdbCifrarArchivo.isSelected());
        btnCifrarArchivo.setEnabled(rdbCifrarArchivo.isSelected());
        txtCifrarString.setEnabled(rdbCifrarString.isSelected());
    }//GEN-LAST:event_rdbCifrarArchivoActionPerformed

    private void rdbCifrarStringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbCifrarStringMouseClicked
        //txtCifrarString.setEnabled(rdbCifrarString.isSelected());
    }//GEN-LAST:event_rdbCifrarStringMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ruta;
        javax.swing.JFileChooser jF1 = new javax.swing.JFileChooser();
        jF1.setAcceptAllFileFilterUsed(false);
        jF1.addChoosableFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));
        if (jF1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            ruta = jF1.getSelectedFile().getAbsolutePath();
            //lblImagen.setSize(jPanel1.getWidth(), jPanel1.getHeight());
            Image img = new ImageIcon(ruta).getImage();
            BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics bg = bi.getGraphics();
            bg.drawImage(img, 0, 0, null);
            bg.dispose();
            lblImagen.setIcon(new ImageIcon(bi.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), java.awt.Image.SCALE_REPLICATE)));
            txtCifrarImagen.setText(ruta);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarActionPerformed
        if (!rdbCifrarString.isSelected() && !rdbCifrarArchivo.isSelected()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un tipo de cifrado (string/archivo)", "Error", 2);
        }
        if (rdbCifrarString.isSelected() && txtCifrarString.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes escribir una string", "Error", 2);
        } else if (rdbCifrarArchivo.isSelected() && txtCifrarArchivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un archivo", "Error", 2);
        }
        if (txtCifrarImagen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una imagen", "Error", 2);
        }
        txtResultado.setText("Cifrando...");
        if (rdbCifrarString.isSelected()) {
            txtResultado.setText(new String(Library.cifrarString(txtCifrarString.getText().getBytes(), txtCifrarImagen.getText(), true)));
        }else{
            txtResultado.setText(Library.cifrarArchivo(txtCifrarArchivo.getText(), txtCifrarImagen.getText(), true));
        }
    }//GEN-LAST:event_btnCifrarActionPerformed

    private void btnDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescifrarActionPerformed
        if (!rdbCifrarString.isSelected() && !rdbCifrarArchivo.isSelected()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un tipo de cifrado (string/archivo)", "Error", 2);
        }
        if (rdbCifrarString.isSelected() && txtCifrarString.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes escribir una string", "Error", 2);
        } else if (rdbCifrarArchivo.isSelected() && txtCifrarArchivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un archivo", "Error", 2);
        }
        if (txtCifrarImagen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una imagen", "Error", 2);
        }
        txtResultado.setText("Descifrando...");
        if (rdbCifrarString.isSelected()) {
            txtResultado.setText(new String(Library.cifrarString(txtCifrarString.getText().getBytes(), txtCifrarImagen.getText(), false)));
        }else{
            txtResultado.setText(Library.cifrarArchivo(txtCifrarArchivo.getText(), txtCifrarImagen.getText(), false));
        }
    }//GEN-LAST:event_btnDescifrarActionPerformed

    private void btnCifrarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarArchivoActionPerformed
        String ruta;
        javax.swing.JFileChooser jF1 = new javax.swing.JFileChooser();
        jF1.setAcceptAllFileFilterUsed(true);
        if (jF1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            ruta = jF1.getSelectedFile().getAbsolutePath();
            txtCifrarArchivo.setText(ruta);
        }
    }//GEN-LAST:event_btnCifrarArchivoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCifrar;
    private javax.swing.JButton btnCifrarArchivo;
    private javax.swing.JButton btnDescifrar;
    private javax.swing.ButtonGroup grpCifrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JRadioButton rdbCifrarArchivo;
    private javax.swing.JRadioButton rdbCifrarString;
    private javax.swing.JTextField txtCifrarArchivo;
    private javax.swing.JTextField txtCifrarImagen;
    private javax.swing.JTextField txtCifrarString;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
