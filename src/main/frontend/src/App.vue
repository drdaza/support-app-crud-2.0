<script>
import { RouterView } from "vue-router";
</script>

<template>
  <RouterView class="router-link-active"/>
</template>

<style lang="scss">
@import "./Sass/variables.scss";
body {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  background-color: $backgroundColor;
}
</style>
