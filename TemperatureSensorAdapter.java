package sensor;

public class TemperatureSensorAdapter implements SensorAdapter {
	
	private TemperatureSensor adaptee;
	
	public TemperatureSensorAdapter(TemperatureSensor ts) {
		this.adaptee = ts;
	}
	
	@Override
	public double getValue() {
		return adaptee.senseTemperature();
	}
	
	@Override
	public String getReport() {
		return adaptee.getTempReport();
	}
	
	@Override
	public String getType() {
		return adaptee.getSensorType();
	}
}
