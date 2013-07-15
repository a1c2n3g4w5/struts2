package org.apache.jsp.mainFrame;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import JavaBean.UserNameBean;
import java.util.ArrayList;

public final class toop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_text_name_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_text_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_text_name_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      if (_jspx_meth_s_text_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#CCDDEE\">\n");
      out.write("        ");
  
            String loginname=null;
            ArrayList login=(ArrayList)session.getAttribute("userName");
            if(login==null||login.size()==0){
                loginname="水木清华";
            }else{
                for(int i=login.size()-1;i>=0;i--){
                    UserNameBean nm=(UserNameBean)login.get(i);
                    loginname=nm.getUserName();
                }
            }
        
      out.write("\n");
      out.write("        <table width=\"100%\" align=\"right\" bgcolor=\"blue\">\n");
      out.write("              <tr height=\"10\" bgcolor=\"gray\" align=\"center\">\n");
      out.write("                  <td><a href=\"http://localhost:8084/ch04/personMessage/lookMessage.jsp\" target=\"main\">个人信息管理</a></td>\n");
      out.write("                  <td><a href=\"http://localhost:8084/ch04/friendManager/lookFriends.jsp\" target=\"main\">通讯录管理</a></td>\n");
      out.write("                  <td><a href=\"http://localhost:8084/ch04/dateTimeManager/lookDay.jsp\" target=\"main\">日程安排管理</a></td>\n");
      out.write("                  <td><a href=\"http://localhost:8084/ch04/fileManager/lookFile.jsp\" target=\"main\">个人文件管理</a></td>\n");
      out.write("                  <td><a href=\"http://localhost:8084/ch04/login/index.jsp\" target=\"_top\">退出主页面</a></td>\n");
      out.write("                  <td>欢迎");
      out.print(loginname);
      out.write("使用本系统！</td>\n");
      out.write("              </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_text_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_text_0 = (org.apache.struts2.views.jsp.TextTag) _jspx_tagPool_s_text_name_nobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_text_0.setPageContext(_jspx_page_context);
    _jspx_th_s_text_0.setParent(null);
    _jspx_th_s_text_0.setName("个人管理系统");
    int _jspx_eval_s_text_0 = _jspx_th_s_text_0.doStartTag();
    if (_jspx_th_s_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
      return true;
    }
    _jspx_tagPool_s_text_name_nobody.reuse(_jspx_th_s_text_0);
    return false;
  }
}
