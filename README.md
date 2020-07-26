## mall-商城小程序<br>
该项目仅用于学习，参考[litemall](https://github.com/linlinjava/litemall "悬停显示")搭建，选这个项目主要是因为litemall各模块和文档齐全，非常适合入门学习。<br>
## mall 项目结构<br>
mall-wx 微信小程序前端<br>
mall-admin 管理后台<br>
mall-all 小商场和管理后台的后端服务<br>
mall-wx-api 微信小程序前端调用api<br>
mall-admin-api 管理后台调用api<br>
mall-db 数据访问服务<br>
mall-core 通用服务<br>
## 项目预览<br>
![Alt text](https://github.com/Anhooo/mall/blob/master/img/index.png)<br>
![Alt text](https://github.com/Anhooo/mall/blob/master/img/category.png)<br>
![Alt text](https://github.com/Anhooo/mall/blob/master/img/my.png)<br>
![Alt text](https://github.com/Anhooo/mall/blob/master/img/admin-index1.png)<br>
![Alt text](https://github.com/Anhooo/mall/blob/master/img/admin-index.png)<br>
## 启动<br>
1. 环境配置<br>
[mysql](https://dev.mysql.com/downloads/mysql/ "悬停显示")<br>
[JDK1.8或以上](https://www.oracle.com/technetwork/java/javase/overview/index.html "悬停显示")<br>
[Maven](https://maven.apache.org/download.cgi "悬停显示")<br>
[Nodejs](https://nodejs.org/en/download/ "悬停显示")<br>
[微信开发者工具](https://developers.weixin.qq.com/miniprogram/dev/devtools/download.html "悬停显示")<br>
2. 导入litemall-db/sql下的数据库文件<br>
依次执行<br> 
litemall_schema.sql<br>
litemall_table.sql<br>
litemall_data.sql<br>
3. 商场和管理后台的后端服务<br>
	打开命令行，依次执行下面命令
	```
	cd mall
  	mvn install
  	mvn clean package
  	java -Dfile.encoding=UTF-8 -jar mall-all/target/mall-all-1.0-SNAPSHOT-exec.jar
	```
4. 商场和管理后台的后端服务<br>
	打开命令行，依次执行下面命令
	```
  	npm install -g cnpm --registry=https://registry.npm.taobao.org
  	cd mall/mall-admin
  	cnpm install
  	cnpm run dev
	```
	浏览器打开，输入网址http://localhost:9527, 此时进入管理后台登录页面。<br>
5. 小程序启动<br>
5.1. 下载微信开发者工具<br>
5.2. 导入mall-wx项目<br>
5.3. 项目配置，启用“不校验合法域名、web-view（业务域名）、TLS 版本以及 HTTPS 证书”<br>
5.4. 点击“编译”，即可在微信开发工具预览效果<br>
5.5. 也可以点击“预览”，然后手机扫描登录（但是手机需开启调试功能）<br>
	
