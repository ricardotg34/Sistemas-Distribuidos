/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfunctions;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Alumno
 */
public class OpImp extends UnicastRemoteObject implements Operaciones{
    
    public OpImp() throws RemoteException{
        super ();
    }

    @Override
    public int suma(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int resta(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int producto(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public float division(int a, int b) throws RemoteException {
        return a/b;
    }

    @Override
    public float promedio(int[] a) throws RemoteException {
        float s = 0;
        for (int i = 0; i < a.length; i++)
            s+=a[i];
        return s/a.length;
    }

    @Override
    public int factorial(int a) throws RemoteException {
        if(a == 0 || a == 1 )
            return 1;
        else return a * factorial(a - 1);
    }

    @Override
    public int[] fibo(int a) throws RemoteException {
        int f [] = new int[a];
        f[0]= 0;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i-1]+f[i-2];
        }
        return f;
    }

    //filas a.length columas a[].length
    @Override
    public int[][] matProd(int[][] A, int[][] B) throws RemoteException {
        int [][]R = null;
        if (A[0].length == B.length) {
            R = new int[A.length][B[0].length];
            for (int i = 0; i < R.length; i++)
                for (int j = 0; j < R[0].length; j++)
                    for (int k = 0; k < B.length; k++)
                        R[i][j]+= A[i][k]*B[k][j];
        }
        return R;
    }

    @Override
    public int prodPunto(int[] a, int[] b) throws RemoteException {
        int p = 0;
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++) {
                p+= a[0]*b[0];
            }
        }
        return p;
    }
    
}
