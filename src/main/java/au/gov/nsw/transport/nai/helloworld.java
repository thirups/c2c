package au.gov.nsw.transport.nai;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
@Features(features = "org.apache.cxf.ext.logging.LoggingFeature")
/**https://codenotfound.com/apache-cxf-logging-soap-request-response-fault-messages-example.html*/ 
public class helloworld {

	@WebMethod
	
	public String hello() {
		return "hello";
	}

}
