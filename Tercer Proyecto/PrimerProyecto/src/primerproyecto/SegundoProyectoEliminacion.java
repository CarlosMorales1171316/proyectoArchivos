/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;


public class SegundoProyectoEliminacion 
{
    private ArrayList<String> listadoNombresUsuario(File archivo)
    {         
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
    
    private ArrayList<String> Eliminacion(ArrayList<String> s,String lista,String borrar,String usuarioActual)
    {
        int index =0;        
         for (int i = 0; i < s.size(); i++) 
        {
            String[] tempo = s.get(i).split("\\|");
            String cadena = tempo[2]+tempo[4];
            String cadena2 = lista+borrar;
            if(cadena.equals(cadena2))
            {
                index = i;
                break;
            }
        }
        
        String[] tempo = s.get(index).split("\\|");
        String nuevo = tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+tempo[3]+"|"+tempo[4]+"|0|0";
        s.set(index, nuevo);
        
         ArrayList<String> ListaUsuario = new ArrayList<String>();
        for (int i = 0; i < s.size(); i++) 
        {            
            String[] tempo2 = s.get(i).split("\\|");
           if(tempo2[3].equals(usuarioActual) && tempo2[2].equals(lista))
           {
               ListaUsuario.add(s.get(i));
           }            
        }
        
        ArrayList<String> Lista = new ArrayList<String>();
        ArrayList<String> Lista2 = new ArrayList<String>();
        ArrayList<String> Lista3 = new ArrayList<String>(); 
        
          for (int i = 0; i < s.size(); i++) 
                   {
                        String[] tempo2 = s.get(i).split("\\|");
                        Lista.add(tempo2[4]+"|"+tempo2[2]+"|"+tempo2[3]);                        
                   }  
           for (int i = 0; i < ListaUsuario.size(); i++) 
                   {
                        String[] tempo2 = ListaUsuario.get(i).split("\\|");
                        if(tempo2[6].equals("1"))
                        {
                        Lista2.add(tempo2[4]+"|"+tempo2[2]+"|"+tempo2[3]);                        
                        }
                   }    
           
             Collections.sort(Lista2);
        
         for (int i = 0; i < Lista2.size(); i++) 
         {
             for (int j = 0; j < Lista.size(); j++) 
             {
                 if(i+1!=Lista2.size())
                 {
                 if(Lista.get(j).equals(Lista2.get(i+1)))
                 {
                     Lista3.add(Lista2.get(i)+"|"+(j+1));
                 }
                 }
                 if(i+1==Lista2.size())
                 {
                     Lista3.add(Lista2.get(i)+"|0");
                     break;
                 }
                 
             }
         }
         Lista.removeAll(Lista);
         
        for (int i = 0; i < s.size(); i++) 
                   {
                        String[] tempo1 = s.get(i).split("\\|");
                        for (int j = 0; j < Lista3.size(); j++) 
                        {
                           String[] tempo2 = Lista3.get(j).split("\\|");           
                            if(tempo1[4].equals(tempo2[0]))
                                    {
                                        int d = i+1;                                              
                                        String v =d +"|"+"1."+d+"|"+tempo1[2]+"|"+tempo1[3]+"|"+tempo2[0]+"|"+tempo2[3]+"|"+tempo1[6];                                        
                                        s.set(i,v);
                                    }
                        }                                                
                   } 
        return s;
    }
    
       public void IndiceListaUsuario(String ListaActual,String borrar)
    {
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt"; 
        String ruta ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
        ArrayList<String> Usuarios = new ArrayList<String>();
        ArrayList<String> Lista = new ArrayList<String>();             
        
        String usuario ="";
        Lista = listadoNombresUsuario(new File(rutaUsuario));
        usuario = Lista.get(0);
        Lista.removeAll(Lista);
                
        if(new File(ruta).exists())
        {
        Usuarios =listadoNombresUsuario(new File(ruta));        
        }
        
        Lista = Eliminacion(Usuarios,ListaActual,borrar,usuario);
        EscribirArchivo(Lista,ruta);       
        ActualizarBitacoraLista();
        Desc_Indice();
        ListaUsuarios(ListaActual,borrar);
        Desc_ListaUsuario();
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
        Index = listadoNombresUsuario(new File(rutaUsuario));
        int inicio=0;
        String usuario = Index.get(0);
        Index.removeAll(Index);        
        if(new File(ruta).exists())
        {            
        Usuarios =listadoNombresUsuario(new File(ruta));   
        try
        {
         for (int i = 0; i < Usuarios.size(); i++) 
            {
               String[] tempo = Usuarios.get(i).split("\\|");
               if(tempo[2].equals(NombreLista)&&tempo[3].equals(usuario)&&tempo[6].equals("1"))
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
        Index = listadoNombresUsuario(new File(rutaUsuario));
        int inicio=0;
        String usuario = Index.get(0);
        Index.removeAll(Index);
        if(new File(ruta).exists())
        {
        Usuarios =listadoNombresUsuario(new File(ruta));   
        
         for (int i = 0; i < Usuarios.size(); i++) 
            {
               String[] tempo = Usuarios.get(i).split("\\|");
               if(tempo[2].equals(NombreLista)&&tempo[3].equals(usuario)&&tempo[6].equals("1"))
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
          
           public void BitacoraLista(String nombre,String descripcion)
    {
        String ruta="C:\\MEIA\\Listas Usuarios\\Bitacora_Lista.txt";
        String ruta2 ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";         
        ArrayList<String> Escribir =new ArrayList<String>();
        ArrayList<String> Numero =new ArrayList<String>();
        boolean condicion =false;
        if(new File(ruta2).exists())
        {
        Numero = listadoNombresUsuario(new File(ruta2));
        }
        String usuario="";
        Escribir = listadoNombresUsuario(new File(rutaUsuario));
        usuario = Escribir.get(0);
        Escribir.removeAll(Escribir);
        if(new File(ruta).exists())
        {
        Escribir = listadoNombresUsuario(new File(ruta));
        }
        String escribir =nombre+"|"+usuario+"|"+descripcion+"|"+Numero.size()+"|"+"1";
        for (int i = 0; i < Escribir.size(); i++) 
        {
            if(Escribir.get(i).equals(escribir))                       
            {
                condicion = true;
                break;
            }
        }
        if(condicion ==false)
        {
            Escribir.add(escribir);
        }
        
        EscribirArchivo(Escribir,ruta);
       
    }
    
    private void ActualizarBitacoraLista()
    {
     String ruta="C:\\MEIA\\Listas Usuarios\\Bitacora_Lista.txt";
     String ruta2 ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
     ArrayList<String> Lista = new ArrayList<String>();
     ArrayList<String> Lista2 = new ArrayList<String>();     
     Lista = listadoNombresUsuario(new File(ruta));
     Lista2 = listadoNombresUsuario(new File(ruta2));
     
        for (int i = 0; i < Lista.size(); i++) 
        {
            String v ="";
            String[] tempo = Lista.get(i).split("\\|");
            int d=0;
            for (int j = 0; j < Lista2.size() ; j++) 
            {
                String[] tempo2 = Lista2.get(j).split("\\|");                
                if(tempo[0].equals(tempo2[2])&&tempo[1].equals(tempo2[3])&&tempo2[6].equals("1"))
                {
                    d++;
                }
            }
            v= tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+d+"|"+tempo[4];
            Lista.set(i,v );
        }
     EscribirArchivo(Lista,ruta);
        
    }
    
    private void ListaUsuarios(String NombreLista,String UsuarioEliminado)
    {       
        String ruta ="C:\\MEIA\\Listas Usuarios\\ListaUsuario.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";         
        String Usuario ="";      
        ArrayList<String> Lista = new ArrayList<String>();        
        Lista = listadoNombresUsuario(new File(rutaUsuario));       
        Usuario = Lista.get(0);
        Lista.removeAll(Lista);
        if(new File(ruta).exists())
        {
        Lista =listadoNombresUsuario(new File(ruta));
        }        
      
         String validar = NombreLista+Usuario+UsuarioEliminado;
         int index=0;
         for (int i = 0; i < Lista.size(); i++) 
         {
            String[] tempo=Lista.get(i).split("\\|");
            String v = tempo[0] +tempo[1]+tempo[2];            
            if(validar.equals(v))
            {
                index=i;
                break;
            }            
         }
         Lista.set(index, NombreLista+"|"+Usuario+"|"+UsuarioEliminado+"|Eliminar "+ UsuarioEliminado+"|0");
         EscribirArchivo(Lista,ruta);
    }
    
    private void Desc_Indice()
    {
        String ruta ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
        String ruta1= "C:\\MEIA\\Listas Usuarios\\Desc_Indice.txt";
        ArrayList<String> Lista = new ArrayList<String>();
        ArrayList<String> Lista2 = new ArrayList<String>();
        ArrayList<String> Lista3 = new ArrayList<String>();
        ArrayList<String> Escribir = new ArrayList<String>();
        int inicio=0,activos=0,inactivos=0;
        int numero =0;
        if(new File(ruta).exists())
        {
         Lista=listadoNombresUsuario(new File(ruta));
         numero =Lista.size();
            for (int i = 0; i < Lista.size(); i++) 
            {
                String[] tempo = Lista.get(i).split("\\|");
                if(tempo[6].equals("1"))
                {
                activos = activos + Integer.parseInt(tempo[6]);
                }
                else
                {
                inactivos++;
                }
                int v = 1+i;
                Lista2.add(tempo[4]+","+v);
            }     
            
      ArrayList<String> l = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        l=listadoNombresUsuario(new File(ruta));
       for(String b:l)
        {
            String[] d = b.split("\\|");            
            l2.add(d[4]+","+d[0]);
        }        
        Collections.sort(l2);
        String tempo= l2.get(0);        
        inicio = Integer.parseInt(tempo.substring(tempo.length()-1,tempo.length()));
        }
        
        Escribir.add("Numero de registros: " +numero);
        Escribir.add("Registro inicio: "+ inicio);
        Escribir.add("Numero de activos: "+ activos);
        Escribir.add("Numero de inactivos: "+ inactivos);
        
        EscribirArchivo(Escribir,ruta1);
        
    }
    
    private void Desc_ListaUsuario()
    {
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt"; 
        String ruta ="C:\\MEIA\\Listas Usuarios\\ListaUsuario.txt";
        String ruta1 ="C:\\MEIA\\Listas Usuarios\\Desc_ListaUsuario.txt";
        ArrayList<String> Lista = new ArrayList<String>();       
        ArrayList<String> Escribir = new ArrayList<String>();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
        String fechaCreacion = dateFormat.format(date);	
        String usuario ="";
        Escribir = listadoNombresUsuario(new File(rutaUsuario));
        usuario = Escribir.get(0);
        Escribir.removeAll(Escribir);
        int registros=0,activos=0,inactivos=0;
        if(new File(ruta).exists())
        {            
            Lista = listadoNombresUsuario(new File(ruta));
            registros = Lista.size();
             for (int i = 0; i < Lista.size(); i++) 
            {
                String[] tempo = Lista.get(i).split("\\|");
                if(tempo[4].equals("1"))
                {
                activos = activos + Integer.parseInt(tempo[4]);
                }
                else
                {
                inactivos++; 
                }                                
            }    
        }
        
        Escribir.add("Usuario actual: "+ usuario);
        Escribir.add("Fecha creacion: "+ fechaCreacion);
        Escribir.add("Numero de registros: "+ registros);
        Escribir.add("Numero activos: "+ activos);
        Escribir.add("Numero inactivos: "+ inactivos);
        
        EscribirArchivo(Escribir,ruta1);
    }
   
    public ArrayList<String> MostrarAmigos()
    {
        String ruta ="C:\\MEIA\\Listas Usuarios\\ListaUsuario.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";                 
        String Usuario ="";      
        ArrayList<String> Lista = new ArrayList<String>();        
        Lista = listadoNombresUsuario(new File(rutaUsuario));    
        ArrayList<String> Lista2 = new ArrayList<String>();        
        Usuario = Lista.get(0);
        Lista.removeAll(Lista); 
        if(new File(ruta).exists())
        {
        Lista = listadoNombresUsuario(new File(ruta));
        }
        for (int i = 0; i < Lista.size(); i++) 
        {
           String[] tempo = Lista.get(i).split("\\|");
           if(tempo[1].equals(Usuario) && tempo[4].equals("1"))
           {
               Lista2.add("Nombre lista: "+ tempo[0]+", Nombre amigo: "+ tempo[2]);
           }
        }
        return Lista2;
    }
 
  
    public ArrayList<String> MostrarListas()
    {
        String ruta="C:\\MEIA\\Listas Usuarios\\Bitacora_Lista.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";                 
        String Usuario ="";      
        ArrayList<String> Lista = new ArrayList<String>();        
        Lista = listadoNombresUsuario(new File(rutaUsuario));    
        ArrayList<String> Lista2 = new ArrayList<String>();        
        Usuario = Lista.get(0);
        Lista.removeAll(Lista); 
        if(new File(ruta).exists())
        {
        Lista = listadoNombresUsuario(new File(ruta));
        }
        for (int i = 0; i < Lista.size(); i++) 
        {
           String[] tempo = Lista.get(i).split("\\|");
           if(tempo[1].equals(Usuario) && tempo[4].equals("1"))
           {
               Lista2.add("Nombre lista: "+ tempo[0]+", Numero de amigos: "+ tempo[3]);
           }
        }
        return Lista2;
    }
    
      
    public void ModificarListasUsuarios(String nombreListaInicial,String nombreListaModificar)
    {
        String ruta="C:\\MEIA\\Listas Usuarios\\Bitacora_Lista.txt";
        String ruta2 ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";         
        ArrayList<String> Escribir =new ArrayList<String>();
        ArrayList<String> Numero =new ArrayList<String>();
        boolean condicion =false;
        if(new File(ruta2).exists())
        {
        Numero = listadoNombresUsuario(new File(ruta2));
        }
        String usuario="";
        Escribir = listadoNombresUsuario(new File(rutaUsuario));
        usuario = Escribir.get(0);
        Escribir.removeAll(Escribir);
        if(new File(ruta).exists())
        {
        Escribir = listadoNombresUsuario(new File(ruta));
        }
        for (int i = 0; i < Escribir.size(); i++) 
        {
            String[] tempo = Escribir.get(i).split("\\|");
            if(tempo[0].equals(nombreListaInicial)&&tempo[1].equals(usuario))
            {
                Escribir.set(i, nombreListaModificar+"|"+tempo[1]+"|"+tempo[2]+"|"+tempo[3]+"|"+tempo[4]);
            }
        }
          EscribirArchivo(Escribir,ruta);
          String ruta3 ="C:\\MEIA\\Listas Usuarios\\ListaUsuario.txt";
          ArrayList<String> Lista = new ArrayList<String>();        
          Lista = listadoNombresUsuario(new File(ruta3));      
          for (int i = 0; i < Lista.size(); i++) 
          {
            String[] tempo = Lista.get(i).split("\\|");
            if(tempo[0].equals(nombreListaInicial)&&tempo[1].equals(usuario))
            {
                Lista.set(i,nombreListaModificar+"|"+tempo[1]+"|"+tempo[2]+"|"+tempo[3]+"|"+tempo[4]);
            }
          }
            EscribirArchivo(Lista,ruta3);
            String ruta4 ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
             ArrayList<String> Usuarios = new ArrayList<String>();
             Usuarios =listadoNombresUsuario(new File(ruta4));   
             for (int i = 0; i < Usuarios.size(); i++) 
             {
              String[] tempo = Usuarios.get(i).split("\\|");
              //1|1.1|amigos|ivanandres|carlos123|0|1
              if(tempo[2].equals(nombreListaInicial)&&tempo[3].equals(usuario))
              {
                  Usuarios.set(i,tempo[0]+"|"+tempo[1]+"|"+nombreListaModificar+"|"+tempo[3]+"|"+tempo[4]+"|"+tempo[5]+"|"+tempo[6]);
              }
             }
             EscribirArchivo(Usuarios,ruta4);
    }
   
     public void EliminarListas(String EliminarLista)
     {        
        String ruta ="C:\\MEIA\\Listas Usuarios\\Bitacora_Lista.txt";        
        String ruta2 ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";         
        ArrayList<String> Escribir =new ArrayList<String>();
        ArrayList<String> Numero =new ArrayList<String>();
        boolean condicion =false;
        if(new File(ruta2).exists())
        {
        Numero = listadoNombresUsuario(new File(ruta2));
        }
        String usuario="";
        Escribir = listadoNombresUsuario(new File(rutaUsuario));
        usuario = Escribir.get(0);
        Escribir.removeAll(Escribir);
        if(new File(ruta).exists())
        {
        Escribir = listadoNombresUsuario(new File(ruta));
        }
        for (int i = 0; i < Escribir.size(); i++) 
        {
            String[] tempo = Escribir.get(i).split("\\|");
            if(tempo[0].equals(EliminarLista)&&tempo[1].equals(usuario))
            {
               Escribir.set(i, EliminarLista+"|"+tempo[1]+"|"+tempo[2]+"|"+tempo[3]+"|0");
            }
        }
          EscribirArchivo(Escribir,ruta);
          String ruta3 ="C:\\MEIA\\Listas Usuarios\\ListaUsuario.txt";
          ArrayList<String> Lista = new ArrayList<String>();        
          Lista = listadoNombresUsuario(new File(ruta3));      
          for (int i = 0; i < Lista.size(); i++) 
          {
            String[] tempo = Lista.get(i).split("\\|");
            if(tempo[0].equals(EliminarLista)&&tempo[1].equals(usuario))
            {
                Lista.set(i,EliminarLista+"|"+tempo[1]+"|"+tempo[2]+"|"+tempo[3]+"|0");
            }
          }
            EscribirArchivo(Lista,ruta3);
            String ruta4 ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
             ArrayList<String> Usuarios = new ArrayList<String>();
             Usuarios =listadoNombresUsuario(new File(ruta4));   
             for (int i = 0; i < Usuarios.size(); i++) 
             {
              String[] tempo = Usuarios.get(i).split("\\|");
              //1|1.1|amigos|ivanandres|carlos123|0|1
              if(tempo[2].equals(EliminarLista)&&tempo[3].equals(usuario))
              {
                  Usuarios.set(i,tempo[0]+"|"+tempo[1]+"|"+EliminarLista+"|"+tempo[3]+"|"+tempo[4]+"|0|0");
              }
             }
            EscribirArchivo(Usuarios,ruta4);
     }
    public void EliminarListaBitacora()
    {
         String ruta ="C:\\MEIA\\Listas Usuarios\\Bitacora_Lista.txt";                
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";         
        ArrayList<String> Escribir =new ArrayList<String>();        
        ArrayList<String> Escribir2 =new ArrayList<String>();        
        String usuario="";        
        Escribir = listadoNombresUsuario(new File(rutaUsuario));
        usuario = Escribir.get(0);
        Escribir.removeAll(Escribir);
        if(new File(ruta).exists())
        {
        Escribir = listadoNombresUsuario(new File(ruta));
            for (int i = 0; i < Escribir.size(); i++) 
            {
                String[] tempo = Escribir.get(i).split("\\|");
                //modificando|ivanandres|lista cualquiera|3|1
                if(tempo[4].equals("1"))
                {
                 Escribir2.add(Escribir.get(i));
                }
            }
        }
        EscribirArchivo(Escribir2,ruta);
    }
  
}
