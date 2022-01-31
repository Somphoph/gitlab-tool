<template>
  <div>
    <div>
      <select>
        <option>Please Select</option>
        <option v-for="group in groups" :key="group.id" :value="group">{{ group.name }}</option>
      </select>
    </div>
    <table class="border-collapse table-auto w-full text-sm">
      <thead>
      <tr>
        <th>#</th>
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
  </div>
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
      ctx.groups.push(...resp.data);
    }
  },
  mounted() {
    this.getGroups();
  }
}
</script>

<style scoped>

</style>
