package api.contract;

import java.io.BufferedReader;

import java.util.List;

public interface InterfaceService {
    public List<Object> index();   
    public Object Save(BufferedReader body);
    public List<Object> delete(BufferedReader body);
    public Object update(BufferedReader body);
}
