<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Voucher" controller="VoucherController" namespace="com.lionbridge.customer">
    <import ref="Voucher.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="我的代金卷" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeVoucher()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label0"/>
        <toggleButtonGroup id="togglebuttongroup0">
            <toggleButton id="togglebutton0" value="0" class="togglebtnitemclass" textOff="可用代金卷" textOn="可用代金卷" type="button" checked="true"/>
            <toggleButton id="togglebutton1" value="1" class="togglebtnitemclass" textOff="已用代金卷" textOn="已用代金卷" type="button"/>
            <toggleButton id="togglebutton3" value="2" class="togglebtnitemclass" textOff="过期代金卷" textOn="过期代金卷" type="button"/> 
        </toggleButtonGroup>
        <flipper id="flipperdefine0" viewindex="0">
            <div id="panel0" title="页面1"/>
            <div id="panel1" title="页面2"/> 
        </flipper> 
    </div> 
</window>
