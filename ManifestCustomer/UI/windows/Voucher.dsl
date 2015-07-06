<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Voucher" controller="VoucherController" namespace="com.lionbridge.customer">
    <import ref="Voucher.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="我的代金劵" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeVoucher()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label0"/>
        <toggleButtonGroup id="togglebuttongroup0" onchange="this.changeToggle()">
            <toggleButton id="togglebutton0" value="0" class="togglebtnitemclass" textOff="可用代金劵" textOn="可用代金劵" type="button" checked="true"/>
            <toggleButton id="togglebutton1" value="1" class="togglebtnitemclass" textOff="已用代金劵" textOn="已用代金劵" type="button"/>
            <toggleButton id="togglebutton3" value="2" class="togglebtnitemclass" textOff="过期代金劵" textOn="过期代金劵" type="button"/> 
        </toggleButtonGroup>
        <flipper id="flipperdefine0" onnextflipper="this.nextflipper()" onpreviousflipper="this.previousflipper()" viewindex="0">
            <div id="panel0" title="页面1">
                <listView id="listviewdefine0">
                    <div id="panel3"/> 
                </listView> 
            </div>
            <div id="panel1" title="页面2">
                <listView id="listviewdefine1">
                    <div id="panel4"/> 
                </listView> 
            </div>
            <div id="panel2" title="页面3">
                <listView id="listviewdefine2">
                    <div id="panel5"/> 
                </listView> 
            </div> 
        </flipper> 
    </div> 
</window>
