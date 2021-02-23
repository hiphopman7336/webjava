package com.tot.th.esb.utilities;

import java.net.HttpURLConnection;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
public class InterruptThread implements Runnable {

    HttpURLConnection con;
    public InterruptThread(HttpURLConnection con) {
        this.con = con;
    }

    public void run() {
        try {
            Thread.sleep(HttpConnectionUtil.TIMR_OUT); // or Thread.sleep(con.getConnectTimeout())
        } catch (InterruptedException e) {

        }
        con.disconnect();
        System.out.println("Timer thread forcing to quit connection");
    }
}
