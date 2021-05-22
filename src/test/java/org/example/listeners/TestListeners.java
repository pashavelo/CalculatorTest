package org.example.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener{

    public void onTestStart(ITestResult result){
        System.out.println("on Test Start:" + result.getName());
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("on Test Success:" + result.getName());
    }

}
