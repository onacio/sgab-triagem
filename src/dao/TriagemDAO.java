package dao;

import jdbc.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import models.TriagemModel;

/**
 *
 * @author Onacio
 */
public class TriagemDAO {  
    private Connection conn;
    
    public TriagemDAO(){
        this.conn = new Conexao().pegarConexao();        
    }
    
    public void salvar(TriagemModel obj){
        
        try {
            String sql = "INSERT INTO coleta (dt_registro, nome, tipo, dt_nascimento, dt_coleta, unidade) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(0, obj.getDt_registro());
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getTipo());
            stmt.setString(3, obj.getDt_nascimento());
            stmt.setString(4, obj.getDt_coleta());
            stmt.setString(5, obj.getUnidade());
            
            stmt.execute();
            
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco " + e.getMessage());            
        }        
    }
}
