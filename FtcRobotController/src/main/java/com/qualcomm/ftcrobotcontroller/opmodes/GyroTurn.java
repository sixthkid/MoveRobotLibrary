package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.kauailabs.navx.ftc.AHRS;

public class GyroTurn {
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private AHRS gyro;
    private MoveMotors move;
    public void GyroTurn(AHRS gyroArg, DcMotor leftMotorArg, DcMotor rightMotorArg, MoveMotors moveArg) {
        leftMotor = leftMotorArg;
        rightMotor = rightMotorArg;
        gyro = gyroArg;
        move = moveArg;
    }
    public void turnRight(int degree) {
        gyro.zeroYaw();
        if (degree > 179 || degree < 0) {
            throw new IndexOutOfBoundsException("Degrees must be between 179 and 0.");
        }
        while(gyro.getYaw() <= degree) {
            move.Drive(100, MoveMotors.Direction.RIGHT);
        }
        move.stop();
    }

    public void turnLeft(int degree) {
        gyro.zeroYaw();
        if (degree > 179 || degree < 0) {
            throw new IndexOutOfBoundsException("Degrees must be between 179 and 0.");
        }
        while (gyro.getYaw() <= degree) {
            move.Drive(100, MoveMotors.Direction.LEFT);
        }
        move.stop();
    }
}




