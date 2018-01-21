package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script>\n");
      out.write("function func(){\n");
      out.write("var x1=document.getElementById(\"x1\");\n");
      out.write("var x2=document.getElementById(\"x2\");\n");
      out.write("var x3=document.getElementById(\"x3\");\n");
      out.write("var y1=document.getElementById(\"y1\");\n");
      out.write("var y2=document.getElementById(\"y2\");\n");
      out.write("var y3=document.getElementById(\"y3\");\n");
      out.write("\n");
      out.write("var trace1 = {\n");
      out.write("  x: [x1,x2,x3], \n");
      out.write("  y: [y1,y2,y3], \n");
      out.write("  type: 'scatter'\n");
      out.write("};\n");
      out.write("var trace2 = {\n");
      out.write("  x: [1, 2, 3, 4], \n");
      out.write("  y: [16, 5, 11, 9], \n");
      out.write("  type: 'scatter'\n");
      out.write("};\n");
      out.write("var data = [trace1];\n");
      out.write("Plotly.newPlot('myDiv', data);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write(" <script src=\"https://cdn.plot.ly/plotly-latest.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<input type=\"number\" id=\"x1\" /> &nbsp <input type=\"number\" id=\"y1\" />\n");
      out.write("<br><br>\n");
      out.write("<input type=\"number\" id=\"x2\" /> &nbsp <input type=\"number\" id=\"y2\" />\n");
      out.write("<br><br>\n");
      out.write("<input type=\"number\" id=\"x3\" /> &nbsp <input type=\"number\" id=\"y3\" />\n");
      out.write("<br><br>\n");
      out.write(" <button id=\"submit\" name=\"visualize\" onclick=\"func()\" style=\"height:30px; width:70px; margin-left:30px;\">visualize</button>\n");
      out.write("\n");
      out.write(" <div id=\"myDiv\"><!-- Plotly chart will be drawn inside this DIV --></div>\n");
      out.write("\n");
      out.write(" </body>\n");
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
}
