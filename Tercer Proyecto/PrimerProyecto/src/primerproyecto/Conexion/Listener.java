
package primerproyecto.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import primerproyecto.Arbol_Binario.TercerProyecto;
import primerproyecto.Conexion.BDD;
import primerproyecto.Notificacion;


public class Listener extends Thread {
    private Connection Conexion;
    private final org.postgresql.PGConnection pgconn;
    private String id;
    private String GrupoReceptor;
    private String GrupoEmisor;
    private String Receptor;
    private String Emisor;
    private String Asunto;
    private String Mensaje;
    private Notificacion Not;  

    Listener(Connection conn) throws SQLException {
		this.Conexion = conn;
		this.pgconn = (org.postgresql.PGConnection)conn;
		Statement stmt = conn.createStatement();
		stmt.execute("LISTEN q_event");
		stmt.close();
    }

    public void run() {
        while (true) {
            try {
                //Escucha en la base de Datos para ver si hay mensajes nuevos
                Statement stmt = Conexion.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT 1"); 
                rs.close();
                stmt.close();

	       //Recibe las notificaciones de JDBC
                org.postgresql.PGNotification notifications[] = pgconn.getNotifications();
                if (notifications != null) {
                    for (int i=0; i<notifications.length; i++) {
                        //Aca se recibe cada una de las notificaciones de Postgresql notifications[i] para luego descomponer el json que se recibe
                        String parameter = notifications[i].getParameter().replace("\\","");
                        String action = parameter.split("\\{")[1].split(",")[1].split(":")[1].substring(2,8);   
                                          
                        if(action.equals("INSERT")){
                        //Se comprueba si el correo es para mi
                            id = parameter.split("\\{")[2].replace("}","").split(",")[0].split(":")[1];                       
                            GrupoEmisor = parameter.split("\\{")[2].replace("}","").split(",")[1].split(":")[1];  
                            GrupoReceptor = parameter.split("\\{")[2].replace("}","").split(",")[2].split(":")[1];
                            Emisor = parameter.split("\\{")[2].replace("}","").split(",")[3].split(":")[1];
                            Receptor = parameter.split("\\{")[2].replace("}","").split(",")[4].split(":")[1];
                            Receptor = Receptor.replaceAll("\"", "");
                            Asunto = parameter.split("\\{")[2].replace("}","").split(",")[6].split(":")[1];
                            Mensaje = parameter.split("\\{")[2].replace("}","").split(",")[7].split(":")[1];
  
                            boolean existe = false;
                            
                            if(GrupoReceptor.equals("5"))
                            {
                                //si es para mi se envia el update con la respuesta                                                                                             
                                //ACA USTEDES DEBEN GESTIONAR A DONDE ENVIAR LOS DATOS OBTENIDOS DE LA NOTIFICACION PARA MOSTRARLOS EN LA BANDEJA DE ENTRADA
                                TercerProyecto t = new TercerProyecto();
                                existe = t.ValidarUsuario(Receptor);
                                //si es para mi enviar el update con la respuesta de que el usuario existe
                                //Deben de validar cada uno si el usuario existe o no en su ordenador y enviar la respuesta de esta forma al servidor
                                if(existe)
                                {
                                    BDD.getInstancia().Update(id, existe);
                                    BDD.getInstancia().setMensaje("El Grupo " + GrupoEmisor + " te ha enviado un Correo." );
                                    TercerProyecto py = new TercerProyecto();
                                    DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                    LocalDateTime now = LocalDateTime.now();
                                    String fecha = dtf.format(now)+"";
                                    String emi = Emisor;
                                    String receptor = Receptor;
                                    py.ArchivoTipoArbolBinario(emi,receptor,Mensaje,Asunto,"Conexion",fecha,"1");                                             
                                Not = new Notificacion();
                                Not.setVisible(true);
                                }
                                else
                                {
                                    BDD.getInstancia().Update(id, existe);
                                     //BDD.getInstancia().setMensaje("El Grupo " + GrupoEmisor + " ha enviado un correo a un usuario inexistente" );
                                Not = new Notificacion();
                                Not.setVisible(true);
                                }                                        
                            }
                        }else
                        {
                            
                            id = parameter.split("\\{")[2].replace("}","").split(",")[0].split(":")[1];                       
                            GrupoEmisor = parameter.split("\\{")[2].replace("}","").split(",")[1].split(":")[1];  
                            GrupoReceptor = parameter.split("\\{")[2].replace("}","").split(",")[2].split(":")[1];
                            Emisor = parameter.split("\\{")[2].replace("}","").split(",")[3].split(":")[1];
                            Receptor = parameter.split("\\{")[2].replace("}","").split(",")[4].split(":")[1];
                            Receptor = Receptor.replaceAll("\"", "");
                            Emisor = Emisor.replaceAll("\"", "");
                            Asunto = parameter.split("\\{")[2].replace("}","").split(",")[6].split(":")[1];
                            Mensaje = parameter.split("\\{")[2].replace("}","").split(",")[7].split(":")[1];
                            
                            //Aca deben de colocar su numero de Grupo 
                            if(GrupoEmisor.equals("5")){
				TercerProyecto t = new TercerProyecto();
                                
                                String respuesta = parameter.split("\\{")[2].replace("}","").split(",")[8].split(":")[1];
                                 //Comprobar cual fue la respuesta
                                 if(respuesta.equals("false"))
                                 {
                                    BDD.getInstancia().setMensaje("El grupo " + GrupoReceptor + " no ha encontrado el usuario al cual enviaste el correo." );
                                    Not = new Notificacion();                                    
                                    Not.setVisible(true);
                                 }
                                 else
                                 {
                                    DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                    LocalDateTime now = LocalDateTime.now();
                                    String fecha = dtf.format(now)+"";
                                    t.ArchivoTipoArbolBinario(Emisor,Receptor,Mensaje,Asunto,"Conexion",fecha,"1");   
                                    BDD.getInstancia().setMensaje("El grupo " + GrupoReceptor + " ha recibido el mensaje." );
                                    Not = new Notificacion();
                                    Not.setVisible(true);
                                 }                                 
                                 //Para Eliminar la solicitud (NO ES NECESARIO, OPCIONAL)
                                 BDD.getInstancia().Delete(id);
                            }
                        }                                             
                    }
                }
            //Espera para la siguiente Notificacion
                Thread.sleep(500);
            } catch (SQLException | InterruptedException sqle) {
                    sqle.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Listener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
