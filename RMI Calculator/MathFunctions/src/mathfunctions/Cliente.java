/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfunctions;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Alumno
 */
public class Cliente {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        Operaciones op = (Operaciones) Naming.lookup("RicardoTG");
        System.out.println(op.suma(6, 6));
        System.out.println(op.resta(5, 3));
    }
}
