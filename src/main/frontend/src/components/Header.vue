<script setup>
import { RouterLink } from "vue-router";
</script>
<template>
  <div id="header-component">
    <header>
      <img
        src="../components/img/support-logo.png"
        alt="Support Logo"
        id="support-logo"
      />
      <div id="nav-div">
        <h1>Support App</h1>
        <nav id="navbar">
          <ul>
            <li class="li-item">
              <RouterLink to="/" class="router-link-active"> HOME</RouterLink>
            </li>
            <li class="li-item">
              <RouterLink to="/list" class="router-link-active">
                LIST</RouterLink
              >
            </li>
            <li class="li-item">
              <RouterLink to="/form" class="router-link-active">
                FORM</RouterLink
              >
            </li>
          </ul>
        </nav>
      </div>
    </header>
  </div>
</template>
<style lang="scss" scoped>
@import "../Sass/header.scss";
</style>
