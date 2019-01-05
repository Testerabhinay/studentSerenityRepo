package com.studentapp.junit.studentsIDInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;








//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import io.restassured.RestAssured;


@RunWith(SerenityRunner.class)
public class SerenityIdInfo 
{
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI = "http://localhost:8085/student";
	}
	
	
	@Test
	public void getAllStudents()
	{
		SerenityRest.given()
		.when()
		.get("/list")
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	
	@Test
	public void Failing()
	{
		SerenityRest.given()
		.when()
		.get("/list")
		.then()
		.log()
		.all()
		.statusCode(500);
	}
	
	
	@Pending
	@Test
	public void AppendingTest()
	{
		
	}
	
	@Ignore
	@Test
	public void thisASkippedTest()
	{
		
	}
	
	
	@Test
	public void thisATestwithError()
	{
		System.out.println("This is an Error "+(5/0));
	}
	
	@Test
	public void fileDoesNotExist() throws Exception
	{
		File file = new File("E://file.txt");
		FileReader read = new FileReader(file);
	}
	
	
	@Manual
	@Test
	public void thisASManualTest()
	{
		
	}
	
	
	
}
