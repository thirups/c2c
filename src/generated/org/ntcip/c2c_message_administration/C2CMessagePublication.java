//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.17 at 12:33:25 PM AEST 
//


package org.ntcip.c2c_message_administration;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C2cMessagePublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C2cMessagePublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informationalText" type="{http://www.ntcip.org/c2c-message-administration}InformationalText" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionID" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionID"/&gt;
 *         &lt;element name="subscriptionName" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionName" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionFrequency" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionFrequency" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionCount" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionCount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C2cMessagePublication", propOrder = {
    "informationalText",
    "subscriptionID",
    "subscriptionName",
    "subscriptionFrequency",
    "subscriptionCount"
})
@XmlRootElement(name = "c2cMessagePublication")
public class C2CMessagePublication
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected String informationalText;
    @XmlElement(required = true)
    protected String subscriptionID;
    protected String subscriptionName;
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionFrequency;
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionCount;

    /**
     * Gets the value of the informationalText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationalText() {
        return informationalText;
    }

    /**
     * Sets the value of the informationalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationalText(String value) {
        this.informationalText = value;
    }

    /**
     * Gets the value of the subscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionID(String value) {
        this.subscriptionID = value;
    }

    /**
     * Gets the value of the subscriptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * Sets the value of the subscriptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionName(String value) {
        this.subscriptionName = value;
    }

    /**
     * Gets the value of the subscriptionFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriptionFrequency() {
        return subscriptionFrequency;
    }

    /**
     * Sets the value of the subscriptionFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriptionFrequency(Long value) {
        this.subscriptionFrequency = value;
    }

    /**
     * Gets the value of the subscriptionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriptionCount() {
        return subscriptionCount;
    }

    /**
     * Sets the value of the subscriptionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriptionCount(Long value) {
        this.subscriptionCount = value;
    }

}
