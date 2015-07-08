<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="AddressChange" controller="AddressChangeController" namespace="com.lionbridge.customer">
    <import ref="AddressChange.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="选择地址" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeAddressChange()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="确定" class="textbtnclass" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel1">
            <input id="button1" value="北京市" class="textbtnclass" type="button"/>
            <label id="label2">label</label>
            <search id="search0" placeholder="搜索" localstorage="true"/> 
        </div>
        <mapView id="gaodemapview0" address="" posY="" posX="" auto="true" city=""/>
        <listView id="listviewdefine0">
            <div id="panel0"/> 
        </listView> 
    </div> 
</window>
