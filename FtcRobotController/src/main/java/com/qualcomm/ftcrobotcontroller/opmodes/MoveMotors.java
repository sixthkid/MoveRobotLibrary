package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.hardware.DcMotor;
public class MoveMotors {
    protected DcMotor leftMotor;
    protected DcMotor rightMotor;
    protected Continue StopFor;
    protected void MoveMotor(DcMotor LeftDriveMotorReferences, DcMotor RightDriveMotorReferences, Continue StopForReferences) {
        leftMotor = LeftDriveMotorReferences;
        rightMotor = RightDriveMotorReferences;
        StopFor = StopForReferences;
    }
/****************************************************************************************/
    /*Forward Methods*/
    //Methods for moveing the robot forward
    //Takes ints double and floats
    protected void DriveForward(int power, int timeDriven) {
        leftMotor.setPower(power/100);
        rightMotor.setPower(power/100);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveForward(double power, int timeDriven) {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveForward(int power, double timeDriven) {
        leftMotor.setPower(power/100);
        rightMotor.setPower(power/100);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveForward(double power, double timeDriven) {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveForward(float power, int timeDriven) {
        if(power < 100 || power > 0) {
            leftMotor.setPower(power);
            rightMotor.setPower(power);
        }
        else {
            e.printStackTrace();
        }
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveForward(float power, double timeDriven) {
        if(power < 100 || power > 0) {
            leftMotor.setPower(power);
            rightMotor.setPower(power);
        }
        else {
            e.printStackTrace();
        }
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveForward(int power, float timeDriven) {
        leftMotor.setPower(power / 100);
        rightMotor.setPower(power / 100);
        StopFor.StopFor(timeDriven);
    }
    protected void DriveForward(double power, float timeDriven) {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
/****************************************************************************************/
    /*TurnRight Methods*/
    //Methods for moveing the robot to the Right
    //Takes ints double and floats
    protected void TurnRight(int power, int timeDriven) {
    leftMotor.setPower(power/100);
    rightMotor.setPower(-power/100);
    StopFor.StopFor(timeDriven);
    leftMotor.setPower(0);
    rightMotor.setPower(0);
}
    protected void TurnRight(double power, int timeDriven) {
        leftMotor.setPower(power);
        rightMotor.setPower(-power);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void TurnRight(int power, double timeDriven) {
        leftMotor.setPower(power/100);
        rightMotor.setPower(-power/100);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void TurnRight(double power, double timeDriven) {
        leftMotor.setPower(power);
        rightMotor.setPower(-power);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void TurnRight(float power, int timeDriven) {
        if(power < 100 || power > 0) {
            leftMotor.setPower(power);
            rightMotor.setPower(-power);
        }
        else {
            e.printStackTrace();
        }
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void TurnRight(float power, double timeDriven) {
        if(power < 100 || power > 0) {
            leftMotor.setPower(power);
            rightMotor.setPower(-power);
        }
        else {
            e.printStackTrace();
        }
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void TurnRight(int power, float timeDriven) {
        leftMotor.setPower(power / 100);
        rightMotor.setPower(-power / 100);
        StopFor.StopFor(timeDriven);
    }
    protected void TurnRight(double power, float timeDriven) {
        leftMotor.setPower(power);
        rightMotor.setPower(-power);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
/****************************************************************************************/
    /*TurnLeft Methods*/
    //Methods for moveing the robot to the Right
    //Takes ints double and floats
    protected void TurnLeft(int power, int timeDriven) {

        TurnLeft((double) power, (double) timeDriven);
    }
    protected void TurnLeft(double power, int timeDriven) {
        TurnLeft(power, (double) timeDriven);
    }
    protected void TurnLeft(int power, double timeDriven) {
        TurnLeft((double) power, timeDriven);
    }
    protected void TurnLeft(float power, int timeDriven) {
        TurnLeft((double) power, (double) timeDriven);
    }
    protected void TurnLeft(float power, double timeDriven) {
        TurnLeft((double) power, timeDriven);
    }
    protected void TurnLeft(int power, float timeDriven) {
        TurnLeft((double) power, (double) timeDriven);
    }
    protected void TurnLeft(double power, float timeDriven) {
        TurnLeft( power,(double) timeDriven);
    }
    protected void TurnLeft(double power, double timeDriven) {
        if(power < 100 || power > 0) {
            leftMotor.setPower(-power);
            rightMotor.setPower(power);
        }
        else {
            throw new IllegalArgumentException("power greater then 100 or less 0");
        }
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    /****************************************************************************************/
    /*DriveBackwards Methods*/
    //Methods for moveing the robot to Backwards
    //Takes ints double and floats
    protected void DriveBackwards(int power, int timeDriven) {
        leftMotor.setPower(-power/100);
        rightMotor.setPower(-power/100);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveBackwards(double power, int timeDriven) {
//        leftMotor.setPower(-power);
//        rightMotor.setPower(-power);
//        StopFor.StopFor(timeDriven);
//        leftMotor.setPower(0);
//        rightMotor.setPower(0);
        DriveBackwards(power, (double) timeDriven);
    }
    protected void DriveBackwards(int power, double timeDriven) {
        leftMotor.setPower(-power/100);
        rightMotor.setPower(-power/100);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveBackwards(double power, double timeDriven) {
        leftMotor.setPower(-power);
        rightMotor.setPower(-power);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveBackwards(float power, int timeDriven) {
        if(power < 100 || power > 0) {
            leftMotor.setPower(-power);
            rightMotor.setPower(-power);
        }
        else {
            e.printStackTrace();
        }
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveBackwards(float power, double timeDriven) {
        if(power < 100 || power > 0) {
            leftMotor.setPower(-power);
            rightMotor.setPower(-power);
        }
        else {
            e.printStackTrace();
        }
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    protected void DriveBackwards(int power, float timeDriven) {
        leftMotor.setPower(-power/100);
        rightMotor.setPower(-power / 100);
        StopFor.StopFor(timeDriven);
    }
    protected void DriveBackwards(double power, float timeDriven) {
        leftMotor.setPower(-power);
        rightMotor.setPower(-power);
        StopFor.StopFor(timeDriven);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }

}


