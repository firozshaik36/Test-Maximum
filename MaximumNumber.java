package com.bridgelabz.genericstestmaximum;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class MaximumNumber{
    public static Logger logger = Logger.getLogger(MaximumNumber.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("Welcome To Generics Test Maximum Program ");

    }
}