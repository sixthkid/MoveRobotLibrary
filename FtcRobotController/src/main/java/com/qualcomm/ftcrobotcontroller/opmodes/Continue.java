package com.qualcomm.ftcrobotcontroller.opmodes;
import static java.lang.Thread.sleep;;
public class Continue {
    public Continue() {
    }
    public void StopFor(int StopTime) {
        if(StopTime < 0) {
            throw new IndexOutOfBoundsException("time can not be less then 0");
        }
        try {
            sleep(StopTime);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void StopFor(double StopTime) {
    if(StopTime < 0) {
        throw new IndexOutOfBoundsException("time can not be less then 0");
    }
        StopFor((int) StopTime);
    }
    public void StopFor(float StopTime) {
        if(StopTime < 0) {
            throw new IndexOutOfBoundsException("time can not be less then 0");
        }
        StopFor((int) StopTime);
    }
}
