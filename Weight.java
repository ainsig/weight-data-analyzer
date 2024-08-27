/* Author: Arlo Insigne
   Date: September 30, 2022
   Purpose: Program that finds the minimum,
   maximum, and average of a collection of weight values.
 */

public class Weight {

    //Declare attributes and constants used throughout the program
    private final int OUNCES_IN_A_POUND = 16;
    private int pounds;
    private double ounces;

    //Constructor for the Weight class
    public Weight(int pounds, double ounces){
        this.pounds = pounds;
        this.ounces = ounces;
    }

    //Method that turns the supplied pounds to ounces
    private double toOunces(){

        return (this.pounds * OUNCES_IN_A_POUND) + this.ounces;
    }

    //Method that ensures that ounces do not exceed 16.
    private void normalize(){

        if(this.ounces > 16){
            int addPounds = (int) (this.ounces / OUNCES_IN_A_POUND);
            this.ounces = this.ounces % OUNCES_IN_A_POUND;
            this.pounds = this.pounds + addPounds;
        }
    }


    /*
    Method that compares the supplied weight parameter to the weight object
    that invokes the method and returns the weight with lower value.
    */

    public boolean lessThan(Weight weight){
        weight.normalize();

        double total1 = weight.toOunces();
        double total2 = (this.pounds * 16) + this.ounces;

        return total1 < total2;
    }

    //Method that adds one weight to the parameter Weight instance
    public void addTo(Weight weight){
        this.pounds = this.pounds + weight.pounds;
        this.ounces = this.ounces + weight.ounces;
        normalize();
    }

    // **OPTIONAL** Method that divides the total weight supplied by the supplied divisor
    public void divideBy(int divisor){

        this.ounces = this.ounces /divisor;
        this.pounds = this.pounds / divisor;
        normalize();
    }

    //Method that returns a string output of the total pounds and ounces
    public String toString(){

        //used to turn ounces to 2 decimal places
        double newOunces = (Math.round(this.ounces * 100.0)/100.0);

        return this.pounds + " pounds and " + newOunces + " ounces";
    }

}
