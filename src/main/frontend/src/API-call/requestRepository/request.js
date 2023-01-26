import requestPayload from "../payloads/requestPayload";

export default class request {
  url;
  constructor() {
    this.url = "http://localhost:8080/support-app-crud/api/request";
  }
  async getAll() {
    const response = await fetch(this.url, { method: "GET" });

    let json = await response.json();

    let requests = [];
    for (const request of json) {
      console.log(request);
      let temporalRequest = new requestPayload(
        request.id,
        request.name,
        request.date,
        request.type,
        request.description
      );
      requests.push(temporalRequest);
    }

    return requests;
  }
  async create(data) {
    const response = await fetch(this.url, {
      method: "POST",
      body: JSON.stringify(data),
    });
    return response;
  }
  async delete(data) {
    const response = await fetch(this.url, {
      method: "DELETE",
      body: JSON.stringify(data),
    });
    return response;
  }
}
