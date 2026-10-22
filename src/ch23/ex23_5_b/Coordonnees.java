package ch23.ex23_5_b;

import java.util.Objects;

public class Coordonnees {
    private final double latitude;
    private final double longitude;

    public Coordonnees(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }

    @Override
    public boolean equals(Object autre) {
        if (!(autre instanceof Coordonnees c)) {
            return false;
        }
        return latitude == c.latitude && longitude == c.longitude;
    }

    @Override
    public int hashCode() { return Objects.hash(latitude, longitude); }
}
