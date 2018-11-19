package primerproyecto;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;


public class Metodos {
    
    //metodo para leerArchivo
     public  String leerArchivo(String archivo){
         
        String textoArchivo = "";  
    try
    {
        String cadenaArchivo;
        String temp="";
        FileReader filereader = new FileReader(archivo);
        BufferedReader bufferedreader = new BufferedReader(filereader);
        while((cadenaArchivo = bufferedreader.readLine())!=null) {
            temp = temp + cadenaArchivo+"\n";
        }
        bufferedreader.close();
        textoArchivo = temp;
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Archivo no encontrado","Message", JOptionPane.ERROR_MESSAGE);
      } 
        return textoArchivo;
    }
     
      public static ArrayList<String> listadoNombresUsuario(File archivo){
         
        ArrayList<String> temp = new ArrayList<String>();
    try
    {
        String cadenaArchivo;
        FileReader filereader = new FileReader(archivo);
        BufferedReader bufferedreader = new BufferedReader(filereader);
        while((cadenaArchivo = bufferedreader.readLine())!=null) {
            temp.add(cadenaArchivo);
        }
        bufferedreader.close();
        
    }catch(Exception e){
        
      } 
        return temp;
    }
     
     //metodo que escribe el archivo usuario con las contraseñas cifradas
    
     public void CrearArchivo (String cadena){
     try {
            String ruta = "C:/MEIA/usuario.txt";
            String contenido = cadena;
            
            // Si el archivo no existe es creado
            if (!new File(ruta).exists()) {
                new File(ruta).createNewFile();
            }
            BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));
            out.write(contenido+System.getProperty("line.separator"));
            out.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en escritura de archivo","Message", JOptionPane.ERROR_MESSAGE);
        }
     }
     
     
     //metodo cifado MD5
     public String getMD5(String cadena) {
     try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(cadena.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cifrado","Message", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
     }
}
 
     
     //metodo contador mayusculas
    public static int Mayusculas (String cadena){
        int num = 0;
        for (int i = 0; i <cadena.length(); i++) {
            if (cadena.charAt(i)>=65 && cadena.charAt(i)<=90 ) {
                num++;  
            }
        }
        return num;
    }
    
    //metodo contador Letras
    public static int Letras (String cadena){
        int letrasTotales=0;
        int otrasLetras=0;
        int contadorLetras[] = new int[26];
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = Character.toLowerCase(cadena.charAt(i));
            if ('a' <= c && c <= 'z'){
               contadorLetras[c-'a']++;
               letrasTotales++;
            } 
            else
            {
             otrasLetras++;
            }
        } 
        return letrasTotales;
    }
    
    //metodo contador Numeros
    public static int Numeros (String cadena){
        int num = 0;
        for (int i = 0; i <cadena.length(); i++) {
            if (cadena.charAt(i)>=48 && cadena.charAt(i)<=57 ) {
                num++;  
            }
        }
        return num;
    }
    
     
//metodo contador signos
    public static int Signos (String cadena){
        int letrasTotales=0;
        int otrasLetras=0;
        int contadorLetras[] = new int[26];
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = Character.toLowerCase(cadena.charAt(i));
            if ('a' <= c && c <= 'z'){
               contadorLetras[c-'a']++;
               letrasTotales++;
            } 
            else
            {
             otrasLetras++;
            }
        } 
        return otrasLetras;
    }

    public String CrearArchivoUsuario(String usuarioNombre,String nombre,String apellido,String contraseña,Date fecha,String correo,int telefono,String rutaImagen)
    {
        String mensaje ="";
        String ruta ="C:/MEIA/bitacora_usuario.txt";
        boolean condicionNombre = false;
        boolean condicionApellido = false;
        boolean ValidarUsuario = ValidarNombreUsuario(usuarioNombre);
        boolean ValidarNumeroUsuarios = false;
        boolean ValidarRutaImagen =false;
        int letrasNombre = Letras(nombre);
        int letrasApellido = Letras(apellido);        
        ArrayList<String> Validar = new ArrayList<>();
        Validar = listadoNombresUsuario(new File(ruta));
        ArrayList<String> Lista1 = new ArrayList<String>();                         
        Lista1 =listadoNombresUsuario(new File(ruta));           
        
        // <editor-fold defaultstate="collapsed" desc="Validar">  
        if(nombre.length()==letrasNombre)
        {}
        else{
             mensaje=("Nombre invalido, Debe contener solo letras");
             condicionNombre= true;
            }            
            if(apellido.length()==letrasApellido)
            {}
            else
            {
                mensaje =("Apellido invalido, Debe contener solo letras");
                condicionApellido=true;
            }
            if(ValidarUsuario == true)
            {
                mensaje="Usuario ya existente escoja uno diferente";
            }
            if(Validar.size()==5)
            {
                ValidarNumeroUsuarios = true;
            }
            if(ruta.length()==0)
            {
                ValidarRutaImagen = true;
                 mensaje="Debe de agregar una imagen";
            }
            // </editor-fold>
            
          if(condicionNombre == false && condicionApellido == false && ValidarUsuario == false &&ValidarNumeroUsuarios==false && ValidarRutaImagen==false)
          {
              try
              {
                  if(new File(ruta).exists()&&Lista1.size()>0)
                  {
                      BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8")); 
                      String Usuario = usuarioNombre+"|"+nombre+ "|"+apellido+"|"+contraseña+"|"+"0"+"|"+fecha+"|"+correo+"@correo.com"+"|"+telefono+"|"+rutaImagen+"|"+"1";                                              
                      out.write(System.getProperty("line.separator")+Usuario);                      
                      out.close();
                      BitacoraSistema();
                  }
                  if(new File(ruta).exists()&&Lista1.size()==0)
                  {
                      BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8")); 
                      String Usuario = usuarioNombre+"|"+nombre+ "|"+apellido+"|"+contraseña+"|"+"0"+"|"+fecha+"|"+correo+"@correo.com"+"|"+telefono+"|"+rutaImagen+"|"+"1";                                              
                      out.write(Usuario);                      
                      out.close();
                      BitacoraSistema();
                  }
                  if(!new File(ruta).exists())
                  {
                       new File(ruta).createNewFile();   
                       BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));                                       
                       String Usuario = usuarioNombre+"|"+nombre+ "|"+apellido+"|"+contraseña+"|"+"1"+"|"+fecha+"|"+correo+"@correo.com"+"|"+telefono+"|"+rutaImagen+"|"+"1";  
                       out.write(Usuario);
                       out.close(); 
                       BitacoraSistema();                      
                  }   
              }
              catch(Exception e)
              {      
              }
          }
          
          if(ValidarNumeroUsuarios == true)
          {
              String Usuario = usuarioNombre+"|"+nombre+ "|"+apellido+"|"+contraseña+"|"+"0"+"|"+fecha+"|"+correo+"@correo.com"+"|"+telefono+"|"+rutaImagen+"|"+"1";  
               CrearArchivoUsuarios(Usuario);
               BitacoraSistema();
               BitacoraUsuario();
          }
      
        return mensaje;
    }
     public ArrayList<String> listadoDirectoriosCarpeta(final File carpeta) {
        ArrayList<String> lista = new ArrayList<String>();
        

        for (final File ficheroEntrada : carpeta.listFiles()) {
            if (ficheroEntrada.isDirectory()) {
                listadoDirectoriosCarpeta(ficheroEntrada);
            } else {
                lista.add(carpeta +"/"+ ficheroEntrada.getName());
            }
        }
        return lista;
    }          
                  
     public void CrearUsuarioActual(String usuario)
     {
         try
         {
            String ruta = "C:/MEIA/UsuarioActual.txt"; 
            File file = new File(ruta);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(usuario);
            bw.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
               
     }
               
      public String Leer()
    {
         String lista="" ;
         String ruta = "C:/MEIA/UsuarioActual.txt";  
         String ruta2 = ruta.toString();
          
                   if(new File(ruta2).exists())
                   {
                       try
                       {
                            FileReader fr = new FileReader(ruta);
                            BufferedReader br = new BufferedReader(fr); 
                            String linea;
                            while((linea = br.readLine()) != null)
                            lista +=(linea);
                             fr.close();
                       }
                       catch(Exception e)
                       {
                           e.printStackTrace();
                       }
                               
                   }
           return lista;
    }
                     
      public boolean ValidarNombreUsuario(String nombre)
      {
           boolean condicion = false;
           String path="";
           String path2="";
          ArrayList<String> Validar = new ArrayList<String>();
          ArrayList<String> Validar2 = new ArrayList<String>();
           ArrayList<String> Validar3 = new ArrayList<String>();
          Validar2 = listadoDirectoriosCarpeta(new File("C:/MEIA/"));
          
          if(Validar2.size()>0)
          {
              if(!new File("C:/MEIA/usuario.txt").exists()&& new File("C:/MEIA/bitacora_usuario.txt").exists())
              {
                  path = "C:/MEIA/bitacora_usuario.txt";                  
                  Validar =listadoNombresUsuario(new File(path));
                   for (int i = 0; i < Validar.size(); i++) 
                   {
                        String[] tempo = Validar.get(i).split("\\|");
                        if(Objects.equals(tempo[0],nombre ))
                        {
                            condicion=true;
                            break;
                        }
                   }
              }
              else if(new File("C:/MEIA/usuario.txt").exists()&& new File("C:/MEIA/bitacora_usuario.txt").exists())
              {
                   path = "C:/MEIA/bitacora_usuario.txt";             
                   path2 = "C:/MEIA/usuario.txt";      
                   Validar =listadoNombresUsuario(new File(path));
                   Validar3 =listadoNombresUsuario(new File(path2));
                   for(String s:Validar3)
                   {
                       Validar.add(s);
                   }
                    for (int i = 0; i < Validar.size(); i++) 
                   {
                        String[] tempo = Validar.get(i).split("\\|");
                        if(Objects.equals(tempo[0],nombre ))
                        {
                            condicion=true;
                            break;
                        }
                   }                   
              }
              else
              {
                 condicion= false; 
              }
          }
          else
          {
              condicion = false;
          }
          return condicion;
      }
      
       public boolean ValidarLogIn(String nombre,String Contraseña)
      {
           boolean condicion = false;
           String path="";
           String path2="";
          ArrayList<String> Validar = new ArrayList<String>();
          ArrayList<String> Validar2 = new ArrayList<String>();
           ArrayList<String> Validar3 = new ArrayList<String>();
          Validar2 = listadoDirectoriosCarpeta(new File("C:/MEIA/"));
          
          if(Validar2.size()>0)
          {
              if(!new File("C:/MEIA/usuario.txt").exists()&& new File("C:/MEIA/bitacora_usuario.txt").exists())
              {
                  path = "C:/MEIA/bitacora_usuario.txt";                  
                  Validar =listadoNombresUsuario(new File(path));
                   for (int i = 0; i < Validar.size(); i++) 
                   {
                        String[] tempo = Validar.get(i).split("\\|");
                        if(Objects.equals(tempo[0],nombre )&&Objects.equals(tempo[3],Contraseña))
                        {
                            condicion=true;
                            break;
                        }
                   }
              }
              else if(new File("C:/MEIA/usuario.txt").exists()&& new File("C:/MEIA/bitacora_usuario.txt").exists())
              {
                   path = "C:/MEIA/bitacora_usuario.txt";             
                   path2 = "C:/MEIA/usuario.txt";      
                   Validar =listadoNombresUsuario(new File(path));
                   Validar3 =listadoNombresUsuario(new File(path2));
                   for(String s:Validar3)
                   {
                       Validar.add(s);
                   }
                    for (int i = 0; i < Validar.size(); i++) 
                   {
                        String[] tempo = Validar.get(i).split("\\|");
                        if(Objects.equals(tempo[0],nombre )&&Objects.equals(tempo[3],Contraseña))
                        {
                            condicion=true;
                            break;
                        }
                   }                   
              }       
              else
              {
                 condicion= false; 
              }
          }
          else
          {
              condicion = false;
          }
          return condicion;
      }
       
       public void CrearArchivoUsuarios(String mensaje)
       {
           String ruta ="C:/MEIA/usuario.txt";
           String ruta2 ="C:/MEIA/bitacora_usuario.txt";
           
           if(new File(ruta).exists())
           {
               try
               {
              ArrayList<String> Usuarios = new ArrayList<>();
              Usuarios = listadoNombresUsuario(new File(ruta2));
              
              ArrayList<String> Usuarios2 = new ArrayList<>();
              Usuarios2 = listadoNombresUsuario(new File(ruta));
              
              for(String agregar:Usuarios)
              {
                  Usuarios2.add(agregar);
              }
              Collections.sort(Usuarios2);
              
                   FileWriter fw=new FileWriter(ruta2);
                   fw.write("");
                   fw.close();
                   
                   FileWriter fw2=new FileWriter(ruta);
                   fw2.write("");
                   fw2.close();
                   
                   BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8")); 
                   
                    for(String s: Usuarios2)
                   {
                         out.write(s+System.getProperty("line.separator"));
                   }
                   out.close();
               }
               catch(Exception e)
               {
                   e.printStackTrace();
               }
           }
           if(!new File(ruta).exists())
           {
               try
               {
                   ArrayList<String> Usuarios = new ArrayList<>();
                   Usuarios = listadoNombresUsuario(new File(ruta2));
                   new File(ruta).createNewFile();
                   
                   FileWriter fw=new FileWriter(ruta2);
                   fw.write("");
                   fw.close();
                                     
                   FileWriter fw2=new FileWriter(ruta2);
                   fw2.write(mensaje);
                   fw2.close();
                   
                   BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));                      
                   Collections.sort(Usuarios);                          
                   for (int i = 0; i < Usuarios.size(); i++) 
                   {
                       if(i+1!=Usuarios.size())
                       {
                         out.write(Usuarios.get(i)+System.getProperty("line.separator"));  
                       }
                       else
                       {
                        out.write(Usuarios.get(i)+System.getProperty("line.separator"));     
                       }
                   }
                   out.close();
               }
               catch(Exception e)
               {
                   e.printStackTrace();
               }
           }
       }
       
       public void BitacoraSistema()
       {
           String ruta ="C:/MEIA/desc_bitacora.txt";
           String ruta2 ="C:/MEIA/bitacora_usuario.txt";           
           ArrayList<String> Usuarios = new ArrayList<>();      
           ArrayList<String> Registros = new ArrayList<>();      
           int NoVigentes = 0;             
           Usuarios = listadoNombresUsuario(new File(ruta2));              
           DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   Date date = new Date();
	   String FechaCreacion = ""+dateFormat.format(date);
           
           for (int i = 0; i < Usuarios.size(); i++) 
             {
               String[] Split = Usuarios.get(i).split("\\|"); 
                if(Objects.equals(Split[Split.length-1], "0"))
                {
                    NoVigentes++;
                }                                
             }
           if(new File(ruta).exists())
           {
               try
               {
                FileWriter fw=new FileWriter(ruta);
                fw.write("");
                fw.close();
                BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));                               
                Registros.add("Nombre: Descripción bitácora");        
                Registros.add("Usuario: Administrador");
                Registros.add("Fecha de creacion: "+FechaCreacion);
                Registros.add("Numero de registros: "+Usuarios.size());
                Registros.add("Registros inactivos: "+ NoVigentes);
                Registros.add("Maximo de registros: [5]");
                for(String agregar: Registros)
                {
                    out.write(agregar+System.getProperty("line.separator"));
                }
                out.close();   
               }
               catch(Exception e)
               {
                   
               }
           }
           if(!new File(ruta).exists())
           {
               try
               {
                new File(ruta).createNewFile();               
                BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));                               
                out.write("Nombre: Descripción bitácora"+System.getProperty("line.separator"));
                out.write("Usuario: Administrador"+System.getProperty("line.separator"));
                out.write("Fecha de creacion: "+FechaCreacion+System.getProperty("line.separator"));
                out.write("Numero de registros: "+Usuarios.size()+System.getProperty("line.separator"));
                out.write("Registros inactivos: "+ NoVigentes+System.getProperty("line.separator"));
                out.write("Maximo de registros: [5]");
                out.close();
               }
               catch(Exception e)
               {          
               }
           }
       }
       
        public void BitacoraUsuario()
       {
           String ruta3 = "C:/MEIA/UsuarioActual.txt";        
           ArrayList<String> Usuarios3 = new ArrayList<>();
           Usuarios3= listadoNombresUsuario(new File(ruta3));
            String usuario ="";
           if(Usuarios3.size()>0)
           {
           usuario = Usuarios3.get(0);         
           }
           
           String ruta ="C:/MEIA/desc_usuario.txt";
           String ruta2 = "C:/MEIA/usuario.txt";        
           ArrayList<String> Usuarios = new ArrayList<>();      
           ArrayList<String> Registros = new ArrayList<>();      
           int NoVigentes = 0;                                
           int Vigentes = 0;  
           DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   Date date = new Date();
	   String FechaCreacion = ""+dateFormat.format(date);
           String[] mostrar= NumeroRegistros2();
         
           if(new File(ruta).exists())
           {
               try
               {
                    Usuarios = listadoNombresUsuario(new File(ruta2));    
                  for (int i = 0; i < Usuarios.size(); i++) 
             {
                String[] Split = Usuarios.get(i).split("\\|");                
                if(Objects.equals(Split[Split.length-1], "0"))
                {
                    NoVigentes++;
                }
               else
                {
                    Vigentes++;
                }
                
             }
                FileWriter fw=new FileWriter(ruta);
                fw.write("");
                fw.close();
                BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));                               
                out.write("Nombre simbolico: @"+usuario+"_administrador"+System.getProperty("line.separator"));                
                out.write("Fecha de creacion: " + mostrar[0]+System.getProperty("line.separator"));
                out.write("Usuario de creacion: " + usuario+System.getProperty("line.separator"));
                out.write("Fecha de modificacion: "+FechaCreacion +System.getProperty("line.separator")); 
                out.write("Usuario de modificacion: " + usuario+System.getProperty("line.separator"));
                out.write("Numero de usuarios registrados: "+Usuarios.size()+System.getProperty("line.separator"));
                out.write("Registros activos: "+ Vigentes+System.getProperty("line.separator")); 
                out.write("Registros inactivos: "+ NoVigentes+System.getProperty("line.separator"));
                out.write("Max reorganizacion: "+Usuarios.size());                
                out.close();   
               }
               catch(Exception e)
               {
                   
               }
           }
           if(!new File(ruta).exists())
           {
               try
               {
                Usuarios = listadoNombresUsuario(new File(ruta2));    
                  for (int i = 0; i < Usuarios.size(); i++) 
             {
                String[] Split = Usuarios.get(i).split("\\|");                
                if(Objects.equals(Split[Split.length-1], "0"))
                {
                    NoVigentes++;
                }  
                else
                {
                    Vigentes++;
                }
                        
             }
                new File(ruta).createNewFile();               
                BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));                               
                 out.write("Nombre simbolico: @"+usuario+"_administrador"+System.getProperty("line.separator"));                
                out.write("Fecha de creacion: " + mostrar[0]+System.getProperty("line.separator"));
                out.write("Usuario de creacion: " + usuario+System.getProperty("line.separator"));
                out.write("Fecha de modificacion: "+FechaCreacion +System.getProperty("line.separator")); 
                out.write("Usuario de modificacion: " + usuario+System.getProperty("line.separator"));
                out.write("Numero de usuarios registrados: "+Usuarios.size()+System.getProperty("line.separator"));
                out.write("Registros activos: "+ Vigentes+System.getProperty("line.separator")); 
                out.write("Registros inactivos: "+ NoVigentes+System.getProperty("line.separator"));
                out.write("Max reorganizacion: "+Usuarios.size());               
                out.close();
               }
               catch(Exception e)
               {          
               }
           }
       }
              
       public void RegistroFinal()
       {
           Metodos metodos = new Metodos();
          String ruta ="C:/MEIA/usuario.txt";
          String ruta2 ="C:/MEIA/bitacora_usuario.txt";
                     
             if(new File(ruta2).exists())
            {         
            try
            {
            ArrayList<String> Usuarios = new ArrayList<>();
            Usuarios = metodos.listadoNombresUsuario(new File(ruta2)); 
            
            ArrayList<String> Usuarios2 = new ArrayList<>();
            Usuarios2 = metodos.listadoNombresUsuario(new File(ruta)); 
            Collections.sort(Usuarios2);
            for(String usuarios:Usuarios2)
            {
                if(Usuarios.size()>0)
                
                Usuarios.add(usuarios);                
            }
                  Collections.sort(Usuarios);
                                                                                                            
            FileWriter fw=new FileWriter(ruta);
            fw.write("");
            fw.close();
            
            FileWriter fw2=new FileWriter(ruta2);
            fw2.write("");
            fw2.close();
                   BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));                                                  
                   for(String s: Usuarios)
                   {                                                                    
                         out.write(s+System.getProperty("line.separator"));                       
                   }

            out.close();
            }
            catch(Exception e)
            {   
            }
            }
            
            if(!new File(ruta2).exists())
            {   
            }             
       }
                                
    public static boolean ValidarRol()
       {
           boolean condicion = false;
           String path="";
           String path2="";
           Metodos m = new Metodos();
           ArrayList<String> Validar = new ArrayList<String>();
           ArrayList<String> Validar2 = new ArrayList<String>();
           ArrayList<String> Validar3 = new ArrayList<String>();
           Validar2 = m.listadoDirectoriosCarpeta(new File("C:/MEIA/"));
           String ruta3 = "C:/MEIA/UsuarioActual.txt"; 
           ArrayList<String> Usuarios3 = new ArrayList<>();
           Usuarios3= m.listadoNombresUsuario(new File(ruta3));
           String usuario = Usuarios3.get(0);    
                  
          if(Validar2.size()>0)
          {
              if(!new File("C:/MEIA/usuario.txt").exists()&& new File("C:/MEIA/bitacora_usuario.txt").exists())
              {
                  int index=-1;
                  path = "C:/MEIA/bitacora_usuario.txt";                  
                  Validar =m.listadoNombresUsuario(new File(path));
                     for (int i = 0; i < Validar.size(); i++) 
          {
                    String[] tempo = Validar.get(i).split("\\|");
                        if(Objects.equals(tempo[0], usuario))
                        {
                            index=i;
                            break;
                        }
          }
                    String[] tempo = Validar.get(index).split("\\|");
                        if(Objects.equals(tempo[4],"1" ))
                        {
                            condicion=true;
                            
                        }
                        else
                        {
                            condicion =false;
                        }
              }
              else if(new File("C:/MEIA/usuario.txt").exists()&& new File("C:/MEIA/bitacora_usuario.txt").exists())
              {
                  int index=-1;
                   path = "C:/MEIA/bitacora_usuario.txt";             
                   path2 = "C:/MEIA/usuario.txt";      
                   Validar =m.listadoNombresUsuario(new File(path));
                   Validar3 =m.listadoNombresUsuario(new File(path2));
                   for(String s:Validar3)
                   {
                       Validar.add(s);
                   }     
                        for (int i = 0; i < Validar.size(); i++) 
          {
                    String[] tempo = Validar.get(i).split("\\|");
                        if(Objects.equals(tempo[0], usuario))
                        {
                            index=i;
                            break;
                        }
          }
                    String[] tempo = Validar.get(index).split("\\|");
                        if(Objects.equals(tempo[4],"1" ))
                        {
                            condicion=true;     
                        }
                        else
                        {
                            condicion =false;
                        }
              }
              else
              {
                 condicion= false; 
              }
          }
          else
          {
              condicion = false;
          }
          return condicion;
       }

       public void ModificarMetaDatos(String usuario,String contraseña,String correo,String fecha,String archivo,String telefono,String Vigencia) throws ParseException                              
    {
          String path = "C:/MEIA/bitacora_usuario.txt";  
          String path2 = "C:/MEIA/usuario.txt";  
          Metodos m =new Metodos();
             
          if(new File(path).exists()&&new File(path2).exists())
          {
          ArrayList<String> Lista1 = new ArrayList<String>();                         
          Lista1 =m.listadoNombresUsuario(new File(path));                        
          int index=-1; 
          for (int i = 0; i < Lista1.size(); i++) 
          {
            String[] tempo = Lista1.get(i).split("\\|");
                        if(Objects.equals(tempo[0], usuario))
                        {
                            index=i;
                            break;
                        }
          }
          
          if(index >=0)
          {
              // <editor-fold defaultstate="collapsed" desc="Modificar archivos">
                String cadena = Lista1.get(index);
          Lista1.remove(index);
          String[] tempo = cadena.split("\\|");
          String password,email,phone,ruta="";
          String picture="";
          String fecha2="";       
          Date date=null;
          String vigencia1 ="";
          if(Vigencia.length()==0)
          {
              vigencia1 = tempo[tempo.length-1];
          }
          else
          {
              vigencia1 = Vigencia;
          }
         if(contraseña.length()==0)
         {
             password = tempo[3];
         }
         else
         {
             password =contraseña;
         }
            if(correo.length()==0)
         {
             email = tempo[6];
         }
         else
         {
             email =correo+"@correo.com";
         }
                  try
    {
    if(new File(archivo).exists())
    {
    ruta = archivo.toString();
    }
    else
    {
         picture = tempo[8];
    }
    }
    catch(Exception e)
    {        
    }
                  
            if(fecha.length()==0)
         {
             fecha2= tempo[5];
         }
         else
         {
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         date = formatter.parse(fecha);             
         }
               if(telefono.length()==0)
         {
             phone = tempo[7];
         }
         else
         {
             phone =telefono;
         }
               if(date!= null)
               {
            Lista1.add(tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+password+"|"+tempo[4]+"|"+date+"|"+email+"|"+phone+"|"+ruta+picture+"|"+tempo[9]+"|"+vigencia1);
               }
               if(date ==null)
               {
                   Lista1.add(tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+password+"|"+tempo[4]+"|"+fecha2+"|"+email+"|"+phone+"|"+ruta+picture+"|"+tempo[9]+"|"+vigencia1);
               }
            try
            {
                Collections.sort(Lista1);
                FileWriter fw = new FileWriter(path);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("");
                bw.close();
               BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path),true),"UTF8"));             
               for(int i =0;i<Lista1.size();i++)
               {
                   if(i+1!=Lista1.size())
                   {
                   out.write(Lista1.get(i)+System.getProperty("line.separator"));
                   }
                   else
                   {
                   out.write(Lista1.get(i));
                   }
               }
               out.close();
                BitacoraSistema();
          BitacoraUsuario();
            }
            catch(Exception e){}
              //</editor-fold>
          }
          if(index==-1)
          {
           // <editor-fold defaultstate="collapsed" desc="Modificar archivos">
          ArrayList<String> Lista2 = new ArrayList<String>();                         
          Lista2 =m.listadoNombresUsuario(new File(path2));
              for (int i = 0; i < Lista2.size(); i++) 
          {
            String[] tempo = Lista2.get(i).split("\\|");
                        if(Objects.equals(tempo[0], usuario))
                        {
                            index=i;
                            break;
                        }
          }
              
                    String cadena = Lista2.get(index);
          Lista2.remove(index);
          String[] tempo = cadena.split("\\|");
          String password,email,phone,ruta="";
          String picture="";
          String fecha2="";
          Date date=null;
                 String vigencia1 ="";
          if(Vigencia.length()==0)
          {
              vigencia1 = tempo[tempo.length-1];
          }
          else
          {
              vigencia1 = Vigencia;
          }        
         if(contraseña.length()==0)
         {
             password = tempo[3];
         }
         else
         {
             password =contraseña;
         }
            if(correo.length()==0)
         {
             email = tempo[6];
         }
         else
         {
             email =correo+"@correo.com";
         }
                  try
    {
    if(new File(archivo).exists())
    {
    ruta = archivo.toString();
    }
    else
    {
         picture = tempo[8];
    }
    }
    catch(Exception e)
    {        
    }
                  
            if(fecha.length()==0)
         {
             fecha2= tempo[5];
         }
         else
         {
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         date = formatter.parse(fecha);             
         }
               if(telefono.length()==0)
         {
             phone = tempo[7];
         }
         else
         {
             phone =telefono;
         }
               if(date!= null)
               {
            Lista2.add(tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+password+"|"+tempo[4]+"|"+date+"|"+email+"|"+phone+"|"+ruta+picture+"|"+tempo[9]+"|"+vigencia1);
               }
               if(date ==null)
               {
                   Lista2.add(tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+password+"|"+tempo[4]+"|"+fecha2+"|"+email+"|"+phone+"|"+ruta+picture+"|"+tempo[9]+"|"+vigencia1);
               }
            try
            {
                 Collections.sort(Lista2);
                FileWriter fw = new FileWriter(path2);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("");
                bw.close();
               BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path2),true),"UTF8"));             
               for(int i =0;i<Lista2.size();i++)
               {
                   if(i+1!=Lista2.size())
                   {
                   out.write(Lista2.get(i)+System.getProperty("line.separator"));
                   }
                   else
                   {
                   out.write(Lista2.get(i));
                   }
               }
               out.close();
                BitacoraSistema();
          BitacoraUsuario();
            }
            catch(Exception e){}
              
           //</editor-fold>
          }
         
          }          
           if(new File(path).exists()&&!new File(path2).exists())
          {
            // <editor-fold defaultstate="collapsed" desc="Modificar archivos">
           ArrayList<String> Lista1 = new ArrayList<String>();                         
         Lista1 =m.listadoNombresUsuario(new File(path));
           int index=-1;                 
          for (int i = 0; i < Lista1.size(); i++) 
          {
            String[] tempo = Lista1.get(i).split("\\|");
                        if(Objects.equals(tempo[0], usuario))
                        {
                            index=i;
                            break;
                        }
          }         
                String cadena = Lista1.get(index);
          Lista1.remove(index);
          String[] tempo = cadena.split("\\|");
          String password,email,phone,ruta="";
          String picture="";
          String fecha2="";
          Date date=null;
            String vigencia1 ="";
          if(Vigencia.length()==0)
          {
              vigencia1 = tempo[tempo.length-1];
          }
          else
          {
              vigencia1 = Vigencia;
          }
                       
         if(contraseña.length()==0)
         {
             password = tempo[3];
         }
         else
         {
             password =contraseña;
         }
            if(correo.length()==0)
         {
             email = tempo[6];
         }
         else
         {
             email =correo+"@correo.com";
         }
                  try
    {
    if(new File(archivo).exists())
    {
    ruta = archivo.toString();
    }
    else
    {
         picture = tempo[8];
    }
    }
    catch(Exception e)
    {        
    }
                  
            if(fecha.length()==0)
         {
             fecha2= tempo[5];
         }
         else
         {
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         date = formatter.parse(fecha);             
         }
               if(telefono.length()==0)
         {
             phone = tempo[7];
         }
         else
         {
             phone =telefono;
         }
               if(date!= null)
               {
            Lista1.add(tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+password+"|"+tempo[4]+"|"+date+"|"+email+"|"+phone+"|"+ruta+picture+"|"+tempo[9]+"|"+vigencia1);
               }
               if(date ==null)
               {
                   Lista1.add(tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+password+"|"+tempo[4]+"|"+fecha2+"|"+email+"|"+phone+"|"+ruta+picture+"|"+tempo[9]+"|"+vigencia1);
               }
            try
            {
                Collections.sort(Lista1);
                FileWriter fw = new FileWriter(path);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("");
                bw.close();           
               BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path),true),"UTF8"));             
               for(int i =0;i<Lista1.size();i++)
               {
                   if(i+1!=Lista1.size())
                   {
                   out.write(Lista1.get(i)+System.getProperty("line.separator"));
                   }
                   else
                   {
                   out.write(Lista1.get(i));
                   }
               }
               out.close();
                BitacoraSistema();              
            }
            catch(Exception e){}
            // </editor-fold>
          }
          
    }
       
           public boolean ValidarRol2(String usuario)
       {
           boolean condicion = false;
           String path="";
           String path2="";
           Metodos m = new Metodos();
           ArrayList<String> Validar = new ArrayList<String>();
           ArrayList<String> Validar2 = new ArrayList<String>();
           ArrayList<String> Validar3 = new ArrayList<String>();
           Validar2 = m.listadoDirectoriosCarpeta(new File("C:/MEIA/"));                                     
          
          if(Validar2.size()>0)
          {
              if(!new File("C:/MEIA/usuario.txt").exists()&& new File("C:/MEIA/bitacora_usuario.txt").exists())
              {
                  int index=-1;
                  path = "C:/MEIA/bitacora_usuario.txt";                  
                  Validar =m.listadoNombresUsuario(new File(path));
                     for (int i = 0; i < Validar.size(); i++) 
          {
                    String[] tempo = Validar.get(i).split("\\|");
                        if(Objects.equals(tempo[0], usuario))
                        {
                            index=i;
                            break;
                        }
          }
                    String[] tempo = Validar.get(index).split("\\|");
                        if(Objects.equals(tempo[4],"1" ))
                        {
                            condicion=true;
                            
                        }
                        else
                        {
                            condicion =false;
                        }
              }
              else if(new File("C:/MEIA/usuario.txt").exists()&& new File("C:/MEIA/bitacora_usuario.txt").exists())
              {
                  int index=-1;
                   path = "C:/MEIA/bitacora_usuario.txt";             
                   path2 = "C:/MEIA/usuario.txt";      
                   Validar =m.listadoNombresUsuario(new File(path));
                   Validar3 =m.listadoNombresUsuario(new File(path2));
                   for(String s:Validar3)
                   {
                       Validar.add(s);
                   }
                        for (int i = 0; i < Validar.size(); i++) 
          {
                     String[] tempo = Validar.get(i).split("\\|");
                        if(Objects.equals(tempo[0], usuario))
                        {
                            index=i;
                            break;
                        }
          }
                    String[] tempo = Validar.get(index).split("\\|");
                        if(Objects.equals(tempo[4],"1" ))
                        {
                            condicion=true;
                            
                        }
                        else
                        {
                            condicion =false;
                        }
              }
              else
              {
                 condicion= false; 
              }
          }
          else
          {
              condicion = false;
          }
          return condicion;
       }
           
   public void copiar(File Fileorigen, File Filedestino) throws IOException {
    if (Fileorigen.isDirectory()) {
        copiarDirectorio(Fileorigen, Filedestino);
    } else {
        copiarFile(Fileorigen, Filedestino);
    }
}

   public void copiarDirectorio(File origen, File destino) throws IOException {
    if (!destino.exists()) {
        destino.mkdir();
    }
    for (String f : origen.list()) {
        copiar(new File(origen, f), new File(destino, f));
    }
}

static void copiarFile(File origen, File destino) throws IOException {        
    try (
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino)
    ) {
        byte[] buf = new byte[1024];
        int length;
        while ((length = in.read(buf)) > 0) {
            out.write(buf, 0, length);
        }
    }
}
 public String ObtenerNombre(String ruta2)
 {
      String mensaje =null;            
            String s = ruta2.toString();            
             ArrayList<String> ruta =new ArrayList<>();
             ArrayList<String> rutaActual =new ArrayList<>();
             int j =0;          
             String l ="";                                   
          int d=0;
          
                int bn =0;
                for (int i = 0; i < s.length(); i++) 
                {
                  ruta.add(s.substring(i,i+1));
                  if(!ruta.get(i).equals("\\"))
                  {
                      l+=ruta.get(i);
                  }
                  if(ruta.get(i).equals("\\"))
                  {
                      rutaActual.add(l);
                      l="";
                      j=i;
                  }
                }   
                String actual ="";               
                rutaActual.add(s.substring(j+1,s.length()));
        
                actual = rutaActual.get(rutaActual.size()-1);
                String[] Split = actual.split(".jpg");
                return Split[0];
 }
 
 public void CopiarImagen(String ruta1)
 {
          try
            {
FileInputStream fis = new FileInputStream(ruta1);
String nombre=ObtenerNombre(ruta1);
FileOutputStream fos = new FileOutputStream("C:/MEIA/Fotografias/"+nombre+".jpg");
FileChannel inChannel = fis.getChannel(); 
FileChannel outChannel = fos.getChannel(); 
inChannel.transferTo(0, inChannel.size(), outChannel); 
fis.close(); 
fos.close();
         }
             
            catch(IOException e)
            {
                
                
        } 
 }
  
 public void BitacoraBackUp(String rutaBackUp)
 {      String ruta3 = "C:/MEIA/UsuarioActual.txt"; 
        String ruta = "C:/MEIA/bitacora_backup.txt"; 
        ArrayList<String> Usuarios3 = new ArrayList<>();
        Usuarios3= listadoNombresUsuario(new File(ruta3));
        String usuario = Usuarios3.get(0);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
          String FechaCreacion = ""+dateFormat.format(date);
          
          try
          {
           new File(ruta).createNewFile();               
           FileWriter fw=new FileWriter(ruta);
                fw.write("");
                fw.close();
                BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));                               
                out.write("Ruta absoluta: "+  rutaBackUp +System.getProperty("line.separator"));
                out.write("Usuario: " + usuario+System.getProperty("line.separator"));
                out.write("Fecha de transaccion: "+FechaCreacion +System.getProperty("line.separator"));
                out.write("");              
                out.close();
           
          }
          catch(IOException e)
          {
              
          }
 }
 
 public void BitacoraBackUp2()
 {     
      String ruta3 = "C:/MEIA/UsuarioActual.txt"; 
        String ruta = "C:/MEIA/desc_bitacora_backup.txt"; 
        ArrayList<String> Usuarios3 = new ArrayList<>();
        Usuarios3= listadoNombresUsuario(new File(ruta3));
        String usuario = Usuarios3.get(0);         
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();        
          String FechaCreacion = ""+dateFormat.format(date);
          String[] mostrar= NumeroRegistros();
          try
          {
           new File(ruta).createNewFile();               
           FileWriter fw=new FileWriter(ruta);
                fw.write("");
                fw.close();
                BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));                               
                out.write("Nombre simbolico: @"+usuario+"_administrador"+System.getProperty("line.separator"));                
                out.write("Fecha de creacion: " + mostrar[1]+System.getProperty("line.separator"));
                out.write("Usuario de creacion: " + usuario+System.getProperty("line.separator"));
                out.write("Fecha de modificacion: "+FechaCreacion +System.getProperty("line.separator"));
                out.write("Usuario de modificacion: " + usuario+System.getProperty("line.separator"));
                out.write("Numero de registros: "+ mostrar[0]);              
                out.close();
           
          }
          catch(IOException e)
          {
              
          }
 }
 
 public String[] NumeroRegistros()
 {
     String[] registro = new String[3];
     try
     {
        String ruta = "C:/MEIA/contraseña/Registros.txt";         
        String ruta2 = "C:/MEIA/contraseña/Fecha.txt"; 
        
        
        if(new File(ruta).exists())
        {            
            ArrayList<String> Registros = new ArrayList<>();
            Registros= listadoNombresUsuario(new File(ruta));
            registro[0] = Registros.get(0);
            
           ArrayList<String> fecha = new ArrayList<>();
            fecha= listadoNombresUsuario(new File(ruta2));
            registro[1] = fecha.get(0);
            
            int numero = Integer.parseInt(registro[0]);
            numero++;
            new File(ruta).createNewFile();
            FileWriter fw =new FileWriter(ruta);
            fw.write(numero+"");
            fw.close();
            registro[0]=numero+"";
        }
        if(!new File(ruta).exists())
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    Date date = new Date();
            String FechaCreacion = ""+dateFormat.format(date);
            new File(ruta).createNewFile();
            new File(ruta2).createNewFile();
            FileWriter fw =new FileWriter(ruta);
            FileWriter fw2 =new FileWriter(ruta2);
            fw2.write(FechaCreacion);
            fw2.close();
            fw.write("1");
            fw.close();
            registro[0]="1";
            registro[1] = FechaCreacion;
        }
       
     }
     catch(IOException e)
     {
         
     }       
     return registro;
 }
 
 public String[] NumeroRegistros2()
 {
     String[] registro = new String[3];
     try
     {            
        String ruta2 = "C:/MEIA/contraseña/Fecha.txt"; 
        
        
        if(new File(ruta2).exists())
        {                       
           ArrayList<String> fecha = new ArrayList<>();
            fecha= listadoNombresUsuario(new File(ruta2));
            registro[0] = fecha.get(0);
           
        }
        if(!new File(ruta2).exists())
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    Date date = new Date();
            String FechaCreacion = ""+dateFormat.format(date);          
            new File(ruta2).createNewFile();            
            FileWriter fw2 =new FileWriter(ruta2);
            fw2.write(FechaCreacion);
            fw2.close();                        
            registro[0] = FechaCreacion;
        }
       
     }
     catch(IOException e)
     {
         
     }       
     return registro;
 }


 
}