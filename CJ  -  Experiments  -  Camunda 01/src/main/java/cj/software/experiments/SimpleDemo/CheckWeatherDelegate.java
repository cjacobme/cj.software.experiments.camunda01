package cj.software.experiments.SimpleDemo;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckWeatherDelegate
		implements
		JavaDelegate
{
	private static Random randomizer = new Random();

	@Override
	public void execute(DelegateExecution pExecution) throws Exception
	{
		pExecution.setVariable("name", "Christian");
		pExecution.setVariable("weatherOk", randomizer.nextBoolean());
	}

}
