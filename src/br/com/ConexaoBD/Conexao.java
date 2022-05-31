package br.com.ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Otavio
 */
public class Conexao {

    public Statement stm;
    public ResultSet rs;
    public Connection con;
    private final String caminho = "jdbc:mysql://localhost:3306/flex";
    private final String usuario = "root";
    private final String senha = "";
    

    public void conexao() {
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            System.out.println("conectado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n" + e.getMessage());
        }
    }

    public void executaSql(String sql) {
        try {
            stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Executar Sql:\n" + e.getMessage());
        }
    }

    public void desconecta() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com bd:\n" + ex.getMessage());
        }
    }
}
