package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class Tankdrive extends CommandBase {
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
  
  private final Drivetrain m_Drivetrain;
  private DoubleSupplier left;
  private DoubleSupplier right;
  
  public Tankdrive(Drivetrain drivetrain, DoubleSupplier left, DoubleSupplier right) {
    this.m_Drivetrain = drivetrain;
    this.left = left;
    this.right = right;
    addRequirements(drivetrain);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Drivetrain.tankDrive(left.getAsDouble(), right.getAsDouble()); //send the left & right vals to motors
  }
}
