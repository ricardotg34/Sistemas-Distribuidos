/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfunctions;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.AllPermission;



/**
 *
 * @author Alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args) throws RemoteException {
        
        try {
            Registry r = LocateRegistry.createRegistry(1099);
            Operaciones op = new OpImp();
            r.bind("RicardoTG", op);
            System.out.println("Service Ready");
        } catch (AlreadyBoundException | AccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
