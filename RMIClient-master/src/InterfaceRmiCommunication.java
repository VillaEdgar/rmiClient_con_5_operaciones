


import java.rmi.*;

public interface InterfaceRmiCommunication extends Remote 
{
    Integer getSuma(int num1, int num2) throws RemoteException;
    Integer getResta(int num1, int num2) throws RemoteException; 
    Integer getDiv(int num1, int num2) throws RemoteException; 
    Integer getMulti(int num1, int num2) throws RemoteException;
    double getPo(double num1, double num2) throws RemoteException;
}
