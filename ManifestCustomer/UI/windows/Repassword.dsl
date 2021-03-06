<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Repassword" controller="RepasswordController" namespace="com.lionbridge.customer">
    <import ref="Repassword.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="修改密码" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeRepassword()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="修改" class="textbtnclass" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel0">
            <div id="panel1">
                <input id="imagebutton1" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox0" maxlength="256" placeholder="请输入您的原密码" type="password"/> 
            </div>
            <label id="label3"/>
            <div id="panel2">
                <input id="imagebutton2" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox1" maxlength="256" placeholder="请输入6-16的数字或字母密码" type="password"/> 
            </div>
            <label id="label2"/>
            <div id="panel3">
                <input id="imagebutton3" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox2" maxlength="256" placeholder="请再次输入6-16的数字或字母密码" type="password"/> 
            </div> 
        </div> 
    </div> 
</window>
