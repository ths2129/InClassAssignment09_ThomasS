package com.example.inclassassignment09_thomass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Business {

    private String name;
    private String location;
    private int annualProfit;
    private boolean nonProfit;

   public Business() {
   }

    public Business(String name, String location, int annualProfit, boolean nonProfit) {
        this.name = name;
        this.location = location;
        this.annualProfit = annualProfit;
        this.nonProfit = nonProfit;
    }

    @Override
    public String toString() {
        return "Business" + "\n" +
                "Name: " + name + "\n" +
                "location: " + location + "\n" +
                "AnnualProfit: " + annualProfit + "\n" +
                "NonProfit: " + nonProfit;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAnnualProfit() {
        return annualProfit;
    }

    public void setAnnualProfit(int annualProfit) {
        this.annualProfit = annualProfit;
    }

    public boolean isNonProfit() {
        return nonProfit;
    }

    public void setNonProfit(boolean nonProfit) {
        this.nonProfit = nonProfit;
    }



}
