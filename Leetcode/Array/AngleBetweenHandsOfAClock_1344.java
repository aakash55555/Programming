package leetcode.Array;

public class AngleBetweenHandsOfAClock_1344 {
    public double angleClock(int hour, int minutes) {
        int h_angle = 30;
        int m_angle = 6;
        double min_angle = minutes * m_angle;
        double hour_angle = (hour % 12+ minutes / 60.0) * h_angle;
        double diff =  Math.abs(hour_angle - min_angle);
        return Math.min(diff, 360 - diff);
    }
}
