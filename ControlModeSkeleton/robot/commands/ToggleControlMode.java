package org.usfirst.frc.team1290.robot.commands;

import org.usfirst.frc.team1290.robot.OI;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleControlMode extends Command 
{
	
	public ToggleControlMode()
	{
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		//System.out.println("Initialaden");
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		OI.controlMode = !OI.controlMode;
	}

	protected boolean isFinished()
	{
		return true;
	}

	// Called once after isFinished returns true
	protected void end()
	{
		//System.out.println("END NOW");
	}
}