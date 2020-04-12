<html>
    <head>
        <script src="jquery-3.4.1.min.js"></script>
        <script src="calc.js"></script>
    </head>
    <body>
        <form action="calc.jsp" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th >RATHISH CALCULATOR</th>
                       
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Enter 1st Number</td>
                        <td><input type="text" name="n1" id="number1"></td>
                    </tr>
                    <tr>
                        <td>Enter 2nd Number</td>
                        <td><input type="text" name="n2" id="number2"></td>
                    </tr>
                    
                    <tr>
                        
                         <td><input type="radio" name="op"  id="plus" value="+" onclick="cal()">ADD<br></td>
                         <td><input type="radio" name="op"  id="min" value="-" onclick="cal()">SUBTRACT<br></td>
                         
                              
                        
                    </tr>
                    
                    <tr>
                        <td><input type="radio" name="op"  id="mul" value="*" onclick="cal()">MULTIPLY<br></td>
                         <td><input type="radio" name="op" id="div" value="/" onclick="cal()">DIVIDE<br></td>
                        
                    </tr>
                    <tr>
                       <td><input type="radio" name="op" id="mod" value="m" onclick="cal()">MODULO<br></td>     
                    </tr>
                </tbody>
            </table>

            <div id="result"></div>

        </form>
      
            
            
    </body>
</html>