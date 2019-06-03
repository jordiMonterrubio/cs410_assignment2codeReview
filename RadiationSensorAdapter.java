package sensor;

public class RadiationSensorAdapter implements SensorAdapter {
	
	private RadiationSensor adaptee;
	
	public RadiationSensorAdapter(RadiationSensor rs) {
		this.adaptee = rs;
	}
	
	@Override
	public double getValue() {
		return adaptee.getRadiationLevel();
	}
	
	@Override
	public String getReport() {
		return adaptee.getStatusInfo();
	}
	
	@Override
	public String getType() {
		return adaptee.getName();
	}
}
