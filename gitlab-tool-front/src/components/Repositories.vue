<template>
  <table class="table-auto">
    <thead>
    <tr>
      <th></th>
      <th>Project</th>
      <th>Repository</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    </tbody>
  </table>
</template>

<script>
import axios from 'axios';

export default {
  name: "Repositories",
  data() {
    return {groups: []}
  },
  methods: {
    async getGroups() {
      const ctx = this;
      const resp = await axios.get('http://localhost:8081/groups');
      console.log(resp.data);
      ctx.groups.push(resp.data);
    }
  },
  mounted() {
    this.getGroups();
  }
}
</script>

<style scoped>

</style>
