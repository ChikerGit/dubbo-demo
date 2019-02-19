
# dubbo-demo

dubbo开发demo


## 开发环境

- idea
- jdk1.8+
- zookeeper
- mysql
- maven

## 项目中使用到的私有包

- [optimus-common](https://github.com/deepexi/optimus-commons)

## deepexi-user-center

该微服务下实现要求的功能


## deepexi-product-center

该微服务作为消费者，调用deepexi-user-center，实现远程调用


## docker部署

e.g.

```bash
$ cd deepexi-user-center
$ ./start-code.sh
```
