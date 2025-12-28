package week3.day2;

public class APIClient {
	public void sendRequest(String endpoint) {
		
		System.out.println("endpoint: "+ endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, Boolean  requestStatus) {
		System.out.println("EndPoint: "+endpoint);
		System.out.println("Request Body: "+requestBody);
		System.out.println("Request Status: "+requestStatus);	
	}
	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		
		api.sendRequest("Is Class available");
		api.sendRequest("Yes", "request", true);
		
	}

}