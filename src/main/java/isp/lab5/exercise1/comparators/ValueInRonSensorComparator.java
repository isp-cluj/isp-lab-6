package isp.lab5.exercise1.comparators;

import isp.lab5.exercise1.Sensor;

import java.util.Comparator;

public class ValueInRonSensorComparator implements Comparator<Sensor> {
    private static final double DELTA = 0.000001;

    @Override
    public int compare(Sensor o1, Sensor o2) {
        if (o1.getValueInRon() - o2.getValueInRon() > DELTA) {
            return 1;
        } else if (o1.getValueInRon() - o2.getValueInRon() < DELTA) {
            return -1;
        }
        return 0;
    }

}
