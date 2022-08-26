package control;

import model.DAO.PenDriveDAO;
import model.PenDrive;


public class PenDriveController {
    public void cadastar(){
        PenDrive p1 = new PenDrive();
        PenDriveDAO pddao = new PenDriveDAO();
        pddao.inserirPenDrive(p1);
        
    }
    
    
            
}
