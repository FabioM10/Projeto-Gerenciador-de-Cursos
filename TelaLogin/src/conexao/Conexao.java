package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
/* Digite aqui as informações referentes ao SEU banco de dados.  Os valores “seu_banco”, “seu_usuario” e “sua_senha” devem ser substituídos, respectivamente, pelo nome do seu banco, seu usuário e sua senha do MySQL Workbench */
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "tb_usuario_nome";
    private static String usuario = "root";
    private static String senha = "FabioMdS_04";
    
    public static Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC",
                usuario,
                senha
            );
            
            return c;
        } catch (SQLException e){
            return null;
        }
    }
}

