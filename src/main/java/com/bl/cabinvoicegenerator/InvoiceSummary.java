package com.bl.cabinvoicegenerator;

import java.util.Objects;

public class InvoiceSummary {
    /**
     * variable
     */
    int numberOfRides;
    double totalFare;
    double avgFare;

    /**
     * create a default constructor name as InvoiceSummary
     */
    public InvoiceSummary() {

    }

    /**
     *  create a parameterized constructor name as InvoiceSummary
     * @param numberOfRides in cab invoice generator
     * @param totalFare in cab invoice generator
     */
    public InvoiceSummary(int numberOfRides, double totalFare) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
    }

    /**
     * create a parameterized constructor name as InvoiceSummary
     * @param numberOfRides in cab invoice generator
     * @param totalFare in cab invoice generator
     * @param type in cab invoice generator
     */
    public InvoiceSummary(int numberOfRides, double totalFare, String type) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
    }

    /**
     * Average Fare Per Ride
     * @return avgFare
     */
    public InvoiceSummary getInvoiceSummary() {
        /**
         *  The "this" keyword is used to refer to the current object.
         *  formula = avgFare =totalFare / numberOfRides
         */
        this.avgFare = this.totalFare / this.numberOfRides;
        return this;
    }

    /**
     * Create a boolean type method name as equals
     * to compare objects we should have hashcode method else they
     * create a two different instances so creating equals() and hashcode()
     * @param o object
     * @return number of rides
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberOfRides == that.numberOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.avgFare, avgFare) == 0;
    }

    /**
     * overriding the toString() method
     * @return firstname , numberOfRides ,totalFare, avgFare
     *
     */
    @Override
    public int hashCode() {
        return Objects.hash(numberOfRides, totalFare, avgFare);
    }
}
