package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/convert-the-temperature
 * Title: 2469. Convert the Temperature
 * Difficulty: Easy
 */
public class Problem2469 {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
