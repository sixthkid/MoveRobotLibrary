package com.qualcomm.ftcrobotcontroller.TestPrograms;
import com.qualcomm.ftcrobotcontroller.opmodes.Continue;
import com.qualcomm.ftcrobotcontroller.opmodes.GyroTurn;
import com.qualcomm.ftcrobotcontroller.opmodes.MoveMotors;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.kauailabs.navx.ftc.AHRS;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.kauailabs.navx.ftc.AHRS;

public class TestGyroTurn extends LinearOpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;
    MoveMotors move;
    Continue C;
    int GP;
    AHRS gyro;
    GyroTurn gyroT;
    ElapsedTime runtime;
    @Override
    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        C = new Continue();
        GP = 3;
        gyro = AHRS.getInstance(hardwareMap.deviceInterfaceModule.get("DIM1"), GP, AHRS.DeviceDataType.kProcessedData);
        runtime = new ElapsedTime();
        move = new MoveMotors(leftMotor, rightMotor, C);
        gyroT = new GyroTurn(gyro, move);
        waitForStart();
        gyroT.turnRight(90);
        C.StopFor(1000);
        gyroT.turnLeft(90);

    }
}
