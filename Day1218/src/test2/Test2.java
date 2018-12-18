/**
 * 使用文件类File中相应的方法，实现如下效果：
  先判断D盘根目录下是否存在文件夹temp
    若存在
      判断该文件夹下是否存在文件test.txt
       文件若存在，直接删除
       否则，创建一个新的文件test.txt

    否则，创建目录。
    要求：运行三次程序，所有的分支都要执行到。
 */
package test2;

import java.io.File;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for(int i = 1;i<=3;i++) {
			myFunction();
		}

	}
	
	public static void myFunction() throws IOException {
		File f = new File("D://temp");
		if(f.exists()) {
			File f1 = new File("D://temp//test.txt");
			if(f1.exists()) {
				f1.delete();
			}else {
				f1.createNewFile();
			}
		}	
		System.out.println("完成了一次");
	}

}
