package apiTests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import io.restassured.http.ContentType;

public class VehicleTest {
	
	@Test
	public void canIRetrieveData() {
	    given().
	    when().
	        get("https://swapi.co/api/vehicles/").
	    then().
	        assertThat().
	        statusCode(200);
	}
	
	@Test
	public void jsonData() {
	    given().
	    when().
	        get("https://swapi.co/api/vehicles/").
	    then().
	        assertThat().
	        contentType(ContentType.JSON);		
	}
	
	@Test
	public void quickTest() {
	    given().
	    when().
	        get("https://swapi.co/api/vehicles/").
	    then().
	        assertThat().
	        time(lessThan(5L), TimeUnit.SECONDS);			
	}
	
	@Test
	public void listSize() {
	    given().
	    when().
	        get("https://swapi.co/api/vehicles/").
	    then().
	        assertThat().
	        body("count", equalTo(39));
	}
	
	@Test
	public void checkSkyHopper() {
	    given().
	    when().
	        get("https://swapi.co/api/vehicles/").
	    then().
	        assertThat().
	        body("results[1].name", equalTo("T-16 skyhopper"));
	}

	@Test
	public void checkSkyHopperModel() {
	    given().
	    when().
	        get("https://swapi.co/api/vehicles/").
	    then().
	        assertThat().
	        body("results[1].model", equalTo("T-16 skyhopper"));		
	}
	
	@Test
	public void checkSkyHopperLength() {
	    given().
	    when().
	        get("https://swapi.co/api/vehicles/").
	    then().
	        assertThat().
	        body("results[1].length", equalTo("10.4"));		
	}
	
	@Test
	public void checkSkyHopperClass() {
	    given().
	    when().
	        get("https://swapi.co/api/vehicles/").
	    then().
	        assertThat().
	        body("results[1].vehicle_class", equalTo("repulsorcraft"));		
	}
	
	@Test
	public void checkSkyHopperURL() {
	    given().
	    when().
	        get("https://swapi.co/api/vehicles/").
	    then().
	        assertThat().
	        body("results[1].url", equalTo("https://swapi.co/api/vehicles/6/"));		
	}
	
}

//validate request and params
//validate response
//checking data struct
//checking data returned from point