document.write("<script language=javascript src='js/jquery-3.2.1.js'></script>");
$(document).ready(function(){
    $("#student").hide();
});
$('input:radio[name="Authority"]').change(function () {
    if(this.value == '1'){
        $("#student").show();
    }
    if(this.value != '1'){
        $("#student").hide();
    }
});
function adduser() {
    var name = $("#name").val();
    var uid = $("#uid").val();
    var email = $("#email").val();
    var identity = $("#identity").val();
    var nation = $("#nation").val();
    var address = $("#address").val();
    var phone = $("#phone").val();
    var sex = $("input[name='Sex']:checked").val();
    var authority = $("input[name='Authority']:checked").val();

    //添加学生
    if(authority==1){
    	var academy = $("#academy option:selected").val();
    	var major = $("#major option:selected").val();
    	var banji = $("#banji option:selected").val();
        var userstudent = '{"studentName":"'+name+'",'+'"studentId":"'+uid+'",'+'"studentEmail":"'+email+'",'+'"studentIdentity":"'+identity+'",'+'"studentSex":"'+sex+'",'+'"studentNation":"'+nation+'",'+'"studentAddress":"'+address+'",'+'"studentPhone":"'+phone+'",'+'"studentAcademy":"'+academy+'",'+'"studentMajor":"'+major+'",'+'"studentClass":"'+banji+'"}';
    	$.ajax({
        //接口地址
        type: "POST",
        data: userstudent,
        dataType: "text",//服务器返回的数据类型
        contentType: "application/json",//post请求的信息格式
        url: "admin/addstudent" ,
        success: function (data) {
            alert("保存成功");
            window.location.reload();
        },
        error: function (data) {
            alert(data);
            //请求异常的回调
            // modals.warn("网络访问失败，请稍后重试!");
        }
    });
    }
    //添加教师
    if(authority==2){
        var userteacher = '{"teacherName":"'+name+'",'+'"teacherId":"'+uid+'",'+'"teacherEmail":"'+email+'",'+'"teacherIdentity":"'+identity+'",'+'"teacherSex":"'+sex+'",'+'"teacherNation":"'+nation+'",'+'"teacherAddress":"'+address+'",'+'"teacherPhone":"'+phone+'"}';
    	$.ajax({
        //接口地址
        type: "POST",
        data: userteacher,
        dataType: "text",//服务器返回的数据类型
        contentType: "application/json",//post请求的信息格式
        url: "admin/addteacher" ,
        success: function (data) {
            alert("保存教师成功");
            window.location.reload();
        },
        error: function (data) {
            alert(data);
            //请求异常的回调
            // modals.warn("网络访问失败，请稍后重试!");
        }
    });
    }
}

function addexam() {
    var title = $("#title").val();
    var semester = $("#semester").val();
    var type = $("#type option:selected").val();
    var online = $("#online option:selected").val();
    var course = $("#course").val();
    var paperid = $("#paperid").val();
    var date1 = $("#date1").val();
    var date2 = $("#date2").val();
    var exam = '{"examTitle":"'+title+'",'+'"examPaperId":'+paperid+','+'"examSemester":"'+semester+'",'+'"examType":"'+type+'",'+'"examOnline":"'+online+'",'+'"examCourse":'+course+','+'"examDatetime":"'+date1+'",'+'"examEndtime":"'+date2+'"}';
    $.ajax({
        //接口地址
        type: "POST",
        data: exam,
        dataType: "json",//服务器返回的数据类型
        contentType: "application/json",//post请求的信息格式
        url: "admin/exam/addexam" ,
        success: function (data) {
            alert("保存成功");
        },
        error: function (data) {
            alert("保存成功！");
            //请求异常的回调
            // modals.warn("网络访问失败，请稍后重试!");
        }
    });
}