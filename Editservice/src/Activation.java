import static org.junit.Assert.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;




import javax.naming.spi.DirStateFactory.Result;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

//import net.neoremind.sshxcute.*;

import junit.framework.Assert;
import net.neoremind.sshxcute.core.ConnBean;
import net.neoremind.sshxcute.core.SSHExec;
import net.neoremind.sshxcute.exception.TaskExecFailException;
import net.neoremind.sshxcute.task.CustomTask;
import net.neoremind.sshxcute.task.impl.ExecCommand;


public class Activation {
	static SSHExec  ssh,ssh1,ssh2;
	private final String USER_AGENT = "Mozilla/5.0";

	final static String ibmgmt= "python /opt/tms/ib-framework/editservice/scripts/core/ib_mgmt_cli.py ";
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//ConnBean instaconnect = new ConnBean("192.168.193.169", "root","root@123");
		//ssh = SSHExec.getInstance(instaconnect);
		//ssh.connect();

		//ConnBean rubixconnect = new ConnBean("192.168.193.172", "root","root@123");
		//ssh1 = SSHExec.getInstance(rubixconnect);
		//ssh1.connect();
		
		//ConnBean namenodeconnect = new ConnBean("192.168.194.4", "root","root@123");
		//ssh2 = SSHExec.getInstance(namenodeconnect);
		//ssh2.connect();

	}
	
	/*
	class Oozieid{
		private Integer total;
		private Integer offset;
		private Integer len;
		private Workflows  workflows;
	}
	
    class Workflows{
    private String appName;
    private String externalId;
    private String conf;
    private String run;
    private String acl;
    private String appPath;
    private String parentId;
    private String lastModTime;
    private String consoleUrl;
    private String createdTime;
    private String startTime;
    private String toString;
    private String id;
    private String endTime;
    private String user;
    private ArrayList<String> actions;
    private String status;
    private String group;
    }
    */
    
	@After
	public void tearDown() throws Exception {
	}

    public Map<String,String> stateCheck() throws TaskExecFailException{
    	CustomTask ct3=  new ExecCommand("psql -U editservice -d editservice_gen -c 'select ibname,ibstatus,schedulets from changeset'");
		net.neoremind.sshxcute.core.Result res = ssh.exec(ct3);

		String[] iblist = res.sysout.split("\n");
		Map<String,String> map = new HashMap<String,String>();

		for(int i=2;i<iblist.length-1;i++)
		{	
			String[] slist = iblist[i].split("\\|");
			String tempStr=slist[1].trim()+" "+slist[2].trim();
			map.put(slist[0].trim(),tempStr);
		}
		return map;
    }
    
    /*
    @Test
    //Create oozie id getter
    public void getstateJob() throws IOException {
    	String url = "http://192.168.194.30:8080/oozie/v1/jobs?jobtype=wf&appName=new_ran_ib_generationJob&status=KILLED";	
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

        }
	*/
    @Test
	public void test_getOozieId() throws TaskExecFailException{
		Pattern pat = Pattern.compile("Record created successfully");
		CustomTask ct1=  new ExecCommand(ibmgmt+"editservice regionmktmapping insertib region=\"'Testing4'\" market=\"'Testing4'\" --username admin --password Ranqa@123");
		net.neoremind.sshxcute.core.Result res = ssh1.exec(ct1);
		Matcher m = pat.matcher(res.sysout);
		String result="";
		if (m.find()) {
			result = m.group();
		}
		Assert.assertEquals("Record created successfully", result);
	}
    
    @Ignore
	@Test
	public void test_dostateCheck() throws TaskExecFailException {
		Map<String,String> map=stateCheck();

		for(Map.Entry<String, String> entry : map.entrySet())
		{
		
			Assert.assertEquals("ACTIVATED",entry.getValue().split(" ")[0]);
		}

	}

	//Record creation
    
    @Ignore
	@Test
	public void test_docreateRecord() throws TaskExecFailException{
		Pattern pat = Pattern.compile("Record created successfully");
		CustomTask ct1=  new ExecCommand(ibmgmt+"editservice regionmktmapping insertib region=\"'Testing4'\" market=\"'Testing4'\" --username admin --password Ranqa@123");
		net.neoremind.sshxcute.core.Result res = ssh1.exec(ct1);
		Matcher m = pat.matcher(res.sysout);
		String result="";
		if (m.find()) {
			result = m.group();
		}
		Assert.assertEquals("Record created successfully", result);
	}

	//Duplicate records test
	@Ignore
	@Test
	public void test_docheckDuplicacy() throws TaskExecFailException{
		Pattern pat = Pattern.compile("DUPLICATE_RECORD");
		CustomTask ct1=  new ExecCommand(ibmgmt+"editservice regionmktmapping insertib region=\"'Testing4'\" market=\"'Testing4'\" --username admin --password Ranqa@123");
		net.neoremind.sshxcute.core.Result res = ssh1.exec(ct1);
		Matcher m = pat.matcher(res.sysout);
		String result="";
		if (m.find()) {
			result = m.group();
		}
		Assert.assertEquals("DUPLICATE_RECORD", result);
	}

	

	//Record editing
	@Ignore
	@Test
	public void test_dorecordEdit() throws TaskExecFailException{
		Pattern pat = Pattern.compile("Updated records");
		CustomTask ct1=  new ExecCommand(ibmgmt+"editservice regionmktmapping updateib set region=\"'Testing up1'\"  where market=\"'Testing4'\" --username admin --password Ranqa@123");
		net.neoremind.sshxcute.core.Result res = ssh1.exec(ct1);
		Matcher m = pat.matcher(res.sysout);
		String result="";
		if (m.find()) {
			result = m.group();
		}
		Assert.assertEquals("Updated records", result);
	}

	//Record deletion
	@Ignore
	@Test
	public void test_dorecDelete() throws TaskExecFailException{
		Pattern pat = Pattern.compile("Record deleted successfully");
		CustomTask ct1=  new ExecCommand(ibmgmt+"editservice regionmktmapping deleteib where region=\"'Testing up1'\" --username admin --password Ranqa@123");
		net.neoremind.sshxcute.core.Result res = ssh1.exec(ct1);
		Matcher m = pat.matcher(res.sysout);
		String result="";
		if (m.find()) {
			result = m.group();
		}
		Assert.assertEquals("Records deleted successfully", result);
	}

	//Re - Record  creation
	
	//Discard changes of the IB
	@Ignore
	@Test
	public void test_dodiscardChanges() throws TaskExecFailException{
		Pattern pat = Pattern.compile("Schedule deleted");
		CustomTask ct1=  new ExecCommand(ibmgmt+"editservice regionmktmapping discardChangeset --username admin --password Ranqa@123");
		net.neoremind.sshxcute.core.Result res = ssh1.exec(ct1);
		Matcher m = pat.matcher(res.sysout);
		String result="";
		if (m.find()) {
			result = m.group();
		}
		Assert.assertEquals("Schedule deleted", result);
	}
	
	//Re-Record  creation

	//Check record in psql before activation
	@Ignore
	@Test
	public void test_docheckPsql() throws TaskExecFailException{
		Pattern pat = Pattern.compile("Record created successfully");
		CustomTask ct1=  new ExecCommand(ibmgmt+"editservice regionmktmapping deleteib where region=\"'Testing up1'\" --username admin --password Ranqa@123");
		net.neoremind.sshxcute.core.Result res = ssh1.exec(ct1);
		Matcher m = pat.matcher(res.sysout);
		String result="";
		if (m.find()) {
			result = m.group();
		}
		Assert.assertEquals("Records deleted successfully", result);
	}

	//Check record in /data/ib/static before activation
	@Ignore
	@Test
	public void test_docheckHDFS() throws TaskExecFailException{
		Pattern pat = Pattern.compile("Testing up1,Testing4");
		CustomTask ct1=  new ExecCommand("hdfs dfs -cat /data/ib/static/CPSC_RegionMarketMapping.csv");
		net.neoremind.sshxcute.core.Result res = ssh2.exec(ct1);
		Matcher m = pat.matcher(res.sysout);
		String result="";
		if (m.find()) {
			result = m.group();
		}
		Assert.assertNotSame("Testing up1,Testing4", result);
		//Assert.assertEquals("Region 3,Chicago", result);
	}
	
	
	//Check record in /data/ib/static before activation
	@Ignore
	@Test
	public void test_doactivateIB() throws TaskExecFailException{
		Pattern pat = Pattern.compile("Testing up1,Testing4");
		CustomTask ct1=  new ExecCommand("ibmgmt"+"editservice regionmktmapping activateChangeset");
		net.neoremind.sshxcute.core.Result res = ssh2.exec(ct1);
		Matcher m = pat.matcher(res.sysout);
		String result="";
		if (m.find()) {
			result = m.group();
		}
		Assert.assertNotSame("Testing up1,Testing4", result);
		//Assert.assertEquals("Region 3,Chicago", result);
	}
	
	

}
