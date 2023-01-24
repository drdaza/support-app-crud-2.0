package api.service;

import java.io.BufferedReader;
import java.util.List;

import com.google.gson.Gson;

import api.contract.InterfaceService;
import api.models.RequestModel;
import api.payloads.RequestPayLoads;

public class RequestService implements InterfaceService {
    private RequestModel requestModel;
    private Gson gson;
    

    public RequestService() {
        this.requestModel = new RequestModel();
        this.gson = new Gson();
    }


    @Override
    public List<Object> index() {
        
        return requestModel.index();
    }


    @Override
    public Object Save(BufferedReader body) {
        try {
            
            RequestPayLoads requestPayLoads = gson.fromJson(body, RequestPayLoads.class);
            
            RequestPayLoads addedRequest = requestModel.save(requestPayLoads);
            return addedRequest;
        } catch (Exception e) {
            System.out.println("Error servicio: "+ e.getMessage());
            return null;
        }
        
    }

    
}
