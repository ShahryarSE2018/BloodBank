package com.example.shahryarahmed.onlinebloodbank.Entities;

/**
 * Created by Shahryar Ahmed on 4/18/2018.
 */

public class BloodData {

    private int oPositive;
    private int oNegative;
    private int aPositive;
    private int aNegative;
    private int bPositive;
    private int bNegative;

    private int abPositive;
    private int abNegative;

    public BloodData(int oPositive, int oNegative, int aPositive, int aNegative, int bPositive, int bNegative, int abPositive,int abNegative) {
        this.oPositive = oPositive;
        this.oNegative = oNegative;
        this.aPositive = aPositive;
        this.aNegative = aNegative;
        this.bPositive = bPositive;
        this.bNegative = bNegative;
        this.abNegative = abNegative;
    }

    public int getoPositive() {
        return oPositive;
    }

    public void setoPositive(int oPositive) {
        this.oPositive = oPositive;
    }

    public int getoNegative() {
        return oNegative;
    }

    public void setoNegative(int oNegative) {
        this.oNegative = oNegative;
    }

    public int getaPositive() {
        return aPositive;
    }

    public void setaPositive(int aPositive) {
        this.aPositive = aPositive;
    }

    public int getaNegative() {
        return aNegative;
    }

    public void setaNegative(int aNegative) {
        this.aNegative = aNegative;
    }

    public int getbPositive() {
        return bPositive;
    }

    public void setbPositive(int bPositive) {
        this.bPositive = bPositive;
    }

    public int getbNegative() {
        return bNegative;
    }

    public void setbNegative(int bNegative) {
        this.bNegative = bNegative;
    }
    public int getAbPositive() {
        return abPositive;
    }

    public void setAbPositive(int abPositive) {
        this.abPositive = abPositive;
    }

    public int getAbNegative() {
        return abNegative;
    }

    public void setAbNegative(int abNegative) {
        this.abNegative = abNegative;
    }
}
