package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*import java.sql.ResultSet;*/
import java.sql.SQLException;
import java.util.ArrayList;
/*import java.util.ArrayList;*/
import model.PenDrive;

public class PenDriveDAO {
    Connection con;
    
    public void inserirPenDrive (PenDrive p1) throws SQLException{
        con = new Conexao().getConnection();
        String sql = "Insert into PenDrive (ARMAZENAMENTO, MARCA, PRECO, GARANTIA, CODIGO) values (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt (1, p1.getArmazenamento());
        stmt.setString (2, p1.getMarca());
        stmt.setDouble (3, p1.getPreco());
        stmt.setInt (4, p1.getGarantia());
        stmt.setString (5, p1.getCodigo());
        stmt.execute();
        stmt.close();
        con.close();
    }
    public void excluir (String codigo) throws SQLException{
        con = new Conexao().getConnection();
        String sql = "DELETE FROM PenDrive WHERE codigo = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(5, codigo);
        stmt.execute();
        stmt.close();
        con.close();
    }
    public ArrayList<PenDrive> mostrarEspecifico (String codigo) throws SQLException{
        ResultSet rs;
        ArrayList<PenDrive> listaP = new ArrayList();
        con = new Conexao().getConnection();
        if(codigo.isEmpty()){
            String sql = "SELECT * FROM PenDrive";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){
                int armazenamento = rs.getInt("ARMAZENAMENTO");
                String marca = rs.getString("MARCA");
                double preco = rs.getDouble("PRECO");
                int garantia = rs.getInt("GARANTIA");
                String cod = rs.getString("CODIGO");
                PenDrive p1 = new PenDrive(armazenamento, marca, preco, garantia, cod);
                listaP.add(p1);
            }
            stmt.close();
        }else{
            String sql = "SELECT * FROM PenDrive WHERE NOME like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(5, codigo);
            rs = stmt.executeQuery();
            while(rs.next()){
                int armazenamento = rs.getInt("ARMAZENAMENTO");
                String marca = rs.getString("MARCA");
                double preco = rs.getDouble("PRECO");
                int garantia = rs.getInt("GARANTIA");
                String cod = rs.getString("CODIGO");
                PenDrive p1 = new PenDrive(armazenamento, marca, preco, garantia, cod);
                listaP.add(p1);
            }
            stmt.close();
        }
        con.close();
        return listaP;
    } 
}   
