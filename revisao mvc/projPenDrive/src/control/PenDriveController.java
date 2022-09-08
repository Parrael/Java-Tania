package control;

import model.DAO.PenDriveDAO;
import model.PenDrive;
import java.sql.SQLException;
import java.util.ArrayList;


public class PenDriveController {
    protected ArrayList<PenDrive> listaPD;
    
    public PenDriveController()
    {
        listaPD = new ArrayList<>();
    }
    
    public void cadastar(int armazenamento, String marca, double preco, int garantia, String codigo) throws SQLException{
        PenDrive p1 = new PenDrive(armazenamento, marca, preco, garantia, codigo);
        PenDriveDAO pddao = new PenDriveDAO();
        pddao.inserirPenDrive(p1);  
    }
    
    public ArrayList<PenDrive> mostrar (String codigo, int tipo) throws SQLException
    {
        PenDriveDAO pddao = new PenDriveDAO();
        return pddao.mostrar(codigo, tipo);
    }
    public void excluir (String codigo) throws SQLException
    {
        PenDriveDAO pddao = new PenDriveDAO();
        pddao.excluir(codigo);
    }
}
