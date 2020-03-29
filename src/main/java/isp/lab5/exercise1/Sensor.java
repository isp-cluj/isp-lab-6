package isp.lab5.exercise1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sensor {
    private String type;
    private double valueInRon;
    private List<SensorReading> sensorReadingList;



    public List<SensorReading> getSensorReadingSortedByDateAndTime() {
        Collections.sort(this.sensorReadingList);
        return this.sensorReadingList;
    }

    public String getType() {
        return type;
    }

    public double getValueInRon() {
        return valueInRon;
    }

    public class TypeComparator implements Comparator<Sensor> {

        @Override
        public int compare(Sensor o1, Sensor o2) {
            return o1.getType().compareTo(o2.getType());
        }
    }
}
