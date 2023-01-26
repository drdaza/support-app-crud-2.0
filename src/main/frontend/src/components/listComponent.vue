<script setup>
import ContainerInput from "./ContainerInput.vue";
import { RequestStore } from "../stores/RequestStore";

const requestStore = RequestStore();
requestStore.AsignRequest();


</script>
<template>
  <div id="list-component">
    <h2 class="titulo-lista">List</h2>
    <div id="list-id">
      <div v-for="request of requestStore.Requests">
        <ContainerInput
        :request="request"
      />
      </div>
      
      
    </div>
  </div>
</template>
<style scoped lang="scss">
@import "../Sass/listComponent.scss";
</style>
