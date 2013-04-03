package nl.avans.oAuthdemo;

public class oAuthConstants {

	public static final String CONSUMER_KEY 	= "YOUR-CONSUMER-KEY";
	public static final String CONSUMER_SECRET 	= "YOUR-CONSUMER-SECRET";

	public static final String SCOPE 			= "https://publicapi.avans.nl/oauth/";
	public static final String REQUEST_URL 		= "https://publicapi.avans.nl/oauth/request_token";
	public static final String ACCESS_URL 		= "https://publicapi.avans.nl/oauth/access_token";  
	public static final String AUTHORIZE_URL 	= "https://publicapi.avans.nl/oauth/login.php";
	
	public static final String API_REQUEST_PEOPLE 		= "https://publicapi.avans.nl/oauth/people/";
	public static final String API_REQUEST_ROOSTER 		= "https://publicapi.avans.nl/oauth/rooster/groep/_dif/";
	public static final String API_REQUEST_INUSE 		= "https://publicapi.avans.nl/oauth/inuse/";
	public static final String API_REQUEST_GROUPS 		= "https://publicapi.avans.nl/oauth/groups/";
	public static final String API_REQUEST_BB 		= "https://publicapi.avans.nl/oauth/bb/ann/?format=json";

	
	public static final String ENCODING 		= "UTF-8";
	
	public static final String	OAUTH_CALLBACK_SCHEME	= "x-avans-oauthflow";
	public static final String	OAUTH_CALLBACK_HOST		= "callback";
	public static final String	OAUTH_CALLBACK_URL		= OAUTH_CALLBACK_SCHEME + "://" + OAUTH_CALLBACK_HOST;

}

