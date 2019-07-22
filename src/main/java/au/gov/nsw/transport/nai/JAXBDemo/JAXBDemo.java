package au.gov.nsw.transport.nai.JAXBDemo;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.ntcip.c2c_message_administration.C2CMessagePublication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

public class JAXBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JAXBContext context =  JAXBContext.newInstance(C2CMessagePublication.class);
			Marshaller createMarshaller = context.createMarshaller();
			
			C2CMessagePublication c2cExample = new C2CMessagePublication();
			c2cExample.setInformationalText("Just an example 1");
			c2cExample.setSubscriptionCount((long) 10);
			
			
			StringWriter writer = new StringWriter();
			createMarshaller.marshal(c2cExample, writer);
			
			System.out.println(writer);
			
			Unmarshaller unmarshal = context.createUnmarshaller();
			
			C2CMessagePublication result = (C2CMessagePublication) unmarshal.unmarshal(new StringReader(writer.toString()));
			System.out.println(result.getInformationalText());
			System.out.println(result.getSubscriptionID());
			
			
			ObjectMapper mapper = new ObjectMapper();
	        
		
			AnnotationIntrospector introspector= new JaxbAnnotationIntrospector(mapper.getTypeFactory());   
			mapper.setAnnotationIntrospector(introspector);
			String result_json = mapper.writeValueAsString(c2cExample);
			System.out.println(result_json);
			
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
