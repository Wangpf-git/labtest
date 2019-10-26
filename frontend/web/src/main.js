import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from "element-ui"
import "@/assets/style/element-variables.scss";
import store from "./store"
import _ from 'lodash'
Vue.config.productionTip = false
Vue.use(ElementUI); //引入element-ui
new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')