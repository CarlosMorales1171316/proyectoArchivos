package primerproyecto;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class MantenimientoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MantenimientoUsuario
     */
    public MantenimientoUsuario() {
        initComponents();
    }

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    byte[] imagen;
    FileInputStream entrada;
    FileOutputStream salida;    
    boolean condicion;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chb_Vigente = new javax.swing.JCheckBox();
        chb_NoVigente = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_dia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_correoAlterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_foto = new javax.swing.JButton();
        lblmostrar = new javax.swing.JLabel();
        txt_año = new javax.swing.JTextField();
        txt_mes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_ModificarDatos = new javax.swing.JButton();
        lblNivelSeguridad2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chb_Vigente.setText("Vigente");

        chb_NoVigente.setText("No vigente");

        jLabel16.setText("Nivel de seguridad de contraseña");
        jLabel16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel16KeyTyped(evt);
            }
        });

        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyTyped(evt);
            }
        });

        jLabel7.setText("Cambiar contraseña");
        jLabel7.setToolTipText("");

        jLabel9.setText("/");

        jLabel11.setText("Cambiar telefono");

        jLabel12.setText("Día");

        jLabel13.setText("Mes");

        jLabel14.setText("Año");

        txt_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diaActionPerformed(evt);
            }
        });
        txt_dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_diaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_diaKeyTyped(evt);
            }
        });

        jLabel6.setText("Cambiar fecha de nacimiento");

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        jLabel8.setText("Cambiar correo alterno");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("@correo.com");
        jLabel10.setToolTipText("");

        btn_foto.setText("Cambiar Fotografia");
        btn_foto.setToolTipText("");
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });

        lblmostrar.setBorder(new javax.swing.border.MatteBorder(null));

        txt_año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_añoKeyTyped(evt);
            }
        });

        txt_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mesKeyTyped(evt);
            }
        });

        jLabel5.setText("/");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Modificar Usuario");

        jButton1.setText("Regresar Perfil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_ModificarDatos.setText("Realizar cambios");
        btn_ModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarDatosActionPerformed(evt);
            }
        });

        lblNivelSeguridad2.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel13)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(lblNivelSeguridad2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 98, Short.MAX_VALUE)
                                .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel8))
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_correoAlterno, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chb_Vigente)
                        .addGap(40, 40, 40)
                        .addComponent(chb_NoVigente)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(lblNivelSeguridad2)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_correoAlterno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chb_Vigente)
                            .addComponent(chb_NoVigente))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel16KeyTyped

    }//GEN-LAST:event_jLabel16KeyTyped
  public byte[] AbrirArchivo(File archivo)
   {
       byte[] imagen = new byte[1024*100];
       try
       {
           entrada = new FileInputStream(archivo);
           entrada.read(imagen);
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return imagen;
   }
    
   public String GuardarArchivo(File archivo,byte[] Imagen)
   {
              String mensaje =null;
              try
              {
                  salida = new FileOutputStream(archivo);
                  salida.write(Imagen);
                  mensaje = "Archivo guardado";
              }
              catch(Exception e)
              {
                  e.printStackTrace();
              }
              return mensaje;
   }        
    
   
    private void txt_contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyReleased
        String contenidoPuntuacion = "";
        String contenidoResultado ="";
        String contraseña ="";
        String contraseñaCifrada="";
        int puntuacion =0;
        boolean condicion2 = true;
        Metodos metodos =new Metodos();
        contraseña = txt_contraseña.getText();
        int numMayusculas = metodos.Mayusculas(contraseña);
        int numLetras = metodos.Letras(contraseña);
        int numNumeros = metodos.Numeros(contraseña);
        int numSignos = metodos.Signos(contraseña);
        int numSignosTotales = numSignos - numNumeros;

        contenidoPuntuacion = metodos.leerArchivo("C:/MEIA/contraseña/puntuacion.txt");
        contenidoResultado = metodos.leerArchivo("C:/MEIA/contraseña/resultado.txt");

        String[] contenidoPuntuacionSplit = contenidoPuntuacion.split("\n");
        String splitP1 = contenidoPuntuacionSplit[0];
        String splitP2 = contenidoPuntuacionSplit[1];
        String splitP3 = contenidoPuntuacionSplit[2];
        String splitP4 = contenidoPuntuacionSplit[3];
        String splitP5 = contenidoPuntuacionSplit[4];
        String splitP6 = contenidoPuntuacionSplit[5];
        String splitP7 = contenidoPuntuacionSplit[6];
        String splitP8 = contenidoPuntuacionSplit[7];

        int lineaP1 = Integer.parseInt(splitP1);
        int lineaP2 = Integer.parseInt(splitP2);
        int lineaP3 = Integer.parseInt(splitP3);
        int lineaP4 = Integer.parseInt(splitP4);
        int lineaP5 = Integer.parseInt(splitP5);
        int lineaP6 = Integer.parseInt(splitP6);
        int lineaP7 = Integer.parseInt(splitP7);
        int lineaP8 = Integer.parseInt(splitP8);

        puntuacion = (lineaP2*contraseña.length());
        puntuacion = puntuacion + (lineaP3*numMayusculas);
        puntuacion = puntuacion + (lineaP4*numLetras);
        puntuacion = puntuacion + (lineaP5*numNumeros);
        puntuacion = puntuacion +(numSignosTotales)*((contraseña.length())+(lineaP6));

        String[] contenidoResultadoSplit = contenidoResultado.split(",");
        String splitR1 = contenidoResultadoSplit[0];
        String splitR2 = contenidoResultadoSplit[1];
        String splitR3 = contenidoResultadoSplit[2];
        String splitR4 = contenidoResultadoSplit[3];
        String splitR5 = contenidoResultadoSplit[4];

        String[] contenidoSplitR1 = splitR1.split("\n");
        String contenidoSplitR1Num1 = contenidoSplitR1[0];
        String[] contenidoSplitR2 = splitR2.split("\n");
        String contenidoSplitR2Num1 = contenidoSplitR2[0];
        String contenidoSplitR2Num2 = contenidoSplitR2[1];
        String[] contenidoSplitR3 = splitR3.split("\n");
        String contenidoSplitR3Num1 = contenidoSplitR3[0];
        String contenidoSplitR3Num2 = contenidoSplitR3[1];
        String[] contenidoSplitR4 = splitR4.split("\n");
        String contenidoSplitR4Num1 = contenidoSplitR4[0];
        String contenidoSplitR4Num2 = contenidoSplitR4[1];
        String[] contenidoSplitR5 = splitR5.split("\n");
        String contenidoSplitR5Num1 = contenidoSplitR5[0];

        int lineaR1 = Integer.parseInt(contenidoSplitR1Num1);
        int lineaR2 = Integer.parseInt(contenidoSplitR2Num1);
        int lineaR3 = Integer.parseInt(contenidoSplitR2Num2);
        int lineaR4 = Integer.parseInt(contenidoSplitR3Num1);
        int lineaR5 = Integer.parseInt(contenidoSplitR3Num2);
        int lineaR6 = Integer.parseInt(contenidoSplitR4Num1);
        int lineaR7 = Integer.parseInt(contenidoSplitR4Num2);
        int lineaR8 = Integer.parseInt(contenidoSplitR5Num1);
        if(puntuacion>=lineaR1 && puntuacion<=lineaR2){
            lblNivelSeguridad2.setText("Contraseña Insegura");
        }
        if(puntuacion>=lineaR3 && puntuacion<=lineaR4){
            lblNivelSeguridad2.setText("Contraseña Poco Segura");
        }
        if(puntuacion>=lineaR5 && puntuacion<=lineaR6){
            lblNivelSeguridad2.setText("Contraseña Segura");
        }
        if(puntuacion>=lineaR7 && puntuacion<=lineaR8){
            lblNivelSeguridad2.setText("Contraseña muy Segura");
        }
        if(puntuacion>lineaR8){
            lblNivelSeguridad2.setText("Contraseña muy Segura");
        }
        if(puntuacion==0){
            lblNivelSeguridad2.setText("");
        }
    }//GEN-LAST:event_txt_contraseñaKeyReleased

    private void txt_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyTyped

    }//GEN-LAST:event_txt_contraseñaKeyTyped

    private void txt_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diaActionPerformed

    }//GEN-LAST:event_txt_diaActionPerformed

    private void txt_diaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diaKeyPressed

    }//GEN-LAST:event_txt_diaKeyPressed

    private void txt_diaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diaKeyTyped
        int n = 2;
        char validar =evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            evt.consume();
        }
        String dia = txt_dia.getText();
        if(dia.length()>=n)
        {
            evt.consume();
        }

    }//GEN-LAST:event_txt_diaKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        int n = 8;
        char validar =evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            evt.consume();
        }
        String dia = txt_telefono.getText();
        if(dia.length()>=n)
        {
            evt.consume();
        }

    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void btn_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fotoActionPerformed
        if(seleccionar.showDialog(null,null)==JFileChooser.APPROVE_OPTION)
        {
            archivo = seleccionar.getSelectedFile();
            if(archivo.canRead())
            {
                if(archivo.getName().endsWith("jpg")||archivo.getName().endsWith("png"))
                {
                                                       
                    imagen= AbrirArchivo(archivo);                                               
                    ImageIcon image =new ImageIcon(imagen);
                    Icon icono =new ImageIcon(image.getImage().getScaledInstance(lblmostrar.getWidth(),lblmostrar.getHeight(), Image.SCALE_DEFAULT));
                    lblmostrar.setIcon(icono);
                    this.repaint();                                             
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_btn_fotoActionPerformed

    private void txt_añoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_añoKeyTyped
        int n = 4;
        char validar =evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            evt.consume();
        }
        String dia = txt_año.getText();
        if(dia.length()>=n)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_añoKeyTyped

    private void txt_mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mesKeyTyped
        int n = 2;
        String dia = txt_mes.getText();

        char validar =evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            evt.consume();
        }

        if(dia.length()>=n)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_mesKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Metodos m=new Metodos();
          boolean b =m.ValidarRol();
    if(b == true)
    {
        MenuAdministrador Administrador = new MenuAdministrador();
        Administrador.setVisible(true);
        this.setVisible(false);
    }
    if(b == false) 
    {          
        MostrarPerfil mostrar = new MostrarPerfil();
        mostrar.setVisible(true);
        this.setVisible(false);
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_ModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarDatosActionPerformed
    
        // <editor-fold defaultstate="collapsed" desc="Validar contraseña "> 
        boolean condicion=false;
        boolean condicion2=false;
        String contenidoPuntuacion = "";
           String contenidoResultado ="";
           String contraseña ="";
           String contraseñaCifrada="";
           int puntuacion =0;
           Metodos metodos =new Metodos();
           contraseña = txt_contraseña.getText();
           int numMayusculas = metodos.Mayusculas(contraseña);
           int numLetras = metodos.Letras(contraseña);
           int numNumeros = metodos.Numeros(contraseña);
           int numSignos = metodos.Signos(contraseña);
           int numSignosTotales = numSignos - numNumeros;
           
           contenidoPuntuacion = metodos.leerArchivo("C:/MEIA/contraseña/puntuacion.txt");
           contenidoResultado = metodos.leerArchivo("C:/MEIA/contraseña/resultado.txt");
           
           String[] contenidoPuntuacionSplit = contenidoPuntuacion.split("\n");
           String splitP1 = contenidoPuntuacionSplit[0];
           String splitP2 = contenidoPuntuacionSplit[1]; 
           String splitP3 = contenidoPuntuacionSplit[2]; 
           String splitP4 = contenidoPuntuacionSplit[3]; 
           String splitP5 = contenidoPuntuacionSplit[4]; 
           String splitP6 = contenidoPuntuacionSplit[5]; 
           String splitP7 = contenidoPuntuacionSplit[6];
           String splitP8 = contenidoPuntuacionSplit[7];
           
           int lineaP1 = Integer.parseInt(splitP1);
           int lineaP2 = Integer.parseInt(splitP2);
           int lineaP3 = Integer.parseInt(splitP3);
           int lineaP4 = Integer.parseInt(splitP4);
           int lineaP5 = Integer.parseInt(splitP5);
           int lineaP6 = Integer.parseInt(splitP6);
           int lineaP7 = Integer.parseInt(splitP7);
           int lineaP8 = Integer.parseInt(splitP8);
       
               if( lineaP1 >= contraseña.length()){  
                   if(contraseña.length()>0)
                   {
               JOptionPane.showMessageDialog(null, "No puede ingresar una contraseña menor a "+lineaP1+" caracteres.");
                   txt_contraseña.setText("");
                   condicion2 = true;
                   }
               }

 else {
              puntuacion = (lineaP2*contraseña.length());
              puntuacion = puntuacion + (lineaP3*numMayusculas);
              puntuacion = puntuacion + (lineaP4*numLetras);
              puntuacion = puntuacion + (lineaP5*numNumeros);
              puntuacion = puntuacion +(numSignosTotales)*((contraseña.length())+(lineaP6));                          
           }
                 String[] contenidoResultadoSplit = contenidoResultado.split(",");
           String splitR1 = contenidoResultadoSplit[0];
           String splitR2 = contenidoResultadoSplit[1];
           String splitR3 = contenidoResultadoSplit[2];
           String splitR4 = contenidoResultadoSplit[3];
           String splitR5 = contenidoResultadoSplit[4];    
          
           String[] contenidoSplitR1 = splitR1.split("\n");
           String contenidoSplitR1Num1 = contenidoSplitR1[0];
           String[] contenidoSplitR2 = splitR2.split("\n");
           String contenidoSplitR2Num1 = contenidoSplitR2[0];
           String contenidoSplitR2Num2 = contenidoSplitR2[1];
           String[] contenidoSplitR3 = splitR3.split("\n");
           String contenidoSplitR3Num1 = contenidoSplitR3[0];
           String contenidoSplitR3Num2 = contenidoSplitR3[1];
           String[] contenidoSplitR4 = splitR4.split("\n");
           String contenidoSplitR4Num1 = contenidoSplitR4[0];
           String contenidoSplitR4Num2 = contenidoSplitR4[1];
           String[] contenidoSplitR5 = splitR5.split("\n");
           String contenidoSplitR5Num1 = contenidoSplitR5[0];
           
           int lineaR1 = Integer.parseInt(contenidoSplitR1Num1);
           int lineaR2 = Integer.parseInt(contenidoSplitR2Num1);
           int lineaR3 = Integer.parseInt(contenidoSplitR2Num2);
           int lineaR4 = Integer.parseInt(contenidoSplitR3Num1);
           int lineaR5 = Integer.parseInt(contenidoSplitR3Num2);
           int lineaR6 = Integer.parseInt(contenidoSplitR4Num1);
           int lineaR7 = Integer.parseInt(contenidoSplitR4Num2);
           int lineaR8 = Integer.parseInt(contenidoSplitR5Num1);
           if(contraseña.length()>0)
           {
            if(puntuacion>=lineaR1 && puntuacion<=lineaR2&&condicion2== false){
               JOptionPane.showMessageDialog(null,"Contraseña Insegura,Ingrese una nuevamente");
               condicion= true;
                   txt_contraseña.setText("");
           }
           if(puntuacion>=lineaR3 && puntuacion<=lineaR4&&condicion2 == false){
               JOptionPane.showMessageDialog(null,"Contraseña Poco Segura, Ingrese una nuevamente");
               condicion= true;
                   txt_contraseña.setText("");
           }
           if(puntuacion>=lineaR5 && puntuacion<=lineaR6){           
               condicion = false;
           }
           if(puntuacion>=lineaR7 && puntuacion<=lineaR8){           
               condicion = false;
           }
           if(puntuacion>lineaR8)
           {
             condicion = false;
           }
           if(puntuacion==0){               
               condicion= true;  
                   txt_contraseña.setText("");
           }
           }
// </editor-fold>

    Metodos m = new Metodos();
    Metodos metodo = new Metodos();     
    String contraseña2 = txt_contraseña.getText();    
    String password = metodo.getMD5(contraseña2);            
    Date date = null;
    String telefono = txt_telefono.getText();          
    String ruta3 = "C:/MEIA/UsuarioActual.txt";   
    ArrayList<String> Usuarios3 = new ArrayList<>();
    Usuarios3= m.listadoNombresUsuario(new File(ruta3));
    String usuario = Usuarios3.get(0);               
    String dia = txt_dia.getText();
    String mes =txt_mes.getText();
    String año = txt_año.getText(); 
    String correo = txt_correoAlterno.getText();
    String Fecha ="";
    String ruta ="";
    String Vigencia ="";
    if(chb_Vigente.isSelected())
    {
       Vigencia = "1";
    }
     if(chb_NoVigente.isSelected())
    {
       Vigencia = "0";
    }
    try
    {
    if(archivo.exists())
    {
    ruta = archivo.toString();
    }
    }
    catch(Exception e)
    {
     
    }
    if(dia.length()>0 && mes.length()>0&& año.length()>0)        
    {
    Fecha = dia+"/"+mes+"/"+año;         
    }//GEN-LAST:event_btn_ModificarDatosActionPerformed
            
    boolean b =m.ValidarRol2(usuario);
    if(b==false)
    {
    if(contraseña.length()>0)
    {
        try {
            metodos.ModificarMetaDatos(usuario,password, correo, Fecha,ruta,telefono,Vigencia);
            if(ruta.length()>0)
            {              
               m.CopiarImagen(ruta);
            }
        } catch (ParseException ex) {
            Logger.getLogger(MantenimientoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(contraseña.length()==0)
    {
         try {
            metodos.ModificarMetaDatos(usuario,contraseña2, correo, Fecha,ruta,telefono,Vigencia);
            if(ruta.length()>0)
            {              
               m.CopiarImagen(ruta);
            }
        } catch (ParseException ex) {
            Logger.getLogger(MantenimientoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    chb_Vigente.setSelected(false);
    chb_NoVigente.setSelected(false);
    txt_contraseña.setText("");
     txt_dia.getText();
    txt_mes.setText("");
    txt_año.setText(""); 
    txt_correoAlterno.setText("");
    
     JOptionPane.showMessageDialog(null, "Informacion actualizada");
    }
    if(b==true&&Vigencia.equals("1")||b==true && Vigencia.length()==0)
    {
           if(contraseña.length()>0)
    {
        try {
            metodos.ModificarMetaDatos(usuario,password, correo, Fecha,ruta,telefono,Vigencia);
            if(ruta.length()>0)
            {              
               m.CopiarImagen(ruta);
            }
        } catch (ParseException ex) {
            Logger.getLogger(MantenimientoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(contraseña.length()==0)
    {
         try {
            metodos.ModificarMetaDatos(usuario,contraseña2, correo, Fecha,ruta,telefono,Vigencia);
            if(ruta.length()>0)
            {              
               m.CopiarImagen(ruta);
            }
        } catch (ParseException ex) {
            Logger.getLogger(MantenimientoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    chb_Vigente.setSelected(false);
    chb_NoVigente.setSelected(false);
    txt_contraseña.setText("");
     txt_dia.getText();
    txt_mes.setText("");
    txt_año.setText(""); 
    txt_correoAlterno.setText("");
    
     JOptionPane.showMessageDialog(null, "Informacion actualizada");
    }
    if(b==true&&Vigencia.equals("0"))
    {
        JOptionPane.showMessageDialog(null, "Administrador no puede dejar de ser vigente");
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
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ModificarDatos;
    private javax.swing.JButton btn_foto;
    private javax.swing.JCheckBox chb_NoVigente;
    private javax.swing.JCheckBox chb_Vigente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNivelSeguridad2;
    private javax.swing.JLabel lblmostrar;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_correoAlterno;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_mes;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
