package org.firstinspires.ftc.teamcode._03_TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="demo TeleOp")
public class DemoTeleOp extends LinearOpMode {
    public Servo testServo;
    @Override
    public void runOpMode() throws InterruptedException {

    }
    public void initServo() {
        testServo = this.hardwareMap.get(Servo.class, "testServo");
        testServo.setDirection(Servo.Direction.FORWARD);
        testServo.setPosition(0);
    }
}
