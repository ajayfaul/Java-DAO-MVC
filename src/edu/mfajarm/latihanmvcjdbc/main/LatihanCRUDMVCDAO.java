/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mfajarm.latihanmvcjdbc.main;

import edu.mfajarm.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.mfajarm.latihanmvcjdbc.entity.Pelanggan;
import edu.mfajarm.latihanmvcjdbc.error.PelangganException;
import edu.mfajarm.latihanmvcjdbc.service.PelangganDao;
import edu.mfajarm.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ajayfaul
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws edu.mfajarm.latihanmvcjdbc.error.PelangganException
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        
            }
        });
    }
}
