/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2018-03-16 05:19:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web.responsive.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guestCheckout_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/tags/responsive/formElement/implicit.tld", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/formElement/formInputBox.tag", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/template/errorSpanField.tag", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/template/implicit.tld", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/common/tld/ycommercetags.tld", Long.valueOf(1521108754000L));
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String actionNameKey;
  private java.lang.String action;

  public java.lang.String getActionNameKey() {
    return this.actionNameKey;
  }

  public void setActionNameKey(java.lang.String actionNameKey) {
    this.actionNameKey = actionNameKey;
    jspContext.setAttribute("actionNameKey", actionNameKey);
  }

  public java.lang.String getAction() {
    return this.action;
  }

  public void setAction(java.lang.String action) {
    this.action = action;
    jspContext.setAttribute("action", action);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getActionNameKey() != null ) 
      _jspx_page_context.setAttribute("actionNameKey", getActionNameKey());
    if( getAction() != null ) 
      _jspx_page_context.setAttribute("action", getAction());

    try {
      out.write("<div class=\"headline\">");
      if (_jspx_meth_spring_005ftheme_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_spring_005ftheme_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    boolean _jspx_th_spring_005ftheme_005f0_reused = false;
    try {
      _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005ftheme_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/responsive/user/guestCheckout.tag(10,23) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f0.setCode("guest.checkout");
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(10,23) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f0.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(siteName)}", java.lang.Object.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0, false));
      int[] _jspx_push_body_count_spring_005ftheme_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005ftheme_005f0 = _jspx_th_spring_005ftheme_005f0.doStartTag();
        if (_jspx_th_spring_005ftheme_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005ftheme_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005ftheme_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005ftheme_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005farguments_005fnobody.reuse(_jspx_th_spring_005ftheme_005f0);
      _jspx_th_spring_005ftheme_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005ftheme_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005ftheme_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_form_005fform_005f0_reused = false;
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/responsive/user/guestCheckout.tag(12,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(12,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(12,2) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setCommandName("guestForm");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("<div class=\"form-group\">\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_formElement_005fformInputBox_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("</div>\n");
            out.write("\t\t\t\n");
            out.write("\t\t\t<div class=\"form-group\">\n");
            out.write("\t\t\t\t<label class=\"control-label\" for=\"guest.confirm.email\"> ");
            if (_jspx_meth_spring_005ftheme_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("</label>\n");
            out.write("\t\t\t\t<input class=\"confirmGuestEmail form-control\" id=\"guest.confirm.email\"/>\n");
            out.write("\t\t\t</div>\n");
            out.write("\t\t\n");
            out.write("\t\t\t");
            if (_jspx_meth_ycommerce_005ftestId_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
      _jspx_th_form_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_formElement_005fformInputBox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  formElement:formInputBox
    org.apache.jsp.tag.web.responsive.formElement.formInputBox_tag _jspx_th_formElement_005fformInputBox_005f0 = new org.apache.jsp.tag.web.responsive.formElement.formInputBox_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_formElement_005fformInputBox_005f0);
    try {
      _jspx_th_formElement_005fformInputBox_005f0.setJspContext(_jspx_page_context);
      _jspx_th_formElement_005fformInputBox_005f0.setParent(_jspx_th_form_005fform_005f0);
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(14,4) name = idKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_formElement_005fformInputBox_005f0.setIdKey("guest.email");
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(14,4) name = labelKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_formElement_005fformInputBox_005f0.setLabelKey("guest.email");
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(14,4) name = inputCSS type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_formElement_005fformInputBox_005f0.setInputCSS("guestEmail");
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(14,4) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_formElement_005fformInputBox_005f0.setPath("email");
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(14,4) name = mandatory type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_formElement_005fformInputBox_005f0.setMandatory(new java.lang.Boolean(true));
      _jspx_th_formElement_005fformInputBox_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_formElement_005fformInputBox_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f1 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    boolean _jspx_th_spring_005ftheme_005f1_reused = false;
    try {
      _jspx_th_spring_005ftheme_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005ftheme_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(18,60) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f1.setCode("guest.confirm.email");
      int[] _jspx_push_body_count_spring_005ftheme_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005ftheme_005f1 = _jspx_th_spring_005ftheme_005f1.doStartTag();
        if (_jspx_th_spring_005ftheme_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005ftheme_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005ftheme_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005ftheme_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f1);
      _jspx_th_spring_005ftheme_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005ftheme_005f1, _jsp_getInstanceManager(), _jspx_th_spring_005ftheme_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_ycommerce_005ftestId_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ycommerce:testId
    com.hybris.training.storefront.tags.TestIdTag _jspx_th_ycommerce_005ftestId_005f0 = new com.hybris.training.storefront.tags.TestIdTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_ycommerce_005ftestId_005f0);
    try {
      _jspx_th_ycommerce_005ftestId_005f0.setJspContext(_jspx_page_context);
      _jspx_th_ycommerce_005ftestId_005f0.setParent(_jspx_th_form_005fform_005f0);
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(22,3) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ycommerce_005ftestId_005f0.setCode("guest_Checkout_button");
      _jspx_th_ycommerce_005ftestId_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_ycommerce_005ftestId_005f0, _jspx_push_body_count_form_005fform_005f0));
      _jspx_th_ycommerce_005ftestId_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_ycommerce_005ftestId_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f2 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    boolean _jspx_th_spring_005ftheme_005f2_reused = false;
    try {
      _jspx_th_spring_005ftheme_005f2.setPageContext(_jspx_page_context);
      _jspx_th_spring_005ftheme_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/tags/responsive/user/guestCheckout.tag(24,94) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f2.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionNameKey}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      int[] _jspx_push_body_count_spring_005ftheme_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005ftheme_005f2 = _jspx_th_spring_005ftheme_005f2.doStartTag();
        if (_jspx_th_spring_005ftheme_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005ftheme_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005ftheme_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005ftheme_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f2);
      _jspx_th_spring_005ftheme_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005ftheme_005f2, _jsp_getInstanceManager(), _jspx_th_spring_005ftheme_005f2_reused);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<button type=\"submit\" disabled=\"true\" class=\"btn btn-default btn-block guestCheckoutBtn\">");
      if (_jspx_meth_spring_005ftheme_005f2(_jspx_parent, _jspx_page_context, _jspx_push_body_count))
        return true;
      out.write("</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}