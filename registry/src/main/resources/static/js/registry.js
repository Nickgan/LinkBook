// 邮箱校验规则
var myReg=/^[a-zA-Z0-9_-]+@([a-zA-Z0-9]+\.)+(com|cn|net|org)$/;
$("#register-event-btn").on("click", function () {
    var password1 = $("#reg-password1").val().trim();
    var pickName = $("#reg-pickname").val().trim();
    var password2 = $("#reg-password2").val().trim();
    var email = $("#reg-email").val().trim();
    var isAgreeRegister = document.getElementById("agree").checked;
    if (pickName==""){
        layer.msg('昵称不能为空！', {offset: 't', anim: 6});return;
    }
    if (pickName.length > 15){
        layer.msg('昵称长度过长！', {offset: 't', anim: 6});return;
    }
    if (email==""){
        layer.msg('邮箱不能为空！', {offset: 't', anim: 6});return;
    }
    if(!myReg.test(email)){
        layer.msg('邮箱格式有误！', {offset: 't', anim: 6});return;
    }
    if (password1==""){
        layer.msg('密码不能为空！', {offset: 't', anim: 6});return;
    }
    if (password1 != password2){
        layer.msg('两次密码不一致！', {offset: 't', anim: 6});return;
    }
    if (password1.length > 12 || password1.length < 6){
        layer.msg('密码长度应该在6~12位！', {offset: 't', anim: 6});return;
    }

    if (!isAgreeRegister){
        layer.msg('请仔细阅读并同意LinkBook用户注册协议！', {offset: 't', anim: 6});return;
    }

    layer.load("注册中……");
    $.ajax({
        url: "/user/reg",
        type: "post",
        data:{
            "pickName": pickName,
            "password": password1,
            "email": email
        },
        success:function(data){
            layer.closeAll();
            var data = eval(data);
            if (data.success){
                layer.msg("注册成功： 请前往您的邮箱进行账号激活");
                return;
            } else {
                layer.msg(data.desc, {offset: 't', anim: 6});return;
            }
        },error:function () {
            layer.closeAll();
            layer.msg("请求失败！");
        }
    });
})