<script setup></script>
<template>
  <div class="container-list">
    <div class="container-input">
      <input class="inputs" type="text" :id="name" :name="name" />
      <button class="edit">EDIT</button>
      <button class="delete">DELETE</button>
    </div>
  </div>
</template>
<style scoped lang="scss">
@import "../Sass/containerInput.scss";
</style>
