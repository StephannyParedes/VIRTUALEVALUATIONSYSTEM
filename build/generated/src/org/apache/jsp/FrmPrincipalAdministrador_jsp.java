package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import BEAN.DocenteSBean;

public final class FrmPrincipalAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    DocenteSBean objDocenteBean1 = null;
    

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

      out.write("\n");
      out.write(" \n");
      out.write('\n');

   
        objDocenteBean1 = (DocenteSBean) session.getAttribute("SESION");
   

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head> \n");
      out.write("        <title>VENTANA  PRINCIPAL DEL  SISTEMA VIRTUAL DE  EVALUACION EN LINEA DE LA  UNIVERSIDAD PERUANA SIMON BOLIVAR</title> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/jquery.alerts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/jquery.ui.base.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/jquery.ui.all.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/jquery.ui.theme.css\" rel=\"stylesheet\" type=\"text/css\"/>          \n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\">    \n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/jquery/jquery.alerts.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/javascript.js\"></script>\n");
      out.write("     \n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/jquery-ui/jquery.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/jquery-ui/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.dataTables.min1.js\"></script>\n");
      out.write("         <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/dataTables.bootstrap.min1.js\"></script>\n");
      out.write("         <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/dataTables.responsive.min1.js\"></script>\n");
      out.write("         <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/responsive.bootstrap.min1.js\"></script>       \n");
      out.write("   \n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.min_1.css\">\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/bootstrap.min1.js\" ></script>        \n");
      out.write("         <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/style1.css\" rel='stylesheet' type='text/css' />\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/font-awesome.min.css\" />\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/responsive.bootstrap.min.css\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("                jQuery(function ($) {\n");
      out.write("                    $('#carousel1').carousel({\n");
      out.write("                        interval: 10000\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    var clickEvent = false;\n");
      out.write("\n");
      out.write("                    $('#carousel1').on('click', '.nav a', function () {\n");
      out.write("                        clickEvent = true;\n");
      out.write("                        $('.nav li').removeClass('active');\n");
      out.write("                        $(this).parent().addClass('active');\n");
      out.write("                    }).on('slid.bs.carousel', function (e) {\n");
      out.write("                        if (!clickEvent) {\n");
      out.write("                            var count = $('.nav').children().length - 1;\n");
      out.write("                            var current = $('.nav li.active');\n");
      out.write("                            current.removeClass('active').next().addClass('active');\n");
      out.write("                            var id = parseInt(current.data('slide-to'));\n");
      out.write("                            if (count == id) {\n");
      out.write("                                $('.nav li').first().addClass('active');\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                        clickEvent = false;\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <style>\n");
      out.write("                body {\n");
      out.write("                    padding-top: 20px;\n");
      out.write("                }\n");
      out.write("                #carousel1 .nav a small {\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("                #carousel1 .nav {\n");
      out.write("                    background: #eee;\n");
      out.write("                }\n");
      out.write("                .nav-justified > li > a {\n");
      out.write("                    border-radius: 0px;\n");
      out.write("                }\n");
      out.write("                .nav-pills > li[data-slide-to=\"0\"].active a {\n");
      out.write("                    background-color: #b4d9a7;\n");
      out.write("                }\n");
      out.write("                .nav-pills > li[data-slide-to=\"1\"].active a {\n");
      out.write("                    background-color: #4f77cb;\n");
      out.write("                }\n");
      out.write("                .nav-pills > li[data-slide-to=\"2\"].active a {\n");
      out.write("                    background-color: #d11e4f;\n");
      out.write("                }\n");
      out.write("                </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <input type=\"hidden\"  name=\"op\">    \n");
      out.write("        <div id=\"grande\"  style=\"width: 100%;height:100%;visibility: visible;display:none;background-color: white\" >\n");
      out.write("            <center> \n");
      out.write("                <br><br><br><br><br>    \n");
      out.write("                <table  border=\"0\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <img     src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/expiro.jpg\"  >\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <font  face=\"Arial black\" size=\"5\">La Sesion ha  Expirado !!!</font>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>                 \n");
      out.write("                </table>\n");
      out.write("            </center>   \n");
      out.write("        </div>  \n");
      out.write("   <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <div id=\"contenedor\"      style=\"visibility: visible;display:block;\">\n");
      out.write("                <div class=\"header\">\n");
      out.write("                    <div class=\"container header_top\">\n");
      out.write("                        <div >\n");
      out.write("                             <img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/encabezado.jpg\" width=\"100%\" /></td>         \n");
      out.write("                        </div>   \n");
      out.write("                         <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("       \n");
      out.write("    <div class=\"navbar-header\">       \n");
      out.write("       \n");
      out.write("    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("            data-target=\".navbar-ex1-collapse\">\n");
      out.write("         <div class=\"alert alert-info\"     >\n");
      out.write("                                            <h6>  SISTEMA VIRTUAL DE EVALUACION EN  LINEA</h6>\n");
      out.write("                                        </div>  \n");
      out.write("      <span class=\"sr-only\">Desplegar navegación</span>\n");
      out.write("      <span class=\"icon-bar\"></span>\n");
      out.write("      <span class=\"icon-bar\"></span>\n");
      out.write("      <span class=\"icon-bar\"></span>\n");
      out.write("    </button>\n");
      out.write("   \n");
      out.write("  </div>  \n");
      out.write("    \n");
      out.write("  <div class=\"collapse navbar-collapse navbar-ex1-collapse\">     \n");
      out.write("    <ul class=\"nav navbar-nav\">      \n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("        <a href=\"javascript:inicio()\" >\n");
      out.write("        <img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/main.png\"     alt=\"Ir Principal\">   Principal</b>\n");
      out.write("        </a>        \n");
      out.write("      </li>\n");
      out.write("    </ul>   \n");
      out.write("       <ul class=\"nav navbar-nav\">      \n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("          <img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/mantenimiento.png\"     alt=\"Ir Mantenimiento\">  Mantenimientos <b class=\"caret\"></b>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"dropdown-menu\">        \n");
      out.write("           <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','Semestre',1,'')\">Semestre</a></li>\n");
      out.write("                                <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','CarreraProfesional',1,'')\">Carrera Profesional</a></li>\n");
      out.write("                                <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','Alumno',1,'')\">Alumno</a></li>\n");
      out.write("                                <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','Docente',1,'')\">Docente</a></li>\n");
      out.write("                                <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','Materia',1,'')\">Materia</a></li>\n");
      out.write("                                <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','UnidadTematica',1,'')\">Unidad Tematica</a></li>\n");
      out.write("                                <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','Tema',1,'')\">Tema</a></li>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','TipoExamen',1,'')\">Tipo Examen</a></li>\n");
      out.write("                                <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','Rol',1,'')\">Rol</a></li>                                \n");
      out.write("                                <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','NivelDificultad',1,'')\">Nivel Dificultad</a></li>                                   \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>            \n");
      out.write("   \n");
      out.write("    <ul class=\"nav navbar-nav\">   \n");
      out.write("      <li class=\"divider-vertical\"></li>\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("         <img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/candado1.png\"     alt=\"Configuracion\">Seguridad<b class=\"caret\"></b>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"dropdown-menu\">                    \n");
      out.write("            <li><a href=\"javascript:CrearUsuario('");
      out.print(request.getContextPath());
      out.write("','CrearUsuario',0)\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/gestionarusuarios.png\"  width=\"35px\" height=\"35px\"   alt=\"Gestionar Usuario y Privilegios\">Gestionar Usuario<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;y Privilegios</a></li>\n");
      out.write("                  \n");
      out.write("                  </ul>\n");
      out.write("        </li>        \n");
      out.write("      \n");
      out.write("    </ul>    \n");
      out.write("        \n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">   \n");
      out.write("      <li class=\"divider-vertical\"></li>\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("         <img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/configuracion.png\"     alt=\"Configuracion\"> Configuracion<b class=\"caret\"></b>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"dropdown-menu\">                 \n");
      out.write("            <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','Docente',24,'");
      out.print("&coddocente="+objDocenteBean1.getCODDOCENTE());
      out.write("')\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/actualizar.png\"     alt=\"Configuracion\"> Actualizar Informacion</a></li>\n");
      out.write("            <li class=\"divider\"></li>\n");
      out.write("            <li><a href=\"javascript:CallMant('");
      out.print(request.getContextPath());
      out.write("','Docente',18,'");
      out.print("&usuario="+objDocenteBean1.getUSUARIO()+
                                                                                                                        "&clave="+objDocenteBean1.getCLAVE()+
                                                                                                                        "&tipo2="+objDocenteBean1.getTIPO()+
                                                                                                                        "&coddocente="+objDocenteBean1.getCODDOCENTE());
      out.write("')\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/llaves.png\"     alt=\"Configuracion\"> Cambiar Contraseña</a></li>\n");
      out.write("           <li class=\"divider\"></li>\n");
      out.write("           <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CerrarSesion?opciones=1\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/exit.png\"     alt=\"Salir\"> Salir</a></li>      \n");
      out.write("                \n");
      out.write("        </ul>\n");
      out.write("        </li>\n");
      out.write("      \n");
      out.write("    </ul>  \n");
      out.write("        \n");
      out.write("       \n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("</nav>\n");
      out.write("      </div>\n");
      out.write("                </div> \n");
      out.write("           \n");
      out.write("           <div class=\"container banner\"  style=\"overflow: scroll \">\n");
      out.write("\t \t<div class=\"row\">                    \n");
      out.write("\t \t\t\n");
      out.write("      ");
      out.write("\n");
      out.write("                         <div style=\"width:100%;height: 100%;text-align: center;\">\n");
      out.write("\n");
      out.write("                           <div  id=\"contenido\" style=\"background:white;\"  >\n");
      out.write("                                                  \n");
      out.write("                            <div id=\"carousel1\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                <div class=\"carousel-inner\">\n");
      out.write("                                    <div class=\"item active\">\n");
      out.write("                                         <img alt=\"Bootstrap template\"   width=\"100%\" height=\"100%\"  src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/principal2.png\">   \n");
      out.write("                                        <div class=\"carousel-caption\">                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                         <img alt=\"Bootstrap template\"    width=\"100%\" height=\"100%\" src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/principal3.png\">  \n");
      out.write("                                        <div class=\"carousel-caption\">\n");
      out.write("                                            <div class=\"col-lg-12 text-center v-center\" style=\"font-size: 39pt;\">\n");
      out.write("                                                <a href=\"#\"><span class=\"avatar\"><i class=\"fa fa-google-plus\"></i></span></a>\n");
      out.write("                                                <a href=\"#\"><span class=\"avatar\"><i class=\"fa fa-linkedin\"></i></span></a>\n");
      out.write("                                                <a href=\"#\"><span class=\"avatar\"><i class=\"fa fa-facebook\"></i></span></a>\n");
      out.write("                                                <a href=\"#\"><span class=\"avatar\"><i class=\"fa fa-github\"></i></span></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <img alt=\"Bootstrap template\"    width=\"100%\" height=\"100%\" src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/principal1.png\">                                      \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                     \n");
      out.write(" \n");
      out.write("                                      \n");
      out.write("                         </div> \n");
      out.write("                            \n");
      out.write("                          <div  id=\"contenidoalternativo\" style=\"background:white;display:none;width:100%;height:100%;float:left;\" >\n");
      out.write("                           <div id=\"carousel1\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                <div class=\"carousel-inner\">\n");
      out.write("                                    <div class=\"item active\">\n");
      out.write("                                         <img alt=\"Bootstrap template\"   width=\"100%\" height=\"100%\"  src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/principal2.png\">   \n");
      out.write("                                        <div class=\"carousel-caption\">                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                         <img alt=\"Bootstrap template\"    width=\"100%\" height=\"100%\" src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/principal3.png\">  \n");
      out.write("                                        <div class=\"carousel-caption\">\n");
      out.write("                                            <div class=\"col-lg-12 text-center v-center\" style=\"font-size: 39pt;\">\n");
      out.write("                                                <a href=\"#\"><span class=\"avatar\"><i class=\"fa fa-google-plus\"></i></span></a>\n");
      out.write("                                                <a href=\"#\"><span class=\"avatar\"><i class=\"fa fa-linkedin\"></i></span></a>\n");
      out.write("                                                <a href=\"#\"><span class=\"avatar\"><i class=\"fa fa-facebook\"></i></span></a>\n");
      out.write("                                                <a href=\"#\"><span class=\"avatar\"><i class=\"fa fa-github\"></i></span></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <img alt=\"Bootstrap template\"    width=\"100%\" height=\"100%\" src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/principal1.png\">                                      \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                          </div>  \n");
      out.write("                      </div>\n");
      out.write("      ");
      out.write("       \n");
      out.write("                \n");
      out.write("\t          </div> \n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("         <div class=\"container footer\">    \n");
      out.write("         \n");
      out.write("     \t<div class=\"footer_bottom\">\n");
      out.write("           \n");
      out.write("     \t  <div class=\"copy\">\n");
      out.write("\t\t    <p>Derechos  Reservados  por Ing.Ivan Petrlik </p>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <ul class=\"social\">\n");
      out.write("\t\t\t<li><a href=\"\"> <i class=\"fb\"> </i> </a></li>\n");
      out.write("\t\t\t<li><a href=\"\"><i class=\"tw\"> </i> </a></li>\n");
      out.write("\t\t  </ul>\n");
      out.write("\t\t  <div class=\"clearfix\"> </div>\n");
      out.write("     \t</div>\n");
      out.write("     </div>           \n");
      out.write("   </div>              \n");
      out.write("</div>          \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
