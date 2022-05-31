/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.ParcelamentoVenda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class ParcelamentoVendaDAO {

    Conexao conex = new Conexao();

    public void SalvarParcela(ParcelamentoVenda parcela) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tb_parcela_venda (cod_venda, valor_venda, valor_total, valor_parcelas, numero_parcela, data_vencimento) values (?,?,?,?,?,?)");
            pst.setInt(1, parcela.getCodVenda());
            pst.setFloat(2, parcela.getValor_venda());
            pst.setFloat(3, parcela.getValor_total());
            pst.setFloat(4, parcela.getValorParcela());
            pst.setInt(5, parcela.getNumeroParc());
            pst.setString(6, parcela.getDataVencimento());
            pst.execute();
           // JOptionPane.showMessageDialog(null, "Parcelas Salvas");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao salvar as parcelas\nERRO:"+ex);
        }
        conex.desconecta();
    }

}
