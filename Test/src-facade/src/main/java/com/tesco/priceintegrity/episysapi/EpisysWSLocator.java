/**
 * EpisysWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class EpisysWSLocator extends org.apache.axis.client.Service implements com.tesco.priceintegrity.episysapi.EpisysWS {

    public EpisysWSLocator() {
    }


    public EpisysWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EpisysWSLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EpisysWSHttpSoap12Endpoint
    private String EpisysWSHttpSoap12Endpoint_address = "http://172.28.135.88:9080/WebServicesFramework/services/EpisysWS.EpisysWSHttpSoap12Endpoint/";

    public String getEpisysWSHttpSoap12EndpointAddress() {
        return EpisysWSHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private String EpisysWSHttpSoap12EndpointWSDDServiceName = "EpisysWSHttpSoap12Endpoint";

    public String getEpisysWSHttpSoap12EndpointWSDDServiceName() {
        return EpisysWSHttpSoap12EndpointWSDDServiceName;
    }

    public void setEpisysWSHttpSoap12EndpointWSDDServiceName(String name) {
        EpisysWSHttpSoap12EndpointWSDDServiceName = name;
    }

    public com.tesco.priceintegrity.episysapi.EpisysWSPortType getEpisysWSHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EpisysWSHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEpisysWSHttpSoap12Endpoint(endpoint);
    }

    public com.tesco.priceintegrity.episysapi.EpisysWSPortType getEpisysWSHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tesco.priceintegrity.episysapi.EpisysWSSoap12BindingStub _stub = new com.tesco.priceintegrity.episysapi.EpisysWSSoap12BindingStub(portAddress, this);
            _stub.setPortName(getEpisysWSHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEpisysWSHttpSoap12EndpointEndpointAddress(String address) {
        EpisysWSHttpSoap12Endpoint_address = address;
    }


    // Use to get a proxy class for EpisysWSHttpSoap11Endpoint
    private String EpisysWSHttpSoap11Endpoint_address = "http://localhost:8080/WebServicesFramework/services/EpisysWS.EpisysWSHttpSoap11Endpoint/";

    public String getEpisysWSHttpSoap11EndpointAddress() {
        return EpisysWSHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private String EpisysWSHttpSoap11EndpointWSDDServiceName = "EpisysWSHttpSoap11Endpoint";

    public String getEpisysWSHttpSoap11EndpointWSDDServiceName() {
        return EpisysWSHttpSoap11EndpointWSDDServiceName;
    }

    public void setEpisysWSHttpSoap11EndpointWSDDServiceName(String name) {
        EpisysWSHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.tesco.priceintegrity.episysapi.EpisysWSPortType getEpisysWSHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EpisysWSHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEpisysWSHttpSoap11Endpoint(endpoint);
    }

    public com.tesco.priceintegrity.episysapi.EpisysWSPortType getEpisysWSHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tesco.priceintegrity.episysapi.EpisysWSSoap11BindingStub _stub = new com.tesco.priceintegrity.episysapi.EpisysWSSoap11BindingStub(portAddress, this);
            _stub.setPortName(getEpisysWSHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEpisysWSHttpSoap11EndpointEndpointAddress(String address) {
        EpisysWSHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.tesco.priceintegrity.episysapi.EpisysWSPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tesco.priceintegrity.episysapi.EpisysWSSoap12BindingStub _stub = new com.tesco.priceintegrity.episysapi.EpisysWSSoap12BindingStub(new java.net.URL(EpisysWSHttpSoap12Endpoint_address), this);
                _stub.setPortName(getEpisysWSHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
            if (com.tesco.priceintegrity.episysapi.EpisysWSPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tesco.priceintegrity.episysapi.EpisysWSSoap11BindingStub _stub = new com.tesco.priceintegrity.episysapi.EpisysWSSoap11BindingStub(new java.net.URL(EpisysWSHttpSoap11Endpoint_address), this);
                _stub.setPortName(getEpisysWSHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("EpisysWSHttpSoap12Endpoint".equals(inputPortName)) {
            return getEpisysWSHttpSoap12Endpoint();
        }
        else if ("EpisysWSHttpSoap11Endpoint".equals(inputPortName)) {
            return getEpisysWSHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soap.episys.com", "EpisysWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soap.episys.com", "EpisysWSHttpSoap12Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://service.soap.episys.com", "EpisysWSHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("EpisysWSHttpSoap12Endpoint".equals(portName)) {
            setEpisysWSHttpSoap12EndpointEndpointAddress(address);
        }
        else 
if ("EpisysWSHttpSoap11Endpoint".equals(portName)) {
            setEpisysWSHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
