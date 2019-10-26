## 项目
- web：前台页面
- backstage：后台前端页面

## 启动方式
 npm run start

## 打包方式
 npm run build 

## 本项目使用vue-cli 具体配置详见
 [vue-cli](https://cli.vuejs.org/zh/config/#%E5%85%A8%E5%B1%80-cli-%E9%85%8D%E7%BD%AE)

## 使用插件
- [element-ui UI框架](https://element.eleme.cn/#/)
- [vue-router VUE路由](https://router.vuejs.org/zh/)
- [vuex 状态管理](https://vuex.vuejs.org/)
- [axios HTTP客户端](https://github.com/axios/axios)
- [lodash  JavaScript方法扩展](https://www.lodashjs.com/)
- [scss  CSS扩展](http://sass.bootcss.com/docs/sass-reference/)
- [js-base64  base64加密](https://www.npmjs.com/package/js-base64)


## 初始化目录层级(开发在src目录下)
- api  接口管理
- assets  静态资源管理
- components 组件管理
- router 路由管理
- store 状态管理(非跨组件复杂关系不推荐使用)
- utils 工具管理
- views vue页面管理

## 环境配置(修改文件)
开发环境：.env.development
打包正式环境：.env.production