package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import methods.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid {

	public static void main(String[] args) throws IOException 
	{
		DateFormat formate=new SimpleDateFormat("HH:mm:ss yyyy/MM/dd");
		Date d=new Date();
		System.out.println(d);
		String x=formate.format(d);
		System.out.println(x);
		
		String y=((x.replace(":", "")).replace(" ", "")).replace("/", "");
		System.out.println(y);
		
		OrgMaster om=new OrgMaster();
		String res=null;
		String xlpath="F:\\Morning1030AM_Rashmi_vinay\\SeleniumProject\\src\\testData\\Hybrid.xlsx";
		String xlout="F:\\Morning1030AM_Rashmi_vinay\\SeleniumProject\\src\\results\\Hybidres"+y+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet TC_Sht=wb.getSheet("Testcase");
		XSSFSheet TS_Sht=wb.getSheet("Teststeps");
		XSSFSheet td_Sht=wb.getSheet("TestData");
		XSSFSheet emp_Sht=wb.getSheet("Empreg");
		
		
		int tc_Rc=TC_Sht.getLastRowNum();
		int ts_Rc=TS_Sht.getLastRowNum();
		int emp_Rc=emp_Sht.getLastRowNum();
		
		for (int i = 1; i <= tc_Rc; i++) 
		{
			TC_Sht.getRow(i).createCell(3);
			String exe=TC_Sht.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=TC_Sht.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= ts_Rc; j++) 
				{
					String tstcId=TS_Sht.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcId)) 
					{
						String key=TS_Sht.getRow(j).getCell(3).getStringCellValue();
						
						switch (key)
						{
						case "Launch":
							String url=td_Sht.getRow(1).getCell(0).getStringCellValue();
							res=om.org_Launch(url);
							
							break;
						case "login":	
							String u=td_Sht.getRow(1).getCell(1).getStringCellValue();
							String p=td_Sht.getRow(1).getCell(2).getStringCellValue();
							res=om.org_Login(u, p);
							break;
						case "logout":
							res=om.org_Logout();
							break;
						case "Empreg":	
							for (int k = 1; k <= emp_Rc; k++)
							{
								String f=emp_Sht.getRow(k).getCell(0).getStringCellValue();
								String l=emp_Sht.getRow(k).getCell(1).getStringCellValue();
								res=om.org_Empreg(f, l);
								emp_Sht.getRow(k).createCell(2).setCellValue(res);
							}
							
							break;
						case "Usereg":	
							String ename=td_Sht.getRow(1).getCell(5).getStringCellValue();
							String uname=td_Sht.getRow(1).getCell(6).getStringCellValue();
							String pswd=td_Sht.getRow(1).getCell(7).getStringCellValue();
							String cpswd=td_Sht.getRow(1).getCell(8).getStringCellValue();
							res=om.org_userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String un=td_Sht.getRow(1).getCell(6).getStringCellValue();
							String ps=td_Sht.getRow(1).getCell(7).getStringCellValue();

							res=om.org_Login(un, ps);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						//Updating the result in test steps sheet
						TS_Sht.getRow(j).createCell(4).setCellValue(res);
						//Updating the result in test case sheet
						if (!TC_Sht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							TC_Sht.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				TC_Sht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
			
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		

	}

}
