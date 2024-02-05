package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        Object object = Naming.lookup("rmi://localhost:1099/service");
        AdditionInterface additionInterface = (AdditionInterface) object;
        System.out.println(additionInterface.add(3, 5));
        System.out.println(additionInterface.isPalindrome("madam"));
    }
}