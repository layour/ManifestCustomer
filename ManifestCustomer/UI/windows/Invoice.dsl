<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Invoice" controller="InvoiceController" namespace="com.lionbridge.customer">
    <import ref="Invoice.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="发票申请" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeInvoice()" type="imagebutton" checked="false"/>
            <label id="label1"/>
            <input id="button0" value="申请" class="textbtnclass" type="button"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel0">
            <div id="panel6">
                <input id="imagebutton3" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox2" maxlength="256" placeholder="公司名称（必填）" type="text"/> 
            </div>
            <label id="label4"/>
            <div id="panel7">
                <input id="imagebutton4" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox3" maxlength="256" placeholder="申请金额（必填，最大可申请0元）" type="text"/> 
            </div>
            <label id="label3"/>
            <div id="panel2">
                <input id="imagebutton1" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox0" maxlength="256" placeholder="收件人姓名（必填）" type="text"/> 
            </div>
            <label id="label2"/>
            <div id="panel3">
                <input id="imagebutton2" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox1" maxlength="256" placeholder="收件人联系电话（必填）" type="text"/> 
            </div>
            <label id="label5"/>
            <div id="panel1">
                <input id="imagebutton5" imagebuttontype="icon" value="图标名称" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <input id="textbox4" maxlength="256" placeholder="收件地址（必填）" type="text"/> 
            </div> 
        </div> 
    </div> 
</window>
