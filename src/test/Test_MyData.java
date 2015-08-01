package test;

import com.util.TestUtil;
import com.util.Xls_Reader;

public class Test_MyData {

	public static void main(String[] args) {
		
	 TestUtil.getData("LoginTest", new Xls_Reader(System.getProperty("user.dir")+"/src/com/xls/TestCases.xlsx"));
	 TestUtil.getData("ChangePicTest", new Xls_Reader(System.getProperty("user.dir")+"/src/com/xls/TestCases.xlsx"));
	 TestUtil.getData("FindFriendTest", new Xls_Reader(System.getProperty("user.dir")+"/src/com/xls/TestCases.xlsx"));

	}

}
