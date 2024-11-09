<template>
  <div class="table-container">
    <el-table :data="data" style="width: 100%" max-height="250">
      <el-table-column fixed prop="userNo" label="用户编号" width="120"/>
      <el-table-column prop="createTime" label="登记日期" width="150"/>
      <el-table-column prop="username" label="用户姓名" width="120"/>
      <el-table-column prop="gender" label="性别" width="120"/>
      <el-table-column prop="phone" label="电话号码" width="120"/>
      <el-table-column prop="address" label="家庭地址" width="120"/>
    </el-table>
  </div>
</template>

<script lang="ts" setup>
import {ref} from 'vue';
import {listUser} from '@/apis/user';
import {onMounted} from "vue";

let data = ref([]);

const userData = async () => {
  try {
    const res = await listUser();
    data.value = res.data; // 使用 .value 更新 ref 的值
  } catch (e) {
    console.error(e);
  }
};

onMounted(() => {
  userData();
});
</script>
