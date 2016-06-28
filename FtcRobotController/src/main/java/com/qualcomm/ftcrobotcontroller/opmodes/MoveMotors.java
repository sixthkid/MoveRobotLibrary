package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.hardware.DcMotor;
public class MoveMotors {
    protected DcMotor leftMotor;
    protected DcMotor rightMotor;
    protected Continue StopFor;
    protected Variable Veribul;
    protected void MoveMotor(DcMotor LeftDriveMotorReferences, DcMotor RightDriveMotorReferences, Continue StopForReferences) {
        leftMotor = LeftDriveMotorReferences;
        rightMotor = RightDriveMotorReferences;
        StopFor = StopForReferences;
    }
    protected void MoveMotor(DcMotor LeftDriveMotorReferences, DcMotor RightDriveMotorReferences, Continue StopForReferences, MotorDirection.RightMotorDirection rightMotorDirection) {
        leftMotor = LeftDriveMotorReferences;
        rightMotor = RightDriveMotorReferences;
        if(rightMotorDirection == MotorDirection.RightMotorDirection.FORWARD) {
            leftMotor.setDirection(DcMotor.Direction.FORWARD);
        }
        else {
            leftMotor.setDirection(DcMotor.Direction.REVERSE);
        }
        StopFor = StopForReferences;
    }
    protected void MoveMotor(DcMotor LeftDriveMotorReferences, DcMotor RightDriveMotorReferences, Continue StopForReferences, MotorDirection.LeftMotorDirection leftMotorDirection) {
        leftMotor = LeftDriveMotorReferences;
        rightMotor = RightDriveMotorReferences;
        if(leftMotorDirection == MotorDirection.LeftMotorDirection.FORWARD) {
            leftMotor.setDirection(DcMotor.Direction.FORWARD);
        }
        else {
            leftMotor.setDirection(DcMotor.Direction.REVERSE);
        }
        StopFor = StopForReferences;
    }
    protected void MoveMotor(DcMotor LeftDriveMotorReferences, DcMotor RightDriveMotorReferences, Continue StopForReferences, MotorDirection.LeftMotorDirection leftMotorDirection, MotorDirection.RightMotorDirection rightMotorDirection) {
        leftMotor = LeftDriveMotorReferences;
        rightMotor = RightDriveMotorReferences;
        if(leftMotorDirection == MotorDirection.LeftMotorDirection.FORWARD) {
            leftMotor.setDirection(DcMotor.Direction.FORWARD);
        }
        else {
            leftMotor.setDirection(DcMotor.Direction.REVERSE);
        }
        if(rightMotorDirection == MotorDirection.RightMotorDirection.FORWARD) {
            leftMotor.setDirection(DcMotor.Direction.FORWARD);
        }
        else {
            leftMotor.setDirection(DcMotor.Direction.REVERSE);
        }
        StopFor = StopForReferences;
    }

    /****************************************************************************************/
    /*Forward Methods*/
    //Methods for moveing the robot forward
    //Takes ints double and floats
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected void Drive(int power, int timeDriven, Direction dir) {
        Veribul = Variable.INTEGER;
        Drive((double) power, (double) timeDriven, Veribul, dir);
    }
    protected void Drive(double power, int timeDriven, Direction dir) {
        Veribul = Variable.DOUBLE;
        Drive(power, (double) timeDriven, Veribul, dir);
    }

    protected void Drive(int power, double timeDriven, Direction dir) {
        Veribul = Variable.INTEGER;
        Drive((double) power, timeDriven, Veribul, dir);
    }

    protected void Drive(float power, int timeDriven, Direction dir) {
        Veribul = Variable.FLOAT;
        Drive((double) power, (double) timeDriven, Veribul, dir);
    }

    protected void Drive(float power, double timeDriven, Direction dir) {
        Veribul = Variable.FLOAT;
        Drive((double) power, timeDriven, Veribul, dir);
    }

    protected void Drive(int power, float timeDriven, Direction dir) {
        Veribul = Variable.INTEGER;
        Drive((double) power, (double) timeDriven, Veribul, dir);
    }

    protected void Drive(double power, float timeDriven, Direction dir) {
        Veribul = Variable.DOUBLE;
        Drive(power, (double) timeDriven, Veribul, dir);
    }

    protected void Drive(double power, double timeDriven, Direction dir) {
        Veribul = Variable.DOUBLE;
        Drive(power, timeDriven, Veribul, dir);
    }

    //****************************************************************//
    //this section runs the motors for a given time, and will move in the direction given.
    //dir: A enum that determines the direction the robot will move.
    //V: A enum that makes sure your varaibls are between two set numbers.
    //
    //
    //
    private void Drive(double power, double timeDriven, Variable V, Direction dir) {

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        switch (V) {
            case DOUBLE: {
                if (power > 1 || power < 0) {
                    throw new IndexOutOfBoundsException("power must be between 1 and 0, while using doubles");
                }
            }
            case FLOAT: {
                if (power > 100 || power < 0) {
                    throw new IndexOutOfBoundsException("power must be between 100 and 0, while using floats");
                }
                power = power / 100;
            }
            case INTEGER: {
                if (power > 100 || power < 0) {
                    throw new IndexOutOfBoundsException("power must be between 100 and 0, while using Integers");
                }
                power = power / 100;
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        switch (dir) {
            case FORWARD: {
                leftMotor.setPower(power);
                rightMotor.setPower(power);
                StopFor.StopFor(timeDriven);
                leftMotor.setPower(0);
                rightMotor.setPower(0);
            }
            case LEFT: {
                leftMotor.setPower(-power);
                rightMotor.setPower(power);
                StopFor.StopFor(timeDriven);
                leftMotor.setPower(0);
                rightMotor.setPower(0);
            }
            case RIGHT: {
                leftMotor.setPower(power);
                rightMotor.setPower(-power);
                StopFor.StopFor(timeDriven);
                leftMotor.setPower(0);
                rightMotor.setPower(0);
            }
            case BACKWARD: {
                leftMotor.setPower(-power);
                rightMotor.setPower(-power);
                StopFor.StopFor(timeDriven);
                leftMotor.setPower(0);
                rightMotor.setPower(0);
            }
        }
    }
    public enum Direction {
        FORWARD, RIGHT, LEFT, BACKWARD
        //enum for MoveMotors, used to assign a direction.
    }
    public enum Variable {
        DOUBLE, INTEGER, FLOAT
        //enum for MoveMotors, used to change varibul numbers.
    }
}

