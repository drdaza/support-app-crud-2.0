export default class requestPayload {
    id;
    name;
    date;
    type;
    description;

    constructor (id, name , date, type, description) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
        this.description = description;
    }
}