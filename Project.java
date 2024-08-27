/* Author: Arlo Insigne
   Date: September 30, 2022
   Purpose: Program that finds the minimum,
   maximum, and average of a collection of weight values.
 */

import com.sun.tools.javac.Main;

public class Project {

    //Method that returns the minimum weight from a list of supplied weight values (w1, w2, w3).
    private Weight findMinimum(Weight w1, Weight w2, Weight w3){
        Weight minWeight = null;

        if(w2.lessThan(w1) && w3.lessThan(w1)){
            minWeight = w1;
        } else if (w1.lessThan(w2) && w3.lessThan(w2)){
            minWeight = w2;
        } else if (w1.lessThan(w3) && w2.lessThan(w3)){
            minWeight = w3;
        }

        return minWeight;
    }

    //Method that returns the maximum weight from a list of supplied weight values (w1, w2, w3).
    private Weight findMaximum(Weight w1, Weight w2, Weight w3){
        Weight maxWeight = null;

        if(w1.lessThan(w2) && w1.lessThan(w3)){
            maxWeight = w2;
        } else if(w2.lessThan(w1) && w2.lessThan(w3)){
            maxWeight = w2;
        } else if (w3.lessThan(w1) && w3.lessThan(w2)){
            maxWeight = w3;
        }

        return maxWeight;
    }


    //Method that finds the average of the supplied weight values (w1, w2, w3).
    private Weight findAverage(Weight w1, Weight w2, Weight w3){

        w1.addTo(w2);
        w1.addTo(w3);
        w1.divideBy(3);

        return w1;
    }

    public static void main(String[] args) {

        Project runIt = new Project();

        Weight weight1 = new Weight(11,3);
        Weight weight2 = new Weight(7,20);
        Weight weight3 = new Weight(14, 6);

        System.out.println("The minimum weight is" + " " + runIt.findMinimum(weight1, weight2, weight3));
        System.out.println("The maximum weight is" + " " + runIt.findMaximum(weight1, weight2, weight3));
        System.out.println("The average weight is" + " " + runIt.findAverage(weight1, weight2,weight3));
    }

}
