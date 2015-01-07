/**
 * EpisysWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public interface EpisysWS extends javax.xml.rpc.Service {
    public String getEpisysWSHttpSoap12EndpointAddress();

    public com.tesco.priceintegrity.episysapi.EpisysWSPortType getEpisysWSHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException;

    public com.tesco.priceintegrity.episysapi.EpisysWSPortType getEpisysWSHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public String getEpisysWSHttpSoap11EndpointAddress();

    public com.tesco.priceintegrity.episysapi.EpisysWSPortType getEpisysWSHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public com.tesco.priceintegrity.episysapi.EpisysWSPortType getEpisysWSHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
