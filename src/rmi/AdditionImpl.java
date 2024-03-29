package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdditionImpl extends UnicastRemoteObject implements AdditionInterface {
    protected AdditionImpl() throws RemoteException {
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public boolean isPalindrome(String a) throws RemoteException {
        String b = "";
        for (char c : a.toCharArray()) {
            b = c + b;
        }
        return a.equals(b);
    }

    @Override
    public int factorial(int num) throws RemoteException {
        int fact = 1;
        while (num > 0) {
            fact *= fact * num;
            num--;
        }
        return fact;
    }
}


