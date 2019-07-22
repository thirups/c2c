package au.gov.nsw.transport.nai;

import javax.xml.ws.Holder;

import org.apache.cxf.feature.Features;
import org.ntcip.c2c_message_administration.C2CMessageReceipt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

import au.gov.nsw.transport.tmc.schemas.software_component.soapheader.v1.MsgContextCType;
import au.gov.nsw.transport.tmc.services.entity.devices.sensor_v0.ErrorReport;
import au.gov.nsw.transport.tmc.services.entity.devices.sensor_v0.SensorPortTypeV0P1;
import au.gov.nsw.transport.tmc.services.entity.devices.sensor_v0p1.PublishDetectorData;
import au.gov.nsw.transport.tmc.services.entity.devices.sensor_v0p1.PublishDetectorDataResponse;

@Features(features = "org.apache.cxf.ext.logging.LoggingFeature")
public class sensorimpl implements SensorPortTypeV0P1 {

	@Override
	public PublishDetectorDataResponse publishDetectorData(PublishDetectorData message, Holder<MsgContextCType> header)
	{
		
	System.out.println(message);
	System.out.println(header);
	
	PublishDetectorDataResponse ts = new PublishDetectorDataResponse();
	C2CMessageReceipt recepit = new C2CMessageReceipt();
	recepit.setInformationalText("this is test1");

	ts.setC2CMessageReceipt(recepit);
	ObjectMapper mapper = new ObjectMapper();
    
	
	AnnotationIntrospector introspector= new JaxbAnnotationIntrospector(mapper.getTypeFactory());   
	mapper.setAnnotationIntrospector(introspector);
	String result_json = null;
	try {
		result_json = mapper.writeValueAsString(message);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(result_json);

	return ts;
	}


}
