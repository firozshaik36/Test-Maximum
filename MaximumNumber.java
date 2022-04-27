package com.bridgelabz.genericstestmaximum;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
    /**
    * Finding The Maximum Number in Given Three Integers.
    *
    * using compareTo Method.
    *
    */

public class MaximumNumber {

    public static Logger logger = Logger.getLogger(MaximumNumber.class);

    public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {

        Integer maximumNumber;

        // if Condition (Compares the first number to Second & Third Number)

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;

            /**in this condition if first number is Maximum number ,
             * Maximum Number is First Number
             *
             * else it checks elseif condition
             */
        }
        //In This Condition (Compares the Second number to First & Third Number)
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        //if the above two Conditions fails it returnvalue of Maximum number is Third Number
        else {
            maximumNumber = thirdNumber;
        }

        logger.info("The Maximum Number Is: " + maximumNumber);
    }


    public static void main(String[] args) {

        BasicConfigurator.configure();

        logger.info("---Given Three Integers and Finding The Maximum---");

        Integer firstNumber = 15, secondNumber = 20, thirdNumber = 25;
        findMaximum(firstNumber, secondNumber, thirdNumber);

    }


}