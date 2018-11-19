package primerproyecto;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class AgregarUsuariosAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form AgregarUsuariosAdministrador
     */
    public AgregarUsuariosAdministrador() {
        initComponents();
    }

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    byte[] imagen;
    FileInputStream entrada;
    FileOutputStream salida;    
    boolean condicion;
   
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txt_correoAlterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_foto = new javax.swing.JButton();
        lblmostrar = new javax.swing.JLabel();
        btnCreatUsuario = new javax.swing.JButton();
        txt_año = new javax.swing.JTextField();
        txt_mes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_NombreUsuario2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Apellido = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNivelSeguridad = new javax.swing.JLabel();
        txt_dia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Ingrese correo alterno");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("@correo.com");
        jLabel10.setToolTipText("");

        btn_foto.setText("Escoja fotografia");
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });

        lblmostrar.setBorder(new javax.swing.border.MatteBorder(null));

        btnCreatUsuario.setText("Crear usuario");
        btnCreatUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatUsuarioActionPerformed(evt);
            }
        });

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

        jLabel9.setText("/");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("Registro de usuario administrador");

        jLabel11.setText("Ingrese telefono");

        jLabel12.setText("Día");

        jLabel2.setText("Ingrese nombre de usuario");

        jLabel13.setText("Mes");

        jLabel14.setText("Año");

        jLabel3.setText("Ingrese nombre");

        jLabel16.setText("Nivel de seguridad de contraseña");
        jLabel16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel16KeyTyped(evt);
            }
        });

        jLabel4.setText("Ingrese apellido");

        lblNivelSeguridad.setBackground(new java.awt.Color(255, 51, 51));
        lblNivelSeguridad.setText(".");

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

        jLabel6.setText("Ingrese fecha de nacimiento");

        txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaActionPerformed(evt);
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

        jLabel7.setText("Ingrese contraseña");
        jLabel7.setToolTipText("");

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreatUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(229, 229, 229))))
            .addGroup(layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel3)
                .addGap(238, 238, 238)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNivelSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_correoAlterno, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(171, 171, 171))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_NombreUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_telefono)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(156, 156, 156)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel12)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel13)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel14)
                                .addGap(259, 259, 259)))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jLabel2)
                    .addGap(0, 924, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NombreUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNivelSeguridad)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_correoAlterno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 92, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCreatUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jLabel2)
                    .addContainerGap(442, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnCreatUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatUsuarioActionPerformed
condicion=false;
boolean condicion2 = false;

// <editor-fold defaultstate="collapsed" desc="Validar contraseña ">  
        String contenidoPuntuacion = "";
           String contenidoResultado ="";
           String contraseña ="";
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
               JOptionPane.showMessageDialog(null, "No puede ingresar una contraseña menor a "+lineaP1+" caracteres.");
                   txt_contraseña.setText("");
                   condicion2 = true;
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
// </editor-fold>
  
if(condicion == false)
{   Metodos metodo = new Metodos(); 
    String nombreUsuario =txt_NombreUsuario2.getText();
    String nombre = txt_Nombre.getText();
    String apellido = txt_Apellido.getText();
    String contraseña2 = txt_contraseña.getText();    
    String password = metodo.getMD5(contraseña2);            
    Date date = null;
    int telefono = 0;
    String dia = txt_dia.getText();
    String mes =txt_mes.getText();
    String año = txt_año.getText(); 
    String ruta ="";
    try
    {
    if(archivo.exists())
    {
    ruta = archivo.toString();
    }
    }
    catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,"Debe de agregar una imagen");   
    }
    if(dia.length()>0 && mes.length()>0&& año.length()>0)
    {
    String Fecha = dia+"/"+mes+"/"+año;
    try
    {
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
       date = formatter.parse(Fecha);
    }
catch(Exception e){ e.printStackTrace();}
    
    }
    String correo = txt_correoAlterno.getText();
    String t = txt_telefono.getText();
    if(t.length() >0)
    {
    telefono = Integer.parseInt(t);
    }
      
    boolean condicion;
    String mensaje = "";
    
    if(nombreUsuario.length() >0 && nombre.length()>0&&apellido.length()>0&& contraseña2.length()>0&& dia.length()>0 &&t.length()>0&& mes.length()>0&&año.length()>0&&ruta.length()>0&&t.length()>0&&correo.length()>0)
    {        
       String path="";
       mensaje = metodo.CrearArchivoUsuario(nombreUsuario,nombre,apellido,password,date,correo,telefono,ruta);  
       
          if(mensaje.equals("Usuario ya existente escoja uno diferente"))
        {       
          JOptionPane.showMessageDialog(null,"Usuario ya existente escoja uno diferente");
          txt_NombreUsuario2.setText("");
        }
          else if(mensaje.equals("Nombre invalido, Debe contener solo letras"))
        {
            JOptionPane.showMessageDialog(null,mensaje);
            txt_Nombre.setText("");
        }
           else if(mensaje.equals("Apellido invalido, Debe contener solo letras"))
        {
         JOptionPane.showMessageDialog(null,mensaje);
         txt_Apellido.setText("");
        } 
           else if(mensaje.equals("Debe de agregar una imagen"))
           {
               JOptionPane.showMessageDialog(null,mensaje);
           }
          else
        {
            JOptionPane.showMessageDialog(null,"Usuario creado exitosamente");
            txt_NombreUsuario2.setText("");
            txt_Nombre.setText("");
            txt_Apellido.setText("");
            txt_contraseña.setText("");            
            txt_dia.setText("");
            txt_mes.setText("");
            txt_año.setText("");
            txt_correoAlterno.setText("");
            txt_telefono.setText("");
            if(ruta.length()>0)
            {   
                Metodos m= new Metodos();
               m.CopiarImagen(ruta);
            }
        }        
    }
    else
    {
     JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos");
    }
}
        
    }//GEN-LAST:event_btnCreatUsuarioActionPerformed

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

    private void jLabel16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel16KeyTyped

    }//GEN-LAST:event_jLabel16KeyTyped

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
            lblNivelSeguridad.setText("Contraseña Insegura");
        }
        if(puntuacion>=lineaR3 && puntuacion<=lineaR4){
            lblNivelSeguridad.setText("Contraseña Poco Segura");
        }
        if(puntuacion>=lineaR5 && puntuacion<=lineaR6){
            lblNivelSeguridad.setText("Contraseña Segura");
        }
        if(puntuacion>=lineaR7 && puntuacion<=lineaR8){
            lblNivelSeguridad.setText("Contraseña muy Segura");
        }
        if(puntuacion>lineaR8){
            lblNivelSeguridad.setText("Contraseña muy Segura");
        }
        if(puntuacion==0){
            lblNivelSeguridad.setText("");
        }
    }//GEN-LAST:event_txt_contraseñaKeyReleased

    private void txt_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyTyped

    }//GEN-LAST:event_txt_contraseñaKeyTyped

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuAdministrador admin=new MenuAdministrador();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarUsuariosAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuariosAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuariosAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuariosAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuariosAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatUsuario;
    private javax.swing.JButton btn_foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNivelSeguridad;
    private javax.swing.JLabel lblmostrar;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NombreUsuario2;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_correoAlterno;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_mes;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
