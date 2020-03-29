package isp.lab5.exercise1;

import isp.lab5.exercise1.comparators.TypeSensorComparator;
import isp.lab5.exercise1.comparators.ValueInRonSensorComparator;

import java.util.Collections;
import java.util.List;

public class SensorsCluster {
    private List<Sensor> sensors;

    public List<Sensor> getSensorsSortedByValueInRon() {
        Collections.sort(this.sensors, new ValueInRonSensorComparator());
        return this.sensors;
    }

    public List<Sensor> getSensorsSortedByType() {
        Collections.sort(this.sensors, new TypeSensorComparator());
        return this.sensors;
    }
}
