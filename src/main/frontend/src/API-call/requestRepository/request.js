import requestPayload from "../payloads/requestPayload";

export default class request {
  url;
  constructor() {
    this.url = "http://localhost:8080/support-app-crud/api/request";
  }
  async getAll() {
    const response = await fetch(this.url, { method: "GET" });
    let requests = [];
    let json = await response.json();
    for (const request of json) {
      let temporalRequest = new requestPayload(request.id, request.name, request.date, request.type, request.description);
      requests.push(temporalRequest);


    }
    return requests;
  }
}
