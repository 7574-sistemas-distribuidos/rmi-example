package ar.uba.fi.distribuidos.rmi.communication;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankAccount extends Remote {
  void add(Money m) throws RemoteException;
  void substract (Money m) throws RemoteException;
  Money getBalance() throws RemoteException;
}

