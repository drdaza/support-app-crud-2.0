<script setup>
import { RouterLink } from "vue-router";
</script>

<template>
  <div id="home-view">
    <div class="background-home">
      <img
        id="suport-logo"
        src="../components/img/support-logo.png"
        alt="Home Photo"
      />
      <RouterLink to="/form" class="buton-home"> Go to the Form</RouterLink>
    </div>
  </div>
</template>
<style lang="scss" scoped>
@import "../Sass/Home.scss";
</style>
