<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="AddAddress" controller="AddAddressController" namespace="com.lionbridge.customer">
    <import ref="AddAddress.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="编辑地址" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeAddAddress()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="确定" class="textbtnclass" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel0">
            <div id="panel1">
                <div id="panel4">
                    <div id="panel6">
                        <input id="imagebutton3" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                        <input id="textbox2" maxlength="256" placeholder="姓名" type="text"/> 
                    </div>
                    <label id="label4"/>
                    <div id="panel7">
                        <input id="imagebutton4" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                        <input id="textbox3" maxlength="256" placeholder="联系电话" type="text"/> 
                    </div> 
                </div>
                <label id="label5"/>
                <div id="panel5">
                    <input id="button1" class="textbtnclass" type="button"/>
                </div> 
            </div>
            <label id="label3"/>
            <div id="panel2">
                <input id="imagebutton1" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox0" maxlength="256" placeholder="选择地址" type="text"/> 
            </div>
            <label id="label2"/>
            <div id="panel3">
                <input id="imagebutton2" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox1" maxlength="256" placeholder="地址描述，如：12号楼6单元" type="text"/> 
            </div> 
        </div> 
    </div> 
</window>
