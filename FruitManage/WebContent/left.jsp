<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base target="main">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无标题文档</title>
<script src="js/menu.js"></script>
</head>
<body>
<table>
  <tr>
    <td>
	<table>
      <tr>
        <td id="td1" onClick="show(1)">库存管理</td>
      </tr>
      <tr>
        <td id="show1" >
          <table>
          <tr>
              <td>
                <table>
                  <tr>
                    <td><a href="addFruit.jsp" target="main">添加水果</a></td>
                  </tr>
                </table>
              </td>
            </tr>
            <tr>
              <td>
                <table>
                  <tr>
                    <td><a href="ViewFruitList" target="main">查看所有水果</a></td>
                  </tr>
                </table>
              </td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td id="td2" onClick="show(2)">订单管理</td>
      </tr>
      <tr>
        <td id="show2" style="display:none;">
          <table>
            <tr>
              <td>
                <table>
                  <tr>
                    <td><a href="viewOrder.action?target=1" target="main">查看所有订单</a></td>
                  </tr>
                </table>
              </td>
            </tr>
             <tr>
              <td>
                <table>
                  <tr>
                    <td><a href="waitCheck.action" target="main">待审核订单</a></td>
                  </tr>
                </table>
              </td>
            </tr>
             <tr>
              <td>
                <table>
                  <tr>
                    <td><a href="waitDeliver.action" target="main">待发货订单</a></td>
                  </tr>
                </table>
              </td>
            </tr>
             <tr>
              <td>
                <table>
                  <tr>
                    <td><a href="deliverdOrder.action" target="main">已发货订单</a></td>
                  </tr>
                </table>
              </td>
            </tr>
             <tr>
              <td>
                <table>
                  <tr>
                    <td><a href="checkNo.action" target="main">审核不通过订单</a></td>
                  </tr>
                </table>
              </td>
            </tr>
             <tr>
              <td>
                <table>
                  <tr>
                    <td><a href="finishedOrder" target="main">已完成订单</a></td>
                  </tr>
                </table>
              </td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td id="td3" onClick="show(3)">图表管理</td>
      </tr>
      <tr>
        <td id="show3" style="display:none;">
          <table>
            <tr>
              <td>
                <table>
                  <tr>
                    <td><a href="viewFruitChar.jsp" target="main">图表统计</a></td>
                  </tr>
                </table>
              </td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td id="td4" onClick="show(4)"></td>
      </tr>
      <tr>
        <td id="show4" style="display:none;"></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
