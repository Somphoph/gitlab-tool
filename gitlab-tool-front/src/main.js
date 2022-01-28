import Vue from 'vue'
import VueRouter from "vue-router";
import App from './App.vue'
import Main from "@/components/Main";
import Repositories from "@/components/Repositories";
import './main.css'
Vue.config.productionTip = false
Vue.use(VueRouter);

const routes = [
    {path: '/', redirect: '/main'},
    {path: '/main', component: Main},
    {path: '/repository', component: Repositories}
]
const router = new VueRouter({
    routes
})
new Vue({
    render: h => h(App),
    router,
}).$mount('#app')
