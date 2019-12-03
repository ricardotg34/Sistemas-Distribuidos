/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathclient;

import mathfunctions.Operaciones;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


/**
 *
 * @author ricardotg
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.rmi.NotBoundException
     * @throws java.net.MalformedURLException
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        Operaciones op = (Operaciones) Naming.lookup("RicardoTG");
        int a [] = {5,4,2,5,7,3,2,9,10};
        System.out.println(op.suma(6, 6));
        System.out.println(op.resta(5, 3));
        System.out.println(op.producto(5, 97));
        System.out.println(op.division(18, 8));
        System.out.println(op.promedio(a));
        System.out.println(op.factorial(6));
        int [] f = op.fibo(12);
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i]+" ");
        }
        
    }
    
}
