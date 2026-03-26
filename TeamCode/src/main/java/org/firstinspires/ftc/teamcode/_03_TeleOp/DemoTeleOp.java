package org.firstinspires.ftc.teamcode._03_TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="demo TeleOp")
public class DemoTeleOp extends LinearOpMode {
    public DcMotor testMotor;
    public CRServo testServo;
    @Override
    public void runOpMode() throws InterruptedException {
        initMotor();
        initServo();
        waitForStart();
        while(opModeIsActive()){
            if(gamepad1.a){
                testMotor.setPower(0);

            }
            if(gamepad1.y) {
                testServo.setPower(0);
            }
            if(gamepad1.b){
                testMotor.setPower(1);
            }
            if(gamepad1.x) {
                testServo.setPower(1);
            }
            }
        }

    public void initMotor() {
        testMotor = this.hardwareMap.get(DcMotor.class, "testMotor");
        testMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        testMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        testMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        testMotor.setPower(0);
    }
    public void initServo() {
        testServo = this.hardwareMap.get(CRServo.class, "testServo");
        testServo.setDirection(CRServo.Direction.FORWARD);
        testServo.setPower(0);
    }
}

