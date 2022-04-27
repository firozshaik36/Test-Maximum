package com.bridgelabz.genericstestmaximum;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/**
 * Finding The Maximum Number in Given Three Integers.
 *
 * Generics Concept
 */

public class MaximumNumber<M extends Comparable<M>> {

    public static Logger logger = Logger.getLogger(MaximumNumber.class);

    M toCompare1, toCompare2, toCompare3;

    //Created Constructor
    public MaximumNumber(M tocompare1, M tocompare2, M tocompare3) {
        this.toCompare1 = tocompare1;
        this.toCompare2 = tocompare2;// this Keyword refers Instance variable
        this.toCompare3 = tocompare3;
    }

    public void testMaximum() {
        MaximumNumber.findMaximum(this.toCompare1, this.toCompare2, this.toCompare3);//Here MaximumNumber is Class
        //and findMaximum is Method
    }

    public static <M extends Comparable<M>> void findMaximum(M firstNumber, M secondNumber, M thirdNumber) {
        M maximumNumber;

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

        logger.info("The maximum number is: " + maximumNumber);
    }


    //Main Method
    public static void main(String[] args) {

        BasicConfigurator.configure();

        logger.info("----- Welcome To Computing Maximum Of Three Numbers Using Java Generics ------");

        Integer firstNumber = 44, secondNumber = 20, thirdNumber = 65;
        Float number1 = 36f, number2 = 10f, number3 = 5f;
        String firstString = "Peach", secondString = "Banana", thirdString = "Apple";

        new MaximumNumber<Integer>(firstNumber, secondNumber, thirdNumber).testMaximum();
        new MaximumNumber<Float>(number1, number2, number3).testMaximum();
        new MaximumNumber<String>(firstString, secondString, thirdString).testMaximum();

    }


}