package primerproyecto.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/*Desde aca se manda la Alerta*/
public class Notificador extends Thread {

    private Connection C1;

    public Notificador(Connection conn) {
        this.C1 = conn;
    }

    public void run() {
        while (true) {
            try {
                Statement stmt = C1.createStatement();
                stmt.execute("NOTIFY mymessage");
                stmt.close();
                Thread.sleep(2000);
            } catch (SQLException | InterruptedException sqle) {
                sqle.printStackTrace();
            }
        }
    }
}
