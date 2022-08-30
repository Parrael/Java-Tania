package control;

import model.DAO.PenDriveDAO;
import model.PenDrive;
import java.sql.SQLException;
import java.util.ArrayList;


public class PenDriveController {
    public void cadastar() throws SQLException{
        PenDrive p1 = new PenDrive();
        PenDriveDAO pddao = new PenDriveDAO();
        pddao.inserirPenDrive(p1);  
    }
    
}
