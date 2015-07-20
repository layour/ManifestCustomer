<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="RegisterSubmit" controller="RegisterSubmitController" namespace="com.lionbridge.customer">
    <import ref="RegisterSubmit.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <script src="#{path.controller}/com.lionbridge.customer.GlobalFunction.js" type="text/javascript"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="注册" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeRegisterSubmit()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="提交" class="textbtnclass" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel0">
            <div id="panel5">
                <input id="imagebutton5" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <label id="label9" onclick="this.openAddressChange()">请选择地址</label> 
            </div>
            <label id="label2"/>
            <div id="panel7">
                <input id="imagebutton4" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox3" maxlength="256" placeholder="请输入联系人名称" type="text"/> 
            </div>
            <label id="label3"/>
            <div id="panel2">
                <input id="imagebutton1" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox0" maxlength="256" placeholder="请输入公司名称" type="text"/> 
            </div>
            <label id="label4"/>
            <div id="panel1">
                <input id="imagebutton2" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox1" maxlength="256" placeholder="请输入6-16的数字或字母密码" type="text"/> 
            </div>
            <label id="label5"/>
            <div id="panel3">
                <input id="imagebutton3" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox2" maxlength="256" placeholder="请再次输入6-16的数字或字母密码" type="text"/> 
            </div> 
        </div>
        <div id="panel4">
            <input id="checkbox0" type="checkbox" checked="checked"/>
            <label id="label6">同意《</label>
            <label id="label7">狮桥物流服务协议</label>
            <label id="label8">》</label> 
        </div> 
    </div> 
</window>
