<template>

  <div class="grid grid-cols-1 gap-4">
    <router-link to="/repository">
      <button class="btn btn-blue w-full">Start Feature</button>
    </router-link>
    <button class="btn btn-blue">Finish Feature</button>
    <button class="btn btn-blue">Start Release</button>
    <button class="btn btn-blue">Finish Release</button>
  </div>

</template>

<script>


export default {
  name: "Main"
}
</script>

<style scoped>
</style>
