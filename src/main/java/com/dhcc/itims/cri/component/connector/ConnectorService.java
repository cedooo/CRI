package com.dhcc.itims.cri.component.connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/11/27.
 */
@Component
public class ConnectorService {
    protected Set<CRIConnector> connectors = new HashSet<CRIConnector>();

    @Autowired
    public ConnectorService(List<CRIConnector> connectorList){
        connectors.addAll(connectorList);
        init();

    }
    private void init(){
        for (CRIConnector connector :
                connectors) {
            Thread t = new Thread(connector);
            t.start();
        }

    }
}
