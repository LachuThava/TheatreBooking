/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theatrebookingsystem;

/**
 *
 * @author User
 */
public class TheatreBookingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SQLConnection connect = new SQLConnection();
        connect.connectToSql();
    }
    
}
