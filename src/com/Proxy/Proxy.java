package com.Proxy;

import org.apache.commons.io.FileUtils;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by hasee on 2018/1/20.
 */
public class Proxy {

    //声明一段代理类的源码
    public static Object newProxyInstance(Class infce) throws Exception {
        String rt = "\r\t";

        String methodStr = "";
        for (Method m : infce.getMethods()){
            methodStr += "@Override"+ rt +
            "   public void "+m.getName()+"() {"+ rt +
            "      long starttime = System.currentTimeMillis();"+ rt +
            "      System.out.println(\"汽车开始行驶....\");"+ rt +
            "      m."+m.getName()+"();"+ rt +
            "      long endtime = System.currentTimeMillis();"+ rt +
            "      System.out.println(\"汽车结束行驶....  汽车行驶时间：\""+ rt +
            "               + (endtime - starttime) + \"毫秒！\");"+ rt +
            "   }";
        }


        String str =
        "package com.imooc.proxy;"+ rt +
        "public class $Proxy0 implements "+infce.getName()+" {"+ rt +
        "    public $Proxy0("+infce.getName()+" m) {"+ rt +
        "        super();"+ rt +
        "        this.m = m;"+ rt +
        "   }"+ rt +
        "   private "+infce.getName()+" m;"+ rt +
        methodStr + rt +
        "}";

        //产生代理类.java文件
        //设置将要生成的JAVA代理类的存放路径
        String fileName = System.getProperty("user.dir") + "/bin/com/immoc/proxy/$Proxy0.java";
        File file = new File(fileName);
        FileUtils.writeStringToFile(file,str);

        //编译
        //拿到编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        //文件管理者
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null,null,null);
        //获取文件
        Iterable units= fileManager.getJavaFileObjects(fileName);
        //编译任务
        JavaCompiler.CompilationTask t = compiler.getTask(null,fileManager,null,null,null,units);
        //编译
        t.call();
        fileManager.close();

        ClassLoader cl = ClassLoader.getSystemClassLoader();
        Class c = cl.loadClass("com.imooc.proxy.$Proxy0");

        //反射构造代理对象
        Constructor ctr = c.getConstructor(infce);
        return ctr.newInstance(new Car());
    }
}
