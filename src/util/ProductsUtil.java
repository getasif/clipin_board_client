/**
 * ProductsUtil.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package util;

public interface ProductsUtil extends java.rmi.Remote {
    public java.lang.String[] categories() throws java.rmi.RemoteException;
    public boolean insertBoard(java.lang.String name, java.lang.String description, java.lang.String categories) throws java.rmi.RemoteException;
}
