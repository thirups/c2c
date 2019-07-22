//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.17 at 12:33:25 PM AEST 
//


package org.ntcip.c2c_message_administration;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ntcip.c2c_message_administration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ntcip.c2c_message_administration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link C2CMessagePublication }
     * 
     */
    public C2CMessagePublication createC2CMessagePublication() {
        return new C2CMessagePublication();
    }

    /**
     * Create an instance of {@link C2CMessageReceipt }
     * 
     */
    public C2CMessageReceipt createC2CMessageReceipt() {
        return new C2CMessageReceipt();
    }

    /**
     * Create an instance of {@link C2CMessageSubscription }
     * 
     */
    public C2CMessageSubscription createC2CMessageSubscription() {
        return new C2CMessageSubscription();
    }

    /**
     * Create an instance of {@link SubscriptionAction }
     * 
     */
    public SubscriptionAction createSubscriptionAction() {
        return new SubscriptionAction();
    }

    /**
     * Create an instance of {@link SubscriptionType }
     * 
     */
    public SubscriptionType createSubscriptionType() {
        return new SubscriptionType();
    }

    /**
     * Create an instance of {@link SubscriptionTimeFrame }
     * 
     */
    public SubscriptionTimeFrame createSubscriptionTimeFrame() {
        return new SubscriptionTimeFrame();
    }

    /**
     * Create an instance of {@link BroadcastAlerts }
     * 
     */
    public BroadcastAlerts createBroadcastAlerts() {
        return new BroadcastAlerts();
    }

    /**
     * Create an instance of {@link AuthorizationSet }
     * 
     */
    public AuthorizationSet createAuthorizationSet() {
        return new AuthorizationSet();
    }

}
