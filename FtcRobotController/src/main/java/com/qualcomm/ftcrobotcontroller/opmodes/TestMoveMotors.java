package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
public class TestMoveMotors extends LinearOpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;
    MoveMotors move;
    Continue C;
    @Override
    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        C = new Continue();
        move = new MoveMotors(leftMotor, rightMotor, C);
        waitForStart();
        move.Drive(50, 1, MoveMotors.Direction.FORWARD);
        C.StopFor(1000);
        move.Drive(50, 1, MoveMotors.Direction.RIGHT);
        C.StopFor(1000);
        move.Drive(50, 1, MoveMotors.Direction.LEFT);
        C.StopFor(1000);
        move.Drive(50, 1, MoveMotors.Direction.BACKWARD);

        C.StopFor(2000);


        move.Drive(50, MoveMotors.Direction.FORWARD);
        C.StopFor(1000);
        move.stop();
        C.StopFor(1000);
        move.Drive(50, MoveMotors.Direction.RIGHT);
        C.StopFor(1000);
        move.stop();
        C.StopFor(1000);
        move.Drive(50, MoveMotors.Direction.LEFT);
        C.StopFor(1000);
        move.stop();
        C.StopFor(1000);
        move.Drive(50, MoveMotors.Direction.BACKWARD);
        move.stop();
        C.StopFor(1000);

    }
}
