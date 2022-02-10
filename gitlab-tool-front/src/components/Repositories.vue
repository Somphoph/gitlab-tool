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
        <th>URL</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="project in projects" :key="project.id">
        <td>{{ project.id }}</td>
        <td>{{ project.name }}</td>
        <td>{{ project.url }}</td>
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
    return {
      groups: [],
      projects: []
    }
  },
  methods: {
    async getGroups() {
      const ctx = this;
      const resp = await axios.get('http://localhost:8081/groups');
      ctx.groups.push(...resp.data);
    },
    async getProjects() {
      const ctx = this;
      const resp = await axios.get('http://localhost:8081/projects');
      ctx.projects.push(...resp.data);
    }
  },
  mounted() {
    this.getProjects();
  }
}
</script>

<style scoped>

</style>
