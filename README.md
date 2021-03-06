# BookStore-Android

### Bookstore的安卓手机端App

#### 1.开发环境相关

​	**安装apk需要**：Android版本6.0以上

​	**开发环境**：Android Studio 2.2 及 IntelliJ IDEA 2016.2 + Windows 10 1607(64 bit) 及 MAC OS

#### 2.项目技术难点

- Retrofit发送异步请求，UI线程接收Callback & Retrofit中RxJava的应用
- Google响应式框架Agera的使用
- Glide加载网络图片
- Android应用调试方法
- JUnit编写单元测试代码
- 界面设计工具Sketch的使用
- (To be continued...)


#### 3.前端逻辑

> 刚才想了一下旧书的交易流程，就当做是初步的业务逻辑吧
>      首先，卖家发布旧书信息，在个人资料中提供一种有效的联系方式。买家通过平台与卖家联系，说明自己的诉求（如果可能的话还有报价etc.），系统随之为两人分配一个交易二维码或者序列号。
>     然后，两人见面，确认二维码匹配后进行交易。交易结束后两人都需要点击确认交易完成，若有一方未在规定的时间内点击，则扣除对方的信用分。（比如我见到迟神之后发现uu已经把书先买走了，这时我就不点交易完成，之后便会扣除迟神的信用分）
>     最后可以对交易进行评价，更可以将买家成功购买过的旧书展示到个人主页上，方便他以后再成为新一轮（下一届学生）的卖家。
>     对信用分可以引入奖惩机制，比如小礼品等

​	（节选自小组聊天记录）

#### 4.开发日志

- [x] 2016-12-20 18:38:21  App业务模型（Model）的建立
- [x] 2016-12-22 00:34:33  登录界面完成
- [x] 2016-12-22 18:36:41   商品展示界面
- [x] 2016-12-22 10:39:09 App前端界面（View）及后端业务逻辑（ViewModel）绑定
- [x] 2016-12-23 18:37:32  交易及个人信息展示界面
- [x] 2016-12-23 18:37:55  ViewModel和Model的整合