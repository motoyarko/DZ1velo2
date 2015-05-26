package com.sourceit;

/**
 * Created by motoyarko on 25-May-15.
 */
public class AdultBycicle {

    public double BicycleCalories(int hardMeter, int wheelsDiameter, int distance) {

        return (hardMeter * distance / wheelsDiameter * 3.14);

    }
}
