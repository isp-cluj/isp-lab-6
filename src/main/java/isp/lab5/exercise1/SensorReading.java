package isp.lab5.exercise1;

import java.time.LocalDateTime;

public class SensorReading implements Comparable<SensorReading> {
    private LocalDateTime dateAndTime;
    private double value;

    public SensorReading(LocalDateTime dateAndTime, double value) {
        this.dateAndTime = dateAndTime;
        this.value = value;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(SensorReading o) {
        return this.dateAndTime.compareTo(o.dateAndTime);
    }
}
