package com.dhcc.itims.cri.component.connector;

import com.dhcc.itims.cri.component.bo.DBService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/11/27.
 * 维护与接口的连接
 * 与 SHZDTService,SHZDTCRICollectJob 在同一概念层级上
 */
@Component("ConnectorService")
public class ConnectorService {
    protected Set<CRIConnector> connectors = new HashSet<CRIConnector>();
    protected DBService dbService;


    @Autowired
    public ConnectorService(List<CRIConnector> connectorList){
        connectors.addAll(connectorList);
        init();

    }
    @Autowired
    public void setDbService(DBService dbService) {
        this.dbService = dbService;
    }

    private void init(){
        //TODO 用线程池代替实现
        for (CRIConnector connector :
                connectors) {
            Thread t = new Thread(connector);
            t.start();
        }

    }

    public Set<CRIConnector> getConnectors() {
        return connectors;
    }
}
