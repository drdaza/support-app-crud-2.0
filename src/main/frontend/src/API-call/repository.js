import request from "./requestRepository/request";

export default class repository{
    api; 
    constructor (api){
        this.api = api;
       
        
        
        
    }
    chooseApi(){ 
        if (this.api == "request") return new request();
}
}