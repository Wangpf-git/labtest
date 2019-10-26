import Vue from "vue";
import Router from "vue-router";
import Home from "../views/Home.vue";
import Login from "../views/login.vue";

Vue.use(Router);

export default new Router({
  mode: "history",
  // base: process.env.VUE_APP_TEST,
  routes: [
    {
      path: "/",
      name: "home",
      component: Home
    },
    {
      path: "/login",
      name: "login",
      component: Login
    },
  ]
});
