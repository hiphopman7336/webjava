package com.tot.th.esb.utilities;

import org.apache.log4j.Logger;

/**
 * Created by Kritsana J. on 01/10/2563.
 */
public class LogUtil {
	private static Logger log = Logger.getLogger(LogUtil.class);
	
	public void getLogDetail_RQIN(String transectionId, String serviceName, String messages){
		try {
			StringBuilder logDetail = new StringBuilder();
			logDetail.append(DateUtil.getDateTimeCurrent());logDetail.append("|");
			logDetail.append(DateUtil.getHostAddress());logDetail.append("|");
			logDetail.append("RQIN");logDetail.append("|");
			logDetail.append(serviceName);logDetail.append("|");
			logDetail.append("SSID="+transectionId);logDetail.append("|");
			logDetail.append("DATA="+messages);logDetail.append("|");

			log.info(logDetail.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getLogDetail_RQOU(String transectionId, String serviceName, String messages){
		try {
			StringBuilder logDetail = new StringBuilder();
			logDetail.append(DateUtil.getDateTimeCurrent());logDetail.append("|");
			logDetail.append(DateUtil.getHostAddress());logDetail.append("|");
			logDetail.append("RQOU");logDetail.append("|");
			logDetail.append(serviceName);logDetail.append("|");
			logDetail.append("SSID="+transectionId);logDetail.append("|");
			logDetail.append("DATA="+messages);logDetail.append("|");

			log.info(logDetail.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getLogDetail_RSIN(String transectionId, String serviceName, String messages){
		try {
			StringBuilder logDetail = new StringBuilder();
			logDetail.append(DateUtil.getDateTimeCurrent());logDetail.append("|");
			logDetail.append(DateUtil.getHostAddress());logDetail.append("|");
			logDetail.append("RSIN");logDetail.append("|");
			logDetail.append(serviceName);logDetail.append("|");
			logDetail.append("SSID="+transectionId);logDetail.append("|");
			logDetail.append("DATA="+messages);logDetail.append("|");

			log.info(logDetail.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getLogDetail_RSOU(String transectionId, String serviceName, String messages){
		try {
			StringBuilder logDetail = new StringBuilder();
			logDetail.append(DateUtil.getDateTimeCurrent());logDetail.append("|");
			logDetail.append(DateUtil.getHostAddress());logDetail.append("|");
			logDetail.append("RSOU");logDetail.append("|");
			logDetail.append(serviceName);logDetail.append("|");
			logDetail.append("SSID="+transectionId);logDetail.append("|");
			logDetail.append("DATA="+messages);logDetail.append("|");

			log.info(logDetail.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
