package New.Unirest_Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestExample {

	public static void main(String[] args) throws UnirestException 
	{
		UnirestExample onjet = new UnirestExample ();
		onjet.GetExample();
		onjet.PostExample();
		onjet.putExample();
		onjet.deleteExample();
	}
	
	public void GetExample() throws UnirestException
	{
		HttpResponse<JsonNode> json=Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println(json.getStatusText());
		System.out.println(json.getBody());
		
	}
	
	public void PostExample() throws UnirestException
	{
		HttpResponse<JsonNode> json = Unirest.post("http://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"Partha\",\"salary\":\"34521\",\"age\":\"56\"}").asJson();
		System.out.println(json.getStatusText());
		System.out.println(json.getBody());
		
		
	}
	
	public void putExample()
	{
		try {
			HttpResponse<JsonNode> json = Unirest.put("http://dummy.restapiexample.com/api/v1/update/6978").body("{\"name\":\"Partha\",\"salary\":\"34521\",\"age\":\"56\"}").asJson();
			System.out.println(json.getStatusText());
			System.out.println(json.getBody());
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void deleteExample()
	{
		try {
			HttpResponse<JsonNode> json = Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/6978").asJson();
			System.out.println(json.getStatusText());
			System.out.println(json.getBody());
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
