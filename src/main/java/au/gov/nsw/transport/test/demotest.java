package au.gov.nsw.transport.test;

import javax.xml.ws.Holder;

import au.gov.nsw.transport.tmc.schemas.software_component.soapheader.v1.MsgContextCType;
import au.gov.nsw.transport.tmc.services.entity.devices.sensor_v0.ErrorReport;
import au.gov.nsw.transport.tmc.services.entity.devices.sensor_v0.SensorPortTypeV0P1;
import au.gov.nsw.transport.tmc.services.entity.devices.sensor_v0p1.PublishDetectorData;
import au.gov.nsw.transport.tmc.services.entity.devices.sensor_v0p1.PublishDetectorDataResponse;

public class demotest implements SensorPortTypeV0P1 {

	@Override
	public PublishDetectorDataResponse publishDetectorData(PublishDetectorData message, Holder<MsgContextCType> header)
			throws ErrorReport {
		// TODO Auto-generated method stub
		return null;
	}

}
