$(document).ready(function(){
    $('button').on('click',function(){
        var user = $('#username').val();
        var pwd = $('#pass').val();
        // if(user != ""){
        //     setSuccess('username');
        // }else{
        //     setError("username");
        // }
        // if(pwd != ""){
        //     setSuccess('pass');
        // }else{
        //     setError("pass");
        // }
        (user !="")?setSuccess('username'):setError("username");
        (pwd !="")?setSuccess('pass'):setError("pass");
    })
})

function setSuccess(success){
    $("#"+success).addClass("border-success").removeClass("border-danger");
}


function setError(error){
    $("#"+error).addClass("border-danger").removeClass("border-success");
}