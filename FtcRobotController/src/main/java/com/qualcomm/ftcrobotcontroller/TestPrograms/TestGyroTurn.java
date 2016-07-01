package com.qualcomm.ftcrobotcontroller.TestPrograms;
import com.qualcomm.ftcrobotcontroller.opmodes.Continue;
import com.qualcomm.ftcrobotcontroller.opmodes.GyroTurn;
import com.qualcomm.ftcrobotcontroller.opmodes.MoveMotors;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.kauailabs.navx.ftc.AHRS;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.robocol.Telemetry;
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
        move = new MoveMotors(leftMotor, rightMotor, C, false, true);
        gyroT = new GyroTurn(gyro, move, telemetry);
        telemetry.addData("Created gyroturn, continue, ElapsedTime and MoveMotors", "");
        waitForStart();
        telemetry.addData("turn 90 right start", "");
        gyroT.turnRight(90);
        telemetry.addData("turn 90 right finished", "");
        C.StopFor(4000);
        telemetry.addData("turn 90 left start", "");
        gyroT.turnLeft(90);
        telemetry.addData("turn 90 left finished", "");
        //navXGyro
    }
}
