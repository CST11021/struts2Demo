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
		if (getUsername().equals("whz") && getPassword().equals("123") )//注意这里应该用get方法来获取表单信息而不能用userName变量
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