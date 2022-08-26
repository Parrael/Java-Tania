package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
/*import java.sql.ResultSet;*/
import java.sql.SQLException;
/*import java.util.ArrayList;*/
import model.PenDrive;

public class PenDriveDAO {
    Connection con;
    
    public void inserirPenDrive (PenDrive p1) throws SQLException{
        con = new Conexao().getConnection();
        String sql = "Insert into PenDrive (ARMAZENAMENTO, MARCA, PRECO, GARANTIA, CODIGO) values (?,?,?,?,?)";
        
    }
}
