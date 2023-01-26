import { defineStore } from 'pinia';
import repository from '../API-call/repository'
export const RequestStore = defineStore({
    id: "request",
    state: ()=>({
        Requests: [],
    }),
    actions:{
        async AsignRequest(){
            const repositoryApi = new repository("request");
            let api = repositoryApi.chooseApi();

            console.log(api);
            this.Requests = await api.getAll();
            
        }

    }
})