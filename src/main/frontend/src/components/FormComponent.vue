<script setup>
import { ref } from 'vue';
import request from '../API-call/requestRepository/request';
let id = ref(0);

const postMethod = ()=>{
  let temporalObject = {
    "id": id.value,
  
  }
  /* request.create(temporalObject); */
}
</script>

<template>
  <div class="wrapper">
    <h2 class="titulo-lista">Form</h2>
    <div class="container-form">
      <div class="input-zone">
        <Label class="lable-item">Enter your id</Label>
        <input class="input-item" type="number" v-model="id"/>
      </div>
      <div class="input-zone">
        <Label class="lable-item">Enter your Name</Label>
        <input class="input-item" type="text" />
      </div>
      <div class="input-zone">
        <Label class="lable-item">Enter the date request</Label>
        <input class="input-item" type="text" />
      </div>
      <div class="input-zone">
        <Label class="lable-item">Type of request</Label>
        <input class="input-item" type="text" />
      </div>
    </div>
    <div class="description-input">
      <label class="description-label">Description</label>
      <textarea name="" id="" cols="100" rows="10"></textarea>
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
