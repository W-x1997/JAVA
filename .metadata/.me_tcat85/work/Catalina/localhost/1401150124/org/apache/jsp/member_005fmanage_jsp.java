/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2017-12-28 12:43:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class member_005fmanage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=GB18030");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>会员管理</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t*{\r\n");
      out.write("\t\t\tpadding: 0;\r\n");
      out.write("\t\t\tfont-family: 'Microsoft Yahei';\r\n");
      out.write("\t\t\tmargin: 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.main{\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\theight: 100%;\r\n");
      out.write("\t\t\tbackground-color: #39F;\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: 0;\r\n");
      out.write("\t\t\tleft: 0\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.main .operate{\r\n");
      out.write("\t\t\twidth: 400px;\r\n");
      out.write("\t\t\theight: 200px;\r\n");
      out.write("\t\t\tborder-radius: 10px;\r\n");
      out.write("\t\t\tbackground-color: rgba(255,255,255,0.5);\r\n");
      out.write("\t\t\tmargin: -125px 0 0 -200px;\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: 50%;\r\n");
      out.write("\t\t\tleft: 50%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.main .operate .title{\r\n");
      out.write("\t\t\twidth: 400px;\r\n");
      out.write("\t\t\theight: 50px;\r\n");
      out.write("\t\t\tfont-size: 24px;\r\n");
      out.write("\t\t\tfont-family: 'Microsoft Yahei';\r\n");
      out.write("\t\t\tline-height: 50px;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t\tmargin-top: 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.main .operate a{\r\n");
      out.write("\t\t\twidth: 120px;\r\n");
      out.write("\t\t\theight: 30px;\r\n");
      out.write("\t\t\tpadding: 0;\r\n");
      out.write("\t\t\tcolor: #000;\r\n");
      out.write("\t\t\tfont-size: 14px;\r\n");
      out.write("\t\t\tfont-family: \"Microsoft Yahei\";\r\n");
      out.write("\t\t\tline-height: 30px;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tbackground-color: #FFF;\r\n");
      out.write("\t\t\toutline: none;\r\n");
      out.write("\t\t\tmargin: 10px auto;\r\n");
      out.write("\t\t\tdisplay: block;\r\n");
      out.write("\t\t\ttransition: background-color 0.2s linear;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.main .operate a:hover{\r\n");
      out.write("\t\t\tbackground-color: rgba(255,255,255,0.5);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("  <script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"61110\",secure:\"61111\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("  \r\n");
      out.write("  <body data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc2-14\" data-genuitec-path=\"/1401150124/WebRoot/member_manage.jsp\">\r\n");
      out.write("  \t\t<div class=\"main\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc2-14\" data-genuitec-path=\"/1401150124/WebRoot/member_manage.jsp\">\r\n");
      out.write("  \t\t\t<div class=\"operate\">\r\n");
      out.write("  \t\t\t\t<div class=\"title\">会员管理</div>\r\n");
      out.write("\t\t\t    <a href=\"member_add.jsp\">增加会员</a>\r\n");
      out.write("\t\t\t    <a href=\"member_query.jsp\">查询会员</a>\r\n");
      out.write("\t\t\t    <a href=\"loginSuccess.jsp\">返回</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
