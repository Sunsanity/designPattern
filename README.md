"# designPattern" 
常用设计模式练习代码

Observer:观察者模式

定义：观察者模式定义了对象之间一种一对多的关系，当主体对象的状态信息发生变化时，所有依赖于它的观察者都会得到通知并且自动更新状态。

优点：动态联动，观察者与主体的松耦合。

推模型：推模型推部分数据给观察者，有局限性。

拉模型：拉模型直接将目标对象传递给观察者，观察者根据需要取出数据。

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/Observer.png)





COR:Chain of Responsibility:责任链模式

定义：作为请求接受者的多个对象通过对其后继的引用连接起来形成一条链，客户端的请求在这条链上传递，直到链上的某一个接收者处理这个请求，每个接收者都可以选择自行处理请求或是向后继传递请求。

优点：责任链模式提供给客户端的只有一个接口，而不是某个具体的类，体现了客户端与业务逻辑的松耦合，客户端并不知道自己的请求被哪一个接收者处理，客户端只关心自己的请求能够被处理。责任链模式体现了面向对象设计原则中的依赖于抽象，而不依赖于具体，对新增开放，对修改关闭，使客户端和业务逻辑充分解耦。

缺点：
1.性能：
  接收用户请求时需要遍历责任链直到某个handler处理了这个请求或者遍历完整条责任链才算处理完这个请求。相比处理请求，可能责任链的传递花费的时间更多，会造成性能的损耗。

2.内存：
  责任链需要初始化多个对象，处理客户端请求时只会用到一个handler，对于内存来说是一种消耗。
  
3.实际应用：
  过滤器：有一点点区别，过滤器中可能有多个处理器会处理请求。而责任链模式中只会有一个handler处理请求。

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/COR.png)

单例模式:Singleton  保证只会存在一个实例，需要使用双重检测机制判断实例是否为空，同时要使用volatile保证构造单例时的指令重排序导致的返回为初始化的单例对象

模板方法模式:

模板方法实现要素：准备一个抽象模板父类，父类中一部分逻辑以具体方法实现，然后声明一些抽象方法交给子类定制个性化实现，父类可以声明一些钩子函数，给子类更大的灵活性，最后父类将所有的具体和抽象方法汇总成一个不可改变的(final)模板方法。

模板方法的适用场景：

1.算法或操作有相似的逻辑

2.旧项目重构时把相同的代码抽取到父类中

3.新项目分析业务功能时，将相同的算法设计为模板算法

优点:

1.封装性好，核心算法封装到抽象父类中，对外只提供一个公用的不可更改的模板方法

2.复用性好，核心算法集成了多种功能，客户端可以轻松实现复用

3.屏蔽细节，父类已经实现部分模板功能，无需子类实现，对外不会暴露细节

4.便于维护，开发成本降低，以后维护的成本降低，维护只需要修改抽象父类逻辑

缺点：
JAVA支持单继承，对于旧系统中多数类已经处于继承层次中，无法再次实现一个抽象的模板父类

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/modelMethod.jpg)

适配器模式:

适配器模式将一个类的接口转换成用户期望的另外一个接口，使得原本由于接口不兼容而不能一起工作的类在一起工作。

作用：

1.复用了当前存在的类，解决了现存类和复用环境要求不一致的问题。

2.将目标类和适配者类解耦，通过引入一个适配器类重用了适配者类，而无需修改原有代码，遵循了开闭原则。

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/adapter.png)

策略模式：

策略模式是将可变的部分从程序中抽象分离成算法接口，在该接口下分别封装一系列算法实现并使他们可以互相替换，从而导致客户端程序和具体的算法解耦合。

三种实现方式：

1：继承父类，父类实现具体的算法：缺点明显，子类可能忘记复写父类的方法

2：继承抽象父类，父类定义抽象算法要求子类必须复写：缺点是即使实现相同的多个子类也还是需要都复写一遍父类的抽象方法，没有实现代码的重用，而且JAVA只支持单继承

3：定义一个算法接口，子类实现具体的实现，然后每个子类根据自身需要存入一个算法的实现类，然后调用实现类的接口实现。
优点：

1：实现了代码的复用，需要相同算法实现的类不需要有重复代码。

2：遵循开闭原则，新增业务需求只需要新增一个类而不用修改原有的类

3：消除大量条件语句

缺点：

1：客户端代码需要了解每个策略的具体实现

2：随着时间的推移，具体算法类越来越多，增加维护成本

策略模式的使用场景：

1：许多相关的类仅仅是具体的细节存在一定的差异

2：程序需要在运行时选取不同的算法变体

3：存在多个条件语句判断时

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/strategy.png)


工厂模式：

简单工厂模式：

简单工厂模式不是23种里的一种，简而言之，就是有一个专门生产某个产品的类。
比如下图中的鼠标工厂，专业生产鼠标，给参数0，生产戴尔鼠标，给参数1，生产惠普鼠标。

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/simpleFactory.jpg)

工厂模式：

工厂模式也就是鼠标工厂是个父类，有生产鼠标这个接口。
戴尔鼠标工厂，惠普鼠标工厂继承它，可以分别生产戴尔鼠标，惠普鼠标。
生产哪种鼠标不再由参数决定，而是创建鼠标工厂时，由戴尔鼠标工厂创建。
后续直接调用鼠标工厂.生产鼠标()即可

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/factory.jpg)

抽象工厂模式：

抽象工厂模式也就是不仅生产鼠标，同时生产键盘。  也就是PC厂商是个父类，有生产鼠标，生产键盘两个接口。  戴尔工厂，惠普工厂继承它，可以分别生产戴尔鼠标+戴尔键盘，和惠普鼠标+惠普键盘。  创建工厂时，由戴尔工厂创建。  后续工厂.生产鼠标()则生产戴尔鼠标，工厂.生产键盘()则生产戴尔键盘。

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/abstractFactory.jpg)

在抽象工厂模式中，假设我们需要增加一个工厂

![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/abstractFactory1.jpg)

在抽象工厂模式中，假设我们需要增加一个产品

![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/abstractFactory2.jpg)

工厂模式优点：

1.隐藏了创建对象的过程的复杂度

2.省去部分需要大量构造函数参数的麻烦

工厂模式使用案例：

1：JDBC：db2,oracle,mysql不同的JDBC工具类统一实现JDBC接口，客户端调用数据操作工厂决定具体实例化哪一个JDBC工具类

2：springBean就是一个生产bean的容器

工厂方法模式和抽象工厂模式对比：

1：抽象工厂模式是工厂方法模式的推广

2：工厂方法模式创建一个产品的等级结构，而抽象工厂模式用来创建多个产品的等级结构

动态代理：

功能：就是在程序运行期动态生成字节码文件，然后用反射调用新类的构造方法得到代理对象，客户端调用代理对象的方法时调用的其实是被代理对象的方法，只是方法逻辑前后加上了其他逻辑

JDK动态代理要求被代理对象必须实现某个接口，某则无法为这个类代理，这个接口也体现出JDK和CGLIB代理的区别之处，CGLIB是在被代理对象的基础上生成一个被代理对象的子对象，而JDK代理则是
需要利用被代理对象实现的接口实现一个这个接口的实现类。

客户端还要写一个handler类实现InvocationHandler接口，实现invoke方法，然后由代理对象调用这个invoke方法，invoke方法里面再调用被代理对象的真正的方法，
同时方法前后加上增强的逻辑

类图：
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/jdkProxy.png)
![Alt text](https://github.com/eddiepengdenvren/designPattern/raw/master/images/cglibVSjdk.png)


