<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Address" controller="AddressController" namespace="com.lionbridge.customer">
    <import ref="Address.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="常用地址" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeAddress()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="添加" class="textbtnclass" onclick="this.openAddAddress()" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <listView id="listviewdefine0" bindfield="list" onload="this.loadAddress()">
            <div id="panel0">
                <div id="panel1">
                    <label id="label4" bindfield="name">思齐</label>
                    <label id="label5" bindfield="phone">13635688422</label> 
                </div>
                <label id="label3" bindfield="address">北京市昌平区回龙观</label>
                <label id="label2" bindfield="detail">和谐家园二区12号楼6单元</label>
                <label id="label6"/>
                <div id="panel2">
                    <input id="imagebutton1" value="编辑" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                    <input id="imagebutton2" value="删除" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
                </div> 
            </div> 
        </listView> 
    </div> 
</window>
