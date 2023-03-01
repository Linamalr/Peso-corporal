package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nasajsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <script> type=\"text/javascript\">\n");
      out.write("             function convertir(){\n");
      out.write("                 var valor = parseFloat(document.getElementById(\"valor\").value);\n");
      out.write("                 var resultado=0;\n");
      out.write("                 var mercurio=3.7;\n");
      out.write("                 if(document.getElementById(\"uno\").checked){\n");
      out.write("                     resultado=valor*mercurio;\n");
      out.write("                     alert(\"El peso es: kilogramos\"+resultado);\n");
      out.write("                 }\n");
      out.write("             }       \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Conversor</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3>CONVERTIDOR DE PESO </h3>\n");
      out.write("        <form class=\"Formulario\">\n");
      out.write("            <p>Seleccionar Planeta a Convertir peso:</p>\n");
      out.write("            <input type=\"radio\"name=\"Cambio\"id=\"uno\">MERCURIO\n");
      out.write("            <input type=\"radio\"name=\"Convertir\"id=\"dos\">VENUS\n");
      out.write("            <input type=\"radio\"name=\"Convertir\"id=\"cuatro\">JUPITER\n");
      out.write("            <input type=\"radio\"name=\"Convertir\"id=\"cinco\">SATURNO\n");
      out.write("            <input type=\"radio\"name=\"Convertir\"id=\"seis\">URANO\n");
      out.write("            <input type=\"radio\"name=\"Convertir\"id=\"siete\">NEPTUNO\n");
      out.write("            <input type=\"radio\"name=\"Convertir\"id=\"ocho\">PLUTON\n");
      out.write("            <p>Ingrese Peso:</p>\n");
      out.write("            <input type=\"number\"id=\"valor\" min=\"1\"max=\"10000\">\n");
      out.write("            <input type=\"button\"id=\"Convertidor\" value=\"Convertir\"onClick=\"convertir()\">\n");
      out.write("        </form>\n");
      out.write("                \n");
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
}
