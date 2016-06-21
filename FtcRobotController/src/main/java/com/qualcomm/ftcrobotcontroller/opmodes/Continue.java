package com.qualcomm.ftcrobotcontroller.opmodes;
import static java.lang.Thread.sleep;;
public abstract class Continue {
    private int CStopDouble;
    private String convertionString;
    private int convertionInteger;
    protected Continue() {
    }
    protected void StopFor(int StopTime) {
        try {
            sleep(StopTime);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void StopFor(double StopTime) {
        convertionString = Double.toString(StopTime);
        convertionInteger = Integer.getInteger(convertionString);
        convertionInteger = convertionInteger * 1000;
        try {
            sleep(convertionInteger);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    protected void StopFor(float StopTime) {
        convertionString = Float.toString(StopTime);
        convertionInteger = Integer.getInteger(convertionString);
        convertionInteger = convertionInteger / 1000;
        try {
            sleep(convertionInteger);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
