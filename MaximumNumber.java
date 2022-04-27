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
        //This Method is For to test maximumNumber For Float
        public static void findMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
            Float maximumNumber;

            if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
                maximumNumber = firstNumber;
            }
            else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
                maximumNumber = secondNumber;
            }
            else {
                maximumNumber = thirdNumber;
            }

            logger.info("The maximum number is: " + maximumNumber);
        }

        //This Method is For to test maximumString
        public static void findMaximum(String firstString, String secondString, String thirdString) {
            String maximumString;

            if(firstString.compareTo(secondString)>0 && firstString.compareTo(thirdString)>0) {
                maximumString = firstString;
            }
            else if(secondString.compareTo(firstString)>0 && secondString.compareTo(thirdString)>0) {
                maximumString = secondString;
            }
            else {
                maximumString = thirdString;
            }

            logger.info("The maximum String is: " + maximumString);
        }




    public static void main(String[] args) {

        BasicConfigurator.configure();

        logger.info("---Given Three Numbers and Finding The Maximum---");

        Integer firstNumber = 44, secondNumber = 20, thirdNumber = 65;
        findMaximum(firstNumber, secondNumber, thirdNumber);

        Float number1 = 36f, number2 = 10f, number3 = 5f;
        findMaximum(number1, number2, number3);

        String firstString = "Apple", secondString = "Peach", thirdString = "Banana";
        findMaximum(firstString, secondString, thirdString);

    }


}