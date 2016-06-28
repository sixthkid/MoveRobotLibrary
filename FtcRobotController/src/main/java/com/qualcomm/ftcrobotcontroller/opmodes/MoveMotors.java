package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * A object that moves the motors for a given period of time.
 *
 */
public class MoveMotors {
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private Continue StopFor;

    /**
     * Constructor that takes the references of the motors and a reference to the continue class.
     * @param LeftDriveMotorReferences left motor reference
     * @param RightDriveMotorReferences right motor reference
     * @param StopForReferences continue object reference
     */
    public MoveMotors(DcMotor LeftDriveMotorReferences, DcMotor RightDriveMotorReferences, Continue StopForReferences) {
        leftMotor = LeftDriveMotorReferences;
        rightMotor = RightDriveMotorReferences;
        StopFor = StopForReferences;
    }

    /**
     * Constructor that takes the references of the motors and a reference to the continue class.
     * It also takes in two booleans which set the direction the motors.
     * @param LeftDriveMotorReferences left motor reference
     * @param RightDriveMotorReferences right motor reference
     * @param StopForReferences continue object reference
     * @param leftMotorRev boolean, when true it sets the left motor to reverse
     * @param rightMotorRev boolean, when true it sets the right motor to reverse
     */
    public MoveMotors(DcMotor LeftDriveMotorReferences, DcMotor RightDriveMotorReferences, Continue StopForReferences, boolean leftMotorRev, boolean rightMotorRev) {
        leftMotor = LeftDriveMotorReferences;
        rightMotor = RightDriveMotorReferences;
        if(leftMotorRev) {
            leftMotor.setDirection(DcMotor.Direction.REVERSE);
        }
        else {
            leftMotor.setDirection(DcMotor.Direction.FORWARD);
        }
        if(rightMotorRev) {
            leftMotor.setDirection(DcMotor.Direction.REVERSE);
        }
        else {
            leftMotor.setDirection(DcMotor.Direction.FORWARD);
        }
        StopFor = StopForReferences;
    }
    /**
     *  This method runs the motors in a given direction for a given period of time then stops.
     *  Take note, turn left and turn right turn in place rather than one motor moving.
     * @param power sets the power of the motors, ranging from 100 to 0.
     * @param timeDriven sets the time the motors will run for, can not be less then 0.
     * @param dir sets the direction the motors will run, FORWARD, LEFT, RIGHT and BACKWARD.
     */
    public void Drive(int power, int timeDriven, Direction dir) {
        Drive((double) power, (double) timeDriven, dir);
    }
    /**
     *  This method runs the motors in a given direction for a given period of time then stops.
     *  Take note, turn left and turn right turn in place rather than one motor moving.
     * @param power sets the power of the motors, ranging from 100 to 0.
     * @param timeDriven sets the time the motors will run for, can not be less then 0.
     * @param dir sets the direction the motors will run, FORWARD, LEFT, RIGHT and BACKWARD.
     */
    public void Drive(double power, int timeDriven, Direction dir) {
        Drive(power, (double) timeDriven,  dir);
    }
    /**
     *  This method runs the motors in a given direction for a given period of time then stops.
     *  Take note, turn left and turn right turn in place rather than one motor moving.
     * @param power sets the power of the motors, ranging from 100 to 0.
     * @param timeDriven sets the time the motors will run for, can not be less then 0.
     * @param dir sets the direction the motors will run, FORWARD, LEFT, RIGHT and BACKWARD.
     */
    public void Drive(int power, double timeDriven, Direction dir) {
        Drive((double) power, timeDriven,  dir);
    }
    /**
     *  This method runs the motors in a given direction for a given period of time then stops.
     *  Take note, turn left and turn right turn in place rather than one motor moving.
     * @param power sets the power of the motors, ranging from 100 to 0.
     * @param timeDriven sets the time the motors will run for, can not be less then 0.
     * @param dir sets the direction the motors will run, FORWARD, LEFT, RIGHT and BACKWARD.
     */
    public void Drive(float power, int timeDriven, Direction dir) {
        Drive((double) power, (double) timeDriven,  dir);
    }
    /**
     *  This method runs the motors in a given direction for a given period of time then stops.
     *  Take note, turn left and turn right turn in place rather than one motor moving.
     * @param power sets the power of the motors, ranging from 100 to 0.
     * @param timeDriven sets the time the motors will run for, can not be less then 0.
     * @param dir sets the direction the motors will run, FORWARD, LEFT, RIGHT and BACKWARD.
     */
    public void Drive(float power, double timeDriven, Direction dir) {
        Drive((double) power, timeDriven,  dir);
    }
    /**
     *  This method runs the motors in a given direction for a given period of time then stops.
     *  Take note, turn left and turn right turn in place rather than one motor moving.
     * @param power sets the power of the motors, ranging from 100 to 0.
     * @param timeDriven sets the time the motors will run for, can not be less then 0.
     * @param dir sets the direction the motors will run, FORWARD, LEFT, RIGHT and BACKWARD.
     */
    public void Drive(int power, float timeDriven, Direction dir) {
        Drive((double) power, (double) timeDriven,  dir);
    }
    /**
     *  This method runs the motors in a given direction for a given period of time then stops.
     *  Take note, turn left and turn right turn in place rather than one motor moving.
     * @param power sets the power of the motors, ranging from 100 to 0.
     * @param timeDriven sets the time the motors will run for, can not be less then 0.
     * @param dir sets the direction the motors will run, FORWARD, LEFT, RIGHT and BACKWARD.
     */
    public void Drive(double power, float timeDriven, Direction dir) {
        Drive(power, (double) timeDriven, dir);
    }
    /**
     *  This method runs the motors in a given direction for a given period of time then stops.
     *  Take note, turn left and turn right turn in place rather than one motor moving.
     * @param power sets the power of the motors, ranging from 100 to 0.
     * @param timeDriven sets the time the motors will run for, can not be less then 0.
     * @param dir sets the direction the motors will run, FORWARD, LEFT, RIGHT and BACKWARD.
     */
    public void Drive(double power, double timeDriven, Direction dir) {
        power = power / 100;
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

    /**
     * Drive Method without timeDriven, runs the motors forever until the stop method is called.
     * @param power Sets the power of the motor.
     * @param dir Sets the direct the robot will go.
     */
    public void Drive(double power, Direction dir) {
        power = power / 100;
        switch (dir) {
            case FORWARD: {
                leftMotor.setPower(power);
                rightMotor.setPower(power);
            }
            case LEFT: {
                leftMotor.setPower(-power);
                rightMotor.setPower(power);
            }
            case RIGHT: {
                leftMotor.setPower(power);
                rightMotor.setPower(-power);
            }
            case BACKWARD: {
                leftMotor.setPower(-power);
                rightMotor.setPower(-power);
            }
        }
    }

    /**
     * The stop method stops the motors.
     */
    public void stop () {
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
    /**
     * the direction the robot will turn.
     */
    public enum Direction {
        FORWARD, RIGHT, LEFT, BACKWARD
        //enum for MoveMotors, used to assign a direction.
    }
}

