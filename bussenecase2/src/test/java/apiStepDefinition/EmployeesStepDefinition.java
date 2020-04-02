package apiStepDefinition;

import org.testng.Assert;

import apiPageObject.GetEmployees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class EmployeesStepDefinition {
	Response resp;
	GetEmployees employees;
	int id;
	@Given("User set valid auth key")
	public void user_set_valid_auth_key() {
	    System.out.println("Hola ");
	}
	
	
	@When("User send a Get request on {string}")
	public void user_send_a_Get_request_on(String endPoint) {
		employees = new GetEmployees(endPoint);
	}

	@Then("User shoukd get status code {int}")
	public void user_shoukd_get_status_code(Integer statusCode) {
		Assert.assertTrue(employees.resp.getStatusCode()==statusCode);
	
	}
	
	//Get Single Employees
}
