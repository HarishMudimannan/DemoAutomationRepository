package com.sgtesting.AutoIT;

public class ExecutionOfAutoITScriptDemo1 {

	public static void main(String[] args) {
		ExecuteAutoIT();
	}
	
	private static void ExecuteAutoIT() 
	{
		try
		{
			Runtime.getRuntime().exec("\\D:\\Java\\AutoIT\\Sample.exe");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
