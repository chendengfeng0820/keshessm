<%--
  Created by IntelliJ IDEA.
  User: cdf
  Date: 19-12-11
  Time: 下午7:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<tr>
    <td align="center" width="25%" class="top-bt liebiao-l" >姓名</td>
    <td align="center" width="20%" class="top-bt liebiao-l" >年龄</td>
    <td align="center" width="20%" class="top-bt liebiao-l" >性别</td>
    <td align="center" width="20%" class="top-bt liebiao-l" >系别</td>
    <%--<td align="center" width="20%" class="top-bt liebiao-l" >期末数</td>--%>
</tr>
<c:forEach items="${list}" var="xqyzcfzbForm" varStatus="beanStatus">
    <tr <c:choose><c:when test="${beanStatus.index%2==0}"></c:when>
        <c:otherwise></c:otherwise></c:choose> >
        <c:if test="${xqyzcfzbForm.xssxh le 30}">
            <td>
                    ${xqyzcfzbForm.xm}
                <input type="hidden" name="xm" value="${xqyzcfzbForm.xm}"/>
            </td>
            <td align="center">
                    ${xqyzcfzbForm.hc}
                <input type="hidden" name="hc" value="${xqyzcfzbForm.hc}"/>
            </td>
            <td align="center">
                <c:if test="${!empty xqyzcfzbForm.hc}">
                    <input class="input_out" onfocus="this.className='input_on';this.onmouseout=''" id="sntqlj"
                           onblur="this.className='input_off';this.onmouseout=function(){this.className='input_out'};"
                           onmousemove="this.className='input_move'" onmouseout="this.className='input_out'" type="text"
                           chname="第${ beanStatus.index+1}行期末数" nullable="no"  datatype="number"
                           name="sntqlj" value="${xqyzcfzbForm.qms}" onBlur="verifyInput(this);" />
                    <font color="#FF0000">*</font>
                </c:if>
            </td>

            <td>
                    ${xqyzcfzbForm.xm}
                <input type="hidden" name="xm" value="${xqyzcfzbForm.xm}"/>
            </td>
            <td align="center">
                    ${xqyzcfzbForm.hc}
                <input type="hidden" name="hc" value="${xqyzcfzbForm.hc}"/>
            </td>
            <td align="center">
                <c:if test="${!empty xqyzcfzbForm.hc}">
                    <input class="input_out" onfocus="this.className='input_on';this.onmouseout=''" id="sntqlj"
                           onblur="this.className='input_off';this.onmouseout=function(){this.className='input_out'};"
                           onmousemove="this.className='input_move'" onmouseout="this.className='input_out'" type="text"
                           chname="第${ beanStatus.index+1}行期末数" nullable="no"  datatype="number"
                           name="sntqlj" value="${xqyzcfzbForm.qms}" onBlur="verifyInput(this);" />
                    <font color="#FF0000">*</font>
                </c:if>
            </td>
        </c:if>
    </tr>
</c:forEach>
</body>
</html>
