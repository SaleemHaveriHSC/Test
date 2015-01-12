package com.tesco.priceintegrity.junits;

import com.tesco.priceintegrity.junits.productcontent.TescoProductContentUnitTests;
import com.tesco.priceintegrity.junits.producthierarchy.TescoProductHierarchyUnitTests;
import com.tesco.priceintegrity.junits.storegroups.TescoStoreGroupsUnitTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.text.NumberFormat;

/**
 * Created by hb41 on 11/12/2014.
 */
public class JunitRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TescoStoreGroupsUnitTests.class, TescoProductHierarchyUnitTests.class, TescoProductContentUnitTests.class);
        int failPlusIgnore = result.getFailureCount() + result.getIgnoreCount();

        System.out.println("\nSummary of Test Execution");
        System.out.println("=========================");
        System.out.println("Total No. of Test Cases executed    : " + result.getRunCount());
        System.out.println("Total No. of Test Cases Passed      : " + (result.getRunCount() - failPlusIgnore));
        System.out.println("Total No. of Test Cases Failed      : " + result.getFailureCount());
        System.out.println("Total No. of Test Cases Ignored     : " + result.getIgnoreCount());

        System.out.println("\nFailure Details");
        System.out.println("===============");
        for (Failure failure : result.getFailures()){
            System.out.println("Method & Class Details              : " + failure.getTestHeader());
            System.out.println("Failure Description                 : " + failure.getMessage());
        }

        System.out.println("\nTest Execution Status               : " + result.wasSuccessful());
        System.out.println("Total Execution Time(Seconds)       : " + NumberFormat.getInstance().format((double) result.getRunTime() / 1000));
    }
}
