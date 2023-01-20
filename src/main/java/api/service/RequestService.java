package api.service;

import java.util.List;

import com.google.gson.Gson;

import api.contract.InterfaceService;
import api.models.RequestModel;

public class RequestService implements InterfaceService {
    private RequestModel requestModel;
    private Gson gson;
    

    public RequestService() {
        this.requestModel = new RequestModel();
        this.gson = new Gson();
    }


    @Override
    public List<Object> index() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
