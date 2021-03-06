/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.14 at 04:34:45 PM PST 
//


package com.microsoft.windowsazure.serviceruntime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleEnvironmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleEnvironmentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Deployment" type="{}DeploymentInfo"/>
 *         &lt;element name="CurrentInstance" type="{}CurrentRoleInstanceInfo"/>
 *         &lt;element name="Roles" type="{}RolesInfo" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleEnvironmentInfo", propOrder = {

})
class RoleEnvironmentInfo {

    @XmlElement(name = "Deployment", required = true)
    protected DeploymentInfo deployment;
    @XmlElement(name = "CurrentInstance", required = true)
    protected CurrentRoleInstanceInfo currentInstance;
    @XmlElement(name = "Roles")
    protected RolesInfo roles;

    /**
     * Gets the value of the deployment property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentInfo }
     *     
     */
    public DeploymentInfo getDeployment() {
        return deployment;
    }

    /**
     * Sets the value of the deployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentInfo }
     *     
     */
    public void setDeployment(DeploymentInfo value) {
        this.deployment = value;
    }

    /**
     * Gets the value of the currentInstance property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentRoleInstanceInfo }
     *     
     */
    public CurrentRoleInstanceInfo getCurrentInstance() {
        return currentInstance;
    }

    /**
     * Sets the value of the currentInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentRoleInstanceInfo }
     *     
     */
    public void setCurrentInstance(CurrentRoleInstanceInfo value) {
        this.currentInstance = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link RolesInfo }
     *     
     */
    public RolesInfo getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolesInfo }
     *     
     */
    public void setRoles(RolesInfo value) {
        this.roles = value;
    }

}
