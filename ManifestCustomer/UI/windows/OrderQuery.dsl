<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="OrderQuery" controller="OrderQueryController" namespace="com.lionbridge.customer">
    <import ref="OrderQuery.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="定单查询" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeOrderQuery()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label0"/>
        <toggleButtonGroup id="togglebuttongroup1" onchange="this.changeToggle()">
            <toggleButton id="togglebutton1" value="0" class="togglebtnitemclass" textOff="未完成定单" textOn="未完成定单" type="button" checked="true"/>
            <toggleButton id="togglebutton5" value="1" class="togglebtnitemclass" textOff="常用收货地址" textOn="常用收货地址" type="button"/> 
        </toggleButtonGroup>
        <flipper id="flipperdefine0" onnextflipper="this.nextflipper()" onpreviousflipper="this.previousflipper()" viewindex="0">
            <div id="panel0" title="页面1">
                <listView id="listviewdefine0">
                    <div id="panel2"/> 
                </listView> 
            </div>
            <div id="panel1" title="页面2">
                <listView id="listviewdefine1">
                    <div id="panel3"/> 
                </listView> 
            </div> 
        </flipper> 
    </div> 
</window>
