package struts2Demo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
{
	private String username;
	private String password;
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}

	public String execute() throws Exception
	{
		if (getUsername().equals("whz") && getPassword().equals("123") )//ע������Ӧ����get��������ȡ����Ϣ��������userName����
		{
			ActionContext.getContext().getSession().put("user" , getUsername());
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}