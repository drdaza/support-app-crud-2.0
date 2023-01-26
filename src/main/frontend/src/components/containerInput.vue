<script setup></script>
<template>
  <div class="container-list">
    <div class="container-input">
      <input class="inputs" type="text" :id="name" :name="name" />
      <button class="edit">Edit</button>
      <button class="delete">Delete</button>
    </div>
  </div>
</template>
<style scoped lang="scss">
@import "../Sass/containerInput.scss";
</style>
