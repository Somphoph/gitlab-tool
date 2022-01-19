<template>
  <table class="table">
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
import {interval} from "rxjs";
import {startWith, switchMap} from 'rxjs/operators';

export default {
  name: "Repositories",
  data() {
    return {groups: []}
  },
  methods: {
    getGroups() {
      const request = interval(1000).pipe(
          startWith(0),
          switchMap(() =>
              fetch('http://localhost:8081/groups')
                  .then((response) => response.json())
          ));

      request.subscribe((data) => {
        console.log(data);
      })
    }
  },
  mounted() {
    this.getGroups();
  }
}
</script>

<style scoped>

</style>
