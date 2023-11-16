package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
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

  // function which passes in 2 values and sends them to the controller group
  public void tankDrive(double left, double right) {
    m_left.set(left);
    m_right.set(right);
  }
}