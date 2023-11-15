// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  // define the motor objects for all 4 wheels
  WPI_TalonFX leftFront = new WPI_TalonFX(Constants.Drivetrain.leftFront);
  WPI_TalonFX rightFront = new WPI_TalonFX(Constants.Drivetrain.rightFront);
  WPI_TalonFX leftBack = new WPI_TalonFX(Constants.Drivetrain.leftBack);
  WPI_TalonFX rightBack = new WPI_TalonFX(Constants.Drivetrain.rightBack);

  // controller groups for each side
  MotorControllerGroup m_left = new MotorControllerGroup(leftFront, leftBack);
  MotorControllerGroup m_right = new MotorControllerGroup(rightFront, rightBack);

  public Drivetrain() {

  }

  // function which passes in 2 values and sends them to the controller group
  public void tankDrive(double left, double right) {
    m_left.set(left);
    m_right.set(right);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a
   * digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
