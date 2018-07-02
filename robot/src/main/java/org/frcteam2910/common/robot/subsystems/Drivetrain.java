package org.frcteam2910.common.robot.subsystems;

import org.frcteam2910.common.drivers.Gyroscope;
import org.frcteam2910.common.math.Vector2;

public abstract class Drivetrain extends Subsystem {
	public abstract Gyroscope getGyroscope();
	
	public abstract double getMaximumVelocity();
	public abstract double getMaximumAcceleration();

	@Override
	public abstract void updateKinematics(double timestamp);

	public abstract Vector2 getKinematicPosition();

	public abstract Vector2 getKinematicVelocity();

	public void outputToSmartDashboard() { }
	
	public void zeroSensors() {}
}