package com.example.classloader.namespace;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyClassloader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = this.loadClassData(name);
        return  this.defineClass(name,data, 0, data.length);
    }

    private byte[] loadClassData(String className){
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try{
            className = className.replace(".","//");
            //System.out.println("className:" +this.className);
            is = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\" + className + ".class"));
            baos = new ByteArrayOutputStream();
            int ch = 0;
            while ( -1 != (ch = is.read())){
                baos.write(ch);
            }
            data = baos.toByteArray();

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                is.close();
                baos.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

        return  data;

    }
}
