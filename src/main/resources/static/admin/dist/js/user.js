$(function () {
    //修改个人信息
    $('#updateUserNameButton').click(function () {
        $("#updateUserNameButton").attr("disabled",true);
        var userName = $('#loginUserName').val();
        var nickName = $('#nickName').val();
        if (validUserNameForUpdate(userName, nickName)) {
            //ajax提交数据
            var params = $("#userNameForm").serialize();
            $.ajax({
                type: "POST",
                url: "/admin/profile/name",
                data: params,
                success: function (r) {
                    if (r == 'success') {
                        alert('修改成功');
                    } else {
                        alert('修改失败');
                        $("#updateUserNameButton").prop("disabled",false);
                    }
                }
            });
        } else {
            $("#updateUserNameButton").prop("disabled",false);
        }
    });
    //修改密码
    $('#updatePasswordButton').click(function () {
        $("#updatePasswordButton").attr("disabled",true);
        var originalPassword = $('#originalPassword').val();
        var newPassword = $('#newPassword').val();
        if (validPasswordForUpdate(originalPassword, newPassword)) {
            var params = $("#userPasswordForm").serialize();
            $.ajax({
                type: "POST",
                url: "/admin/profile/password",
                data: params,
                success: function (r) {
                    console.log(r);
                    if (r == 'success') {
                        alert('修改成功');
                        window.location.href = '/index/login';
                    } else {
                        alert('修改失败');
                        $("#updatePasswordButton").attr("disabled",false);
                    }
                }
            });
        } else {
            $("#updatePasswordButton").attr("disabled",false);
        }
    });
})

/**
 * 名称验证
 */
function validUserNameForUpdate(userName, nickName) {
    if (userName == null) {
        $('#updateUserName-info').css("display", "block");
        $('#updateUserName-info').html("请输入登陆名称！");
        return false;
    }
    if (nickName == null) {
        $('#updateUserName-info').css("display", "block");
        $('#updateUserName-info').html("昵称不能为空！");
        return false;
    }
    return true;
}

/**
 * 密码验证
 */
function validPasswordForUpdate(originalPassword, newPassword) {
    console.log(originalPassword,newPassword);
    if (originalPassword.length == 0) {
        $('#updatePassword-info').css("display", "block");
        $('#updatePassword-info').html("请输入原密码！");
        return false;
    }
    if (newPassword.length == 0) {
        $('#updatePassword-info').css("display", "block");
        $('#updatePassword-info').html("新密码不能为空！");
        return false;
    }
    return true;
}
