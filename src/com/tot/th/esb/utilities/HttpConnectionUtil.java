package com.tot.th.esb.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
public class HttpConnectionUtil {
	private static Log log = LogFactory.getLog(HttpConnectionUtil.class);
	
	public static final String POST = "POST";

	public static final String CONTENT_TYPE = "Content-Type";
	public static final String CONTENT_LENGTH = "Content-Length";
	public static final String CONTENT_LANGUAGE = "Content-Language";

	public static final String APPLICATION_FORM_URL = "application/x-www-form-urlencoded";
	public static final String TEXT_XML = "text/xml;charset=UTF-8";

	public static final String EN_US = "en-US";

	public static int TIMR_OUT = 0;

	public static String executePost(String targetURL, String urlParameters, int timeout) {
		HttpURLConnection connection = null;

		try {		
			TIMR_OUT = timeout;
			
			//Create connection
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(POST);
			connection.setRequestProperty(CONTENT_TYPE, TEXT_XML);

			connection.setRequestProperty(CONTENT_LENGTH, 
					Integer.toString(urlParameters.getBytes().length));
			connection.setRequestProperty(CONTENT_LANGUAGE, EN_US);  

			connection.setUseCaches(false);
			connection.setDoOutput(true); 

			connection.setConnectTimeout(timeout);
			connection.setReadTimeout(timeout);
			connection.connect();

			//Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(wr, "UTF-8"));
			writer.write(urlParameters);
			writer.close();
			wr.close();

			new Thread(new InterruptThread(connection)).start();
			
			//Connecting.....ServiceEndpoint......  
			InputStream is = connection.getInputStream();			

			//Get Response 
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}			
			new Thread(new InterruptThread(connection)).stop();
			rd.close();
			return response.toString();


		} catch (java.net.SocketTimeoutException e) {
			log.info("Error SocketTimeoutException :"+e);
			new Thread(new InterruptThread(connection)).stop();
			return null;

		} catch (Exception e) {
			log.info("Error Exception :"+ e);
			e.printStackTrace();
			return null;

		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}

	}
	
}
