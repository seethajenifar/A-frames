package org.frame;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
public class FileOperation {
public static void main(String[] args)throws IOException {
//	File f = new File("c://File Operation\\java");
//	File f = new File("c://File Operation\\selenium");
//	File f = new File("c://File Operation\\selenium");
//	File f = new File("c://File Operation\\framework\\a\\b\\c");
//	File f = new File("sample");
//folder	
//	boolean mkdir = f.mkdir();
//	System.out.println(mkdir);
//subfolder	
	File f= new File("c://File Operation\\framework\\a\\b\\c");
	boolean mkdirs = f.mkdirs();
	System.out.println(mkdirs);
//get Absolutepath	
	String Absoluteath = f.getAbsolutePath();
	System.out.println(Absoluteath);
//create a new file
	File f2 = new File("c:\\File operation\\file.pdf");
	boolean createNewFile = f2.createNewFile();
	System.out.println(createNewFile);
	System.out.println("actions");
	boolean canRead = f2.canRead();
	System.out.println("read:"+canRead);
	System.out.println("write:"+f2.canWrite());
	System.out.println("execute:"+f2.canExecute());
	System.out.println("hidden:"+f2.isHidden());
	System.out.println("delete:"+f2.delete());
	System.out.println("exist:"+f2.exists());
	File f3= new File("c:\\Filef3.mkdir()");
	File f4= new File("c:\\File operation\\newfile.txt");	
	f4.createNewFile();
	System.out.println("is f3 a file :"+f3.isFile());
	System.out.println("is f4 a file :"+f4.isFile());
	System.out.println("is f3 a folder:"+f3.isDirectory());
	System.out.println("is f4 a folder:"+f3.isDirectory());
	//list
	File f5= new File("c:\\File operation");	
	String[]list = f5.list();
	System.out.println("folder and file count:"+list.length);
	System.out.println("file name:");
	for (int i = 0;i<list.length;i++){
	System.out.println(list[i]);
	}
	//list files
	System.out.println("location");
	File[] If = f5.listFiles();
	File(File x:If);{
	System.out.println(x);
	}
	//write
	File f6 = new File("c\\File operation\\write.text");
	FileUtils.write(f6, "welcome to java", false);;
	FileUtils.write(f6, "\nwelcome to selenium",true);
//read	
List<String> r1 = FileUtils.readLines(f6);
	System.out.println("total no of lines:"+r1.size());
	System.out.println("rint lines");
	for(String x:r1) {
	System.out.println(x);
	}
	//copy
	File src = new File("c:\\file operation\\ packages.txt");
	File des = new File("c:\\ file operation\\dulicateackage.text");
	FileUtils.copyDirectory(src, des);	
}
}
