function checkUser(){
    var reg=/^\D{6,}$/;
    var username=$("#userN").val();
    if(!reg.test(username)){
        $("#userCheck").html("<p style='color: red '>格式必须是至少六位的非数字</p>");
        return false;
    }
    $("#userCheck").html("<p style ='color: green'>OK</p>");
    return true;
}
function checkPwd() {
    var reg= /^\S{5,}/;
    var pwd=$("#pwd").val();
    if(!reg.test(pwd)){
        $("#pwdCheck").html("<span style='color: red'>至少为五位非空格</span>");
        return false;
    }
    $("#pwdCheck").html("<span style ='color: green'>OK</span>")
    return true;
}
function checkForm(){
    return checkUser()&&checkPwd();
}