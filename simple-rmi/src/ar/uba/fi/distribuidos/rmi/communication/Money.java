package ar.uba.fi.distribuidos.rmi.communication;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Money extends Remote {
  double getValue() throws RemoteException;
  String getCurrency() throws RemoteException;
  void setValue(double v) throws RemoteException;
  void setCurrency(String c) throws RemoteException;
}

