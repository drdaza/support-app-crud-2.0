<script setup>
import requestPayload from '../API-call/payloads/requestPayload';

const props = defineProps({
  request:{
    type: requestPayload,
    required: true
  }
})
</script>
<template>
  <div class="container-list">
    <div class="container-input">
      <p>{{ request.description }}</p>
      <button class="edit">Edit</button>
      <button class="delete">Delete</button>
    </div>
  </div>
</template>
<style scoped lang="scss">
@import "../Sass/containerInput.scss";
</style>
