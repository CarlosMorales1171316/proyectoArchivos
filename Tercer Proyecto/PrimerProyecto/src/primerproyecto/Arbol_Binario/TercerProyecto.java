package primerproyecto.Arbol_Binario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import primerproyecto.Metodos;

public class TercerProyecto 
{
    
     public ArrayList<String> listadoNombresUsuario(String ruta)
     {
         
         File archivo = new File(ruta);
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
       private void EscribirArchivo(ArrayList<String> Escribir,String ruta)
    {
        try
        {
         if (!new File(ruta).exists()) 
         {
                new File(ruta).createNewFile();
         }
         FileWriter fw = new FileWriter(ruta);
         BufferedWriter out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ruta),true),"UTF8"));         
         fw.write("");
            for (int i = 0; i < Escribir.size(); i++) 
            {
                if(i+1!= Escribir.size())
                {
                out.write(Escribir.get(i)+System.getProperty("line.separator"));
                }
                else
                {
                    out.write(Escribir.get(i));
                }
            }
         
         out.close();
         fw.close();         
        }
        catch(IOException e)
        {
            
        }
    }
       
        public boolean Busqueda(String NombreLista,String NombreUsuario)
    {       
        boolean condicion = false;
        String ruta ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";          
        ArrayList<String> Usuarios = new ArrayList<String>();                         
        ArrayList<String> Index = new ArrayList<String>();
        ArrayList<String> Nombre = new ArrayList<String>();
        ArrayList<String> Valor = new ArrayList<String>();
        ArrayList<String> Lista3 = new ArrayList<String>();
        Index = listadoNombresUsuario((rutaUsuario));
        int inicio=0;
        String usuario = Index.get(0);
        Index.removeAll(Index);        
        if(new File(ruta).exists())
        {            
        Usuarios =listadoNombresUsuario((ruta));   
        try
        {
         for (int i = 0; i < Usuarios.size(); i++) 
            {
               String[] tempo = Usuarios.get(i).split("\\|");
               if(tempo[2].equals(NombreLista)&&tempo[3].equals(usuario))
               {                   
                   Index.add(tempo[0]);
                   Nombre.add(tempo[4]);
                   Valor.add(tempo[5]);
                   Lista3.add(Usuarios.get(i));
               }               
            }
          inicio = Menor(Lista3);
          int i = 0;
          int tempo=0;
          do
          {
              
             
              // <editor-fold defaultstate="collapsed" desc=" Region Name ">
              if(i==0)
              {
              if(NombreUsuario.equals(Nombre.get(inicio-1)))
              {
                  condicion = true;
                  break;
              }
               tempo = Integer.parseInt(Valor.get(inicio-1));
              }
              // </editor-fold>
              else
              {
              if(NombreUsuario.equals(Nombre.get(tempo-1)))
              {
                  condicion=true;
                  break;
              }
              else
              {
                  tempo = Integer.parseInt(Valor.get(tempo-1));
              }
              }             
              i++;
          }
          while(i!= Index.size());
        }
        catch(Exception e)
                {
                    condicion =Busqueda2(NombreLista,NombreUsuario);
                }
        }
        else
        {
            condicion =false;
        }
                
        return condicion;
    }
    
    private boolean Busqueda2(String NombreLista,String nombreusuario)
    {
      boolean condicion = false;
        String ruta ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";          
        ArrayList<String> Usuarios = new ArrayList<String>();                         
        ArrayList<String> Index = new ArrayList<String>();
        ArrayList<String> Nombre = new ArrayList<String>();
        ArrayList<String> Valor = new ArrayList<String>();
        ArrayList<String> Lista3 = new ArrayList<String>();
        Index = listadoNombresUsuario((rutaUsuario));
        int inicio=0;
        String usuario = Index.get(0);
        Index.removeAll(Index);
        if(new File(ruta).exists())
        {
        Usuarios =listadoNombresUsuario((ruta));   
        
         for (int i = 0; i < Usuarios.size(); i++) 
            {
               String[] tempo = Usuarios.get(i).split("\\|");
               if(tempo[2].equals(NombreLista)&&tempo[3].equals(usuario))
               {                                      
                   Nombre.add(tempo[4]);                                      
               }               
            } 
            for (int i = 0; i < Nombre.size(); i++) 
            {
                if(Nombre.get(i).equals(nombreusuario))
                {
                    condicion=true;
                    break;
                }
            }
    }
            return condicion;
    }
     private int Menor(ArrayList<String> l)
   {
       int inicio=0;        
        ArrayList<String> l2 = new ArrayList<>();
        
       for(String b:l)
        {
            String[] d = b.split("\\|");            
            l2.add(d[4]+","+d[0]);
        }        
        Collections.sort(l2);
        String tempo= l2.get(0);        
        inicio = Integer.parseInt(tempo.substring(tempo.length()-1,tempo.length()));
       return inicio;
   }
     
     
     public void ArchivoTipoArbolBinario(String emisor,String receptor,String mensaje,String asunto,String adjunto,String fecha,String validar)             
     {   String rutaUsuario = "C:/MEIA/UsuarioActual.txt"; 
         String ruta ="C:\\MEIA\\Mensajeria\\ArchivoMaestro.txt";       
         ArrayList<String> Llenar = listadoNombresUsuario(ruta);
         ArrayList<String> Arbol = new ArrayList<String>();
         ArrayList<String> Usuario = new ArrayList<String>();  
         String usuario ="";
         Usuario = listadoNombresUsuario((rutaUsuario));
         usuario = Usuario.get(0);
         if(validar.equals("0"))
         {
         emisor =usuario;
         Usuario.clear();
         }
                                  
         //Izq|Der|Usuario_emisor|Usuario_receptor|Fec_transac|Asunto|Mensaje|Adjunto|Estatus         
         ArrayList<String> es = new ArrayList<String>();
         String escribir="";
         
         if(Llenar.size()>0)
         {                                                 
           ArbolBinario ab = new ArbolBinario(Llenar.get(0)); 
           String nuevo ="r|v|"+emisor+"|"+receptor+"|"+fecha+"|"+asunto+"|"+mensaje+"|agregar|1";
           Llenar.add(nuevo);       
             for (int i = 1; i < Llenar.size(); i++) 
             {
                 ab.Insertar(Llenar.get(i));
             }                                                                                  
            String j =ab.valores("");
            Usuario = ObtenerPunteros(ab.valores(j));
            EscribirArchivo(Usuario,ruta);
         }
         if(Llenar.size()==0)
         {             
             String llave ="0|0|"+emisor+"|"+receptor+"|"+fecha+"|"+asunto+"|"+mensaje+"|"+adjunto+"|1";  
             ArbolBinario ab = new ArbolBinario(llave);                                     
             es.add(llave);
             EscribirArchivo(es,ruta);
         }
         
     }
    
     public ArrayList<String> ObtenerPunteros(String valores)
     {
                     
           String recortar = valores.substring(1,valores.length()-1);
           String[] Split = recortar.split(",");
           ArrayList<String> agregar = new ArrayList<String>();
           ArrayList<String> nombres = new ArrayList<String>();
           for(String b:Split)
           {
               String[] v = b.split("="); 
               String[] f = v[0].split("\\|");                                             
              String value = f[2]+"|"+f[3]+"|"+f[4];
              nombres.add(value);
           }
           
           
           String punteroIz="",punteroDer ="";
                                
           for (int i = 0; i < Split.length; i++) 
           {
              String nombre =nombres.get(i);
              String[] v = Split[i].split("="); 
              String[] f = v[0].split("\\|");
                                             
              String value = f[2]+"|"+f[3]+"|"+f[4];
              
              if(value.equals(nombre))
              {
                  if(Split.length>1)
                  {
                  if(Split[0].contains(nombre)==true)
                  {
                         punteroDer = "0";
                         if(Split.length>0)
                         {                         
                         punteroIz = Split[i+1].substring(Split[i+1].length()-1);
                         }
                         else
                         {
                             punteroDer="0";
                         }
                         agregar.add(punteroIz+"|"+punteroDer+"|"+value+"|"+f[5]+"|"+f[6]+"|"+f[7]+"|1");
                  }
                  else if(Split[Split.length-1].contains(nombre)==true)
                  {                      
                      punteroIz = "0";
                      punteroDer = "0";
                      agregar.add(punteroIz+"|"+punteroDer+"|"+value+"|"+f[5]+"|"+f[6]+"|"+f[7]+"|1");
                  }                  
                   else
                  {
                      punteroIz = Split[i-1].substring(Split[i-1].length()-1);
                      punteroDer = Split[i+1].substring(Split[i+1].length()-1);
                      agregar.add(punteroIz+"|"+punteroDer+"|"+value+"|"+f[5]+"|"+f[6]+"|"+f[7]+"|1");
                  }
              }
                  else
              {
                      punteroIz = "0";
                      punteroDer = "0";
                      agregar.add(punteroIz+"|"+punteroDer+"|"+value+"|"+f[5]+"|"+f[6]+"|"+f[7]+"|1");   
              }
              }                      
           }                                       
                return agregar;         
     }
     
     public ArrayList<String> LeerMensajes()
     {
           String rutaUsuario = "C:/MEIA/UsuarioActual.txt"; 
            String ruta ="C:\\MEIA\\Mensajeria\\ArchivoMaestro.txt";
            ArrayList<String> agregar = listadoNombresUsuario((ruta));         
            ArrayList<String>Usuario = listadoNombresUsuario((rutaUsuario));         
           String usuarioActual = Usuario.get(0);           
            ArrayList<String> Mostrar = new ArrayList<String>();
           for (int i = 0; i < agregar.size(); i++) 
           {
            String p = agregar.get(i);
              //String p ="Izq|Der|Usuario_emisor|Usuario_receptor|Fec_transac|Asunto|Mensaje|Adjunto|Estatus";
             String[] f = p.split("\\|");
             if(f[3].equals(usuarioActual))
             {
                 Mostrar.add("Enviado por:  "+f[2]+"\n   ,Mensaje:   "+f[6]+"\n   ,Fecha recibido: "+  f[4]);
             }
           
           }
           
           return Mostrar;
     }
     public ArrayList<String> LeerMensajes2()
     {
           String rutaUsuario = "C:/MEIA/UsuarioActual.txt"; 
            String ruta ="C:\\MEIA\\Mensajeria\\ArchivoMaestro.txt";
            ArrayList<String> agregar = listadoNombresUsuario((ruta));         
            ArrayList<String>Usuario = listadoNombresUsuario((rutaUsuario));         
           String usuarioActual = Usuario.get(0);           
            ArrayList<String> Mostrar = new ArrayList<String>();
           for (int i = 0; i < agregar.size(); i++) 
           {
            String p = agregar.get(i);              
             String[] f = p.split("\\|");
             if(f[2].equals(usuarioActual))
             {
                 Mostrar.add("Enviado a:  "+f[3]+"\n   ,Mensaje:   "+f[6]+"\n   ,Fecha recibido: "+  f[4]);
             }
           
           }
           
           return Mostrar;
     }


    public ArrayList<String> MostrarAmigos(String lista)
    {
        String ruta ="C:\\MEIA\\Listas Usuarios\\ListaUsuario.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";                 
        String Usuario ="";      
        ArrayList<String> Lista = new ArrayList<String>();        
        Lista = listadoNombresUsuario((rutaUsuario));    
        ArrayList<String> Lista2 = new ArrayList<String>();        
        Usuario = Lista.get(0);
        Lista.removeAll(Lista); 
        if(new File(ruta).exists())
        {
        Lista = listadoNombresUsuario((ruta));
        }
        for (int i = 0; i < Lista.size(); i++) 
        {
           String[] tempo = Lista.get(i).split("\\|");
           if(tempo[1].equals(Usuario) && tempo[4].equals("1"))
           {
               if(lista.equals(tempo[0]))
               {
               Lista2.add(tempo[2]);
               }
           }
        }
        return Lista2;
    }
    
    public boolean ValidarLista(String nombreLista)
    {
        boolean condicion =false;
        ArrayList<String> Lista = new ArrayList<String>();               
        String ruta="C:\\MEIA\\Listas Usuarios\\Bitacora_Lista.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";         
        Lista = listadoNombresUsuario((rutaUsuario));
        String usuario = Lista.get(0);
        Lista.removeAll(Lista);
        
        if(new File(ruta).exists())
        {
            Lista = listadoNombresUsuario((ruta));
            String tempo = usuario+"|"+nombreLista;
            for (int i = 0; i < Lista.size(); i++) 
            {
                String[] tempo2 = Lista.get(i).split("\\|");             
                    if(usuario.toLowerCase().equals(tempo2[1].toLowerCase())&&(tempo2[0].toLowerCase()).equals(nombreLista.toLowerCase()))                  
                {
                                       
                    condicion= true;
                    break;
                }
                
            }
        }
        else
        {
            condicion =false;
        }
        
        return condicion;
    }
    
    public void EliminarMensaje(String eliminar)
    {
         String ruta ="C:\\MEIA\\Mensajeria\\ArchivoMaestro.txt";         
         ArrayList<String> Llenar = listadoNombresUsuario(ruta);  
         ArrayList<String> es = new ArrayList<String>();
         String llave = eliminar;
          
         if(Llenar.size()>0)
         {                                                 
             ArbolBinario ab = new ArbolBinario(Llenar.get(0));                 
             for (int i = 1; i < Llenar.size(); i++) 
             {
                 ab.Insertar(Llenar.get(i));
             }
                                                             
           for (int i = 0; i < Llenar.size(); i++) 
           {
               
            String[] tempo = Llenar.get(i).split("\\|");
            String validar =tempo[2]+"|"+tempo[3]+"|"+tempo[4];             
            if(validar.equals(llave))
            {
                eliminar =tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+tempo[3]+"|"+tempo[4]+"|"+tempo[5]+"|"+tempo[6]+"|"+tempo[7]+"|"+tempo[8];
            }
           }                   
            String j =ab.valores(eliminar);
            es = ObtenerPunteros(j);
            EscribirArchivo(es,ruta);
         }
         
    }
    public boolean Busqueda(String busqueda)
    {        
         String ruta ="C:\\MEIA\\Mensajeria\\ArchivoMaestro.txt";
         ArrayList<String> Llenar = listadoNombresUsuario(ruta);  
         ArrayList<String> es = new ArrayList<String>();
         String llave = busqueda;
          boolean condicion = false;
         if(Llenar.size()>0)
         {                                                 
             ArbolBinario ab = new ArbolBinario(Llenar.get(0));                 
             for (int i = 1; i < Llenar.size(); i++) 
             {
                 ab.Insertar(Llenar.get(i));
             }
                         
             String validarBusqueda="";
           for (int i = 0; i < Llenar.size(); i++) 
           {
               
            String[] tempo = Llenar.get(i).split("\\|");
            String validar =tempo[2]+"|"+tempo[3]+"|"+tempo[4];             
            if(validar.equals(llave))
            {
                 validarBusqueda=tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+tempo[3]+"|"+tempo[4]+"|"+tempo[5]+"|"+tempo[6]+"|"+tempo[7]+"|"+tempo[8];
                 condicion= true;
            }
           }                                     
    }   
         return condicion;
}
    
    public boolean ValidarUsuario(String usuario)
    {
        boolean condicion = false;
          String path = "C:/MEIA/bitacora_usuario.txt";  
          String path2 = "C:/MEIA/usuario.txt";
          
          Metodos m =new Metodos();
          ArrayList<String> Lista3 = new ArrayList<String>();   
          
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
              Lista3.add(tempo[0]);              
            //System.out.println(s);
          }
                        
             
          }
          if(new File(path).exists()&&!new File(path2).exists())
          { 
           ArrayList<String> Lista = new ArrayList<String>();                         
          Lista =m.listadoNombresUsuario(new File(path));
                                     
               Collections.sort(Lista);
           for(String s: Lista)   
          {
              String[] tempo = s.split("\\|");
              Lista3.add(tempo[0]);              
          }
                         
          }  
          for (int i = 0; i < Lista3.size(); i++) 
          {
                   if(Lista3.get(i).equals(usuario))
                   {
                       condicion = true;
                       break;
                   }
          }
        return condicion;
    }
}
