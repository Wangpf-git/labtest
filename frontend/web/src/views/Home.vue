<template>
  <div class="home">
    <el-button type="primary" @click="aaa">请求测试</el-button>
    <p v-if="test1">测试数据：{{test1}}</p>
  </div>
</template>

<script>
import { test } from "@/api";
export default {
  name: "home",
  data() {
    return {
      test1:""
    };
  },
  methods: {
    async aaa() {
      let a = await test();
      this.test1 = a.data.hitokoto;
    }
  }
};
</script>
