/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author bebet
 */
public class CurrentYearTag extends TagSupport {
      @Override
    public int doStartTag() throws JspException {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        try {
            JspWriter out = pageContext.getOut();
            out.println(currentYear);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
