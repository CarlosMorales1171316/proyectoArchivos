/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ivana
 */
public class ListasUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form ListasUsuarios
     */
    public ListasUsuarios() {
        initComponents();
        MostrarListas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        ListaAmigos = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_UsuarioModificar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsuariosDisponibles = new javax.swing.JList<>();
        txt_UsuarioNuevo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();
        txt_Descripcion = new javax.swing.JTextField();
        txt_Eliminar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCrearLista = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_lista = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        btnCrearLista1 = new javax.swing.JButton();
        txt_Agregar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_EliminarUsuarioLista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_UsuarioLista = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListasUsuario = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane3.setViewportView(ListaAmigos);

        jLabel8.setText("Mis Amigos ");

        jLabel9.setText("Modificar Amigos");

        jLabel10.setText("Ingrese nombre de usuario que desea modificar");

        jScrollPane1.setViewportView(UsuariosDisponibles);

        jLabel11.setText("Ingrese nuevo usuario");

        jLabel1.setText("Usuarios Disponibles para agregar como amigos");

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese descripcion para lista");

        btnCrearLista.setText("Crear lista");
        btnCrearLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearListaActionPerformed(evt);
            }
        });

        jLabel12.setText("Ingrese nombre de amigo que desea eliminar");

        jLabel13.setText("Eliminar Amigos");

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Agregar amigos a mi lista");

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        btnCrearLista1.setText("Agregar amigo");
        btnCrearLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearLista1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingresar nombre de lista para agregar amigos");

        jLabel14.setText("Ingrese nombre de lista para crear");

        jLabel15.setText("Ingrese nombre de lista de amigo a borrar");

        jLabel5.setText("Paso #1: Crear Lista");

        jLabel6.setText("Paso #2: Agregar Amigos a listas");

        jScrollPane2.setViewportView(ListasUsuario);

        jLabel16.setText("Ingrese lista de amigo a modificar");

        jLabel7.setText(" Listas creadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnCrearLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Descripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Agregar, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCrearLista1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_lista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_UsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(82, 82, 82))
                                .addComponent(Eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_EliminarUsuarioLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_UsuarioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_UsuarioLista, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel16))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel3)
                                        .addGap(11, 11, 11)
                                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCrearLista1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCrearLista, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_UsuarioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_UsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_UsuarioLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addGap(8, 8, 8)
                                        .addComponent(txt_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addGap(4, 4, 4)
                                        .addComponent(txt_EliminarUsuarioLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try
        {
            SegundoProyectoInsercion s = new SegundoProyectoInsercion();
            String lista =txt_UsuarioLista.getText().toString();
            String modificar=txt_UsuarioNuevo.getText().toString();
            String usuariomodificar =txt_UsuarioModificar.getText().toString();
            if(lista.length()>0&&usuariomodificar.length()>0&&modificar.length()>0)
            {
                String index =s.Index(lista, usuariomodificar);
                int i = Integer.parseInt(index) +1;
                boolean condicion = s.ValidarUsuario(modificar);
                boolean condicion2 = s.ValidarAgregarUsuario(lista);
                boolean condicion3 = s.ValidarModificacion(lista, modificar, Integer.toString(i));
                if(condicion == true&&condicion2==true)
                {
                    s.ModificarUsuario(modificar, lista, Integer.toString(i));
                    MostrarListas();
                    txt_UsuarioModificar.setText("");
                    txt_UsuarioLista.setText("");
                    txt_UsuarioNuevo.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Modificacion no valida");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos para poder eliminar un amigo");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Usuario no existente pruebe de nuevo");
            txt_UsuarioModificar.setText("");
            txt_UsuarioLista.setText("");
            txt_UsuarioNuevo.setText("");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void btnCrearListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearListaActionPerformed
        SegundoProyectoInsercion s = new SegundoProyectoInsercion();
        String Descripcion = txt_Descripcion.getText().toString();
        String NombreLista = txt_Agregar.getText().toString();
        if(NombreLista.length()>0 &&Descripcion.length()>0)
        {
            boolean condicion0 =s.ValidarAgregarUsuario(NombreLista);
            if(condicion0 == false)
            {
                s.BitacoraLista(NombreLista,Descripcion);
                MostrarListas();
                txt_Descripcion.setText("");
                txt_Agregar.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Lista ya existente, pruebe con una diferente");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos para poder crear una lista de amigos");
        }
    }//GEN-LAST:event_btnCrearListaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        SegundoProyectoEliminacion SPE = new SegundoProyectoEliminacion();
        String lista = txt_EliminarUsuarioLista.getText().toString();
        String borrar =txt_Eliminar.getText().toString();
        if(lista.length()>0&&borrar.length()>0)
        {
            boolean condicion = SPE.Busqueda(lista, borrar);
            if(condicion == true)
            {
                SPE.IndiceListaUsuario(lista,borrar);
                MostrarListas();
                txt_EliminarUsuarioLista.setText("");
                txt_Eliminar.setText("");

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuario no existente");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos para poder modificar un amigo");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
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
    }//GEN-LAST:event_RegresarActionPerformed

    private void btnCrearLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearLista1ActionPerformed
        SegundoProyectoInsercion s = new SegundoProyectoInsercion();
        String agregar = txt_Nombre.getText().toString();
        String nombreLista =txt_lista.getText().toString();
        if(agregar.length()>0&&nombreLista.length()>0)
        {
            boolean condicion = s.ValidarUsuario(agregar);
            boolean condicion2 =s.ValidarAgregarUsuario(nombreLista);
            boolean condicion3 =s.Busqueda(nombreLista,agregar);
            boolean condicion5 = s.ValidarIngresoUsuario(agregar);
            if(condicion==true &&condicion2==true&&condicion3 == false&&condicion5==false)
            {
                s.IndiceListaUsuario(agregar, nombreLista, "agregar a "+agregar);
                MostrarListas();
                txt_Nombre.setText("");
                txt_lista.setText("");
            }else

            {
                JOptionPane.showMessageDialog(null, "Error usuario no agregado");
            }                 
            if(condicion5 == true)
            {
                   JOptionPane.showMessageDialog(null, "No puedes agregarte a tu listas de amigos");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos para poder agregar amigos");
        }

    }//GEN-LAST:event_btnCrearLista1ActionPerformed
 private void MostrarListas()
    {
           // <editor-fold defaultstate="collapsed" desc=" Region Name ">
          DefaultListModel list = new DefaultListModel();
          DefaultListModel list2 = new DefaultListModel();
          DefaultListModel list3 = new DefaultListModel();
        
          String path = "C:/MEIA/bitacora_usuario.txt";  
          String path2 = "C:/MEIA/usuario.txt";         
          Metodos m =new Metodos();
          
          if(new File(path).exists()&&new File(path2).exists())
          {
    ArrayList<String> Lista2 = new ArrayList<String>();                         
          Lista2 =m.listadoNombresUsuario(new File(path2));
          
           ArrayList<String> Lista = new ArrayList<String>();                         
          Lista =m.listadoNombresUsuario(new File(path));
                            
          for(String s: Lista2)
              
          {
              Lista.add(s);
          }
               Collections.sort(Lista);
           for(String s: Lista)
              
          {
              String[] tempo = s.split("\\|");
              list.addElement(tempo[0]);              
            //System.out.println(s);
          }
                        
      UsuariosDisponibles.setModel(list);        
          }
          if(new File(path).exists()&&!new File(path2).exists())
          { 
           ArrayList<String> Lista = new ArrayList<String>();                         
          Lista =m.listadoNombresUsuario(new File(path));
                                     
               Collections.sort(Lista);
           for(String s: Lista)   
          {
              String[] tempo = s.split("\\|");
              list.addElement(tempo[0]);              
          }
                        
      UsuariosDisponibles.setModel(list);    
          }  
                    // </editor-fold>
       SegundoProyectoEliminacion s = new SegundoProyectoEliminacion();
       ArrayList<String> Amigos = s.MostrarAmigos();
       ArrayList<String> Listas = s.MostrarListas();
        for (String d: Amigos) 
        {
            list2.addElement(d);
        }
        
        for (String d: Listas) 
        {
            list3.addElement(d);
        }
        
       ListaAmigos.setModel(list2);
       ListasUsuario.setModel(list3);
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
            java.util.logging.Logger.getLogger(ListasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListasUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JList<String> ListaAmigos;
    private javax.swing.JList<String> ListasUsuario;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Regresar;
    private javax.swing.JList<String> UsuariosDisponibles;
    private javax.swing.JButton btnCrearLista;
    private javax.swing.JButton btnCrearLista1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txt_Agregar;
    private javax.swing.JTextField txt_Descripcion;
    private javax.swing.JTextField txt_Eliminar;
    private javax.swing.JTextField txt_EliminarUsuarioLista;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_UsuarioLista;
    private javax.swing.JTextField txt_UsuarioModificar;
    private javax.swing.JTextField txt_UsuarioNuevo;
    private javax.swing.JTextField txt_lista;
    // End of variables declaration//GEN-END:variables
}
