package edu.login.Action;

import DBJavaBean.DB;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

public class LoginAction extends ActionSupport implements ServletRequestAware{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2427154206368225682L;
	private String userName;
    private String password;
    private ResultSet rs=null;
    private String message=ERROR;
    private HttpServletRequest request;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }
    public void validate(){
    	System.out.println("loginaction validate");
    	System.out.println(userName+password);
        if(this.getUserName()==null||this.getUserName().length()==0){
        	System.out.println("用户名为空");
            addFieldError("userName","请输入登录名字！");
        }else{
            try{
                DB mysql=new DB();
                rs=mysql.selectMess(request, this.getUserName());
                if(!rs.next()){
                	System.out.println("此用户尚未注册");
                    addFieldError("userName","此用户尚未注册！");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if(this.getPassword()==null||this.getPassword().length()==0){
            addFieldError("password","请输入登录密码！");
        }else{
            try{
                DB mysql=new DB();
                rs=mysql.selectMess(request, this.getUserName());
                if(rs.next()){
                    rs=mysql.selectLogin(request, this.getUserName(), this.getPassword());
                    if(!rs.next()){
                        addFieldError("password","登录密码错误！");
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
     public String execute() throws Exception {
        DB mysql=new DB();
        String add=mysql.addList(request, this.getUserName());
        if(add.equals("ok")){
            message="SUCCESS";
            System.out.println("jinru");
        }
        
        return message;
    }
//    public void message(String msg){
//        int type=JOptionPane.YES_NO_OPTION;
//        String title="信息提示";
//        JOptionPane.showMessageDialog(null,msg,title,type);
//    }
}
