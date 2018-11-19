package primerproyecto;

import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import primerproyecto.Conexion.BDD;

public class Inicio extends javax.swing.JFrame {    
    File archivo;
    byte[] imagen;
    FileInputStream entrada;
    FileOutputStream salida;    
    boolean condicion;
    public Inicio() throws IOException, ClassNotFoundException, SQLException {   
        File folder1 = new File("C:/MEIA"); 
        File folder3= new File("C:/MEIA/Fotografias");
        File folder2 = new File("C:/MEIA/contraseña");  
        String ruta ="C:\\MEIA\\Listas Usuarios";
        String ruta8 ="C:\\MEIA\\Mensajeria";
        File folder4 = new File(ruta);
        File folder5 = new File(ruta8);
        if(!folder1.exists()){
        folder1.mkdir();
        }
        if(!folder2.exists()){
        folder2.mkdir();
        }
        if(!folder3.exists()){
        folder3.mkdir();
        }
         if(!folder4.exists()){
        folder4.mkdir();
        
        }
          if(!folder5.exists()){        
        folder5.mkdir();
        }
        initComponents();
        
        
        
        String ruta1 = ("C:/MEIA/contraseña/puntuacion.txt");
        String ruta2 = ("C:/MEIA/contraseña/resultado.txt");
        BufferedWriter output1 = null;
        try {
            File file1 = new File(ruta1);
            output1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1,true),"UTF8"));
            output1.write("6"+System.getProperty("line.separator"));
            output1.write("3"+System.getProperty("line.separator"));
            output1.write("2"+System.getProperty("line.separator"));
            output1.write("1"+System.getProperty("line.separator"));
            output1.write("2"+System.getProperty("line.separator"));
            output1.write("4"+System.getProperty("line.separator"));
            output1.write("6"+System.getProperty("line.separator"));
            output1.write("3"+System.getProperty("line.separator"));
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( output1 != null ) {
          output1.close();
          }
        }
          BufferedWriter output2 = null;
        try {
            File file2 = new File(ruta2);
            output2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2,true),"UTF8"));
            output2.write("0,25"+System.getProperty("line.separator"));
            output2.write("26,35"+System.getProperty("line.separator"));
            output2.write("36,50"+System.getProperty("line.separator"));
            output2.write("51,100"+System.getProperty("line.separator"));
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( output2 != null ) {
          output2.close();
          }
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_IniciarSesion = new javax.swing.JButton();
        btn_CrearUsuario = new javax.swing.JButton();
        txt_Usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_Contraseña = new javax.swing.JPasswordField();
        show = new javax.swing.JCheckBox();
        logo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ventana1");

        btn_IniciarSesion.setText("Iniciar Sesion");
        btn_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarSesionActionPerformed(evt);
            }
        });

        btn_CrearUsuario.setText("Registrarse");
        btn_CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel1.setText("Ingrese nombre de usuario");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("Ingrese contraseña");

        btn_Salir.setText("Salir");
        btn_Salir.setActionCommand("");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Correo electronico");

        show.setText("Mostrar contraseña");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/primerproyecto/LOGO_MEIA.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/primerproyecto/iconocorreo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_CrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Contraseña)
                            .addComponent(txt_Usuario))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(25, 25, 25)))
                        .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_CrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
          
    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
     Metodos m = new Metodos();
     m.RegistroFinal();
     m.BitacoraSistema();
     m.BitacoraUsuario();
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearUsuarioActionPerformed
      CrearUsuario c = new CrearUsuario();
      c.setVisible(true);
      this.setVisible(false);
      
    }//GEN-LAST:event_btn_CrearUsuarioActionPerformed

    private void btn_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarSesionActionPerformed
        Metodos m = new Metodos();        
        String usuario = txt_Usuario.getText();
        char[] contraseña = txt_Contraseña.getPassword();
          String contraseña2 ="";
        m.CrearUsuarioActual(usuario);
          for(char l:contraseña)
          {
              contraseña2 += String.valueOf(l);
          }
          String ContraseñaCifrada = m.getMD5(contraseña2);
        ArrayList<String> Usuario = new ArrayList<String>();
     
        boolean condicion= m.ValidarLogIn(usuario,ContraseñaCifrada);  

        if(condicion ==true)
        {
        boolean b =m.ValidarRol();
    if(b == true)
    {       m.CrearUsuarioActual(usuario);
        MenuAdministrador Administrador = new MenuAdministrador();
        Administrador.setVisible(true);
        this.setVisible(false);
    }
    if(b == false) 
    {           m.CrearUsuarioActual(usuario);
        MostrarPerfil mostrar = new MostrarPerfil();
        mostrar.setVisible(true);
        this.setVisible(false);
    }
        }
        else
        {
            txt_Usuario.setText("");
            txt_Contraseña.setText("");
            JOptionPane.showMessageDialog(null,"Usuario incorrecto, Intente de nuevo!!");
        }
       
      
    }//GEN-LAST:event_btn_IniciarSesionActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if(show.isSelected())
        {
            txt_Contraseña.setEchoChar((char)0);
        }
       else
        {
            txt_Contraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Inicio().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CrearUsuario;
    private javax.swing.JButton btn_IniciarSesion;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    private javax.swing.JCheckBox show;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
