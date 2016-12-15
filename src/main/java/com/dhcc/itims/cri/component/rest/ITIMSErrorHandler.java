package com.dhcc.itims.cri.component.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ITIMSErrorHandler implements ResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse clienthttpresponse) throws IOException {
        System.out.print(clienthttpresponse);

        if (clienthttpresponse.getStatusCode() != HttpStatus.OK) {

            if (clienthttpresponse.getStatusCode() == HttpStatus.FORBIDDEN) {

                return true;
            }
        }
        return false;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        if (response.getStatusCode() == HttpStatus.FORBIDDEN) {
            System.out.print(response);
        }

    }
}
