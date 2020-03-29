package isp.lab5.exercise1.comparators;

import isp.lab5.exercise1.Sensor;

import java.util.Comparator;

public class TypeSensorComparator implements Comparator<Sensor> {

    @Override
    public int compare(Sensor o1, Sensor o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
