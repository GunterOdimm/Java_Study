package Study.java.program;

import java.io.File;

public class Main01 {
	public static void main(String[] args) {
		
		File f1 = new File("src/Main01.java");
		
		boolean is_file = f1.isFile();
		System.out.println("isFile = " + is_file);
		
		boolean is_dir = f1.isDirectory();
		System.out.println("isDirectory = " + is_dir);
		
		boolean is_hidden = f1.isHidden();
		System.out.println("isHidden = " + is_hidden);
		
		String abs = f1.getAbsolutePath();
		System.out.println("절대경로" + abs);
		
		boolean is_exist = f1.exists();
		System.out.println("존재여부 : " + is_exist);
		
		System.out.println("---------------------------");
		
		File f2 = new File("a/b/c/target");
		System.out.println("isFile : " + f2.isFile());
		System.out.println("isDirectory : " + f2.isDirectory());
		System.out.println("isHidden : " + f2.isHidden());
		System.out.println("절대경로 : " +  f2.getAbsolutePath());
		System.out.println("존재여부 : " + f2.exists());
		
		f2.mkdirs();
		System.out.println("--------------------------");
		
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		
		System.out.println(f1.getParent());
		System.out.println(f2.getParent());
		
		System.out.println("--------------------------");
		
		boolean del_ok = f2.delete();
		System.out.println("삭제성공여부 : " + del_ok);
		
	}

}
