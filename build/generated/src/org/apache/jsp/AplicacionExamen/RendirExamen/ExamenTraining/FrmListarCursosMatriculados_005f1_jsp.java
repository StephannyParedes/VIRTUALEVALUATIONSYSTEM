package org.apache.jsp.AplicacionExamen.RendirExamen.ExamenTraining;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrmListarCursosMatriculados_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html >\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("                                  <center>\r\n");
      out.write("\t\t\t\t       <table class=\"FondoTabla\"  width=\"100%\">\r\n");
      out.write("                                            <tr class=\"tituloTabla\">\r\n");
      out.write("                                                  <td>-- CURSOS PROGRAMADOS A  RENDIR --</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("\t\t\t\t      </table>\r\n");
      out.write("                                      <br><br>\r\n");
      out.write("\t\t\t\t\t<table class=\"FondoTabla\" width=\"75%\">\r\n");
      out.write("                                            <tr   class=\"tituloTabla\">\r\n");
      out.write("\t\t\t\t\t\t\t<td>Nro</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Materia</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Semestre</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Accion</td>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("                                                ");
 for(int i=1;i<=5;i++) 
                                                { 
                                                 
                                                    
                                                
      out.write("\r\n");
      out.write("                                                <tr ");
 if(i%2==0){ 
      out.write(" class=\"fila_impar\"  ");
}else{  
      out.write("  class=\"fila_par\"     ");
 } 
      out.write("   >    <td><center>");
      out.print(i);
      out.write("</center></td>\r\n");
      out.write("                                                                <td>xxxxxxx</td>\r\n");
      out.write("                                                                <td><center>yyyyyyy</center></td>\r\n");
      out.write("                                                                <td>\r\n");
      out.write("                                                                \r\n");
      out.write("                                                                <center>\r\n");
      out.write("                                                                    <button   style=\"width:150px;\" onclick=\"','',0)\" >\r\n");
      out.write("                                                                        <img  width=\"50px\"  height=\"50px\" src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/ver.png\">\r\n");
      out.write("                                                                        <br>Examenes Rendir</button>\r\n");
      out.write("                                                                                                                                   \r\n");
      out.write("                                                                </center></td> \r\n");
      out.write("                                                        </tr>\r\n");
      out.write("\r\n");
      out.write("                                                ");
       } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("                                        <button  onclick=\"inicio()\"  style=\"width: 110px\">\r\n");
      out.write("                                Salir<br>\r\n");
      out.write("                              <img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/salirdatos.png\" width=\"40px\" height=\"40px\">\r\n");
      out.write("                            </button>\r\n");
      out.write("\t\t\t\t</center>\t\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
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
