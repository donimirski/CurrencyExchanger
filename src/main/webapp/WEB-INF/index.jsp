
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Currency-Exchenger</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css">
    <style>
        body{
            background-color: lightgrey;
        }
        #kontener{
            margin-left: 15%;
        }
        form{
            margin-right: 60%;
        }
        #inlineFormCustomSelect1{
            background-color: #ffed9f;

        }#inlineFormCustomSelect2{
            background-color: #ffed9f;
        }
        #staticresult{
            background-color: #ffed9f;
        }
        #radiobtn1{
            color: white;
            font-size: 20px;
        }
        #radiobtn2{
            color: white;
            font-size: 20px;
        }
        #data{
            background-color: #ffed9f;
        }
        #amountToBeExchanged{
            background-color: #ffed9f;
        }
    </style>
</head>
<body>
<h1 align="center">Currency Exchanger</h1>
<div class="menu" align="center">
    <div class="btn-group btn-group-toggle" data-toggle="buttons" id="radiobtn" >
        <label class="btn btn-outline-warning" id="radiobtn1">
            <a href="index.jsp"> <input type="radio" name="options" id="option1" > Kalkulator </a>
        </label>
        <label class="btn btn-outline-warning" id="radiobtn2">
            <a href="table.jsp"><input type="radio" name="options" id="option2" > Kursy Walut </a>
        </label>
    </div>
</div>

<div class="container-fluid" id="kontener">
    <form >
        <div class="col">
            <p>Wybierz walute poczatkowa:</p>
            <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect1"></label>
            <select class="custom-select mr-sm-1" id="inlineFormCustomSelect1">
                <option selected>  </option>
                <option value="1">PLN</option>
                <option value="2">EUR</option>
                <option value="3">USD</option>
                <option value="4">CHF</option>
                <option value="5">GBP</option>
            </select>
        </div>
        </br>
    <div class="col">
        <p>Podaj kwote:</p>
        <input type="number" class="text-area" id="amountToBeExchanged">
    </div>
        </br>
    <div class="col">
        <p>Wybierz date: </p>
        <input type="date" class="date-picker" id="data">
    </div>
        </br>
        <div class="col">
            <p>Wybierz walute docelowa:</p>
            <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect2"></label>
            <select class="custom-select mr-sm-2" id="inlineFormCustomSelect2">
                <option selected>  </option>
                <option value="1">PLN</option>
                <option value="2">EUR</option>
                <option value="3">USD</option>
                <option value="4">CHF</option>
                <option value="5">GBP</option>
            </select>
        </div>
        </br>
    <div class="col">
    <button type="button" class="btn btn-success">Oblicz</button>
    </div>
    </br>
        <p>Wynik:</p>
        <div class="col">
            <input type="number" readonly class="plaintext" id="staticresult" value="Wynik">
        </div>
    </br>
    </br>
    </form>

</div>

</body>
</html>
