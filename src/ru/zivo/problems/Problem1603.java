package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/design-parking-system
 * Title: 1603. Design Parking System
 * Difficulty: Easy
 */
public class Problem1603 {
    class ParkingSystem {

        private int big;
        private int medium;
        private int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if (carType == 1) {
                return big-- > 0;
            } else if (carType == 2) {
                return medium-- > 0;
            } else if (carType == 3) {
                return small-- > 0;
            } else {
                return false;
            }
        }
    }
}
