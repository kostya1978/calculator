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
        .tablo {
            height: 60px;
            width: 266px;
            text-align: right;
            font-size: xx-large;
        }
    </style>
</head>
<body>
<form method="post">
    <table border="0">
        <tr>
            <td colspan="5">
                <input type="text" class="tablo">
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" value="7" class="btn">
            </td>
            <td>
                <input type="button" value="8" class="btn">
            </td>
            <td>
                <input type="button" value="9" class="btn">
            </td>
            <td>
                <input type="button" value="/" class="btn">
            </td>
            <td rowspan="2">
                <input type="button" value="C" class="btn_tall">
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" value="4" class="btn">
            </td>
            <td>
                <input type="button" value="5" class="btn">
            </td>
            <td>
                <input type="button" value="6" class="btn">
            </td>
            <td>
                <input type="button" value="*" class="btn">
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" value="1" class="btn">
            </td>
            <td>
                <input type="button" value="2" class="btn">
            </td>
            <td>
                <input type="button" value="3" class="btn">
            </td>
            <td>
                <input type="button" value="-" class="btn">
            </td>
            <td rowspan="2">
                <input type="button" value="=" class="btn_tall">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="button" value="0" class="btn_wide">
            </td>
            <td>
                <input type="button" value="," class="btn">
            </td>
            <td>
                <input type="button" value="+" class="btn">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
