package org.usfirst.frc.team3008.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drive_Subsystem extends Subsystem {
	
	static Spark R1 = new Spark(0);
	static Spark R2 = new Spark(1);
	static Spark L1 = new Spark(2);
	static Spark L2 = new Spark(3);
	
	SpeedControllerGroup left = new SpeedControllerGroup(L1, L2);
	SpeedControllerGroup right = new SpeedControllerGroup(R1, R2);
	
	DifferentialDrive m_drive = new DifferentialDrive (left, right);
	
	public void driveTrain(double leftSpeed, double rightSpeed){
		m_drive.tankDrive(leftSpeed, rightSpeed);
		
	}
	
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

}
