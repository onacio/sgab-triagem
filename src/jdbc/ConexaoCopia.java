//package jdbc;;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
///**
// *
// * @author Onacio
// */
//public class Conexao {
//    final private String url = "jdbc:mysql://localhost/banco";
//    final private String usuario = "root";
//    final private String senha = "";
//    
//    public Connection pegarConexao(){
//        try {
//            return DriverManager.getConnection(url, usuario, senha);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco");
//        }
//        return null;
//    }    
//}
