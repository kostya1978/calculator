<html>
<head>
    <title>Calculator</title>
    <style>
        .btn {
            width: 50px;
            height: 50px;
        }
        .btn_tall {
            width: 50px;
            height: 104px;
        }
        .btn_wide {
            width: 100px;
            height: 50px;
        }
        .display {
            height: 60px;
            width: 266px;
            text-align: right;
            font-size: xx-large;
        }
    </style>
</head>
<body>
<form method="post" action="CalculatorServlet">
    <table border="0">
        <tr>
            <td colspan="5">
                <jsp:useBean id="calculatorBean" class="ru.tesoft.calculator.CalculatorBean" scope="session" >
                    <jsp:setProperty name="calculatorBean" property="displayValue" value="0" />
                </jsp:useBean>
                <input type="text" class="display" value="<jsp:getProperty name="calculatorBean" property="displayValue" />">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" name="btn" value="7" class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="8" class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="9" class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="/" class="btn">
            </td>
            <td rowspan="2">
                <input type="submit" name="btn" value="C" class="btn_tall">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" name="btn" value="4" class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="5" class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="6" class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="*" class="btn">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" name="btn" value="1" class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="2" class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="3" class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="-" class="btn">
            </td>
            <td rowspan="2">
                <input type="submit" name="btn" value="=" class="btn_tall">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="btn" value="0" class="btn_wide">
            </td>
            <td>
                <input type="submit" name="btn" value="," class="btn">
            </td>
            <td>
                <input type="submit" name="btn" value="+" class="btn">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
