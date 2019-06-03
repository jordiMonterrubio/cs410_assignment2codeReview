package sensor;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class SensorApplication extends JFrame {
	
	public SensorApplication() {
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(3,1));
	
		TemperatureSensor ts = new TemperatureSensor();
		SensorAdapter ta = new TemperatureSensorAdapter(ts);
		JPanel  temperaturePnl = addPanel(ta);
		add(temperaturePnl);
		
		PressureSensor ps = new PressureSensor();
		SensorAdapter pa = new PressureSensorAdapter(ps);
		JPanel  pressurePnl = addPanel(pa);
		add(pressurePnl);
		
		RadiationSensor rs = new RadiationSensor();
		SensorAdapter ra = new RadiationSensorAdapter(rs);
		JPanel  radiationPnl = addPanel(ra);
		add(radiationPnl);	
		
		setPreferredSize(new Dimension(600,600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	
	public JPanel addPanel(SensorAdapter sa) {
		JPanel jp = new JPanel();
		JLabel jl = new JLabel();

		jp.setBorder(new TitledBorder(sa.getType()));
		jl.setText(sa.getValue() + ", " + sa.getReport());
		jp.add(jl);
		return jp;
	}

	public static void main(String[] args) {
		SensorApplication app = new SensorApplication();
	}

}
