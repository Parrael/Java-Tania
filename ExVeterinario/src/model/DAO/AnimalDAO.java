package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Animal;

public class AnimalDAO {
    Connection con;
    
    public void insereAnimal(Animal a1) throws SQLExpection{
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
}
