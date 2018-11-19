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

public class SegundoProyectoInsercion 
{
    public ArrayList<String> listadoNombresUsuario(File archivo){
         
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
     
    public void IndiceListaUsuario(String agregarUsuario,String ListaActual,String descripcion)
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
        Usuarios.add(Usuarios.size()+"|1."+Usuarios.size()+"|"+ListaActual+"|"+usuario+"|"+agregarUsuario+"|"+"0|1");
        Lista = OrdenarUsuarios(Usuarios,usuario,ListaActual);
        EscribirArchivo(Lista,ruta);
        ActualizarBitacoraLista();
        Desc_Indice();
        ListaUsuarios(ListaActual,agregarUsuario,descripcion);
        Desc_ListaUsuario();
    }
    
     public ArrayList<String> OrdenarUsuarios(ArrayList<String> ListaUsuarios,String usuarioActual,String listaActual)
    {   
        
         ArrayList<String> ListaUsuario = new ArrayList<String>();
        for (int i = 0; i < ListaUsuarios.size(); i++) 
        {            
            String[] tempo = ListaUsuarios.get(i).split("\\|");
           if(tempo[3].equals(usuarioActual) && tempo[2].equals(listaActual))
           {
               ListaUsuario.add(ListaUsuarios.get(i));
           }            
        }
        ArrayList<String> Lista = new ArrayList<String>();
        ArrayList<String> Lista2 = new ArrayList<String>();
        ArrayList<String> Lista3 = new ArrayList<String>(); 
        
          for (int i = 0; i < ListaUsuarios.size(); i++) 
                   {
                        String[] tempo = ListaUsuarios.get(i).split("\\|");
                        Lista.add(tempo[4]+"|"+tempo[2]+"|"+tempo[3]);                        
                   }  
           for (int i = 0; i < ListaUsuario.size(); i++) 
                   {
                        String[] tempo = ListaUsuario.get(i).split("\\|");
                           if(tempo[6].equals("1"))
                        {
                        Lista2.add(tempo[4]+"|"+tempo[2]+"|"+tempo[3]);                        
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
           
          for (int i = 0; i < ListaUsuarios.size(); i++) 
                   {
                        String[] tempo = ListaUsuarios.get(i).split("\\|");
                        for (int j = 0; j < Lista3.size(); j++) 
                        {
                           String[] tempo2 = Lista3.get(j).split("\\|");           
                            if(tempo[4].equals(tempo2[0]))
                                    {
                                        int d = i+1;                                              
                                        String v =d +"|"+"1."+d+"|"+tempo[2]+"|"+tempo[3]+"|"+tempo2[0]+"|"+tempo2[3]+"|"+tempo[6];                                        
                                        ListaUsuarios.set(i,v);
                                    }
                        }                                                
                   }        
          return ListaUsuarios;
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
        ActualizarBitacoraLista();
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
        
    private void ListaUsuarios(String NombreLista,String UsuarioAñadido,String descripcion)
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
        Lista.add(NombreLista+"|"+Usuario+"|"+UsuarioAñadido+"|"+descripcion+"|"+"1");  
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
                if(tempo[6].equals("0"))
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
                if(tempo[4].equals("0"))
                {
                inactivos++;
                }                                
            }    
        }
        
        Escribir.add("Usuario actual: "+ usuario);
        Escribir.add("Fecha creaciÃ³n: "+ fechaCreacion);
        Escribir.add("Numero de registros: "+ registros);
        Escribir.add("Numero activos: "+ activos);
        Escribir.add("Numero inactivos: "+ inactivos);
        
        EscribirArchivo(Escribir,ruta1);
    }
    
    public ArrayList<String> MostrarUsuarios()
    {
        
             String path = "C:/MEIA/bitacora_usuario.txt";  
          String path2 = "C:/MEIA/usuario.txt";         
          SegundoProyectoInsercion m =new SegundoProyectoInsercion();
          ArrayList<String> list = new ArrayList<String>();
          
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
              list.add(tempo[0]);              
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
              list.add(tempo[0]);              
          }
                        
          }
              return list;
    }
    
    public boolean ValidarUsuario(String nombre)
    {
        ArrayList<String>validar = new ArrayList<>();
        validar = MostrarUsuarios();
        
        boolean condicion =false;
        for (int i = 0; i < validar.size(); i++) 
        {
            if(validar.get(i).equals(nombre))
            {
                condicion = true;
            }
        }
        return condicion;
    }
    
    public boolean ValidarAgregarUsuario(String nombreLista)
    {
        boolean condicion =false;
        ArrayList<String> Lista = new ArrayList<String>();               
        String ruta="C:\\MEIA\\Listas Usuarios\\Bitacora_Lista.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";         
        Lista = listadoNombresUsuario(new File(rutaUsuario));
        String usuario = Lista.get(0);
        Lista.removeAll(Lista);
        
        if(new File(ruta).exists())
        {
            Lista = listadoNombresUsuario(new File(ruta));
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
   
   public void ModificarUsuario(String modificar,String lista,String index)
   {
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt"; 
        String ruta ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
        String ruta2 ="C:\\MEIA\\Listas Usuarios\\ListaUsuario.txt";
        ArrayList<String> Usuarios = new ArrayList<String>();
        ArrayList<String> Lista = new ArrayList<String>();             
        ArrayList<String> Lista2 = new ArrayList<String>();   
        
        String usuario ="";
        Lista = listadoNombresUsuario(new File(rutaUsuario));       
        usuario = Lista.get(0);
        Lista.removeAll(Lista);
        
         if(new File(ruta).exists())
        {
        Usuarios =listadoNombresUsuario(new File(ruta));  
        Lista2 = listadoNombresUsuario(new File(ruta2));
        }
      String[] tempo = Usuarios.get(Integer.parseInt(index)-1).split("\\|");
      String nuevoElemento = tempo[0]+"|"+tempo[1]+"|"+tempo[2]+"|"+ usuario+"|"+modificar+"|"+tempo[5]+"|"+tempo[6];                          
      Usuarios.set(Integer.parseInt(index)-1,nuevoElemento);      
      Lista = OrdenarUsuarios(Usuarios,usuario,lista);
      EscribirArchivo(Lista,ruta);
        String[] tempo2 = Lista.get(Integer.parseInt(index)-1).split("\\|");        
        Lista2.set(Integer.parseInt(index)-1, lista+"|"+usuario+"|"+modificar+"|Modificado "+ modificar+"|"+tempo2[6]);        
        EscribirArchivo(Lista2,ruta2);
   }
   
 public boolean ValidarModificacion(String lista, String modificar,String posicion)
 {
     boolean condicion =true;
     int index = Integer.parseInt(posicion)-1;
     String rutaUsuario = "C:/MEIA/UsuarioActual.txt"; 
     String ruta ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";        
     ArrayList<String> Usuarios = new ArrayList<String>();
     ArrayList<String> Lista = new ArrayList<String>();             
     ArrayList<String> NombresUsuarios = new ArrayList<String>();           
     String usuario ="";
     Lista = listadoNombresUsuario(new File(rutaUsuario));       
     usuario = Lista.get(0);
     Lista.removeAll(Lista);
     
     if(new File(ruta).exists())
     {
       NombresUsuarios= listadoNombresUsuario(new File(ruta));              
       for (int i = 0; i < NombresUsuarios.size(); i++) 
     {
         String tempo[]=NombresUsuarios.get(i).split("\\|");
         if(tempo[2].equals(lista)&&tempo[3].equals(usuario)&&tempo[4].equals(modificar))
         {
             condicion =false;
             break;
         }
             
     }
      
     String[] tempo = NombresUsuarios.get(index).split("\\|");
     if(tempo[6].equals("0"))
     {
         condicion =false;
     }
     
       
     }
     
     
     
     return condicion;
 }
 
 public ArrayList<String> Reogarnizacion(ArrayList<String> Usuarios, ArrayList<String> ListasUsuarios)
 {
         ArrayList<String> NuevaLista = new ArrayList<String>();
             for (int i = 0; i < Usuarios.size(); i++) 
         {
            String[] tempo = Usuarios.get(i).split("\\|");
            if(tempo[6].equals("1"))
            {
                int index =0;
                NuevaLista.add("probando");
                index=NuevaLista.size();
                NuevaLista.remove("probando");
                NuevaLista.add((index)+"|1."+(index)+"|"+tempo[2]+"|"+tempo[3]+"|"+tempo[4]+"|"+tempo[5]+"|"+tempo[6]);
            }
         }
         int index= 0;
         
         do
         {             
            
             ArrayList<String> ListaTempo = new ArrayList<String>(); 
             ArrayList<String> ListaTempo2 = new ArrayList<String>();
             String[] tempo = ListasUsuarios.get(index).split("\\|"); 
             String usuario =tempo[1];             
             String ListaActual = tempo[0];
             ListaTempo = OrdenarUsuarios(NuevaLista, usuario,ListaActual);
             for (String d:ListaTempo) 
             {
                 ListaTempo2.add(d);
             }
             NuevaLista.clear();
                 for (String d:ListaTempo2) 
             {
                 NuevaLista.add(d);
             }
             index++;
             
         }
         while(index!= ListasUsuarios.size());
         return NuevaLista;
    }
 
 public void CerrarAplicacion()
 {
         SegundoProyectoEliminacion s = new SegundoProyectoEliminacion();
         ArrayList<String> Usuarios = new ArrayList<String>();
         ArrayList<String> NuevaLista = new ArrayList<String>();
         ArrayList<String> ListasUsuarios = new ArrayList<String>();
         String ruta ="C:\\MEIA\\Listas Usuarios\\IndiceListaUsuario.txt";
         String ruta2="C:\\MEIA\\Listas Usuarios\\Bitacora_Lista.txt";
           if(new File(ruta).exists())
        {
        Usuarios =listadoNombresUsuario(new File(ruta));        
        ListasUsuarios = listadoNombresUsuario(new File(ruta2));
        }
         NuevaLista = Reogarnizacion(Usuarios, ListasUsuarios);
         
           ArrayList<String> ListasUsuarios2 = new ArrayList<String>();
         ArrayList<String> NuevaListasUsuarios = new ArrayList<String>();         
         String ruta3 ="C:\\MEIA\\Listas Usuarios\\ListaUsuario.txt";
         ListasUsuarios2 =listadoNombresUsuario(new File(ruta3));   
         for (int i = 0; i < ListasUsuarios2.size(); i++) 
         {
            String[] tempo = ListasUsuarios2.get(i).split("\\|");
            if(tempo[4].equals("1"))
            {
                NuevaListasUsuarios.add(ListasUsuarios2.get(i));
            }
         }
         s.EliminarListaBitacora();
         EscribirArchivo(NuevaLista,ruta);
         EscribirArchivo(NuevaListasUsuarios,ruta3);
         ActualizarBitacoraLista();
         Desc_Indice();
         Desc_ListaUsuario();
         
 }
 
 public String Index(String lista,String usuariomodificar)
 {    
        String ruta ="C:\\MEIA\\Listas Usuarios\\ListaUsuario.txt";
        String rutaUsuario = "C:/MEIA/UsuarioActual.txt";                 
        String Usuario ="";      
        ArrayList<String> Lista = new ArrayList<String>();        
        Lista = listadoNombresUsuario(new File(rutaUsuario));       
        Usuario = Lista.get(0);
        Lista.removeAll(Lista);        
        Lista =listadoNombresUsuario(new File(ruta));
        String v = lista+usuariomodificar+Usuario;
        String index="";
        for (int i = 0; i < Lista.size(); i++) 
        {
            String[] tempo = Lista.get(i).split("\\|");
            String validar = tempo[0]+tempo[2]+tempo[1];
            if(validar.equals(v))
            {
                index =i+"";
                break;
            }
        }
    return index;
 }
 
   public boolean ValidarIngresoUsuario(String nombre)
    {
        boolean condicion =false;
          String rutaUsuario = "C:/MEIA/UsuarioActual.txt";                 
        String Usuario ="";   
        ArrayList<String>Lista = listadoNombresUsuario(new File(rutaUsuario));  
             Usuario = Lista.get(0);
             if(Usuario.equals(nombre))
             {
                 condicion =true;
             }
        return condicion;
    }
}
