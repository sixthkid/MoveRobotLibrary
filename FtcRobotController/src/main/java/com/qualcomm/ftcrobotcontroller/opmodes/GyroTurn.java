package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.kauailabs.navx.ftc.AHRS;
import com.qualcomm.robotcore.robocol.Telemetry;

public class GyroTurn {
    private AHRS gyro;
    private MoveMotors move;
    private Telemetry tele;
    public GyroTurn(AHRS gyroArg, MoveMotors moveArg, Telemetry t) {
        gyro = gyroArg;
        move = moveArg;
        tele = t;
    }

    /**
     * A method that takes the number of degrees and turns to the right.
     * @param degree the number of degrees it will turn.
     */
    public void turnRight(int degree) {
        gyro.zeroYaw();
        if (degree > 179 || degree < 0) {
            throw new IndexOutOfBoundsException("Degrees must be between 179 and 0.");
        }
        while(gyro.getYaw() < degree) {
            move.Drive(50, MoveMotors.Direction.RIGHT);
            tele.addData("", gyro.getYaw());
        }
        move.stop();
    }
    /**
     * A method that takes the number of degrees and turns to the left.
     * @param degree the number of degrees it will turn.
     */
    public void turnLeft(int degree) {
        gyro.zeroYaw();
        degree = -degree;
        if (degree < -179 || degree > 0) {
            throw new IndexOutOfBoundsException("Degrees must be between 179 and 0.");
        }
        while (gyro.getYaw() > degree) {
            move.Drive(50, MoveMotors.Direction.LEFT);
        }
        move.stop();
    }
}




