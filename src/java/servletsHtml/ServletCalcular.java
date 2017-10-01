/*
 * Alumno: López Hernández Karen Juliette
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 28/09/2017
 */

package servletsHtml;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletCalcular extends HttpServlet {
    
    /**
    * Declaración de variables
    */
    float numero1, numero2, resultado;
    String combo;
    
    protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
        /**
         * Se obtienen valores del index
         */
        numero1 = Float.parseFloat(peticion.getParameter("num1"));
        numero2 = Float.parseFloat(peticion.getParameter("num2"));
        combo= peticion.getParameter("operacion");
        /**
         * Se realizan las operaciones
         */
        
        if(combo.equals("suma"))
            resultado=numero1+numero2;
        else if(combo.equals("resta"))
            resultado=numero1-numero2;
        else if(combo.equals("multiplicacion"))
            resultado=numero1*numero2;
        else if(combo.equals("division"))
            resultado=numero1/numero2;
        /**
         * Creación de página html dinámica
         */
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Resultado</title><style>\n"  + " @import url(https://fonts.googleapis.com/css?family=Mukta);\n" +
 "       </style></head>");
        out.println("<body><div style = \"float: left; width:100%; height:100%;font-family: 'Mukta', sans-serif;\">");
        /**
         * Se imprime resultado
         */
        out.println("<p><h1><center>El resultado es "+ resultado +"</center></h1></p>");
        out.println("</body></html>");
        out.close();
    }
      
}


