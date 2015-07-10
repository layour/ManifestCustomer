<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="AddressChange" controller="AddressChangeController" namespace="com.lionbridge.customer">
    <import ref="AddressChange.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <script src="#{path.controller}/com.lionbridge.customer.GlobalFunction.js" type="text/javascript"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="选择地址" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeAddressChange()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="确定" class="textbtnclass" onclick="this.closeAddressChange()" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel1">
            <input id="button1" value="北京市" class="textbtnclass" onclick="this.openAddressSelect()" type="button"/>
            <label id="label2">label</label>
            <search id="search0" placeholder="搜索" localstorage="true"/> 
        </div>
        <mapView id="gaodemapview0" address="" posY="" posX="" auto="true" city=""/>
        <listView id="listviewdefine0" bindfield="list" onload="this.loadAddressList()">
            <div id="panel0">
                <div id="panel2">
                    <label id="label3" bindfield="address">北京市</label>
                    <label id="label4" bindfield="detail">昌平区</label> 
                </div>
                <input id="imagebutton1" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
            </div> 
        </listView> 
    </div> 
</window>
