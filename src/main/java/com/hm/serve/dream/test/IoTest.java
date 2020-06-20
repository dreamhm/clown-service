package com.hm.serve.dream.test;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @创建人 【郝苗】
 * @创建时间 Date
 * @描述:
 */
public class IoTest {

//  1、读取控制台中的输入
    public static void main(String[] args) throws IOException {
//        test01();
//        test02();
        test03();
    }

    public static void test01() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符");
        char c;
        c = (char) bufferedReader.read();
        System.out.println("你输入的字符为：" + c);
    }

    public static void test02() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符，按 q 键结束");
        char c;
        do{
            c = (char) bufferedReader.read();
            System.out.println("你输入的字符为：" + c);
        }while (c != 'q');
    }

    public static void test03() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一行字符");
        String str = bufferedReader.readLine();
        System.out.println("你输入的字符为：" + str);
    }

//    2、二进制文件的写入和读取
//    注意这里文件的路径，可以根据自己情况改一下，虽然这里的文件后缀是txt，但该文件却是一个二进制文件，并不能直接查看
    @Test
    public void test04() throws IOException {
        byte[] bytes = {12,21,34,11,21};
        FileOutputStream fileOutputStream = new FileOutputStream(new File("").getAbsolutePath()+"/io/test.txt");
        // 写入二进制文件，直接打开会出现乱码
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    @Test
    public void test05() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("").getAbsolutePath()+"/io/test.txt");
        int c;
        // 读取写入的二进制文件，输出字节数组
        while((c = fileInputStream.read()) != -1){
            System.out.print(c);
        }
    }

//  3、文本文件的写入和读取
    /**
     * write() 方法和 append() 方法并不是像方法名那样，
     * 一个是覆盖内容，一个是追加内容，
     * append() 内部也是 write() 方法实现的，
     * 也非说区别，也就是 append() 方法可以直接写 null，而 write() 方法需要把 null 当成一个字符串写入，
     * 所以两者并无本质的区别。
     * 需要注意的是这里并没有指定文件编码，可能会出现乱码的问题。
     */
    @Test
    public void test06() throws IOException {
        FileWriter fileWriter = new FileWriter(new File("").getAbsolutePath()+"/io/test.txt");
        fileWriter.write("Hello, world! \n欢迎来到 java 世界\n");
        fileWriter.write("不会覆盖文件原本的内容\n");
//        fileWriter.write(null);
        fileWriter.append("并不是追加一行内容，不要被方法名迷惑\n");
        fileWriter.append(null);
        fileWriter.flush();
        System.out.println("文件的默认编码为" + fileWriter.getEncoding());
        fileWriter.close();
    }

    @Test
    public void test07() throws IOException {
        /**
         * FileWriter fileWriter = new FileWriter(new File("").getAbsolutePath()+"/io/test.txt", false);
         * false:关闭追加模式，变为覆盖模式(清空源文件内容，写入新内容);
         * true:开启追加模式(不清空源文件内容，最近新内容)
         */
        FileWriter fileWriter = new FileWriter(new File("").getAbsolutePath()+"/io/test.txt", false);
        fileWriter.write("Hello, world! \n欢迎来到 java 世界\n");
        fileWriter.write("我来覆盖文件原本的内容\n");
        fileWriter.append("我是下一行");
        fileWriter.flush();
        System.out.println("文件的默认编码为" + fileWriter.getEncoding());
        fileWriter.close();
    }

    @Test
    public void test08() throws IOException {
        FileReader fileReader = new FileReader(new File("").getAbsolutePath()+"/io/test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        while ((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }
        fileReader.close();
        bufferedReader.close();
    }

    @Test
    public void test09() throws IOException {
        FileReader fileReader = new FileReader(new File("").getAbsolutePath()+"/io/test.txt");
        int c;
        while ((c = fileReader.read()) != -1){
            System.out.print((char) c);
        }
        fileReader.close();
    }

//    使用字节流和字符流的转换类 InputStreamReader 和 OutputStreamWriter 可以指定文件的编码，使用 Buffer 相关的类来读取文件的每一行。
    @Test
    public void test10() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("").getAbsolutePath()+"/io/test2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK"); // 使用 GBK 编码文件
        outputStreamWriter.write("Hello，world！\n欢迎来到 java 世界\n");
        outputStreamWriter.append("另外一行内容");
        outputStreamWriter.flush();
        System.out.println("文件的编码为" + outputStreamWriter.getEncoding());
        outputStreamWriter.close();
        fileOutputStream.close();
    }

    @Test
    public void test11() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("").getAbsolutePath()+"/io/test2.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK"); // 使用 GBK 解码文件
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        bufferedReader.close();
        inputStreamReader.close();
    }

//  4、复制文件
    /**
     * 这里笔者做了一些测试，不使用缓冲对文件复制时间的影响，文件的复制实质还是文件的读写。缓冲流是处理流，是对节点流的装饰。
     * 注：这里的时间是在我这台华硕笔记本上测试得到的，只是为了说明使用缓冲对文件的读写有好处。
     */
    @Test
    public void test12() throws IOException {
        // 输入和输出都使用缓冲流
        FileInputStream in = new FileInputStream("C:\\Users\\14251\\Desktop\\yly\\viod\\一个人挺好.mp4");
        BufferedInputStream inBuffer = new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream("一个人挺好2.mp4");
        BufferedOutputStream outBuffer = new BufferedOutputStream(out);
        int len = 0;
        byte[] bs = new byte[1024];
        long begin = System.currentTimeMillis();
        while ((len = inBuffer.read(bs)) != -1){
            outBuffer.write(bs, 0, len);
        }
        System.out.println("复制文件所需的时间：" + (System.currentTimeMillis() - begin));//平均时长
        inBuffer.close();
        in.close();
        outBuffer.close();
        out.close();
    }

    @Test
    public void  test13() throws IOException {
        // 只有输入使用缓冲流
        FileInputStream in = new FileInputStream("C:\\Users\\14251\\Desktop\\yly\\viod\\一个人挺好.mp4");
        BufferedInputStream inBuffer = new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream("1.1大数据时代.mp4");
        int len = 0;
        byte[] bs = new byte[1024];
        long begin = System.currentTimeMillis();
        while ((len = inBuffer.read(bs)) != -1) {
            out.write(bs, 0, len);
        }
        System.out.println("复制文件所需时间：" + (System.currentTimeMillis() - begin)); // 平均时间约 500 多毫秒
        inBuffer.close();
        in.close();
        out.close();
    }

    @Test
    public void test14() throws IOException {
        // 输入和输出都不使用缓冲流
        FileInputStream in = new FileInputStream("C:\\Users\\14251\\Desktop\\yly\\viod\\一个人挺好.mp4");
        FileOutputStream out = new FileOutputStream("一个人挺好.mp4");
        int len = 0;
        byte[] bs = new byte[1024];
        long begin = System.currentTimeMillis();
        while ((len = in.read(bs)) != -1) {
            out.write(bs, 0, len);
        }
        System.out.println("复制文件所需时间：" + (System.currentTimeMillis() - begin)); // 平均时间 700 多毫秒
        in.close();
        out.close();
    }

    @Test
    public void test15() throws IOException {
        // 不使用缓冲
        FileInputStream in = new FileInputStream("C:\\Users\\14251\\Desktop\\yly\\viod\\一个人挺好.mp4");
        FileOutputStream out = new FileOutputStream("一个人挺好2.mp4");
        int len = 0;
        long begin = System.currentTimeMillis();
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        System.out.println("复制文件所需时间：" + (System.currentTimeMillis() - begin)); // 平均时间约 160000 毫秒，约 2 分多钟
        in.close();
        out.close();
    }
}
