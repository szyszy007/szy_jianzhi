package com.jianZhi.ssh.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * FIXME 登录拦截仍然有问题, 理想状况：检查cookie，不存在跳转至登录页
 */
public class LoginInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		ActionContext context = arg0.getInvocationContext();
		HttpServletRequest request = ServletActionContext.getRequest();
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("username") && cookie.getValue() != null &&
					!cookie.getValue().trim().equals(""))
				return arg0.invoke();
		}
		return "input";
	}

}
