<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Login" controller="LoginController" namespace="com.lionbridge.customer">
    <import ref="Login.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <div id="panel0">
            <image id="image0" scaletype="fitcenter" src="logo.png"/> 
        </div>
        <div id="panel1">
            <div id="panel3">
                <input id="imagebutton0" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox0" maxlength="256" placeholder="请输入手机号" type="text"/>
                <input id="imagebutton1" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
            </div>
            <label id="label3"/>
            <div id="panel4">
                <input id="imagebutton3" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox1" maxlength="256" placeholder="请输入密码" type="password"/>
                <input id="imagebutton2" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
            </div>
            <div id="panel5">
                <input id="imagebutton4" imagebuttontype="icon" istogglebutton="true" class="imagebuttonclass" type="imagebutton" checked="true"/>
                <label id="label0">自动登录</label> 
            </div>
            <input id="button0" value="登录" class="buttonclass loginbuttonclass" onclick="this.login()" type="button"/>
            <div id="panel6">
                <label id="label1" onclick="this.openRegister()">立即注册</label>
                <label id="label2" onclick="this.openRetrievePassword()">忘记密码</label> 
            </div> 
        </div>
        <div id="panel2"/> 
    </div> 
</window>
