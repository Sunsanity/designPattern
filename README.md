"# designPattern" 
常用设计模式练习代码

Observer:观察者模式

定义：观察者模式定义了对象之间一种一对多的关系，当主体对象的状态信息发生变化时，所有依赖于它的观察者都会得到通知并且自动更新状态。

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/Observer.jpg)

COR:Chain of Responsibility:责任链模式

定义：作为请求接受者的多个对象通过对其后继的引用连接起来形成一条链，客户端的请求在这条链上传递，直到链上的某一个接收者处理这个请求，每个接收者都可以选择自行处理请求或是向后继传递请求。责任链模式提供给客户端的只有一个接口，而不是某个具体的类，体现了客户端与业务逻辑的松耦合，客户端并不知道自己的请求被哪一个接收者处理，客户端只关心自己的请求能够被处理。

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/Observer.jpg)
