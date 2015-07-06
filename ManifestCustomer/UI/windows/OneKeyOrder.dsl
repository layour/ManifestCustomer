<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="OneKeyOrder" controller="OneKeyOrderController" namespace="com.lionbridge.customer">
    <import ref="OneKeyOrder.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0" title="一键下单" class="navigatorbarclass">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" onclick="this.closeOneKeyOrder()" type="imagebutton" checked="false"/> 
        </navigatorbar>
        <label id="label0"/>
        <div id="panel0">
            <input id="button0" value="北京市" class="textbtnclass" type="button"/>
            <input id="imagebutton1" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
            <input id="button2" value="上海市" class="textbtnclass" type="button"/> 
        </div> 
    </div> 
</window>
