package au.gov.nsw.transport.nai.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import au.gov.nsw.transport.nai.sensorimpl;

@Configuration
public class WebServiceConfig {
	
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint()
	{
		EndpointImpl endpoint = new EndpointImpl(bus, new sensorimpl());
		endpoint.publish("/sensor");
		return endpoint;
	}
	
	@Bean
	  public LoggingFeature loggingFeature() {
	    LoggingFeature loggingFeature = new LoggingFeature();
	    loggingFeature.setPrettyLogging(true);
	    

	    return loggingFeature;
	  }

}
