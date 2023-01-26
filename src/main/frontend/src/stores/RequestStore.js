import { defineStore } from "pinia";
import repository from "../API-call/repository";
export const RequestStore = defineStore({
  id: "request",
  state: () => ({
    Requests: [],
  }),
  actions: {
    async AsignRequest() {
      const repositoryApi = new repository("request");
      let api = repositoryApi.chooseApi();

      
      this.Requests = await api.getAll();
    },
    async postNewRequest(data) {
      const repositoryApi = new repository("request");
      const Response = repositoryApi.chooseApi();

      let json = await Response.create(data);
      return json;
    },
    async deleteRequest(data) {
      const repositoryApi = new repository("request");
      const Response = repositoryApi.chooseApi();

      let json = await Response.delete(data);
      return json;
    },
  },
});
