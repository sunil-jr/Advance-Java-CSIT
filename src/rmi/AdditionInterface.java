package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AdditionInterface extends Remote {
    int add(int a, int b) throws RemoteException;
    boolean isPalindrome(String a) throws RemoteException;

    int factorial(int num) throws RemoteException;

}
