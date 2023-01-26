<script setup>
import { ref } from "vue";
import { RequestStore } from "../stores/RequestStore";

let requestStore = RequestStore();
let id = ref(0);
let name = ref("");
let date = ref("");
let type = ref("");
let description = ref("");
const postMethod = () => {
  let dateRequest = date.value.split("-");
  let temporalObject = {
    id: id.value,
    name: name.value,
    date: {
      year: parseInt(dateRequest[0]),
      month: parseInt(dateRequest[1]),
      day: parseInt(dateRequest[2]),
    },
    type: type.value,
    description: description.value,
  };
  requestStore.postNewRequest(temporalObject);
};
</script>

<template>
  <div class="wrapper">
    <h2 class="titulo-lista">Form</h2>
    <div class="container-form">
      <div class="input-zone">
        <Label class="lable-item">Enter your id</Label>
        <input class="input-item" type="number" v-model="id" />
      </div>
      <div class="input-zone">
        <Label class="lable-item">Enter your Name</Label>
        <input class="input-item" type="text" v-model="name" />
      </div>
      <div class="input-zone">
        <Label class="lable-item">Enter the date request</Label>
        <input class="input-item" type="text" v-model="date" />
      </div>
      <div class="input-zone">
        <Label class="lable-item">Type of request</Label>
        <input class="input-item" type="text" v-model="type" />
      </div>
    </div>
    <div class="description-input">
      <label class="description-label">Description</label>
      <textarea cols="100" rows="10" v-model="description"></textarea>
    </div>
    <div class="button-zone">
      <button class="button-send" @click="postMethod()">Send</button>
      <button class="button-cancel">Cancel</button>
    </div>
  </div>
</template>

<style scoped lang="scss">
@import "../Sass/Form.scss";
</style>
