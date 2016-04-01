package com.china.lh.servlets.uploadfile;

// import required java libraries

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lh on 16-3-31.
 */
public class UploadServlet extends HttpServlet {
    private boolean isMultipart;
    private String filePath;
    private int maxFileSize = 60 * 1024;
    private int maxMemSize = 4 * 1024;
    private File file;

    public void init() {
        // Get the file location where it would be stored
        filePath = getServletContext().getInitParameter("file-upload");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Check that we hava a file upload request
        isMultipart = ServletFileUpload.isMultipartContent(request);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (!isMultipart) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet upload</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>No file uploaded</p>");
            out.println("</body>");
            out.println("</html>");
            return;
        }
//        DiskFileItemFactory

    }
}
