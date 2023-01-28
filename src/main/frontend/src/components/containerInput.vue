<script setup>
import requestPayload from '../API-call/payloads/requestPayload';

import { RequestStore } from "../stores/RequestStore";

const requestStore = RequestStore();
requestStore.AsignRequest();

function deleteRequest(id){
for (let requestElement of requestStore.Requests) {
  if(id == requestElement.id) {
    let temporalObject = {
    id: requestElement.id,
    name: requestElement.name,
    date: requestElement.date,
    type: requestElement.type,
    description: requestElement.description,
  };
  requestStore.deleteRequest(temporalObject);

  }
}
}
const props = defineProps({
  request: {
    type: requestPayload,
    required: true
  }
})
</script>
<template>
  <div class="container-list">
    <div class="container-input">
      <p>{{ request.description }}</p>
      <div class="button-zone">
      <button class="edit">Edit</button>
      <button class="delete" @click="deleteRequest(props.request.id)">Delete</button></div>
    </div>
  </div>
</template>
<style scoped lang="scss">
@import "../Sass/containerInput.scss";
</style>
