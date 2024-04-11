package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Onacio
 */
public class Conexao {
    private Connection conexao;
    
    public boolean pegarConexao(){        
        try {            
            this.conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco " + e.getMessage());
            return false;
        }
        //JOptionPane.showMessageDialog(null, "Conectou com o banco");
        return true;
    }  
    public boolean desconectar(){
        try {
            if(this.conexao.isClosed() == false){
                this.conexao.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar o banco " + e.getMessage());
            return false;
        }
        //JOptionPane.showMessageDialog(null, "Banco desconectado");
        return true;
    }
}
