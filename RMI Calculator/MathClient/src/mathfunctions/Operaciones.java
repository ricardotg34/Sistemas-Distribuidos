/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfunctions;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Alumno
 */
public interface Operaciones extends Remote {
    public int suma(int a, int b) throws RemoteException;
    public int resta(int a, int b)throws RemoteException;
    public int producto(int a, int b)throws RemoteException;
    public float division(int a, int b)throws RemoteException;
    public float promedio(int [] a)throws RemoteException;
    public int factorial(int a)throws RemoteException;
    public int [] fibo(int a)throws RemoteException;
    public int [][] matProd(int [][]A, int [][] B)throws RemoteException;
    public int prodPunto(int []a,int [] b)throws RemoteException;
}
