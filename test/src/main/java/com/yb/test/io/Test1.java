package com.yb.test.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * 压缩流
 */
public class Test1 {
	public static void main(String args[]) throws Exception {
		args = new String[] { "C:\\Users\\Administrator\\Desktop\\test1.txt", "C:\\Users\\Administrator\\Desktop\\test2.txt" };
		//输入若干文件名,将所有文件压缩为w.zip
		ZipOutputStream zos = new ZipOutputStream(
				new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test.zip")));
		for (int i = 0; i < args.length; i++) {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(args[i]));
			//将每个要压缩的文件称为一个压缩入口,使用ZipEntry生成压缩入口对象
			//使用putNextEntry(ZipEntry entry)将压缩入口加入到压缩文件
			zos.putNextEntry(new ZipEntry(args[i]));
			int b;
			while ((b = bis.read()) != -1)
				zos.write(b);
			bis.close();
		}
		zos.close();
		//解压缩文件并显示
		ZipInputStream zis = new ZipInputStream(
				new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\test.zip")));
		ZipEntry z;
		while ((z = zis.getNextEntry()) != null)//获得入口
		{
			System.out.println(z.getName());//显示文件初始名
			int x;
			while ((x = zis.read()) != -1)
				System.out.write(x);
			System.out.println();
		}
		zis.close();
	}
}