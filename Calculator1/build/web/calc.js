$(document).ready(function(){
    console.log("Now you can perform Calculation");
});

function cal()
{
    console.log("ajax call started");

var op =document.getElementsByName("op");

  if(op[0].checked)
  {
      
    var inputdata ='n1='+$("#number1").val()+'&n2='+$("#number2").val()+'&str='+$("#plus").val();
 }
  else if(op[1].checked)
  {
    var inputdata='n1='+$("#number1").val()+'&n2='+$("#number2").val()+'&str='+$("#min").val();
 }
 else if(op[2].checked)
  {
    var inputdata='n1='+$("#number1").val()+'&n2='+$("#number2").val()+'&str='+$("#mul").val();
 }
 else if(op[3].checked)
  {
    var inputdata='n1='+$("#number1").val()+'&n2='+$("#number2").val()+'&str='+$("#div").val();
 }
 else if(op[4].checked)
  {
    var inputdata='n1='+$("#number1").val()+'&n2='+$("#number2").val()+'&str='+$("#mod").val();
 }
  
    
    console.log("input data:"+inputdata);
    $.ajax({
        url:"calc", data: inputdata, type:"POST",
        success: function(data)
        {
            
            $("#result").html(data);
            
        }
    });
    console.log("ajax call ended");
    
}


//    var num1= 'n1='+$("#number1").val();
//    var num2='&n2='+$("#number2").val();
//    var inputdata=num1-num2;