package com.amos.jvm;

import java.io.*;

/**
 * @ClassName : MyClassLoader
 * @Description :
 * @Author : mlb
 * @Date: 2020-07-23 16:31
 */
public class MyClassLoader extends ClassLoader {

    private String rootPath = "d:\\temp";

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String fileName = rootPath +File.separatorChar+ name.replace
                                ( '.', File.separatorChar)+ ".class";

        try {
            InputStream is = new FileInputStream(fileName);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int size = 1024;
            byte[] bytes = new byte[size];
            int length = 0;
            while ((length = is.read(bytes)) != -1) {
                baos.write(bytes, 0, length);
            }
            byte[] classData = baos.toByteArray();
            if (classData == null) {
                System.out.println("类不存在");
            } else {
                return defineClass(name, classData, 0, classData.length);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return super.findClass(name);
    }


}
