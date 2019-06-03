package sensor;

public class PressureSensorAdapter implements SensorAdapter {
	private PressureSensor adaptee;
	
	public PressureSensorAdapter(PressureSensor ps) {
		this.adaptee = ps;
	}
	
	@Override
	public double getValue() {
		return adaptee.readValue();
	}
	
	@Override
	public String getReport() {
		return adaptee.getReport();
	}
	
	@Override
	public String getType() {
		return adaptee.getSensorName();
	}
}
