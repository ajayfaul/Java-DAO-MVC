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
import java.sql.SQLException;
import java.util.List;

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
        
        
        PelangganDao dao = KingBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan = dao.getPelanggan("muhammadfajarm@gmail.com");
        System.out.println("Nama "+ pelanggan.getNama());
    }
}
