/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.StringBinding;
import javafx.scene.text.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Wili1
 */
public class JuegoAhorcado extends javax.swing.JFrame {
    //Almacena las palabras leidas desde el archivo

    private String[] listaPalabras = new String[20];
    private Integer intentos = 1; //Almacena el numero de intentos
    private Integer contador = 0; // cuenta las palabras en la lista
    //palabras a adivinar
    private StringBuilder palabra = new StringBuilder();
    int ran;

    Icon imagePerdiste;

    /**
     * Creates new form JuegoAhorcado
     */
    public JuegoAhorcado() throws FileNotFoundException {
        initComponents();
        CentrarForma();//Al iniciar la ventana se centra sobre la pantalla
        //1. Carga el archivo  de texto en la ubicacion correspondiente

    }

    private void IniciarJuego() throws FileNotFoundException {

        File archivo = new File("H:\\Palabras.txt");
        leerArchivo(archivo); //Metodo para leer el archivo de texto
        loadNextWord(contador);//Carga la primera palabra
        txtPalabra.requestFocus();//Posiciona el foco sobre este componente
        imagePerdiste = new ImageIcon(getClass().getResource("/images/ahorcado-iloveimg-resized (1).png"));

    }

    private void leerArchivo(File aFile) throws FileNotFoundException {

        int conta = 0; //Cuenta el numero de palabras leeidas

        try {

            BufferedReader input = new BufferedReader(new FileReader(aFile));
            try {
                String line = null; // Se extrae linea por linea el codigo
                while ((line = input.readLine()) != null) {
                    //Coleccion Map (Clave, valor)
                    listaPalabras[conta] = line;
                    conta++;

                }

            } finally {
                input.close();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    //Metodo que nos permite centrar la ventana en la pantalla
    private void CentrarForma() {
        //  Dimencion de la pantalla ancho y alto
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //Dimension de la ventana
        Dimension Ventana = this.getSize();
        //Posicion del borde superior izquierdo de la pantalla.
        double posX = (pantalla.getWidth() - Ventana.getWidth()) / 2.0;
        double posY = (pantalla.getHeight() - Ventana.getHeight()) / 2.0;

        //Establece la posición
        this.setLocation((int) posX, (int) posY);

    }

    private void loadNextWord(int indice) {
        if (indice < listaPalabras.length) {
            String line = listaPalabras[indice]; //Extrae la primera letra
            StringBuilder wordConGuion = new StringBuilder();
            //Simbolo de diferencia entre palabras y descripcion
            String[] datos = line.split(":");

            //Palabra a cargar en los controles
            for (Character car : datos[0].toUpperCase().toCharArray()) {
                palabra.append(car);
                palabra.append(" ");
                wordConGuion.append("_");
                wordConGuion.append(" ");

            }

            txtDescrip.setText(datos[1]);
            txtPalabra.setText(wordConGuion.toString());
            txtAdivinar.setText(" ");
        }
    }

    private void CambiarImagen() {
        switch (intentos) {
            case 0:
                ImagenAh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Aho1.png")));
                numeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/N0.png")));
                break;
            case 1:

                ImagenAh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Aho2.png")));
                numeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/N1.png")));
                break;

            case 2:
                ImagenAh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Aho3.png")));
                numeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/N2.png")));
                break;

            case 3:
                ImagenAh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Aho4.png")));
                numeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/N3.png")));
                break;

            case 4:
                ImagenAh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Aho5.png")));
                numeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/N4.png")));
                break;

            case 5:
                ImagenAh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Aho6.png")));
                numeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/N5.png")));
                break;

            case 6:
                ImagenAh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Aho7.png")));
                numeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/N6.png")));
                JOptionPane.showMessageDialog(null, " Perdiste ", "", JOptionPane.INFORMATION_MESSAGE, imagePerdiste);

                break;
        }

    }
    private void limpiar(){
   txtPalabra.setText(" ");
   txtDescrip.setText(" ");
   txtErradas.setText(" ");
   palabra.append(" ");
   txtAdivinar.setText(" ");  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();
        numeros = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ImagenAh = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrip = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtAdivinar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtErradas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 500));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Toledo", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ahorcado-iloveimg-resized (1).png"))); // NOI18N
        jLabel1.setText("Juego del Ahorcado");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIniciar.setBackground(new java.awt.Color(0, 153, 153));
        btnIniciar.setFont(new java.awt.Font("Toledo", 0, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/c.png"))); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.setBorder(null);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 153, 153));
        btnSalir.setFont(new java.awt.Font("Toledo", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/c1-iloveimg-resized (1).png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnSalirKeyTyped(evt);
            }
        });

        numeros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/N0.png"))); // NOI18N
        numeros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Toledo", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Intentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numeros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(200, 227, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ImagenAh.setBackground(new java.awt.Color(204, 163, 255));
        ImagenAh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Aho1.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(136, 218, 191));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.GridLayout(4, 2));

        jLabel4.setFont(new java.awt.Font("Toledo", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Palabra");
        jPanel3.add(jLabel4);

        txtPalabra.setEditable(false);
        txtPalabra.setBackground(new java.awt.Color(255, 255, 153));
        txtPalabra.setFont(new java.awt.Font("Toledo", 0, 14)); // NOI18N
        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });
        jPanel3.add(txtPalabra);

        jLabel5.setFont(new java.awt.Font("Toledo", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripción");
        jPanel3.add(jLabel5);

        txtDescrip.setBackground(new java.awt.Color(255, 255, 153));
        txtDescrip.setColumns(20);
        txtDescrip.setFont(new java.awt.Font("Toledo", 0, 14)); // NOI18N
        txtDescrip.setRows(5);
        jScrollPane1.setViewportView(txtDescrip);

        jPanel3.add(jScrollPane1);

        jLabel6.setFont(new java.awt.Font("Toledo", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Adivinar");
        jPanel3.add(jLabel6);

        txtAdivinar.setBackground(new java.awt.Color(255, 255, 102));
        txtAdivinar.setFont(new java.awt.Font("Toledo", 0, 14)); // NOI18N
        txtAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdivinarActionPerformed(evt);
            }
        });
        txtAdivinar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdivinarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdivinarKeyTyped(evt);
            }
        });
        jPanel3.add(txtAdivinar);

        jLabel7.setFont(new java.awt.Font("Toledo", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Letras erradas");
        jPanel3.add(jLabel7);

        txtErradas.setEditable(false);
        txtErradas.setBackground(new java.awt.Color(255, 51, 51));
        txtErradas.setFont(new java.awt.Font("Toledo", 0, 14)); // NOI18N
        jPanel3.add(txtErradas);

        jLabel2.setFont(new java.awt.Font("Toledo", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 105, 135));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ESCRIBE LAS LETRAS");

        jLabel3.setFont(new java.awt.Font("Toledo", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 105, 135));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EN MAYUSCULAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImagenAh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenAh)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int confirmado = JOptionPane.showConfirmDialog(null, "¿Realmente quiere salir?");

        if (JOptionPane.OK_OPTION == confirmado) {

            System.exit(0);

        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPalabraActionPerformed

    private void txtAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdivinarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdivinarActionPerformed

    private void txtAdivinarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdivinarKeyTyped
        // TODO add your handling code here:

        char car = evt.getKeyChar();//extrae el caracter del teclado
        String uCar = "" + car;
        int pos = palabra.indexOf(uCar.toUpperCase()); //indica posision de caracter

        if (!(Character.isAlphabetic(car))) {//si no es alfabetco

            evt.consume();//no lo despliega

        } else {
            //Busca el caracter en el teclado
            StringBuilder adivinar = new StringBuilder();
            adivinar.toString();

            if (pos >= 0) {
                adivinar.append(txtPalabra.getText());

                while (pos >= 0) {

                    palabra.replace(pos, pos + 1, "_");
                    adivinar.replace(pos, pos + 1, "" + car);
                    pos = palabra.indexOf("" + car);

                }
                txtPalabra.setText(adivinar.toString());
                txtAdivinar.setText("");
                

                if (txtPalabra.getText().indexOf("_") < 0) {

                    JOptionPane.showMessageDialog(null, "Bien");
                      limpiar();
                      loadNextWord(contador+=1);
                   
                   
                     

                     
                      
                    
                }

            } else {

                CambiarImagen();
                intentos++;
                txtErradas.setText(txtErradas.getText() + car);

            }

        }


    }//GEN-LAST:event_txtAdivinarKeyTyped

    private void txtAdivinarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdivinarKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAdivinarKeyPressed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        try {
            // TODO add your handling code here:
            IniciarJuego();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JuegoAhorcado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSalirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSalirKeyTyped

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
            java.util.logging.Logger.getLogger(JuegoAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JuegoAhorcado().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JuegoAhorcado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenAh;
    private javax.swing.JToggleButton btnIniciar;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numeros;
    private javax.swing.JTextField txtAdivinar;
    private javax.swing.JTextArea txtDescrip;
    private javax.swing.JTextField txtErradas;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables

}
