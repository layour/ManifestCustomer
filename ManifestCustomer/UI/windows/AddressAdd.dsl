<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="AddressAdd" controller="AddressAddController" namespace="com.lionbridge.customer">
    <import ref="AddressAdd.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="编辑地址" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeAddressAdd()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="确定" class="textbtnclass" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel0">
            <div id="panel1">
                <div id="panel4">
                    <div id="panel6">
                        <input id="imagebutton3" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                        <input id="textbox2" maxlength="256" placeholder="请输入姓名" type="text"/> 
                    </div>
                    <label id="label4"/>
                    <div id="panel7">
                        <input id="imagebutton4" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                        <input id="textbox3" maxlength="256" placeholder="请输入电话" type="text"/> 
                    </div> 
                </div>
                <label id="label5"/>
                <div id="panel5">
                    <input id="imagebutton5" value="联系人" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
                </div> 
            </div>
            <label id="label3"/>
            <div id="panel2">
                <input id="imagebutton1" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <label id="label6" onclick="this.openAddressChange()">请选择地址</label> 
            </div>
            <label id="label2"/>
            <div id="panel3">
                <input id="imagebutton2" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox1" maxlength="256" placeholder="请输入地址描述，如：12号楼6单元" type="text"/> 
            </div> 
        </div> 
    </div> 
</window>
