/**
 * FachadaWSSGSService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincatto.cotacao.ws.servicos;

public interface FachadaWSSGSService extends javax.xml.rpc.Service {

    public String getFachadaWSSGSAddress();

    public FachadaWSSGS getFachadaWSSGS() throws javax.xml.rpc.ServiceException;

    public FachadaWSSGS getFachadaWSSGS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}