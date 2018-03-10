# BanchooBot
[![Build status](https://ci.appveyor.com/api/projects/status/3drtvuj5mphatnuh?svg=true)](https://ci.appveyor.com/project/1004121460/banchoobot)

N次重构后的BanchooBot

## Modules
- `/`             BanchooBot 主体
- `/http-server`  Http 服务器
- `/bot-frame`    Bot 框架

## 编译
```bash
cd http-server
mvn clean compile install
cd ..
cd bot-frame
mvn clean compile install
cd ..
mvn clean compile install
```
