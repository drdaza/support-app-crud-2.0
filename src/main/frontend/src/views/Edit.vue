<script setup>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
</script>
<template>
  <Header></Header>
  <div class="wrapper">
    <h2 class="titulo-lista">Edit</h2>
    <div class="container-form">
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
    <div class="buton-zone">
      <button class="button-send">Send</button>
      <button class="button-reset">Reset</button>
      <button class="button-cancel">Cancel</button>
    </div>
  </div>
  <Footer></Footer>
</template>
<style lang="scss" scoped>
@import "../Sass/edit.scss";
</style>
