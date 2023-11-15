// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class Forward extends CommandBase {
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" }) //ignore this

  final Drivetrain m_Drivetrain;

  // forward command; define and inherite drivetrain subsystem
  public Forward(Drivetrain drivetrain) {
    m_Drivetrain = drivetrain;
    addRequirements(drivetrain); //dependencies (IMPORTANT)
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_Drivetrain.tankDrive(0, 0); //first start at position 0
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Drivetrain.tankDrive(0.5, 0.5); //ok, now lets move the drive forward by this much
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_Drivetrain.tankDrive(0, 0); //stop motors on the interruption
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
