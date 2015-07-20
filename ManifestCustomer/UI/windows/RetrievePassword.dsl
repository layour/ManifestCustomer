<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="RetrievePassword" controller="RetrievePasswordController" namespace="com.lionbridge.customer">
    <import ref="RetrievePassword.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="修改密码" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeRetrievePassword()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="下一步" class="textbtnclass" onclick="this.openNewPassword()" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel0">
            <div id="panel7">
                <input id="imagebutton4" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox3" maxlength="256" placeholder="请输入手机号" type="text"/> 
            </div>
            <label id="label3"/>
            <div id="panel2">
                <input id="imagebutton1" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox0" maxlength="256" placeholder="请输入验证码" type="text"/>
                <input id="button1" value="获取验证码" class="textbtnclass" type="button"/> 
            </div> 
        </div>
        <label id="label4">请输入验证码，剩余时间60秒</label> 
    </div> 
</window>
